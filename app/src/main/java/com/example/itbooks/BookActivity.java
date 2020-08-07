package com.example.itbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    public static final String EXTRA_BOOKID = "bookId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        int bookId = (Integer) getIntent().getExtras().get(EXTRA_BOOKID);
        Book book = Book.books[bookId];

        TextView bookName = findViewById(R.id.book_name);
        bookName.setText(book.getName());

        TextView bookDesc = findViewById(R.id.book_desc);
        bookDesc.setText(book.getDescription());
    }
}
