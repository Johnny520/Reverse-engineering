package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f17992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17993i;

    public /* synthetic */ o1(fg.l r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f17991g = r3
            r0.f17992h = r1
            r0.f17993i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f17991g
            switch(r0) {
                case 0: goto L110;
                case 1: goto L101;
                case 2: goto Lee;
                case 3: goto Ldf;
                case 4: goto Ld0;
                case 5: goto L90;
                case 6: goto L7f;
                case 7: goto L6e;
                case 8: goto L58;
                case 9: goto L4a;
                case 10: goto L3c;
                case 11: goto L2e;
                case 12: goto L18;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
        L15:
            sf.n r0 = sf.n.f12433a
            return r0
        L18:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L2e:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L3c:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L4a:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L58:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L6e:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L7f:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L90:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        La1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc9
            java.lang.Object r2 = r0.next()
            r3 = r2
            x8.s r3 = (x8.s) r3
            int r4 = r3.f21345b
            r5 = 10
            if (r4 == r5) goto Lc5
            r5 = 11
            if (r4 == r5) goto Lc5
            r5 = 12
            if (r4 != r5) goto Lbd
            goto Lc5
        Lbd:
            java.lang.String r3 = r3.f21346c
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto La1
        Lc5:
            r1.add(r2)
            goto La1
        Lc9:
            fg.l r0 = r6.f17992h
            r0.invoke(r1)
            goto L15
        Ld0:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            x8.b r0 = (x8.b) r0
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        Ldf:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            x8.b r0 = (x8.b) r0
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        Lee:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = wb.ho.X4(r0)
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L101:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
        L110:
            i0.a1 r0 = r6.f17993i
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = tf.m.P1(r0)
            fg.l r1 = r6.f17992h
            r1.invoke(r0)
            goto L15
    }
}
