package p000;

/* JADX INFO: renamed from: fg */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1413fg implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4993a;

    /* JADX INFO: renamed from: b */
    public final C2563ty f4994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1544ig f4995c;

    public /* synthetic */ RunnableC1413fg(C1544ig r1, C2563ty r2, int r3) {
        this.f4993a = r3;
        this.f4995c = r1;
        this.f4994b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f4993a) {
            case 0: goto L28;
            default: goto L4;
        };
    L4:
        C2563ty r0 = this.f4994b;
        r0.f8884a.m2744a();
        Object r02 = r0.f8885b;
        monitor-enter(r02);
        C1544ig r1 = this.f4995c;     // Catch: Throwable -> L22
        monitor-enter(r1);     // Catch: Throwable -> L22
        C1501hg r2 = this.f4995c.f5444a;     // Catch: Throwable -> L13
        C2563ty r3 = this.f4994b;     // Catch: Throwable -> L13
        if (r2.f5288a.contains(new C1457gg(r3, AbstractC0671Pj.f2140c)) == false) goto L18;
        this.f4995c.f5462s.m4539a();     // Catch: Throwable -> L13
        C1544ig r22 = this.f4995c;     // Catch: Throwable -> L13
        C2563ty r32 = this.f4994b;     // Catch: Throwable -> L13
        r22.getClass();     // Catch: Throwable -> L13
        r32.m5048g(r22.f5462s, r22.f5458o, r22.f5465v);     // Catch: Throwable -> L15
        this.f4995c.m2963h(this.f4994b);     // Catch: Throwable -> L13
        goto L18
    L15:
        th = move-exception;
        throw new C0265G6(th);     // Catch: Throwable -> L13
    L18:
        this.f4995c.m2959d();     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        monitor-exit(r02);     // Catch: Throwable -> L22
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        throw th;
    L28:
        C2563ty r03 = this.f4994b;
        r03.f8884a.m2744a();
        Object r04 = r03.f8885b;
        monitor-enter(r04);
        C1544ig r12 = this.f4995c;     // Catch: Throwable -> L46
        monitor-enter(r12);     // Catch: Throwable -> L46
        C1501hg r23 = this.f4995c.f5444a;     // Catch: Throwable -> L40
        C2563ty r33 = this.f4994b;     // Catch: Throwable -> L40
        if (r23.f5288a.contains(new C1457gg(r33, AbstractC0671Pj.f2140c)) == false) goto L42;
        C1544ig r24 = this.f4995c;     // Catch: Throwable -> L40
        C2563ty r34 = this.f4994b;     // Catch: Throwable -> L40
        r24.getClass();     // Catch: Throwable -> L40
        r34.m5047c(r24.f5460q, 5);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw new C0265G6(th);     // Catch: Throwable -> L40
    L42:
        this.f4995c.m2959d();     // Catch: Throwable -> L40
        monitor-exit(r12);     // Catch: Throwable -> L40
        monitor-exit(r04);     // Catch: Throwable -> L46
        return;
    L40:
        th = move-exception;
        throw th;     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        throw th;
    }
}
