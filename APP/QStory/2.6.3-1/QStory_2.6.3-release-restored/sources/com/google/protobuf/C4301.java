package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4301 extends OutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public byte[] f11490;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f11491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11493;

    public C4301(int i) {
        if (i < 0) {
            C6755.m11869("Buffer size < 0");
            throw null;
        }
        this.f11493 = i;
        this.f11491 = new ArrayList();
        this.f11490 = new byte[i];
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f11492 + this.f11489;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f11490;
            int length = bArr2.length;
            int i3 = this.f11489;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f11489 += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m8247(i4);
                System.arraycopy(bArr, i + length2, this.f11490, 0, i4);
                this.f11489 = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8247(int i) {
        this.f11491.add(new ByteString.LiteralByteString(this.f11490));
        int length = this.f11492 + this.f11490.length;
        this.f11492 = length;
        this.f11490 = new byte[Math.max(this.f11493, Math.max(i, length >>> 1))];
        this.f11489 = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f11489 == this.f11490.length) {
                m8247(1);
            }
            byte[] bArr = this.f11490;
            int i2 = this.f11489;
            this.f11489 = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
