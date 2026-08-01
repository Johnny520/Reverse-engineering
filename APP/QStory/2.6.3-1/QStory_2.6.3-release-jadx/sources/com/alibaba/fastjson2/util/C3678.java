package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.C3775;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import lin.xposed.hook.util.p011qq.QQMsgService;
import org.apache.commons.p014io.monitor.FileAlterationObserver;
import org.apache.commons.p014io.monitor.FileEntry;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3678 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f9208;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f9209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9210;

    public /* synthetic */ C3678(Object obj, int i, Object obj2) {
        this.f9210 = i;
        this.f9208 = obj;
        this.f9209 = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f9210;
        Object obj2 = this.f9209;
        Object obj3 = this.f9208;
        switch (i) {
            case 0:
                Annotation annotation = (Annotation) obj3;
                String[] strArr = (String[]) obj2;
                Method method = (Method) obj;
                String name = method.getName();
                try {
                    Object objInvoke = method.invoke(annotation, null);
                    int iHashCode = name.hashCode();
                    if (iHashCode != -1097462182) {
                        if (iHashCode != -791090288) {
                            if (iHashCode == 109399969 && name.equals("shape")) {
                                strArr[1] = ((Enum) objInvoke).name();
                            }
                        } else if (name.equals("pattern")) {
                            strArr[0] = (String) objInvoke;
                        }
                    } else if (name.equals("locale")) {
                        strArr[2] = (String) objInvoke;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                Field[] fieldArr = (Field[]) obj2;
                Field field = (Field) obj;
                if (field.getName().equals((String) obj3)) {
                    fieldArr[0] = field;
                }
                break;
            case 2:
                Annotation annotation2 = (Annotation) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                Method method2 = (Method) obj;
                try {
                    if ("unwrapped".equals(method2.getName()) && ((Boolean) method2.invoke(annotation2, null)).booleanValue()) {
                        atomicBoolean.set(true);
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 3:
                Enum[] enumArr = (Enum[]) obj3;
                final String[] strArr2 = (String[]) obj2;
                Field field2 = (Field) obj;
                String name2 = field2.getName();
                for (final int i2 = 0; i2 < enumArr.length; i2++) {
                    final String strName = enumArr[i2].name();
                    if (name2.equals(strName)) {
                        for (final Annotation annotation3 : field2.getAnnotations()) {
                            Class<? extends Annotation> clsAnnotationType = annotation3.annotationType();
                            String name3 = clsAnnotationType.getName();
                            if ("飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲兰苏".equals(name3) || "com.alibaba.fastjson.annotation.JSONField".equals(name3)) {
                                final int i3 = 0;
                                AbstractC3698.m6371(clsAnnotationType, new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪世兰哲苏
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj4) {
                                        int i4 = i3;
                                        int i5 = i2;
                                        String[] strArr3 = strArr2;
                                        String str = strName;
                                        Annotation annotation4 = annotation3;
                                        Method method3 = (Method) obj4;
                                        switch (i4) {
                                            case 0:
                                                String name4 = method3.getName();
                                                try {
                                                    Object objInvoke2 = method3.invoke(annotation4, null);
                                                    if ("name".equals(name4)) {
                                                        String str2 = (String) objInvoke2;
                                                        if (str2.length() != 0 && !str2.equals(str)) {
                                                            strArr3[i5] = str2;
                                                            break;
                                                        }
                                                    }
                                                } catch (Exception unused3) {
                                                    return;
                                                }
                                                break;
                                            default:
                                                String name5 = method3.getName();
                                                try {
                                                    Object objInvoke3 = method3.invoke(annotation4, null);
                                                    if ("value".equals(name5)) {
                                                        String str3 = (String) objInvoke3;
                                                        if (str3.length() != 0 && !str3.equals(str)) {
                                                            strArr3[i5] = str3;
                                                            break;
                                                        }
                                                    }
                                                } catch (Exception unused4) {
                                                    return;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else if ("com.fasterxml.jackson.annotation.JsonProperty".equals(name3)) {
                                final int i4 = 1;
                                AbstractC3698.m6371(clsAnnotationType, new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪世兰哲苏
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj4) {
                                        int i42 = i4;
                                        int i5 = i2;
                                        String[] strArr3 = strArr2;
                                        String str = strName;
                                        Annotation annotation4 = annotation3;
                                        Method method3 = (Method) obj4;
                                        switch (i42) {
                                            case 0:
                                                String name4 = method3.getName();
                                                try {
                                                    Object objInvoke2 = method3.invoke(annotation4, null);
                                                    if ("name".equals(name4)) {
                                                        String str2 = (String) objInvoke2;
                                                        if (str2.length() != 0 && !str2.equals(str)) {
                                                            strArr3[i5] = str2;
                                                            break;
                                                        }
                                                    }
                                                } catch (Exception unused3) {
                                                    return;
                                                }
                                                break;
                                            default:
                                                String name5 = method3.getName();
                                                try {
                                                    Object objInvoke3 = method3.invoke(annotation4, null);
                                                    if ("value".equals(name5)) {
                                                        String str3 = (String) objInvoke3;
                                                        if (str3.length() != 0 && !str3.equals(str)) {
                                                            strArr3[i5] = str3;
                                                            break;
                                                        }
                                                    }
                                                } catch (Exception unused4) {
                                                    return;
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                    break;
                }
                break;
            case 4:
                QQMsgService.lambda$recallMsg$0(obj3, obj2, (Long) obj);
                break;
            default:
                FileEntry fileEntry = (FileEntry) obj3;
                File file = (File) obj2;
                if (obj == null) {
                    FileAlterationObserver.lambda$fireOnChange$2(fileEntry, file, null);
                } else {
                    C3775.m6954();
                }
                break;
        }
    }
}
