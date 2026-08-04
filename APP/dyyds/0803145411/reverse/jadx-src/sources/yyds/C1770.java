package yyds;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: yyds.ᛸᛵᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1770 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f8873;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f8874;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f8875;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f8876 = true;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2115 f8877;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1590 f8878;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public long f8879;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final long f8880;

    public C1770(C2115 c2115, InterfaceC1590 interfaceC1590, long j, boolean z) {
        this.f8877 = c2115;
        this.f8878 = interfaceC1590;
        this.f8880 = j;
        this.f8875 = z;
        if (j == 0) {
            m3528(null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f8874) {
            return;
        }
        this.f8874 = true;
        try {
            m3527();
            m3528(null);
        } catch (IOException e) {
            throw m3528(e);
        }
    }

    public final String toString() {
        return C1770.class.getSimpleName() + '(' + this.f8878 + ')';
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3527() throws IOException {
        this.f8878.close();
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        if (this.f8874) {
            C0188.m800("closed");
            return 0L;
        }
        try {
            long jMo692 = this.f8878.mo692(8192L, c1507);
            if (this.f8876) {
                this.f8876 = false;
                ((C2729) this.f8877.f10455).f13425.getClass();
            }
            if (jMo692 == -1) {
                m3528(null);
                return -1L;
            }
            long j2 = this.f8879 + jMo692;
            long j3 = this.f8880;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.f8880 + " bytes but received " + j2);
            }
            this.f8879 = j2;
            if (((InterfaceC2121) this.f8877.f10457).mo716()) {
                m3528(null);
            }
            return jMo692;
        } catch (IOException e) {
            throw m3528(e);
        }
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f8878.mo693();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final IOException m3528(IOException iOException) {
        if (this.f8873) {
            return iOException;
        }
        this.f8873 = true;
        if (iOException == null && this.f8876) {
            this.f8876 = false;
            ((C2729) this.f8877.f10455).f13425.getClass();
        }
        return C2115.m4031(this.f8877, this.f8875, iOException, 8);
    }
}
