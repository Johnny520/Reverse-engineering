package yyds;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: yyds.ᛷᲈᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1688 implements InterfaceC1979 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f8597;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f8598;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f8599;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long f8600;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2115 f8601;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1979 f8602;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f8603;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final long f8604;

    public C1688(C2115 c2115, InterfaceC1979 interfaceC1979, long j, boolean z) {
        this.f8601 = c2115;
        this.f8602 = interfaceC1979;
        this.f8604 = j;
        this.f8599 = z;
        this.f8597 = z;
    }

    @Override // yyds.InterfaceC1979, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f8598) {
            return;
        }
        this.f8598 = true;
        long j = this.f8604;
        if (j != -1 && this.f8600 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m3428();
            m3430(null);
        } catch (IOException e) {
            throw m3430(e);
        }
    }

    @Override // yyds.InterfaceC1979, java.io.Flushable
    public final void flush() throws IOException {
        try {
            m3429();
        } catch (IOException e) {
            throw m3430(e);
        }
    }

    public final String toString() {
        return C1688.class.getSimpleName() + '(' + this.f8602 + ')';
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo576(long j, C1507 c1507) throws IOException {
        if (this.f8598) {
            C0188.m800("closed");
            return;
        }
        long j2 = this.f8604;
        if (j2 != -1 && this.f8600 + j > j2) {
            throw new ProtocolException("expected " + this.f8604 + " bytes but received " + (this.f8600 + j));
        }
        try {
            if (this.f8597) {
                this.f8597 = false;
                ((C2729) this.f8601.f10455).f13425.getClass();
            }
            this.f8602.mo576(j, c1507);
            this.f8600 += j;
        } catch (IOException e) {
            throw m3430(e);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3428() {
        this.f8602.close();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m3429() {
        this.f8602.flush();
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo577() {
        return this.f8602.mo577();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final IOException m3430(IOException iOException) {
        if (this.f8603) {
            return iOException;
        }
        this.f8603 = true;
        return C2115.m4031(this.f8601, this.f8599, iOException, 4);
    }
}
