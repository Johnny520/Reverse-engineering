package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f5559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sf.i f5561l;

    public l(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, int r10, int r11, java.lang.String r12, int r13) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.f5557h = r10
            r6.f5558i = r11
            r6.f5559j = r12
            r6.f5560k = r13
            d1.c0 r10 = new d1.c0
            r11 = 5
            r10.<init>(r6, r11)
            sf.i r11 = new sf.i
            r11.<init>(r10)
            r6.f5561l = r11
            hh.k r10 = new hh.k
            r11 = 0
            r10.<init>(r7, r6, r9, r11)
            sf.i r11 = new sf.i
            r11.<init>(r10)
            hh.k r10 = new hh.k
            r11 = 1
            r10.<init>(r7, r6, r9, r11)
            sf.i r11 = new sf.i
            r11.<init>(r10)
            hh.f r0 = new hh.f
            r5 = 1
            r2 = r6
            r1 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = r1
            r10 = r3
            r11 = r4
            sf.i r7 = new sf.i
            r7.<init>(r0)
            hh.f r7 = new hh.f
            r12 = 2
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r9 = new sf.i
            r9.<init>(r7)
            hh.f r7 = new hh.f
            r12 = 3
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r8 = new sf.i
            r8.<init>(r7)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof hh.l
            if (r1 == 0) goto L15
            hh.l r3 = (hh.l) r3
            java.lang.String r3 = r3.f5559j
            java.lang.String r1 = r2.f5559j
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5559j
            int r0 = r0.hashCode()
            return r0
    }

    public final lh.b p() {
            r1 = this;
            sf.i r0 = r1.f5561l
            java.lang.Object r0 = r0.getValue()
            lh.b r0 = (lh.b) r0
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            int r2 = r4.f5558i
            if (r2 <= 0) goto L21
            java.lang.String r2 = java.lang.reflect.Modifier.toString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
        L21:
            lh.b r2 = r4.p()
            java.lang.String r2 = r2.f8060i
            r0.append(r2)
            r0.append(r1)
            lh.b r1 = r4.p()
            java.lang.String r1 = r1.f8058g
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            lh.b r1 = r4.p()
            java.lang.String r1 = r1.f8059h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
