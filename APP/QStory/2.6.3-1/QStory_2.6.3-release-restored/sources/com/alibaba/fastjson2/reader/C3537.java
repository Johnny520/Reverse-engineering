package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import bsh.classpath.C3435;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
public final class C3537 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3537 f8553 = new C3537(Object.class, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3537 f8552 = new C3537(BigInteger.class, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3537 f8551 = new C3537(Boolean.class, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3537 f8562 = new C3537(Character.class, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3537 f8561 = new C3537(Double.class, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C3537 f8565 = new C3537(Float.class, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C3537 f8566 = new C3537(Long.class, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C3537 f8563 = new C3537(Integer.class, 7);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C3537 f8564 = new C3537(Locale.class, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C3537 f8556 = new C3537(Number.class, 9);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C3537 f8555 = new C3537(Number[].class, 10);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C3537 f8559 = new C3537(OptionalDouble.class, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C3537 f8560 = new C3537(OptionalInt.class, 12);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3537 f8557 = new C3537(OptionalLong.class, 13);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3537 f8558 = new C3537(String.class, 14);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C3537 f8554 = new C3537(UUID.class, 15);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3537(C3435 c3435) {
        super(AtomicInteger.class);
        this.f8567 = 16;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3630, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo6059(long j) {
        switch (this.f8567) {
            case 0:
                return new JSONObject();
            default:
                return super.mo6059(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0345  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object obj2;
        long j2;
        String strMo6744;
        long jMo6689;
        Object objMo6686;
        char c;
        Object objMo6744;
        Object objPut;
        InterfaceC3621 interfaceC3621M6970;
        Class clsMo6058;
        Class<?> clsLoadClass;
        int i = 0;
        switch (this.f8567) {
            case 0:
                boolean z = abstractC3732.f9544;
                C3776 c3776 = abstractC3732.f9546;
                if (z) {
                    return abstractC3732.mo6684();
                }
                long j3 = j | c3776.f9665;
                if (!abstractC3732.mo6737()) {
                    char c2 = abstractC3732.f9538;
                    if (c2 == '/') {
                        abstractC3732.mo6795();
                        c2 = abstractC3732.f9538;
                    }
                    if (c2 == '\"' || c2 == '\'') {
                        return abstractC3732.mo6744();
                    }
                    if (c2 != '+') {
                        if (c2 != 'S') {
                            if (c2 == '[') {
                                return abstractC3732.mo6685();
                            }
                            if (c2 != 'f') {
                                if (c2 == 'n') {
                                    return abstractC3732.mo6753();
                                }
                                if (c2 != 't') {
                                    if (c2 == 'x') {
                                        return abstractC3732.mo6673();
                                    }
                                    if (c2 != '-' && c2 != '.') {
                                        switch (c2) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                C1123.m1410(abstractC3732.mo6730(null));
                                                break;
                                        }
                                    }
                                }
                            }
                            return Boolean.valueOf(abstractC3732.mo6668());
                        }
                        if (!abstractC3732.mo6707()) {
                            C1123.m1410(abstractC3732.mo6730(null));
                            return null;
                        }
                        HashSet hashSet = new HashSet();
                        if (abstractC3732.mo6701()) {
                            int i2 = abstractC3732.f9534 + 1;
                            abstractC3732.f9534 = i2;
                            if (i2 < 2048) {
                                while (!abstractC3732.mo6702()) {
                                    hashSet.add(abstractC3732.mo6684());
                                    abstractC3732.mo6705();
                                }
                                abstractC3732.f9534--;
                                abstractC3732.mo6705();
                                obj2 = hashSet;
                                return obj2;
                            }
                            C1123.m1404(abstractC3732.f9534, "level too large : ");
                        } else {
                            C3775.m6953(abstractC3732.f9539, abstractC3732.f9538, "illegal input, offset ");
                        }
                        return null;
                    }
                    return abstractC3732.mo6752();
                }
                abstractC3732.mo6708();
                if (abstractC3732.mo6739()) {
                    jMo6689 = abstractC3732.mo6689();
                    if (jMo6689 == InterfaceC3621.f8931) {
                        if ((c3776.f9665 & JSONReader$Feature.SupportAutoType.mask) != 0) {
                            interfaceC3621M6970 = ((C3635) c3776.f9663).m6190(abstractC3732.mo6799());
                            if (interfaceC3621M6970 != null && (clsMo6058 = interfaceC3621M6970.mo6058()) != null) {
                                ClassLoader classLoader = clsMo6058.getClassLoader();
                                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                                if (classLoader != contextClassLoader) {
                                    strMo6744 = abstractC3732.mo6660();
                                    if (contextClassLoader == null) {
                                        try {
                                            contextClassLoader = C3537.class.getClassLoader();
                                        } catch (ClassNotFoundException unused) {
                                            clsLoadClass = null;
                                        }
                                    }
                                    clsLoadClass = contextClassLoader.loadClass(strMo6744);
                                    if (clsLoadClass != null && !clsMo6058.equals(clsLoadClass)) {
                                        interfaceC3621M6970 = c3776.m6971(clsLoadClass);
                                    }
                                }
                                if (interfaceC3621M6970 == null) {
                                    strMo6744 = abstractC3732.mo6660();
                                    interfaceC3621M6970 = c3776.m6970(null, strMo6744);
                                }
                            }
                            strMo6744 = null;
                            if (interfaceC3621M6970 == null) {
                            }
                        } else {
                            strMo6744 = abstractC3732.mo6744();
                            interfaceC3621M6970 = c3776.m6970(null, strMo6744);
                            if (interfaceC3621M6970 == null) {
                                if ((c3776.f9665 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) != 0) {
                                    C1123.m1410(abstractC3732.mo6730("autoType not support : " + strMo6744));
                                    return null;
                                }
                            }
                        }
                        if (interfaceC3621M6970 != null) {
                            abstractC3732.f9525 = true;
                            return interfaceC3621M6970.mo6023(abstractC3732, type, obj, j);
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                        strMo6744 = null;
                    }
                } else {
                    j2 = j;
                    strMo6744 = null;
                    jMo6689 = 0;
                }
                Map map = (JSONReader$Feature.UseNativeObject.mask & (c3776.f9665 | j2)) != 0 ? new HashMap() : (Map) C3547.f8595.mo6059(abstractC3732.m6717(j2));
                if (strMo6744 != null) {
                    if (!strMo6744.equals("java.util.ImmutableCollections$Map1") && !strMo6744.equals("java.util.ImmutableCollections$MapN")) {
                        map.put("@type", strMo6744);
                    }
                    jMo6689 = 0;
                }
                int i3 = 0;
                while (!abstractC3732.mo6712()) {
                    if (abstractC3732.f9538 == '/') {
                        abstractC3732.mo6795();
                    }
                    if (i3 == 0 && strMo6744 == null && jMo6689 != 0) {
                        objMo6686 = abstractC3732.mo6664();
                    } else if (abstractC3732.mo6738()) {
                        objMo6686 = abstractC3732.mo6752();
                        abstractC3732.mo6704(':');
                    } else {
                        objMo6686 = abstractC3732.mo6686();
                    }
                    if (objMo6686 != null) {
                        c = abstractC3732.f9538;
                        if (c != '\"' || c == '\'') {
                            objMo6744 = abstractC3732.mo6744();
                        } else {
                            if (c == '+') {
                                objMo6744 = abstractC3732.mo6752();
                            } else if (c != 'S') {
                                if (c == '[') {
                                    objMo6744 = abstractC3732.mo6685();
                                } else if (c == 'f') {
                                    objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                                } else if (c == 'n') {
                                    objMo6744 = abstractC3732.mo6753();
                                } else if (c != 't') {
                                    if (c != '{') {
                                        if (c != '-' && c != '.') {
                                            switch (c) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    C1123.m1410(abstractC3732.mo6730(null));
                                                    break;
                                            }
                                        }
                                        objMo6744 = abstractC3732.mo6752();
                                    } else if (abstractC3732.mo6740()) {
                                        String strMo6749 = abstractC3732.mo6749();
                                        if ("..".equals(strMo6749)) {
                                            objMo6744 = map;
                                        } else {
                                            abstractC3732.m6713(map, objMo6686, AbstractC3755.m6938(strMo6749));
                                        }
                                    } else {
                                        objMo6744 = abstractC3732.mo6754();
                                    }
                                }
                            } else if (abstractC3732.mo6707()) {
                                objMo6744 = abstractC3732.mo6700(HashSet.class);
                            } else {
                                C1123.m1410(abstractC3732.mo6730(null));
                            }
                            i3++;
                        }
                        if ((objMo6744 == null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j3) == 0) && (objPut = map.put(objMo6686, objMo6744)) != null && (JSONReader$Feature.DuplicateKeyValueAsArray.mask & j3) != 0) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(objMo6744);
                                map.put(objMo6686, objPut);
                            } else {
                                map.put(objMo6686, JSONArray.m1of(objPut, objMo6744));
                            }
                        }
                        i3++;
                    } else {
                        char c3 = abstractC3732.f9538;
                        if (c3 == '{' || c3 == '[') {
                            objMo6686 = abstractC3732.mo6684();
                            if (!abstractC3732.mo6704(':')) {
                                C1123.m1410(abstractC3732.mo6730("illegal input"));
                            }
                        } else {
                            objMo6686 = abstractC3732.m6676();
                            if (abstractC3732.f9538 == ':') {
                                abstractC3732.mo6733();
                            }
                        }
                        c = abstractC3732.f9538;
                        if (c != '\"') {
                            objMo6744 = abstractC3732.mo6744();
                            if (objMo6744 == null) {
                                if (objPut instanceof Collection) {
                                }
                            } else if (objPut instanceof Collection) {
                            }
                        }
                        i3++;
                    }
                    return null;
                }
                abstractC3732.mo6705();
                obj2 = map;
                return obj2;
            case 1:
                return abstractC3732.mo6670();
            case 2:
                return abstractC3732.mo6672();
            case 3:
                String strMo67442 = abstractC3732.mo6744();
                if (strMo67442 == null) {
                    return null;
                }
                return Character.valueOf(strMo67442.charAt(0));
            case 4:
                return abstractC3732.m6691();
            case 5:
                return abstractC3732.mo6677();
            case 6:
                return abstractC3732.mo6770();
            case 7:
                return abstractC3732.mo6773();
            case 8:
                String strMo67443 = abstractC3732.mo6744();
                if (strMo67443 == null || strMo67443.isEmpty()) {
                    return null;
                }
                String[] strArrSplit = strMo67443.split(JavaConstant.Dynamic.DEFAULT_NAME);
                return strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            case 9:
                return abstractC3732.mo6752();
            case 10:
                if (abstractC3732.mo6679()) {
                    return null;
                }
                if (!abstractC3732.mo6701()) {
                    C1123.m1410(abstractC3732.mo6730("TODO"));
                    return null;
                }
                Number[] numberArr = new Number[16];
                while (!abstractC3732.mo6702()) {
                    int i4 = i + 1;
                    if (i4 - numberArr.length > 0) {
                        int length = numberArr.length;
                        int i5 = length + (length >> 1);
                        if (i5 - i4 < 0) {
                            i5 = i4;
                        }
                        numberArr = (Number[]) Arrays.copyOf(numberArr, i5);
                    }
                    numberArr[i] = abstractC3732.mo6752();
                    i = i4;
                }
                abstractC3732.mo6705();
                return Arrays.copyOf(numberArr, i);
            case 11:
                Double dM6691 = abstractC3732.m6691();
                return dM6691 == null ? OptionalDouble.empty() : OptionalDouble.of(dM6691.doubleValue());
            case 12:
                Integer numMo6773 = abstractC3732.mo6773();
                return numMo6773 == null ? OptionalInt.empty() : OptionalInt.of(numMo6773.intValue());
            case 13:
                Long lMo6770 = abstractC3732.mo6770();
                return lMo6770 == null ? OptionalLong.empty() : OptionalLong.of(lMo6770.longValue());
            case 14:
                return abstractC3732.mo6744();
            case 15:
                return abstractC3732.mo6803();
            case 16:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return new AtomicInteger(abstractC3732.mo6772());
            default:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return new AtomicLong(abstractC3732.mo6769());
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6029(Collection collection, long j) {
        switch (this.f8567) {
            case 0:
                return collection;
            case 10:
                Number[] numberArr = new Number[collection.size()];
                int i = 0;
                for (Object objApply : collection) {
                    if (objApply != null && !(objApply instanceof Number)) {
                        Function functionM6191 = AbstractC3766.m6947().m6191(objApply.getClass(), Number.class);
                        if (functionM6191 == null) {
                            C1123.m1410(AbstractC3275.m5141(objApply, new StringBuilder("can not cast to Number ")));
                            return null;
                        }
                        objApply = functionM6191.apply(objApply);
                    }
                    numberArr[i] = (Number) objApply;
                    i++;
                }
                return numberArr;
            case 14:
                if (collection == null) {
                    return null;
                }
                return InterfaceC3749.m6935(collection);
            default:
                return super.mo6029(collection, j);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        InterfaceC3621 interfaceC3621Mo6724;
        int i = this.f8567;
        Class cls = this.f8995;
        Number[] numberArr = null;
        switch (i) {
            case 0:
                byte bMo6743 = abstractC3732.mo6743();
                if (bMo6743 >= 73 && bMo6743 <= 125) {
                    return abstractC3732.mo6744();
                }
                if (bMo6743 == -110 && (interfaceC3621Mo6724 = abstractC3732.mo6724(0L, j, Object.class)) != null) {
                    return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
                }
                if (bMo6743 != -81) {
                    return abstractC3732.mo6684();
                }
                abstractC3732.mo6733();
                return null;
            case 1:
                return abstractC3732.mo6670();
            case 2:
                return abstractC3732.mo6672();
            case 3:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return Character.valueOf(abstractC3732.mo6669());
            case 4:
                return abstractC3732.m6691();
            case 5:
                return abstractC3732.mo6677();
            case 6:
                return abstractC3732.mo6770();
            case 7:
                return abstractC3732.mo6773();
            case 8:
                String strMo6744 = abstractC3732.mo6744();
                if (strMo6744 == null || strMo6744.isEmpty()) {
                    return null;
                }
                String[] strArrSplit = strMo6744.split(JavaConstant.Dynamic.DEFAULT_NAME);
                return strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            case 9:
                return abstractC3732.mo6752();
            case 10:
                int iMo6792 = abstractC3732.mo6792();
                if (iMo6792 != -1) {
                    numberArr = new Number[iMo6792];
                    for (int i2 = 0; i2 < iMo6792; i2++) {
                        numberArr[i2] = abstractC3732.mo6752();
                    }
                }
                return numberArr;
            case 11:
                Double dM6691 = abstractC3732.m6691();
                return dM6691 == null ? OptionalDouble.empty() : OptionalDouble.of(dM6691.doubleValue());
            case 12:
                Integer numMo6773 = abstractC3732.mo6773();
                return numMo6773 == null ? OptionalInt.empty() : OptionalInt.of(numMo6773.intValue());
            case 13:
                Long lMo6770 = abstractC3732.mo6770();
                return lMo6770 == null ? OptionalLong.empty() : OptionalLong.of(lMo6770.longValue());
            case 14:
                return abstractC3732.mo6744();
            case 15:
                return abstractC3732.mo6803();
            case 16:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                if (cls != AtomicInteger.class || !abstractC3732.mo6703((byte) -110) || abstractC3732.mo6799() == 7576651708426282938L) {
                    return new AtomicInteger(abstractC3732.mo6772());
                }
                C1123.m1410(abstractC3732.mo6730(abstractC3732.mo6660()));
                return null;
            default:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                if (cls != AtomicLong.class || !abstractC3732.mo6703((byte) -110) || abstractC3732.mo6799() == -1591858996898070466L) {
                    return new AtomicLong(abstractC3732.mo6769());
                }
                C1123.m1410(abstractC3732.mo6730(abstractC3732.mo6660()));
                return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object mo6067(Map map, long j) {
        switch (this.f8567) {
            case 0:
                C3635 c3635M6947 = AbstractC3766.m6947();
                Object obj = map.get("@type");
                if (!(obj instanceof String)) {
                    return map;
                }
                String str = (String) obj;
                InterfaceC3621 interfaceC3621M6190 = (JSONReader$Feature.SupportAutoType.mask & j) != 0 ? c3635M6947.m6190(AbstractC3693.m6334(str)) : null;
                if (interfaceC3621M6190 != null || (interfaceC3621M6190 = c3635M6947.m6189(str, this.f8995, j)) != null) {
                    return interfaceC3621M6190 != this ? interfaceC3621M6190.mo6067(map, j) : map;
                }
                C1123.m1410("No suitable ObjectReader found for".concat(str));
                return null;
            case 14:
                if (map == null) {
                    return null;
                }
                return InterfaceC3749.m6935(map);
            default:
                return super.mo6067(map, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3537(Class cls, int i) {
        super(cls);
        this.f8567 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3537(C3601 c3601) {
        super(AtomicLong.class);
        this.f8567 = 17;
    }
}
