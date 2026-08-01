package com.google.protobuf;

import androidx.collection.C1109;
import bsh.C3466;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏兰世哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4512 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4512 f11822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f11823;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4182 f11825;

    static {
        C4512 c4512 = new C4512(C4182.m7962());
        c4512.m8473();
        f11822 = c4512;
    }

    public C4512() {
        this.f11825 = C4182.m7962();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m8454(Map.Entry entry, AbstractC4294 abstractC4294) {
        InterfaceC4513 interfaceC4513 = (InterfaceC4513) entry.getKey();
        if (interfaceC4513.mo8363() != WireFormat$JavaType.MESSAGE || interfaceC4513.mo8365() || interfaceC4513.isPacked()) {
            m8455(interfaceC4513, entry.getValue(), abstractC4294);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof C4215)) {
            abstractC4294.mo8218(((InterfaceC4513) entry.getKey()).getNumber(), (InterfaceC4273) value);
        } else {
            abstractC4294.mo8217(((InterfaceC4513) entry.getKey()).getNumber(), ((C4215) value).m8046());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m8455(InterfaceC4513 interfaceC4513, Object obj, AbstractC4294 abstractC4294) {
        WireFormat$FieldType wireFormat$FieldTypeMo8366 = interfaceC4513.mo8366();
        int number = interfaceC4513.getNumber();
        if (!interfaceC4513.mo8365()) {
            if (obj instanceof C4215) {
                m8457(abstractC4294, wireFormat$FieldTypeMo8366, number, ((C4215) obj).m8047());
                return;
            } else {
                m8457(abstractC4294, wireFormat$FieldTypeMo8366, number, obj);
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!interfaceC4513.isPacked()) {
            while (i < size) {
                m8457(abstractC4294, wireFormat$FieldTypeMo8366, number, list.get(i));
                i++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            abstractC4294.mo8214(number, 2);
            int iM8466 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iM8466 += m8466(wireFormat$FieldTypeMo8366, list.get(i2));
            }
            abstractC4294.mo8204(iM8466);
            while (i < size) {
                m8456(abstractC4294, wireFormat$FieldTypeMo8366, list.get(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m8456(AbstractC4294 abstractC4294, WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (AbstractC4516.f11827[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC4294.getClass();
                abstractC4294.mo8211(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC4294.getClass();
                abstractC4294.mo8213(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC4294.mo8206(((Long) obj).longValue());
                break;
            case 4:
                abstractC4294.mo8206(((Long) obj).longValue());
                break;
            case 5:
                abstractC4294.mo8209(((Integer) obj).intValue());
                break;
            case 6:
                abstractC4294.mo8211(((Long) obj).longValue());
                break;
            case 7:
                abstractC4294.mo8213(((Integer) obj).intValue());
                break;
            case 8:
                abstractC4294.mo8228(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC4294.getClass();
                ((InterfaceC4273) obj).writeTo(abstractC4294);
                break;
            case 10:
                abstractC4294.mo8219((InterfaceC4273) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    abstractC4294.mo8215((String) obj);
                } else {
                    abstractC4294.mo8226((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC4294.getClass();
                    abstractC4294.mo8221(bArr, bArr.length);
                } else {
                    abstractC4294.mo8226((ByteString) obj);
                }
                break;
            case 13:
                abstractC4294.mo8204(((Integer) obj).intValue());
                break;
            case 14:
                abstractC4294.mo8213(((Integer) obj).intValue());
                break;
            case 15:
                abstractC4294.mo8211(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC4294.mo8204((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC4294.mo8206((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof InterfaceC4231)) {
                    abstractC4294.mo8209(((Integer) obj).intValue());
                } else {
                    abstractC4294.mo8209(((InterfaceC4231) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m8457(AbstractC4294 abstractC4294, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType != WireFormat$FieldType.GROUP) {
            abstractC4294.mo8214(i, wireFormat$FieldType.getWireType());
            m8456(abstractC4294, wireFormat$FieldType, obj);
        } else {
            abstractC4294.mo8214(i, 3);
            ((InterfaceC4273) obj).writeTo(abstractC4294);
            abstractC4294.mo8214(i, 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m8458(InterfaceC4513 interfaceC4513, Object obj) {
        if (!m8463(interfaceC4513.mo8366(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC4513.getNumber()), interfaceC4513.mo8366().getJavaType(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m8459(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int iM8201 = AbstractC4294.m8201(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            iM8201 *= 2;
        }
        return m8466(wireFormat$FieldType, obj) + iM8201;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m8460(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m8461(C4182 c4182, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC4513 interfaceC4513 = (InterfaceC4513) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C4215)) {
            c4182.put(interfaceC4513, ((C4215) value).m8047());
        } else if (z && (value instanceof List)) {
            c4182.put(interfaceC4513, new ArrayList((List) value));
        } else {
            c4182.put(interfaceC4513, value);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C4182 m8462(C4182 c4182, boolean z, boolean z2) {
        C4182 c4182M7962 = C4182.m7962();
        int i = c4182.f11340;
        for (int i2 = 0; i2 < i; i2++) {
            m8461(c4182M7962, c4182.m7966(i2), z, z2);
        }
        Iterator it = c4182.m7965().iterator();
        while (it.hasNext()) {
            m8461(c4182M7962, (Map.Entry) it.next(), z, z2);
        }
        return c4182M7962;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static boolean m8463(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        Charset charset = AbstractC4234.f11404;
        obj.getClass();
        switch (AbstractC4516.f11828[wireFormat$FieldType.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC4231)) {
                }
                break;
            case 9:
                if ((obj instanceof InterfaceC4273) || (obj instanceof C4215)) {
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m8464(Map.Entry entry) {
        boolean zIsInitialized;
        InterfaceC4513 interfaceC4513 = (InterfaceC4513) entry.getKey();
        if (interfaceC4513.mo8363() == WireFormat$JavaType.MESSAGE) {
            if (!interfaceC4513.mo8365()) {
                Object value = entry.getValue();
                if (value instanceof InterfaceC4272) {
                    return ((InterfaceC4272) value).isInitialized();
                }
                if (value instanceof C4215) {
                    return true;
                }
                C6755.m11869("Wrong object type used with protocol message reflection.");
                return false;
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof InterfaceC4272) {
                    zIsInitialized = ((InterfaceC4272) obj).isInitialized();
                } else {
                    if (!(obj instanceof C4215)) {
                        C6755.m11869("Wrong object type used with protocol message reflection.");
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
    public static int m8465(InterfaceC4513 interfaceC4513, Object obj) {
        WireFormat$FieldType wireFormat$FieldTypeMo8366 = interfaceC4513.mo8366();
        int number = interfaceC4513.getNumber();
        if (!interfaceC4513.mo8365()) {
            return m8459(wireFormat$FieldTypeMo8366, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!interfaceC4513.isPacked()) {
            int iM8459 = 0;
            while (i < size) {
                iM8459 += m8459(wireFormat$FieldTypeMo8366, number, list.get(i));
                i++;
            }
            return iM8459;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM8466 = 0;
        while (i < size) {
            iM8466 += m8466(wireFormat$FieldTypeMo8366, list.get(i));
            i++;
        }
        return AbstractC4294.m8194(iM8466) + AbstractC4294.m8201(number) + iM8466;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m8466(WireFormat$FieldType wireFormat$FieldType, Object obj) throws Exception {
        int iM8543;
        int iM8194;
        switch (AbstractC4516.f11827[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                boolean z = AbstractC4294.f11474;
                return 8;
            case 2:
                ((Float) obj).getClass();
                boolean z2 = AbstractC4294.f11474;
                return 4;
            case 3:
                return AbstractC4294.m8197(((Long) obj).longValue());
            case 4:
                return AbstractC4294.m8197(((Long) obj).longValue());
            case 5:
                return AbstractC4294.m8197(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                boolean z3 = AbstractC4294.f11474;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                boolean z4 = AbstractC4294.f11474;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                boolean z5 = AbstractC4294.f11474;
                return 1;
            case 9:
                return ((InterfaceC4273) obj).getSerializedSize();
            case 10:
                return obj instanceof C4215 ? ((C4215) obj).m8048() : AbstractC4294.m8202((InterfaceC4273) obj);
            case 11:
                if (!(obj instanceof ByteString)) {
                    boolean z6 = AbstractC4294.f11474;
                    iM8543 = AbstractC4556.m8543((String) obj);
                    iM8194 = AbstractC4294.m8194(iM8543);
                } else {
                    boolean z7 = AbstractC4294.f11474;
                    iM8543 = ((ByteString) obj).size();
                    iM8194 = AbstractC4294.m8194(iM8543);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    boolean z8 = AbstractC4294.f11474;
                    iM8543 = ((byte[]) obj).length;
                    iM8194 = AbstractC4294.m8194(iM8543);
                } else {
                    boolean z9 = AbstractC4294.f11474;
                    iM8543 = ((ByteString) obj).size();
                    iM8194 = AbstractC4294.m8194(iM8543);
                }
                break;
            case 13:
                return AbstractC4294.m8194(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z10 = AbstractC4294.f11474;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z11 = AbstractC4294.f11474;
                return 8;
            case 16:
                return AbstractC4294.m8203(((Integer) obj).intValue());
            case 17:
                return AbstractC4294.m8200(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC4231 ? AbstractC4294.m8197(((InterfaceC4231) obj).getNumber()) : AbstractC4294.m8197(((Integer) obj).intValue());
            default:
                C3466.m5899("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iM8194 + iM8543;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m8467(Map.Entry entry) {
        InterfaceC4513 interfaceC4513 = (InterfaceC4513) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC4513.mo8363() != WireFormat$JavaType.MESSAGE || interfaceC4513.mo8365() || interfaceC4513.isPacked()) {
            return m8465(interfaceC4513, value);
        }
        if (!(value instanceof C4215)) {
            int number = ((InterfaceC4513) entry.getKey()).getNumber();
            return AbstractC4294.m8198(3, (InterfaceC4273) value) + AbstractC4294.m8195(2, number) + (AbstractC4294.m8201(1) * 2);
        }
        int number2 = ((InterfaceC4513) entry.getKey()).getNumber();
        return ((C4215) value).m8048() + AbstractC4294.m8201(3) + AbstractC4294.m8195(2, number2) + (AbstractC4294.m8201(1) * 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4512) {
            return this.f11825.equals(((C4512) obj).f11825);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11825.hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4512 clone() {
        C4512 c4512 = new C4512();
        C4182 c4182 = this.f11825;
        int i = c4182.f11340;
        for (int i2 = 0; i2 < i; i2++) {
            C4183 c4183M7966 = c4182.m7966(i2);
            c4512.m8472((InterfaceC4513) c4183M7966.f11345, c4183M7966.f11343);
        }
        for (Map.Entry entry : c4182.m7965()) {
            c4512.m8472((InterfaceC4513) entry.getKey(), entry.getValue());
        }
        c4512.f11823 = this.f11823;
        return c4512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8469(InterfaceC4513 interfaceC4513, Object obj) {
        List arrayList;
        if (!interfaceC4513.mo8365()) {
            C6755.m11869("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m8458(interfaceC4513, obj);
        Object objM8482 = m8482(interfaceC4513);
        if (objM8482 == null) {
            arrayList = new ArrayList();
            this.f11825.put(interfaceC4513, arrayList);
        } else {
            arrayList = (List) objM8482;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Iterator m8470() {
        C4182 c4182 = this.f11825;
        return c4182.isEmpty() ? Collections.emptyIterator() : this.f11823 ? new C4219(((C1109) c4182.entrySet()).iterator()) : ((C1109) c4182.entrySet()).iterator();
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
    public final void m8471(Map.Entry entry) {
        InterfaceC4513 interfaceC4513 = (InterfaceC4513) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C4215;
        boolean zMo8365 = interfaceC4513.mo8365();
        C4182 c4182 = this.f11825;
        if (zMo8365) {
            if (z) {
                C6755.m11870("Lazy fields can not be repeated");
                return;
            }
            Object objM8482 = m8482(interfaceC4513);
            List list = (List) value;
            int size = list.size();
            if (objM8482 == null) {
                objM8482 = new ArrayList(size);
            }
            List list2 = (List) objM8482;
            for (int i = 0; i < size; i++) {
                list2.add(m8460(list.get(i)));
            }
            c4182.put(interfaceC4513, objM8482);
            return;
        }
        if (interfaceC4513.mo8363() != WireFormat$JavaType.MESSAGE) {
            if (z) {
                C6755.m11870("Lazy fields must be message-valued");
                return;
            } else {
                c4182.put(interfaceC4513, m8460(value));
                return;
            }
        }
        Object objM84822 = m8482(interfaceC4513);
        if (objM84822 == null) {
            c4182.put(interfaceC4513, m8460(value));
            if (z) {
                this.f11823 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C4215) value).m8047();
        }
        if (!interfaceC4513.mo8364(objM84822)) {
            interfaceC4513.mo8367(objM84822, value);
            return;
        }
        InterfaceC4282 builder = ((InterfaceC4273) objM84822).toBuilder();
        interfaceC4513.mo8367(builder, value);
        c4182.put(interfaceC4513, builder.build());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m8472(InterfaceC4513 interfaceC4513, Object obj) {
        if (!interfaceC4513.mo8365()) {
            m8458(interfaceC4513, obj);
        } else {
            if (!(obj instanceof List)) {
                C6755.m11869("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                m8458(interfaceC4513, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C4215) {
            this.f11823 = true;
        }
        this.f11825.put(interfaceC4513, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m8473() {
        if (this.f11824) {
            return;
        }
        C4182 c4182 = this.f11825;
        int i = c4182.f11340;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c4182.m7966(i2).f11343;
            if (obj instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) obj).makeImmutable();
            }
        }
        Iterator it = c4182.m7965().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).makeImmutable();
            }
        }
        c4182.m7963();
        this.f11824 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m8474(C4512 c4512) {
        C4182 c4182;
        int i = c4512.f11825.f11340;
        int i2 = 0;
        while (true) {
            c4182 = c4512.f11825;
            if (i2 >= i) {
                break;
            }
            m8471(c4182.m7966(i2));
            i2++;
        }
        Iterator it = c4182.m7965().iterator();
        while (it.hasNext()) {
            m8471((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m8475(InterfaceC4513 interfaceC4513) {
        if (!interfaceC4513.mo8365()) {
            C6755.m11869("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM8482 = m8482(interfaceC4513);
        if (objM8482 == null) {
            return 0;
        }
        return ((List) objM8482).size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object m8476(InterfaceC4513 interfaceC4513, int i) {
        if (!interfaceC4513.mo8365()) {
            C6755.m11869("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM8482 = m8482(interfaceC4513);
        if (objM8482 != null) {
            return ((List) objM8482).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m8477() {
        C4182 c4182 = this.f11825;
        int i = c4182.f11340;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = c4182.m7965().iterator();
                while (it.hasNext()) {
                    if (!m8464((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!m8464(c4182.m7966(i2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m8478() {
        C4182 c4182 = this.f11825;
        int i = c4182.f11340;
        int iM8465 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            C4183 c4183M7966 = c4182.m7966(i2);
            iM8465 += m8465((InterfaceC4513) c4183M7966.f11345, c4183M7966.f11343);
        }
        for (Map.Entry entry : c4182.m7965()) {
            iM8465 += m8465((InterfaceC4513) entry.getKey(), entry.getValue());
        }
        return iM8465;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m8479(InterfaceC4513 interfaceC4513) {
        if (!interfaceC4513.mo8365()) {
            return this.f11825.get(interfaceC4513) != null;
        }
        C6755.m11869("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m8480() {
        C4182 c4182 = this.f11825;
        int i = c4182.f11340;
        int iM8467 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM8467 += m8467(c4182.m7966(i2));
        }
        Iterator it = c4182.m7965().iterator();
        while (it.hasNext()) {
            iM8467 += m8467((Map.Entry) it.next());
        }
        return iM8467;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Map m8481() {
        boolean z = this.f11823;
        C4182 c4182 = this.f11825;
        if (!z) {
            return c4182.f11338 ? c4182 : Collections.unmodifiableMap(c4182);
        }
        C4182 c4182M8462 = m8462(c4182, false, true);
        if (c4182.f11338) {
            c4182M8462.m7963();
        }
        return c4182M8462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m8482(InterfaceC4513 interfaceC4513) {
        Object obj = this.f11825.get(interfaceC4513);
        return obj instanceof C4215 ? ((C4215) obj).m8047() : obj;
    }

    public C4512(C4182 c4182) {
        this.f11825 = c4182;
        m8473();
    }
}
