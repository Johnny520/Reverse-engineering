package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.util.AbstractC2864;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p278.C8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2769 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f8437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Annotation f8438;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8364 f8439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8440;

    public /* synthetic */ C2769(Annotation annotation, C8364 c8364, Serializable serializable, int i) {
        this.f8440 = i;
        this.f8438 = annotation;
        this.f8439 = c8364;
        this.f8437 = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8440;
        Serializable serializable = this.f8437;
        C8364 c8364 = this.f8439;
        Annotation annotation = this.f8438;
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
                                    c8364.f23089 = str;
                                }
                            }
                        } else if (name.equals("buildMethod")) {
                            c8364.f23090 = AbstractC2864.m5765(cls, (String) method.invoke(annotation, null));
                        }
                    } else if (name.equals("buildMethodName")) {
                        c8364.f23090 = AbstractC2864.m5765(cls, (String) method.invoke(annotation, null));
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
                            c8364.f23103 = strArr;
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
