package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2547i;

    public /* synthetic */ g(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.f2545g = r1
            r0.f2546h = r2
            r0.f2547i = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f2545g
            switch(r0) {
                case 0: goto L1cf;
                case 1: goto L1c0;
                case 2: goto L1b1;
                case 3: goto L1a2;
                case 4: goto L193;
                case 5: goto L184;
                case 6: goto L175;
                case 7: goto L166;
                case 8: goto L12a;
                default: goto L5;
            }
        L5:
            bc.l r12 = (bc.l) r12
            r12.getClass()
            ud.e r0 = r12.f751b
            bc.d r1 = r12.b()
            if (r1 == 0) goto L13
            goto L16
        L13:
            r0.V()
        L16:
            java.lang.String r1 = r11.f2546h
            ud.r r0 = r0.m0(r1)
            r2 = 0
            if (r0 != 0) goto L21
            r0 = r2
            goto L29
        L21:
            bc.k r3 = r12.a()
            bc.n r0 = r3.c(r0)
        L29:
            java.lang.String r3 = r11.f2547i
            if (r0 == 0) goto L2e
            goto L59
        L2e:
            r12.b()
            java.util.List r12 = r12.f753d
            r12.getClass()
            java.util.Iterator r12 = r12.iterator()
        L3a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r12.next()
            r4 = r0
            bc.n r4 = (bc.n) r4
            ud.r r4 = r4.f756a
            od.d r4 = r4.f13717k
            java.lang.String r4 = r4.f9781k
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L3a
            goto L55
        L54:
            r0 = r2
        L55:
            bc.n r0 = (bc.n) r0
            if (r0 == 0) goto L11f
        L59:
            ud.r r12 = r0.f756a
            ud.e r0 = r12.f13718l
            ud.e r1 = r0.a0()
            bc.d r1 = r1.V()
            boolean r4 = r1.a()
            r5 = -1
            if (r4 != 0) goto L6f
        L6c:
            r4 = r5
            goto Lde
        L6f:
            b.e r4 = r1.c()
            int r6 = r12.f9390j
            r7 = 1
            int r6 = r6 + r7
            java.lang.Object r4 = r4.f333i
            java.util.NavigableMap r4 = (java.util.NavigableMap) r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.NavigableMap r4 = r4.headMap(r6, r7)
            java.util.NavigableMap r4 = r4.descendingMap()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L90:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Ld6
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r7 = r7.getValue()
            hc.a r7 = (hc.a) r7
            int r9 = r7.j()
            int r9 = t3.c.b(r9)
            r10 = 6
            if (r9 == r10) goto Lbe
            r7 = 8
            if (r9 == r7) goto Lb8
            goto Ld2
        Lb8:
            if (r6 != 0) goto Lbb
            goto Ld3
        Lbb:
            int r6 = r6 + (-1)
            goto Ld2
        Lbe:
            ic.b r7 = (ic.b) r7
            hc.c r7 = r7.f6652g
            int r7 = r7.j()
            int r7 = t3.c.b(r7)
            if (r7 == 0) goto Ld0
            r8 = 2
            if (r7 == r8) goto Ld0
            goto Ld2
        Ld0:
            int r6 = r6 + 1
        Ld2:
            r8 = r2
        Ld3:
            if (r8 == 0) goto L90
            goto Ld7
        Ld6:
            r8 = r2
        Ld7:
            if (r8 != 0) goto Lda
            goto L6c
        Lda:
            int r4 = r8.intValue()
        Lde:
            if (r4 != r5) goto Le1
            goto Lff
        Le1:
            int r12 = r12.f9390j
            ud.u r0 = r0.f13688k
            bc.g r0 = r0.f13742a
            java.lang.String r0 = r0.F
            java.lang.String r0 = bc.e.i(r0, r0)
            java.lang.String r6 = r1.b()
            int r6 = r6.lastIndexOf(r0, r12)
            if (r6 != r5) goto Lf8
            goto Lfd
        Lf8:
            int r12 = r0.length()
            int r12 = r12 + r6
        Lfd:
            if (r4 >= r12) goto L102
        Lff:
            java.lang.String r12 = ""
            goto L10a
        L102:
            java.lang.String r0 = r1.b()
            java.lang.String r12 = r0.substring(r12, r4)
        L10a:
            boolean r0 = og.m.t0(r12)
            if (r0 != 0) goto L111
            r2 = r12
        L111:
            if (r2 == 0) goto L114
            goto L129
        L114:
            java.lang.String r12 = "方法没有可导出的 Java 代码: "
            java.lang.String r12 = r12.concat(r3)
            j8.o.A(r12)
        L11d:
            r2 = 0
            goto L129
        L11f:
            java.lang.String r12 = "没有找到方法: "
            java.lang.String r12 = r12.concat(r3)
            j8.o.t(r12)
            goto L11d
        L129:
            return r2
        L12a:
            og.f r12 = (og.f) r12
            r12.getClass()
            og.i r12 = (og.i) r12
            java.lang.String r12 = r12.c()
            r0 = 6
            r1 = 62
            r2 = 0
            int r0 = og.m.q0(r12, r1, r2, r0)
            int r0 = r0 + 1
            java.lang.String r12 = r12.substring(r2, r0)
            java.lang.String r0 = "&"
            java.lang.String r1 = "&amp;"
            java.lang.String r3 = r11.f2546h
            java.lang.String r0 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r1 = "<"
            java.lang.String r3 = "&lt;"
            java.lang.String r0 = og.t.a0(r0, r1, r3, r2)
            java.lang.String r1 = "&gt;"
            java.lang.String r3 = ">"
            java.lang.String r0 = og.t.a0(r0, r3, r1, r2)
            java.lang.String r1 = "</"
            java.lang.String r2 = r11.f2547i
            java.lang.String r12 = bc.e.v(r12, r0, r1, r2, r3)
            return r12
        L166:
            java.lang.String r0 = r11.f2547i
            j8.p r12 = (j8.p) r12
            java.lang.String r1 = r11.f2546h
            boolean r12 = h.Hchat.hooks.items.script.ScriptWaBridge.I(r1, r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L175:
            java.lang.String r0 = r11.f2547i
            j8.p r12 = (j8.p) r12
            java.lang.String r1 = r11.f2546h
            boolean r12 = h.Hchat.hooks.items.script.ScriptWaBridge.i(r1, r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L184:
            java.lang.String r0 = r11.f2547i
            j8.p r12 = (j8.p) r12
            java.lang.String r1 = r11.f2546h
            boolean r12 = h.Hchat.hooks.items.script.ScriptWaBridge.G(r1, r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L193:
            java.lang.String r0 = r11.f2547i
            j8.p r12 = (j8.p) r12
            java.lang.String r1 = r11.f2546h
            boolean r12 = h.Hchat.hooks.items.script.ScriptWaBridge.e(r1, r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L1a2:
            java.lang.String r0 = r11.f2547i
            j8.p r12 = (j8.p) r12
            java.lang.String r1 = r11.f2546h
            boolean r12 = h.Hchat.hooks.items.script.ScriptWaBridge.x(r1, r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L1b1:
            java.lang.String r0 = r11.f2547i
            j8.p r12 = (j8.p) r12
            java.lang.String r1 = r11.f2546h
            boolean r12 = h.Hchat.hooks.items.script.ScriptWaBridge.a(r1, r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L1c0:
            java.lang.String r0 = r11.f2547i
            j8.p r12 = (j8.p) r12
            java.lang.String r1 = r11.f2546h
            boolean r12 = h.Hchat.hooks.items.script.ScriptWaBridge.t(r1, r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L1cf:
            eb.j r12 = (eb.j) r12
            r12.getClass()
            java.lang.String r0 = r12.f2560a
            java.lang.String r1 = r11.f2546h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f0
            java.lang.String r0 = r11.f2547i
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L1ee
            java.lang.String r12 = r12.f2562c
            boolean r12 = gg.l.a(r12, r0)
            if (r12 == 0) goto L1f0
        L1ee:
            r12 = 1
            goto L1f1
        L1f0:
            r12 = 0
        L1f1:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
    }
}
