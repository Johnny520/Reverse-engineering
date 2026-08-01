package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class bo1 implements java.io.Closeable {

    /* JADX INFO: renamed from: ε */
    public static final p000.ao1 f1795 = null;

    static {
            dd r0 = p000.C0208dd.f3085
            r0.getClass()
            sc r1 = new sc
            r1.<init>()
            r1.m5463(r0)
            byte[] r0 = r0.f3086
            int r0 = r0.length
            long r2 = (long) r0
            ao1 r0 = new ao1
            r0.<init>(r2, r1)
            p000.bo1.f1795 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            ad r0 = r0.mo567()
            p000.sd2.m5472(r0)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final byte[] m987() {
            r6 = this;
            long r0 = r6.mo565()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L5a
            ad r6 = r6.mo567()
            r2 = 0
            byte[] r3 = r6.mo59()     // Catch: java.lang.Throwable -> L1d
            r6.close()     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r2 = move-exception
        L19:
            r5 = r3
            r3 = r2
            r2 = r5
            goto L28
        L1d:
            r3 = move-exception
            if (r6 == 0) goto L28
            r6.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r6 = move-exception
            p000.ln0.m3624(r3, r6)
        L28:
            if (r3 != 0) goto L59
            int r6 = r2.length
            r3 = -1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L58
            long r3 = (long) r6
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L37
            goto L58
        L37:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Content-Length ("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = ") disagree"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            throw r2
        L58:
            return r2
        L59:
            throw r3
        L5a:
            java.lang.String r6 = "Cannot buffer entire body for content length: "
            java.lang.String r6 = p000.AbstractC0602nx.m4126(r0, r6)
            p000.C1080.m7281(r6)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: η */
    public abstract long mo565();

    /* JADX INFO: renamed from: θ */
    public abstract p000.ez0 mo566();

    /* JADX INFO: renamed from: κ */
    public abstract p000.InterfaceC0014ad mo567();
}
