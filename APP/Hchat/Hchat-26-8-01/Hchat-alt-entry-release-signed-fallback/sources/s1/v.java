package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f12319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f12323m;

    public v(long r1, long r3, long r5, long r7, boolean r9, float r10, int r11, boolean r12, java.util.ArrayList r13, long r14, float r16, long r17, long r19) {
            r0 = this;
            r0.<init>()
            r0.f12311a = r1
            r0.f12312b = r3
            r0.f12313c = r5
            r0.f12314d = r7
            r0.f12315e = r9
            r0.f12316f = r10
            r0.f12317g = r11
            r0.f12318h = r12
            r0.f12319i = r13
            r0.f12320j = r14
            r1 = r16
            r0.f12321k = r1
            r1 = r17
            r0.f12322l = r1
            r1 = r19
            r0.f12323m = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L8f
        L4:
            boolean r0 = r5 instanceof s1.v
            if (r0 != 0) goto La
            goto L91
        La:
            s1.v r5 = (s1.v) r5
            long r0 = r4.f12311a
            long r2 = r5.f12311a
            boolean r0 = s1.s.e(r0, r2)
            if (r0 != 0) goto L18
            goto L91
        L18:
            long r0 = r4.f12312b
            long r2 = r5.f12312b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L22
            goto L91
        L22:
            long r0 = r4.f12313c
            long r2 = r5.f12313c
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L2e
            goto L91
        L2e:
            long r0 = r4.f12314d
            long r2 = r5.f12314d
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L39
            goto L91
        L39:
            boolean r0 = r4.f12315e
            boolean r1 = r5.f12315e
            if (r0 == r1) goto L40
            goto L91
        L40:
            float r0 = r4.f12316f
            float r1 = r5.f12316f
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L4b
            goto L91
        L4b:
            int r0 = r4.f12317g
            int r1 = r5.f12317g
            if (r0 != r1) goto L91
            boolean r0 = r4.f12318h
            boolean r1 = r5.f12318h
            if (r0 == r1) goto L58
            goto L91
        L58:
            java.util.ArrayList r0 = r4.f12319i
            java.util.ArrayList r1 = r5.f12319i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L91
        L63:
            long r0 = r4.f12320j
            long r2 = r5.f12320j
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L6e
            goto L91
        L6e:
            float r0 = r4.f12321k
            float r1 = r5.f12321k
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L79
            goto L91
        L79:
            long r0 = r4.f12322l
            long r2 = r5.f12322l
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L84
            goto L91
        L84:
            long r0 = r4.f12323m
            long r2 = r5.f12323m
            boolean r5 = e1.b.b(r0, r2)
            if (r5 != 0) goto L8f
            goto L91
        L8f:
            r5 = 1
            return r5
        L91:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.f12311a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r5.f12312b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r5.f12313c
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r5.f12314d
            int r0 = eh.a.f(r0, r1, r2)
            boolean r2 = r5.f12315e
            int r0 = eh.a.h(r0, r1, r2)
            float r2 = r5.f12316f
            int r0 = eh.a.d(r2, r0, r1)
            int r2 = r5.f12317g
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r5.f12318h
            int r0 = eh.a.h(r0, r1, r2)
            java.util.ArrayList r2 = r5.f12319i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f12320j
            int r0 = eh.a.f(r2, r1, r3)
            float r2 = r5.f12321k
            int r0 = eh.a.d(r2, r0, r1)
            long r2 = r5.f12322l
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r5.f12323m
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerInputEventData(id="
            r0.<init>(r1)
            long r1 = r3.f12311a
            java.lang.String r1 = s1.s.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptime="
            r0.append(r1)
            long r1 = r3.f12312b
            r0.append(r1)
            java.lang.String r1 = ", positionOnScreen="
            r0.append(r1)
            long r1 = r3.f12313c
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f12314d
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", down="
            r0.append(r1)
            boolean r1 = r3.f12315e
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.f12316f
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.f12317g
            java.lang.String r1 = s1.d0.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", activeHover="
            r0.append(r1)
            boolean r1 = r3.f12318h
            r0.append(r1)
            java.lang.String r1 = ", historical="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f12319i
            r0.append(r1)
            java.lang.String r1 = ", scrollDelta="
            r0.append(r1)
            long r1 = r3.f12320j
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleGestureFactor="
            r0.append(r1)
            float r1 = r3.f12321k
            r0.append(r1)
            java.lang.String r1 = ", panGestureOffset="
            r0.append(r1)
            long r1 = r3.f12322l
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", originalEventPosition="
            r0.append(r1)
            long r1 = r3.f12323m
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
