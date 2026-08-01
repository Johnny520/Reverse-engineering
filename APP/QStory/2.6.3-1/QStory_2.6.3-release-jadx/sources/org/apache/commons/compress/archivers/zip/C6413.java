package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;
import p373.C9732;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6413 extends C9732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C6423 f15704;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6413(C6423 c6423, InputStream inputStream, long j) {
        super(inputStream, j);
        this.f15704 = c6423;
    }

    @Override // p373.C9732, p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25438;
        if (j >= 0 && m15106() >= j) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - m15106()) : i2));
        if (i3 != -1) {
            long j2 = i3;
            C6423 c6423 = this.f15704;
            c6423.m15139(j2);
            c6423.f15745.f15748 += j2;
        }
        return i3;
    }

    @Override // p373.C9732, p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        long j = this.f25438;
        if (j >= 0 && m15106() >= j) {
            return -1;
        }
        int i = super.read();
        if (i != -1) {
            C6423 c6423 = this.f15704;
            c6423.m15139(1L);
            c6423.f15745.f15748++;
        }
        return i;
    }
}
