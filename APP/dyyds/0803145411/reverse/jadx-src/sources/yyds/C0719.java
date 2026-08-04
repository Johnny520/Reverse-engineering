package yyds;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᛳᲇᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0719 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2521 f3374;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f3376;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f3377;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f3379;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1507 f3375 = new C1507();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C1507 f3378 = new C1507();

    public C0719(C2521 c2521, long j, boolean z) {
        this.f3374 = c2521;
        this.f3377 = j;
        this.f3379 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C2521 c2521 = this.f3374;
        synchronized (c2521) {
            this.f3376 = true;
            C1507 c1507 = this.f3378;
            j = c1507.f7087;
            c1507.m3030(j);
            c2521.notifyAll();
        }
        if (j > 0) {
            C2521 c25212 = this.f3374;
            TimeZone timeZone = AbstractC0795.f3653;
            c25212.f12444.m2054(j);
        }
        this.f3374.m4568();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6 A[Catch: all -> 0x0022, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:13:0x001c, B:47:0x00b6, B:61:0x00dc, B:62:0x00e1, B:17:0x0025, B:19:0x002b, B:21:0x002f, B:23:0x0033, B:27:0x0041, B:29:0x0045, B:31:0x004f, B:33:0x006c, B:35:0x007d, B:38:0x0094, B:41:0x009e, B:43:0x00a4, B:44:0x00b0, B:58:0x00d2, B:59:0x00d9), top: B:67:0x0005, inners: #2 }] */
    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo692(long j, C1507 c1507) throws Throwable {
        boolean z;
        Throwable c2601;
        long j2;
        long jMo692;
        do {
            C2521 c2521 = this.f3374;
            synchronized (c2521) {
                c2521.f12444.getClass();
                C1856 c1856 = c2521.f12439;
                z = true;
                boolean z2 = c1856.f9334 || c1856.f9335;
                if (z2) {
                    c2521.f12440.m977();
                }
                try {
                    if (c2521.m4570() == 0 || this.f3379) {
                        c2601 = null;
                    } else {
                        c2601 = c2521.f12437;
                        if (c2601 == null) {
                            c2601 = new C2601(c2521.m4570());
                        }
                    }
                    if (this.f3376) {
                        throw new IOException("stream closed");
                    }
                    C1507 c15072 = this.f3378;
                    long j3 = c15072.f7087;
                    if (j3 > 0) {
                        jMo692 = c15072.mo692(Math.min(8192L, j3), c1507);
                        C2206.m4192(c2521.f12436, jMo692, 0L, 2);
                        long jM4194 = c2521.f12436.m4194();
                        if (c2601 == null) {
                            j2 = -1;
                            if (jM4194 >= c2521.f12444.f4313.m3416() / 2) {
                                c2521.f12444.m2053(c2521.f12442, jM4194);
                                C2206.m4192(c2521.f12436, 0L, jM4194, 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = -1;
                        if (this.f3379 || c2601 != null) {
                            jMo692 = -1;
                        } else {
                            try {
                                c2521.wait();
                                jMo692 = -1;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    z = false;
                } finally {
                    if (z2) {
                        c2521.f12440.m3357();
                    }
                }
            }
            this.f3374.f12444.f4303.getClass();
        } while (z);
        if (jMo692 != j2) {
            return jMo692;
        }
        if (c2601 == null) {
            return j2;
        }
        throw c2601;
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f3374.f12440;
    }
}
