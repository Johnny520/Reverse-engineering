package defpackage;

/* JADX INFO: renamed from: ᛱᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0137 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f1080;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f1081;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f1082;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.AbstractC2126 f1083;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f1084;

    public C0137() {
            r0 = this;
            r0.<init>()
            r0.m655()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnchorInfo{mPosition="
            r0.<init>(r1)
            int r1 = r2.f1084
            r0.append(r1)
            java.lang.String r1 = ", mCoordinate="
            r0.append(r1)
            int r1 = r2.f1082
            r0.append(r1)
            java.lang.String r1 = ", mLayoutFromEnd="
            r0.append(r1)
            boolean r1 = r2.f1081
            r0.append(r1)
            java.lang.String r1 = ", mValid="
            r0.append(r1)
            boolean r2 = r2.f1080
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m655() {
            r1 = this;
            r0 = -1
            r1.f1084 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f1082 = r0
            r0 = 0
            r1.f1081 = r0
            r1.f1080 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m656() {
            r2 = this;
            boolean r0 = r2.f1081
            ᲇᲁᛱᛱ r1 = r2.f1083
            if (r0 == 0) goto Lb
            int r0 = r1.mo1933()
            goto Lf
        Lb:
            int r0 = r1.mo1936()
        Lf:
            r2.f1082 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m657(android.view.View r5, int r6) {
            r4 = this;
            ᲇᲁᛱᛱ r0 = r4.f1083
            int r1 = r0.f9096
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r1) goto Lb
            r1 = r2
            goto L12
        Lb:
            int r1 = r0.mo1939()
            int r0 = r0.f9096
            int r1 = r1 - r0
        L12:
            if (r1 < 0) goto L3a
            boolean r0 = r4.f1081
            ᲇᲁᛱᛱ r1 = r4.f1083
            if (r0 == 0) goto L31
            int r5 = r1.mo1937(r5)
            ᲇᲁᛱᛱ r0 = r4.f1083
            int r1 = r0.f9096
            if (r3 != r1) goto L25
            goto L2d
        L25:
            int r1 = r0.mo1939()
            int r0 = r0.f9096
            int r2 = r1 - r0
        L2d:
            int r2 = r2 + r5
            r4.f1082 = r2
            goto L37
        L31:
            int r5 = r1.mo1943(r5)
            r4.f1082 = r5
        L37:
            r4.f1084 = r6
            return
        L3a:
            r4.f1084 = r6
            boolean r6 = r4.f1081
            ᲇᲁᛱᛱ r0 = r4.f1083
            if (r6 == 0) goto L82
            int r6 = r0.mo1933()
            int r6 = r6 - r1
            ᲇᲁᛱᛱ r0 = r4.f1083
            int r0 = r0.mo1937(r5)
            int r6 = r6 - r0
            ᲇᲁᛱᛱ r0 = r4.f1083
            int r0 = r0.mo1933()
            int r0 = r0 - r6
            r4.f1082 = r0
            if (r6 <= 0) goto Lbf
            ᲇᲁᛱᛱ r0 = r4.f1083
            int r0 = r0.mo1935(r5)
            int r1 = r4.f1082
            int r1 = r1 - r0
            ᲇᲁᛱᛱ r0 = r4.f1083
            int r0 = r0.mo1936()
            ᲇᲁᛱᛱ r3 = r4.f1083
            int r5 = r3.mo1943(r5)
            int r5 = r5 - r0
            int r5 = java.lang.Math.min(r5, r2)
            int r5 = r5 + r0
            int r1 = r1 - r5
            if (r1 >= 0) goto Lbf
            int r5 = r4.f1082
            int r0 = -r1
            int r6 = java.lang.Math.min(r6, r0)
            int r6 = r6 + r5
            r4.f1082 = r6
            return
        L82:
            int r6 = r0.mo1943(r5)
            ᲇᲁᛱᛱ r0 = r4.f1083
            int r0 = r0.mo1936()
            int r0 = r6 - r0
            r4.f1082 = r6
            if (r0 <= 0) goto Lbf
            ᲇᲁᛱᛱ r3 = r4.f1083
            int r3 = r3.mo1935(r5)
            int r3 = r3 + r6
            ᲇᲁᛱᛱ r6 = r4.f1083
            int r6 = r6.mo1933()
            int r6 = r6 - r1
            ᲇᲁᛱᛱ r1 = r4.f1083
            int r5 = r1.mo1937(r5)
            int r6 = r6 - r5
            ᲇᲁᛱᛱ r5 = r4.f1083
            int r5 = r5.mo1933()
            int r6 = java.lang.Math.min(r2, r6)
            int r5 = r5 - r6
            int r5 = r5 - r3
            if (r5 >= 0) goto Lbf
            int r6 = r4.f1082
            int r5 = -r5
            int r5 = java.lang.Math.min(r0, r5)
            int r6 = r6 - r5
            r4.f1082 = r6
        Lbf:
            return
    }
}
