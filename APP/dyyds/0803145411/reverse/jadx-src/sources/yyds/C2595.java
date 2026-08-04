package yyds;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: yyds.ᲈᛱᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2595 extends InputStream {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12786;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0981 f12787;

    public /* synthetic */ C2595(InterfaceC0981 interfaceC0981, int i) {
        this.f12786 = i;
        this.f12787 = interfaceC0981;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m4677() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f12786;
        InterfaceC0981 interfaceC0981 = this.f12787;
        switch (i) {
            case 0:
                return (int) Math.min(((C1507) interfaceC0981).f7087, 2147483647L);
            default:
                C2066 c2066 = (C2066) interfaceC0981;
                if (!c2066.f10218) {
                    return (int) Math.min(c2066.f10220.f7087, 2147483647L);
                }
                C0188.m804("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f12786) {
            case 0:
                break;
            default:
                ((C2066) this.f12787).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f12786;
        InterfaceC0981 interfaceC0981 = this.f12787;
        switch (i) {
            case 0:
                C1507 c1507 = (C1507) interfaceC0981;
                if (c1507.f7087 > 0) {
                    return c1507.m3033() & 255;
                }
                return -1;
            default:
                C2066 c2066 = (C2066) interfaceC0981;
                C1507 c15072 = c2066.f10220;
                if (c2066.f10218) {
                    C0188.m804("closed");
                    return 0;
                }
                if (c15072.f7087 == 0 && c2066.f10219.mo692(8192L, c15072) == -1) {
                    return -1;
                }
                return c15072.m3033() & 255;
        }
    }

    public final String toString() {
        int i = this.f12786;
        InterfaceC0981 interfaceC0981 = this.f12787;
        switch (i) {
            case 0:
                return ((C1507) interfaceC0981) + ".inputStream()";
            default:
                return ((C2066) interfaceC0981) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f12786) {
            case 1:
                C2066 c2066 = (C2066) this.f12787;
                C1507 c1507 = c2066.f10220;
                if (c2066.f10218) {
                    C0188.m804("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (c1507.f7087 == 0 && c2066.f10219.mo692(8192L, c1507) == -1) {
                        return j;
                    }
                    long j2 = c1507.f7087;
                    j += j2;
                    AbstractC2217.m4201(j2, 0L, j2);
                    C0502 c0502 = c1507.f7086;
                    while (j2 > 0) {
                        int iMin = (int) Math.min(j2, c0502.f2446 - c0502.f2444);
                        outputStream.write(c0502.f2443, c0502.f2444, iMin);
                        int i = c0502.f2444 + iMin;
                        c0502.f2444 = i;
                        long j3 = iMin;
                        c1507.f7087 -= j3;
                        j2 -= j3;
                        if (i == c0502.f2446) {
                            C0502 c0502M1350 = c0502.m1350();
                            c1507.f7086 = c0502M1350;
                            AbstractC1478.m2976(c0502);
                            c0502 = c0502M1350;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f12786;
        InterfaceC0981 interfaceC0981 = this.f12787;
        switch (i3) {
            case 0:
                return ((C1507) interfaceC0981).read(bArr, i, i2);
            default:
                C2066 c2066 = (C2066) interfaceC0981;
                C1507 c1507 = c2066.f10220;
                if (!c2066.f10218) {
                    AbstractC2217.m4201(bArr.length, i, i2);
                    if (c1507.f7087 == 0 && c2066.f10219.mo692(8192L, c1507) == -1) {
                        return -1;
                    }
                    return c1507.read(bArr, i, i2);
                }
                C0188.m804("closed");
                return 0;
        }
    }
}
