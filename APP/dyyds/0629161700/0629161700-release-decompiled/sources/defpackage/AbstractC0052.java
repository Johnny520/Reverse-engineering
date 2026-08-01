package defpackage;

/* JADX INFO: renamed from: ᛱᛳᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052 extends defpackage.AbstractC2232 implements defpackage.InterfaceC1886 {

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean f570;

    public AbstractC0052(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f570 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.AbstractC0052
            if (r0 == 0) goto L37
            ᛱᛳᛴᛲ r3 = (defpackage.AbstractC0052) r3
            ᲇᲇᛲᲈ r0 = r2.m3626()
            ᲇᲇᛲᲈ r1 = r3.m3626()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.f9528
            java.lang.String r1 = r3.f9528
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.f9529
            java.lang.String r1 = r3.f9529
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.Object r2 = r2.f9526
            java.lang.Object r3 = r3.f9526
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 == 0) goto L44
        L35:
            r2 = 1
            return r2
        L37:
            boolean r0 = r3 instanceof defpackage.InterfaceC1886
            if (r0 == 0) goto L44
            ᛱᛶᲈᛱ r2 = r2.m396()
            boolean r2 = r3.equals(r2)
            return r2
        L44:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            ᲇᲇᛲᲈ r0 = r3.m3626()
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9528
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r3 = r3.f9529
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            ᛱᛶᲈᛱ r0 = r2.m396()
            if (r0 == r2) goto Lb
            java.lang.String r2 = r0.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "property "
            r0.<init>(r1)
            java.lang.String r2 = r2.f9528
            r0.append(r2)
            java.lang.String r2 = " (Kotlin reflection is not available)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC0119 m396() {
            r1 = this;
            boolean r0 = r1.f570
            if (r0 == 0) goto L5
            return r1
        L5:
            ᛱᛶᲈᛱ r0 = r1.f9527
            if (r0 != 0) goto Lf
            ᛱᛶᲈᛱ r0 = r1.mo1263()
            r1.f9527 = r0
        Lf:
            return r0
    }
}
