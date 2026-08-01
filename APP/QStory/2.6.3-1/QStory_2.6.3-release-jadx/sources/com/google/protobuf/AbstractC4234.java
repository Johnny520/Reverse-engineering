package com.google.protobuf;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import bsh.C3466;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4234 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ByteBuffer f11401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f11402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f11404 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Charset f11403 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        f11402 = bArr;
        f11401 = ByteBuffer.wrap(bArr);
        AbstractC4306.m8253(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m8060(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m8061(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m8062(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4273 m8063(Class cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (InterfaceC4273) method.invoke(method, null);
        } catch (Exception e) {
            C1123.m1408(AbstractC0900.m714(cls, "Failed to get default instance for "), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8064(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3466.m5903(str);
    }
}
