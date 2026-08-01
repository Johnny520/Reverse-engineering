package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3468 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11139;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public byte[] f11140;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f11141;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11142;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11143;

    public C3468(int i) {
        if (i < 0) {
            C5919.m11249("Buffer size < 0");
            throw null;
        }
        this.f11143 = i;
        this.f11141 = new ArrayList();
        this.f11140 = new byte[i];
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f11142 + this.f11139;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f11140;
            int length = bArr2.length;
            int i3 = this.f11139;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f11139 += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m7701(i4);
                System.arraycopy(bArr, i + length2, this.f11140, 0, i4);
                this.f11139 = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7701(int i) {
        this.f11141.add(new ByteString.LiteralByteString(this.f11140));
        int length = this.f11142 + this.f11140.length;
        this.f11142 = length;
        this.f11140 = new byte[Math.max(this.f11143, Math.max(i, length >>> 1))];
        this.f11139 = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f11139 == this.f11140.length) {
                m7701(1);
            }
            byte[] bArr = this.f11140;
            int i2 = this.f11139;
            this.f11139 = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
