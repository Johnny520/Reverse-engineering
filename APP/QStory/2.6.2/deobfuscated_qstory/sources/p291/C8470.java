package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8470 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8470 f23434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f23439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f23440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f23442;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final char[] f23443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f23444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final byte[] f23445;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f23446;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile InterfaceC8531 f23447;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public volatile InterfaceC8531 f23448;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final long f23449;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Field f23450;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final byte[] f23451;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f23452;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final byte[] f23436 = InterfaceC2911.m6297("JO10");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final long f23437 = AbstractC2859.m5729("JO10");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8470 f23435 = new C8470(Object.class, null, JSONObject.class, JSONObject.class, 0);

    static {
        Class cls = AbstractC2866.f9049;
        if (cls == null) {
            f23434 = null;
        } else {
            f23434 = new C8470(Object.class, null, cls, cls, 0L);
        }
    }

    public C8470(Type type, String str, Class cls, Type type2, long j) {
        long jObjectFieldOffset;
        this.f23440 = type;
        this.f23439 = str;
        this.f23441 = cls;
        this.f23442 = type2;
        this.f23449 = j;
        if (type == null) {
            this.f23438 = true;
        } else {
            this.f23438 = !C8547.m14086(AbstractC2866.m5899(type));
        }
        this.f23446 = (j & Long.MIN_VALUE) != 0;
        String strM5898 = AbstractC2866.m5898(cls);
        String str2 = "\"@type\":\"" + cls.getName() + "\"";
        this.f23443 = str2.toCharArray();
        this.f23445 = str2.getBytes(StandardCharsets.UTF_8);
        boolean zEquals = "JO1".equals(strM5898);
        this.f23451 = InterfaceC2911.m6297(strM5898);
        this.f23452 = AbstractC2859.m5729(strM5898);
        if (zEquals) {
            Field fieldM5768 = AbstractC2864.m5768(cls, "map");
            this.f23450 = fieldM5768;
            if (fieldM5768 != null) {
                fieldM5768.setAccessible(true);
                jObjectFieldOffset = AbstractC2853.f8919.objectFieldOffset(fieldM5768);
            }
            this.f23444 = jObjectFieldOffset;
        }
        this.f23450 = null;
        jObjectFieldOffset = -1;
        this.f23444 = jObjectFieldOffset;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14002(Object obj, AbstractC2896 abstractC2896, long j) {
        if (obj == null) {
            abstractC2896.mo5986("null");
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            abstractC2896.mo5986(str);
            return str;
        }
        if (m14005(obj, j)) {
            String string = obj.toString();
            abstractC2896.mo5986(string);
            return string;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (abstractC2896.f9170) {
                abstractC2896.f9170 = false;
            } else {
                abstractC2896.mo5937();
            }
            abstractC2896.mo5928(iIntValue);
            return null;
        }
        boolean z = obj instanceof Long;
        boolean z2 = abstractC2896.f9170;
        if (!z) {
            if (z2) {
                abstractC2896.f9170 = false;
            } else {
                abstractC2896.mo5937();
            }
            abstractC2896.mo5992(obj);
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        if (z2) {
            abstractC2896.f9170 = false;
        } else {
            abstractC2896.mo5937();
        }
        abstractC2896.mo5918(jLongValue);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p291.C8470 m14003(java.lang.reflect.Type r8, java.lang.String r9, java.lang.Class r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: p291.C8470.m14003(java.lang.reflect.Type, java.lang.String, java.lang.Class):飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8470 m14004(Class cls) {
        return cls == JSONObject.class ? f23435 : cls == AbstractC2866.f9049 ? f23434 : new C8470(null, null, cls, cls, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m14005(Object obj, long j) {
        return ((j & (JSONWriter$Feature.WriteNonStringKeyAsString.mask | JSONWriter$Feature.BrowserCompatible.mask)) == 0 || !C8547.m14085(obj.getClass()) || (obj instanceof Temporal) || (obj instanceof Date)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5633(com.alibaba.fastjson2.AbstractC2896 r28, java.lang.Object r29, java.lang.Object r30, java.lang.reflect.Type r31, long r32) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8470.mo5633(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    @Override // p291.AbstractC8459, p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo13999(AbstractC2896 abstractC2896, Object obj, Type type, long j) {
        AbstractC2896 abstractC28962;
        Map map = (Map) obj;
        abstractC2896.mo5952();
        boolean z = (abstractC2896.f9176.f9151 & JSONWriter$Feature.WriteNulls.mask) != 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                abstractC2896.mo5972(str);
                Class<?> cls = value.getClass();
                if (cls == String.class) {
                    abstractC2896.mo5972((String) value);
                    abstractC28962 = abstractC2896;
                } else {
                    abstractC28962 = abstractC2896;
                    abstractC2896.m6031(cls).mo5633(abstractC28962, value, str, this.f23440, this.f23449);
                }
                abstractC2896 = abstractC28962;
            } else if (z) {
                abstractC2896.mo5972(str);
                abstractC2896.mo5922();
            }
        }
        abstractC2896.mo5949();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x017b A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:94:0x0153, B:103:0x0173, B:105:0x017b, B:106:0x0183, B:108:0x0187, B:110:0x0190, B:109:0x018c), top: B:257:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0183 A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:94:0x0153, B:103:0x0173, B:105:0x017b, B:106:0x0183, B:108:0x0187, B:110:0x0190, B:109:0x018c), top: B:257:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0171 A[SYNTHETIC] */
    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5634(com.alibaba.fastjson2.AbstractC2896 r26, java.lang.Object r27, java.lang.Object r28, java.lang.reflect.Type r29, long r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8470.mo5634(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }
}
