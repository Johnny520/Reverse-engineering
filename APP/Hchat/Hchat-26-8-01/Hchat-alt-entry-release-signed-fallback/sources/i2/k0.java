package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.j0 f6346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.o f6347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f6351f;

    public k0(i2.j0 r2, i2.o r3, long r4) {
            r1 = this;
            r1.<init>()
            r1.f6346a = r2
            r1.f6347b = r3
            r1.f6348c = r4
            java.util.ArrayList r2 = r3.f6375h
            boolean r4 = r2.isEmpty()
            r5 = 0
            if (r4 == 0) goto L14
            r4 = r5
            goto L23
        L14:
            r4 = 0
            java.lang.Object r0 = r2.get(r4)
            i2.r r0 = (i2.r) r0
            i2.a r0 = r0.f6381a
            j2.k r0 = r0.f6248d
            float r4 = r0.d(r4)
        L23:
            r1.f6349d = r4
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L2c
            goto L42
        L2c:
            java.lang.Object r2 = tf.m.B1(r2)
            i2.r r2 = (i2.r) r2
            i2.a r4 = r2.f6381a
            j2.k r4 = r4.f6248d
            int r5 = r4.f6701g
            int r5 = r5 + (-1)
            float r4 = r4.d(r5)
            float r2 = r2.f6386f
            float r5 = r4 + r2
        L42:
            r1.f6350e = r5
            java.util.ArrayList r2 = r3.f6374g
            r1.f6351f = r2
            return
    }

    public final t2.j a(int r3) {
            r2 = this;
            i2.o r0 = r2.f6347b
            r0.l(r3)
            be.k r1 = r0.f6368a
            java.lang.Object r1 = r1.f813b
            i2.g r1 = (i2.g) r1
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            java.util.ArrayList r0 = r0.f6375h
            if (r3 != r1) goto L1a
            int r1 = a.a.b0(r0)
            goto L1e
        L1a:
            int r1 = i2.e0.d(r3, r0)
        L1e:
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r3 = r0.d(r3)
            j2.k r0 = r1.f6248d
            android.text.Layout r0 = r0.f6700f
            boolean r3 = r0.isRtlCharAt(r3)
            if (r3 == 0) goto L37
            t2.j r3 = t2.j.f13012h
            return r3
        L37:
            t2.j r3 = t2.j.f13011g
            return r3
    }

    public final e1.c b(int r10) {
            r9 = this;
            i2.o r0 = r9.f6347b
            r0.k(r10)
            java.util.ArrayList r0 = r0.f6375h
            int r1 = i2.e0.d(r10, r0)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r10 = r0.d(r10)
            java.lang.CharSequence r2 = r1.f6249e
            if (r10 < 0) goto L22
            int r3 = r2.length()
            if (r10 >= r3) goto L22
            goto L3d
        L22:
            java.lang.String r3 = "offset("
            java.lang.String r4 = ") is out of bounds [0,"
            java.lang.StringBuilder r3 = eh.a.t(r10, r3, r4)
            int r2 = r2.length()
            r3.append(r2)
            r2 = 41
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            o2.a.a(r2)
        L3d:
            j2.k r1 = r1.f6248d
            android.text.Layout r2 = r1.f6700f
            int r3 = r2.getLineForOffset(r10)
            float r4 = r1.g(r3)
            float r5 = r1.e(r3)
            int r3 = r2.getParagraphDirection(r3)
            r6 = 1
            r7 = 0
            if (r3 != r6) goto L57
            r3 = r6
            goto L58
        L57:
            r3 = r7
        L58:
            boolean r2 = r2.isRtlCharAt(r10)
            if (r3 == 0) goto L6a
            if (r2 != 0) goto L6a
            float r2 = r1.h(r10, r7)
            int r10 = r10 + r6
            float r10 = r1.h(r10, r6)
            goto L90
        L6a:
            if (r3 == 0) goto L7b
            if (r2 == 0) goto L7b
            float r2 = r1.i(r10, r7)
            int r10 = r10 + r6
            float r10 = r1.i(r10, r6)
        L77:
            r8 = r2
            r2 = r10
            r10 = r8
            goto L90
        L7b:
            if (r2 == 0) goto L87
            float r2 = r1.h(r10, r7)
            int r10 = r10 + r6
            float r10 = r1.h(r10, r6)
            goto L77
        L87:
            float r2 = r1.i(r10, r7)
            int r10 = r10 + r6
            float r10 = r1.i(r10, r6)
        L90:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r4, r10, r5)
            e1.c r10 = new e1.c
            float r2 = r1.left
            float r3 = r1.top
            float r4 = r1.right
            float r1 = r1.bottom
            r10.<init>(r2, r3, r4, r1)
            e1.c r10 = r0.a(r10)
            return r10
    }

    public final e1.c c(int r6) {
            r5 = this;
            i2.o r0 = r5.f6347b
            r0.l(r6)
            be.k r1 = r0.f6368a
            java.lang.Object r1 = r1.f813b
            i2.g r1 = (i2.g) r1
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            java.util.ArrayList r0 = r0.f6375h
            if (r6 != r1) goto L1a
            int r1 = a.a.b0(r0)
            goto L1e
        L1a:
            int r1 = i2.e0.d(r6, r0)
        L1e:
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r6 = r0.d(r6)
            java.lang.CharSequence r2 = r1.f6249e
            j2.k r1 = r1.f6248d
            if (r6 < 0) goto L37
            int r3 = r2.length()
            if (r6 > r3) goto L37
            goto L52
        L37:
            java.lang.String r3 = "offset("
            java.lang.String r4 = ") is out of bounds [0,"
            java.lang.StringBuilder r3 = eh.a.t(r6, r3, r4)
            int r2 = r2.length()
            r3.append(r2)
            r2 = 93
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            o2.a.a(r2)
        L52:
            r2 = 0
            float r2 = r1.h(r6, r2)
            android.text.Layout r3 = r1.f6700f
            int r6 = r3.getLineForOffset(r6)
            e1.c r3 = new e1.c
            float r4 = r1.g(r6)
            float r6 = r1.e(r6)
            r3.<init>(r2, r4, r2, r6)
            e1.c r6 = r0.a(r3)
            return r6
    }

    public final boolean d() {
            r6 = this;
            r0 = 32
            long r1 = r6.f6348c
            long r3 = r1 >> r0
            int r0 = (int) r3
            float r0 = (float) r0
            i2.o r3 = r6.f6347b
            float r4 = r3.f6371d
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L11
            goto L27
        L11:
            boolean r0 = r3.f6370c
            if (r0 != 0) goto L27
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r1 & r4
            int r0 = (int) r0
            float r0 = (float) r0
            float r1 = r3.f6372e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L25
            goto L27
        L25:
            r0 = 0
            return r0
        L27:
            r0 = 1
            return r0
    }

    public final float e(int r4) {
            r3 = this;
            i2.o r0 = r3.f6347b
            r0.m(r4)
            java.util.ArrayList r0 = r0.f6375h
            int r1 = i2.e0.e(r4, r0)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r0 = r0.f6384d
            int r4 = r4 - r0
            j2.k r0 = r1.f6248d
            android.text.Layout r1 = r0.f6700f
            float r1 = r1.getLineLeft(r4)
            int r2 = r0.f6701g
            int r2 = r2 + (-1)
            if (r4 != r2) goto L27
            float r4 = r0.f6704j
            goto L28
        L27:
            r4 = 0
        L28:
            float r1 = r1 + r4
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L46
        L3:
            boolean r0 = r5 instanceof i2.k0
            if (r0 != 0) goto L8
            goto L48
        L8:
            i2.k0 r5 = (i2.k0) r5
            i2.j0 r0 = r5.f6346a
            i2.j0 r1 = r4.f6346a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L48
        L15:
            i2.o r0 = r4.f6347b
            i2.o r1 = r5.f6347b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L48
        L20:
            long r0 = r4.f6348c
            long r2 = r5.f6348c
            boolean r0 = u2.l.a(r0, r2)
            if (r0 != 0) goto L2b
            goto L48
        L2b:
            float r0 = r4.f6349d
            float r1 = r5.f6349d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r4.f6350e
            float r1 = r5.f6350e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            java.util.ArrayList r0 = r4.f6351f
            java.util.ArrayList r5 = r5.f6351f
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L46
            goto L48
        L46:
            r5 = 1
            return r5
        L48:
            r5 = 0
            return r5
    }

    public final float f(int r4) {
            r3 = this;
            i2.o r0 = r3.f6347b
            r0.m(r4)
            java.util.ArrayList r0 = r0.f6375h
            int r1 = i2.e0.e(r4, r0)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r0 = r0.f6384d
            int r4 = r4 - r0
            j2.k r0 = r1.f6248d
            android.text.Layout r1 = r0.f6700f
            float r1 = r1.getLineRight(r4)
            int r2 = r0.f6701g
            int r2 = r2 + (-1)
            if (r4 != r2) goto L27
            float r4 = r0.f6705k
            goto L28
        L27:
            r4 = 0
        L28:
            float r1 = r1 + r4
            return r1
    }

    public final int g(int r4) {
            r3 = this;
            i2.o r0 = r3.f6347b
            r0.m(r4)
            java.util.ArrayList r0 = r0.f6375h
            int r1 = i2.e0.e(r4, r0)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r2 = r0.f6384d
            int r4 = r4 - r2
            j2.k r1 = r1.f6248d
            android.text.Layout r1 = r1.f6700f
            int r4 = r1.getLineStart(r4)
            int r0 = r0.f6382b
            int r4 = r4 + r0
            return r4
    }

    public final t2.j h(int r3) {
            r2 = this;
            i2.o r0 = r2.f6347b
            r0.l(r3)
            be.k r1 = r0.f6368a
            java.lang.Object r1 = r1.f813b
            i2.g r1 = (i2.g) r1
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            java.util.ArrayList r0 = r0.f6375h
            if (r3 != r1) goto L1a
            int r1 = a.a.b0(r0)
            goto L1e
        L1a:
            int r1 = i2.e0.d(r3, r0)
        L1e:
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r3 = r0.d(r3)
            j2.k r0 = r1.f6248d
            android.text.Layout r1 = r0.f6700f
            int r3 = r1.getLineForOffset(r3)
            android.text.Layout r0 = r0.f6700f
            int r3 = r0.getParagraphDirection(r3)
            r0 = 1
            if (r3 != r0) goto L3e
            t2.j r3 = t2.j.f13011g
            return r3
        L3e:
            t2.j r3 = t2.j.f13012h
            return r3
    }

    public final int hashCode() {
            r5 = this;
            i2.j0 r0 = r5.f6346a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            i2.o r2 = r5.f6347b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f6348c
            int r0 = eh.a.f(r2, r1, r3)
            float r2 = r5.f6349d
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r5.f6350e
            int r0 = eh.a.d(r2, r0, r1)
            java.util.ArrayList r1 = r5.f6351f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final f1.j i(int r6, int r7) {
            r5 = this;
            i2.o r0 = r5.f6347b
            be.k r1 = r0.f6368a
            java.lang.Object r1 = r1.f813b
            i2.g r1 = (i2.g) r1
            if (r6 < 0) goto L15
            if (r6 > r7) goto L15
            java.lang.String r2 = r1.f6314h
            int r2 = r2.length()
            if (r7 > r2) goto L15
            goto L34
        L15:
            java.lang.String r2 = ") or End("
            java.lang.String r3 = ") is out of range [0.."
            java.lang.String r4 = "Start("
            java.lang.StringBuilder r2 = eh.a.s(r6, r7, r4, r2, r3)
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            r2.append(r1)
            java.lang.String r1 = "), or start > end!"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            o2.a.a(r1)
        L34:
            if (r6 != r7) goto L3b
            f1.j r6 = f1.l.a()
            return r6
        L3b:
            f1.j r1 = f1.l.a()
            java.util.ArrayList r0 = r0.f6375h
            long r2 = i2.e0.b(r6, r7)
            i2.n r4 = new i2.n
            r4.<init>(r1, r6, r7)
            i2.e0.g(r0, r2, r4)
            return r1
    }

    public final long j(int r7) {
            r6 = this;
            i2.o r0 = r6.f6347b
            r0.l(r7)
            be.k r1 = r0.f6368a
            java.lang.Object r1 = r1.f813b
            i2.g r1 = (i2.g) r1
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            java.util.ArrayList r0 = r0.f6375h
            if (r7 != r1) goto L1a
            int r1 = a.a.b0(r0)
            goto L1e
        L1a:
            int r1 = i2.e0.d(r7, r0)
        L1e:
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r7 = r0.d(r7)
            j2.k r1 = r1.f6248d
            c8.a r1 = r1.j()
            int r2 = r1.j(r7)
            boolean r2 = r1.h(r2)
            r3 = -1
            if (r2 == 0) goto L53
            r1.a(r7)
            r2 = r7
        L3f:
            if (r2 == r3) goto L7c
            boolean r4 = r1.h(r2)
            if (r4 == 0) goto L4e
            boolean r4 = r1.d(r2)
            if (r4 != 0) goto L4e
            goto L7c
        L4e:
            int r2 = r1.j(r2)
            goto L3f
        L53:
            r1.a(r7)
            boolean r2 = r1.g(r7)
            if (r2 == 0) goto L70
            boolean r2 = r1.e(r7)
            if (r2 == 0) goto L6b
            boolean r2 = r1.c(r7)
            if (r2 == 0) goto L69
            goto L6b
        L69:
            r2 = r7
            goto L7c
        L6b:
            int r2 = r1.j(r7)
            goto L7c
        L70:
            boolean r2 = r1.c(r7)
            if (r2 == 0) goto L7b
            int r2 = r1.j(r7)
            goto L7c
        L7b:
            r2 = r3
        L7c:
            if (r2 != r3) goto L7f
            r2 = r7
        L7f:
            int r4 = r1.i(r7)
            boolean r4 = r1.d(r4)
            if (r4 == 0) goto La1
            r1.a(r7)
            r4 = r7
        L8d:
            if (r4 == r3) goto Lcb
            boolean r5 = r1.h(r4)
            if (r5 != 0) goto L9c
            boolean r5 = r1.d(r4)
            if (r5 == 0) goto L9c
            goto Lcb
        L9c:
            int r4 = r1.i(r4)
            goto L8d
        La1:
            r1.a(r7)
            boolean r4 = r1.c(r7)
            if (r4 == 0) goto Lbf
            boolean r4 = r1.e(r7)
            if (r4 == 0) goto Lb9
            boolean r4 = r1.g(r7)
            if (r4 == 0) goto Lb7
            goto Lb9
        Lb7:
            r4 = r7
            goto Lcb
        Lb9:
            int r1 = r1.i(r7)
        Lbd:
            r4 = r1
            goto Lcb
        Lbf:
            boolean r4 = r1.g(r7)
            if (r4 == 0) goto Lca
            int r1 = r1.i(r7)
            goto Lbd
        Lca:
            r4 = r3
        Lcb:
            if (r4 != r3) goto Lce
            goto Lcf
        Lce:
            r7 = r4
        Lcf:
            long r1 = i2.e0.b(r2, r7)
            r7 = 0
            long r0 = r0.b(r1, r7)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextLayoutResult(layoutInput="
            r0.<init>(r1)
            i2.j0 r1 = r3.f6346a
            r0.append(r1)
            java.lang.String r1 = ", multiParagraph="
            r0.append(r1)
            i2.o r1 = r3.f6347b
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.f6348c
            java.lang.String r1 = u2.l.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", firstBaseline="
            r0.append(r1)
            float r1 = r3.f6349d
            r0.append(r1)
            java.lang.String r1 = ", lastBaseline="
            r0.append(r1)
            float r1 = r3.f6350e
            r0.append(r1)
            java.lang.String r1 = ", placeholderRects="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f6351f
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
