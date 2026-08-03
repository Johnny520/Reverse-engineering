package com.android.p001dx.p002cf.iface;

import com.android.p001dx.util.ByteArray;

/* JADX INFO: loaded from: classes.dex */
public interface ParseObserver {
    void changeIndent(int i);

    void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member);

    void parsed(ByteArray byteArray, int i, int i2, String str);

    void startParsingMember(ByteArray byteArray, int i, String str, String str2);
}
