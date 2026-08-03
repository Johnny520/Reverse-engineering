package a;

/* JADX INFO: renamed from: a.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0184i0 implements a.H7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f504a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ C0184i0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f504a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.H7
    public final java.lang.Object e(java.lang.Object r17, java.lang.Object r18) {
            r16 = this;
            r0 = r16
            int r1 = r0.f504a
            switch(r1) {
                case 0: goto Lf8;
                default: goto L7;
            }
        L7:
            r4 = r17
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "$this$DelimitedRangesSequence"
            a.C0193i9.e(r4, r2)
            java.lang.Object r2 = r0.b
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            int r2 = r8.size()
            r3 = 0
            r9 = 0
            r5 = 1
            if (r2 != r5) goto L59
            int r2 = r8.size()
            if (r2 == 0) goto L51
            if (r2 != r5) goto L49
            java.lang.Object r2 = r8.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r5 = 4
            int r1 = a.Be.N(r4, r2, r1, r3, r5)
            if (r1 >= 0) goto L3e
        L3b:
            r3 = r9
            goto Le2
        L3e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            a.mc r3 = new a.mc
            r3.<init>(r1, r2)
            goto Le2
        L49:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "List has more than one element."
            r1.<init>(r2)
            throw r1
        L51:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "List is empty."
            r1.<init>(r2)
            throw r1
        L59:
            a.f9 r2 = new a.f9
            if (r1 >= 0) goto L5e
            r1 = r3
        L5e:
            int r3 = r4.length()
            r2.<init>(r1, r3, r5)
            boolean r3 = r4 instanceof java.lang.String
            r15 = 0
            int r2 = r2.b
            if (r3 == 0) goto La5
            if (r1 <= r2) goto L6f
            goto L3b
        L6f:
            r11 = r1
        L70:
            java.util.Iterator r1 = r8.iterator()
        L74:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L90
            java.lang.Object r3 = r1.next()
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            int r12 = r13.length()
            r10 = 0
            boolean r5 = a.Ae.E(r10, r11, r12, r13, r14, r15)
            if (r5 == 0) goto L74
            goto L91
        L90:
            r3 = r9
        L91:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            a.mc r2 = new a.mc
            r2.<init>(r1, r3)
            r3 = r2
            goto Le2
        La0:
            if (r11 == r2) goto L3b
            int r11 = r11 + 1
            goto L70
        La5:
            if (r1 <= r2) goto La8
            goto L3b
        La8:
            r5 = r1
        La9:
            java.util.Iterator r1 = r8.iterator()
        Lad:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lcc
            java.lang.Object r10 = r1.next()
            r3 = r2
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            int r6 = r2.length()
            r7 = r3
            r3 = 0
            r11 = r7
            r7 = r15
            boolean r2 = a.Be.R(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lca
            goto Lce
        Lca:
            r2 = r11
            goto Lad
        Lcc:
            r11 = r2
            r10 = r9
        Lce:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Ldc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            a.mc r3 = new a.mc
            r3.<init>(r1, r10)
            goto Le2
        Ldc:
            if (r5 == r11) goto L3b
            int r5 = r5 + 1
            r2 = r11
            goto La9
        Le2:
            if (r3 == 0) goto Lf7
            B r1 = r3.b
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            a.mc r9 = new a.mc
            A r2 = r3.f578a
            r9.<init>(r2, r1)
        Lf7:
            return r9
        Lf8:
            r1 = r17
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "taskName"
            a.C0193i9.e(r2, r3)
            android.os.Handler r3 = a.C0255m0.b
            a.k0 r4 = new a.k0
            java.lang.Object r5 = r0.b
            android.app.ProgressDialog r5 = (android.app.ProgressDialog) r5
            r6 = 0
            r4.<init>(r5, r1, r2, r6)
            r3.post(r4)
            a.Wf r1 = a.Wf.f330a
            return r1
    }
}
