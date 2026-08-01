package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f1143;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f1144;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public long f1145;

    public C0167() {
            r2 = this;
            r0 = 0
            r2.f1144 = r0
            r2.<init>()
            r0 = 0
            r2.f1145 = r0
            return
    }

    public C0167(defpackage.C2252 r3) {
            r2 = this;
            r0 = 1
            r2.f1144 = r0
            r2.<init>()
            r2.f1143 = r3
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.f1145 = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f1144
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.Object r0 = r3.f1143
            ᛱᲀᛸᛴ r0 = (defpackage.C0167) r0
            if (r0 != 0) goto L17
            long r0 = r3.f1145
            java.lang.String r3 = java.lang.Long.toBinaryString(r0)
            goto L39
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.f1143
            ᛱᲀᛸᛴ r1 = (defpackage.C0167) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "xx"
            r0.append(r1)
            long r1 = r3.f1145
            java.lang.String r3 = java.lang.Long.toBinaryString(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L39:
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public void m696() {
            r2 = this;
            r0 = 0
            r2.f1145 = r0
            java.lang.Object r2 = r2.f1143
            ᛱᲀᛸᛴ r2 = (defpackage.C0167) r2
            if (r2 == 0) goto Ld
            r2.m696()
        Ld:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void m697(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto L10
            r4.m700()
            java.lang.Object r4 = r4.f1143
            ᛱᲀᛸᛴ r4 = (defpackage.C0167) r4
            int r5 = r5 - r0
            r4.m697(r5)
            return
        L10:
            long r0 = r4.f1145
            r2 = 1
            long r2 = r2 << r5
            long r0 = r0 | r2
            r4.f1145 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m698(int r10, boolean r11) {
            r9 = this;
            r0 = 64
            if (r10 < r0) goto L10
            r9.m700()
            java.lang.Object r9 = r9.f1143
            ᛱᲀᛸᛴ r9 = (defpackage.C0167) r9
            int r10 = r10 - r0
            r9.m698(r10, r11)
            return
        L10:
            long r0 = r9.f1145
            r2 = -9223372036854775808
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1f
            r2 = r4
            goto L20
        L1f:
            r2 = r3
        L20:
            r5 = 1
            long r7 = r5 << r10
            long r7 = r7 - r5
            long r5 = r0 & r7
            long r7 = ~r7
            long r0 = r0 & r7
            long r0 = r0 << r4
            long r0 = r0 | r5
            r9.f1145 = r0
            if (r11 == 0) goto L33
            r9.m697(r10)
            goto L36
        L33:
            r9.m701(r10)
        L36:
            if (r2 != 0) goto L40
            java.lang.Object r10 = r9.f1143
            ᛱᲀᛸᛴ r10 = (defpackage.C0167) r10
            if (r10 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            r9.m700()
            java.lang.Object r9 = r9.f1143
            ᛱᲀᛸᛴ r9 = (defpackage.C0167) r9
            r9.m698(r3, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean m699(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto L11
            r4.m700()
            java.lang.Object r4 = r4.f1143
            ᛱᲀᛸᛴ r4 = (defpackage.C0167) r4
            int r5 = r5 - r0
            boolean r4 = r4.m699(r5)
            return r4
        L11:
            long r0 = r4.f1145
            r2 = 1
            long r4 = r2 << r5
            long r4 = r4 & r0
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L20
            r4 = 1
            return r4
        L20:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m700() {
            r1 = this;
            java.lang.Object r0 = r1.f1143
            ᛱᲀᛸᛴ r0 = (defpackage.C0167) r0
            if (r0 != 0) goto Ld
            ᛱᲀᛸᛴ r0 = new ᛱᲀᛸᛴ
            r0.<init>()
            r1.f1143 = r0
        Ld:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m701(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto Lf
            java.lang.Object r4 = r4.f1143
            ᛱᲀᛸᛴ r4 = (defpackage.C0167) r4
            if (r4 == 0) goto Le
            int r5 = r5 - r0
            r4.m701(r5)
        Le:
            return
        Lf:
            long r0 = r4.f1145
            r2 = 1
            long r2 = r2 << r5
            long r2 = ~r2
            long r0 = r0 & r2
            r4.f1145 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int m702(int r7) {
            r6 = this;
            java.lang.Object r0 = r6.f1143
            ᛱᲀᛸᛴ r0 = (defpackage.C0167) r0
            r1 = 64
            r2 = 1
            if (r0 != 0) goto L1c
            long r4 = r6.f1145
            if (r7 < r1) goto L13
            int r6 = java.lang.Long.bitCount(r4)
            return r6
        L13:
            long r6 = r2 << r7
            long r6 = r6 - r2
            long r6 = r6 & r4
            int r6 = java.lang.Long.bitCount(r6)
            return r6
        L1c:
            if (r7 >= r1) goto L29
            long r0 = r6.f1145
            long r6 = r2 << r7
            long r6 = r6 - r2
            long r6 = r6 & r0
            int r6 = java.lang.Long.bitCount(r6)
            return r6
        L29:
            int r7 = r7 - r1
            int r7 = r0.m702(r7)
            long r0 = r6.f1145
            int r6 = java.lang.Long.bitCount(r0)
            int r6 = r6 + r7
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0024 m703() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
        L7:
            java.lang.Object r1 = r7.f1143
            ᲈᛵᲈᛵ r1 = (defpackage.C2252) r1
            long r2 = r7.f1145
            java.lang.String r1 = r1.m3646(r2)
            long r2 = r7.f1145
            int r4 = r1.length()
            long r4 = (long) r4
            long r2 = r2 - r4
            r7.f1145 = r2
            int r2 = r1.length()
            r3 = 0
            if (r2 != 0) goto L30
            ᛱᛱᛷᛳ r7 = new ᛱᛱᛷᛳ
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r7.<init>(r0)
            return r7
        L30:
            r2 = 4
            r4 = 58
            r5 = 1
            int r2 = defpackage.AbstractC1347.m2514(r1, r4, r5, r2)
            r6 = -1
            if (r2 == r6) goto L54
            java.lang.String r3 = r1.substring(r3, r2)
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            r0.add(r3)
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L7
        L54:
            char r2 = r1.charAt(r3)
            java.lang.String r3 = ""
            if (r2 != r4) goto L6f
            java.lang.String r1 = r1.substring(r5)
            r0.add(r3)
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L7
        L6f:
            r0.add(r3)
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L7
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean m704(int r11) {
            r10 = this;
            r0 = 64
            if (r11 < r0) goto L11
            r10.m700()
            java.lang.Object r10 = r10.f1143
            ᛱᲀᛸᛴ r10 = (defpackage.C0167) r10
            int r11 = r11 - r0
            boolean r10 = r10.m704(r11)
            return r10
        L11:
            r0 = 1
            long r2 = r0 << r11
            long r4 = r10.f1145
            long r6 = r4 & r2
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r11 == 0) goto L23
            r11 = r6
            goto L24
        L23:
            r11 = r7
        L24:
            long r8 = ~r2
            long r4 = r4 & r8
            r10.f1145 = r4
            long r2 = r2 - r0
            long r0 = r4 & r2
            long r2 = ~r2
            long r2 = r2 & r4
            long r2 = java.lang.Long.rotateRight(r2, r6)
            long r0 = r0 | r2
            r10.f1145 = r0
            java.lang.Object r0 = r10.f1143
            ᛱᲀᛸᛴ r0 = (defpackage.C0167) r0
            if (r0 == 0) goto L4c
            boolean r0 = r0.m699(r7)
            if (r0 == 0) goto L45
            r0 = 63
            r10.m697(r0)
        L45:
            java.lang.Object r10 = r10.f1143
            ᛱᲀᛸᛴ r10 = (defpackage.C0167) r10
            r10.m704(r7)
        L4c:
            return r11
    }
}
