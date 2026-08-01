package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import bsh.classpath.C3437;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import p309.C9394;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3705 extends AbstractC3785 implements InterfaceC3773 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f9434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3705 f9426 = new C3705(new C3437(3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3705 f9425 = new C3705(new C9394(null, 3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3705 f9424 = new C3705(new C3437(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3705 f9423 = new C3705(new C3437(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3705 f9422 = new C3705(new C3437(8));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3705 f9429 = new C3705(new C3437(9));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3705 f9428 = new C3705(new C3437(10));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C3705 f9432 = new C3705(new C3437(11));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C3705 f9433 = new C3705(new C3437(12));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C3705 f9430 = new C3705(new C3437(13));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C3705 f9431 = new C3705(new C3437(4));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C3705 f9427 = new C3705(new C3437(5));

    public C3705(Function function) {
        this.f9434 = function;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m6510(Object obj) {
        return obj == null ? "null" : obj instanceof Collection ? "array" : obj instanceof Number ? "number" : obj instanceof Boolean ? "boolean" : ((obj instanceof String) || (obj instanceof UUID) || (obj instanceof Enum)) ? "string" : "object";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m6511(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            return iIntValue == Integer.MIN_VALUE ? Long.valueOf(-iIntValue) : Integer.valueOf(-iIntValue);
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            return jLongValue == Long.MIN_VALUE ? BigInteger.valueOf(jLongValue).negate() : Long.valueOf(-jLongValue);
        }
        if (obj instanceof Byte) {
            byte bByteValue = ((Byte) obj).byteValue();
            return bByteValue == -128 ? Integer.valueOf(-bByteValue) : Byte.valueOf((byte) (-bByteValue));
        }
        if (obj instanceof Short) {
            short sShortValue = ((Short) obj).shortValue();
            return sShortValue == Short.MIN_VALUE ? Integer.valueOf(-sShortValue) : Short.valueOf((short) (-sShortValue));
        }
        if (obj instanceof Double) {
            return Double.valueOf(-((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return Float.valueOf(-((Float) obj).floatValue());
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).negate();
        }
        if (obj instanceof BigInteger) {
            return ((BigInteger) obj).negate();
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            jSONArray.add(m6511(list.get(i)));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m6512(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            return iIntValue < 0 ? Integer.valueOf(-iIntValue) : obj;
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            return jLongValue < 0 ? Long.valueOf(-jLongValue) : obj;
        }
        if (obj instanceof Byte) {
            byte bByteValue = ((Byte) obj).byteValue();
            return bByteValue < 0 ? Byte.valueOf((byte) (-bByteValue)) : obj;
        }
        if (obj instanceof Short) {
            short sShortValue = ((Short) obj).shortValue();
            return sShortValue < 0 ? Short.valueOf((short) (-sShortValue)) : obj;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            return dDoubleValue < 0.0d ? Double.valueOf(-dDoubleValue) : obj;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            return fFloatValue < 0.0f ? Float.valueOf(-fFloatValue) : obj;
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).abs();
        }
        if (obj instanceof BigInteger) {
            return ((BigInteger) obj).abs();
        }
        if (!(obj instanceof List)) {
            C1123.m1410(AbstractC0900.m713(obj, "abs not support "));
            return null;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            jSONArray.add(m6512(list.get(i)));
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        c3759.f9614 = this.f9434.apply(c37592 == null ? c3759.f9615 : c37592.f9614);
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        if (c3759.f9618 == null) {
            c3759.f9615 = abstractC3732.mo6684();
            c3759.f9620 = true;
        }
        mo6513(c3759);
    }
}
