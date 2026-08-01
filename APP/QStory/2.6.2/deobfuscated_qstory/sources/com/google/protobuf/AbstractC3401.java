package com.google.protobuf;

import androidx.collection.C0276;
import bsh.C2632;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p383.AbstractC9032;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ByteBuffer f11051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f11052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f11054 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Charset f11053 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        f11052 = bArr;
        f11051 = ByteBuffer.wrap(bArr);
        AbstractC3473.m7707(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7514(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m7515(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7516(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC3440 m7517(Class cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (InterfaceC3440) method.invoke(method, null);
        } catch (Exception e) {
            C0276.m847(AbstractC9032.m14590(cls, "Failed to get default instance for "), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7518(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C2632.m5298(str);
    }
}
