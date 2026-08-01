package com.android.dx.cf.iface;

import com.android.dx.util.ByteArray;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface ParseObserver {
    void changeIndent(int i);

    void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member);

    void parsed(ByteArray byteArray, int i, int i2, String str);

    void startParsingMember(ByteArray byteArray, int i, String str, String str2);
}
