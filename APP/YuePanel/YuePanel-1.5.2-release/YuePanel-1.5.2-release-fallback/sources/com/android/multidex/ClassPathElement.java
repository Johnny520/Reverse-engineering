package com.android.multidex;

/* JADX INFO: loaded from: classes.dex */
interface ClassPathElement {
    public static final char SEPARATOR_CHAR = '/';

    void close() throws java.io.IOException;

    java.lang.Iterable<java.lang.String> list();

    java.io.InputStream open(java.lang.String r1) throws java.io.IOException;
}
