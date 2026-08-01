package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.util.AbstractC2865;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p278.C8365;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2770 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f8439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Annotation f8440;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8365 f8441;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8442;

    public /* synthetic */ C2770(Annotation annotation, C8365 c8365, Serializable serializable, int i) {
        this.f8442 = i;
        this.f8440 = annotation;
        this.f8441 = c8365;
        this.f8439 = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8442;
        Serializable serializable = this.f8439;
        C8365 c8365 = this.f8441;
        Annotation annotation = this.f8440;
        switch (i) {
            case 0:
                Class cls = (Class) serializable;
                Method method = (Method) obj;
                try {
                    String name = method.getName();
                    int iHashCode = name.hashCode();
                    if (iHashCode != 672684058) {
                        if (iHashCode != 2068281583) {
                            if (iHashCode == 2092901112 && name.equals("withPrefix")) {
                                String str = (String) method.invoke(annotation, null);
                                if (!str.isEmpty()) {
                                    c8365.f23088 = str;
                                }
                            }
                        } else if (name.equals("buildMethod")) {
                            c8365.f23089 = AbstractC2865.m5810(cls, (String) method.invoke(annotation, null));
                        }
                    } else if (name.equals("buildMethodName")) {
                        c8365.f23089 = AbstractC2865.m5810(cls, (String) method.invoke(annotation, null));
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) serializable;
                Method method2 = (Method) obj;
                String name2 = method2.getName();
                try {
                    Object objInvoke = method2.invoke(annotation, null);
                    if ("value".equals(name2)) {
                        String[] strArr = (String[]) objInvoke;
                        if (strArr.length != 0) {
                            c8365.f23102 = strArr;
                        }
                    } else if ("alphabetic".equals(name2)) {
                        atomicBoolean.set(((Boolean) objInvoke).booleanValue());
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
        }
    }
}
