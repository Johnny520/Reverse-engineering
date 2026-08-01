package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;
import p357.C8913;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5582 extends C8913 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C5592 f15359;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5582(C5592 c5592, InputStream inputStream, long j) {
        super(inputStream, j);
        this.f15359 = c5592;
    }

    @Override // p357.C8913, p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25104;
        if (j >= 0 && m14534() >= j) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - m14534()) : i2));
        if (i3 != -1) {
            long j2 = i3;
            C5592 c5592 = this.f15359;
            c5592.m14561(j2);
            c5592.f15400.f15403 += j2;
        }
        return i3;
    }

    @Override // p357.C8913, p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        long j = this.f25104;
        if (j >= 0 && m14534() >= j) {
            return -1;
        }
        int i = super.read();
        if (i != -1) {
            C5592 c5592 = this.f15359;
            c5592.m14561(1L);
            c5592.f15400.f15403++;
        }
        return i;
    }
}
