package com.android.dx.io.instructions;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface CodeInput extends CodeCursor {
    boolean hasMore();

    int read();

    int readInt();

    long readLong();
}
