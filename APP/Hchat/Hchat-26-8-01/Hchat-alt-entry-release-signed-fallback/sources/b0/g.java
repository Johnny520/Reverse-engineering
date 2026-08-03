package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends yf.i implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f366k;

    public /* synthetic */ g(java.lang.Object r1, java.lang.Object r2, wf.c r3, int r4) {
            r0 = this;
            r0.f363h = r4
            r0.f365j = r1
            r0.f366k = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(wf.c r5) {
            r4 = this;
            int r0 = r4.f363h
            switch(r0) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            b0.g r0 = new b0.g
            java.lang.Object r1 = r4.f365j
            i.c r1 = (i.c) r1
            java.lang.Object r2 = r4.f366k
            i0.f1 r2 = (i0.f1) r2
            r3 = 2
            r0.<init>(r1, r2, r5, r3)
            return r0
        L14:
            b0.g r0 = new b0.g
            java.lang.Object r1 = r4.f365j
            d0.c r1 = (d0.c) r1
            java.lang.Object r2 = r4.f366k
            d0.b r2 = (d0.b) r2
            r3 = 1
            r0.<init>(r1, r2, r5, r3)
            return r0
        L23:
            b0.g r0 = new b0.g
            java.lang.Object r1 = r4.f365j
            b0.h r1 = (b0.h) r1
            java.lang.Object r2 = r4.f366k
            d0.d r2 = (d0.d) r2
            r3 = 0
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f363h
            wf.c r2 = (wf.c) r2
            switch(r0) {
                case 0: goto L21;
                case 1: goto L14;
                default: goto L7;
            }
        L7:
            wf.c r2 = r1.create(r2)
            b0.g r2 = (b0.g) r2
            sf.n r0 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
        L14:
            wf.c r2 = r1.create(r2)
            b0.g r2 = (b0.g) r2
            sf.n r0 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
        L21:
            wf.c r2 = r1.create(r2)
            b0.g r2 = (b0.g) r2
            sf.n r0 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f363h
            switch(r0) {
                case 0: goto Laa;
                case 1: goto L67;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r14.f366k
            i0.f1 r0 = (i0.f1) r0
            int r1 = r14.f364i
            r2 = 6
            r3 = 150(0x96, float:2.1E-43)
            r4 = 2
            r5 = 1
            r6 = 0
            xf.a r7 = xf.a.f21579g
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L26
            if (r1 != r4) goto L1e
            f8.i.I0(r15)
            r12 = r14
            goto L64
        L1e:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r7 = 0
            r12 = r14
            goto L66
        L26:
            f8.i.I0(r15)
            r12 = r14
            goto L4a
        L2b:
            f8.i.I0(r15)
            java.lang.Object r15 = r14.f365j
            r8 = r15
            i.c r8 = (i.c) r8
            java.lang.Float r9 = new java.lang.Float
            r15 = 0
            r9.<init>(r15)
            i.l1 r10 = i.d.p(r3, r2, r6)
            r14.f364i = r5
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r15 = i.c.c(r8, r9, r10, r11, r12, r13)
            if (r15 != r7) goto L4a
            goto L66
        L4a:
            float r8 = r0.g()
            i.l1 r10 = i.d.p(r3, r2, r6)
            wb.jj r11 = new wb.jj
            r15 = 4
            r11.<init>(r0, r15)
            r12.f364i = r4
            r9 = 1065353216(0x3f800000, float:1.0)
            r13 = 4
            java.lang.Object r15 = i.d.e(r8, r9, r10, r11, r12, r13)
            if (r15 != r7) goto L64
            goto L66
        L64:
            sf.n r7 = sf.n.f12433a
        L66:
            return r7
        L67:
            r12 = r14
            java.lang.Object r0 = r12.f366k
            d0.b r0 = (d0.b) r0
            java.lang.Object r1 = r12.f365j
            d0.c r1 = (d0.c) r1
            i0.j1 r1 = r1.f1893c
            int r2 = r12.f364i
            r3 = 0
            sf.n r4 = sf.n.f12433a
            r5 = 1
            if (r2 == 0) goto L8a
            if (r2 != r5) goto L83
            f8.i.I0(r15)     // Catch: java.lang.Throwable -> L80
            goto La2
        L80:
            r0 = move-exception
            r15 = r0
            goto La6
        L83:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r4 = 0
            goto La5
        L8a:
            f8.i.I0(r15)
            r1.setValue(r0)     // Catch: java.lang.Throwable -> L80
            r12.f364i = r5     // Catch: java.lang.Throwable -> L80
            sg.c r15 = r0.f1890b     // Catch: java.lang.Throwable -> L80
            java.lang.Object r15 = r15.f(r14)     // Catch: java.lang.Throwable -> L80
            xf.a r0 = xf.a.f21579g
            if (r15 != r0) goto L9d
            goto L9e
        L9d:
            r15 = r4
        L9e:
            if (r15 != r0) goto La2
            r4 = r0
            goto La5
        La2:
            r1.setValue(r3)
        La5:
            return r4
        La6:
            r1.setValue(r3)
            throw r15
        Laa:
            r12 = r14
            java.lang.Object r0 = r12.f365j
            r1 = r0
            b0.h r1 = (b0.h) r1
            w0.s r2 = r1.f371e
            android.view.View r3 = r1.f367a
            int r0 = r12.f364i
            sf.n r4 = sf.n.f12433a
            r5 = 1
            r6 = 0
            if (r0 == 0) goto Lcf
            if (r0 != r5) goto Lc7
            f8.i.I0(r15)     // Catch: java.lang.Throwable -> Lc3
            goto L13c
        Lc3:
            r0 = move-exception
            r15 = r0
            goto L172
        Lc7:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r4 = 0
            goto L171
        Lcf:
            f8.i.I0(r15)
            b0.f r15 = new b0.f
            r15.<init>()
            java.lang.Object r0 = r12.f366k
            d0.d r0 = (d0.d) r0
            b0.e r7 = new b0.e
            b0.b r8 = new b0.b
            r9 = 0
            r8.<init>(r1, r0, r9)
            b0.b r9 = new b0.b
            r10 = 1
            r9.<init>(r1, r0, r10)
            r7.<init>(r15, r8, r9, r3)
            fg.l r0 = r1.f368b
            if (r0 == 0) goto Lfa
            java.lang.Object r0 = r0.invoke(r7)
            b0.e r0 = (b0.e) r0
            if (r0 != 0) goto Lf9
            goto Lfa
        Lf9:
            r7 = r0
        Lfa:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r8 = r3.getHandler()
            if (r8 == 0) goto L109
            android.os.Looper r8 = r8.getLooper()
            goto L10a
        L109:
            r8 = r6
        L10a:
            if (r0 == r8) goto L11c
            ac.l r0 = r1.f375i
            if (r0 != 0) goto L118
            ac.l r0 = new ac.l
            r8 = 1
            r0.<init>(r1, r7, r15, r8)
            r1.f375i = r0
        L118:
            r3.post(r0)
            goto L12a
        L11c:
            b0.x r0 = new b0.x
            r0.<init>(r7)
            android.view.ActionMode r0 = r3.startActionMode(r0, r5)
            if (r0 != 0) goto L128
            goto L171
        L128:
            r1.f374h = r0
        L12a:
            r12.f364i = r5     // Catch: java.lang.Throwable -> Lc3
            sg.c r15 = r15.f361a     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r15 = r15.f(r14)     // Catch: java.lang.Throwable -> Lc3
            xf.a r0 = xf.a.f21579g
            if (r15 != r0) goto L137
            goto L138
        L137:
            r15 = r4
        L138:
            if (r15 != r0) goto L13c
            r4 = r0
            goto L171
        L13c:
            r2.a()
            android.os.Looper r15 = android.os.Looper.myLooper()
            android.os.Handler r0 = r3.getHandler()
            if (r0 == 0) goto L14e
            android.os.Looper r0 = r0.getLooper()
            goto L14f
        L14e:
            r0 = r6
        L14f:
            if (r15 == r0) goto L161
            java.lang.Runnable r15 = r1.f376j
            if (r15 != 0) goto L15d
            a1.a r15 = new a1.a
            r0 = 3
            r15.<init>(r1, r0)
            r1.f376j = r15
        L15d:
            r3.post(r15)
            goto L168
        L161:
            android.view.ActionMode r15 = r1.f374h
            if (r15 == 0) goto L168
            r15.finish()
        L168:
            ac.l r15 = r1.f375i
            if (r15 == 0) goto L16f
            r3.removeCallbacks(r15)
        L16f:
            r1.f374h = r6
        L171:
            return r4
        L172:
            r2.a()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r2 = r3.getHandler()
            if (r2 == 0) goto L184
            android.os.Looper r2 = r2.getLooper()
            goto L185
        L184:
            r2 = r6
        L185:
            if (r0 == r2) goto L197
            java.lang.Runnable r0 = r1.f376j
            if (r0 != 0) goto L193
            a1.a r0 = new a1.a
            r2 = 3
            r0.<init>(r1, r2)
            r1.f376j = r0
        L193:
            r3.post(r0)
            goto L19e
        L197:
            android.view.ActionMode r0 = r1.f374h
            if (r0 == 0) goto L19e
            r0.finish()
        L19e:
            ac.l r0 = r1.f375i
            if (r0 == 0) goto L1a5
            r3.removeCallbacks(r0)
        L1a5:
            r1.f374h = r6
            throw r15
    }
}
