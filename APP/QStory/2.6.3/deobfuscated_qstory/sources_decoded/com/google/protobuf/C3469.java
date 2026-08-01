package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3469 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11144;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public byte[] f11145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f11146;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11148;

    public C3469(int i) {
        if (i < 0) {
            C5925.m11310("Buffer size < 0");
            throw null;
        }
        this.f11148 = i;
        this.f11146 = new ArrayList();
        this.f11145 = new byte[i];
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f11147 + this.f11144;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f11145;
            int length = bArr2.length;
            int i3 = this.f11144;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f11144 += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m7688(i4);
                System.arraycopy(bArr, i + length2, this.f11145, 0, i4);
                this.f11144 = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7688(int i) {
        this.f11146.add(new ByteString.LiteralByteString(this.f11145));
        int length = this.f11147 + this.f11145.length;
        this.f11147 = length;
        this.f11145 = new byte[Math.max(this.f11148, Math.max(i, length >>> 1))];
        this.f11144 = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f11144 == this.f11145.length) {
                m7688(1);
            }
            byte[] bArr = this.f11145;
            int i2 = this.f11144;
            this.f11144 = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
