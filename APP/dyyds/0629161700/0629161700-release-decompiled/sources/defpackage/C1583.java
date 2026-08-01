package defpackage;

/* JADX INFO: renamed from: ᛸᲇᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1583 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final byte[] f7001;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f7002;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int[] f7003;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int[] f7004;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f7005;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long[] f7006;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f7007;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final long f7008;

    public C1583(int r3, long[] r4, int[] r5, int[] r6, int r7, int r8, long r9, byte[] r11) {
            r2 = this;
            r0 = -1151914808352302(0xfffbe856ef0961d2, double:NaN)
            r0 = -1151970642927150(0xfffbe849ef0961d2, double:NaN)
            r0 = -1152017887567406(0xfffbe83eef0961d2, double:NaN)
            r2.<init>()
            r2.f7005 = r3
            r2.f7006 = r4
            r2.f7004 = r5
            r2.f7003 = r6
            r2.f7002 = r7
            r2.f7007 = r8
            r2.f7008 = r9
            r2.f7001 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L55
        L3:
            boolean r0 = r5 instanceof defpackage.C1583
            if (r0 != 0) goto L8
            goto L53
        L8:
            ᛸᲇᛴᛴ r5 = (defpackage.C1583) r5
            int r0 = r4.f7005
            int r1 = r5.f7005
            if (r0 == r1) goto L11
            goto L53
        L11:
            long[] r0 = r4.f7006
            long[] r1 = r5.f7006
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L53
        L1c:
            int[] r0 = r4.f7004
            int[] r1 = r5.f7004
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L53
        L27:
            int[] r0 = r4.f7003
            int[] r1 = r5.f7003
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L53
        L32:
            int r0 = r4.f7002
            int r1 = r5.f7002
            if (r0 == r1) goto L39
            goto L53
        L39:
            int r0 = r4.f7007
            int r1 = r5.f7007
            if (r0 == r1) goto L40
            goto L53
        L40:
            long r0 = r4.f7008
            long r2 = r5.f7008
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L49
            goto L53
        L49:
            byte[] r4 = r4.f7001
            byte[] r5 = r5.f7001
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L55
        L53:
            r4 = 0
            return r4
        L55:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f7005
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long[] r2 = r4.f7006
            int r2 = java.util.Arrays.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            int[] r0 = r4.f7004
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r2
            int r0 = r0 * r1
            int[] r2 = r4.f7003
            int r2 = java.util.Arrays.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.f7002
            int r0 = defpackage.AbstractC0225.m820(r0, r2, r1)
            int r2 = r4.f7007
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            long r2 = r4.f7008
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            byte[] r4 = r4.f7001
            if (r4 != 0) goto L3b
            r4 = 0
            goto L3f
        L3b:
            int r4 = java.util.Arrays.hashCode(r4)
        L3f:
            int r2 = r2 + r4
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1152224045997614(0xfffbe80eef0961d2, double:NaN)
            java.lang.String r1 = "HeifInfo(frameCount="
            r0.<init>(r1)
            int r1 = r4.f7005
            r2 = -1152314240310830(0xfffbe7f9ef0961d2, double:NaN)
            r0.append(r1); r0.append(", frameOffsets=")
            long[] r1 = r4.f7006
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = -1152382959787566(0xfffbe7e9ef0961d2, double:NaN)
            java.lang.String r1 = ", frameSizes="
            r0.append(r1)
            int[] r1 = r4.f7004
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = -1152443089329710(0xfffbe7dbef0961d2, double:NaN)
            java.lang.String r1 = ", frameDelays="
            r0.append(r1)
            int[] r1 = r4.f7003
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = -1152507513839150(0xfffbe7ccef0961d2, double:NaN)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r4.f7002
            r2 = -1152546168544814(0xfffbe7c3ef0961d2, double:NaN)
            r0.append(r1); r0.append(", height=")
            int r1 = r4.f7007
            r2 = -1152589118217774(0xfffbe7b9ef0961d2, double:NaN)
            r0.append(r1); r0.append(", timescale=")
            long r1 = r4.f7008
            r0.append(r1)
            r1 = -1152644952792622(0xfffbe7acef0961d2, double:NaN)
            java.lang.String r1 = ", hvcCData="
            r0.append(r1)
            byte[] r4 = r4.f7001
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
