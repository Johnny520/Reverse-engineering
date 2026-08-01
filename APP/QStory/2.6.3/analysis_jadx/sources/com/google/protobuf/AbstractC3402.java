package com.google.protobuf;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import bsh.C2633;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3402 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ByteBuffer f11056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f11057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f11059 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Charset f11058 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        f11057 = bArr;
        f11056 = ByteBuffer.wrap(bArr);
        AbstractC3474.m7694(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7501(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m7502(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7503(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC3441 m7504(Class cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (InterfaceC3441) method.invoke(method, null);
        } catch (Exception e) {
            C0276.m848(AbstractC0053.m154(cls, "Failed to get default instance for "), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7505(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C2633.m5343(str);
    }
}
