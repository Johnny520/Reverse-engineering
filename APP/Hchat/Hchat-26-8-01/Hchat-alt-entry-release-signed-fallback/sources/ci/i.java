package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements tg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1728h;

    public /* synthetic */ i(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f1727g = r2
            r0.f1728h = r1
            r0.<init>()
            return
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r8, wf.c r9) {
            r7 = this;
            int r9 = r7.f1727g
            switch(r9) {
                case 0: goto L60;
                case 1: goto L3b;
                case 2: goto L23;
                case 3: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            java.lang.Object r9 = r7.f1728h
            y1.z1 r9 = (y1.z1) r9
            i0.f1 r9 = r9.f22185i
            r9.h(r8)
            sf.n r8 = sf.n.f12433a
            return r8
        L17:
            java.lang.Object r9 = r7.f1728h
            gg.u r9 = (gg.u) r9
            r9.f4564g = r8
            ug.a r8 = new ug.a
            r8.<init>(r7)
            throw r8
        L23:
            sf.n r8 = (sf.n) r8
            java.lang.Object r8 = r7.f1728h
            f0.n r8 = (f0.n) r8
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r9 < r0) goto L38
            android.view.inputmethod.InputMethodManager r9 = r8.a()
            android.view.View r8 = r8.f2972b
            ai.a.y(r9, r8)
        L38:
            sf.n r8 = sf.n.f12433a
            return r8
        L3b:
            n.j r8 = (n.j) r8
            java.lang.Object r9 = r7.f1728h
            ci.n0 r9 = (ci.n0) r9
            boolean r0 = r8 instanceof n.m
            if (r0 == 0) goto L4c
            r8 = 1062836634(0x3f59999a, float:0.85)
            ci.n0.k1(r9, r8)
            goto L5d
        L4c:
            boolean r0 = r8 instanceof n.n
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L56
            ci.n0.k1(r9, r1)
            goto L5d
        L56:
            boolean r8 = r8 instanceof n.l
            if (r8 == 0) goto L5d
            ci.n0.k1(r9, r1)
        L5d:
            sf.n r8 = sf.n.f12433a
            return r8
        L60:
            n.j r8 = (n.j) r8
            java.lang.Object r9 = r7.f1728h
            ci.k r9 = (ci.k) r9
            boolean r0 = r9.f1740w
            boolean r1 = r9.f1741x
            boolean r2 = r9.f1742y
            boolean r3 = r9.f1743z
            boolean r4 = r8 instanceof n.m
            r5 = 1
            if (r4 == 0) goto L76
            r9.f1740w = r5
            goto Lac
        L76:
            boolean r4 = r8 instanceof n.n
            r6 = 0
            if (r4 != 0) goto Laa
            boolean r4 = r8 instanceof n.l
            if (r4 == 0) goto L80
            goto Laa
        L80:
            boolean r4 = r8 instanceof n.h
            if (r4 == 0) goto L87
            r9.f1741x = r5
            goto Lac
        L87:
            boolean r4 = r8 instanceof n.i
            if (r4 == 0) goto L8e
            r9.f1741x = r6
            goto Lac
        L8e:
            boolean r4 = r8 instanceof n.f
            if (r4 == 0) goto L95
            r9.f1742y = r5
            goto Lac
        L95:
            boolean r4 = r8 instanceof n.g
            if (r4 == 0) goto L9c
            r9.f1742y = r6
            goto Lac
        L9c:
            boolean r4 = r8 instanceof zh.a
            if (r4 == 0) goto La3
            r9.f1743z = r5
            goto Lac
        La3:
            boolean r8 = r8 instanceof zh.b
            if (r8 == 0) goto L12b
            r9.f1743z = r6
            goto Lac
        Laa:
            r9.f1740w = r6
        Lac:
            boolean r8 = r9.f1740w
            if (r0 != r8) goto Lbc
            boolean r0 = r9.f1741x
            if (r1 != r0) goto Lbc
            boolean r0 = r9.f1742y
            if (r2 != r0) goto Lbc
            boolean r0 = r9.f1743z
            if (r3 == r0) goto L12b
        Lbc:
            gg.r r0 = new gg.r
            r0.<init>()
            boolean r1 = r9.f1741x
            if (r1 == 0) goto Lcd
            float r1 = r0.f4561g
            r2 = 1031127695(0x3d75c28f, float:0.06)
            float r1 = r1 + r2
            r0.f4561g = r1
        Lcd:
            boolean r1 = r9.f1742y
            if (r1 == 0) goto Ld9
            float r1 = r0.f4561g
            r2 = 1034147594(0x3da3d70a, float:0.08)
            float r1 = r1 + r2
            r0.f4561g = r1
        Ld9:
            r1 = 1036831949(0x3dcccccd, float:0.1)
            if (r8 == 0) goto Le3
            float r8 = r0.f4561g
            float r8 = r8 + r1
            r0.f4561g = r8
        Le3:
            boolean r8 = r9.f1743z
            if (r8 == 0) goto Lec
            float r8 = r0.f4561g
            float r8 = r8 + r1
            r0.f4561g = r8
        Lec:
            float r8 = r0.f4561g
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r1 = 3
            r2 = 0
            if (r8 != 0) goto L10d
            qg.e1 r8 = r9.C
            if (r8 == 0) goto Lfc
            r8.a(r2)
        Lfc:
            qg.t r8 = r9.Y0()
            c0.m r3 = new c0.m
            r4 = 2
            r3.<init>(r9, r0, r2, r4)
            qg.e1 r8 = qg.v.q(r8, r2, r3, r1)
            r9.C = r8
            goto L12b
        L10d:
            qg.e1 r8 = r9.B
            if (r8 == 0) goto L114
            r8.a(r2)
        L114:
            qg.e1 r8 = r9.C
            if (r8 == 0) goto L11b
            r8.a(r2)
        L11b:
            qg.t r8 = r9.Y0()
            ci.j r3 = new ci.j
            r4 = 0
            r3.<init>(r9, r0, r2, r4)
            qg.e1 r8 = qg.v.q(r8, r2, r3, r1)
            r9.B = r8
        L12b:
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
