package com.android.p001dx.p004io.instructions;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public interface CodeInput extends CodeCursor {
    boolean hasMore();

    int read() throws EOFException;

    int readInt() throws EOFException;

    long readLong() throws EOFException;
}
