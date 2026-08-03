package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ba {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f163;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final p000.a9 f164;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public volatile p000.eb f165;

    public ba(p000.a9 r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f163 = r0
            r2.f164 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.eb m81() {
            r3 = this;
            ۟.a9 r0 = r3.f164
            r0.m35()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f163
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L2e
            ۟.eb r0 = r3.f165
            if (r0 != 0) goto L2b
            java.lang.String r0 = r3.mo82()
            ۟.a9 r1 = r3.f164
            r1.m35()
            r1.m36()
            ۟.bb r1 = r1.f102
            ۟.ab r1 = r1.mo84()
            ۟.eb r0 = r1.mo44(r0)
            r3.f165 = r0
        L2b:
            ۟.eb r0 = r3.f165
            goto L44
        L2e:
            java.lang.String r0 = r3.mo82()
            ۟.a9 r1 = r3.f164
            r1.m35()
            r1.m36()
            ۟.bb r1 = r1.f102
            ۟.ab r1 = r1.mo84()
            ۟.eb r0 = r1.mo44(r0)
        L44:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract java.lang.String mo82();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m83(p000.eb r2) {
            r1 = this;
            ۟.eb r0 = r1.f165
            if (r2 != r0) goto La
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f163
            r0 = 0
            r2.set(r0)
        La:
            return
    }
}
