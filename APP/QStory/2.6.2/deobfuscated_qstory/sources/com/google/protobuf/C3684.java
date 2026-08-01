package com.google.protobuf;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏兰子哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3684 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f11480 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3349 f11482;

    public C3684(C3349 c3349) {
        this.f11482 = c3349;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7940(InterfaceC3680 interfaceC3680, Object obj) {
        if (C3679.m7917(interfaceC3680.mo7820(), obj)) {
            return;
        }
        if (interfaceC3680.mo7820().getJavaType() == WireFormat$JavaType.MESSAGE && (obj instanceof InterfaceC3449)) {
            return;
        }
        Locale locale = Locale.ROOT;
        int number = interfaceC3680.getNumber();
        WireFormat$JavaType javaType = interfaceC3680.mo7820().getJavaType();
        String name = obj.getClass().getName();
        StringBuilder sb = new StringBuilder("Wrong object type used with protocol message reflection.\nField number: ");
        sb.append(number);
        sb.append(", field java type: ");
        sb.append(javaType);
        sb.append(", value type: ");
        C5919.m11249(AbstractC0053.m146(sb, name, "\n"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m7941(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC3449)) {
            return obj;
        }
        InterfaceC3449 interfaceC3449 = (InterfaceC3449) obj;
        return z ? interfaceC3449.buildPartial() : interfaceC3449.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Object m7942(InterfaceC3680 interfaceC3680, Object obj, boolean z) {
        if (obj == null || interfaceC3680.mo7817() != WireFormat$JavaType.MESSAGE) {
            return obj;
        }
        if (!interfaceC3680.mo7819()) {
            return m7941(obj, z);
        }
        if (!(obj instanceof List)) {
            C5919.m11250(AbstractC2442.m4571(obj, new StringBuilder("Repeated field should contains a List but actually contains type: ")));
            return null;
        }
        List arrayList = (List) obj;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj2 = arrayList.get(i);
            Object objM7941 = m7941(obj2, z);
            if (objM7941 != obj2) {
                if (arrayList == obj) {
                    arrayList = new ArrayList(arrayList);
                }
                arrayList.set(i, objM7941);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m7943(C3349 c3349, boolean z) {
        int i = c3349.f10990;
        for (int i2 = 0; i2 < i; i2++) {
            C3350 c3350M7420 = c3349.m7420(i2);
            c3350M7420.setValue(m7942((InterfaceC3680) c3350M7420.getKey(), c3350M7420.getValue(), z));
        }
        for (Map.Entry entry : c3349.m7419()) {
            entry.setValue(m7942((InterfaceC3680) entry.getKey(), entry.getValue(), z));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m7944(C3656 c3656) {
        return m7942(c3656, m7954(c3656), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m7945() {
        boolean z = this.f11481;
        C3349 c3349 = this.f11482;
        if (!z) {
            return c3349.f10988 ? c3349 : Collections.unmodifiableMap(c3349);
        }
        C3349 c3349M7916 = C3679.m7916(c3349, false, true);
        if (this.f11482.f10988) {
            c3349M7916.m7417();
            return c3349M7916;
        }
        m7943(c3349M7916, true);
        return c3349M7916;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7946() {
        if (this.f11480) {
            return;
        }
        this.f11482 = C3679.m7916(this.f11482, true, false);
        this.f11480 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7947(C3656 c3656) {
        m7946();
        this.f11482.remove(c3656);
        if (this.f11482.isEmpty()) {
            this.f11481 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3679 m7948(boolean z) {
        if (this.f11482.isEmpty()) {
            return C3679.f11472;
        }
        this.f11480 = false;
        C3349 c3349M7916 = this.f11482;
        if (this.f11479) {
            c3349M7916 = C3679.m7916(c3349M7916, false, false);
            m7943(c3349M7916, z);
        }
        C3679 c3679 = new C3679(c3349M7916);
        c3679.f11473 = this.f11481;
        return c3679;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7949(C3656 c3656, Object obj) {
        List arrayList;
        m7946();
        if (!c3656.mo7819()) {
            C5919.m11249("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        this.f11479 = this.f11479 || (obj instanceof InterfaceC3449);
        m7940(c3656, obj);
        Object objM7954 = m7954(c3656);
        if (objM7954 == null) {
            arrayList = new ArrayList();
            this.f11482.put(c3656, arrayList);
        } else {
            arrayList = (List) objM7954;
        }
        arrayList.add(obj);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7950(Map.Entry entry) {
        InterfaceC3680 interfaceC3680 = (InterfaceC3680) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C3382;
        if (interfaceC3680.mo7819()) {
            if (z) {
                C5919.m11250("Lazy fields can not be repeated");
                return;
            }
            List arrayList = (List) m7954(interfaceC3680);
            List list = (List) value;
            int size = list.size();
            if (arrayList == null) {
                arrayList = new ArrayList(size);
                this.f11482.put(interfaceC3680, arrayList);
            }
            for (int i = 0; i < size; i++) {
                arrayList.add(C3679.m7914(list.get(i)));
            }
            return;
        }
        if (interfaceC3680.mo7817() != WireFormat$JavaType.MESSAGE) {
            if (z) {
                C5919.m11250("Lazy fields must be message-valued");
                return;
            } else {
                this.f11482.put(interfaceC3680, C3679.m7914(value));
                return;
            }
        }
        Object objM7954 = m7954(interfaceC3680);
        if (objM7954 == null) {
            this.f11482.put(interfaceC3680, C3679.m7914(value));
            if (z) {
                this.f11481 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C3382) value).m7501();
        }
        if (!interfaceC3680.mo7818(objM7954)) {
            interfaceC3680.mo7821(objM7954, value);
            return;
        }
        InterfaceC3449 builder = ((InterfaceC3440) objM7954).toBuilder();
        interfaceC3680.mo7821(builder, value);
        this.f11482.put(interfaceC3680, builder.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7951(C3656 c3656, Object obj) {
        m7946();
        if (!c3656.mo7819()) {
            m7940(c3656, obj);
        } else {
            if (!(obj instanceof List)) {
                C5919.m11249("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = arrayList.get(i);
                m7940(c3656, obj2);
                this.f11479 = this.f11479 || (obj2 instanceof InterfaceC3449);
            }
            obj = arrayList;
        }
        if (obj instanceof C3382) {
            this.f11481 = true;
        }
        this.f11479 = this.f11479 || (obj instanceof InterfaceC3449);
        this.f11482.put(c3656, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7952(C3656 c3656, int i, Object obj) {
        m7946();
        if (!c3656.mo7819()) {
            C5919.m11249("getRepeatedField() can only be called on repeated fields.");
            return;
        }
        this.f11479 = this.f11479 || (obj instanceof InterfaceC3449);
        Object objM7954 = m7954(c3656);
        if (objM7954 == null) {
            throw new IndexOutOfBoundsException();
        }
        m7940(c3656, obj);
        ((List) objM7954).set(i, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m7953(InterfaceC3680 interfaceC3680, int i) {
        if (!interfaceC3680.mo7819()) {
            C5919.m11249("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM7954 = m7954(interfaceC3680);
        if (objM7954 != null) {
            return ((List) objM7954).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m7954(InterfaceC3680 interfaceC3680) {
        Object obj = this.f11482.get(interfaceC3680);
        return obj instanceof C3382 ? ((C3382) obj).m7501() : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m7955() {
        int i = this.f11482.f10990;
        int i2 = 0;
        while (true) {
            C3349 c3349 = this.f11482;
            if (i2 >= i) {
                Iterator it = c3349.m7419().iterator();
                while (it.hasNext()) {
                    if (!C3679.m7918((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!C3679.m7918(c3349.m7420(i2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7956(C3679 c3679) {
        C3349 c3349;
        m7946();
        int i = c3679.f11475.f10990;
        int i2 = 0;
        while (true) {
            c3349 = c3679.f11475;
            if (i2 >= i) {
                break;
            }
            m7950(c3349.m7420(i2));
            i2++;
        }
        Iterator it = c3349.m7419().iterator();
        while (it.hasNext()) {
            m7950((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7957(C3656 c3656) {
        if (!c3656.mo7819()) {
            C5919.m11249("getRepeatedFieldCount() can only be called on repeated fields.");
            return 0;
        }
        Object objM7954 = m7954(c3656);
        if (objM7954 == null) {
            return 0;
        }
        return ((List) objM7954).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m7958(C3656 c3656) {
        if (!c3656.mo7819()) {
            return this.f11482.get(c3656) != null;
        }
        C5919.m11249("hasField() can only be called on non-repeated fields.");
        return false;
    }
}
