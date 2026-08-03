package a;

/* JADX INFO: renamed from: a.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0470y0 extends a.AbstractC0407u9 implements a.InterfaceC0369s7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a.X1 c;

    public /* synthetic */ C0470y0(a.X1 r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.c = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r2 = this;
            int r0 = r2.b
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            a.f5 r0 = new a.f5
            a.X1 r1 = r2.c
            a.lb r1 = (a.C0248lb) r1
            java.lang.String r1 = r1.d
            r0.<init>(r1)
            return r0
        L11:
            a.X4 r0 = new a.X4
            a.X1 r1 = r2.c
            a.b3 r1 = (a.C0060b3) r1
            java.lang.String r1 = r1.c
            r0.<init>(r1)
            return r0
        L1d:
            a.X4 r0 = new a.X4
            a.X1 r1 = r2.c
            a.x0 r1 = (a.C0452x0) r1
            java.lang.String r1 = r1.b
            r0.<init>(r1)
            return r0
    }
}
