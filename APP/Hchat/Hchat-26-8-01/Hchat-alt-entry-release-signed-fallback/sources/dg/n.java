package dg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ng.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f2262b;

    public n(fg.p r2) {
            r1 = this;
            r0 = 1
            r1.f2261a = r0
            r1.<init>()
            yf.h r2 = (yf.h) r2
            r1.f2262b = r2
            return
    }

    public /* synthetic */ n(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f2261a = r2
            r0.f2262b = r1
            r0.<init>()
            return
    }

    @Override // ng.j
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f2261a
            switch(r0) {
                case 0: goto L3a;
                case 1: goto L31;
                case 2: goto L2c;
                case 3: goto L22;
                case 4: goto L18;
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2262b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            return r0
        Le:
            java.lang.Object r0 = r2.f2262b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            gg.b r1 = new gg.b
            r1.<init>(r0)
            return r1
        L18:
            og.d r0 = new og.d
            java.lang.Object r1 = r2.f2262b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            return r0
        L22:
            ng.o r0 = new ng.o
            java.lang.Object r1 = r2.f2262b
            java.io.File r1 = (java.io.File) r1
            r0.<init>(r1)
            return r0
        L2c:
            java.lang.Object r0 = r2.f2262b
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
        L31:
            java.lang.Object r0 = r2.f2262b
            yf.h r0 = (yf.h) r0
            ng.k r0 = fb.v0.B(r0)
            return r0
        L3a:
            dg.m r0 = new dg.m
            r0.<init>(r2)
            return r0
    }
}
