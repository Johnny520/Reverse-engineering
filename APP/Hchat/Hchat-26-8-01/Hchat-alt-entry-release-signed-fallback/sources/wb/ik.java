package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16848t;

    public /* synthetic */ ik(android.content.Context r2, i0.j1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14) {
            r1 = this;
            r0 = 1
            r1.f16835g = r0
            r1.<init>()
            r1.f16847s = r2
            r1.f16848t = r3
            r1.f16836h = r4
            r1.f16837i = r5
            r1.f16838j = r6
            r1.f16839k = r7
            r1.f16840l = r8
            r1.f16841m = r9
            r1.f16842n = r10
            r1.f16843o = r11
            r1.f16844p = r12
            r1.f16845q = r13
            r1.f16846r = r14
            return
    }

    public /* synthetic */ ik(android.content.SharedPreferences r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14) {
            r1 = this;
            r0 = 0
            r1.f16835g = r0
            r1.<init>()
            r1.f16847s = r2
            r1.f16836h = r3
            r1.f16837i = r4
            r1.f16838j = r5
            r1.f16839k = r6
            r1.f16840l = r7
            r1.f16841m = r8
            r1.f16842n = r9
            r1.f16843o = r10
            r1.f16844p = r11
            r1.f16845q = r12
            r1.f16846r = r13
            r1.f16848t = r14
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f16835g
            switch(r1) {
                case 0: goto L68;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f16847s
            android.content.Context r1 = (android.content.Context) r1
            i0.a1 r2 = r0.f16848t
            i0.j1 r2 = (i0.j1) r2
            r6 = r18
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            i0.a1 r7 = r0.f16836h
            i0.a1 r8 = r0.f16837i
            i0.a1 r9 = r0.f16838j
            i0.a1 r10 = r0.f16839k
            i0.a1 r11 = r0.f16840l
            i0.a1 r12 = r0.f16841m
            i0.a1 r13 = r0.f16842n
            i0.a1 r14 = r0.f16843o
            i0.a1 r15 = r0.f16844p
            i0.a1 r3 = r0.f16845q
            r16 = r3
            fb.v r3 = wb.y2.B0(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r14 = r10
            r12 = 0
            r13 = 2039(0x7f7, float:2.857E-42)
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            fb.v r3 = fb.v.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            fb.w.w(r1, r3)
            r14.setValue(r6)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.a1 r4 = r0.f16846r
            r4.setValue(r3)
            if (r2 == 0) goto L5b
            java.lang.String r2 = "已切换模型，将用于下一次请求"
            goto L5d
        L5b:
            java.lang.String r2 = "已切换模型"
        L5d:
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
        L65:
            sf.n r1 = sf.n.f12433a
            return r1
        L68:
            java.lang.Object r1 = r0.f16847s
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            r2 = r18
            r.h r2 = (r.h) r2
            r2.getClass()
            s0.d r3 = wb.p0.F5
            r4 = 0
            r5 = 3
            r.h.a(r2, r4, r3, r5)
            wb.vc r3 = new wb.vc
            r6 = 4
            i0.a1 r10 = r0.f16836h
            r3.<init>(r1, r10, r6)
            s0.d r1 = new s0.d
            r6 = 716715725(0x2ab836cd, float:3.2722992E-13)
            r13 = 1
            r1.<init>(r6, r3, r13)
            r.h.a(r2, r4, r1, r5)
            s0.d r1 = wb.p0.G5
            r.h.a(r2, r4, r1, r5)
            wb.f8 r7 = new wb.f8
            r12 = 4
            i0.a1 r8 = r0.f16837i
            i0.a1 r9 = r0.f16838j
            i0.a1 r11 = r0.f16839k
            r7.<init>(r8, r9, r10, r11, r12)
            s0.d r1 = new s0.d
            r3 = 2013170639(0x77fe8bcf, float:1.03256176E34)
            r1.<init>(r3, r7, r13)
            r.h.a(r2, r4, r1, r5)
            s0.d r1 = wb.p0.H5
            r.h.a(r2, r4, r1, r5)
            wb.uc r7 = new wb.uc
            i0.a1 r8 = r0.f16840l
            i0.a1 r9 = r0.f16841m
            r12 = r10
            i0.a1 r10 = r0.f16842n
            i0.a1 r11 = r0.f16843o
            r1 = r13
            i0.a1 r13 = r0.f16844p
            i0.a1 r14 = r0.f16845q
            i0.a1 r15 = r0.f16846r
            i0.a1 r3 = r0.f16848t
            r16 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            s0.d r3 = new s0.d
            r6 = -985341743(0xffffffffc544e0d1, float:-3150.051)
            r3.<init>(r6, r7, r1)
            r.h.a(r2, r4, r3, r5)
            goto L65
    }
}
