package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public interface ParseObserver {
    void changeIndent(int r1);

    void endParsingMember(com.android.dx.util.ByteArray r1, int r2, java.lang.String r3, java.lang.String r4, com.android.dx.cf.iface.Member r5);

    void parsed(com.android.dx.util.ByteArray r1, int r2, int r3, java.lang.String r4);

    void startParsingMember(com.android.dx.util.ByteArray r1, int r2, java.lang.String r3, java.lang.String r4);
}
