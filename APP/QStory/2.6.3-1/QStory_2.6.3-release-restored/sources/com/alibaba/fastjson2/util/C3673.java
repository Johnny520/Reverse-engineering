package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3673 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f9190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Constructor f9191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Constructor f9192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f9193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9194;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f9195;

    public C3673(Class cls, int i) {
        this.f9194 = i;
        switch (i) {
            case 1:
                this.f9193 = cls;
                try {
                    ClassLoader classLoader = cls.getClassLoader();
                    Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.Chronology");
                    this.f9190 = clsLoadClass;
                    Class cls2 = Integer.TYPE;
                    this.f9192 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2);
                    this.f9191 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2, clsLoadClass);
                    this.f9195 = classLoader.loadClass("org.joda.time.chrono.ISOChronology").getMethod("getInstance", null).invoke(null, null);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                    C1123.m1403("create LocalDateWriter error", e);
                    throw null;
                }
            default:
                this.f9193 = cls;
                try {
                    ClassLoader classLoader2 = cls.getClassLoader();
                    Class<?> clsLoadClass2 = classLoader2.loadClass("org.joda.time.Chronology");
                    this.f9190 = clsLoadClass2;
                    Class cls3 = Integer.TYPE;
                    this.f9192 = cls.getConstructor(cls3, cls3, cls3);
                    this.f9191 = cls.getConstructor(cls3, cls3, cls3, clsLoadClass2);
                    this.f9195 = classLoader2.loadClass("org.joda.time.chrono.ISOChronology").getMethod("getInstance", null).invoke(null, null);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
                    C1123.m1403("create LocalDateWriter error", e2);
                    throw null;
                }
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        switch (this.f9194) {
            case 0:
                if (!abstractC3732.mo6693() && (r9 = abstractC3732.mo6786()) != null) {
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        C1123.m1403(abstractC3732.mo6730("read org.joda.time.LocalDate error"), e);
                        return null;
                    }
                }
                break;
            default:
                if (!abstractC3732.mo6739() && !abstractC3732.mo6741()) {
                    C1123.m1410(abstractC3732.mo6730("not support"));
                    break;
                } else {
                    LocalDateTime localDateTimeMo6781 = abstractC3732.mo6781();
                    if (localDateTimeMo6781 != null) {
                        try {
                        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                            C1123.m1403(abstractC3732.mo6730("read org.joda.time.LocalDate error"), e2);
                            return null;
                        }
                        break;
                    }
                }
                break;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        switch (this.f9194) {
        }
        return this.f9193;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        int i = this.f9194;
        Constructor constructor = this.f9191;
        Class cls = this.f9190;
        Constructor constructor2 = this.f9192;
        switch (i) {
            case 0:
                byte bMo6743 = abstractC3732.mo6743();
                if (bMo6743 == -87) {
                    LocalDate localDateMo6786 = abstractC3732.mo6786();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        C1123.m1403(abstractC3732.mo6730("read org.joda.time.LocalDate error"), e);
                        return null;
                    }
                } else if (!abstractC3732.mo6737()) {
                    C1123.m1410(abstractC3732.mo6730("not support " + InterfaceC3745.m6917(bMo6743)));
                } else {
                    abstractC3732.mo6708();
                    Integer numValueOf = null;
                    Integer numValueOf2 = null;
                    Integer numValueOf3 = null;
                    Object objMo6700 = null;
                    while (!abstractC3732.mo6712()) {
                        long jMo6689 = abstractC3732.mo6689();
                        if (jMo6689 == AbstractC3670.f9172) {
                            numValueOf = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo6689 == AbstractC3670.f9171) {
                            numValueOf2 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo6689 == AbstractC3670.f9170) {
                            numValueOf3 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo6689 != AbstractC3670.f9173) {
                            C1123.m1410(abstractC3732.mo6730("not support fieldName " + abstractC3732.mo6664()));
                        } else {
                            objMo6700 = abstractC3732.mo6700(cls);
                        }
                        break;
                    }
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                        C1123.m1403(abstractC3732.mo6730("read org.joda.time.LocalDate error"), e2);
                        return null;
                    }
                }
                break;
            default:
                byte bMo67432 = abstractC3732.mo6743();
                if (bMo67432 == -87) {
                    LocalDate localDateMo67862 = abstractC3732.mo6786();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
                        C1123.m1403(abstractC3732.mo6730("read org.joda.time.LocalDate error"), e3);
                        return null;
                    }
                } else if (bMo67432 == -88) {
                    LocalDateTime localDateTimeMo6781 = abstractC3732.mo6781();
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
                        C1123.m1403(abstractC3732.mo6730("read org.joda.time.LocalDate error"), e4);
                        return null;
                    }
                } else if (!abstractC3732.mo6737()) {
                    C1123.m1410(abstractC3732.mo6730("not support " + InterfaceC3745.m6917(bMo67432)));
                } else {
                    abstractC3732.mo6708();
                    Integer numValueOf4 = null;
                    Integer numValueOf5 = null;
                    Integer numValueOf6 = null;
                    Integer numValueOf7 = null;
                    Integer numValueOf8 = null;
                    Integer numValueOf9 = null;
                    Integer numValueOf10 = null;
                    Object objMo67002 = null;
                    while (!abstractC3732.mo6712()) {
                        long jMo66892 = abstractC3732.mo6689();
                        if (jMo66892 == AbstractC3670.f9172) {
                            numValueOf4 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo66892 == AbstractC3670.f9171) {
                            numValueOf5 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo66892 == AbstractC3670.f9170) {
                            numValueOf6 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo66892 == AbstractC3670.f9169) {
                            numValueOf7 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo66892 == AbstractC3670.f9168) {
                            numValueOf8 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo66892 == AbstractC3670.f9167) {
                            numValueOf9 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo66892 == AbstractC3670.f9174) {
                            numValueOf10 = Integer.valueOf(abstractC3732.mo6772());
                        } else if (jMo66892 != AbstractC3670.f9173) {
                            C1123.m1410(abstractC3732.mo6730("not support fieldName " + abstractC3732.mo6664()));
                        } else {
                            objMo67002 = abstractC3732.mo6700(cls);
                        }
                        break;
                    }
                    try {
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
                        C1123.m1403(abstractC3732.mo6730("read org.joda.time.LocalDate error"), e5);
                        return null;
                    }
                }
                break;
        }
        return null;
    }
}
