package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tv1 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10475;

    public /* synthetic */ tv1(int r1) {
            r0 = this;
            r0.f10475 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r2 = this;
            int r2 = r2.f10475
            r0 = 1
            s62 r1 = p000.s62.f9751
            switch(r2) {
                case 0: goto L47;
                case 1: goto L3f;
                case 2: goto L30;
                case 3: goto L25;
                case 4: goto L1f;
                case 5: goto L19;
                case 6: goto L13;
                default: goto L8;
            }
        L8:
            android.os.Handler r2 = com.example.dyhelper.p002ui.C0182.f2694
            com.example.dyhelper.ui.χ r2 = new com.example.dyhelper.ui.χ
            r2.<init>()
            com.example.dyhelper.p002ui.C0182.m1597(r2)
            return r1
        L13:
            android.os.Handler r2 = com.example.dyhelper.p002ui.C0182.f2694
            com.example.dyhelper.p002ui.C0182.m1595()
            return r1
        L19:
            android.os.Handler r2 = com.example.dyhelper.p002ui.C0182.f2694
            com.example.dyhelper.p002ui.C0182.m1595()
            return r1
        L1f:
            android.os.Handler r2 = com.example.dyhelper.p002ui.C0182.f2694
            com.example.dyhelper.p002ui.C0182.m1595()
            return r1
        L25:
            ry1 r2 = p000.ry1.f9602
            boolean r2 = p000.ry1.m5270()
        L2b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L30:
            java.util.concurrent.atomic.AtomicReference r2 = p000.ry1.f9578
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L3f:
            java.util.concurrent.ConcurrentHashMap r2 = p000.ry1.f9620
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r0
            goto L2b
        L47:
            return r1
    }
}
