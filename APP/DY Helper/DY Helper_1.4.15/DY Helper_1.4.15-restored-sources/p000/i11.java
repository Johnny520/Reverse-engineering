package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i11 {

    /* JADX INFO: renamed from: α */
    public final p000.b21 f4873;

    public /* synthetic */ i11(p000.b21 r1) {
            r0 = this;
            r0.<init>()
            r0.f4873 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object m2581(p000.b21 r5) {
            r0 = 0
            java.lang.Object r1 = r5.m695(r0)
            if (r1 != 0) goto L8
            return r0
        L8:
            boolean r2 = r1 instanceof p000.v11
            if (r2 == 0) goto L3f
            v11 r1 = (p000.v11) r1
            boolean r2 = r1.m6022()
            if (r2 != 0) goto L37
            int r2 = r1.f11065
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r4 = r1.m6020(r2)
            r1.m6025(r2)
            r4.getClass()
            boolean r2 = r1.m6022()
            if (r2 == 0) goto L2b
            r5.m699(r0)
        L2b:
            int r2 = r1.f11065
            if (r2 != r3) goto L36
            java.lang.Object r1 = r1.m6019()
            r5.m701(r0, r1)
        L36:
            return r4
        L37:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r5.<init>(r0)
            throw r5
        L3f:
            r5.m699(r0)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static final p000.v11 m2582(p000.b21 r14) {
            boolean r0 = r14.m697()
            if (r0 == 0) goto Lc
            v11 r14 = p000.a41.f65
            r14.getClass()
            return r14
        Lc:
            v11 r0 = new v11
            r0.<init>()
            java.lang.Object[] r1 = r14.f1429
            long[] r14 = r14.f1427
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1c:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L36:
            if (r9 >= r7) goto L5a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L56
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof p000.v11
            if (r11 == 0) goto L50
            v11 r10 = (p000.v11) r10
            r0.m6016(r10)
            goto L56
        L50:
            r10.getClass()
            r0.m6015(r10)
        L56:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L5a:
            if (r7 != r8) goto L61
        L5c:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1c
        L61:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.i11
            if (r0 != 0) goto L5
            goto L11
        L5:
            i11 r2 = (p000.i11) r2
            b21 r2 = r2.f4873
            b21 r1 = r1.f4873
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            b21 r0 = r0.f4873
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiValueMap(map="
            r0.<init>(r1)
            b21 r2 = r2.f4873
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
