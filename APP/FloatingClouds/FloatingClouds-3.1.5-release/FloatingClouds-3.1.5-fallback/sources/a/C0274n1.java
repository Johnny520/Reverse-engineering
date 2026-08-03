package a;

/* JADX INFO: renamed from: a.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0274n1 extends a.V6 {
    public final /* synthetic */ a.C0292o1.e j;
    public final /* synthetic */ a.C0292o1 k;

    public C0274n1(a.C0292o1 r1, a.C0292o1 r2, a.C0292o1.e r3) {
            r0 = this;
            r0.k = r1
            r0.j = r3
            r0.<init>(r2)
            return
    }

    @Override // a.V6
    public final a.InterfaceC0108de b() {
            r1 = this;
            a.o1$e r0 = r1.j
            return r0
    }

    @Override // a.V6
    public final boolean c() {
            r3 = this;
            a.o1 r0 = r3.k
            a.o1$g r1 = r0.getInternalPopup()
            boolean r1 = r1.b()
            if (r1 != 0) goto L19
            int r1 = r0.getTextDirection()
            int r2 = r0.getTextAlignment()
            a.o1$g r0 = r0.f
            r0.e(r1, r2)
        L19:
            r0 = 1
            return r0
    }
}
