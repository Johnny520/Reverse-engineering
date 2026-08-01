package com.google.protobuf;

import androidx.collection.C0262;
import bsh.C2632;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏兰世哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3679 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3679 f11472;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f11473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3349 f11475;

    static {
        C3679 c3679 = new C3679(C3349.m7416());
        c3679.m7927();
        f11472 = c3679;
    }

    public C3679() {
        this.f11475 = C3349.m7416();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m7908(Map.Entry entry, AbstractC3461 abstractC3461) {
        InterfaceC3680 interfaceC3680 = (InterfaceC3680) entry.getKey();
        if (interfaceC3680.mo7817() != WireFormat$JavaType.MESSAGE || interfaceC3680.mo7819() || interfaceC3680.isPacked()) {
            m7909(interfaceC3680, entry.getValue(), abstractC3461);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof C3382)) {
            abstractC3461.mo7672(((InterfaceC3680) entry.getKey()).getNumber(), (InterfaceC3440) value);
        } else {
            abstractC3461.mo7671(((InterfaceC3680) entry.getKey()).getNumber(), ((C3382) value).m7500());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m7909(InterfaceC3680 interfaceC3680, Object obj, AbstractC3461 abstractC3461) {
        WireFormat$FieldType wireFormat$FieldTypeMo7820 = interfaceC3680.mo7820();
        int number = interfaceC3680.getNumber();
        if (!interfaceC3680.mo7819()) {
            if (obj instanceof C3382) {
                m7911(abstractC3461, wireFormat$FieldTypeMo7820, number, ((C3382) obj).m7501());
                return;
            } else {
                m7911(abstractC3461, wireFormat$FieldTypeMo7820, number, obj);
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!interfaceC3680.isPacked()) {
            while (i < size) {
                m7911(abstractC3461, wireFormat$FieldTypeMo7820, number, list.get(i));
                i++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            abstractC3461.mo7668(number, 2);
            int iM7920 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iM7920 += m7920(wireFormat$FieldTypeMo7820, list.get(i2));
            }
            abstractC3461.mo7658(iM7920);
            while (i < size) {
                m7910(abstractC3461, wireFormat$FieldTypeMo7820, list.get(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7910(AbstractC3461 abstractC3461, WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (AbstractC3683.f11477[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC3461.getClass();
                abstractC3461.mo7665(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC3461.getClass();
                abstractC3461.mo7667(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC3461.mo7660(((Long) obj).longValue());
                break;
            case 4:
                abstractC3461.mo7660(((Long) obj).longValue());
                break;
            case 5:
                abstractC3461.mo7663(((Integer) obj).intValue());
                break;
            case 6:
                abstractC3461.mo7665(((Long) obj).longValue());
                break;
            case 7:
                abstractC3461.mo7667(((Integer) obj).intValue());
                break;
            case 8:
                abstractC3461.mo7682(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC3461.getClass();
                ((InterfaceC3440) obj).writeTo(abstractC3461);
                break;
            case 10:
                abstractC3461.mo7673((InterfaceC3440) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    abstractC3461.mo7669((String) obj);
                } else {
                    abstractC3461.mo7680((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC3461.getClass();
                    abstractC3461.mo7675(bArr, bArr.length);
                } else {
                    abstractC3461.mo7680((ByteString) obj);
                }
                break;
            case 13:
                abstractC3461.mo7658(((Integer) obj).intValue());
                break;
            case 14:
                abstractC3461.mo7667(((Integer) obj).intValue());
                break;
            case 15:
                abstractC3461.mo7665(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC3461.mo7658((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC3461.mo7660((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof InterfaceC3398)) {
                    abstractC3461.mo7663(((Integer) obj).intValue());
                } else {
                    abstractC3461.mo7663(((InterfaceC3398) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7911(AbstractC3461 abstractC3461, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType != WireFormat$FieldType.GROUP) {
            abstractC3461.mo7668(i, wireFormat$FieldType.getWireType());
            m7910(abstractC3461, wireFormat$FieldType, obj);
        } else {
            abstractC3461.mo7668(i, 3);
            ((InterfaceC3440) obj).writeTo(abstractC3461);
            abstractC3461.mo7668(i, 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m7912(InterfaceC3680 interfaceC3680, Object obj) {
        if (!m7917(interfaceC3680.mo7820(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC3680.getNumber()), interfaceC3680.mo7820().getJavaType(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m7913(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int iM7655 = AbstractC3461.m7655(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            iM7655 *= 2;
        }
        return m7920(wireFormat$FieldType, obj) + iM7655;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m7914(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m7915(C3349 c3349, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC3680 interfaceC3680 = (InterfaceC3680) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C3382)) {
            c3349.put(interfaceC3680, ((C3382) value).m7501());
        } else if (z && (value instanceof List)) {
            c3349.put(interfaceC3680, new ArrayList((List) value));
        } else {
            c3349.put(interfaceC3680, value);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3349 m7916(C3349 c3349, boolean z, boolean z2) {
        C3349 c3349M7416 = C3349.m7416();
        int i = c3349.f10990;
        for (int i2 = 0; i2 < i; i2++) {
            m7915(c3349M7416, c3349.m7420(i2), z, z2);
        }
        Iterator it = c3349.m7419().iterator();
        while (it.hasNext()) {
            m7915(c3349M7416, (Map.Entry) it.next(), z, z2);
        }
        return c3349M7416;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static boolean m7917(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        Charset charset = AbstractC3401.f11054;
        obj.getClass();
        switch (AbstractC3683.f11478[wireFormat$FieldType.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC3398)) {
                }
                break;
            case 9:
                if ((obj instanceof InterfaceC3440) || (obj instanceof C3382)) {
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m7918(Map.Entry entry) {
        boolean zIsInitialized;
        InterfaceC3680 interfaceC3680 = (InterfaceC3680) entry.getKey();
        if (interfaceC3680.mo7817() == WireFormat$JavaType.MESSAGE) {
            if (!interfaceC3680.mo7819()) {
                Object value = entry.getValue();
                if (value instanceof InterfaceC3439) {
                    return ((InterfaceC3439) value).isInitialized();
                }
                if (value instanceof C3382) {
                    return true;
                }
                C5919.m11249("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof InterfaceC3439) {
                    zIsInitialized = ((InterfaceC3439) obj).isInitialized();
                } else {
                    if (!(obj instanceof C3382)) {
                        C5919.m11249("Wrong object type used with protocol message reflection.");
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
    public static int m7919(InterfaceC3680 interfaceC3680, Object obj) {
        WireFormat$FieldType wireFormat$FieldTypeMo7820 = interfaceC3680.mo7820();
        int number = interfaceC3680.getNumber();
        if (!interfaceC3680.mo7819()) {
            return m7913(wireFormat$FieldTypeMo7820, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!interfaceC3680.isPacked()) {
            int iM7913 = 0;
            while (i < size) {
                iM7913 += m7913(wireFormat$FieldTypeMo7820, number, list.get(i));
                i++;
            }
            return iM7913;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM7920 = 0;
        while (i < size) {
            iM7920 += m7920(wireFormat$FieldTypeMo7820, list.get(i));
            i++;
        }
        return AbstractC3461.m7648(iM7920) + AbstractC3461.m7655(number) + iM7920;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m7920(WireFormat$FieldType wireFormat$FieldType, Object obj) throws Exception {
        int iM7997;
        int iM7648;
        switch (AbstractC3683.f11477[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                boolean z = AbstractC3461.f11124;
                return 8;
            case 2:
                ((Float) obj).getClass();
                boolean z2 = AbstractC3461.f11124;
                return 4;
            case 3:
                return AbstractC3461.m7651(((Long) obj).longValue());
            case 4:
                return AbstractC3461.m7651(((Long) obj).longValue());
            case 5:
                return AbstractC3461.m7651(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                boolean z3 = AbstractC3461.f11124;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                boolean z4 = AbstractC3461.f11124;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                boolean z5 = AbstractC3461.f11124;
                return 1;
            case 9:
                return ((InterfaceC3440) obj).getSerializedSize();
            case 10:
                return obj instanceof C3382 ? ((C3382) obj).m7502() : AbstractC3461.m7656((InterfaceC3440) obj);
            case 11:
                if (!(obj instanceof ByteString)) {
                    boolean z6 = AbstractC3461.f11124;
                    iM7997 = AbstractC3723.m7997((String) obj);
                    iM7648 = AbstractC3461.m7648(iM7997);
                } else {
                    boolean z7 = AbstractC3461.f11124;
                    iM7997 = ((ByteString) obj).size();
                    iM7648 = AbstractC3461.m7648(iM7997);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    boolean z8 = AbstractC3461.f11124;
                    iM7997 = ((byte[]) obj).length;
                    iM7648 = AbstractC3461.m7648(iM7997);
                } else {
                    boolean z9 = AbstractC3461.f11124;
                    iM7997 = ((ByteString) obj).size();
                    iM7648 = AbstractC3461.m7648(iM7997);
                }
                break;
            case 13:
                return AbstractC3461.m7648(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z10 = AbstractC3461.f11124;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z11 = AbstractC3461.f11124;
                return 8;
            case 16:
                return AbstractC3461.m7657(((Integer) obj).intValue());
            case 17:
                return AbstractC3461.m7654(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC3398 ? AbstractC3461.m7651(((InterfaceC3398) obj).getNumber()) : AbstractC3461.m7651(((Integer) obj).intValue());
            default:
                C2632.m5294("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iM7648 + iM7997;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m7921(Map.Entry entry) {
        InterfaceC3680 interfaceC3680 = (InterfaceC3680) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC3680.mo7817() != WireFormat$JavaType.MESSAGE || interfaceC3680.mo7819() || interfaceC3680.isPacked()) {
            return m7919(interfaceC3680, value);
        }
        if (!(value instanceof C3382)) {
            int number = ((InterfaceC3680) entry.getKey()).getNumber();
            return AbstractC3461.m7652(3, (InterfaceC3440) value) + AbstractC3461.m7649(2, number) + (AbstractC3461.m7655(1) * 2);
        }
        int number2 = ((InterfaceC3680) entry.getKey()).getNumber();
        return ((C3382) value).m7502() + AbstractC3461.m7655(3) + AbstractC3461.m7649(2, number2) + (AbstractC3461.m7655(1) * 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3679) {
            return this.f11475.equals(((C3679) obj).f11475);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11475.hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3679 clone() {
        C3679 c3679 = new C3679();
        C3349 c3349 = this.f11475;
        int i = c3349.f10990;
        for (int i2 = 0; i2 < i; i2++) {
            C3350 c3350M7420 = c3349.m7420(i2);
            c3679.m7926((InterfaceC3680) c3350M7420.f10995, c3350M7420.f10993);
        }
        for (Map.Entry entry : c3349.m7419()) {
            c3679.m7926((InterfaceC3680) entry.getKey(), entry.getValue());
        }
        c3679.f11473 = this.f11473;
        return c3679;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7923(InterfaceC3680 interfaceC3680, Object obj) {
        List arrayList;
        if (!interfaceC3680.mo7819()) {
            C5919.m11249("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m7912(interfaceC3680, obj);
        Object objM7936 = m7936(interfaceC3680);
        if (objM7936 == null) {
            arrayList = new ArrayList();
            this.f11475.put(interfaceC3680, arrayList);
        } else {
            arrayList = (List) objM7936;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Iterator m7924() {
        C3349 c3349 = this.f11475;
        return c3349.isEmpty() ? Collections.emptyIterator() : this.f11473 ? new C3386(((C0262) c3349.entrySet()).iterator()) : ((C0262) c3349.entrySet()).iterator();
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
    public final void m7925(Map.Entry entry) {
        InterfaceC3680 interfaceC3680 = (InterfaceC3680) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C3382;
        boolean zMo7819 = interfaceC3680.mo7819();
        C3349 c3349 = this.f11475;
        if (zMo7819) {
            if (z) {
                C5919.m11250("Lazy fields can not be repeated");
                return;
            }
            Object objM7936 = m7936(interfaceC3680);
            List list = (List) value;
            int size = list.size();
            if (objM7936 == null) {
                objM7936 = new ArrayList(size);
            }
            List list2 = (List) objM7936;
            for (int i = 0; i < size; i++) {
                list2.add(m7914(list.get(i)));
            }
            c3349.put(interfaceC3680, objM7936);
            return;
        }
        if (interfaceC3680.mo7817() != WireFormat$JavaType.MESSAGE) {
            if (z) {
                C5919.m11250("Lazy fields must be message-valued");
                return;
            } else {
                c3349.put(interfaceC3680, m7914(value));
                return;
            }
        }
        Object objM79362 = m7936(interfaceC3680);
        if (objM79362 == null) {
            c3349.put(interfaceC3680, m7914(value));
            if (z) {
                this.f11473 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C3382) value).m7501();
        }
        if (!interfaceC3680.mo7818(objM79362)) {
            interfaceC3680.mo7821(objM79362, value);
            return;
        }
        InterfaceC3449 builder = ((InterfaceC3440) objM79362).toBuilder();
        interfaceC3680.mo7821(builder, value);
        c3349.put(interfaceC3680, builder.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7926(InterfaceC3680 interfaceC3680, Object obj) {
        if (!interfaceC3680.mo7819()) {
            m7912(interfaceC3680, obj);
        } else {
            if (!(obj instanceof List)) {
                C5919.m11249("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                m7912(interfaceC3680, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C3382) {
            this.f11473 = true;
        }
        this.f11475.put(interfaceC3680, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7927() {
        if (this.f11474) {
            return;
        }
        C3349 c3349 = this.f11475;
        int i = c3349.f10990;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c3349.m7420(i2).f10993;
            if (obj instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) obj).makeImmutable();
            }
        }
        Iterator it = c3349.m7419().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).makeImmutable();
            }
        }
        c3349.m7417();
        this.f11474 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7928(C3679 c3679) {
        C3349 c3349;
        int i = c3679.f11475.f10990;
        int i2 = 0;
        while (true) {
            c3349 = c3679.f11475;
            if (i2 >= i) {
                break;
            }
            m7925(c3349.m7420(i2));
            i2++;
        }
        Iterator it = c3349.m7419().iterator();
        while (it.hasNext()) {
            m7925((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m7929(InterfaceC3680 interfaceC3680) {
        if (!interfaceC3680.mo7819()) {
            C5919.m11249("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM7936 = m7936(interfaceC3680);
        if (objM7936 == null) {
            return 0;
        }
        return ((List) objM7936).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object m7930(InterfaceC3680 interfaceC3680, int i) {
        if (!interfaceC3680.mo7819()) {
            C5919.m11249("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM7936 = m7936(interfaceC3680);
        if (objM7936 != null) {
            return ((List) objM7936).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m7931() {
        C3349 c3349 = this.f11475;
        int i = c3349.f10990;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = c3349.m7419().iterator();
                while (it.hasNext()) {
                    if (!m7918((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!m7918(c3349.m7420(i2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m7932() {
        C3349 c3349 = this.f11475;
        int i = c3349.f10990;
        int iM7919 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            C3350 c3350M7420 = c3349.m7420(i2);
            iM7919 += m7919((InterfaceC3680) c3350M7420.f10995, c3350M7420.f10993);
        }
        for (Map.Entry entry : c3349.m7419()) {
            iM7919 += m7919((InterfaceC3680) entry.getKey(), entry.getValue());
        }
        return iM7919;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m7933(InterfaceC3680 interfaceC3680) {
        if (!interfaceC3680.mo7819()) {
            return this.f11475.get(interfaceC3680) != null;
        }
        C5919.m11249("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m7934() {
        C3349 c3349 = this.f11475;
        int i = c3349.f10990;
        int iM7921 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM7921 += m7921(c3349.m7420(i2));
        }
        Iterator it = c3349.m7419().iterator();
        while (it.hasNext()) {
            iM7921 += m7921((Map.Entry) it.next());
        }
        return iM7921;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Map m7935() {
        boolean z = this.f11473;
        C3349 c3349 = this.f11475;
        if (!z) {
            return c3349.f10988 ? c3349 : Collections.unmodifiableMap(c3349);
        }
        C3349 c3349M7916 = m7916(c3349, false, true);
        if (c3349.f10988) {
            c3349M7916.m7417();
        }
        return c3349M7916;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m7936(InterfaceC3680 interfaceC3680) {
        Object obj = this.f11475.get(interfaceC3680);
        return obj instanceof C3382 ? ((C3382) obj).m7501() : obj;
    }

    public C3679(C3349 c3349) {
        this.f11475 = c3349;
        m7927();
    }
}
