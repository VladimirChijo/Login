package com.example.login;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class RegistroRequest extends StringRequest{
    public RegistroRequest(int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    public RegistroRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(url, listener, errorListener);
    }
}
