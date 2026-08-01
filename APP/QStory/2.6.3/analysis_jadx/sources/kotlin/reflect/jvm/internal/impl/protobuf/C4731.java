package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
import bsh.C2633;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4731 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4731 f13811 = new C4731(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f13812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4696 f13813 = new C4696(16);

    public C4731(int i) {
        m9421();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9415(Map.Entry entry) {
        C4724 c4724 = (C4724) entry.getKey();
        if (c4724.f13796.getJavaType() != WireFormat$JavaType.MESSAGE) {
            return true;
        }
        if (c4724.f13794) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((InterfaceC4701) it.next()).isInitialized()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof InterfaceC4701)) {
            C5925.m11310("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((InterfaceC4701) value).isInitialized()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m9416(C4724 c4724, Object obj) {
        int iM9364;
        int iM9417;
        WireFormat$FieldType wireFormat$FieldType = c4724.f13796;
        int i = c4724.f13795;
        if (c4724.f13794) {
            int iM94172 = 0;
            if (!c4724.f13793) {
                for (Object obj2 : (List) obj) {
                    int iM93642 = C4708.m9364(i);
                    if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                        iM93642 *= 2;
                    }
                    iM94172 += m9417(wireFormat$FieldType, obj2) + iM93642;
                }
                return iM94172;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM94172 += m9417(wireFormat$FieldType, it.next());
            }
            iM9364 = C4708.m9364(i) + iM94172;
            iM9417 = C4708.m9359(iM94172);
        } else {
            iM9364 = C4708.m9364(i);
            if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                iM9364 *= 2;
            }
            iM9417 = m9417(wireFormat$FieldType, obj);
        }
        return iM9417 + iM9364;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9417(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int iM9359;
        int size;
        switch (AbstractC4730.f13809[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return C4708.m9358(((Long) obj).longValue());
            case 4:
                return C4708.m9358(((Long) obj).longValue());
            case 5:
                return C4708.m9361(((Integer) obj).intValue());
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
                    return C4708.m9359(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    C0276.m848("UTF-8 not supported.", e);
                    return 0;
                }
            case 10:
                if (!(obj instanceof AbstractC4710)) {
                    byte[] bArr = (byte[]) obj;
                    return C4708.m9359(bArr.length) + bArr.length;
                }
                AbstractC4710 abstractC4710 = (AbstractC4710) obj;
                iM9359 = C4708.m9359(abstractC4710.size());
                size = abstractC4710.size();
                break;
                break;
            case 11:
                return C4708.m9359(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                return C4708.m9359((iIntValue >> 31) ^ (iIntValue << 1));
            case 15:
                long jLongValue = ((Long) obj).longValue();
                return C4708.m9358((jLongValue >> 63) ^ (jLongValue << 1));
            case 16:
                return ((InterfaceC4701) obj).getSerializedSize();
            case 17:
                iM9359 = ((InterfaceC4701) obj).getSerializedSize();
                size = C4708.m9359(iM9359);
                break;
            case 18:
                return obj instanceof InterfaceC4722 ? C4708.m9361(((InterfaceC4722) obj).getNumber()) : C4708.m9361(((Integer) obj).intValue());
            default:
                C2633.m5339("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return size + iM9359;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m9418(C4709 c4709, WireFormat$FieldType wireFormat$FieldType) {
        switch (AbstractC4730.f13809[wireFormat$FieldType.ordinal()]) {
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
                int iM9397 = c4709.m9397();
                int i = c4709.f13769;
                int i2 = c4709.f13767;
                if (iM9397 <= i - i2 && iM9397 > 0) {
                    String str = new String(c4709.f13770, i2, iM9397, "UTF-8");
                    c4709.f13767 += iM9397;
                    break;
                } else if (iM9397 != 0) {
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
                int iM93972 = c4709.m9397();
                break;
            case 15:
                long jM9394 = c4709.m9394();
                break;
            case 16:
                C5925.m11310("readPrimitiveField() cannot handle nested groups.");
                break;
            case 17:
                C5925.m11310("readPrimitiveField() cannot handle embedded messages.");
                break;
            case 18:
                C5925.m11310("readPrimitiveField() cannot handle enums.");
                break;
            default:
                C2633.m5339("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m9419(C4708 c4708, WireFormat$FieldType wireFormat$FieldType, Object obj) throws IOException {
        switch (AbstractC4730.f13809[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                c4708.getClass();
                c4708.m9367(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                c4708.getClass();
                c4708.m9373(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                c4708.m9368(((Long) obj).longValue());
                break;
            case 4:
                c4708.m9368(((Long) obj).longValue());
                break;
            case 5:
                c4708.m9371(((Integer) obj).intValue());
                break;
            case 6:
                c4708.m9367(((Long) obj).longValue());
                break;
            case 7:
                c4708.m9373(((Integer) obj).intValue());
                break;
            case 8:
                c4708.m9374(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                c4708.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c4708.m9366(bytes.length);
                c4708.m9372(bytes);
                break;
            case 10:
                if (!(obj instanceof AbstractC4710)) {
                    byte[] bArr = (byte[]) obj;
                    c4708.getClass();
                    c4708.m9366(bArr.length);
                    c4708.m9372(bArr);
                } else {
                    AbstractC4710 abstractC4710 = (AbstractC4710) obj;
                    c4708.getClass();
                    c4708.m9366(abstractC4710.size());
                    c4708.m9375(abstractC4710);
                }
                break;
            case 11:
                c4708.m9366(((Integer) obj).intValue());
                break;
            case 12:
                c4708.m9373(((Integer) obj).intValue());
                break;
            case 13:
                c4708.m9367(((Long) obj).longValue());
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                c4708.m9366((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                c4708.m9368((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 16:
                c4708.getClass();
                ((InterfaceC4701) obj).writeTo(c4708);
                break;
            case 17:
                InterfaceC4701 interfaceC4701 = (InterfaceC4701) obj;
                c4708.getClass();
                c4708.m9366(interfaceC4701.getSerializedSize());
                interfaceC4701.writeTo(c4708);
                break;
            case 18:
                if (!(obj instanceof InterfaceC4722)) {
                    c4708.m9371(((Integer) obj).intValue());
                } else {
                    c4708.m9371(((InterfaceC4722) obj).getNumber());
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m9420(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4730.f13810
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L24;
                case 8: goto L18;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L3e
        L15:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L21
            goto L22
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            top.suzhelan.qstory.hook.item.C5925.m11310(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C4731.m9420(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m9421() {
        if (this.f13812) {
            return;
        }
        C4696 c4696 = this.f13813;
        if (!c4696.f13743) {
            for (int i = 0; i < c4696.f13744.size(); i++) {
                Map.Entry entry = (Map.Entry) c4696.f13744.get(i);
                if (((C4724) entry.getKey()).f13794) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c4696.m9343()) {
                if (((C4724) entry2.getKey()).f13794) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c4696.f13743) {
            c4696.f13745 = c4696.f13745.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c4696.f13745);
            c4696.f13743 = true;
        }
        this.f13812 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4731 clone() {
        C4696 c4696;
        C4731 c4731 = new C4731();
        int i = 0;
        while (true) {
            c4696 = this.f13813;
            if (i >= c4696.f13744.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c4696.f13744.get(i);
            c4731.m9425((C4724) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c4696.m9343()) {
            c4731.m9425((C4724) entry2.getKey(), entry2.getValue());
        }
        return c4731;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9423(C4724 c4724, Object obj) {
        List arrayList;
        if (!c4724.f13794) {
            C5925.m11310("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m9420(c4724.f13796, obj);
        C4696 c4696 = this.f13813;
        Object obj2 = c4696.get(c4724);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c4696.put(c4724, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m9424(Map.Entry entry) {
        C4724 c4724 = (C4724) entry.getKey();
        Object value = entry.getValue();
        boolean z = c4724.f13794;
        C4696 c4696 = this.f13813;
        if (z) {
            Object arrayList = c4696.get(c4724);
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
            c4696.put(c4724, arrayList);
            return;
        }
        if (c4724.f13796.getJavaType() != WireFormat$JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c4696.put(c4724, value);
            return;
        }
        Object obj2 = c4696.get(c4724);
        if (obj2 != null) {
            c4696.put(c4724, ((AbstractC4729) ((InterfaceC4701) obj2).toBuilder()).mo9270((GeneratedMessageLite) ((InterfaceC4701) value)).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c4696.put(c4724, value);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m9425(C4724 c4724, Object obj) {
        boolean z = c4724.f13794;
        WireFormat$FieldType wireFormat$FieldType = c4724.f13796;
        if (!z) {
            m9420(wireFormat$FieldType, obj);
        } else {
            if (!(obj instanceof List)) {
                C5925.m11310("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m9420(wireFormat$FieldType, it.next());
            }
            obj = arrayList;
        }
        this.f13813.put(c4724, obj);
    }

    public C4731() {
    }
}
