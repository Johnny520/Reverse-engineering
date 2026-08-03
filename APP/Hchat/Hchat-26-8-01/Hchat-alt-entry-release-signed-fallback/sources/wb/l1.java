package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l1 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f17381i;

    public /* synthetic */ l1(fg.l r2, java.util.List r3) {
            r1 = this;
            r0 = 3
            r1.f17379g = r0
            r1.<init>()
            r1.f17381i = r2
            r1.f17380h = r3
            return
    }

    public /* synthetic */ l1(java.util.List r1, fg.l r2, int r3) {
            r0 = this;
            r0.f17379g = r3
            r0.f17380h = r1
            r0.f17381i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f17379g
            switch(r0) {
                case 0: goto La6;
                case 1: goto L83;
                case 2: goto L65;
                case 3: goto L4d;
                case 4: goto L33;
                default: goto L5;
            }
        L5:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.util.List r0 = r6.f17380h
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            r2 = r1
            fb.t0 r2 = (fb.t0) r2
            java.lang.String r2 = r2.f3783a
            boolean r2 = gg.l.a(r2, r7)
            if (r2 == 0) goto L10
            goto L27
        L26:
            r1 = 0
        L27:
            fb.t0 r1 = (fb.t0) r1
            if (r1 == 0) goto L30
            fg.l r7 = r6.f17381i
            r7.invoke(r1)
        L30:
            sf.n r7 = sf.n.f12433a
            return r7
        L33:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.List r0 = r6.f17380h
            java.lang.Object r7 = tf.m.w1(r7, r0)
            wb.dq r7 = (wb.dq) r7
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r7.f15772b
            fg.l r0 = r6.f17381i
            r0.invoke(r7)
        L4a:
            sf.n r7 = sf.n.f12433a
            return r7
        L4d:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.List r0 = r6.f17380h
            java.lang.Object r7 = r0.get(r7)
            wb.s4 r7 = (wb.s4) r7
            wb.t4 r7 = r7.f18986a
            fg.l r0 = r6.f17381i
            r0.invoke(r7)
        L62:
            sf.n r7 = sf.n.f12433a
            return r7
        L65:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.List r0 = r6.f17380h
            java.lang.Object r7 = tf.m.w1(r7, r0)
            wb.bp r7 = (wb.bp) r7
            if (r7 == 0) goto L80
            int r7 = r7.f15271b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            fg.l r0 = r6.f17381i
            r0.invoke(r7)
        L80:
            sf.n r7 = sf.n.f12433a
            return r7
        L83:
            r.h r7 = (r.h) r7
            r7.getClass()
            s0.d r0 = wb.p0.f18314o3
            r1 = 0
            r2 = 3
            r.h.a(r7, r1, r0, r2)
            wb.r1 r0 = new wb.r1
            r3 = 2
            java.util.List r4 = r6.f17380h
            fg.l r5 = r6.f17381i
            r0.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r4 = 322350627(0x1336ae23, float:2.3057486E-27)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r7, r1, r3, r2)
            goto L62
        La6:
            r.h r7 = (r.h) r7
            r7.getClass()
            s0.d r0 = wb.p0.f18306n3
            r1 = 0
            r2 = 3
            r.h.a(r7, r1, r0, r2)
            wb.r1 r0 = new wb.r1
            r3 = 0
            java.util.List r4 = r6.f17380h
            fg.l r5 = r6.f17381i
            r0.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r4 = 1996123040(0x76fa6ba0, float:2.5395647E33)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r7, r1, r3, r2)
            goto L62
    }
}
