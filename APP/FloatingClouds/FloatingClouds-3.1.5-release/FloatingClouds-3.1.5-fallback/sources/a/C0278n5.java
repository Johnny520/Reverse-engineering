package a;

/* JADX INFO: renamed from: a.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0278n5 implements a.InterfaceC0369s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f594a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ C0278n5(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f594a = r2
            r0.b = r1
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r10 = this;
            int r0 = r10.f594a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.b
            a.Sc r0 = (a.Sc) r0
            T r0 = r0.f263a
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            if (r0 == 0) goto L12
            r0.dismiss()
        L12:
            java.lang.Object r0 = r10.c
            a.ra r0 = (a.C0354ra) r0
            r0.f()
            a.Wf r0 = a.Wf.f330a
            return r0
        L1c:
            a.y6 r0 = new a.y6
            r0.<init>()
            a.e3 r1 = new a.e3
            r1.<init>()
            java.lang.Object r2 = r10.c
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.String r3 = "usingStrings"
            a.C0193i9.e(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
            r6 = r5
        L3f:
            if (r6 >= r4) goto L4f
            r7 = r2[r6]
            a.ve r8 = new a.ve
            r9 = 1
            r8.<init>(r7, r9, r5)
            r3.add(r8)
            int r6 = r6 + 1
            goto L3f
        L4f:
            java.util.ArrayList r2 = a.C0383t3.y0(r3)
            r1.c = r2
            r0.b = r1
            java.lang.Object r1 = r10.b
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            a.d3 r0 = r1.p(r0)
            return r0
    }
}
