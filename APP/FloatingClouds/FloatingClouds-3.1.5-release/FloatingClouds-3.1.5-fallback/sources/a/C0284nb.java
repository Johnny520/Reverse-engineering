package a;

/* JADX INFO: renamed from: a.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0284nb extends a.AbstractC0407u9 implements a.InterfaceC0369s7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge c;
    public final /* synthetic */ a.C0248lb d;
    public final /* synthetic */ int e;

    public /* synthetic */ C0284nb(org.luckypray.dexkit.DexKitBridge r1, a.C0248lb r2, int r3, int r4) {
            r0 = this;
            r0.b = r4
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            org.luckypray.dexkit.DexKitBridge r3 = r7.c
            int r4 = r7.e
            a.lb r5 = r7.d
            int r6 = r7.b
            switch(r6) {
                case 0: goto L60;
                case 1: goto L2a;
                default: goto Le;
            }
        Le:
            int r5 = r5.e
            long r4 = a.X1.a(r4, r5)
            long[] r2 = new long[r2]
            r2[r1] = r4
            a.d3 r1 = r3.r(r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L23
            goto L27
        L23:
            java.lang.Object r0 = r1.a()
        L27:
            a.b3 r0 = (a.C0060b3) r0
            return r0
        L2a:
            java.util.ArrayList r0 = r5.f
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r5 = a.X1.a(r4, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r1.add(r2)
            goto L3b
        L57:
            long[] r0 = a.C0383t3.x0(r1)
            a.d3 r0 = r3.r(r0)
            return r0
        L60:
            int r5 = r5.b
            long r4 = a.X1.a(r4, r5)
            long[] r2 = new long[r2]
            r2[r1] = r4
            a.d3 r1 = r3.r(r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L75
            goto L79
        L75:
            java.lang.Object r0 = r1.a()
        L79:
            a.b3 r0 = (a.C0060b3) r0
            return r0
    }
}
