package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8462 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8462 f23425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f23430;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f23431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final char[] f23434;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f23435;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final byte[] f23436;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f23437;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile InterfaceC8523 f23438;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile InterfaceC8523 f23439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final long f23440;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Field f23441;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final byte[] f23442;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f23443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final byte[] f23427 = InterfaceC2912.m6355("JO10");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final long f23428 = AbstractC2860.m5774("JO10");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8462 f23426 = new C8462(Object.class, null, JSONObject.class, JSONObject.class, 0);

    static {
        Class cls = AbstractC2867.f9051;
        if (cls == null) {
            f23425 = null;
        } else {
            f23425 = new C8462(Object.class, null, cls, cls, 0L);
        }
    }

    public C8462(Type type, String str, Class cls, Type type2, long j) {
        long jObjectFieldOffset;
        this.f23431 = type;
        this.f23430 = str;
        this.f23432 = cls;
        this.f23433 = type2;
        this.f23440 = j;
        if (type == null) {
            this.f23429 = true;
        } else {
            this.f23429 = !C8539.m14105(AbstractC2867.m5944(type));
        }
        this.f23437 = (j & Long.MIN_VALUE) != 0;
        String strM5943 = AbstractC2867.m5943(cls);
        String str2 = "\"@type\":\"" + cls.getName() + "\"";
        this.f23434 = str2.toCharArray();
        this.f23436 = str2.getBytes(StandardCharsets.UTF_8);
        boolean zEquals = "JO1".equals(strM5943);
        this.f23442 = InterfaceC2912.m6355(strM5943);
        this.f23443 = AbstractC2860.m5774(strM5943);
        if (zEquals) {
            Field fieldM5813 = AbstractC2865.m5813(cls, "map");
            this.f23441 = fieldM5813;
            if (fieldM5813 != null) {
                fieldM5813.setAccessible(true);
                jObjectFieldOffset = AbstractC2854.f8921.objectFieldOffset(fieldM5813);
            }
            this.f23435 = jObjectFieldOffset;
        }
        this.f23441 = null;
        jObjectFieldOffset = -1;
        this.f23435 = jObjectFieldOffset;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14021(Object obj, AbstractC2897 abstractC2897, long j) {
        if (obj == null) {
            abstractC2897.mo6031("null");
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            abstractC2897.mo6031(str);
            return str;
        }
        if (m14024(obj, j)) {
            String string = obj.toString();
            abstractC2897.mo6031(string);
            return string;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (abstractC2897.f9172) {
                abstractC2897.f9172 = false;
            } else {
                abstractC2897.mo5982();
            }
            abstractC2897.mo5973(iIntValue);
            return null;
        }
        boolean z = obj instanceof Long;
        boolean z2 = abstractC2897.f9172;
        if (!z) {
            if (z2) {
                abstractC2897.f9172 = false;
            } else {
                abstractC2897.mo5982();
            }
            abstractC2897.mo6037(obj);
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        if (z2) {
            abstractC2897.f9172 = false;
        } else {
            abstractC2897.mo5982();
        }
        abstractC2897.mo5963(jLongValue);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p291.C8462 m14022(java.lang.reflect.Type r8, java.lang.String r9, java.lang.Class r10) {
        /*
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1a
            r0 = r8
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r0.getRawType()
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L1a
            r1 = 0
            r1 = r0[r1]
            r1 = 1
            r0 = r0[r1]
        L18:
            r2 = r0
            goto L1c
        L1a:
            r0 = 0
            goto L18
        L1c:
            飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世 r1 = new 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世
            r6 = 0
            r5 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8462.m14022(java.lang.reflect.Type, java.lang.String, java.lang.Class):飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8462 m14023(Class cls) {
        return cls == JSONObject.class ? f23426 : cls == AbstractC2867.f9051 ? f23425 : new C8462(null, null, cls, cls, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m14024(Object obj, long j) {
        return ((j & (JSONWriter$Feature.WriteNonStringKeyAsString.mask | JSONWriter$Feature.BrowserCompatible.mask)) == 0 || !C8539.m14104(obj.getClass()) || (obj instanceof Temporal) || (obj instanceof Date)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5678(com.alibaba.fastjson2.AbstractC2897 r28, java.lang.Object r29, java.lang.Object r30, java.lang.reflect.Type r31, long r32) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8462.mo5678(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    @Override // p291.AbstractC8451, p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo14018(AbstractC2897 abstractC2897, Object obj, Type type, long j) {
        AbstractC2897 abstractC28972;
        Map map = (Map) obj;
        abstractC2897.mo5997();
        boolean z = (abstractC2897.f9178.f9153 & JSONWriter$Feature.WriteNulls.mask) != 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                abstractC2897.mo6017(str);
                Class<?> cls = value.getClass();
                if (cls == String.class) {
                    abstractC2897.mo6017((String) value);
                    abstractC28972 = abstractC2897;
                } else {
                    abstractC28972 = abstractC2897;
                    abstractC2897.m6077(cls).mo5678(abstractC28972, value, str, this.f23431, this.f23440);
                }
                abstractC2897 = abstractC28972;
            } else if (z) {
                abstractC2897.mo6017(str);
                abstractC2897.mo5967();
            }
        }
        abstractC2897.mo5994();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x017b A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:94:0x0153, B:103:0x0173, B:105:0x017b, B:106:0x0183, B:108:0x0187, B:110:0x0190, B:109:0x018c), top: B:257:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0183 A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:94:0x0153, B:103:0x0173, B:105:0x017b, B:106:0x0183, B:108:0x0187, B:110:0x0190, B:109:0x018c), top: B:257:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0171 A[SYNTHETIC] */
    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5679(com.alibaba.fastjson2.AbstractC2897 r26, java.lang.Object r27, java.lang.Object r28, java.lang.reflect.Type r29, long r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8462.mo5679(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }
}
