package com.google.protobuf;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏兰子哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4517 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f11830 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4182 f11832;

    public C4517(C4182 c4182) {
        this.f11832 = c4182;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m8486(InterfaceC4513 interfaceC4513, Object obj) {
        if (C4512.m8463(interfaceC4513.mo8366(), obj)) {
            return;
        }
        if (interfaceC4513.mo8366().getJavaType() == WireFormat$JavaType.MESSAGE && (obj instanceof InterfaceC4282)) {
            return;
        }
        Locale locale = Locale.ROOT;
        int number = interfaceC4513.getNumber();
        WireFormat$JavaType javaType = interfaceC4513.mo8366().getJavaType();
        String name = obj.getClass().getName();
        StringBuilder sb = new StringBuilder("Wrong object type used with protocol message reflection.\nField number: ");
        sb.append(number);
        sb.append(", field java type: ");
        sb.append(javaType);
        sb.append(", value type: ");
        C6755.m11869(AbstractC0900.m711(sb, name, "\n"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m8487(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC4282)) {
            return obj;
        }
        InterfaceC4282 interfaceC4282 = (InterfaceC4282) obj;
        return z ? interfaceC4282.buildPartial() : interfaceC4282.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Object m8488(InterfaceC4513 interfaceC4513, Object obj, boolean z) {
        if (obj == null || interfaceC4513.mo8363() != WireFormat$JavaType.MESSAGE) {
            return obj;
        }
        if (!interfaceC4513.mo8365()) {
            return m8487(obj, z);
        }
        if (!(obj instanceof List)) {
            C6755.m11870(AbstractC3275.m5141(obj, new StringBuilder("Repeated field should contains a List but actually contains type: ")));
            return null;
        }
        List arrayList = (List) obj;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj2 = arrayList.get(i);
            Object objM8487 = m8487(obj2, z);
            if (objM8487 != obj2) {
                if (arrayList == obj) {
                    arrayList = new ArrayList(arrayList);
                }
                arrayList.set(i, objM8487);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m8489(C4182 c4182, boolean z) {
        int i = c4182.f11340;
        for (int i2 = 0; i2 < i; i2++) {
            C4183 c4183M7966 = c4182.m7966(i2);
            c4183M7966.setValue(m8488((InterfaceC4513) c4183M7966.getKey(), c4183M7966.getValue(), z));
        }
        for (Map.Entry entry : c4182.m7965()) {
            entry.setValue(m8488((InterfaceC4513) entry.getKey(), entry.getValue(), z));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m8490(C4489 c4489) {
        return m8488(c4489, m8500(c4489), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m8491() {
        boolean z = this.f11831;
        C4182 c4182 = this.f11832;
        if (!z) {
            return c4182.f11338 ? c4182 : Collections.unmodifiableMap(c4182);
        }
        C4182 c4182M8462 = C4512.m8462(c4182, false, true);
        if (this.f11832.f11338) {
            c4182M8462.m7963();
            return c4182M8462;
        }
        m8489(c4182M8462, true);
        return c4182M8462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8492() {
        if (this.f11830) {
            return;
        }
        this.f11832 = C4512.m8462(this.f11832, true, false);
        this.f11830 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8493(C4489 c4489) {
        m8492();
        this.f11832.remove(c4489);
        if (this.f11832.isEmpty()) {
            this.f11831 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4512 m8494(boolean z) {
        if (this.f11832.isEmpty()) {
            return C4512.f11822;
        }
        this.f11830 = false;
        C4182 c4182M8462 = this.f11832;
        if (this.f11829) {
            c4182M8462 = C4512.m8462(c4182M8462, false, false);
            m8489(c4182M8462, z);
        }
        C4512 c4512 = new C4512(c4182M8462);
        c4512.f11823 = this.f11831;
        return c4512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8495(C4489 c4489, Object obj) {
        List arrayList;
        m8492();
        if (!c4489.mo8365()) {
            C6755.m11869("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        this.f11829 = this.f11829 || (obj instanceof InterfaceC4282);
        m8486(c4489, obj);
        Object objM8500 = m8500(c4489);
        if (objM8500 == null) {
            arrayList = new ArrayList();
            this.f11832.put(c4489, arrayList);
        } else {
            arrayList = (List) objM8500;
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
    public final void m8496(Map.Entry entry) {
        InterfaceC4513 interfaceC4513 = (InterfaceC4513) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C4215;
        if (interfaceC4513.mo8365()) {
            if (z) {
                C6755.m11870("Lazy fields can not be repeated");
                return;
            }
            List arrayList = (List) m8500(interfaceC4513);
            List list = (List) value;
            int size = list.size();
            if (arrayList == null) {
                arrayList = new ArrayList(size);
                this.f11832.put(interfaceC4513, arrayList);
            }
            for (int i = 0; i < size; i++) {
                arrayList.add(C4512.m8460(list.get(i)));
            }
            return;
        }
        if (interfaceC4513.mo8363() != WireFormat$JavaType.MESSAGE) {
            if (z) {
                C6755.m11870("Lazy fields must be message-valued");
                return;
            } else {
                this.f11832.put(interfaceC4513, C4512.m8460(value));
                return;
            }
        }
        Object objM8500 = m8500(interfaceC4513);
        if (objM8500 == null) {
            this.f11832.put(interfaceC4513, C4512.m8460(value));
            if (z) {
                this.f11831 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C4215) value).m8047();
        }
        if (!interfaceC4513.mo8364(objM8500)) {
            interfaceC4513.mo8367(objM8500, value);
            return;
        }
        InterfaceC4282 builder = ((InterfaceC4273) objM8500).toBuilder();
        interfaceC4513.mo8367(builder, value);
        this.f11832.put(interfaceC4513, builder.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m8497(C4489 c4489, Object obj) {
        m8492();
        if (!c4489.mo8365()) {
            m8486(c4489, obj);
        } else {
            if (!(obj instanceof List)) {
                C6755.m11869("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = arrayList.get(i);
                m8486(c4489, obj2);
                this.f11829 = this.f11829 || (obj2 instanceof InterfaceC4282);
            }
            obj = arrayList;
        }
        if (obj instanceof C4215) {
            this.f11831 = true;
        }
        this.f11829 = this.f11829 || (obj instanceof InterfaceC4282);
        this.f11832.put(c4489, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m8498(C4489 c4489, int i, Object obj) {
        m8492();
        if (!c4489.mo8365()) {
            C6755.m11869("getRepeatedField() can only be called on repeated fields.");
            return;
        }
        this.f11829 = this.f11829 || (obj instanceof InterfaceC4282);
        Object objM8500 = m8500(c4489);
        if (objM8500 == null) {
            throw new IndexOutOfBoundsException();
        }
        m8486(c4489, obj);
        ((List) objM8500).set(i, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m8499(InterfaceC4513 interfaceC4513, int i) {
        if (!interfaceC4513.mo8365()) {
            C6755.m11869("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM8500 = m8500(interfaceC4513);
        if (objM8500 != null) {
            return ((List) objM8500).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m8500(InterfaceC4513 interfaceC4513) {
        Object obj = this.f11832.get(interfaceC4513);
        return obj instanceof C4215 ? ((C4215) obj).m8047() : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m8501() {
        int i = this.f11832.f11340;
        int i2 = 0;
        while (true) {
            C4182 c4182 = this.f11832;
            if (i2 >= i) {
                Iterator it = c4182.m7965().iterator();
                while (it.hasNext()) {
                    if (!C4512.m8464((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!C4512.m8464(c4182.m7966(i2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m8502(C4512 c4512) {
        C4182 c4182;
        m8492();
        int i = c4512.f11825.f11340;
        int i2 = 0;
        while (true) {
            c4182 = c4512.f11825;
            if (i2 >= i) {
                break;
            }
            m8496(c4182.m7966(i2));
            i2++;
        }
        Iterator it = c4182.m7965().iterator();
        while (it.hasNext()) {
            m8496((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m8503(C4489 c4489) {
        if (!c4489.mo8365()) {
            C6755.m11869("getRepeatedFieldCount() can only be called on repeated fields.");
            return 0;
        }
        Object objM8500 = m8500(c4489);
        if (objM8500 == null) {
            return 0;
        }
        return ((List) objM8500).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m8504(C4489 c4489) {
        if (!c4489.mo8365()) {
            return this.f11832.get(c4489) != null;
        }
        C6755.m11869("hasField() can only be called on non-repeated fields.");
        return false;
    }
}
