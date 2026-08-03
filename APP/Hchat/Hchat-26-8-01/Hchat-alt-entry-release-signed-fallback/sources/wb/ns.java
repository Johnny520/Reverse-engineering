package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.j1 f17979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f17980i;

    public /* synthetic */ ns(android.content.Context r1, i0.j1 r2, int r3) {
            r0 = this;
            r0.f17978g = r3
            r0.f17980i = r1
            r0.f17979h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ns(i0.j1 r2, android.content.Context r3) {
            r1 = this;
            r0 = 1
            r1.f17978g = r0
            r1.<init>()
            r1.f17979h = r2
            r1.f17980i = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f17978g
            sf.n r1 = sf.n.f12433a
            i0.j1 r2 = r10.f17979h
            android.content.Context r3 = r10.f17980i
            switch(r0) {
                case 0: goto Lf0;
                case 1: goto L95;
                default: goto Lb;
            }
        Lb:
            java.util.List r11 = (java.util.List) r11
            r11.getClass()
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = tf.m.F1(r0, r11)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r0.next()
            r7 = r6
            fb.a r7 = (fb.a) r7
            java.lang.String r8 = r7.f3390e
            boolean r9 = og.m.t0(r8)
            if (r9 == 0) goto L3f
            java.lang.String r8 = r7.f3387b
        L3f:
            boolean r7 = r4.add(r8)
            if (r7 == 0) goto L28
            r5.add(r6)
            goto L28
        L49:
            r0 = 12
            java.util.List r0 = tf.m.L1(r0, r5)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()
            fb.a r6 = (fb.a) r6
            java.lang.String r6 = r6.f3387b
            r4.add(r6)
            goto L58
        L6a:
            fb.g1 r5 = fb.g1.f3523a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r11 = r11.iterator()
        L75:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L8e
            java.lang.Object r6 = r11.next()
            r7 = r6
            fb.a r7 = (fb.a) r7
            java.lang.String r7 = r7.f3387b
            boolean r7 = r4.contains(r7)
            if (r7 != 0) goto L75
            r5.add(r6)
            goto L75
        L8e:
            fb.g1.b(r3, r5)
            r2.setValue(r0)
            return r1
        L95:
            java.lang.Long r11 = (java.lang.Long) r11
            long r4 = r11.longValue()
            java.lang.Object r11 = r2.getValue()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        La5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r11.next()
            r6 = r0
            wb.rt r6 = (wb.rt) r6
            long r6 = r6.f18955a
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto La5
            goto Lba
        Lb9:
            r0 = 0
        Lba:
            wb.rt r0 = (wb.rt) r0
            if (r0 == 0) goto Lc5
            fb.g1 r11 = fb.g1.f3523a
            java.util.List r11 = r0.f18957c
            fb.g1.b(r3, r11)
        Lc5:
            java.lang.Object r11 = r2.getValue()
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        Ld4:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto Lec
            java.lang.Object r3 = r11.next()
            r6 = r3
            wb.rt r6 = (wb.rt) r6
            long r6 = r6.f18955a
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto Le8
            goto Ld4
        Le8:
            r0.add(r3)
            goto Ld4
        Lec:
            r2.setValue(r0)
            return r1
        Lf0:
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L104:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L11d
            java.lang.Object r5 = r0.next()
            r6 = r5
            fb.a r6 = (fb.a) r6
            java.lang.String r6 = r6.f3387b
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L104
            r4.add(r5)
            goto L104
        L11d:
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L145
            java.lang.Object r6 = r0.next()
            r7 = r6
            fb.a r7 = (fb.a) r7
            java.lang.String r7 = r7.f3387b
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L12c
            r5.add(r6)
            goto L12c
        L145:
            r2.setValue(r5)
            fb.g1 r11 = fb.g1.f3523a
            fb.g1.b(r3, r4)
            return r1
    }
}
