package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲈᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0921 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0921 f2967 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f2968;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f2969;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f2970;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f2971;

    static {
            xhss.ᲀᲈᲈᛸ r0 = new xhss.ᲀᲈᲈᛸ
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            xhss.C0921.f2967 = r0
            return
    }

    public C0921(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f2970 = r1
            r0.f2968 = r2
            r0.f2969 = r3
            r0.f2971 = r4
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static xhss.C0921 m1514(android.graphics.Insets r3) {
            int r0 = r3.left
            int r1 = r3.top
            int r2 = r3.right
            int r3 = r3.bottom
            xhss.ᲀᲈᲈᛸ r3 = m1515(r0, r1, r2, r3)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0921 m1515(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            xhss.ᲀᲈᲈᛸ r1 = xhss.C0921.f2967
            return r1
        Lb:
            xhss.ᲀᲈᲈᛸ r0 = new xhss.ᲀᲈᲈᛸ
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<xhss.ᲀᲈᲈᛸ> r2 = xhss.C0921.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            xhss.ᲀᲈᲈᛸ r5 = (xhss.C0921) r5
            int r2 = r4.f2971
            int r3 = r5.f2971
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.f2970
            int r3 = r5.f2970
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.f2969
            int r3 = r5.f2969
            if (r2 == r3) goto L27
            return r1
        L27:
            int r4 = r4.f2968
            int r5 = r5.f2968
            if (r4 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f2970
            int r0 = r0 * 31
            int r1 = r2.f2968
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f2969
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f2971
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Insets{left="
            r0.<init>(r1)
            int r1 = r2.f2970
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r2.f2968
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.f2969
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r2 = r2.f2971
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.graphics.Insets m1516() {
            r3 = this;
            int r0 = r3.f2969
            int r1 = r3.f2971
            int r2 = r3.f2970
            int r3 = r3.f2968
            android.graphics.Insets r3 = android.graphics.Insets.of(r2, r3, r0, r1)
            return r3
    }
}
