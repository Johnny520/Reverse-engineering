package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ma implements defpackage.yp, defpackage.la {
    public static final java.util.Map b = null;
    public final java.lang.Class a;

    static {
            java.lang.Class<um> r22 = defpackage.um.class
            java.lang.Class<vm> r23 = defpackage.vm.class
            java.lang.Class<hm> r1 = defpackage.hm.class
            java.lang.Class<sm> r2 = defpackage.sm.class
            java.lang.Class<wm> r3 = defpackage.wm.class
            java.lang.Class<jb> r4 = defpackage.jb.class
            java.lang.Class<jb> r5 = defpackage.jb.class
            java.lang.Class<jb> r6 = defpackage.jb.class
            java.lang.Class<jb> r7 = defpackage.jb.class
            java.lang.Class<xm> r8 = defpackage.xm.class
            java.lang.Class<ym> r9 = defpackage.ym.class
            java.lang.Class<zm> r10 = defpackage.zm.class
            java.lang.Class<im> r11 = defpackage.im.class
            java.lang.Class<jm> r12 = defpackage.jm.class
            java.lang.Class<km> r13 = defpackage.km.class
            java.lang.Class<lm> r14 = defpackage.lm.class
            java.lang.Class<mm> r15 = defpackage.mm.class
            java.lang.Class<nm> r16 = defpackage.nm.class
            java.lang.Class<om> r17 = defpackage.om.class
            java.lang.Class<pm> r18 = defpackage.pm.class
            java.lang.Class<qm> r19 = defpackage.qm.class
            java.lang.Class<rm> r20 = defpackage.rm.class
            java.lang.Class<tm> r21 = defpackage.tm.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = defpackage.bb.f0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.cb.h0(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L44:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L62
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kx r5 = new kx
            r5.<init>(r3, r2)
            r1.add(r5)
            r2 = r4
            goto L44
        L62:
            defpackage.bb.g0()
            r0 = 0
            throw r0
        L67:
            java.util.Map r0 = defpackage.dt.A(r1)
            defpackage.ma.b = r0
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
            defpackage.ip.n(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L174:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a4
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "kotlin.jvm.internal."
            r3.<init>(r4)
            defpackage.ip.l(r1)
            java.lang.String r4 = defpackage.b50.P(r1)
            r3.append(r4)
            java.lang.String r4 = "CompanionObject"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = ".Companion"
            java.lang.String r1 = r1.concat(r4)
            r2.put(r3, r1)
            goto L174
        L1a4:
            java.util.Map r0 = defpackage.ma.b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e0
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "kotlin.Function"
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.put(r3, r1)
            goto L1ae
        L1e0:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.size()
            int r1 = defpackage.dt.z(r1)
            r0.<init>(r1)
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1f5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L216
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            defpackage.ip.l(r2)
            java.lang.String r2 = defpackage.b50.P(r2)
            r0.put(r3, r2)
            goto L1f5
        L216:
            return
    }

    public ma(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.la
    public final java.lang.Class a() {
            r1 = this;
            java.lang.Class r0 = r1.a
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ma
            if (r0 == 0) goto L16
            java.lang.Class r0 = defpackage.ff.t(r1)
            yp r2 = (defpackage.yp) r2
            java.lang.Class r2 = defpackage.ff.t(r2)
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
            java.lang.Class r0 = defpackage.ff.t(r1)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
