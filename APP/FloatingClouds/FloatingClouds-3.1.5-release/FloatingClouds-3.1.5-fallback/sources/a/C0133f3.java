package a;

/* JADX INFO: renamed from: a.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0133f3 implements a.InterfaceC0318p9<java.lang.Object>, a.InterfaceC0041a3 {
    public static final java.util.Map<java.lang.Class<? extends a.P7<?>>, java.lang.Integer> b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class<?> f468a;

    static {
            java.lang.Class<a.C7> r20 = a.C7.class
            java.lang.Class<a.E7> r21 = a.E7.class
            java.lang.Class<a.s7> r1 = a.InterfaceC0369s7.class
            java.lang.Class<a.D7> r2 = a.D7.class
            java.lang.Class<a.H7> r3 = a.H7.class
            java.lang.Class<a.I7> r4 = a.I7.class
            java.lang.Class<a.J7> r5 = a.J7.class
            java.lang.Class<a.K7> r6 = a.K7.class
            java.lang.Class<a.L7> r7 = a.L7.class
            java.lang.Class<a.M7> r8 = a.M7.class
            java.lang.Class<a.N7> r9 = a.N7.class
            java.lang.Class<a.O7> r10 = a.O7.class
            java.lang.Class<a.t7> r11 = a.InterfaceC0387t7.class
            java.lang.Class<a.u7> r12 = a.InterfaceC0405u7.class
            java.lang.Class<a.v7> r13 = a.InterfaceC0423v7.class
            java.lang.Class<a.w7> r14 = a.InterfaceC0441w7.class
            java.lang.Class<a.x7> r15 = a.InterfaceC0459x7.class
            java.lang.Class<a.y7> r16 = a.InterfaceC0477y7.class
            java.lang.Class<a.z7> r17 = a.InterfaceC0495z7.class
            java.lang.Class<a.A7> r18 = a.A7.class
            java.lang.Class<a.B7> r19 = a.B7.class
            java.lang.Class<a.F7> r22 = a.F7.class
            java.lang.Class<a.G7> r23 = a.G7.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L46:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L64
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            a.mc r5 = new a.mc
            r5.<init>(r3, r2)
            r1.add(r5)
            r2 = r4
            goto L46
        L64:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
        L6c:
            java.util.Map r0 = a.C0067ba.G(r1)
            a.C0133f3.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "boolean"
            java.lang.String r2 = "kotlin.Boolean"
            r0.put(r1, r2)
            java.lang.String r1 = "char"
            java.lang.String r3 = "kotlin.Char"
            r0.put(r1, r3)
            java.lang.String r1 = "byte"
            java.lang.String r4 = "kotlin.Byte"
            r0.put(r1, r4)
            java.lang.String r1 = "short"
            java.lang.String r5 = "kotlin.Short"
            r0.put(r1, r5)
            java.lang.String r1 = "int"
            java.lang.String r6 = "kotlin.Int"
            r0.put(r1, r6)
            java.lang.String r1 = "float"
            java.lang.String r7 = "kotlin.Float"
            r0.put(r1, r7)
            java.lang.String r1 = "long"
            java.lang.String r8 = "kotlin.Long"
            r0.put(r1, r8)
            java.lang.String r1 = "double"
            java.lang.String r9 = "kotlin.Double"
            r0.put(r1, r9)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r10 = "java.lang.Boolean"
            r1.put(r10, r2)
            java.lang.String r2 = "java.lang.Character"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.Byte"
            r1.put(r2, r4)
            java.lang.String r2 = "java.lang.Short"
            r1.put(r2, r5)
            java.lang.String r2 = "java.lang.Integer"
            r1.put(r2, r6)
            java.lang.String r2 = "java.lang.Float"
            r1.put(r2, r7)
            java.lang.String r2 = "java.lang.Long"
            r1.put(r2, r8)
            java.lang.String r2 = "java.lang.Double"
            r1.put(r2, r9)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "java.lang.Object"
            java.lang.String r4 = "kotlin.Any"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.String"
            java.lang.String r4 = "kotlin.String"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.CharSequence"
            java.lang.String r4 = "kotlin.CharSequence"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.Throwable"
            java.lang.String r4 = "kotlin.Throwable"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.Cloneable"
            java.lang.String r4 = "kotlin.Cloneable"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.Number"
            java.lang.String r4 = "kotlin.Number"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.Comparable"
            java.lang.String r4 = "kotlin.Comparable"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.Enum"
            java.lang.String r4 = "kotlin.Enum"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.annotation.Annotation"
            java.lang.String r4 = "kotlin.Annotation"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.Iterable"
            java.lang.String r4 = "kotlin.collections.Iterable"
            r2.put(r3, r4)
            java.lang.String r3 = "java.util.Iterator"
            java.lang.String r4 = "kotlin.collections.Iterator"
            r2.put(r3, r4)
            java.lang.String r3 = "java.util.Collection"
            java.lang.String r4 = "kotlin.collections.Collection"
            r2.put(r3, r4)
            java.lang.String r3 = "java.util.List"
            java.lang.String r4 = "kotlin.collections.List"
            r2.put(r3, r4)
            java.lang.String r3 = "java.util.Set"
            java.lang.String r4 = "kotlin.collections.Set"
            r2.put(r3, r4)
            java.lang.String r3 = "java.util.ListIterator"
            java.lang.String r4 = "kotlin.collections.ListIterator"
            r2.put(r3, r4)
            java.lang.String r3 = "java.util.Map"
            java.lang.String r4 = "kotlin.collections.Map"
            r2.put(r3, r4)
            java.lang.String r3 = "java.util.Map$Entry"
            java.lang.String r4 = "kotlin.collections.Map.Entry"
            r2.put(r3, r4)
            java.lang.String r3 = "kotlin.jvm.internal.StringCompanionObject"
            java.lang.String r4 = "kotlin.String.Companion"
            r2.put(r3, r4)
            java.lang.String r3 = "kotlin.jvm.internal.EnumCompanionObject"
            java.lang.String r4 = "kotlin.Enum.Companion"
            r2.put(r3, r4)
            r2.putAll(r0)
            r2.putAll(r1)
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            a.C0193i9.d(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L179:
            boolean r1 = r0.hasNext()
            r3 = 46
            if (r1 == 0) goto L1ab
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "kotlin.jvm.internal."
            r4.<init>(r5)
            a.C0193i9.b(r1)
            java.lang.String r3 = a.Be.T(r1, r3)
            r4.append(r3)
            java.lang.String r3 = "CompanionObject"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = ".Companion"
            java.lang.String r1 = r1.concat(r4)
            r2.put(r3, r1)
            goto L179
        L1ab:
            java.util.Map<java.lang.Class<? extends a.P7<?>>, java.lang.Integer> r0 = a.C0133f3.b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1b5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e7
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "kotlin.Function"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.put(r4, r1)
            goto L1b5
        L1e7:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.size()
            int r1 = a.C0048aa.C(r1)
            r0.<init>(r1)
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1fc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            a.C0193i9.b(r2)
            java.lang.String r2 = a.Be.T(r2, r3)
            r0.put(r4, r2)
            goto L1fc
        L21d:
            return
    }

    public C0133f3(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "jClass"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            r1.f468a = r2
            return
    }

    @Override // a.InterfaceC0041a3
    public final java.lang.Class<?> a() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f468a
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.C0133f3
            if (r0 == 0) goto L16
            java.lang.Class r0 = a.C0282n9.r(r1)
            a.p9 r2 = (a.InterfaceC0318p9) r2
            java.lang.Class r2 = a.C0282n9.r(r2)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Class r0 = a.C0282n9.r(r1)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<?> r1 = r2.f468a
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
