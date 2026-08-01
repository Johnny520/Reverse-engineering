package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867 implements defpackage.InterfaceC1631 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0389 f3927;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3928;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f3929;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3930;

    public C0867(java.lang.String r6) {
            r5 = this;
            r5.<init>()
            ᛲᲀ r0 = new ᛲᲀ
            r1 = 4
            r0.<init>(r1, r5)
            ᛲᲈᛶᲈ r2 = new ᛲᲈᛶᲈ
            r2.<init>(r0)
            r5.f3927 = r2
            r0 = 6
            java.lang.String r2 = "->"
            r3 = 0
            int r0 = defpackage.AbstractC1347.m2517(r6, r2, r3, r3, r0)
            int r2 = r0 + 1
            java.lang.String r4 = ":"
            int r1 = defpackage.AbstractC1347.m2517(r6, r4, r2, r3, r1)
            r2 = -1
            if (r0 == r2) goto L44
            if (r1 == r2) goto L44
            java.lang.String r2 = r6.substring(r3, r0)
            java.lang.String r2 = defpackage.AbstractC0859.m1820(r2)
            r5.f3929 = r2
            int r0 = r0 + 2
            java.lang.String r0 = r6.substring(r0, r1)
            r5.f3930 = r0
            int r1 = r1 + 1
            java.lang.String r6 = r6.substring(r1)
            java.lang.String r6 = defpackage.AbstractC0859.m1820(r6)
            r5.f3928 = r6
            return
        L44:
            java.lang.IllegalAccessError r5 = new java.lang.IllegalAccessError
            java.lang.String r0 = "not field descriptor: "
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C0867
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛵᛴᛴᲀ r5 = (defpackage.C0867) r5
            java.lang.String r1 = r5.f3929
            java.lang.String r3 = r4.f3929
            boolean r1 = defpackage.AbstractC0498.m1280(r3, r1)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f3930
            java.lang.String r3 = r5.f3930
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r4 = r4.f3928
            java.lang.String r5 = r5.f3928
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f3929
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f3930
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.lang.String r2 = r2.f3928
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.f3929
            java.lang.String r1 = defpackage.AbstractC0859.m1817(r1)
            r0.<init>(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.f3930
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            ᛲᲈᛶᲈ r2 = r2.f3927
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
