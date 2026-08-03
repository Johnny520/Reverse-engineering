package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19136k;

    public /* synthetic */ ss(java.lang.String r2, i0.j1 r3, android.content.Context r4, i0.a1 r5) {
            r1 = this;
            r0 = 0
            r1.f19132g = r0
            r1.<init>()
            r1.f19133h = r2
            r1.f19134i = r3
            r1.f19136k = r4
            r1.f19135j = r5
            return
    }

    public /* synthetic */ ss(java.util.List r2, fg.a r3, android.app.Activity r4, fg.l r5) {
            r1 = this;
            r0 = 1
            r1.f19132g = r0
            r1.<init>()
            r1.f19133h = r2
            r1.f19134i = r3
            r1.f19135j = r4
            r1.f19136k = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            int r1 = r0.f19132g
            switch(r1) {
                case 0: goto L58;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f19133h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f19134i
            r5 = r2
            fg.a r5 = (fg.a) r5
            java.lang.Object r2 = r0.f19135j
            r6 = r2
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r2 = r0.f19136k
            r7 = r2
            fg.l r7 = (fg.l) r7
            r2 = r21
            r.h r2 = (r.h) r2
            r2.getClass()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r8 = r3
        L27:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r1.next()
            int r9 = r8 + 1
            if (r8 < 0) goto L50
            r4 = r3
            sf.e r4 = (sf.e) r4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            wb.fs r3 = new wb.fs
            r3.<init>(r4, r5, r6, r7, r8)
            s0.d r4 = new s0.d
            r8 = 1080710003(0x406a5373, float:3.6613433)
            r11 = 1
            r4.<init>(r8, r3, r11)
            r3 = 2
            r.h.a(r2, r10, r4, r3)
            r8 = r9
            goto L27
        L50:
            a.a.Q0()
            r1 = 0
            throw r1
        L55:
            sf.n r1 = sf.n.f12433a
            return r1
        L58:
            java.lang.Object r1 = r0.f19133h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f19134i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f19136k
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r0.f19135j
            i0.a1 r4 = (i0.a1) r4
            r5 = r21
            java.util.List r5 = (java.util.List) r5
            r5.getClass()
            java.util.Iterator r6 = r5.iterator()
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 != 0) goto L7c
            r7 = r8
            goto La2
        L7c:
            java.lang.Object r7 = r6.next()
            fb.d1 r7 = (fb.d1) r7
            long r9 = r7.f3496n
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
        L88:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La2
            java.lang.Object r9 = r6.next()
            fb.d1 r9 = (fb.d1) r9
            long r9 = r9.f3496n
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            int r10 = r7.compareTo(r9)
            if (r10 >= 0) goto L88
            r7 = r9
            goto L88
        La2:
            if (r7 == 0) goto La9
            long r6 = r7.longValue()
            goto Lad
        La9:
            long r6 = java.lang.System.currentTimeMillis()
        Lad:
            int r9 = r5.size()
            long r9 = (long) r9
            long r6 = r6 + r9
            r9 = 1
            long r6 = r6 + r9
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = tf.n.e1(r5)
            r9.<init>(r10)
            java.util.Iterator r5 = r5.iterator()
            r10 = 0
        Lc4:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto Lec
            java.lang.Object r11 = r5.next()
            int r12 = r10 + 1
            if (r10 < 0) goto Le8
            r13 = r11
            fb.d1 r13 = (fb.d1) r13
            long r10 = (long) r10
            long r17 = r6 - r10
            r19 = 57343(0xdfff, float:8.0355E-41)
            r14 = 0
            r15 = 0
            r16 = 0
            fb.d1 r10 = fb.d1.a(r13, r14, r15, r16, r17, r19)
            r9.add(r10)
            r10 = r12
            goto Lc4
        Le8:
            a.a.Q0()
            throw r8
        Lec:
            java.util.Iterator r5 = r9.iterator()
        Lf0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L106
            java.lang.Object r6 = r5.next()
            r7 = r6
            fb.d1 r7 = (fb.d1) r7
            java.lang.String r7 = r7.f3483a
            boolean r7 = gg.l.a(r7, r1)
            if (r7 == 0) goto Lf0
            r8 = r6
        L106:
            fb.d1 r8 = (fb.d1) r8
            if (r8 == 0) goto L113
            long r5 = r8.f3496n
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2.setValue(r1)
        L113:
            java.lang.Thread r1 = new java.lang.Thread
            r8.b r2 = new r8.b
            r5 = 8
            r2.<init>(r9, r3, r4, r5)
            java.lang.String r3 = "Hchat-Agent-Session-Order"
            r1.<init>(r2, r3)
            r1.start()
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
