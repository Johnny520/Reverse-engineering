package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f11075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qg.e f11076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.q f11077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f11078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f11079e;

    public m(java.lang.Object r1, qg.e r2, fg.q r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.f11075a = r1
            r0.f11076b = r2
            r0.f11077c = r3
            r0.f11078d = r4
            r0.f11079e = r5
            return
    }

    public /* synthetic */ m(java.lang.Object r9, qg.e r10, fg.q r11, java.lang.Throwable r12, int r13) {
            r8 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r10
        L8:
            r10 = r13 & 4
            if (r10 == 0) goto Le
            r5 = r1
            goto Lf
        Le:
            r5 = r11
        Lf:
            r10 = r13 & 16
            if (r10 == 0) goto L15
            r7 = r1
            goto L16
        L15:
            r7 = r12
        L16:
            r6 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public static qg.m a(qg.m r6, qg.e r7, java.lang.Throwable r8, int r9) {
            java.lang.Object r1 = r6.f11075a
            r0 = r9 & 2
            if (r0 == 0) goto L8
            qg.e r7 = r6.f11076b
        L8:
            r2 = r7
            fg.q r3 = r6.f11077c
            java.lang.Object r4 = r6.f11078d
            r7 = r9 & 16
            if (r7 == 0) goto L13
            java.lang.Throwable r8 = r6.f11079e
        L13:
            r5 = r8
            qg.m r0 = new qg.m
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof qg.m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qg.m r5 = (qg.m) r5
            java.lang.Object r1 = r4.f11075a
            java.lang.Object r3 = r5.f11075a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            qg.e r1 = r4.f11076b
            qg.e r3 = r5.f11076b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            fg.q r1 = r4.f11077c
            fg.q r3 = r5.f11077c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.f11078d
            java.lang.Object r3 = r5.f11078d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r1 = r4.f11079e
            java.lang.Throwable r5 = r5.f11079e
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f11075a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            qg.e r2 = r3.f11076b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            fg.q r2 = r3.f11077c
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f11078d
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Throwable r2 = r3.f11079e
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r0 = r2.hashCode()
        L3d:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CompletedContinuation(result="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f11075a
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            qg.e r1 = r2.f11076b
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            fg.q r1 = r2.f11077c
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.f11078d
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.f11079e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
