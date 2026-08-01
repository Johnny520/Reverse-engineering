package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2840 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Constructor f8846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Constructor f8847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f8849;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f8850;

    public C2840(Class cls, int i) {
        this.f8849 = i;
        switch (i) {
            case 1:
                this.f8848 = cls;
                try {
                    ClassLoader classLoader = cls.getClassLoader();
                    Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.Chronology");
                    this.f8845 = clsLoadClass;
                    Class cls2 = Integer.TYPE;
                    this.f8847 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2);
                    this.f8846 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2, clsLoadClass);
                    this.f8850 = classLoader.loadClass("org.joda.time.chrono.ISOChronology").getMethod("getInstance", null).invoke(null, null);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                    C0276.m843("create LocalDateWriter error", e);
                    throw null;
                }
            default:
                this.f8848 = cls;
                try {
                    ClassLoader classLoader2 = cls.getClassLoader();
                    Class<?> clsLoadClass2 = classLoader2.loadClass("org.joda.time.Chronology");
                    this.f8845 = clsLoadClass2;
                    Class cls3 = Integer.TYPE;
                    this.f8847 = cls.getConstructor(cls3, cls3, cls3);
                    this.f8846 = cls.getConstructor(cls3, cls3, cls3, clsLoadClass2);
                    this.f8850 = classLoader2.loadClass("org.joda.time.chrono.ISOChronology").getMethod("getInstance", null).invoke(null, null);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
                    C0276.m843("create LocalDateWriter error", e2);
                    throw null;
                }
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        switch (this.f8849) {
            case 0:
                if (!abstractC2899.mo6133() && (r9 = abstractC2899.mo6226()) != null) {
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        C0276.m843(abstractC2899.mo6170("read org.joda.time.LocalDate error"), e);
                        return null;
                    }
                }
                break;
            default:
                if (!abstractC2899.mo6179() && !abstractC2899.mo6181()) {
                    C0276.m850(abstractC2899.mo6170("not support"));
                    break;
                } else {
                    LocalDateTime localDateTimeMo6221 = abstractC2899.mo6221();
                    if (localDateTimeMo6221 != null) {
                        try {
                        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                            C0276.m843(abstractC2899.mo6170("read org.joda.time.LocalDate error"), e2);
                            return null;
                        }
                        break;
                    }
                }
                break;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        switch (this.f8849) {
        }
        return this.f8848;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        int i = this.f8849;
        Constructor constructor = this.f8846;
        Class cls = this.f8845;
        Constructor constructor2 = this.f8847;
        switch (i) {
            case 0:
                byte bMo6183 = abstractC2899.mo6183();
                if (bMo6183 == -87) {
                    LocalDate localDateMo6226 = abstractC2899.mo6226();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        C0276.m843(abstractC2899.mo6170("read org.joda.time.LocalDate error"), e);
                        return null;
                    }
                } else if (!abstractC2899.mo6177()) {
                    C0276.m850(abstractC2899.mo6170("not support " + InterfaceC2912.m6357(bMo6183)));
                } else {
                    abstractC2899.mo6148();
                    Integer numValueOf = null;
                    Integer numValueOf2 = null;
                    Integer numValueOf3 = null;
                    Object objMo6140 = null;
                    while (!abstractC2899.mo6152()) {
                        long jMo6129 = abstractC2899.mo6129();
                        if (jMo6129 == AbstractC2837.f8827) {
                            numValueOf = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo6129 == AbstractC2837.f8826) {
                            numValueOf2 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo6129 == AbstractC2837.f8825) {
                            numValueOf3 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo6129 != AbstractC2837.f8828) {
                            C0276.m850(abstractC2899.mo6170("not support fieldName " + abstractC2899.mo6104()));
                        } else {
                            objMo6140 = abstractC2899.mo6140(cls);
                        }
                        break;
                    }
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                        C0276.m843(abstractC2899.mo6170("read org.joda.time.LocalDate error"), e2);
                        return null;
                    }
                }
                break;
            default:
                byte bMo61832 = abstractC2899.mo6183();
                if (bMo61832 == -87) {
                    LocalDate localDateMo62262 = abstractC2899.mo6226();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
                        C0276.m843(abstractC2899.mo6170("read org.joda.time.LocalDate error"), e3);
                        return null;
                    }
                } else if (bMo61832 == -88) {
                    LocalDateTime localDateTimeMo6221 = abstractC2899.mo6221();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
                        C0276.m843(abstractC2899.mo6170("read org.joda.time.LocalDate error"), e4);
                        return null;
                    }
                } else if (!abstractC2899.mo6177()) {
                    C0276.m850(abstractC2899.mo6170("not support " + InterfaceC2912.m6357(bMo61832)));
                } else {
                    abstractC2899.mo6148();
                    Integer numValueOf4 = null;
                    Integer numValueOf5 = null;
                    Integer numValueOf6 = null;
                    Integer numValueOf7 = null;
                    Integer numValueOf8 = null;
                    Integer numValueOf9 = null;
                    Integer numValueOf10 = null;
                    Object objMo61402 = null;
                    while (!abstractC2899.mo6152()) {
                        long jMo61292 = abstractC2899.mo6129();
                        if (jMo61292 == AbstractC2837.f8827) {
                            numValueOf4 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo61292 == AbstractC2837.f8826) {
                            numValueOf5 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo61292 == AbstractC2837.f8825) {
                            numValueOf6 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo61292 == AbstractC2837.f8824) {
                            numValueOf7 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo61292 == AbstractC2837.f8823) {
                            numValueOf8 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo61292 == AbstractC2837.f8822) {
                            numValueOf9 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo61292 == AbstractC2837.f8829) {
                            numValueOf10 = Integer.valueOf(abstractC2899.mo6212());
                        } else if (jMo61292 != AbstractC2837.f8828) {
                            C0276.m850(abstractC2899.mo6170("not support fieldName " + abstractC2899.mo6104()));
                        } else {
                            objMo61402 = abstractC2899.mo6140(cls);
                        }
                        break;
                    }
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
                        C0276.m843(abstractC2899.mo6170("read org.joda.time.LocalDate error"), e5);
                        return null;
                    }
                }
                break;
        }
        return null;
    }
}
