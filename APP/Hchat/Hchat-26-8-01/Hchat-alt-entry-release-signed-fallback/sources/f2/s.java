package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1.f0 f3218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.f f3219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.k f3220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.f0 f3221d;

    public s(x1.f0 r1, f2.f r2, f.w r3) {
            r0 = this;
            r0.<init>()
            r0.f3218a = r1
            r0.f3219b = r2
            r0.f3220c = r3
            f.f0 r1 = new f.f0
            r2 = 2
            r1.<init>(r2)
            r0.f3221d = r1
            return
    }

    public final f2.q a() {
            r5 = this;
            f2.m r0 = new f2.m
            r0.<init>()
            f2.q r1 = new f2.q
            r2 = 0
            f2.f r3 = r5.f3219b
            x1.f0 r4 = r5.f3218a
            r1.<init>(r3, r2, r4, r0)
            return r1
    }

    public final void b(x1.f0 r18, f2.m r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            f.f0 r2 = r0.f3221d
            java.lang.Object[] r3 = r2.f2803a
            int r2 = r2.f2804b
            r4 = 0
            r5 = r4
        Lc:
            if (r5 >= r2) goto L161
            r6 = r3[r5]
            z0.c r6 = (z0.c) r6
            xe.e r7 = r6.f22478g
            java.lang.Object r8 = r7.f21559b
            android.view.autofill.AutofillManager r8 = (android.view.autofill.AutofillManager) r8
            y1.t r9 = r6.f22480i
            f2.m r10 = r18.w()
            r11 = r18
            int r12 = r11.f20890h
            if (r1 == 0) goto L36
            f2.x r14 = f2.u.E
            f.k0 r15 = r1.f3204g
            java.lang.Object r14 = r15.g(r14)
            if (r14 != 0) goto L2f
            r14 = 0
        L2f:
            i2.g r14 = (i2.g) r14
            if (r14 == 0) goto L36
            java.lang.String r14 = r14.f6314h
            goto L37
        L36:
            r14 = 0
        L37:
            if (r10 == 0) goto L4b
            f2.x r15 = f2.u.E
            f.k0 r13 = r10.f3204g
            java.lang.Object r13 = r13.g(r15)
            if (r13 != 0) goto L44
            r13 = 0
        L44:
            i2.g r13 = (i2.g) r13
            if (r13 == 0) goto L4b
            java.lang.String r13 = r13.f6314h
            goto L4c
        L4b:
            r13 = 0
        L4c:
            r15 = 1
            if (r14 == r13) goto L9a
            if (r14 != 0) goto L55
            r7.b(r9, r12, r15)
            goto L9a
        L55:
            if (r13 != 0) goto L5b
            r7.b(r9, r12, r4)
            goto L9a
        L5b:
            f2.x r14 = f2.u.f3240r
            java.lang.Object r14 = f2.t.f(r10, r14)
            z0.d r14 = (z0.d) r14
            z0.d r4 = z0.k.f22492a
            boolean r4 = gg.l.a(r14, r4)
            if (r4 == 0) goto L9a
            int r4 = r13.length()
            r14 = 5000(0x1388, float:7.006E-42)
            if (r4 >= r14) goto L74
            goto L93
        L74:
            r4 = 4999(0x1387, float:7.005E-42)
            char r16 = r13.charAt(r4)
            boolean r16 = java.lang.Character.isHighSurrogate(r16)
            if (r16 == 0) goto L8f
            char r16 = r13.charAt(r14)
            boolean r16 = java.lang.Character.isLowSurrogate(r16)
            if (r16 == 0) goto L8f
            java.lang.String r13 = og.m.P0(r4, r13)
            goto L93
        L8f:
            java.lang.String r13 = og.m.P0(r14, r13)
        L93:
            android.view.autofill.AutofillValue r4 = android.view.autofill.AutofillValue.forText(r13)
            r8.notifyValueChanged(r9, r12, r4)
        L9a:
            if (r1 == 0) goto Laa
            f2.x r4 = f2.u.J
            f.k0 r13 = r1.f3204g
            java.lang.Object r4 = r13.g(r4)
            if (r4 != 0) goto La7
            r4 = 0
        La7:
            h2.a r4 = (h2.a) r4
            goto Lab
        Laa:
            r4 = 0
        Lab:
            if (r10 == 0) goto Lbb
            f2.x r13 = f2.u.J
            f.k0 r14 = r10.f3204g
            java.lang.Object r13 = r14.g(r13)
            if (r13 != 0) goto Lb8
            r13 = 0
        Lb8:
            h2.a r13 = (h2.a) r13
            goto Lbc
        Lbb:
            r13 = 0
        Lbc:
            if (r4 == r13) goto Lf7
            if (r4 != 0) goto Lc4
            r7.b(r9, r12, r15)
            goto Lf7
        Lc4:
            if (r13 != 0) goto Lcb
            r4 = 0
            r7.b(r9, r12, r4)
            goto Lf7
        Lcb:
            f2.x r4 = f2.u.f3240r
            java.lang.Object r4 = f2.t.f(r10, r4)
            z0.d r4 = (z0.d) r4
            z0.d r14 = z0.k.f22493b
            boolean r4 = gg.l.a(r4, r14)
            if (r4 == 0) goto Lf7
            int r4 = r13.ordinal()
            if (r4 == 0) goto Le8
            if (r4 == r15) goto Le5
            r4 = 0
            goto Lea
        Le5:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto Lea
        Le8:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
        Lea:
            if (r4 == 0) goto Lf7
            boolean r4 = r4.booleanValue()
            android.view.autofill.AutofillValue r4 = android.view.autofill.AutofillValue.forToggle(r4)
            r8.notifyValueChanged(r9, r12, r4)
        Lf7:
            if (r1 == 0) goto L107
            f2.x r4 = f2.u.f3241s
            f.k0 r13 = r1.f3204g
            java.lang.Object r4 = r13.g(r4)
            if (r4 != 0) goto L104
            r4 = 0
        L104:
            z0.f r4 = (z0.f) r4
            goto L108
        L107:
            r4 = 0
        L108:
            if (r10 == 0) goto L118
            f2.x r13 = f2.u.f3241s
            f.k0 r14 = r10.f3204g
            java.lang.Object r13 = r14.g(r13)
            if (r13 != 0) goto L115
            r13 = 0
        L115:
            z0.f r13 = (z0.f) r13
            goto L119
        L118:
            r13 = 0
        L119:
            boolean r14 = gg.l.a(r4, r13)
            if (r14 != 0) goto L124
            if (r4 != 0) goto L126
            r7.b(r9, r12, r15)
        L124:
            r4 = 0
            goto L133
        L126:
            if (r13 != 0) goto L12d
            r4 = 0
            r7.b(r9, r12, r4)
            goto L133
        L12d:
            r4 = 0
            android.view.autofill.AutofillValue r7 = r13.f22489a
            r8.notifyValueChanged(r9, r12, r7)
        L133:
            if (r1 == 0) goto L141
            f.k0 r7 = r1.f3204g
            f2.x r8 = f2.u.f3239q
            boolean r7 = r7.b(r8)
            if (r7 != r15) goto L141
            r7 = r15
            goto L142
        L141:
            r7 = r4
        L142:
            if (r10 == 0) goto L14f
            f.k0 r8 = r10.f3204g
            f2.x r9 = f2.u.f3239q
            boolean r8 = r8.b(r9)
            if (r8 != r15) goto L14f
            goto L150
        L14f:
            r15 = r4
        L150:
            if (r7 == r15) goto L15d
            f.x r6 = r6.f22485n
            if (r15 == 0) goto L15a
            r6.a(r12)
            goto L15d
        L15a:
            r6.e(r12)
        L15d:
            int r5 = r5 + 1
            goto Lc
        L161:
            return
    }
}
