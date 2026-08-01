package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9324;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f9325;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.Button f9326;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.Button f9327;

    public /* synthetic */ rb1(android.app.Activity r1, android.widget.Button r2, android.widget.Button r3, int r4) {
            r0 = this;
            r0.f9324 = r4
            r0.f9325 = r1
            r0.f9326 = r2
            r0.f9327 = r3
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f9324
            s62 r1 = p000.s62.f9751
            r2 = 0
            android.widget.Button r3 = r9.f9327
            android.widget.Button r4 = r9.f9326
            android.app.Activity r9 = r9.f9325
            switch(r0) {
                case 0: goto L3f;
                default: goto Le;
            }
        Le:
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L1b
            goto L2a
        L1b:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = p000.j81.m2906(r10, r2, r0)
            java.lang.String r0 = "pet_elf_camp_smart_seed_max_price"
            p000.ui1.m5873(r0, r10)
            p000.xn0.m6701()
        L2a:
            p000.xn0.m6712(r4, r3)
            java.util.concurrent.atomic.AtomicReference r10 = p000.dd1.f3093
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.jc1.f5424
            java.util.List r10 = p000.jc1.m2939()
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ 1
            p000.dd1.m1716(r9, r10)
            return r1
        L3f:
            vd1 r10 = (p000.vd1) r10
            r10.getClass()
            td r0 = r10.f11246
            java.lang.Integer r10 = r10.f11247
            boolean r5 = p000.ui1.m5867()
            if (r5 != 0) goto L4f
            goto L8d
        L4f:
            r5 = 0
            td r6 = p000.EnumC0831td.f10319
            td r7 = p000.EnumC0831td.f10318
            if (r0 != r7) goto L57
            goto L64
        L57:
            if (r0 != r6) goto L63
            if (r10 == 0) goto L63
            int r0 = r10.intValue()
            if (r0 <= 0) goto L63
            r7 = r6
            goto L64
        L63:
            r7 = r5
        L64:
            if (r7 == 0) goto L6b
            java.lang.String r0 = r7.name()
            goto L6c
        L6b:
            r0 = r5
        L6c:
            if (r0 != 0) goto L70
            java.lang.String r0 = ""
        L70:
            java.lang.String r8 = "pet_elf_camp_global_plant_seed_mode"
            p000.ui1.m5875(r8, r0)
            if (r7 != r6) goto L85
            if (r10 == 0) goto L7e
            int r2 = r10.intValue()
            goto L85
        L7e:
            java.lang.String r9 = "Required value was null."
            p000.C1080.m7279(r9)
            r1 = r5
            goto La1
        L85:
            java.lang.String r10 = "pet_elf_camp_global_plant_seed_id"
            p000.ui1.m5873(r10, r2)
            p000.xn0.m6701()
        L8d:
            p000.xn0.m6712(r4, r3)
            java.util.concurrent.atomic.AtomicReference r10 = p000.dd1.f3093
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.jc1.f5424
            java.util.List r10 = p000.jc1.m2939()
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ 1
            p000.dd1.m1716(r9, r10)
        La1:
            return r1
    }
}
