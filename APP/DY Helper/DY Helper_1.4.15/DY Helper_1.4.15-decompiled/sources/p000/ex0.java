package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ex0 extends p000.AbstractC0782s1 {
    /* JADX INFO: renamed from: Θ */
    public static java.lang.Object m1968(java.util.HashMap r2, java.lang.Object r3) {
            r2.getClass()
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L29
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L10
            goto L29
        L10:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " is missing in the map."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L29:
            return r0
    }

    /* JADX INFO: renamed from: Ι */
    public static java.util.LinkedHashMap m1969(p000.l91... r2) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = m1970(r1)
            r0.<init>(r1)
            m1973(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: Κ */
    public static int m1970(int r1) {
            if (r1 >= 0) goto L3
            return r1
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            return r1
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    /* JADX INFO: renamed from: Λ */
    public static java.util.Map m1971(p000.l91 r1) {
            r1.getClass()
            java.lang.Object r0 = r1.f6502
            java.lang.Object r1 = r1.f6503
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: Μ */
    public static java.util.Map m1972(p000.l91... r2) {
            int r0 = r2.length
            if (r0 <= 0) goto L11
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = m1970(r1)
            r0.<init>(r1)
            m1973(r0, r2)
            return r0
        L11:
            kz r2 = p000.C0493kz.f6332
            return r2
    }

    /* JADX INFO: renamed from: Ν */
    public static final void m1973(java.util.HashMap r4, p000.l91[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r5[r1]
            java.lang.Object r3 = r2.f6502
            java.lang.Object r2 = r2.f6503
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L2
        L10:
            return
    }

    /* JADX INFO: renamed from: Ξ */
    public static java.util.Map m1974(java.util.ArrayList r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L26
            r1 = 1
            if (r0 == r1) goto L1a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.size()
            int r1 = m1970(r1)
            r0.<init>(r1)
            m1976(r2, r0)
            return r0
        L1a:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            l91 r2 = (p000.l91) r2
            java.util.Map r2 = m1971(r2)
            return r2
        L26:
            kz r2 = p000.C0493kz.f6332
            return r2
    }

    /* JADX INFO: renamed from: Ο */
    public static java.util.Map m1975(java.util.Map r2) {
            r2.getClass()
            int r0 = r2.size()
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 == r1) goto L12
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
            return r0
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = java.util.Collections.singletonMap(r0, r2)
            r2.getClass()
            return r2
        L30:
            kz r2 = p000.C0493kz.f6332
            return r2
    }

    /* JADX INFO: renamed from: Π */
    public static void m1976(java.util.ArrayList r2, java.util.LinkedHashMap r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            l91 r0 = (p000.l91) r0
            java.lang.Object r1 = r0.f6502
            java.lang.Object r0 = r0.f6503
            r3.put(r1, r0)
            goto L4
        L18:
            return
    }
}
