package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import bsh.classpath.C2603;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import p293.C8573;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2871 extends AbstractC2951 implements InterfaceC2939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f9087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2871 f9079 = new C2871(new C2603(3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2871 f9078 = new C2871(new C8573(null, 3));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2871 f9077 = new C2871(new C2603(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2871 f9076 = new C2871(new C2603(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2871 f9075 = new C2871(new C2603(8));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2871 f9082 = new C2871(new C2603(9));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2871 f9081 = new C2871(new C2603(10));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2871 f9085 = new C2871(new C2603(11));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2871 f9086 = new C2871(new C2603(12));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2871 f9083 = new C2871(new C2603(13));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2871 f9084 = new C2871(new C2603(4));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2871 f9080 = new C2871(new C2603(5));

    public C2871(Function function) {
        this.f9087 = function;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m5905(Object obj) {
        return obj == null ? "null" : obj instanceof Collection ? "array" : obj instanceof Number ? "number" : obj instanceof Boolean ? "boolean" : ((obj instanceof String) || (obj instanceof UUID) || (obj instanceof Enum)) ? "string" : "object";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m5906(Object obj) {
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
            jSONArray.add(m5906(list.get(i)));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m5907(Object obj) {
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
            C0276.m849(AbstractC0053.m153(obj, "abs not support "));
            return null;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            jSONArray.add(m5907(list.get(i)));
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        c2925.f9267 = this.f9087.apply(c29252 == null ? c2925.f9268 : c29252.f9267);
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        if (c2925.f9271 == null) {
            c2925.f9268 = abstractC2898.mo6078();
            c2925.f9273 = true;
        }
        mo5908(c2925);
    }
}
