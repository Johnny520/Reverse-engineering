package yyds;

import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: yyds.ᛷᲁᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1646 extends C0313 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2521 f8379;

    public C1646(C2521 c2521) {
        this.f8379 = c2521;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m3357() throws SocketTimeoutException {
        if (m978()) {
            throw new SocketTimeoutException("timeout");
        }
    }

    @Override // yyds.C0313
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final void mo979() {
        this.f8379.m4572(9);
        C0937 c0937 = this.f8379.f12444;
        synchronized (c0937) {
            long j = c0937.f4315;
            long j2 = c0937.f4302;
            if (j < j2) {
                return;
            }
            c0937.f4302 = j2 + 1;
            c0937.f4306 = System.nanoTime() + 1000000000;
            C0153.m694(c0937.f4312, AbstractC2104.m4015(new StringBuilder(), c0937.f4299, " ping"), new C1223(13, c0937));
        }
    }
}
