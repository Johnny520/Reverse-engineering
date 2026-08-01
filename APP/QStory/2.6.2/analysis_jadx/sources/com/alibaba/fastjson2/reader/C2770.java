package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2864;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.function.Consumer;
import p230.C8048;
import p278.C8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2770 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Annotation f8441;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8364 f8442;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8443;

    public /* synthetic */ C2770(C8048 c8048, Annotation annotation, C8364 c8364) {
        this.f8443 = 11;
        this.f8441 = annotation;
        this.f8442 = c8364;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Class clsM13500;
        Class clsM135002;
        int i = this.f8443;
        final int i2 = 0;
        final C8364 c8364 = this.f8442;
        Annotation annotation = this.f8441;
        Method method = (Method) obj;
        switch (i) {
            case 0:
                try {
                    if ("parameterNames".equals(method.getName())) {
                        String[] strArr = (String[]) method.invoke(annotation, null);
                        if (strArr.length != 0) {
                            c8364.f23109 = strArr;
                        }
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                try {
                    if ("parameterNames".equals(method.getName())) {
                        String[] strArr2 = (String[]) method.invoke(annotation, null);
                        if (strArr2.length != 0) {
                            c8364.f23109 = strArr2;
                        }
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 2:
                try {
                    if ("parameterNames".equals(method.getName())) {
                        String[] strArr3 = (String[]) method.invoke(annotation, null);
                        if (strArr3.length != 0) {
                            c8364.f23109 = strArr3;
                        }
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 3:
                String name = method.getName();
                try {
                    Object objInvoke = method.invoke(annotation, null);
                    if ("value".equals(name)) {
                        Object[] objArr = (Object[]) objInvoke;
                        if (objArr.length != 0) {
                            c8364.f23088 = new Class[objArr.length];
                            c8364.f23107 = new String[objArr.length];
                            while (i2 < objArr.length) {
                                final Annotation annotation2 = (Annotation) objArr[i2];
                                Type[] typeArr = AbstractC2864.f9015;
                                AbstractC2864.m5766(annotation2.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪世兰苏哲
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj2) {
                                        Annotation annotation3 = annotation2;
                                        Method method2 = (Method) obj2;
                                        String name2 = method2.getName();
                                        try {
                                            Object objInvoke2 = method2.invoke(annotation3, null);
                                            int iHashCode = name2.hashCode();
                                            C8364 c83642 = c8364;
                                            int i3 = i2;
                                            if (iHashCode == 3373707) {
                                                if (name2.equals("name")) {
                                                    c83642.f23107[i3] = (String) objInvoke2;
                                                    return;
                                                }
                                                return;
                                            }
                                            if (iHashCode == 111972721 && name2.equals("value")) {
                                                c83642.f23088[i3] = (Class) objInvoke2;
                                            }
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                });
                                i2++;
                                break;
                            }
                        }
                    }
                } catch (Throwable unused4) {
                    return;
                }
                break;
            case 4:
                String name2 = method.getName();
                try {
                    Object objInvoke2 = method.invoke(annotation, null);
                    if ("typeName".equals(name2)) {
                        String str = (String) objInvoke2;
                        if (!str.isEmpty()) {
                            c8364.f23092 = str;
                        }
                    }
                } catch (Throwable unused5) {
                    return;
                }
                break;
            case 5:
                String name3 = method.getName();
                try {
                    Object objInvoke3 = method.invoke(annotation, null);
                    if ("property".equals(name3)) {
                        String str2 = (String) objInvoke3;
                        if (!str2.isEmpty()) {
                            c8364.f23093 = str2;
                            c8364.f23101 |= JSONReader$Feature.SupportAutoType.mask;
                        }
                    }
                } catch (Throwable unused6) {
                    return;
                }
                break;
            case 6:
                String name4 = method.getName();
                try {
                    Object objInvoke4 = method.invoke(annotation, null);
                    if ("value".equals(name4)) {
                        String strName = ((Enum) objInvoke4).name();
                        int iHashCode = strName.hashCode();
                        if (iHashCode != -7755493) {
                            if (iHashCode != 10566287) {
                                if (iHashCode == 1933739535 && strName.equals("ALWAYS")) {
                                    c8364.f23100 |= JSONWriter$Feature.WriteNulls.mask;
                                }
                            } else if (strName.equals("NON_DEFAULT")) {
                                c8364.f23100 |= JSONWriter$Feature.NotWriteDefaultValue.mask;
                            }
                        } else if (strName.equals("NON_EMPTY")) {
                            c8364.f23100 |= JSONWriter$Feature.NotWriteEmptyArray.mask;
                        }
                    }
                } catch (Throwable unused7) {
                    return;
                }
                break;
            case 7:
                String name5 = method.getName();
                try {
                    Object objInvoke5 = method.invoke(annotation, null);
                    if ("value".equals(name5)) {
                        String str3 = (String) objInvoke5;
                        if (!str3.isEmpty()) {
                            c8364.f23092 = str3;
                        }
                    }
                } catch (Throwable unused8) {
                    return;
                }
                break;
            case 8:
                String name6 = method.getName();
                try {
                    Object objInvoke6 = method.invoke(annotation, null);
                    int iHashCode2 = name6.hashCode();
                    if (iHashCode2 != -1097462182) {
                        if (iHashCode2 != -791090288) {
                            if (iHashCode2 == 109399969 && name6.equals("shape")) {
                                String strName2 = ((Enum) objInvoke6).name();
                                if ("NUMBER".equals(strName2)) {
                                    c8364.f23087 = "millis";
                                } else if ("OBJECT".equals(strName2)) {
                                    c8364.f23104 = true;
                                }
                            }
                        } else if (name6.equals("pattern")) {
                            String str4 = (String) objInvoke6;
                            if (!str4.isEmpty()) {
                                c8364.f23087 = str4;
                            }
                        }
                    } else if (name6.equals("locale")) {
                        String str5 = (String) objInvoke6;
                        if (!str5.isEmpty() && !"##default".equals(str5)) {
                            c8364.f23086 = Locale.forLanguageTag(str5);
                        }
                    }
                } catch (Throwable unused9) {
                    return;
                }
                break;
            case 9:
                AbstractC2864.m5747(c8364, annotation, method);
                break;
            case 10:
                AbstractC2864.m5747(c8364, annotation, method);
                break;
            case 11:
                String name7 = method.getName();
                try {
                    Object objInvoke7 = method.invoke(annotation, null);
                    int iHashCode3 = name7.hashCode();
                    if (iHashCode3 != 111582340) {
                        if (iHashCode3 == 491860325 && name7.equals("keyUsing") && (clsM135002 = C8048.m13500((Class) objInvoke7)) != null) {
                            c8364.f23098 = clsM135002;
                        }
                    } else if (name7.equals("using") && (clsM13500 = C8048.m13500((Class) objInvoke7)) != null) {
                        c8364.f23098 = clsM13500;
                    }
                } catch (Throwable unused10) {
                    return;
                }
                break;
            case 12:
                String name8 = method.getName();
                try {
                    Object objInvoke8 = method.invoke(annotation, null);
                    if ("value".equals(name8)) {
                        String[] strArr4 = (String[]) objInvoke8;
                        if (strArr4.length != 0) {
                            c8364.f23102 = strArr4;
                        }
                    }
                } catch (Throwable unused11) {
                    return;
                }
                break;
            case 13:
                String name9 = method.getName();
                try {
                    Object objInvoke9 = method.invoke(annotation, null);
                    if ("value".equals(name9)) {
                        Annotation[] annotationArr = (Annotation[]) objInvoke9;
                        if (annotationArr.length != 0) {
                            c8364.f23088 = new Class[annotationArr.length];
                            c8364.f23107 = new String[annotationArr.length];
                            while (i2 < annotationArr.length) {
                                final Annotation annotation3 = annotationArr[i2];
                                Type[] typeArr2 = AbstractC2864.f9015;
                                AbstractC2864.m5766(annotation3.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪世兰苏哲
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj2) {
                                        Annotation annotation32 = annotation3;
                                        Method method2 = (Method) obj2;
                                        String name22 = method2.getName();
                                        try {
                                            Object objInvoke22 = method2.invoke(annotation32, null);
                                            int iHashCode4 = name22.hashCode();
                                            C8364 c83642 = c8364;
                                            int i3 = i2;
                                            if (iHashCode4 == 3373707) {
                                                if (name22.equals("name")) {
                                                    c83642.f23107[i3] = (String) objInvoke22;
                                                    return;
                                                }
                                                return;
                                            }
                                            if (iHashCode4 == 111972721 && name22.equals("value")) {
                                                c83642.f23088[i3] = (Class) objInvoke22;
                                            }
                                        } catch (Throwable unused42) {
                                        }
                                    }
                                });
                                i2++;
                                break;
                            }
                        }
                    }
                } catch (Throwable unused12) {
                    return;
                }
                break;
            default:
                String name10 = method.getName();
                try {
                    Object objInvoke10 = method.invoke(annotation, null);
                    if ("property".equals(name10)) {
                        String str6 = (String) objInvoke10;
                        if (!str6.isEmpty()) {
                            c8364.f23093 = str6;
                            c8364.f23100 |= JSONWriter$Feature.WriteClassName.mask;
                        }
                    }
                } catch (Throwable unused13) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ C2770(Annotation annotation, C8364 c8364, int i) {
        this.f8443 = i;
        this.f8441 = annotation;
        this.f8442 = c8364;
    }

    public /* synthetic */ C2770(C8364 c8364, Annotation annotation, int i) {
        this.f8443 = i;
        this.f8442 = c8364;
        this.f8441 = annotation;
    }
}
