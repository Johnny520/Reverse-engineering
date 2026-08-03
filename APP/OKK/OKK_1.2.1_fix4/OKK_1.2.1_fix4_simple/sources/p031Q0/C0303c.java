package p031Q0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0193x;
import p009E0.C0191v;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0276b;
import p029P0.InterfaceC0277c;
import p029P0.InterfaceC0278d;
import p029P0.InterfaceC0279e;
import p029P0.InterfaceC0280f;
import p029P0.InterfaceC0281g;
import p029P0.InterfaceC0282h;
import p029P0.InterfaceC0283i;
import p029P0.InterfaceC0284j;
import p029P0.InterfaceC0285k;
import p029P0.InterfaceC0286l;
import p029P0.InterfaceC0287m;
import p029P0.InterfaceC0288n;
import p029P0.InterfaceC0289o;
import p029P0.InterfaceC0290p;
import p029P0.InterfaceC0291q;
import p029P0.InterfaceC0292r;
import p029P0.InterfaceC0293s;
import p029P0.InterfaceC0294t;
import p029P0.InterfaceC0295u;
import p029P0.InterfaceC0296v;
import p038U0.InterfaceC0391a;
import p042W0.AbstractC0425j;
import p056f0.C0817b;

/* JADX INFO: renamed from: Q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0303c implements InterfaceC0391a, InterfaceC0302b {

    /* JADX INFO: renamed from: b */
    public static final Map f580b = null;

    /* JADX INFO: renamed from: a */
    public final Class f581a;

    static {
        List r02 = AbstractC0182m.m556h0(new Class[]{InterfaceC0275a.class, InterfaceC0286l.class, InterfaceC0290p.class, C0817b.class, InterfaceC0291q.class, InterfaceC0292r.class, InterfaceC0293s.class, InterfaceC0294t.class, InterfaceC0295u.class, InterfaceC0296v.class, InterfaceC0276b.class, InterfaceC0277c.class, InterfaceC0278d.class, InterfaceC0279e.class, InterfaceC0280f.class, InterfaceC0281g.class, InterfaceC0282h.class, InterfaceC0283i.class, InterfaceC0284j.class, InterfaceC0285k.class, InterfaceC0287m.class, InterfaceC0288n.class, InterfaceC0289o.class});
        ArrayList r1 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator r03 = r02.iterator();
        int r2 = 0;
    L4:
        if (r03.hasNext() == false) goto L10;
        Object r3 = r03.next();
        int r4 = r2 + 1;
        if (r2 < 0) goto L8;
        r1.add(new C0139e((Class) r3, Integer.valueOf(r2)));
        r2 = r4;
        goto L4
    L8:
        AbstractC0182m.m558j0();
        throw null;
    L10:
        Map r04 = C0191v.f402a;
        int r22 = r1.size();
        if (r22 != 0) goto L13;
    L19:
        f580b = r04;
        HashMap r05 = new HashMap();
        r05.put("boolean", "kotlin.Boolean");
        r05.put("char", "kotlin.Char");
        r05.put("byte", "kotlin.Byte");
        r05.put("short", "kotlin.Short");
        r05.put("int", "kotlin.Int");
        r05.put("float", "kotlin.Float");
        r05.put("long", "kotlin.Long");
        r05.put("double", "kotlin.Double");
        HashMap r12 = new HashMap();
        r12.put("java.lang.Boolean", "kotlin.Boolean");
        r12.put("java.lang.Character", "kotlin.Char");
        r12.put("java.lang.Byte", "kotlin.Byte");
        r12.put("java.lang.Short", "kotlin.Short");
        r12.put("java.lang.Integer", "kotlin.Int");
        r12.put("java.lang.Float", "kotlin.Float");
        r12.put("java.lang.Long", "kotlin.Long");
        r12.put("java.lang.Double", "kotlin.Double");
        HashMap r23 = new HashMap();
        r23.put("java.lang.Object", "kotlin.Any");
        r23.put("java.lang.String", "kotlin.String");
        r23.put("java.lang.CharSequence", "kotlin.CharSequence");
        r23.put("java.lang.Throwable", "kotlin.Throwable");
        r23.put("java.lang.Cloneable", "kotlin.Cloneable");
        r23.put("java.lang.Number", "kotlin.Number");
        r23.put("java.lang.Comparable", "kotlin.Comparable");
        r23.put("java.lang.Enum", "kotlin.Enum");
        r23.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        r23.put("java.lang.Iterable", "kotlin.collections.Iterable");
        r23.put("java.util.Iterator", "kotlin.collections.Iterator");
        r23.put("java.util.Collection", "kotlin.collections.Collection");
        r23.put("java.util.List", "kotlin.collections.List");
        r23.put("java.util.Set", "kotlin.collections.Set");
        r23.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        r23.put("java.util.Map", "kotlin.collections.Map");
        r23.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        r23.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        r23.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        r23.putAll(r05);
        r23.putAll(r12);
        Collection r06 = r05.values();
        AbstractC0307g.m702d(r06, "<get-values>(...)");
        Iterator r07 = r06.iterator();
    L21:
        if (r07.hasNext() == false) goto L23;
        String r13 = (String) r07.next();
        StringBuilder r32 = new StringBuilder("kotlin.jvm.internal.");
        AbstractC0307g.m700b(r13);
        r32.append(AbstractC0425j.m1020Y0(r13));
        r32.append("CompanionObject");
        r23.put(r32.toString(), r13.concat(".Companion"));
        goto L21
    L23:
        Iterator r08 = f580b.entrySet().iterator();
    L25:
        if (r08.hasNext() == false) goto L27;
        Map.Entry r14 = (Map.Entry) r08.next();
        Class r33 = (Class) r14.getKey();
        int r15 = ((Number) r14.getValue()).intValue();
        r23.put(r33.getName(), "kotlin.Function" + r15);
        goto L25
    L27:
        LinkedHashMap r09 = new LinkedHashMap(AbstractC0193x.m563g0(r23.size()));
        Iterator r16 = r23.entrySet().iterator();
    L29:
        if (r16.hasNext() == false) goto L31;
        Map.Entry r24 = (Map.Entry) r16.next();
        r09.put(r24.getKey(), AbstractC0425j.m1020Y0((String) r24.getValue()));
        goto L29
    L31:
        return;
    L13:
        if (r22 == 1) goto L18;
        r04 = new LinkedHashMap(AbstractC0193x.m563g0(r1.size()));
        Iterator r17 = r1.iterator();
    L16:
        if (r17.hasNext() == false) goto L19;
        C0139e r25 = (C0139e) r17.next();
        r04.put(r25.f328a, r25.f329b);
        goto L16
    L18:
        C0139e r010 = (C0139e) r1.get(0);
        AbstractC0307g.m703e(r010, "pair");
        r04 = Collections.singletonMap(r010.f328a, r010.f329b);
        AbstractC0307g.m702d(r04, "singletonMap(...)");
        goto L19
    }

    public C0303c(Class r2) {
        AbstractC0307g.m703e(r2, "jClass");
        this.f581a = r2;
    }

    @Override // p031Q0.InterfaceC0302b
    /* JADX INFO: renamed from: a */
    public final Class mo696a() {
        return this.f581a;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0303c) == true) goto L5;
    L7:
        return false;
    L5:
        if (AbstractC0040p.m118x(this).equals(AbstractC0040p.m118x((InterfaceC0391a) r2)) == false) goto L7;
        return true;
    }

    public final int hashCode() {
        return AbstractC0040p.m118x(this).hashCode();
    }

    public final String toString() {
        return this.f581a.toString() + " (Kotlin reflection is not available)";
    }
}
