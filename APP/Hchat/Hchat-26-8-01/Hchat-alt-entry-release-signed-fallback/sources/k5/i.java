package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o5.e f7220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f7222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f7223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k5.o f7224l;

    public /* synthetic */ i(k5.o r1, o5.e r2, int r3, o5.s r4, boolean r5, int r6) {
            r0 = this;
            r0.f7219g = r6
            r0.f7224l = r1
            r0.f7220h = r2
            r0.f7221i = r3
            r0.f7222j = r4
            r0.f7223k = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r7 = this;
            int r0 = r7.f7219g
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            o5.e r0 = r7.f7220h
            o5.c r5 = r0.d()
            o5.c r6 = r0.e()
            k5.f r1 = new k5.f
            k5.o r0 = r7.f7224l
            k5.u r0 = r0.f7243j
            androidx.lifecycle.x r3 = r0.f7264b
            int r4 = r7.f7221i
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L1e:
            r2 = r7
            o5.e r0 = r2.f7220h
            o5.c r0 = r0.c()
            k5.h r1 = new k5.h
            k5.o r3 = r2.f7224l
            k5.u r3 = r3.f7243j
            androidx.lifecycle.x r3 = r3.f7264b
            int r4 = r2.f7221i
            r1.<init>(r7, r3, r4, r0)
            return r1
    }
}
