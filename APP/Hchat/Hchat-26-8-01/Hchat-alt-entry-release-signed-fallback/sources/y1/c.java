package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends y1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static y1.c f21855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static y1.c f21856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static y1.c f21857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t2.j f21858h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t2.j f21859i = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f21861d;

    static {
            t2.j r0 = t2.j.f13012h
            y1.c.f21858h = r0
            t2.j r0 = t2.j.f13011g
            y1.c.f21859i = r0
            return
    }

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f21860c = r1
            r0.<init>()
            return
    }

    @Override // y1.b
    public final int[] a(int r6) {
            r5 = this;
            int r0 = r5.f21860c
            switch(r0) {
                case 0: goto Lcd;
                case 1: goto L6c;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L11
            goto L63
        L11:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            if (r6 < r0) goto L1c
            goto L63
        L1c:
            java.lang.Object r0 = r5.f21861d
            i2.k0 r0 = (i2.k0) r0
            t2.j r2 = y1.c.f21858h
            java.lang.String r3 = "layoutResult"
            if (r6 >= 0) goto L34
            if (r0 == 0) goto L30
            r6 = 0
            i2.o r0 = r0.f6347b
            int r6 = r0.d(r6)
            goto L46
        L30:
            gg.l.g(r3)
            throw r1
        L34:
            if (r0 == 0) goto L68
            i2.o r0 = r0.f6347b
            int r0 = r0.d(r6)
            int r4 = r5.e(r0, r2)
            if (r4 != r6) goto L44
            r6 = r0
            goto L46
        L44:
            int r6 = r0 + 1
        L46:
            java.lang.Object r0 = r5.f21861d
            i2.k0 r0 = (i2.k0) r0
            if (r0 == 0) goto L64
            i2.o r0 = r0.f6347b
            int r0 = r0.f6373f
            if (r6 < r0) goto L53
            goto L63
        L53:
            int r0 = r5.e(r6, r2)
            t2.j r1 = y1.c.f21859i
            int r6 = r5.e(r6, r1)
            int r6 = r6 + 1
            int[] r1 = r5.b(r0, r6)
        L63:
            return r1
        L64:
            gg.l.g(r3)
            throw r1
        L68:
            gg.l.g(r3)
            throw r1
        L6c:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L78
            goto Lc8
        L78:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            if (r6 < r0) goto L83
            goto Lc8
        L83:
            if (r6 >= 0) goto L86
            r6 = 0
        L86:
            boolean r0 = r5.h(r6)
            r2 = -1
            java.lang.String r3 = "impl"
            if (r0 != 0) goto Lb1
            boolean r0 = r5.h(r6)
            if (r0 == 0) goto La0
            if (r6 == 0) goto Lb1
            int r0 = r6 + (-1)
            boolean r0 = r5.h(r0)
            if (r0 != 0) goto La0
            goto Lb1
        La0:
            java.lang.Object r0 = r5.f21861d
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            if (r0 == 0) goto Lad
            int r6 = r0.following(r6)
            if (r6 != r2) goto L86
            goto Lc8
        Lad:
            gg.l.g(r3)
            throw r1
        Lb1:
            java.lang.Object r0 = r5.f21861d
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            if (r0 == 0) goto Lc9
            int r0 = r0.following(r6)
            if (r0 == r2) goto Lc8
            boolean r2 = r5.g(r0)
            if (r2 != 0) goto Lc4
            goto Lc8
        Lc4:
            int[] r1 = r5.b(r6, r0)
        Lc8:
            return r1
        Lc9:
            gg.l.g(r3)
            throw r1
        Lcd:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Ld9
            goto L10c
        Ld9:
            if (r6 < r0) goto Ldc
            goto L10c
        Ldc:
            if (r6 >= 0) goto Ldf
            r6 = 0
        Ldf:
            java.lang.Object r0 = r5.f21861d
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            java.lang.String r2 = "impl"
            if (r0 == 0) goto L111
            boolean r0 = r0.isBoundary(r6)
            java.lang.Object r3 = r5.f21861d
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            r4 = -1
            if (r0 != 0) goto Lff
            if (r3 == 0) goto Lfb
            int r6 = r3.following(r6)
            if (r6 != r4) goto Ldf
            goto L10c
        Lfb:
            gg.l.g(r2)
            throw r1
        Lff:
            if (r3 == 0) goto L10d
            int r0 = r3.following(r6)
            if (r0 != r4) goto L108
            goto L10c
        L108:
            int[] r1 = r5.b(r6, r0)
        L10c:
            return r1
        L10d:
            gg.l.g(r2)
            throw r1
        L111:
            gg.l.g(r2)
            throw r1
    }

    @Override // y1.b
    public final int[] d(int r6) {
            r5 = this;
            int r0 = r5.f21860c
            switch(r0) {
                case 0: goto Lc2;
                case 1: goto L67;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L11
            goto L62
        L11:
            if (r6 > 0) goto L14
            goto L62
        L14:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            java.lang.Object r2 = r5.f21861d
            i2.k0 r2 = (i2.k0) r2
            t2.j r3 = y1.c.f21859i
            java.lang.String r4 = "layoutResult"
            if (r6 <= r0) goto L3b
            if (r2 == 0) goto L37
            java.lang.String r6 = r5.c()
            int r6 = r6.length()
            i2.o r0 = r2.f6347b
            int r6 = r0.d(r6)
            goto L4f
        L37:
            gg.l.g(r4)
            throw r1
        L3b:
            if (r2 == 0) goto L63
            i2.o r0 = r2.f6347b
            int r0 = r0.d(r6)
            int r2 = r5.e(r0, r3)
            int r2 = r2 + 1
            if (r2 != r6) goto L4d
            r6 = r0
            goto L4f
        L4d:
            int r6 = r0 + (-1)
        L4f:
            if (r6 >= 0) goto L52
            goto L62
        L52:
            t2.j r0 = y1.c.f21858h
            int r0 = r5.e(r6, r0)
            int r6 = r5.e(r6, r3)
            int r6 = r6 + 1
            int[] r1 = r5.b(r0, r6)
        L62:
            return r1
        L63:
            gg.l.g(r4)
            throw r1
        L67:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L73
            goto Lbd
        L73:
            if (r6 > 0) goto L76
            goto Lbd
        L76:
            if (r6 <= r0) goto L79
            r6 = r0
        L79:
            r0 = -1
            java.lang.String r2 = "impl"
            if (r6 <= 0) goto L9d
            int r3 = r6 + (-1)
            boolean r3 = r5.h(r3)
            if (r3 != 0) goto L9d
            boolean r3 = r5.g(r6)
            if (r3 != 0) goto L9d
            java.lang.Object r3 = r5.f21861d
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            if (r3 == 0) goto L99
            int r6 = r3.preceding(r6)
            if (r6 != r0) goto L79
            goto Lbd
        L99:
            gg.l.g(r2)
            throw r1
        L9d:
            java.lang.Object r3 = r5.f21861d
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            if (r3 == 0) goto Lbe
            int r2 = r3.preceding(r6)
            if (r2 == r0) goto Lbd
            boolean r0 = r5.h(r2)
            if (r0 == 0) goto Lbd
            if (r2 == 0) goto Lb9
            int r0 = r2 + (-1)
            boolean r0 = r5.h(r0)
            if (r0 != 0) goto Lbd
        Lb9:
            int[] r1 = r5.b(r2, r6)
        Lbd:
            return r1
        Lbe:
            gg.l.g(r2)
            throw r1
        Lc2:
            java.lang.String r0 = r5.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lce
            goto L101
        Lce:
            if (r6 > 0) goto Ld1
            goto L101
        Ld1:
            if (r6 <= r0) goto Ld4
            r6 = r0
        Ld4:
            java.lang.Object r0 = r5.f21861d
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            java.lang.String r2 = "impl"
            if (r0 == 0) goto L106
            boolean r0 = r0.isBoundary(r6)
            java.lang.Object r3 = r5.f21861d
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            r4 = -1
            if (r0 != 0) goto Lf4
            if (r3 == 0) goto Lf0
            int r6 = r3.preceding(r6)
            if (r6 != r4) goto Ld4
            goto L101
        Lf0:
            gg.l.g(r2)
            throw r1
        Lf4:
            if (r3 == 0) goto L102
            int r0 = r3.preceding(r6)
            if (r0 != r4) goto Lfd
            goto L101
        Lfd:
            int[] r1 = r5.b(r0, r6)
        L101:
            return r1
        L102:
            gg.l.g(r2)
            throw r1
        L106:
            gg.l.g(r2)
            throw r1
    }

    public int e(int r5, t2.j r6) {
            r4 = this;
            java.lang.Object r0 = r4.f21861d
            i2.k0 r0 = (i2.k0) r0
            r1 = 0
            java.lang.String r2 = "layoutResult"
            if (r0 == 0) goto L3c
            int r0 = r0.g(r5)
            java.lang.Object r3 = r4.f21861d
            i2.k0 r3 = (i2.k0) r3
            if (r3 == 0) goto L38
            t2.j r0 = r3.h(r0)
            java.lang.Object r3 = r4.f21861d
            i2.k0 r3 = (i2.k0) r3
            if (r6 == r0) goto L28
            if (r3 == 0) goto L24
            int r5 = r3.g(r5)
            return r5
        L24:
            gg.l.g(r2)
            throw r1
        L28:
            if (r3 == 0) goto L34
            r6 = 0
            i2.o r0 = r3.f6347b
            int r5 = r0.c(r5, r6)
            int r5 = r5 + (-1)
            return r5
        L34:
            gg.l.g(r2)
            throw r1
        L38:
            gg.l.g(r2)
            throw r1
        L3c:
            gg.l.g(r2)
            throw r1
    }

    public void f(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f21860c
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            r1.f21849a = r2
            java.lang.Object r0 = r1.f21861d
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            if (r0 == 0) goto L11
            r0.setText(r2)
            return
        L11:
            java.lang.String r2 = "impl"
            gg.l.g(r2)
            r2 = 0
            throw r2
        L18:
            r1.f21849a = r2
            java.lang.Object r0 = r1.f21861d
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            if (r0 == 0) goto L24
            r0.setText(r2)
            return
        L24:
            java.lang.String r2 = "impl"
            gg.l.g(r2)
            r2 = 0
            throw r2
    }

    public boolean g(int r2) {
            r1 = this;
            if (r2 <= 0) goto L1c
            int r0 = r2 + (-1)
            boolean r0 = r1.h(r0)
            if (r0 == 0) goto L1c
            java.lang.String r0 = r1.c()
            int r0 = r0.length()
            if (r2 == r0) goto L1a
            boolean r2 = r1.h(r2)
            if (r2 != 0) goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public boolean h(int r2) {
            r1 = this;
            if (r2 < 0) goto L19
            java.lang.String r0 = r1.c()
            int r0 = r0.length()
            if (r2 >= r0) goto L19
            java.lang.String r0 = r1.c()
            int r2 = r0.codePointAt(r2)
            boolean r2 = java.lang.Character.isLetterOrDigit(r2)
            return r2
        L19:
            r2 = 0
            return r2
    }
}
