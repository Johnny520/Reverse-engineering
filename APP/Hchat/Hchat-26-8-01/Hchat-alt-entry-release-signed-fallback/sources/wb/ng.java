package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17904k;

    public /* synthetic */ ng(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, int r5) {
            r0 = this;
            r0.f17900g = r5
            r0.f17901h = r1
            r0.f17902i = r2
            r0.f17903j = r3
            r0.f17904k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ ng(i0.a1 r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5) {
            r1 = this;
            r0 = 0
            r1.f17900g = r0
            r1.<init>()
            r1.f17902i = r2
            r1.f17901h = r3
            r1.f17903j = r4
            r1.f17904k = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f17900g
            switch(r0) {
                case 0: goto Lcc;
                case 1: goto La5;
                case 2: goto L7e;
                default: goto L5;
            }
        L5:
            java.util.List r10 = (java.util.List) r10
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r10)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L17:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r10.next()
            wb.s0 r1 = (wb.s0) r1
            java.lang.String r1 = r1.f18970a
            r0.add(r1)
            goto L17
        L29:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L32
            r10.add(r1)
            goto L32
        L49:
            java.util.Set r10 = tf.m.U1(r10)
            i0.a1 r0 = r9.f17902i
            r0.setValue(r10)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            i0.a1 r1 = r9.f17903j
            r1.setValue(r10)
            android.content.SharedPreferences r10 = r9.f17901h
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = wb.ho.D5(r0)
            java.lang.String r1 = "block_at_all_notification_groups"
            android.content.SharedPreferences$Editor r10 = r10.putString(r1, r0)
            r10.apply()
            wb.b r10 = wb.b.f15137a
            i0.a1 r0 = r9.f17904k
            r0.setValue(r10)
        L7b:
            sf.n r10 = sf.n.f12433a
            return r10
        L7e:
            r.h r10 = (r.h) r10
            r10.getClass()
            s0.d r0 = wb.p0.f18251g0
            r1 = 0
            r2 = 3
            r.h.a(r10, r1, r0, r2)
            wb.pa r3 = new wb.pa
            r8 = 3
            android.content.SharedPreferences r4 = r9.f17901h
            i0.a1 r5 = r9.f17902i
            i0.a1 r6 = r9.f17903j
            i0.a1 r7 = r9.f17904k
            r3.<init>(r4, r5, r6, r7, r8)
            s0.d r0 = new s0.d
            r4 = 282755047(0x10da7fe7, float:8.6182903E-29)
            r5 = 1
            r0.<init>(r4, r3, r5)
            r.h.a(r10, r1, r0, r2)
            goto L7b
        La5:
            r.h r10 = (r.h) r10
            r10.getClass()
            s0.d r0 = wb.p0.I5
            r1 = 0
            r2 = 3
            r.h.a(r10, r1, r0, r2)
            wb.pa r3 = new wb.pa
            r8 = 5
            android.content.SharedPreferences r4 = r9.f17901h
            i0.a1 r5 = r9.f17902i
            i0.a1 r6 = r9.f17903j
            i0.a1 r7 = r9.f17904k
            r3.<init>(r4, r5, r6, r7, r8)
            s0.d r0 = new s0.d
            r4 = 2099790647(0x7d284337, float:1.3978706E37)
            r5 = 1
            r0.<init>(r4, r3, r5)
            r.h.a(r10, r1, r0, r2)
            goto L7b
        Lcc:
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r3 = r9.f17902i
            r3.setValue(r6)
            r5 = 0
            r7 = 48
            android.content.SharedPreferences r0 = r9.f17901h
            i0.a1 r1 = r9.f17903j
            i0.a1 r2 = r9.f17904k
            r4 = 0
            wb.ho.J(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L7b
    }
}
