package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C1123;
import bsh.C3466;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5563 f14156 = new C5563(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f14157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5528 f14158 = new C5528(16);

    public C5563(int i) {
        m9980();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9974(Map.Entry entry) {
        C5556 c5556 = (C5556) entry.getKey();
        if (c5556.f14141.getJavaType() != WireFormat$JavaType.MESSAGE) {
            return true;
        }
        if (c5556.f14139) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((InterfaceC5533) it.next()).isInitialized()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof InterfaceC5533)) {
            C6755.m11869("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((InterfaceC5533) value).isInitialized()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m9975(C5556 c5556, Object obj) {
        int iM9923;
        int iM9976;
        WireFormat$FieldType wireFormat$FieldType = c5556.f14141;
        int i = c5556.f14140;
        if (c5556.f14139) {
            int iM99762 = 0;
            if (!c5556.f14138) {
                for (Object obj2 : (List) obj) {
                    int iM99232 = C5540.m9923(i);
                    if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                        iM99232 *= 2;
                    }
                    iM99762 += m9976(wireFormat$FieldType, obj2) + iM99232;
                }
                return iM99762;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM99762 += m9976(wireFormat$FieldType, it.next());
            }
            iM9923 = C5540.m9923(i) + iM99762;
            iM9976 = C5540.m9918(iM99762);
        } else {
            iM9923 = C5540.m9923(i);
            if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                iM9923 *= 2;
            }
            iM9976 = m9976(wireFormat$FieldType, obj);
        }
        return iM9976 + iM9923;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9976(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int iM9918;
        int size;
        switch (AbstractC5562.f14154[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return C5540.m9917(((Long) obj).longValue());
            case 4:
                return C5540.m9917(((Long) obj).longValue());
            case 5:
                return C5540.m9920(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                return 8;
            case 7:
                ((Integer) obj).getClass();
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C5540.m9918(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    C1123.m1408("UTF-8 not supported.", e);
                    return 0;
                }
            case 10:
                if (!(obj instanceof AbstractC5542)) {
                    byte[] bArr = (byte[]) obj;
                    return C5540.m9918(bArr.length) + bArr.length;
                }
                AbstractC5542 abstractC5542 = (AbstractC5542) obj;
                iM9918 = C5540.m9918(abstractC5542.size());
                size = abstractC5542.size();
                break;
                break;
            case 11:
                return C5540.m9918(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                return C5540.m9918((iIntValue >> 31) ^ (iIntValue << 1));
            case 15:
                long jLongValue = ((Long) obj).longValue();
                return C5540.m9917((jLongValue >> 63) ^ (jLongValue << 1));
            case 16:
                return ((InterfaceC5533) obj).getSerializedSize();
            case 17:
                iM9918 = ((InterfaceC5533) obj).getSerializedSize();
                size = C5540.m9918(iM9918);
                break;
            case 18:
                return obj instanceof InterfaceC5554 ? C5540.m9920(((InterfaceC5554) obj).getNumber()) : C5540.m9920(((Integer) obj).intValue());
            default:
                C3466.m5899("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return size + iM9918;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m9977(C5541 c5541, WireFormat$FieldType wireFormat$FieldType) {
        switch (AbstractC5562.f14154[wireFormat$FieldType.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                int iM9956 = c5541.m9956();
                int i = c5541.f14114;
                int i2 = c5541.f14112;
                if (iM9956 <= i - i2 && iM9956 > 0) {
                    String str = new String(c5541.f14115, i2, iM9956, "UTF-8");
                    c5541.f14112 += iM9956;
                    break;
                } else if (iM9956 != 0) {
                    break;
                }
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                int iM99562 = c5541.m9956();
                break;
            case 15:
                long jM9953 = c5541.m9953();
                break;
            case 16:
                C6755.m11869("readPrimitiveField() cannot handle nested groups.");
                break;
            case 17:
                C6755.m11869("readPrimitiveField() cannot handle embedded messages.");
                break;
            case 18:
                C6755.m11869("readPrimitiveField() cannot handle enums.");
                break;
            default:
                C3466.m5899("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m9978(C5540 c5540, WireFormat$FieldType wireFormat$FieldType, Object obj) throws IOException {
        switch (AbstractC5562.f14154[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                c5540.getClass();
                c5540.m9926(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                c5540.getClass();
                c5540.m9932(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                c5540.m9927(((Long) obj).longValue());
                break;
            case 4:
                c5540.m9927(((Long) obj).longValue());
                break;
            case 5:
                c5540.m9930(((Integer) obj).intValue());
                break;
            case 6:
                c5540.m9926(((Long) obj).longValue());
                break;
            case 7:
                c5540.m9932(((Integer) obj).intValue());
                break;
            case 8:
                c5540.m9933(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                c5540.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c5540.m9925(bytes.length);
                c5540.m9931(bytes);
                break;
            case 10:
                if (!(obj instanceof AbstractC5542)) {
                    byte[] bArr = (byte[]) obj;
                    c5540.getClass();
                    c5540.m9925(bArr.length);
                    c5540.m9931(bArr);
                } else {
                    AbstractC5542 abstractC5542 = (AbstractC5542) obj;
                    c5540.getClass();
                    c5540.m9925(abstractC5542.size());
                    c5540.m9934(abstractC5542);
                }
                break;
            case 11:
                c5540.m9925(((Integer) obj).intValue());
                break;
            case 12:
                c5540.m9932(((Integer) obj).intValue());
                break;
            case 13:
                c5540.m9926(((Long) obj).longValue());
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                c5540.m9925((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                c5540.m9927((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 16:
                c5540.getClass();
                ((InterfaceC5533) obj).writeTo(c5540);
                break;
            case 17:
                InterfaceC5533 interfaceC5533 = (InterfaceC5533) obj;
                c5540.getClass();
                c5540.m9925(interfaceC5533.getSerializedSize());
                interfaceC5533.writeTo(c5540);
                break;
            case 18:
                if (!(obj instanceof InterfaceC5554)) {
                    c5540.m9930(((Integer) obj).intValue());
                } else {
                    c5540.m9930(((InterfaceC5554) obj).getNumber());
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m9979(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (AbstractC5562.f14155[wireFormat$FieldType.getJavaType().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof AbstractC5542) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof InterfaceC5554)) {
                }
                z2 = z;
                break;
            case 9:
                z2 = obj instanceof InterfaceC5533;
                break;
        }
        if (z2) {
            return;
        }
        C6755.m11869("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m9980() {
        if (this.f14157) {
            return;
        }
        C5528 c5528 = this.f14158;
        if (!c5528.f14088) {
            for (int i = 0; i < c5528.f14089.size(); i++) {
                Map.Entry entry = (Map.Entry) c5528.f14089.get(i);
                if (((C5556) entry.getKey()).f14139) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c5528.m9902()) {
                if (((C5556) entry2.getKey()).f14139) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c5528.f14088) {
            c5528.f14090 = c5528.f14090.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c5528.f14090);
            c5528.f14088 = true;
        }
        this.f14157 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5563 clone() {
        C5528 c5528;
        C5563 c5563 = new C5563();
        int i = 0;
        while (true) {
            c5528 = this.f14158;
            if (i >= c5528.f14089.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c5528.f14089.get(i);
            c5563.m9984((C5556) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c5528.m9902()) {
            c5563.m9984((C5556) entry2.getKey(), entry2.getValue());
        }
        return c5563;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9982(C5556 c5556, Object obj) {
        List arrayList;
        if (!c5556.f14139) {
            C6755.m11869("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m9979(c5556.f14141, obj);
        C5528 c5528 = this.f14158;
        Object obj2 = c5528.get(c5556);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c5528.put(c5556, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m9983(Map.Entry entry) {
        C5556 c5556 = (C5556) entry.getKey();
        Object value = entry.getValue();
        boolean z = c5556.f14139;
        C5528 c5528 = this.f14158;
        if (z) {
            Object arrayList = c5528.get(c5556);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c5528.put(c5556, arrayList);
            return;
        }
        if (c5556.f14141.getJavaType() != WireFormat$JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c5528.put(c5556, value);
            return;
        }
        Object obj2 = c5528.get(c5556);
        if (obj2 != null) {
            c5528.put(c5556, ((AbstractC5561) ((InterfaceC5533) obj2).toBuilder()).mo9829((GeneratedMessageLite) ((InterfaceC5533) value)).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c5528.put(c5556, value);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m9984(C5556 c5556, Object obj) {
        boolean z = c5556.f14139;
        WireFormat$FieldType wireFormat$FieldType = c5556.f14141;
        if (!z) {
            m9979(wireFormat$FieldType, obj);
        } else {
            if (!(obj instanceof List)) {
                C6755.m11869("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m9979(wireFormat$FieldType, it.next());
            }
            obj = arrayList;
        }
        this.f14158.put(c5556, obj);
    }

    public C5563() {
    }
}
