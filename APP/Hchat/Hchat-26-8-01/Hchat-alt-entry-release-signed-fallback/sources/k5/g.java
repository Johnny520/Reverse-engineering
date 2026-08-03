package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o5.e f7205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f7208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f7209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k5.o f7210l;

    public g(k5.o r1, o5.e r2, int r3, int r4, k5.l r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f7210l = r1
            r0.f7205g = r2
            r0.f7206h = r3
            r0.f7207i = r4
            r0.f7208j = r5
            r0.f7209k = r6
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r7 = this;
            o5.e r0 = r7.f7205g
            o5.c r6 = r0.c()
            k5.o r0 = r7.f7210l
            k5.u r0 = r0.f7243j
            int r1 = r7.f7206h
            if (r1 != 0) goto L12
            o5.k r1 = o5.m.f9530a
            r5 = r1
            goto L18
        L12:
            o5.l r2 = new o5.l
            r2.<init>(r0, r1)
            r5 = r2
        L18:
            k5.f r1 = new k5.f
            androidx.lifecycle.x r3 = r0.f7264b
            int r4 = r7.f7207i
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
