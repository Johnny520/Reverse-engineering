package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.foundation.text.C1850;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import p050.AbstractC7176;
import p095.C7817;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5599 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v46, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v51, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AbstractC5600 m10054(Object obj, C7817 c7817) {
        ?? M12487;
        ?? M124872;
        ?? M124873;
        ?? M124874;
        ?? M124875;
        ?? M124876;
        ?? M124877;
        if (obj instanceof Byte) {
            return new C5583(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C5590(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C5601(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C5592(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C5582((Character) obj);
        }
        if (obj instanceof Float) {
            return new C5584(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C5584(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C5584((Boolean) obj);
        }
        if (obj instanceof String) {
            return new C5580((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                M124877 = EmptyList.INSTANCE;
            } else if (length != 1) {
                M124877 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    M124877.add(Byte.valueOf(bArr[i]));
                    i++;
                }
            } else {
                M124877 = AbstractC7176.m12487(Byte.valueOf(bArr[0]));
            }
            return m10055(M124877, c7817, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                M124876 = EmptyList.INSTANCE;
            } else if (length3 != 1) {
                M124876 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    M124876.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                M124876 = AbstractC7176.m12487(Short.valueOf(sArr[0]));
            }
            return m10055(M124876, c7817, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return m10055(AbstractC5179.m9406((int[]) obj), c7817, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length5 = jArr.length;
            if (length5 == 0) {
                M124875 = EmptyList.INSTANCE;
            } else if (length5 != 1) {
                M124875 = new ArrayList(jArr.length);
                int length6 = jArr.length;
                while (i < length6) {
                    M124875.add(Long.valueOf(jArr[i]));
                    i++;
                }
            } else {
                M124875 = AbstractC7176.m12487(Long.valueOf(jArr[0]));
            }
            return m10055(M124875, c7817, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            if (length7 == 0) {
                M124874 = EmptyList.INSTANCE;
            } else if (length7 != 1) {
                M124874 = new ArrayList(cArr.length);
                int length8 = cArr.length;
                while (i < length8) {
                    M124874.add(Character.valueOf(cArr[i]));
                    i++;
                }
            } else {
                M124874 = AbstractC7176.m12487(Character.valueOf(cArr[0]));
            }
            return m10055(M124874, c7817, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length9 = fArr.length;
            if (length9 == 0) {
                M124873 = EmptyList.INSTANCE;
            } else if (length9 != 1) {
                M124873 = new ArrayList(fArr.length);
                int length10 = fArr.length;
                while (i < length10) {
                    M124873.add(Float.valueOf(fArr[i]));
                    i++;
                }
            } else {
                M124873 = AbstractC7176.m12487(Float.valueOf(fArr[0]));
            }
            return m10055(M124873, c7817, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length11 = dArr.length;
            if (length11 == 0) {
                M124872 = EmptyList.INSTANCE;
            } else if (length11 != 1) {
                M124872 = new ArrayList(dArr.length);
                int length12 = dArr.length;
                while (i < length12) {
                    M124872.add(Double.valueOf(dArr[i]));
                    i++;
                }
            } else {
                M124872 = AbstractC7176.m12487(Double.valueOf(dArr[0]));
            }
            return m10055(M124872, c7817, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C5589(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length13 = zArr.length;
        if (length13 == 0) {
            M12487 = EmptyList.INSTANCE;
        } else if (length13 != 1) {
            M12487 = new ArrayList(zArr.length);
            int length14 = zArr.length;
            while (i < length14) {
                M12487.add(Boolean.valueOf(zArr[i]));
                i++;
            }
        } else {
            M12487 = AbstractC7176.m12487(Boolean.valueOf(zArr[0]));
        }
        return m10055(M12487, c7817, PrimitiveType.BOOLEAN);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5585 m10055(List list, InterfaceC5318 interfaceC5318, PrimitiveType primitiveType) {
        List listM9356 = AbstractC5176.m9356(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM9356.iterator();
        while (it.hasNext()) {
            AbstractC5600 abstractC5600M10054 = m10054(it.next(), null);
            if (abstractC5600M10054 != null) {
                arrayList.add(abstractC5600M10054);
            }
        }
        return interfaceC5318 != null ? new C5579(arrayList, interfaceC5318.mo9620().m12591(primitiveType)) : new C5585(arrayList, new C1850(primitiveType, 12));
    }
}
