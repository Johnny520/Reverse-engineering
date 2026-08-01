package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import p079.C6987;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4766 {
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
    public static AbstractC4767 m9505(Object obj, C6987 c6987) {
        ?? M13660;
        ?? M136602;
        ?? M136603;
        ?? M136604;
        ?? M136605;
        ?? M136606;
        ?? M136607;
        if (obj instanceof Byte) {
            return new C4750(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C4757(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C4768(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C4759(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C4749((Character) obj);
        }
        if (obj instanceof Float) {
            return new C4751(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C4751(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C4751((Boolean) obj);
        }
        if (obj instanceof String) {
            return new C4747((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                M136607 = EmptyList.INSTANCE;
            } else if (length != 1) {
                M136607 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    M136607.add(Byte.valueOf(bArr[i]));
                    i++;
                }
            } else {
                M136607 = AbstractC8189.m13660(Byte.valueOf(bArr[0]));
            }
            return m9506(M136607, c6987, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                M136606 = EmptyList.INSTANCE;
            } else if (length3 != 1) {
                M136606 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    M136606.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                M136606 = AbstractC8189.m13660(Short.valueOf(sArr[0]));
            }
            return m9506(M136606, c6987, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return m9506(AbstractC4346.m8851((int[]) obj), c6987, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length5 = jArr.length;
            if (length5 == 0) {
                M136605 = EmptyList.INSTANCE;
            } else if (length5 != 1) {
                M136605 = new ArrayList(jArr.length);
                int length6 = jArr.length;
                while (i < length6) {
                    M136605.add(Long.valueOf(jArr[i]));
                    i++;
                }
            } else {
                M136605 = AbstractC8189.m13660(Long.valueOf(jArr[0]));
            }
            return m9506(M136605, c6987, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            if (length7 == 0) {
                M136604 = EmptyList.INSTANCE;
            } else if (length7 != 1) {
                M136604 = new ArrayList(cArr.length);
                int length8 = cArr.length;
                while (i < length8) {
                    M136604.add(Character.valueOf(cArr[i]));
                    i++;
                }
            } else {
                M136604 = AbstractC8189.m13660(Character.valueOf(cArr[0]));
            }
            return m9506(M136604, c6987, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length9 = fArr.length;
            if (length9 == 0) {
                M136603 = EmptyList.INSTANCE;
            } else if (length9 != 1) {
                M136603 = new ArrayList(fArr.length);
                int length10 = fArr.length;
                while (i < length10) {
                    M136603.add(Float.valueOf(fArr[i]));
                    i++;
                }
            } else {
                M136603 = AbstractC8189.m13660(Float.valueOf(fArr[0]));
            }
            return m9506(M136603, c6987, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length11 = dArr.length;
            if (length11 == 0) {
                M136602 = EmptyList.INSTANCE;
            } else if (length11 != 1) {
                M136602 = new ArrayList(dArr.length);
                int length12 = dArr.length;
                while (i < length12) {
                    M136602.add(Double.valueOf(dArr[i]));
                    i++;
                }
            } else {
                M136602 = AbstractC8189.m13660(Double.valueOf(dArr[0]));
            }
            return m9506(M136602, c6987, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C4756(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length13 = zArr.length;
        if (length13 == 0) {
            M13660 = EmptyList.INSTANCE;
        } else if (length13 != 1) {
            M13660 = new ArrayList(zArr.length);
            int length14 = zArr.length;
            while (i < length14) {
                M13660.add(Boolean.valueOf(zArr[i]));
                i++;
            }
        } else {
            M13660 = AbstractC8189.m13660(Boolean.valueOf(zArr[0]));
        }
        return m9506(M13660, c6987, PrimitiveType.BOOLEAN);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4752 m9506(List list, InterfaceC4485 interfaceC4485, PrimitiveType primitiveType) {
        List listM8804 = AbstractC4343.m8804(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM8804.iterator();
        while (it.hasNext()) {
            AbstractC4767 abstractC4767M9505 = m9505(it.next(), null);
            if (abstractC4767M9505 != null) {
                arrayList.add(abstractC4767M9505);
            }
        }
        return interfaceC4485 != null ? new C4746(arrayList, interfaceC4485.mo9071().m11989(primitiveType)) : new C4752(arrayList, new C1012(primitiveType, 12));
    }
}
