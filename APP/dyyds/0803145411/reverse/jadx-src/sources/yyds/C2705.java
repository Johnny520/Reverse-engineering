package yyds;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᲈᛷᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2705 extends FilterInputStream {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f13277;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public long f13278;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2705(InputStream inputStream, long j) {
        super(inputStream);
        AbstractC2328.m4341(-600753828430702L);
        this.f13277 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        AbstractC2328.m4341(-600779598234478L);
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0) {
            m4812(i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4812(long j) {
        long j2 = this.f13278 + j;
        this.f13278 = j2;
        long j3 = this.f13277;
        if (j2 <= j3) {
            return;
        }
        throw new IllegalArgumentException((AbstractC2328.m4341(-600809663005550L) + ((j3 / 1024) / 1024) + AbstractC2328.m4341(-600865497580398L)).toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i >= 0) {
            m4812(1L);
        }
        return i;
    }
}
