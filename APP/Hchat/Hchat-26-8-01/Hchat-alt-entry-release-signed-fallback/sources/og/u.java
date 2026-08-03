package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f9839h;

    public /* synthetic */ u(int r1, java.util.List r2) {
            r0 = this;
            r0.f9838g = r1
            r0.f9839h = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f9838g
            switch(r0) {
                case 0: goto L77;
                default: goto L5;
            }
        L5:
            java.lang.String r11 = (java.lang.String) r11
            java.util.List r12 = (java.util.List) r12
            r11.getClass()
            if (r12 != 0) goto L10
            tf.t r12 = tf.t.f13167g
        L10:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L19:
            boolean r0 = r12.hasNext()
            java.util.List r1 = r10.f9839h
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r12.next()
            r2 = r0
            okhttp3.Cookie r2 = (okhttp3.Cookie) r2
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L2f
            goto L6a
        L2f:
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r1.next()
            okhttp3.Cookie r3 = (okhttp3.Cookie) r3
            java.lang.String r4 = r3.name()
            java.lang.String r5 = r2.name()
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L33
            java.lang.String r4 = r3.domain()
            java.lang.String r5 = r2.domain()
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L33
            java.lang.String r3 = r3.path()
            java.lang.String r4 = r2.path()
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L33
            goto L19
        L6a:
            r11.add(r0)
            goto L19
        L6e:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r11)
            r12.addAll(r1)
            return r12
        L77:
            r4 = r11
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r4.getClass()
            java.util.List r12 = r10.f9839h
            int r0 = r12.size()
            r1 = 0
            r2 = 1
            r8 = 0
            if (r0 != r2) goto La9
            java.lang.Object r12 = tf.m.H1(r12)
            java.lang.String r12 = (java.lang.String) r12
            r0 = 4
            int r11 = og.m.r0(r4, r12, r11, r1, r0)
            if (r11 >= 0) goto L9e
        L9b:
            r0 = r8
            goto L131
        L9e:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            sf.e r0 = new sf.e
            r0.<init>(r11, r12)
            goto L131
        La9:
            lg.d r0 = new lg.d
            if (r11 >= 0) goto Lae
            r11 = r1
        Lae:
            int r3 = r4.length()
            r0.<init>(r11, r3, r2)
            boolean r2 = r4 instanceof java.lang.String
            int r9 = r0.f8044i
            int r0 = r0.f8043h
            if (r2 == 0) goto Lf7
            if (r9 <= 0) goto Lc1
            if (r11 <= r0) goto Lc5
        Lc1:
            if (r9 >= 0) goto L9b
            if (r0 > r11) goto L9b
        Lc5:
            java.util.Iterator r2 = r12.iterator()
        Lc9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le4
            java.lang.Object r3 = r2.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r5.length()
            boolean r5 = r5.regionMatches(r1, r6, r11, r7)
            if (r5 == 0) goto Lc9
            goto Le5
        Le4:
            r3 = r8
        Le5:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lf3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            sf.e r0 = new sf.e
            r0.<init>(r11, r3)
            goto L131
        Lf3:
            if (r11 == r0) goto L9b
            int r11 = r11 + r9
            goto Lc5
        Lf7:
            if (r9 <= 0) goto Lfb
            if (r11 <= r0) goto Lff
        Lfb:
            if (r9 >= 0) goto L9b
            if (r0 > r11) goto L9b
        Lff:
            r5 = r11
        L100:
            java.util.Iterator r11 = r12.iterator()
        L104:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L11e
            java.lang.Object r1 = r11.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r7 = 0
            boolean r2 = og.m.z0(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L104
            goto L11f
        L11e:
            r1 = r8
        L11f:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L12d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            sf.e r0 = new sf.e
            r0.<init>(r11, r1)
            goto L131
        L12d:
            if (r5 == r0) goto L9b
            int r5 = r5 + r9
            goto L100
        L131:
            if (r0 == 0) goto L146
            java.lang.Object r11 = r0.f12418g
            java.lang.Object r12 = r0.f12419h
            java.lang.String r12 = (java.lang.String) r12
            int r12 = r12.length()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            sf.e r8 = new sf.e
            r8.<init>(r11, r12)
        L146:
            return r8
    }
}
