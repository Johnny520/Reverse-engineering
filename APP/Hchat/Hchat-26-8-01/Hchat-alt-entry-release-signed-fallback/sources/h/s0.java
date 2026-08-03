package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h.s0 f4751b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.s0 f4752c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.h1 f4753a;

    static {
            h.s0 r0 = new h.s0
            h.h1 r1 = new h.h1
            r6 = 0
            r7 = 127(0x7f, float:1.78E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            h.s0.f4751b = r0
            h.s0 r0 = new h.s0
            h.h1 r1 = new h.h1
            r7 = 95
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            h.s0.f4752c = r0
            return
    }

    public s0(h.h1 r1) {
            r0 = this;
            r0.<init>()
            r0.f4753a = r1
            return
    }

    public final h.s0 a(h.s0 r9) {
            r8 = this;
            h.s0 r0 = new h.s0
            h.h1 r1 = new h.h1
            h.h1 r9 = r9.f4753a
            h.t0 r2 = r9.f4690a
            h.h1 r3 = r8.f4753a
            if (r2 != 0) goto Le
            h.t0 r2 = r3.f4690a
        Le:
            h.f1 r4 = r9.f4691b
            if (r4 != 0) goto L14
            h.f1 r4 = r3.f4691b
        L14:
            boolean r5 = r9.f4692c
            if (r5 != 0) goto L20
            boolean r5 = r3.f4692c
            if (r5 == 0) goto L1d
            goto L20
        L1d:
            r5 = 0
        L1e:
            r6 = r5
            goto L22
        L20:
            r5 = 1
            goto L1e
        L22:
            java.util.Map r3 = r3.f4693d
            java.util.Map r9 = r9.f4693d
            java.util.LinkedHashMap r7 = tf.y.c0(r3, r9)
            r3 = r4
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof h.s0
            if (r0 == 0) goto L12
            h.s0 r2 = (h.s0) r2
            h.h1 r2 = r2.f4753a
            h.h1 r0 = r1.f4753a
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            h.h1 r0 = r1.f4753a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            h.s0 r0 = h.s0.f4751b
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "ExitTransition.None"
            return r0
        Lb:
            h.s0 r0 = h.s0.f4752c
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = "ExitTransition.KeepUntilTransitionsFinished"
            return r0
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExitTransition: \nFade - "
            r0.<init>(r1)
            h.h1 r1 = r4.f4753a
            h.t0 r2 = r1.f4690a
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.String r2 = r2.toString()
            goto L2a
        L29:
            r2 = r3
        L2a:
            r0.append(r2)
            java.lang.String r2 = ",\nSlide - "
            r0.append(r2)
            h.f1 r2 = r1.f4691b
            if (r2 == 0) goto L3b
            java.lang.String r2 = r2.toString()
            goto L3c
        L3b:
            r2 = r3
        L3c:
            r0.append(r2)
            java.lang.String r2 = ",\nShrink - "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ",\nScale - "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ",\nKeepUntilTransitionsFinished - "
            r0.append(r2)
            boolean r1 = r1.f4692c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
