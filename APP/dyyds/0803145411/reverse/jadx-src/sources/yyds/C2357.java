package yyds;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: yyds.ᲁᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2357 extends AbstractC0149 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0157 f11577;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long f11578;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2357(C0157 c0157, C0082 c0082, long j) {
        super(c0157, c0082);
        this.f11577 = c0157;
        this.f11578 = j;
        if (j == 0) {
            m691(C1605.f8173);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM1805;
        if (this.f928) {
            return;
        }
        if (this.f11578 != 0) {
            try {
                zM1805 = AbstractC0795.m1805(this, 100);
            } catch (IOException unused) {
                zM1805 = false;
            }
            if (!zM1805) {
                this.f11577.f966.mo3290();
                m691(C0157.f963);
            }
        }
        this.f928 = true;
    }

    @Override // yyds.AbstractC0149, yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        if (this.f928) {
            C0188.m800("closed");
            return 0L;
        }
        long j2 = this.f11578;
        if (j2 == 0) {
            return -1L;
        }
        long jMo692 = super.mo692(Math.min(j2, 8192L), c1507);
        if (jMo692 == -1) {
            this.f11577.f966.mo3290();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m691(C0157.f963);
            throw protocolException;
        }
        long j3 = this.f11578 - jMo692;
        this.f11578 = j3;
        if (j3 == 0) {
            m691(C1605.f8173);
        }
        return jMo692;
    }
}
