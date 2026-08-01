package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import bsh.classpath.C2602;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2704 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2704 f8208 = new C2704(Object.class, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2704 f8207 = new C2704(BigInteger.class, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2704 f8206 = new C2704(Boolean.class, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2704 f8217 = new C2704(Character.class, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2704 f8216 = new C2704(Double.class, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2704 f8220 = new C2704(Float.class, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2704 f8221 = new C2704(Long.class, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2704 f8218 = new C2704(Integer.class, 7);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2704 f8219 = new C2704(Locale.class, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2704 f8211 = new C2704(Number.class, 9);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C2704 f8210 = new C2704(Number[].class, 10);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C2704 f8214 = new C2704(OptionalDouble.class, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C2704 f8215 = new C2704(OptionalInt.class, 12);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2704 f8212 = new C2704(OptionalLong.class, 13);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2704 f8213 = new C2704(String.class, 14);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2704 f8209 = new C2704(UUID.class, 15);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2704(C2602 c2602) {
        super(AtomicInteger.class);
        this.f8222 = 16;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2797, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo5499(long j) {
        switch (this.f8222) {
            case 0:
                return new JSONObject();
            default:
                return super.mo5499(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0345  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5463(com.alibaba.fastjson2.AbstractC2899 r23, java.lang.reflect.Type r24, java.lang.Object r25, long r26) {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2704.mo5463(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo5469(Collection collection, long j) {
        switch (this.f8222) {
            case 0:
                return collection;
            case 10:
                Number[] numberArr = new Number[collection.size()];
                int i = 0;
                for (Object objApply : collection) {
                    if (objApply != null && !(objApply instanceof Number)) {
                        Function functionM5631 = AbstractC2933.m6387().m5631(objApply.getClass(), Number.class);
                        if (functionM5631 == null) {
                            C0276.m850(AbstractC2442.m4581(objApply, new StringBuilder("can not cast to Number ")));
                            return null;
                        }
                        objApply = functionM5631.apply(objApply);
                    }
                    numberArr[i] = (Number) objApply;
                    i++;
                }
                return numberArr;
            case 14:
                if (collection == null) {
                    return null;
                }
                return InterfaceC2916.m6375(collection);
            default:
                return super.mo5469(collection, j);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        InterfaceC2788 interfaceC2788Mo6164;
        int i = this.f8222;
        Class cls = this.f8650;
        Number[] numberArr = null;
        switch (i) {
            case 0:
                byte bMo6183 = abstractC2899.mo6183();
                if (bMo6183 >= 73 && bMo6183 <= 125) {
                    return abstractC2899.mo6184();
                }
                if (bMo6183 == -110 && (interfaceC2788Mo6164 = abstractC2899.mo6164(0L, j, Object.class)) != null) {
                    return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
                }
                if (bMo6183 != -81) {
                    return abstractC2899.mo6124();
                }
                abstractC2899.mo6173();
                return null;
            case 1:
                return abstractC2899.mo6110();
            case 2:
                return abstractC2899.mo6112();
            case 3:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                return Character.valueOf(abstractC2899.mo6109());
            case 4:
                return abstractC2899.m6131();
            case 5:
                return abstractC2899.mo6117();
            case 6:
                return abstractC2899.mo6210();
            case 7:
                return abstractC2899.mo6213();
            case 8:
                String strMo6184 = abstractC2899.mo6184();
                if (strMo6184 == null || strMo6184.isEmpty()) {
                    return null;
                }
                String[] strArrSplit = strMo6184.split(JavaConstant.Dynamic.DEFAULT_NAME);
                return strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            case 9:
                return abstractC2899.mo6192();
            case 10:
                int iMo6232 = abstractC2899.mo6232();
                if (iMo6232 != -1) {
                    numberArr = new Number[iMo6232];
                    for (int i2 = 0; i2 < iMo6232; i2++) {
                        numberArr[i2] = abstractC2899.mo6192();
                    }
                }
                return numberArr;
            case 11:
                Double dM6131 = abstractC2899.m6131();
                return dM6131 == null ? OptionalDouble.empty() : OptionalDouble.of(dM6131.doubleValue());
            case 12:
                Integer numMo6213 = abstractC2899.mo6213();
                return numMo6213 == null ? OptionalInt.empty() : OptionalInt.of(numMo6213.intValue());
            case 13:
                Long lMo6210 = abstractC2899.mo6210();
                return lMo6210 == null ? OptionalLong.empty() : OptionalLong.of(lMo6210.longValue());
            case 14:
                return abstractC2899.mo6184();
            case 15:
                return abstractC2899.mo6243();
            case 16:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                if (cls != AtomicInteger.class || !abstractC2899.mo6143((byte) -110) || abstractC2899.mo6239() == 7576651708426282938L) {
                    return new AtomicInteger(abstractC2899.mo6212());
                }
                C0276.m850(abstractC2899.mo6170(abstractC2899.mo6100()));
                return null;
            default:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                if (cls != AtomicLong.class || !abstractC2899.mo6143((byte) -110) || abstractC2899.mo6239() == -1591858996898070466L) {
                    return new AtomicLong(abstractC2899.mo6209());
                }
                C0276.m850(abstractC2899.mo6170(abstractC2899.mo6100()));
                return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object mo5507(Map map, long j) {
        switch (this.f8222) {
            case 0:
                C2802 c2802M6387 = AbstractC2933.m6387();
                Object obj = map.get("@type");
                if (!(obj instanceof String)) {
                    return map;
                }
                String str = (String) obj;
                InterfaceC2788 interfaceC2788M5630 = (JSONReader$Feature.SupportAutoType.mask & j) != 0 ? c2802M6387.m5630(AbstractC2860.m5774(str)) : null;
                if (interfaceC2788M5630 != null || (interfaceC2788M5630 = c2802M6387.m5629(str, this.f8650, j)) != null) {
                    return interfaceC2788M5630 != this ? interfaceC2788M5630.mo5507(map, j) : map;
                }
                C0276.m850("No suitable ObjectReader found for".concat(str));
                return null;
            case 14:
                if (map == null) {
                    return null;
                }
                return InterfaceC2916.m6375(map);
            default:
                return super.mo5507(map, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2704(Class cls, int i) {
        super(cls);
        this.f8222 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2704(C2768 c2768) {
        super(AtomicLong.class);
        this.f8222 = 17;
    }
}
