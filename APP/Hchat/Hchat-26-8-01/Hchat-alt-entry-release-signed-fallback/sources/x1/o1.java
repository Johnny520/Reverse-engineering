package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x1.o1 f21013h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21014g;

    static {
            x1.o1 r0 = new x1.o1
            r1 = 0
            r0.<init>(r1)
            x1.o1.f21013h = r0
            return
    }

    public /* synthetic */ o1(int r1) {
            r0 = this;
            r0.f21014g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f21014g
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            x1.f0 r3 = (x1.f0) r3
            x1.f0 r4 = (x1.f0) r4
            int r0 = r3.f20904v
            int r1 = r4.f20904v
            int r0 = gg.l.c(r0, r1)
            if (r0 == 0) goto L14
            goto L20
        L14:
            int r3 = r3.hashCode()
            int r4 = r4.hashCode()
            int r0 = gg.l.c(r3, r4)
        L20:
            return r0
        L21:
            x1.f0 r3 = (x1.f0) r3
            x1.f0 r4 = (x1.f0) r4
            int r0 = r4.f20904v
            int r1 = r3.f20904v
            int r0 = gg.l.c(r0, r1)
            if (r0 == 0) goto L30
            goto L3c
        L30:
            int r3 = r3.hashCode()
            int r4 = r4.hashCode()
            int r0 = gg.l.c(r3, r4)
        L3c:
            return r0
    }
}
