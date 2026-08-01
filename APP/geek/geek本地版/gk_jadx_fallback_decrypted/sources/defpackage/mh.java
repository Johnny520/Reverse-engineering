package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh implements android.view.View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ mh(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L113;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.b
            android.view.View r0 = (android.view.View) r0
            r1 = 2115043329(0x7e110001, float:4.818452E37)
            java.lang.Object r2 = r10.getTag(r1)
            boolean r3 = r2 instanceof defpackage.h40
            r4 = 0
            if (r3 == 0) goto L18
            h40 r2 = (defpackage.h40) r2
            goto L19
        L18:
            r2 = r4
        L19:
            qh r3 = defpackage.h40.n
            if (r2 != 0) goto L25
            h40 r2 = new h40
            r2.<init>(r10, r3)
            r10.setTag(r1, r2)
        L25:
            r1 = 2115043330(0x7e110002, float:4.8184525E37)
            java.lang.Object r5 = r10.getTag(r1)
            boolean r6 = r5 instanceof defpackage.h40
            if (r6 == 0) goto L33
            h40 r5 = (defpackage.h40) r5
            goto L34
        L33:
            r5 = r4
        L34:
            qh r6 = defpackage.h40.o
            if (r5 != 0) goto L40
            h40 r5 = new h40
            r5.<init>(r10, r6)
            r10.setTag(r1, r5)
        L40:
            if (r0 == 0) goto L5c
            r1 = 2115043331(0x7e110003, float:4.818453E37)
            java.lang.Object r7 = r0.getTag(r1)
            boolean r8 = r7 instanceof defpackage.h40
            if (r8 == 0) goto L50
            h40 r7 = (defpackage.h40) r7
            goto L51
        L50:
            r7 = r4
        L51:
            if (r7 != 0) goto L5d
            h40 r7 = new h40
            r7.<init>(r0, r3)
            r0.setTag(r1, r7)
            goto L5d
        L5c:
            r7 = r4
        L5d:
            if (r0 == 0) goto L78
            r1 = 2115043332(0x7e110004, float:4.8184535E37)
            java.lang.Object r3 = r0.getTag(r1)
            boolean r8 = r3 instanceof defpackage.h40
            if (r8 == 0) goto L6d
            r4 = r3
            h40 r4 = (defpackage.h40) r4
        L6d:
            if (r4 != 0) goto L78
            h40 r3 = new h40
            r3.<init>(r0, r6)
            r0.setTag(r1, r3)
            r4 = r3
        L78:
            gn r0 = defpackage.gn.a
            java.lang.String r1 = "WJBki2f434xcmEK2ZOX0jlqXb7Vx/sSW\n"
            java.lang.String r3 = "M/Ud1AWXq/g=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r3)
            r0.getClass()
            r0 = 1
            boolean r1 = defpackage.gn.a(r1, r0)
            int r3 = r11.getActionMasked()
            if (r3 == 0) goto Ld5
            if (r3 == r0) goto L97
            r6 = 3
            if (r3 == r6) goto L97
            goto L111
        L97:
            if (r1 == 0) goto La3
            int r11 = r11.getActionMasked()
            if (r11 != r0) goto La3
            r11 = 2
            defpackage.gn.i(r10, r11)
        La3:
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1128792064(0x43480000, float:200.0)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            i40 r1 = defpackage.z30.f(r10, r11, r0)
            r2.j = r1
            i40 r0 = defpackage.z30.f(r10, r11, r0)
            r5.j = r0
            r2.h()
            r5.h()
            r0 = 1048576000(0x3e800000, float:0.25)
            if (r7 == 0) goto Lc9
            i40 r1 = defpackage.z30.f(r10, r11, r0)
            r7.j = r1
            r7.h()
        Lc9:
            if (r4 == 0) goto L111
            i40 r10 = defpackage.z30.f(r10, r11, r0)
            r4.j = r10
            r4.h()
            goto L111
        Ld5:
            if (r1 == 0) goto Lda
            defpackage.gn.i(r10, r0)
        Lda:
            r10 = 1064011039(0x3f6b851f, float:0.92)
            r11 = 1153138688(0x44bb8000, float:1500.0)
            r0 = 1060320051(0x3f333333, float:0.7)
            i40 r1 = defpackage.z30.f(r10, r11, r0)
            r2.j = r1
            i40 r10 = defpackage.z30.f(r10, r11, r0)
            r5.j = r10
            r2.h()
            r5.h()
            r10 = 1058642330(0x3f19999a, float:0.6)
            r0 = 1062836634(0x3f59999a, float:0.85)
            if (r7 == 0) goto L106
            i40 r1 = defpackage.z30.f(r0, r11, r10)
            r7.j = r1
            r7.h()
        L106:
            if (r4 == 0) goto L111
            i40 r10 = defpackage.z30.f(r0, r11, r10)
            r4.j = r10
            r4.h()
        L111:
            r10 = 0
            return r10
        L113:
            java.lang.Object r10 = r9.b
            ph r10 = (defpackage.ph) r10
            int r11 = r11.getAction()
            r0 = 0
            r1 = 1
            if (r11 != r1) goto L13f
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r10.o
            long r2 = r2 - r4
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 < 0) goto L132
            r4 = 300(0x12c, double:1.48E-321)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 <= 0) goto L134
        L132:
            r10.m = r0
        L134:
            r10.t()
            r10.m = r1
            long r1 = java.lang.System.currentTimeMillis()
            r10.o = r1
        L13f:
            return r0
    }
}
