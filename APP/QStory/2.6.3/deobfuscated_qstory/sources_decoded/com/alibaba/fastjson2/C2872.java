package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import bsh.classpath.C2604;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import p293.C8565;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2872 extends AbstractC2952 implements InterfaceC2940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f9089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2872 f9081 = new C2872(new C2604(3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2872 f9080 = new C2872(new C8565(null, 3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2872 f9079 = new C2872(new C2604(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2872 f9078 = new C2872(new C2604(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2872 f9077 = new C2872(new C2604(8));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2872 f9084 = new C2872(new C2604(9));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2872 f9083 = new C2872(new C2604(10));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2872 f9087 = new C2872(new C2604(11));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2872 f9088 = new C2872(new C2604(12));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2872 f9085 = new C2872(new C2604(13));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2872 f9086 = new C2872(new C2604(4));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2872 f9082 = new C2872(new C2604(5));

    public C2872(Function function) {
        this.f9089 = function;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m5950(Object obj) {
        return obj == null ? "null" : obj instanceof Collection ? "array" : obj instanceof Number ? "number" : obj instanceof Boolean ? "boolean" : ((obj instanceof String) || (obj instanceof UUID) || (obj instanceof Enum)) ? "string" : "object";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m5951(Object obj) {
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
            jSONArray.add(m5951(list.get(i)));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m5952(Object obj) {
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
            C0276.m850(AbstractC0053.m153(obj, "abs not support "));
            return null;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            jSONArray.add(m5952(list.get(i)));
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        c2926.f9269 = this.f9089.apply(c29262 == null ? c2926.f9270 : c29262.f9269);
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        if (c2926.f9273 == null) {
            c2926.f9270 = abstractC2899.mo6124();
            c2926.f9275 = true;
        }
        mo5953(c2926);
    }
}
