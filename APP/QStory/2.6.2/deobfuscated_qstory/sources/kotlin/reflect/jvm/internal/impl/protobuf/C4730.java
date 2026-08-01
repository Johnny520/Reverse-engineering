package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
import bsh.C2632;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4730 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4730 f13807 = new C4730(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f13808;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4695 f13809 = new C4695(16);

    public C4730(int i) {
        m9431();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9425(Map.Entry entry) {
        C4723 c4723 = (C4723) entry.getKey();
        if (c4723.f13792.getJavaType() != WireFormat$JavaType.MESSAGE) {
            return true;
        }
        if (c4723.f13790) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((InterfaceC4700) it.next()).isInitialized()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof InterfaceC4700)) {
            C5919.m11249("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((InterfaceC4700) value).isInitialized()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m9426(C4723 c4723, Object obj) {
        int iM9374;
        int iM9427;
        WireFormat$FieldType wireFormat$FieldType = c4723.f13792;
        int i = c4723.f13791;
        if (c4723.f13790) {
            int iM94272 = 0;
            if (!c4723.f13789) {
                for (Object obj2 : (List) obj) {
                    int iM93742 = C4707.m9374(i);
                    if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                        iM93742 *= 2;
                    }
                    iM94272 += m9427(wireFormat$FieldType, obj2) + iM93742;
                }
                return iM94272;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM94272 += m9427(wireFormat$FieldType, it.next());
            }
            iM9374 = C4707.m9374(i) + iM94272;
            iM9427 = C4707.m9369(iM94272);
        } else {
            iM9374 = C4707.m9374(i);
            if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                iM9374 *= 2;
            }
            iM9427 = m9427(wireFormat$FieldType, obj);
        }
        return iM9427 + iM9374;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m9427(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int iM9369;
        int size;
        switch (AbstractC4729.f13805[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return C4707.m9368(((Long) obj).longValue());
            case 4:
                return C4707.m9368(((Long) obj).longValue());
            case 5:
                return C4707.m9371(((Integer) obj).intValue());
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
                    return C4707.m9369(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    C0276.m847("UTF-8 not supported.", e);
                    return 0;
                }
            case 10:
                if (!(obj instanceof AbstractC4709)) {
                    byte[] bArr = (byte[]) obj;
                    return C4707.m9369(bArr.length) + bArr.length;
                }
                AbstractC4709 abstractC4709 = (AbstractC4709) obj;
                iM9369 = C4707.m9369(abstractC4709.size());
                size = abstractC4709.size();
                break;
                break;
            case 11:
                return C4707.m9369(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                return C4707.m9369((iIntValue >> 31) ^ (iIntValue << 1));
            case 15:
                long jLongValue = ((Long) obj).longValue();
                return C4707.m9368((jLongValue >> 63) ^ (jLongValue << 1));
            case 16:
                return ((InterfaceC4700) obj).getSerializedSize();
            case 17:
                iM9369 = ((InterfaceC4700) obj).getSerializedSize();
                size = C4707.m9369(iM9369);
                break;
            case 18:
                return obj instanceof InterfaceC4721 ? C4707.m9371(((InterfaceC4721) obj).getNumber()) : C4707.m9371(((Integer) obj).intValue());
            default:
                C2632.m5294("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return size + iM9369;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m9428(C4708 c4708, WireFormat$FieldType wireFormat$FieldType) {
        switch (AbstractC4729.f13805[wireFormat$FieldType.ordinal()]) {
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
                int iM9407 = c4708.m9407();
                int i = c4708.f13765;
                int i2 = c4708.f13763;
                if (iM9407 <= i - i2 && iM9407 > 0) {
                    String str = new String(c4708.f13766, i2, iM9407, "UTF-8");
                    c4708.f13763 += iM9407;
                    break;
                } else if (iM9407 != 0) {
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
                int iM94072 = c4708.m9407();
                break;
            case 15:
                long jM9404 = c4708.m9404();
                break;
            case 16:
                C5919.m11249("readPrimitiveField() cannot handle nested groups.");
                break;
            case 17:
                C5919.m11249("readPrimitiveField() cannot handle embedded messages.");
                break;
            case 18:
                C5919.m11249("readPrimitiveField() cannot handle enums.");
                break;
            default:
                C2632.m5294("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m9429(C4707 c4707, WireFormat$FieldType wireFormat$FieldType, Object obj) throws IOException {
        switch (AbstractC4729.f13805[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                c4707.getClass();
                c4707.m9377(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                c4707.getClass();
                c4707.m9383(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                c4707.m9378(((Long) obj).longValue());
                break;
            case 4:
                c4707.m9378(((Long) obj).longValue());
                break;
            case 5:
                c4707.m9381(((Integer) obj).intValue());
                break;
            case 6:
                c4707.m9377(((Long) obj).longValue());
                break;
            case 7:
                c4707.m9383(((Integer) obj).intValue());
                break;
            case 8:
                c4707.m9384(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                c4707.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c4707.m9376(bytes.length);
                c4707.m9382(bytes);
                break;
            case 10:
                if (!(obj instanceof AbstractC4709)) {
                    byte[] bArr = (byte[]) obj;
                    c4707.getClass();
                    c4707.m9376(bArr.length);
                    c4707.m9382(bArr);
                } else {
                    AbstractC4709 abstractC4709 = (AbstractC4709) obj;
                    c4707.getClass();
                    c4707.m9376(abstractC4709.size());
                    c4707.m9385(abstractC4709);
                }
                break;
            case 11:
                c4707.m9376(((Integer) obj).intValue());
                break;
            case 12:
                c4707.m9383(((Integer) obj).intValue());
                break;
            case 13:
                c4707.m9377(((Long) obj).longValue());
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                c4707.m9376((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                c4707.m9378((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 16:
                c4707.getClass();
                ((InterfaceC4700) obj).writeTo(c4707);
                break;
            case 17:
                InterfaceC4700 interfaceC4700 = (InterfaceC4700) obj;
                c4707.getClass();
                c4707.m9376(interfaceC4700.getSerializedSize());
                interfaceC4700.writeTo(c4707);
                break;
            case 18:
                if (!(obj instanceof InterfaceC4721)) {
                    c4707.m9381(((Integer) obj).intValue());
                } else {
                    c4707.m9381(((InterfaceC4721) obj).getNumber());
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
    public static void m9430(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729.f13806
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
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
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
            top.suzhelan.qstory.hook.item.C5919.m11249(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C4730.m9430(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m9431() {
        if (this.f13808) {
            return;
        }
        C4695 c4695 = this.f13809;
        if (!c4695.f13739) {
            for (int i = 0; i < c4695.f13740.size(); i++) {
                Map.Entry entry = (Map.Entry) c4695.f13740.get(i);
                if (((C4723) entry.getKey()).f13790) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c4695.m9353()) {
                if (((C4723) entry2.getKey()).f13790) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c4695.f13739) {
            c4695.f13741 = c4695.f13741.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c4695.f13741);
            c4695.f13739 = true;
        }
        this.f13808 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4730 clone() {
        C4695 c4695;
        C4730 c4730 = new C4730();
        int i = 0;
        while (true) {
            c4695 = this.f13809;
            if (i >= c4695.f13740.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c4695.f13740.get(i);
            c4730.m9435((C4723) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c4695.m9353()) {
            c4730.m9435((C4723) entry2.getKey(), entry2.getValue());
        }
        return c4730;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9433(C4723 c4723, Object obj) {
        List arrayList;
        if (!c4723.f13790) {
            C5919.m11249("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m9430(c4723.f13792, obj);
        C4695 c4695 = this.f13809;
        Object obj2 = c4695.get(c4723);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c4695.put(c4723, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m9434(Map.Entry entry) {
        C4723 c4723 = (C4723) entry.getKey();
        Object value = entry.getValue();
        boolean z = c4723.f13790;
        C4695 c4695 = this.f13809;
        if (z) {
            Object arrayList = c4695.get(c4723);
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
            c4695.put(c4723, arrayList);
            return;
        }
        if (c4723.f13792.getJavaType() != WireFormat$JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c4695.put(c4723, value);
            return;
        }
        Object obj2 = c4695.get(c4723);
        if (obj2 != null) {
            c4695.put(c4723, ((AbstractC4728) ((InterfaceC4700) obj2).toBuilder()).mo9280((GeneratedMessageLite) ((InterfaceC4700) value)).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c4695.put(c4723, value);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m9435(C4723 c4723, Object obj) {
        boolean z = c4723.f13790;
        WireFormat$FieldType wireFormat$FieldType = c4723.f13792;
        if (!z) {
            m9430(wireFormat$FieldType, obj);
        } else {
            if (!(obj instanceof List)) {
                C5919.m11249("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m9430(wireFormat$FieldType, it.next());
            }
            obj = arrayList;
        }
        this.f13809.put(c4723, obj);
    }

    public C4730() {
    }
}
