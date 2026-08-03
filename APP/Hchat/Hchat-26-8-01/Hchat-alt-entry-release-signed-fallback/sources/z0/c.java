package z0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z0.i implements d1.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xe.e f22478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f2.s f22479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y1.t f22480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g2.b f22481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f22482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.graphics.Rect f22483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.view.autofill.AutofillId f22484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.x f22485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22486o;

    public c(xe.e r1, f2.s r2, y1.t r3, g2.b r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f22478g = r1
            r0.f22479h = r2
            r0.f22480i = r3
            r0.f22481j = r4
            r0.f22482k = r5
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f22483l = r1
            r1 = 1
            r3.setImportantForAutofill(r1)
            android.view.autofill.AutofillId r1 = r3.getAutofillId()
            if (r1 == 0) goto L28
            r0.f22484m = r1
            f.x r1 = new f.x
            r1.<init>()
            r0.f22485n = r1
            return
        L28:
            java.lang.String r1 = "Required value was null."
            af.d r1 = wb.en.a(r1)
            throw r1
    }

    @Override // d1.j
    public final void e(d1.b0 r3, d1.b0 r4) {
            r2 = this;
            if (r3 == 0) goto L2d
            x1.f0 r3 = x1.k.w(r3)
            if (r3 == 0) goto L2d
            f2.m r0 = r3.w()
            if (r0 == 0) goto L2d
            f.k0 r0 = r0.f3204g
            f2.x r1 = f2.l.f3184g
            boolean r1 = r0.b(r1)
            if (r1 != 0) goto L20
            f2.x r1 = f2.l.f3185h
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L2d
        L20:
            int r3 = r3.f20890h
            xe.e r0 = r2.f22478g
            java.lang.Object r0 = r0.f21559b
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            y1.t r1 = r2.f22480i
            r0.notifyViewExited(r1, r3)
        L2d:
            if (r4 == 0) goto L5d
            x1.f0 r3 = x1.k.w(r4)
            if (r3 == 0) goto L5d
            f2.m r4 = r3.w()
            if (r4 == 0) goto L5d
            f.k0 r4 = r4.f3204g
            f2.x r0 = f2.l.f3184g
            boolean r0 = r4.b(r0)
            if (r0 != 0) goto L4f
            f2.x r0 = f2.l.f3185h
            boolean r4 = r4.b(r0)
            if (r4 == 0) goto L4e
            goto L4f
        L4e:
            return
        L4f:
            int r3 = r3.f20890h
            g2.b r4 = r2.f22481j
            ac.k r4 = r4.f4147b
            z0.a r0 = new z0.a
            r0.<init>(r2, r3)
            r4.P(r3, r0)
        L5d:
            return
    }
}
