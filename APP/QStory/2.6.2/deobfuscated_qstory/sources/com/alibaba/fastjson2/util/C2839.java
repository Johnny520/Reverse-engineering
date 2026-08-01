package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2839 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Constructor f8844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Constructor f8845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f8847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f8848;

    public C2839(Class cls, int i) {
        this.f8847 = i;
        switch (i) {
            case 1:
                this.f8846 = cls;
                try {
                    ClassLoader classLoader = cls.getClassLoader();
                    Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.Chronology");
                    this.f8843 = clsLoadClass;
                    Class cls2 = Integer.TYPE;
                    this.f8845 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2);
                    this.f8844 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2, clsLoadClass);
                    this.f8848 = classLoader.loadClass("org.joda.time.chrono.ISOChronology").getMethod("getInstance", null).invoke(null, null);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                    C0276.m842("create LocalDateWriter error", e);
                    throw null;
                }
            default:
                this.f8846 = cls;
                try {
                    ClassLoader classLoader2 = cls.getClassLoader();
                    Class<?> clsLoadClass2 = classLoader2.loadClass("org.joda.time.Chronology");
                    this.f8843 = clsLoadClass2;
                    Class cls3 = Integer.TYPE;
                    this.f8845 = cls.getConstructor(cls3, cls3, cls3);
                    this.f8844 = cls.getConstructor(cls3, cls3, cls3, clsLoadClass2);
                    this.f8848 = classLoader2.loadClass("org.joda.time.chrono.ISOChronology").getMethod("getInstance", null).invoke(null, null);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
                    C0276.m842("create LocalDateWriter error", e2);
                    throw null;
                }
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        switch (this.f8847) {
            case 0:
                if (!abstractC2898.mo6087() && (r9 = abstractC2898.mo6181()) != null) {
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        C0276.m842(abstractC2898.mo6124("read org.joda.time.LocalDate error"), e);
                        return null;
                    }
                }
                break;
            default:
                if (!abstractC2898.mo6133() && !abstractC2898.mo6135()) {
                    C0276.m849(abstractC2898.mo6124("not support"));
                    break;
                } else {
                    LocalDateTime localDateTimeMo6176 = abstractC2898.mo6176();
                    if (localDateTimeMo6176 != null) {
                        try {
                        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                            C0276.m842(abstractC2898.mo6124("read org.joda.time.LocalDate error"), e2);
                            return null;
                        }
                        break;
                    }
                }
                break;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        switch (this.f8847) {
        }
        return this.f8846;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        int i = this.f8847;
        Constructor constructor = this.f8844;
        Class cls = this.f8843;
        Constructor constructor2 = this.f8845;
        switch (i) {
            case 0:
                byte bMo6138 = abstractC2898.mo6138();
                if (bMo6138 == -87) {
                    LocalDate localDateMo6181 = abstractC2898.mo6181();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        C0276.m842(abstractC2898.mo6124("read org.joda.time.LocalDate error"), e);
                        return null;
                    }
                } else if (!abstractC2898.mo6131()) {
                    C0276.m849(abstractC2898.mo6124("not support " + InterfaceC2911.m6299(bMo6138)));
                } else {
                    abstractC2898.mo6102();
                    Integer numValueOf = null;
                    Integer numValueOf2 = null;
                    Integer numValueOf3 = null;
                    Object objMo6094 = null;
                    while (!abstractC2898.mo6106()) {
                        long jMo6083 = abstractC2898.mo6083();
                        if (jMo6083 == AbstractC2836.f8825) {
                            numValueOf = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo6083 == AbstractC2836.f8824) {
                            numValueOf2 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo6083 == AbstractC2836.f8823) {
                            numValueOf3 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo6083 != AbstractC2836.f8826) {
                            C0276.m849(abstractC2898.mo6124("not support fieldName " + abstractC2898.mo6058()));
                        } else {
                            objMo6094 = abstractC2898.mo6094(cls);
                        }
                        break;
                    }
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                        C0276.m842(abstractC2898.mo6124("read org.joda.time.LocalDate error"), e2);
                        return null;
                    }
                }
                break;
            default:
                byte bMo61382 = abstractC2898.mo6138();
                if (bMo61382 == -87) {
                    LocalDate localDateMo61812 = abstractC2898.mo6181();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
                        C0276.m842(abstractC2898.mo6124("read org.joda.time.LocalDate error"), e3);
                        return null;
                    }
                } else if (bMo61382 == -88) {
                    LocalDateTime localDateTimeMo6176 = abstractC2898.mo6176();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
                        C0276.m842(abstractC2898.mo6124("read org.joda.time.LocalDate error"), e4);
                        return null;
                    }
                } else if (!abstractC2898.mo6131()) {
                    C0276.m849(abstractC2898.mo6124("not support " + InterfaceC2911.m6299(bMo61382)));
                } else {
                    abstractC2898.mo6102();
                    Integer numValueOf4 = null;
                    Integer numValueOf5 = null;
                    Integer numValueOf6 = null;
                    Integer numValueOf7 = null;
                    Integer numValueOf8 = null;
                    Integer numValueOf9 = null;
                    Integer numValueOf10 = null;
                    Object objMo60942 = null;
                    while (!abstractC2898.mo6106()) {
                        long jMo60832 = abstractC2898.mo6083();
                        if (jMo60832 == AbstractC2836.f8825) {
                            numValueOf4 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo60832 == AbstractC2836.f8824) {
                            numValueOf5 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo60832 == AbstractC2836.f8823) {
                            numValueOf6 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo60832 == AbstractC2836.f8822) {
                            numValueOf7 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo60832 == AbstractC2836.f8821) {
                            numValueOf8 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo60832 == AbstractC2836.f8820) {
                            numValueOf9 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo60832 == AbstractC2836.f8827) {
                            numValueOf10 = Integer.valueOf(abstractC2898.mo6167());
                        } else if (jMo60832 != AbstractC2836.f8826) {
                            C0276.m849(abstractC2898.mo6124("not support fieldName " + abstractC2898.mo6058()));
                        } else {
                            objMo60942 = abstractC2898.mo6094(cls);
                        }
                        break;
                    }
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
                        C0276.m842(abstractC2898.mo6124("read org.joda.time.LocalDate error"), e5);
                        return null;
                    }
                }
                break;
        }
        return null;
    }
}
