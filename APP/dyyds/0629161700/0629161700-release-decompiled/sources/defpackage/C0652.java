package defpackage;

/* JADX INFO: renamed from: ᛴᛴᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0652 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public /* synthetic */ int f3174;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object[] f3175;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public /* synthetic */ int[] f3176;

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            ᛴᛴᛵᛷ r0 = (defpackage.C0652) r0
            int[] r1 = r2.f3176
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.f3176 = r1
            java.lang.Object[] r2 = r2.f3175
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.f3175 = r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f3174
            if (r0 > 0) goto L7
            java.lang.String r5 = "{}"
            return r5
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 * 28
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.f3174
            r2 = 0
        L16:
            if (r2 >= r0) goto L46
            if (r2 <= 0) goto L1f
            java.lang.String r3 = ", "
            r1.append(r3)
        L1f:
            int[] r3 = r5.f3176
            r3 = r3[r2]
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object[] r3 = r5.f3175
            int r4 = r3.length
            if (r2 >= r4) goto L40
            r3 = r3[r2]
            if (r3 == r5) goto L38
            r1.append(r3)
            goto L3d
        L38:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3d:
            int r2 = r2 + 1
            goto L16
        L40:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            r5.<init>()
            throw r5
        L46:
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }
}
