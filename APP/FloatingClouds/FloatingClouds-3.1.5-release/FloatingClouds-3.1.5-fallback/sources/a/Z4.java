package a;

/* JADX INFO: loaded from: classes.dex */
public final class Z4 implements java.util.Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f368a;

    public /* synthetic */ Z4(int r1) {
            r0 = this;
            r0.f368a = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f368a
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L30;
                case 2: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = (java.lang.String) r3
            a.jg r0 = a.C0217jg.f537a
            r0.getClass()
            int r3 = a.C0217jg.g(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = a.C0217jg.g(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = a.C0435w1.f(r3, r2)
            return r2
        L23:
            a.lb r2 = (a.C0248lb) r2
            java.lang.String r2 = r2.d
            a.lb r3 = (a.C0248lb) r3
            java.lang.String r3 = r3.d
            int r2 = a.C0435w1.f(r2, r3)
            return r2
        L30:
            a.r6 r2 = (a.C0350r6) r2
            java.lang.String r2 = r2.d
            a.r6 r3 = (a.C0350r6) r3
            java.lang.String r3 = r3.d
            int r2 = a.C0435w1.f(r2, r3)
            return r2
        L3d:
            a.b3 r2 = (a.C0060b3) r2
            java.lang.String r2 = r2.c
            a.b3 r3 = (a.C0060b3) r3
            java.lang.String r3 = r3.c
            int r2 = a.C0435w1.f(r2, r3)
            return r2
    }
}
