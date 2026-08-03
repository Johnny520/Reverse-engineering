package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public interface CodeCursor {
    int baseAddressForCursor();

    int cursor();

    void setBaseAddress(int r1, int r2);
}
