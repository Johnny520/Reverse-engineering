package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.t0 f4690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.f1 f4691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f4693d;

    public /* synthetic */ h1(h.t0 r10, h.f1 r11, h.a0 r12, h.a0 r13, java.util.LinkedHashMap r14, int r15) {
            r9 = this;
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r3 = r1
            goto L8
        L7:
            r3 = r10
        L8:
            r10 = r15 & 2
            if (r10 == 0) goto Le
            r4 = r1
            goto Lf
        Le:
            r4 = r11
        Lf:
            r10 = r15 & 4
            if (r10 == 0) goto L15
            r5 = r1
            goto L16
        L15:
            r5 = r12
        L16:
            r10 = r15 & 8
            if (r10 == 0) goto L1c
            r6 = r1
            goto L1d
        L1c:
            r6 = r13
        L1d:
            r10 = r15 & 32
            if (r10 == 0) goto L24
            r10 = 0
        L22:
            r7 = r10
            goto L26
        L24:
            r10 = 1
            goto L22
        L26:
            r10 = r15 & 64
            if (r10 == 0) goto L2c
            tf.u r14 = tf.u.f13168g
        L2c:
            r2 = r9
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
    }

    public h1(h.t0 r1, h.f1 r2, h.a0 r3, h.a0 r4, boolean r5, java.util.Map r6) {
            r0 = this;
            r0.<init>()
            r0.f4690a = r1
            r0.f4691b = r2
            r0.f4692c = r5
            r0.f4693d = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof h.h1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.h1 r5 = (h.h1) r5
            h.t0 r1 = r4.f4690a
            h.t0 r3 = r5.f4690a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            h.f1 r1 = r4.f4691b
            h.f1 r3 = r5.f4691b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            r1 = 0
            r3 = 0
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            r1 = 0
            r3 = 0
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            boolean r1 = r4.f4692c
            boolean r3 = r5.f4692c
            if (r1 == r3) goto L3b
            return r2
        L3b:
            java.util.Map r1 = r4.f4693d
            java.util.Map r5 = r5.f4693d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L46
            return r2
        L46:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            h.t0 r1 = r4.f4690a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            h.f1 r3 = r4.f4691b
            if (r3 != 0) goto L14
            r3 = r0
            goto L18
        L14:
            int r3 = r3.hashCode()
        L18:
            int r1 = r1 + r3
            int r1 = r1 * r2
            int r1 = r1 + r0
            int r1 = r1 * r2
            int r1 = r1 + r0
            int r1 = r1 * 961
            boolean r0 = r4.f4692c
            int r0 = eh.a.h(r1, r2, r0)
            java.util.Map r1 = r4.f4693d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransitionData(fade="
            r0.<init>(r1)
            h.t0 r1 = r2.f4690a
            r0.append(r1)
            java.lang.String r1 = ", slide="
            r0.append(r1)
            h.f1 r1 = r2.f4691b
            r0.append(r1)
            java.lang.String r1 = ", changeSize="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", scale="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", veil=null, hold="
            r0.append(r1)
            boolean r1 = r2.f4692c
            r0.append(r1)
            java.lang.String r1 = ", effectsMap="
            r0.append(r1)
            java.util.Map r1 = r2.f4693d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
