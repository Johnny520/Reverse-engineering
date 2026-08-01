package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ma implements yp, la {
    public static final Map b = null;
    public final Class a;

    static {
        List r0 = bb.f0(new Class[]{hm.class, sm.class, wm.class, jb.class, jb.class, jb.class, jb.class, xm.class, ym.class, zm.class, im.class, jm.class, km.class, lm.class, mm.class, nm.class, om.class, pm.class, qm.class, rm.class, tm.class, um.class, vm.class});
        ArrayList r1 = new ArrayList(cb.h0(r0));
        Iterator r02 = r0.iterator();
        int r2 = 0;
    L4:
        if (r02.hasNext() == false) goto L10;
        Object r3 = r02.next();
        int r4 = r2 + 1;
        if (r2 < 0) goto L8;
        r1.add(new kx((Class) r3, Integer.valueOf(r2)));
        r2 = r4;
        goto L4
    L8:
        bb.g0();
        throw null;
    L10:
        b = dt.A(r1);
        HashMap r03 = new HashMap();
        r03.put("boolean", "kotlin.Boolean");
        r03.put("char", "kotlin.Char");
        r03.put("byte", "kotlin.Byte");
        r03.put("short", "kotlin.Short");
        r03.put("int", "kotlin.Int");
        r03.put("float", "kotlin.Float");
        r03.put("long", "kotlin.Long");
        r03.put("double", "kotlin.Double");
        HashMap r12 = new HashMap();
        r12.put("java.lang.Boolean", "kotlin.Boolean");
        r12.put("java.lang.Character", "kotlin.Char");
        r12.put("java.lang.Byte", "kotlin.Byte");
        r12.put("java.lang.Short", "kotlin.Short");
        r12.put("java.lang.Integer", "kotlin.Int");
        r12.put("java.lang.Float", "kotlin.Float");
        r12.put("java.lang.Long", "kotlin.Long");
        r12.put("java.lang.Double", "kotlin.Double");
        HashMap r22 = new HashMap();
        r22.put("java.lang.Object", "kotlin.Any");
        r22.put("java.lang.String", "kotlin.String");
        r22.put("java.lang.CharSequence", "kotlin.CharSequence");
        r22.put("java.lang.Throwable", "kotlin.Throwable");
        r22.put("java.lang.Cloneable", "kotlin.Cloneable");
        r22.put("java.lang.Number", "kotlin.Number");
        r22.put("java.lang.Comparable", "kotlin.Comparable");
        r22.put("java.lang.Enum", "kotlin.Enum");
        r22.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        r22.put("java.lang.Iterable", "kotlin.collections.Iterable");
        r22.put("java.util.Iterator", "kotlin.collections.Iterator");
        r22.put("java.util.Collection", "kotlin.collections.Collection");
        r22.put("java.util.List", "kotlin.collections.List");
        r22.put("java.util.Set", "kotlin.collections.Set");
        r22.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        r22.put("java.util.Map", "kotlin.collections.Map");
        r22.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        r22.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        r22.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        r22.putAll(r03);
        r22.putAll(r12);
        Collection r04 = r03.values();
        ip.n("<get-values>(...)", r04);
        Iterator r05 = r04.iterator();
    L12:
        if (r05.hasNext() == false) goto L14;
        String r13 = (String) r05.next();
        StringBuilder r32 = new StringBuilder("kotlin.jvm.internal.");
        ip.l(r13);
        r32.append(b50.P(r13));
        r32.append("CompanionObject");
        r22.put(r32.toString(), r13.concat(".Companion"));
        goto L12
    L14:
        Iterator r06 = b.entrySet().iterator();
    L16:
        if (r06.hasNext() == false) goto L18;
        Map.Entry r14 = (Map.Entry) r06.next();
        Class r33 = (Class) r14.getKey();
        int r15 = ((Number) r14.getValue()).intValue();
        r22.put(r33.getName(), "kotlin.Function" + r15);
        goto L16
    L18:
        LinkedHashMap r07 = new LinkedHashMap(dt.z(r22.size()));
        Iterator r16 = r22.entrySet().iterator();
    L20:
        if (r16.hasNext() == false) goto L22;
        Map.Entry r23 = (Map.Entry) r16.next();
        Object r34 = r23.getKey();
        String r24 = (String) r23.getValue();
        ip.l(r24);
        r07.put(r34, b50.P(r24));
        goto L20
    }

    public ma(Class r1) {
        this.a = r1;
    }

    @Override // defpackage.la
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ma) == true) goto L5;
        return false;
    L5:
        if (ff.t(this).equals(ff.t((yp) r2)) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return ff.t(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
