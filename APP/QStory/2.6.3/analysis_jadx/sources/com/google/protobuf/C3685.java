package com.google.protobuf;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏兰子哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3685 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f11485 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3350 f11487;

    public C3685(C3350 c3350) {
        this.f11487 = c3350;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7927(InterfaceC3681 interfaceC3681, Object obj) {
        if (C3680.m7904(interfaceC3681.mo7807(), obj)) {
            return;
        }
        if (interfaceC3681.mo7807().getJavaType() == WireFormat$JavaType.MESSAGE && (obj instanceof InterfaceC3450)) {
            return;
        }
        Locale locale = Locale.ROOT;
        int number = interfaceC3681.getNumber();
        WireFormat$JavaType javaType = interfaceC3681.mo7807().getJavaType();
        String name = obj.getClass().getName();
        StringBuilder sb = new StringBuilder("Wrong object type used with protocol message reflection.\nField number: ");
        sb.append(number);
        sb.append(", field java type: ");
        sb.append(javaType);
        sb.append(", value type: ");
        C5925.m11310(AbstractC0053.m151(sb, name, "\n"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m7928(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC3450)) {
            return obj;
        }
        InterfaceC3450 interfaceC3450 = (InterfaceC3450) obj;
        return z ? interfaceC3450.buildPartial() : interfaceC3450.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Object m7929(InterfaceC3681 interfaceC3681, Object obj, boolean z) {
        if (obj == null || interfaceC3681.mo7804() != WireFormat$JavaType.MESSAGE) {
            return obj;
        }
        if (!interfaceC3681.mo7806()) {
            return m7928(obj, z);
        }
        if (!(obj instanceof List)) {
            C5925.m11311(AbstractC2442.m4581(obj, new StringBuilder("Repeated field should contains a List but actually contains type: ")));
            return null;
        }
        List arrayList = (List) obj;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj2 = arrayList.get(i);
            Object objM7928 = m7928(obj2, z);
            if (objM7928 != obj2) {
                if (arrayList == obj) {
                    arrayList = new ArrayList(arrayList);
                }
                arrayList.set(i, objM7928);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m7930(C3350 c3350, boolean z) {
        int i = c3350.f10995;
        for (int i2 = 0; i2 < i; i2++) {
            C3351 c3351M7407 = c3350.m7407(i2);
            c3351M7407.setValue(m7929((InterfaceC3681) c3351M7407.getKey(), c3351M7407.getValue(), z));
        }
        for (Map.Entry entry : c3350.m7406()) {
            entry.setValue(m7929((InterfaceC3681) entry.getKey(), entry.getValue(), z));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m7931(C3657 c3657) {
        return m7929(c3657, m7941(c3657), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m7932() {
        boolean z = this.f11486;
        C3350 c3350 = this.f11487;
        if (!z) {
            return c3350.f10993 ? c3350 : Collections.unmodifiableMap(c3350);
        }
        C3350 c3350M7903 = C3680.m7903(c3350, false, true);
        if (this.f11487.f10993) {
            c3350M7903.m7404();
            return c3350M7903;
        }
        m7930(c3350M7903, true);
        return c3350M7903;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7933() {
        if (this.f11485) {
            return;
        }
        this.f11487 = C3680.m7903(this.f11487, true, false);
        this.f11485 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7934(C3657 c3657) {
        m7933();
        this.f11487.remove(c3657);
        if (this.f11487.isEmpty()) {
            this.f11486 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3680 m7935(boolean z) {
        if (this.f11487.isEmpty()) {
            return C3680.f11477;
        }
        this.f11485 = false;
        C3350 c3350M7903 = this.f11487;
        if (this.f11484) {
            c3350M7903 = C3680.m7903(c3350M7903, false, false);
            m7930(c3350M7903, z);
        }
        C3680 c3680 = new C3680(c3350M7903);
        c3680.f11478 = this.f11486;
        return c3680;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7936(C3657 c3657, Object obj) {
        List arrayList;
        m7933();
        if (!c3657.mo7806()) {
            C5925.m11310("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        this.f11484 = this.f11484 || (obj instanceof InterfaceC3450);
        m7927(c3657, obj);
        Object objM7941 = m7941(c3657);
        if (objM7941 == null) {
            arrayList = new ArrayList();
            this.f11487.put(c3657, arrayList);
        } else {
            arrayList = (List) objM7941;
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
    public final void m7937(Map.Entry entry) {
        InterfaceC3681 interfaceC3681 = (InterfaceC3681) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C3383;
        if (interfaceC3681.mo7806()) {
            if (z) {
                C5925.m11311("Lazy fields can not be repeated");
                return;
            }
            List arrayList = (List) m7941(interfaceC3681);
            List list = (List) value;
            int size = list.size();
            if (arrayList == null) {
                arrayList = new ArrayList(size);
                this.f11487.put(interfaceC3681, arrayList);
            }
            for (int i = 0; i < size; i++) {
                arrayList.add(C3680.m7901(list.get(i)));
            }
            return;
        }
        if (interfaceC3681.mo7804() != WireFormat$JavaType.MESSAGE) {
            if (z) {
                C5925.m11311("Lazy fields must be message-valued");
                return;
            } else {
                this.f11487.put(interfaceC3681, C3680.m7901(value));
                return;
            }
        }
        Object objM7941 = m7941(interfaceC3681);
        if (objM7941 == null) {
            this.f11487.put(interfaceC3681, C3680.m7901(value));
            if (z) {
                this.f11486 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C3383) value).m7488();
        }
        if (!interfaceC3681.mo7805(objM7941)) {
            interfaceC3681.mo7808(objM7941, value);
            return;
        }
        InterfaceC3450 builder = ((InterfaceC3441) objM7941).toBuilder();
        interfaceC3681.mo7808(builder, value);
        this.f11487.put(interfaceC3681, builder.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7938(C3657 c3657, Object obj) {
        m7933();
        if (!c3657.mo7806()) {
            m7927(c3657, obj);
        } else {
            if (!(obj instanceof List)) {
                C5925.m11310("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = arrayList.get(i);
                m7927(c3657, obj2);
                this.f11484 = this.f11484 || (obj2 instanceof InterfaceC3450);
            }
            obj = arrayList;
        }
        if (obj instanceof C3383) {
            this.f11486 = true;
        }
        this.f11484 = this.f11484 || (obj instanceof InterfaceC3450);
        this.f11487.put(c3657, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7939(C3657 c3657, int i, Object obj) {
        m7933();
        if (!c3657.mo7806()) {
            C5925.m11310("getRepeatedField() can only be called on repeated fields.");
            return;
        }
        this.f11484 = this.f11484 || (obj instanceof InterfaceC3450);
        Object objM7941 = m7941(c3657);
        if (objM7941 == null) {
            throw new IndexOutOfBoundsException();
        }
        m7927(c3657, obj);
        ((List) objM7941).set(i, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m7940(InterfaceC3681 interfaceC3681, int i) {
        if (!interfaceC3681.mo7806()) {
            C5925.m11310("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM7941 = m7941(interfaceC3681);
        if (objM7941 != null) {
            return ((List) objM7941).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m7941(InterfaceC3681 interfaceC3681) {
        Object obj = this.f11487.get(interfaceC3681);
        return obj instanceof C3383 ? ((C3383) obj).m7488() : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m7942() {
        int i = this.f11487.f10995;
        int i2 = 0;
        while (true) {
            C3350 c3350 = this.f11487;
            if (i2 >= i) {
                Iterator it = c3350.m7406().iterator();
                while (it.hasNext()) {
                    if (!C3680.m7905((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!C3680.m7905(c3350.m7407(i2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7943(C3680 c3680) {
        C3350 c3350;
        m7933();
        int i = c3680.f11480.f10995;
        int i2 = 0;
        while (true) {
            c3350 = c3680.f11480;
            if (i2 >= i) {
                break;
            }
            m7937(c3350.m7407(i2));
            i2++;
        }
        Iterator it = c3350.m7406().iterator();
        while (it.hasNext()) {
            m7937((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7944(C3657 c3657) {
        if (!c3657.mo7806()) {
            C5925.m11310("getRepeatedFieldCount() can only be called on repeated fields.");
            return 0;
        }
        Object objM7941 = m7941(c3657);
        if (objM7941 == null) {
            return 0;
        }
        return ((List) objM7941).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m7945(C3657 c3657) {
        if (!c3657.mo7806()) {
            return this.f11487.get(c3657) != null;
        }
        C5925.m11310("hasField() can only be called on non-repeated fields.");
        return false;
    }
}
