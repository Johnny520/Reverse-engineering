package com.google.protobuf;

import androidx.collection.C0262;
import bsh.C2633;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏兰世哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3680 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3680 f11477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f11478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3350 f11480;

    static {
        C3680 c3680 = new C3680(C3350.m7403());
        c3680.m7914();
        f11477 = c3680;
    }

    public C3680() {
        this.f11480 = C3350.m7403();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m7895(Map.Entry entry, AbstractC3462 abstractC3462) {
        InterfaceC3681 interfaceC3681 = (InterfaceC3681) entry.getKey();
        if (interfaceC3681.mo7804() != WireFormat$JavaType.MESSAGE || interfaceC3681.mo7806() || interfaceC3681.isPacked()) {
            m7896(interfaceC3681, entry.getValue(), abstractC3462);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof C3383)) {
            abstractC3462.mo7659(((InterfaceC3681) entry.getKey()).getNumber(), (InterfaceC3441) value);
        } else {
            abstractC3462.mo7658(((InterfaceC3681) entry.getKey()).getNumber(), ((C3383) value).m7487());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m7896(InterfaceC3681 interfaceC3681, Object obj, AbstractC3462 abstractC3462) {
        WireFormat$FieldType wireFormat$FieldTypeMo7807 = interfaceC3681.mo7807();
        int number = interfaceC3681.getNumber();
        if (!interfaceC3681.mo7806()) {
            if (obj instanceof C3383) {
                m7898(abstractC3462, wireFormat$FieldTypeMo7807, number, ((C3383) obj).m7488());
                return;
            } else {
                m7898(abstractC3462, wireFormat$FieldTypeMo7807, number, obj);
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!interfaceC3681.isPacked()) {
            while (i < size) {
                m7898(abstractC3462, wireFormat$FieldTypeMo7807, number, list.get(i));
                i++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            abstractC3462.mo7655(number, 2);
            int iM7907 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iM7907 += m7907(wireFormat$FieldTypeMo7807, list.get(i2));
            }
            abstractC3462.mo7645(iM7907);
            while (i < size) {
                m7897(abstractC3462, wireFormat$FieldTypeMo7807, list.get(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7897(AbstractC3462 abstractC3462, WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (AbstractC3684.f11482[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC3462.getClass();
                abstractC3462.mo7652(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC3462.getClass();
                abstractC3462.mo7654(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC3462.mo7647(((Long) obj).longValue());
                break;
            case 4:
                abstractC3462.mo7647(((Long) obj).longValue());
                break;
            case 5:
                abstractC3462.mo7650(((Integer) obj).intValue());
                break;
            case 6:
                abstractC3462.mo7652(((Long) obj).longValue());
                break;
            case 7:
                abstractC3462.mo7654(((Integer) obj).intValue());
                break;
            case 8:
                abstractC3462.mo7669(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC3462.getClass();
                ((InterfaceC3441) obj).writeTo(abstractC3462);
                break;
            case 10:
                abstractC3462.mo7660((InterfaceC3441) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    abstractC3462.mo7656((String) obj);
                } else {
                    abstractC3462.mo7667((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC3462.getClass();
                    abstractC3462.mo7662(bArr, bArr.length);
                } else {
                    abstractC3462.mo7667((ByteString) obj);
                }
                break;
            case 13:
                abstractC3462.mo7645(((Integer) obj).intValue());
                break;
            case 14:
                abstractC3462.mo7654(((Integer) obj).intValue());
                break;
            case 15:
                abstractC3462.mo7652(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC3462.mo7645((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC3462.mo7647((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof InterfaceC3399)) {
                    abstractC3462.mo7650(((Integer) obj).intValue());
                } else {
                    abstractC3462.mo7650(((InterfaceC3399) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7898(AbstractC3462 abstractC3462, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType != WireFormat$FieldType.GROUP) {
            abstractC3462.mo7655(i, wireFormat$FieldType.getWireType());
            m7897(abstractC3462, wireFormat$FieldType, obj);
        } else {
            abstractC3462.mo7655(i, 3);
            ((InterfaceC3441) obj).writeTo(abstractC3462);
            abstractC3462.mo7655(i, 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m7899(InterfaceC3681 interfaceC3681, Object obj) {
        if (!m7904(interfaceC3681.mo7807(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC3681.getNumber()), interfaceC3681.mo7807().getJavaType(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m7900(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int iM7642 = AbstractC3462.m7642(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            iM7642 *= 2;
        }
        return m7907(wireFormat$FieldType, obj) + iM7642;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m7901(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m7902(C3350 c3350, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC3681 interfaceC3681 = (InterfaceC3681) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C3383)) {
            c3350.put(interfaceC3681, ((C3383) value).m7488());
        } else if (z && (value instanceof List)) {
            c3350.put(interfaceC3681, new ArrayList((List) value));
        } else {
            c3350.put(interfaceC3681, value);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3350 m7903(C3350 c3350, boolean z, boolean z2) {
        C3350 c3350M7403 = C3350.m7403();
        int i = c3350.f10995;
        for (int i2 = 0; i2 < i; i2++) {
            m7902(c3350M7403, c3350.m7407(i2), z, z2);
        }
        Iterator it = c3350.m7406().iterator();
        while (it.hasNext()) {
            m7902(c3350M7403, (Map.Entry) it.next(), z, z2);
        }
        return c3350M7403;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static boolean m7904(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        Charset charset = AbstractC3402.f11059;
        obj.getClass();
        switch (AbstractC3684.f11483[wireFormat$FieldType.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC3399)) {
                }
                break;
            case 9:
                if ((obj instanceof InterfaceC3441) || (obj instanceof C3383)) {
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m7905(Map.Entry entry) {
        boolean zIsInitialized;
        InterfaceC3681 interfaceC3681 = (InterfaceC3681) entry.getKey();
        if (interfaceC3681.mo7804() == WireFormat$JavaType.MESSAGE) {
            if (!interfaceC3681.mo7806()) {
                Object value = entry.getValue();
                if (value instanceof InterfaceC3440) {
                    return ((InterfaceC3440) value).isInitialized();
                }
                if (value instanceof C3383) {
                    return true;
                }
                C5925.m11310("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof InterfaceC3440) {
                    zIsInitialized = ((InterfaceC3440) obj).isInitialized();
                } else {
                    if (!(obj instanceof C3383)) {
                        C5925.m11310("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m7906(InterfaceC3681 interfaceC3681, Object obj) {
        WireFormat$FieldType wireFormat$FieldTypeMo7807 = interfaceC3681.mo7807();
        int number = interfaceC3681.getNumber();
        if (!interfaceC3681.mo7806()) {
            return m7900(wireFormat$FieldTypeMo7807, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!interfaceC3681.isPacked()) {
            int iM7900 = 0;
            while (i < size) {
                iM7900 += m7900(wireFormat$FieldTypeMo7807, number, list.get(i));
                i++;
            }
            return iM7900;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM7907 = 0;
        while (i < size) {
            iM7907 += m7907(wireFormat$FieldTypeMo7807, list.get(i));
            i++;
        }
        return AbstractC3462.m7635(iM7907) + AbstractC3462.m7642(number) + iM7907;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m7907(WireFormat$FieldType wireFormat$FieldType, Object obj) throws Exception {
        int iM7984;
        int iM7635;
        switch (AbstractC3684.f11482[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                boolean z = AbstractC3462.f11129;
                return 8;
            case 2:
                ((Float) obj).getClass();
                boolean z2 = AbstractC3462.f11129;
                return 4;
            case 3:
                return AbstractC3462.m7638(((Long) obj).longValue());
            case 4:
                return AbstractC3462.m7638(((Long) obj).longValue());
            case 5:
                return AbstractC3462.m7638(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                boolean z3 = AbstractC3462.f11129;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                boolean z4 = AbstractC3462.f11129;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                boolean z5 = AbstractC3462.f11129;
                return 1;
            case 9:
                return ((InterfaceC3441) obj).getSerializedSize();
            case 10:
                return obj instanceof C3383 ? ((C3383) obj).m7489() : AbstractC3462.m7643((InterfaceC3441) obj);
            case 11:
                if (!(obj instanceof ByteString)) {
                    boolean z6 = AbstractC3462.f11129;
                    iM7984 = AbstractC3724.m7984((String) obj);
                    iM7635 = AbstractC3462.m7635(iM7984);
                } else {
                    boolean z7 = AbstractC3462.f11129;
                    iM7984 = ((ByteString) obj).size();
                    iM7635 = AbstractC3462.m7635(iM7984);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    boolean z8 = AbstractC3462.f11129;
                    iM7984 = ((byte[]) obj).length;
                    iM7635 = AbstractC3462.m7635(iM7984);
                } else {
                    boolean z9 = AbstractC3462.f11129;
                    iM7984 = ((ByteString) obj).size();
                    iM7635 = AbstractC3462.m7635(iM7984);
                }
                break;
            case 13:
                return AbstractC3462.m7635(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z10 = AbstractC3462.f11129;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z11 = AbstractC3462.f11129;
                return 8;
            case 16:
                return AbstractC3462.m7644(((Integer) obj).intValue());
            case 17:
                return AbstractC3462.m7641(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC3399 ? AbstractC3462.m7638(((InterfaceC3399) obj).getNumber()) : AbstractC3462.m7638(((Integer) obj).intValue());
            default:
                C2633.m5339("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iM7635 + iM7984;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m7908(Map.Entry entry) {
        InterfaceC3681 interfaceC3681 = (InterfaceC3681) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC3681.mo7804() != WireFormat$JavaType.MESSAGE || interfaceC3681.mo7806() || interfaceC3681.isPacked()) {
            return m7906(interfaceC3681, value);
        }
        if (!(value instanceof C3383)) {
            int number = ((InterfaceC3681) entry.getKey()).getNumber();
            return AbstractC3462.m7639(3, (InterfaceC3441) value) + AbstractC3462.m7636(2, number) + (AbstractC3462.m7642(1) * 2);
        }
        int number2 = ((InterfaceC3681) entry.getKey()).getNumber();
        return ((C3383) value).m7489() + AbstractC3462.m7642(3) + AbstractC3462.m7636(2, number2) + (AbstractC3462.m7642(1) * 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3680) {
            return this.f11480.equals(((C3680) obj).f11480);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11480.hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3680 clone() {
        C3680 c3680 = new C3680();
        C3350 c3350 = this.f11480;
        int i = c3350.f10995;
        for (int i2 = 0; i2 < i; i2++) {
            C3351 c3351M7407 = c3350.m7407(i2);
            c3680.m7913((InterfaceC3681) c3351M7407.f11000, c3351M7407.f10998);
        }
        for (Map.Entry entry : c3350.m7406()) {
            c3680.m7913((InterfaceC3681) entry.getKey(), entry.getValue());
        }
        c3680.f11478 = this.f11478;
        return c3680;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7910(InterfaceC3681 interfaceC3681, Object obj) {
        List arrayList;
        if (!interfaceC3681.mo7806()) {
            C5925.m11310("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m7899(interfaceC3681, obj);
        Object objM7923 = m7923(interfaceC3681);
        if (objM7923 == null) {
            arrayList = new ArrayList();
            this.f11480.put(interfaceC3681, arrayList);
        } else {
            arrayList = (List) objM7923;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Iterator m7911() {
        C3350 c3350 = this.f11480;
        return c3350.isEmpty() ? Collections.emptyIterator() : this.f11478 ? new C3387(((C0262) c3350.entrySet()).iterator()) : ((C0262) c3350.entrySet()).iterator();
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
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7912(Map.Entry entry) {
        InterfaceC3681 interfaceC3681 = (InterfaceC3681) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C3383;
        boolean zMo7806 = interfaceC3681.mo7806();
        C3350 c3350 = this.f11480;
        if (zMo7806) {
            if (z) {
                C5925.m11311("Lazy fields can not be repeated");
                return;
            }
            Object objM7923 = m7923(interfaceC3681);
            List list = (List) value;
            int size = list.size();
            if (objM7923 == null) {
                objM7923 = new ArrayList(size);
            }
            List list2 = (List) objM7923;
            for (int i = 0; i < size; i++) {
                list2.add(m7901(list.get(i)));
            }
            c3350.put(interfaceC3681, objM7923);
            return;
        }
        if (interfaceC3681.mo7804() != WireFormat$JavaType.MESSAGE) {
            if (z) {
                C5925.m11311("Lazy fields must be message-valued");
                return;
            } else {
                c3350.put(interfaceC3681, m7901(value));
                return;
            }
        }
        Object objM79232 = m7923(interfaceC3681);
        if (objM79232 == null) {
            c3350.put(interfaceC3681, m7901(value));
            if (z) {
                this.f11478 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C3383) value).m7488();
        }
        if (!interfaceC3681.mo7805(objM79232)) {
            interfaceC3681.mo7808(objM79232, value);
            return;
        }
        InterfaceC3450 builder = ((InterfaceC3441) objM79232).toBuilder();
        interfaceC3681.mo7808(builder, value);
        c3350.put(interfaceC3681, builder.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7913(InterfaceC3681 interfaceC3681, Object obj) {
        if (!interfaceC3681.mo7806()) {
            m7899(interfaceC3681, obj);
        } else {
            if (!(obj instanceof List)) {
                C5925.m11310("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                m7899(interfaceC3681, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C3383) {
            this.f11478 = true;
        }
        this.f11480.put(interfaceC3681, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7914() {
        if (this.f11479) {
            return;
        }
        C3350 c3350 = this.f11480;
        int i = c3350.f10995;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c3350.m7407(i2).f10998;
            if (obj instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) obj).makeImmutable();
            }
        }
        Iterator it = c3350.m7406().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).makeImmutable();
            }
        }
        c3350.m7404();
        this.f11479 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7915(C3680 c3680) {
        C3350 c3350;
        int i = c3680.f11480.f10995;
        int i2 = 0;
        while (true) {
            c3350 = c3680.f11480;
            if (i2 >= i) {
                break;
            }
            m7912(c3350.m7407(i2));
            i2++;
        }
        Iterator it = c3350.m7406().iterator();
        while (it.hasNext()) {
            m7912((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m7916(InterfaceC3681 interfaceC3681) {
        if (!interfaceC3681.mo7806()) {
            C5925.m11310("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM7923 = m7923(interfaceC3681);
        if (objM7923 == null) {
            return 0;
        }
        return ((List) objM7923).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object m7917(InterfaceC3681 interfaceC3681, int i) {
        if (!interfaceC3681.mo7806()) {
            C5925.m11310("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM7923 = m7923(interfaceC3681);
        if (objM7923 != null) {
            return ((List) objM7923).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m7918() {
        C3350 c3350 = this.f11480;
        int i = c3350.f10995;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = c3350.m7406().iterator();
                while (it.hasNext()) {
                    if (!m7905((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!m7905(c3350.m7407(i2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m7919() {
        C3350 c3350 = this.f11480;
        int i = c3350.f10995;
        int iM7906 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            C3351 c3351M7407 = c3350.m7407(i2);
            iM7906 += m7906((InterfaceC3681) c3351M7407.f11000, c3351M7407.f10998);
        }
        for (Map.Entry entry : c3350.m7406()) {
            iM7906 += m7906((InterfaceC3681) entry.getKey(), entry.getValue());
        }
        return iM7906;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m7920(InterfaceC3681 interfaceC3681) {
        if (!interfaceC3681.mo7806()) {
            return this.f11480.get(interfaceC3681) != null;
        }
        C5925.m11310("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m7921() {
        C3350 c3350 = this.f11480;
        int i = c3350.f10995;
        int iM7908 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM7908 += m7908(c3350.m7407(i2));
        }
        Iterator it = c3350.m7406().iterator();
        while (it.hasNext()) {
            iM7908 += m7908((Map.Entry) it.next());
        }
        return iM7908;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Map m7922() {
        boolean z = this.f11478;
        C3350 c3350 = this.f11480;
        if (!z) {
            return c3350.f10993 ? c3350 : Collections.unmodifiableMap(c3350);
        }
        C3350 c3350M7903 = m7903(c3350, false, true);
        if (c3350.f10993) {
            c3350M7903.m7404();
        }
        return c3350M7903;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m7923(InterfaceC3681 interfaceC3681) {
        Object obj = this.f11480.get(interfaceC3681);
        return obj instanceof C3383 ? ((C3383) obj).m7488() : obj;
    }

    public C3680(C3350 c3350) {
        this.f11480 = c3350;
        m7914();
    }
}
