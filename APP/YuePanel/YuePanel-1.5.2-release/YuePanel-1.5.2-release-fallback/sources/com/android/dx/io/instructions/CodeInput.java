package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public interface CodeInput extends com.android.dx.io.instructions.CodeCursor {
    boolean hasMore();

    int read() throws java.io.EOFException;

    int readInt() throws java.io.EOFException;

    long readLong() throws java.io.EOFException;
}
