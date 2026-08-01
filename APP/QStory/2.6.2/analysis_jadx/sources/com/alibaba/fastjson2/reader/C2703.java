package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import bsh.classpath.C2601;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2703 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2703 f8206 = new C2703(Object.class, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2703 f8205 = new C2703(BigInteger.class, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2703 f8204 = new C2703(Boolean.class, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2703 f8215 = new C2703(Character.class, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2703 f8214 = new C2703(Double.class, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2703 f8218 = new C2703(Float.class, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2703 f8219 = new C2703(Long.class, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2703 f8216 = new C2703(Integer.class, 7);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2703 f8217 = new C2703(Locale.class, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2703 f8209 = new C2703(Number.class, 9);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C2703 f8208 = new C2703(Number[].class, 10);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C2703 f8212 = new C2703(OptionalDouble.class, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C2703 f8213 = new C2703(OptionalInt.class, 12);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2703 f8210 = new C2703(OptionalLong.class, 13);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2703 f8211 = new C2703(String.class, 14);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2703 f8207 = new C2703(UUID.class, 15);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2703(C2601 c2601) {
        super(AtomicInteger.class);
        this.f8220 = 16;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2796, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo5454(long j) {
        switch (this.f8220) {
            case 0:
                return new JSONObject();
            default:
                return super.mo5454(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0345  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5418(com.alibaba.fastjson2.AbstractC2898 r23, java.lang.reflect.Type r24, java.lang.Object r25, long r26) {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2703.mo5418(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo5424(Collection collection, long j) {
        switch (this.f8220) {
            case 0:
                return collection;
            case 10:
                Number[] numberArr = new Number[collection.size()];
                int i = 0;
                for (Object objApply : collection) {
                    if (objApply != null && !(objApply instanceof Number)) {
                        Function functionM5586 = AbstractC2932.m6329().m5586(objApply.getClass(), Number.class);
                        if (functionM5586 == null) {
                            C0276.m849(AbstractC2442.m4571(objApply, new StringBuilder("can not cast to Number ")));
                            return null;
                        }
                        objApply = functionM5586.apply(objApply);
                    }
                    numberArr[i] = (Number) objApply;
                    i++;
                }
                return numberArr;
            case 14:
                if (collection == null) {
                    return null;
                }
                return InterfaceC2915.m6317(collection);
            default:
                return super.mo5424(collection, j);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        InterfaceC2787 interfaceC2787Mo6118;
        int i = this.f8220;
        Class cls = this.f8648;
        Number[] numberArr = null;
        switch (i) {
            case 0:
                byte bMo6138 = abstractC2898.mo6138();
                if (bMo6138 >= 73 && bMo6138 <= 125) {
                    return abstractC2898.mo6139();
                }
                if (bMo6138 == -110 && (interfaceC2787Mo6118 = abstractC2898.mo6118(0L, j, Object.class)) != null) {
                    return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
                }
                if (bMo6138 != -81) {
                    return abstractC2898.mo6078();
                }
                abstractC2898.mo6127();
                return null;
            case 1:
                return abstractC2898.mo6064();
            case 2:
                return abstractC2898.mo6066();
            case 3:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                return Character.valueOf(abstractC2898.mo6063());
            case 4:
                return abstractC2898.m6085();
            case 5:
                return abstractC2898.mo6071();
            case 6:
                return abstractC2898.mo6165();
            case 7:
                return abstractC2898.mo6168();
            case 8:
                String strMo6139 = abstractC2898.mo6139();
                if (strMo6139 == null || strMo6139.isEmpty()) {
                    return null;
                }
                String[] strArrSplit = strMo6139.split(JavaConstant.Dynamic.DEFAULT_NAME);
                return strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            case 9:
                return abstractC2898.mo6147();
            case 10:
                int iMo6187 = abstractC2898.mo6187();
                if (iMo6187 != -1) {
                    numberArr = new Number[iMo6187];
                    for (int i2 = 0; i2 < iMo6187; i2++) {
                        numberArr[i2] = abstractC2898.mo6147();
                    }
                }
                return numberArr;
            case 11:
                Double dM6085 = abstractC2898.m6085();
                return dM6085 == null ? OptionalDouble.empty() : OptionalDouble.of(dM6085.doubleValue());
            case 12:
                Integer numMo6168 = abstractC2898.mo6168();
                return numMo6168 == null ? OptionalInt.empty() : OptionalInt.of(numMo6168.intValue());
            case 13:
                Long lMo6165 = abstractC2898.mo6165();
                return lMo6165 == null ? OptionalLong.empty() : OptionalLong.of(lMo6165.longValue());
            case 14:
                return abstractC2898.mo6139();
            case 15:
                return abstractC2898.mo6198();
            case 16:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                if (cls != AtomicInteger.class || !abstractC2898.mo6097((byte) -110) || abstractC2898.mo6194() == 7576651708426282938L) {
                    return new AtomicInteger(abstractC2898.mo6167());
                }
                C0276.m849(abstractC2898.mo6124(abstractC2898.mo6055()));
                return null;
            default:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                if (cls != AtomicLong.class || !abstractC2898.mo6097((byte) -110) || abstractC2898.mo6194() == -1591858996898070466L) {
                    return new AtomicLong(abstractC2898.mo6164());
                }
                C0276.m849(abstractC2898.mo6124(abstractC2898.mo6055()));
                return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object mo5462(Map map, long j) {
        switch (this.f8220) {
            case 0:
                C2801 c2801M6329 = AbstractC2932.m6329();
                Object obj = map.get("@type");
                if (!(obj instanceof String)) {
                    return map;
                }
                String str = (String) obj;
                InterfaceC2787 interfaceC2787M5585 = (JSONReader$Feature.SupportAutoType.mask & j) != 0 ? c2801M6329.m5585(AbstractC2859.m5729(str)) : null;
                if (interfaceC2787M5585 != null || (interfaceC2787M5585 = c2801M6329.m5584(str, this.f8648, j)) != null) {
                    return interfaceC2787M5585 != this ? interfaceC2787M5585.mo5462(map, j) : map;
                }
                C0276.m849("No suitable ObjectReader found for".concat(str));
                return null;
            case 14:
                if (map == null) {
                    return null;
                }
                return InterfaceC2915.m6317(map);
            default:
                return super.mo5462(map, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2703(Class cls, int i) {
        super(cls);
        this.f8220 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2703(C2767 c2767) {
        super(AtomicLong.class);
        this.f8220 = 17;
    }
}
