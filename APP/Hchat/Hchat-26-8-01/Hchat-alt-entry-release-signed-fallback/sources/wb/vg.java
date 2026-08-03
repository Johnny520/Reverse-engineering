package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f19709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ db.c f19710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19711j;

    public /* synthetic */ vg(int r2, db.c r3, fg.l r4) {
            r1 = this;
            r0 = 1
            r1.f19708g = r0
            r1.<init>()
            r1.f19709h = r4
            r1.f19710i = r3
            r1.f19711j = r2
            return
    }

    public /* synthetic */ vg(boolean r1, fg.l r2, db.c r3, int r4) {
            r0 = this;
            r1 = 0
            r0.f19708g = r1
            r0.<init>()
            r0.f19709h = r2
            r0.f19710i = r3
            r0.f19711j = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r29) {
            r28 = this;
            r0 = r28
            int r1 = r0.f19708g
            switch(r1) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            r1 = r29
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            db.c r2 = r0.f19710i
            int r3 = r0.f19711j
            db.c r1 = wb.ho.m7(r2, r3, r1)
            fg.l r2 = r0.f19709h
            r2.invoke(r1)
        L1b:
            sf.n r1 = sf.n.f12433a
            return r1
        L1e:
            r1 = r29
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            r2 = 0
            if (r1 == 0) goto L33
            int r1 = r1.intValue()
            goto L34
        L33:
            r1 = r2
        L34:
            db.c r3 = r0.f19710i
            java.util.ArrayList r4 = wb.ho.T6(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            int r4 = r0.f19711j
            if (r4 < 0) goto La3
            int r6 = r5.size()
            if (r4 >= r6) goto La3
            java.lang.Object r6 = r5.get(r4)
            db.a r6 = (db.a) r6
            int r7 = r6.f2166a
            r8 = 1
            if (r7 == r1) goto L6c
            r9 = 6
            if (r7 == 0) goto L5c
            if (r7 != r9) goto L5a
            goto L5c
        L5a:
            r10 = r2
            goto L5d
        L5c:
            r10 = r8
        L5d:
            if (r1 == 0) goto L64
            if (r1 != r9) goto L62
            goto L64
        L62:
            r9 = r2
            goto L65
        L64:
            r9 = r8
        L65:
            if (r10 != r9) goto L6d
            r9 = 7
            if (r7 == r9) goto L6d
            if (r1 == r9) goto L6d
        L6c:
            r2 = r8
        L6d:
            db.a r7 = new db.a
            if (r2 == 0) goto L74
            java.lang.String r2 = r6.f2167b
            goto L76
        L74:
            java.lang.String r2 = ""
        L76:
            r7.<init>(r1, r2)
            r5.set(r4, r7)
            r26 = 0
            r27 = 3670015(0x37ffff, float:5.142786E-39)
            r4 = 0
            r24 = r5
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            db.c r3 = db.c.a(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        La3:
            fg.l r1 = r0.f19709h
            r1.invoke(r3)
            goto L1b
    }
}
