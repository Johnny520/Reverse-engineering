package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d7.d f2036a;

    public c(d7.d r1) {
            r0 = this;
            r0.<init>()
            r0.f2036a = r1
            return
    }

    public final int a() {
            r2 = this;
            d7.d r0 = r2.f2036a
            r1 = 40
            int r0 = r0.O(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1d
            java.lang.Class<d7.c> r2 = d7.c.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1d
        L10:
            d7.c r5 = (d7.c) r5
            int r2 = r4.a()
            int r5 = r5.a()
            if (r2 != r5) goto L1d
            return r0
        L1d:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a()
            return r0
    }

    public final java.lang.String toString() {
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "0"
            r1.<init>(r2)
            int r2 = r14.a()
            java.lang.String r2 = java.lang.Integer.toOctalString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-"
            r1.<init>(r2)
            r2 = 1
            r3 = 0
            r5 = r2
            r4 = r3
        L2e:
            r6 = 2
            if (r4 >= r6) goto L36
            int r5 = r5 * 8
            int r4 = r4 + 1
            goto L2e
        L36:
            int r4 = r14.a()
            int r7 = r5 * 8
            int r4 = r4 % r7
            int r4 = r4 / r5
            r5 = r4 & 4
            r7 = 114(0x72, float:1.6E-43)
            r8 = 45
            if (r5 == 0) goto L48
            r5 = r7
            goto L49
        L48:
            r5 = r8
        L49:
            byte r5 = (byte) r5
            r9 = r4 & 2
            r10 = 119(0x77, float:1.67E-43)
            if (r9 == 0) goto L52
            r9 = r10
            goto L53
        L52:
            r9 = r8
        L53:
            byte r9 = (byte) r9
            r4 = r4 & r2
            r11 = 120(0x78, float:1.68E-43)
            if (r4 == 0) goto L5b
            r4 = r11
            goto L5c
        L5b:
            r4 = r8
        L5c:
            byte r4 = (byte) r4
            r12 = 3
            byte[] r13 = new byte[r12]
            r13[r3] = r5
            r13[r2] = r9
            r13[r6] = r4
            java.lang.String r4 = new java.lang.String
            r4.<init>(r13)
            r1.append(r4)
            int r4 = r14.a()
            int r4 = r4 % 64
            int r4 = r4 / 8
            r5 = r4 & 4
            if (r5 == 0) goto L7c
            r5 = r7
            goto L7d
        L7c:
            r5 = r8
        L7d:
            byte r5 = (byte) r5
            r9 = r4 & 2
            if (r9 == 0) goto L84
            r9 = r10
            goto L85
        L84:
            r9 = r8
        L85:
            byte r9 = (byte) r9
            r4 = r4 & r2
            if (r4 == 0) goto L8b
            r4 = r11
            goto L8c
        L8b:
            r4 = r8
        L8c:
            byte r4 = (byte) r4
            byte[] r13 = new byte[r12]
            r13[r3] = r5
            r13[r2] = r9
            r13[r6] = r4
            java.lang.String r4 = new java.lang.String
            r4.<init>(r13)
            r1.append(r4)
            int r4 = r14.a()
            int r4 = r4 % 8
            r5 = r4 & 4
            if (r5 == 0) goto La8
            goto La9
        La8:
            r7 = r8
        La9:
            byte r5 = (byte) r7
            r7 = r4 & 2
            if (r7 == 0) goto Laf
            goto Lb0
        Laf:
            r10 = r8
        Lb0:
            byte r7 = (byte) r10
            r4 = r4 & r2
            if (r4 == 0) goto Lb5
            r8 = r11
        Lb5:
            byte r4 = (byte) r8
            byte[] r8 = new byte[r12]
            r8[r3] = r5
            r8[r2] = r7
            r8[r6] = r4
            java.lang.String r2 = new java.lang.String
            r2.<init>(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
