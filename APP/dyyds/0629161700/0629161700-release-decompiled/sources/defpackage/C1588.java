package defpackage;

/* JADX INFO: renamed from: ᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1588 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Throwable f7028;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f7029;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1286 f7030;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object f7031;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1818 f7032;

    public C1588(java.lang.Object r1, defpackage.InterfaceC1818 r2, defpackage.InterfaceC1286 r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.f7031 = r1
            r0.f7032 = r2
            r0.f7030 = r3
            r0.f7029 = r4
            r0.f7028 = r5
            return
    }

    public /* synthetic */ C1588(java.lang.Object r3, defpackage.InterfaceC1818 r4, defpackage.InterfaceC1286 r5, java.util.concurrent.CancellationException r6, int r7) {
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1588 m2868(defpackage.C1588 r6, defpackage.InterfaceC1818 r7, java.util.concurrent.CancellationException r8, int r9) {
            java.lang.Object r1 = r6.f7031
            r0 = r9 & 2
            if (r0 == 0) goto L8
            ᲁᛲᛸᲈ r7 = r6.f7032
        L8:
            r2 = r7
            ᛷᛶᛲ r3 = r6.f7030
            java.lang.Object r4 = r6.f7029
            r7 = r9 & 16
            if (r7 == 0) goto L13
            java.lang.Throwable r8 = r6.f7028
        L13:
            r5 = r8
            ᛸᲇᲁ r0 = new ᛸᲇᲁ
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1588
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛸᲇᲁ r5 = (defpackage.C1588) r5
            java.lang.Object r1 = r4.f7031
            java.lang.Object r3 = r5.f7031
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            ᲁᛲᛸᲈ r1 = r4.f7032
            ᲁᛲᛸᲈ r3 = r5.f7032
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            ᛷᛶᛲ r1 = r4.f7030
            ᛷᛶᛲ r3 = r5.f7030
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.f7029
            java.lang.Object r3 = r5.f7029
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r4 = r4.f7028
            java.lang.Throwable r5 = r5.f7028
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f7031
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            ᲁᛲᛸᲈ r2 = r3.f7032
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            ᛷᛶᛲ r2 = r3.f7030
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f7029
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Throwable r3 = r3.f7028
            if (r3 != 0) goto L39
            goto L3d
        L39:
            int r0 = r3.hashCode()
        L3d:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CompletedContinuation(result="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f7031
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            ᲁᛲᛸᲈ r1 = r2.f7032
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            ᛷᛶᛲ r1 = r2.f7030
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.f7029
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f7028
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
