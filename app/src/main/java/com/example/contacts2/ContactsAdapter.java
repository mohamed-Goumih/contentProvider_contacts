package com.example.contacts2;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {

    private List<Contact> contactList;

    public ContactsAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_contact, parent, false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.name.setText(contact.getName());
        holder.photo.setImageURI(Uri.parse(contact.getPhoto()));
        holder.email.setText(contact.getName());
        holder.number.setText(contact.getName());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView photo;
        public TextView email;
        public TextView number;

        public ContactViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.contact_name);
            photo = view.findViewById(R.id.contact_im);
            email = view.findViewById(R.id.contact_email);
            number = view.findViewById(R.id.contact_number);

        }
    }
}

