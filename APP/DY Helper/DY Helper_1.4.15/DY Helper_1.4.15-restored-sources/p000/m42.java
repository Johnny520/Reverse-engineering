package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class m42 {

    /* JADX INFO: renamed from: δ */
    public static final p000.l42 f6935 = null;

    /* JADX INFO: renamed from: α */
    public boolean f6936;

    /* JADX INFO: renamed from: β */
    public long f6937;

    /* JADX INFO: renamed from: γ */
    public long f6938;

    static {
            l42 r0 = new l42
            r0.<init>()
            p000.m42.f6935 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public p000.m42 mo2868() {
            r1 = this;
            r0 = 0
            r1.f6936 = r0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public p000.m42 mo2869() {
            r2 = this;
            r0 = 0
            r2.f6938 = r0
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public long mo2870() {
            r2 = this;
            boolean r0 = r2.f6936
            if (r0 == 0) goto L7
            long r0 = r2.f6937
            return r0
        L7:
            java.lang.String r2 = "No deadline"
            p000.C1080.m7279(r2)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public p000.m42 mo2871(long r2) {
            r1 = this;
            r0 = 1
            r1.f6936 = r0
            r1.f6937 = r2
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public boolean mo2872() {
            r0 = this;
            boolean r0 = r0.f6936
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public void mo2873() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L25
            boolean r0 = r4.f6936
            if (r0 == 0) goto L24
            long r0 = r4.f6937
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L24
        L1c:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException
            java.lang.String r0 = "deadline reached"
            r4.<init>(r0)
            throw r4
        L24:
            return
        L25:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: η */
    public p000.m42 mo2874(long r4) {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L12
            long r4 = r0.toNanos(r4)
            r3.f6938 = r4
            return r3
        L12:
            java.lang.String r3 = "timeout < 0: "
            java.lang.String r3 = p000.AbstractC0602nx.m4126(r4, r3)
            p000.C1080.m7266(r3)
            r3 = 0
            return r3
    }
}
