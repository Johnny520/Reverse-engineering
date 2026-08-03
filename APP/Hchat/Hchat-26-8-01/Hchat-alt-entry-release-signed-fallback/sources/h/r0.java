package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h.r0 f4745b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.h1 f4746a;

    static {
            h.r0 r0 = new h.r0
            h.h1 r1 = new h.h1
            r6 = 0
            r7 = 127(0x7f, float:1.78E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            h.r0.f4745b = r0
            return
    }

    public r0(h.h1 r1) {
            r0 = this;
            r0.<init>()
            r0.f4746a = r1
            return
    }

    public final h.r0 a(h.r0 r9) {
            r8 = this;
            h.r0 r0 = new h.r0
            h.h1 r1 = new h.h1
            h.h1 r9 = r9.f4746a
            h.t0 r2 = r9.f4690a
            h.h1 r3 = r8.f4746a
            if (r2 != 0) goto Le
            h.t0 r2 = r3.f4690a
        Le:
            h.f1 r4 = r9.f4691b
            if (r4 != 0) goto L14
            h.f1 r4 = r3.f4691b
        L14:
            java.util.Map r3 = r3.f4693d
            java.util.Map r9 = r9.f4693d
            java.util.LinkedHashMap r6 = tf.y.c0(r3, r9)
            r7 = 32
            r3 = r4
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof h.r0
            if (r0 == 0) goto L12
            h.r0 r2 = (h.r0) r2
            h.h1 r2 = r2.f4746a
            h.h1 r0 = r1.f4746a
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
            h.h1 r0 = r1.f4746a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            h.r0 r0 = h.r0.f4745b
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "EnterTransition.None"
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EnterTransition: \nFade - "
            r0.<init>(r1)
            h.h1 r1 = r4.f4746a
            h.t0 r2 = r1.f4690a
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.String r2 = r2.toString()
            goto L1f
        L1e:
            r2 = r3
        L1f:
            r0.append(r2)
            java.lang.String r2 = ",\nSlide - "
            r0.append(r2)
            h.f1 r1 = r1.f4691b
            if (r1 == 0) goto L30
            java.lang.String r1 = r1.toString()
            goto L31
        L30:
            r1 = r3
        L31:
            r0.append(r1)
            java.lang.String r1 = ",\nShrink - "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ",\nScale - "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
