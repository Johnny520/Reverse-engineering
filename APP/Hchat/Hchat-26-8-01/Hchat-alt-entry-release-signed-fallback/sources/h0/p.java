package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf.g f4960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f4961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.t f4962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2.b f4963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yg.b f4964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.view.textclassifier.TextClassifier f4965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.j1 f4966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f4967h;

    public p(wf.g r1, android.content.Context r2, h0.t r3, p2.b r4) {
            r0 = this;
            r0.<init>()
            r0.f4960a = r1
            r0.f4961b = r2
            r0.f4962c = r3
            r0.f4963d = r4
            yg.b r1 = new yg.b
            r1.<init>()
            r0.f4964e = r1
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f4966g = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f4967h = r1
            return
    }

    public static final java.lang.Object a(h0.p r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, yf.c r21) {
            r0 = r16
            r1 = r21
            yg.b r2 = r0.f4964e
            i0.j1 r3 = r0.f4966g
            boolean r4 = r1 instanceof h0.m
            if (r4 == 0) goto L1b
            r4 = r1
            h0.m r4 = (h0.m) r4
            int r5 = r4.f4941m
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f4941m = r5
            goto L20
        L1b:
            h0.m r4 = new h0.m
            r4.<init>(r0, r1)
        L20:
            java.lang.Object r1 = r4.f4939k
            int r5 = r4.f4941m
            sf.n r6 = sf.n.f12433a
            r7 = 2
            r8 = 1
            r9 = 0
            xf.a r10 = xf.a.f21579g
            if (r5 == 0) goto L54
            if (r5 == r8) goto L46
            if (r5 != r7) goto L40
            long r7 = r4.f4938j
            yg.b r2 = r4.f4937i
            java.lang.Object r0 = r4.f4936h
            android.view.textclassifier.TextClassification r0 = (android.view.textclassifier.TextClassification) r0
            java.lang.CharSequence r4 = r4.f4935g
            f8.i.I0(r1)
            goto Ld3
        L40:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            return r9
        L46:
            long r11 = r4.f4938j
            yg.b r5 = r4.f4937i
            java.lang.Object r13 = r4.f4936h
            android.view.textclassifier.TextClassifier r13 = (android.view.textclassifier.TextClassifier) r13
            java.lang.CharSequence r14 = r4.f4935g
            f8.i.I0(r1)
            goto L72
        L54:
            f8.i.I0(r1)
            r1 = r17
            r4.f4935g = r1
            r5 = r20
            r4.f4936h = r5
            r4.f4937i = r2
            r11 = r18
            r4.f4938j = r11
            r4.f4941m = r8
            java.lang.Object r13 = r2.d(r4)
            if (r13 != r10) goto L6f
            r15 = r10
            goto Ld0
        L6f:
            r14 = r1
            r13 = r5
            r5 = r2
        L72:
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> Le6
            h0.r0 r1 = (h0.r0) r1     // Catch: java.lang.Throwable -> Le6
            if (r1 == 0) goto L9c
            i0.m2 r15 = h0.r.f4973a     // Catch: java.lang.Throwable -> L99
            r15 = r10
            long r9 = r1.f4976b     // Catch: java.lang.Throwable -> L99
            boolean r9 = i2.m0.b(r11, r9)     // Catch: java.lang.Throwable -> L99
            if (r9 == 0) goto L8f
            java.lang.CharSequence r1 = r1.f4975a     // Catch: java.lang.Throwable -> L99
            boolean r1 = gg.l.a(r14, r1)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L8f
            r1 = r8
            goto L90
        L8f:
            r1 = 0
        L90:
            if (r1 != r8) goto L97
            r1 = 0
            r5.f(r1)
            return r6
        L97:
            r1 = 0
            goto L9e
        L99:
            r0 = move-exception
            r1 = 0
            goto Le8
        L9c:
            r15 = r10
            r1 = r9
        L9e:
            r5.f(r1)
            b0.b0.s()
            int r1 = i2.m0.f(r11)
            int r5 = i2.m0.e(r11)
            android.view.textclassifier.TextClassification$Request$Builder r1 = b0.b0.g(r14, r1, r5)
            android.os.LocaleList r0 = r0.b()
            android.view.textclassifier.TextClassification$Request$Builder r0 = b0.b0.f(r1, r0)
            android.view.textclassifier.TextClassification$Request r0 = b0.b0.h(r0)
            android.view.textclassifier.TextClassification r0 = b0.b0.i(r13, r0)
            r4.f4935g = r14
            r4.f4936h = r0
            r4.f4937i = r2
            r4.f4938j = r11
            r4.f4941m = r7
            java.lang.Object r1 = r2.d(r4)
            if (r1 != r15) goto Ld1
        Ld0:
            return r15
        Ld1:
            r7 = r11
            r4 = r14
        Ld3:
            h0.r0 r1 = new h0.r0     // Catch: java.lang.Throwable -> Le0
            r1.<init>(r4, r7, r0)     // Catch: java.lang.Throwable -> Le0
            r3.setValue(r1)     // Catch: java.lang.Throwable -> Le0
            r1 = 0
            r2.f(r1)
            return r6
        Le0:
            r0 = move-exception
            r1 = 0
            r2.f(r1)
            throw r0
        Le6:
            r0 = move-exception
            r1 = r9
        Le8:
            r5.f(r1)
            throw r0
    }

    public final android.os.LocaleList b() {
            r4 = this;
            r0 = 0
            p2.b r1 = r4.f4963d
            if (r1 == 0) goto L3b
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r1)
            r2.<init>(r3)
            java.lang.Object r1 = r1.f10087g
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r1.next()
            p2.a r3 = (p2.a) r3
            java.util.Locale r3 = r3.f10085a
            r2.add(r3)
            goto L14
        L26:
            java.util.Locale[] r0 = new java.util.Locale[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.util.Locale[] r0 = (java.util.Locale[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.util.Locale[] r0 = (java.util.Locale[]) r0
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r0)
            return r1
        L3b:
            android.os.LocaleList r1 = new android.os.LocaleList
            b5.c r2 = p2.c.f10089a
            p2.b r2 = r2.r()
            java.lang.Object r2 = r2.f10087g
            java.lang.Object r0 = r2.get(r0)
            p2.a r0 = (p2.a) r0
            java.util.Locale r0 = r0.f10085a
            java.util.Locale[] r0 = new java.util.Locale[]{r0}
            r1.<init>(r0)
            return r1
    }
}
