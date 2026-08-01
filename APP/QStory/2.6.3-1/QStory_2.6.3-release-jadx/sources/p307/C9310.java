package p307;

import androidx.collection.C1123;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
import p025.AbstractC7012;
import p294.C9192;
import p294.C9194;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9310 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C9368 f23885;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C9194 f23886;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f23887;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C9308 f23888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Class f23889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ boolean f23890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9192 f23891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f23892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23893;

    public /* synthetic */ C9310(C9308 c9308, C9192 c9192, long j, C9194 c9194, C9368 c9368, Class cls, boolean z, LinkedHashMap linkedHashMap, int i) {
        this.f23893 = i;
        this.f23888 = c9308;
        this.f23891 = c9192;
        this.f23892 = j;
        this.f23886 = c9194;
        this.f23885 = c9368;
        this.f23889 = cls;
        this.f23890 = z;
        this.f23887 = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        InterfaceC9352 interfaceC9352;
        String str;
        InterfaceC9352 interfaceC93522;
        InterfaceC9352 interfaceC93523;
        AbstractC9323 abstractC9323M14624;
        String str2;
        AbstractC9323 abstractC9323;
        String str3;
        AbstractC9323 abstractC93232;
        InterfaceC9352 interfaceC93524;
        String str4;
        AbstractC9323 abstractC9323M146242;
        String str5;
        AbstractC9323 abstractC93233;
        AbstractC9323 abstractC93234;
        int i = this.f23893;
        String str6 = null;
        LinkedHashMap linkedHashMap = this.f23887;
        long j = this.f23892;
        C9308 c9308 = this.f23888;
        switch (i) {
            case 0:
                Method method = (Method) obj;
                C9192 c9192 = this.f23891;
                c9192.m14424();
                c9192.f23390 = j;
                C9194 c9194 = this.f23886;
                c9192.f23393 = c9194.f23431;
                C9368 c9368 = this.f23885;
                Class cls = this.f23889;
                c9368.m14666(c9194, c9192, cls, method);
                if (!c9192.f23389) {
                    Method method2 = method;
                    String strM14628 = C9308.m14628(cls, c9368, c9194, this.f23890, c9192, method2);
                    String[] strArr = c9194.f23439;
                    if (strArr != null && strArr.length > 0) {
                        for (String str7 : strArr) {
                            if (!str7.equals(strM14628)) {
                            }
                        }
                    }
                    if ((c9194.f23444 & JSONWriter$Feature.WriteClassName.mask) == 0 || !strM14628.equals(c9194.f23437)) {
                        if (c9194.f23447 != null) {
                            int i2 = 0;
                            boolean z = false;
                            while (true) {
                                String[] strArr2 = c9194.f23447;
                                if (i2 < strArr2.length) {
                                    if (strM14628.equals(strArr2[i2])) {
                                        c9192.f23391 = i2;
                                        z = true;
                                    }
                                    i2++;
                                } else if (!z && c9192.f23391 == 0) {
                                    c9192.f23391 = strArr2.length;
                                }
                            }
                        }
                        if (!AbstractC3700.m6495(method2.getReturnType())) {
                            Class cls2 = c9192.f23405;
                            if (cls2 != null) {
                                try {
                                    Constructor declaredConstructor = cls2.getDeclaredConstructor(null);
                                    declaredConstructor.setAccessible(true);
                                    interfaceC9352 = (InterfaceC9352) declaredConstructor.newInstance(null);
                                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                                    C1123.m1403("create writeUsing Writer error", e);
                                    return;
                                }
                            } else {
                                interfaceC9352 = null;
                            }
                            if (interfaceC9352 == null && c9192.f23408) {
                                interfaceC9352 = C9351.f24054;
                            }
                            if ((c9194.f23445 & 18014398509481984L) != 0) {
                                try {
                                    str = strM14628;
                                    interfaceC93523 = interfaceC9352;
                                } catch (Throwable unused) {
                                    str = strM14628;
                                    interfaceC93522 = interfaceC9352;
                                }
                                try {
                                    abstractC9323M14624 = C9308.m14624(c9368, cls, str, c9192.f23391, c9192.f23390, c9192.f23393, c9192.f23392, method2, interfaceC93523, c9192.f23398);
                                    interfaceC93522 = interfaceC93523;
                                    method2 = method2;
                                } catch (Throwable unused2) {
                                    interfaceC93522 = interfaceC93523;
                                    method2 = method2;
                                    c9308.f23876.incrementAndGet();
                                    abstractC9323M14624 = null;
                                }
                                if (abstractC9323M14624 == null) {
                                    abstractC9323M14624 = C9308.m14626(c9368, cls, str, c9192.f23391, c9192.f23390, c9192.f23393, c9192.f23401, c9192.f23392, method2, interfaceC93522, c9192.f23398);
                                }
                                str2 = str;
                                Method method3 = method2;
                                if (c9192.f23405 != null && (abstractC9323M14624 instanceof C9250)) {
                                    ((C9250) abstractC9323M14624).f23673 = true;
                                }
                                abstractC9323 = (AbstractC9323) linkedHashMap.putIfAbsent(abstractC9323M14624.f23963, abstractC9323M14624);
                                if (abstractC9323 != null && abstractC9323.compareTo(abstractC9323M14624) > 0) {
                                    linkedHashMap.put(str2, abstractC9323M14624);
                                }
                                if (abstractC9323 != null) {
                                    char cCharAt = str2.charAt(0);
                                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                                        str3 = ((char) (cCharAt + ' ')) + str2.substring(1);
                                    } else if (cCharAt < 'a' || cCharAt > 'z') {
                                        str3 = null;
                                    } else {
                                        str3 = ((char) (cCharAt - ' ')) + str2.substring(1);
                                    }
                                    if (str3 != null && (abstractC93232 = (AbstractC9323) linkedHashMap.get(str3)) != null) {
                                        Method method4 = abstractC93232.f23948;
                                        if (method4 == null || method4.equals(method3)) {
                                            linkedHashMap.remove(str3);
                                        }
                                        break;
                                    }
                                }
                            } else {
                                str = strM14628;
                                interfaceC93522 = interfaceC9352;
                            }
                            abstractC9323M14624 = null;
                            if (abstractC9323M14624 == null) {
                            }
                            str2 = str;
                            Method method32 = method2;
                            if (c9192.f23405 != null) {
                                ((C9250) abstractC9323M14624).f23673 = true;
                            }
                            abstractC9323 = (AbstractC9323) linkedHashMap.putIfAbsent(abstractC9323M14624.f23963, abstractC9323M14624);
                            if (abstractC9323 != null) {
                                linkedHashMap.put(str2, abstractC9323M14624);
                            }
                            if (abstractC9323 != null) {
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                C9298 c9298 = (C9298) c9308;
                Method method5 = (Method) obj;
                C9192 c91922 = this.f23891;
                c91922.m14424();
                c91922.f23390 |= j;
                C9194 c91942 = this.f23886;
                c91922.f23393 = c91942.f23431;
                C9368 c93682 = this.f23885;
                Class cls3 = this.f23889;
                c93682.m14666(c91942, c91922, cls3, method5);
                if (!c91922.f23389) {
                    String strM146282 = C9308.m14628(cls3, c93682, c91942, this.f23890, c91922, method5);
                    Method method6 = method5;
                    if (c91942.f23447 != null) {
                        int i3 = 0;
                        boolean z2 = false;
                        while (true) {
                            String[] strArr3 = c91942.f23447;
                            if (i3 < strArr3.length) {
                                if (strM146282.equals(strArr3[i3])) {
                                    c91922.f23391 = i3;
                                    z2 = true;
                                }
                                i3++;
                            } else if (!z2 && c91922.f23391 == 0) {
                                c91922.f23391 = strArr3.length;
                            }
                        }
                    }
                    String[] strArr4 = c91942.f23439;
                    if (strArr4 != null && strArr4.length > 0) {
                        for (String str8 : strArr4) {
                            if (!str8.equals(strM146282)) {
                            }
                        }
                    }
                    if ((c91942.f23444 & JSONWriter$Feature.WriteClassName.mask) == 0 || !strM146282.equals(c91942.f23437)) {
                        Class<?> returnType = method6.getReturnType();
                        if (!AbstractC3700.m6495(returnType) && returnType != Void.TYPE) {
                            method6.setAccessible(true);
                            Class cls4 = c91922.f23405;
                            if (cls4 != null) {
                                try {
                                    Constructor declaredConstructor2 = cls4.getDeclaredConstructor(null);
                                    declaredConstructor2.setAccessible(true);
                                    interfaceC93524 = (InterfaceC9352) declaredConstructor2.newInstance(null);
                                } catch (Exception e2) {
                                    StringBuilder sb = new StringBuilder("create writeUsing Writer error, method ");
                                    sb.append(method6.getName());
                                    sb.append(", serializer ");
                                    C1123.m1403(AbstractC7012.m12148(c91922.f23405, sb), e2);
                                    return;
                                }
                            } else {
                                interfaceC93524 = null;
                            }
                            if (interfaceC93524 == null && c91922.f23408) {
                                interfaceC93524 = C9351.f24054;
                            }
                            InterfaceC9352 interfaceC93525 = interfaceC93524;
                            long j2 = c91922.f23390;
                            if ((j2 & 18014398509481984L) != 0) {
                                try {
                                    str4 = strM146282;
                                    try {
                                        abstractC9323M146242 = C9308.m14624(c93682, cls3, str4, c91922.f23391, j2, c91922.f23393, c91922.f23392, method6, interfaceC93525, c91922.f23398);
                                        method6 = method6;
                                    } catch (Throwable unused3) {
                                        method6 = method6;
                                        c9298.f23876.incrementAndGet();
                                        abstractC9323M146242 = null;
                                    }
                                } catch (Throwable unused4) {
                                    str4 = strM146282;
                                }
                                if (abstractC9323M146242 == null) {
                                    abstractC9323M146242 = C9308.m14626(c93682, cls3, str4, c91922.f23391, c91922.f23390, c91922.f23393, c91922.f23401, c91922.f23392, method6, interfaceC93525, c91922.f23398);
                                }
                                str5 = str4;
                                if (c91922.f23405 != null && (abstractC9323M146242 instanceof C9250)) {
                                    ((C9250) abstractC9323M146242).f23673 = true;
                                }
                                abstractC93233 = (AbstractC9323) linkedHashMap.putIfAbsent(str5, abstractC9323M146242);
                                if (abstractC93233 != null && abstractC93233.compareTo(abstractC9323M146242) > 0) {
                                    linkedHashMap.put(str5, abstractC9323M146242);
                                }
                                if (abstractC93233 != null) {
                                    char cCharAt2 = str5.charAt(0);
                                    if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                                        str6 = ((char) (cCharAt2 + ' ')) + str5.substring(1);
                                    } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                                        str6 = ((char) (cCharAt2 - ' ')) + str5.substring(1);
                                    }
                                    if (str6 != null && (abstractC93234 = (AbstractC9323) linkedHashMap.get(str6)) != null) {
                                        Method method7 = abstractC93234.f23948;
                                        if (method7 == null || method7.equals(method6)) {
                                            linkedHashMap.remove(str6);
                                        }
                                        break;
                                    }
                                }
                            } else {
                                str4 = strM146282;
                            }
                            abstractC9323M146242 = null;
                            if (abstractC9323M146242 == null) {
                            }
                            str5 = str4;
                            if (c91922.f23405 != null) {
                                ((C9250) abstractC9323M146242).f23673 = true;
                            }
                            abstractC93233 = (AbstractC9323) linkedHashMap.putIfAbsent(str5, abstractC9323M146242);
                            if (abstractC93233 != null) {
                                linkedHashMap.put(str5, abstractC9323M146242);
                            }
                            if (abstractC93233 != null) {
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
