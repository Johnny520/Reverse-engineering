package a;

/* JADX INFO: loaded from: classes.dex */
public final class M1 implements a.Pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ M1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f169a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.Pd
    public final java.util.Iterator iterator() {
            r1 = this;
            int r0 = r1.f169a
            switch(r0) {
                case 0: goto L13;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
        La:
            java.lang.Object r0 = r1.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            return r0
        L13:
            java.lang.Object r0 = r1.b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            a.G1 r0 = a.C0435w1.I(r0)
            return r0
    }
}
