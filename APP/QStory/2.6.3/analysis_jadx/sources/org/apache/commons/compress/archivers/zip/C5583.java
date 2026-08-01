package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;
import p357.C8903;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5583 extends C8903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C5593 f15359;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5583(C5593 c5593, InputStream inputStream, long j) {
        super(inputStream, j);
        this.f15359 = c5593;
    }

    @Override // p357.C8903, p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25093;
        if (j >= 0 && m14547() >= j) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - m14547()) : i2));
        if (i3 != -1) {
            long j2 = i3;
            C5593 c5593 = this.f15359;
            c5593.m14580(j2);
            c5593.f15400.f15403 += j2;
        }
        return i3;
    }

    @Override // p357.C8903, p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        long j = this.f25093;
        if (j >= 0 && m14547() >= j) {
            return -1;
        }
        int i = super.read();
        if (i != -1) {
            C5593 c5593 = this.f15359;
            c5593.m14580(1L);
            c5593.f15400.f15403++;
        }
        return i;
    }
}
