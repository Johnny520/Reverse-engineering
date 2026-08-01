package p000;

/* JADX INFO: renamed from: gx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0338gx implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4496;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ long f4497;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f4498;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f4499;

    public /* synthetic */ C0338gx(android.app.AlertDialog r2, long r3, java.lang.String r5) {
            r1 = this;
            r0 = 0
            r1.f4496 = r0
            int r0 = p000.C0410ix.f5220
            r1.<init>()
            r1.f4498 = r2
            r1.f4497 = r3
            r1.f4499 = r5
            return
    }

    public /* synthetic */ C0338gx(java.lang.ClassLoader r2, p000.hb0 r3, long r4) {
            r1 = this;
            r0 = 1
            r1.f4496 = r0
            r1.<init>()
            r1.f4498 = r2
            r1.f4499 = r3
            r1.f4497 = r4
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f4496
            s62 r1 = p000.s62.f9751
            r2 = 0
            long r3 = r11.f4497
            java.lang.Object r5 = r11.f4499
            java.lang.Object r11 = r11.f4498
            switch(r0) {
                case 0: goto Lf1;
                default: goto Le;
            }
        Le:
            java.lang.ClassLoader r11 = (java.lang.ClassLoader) r11
            hb0 r5 = (p000.hb0) r5
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jb0.f5399
            gb0 r0 = new gb0
            r0.<init>(r5, r3)
            zb0 r3 = new zb0
            r4 = 4
            r3.<init>(r4)
            sb0 r3 = p000.C0966x.m6413(r11, r0, r3)
            java.util.List r6 = r3.f9811
            java.lang.Object r7 = r0.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L33
            goto Lf0
        L33:
            boolean r7 = r6.isEmpty()
            java.lang.String r8 = "rb22c2f83ae9ef877"
            if (r7 == 0) goto L5e
            java.lang.String r11 = p000.jb0.m2922(r5)
            java.util.List r0 = r3.f9810
            int r0 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r11 = "检查完成，无待审核申请，群="
            r2.append(r11)
            r2.append(r0)
            java.lang.String r11 = r2.toString()
            p000.C0888ux.m5975(r8, r11)
            goto Lf0
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r7 = 10
            int r7 = p000.AbstractC1021yh.m6889(r6, r7)
            r3.<init>(r7)
            java.util.Iterator r7 = r6.iterator()
        L6d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L83
            java.lang.Object r9 = r7.next()
            ic0 r9 = (p000.ic0) r9
            long r9 = r9.f4993
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3.add(r9)
            goto L6d
        L83:
            zb0 r7 = new zb0
            r9 = 3
            r7.<init>(r9)
            eb0 r3 = p000.C0966x.m6439(r11, r3, r0, r7)
            java.lang.Object r7 = r0.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9a
            goto Lf0
        L9a:
            zb0 r7 = new zb0
            r7.<init>(r4)
            sb0 r11 = p000.C0966x.m6413(r11, r0, r7)
            java.lang.String r0 = p000.jb0.m2922(r5)
            int r5 = r6.size()
            java.lang.Object r6 = r3.f3468
            int r6 = r6.size()
            java.util.List r7 = r11.f9811
            int r7 = r7.size()
            boolean r3 = r3.f3469
            if (r3 == 0) goto Lc0
            boolean r11 = r11.f9812
            if (r11 == 0) goto Lc0
            r2 = 1
        Lc0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r0 = "审批完成，待审="
            r11.append(r0)
            r11.append(r5)
            java.lang.String r0 = "，宿主确认="
            r11.append(r0)
            r11.append(r6)
            java.lang.String r0 = "，剩余="
            r11.append(r0)
            r11.append(r7)
            java.lang.String r0 = "，完整="
            r11.append(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r0 = 0
            p000.C0888ux.m5988(r8, r11, r0, r4, r0)
        Lf0:
            return r1
        Lf1:
            android.app.AlertDialog r11 = (android.app.AlertDialog) r11
            int r0 = p000.C0410ix.f5220
            java.lang.String r5 = (java.lang.String) r5
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0410ix.f5231
            r0.set(r2)
            r11.dismiss()
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0410ix.f5229
            r11.set(r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "prewarm canceled by best-version warning, host="
            r11.<init>(r0)
            r11.append(r3)
            java.lang.String r0 = "/"
            r11.append(r0)
            r11.append(r5)
            java.lang.String r0 = ", best=390601"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            p000.C0410ix.m2820(r11)
            return r1
    }
}
