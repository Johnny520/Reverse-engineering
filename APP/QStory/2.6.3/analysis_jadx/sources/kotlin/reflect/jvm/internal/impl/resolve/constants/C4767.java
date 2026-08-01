package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import p034.AbstractC6347;
import p079.C6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4767 {
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
    public static AbstractC4768 m9495(Object obj, C6988 c6988) {
        ?? M11928;
        ?? M119282;
        ?? M119283;
        ?? M119284;
        ?? M119285;
        ?? M119286;
        ?? M119287;
        if (obj instanceof Byte) {
            return new C4751(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C4758(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C4769(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C4760(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C4750((Character) obj);
        }
        if (obj instanceof Float) {
            return new C4752(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C4752(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C4752((Boolean) obj);
        }
        if (obj instanceof String) {
            return new C4748((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                M119287 = EmptyList.INSTANCE;
            } else if (length != 1) {
                M119287 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    M119287.add(Byte.valueOf(bArr[i]));
                    i++;
                }
            } else {
                M119287 = AbstractC6347.m11928(Byte.valueOf(bArr[0]));
            }
            return m9496(M119287, c6988, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                M119286 = EmptyList.INSTANCE;
            } else if (length3 != 1) {
                M119286 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    M119286.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                M119286 = AbstractC6347.m11928(Short.valueOf(sArr[0]));
            }
            return m9496(M119286, c6988, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return m9496(AbstractC4347.m8847((int[]) obj), c6988, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length5 = jArr.length;
            if (length5 == 0) {
                M119285 = EmptyList.INSTANCE;
            } else if (length5 != 1) {
                M119285 = new ArrayList(jArr.length);
                int length6 = jArr.length;
                while (i < length6) {
                    M119285.add(Long.valueOf(jArr[i]));
                    i++;
                }
            } else {
                M119285 = AbstractC6347.m11928(Long.valueOf(jArr[0]));
            }
            return m9496(M119285, c6988, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            if (length7 == 0) {
                M119284 = EmptyList.INSTANCE;
            } else if (length7 != 1) {
                M119284 = new ArrayList(cArr.length);
                int length8 = cArr.length;
                while (i < length8) {
                    M119284.add(Character.valueOf(cArr[i]));
                    i++;
                }
            } else {
                M119284 = AbstractC6347.m11928(Character.valueOf(cArr[0]));
            }
            return m9496(M119284, c6988, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length9 = fArr.length;
            if (length9 == 0) {
                M119283 = EmptyList.INSTANCE;
            } else if (length9 != 1) {
                M119283 = new ArrayList(fArr.length);
                int length10 = fArr.length;
                while (i < length10) {
                    M119283.add(Float.valueOf(fArr[i]));
                    i++;
                }
            } else {
                M119283 = AbstractC6347.m11928(Float.valueOf(fArr[0]));
            }
            return m9496(M119283, c6988, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length11 = dArr.length;
            if (length11 == 0) {
                M119282 = EmptyList.INSTANCE;
            } else if (length11 != 1) {
                M119282 = new ArrayList(dArr.length);
                int length12 = dArr.length;
                while (i < length12) {
                    M119282.add(Double.valueOf(dArr[i]));
                    i++;
                }
            } else {
                M119282 = AbstractC6347.m11928(Double.valueOf(dArr[0]));
            }
            return m9496(M119282, c6988, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C4757(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length13 = zArr.length;
        if (length13 == 0) {
            M11928 = EmptyList.INSTANCE;
        } else if (length13 != 1) {
            M11928 = new ArrayList(zArr.length);
            int length14 = zArr.length;
            while (i < length14) {
                M11928.add(Boolean.valueOf(zArr[i]));
                i++;
            }
        } else {
            M11928 = AbstractC6347.m11928(Boolean.valueOf(zArr[0]));
        }
        return m9496(M11928, c6988, PrimitiveType.BOOLEAN);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4753 m9496(List list, InterfaceC4486 interfaceC4486, PrimitiveType primitiveType) {
        List listM8797 = AbstractC4344.m8797(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM8797.iterator();
        while (it.hasNext()) {
            AbstractC4768 abstractC4768M9495 = m9495(it.next(), null);
            if (abstractC4768M9495 != null) {
                arrayList.add(abstractC4768M9495);
            }
        }
        return interfaceC4486 != null ? new C4747(arrayList, interfaceC4486.mo9061().m12032(primitiveType)) : new C4753(arrayList, new C1012(primitiveType, 12));
    }
}
