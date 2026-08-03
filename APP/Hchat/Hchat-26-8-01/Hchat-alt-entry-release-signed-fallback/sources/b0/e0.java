package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.e0 f360a = null;

    static {
            b0.e0 r0 = new b0.e0
            r0.<init>()
            b0.e0.f360a = r0
            return
    }

    public final void a(android.graphics.drawable.Drawable r6, i0.h0 r7, int r8) {
            r5 = this;
            r0 = 257732500(0xf5caf94, float:1.08806526E-29)
            r7.b0(r0)
            boolean r0 = r7.h(r6)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r8
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L19
            r1 = r4
            goto L1a
        L19:
            r1 = r3
        L1a:
            r0 = r0 & r4
            boolean r0 = r7.S(r0, r1)
            if (r0 == 0) goto L4a
            y0.l r0 = y0.l.f21818a
            float r1 = l.f.f7634j
            y0.o r0 = p.h1.j(r0, r1)
            boolean r1 = r7.h(r6)
            java.lang.Object r2 = r7.P()
            if (r1 != 0) goto L37
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L40
        L37:
            b0.d0 r2 = new b0.d0
            r1 = 0
            r2.<init>(r6, r1)
            r7.k0(r2)
        L40:
            fg.l r2 = (fg.l) r2
            y0.o r0 = c1.h.d(r0, r2)
            p.o.a(r0, r7, r3)
            goto L4d
        L4a:
            r7.V()
        L4d:
            i0.r1 r7 = r7.t()
            if (r7 == 0) goto L5b
            b0.q r0 = new b0.q
            r1 = 2
            r0.<init>(r5, r6, r8, r1)
            r7.f6035d = r0
        L5b:
            return
    }

    public final void b(android.graphics.drawable.Icon r5, i0.h0 r6, int r7) {
            r4 = this;
            r0 = 2116504409(0x7e274b59, float:5.5593076E37)
            r6.b0(r0)
            boolean r0 = r6.h(r5)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r7
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0 = r0 & r3
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L5c
            i0.m2 r0 = y1.i0.f21966b
            java.lang.Object r0 = r6.j(r0)
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r6.f(r5)
            boolean r2 = r6.f(r0)
            r1 = r1 | r2
            java.lang.Object r2 = r6.P()
            if (r1 != 0) goto L3c
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L43
        L3c:
            android.graphics.drawable.Drawable r2 = r5.loadDrawable(r0)
            r6.k0(r2)
        L43:
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            if (r2 != 0) goto L56
            i0.r1 r6 = r6.t()
            if (r6 == 0) goto L6c
            b0.c0 r0 = new b0.c0
            r1 = 0
            r0.<init>(r4, r5, r7, r1)
        L53:
            r6.f6035d = r0
            return
        L56:
            r0 = 48
            r4.a(r2, r6, r0)
            goto L5f
        L5c:
            r6.V()
        L5f:
            i0.r1 r6 = r6.t()
            if (r6 == 0) goto L6c
            b0.c0 r0 = new b0.c0
            r1 = 1
            r0.<init>(r4, r5, r7, r1)
            goto L53
        L6c:
            return
    }
}
