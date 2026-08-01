package defpackage;

/* JADX INFO: renamed from: ᲁᛸᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1893 extends defpackage.AbstractC2346 {
    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static java.util.Map m3321(kotlin.Pair... r2) {
            int r0 = r2.length
            if (r0 <= 0) goto L11
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = m3323(r1)
            r0.<init>(r1)
            m3325(r0, r2)
            return r0
        L11:
            ᲇᛴᛳᲇ r2 = defpackage.C2033.f8764
            return r2
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static java.lang.Object m3322(java.util.LinkedHashMap r2, java.lang.Object r3) {
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L26
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto Ld
            goto L26
        Ld:
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
        L26:
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static int m3323(int r1) {
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

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static java.util.Map m3324(java.util.List r3) {
            int r0 = r3.size()
            if (r0 == 0) goto L47
            r1 = 1
            if (r0 == r1) goto L33
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r3.size()
            int r1 = m3323(r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            java.lang.Object r1 = r1.component2()
            r0.put(r2, r1)
            goto L1a
        L32:
            return r0
        L33:
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r0 = r3.getFirst()
            java.lang.Object r3 = r3.getSecond()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            return r3
        L47:
            ᲇᛴᛳᲇ r3 = defpackage.C2033.f8764
            return r3
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final void m3325(java.util.LinkedHashMap r4, kotlin.Pair[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L14
            r2 = r5[r1]
            java.lang.Object r3 = r2.component1()
            java.lang.Object r2 = r2.component2()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L2
        L14:
            return
    }
}
