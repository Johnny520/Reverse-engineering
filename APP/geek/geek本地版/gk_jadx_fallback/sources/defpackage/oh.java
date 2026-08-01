package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh implements defpackage.a0, defpackage.wm {
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ oh(java.lang.Object r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.wm
    public java.lang.Object e(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            java.lang.Object r0 = r11.a
            java.util.List r0 = (java.util.List) r0
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.String r1 = "$this$DelimitedRangesSequence"
            defpackage.ip.o(r1, r12)
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L4d
            int r1 = r0.size()
            if (r1 == 0) goto L45
            if (r1 != r3) goto L3d
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 4
            int r12 = defpackage.b50.G(r12, r0, r13, r2, r1)
            if (r12 >= 0) goto L32
        L2f:
            r13 = r4
            goto Lcb
        L32:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            kx r13 = new kx
            r13.<init>(r12, r0)
            goto Lcb
        L3d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "List has more than one element."
            r12.<init>(r13)
            throw r12
        L45:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "List is empty."
            r12.<init>(r13)
            throw r12
        L4d:
            hp r1 = new hp
            if (r13 >= 0) goto L52
            r13 = r2
        L52:
            int r2 = r12.length()
            r1.<init>(r13, r2, r3)
            boolean r2 = r12 instanceof java.lang.String
            r10 = 0
            int r1 = r1.b
            if (r2 == 0) goto L98
            if (r13 <= r1) goto L63
            goto L2f
        L63:
            r6 = r13
        L64:
            java.util.Iterator r13 = r0.iterator()
        L68:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r13.next()
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r9 = r12
            java.lang.String r9 = (java.lang.String) r9
            int r7 = r8.length()
            r5 = 0
            boolean r3 = defpackage.b50.J(r5, r6, r7, r8, r9, r10)
            if (r3 == 0) goto L68
            goto L85
        L84:
            r2 = r4
        L85:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L93
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            kx r13 = new kx
            r13.<init>(r12, r2)
            goto Lcb
        L93:
            if (r6 == r1) goto L2f
            int r6 = r6 + 1
            goto L64
        L98:
            if (r13 <= r1) goto L9b
            goto L2f
        L9b:
            java.util.Iterator r2 = r0.iterator()
        L9f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r2.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.length()
            boolean r5 = defpackage.b50.K(r5, r12, r13, r6, r10)
            if (r5 == 0) goto L9f
            goto Lb8
        Lb7:
            r3 = r4
        Lb8:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lc6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            kx r13 = new kx
            r13.<init>(r12, r3)
            goto Lcb
        Lc6:
            if (r13 == r1) goto L2f
            int r13 = r13 + 1
            goto L9b
        Lcb:
            if (r13 == 0) goto Le1
            java.lang.Object r12 = r13.a
            java.lang.Object r13 = r13.b
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            kx r0 = new kx
            r0.<init>(r12, r13)
            return r0
        Le1:
            return r4
    }
}
