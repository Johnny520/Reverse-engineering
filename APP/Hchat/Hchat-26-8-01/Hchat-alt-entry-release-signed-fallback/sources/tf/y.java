package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y extends a7.a {
    public static java.lang.Object Y(java.lang.Object r2, java.util.Map r3) {
            r3.getClass()
            boolean r0 = r3 instanceof tf.x
            if (r0 == 0) goto Le
            tf.x r3 = (tf.x) r3
            java.lang.Object r2 = r3.b()
            return r2
        Le:
            java.lang.Object r0 = r3.get(r2)
            if (r0 != 0) goto L34
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " is missing in the map."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L34:
            return r0
    }

    public static java.util.LinkedHashMap Z(sf.e... r2) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = a0(r1)
            r0.<init>(r1)
            d0(r0, r2)
            return r0
    }

    public static int a0(int r1) {
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

    public static java.util.Map b0(sf.e... r2) {
            int r0 = r2.length
            if (r0 <= 0) goto L11
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = a0(r1)
            r0.<init>(r1)
            d0(r0, r2)
            return r0
        L11:
            tf.u r2 = tf.u.f13168g
            return r2
    }

    public static java.util.LinkedHashMap c0(java.util.Map r1, java.util.Map r2) {
            r1.getClass()
            r2.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            r0.putAll(r2)
            return r0
    }

    public static final void d0(java.util.HashMap r4, sf.e[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r5[r1]
            java.lang.Object r3 = r2.f12418g
            java.lang.Object r2 = r2.f12419h
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L2
        L10:
            return
    }

    public static java.util.Map e0(java.util.ArrayList r3) {
            int r0 = r3.size()
            if (r0 == 0) goto L45
            r1 = 1
            if (r0 == r1) goto L2f
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r3.size()
            int r1 = a0(r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            sf.e r1 = (sf.e) r1
            java.lang.Object r2 = r1.f12418g
            java.lang.Object r1 = r1.f12419h
            r0.put(r2, r1)
            goto L1a
        L2e:
            return r0
        L2f:
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            sf.e r3 = (sf.e) r3
            r3.getClass()
            java.lang.Object r0 = r3.f12418g
            java.lang.Object r3 = r3.f12419h
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r3.getClass()
            return r3
        L45:
            tf.u r3 = tf.u.f13168g
            return r3
    }

    public static java.util.Map f0(java.util.Map r2) {
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
            tf.u r2 = tf.u.f13168g
            return r2
    }
}
