package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class aq extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gb.o f15088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gb.h f15089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ qg.t f15091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15098t;

    public aq(android.content.Context r1, gb.o r2, gb.h r3, i0.a1 r4, qg.t r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, wf.c r13) {
            r0 = this;
            r0.f15087i = r1
            r0.f15088j = r2
            r0.f15089k = r3
            r0.f15090l = r4
            r0.f15091m = r5
            r0.f15092n = r6
            r0.f15093o = r7
            r0.f15094p = r8
            r0.f15095q = r9
            r0.f15096r = r10
            r0.f15097s = r11
            r0.f15098t = r12
            r1 = 2
            r0.<init>(r1, r13)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r15, wf.c r16) {
            r14 = this;
            wb.aq r0 = new wb.aq
            i0.a1 r11 = r14.f15097s
            i0.a1 r12 = r14.f15098t
            android.content.Context r1 = r14.f15087i
            gb.o r2 = r14.f15088j
            gb.h r3 = r14.f15089k
            i0.a1 r4 = r14.f15090l
            qg.t r5 = r14.f15091m
            i0.a1 r6 = r14.f15092n
            i0.a1 r7 = r14.f15093o
            i0.a1 r8 = r14.f15094p
            i0.a1 r9 = r14.f15095q
            i0.a1 r10 = r14.f15096r
            r13 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.aq r1 = (wb.aq) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f15086h
            android.content.Context r1 = r11.f15087i
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L16
            if (r0 != r7) goto Lf
            f8.i.I0(r12)
            r2 = r1
            goto L33
        Lf:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            return r12
        L16:
            f8.i.I0(r12)
            xg.e r12 = qg.c0.f11038a
            xg.d r12 = xg.d.f21615i
            r2 = r1
            w.u0 r1 = new w.u0
            gb.h r4 = r11.f15089k
            r6 = 7
            gb.o r3 = r11.f15088j
            r1.<init>(r2, r3, r4, r5, r6)
            r11.f15086h = r7
            java.lang.Object r12 = qg.v.x(r12, r1, r11)
            xf.a r0 = xf.a.f21579g
            if (r12 != r0) goto L33
            return r0
        L33:
            sf.g r12 = (sf.g) r12
            java.lang.Object r12 = r12.f12421g
            i0.a1 r0 = r11.f15090l
            r0.setValue(r5)
            java.lang.Throwable r0 = sf.g.b(r12)
            if (r0 != 0) goto L5a
            gb.o r12 = (gb.o) r12
            i0.a1 r3 = r11.f15092n
            i0.a1 r4 = r11.f15093o
            i0.a1 r5 = r11.f15094p
            i0.a1 r6 = r11.f15095q
            i0.a1 r7 = r11.f15096r
            i0.a1 r8 = r11.f15097s
            i0.a1 r9 = r11.f15098t
            qg.t r10 = r11.f15091m
            r1 = r2
            r2 = r12
            wb.y2.E1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto La1
        L5a:
            boolean r12 = r0 instanceof gb.f
            if (r12 == 0) goto L6e
            r12 = r0
            gb.f r12 = (gb.f) r12
            java.lang.String r12 = r12.f4421g
            java.lang.String r1 = "UPLOADER_BLACKLISTED"
            boolean r12 = gg.l.a(r12, r1)
            if (r12 == 0) goto L6e
            java.lang.String r12 = "当前微信账号已被禁止上传在线插件"
            goto L94
        L6e:
            java.lang.String r12 = r0.getMessage()
            if (r12 == 0) goto L7d
            java.lang.CharSequence r12 = og.m.R0(r12)
            java.lang.String r12 = r12.toString()
            goto L7e
        L7d:
            r12 = r5
        L7e:
            if (r12 == 0) goto L88
            boolean r1 = og.m.t0(r12)
            if (r1 == 0) goto L87
            goto L88
        L87:
            r5 = r12
        L88:
            if (r5 == 0) goto L8c
            r12 = r5
            goto L94
        L8c:
            java.lang.Class r12 = r0.getClass()
            java.lang.String r12 = r12.getSimpleName()
        L94:
            java.lang.String r0 = "读取历史版本失败: "
            java.lang.String r12 = r0.concat(r12)
            android.widget.Toast r12 = android.widget.Toast.makeText(r2, r12, r7)
            r12.show()
        La1:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
