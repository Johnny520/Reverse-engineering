package defpackage;

/* JADX INFO: renamed from: ᛴᲇᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0775 extends defpackage.AbstractC2232 implements defpackage.InterfaceC1679, defpackage.InterfaceC0119, defpackage.InterfaceC0769 {

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f3627;

    public AbstractC0775(int r8, int r9, java.lang.Class r10, java.lang.Object r11, java.lang.String r12, java.lang.String r13) {
            r7 = this;
            r0 = 1
            r9 = r9 & r0
            if (r9 != r0) goto Lb
        L4:
            r1 = r7
            r3 = r10
            r2 = r11
            r4 = r12
            r5 = r13
            r6 = r0
            goto Ld
        Lb:
            r0 = 0
            goto L4
        Ld:
            r1.<init>(r2, r3, r4, r5, r6)
            r1.f3627 = r8
            return
    }

    public AbstractC0775(int r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            ᛲᲁᲁᲈ r4 = defpackage.C0365.f1904
            r0 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.AbstractC0775
            if (r0 == 0) goto L37
            ᛴᲇᛱᛱ r3 = (defpackage.AbstractC0775) r3
            java.lang.String r0 = r2.f9528
            java.lang.String r1 = r3.f9528
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r2.f9529
            java.lang.String r1 = r3.f9529
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r2.f9526
            java.lang.Object r1 = r3.f9526
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L4b
            ᲇᲇᛲᲈ r2 = r2.m3626()
            ᲇᲇᛲᲈ r3 = r3.m3626()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4b
        L35:
            r2 = 1
            return r2
        L37:
            boolean r0 = r3 instanceof defpackage.AbstractC0775
            if (r0 == 0) goto L4b
            ᛱᛶᲈᛱ r0 = r2.f9527
            if (r0 != 0) goto L45
            r2.mo1263()
            r2.f9527 = r2
            goto L46
        L45:
            r2 = r0
        L46:
            boolean r2 = r3.equals(r2)
            return r2
        L4b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r3.m3626()
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
            ᛱᛶᲈᛱ r0 = r2.f9527
            if (r0 != 0) goto La
            r2.mo1263()
            r2.f9527 = r2
            r0 = r2
        La:
            if (r0 == r2) goto L11
            java.lang.String r2 = r0.toString()
            return r2
        L11:
            java.lang.String r0 = "<init>"
            java.lang.String r2 = r2.f9528
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.String r2 = "constructor (Kotlin reflection is not available)"
            return r2
        L1e:
            java.lang.String r0 = "function "
            java.lang.String r1 = " (Kotlin reflection is not available)"
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r2, r1)
            return r2
    }

    @Override // defpackage.AbstractC2232
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.InterfaceC0119 mo1263() {
            r1 = this;
            ᲀᛶᲈᲀ r0 = defpackage.AbstractC1168.f5286
            r0.getClass()
            return r1
    }

    @Override // defpackage.InterfaceC1679
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int mo1702() {
            r0 = this;
            int r0 = r0.f3627
            return r0
    }
}
