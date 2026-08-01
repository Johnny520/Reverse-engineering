package com.alibaba.fastjson2.reader;

import androidx.core.view.C2242;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import p230.C8049;
import p278.C8363;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2780 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Annotation f8502;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8363 f8503;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8504;

    public /* synthetic */ C2780(Object obj, Annotation annotation, C8363 c8363, int i) {
        this.f8504 = i;
        this.f8502 = annotation;
        this.f8503 = c8363;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int iIntValue;
        String str;
        Class clsM4137;
        Class clsM41372;
        Class clsM41373;
        Class cls;
        Class clsM13528;
        Class clsM135282;
        Class clsM135283;
        int iIntValue2;
        int iIntValue3;
        String str2;
        int i = this.f8504;
        C8363 c8363 = this.f8503;
        Annotation annotation = this.f8502;
        switch (i) {
            case 0:
                Method method = (Method) obj;
                String name = method.getName();
                try {
                    Object objInvoke = method.invoke(annotation, null);
                    switch (name.hashCode()) {
                        case -1268779017:
                            if (name.equals("format")) {
                                String str3 = (String) objInvoke;
                                if (!str3.isEmpty()) {
                                    String strTrim = str3.trim();
                                    if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
                                        strTrim = strTrim.replace("T", "'T'");
                                    }
                                    c8363.f23048 = strTrim;
                                }
                            }
                            break;
                        case -1206994319:
                            if (name.equals("ordinal") && (iIntValue = ((Integer) objInvoke).intValue()) != 0) {
                                c8363.f23046 = iIntValue;
                                break;
                            }
                            break;
                        case -1073807344:
                            if (name.equals("parseFeatures")) {
                                for (Enum r0 : (Enum[]) objInvoke) {
                                    String strName = r0.name();
                                    int iHashCode = strName.hashCode();
                                    if (iHashCode != -894003883) {
                                        if (iHashCode != -200815016) {
                                            if (iHashCode == 2005790178 && strName.equals("InitStringFieldAsEmpty")) {
                                                c8363.f23045 |= JSONReader$Feature.InitStringFieldAsEmpty.mask;
                                            }
                                        } else if (strName.equals("SupportAutoType")) {
                                            c8363.f23045 |= JSONReader$Feature.SupportAutoType.mask;
                                        }
                                    } else if (strName.equals("SupportArrayToBean")) {
                                        c8363.f23045 |= JSONReader$Feature.SupportArrayToBean.mask;
                                    }
                                }
                            }
                            break;
                        case -987658292:
                            if (name.equals("unwrapped") && ((Boolean) objInvoke).booleanValue()) {
                                c8363.f23045 |= 562949953421312L;
                                break;
                            }
                            break;
                        case -659125328:
                            if (name.equals("defaultValue")) {
                                String str4 = (String) objInvoke;
                                if (!str4.isEmpty()) {
                                    c8363.f23059 = str4;
                                }
                            }
                            break;
                        case -224599314:
                            if (name.equals("alternateNames")) {
                                String[] strArr = (String[]) objInvoke;
                                if (strArr.length != 0) {
                                    if (c8363.f23061 == null) {
                                        c8363.f23061 = strArr;
                                    } else {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        linkedHashSet.addAll(Arrays.asList(strArr));
                                        linkedHashSet.addAll(Arrays.asList(c8363.f23061));
                                        c8363.f23061 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                                    }
                                }
                            }
                            break;
                        case 3373707:
                            if (name.equals("name")) {
                                String str5 = (String) objInvoke;
                                if (!str5.isEmpty()) {
                                    c8363.f23049 = str5;
                                }
                            }
                            break;
                        case 102727412:
                            if (name.equals("label")) {
                                String str6 = (String) objInvoke;
                                if (!str6.isEmpty()) {
                                    c8363.f23047 = str6;
                                }
                            }
                            break;
                        case 1053501509:
                            if (name.equals("deserializeUsing")) {
                                Class cls2 = (Class) objInvoke;
                                if (InterfaceC2788.class.isAssignableFrom(cls2)) {
                                    c8363.f23062 = cls2;
                                }
                            }
                            break;
                        case 1746983807:
                            if (name.equals("deserialize") && !((Boolean) objInvoke).booleanValue()) {
                                c8363.f23044 = true;
                                break;
                            }
                            break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                Method method2 = (Method) obj;
                String name2 = method2.getName();
                try {
                    Object objInvoke2 = method2.invoke(annotation, null);
                    int iHashCode2 = name2.hashCode();
                    if (iHashCode2 != -1423461020) {
                        if (iHashCode2 != -393139297) {
                            if (iHashCode2 == 111972721 && name2.equals("value")) {
                                String str7 = (String) objInvoke2;
                                if (!str7.isEmpty() && ((str = c8363.f23049) == null || str.isEmpty())) {
                                    c8363.f23049 = str7;
                                }
                            }
                        } else if (name2.equals("required") && ((Boolean) objInvoke2).booleanValue()) {
                            c8363.f23051 = true;
                        }
                    } else if (name2.equals("access")) {
                        c8363.f23044 = "READ_ONLY".equals(((Enum) objInvoke2).name());
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 2:
                Method method3 = (Method) obj;
                String name3 = method3.getName();
                try {
                    Object objInvoke3 = method3.invoke(annotation, null);
                    if ("value".equals(name3)) {
                        String[] strArr2 = (String[]) objInvoke3;
                        if (strArr2.length != 0) {
                            c8363.f23061 = strArr2;
                        }
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 3:
                Method method4 = (Method) obj;
                String name4 = method4.getName();
                try {
                    Object objInvoke4 = method4.invoke(annotation, null);
                    int iHashCode3 = name4.hashCode();
                    if (iHashCode3 != 111582340) {
                        if (iHashCode3 != 491860325) {
                            if (iHashCode3 == 2034063763 && name4.equals("valueUsing") && (clsM41373 = C2242.m4137((Class) objInvoke4)) != null) {
                                c8363.f23064 = clsM41373;
                            }
                        } else if (name4.equals("keyUsing") && (clsM41372 = C2242.m4137((Class) objInvoke4)) != null) {
                            c8363.f23064 = clsM41372;
                        }
                    } else if (name4.equals("using") && (clsM4137 = C2242.m4137((Class) objInvoke4)) != null) {
                        c8363.f23062 = clsM4137;
                    }
                } catch (Throwable unused4) {
                    return;
                }
                break;
            case 4:
                Method method5 = (Method) obj;
                String name5 = method5.getName();
                try {
                    Object objInvoke5 = method5.invoke(annotation, null);
                    if (name5.hashCode() == 111972721 && name5.equals("value")) {
                        String str8 = (String) objInvoke5;
                        if (!str8.isEmpty()) {
                            c8363.f23049 = str8;
                        }
                    }
                } catch (Throwable unused5) {
                    return;
                }
                break;
            case 5:
                Method method6 = (Method) obj;
                String name6 = method6.getName();
                try {
                    Object objInvoke6 = method6.invoke(annotation, null);
                    if ("value".equals(name6)) {
                        String strName2 = ((Enum) objInvoke6).name();
                        int iHashCode4 = strName2.hashCode();
                        if (iHashCode4 != -7755493) {
                            if (iHashCode4 != 10566287) {
                                if (iHashCode4 == 1933739535 && strName2.equals("ALWAYS")) {
                                    c8363.f23045 |= JSONWriter$Feature.WriteNulls.mask;
                                }
                            } else if (strName2.equals("NON_DEFAULT")) {
                                c8363.f23045 |= JSONWriter$Feature.NotWriteDefaultValue.mask;
                            }
                        } else if (strName2.equals("NON_EMPTY")) {
                            long j = c8363.f23045 | JSONWriter$Feature.NotWriteEmptyArray.mask;
                            c8363.f23045 = j;
                            c8363.f23045 = j | JSONWriter$Feature.IgnoreEmpty.mask;
                        }
                    }
                } catch (Throwable unused6) {
                    return;
                }
                break;
            case 6:
                Method method7 = (Method) obj;
                String name7 = method7.getName();
                try {
                    Object objInvoke7 = method7.invoke(annotation, null);
                    if ("value".equals(name7)) {
                        c8363.f23044 = ((Boolean) objInvoke7).booleanValue();
                    }
                } catch (Throwable unused7) {
                    return;
                }
                break;
            case 7:
                Method method8 = (Method) obj;
                String name8 = method8.getName();
                try {
                    Object objInvoke8 = method8.invoke(annotation, null);
                    int iHashCode5 = name8.hashCode();
                    if (iHashCode5 != -1408024454) {
                        if (iHashCode5 == 111972721 && name8.equals("value")) {
                            String str9 = (String) objInvoke8;
                            if (!str9.isEmpty()) {
                                c8363.f23049 = str9;
                            }
                        }
                    } else if (name8.equals("alternate")) {
                        String[] strArr3 = (String[]) objInvoke8;
                        if (strArr3.length != 0) {
                            c8363.f23061 = strArr3;
                        }
                    }
                } catch (Throwable unused8) {
                    return;
                }
                break;
            case 8:
                Method method9 = (Method) obj;
                String name9 = method9.getName();
                try {
                    Object objInvoke9 = method9.invoke(annotation, null);
                    if ("enabled".equals(name9) && ((Boolean) objInvoke9).booleanValue()) {
                        c8363.f23045 = 562949953421312L;
                        break;
                    }
                } catch (Throwable unused9) {
                    return;
                }
                break;
            case 9:
                Method method10 = (Method) obj;
                String name10 = method10.getName();
                try {
                    Object objInvoke10 = method10.invoke(annotation, null);
                    switch (name10.hashCode()) {
                        case -407108981:
                            if (name10.equals("contentAs") && (cls = (Class) objInvoke10) != Void.class) {
                                c8363.f23053 = cls;
                            }
                            break;
                        case 111582340:
                            if (name10.equals("using") && (clsM13528 = C8049.m13528((Class) objInvoke10)) != null) {
                                c8363.f23060 = clsM13528;
                            }
                            break;
                        case 491860325:
                            if (name10.equals("keyUsing") && (clsM135282 = C8049.m13528((Class) objInvoke10)) != null) {
                                c8363.f23064 = clsM135282;
                            }
                            break;
                        case 2034063763:
                            if (name10.equals("valueUsing") && (clsM135283 = C8049.m13528((Class) objInvoke10)) != null) {
                                c8363.f23065 = clsM135283;
                            }
                            break;
                    }
                } catch (Throwable unused10) {
                    return;
                }
                break;
            case 10:
                Method method11 = (Method) obj;
                String name11 = method11.getName();
                try {
                    Object objInvoke11 = method11.invoke(annotation, null);
                    switch (name11.hashCode()) {
                        case -1371565692:
                            if (name11.equals("serializeUsing")) {
                                Class cls3 = (Class) objInvoke11;
                                if (InterfaceC8523.class.isAssignableFrom(cls3)) {
                                    c8363.f23060 = cls3;
                                }
                            }
                            break;
                        case -1268779017:
                            if (name11.equals("format")) {
                                C8049.m13530(c8363, (String) objInvoke11);
                            }
                            break;
                        case -1206994319:
                            if (name11.equals("ordinal") && (iIntValue2 = ((Integer) objInvoke11).intValue()) != 0) {
                                c8363.f23046 = iIntValue2;
                            }
                            break;
                        case -987658292:
                            if (name11.equals("unwrapped") && ((Boolean) objInvoke11).booleanValue()) {
                                c8363.f23045 |= 562949953421312L;
                            }
                            break;
                        case -940893828:
                            if (name11.equals("serialzeFeatures")) {
                                C8049.m13531(c8363, (Enum[]) objInvoke11);
                            }
                            break;
                        case -659125328:
                            if (name11.equals("defaultValue")) {
                                String str10 = (String) objInvoke11;
                                if (!str10.isEmpty()) {
                                    c8363.f23059 = str10;
                                }
                            }
                            break;
                        case -573479200:
                            if (name11.equals("serialize") && !((Boolean) objInvoke11).booleanValue()) {
                                c8363.f23044 = true;
                            }
                            break;
                        case 3373707:
                            if (name11.equals("name")) {
                                String str11 = (String) objInvoke11;
                                if (!str11.isEmpty()) {
                                    c8363.f23049 = str11;
                                }
                            }
                            break;
                        case 12396273:
                            if (name11.equals("jsonDirect") && ((Boolean) objInvoke11).booleanValue()) {
                                c8363.f23045 |= 1125899906842624L;
                            }
                            break;
                        case 102727412:
                            if (name11.equals("label")) {
                                String str12 = (String) objInvoke11;
                                if (!str12.isEmpty()) {
                                    c8363.f23047 = str12;
                                }
                            }
                            break;
                    }
                } catch (Throwable unused11) {
                    return;
                }
                break;
            default:
                Method method12 = (Method) obj;
                String name12 = method12.getName();
                try {
                    Object objInvoke12 = method12.invoke(annotation, null);
                    int iHashCode6 = name12.hashCode();
                    if (iHashCode6 != -1423461020) {
                        if (iHashCode6 != 100346066) {
                            if (iHashCode6 == 111972721 && name12.equals("value")) {
                                String str13 = (String) objInvoke12;
                                if (!str13.isEmpty() && ((str2 = c8363.f23049) == null || str2.isEmpty())) {
                                    c8363.f23049 = str13;
                                }
                            }
                        } else if (name12.equals("index") && (iIntValue3 = ((Integer) objInvoke12).intValue()) != -1) {
                            c8363.f23046 = iIntValue3;
                        }
                    } else if (name12.equals("access")) {
                        c8363.f23044 = "WRITE_ONLY".equals(((Enum) objInvoke12).name());
                    }
                } catch (Throwable unused12) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ C2780(Annotation annotation, C8363 c8363, int i) {
        this.f8504 = i;
        this.f8502 = annotation;
        this.f8503 = c8363;
    }
}
