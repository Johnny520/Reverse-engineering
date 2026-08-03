package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o5.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o5.c f7198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a.a f7199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Iterable f7201p;

    public f(k5.g r2, androidx.lifecycle.x r3, int r4, o5.m r5, o5.c r6) {
            r1 = this;
            r0 = 0
            r1.f7195j = r0
            r1.f7201p = r2
            r1.f7200o = r5
            r1.f7198m = r6
            r1.<init>(r3, r4)
            return
    }

    public f(k5.i r2, androidx.lifecycle.x r3, int r4, o5.c r5, o5.c r6) {
            r1 = this;
            r0 = 1
            r1.f7195j = r0
            r1.f7201p = r2
            r1.f7198m = r5
            r1.f7200o = r6
            r1.<init>(r3, r4)
            return
    }

    @Override // o5.t
    public final java.lang.Object a(a5.a r11) {
            r10 = this;
            int r0 = r10.f7195j
            switch(r0) {
                case 0: goto L5f;
                default: goto L5;
            }
        L5:
            java.lang.Iterable r0 = r10.f7201p
            k5.i r0 = (k5.i) r0
            k5.o r4 = r0.f7224l
        Lb:
            int r1 = r10.f7196k
            int r1 = r1 + 1
            r10.f7196k = r1
            int r2 = r4.f7252s
            if (r1 <= r2) goto L1e
            int r11 = r11.f56h
            r4.f7249p = r11
            r11 = 3
            r10.f9546g = r11
            r11 = 0
            goto L5e
        L1e:
            java.util.Iterator r1 = r0.f7222j
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r1.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L2c:
            r8 = r1
            goto L30
        L2e:
            r1 = 7
            goto L2c
        L30:
            k5.z r1 = new k5.z
            k5.u r2 = r4.f7243j
            int r5 = r10.f7197l
            java.lang.Object r3 = r10.f7200o
            r7 = r3
            o5.c r7 = (o5.c) r7
            o5.c r6 = r10.f7198m
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            a.a r11 = r10.f7199n
            z5.b r11 = (z5.b) r11
            z5.b r2 = z5.b.i1(r1)
            r10.f7199n = r2
            int r5 = r1.f7309q
            r10.f7197l = r5
            boolean r5 = r0.f7223k
            if (r5 == 0) goto L5d
            if (r11 == 0) goto L5d
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L5d
            r11 = r3
            goto Lb
        L5d:
            r11 = r1
        L5e:
            return r11
        L5f:
            r3 = r11
            java.lang.Iterable r11 = r10.f7201p
            k5.g r11 = (k5.g) r11
            k5.o r5 = r11.f7210l
        L66:
            int r0 = r10.f7196k
            int r0 = r0 + 1
            r10.f7196k = r0
            int r1 = r5.f7250q
            if (r0 <= r1) goto L79
            int r11 = r3.f56h
            r5.f7247n = r11
            r11 = 3
            r10.f9546g = r11
            r11 = 0
            goto Lb9
        L79:
            java.util.Iterator r0 = r11.f7208j
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L87:
            r9 = r0
            goto L8b
        L89:
            r0 = 7
            goto L87
        L8b:
            k5.w r2 = new k5.w
            r4 = r3
            k5.u r3 = r5.f7243j
            int r6 = r10.f7197l
            java.lang.Object r0 = r10.f7200o
            r7 = r0
            o5.m r7 = (o5.m) r7
            o5.c r8 = r10.f7198m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r3 = r4
            a.a r0 = r10.f7199n
            z5.a r0 = (z5.a) r0
            z5.a r1 = z5.a.g1(r2)
            r10.f7199n = r1
            int r4 = r2.f7293o
            r10.f7197l = r4
            boolean r4 = r11.f7209k
            if (r4 == 0) goto Lb8
            if (r0 == 0) goto Lb8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb8
            goto L66
        Lb8:
            r11 = r2
        Lb9:
            return r11
    }
}
