package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8435 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC8523 f23343;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean f23344;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Class f23345;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Type f23346;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC8523 f23347;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23348;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Class f23349;

    static {
        Collections.EMPTY_LIST.getClass();
        Collections.EMPTY_SET.getClass();
    }

    public AbstractC8435(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field, Method method, Class cls2) {
        super(str, i, j, str2, null, str3, type2, cls, field, method);
        this.f23349 = cls2;
        boolean z = false;
        this.f23344 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Type type3 = type == null ? Object.class : type;
        this.f23346 = type3;
        if (type3 instanceof Class) {
            Class cls3 = (Class) type;
            this.f23345 = cls3;
            if (cls3 != null) {
                if (Enum.class.isAssignableFrom(cls3)) {
                    this.f23347 = new C8463(cls, cls3, j);
                } else if (cls3 == String.class) {
                    this.f23347 = C8488.f23579;
                } else {
                    this.f23347 = new C8442(type2, cls3, type, j);
                }
            }
        } else {
            this.f23345 = AbstractC2867.m5942(type);
        }
        Class cls4 = this.f23345;
        if (cls4 != null && C8539.m14105(cls4)) {
            z = true;
        }
        this.f23348 = z;
        if (str2 == null || this.f23345 != Date.class) {
            return;
        }
        this.f23343 = new C8476(str2, null);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        InterfaceC8523 interfaceC8523 = this.f23347;
        Class cls2 = this.f23617;
        if (interfaceC8523 != null && cls2.isAssignableFrom(cls)) {
            return interfaceC8523;
        }
        if (interfaceC8523 != null || cls != cls2) {
            return abstractC2897.m6077(cls);
        }
        InterfaceC8523 interfaceC8523M6077 = abstractC2897.m6077(cls);
        this.f23347 = interfaceC8523M6077;
        return interfaceC8523M6077;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class mo14010() {
        return this.f23345;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14011(AbstractC2897 abstractC2897, List list) {
        Class<?> cls;
        boolean z;
        Class<?> cls2;
        InterfaceC8523 interfaceC8523M14013;
        AbstractC2897 abstractC28972 = abstractC2897;
        boolean z2 = abstractC28972.f9171;
        long j = this.f23611;
        if (!z2) {
            long jM6078 = abstractC28972.m6078(j);
            boolean z3 = (JSONWriter$Feature.ReferenceDetection.mask & jM6078) != 0;
            abstractC28972.mo5999();
            int i = 0;
            InterfaceC8523 interfaceC8523M140132 = null;
            Class<?> cls3 = null;
            while (i < list.size()) {
                if (i != 0) {
                    abstractC28972.mo5982();
                }
                long j2 = jM6078;
                Object obj = list.get(i);
                if (obj == null) {
                    abstractC28972.mo5967();
                } else {
                    Class<?> cls4 = obj.getClass();
                    if (cls4 == String.class) {
                        abstractC28972.mo6017((String) obj);
                    } else if (this.f23344) {
                        abstractC28972.mo6017(obj.toString());
                    } else {
                        if (cls4 == cls3) {
                            cls = cls3;
                        } else {
                            z3 = (JSONWriter$Feature.ReferenceDetection.mask & j2) != 0;
                            interfaceC8523M140132 = m14013(abstractC28972, cls4);
                            if (z3) {
                                z3 = !C8539.m14105(cls4);
                            }
                            cls = cls4;
                        }
                        boolean z4 = z3;
                        InterfaceC8523 interfaceC8523 = interfaceC8523M140132;
                        if (!z4 || !abstractC28972.m6090(i, obj)) {
                            if (this.f23595) {
                                if (abstractC28972.f9167 == null) {
                                    abstractC28972.f9167 = new IdentityHashMap(8);
                                }
                                abstractC28972.f9167.putIfAbsent(obj, C2894.f9142);
                            }
                            interfaceC8523.mo5679(abstractC28972, obj, null, this.f23346, j2);
                            if (z4) {
                                abstractC28972.m6083(obj);
                            }
                        }
                        interfaceC8523M140132 = interfaceC8523;
                        z3 = z4;
                        cls3 = cls;
                    }
                }
                i++;
                jM6078 = j2;
            }
            abstractC28972.mo5995();
            return;
        }
        long jM60782 = abstractC28972.m6078(j);
        boolean z5 = (JSONWriter$Feature.BeanToArray.mask & jM60782) != 0;
        int size = list.size();
        boolean z6 = (JSONWriter$Feature.ReferenceDetection.mask & jM60782) != 0;
        if (abstractC28972.m6062(this.f23617, list)) {
            abstractC28972.mo6042(AbstractC2867.m5943(list.getClass()));
        }
        abstractC28972.mo6040(size);
        Class<?> cls5 = null;
        InterfaceC8523 interfaceC85232 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 == null) {
                abstractC28972.mo5967();
            } else {
                Class<?> cls6 = obj2.getClass();
                if (cls6 != cls5) {
                    boolean zM6072 = abstractC28972.m6072();
                    if (cls6 != this.f23346 || (interfaceC8523M14013 = this.f23343) == null) {
                        interfaceC8523M14013 = m14013(abstractC28972, cls6);
                    }
                    interfaceC85232 = interfaceC8523M14013;
                    if (zM6072) {
                        zM6072 = !(cls6 == this.f23345 ? this.f23348 : C8539.m14105(cls6));
                    }
                    cls2 = cls6;
                    z = zM6072;
                } else {
                    z = z6;
                    cls2 = cls5;
                }
                InterfaceC8523 interfaceC85233 = interfaceC85232;
                if (!z || !abstractC28972.m6090(i2, obj2)) {
                    Type type = this.f23346;
                    if (z5) {
                        interfaceC85233.mo14018(abstractC28972, obj2, type, jM60782);
                        abstractC28972 = abstractC2897;
                    } else {
                        long j3 = jM60782;
                        abstractC28972 = abstractC2897;
                        interfaceC85233.mo5678(abstractC28972, obj2, Integer.valueOf(i2), type, j3);
                        jM60782 = j3;
                    }
                    if (z) {
                        abstractC28972.m6083(obj2);
                    }
                }
                interfaceC85232 = interfaceC85233;
                z6 = z;
                cls5 = cls2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14012(AbstractC2897 abstractC2897, List list) {
        m14078(abstractC2897);
        if (abstractC2897.f9171 && abstractC2897.m6062(this.f23617, list)) {
            abstractC2897.mo6042(AbstractC2867.m5943(list.getClass()));
        }
        abstractC2897.mo6016(list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8523 m14013(AbstractC2897 abstractC2897, Class cls) {
        Class cls2 = this.f23349;
        if (cls2 != null) {
            InterfaceC8523 interfaceC8523 = this.f23343;
            if (interfaceC8523 != null) {
                return interfaceC8523;
            }
            InterfaceC8523 interfaceC8523M6080 = abstractC2897.m6080(cls2, cls2);
            this.f23343 = interfaceC8523M6080;
            return interfaceC8523M6080;
        }
        Type type = this.f23346;
        if (cls != type) {
            return abstractC2897.m6080(AbstractC2867.m5944(cls), cls);
        }
        InterfaceC8523 interfaceC85232 = this.f23343;
        if (interfaceC85232 != null) {
            return interfaceC85232;
        }
        String str = this.f23614;
        if (str != null) {
            C8539 c8539 = abstractC2897.f9178.f9154;
            c8539.getClass();
            return cls == Double.class ? new C8475(new DecimalFormat(str), 0) : cls == Float.class ? new C8475(new DecimalFormat(str), 1) : cls == BigDecimal.class ? new C8486(new DecimalFormat(str), 0, null) : cls == LocalDate.class ? new C8464(str, null) : cls == LocalDateTime.class ? new C8460(str, null) : cls == LocalTime.class ? new C8459(str, null) : cls == Date.class ? new C8476(str, null) : cls == OffsetDateTime.class ? new C8461(str, null) : cls == ZonedDateTime.class ? new C8452(str, null, null) : c8539.m14106(cls, AbstractC2867.m5944(cls), false);
        }
        InterfaceC8523 interfaceC8523M60802 = abstractC2897.m6080(this.f23345, type);
        this.f23343 = interfaceC8523M60802;
        return interfaceC8523M60802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14014(AbstractC2897 abstractC2897, List list) {
        boolean z;
        long j;
        InterfaceC8523 interfaceC8523;
        boolean z2;
        InterfaceC8523 interfaceC8523M14013;
        AbstractC2897 abstractC28972 = abstractC2897;
        boolean z3 = abstractC28972.f9171;
        long j2 = this.f23611;
        if (z3) {
            Class<?> cls = null;
            long jM6078 = abstractC2897.m6078(j2);
            boolean z4 = (JSONWriter$Feature.BeanToArray.mask & jM6078) != 0;
            int size = list.size();
            if ((JSONWriter$Feature.NotWriteEmptyArray.mask & jM6078) == 0 || size != 0) {
                m14078(abstractC2897);
                boolean z5 = (JSONWriter$Feature.ReferenceDetection.mask & jM6078) != 0;
                if (abstractC2897.m6062(this.f23617, list)) {
                    abstractC2897.mo6042(AbstractC2867.m5943(list.getClass()));
                }
                abstractC2897.mo6040(size);
                InterfaceC8523 interfaceC85232 = null;
                for (int i = 0; i < size; i++) {
                    boolean z6 = z5;
                    Object obj = list.get(i);
                    if (obj == null) {
                        abstractC2897.mo5967();
                        z5 = z6;
                    } else {
                        Class<?> cls2 = obj.getClass();
                        if (cls2 != cls) {
                            boolean zM6072 = abstractC2897.m6072();
                            if (cls2 != this.f23346 || (interfaceC8523M14013 = this.f23343) == null) {
                                interfaceC8523M14013 = m14013(abstractC2897, cls2);
                            }
                            if (zM6072) {
                                zM6072 = !(cls2 == this.f23345 ? this.f23348 : C8539.m14105(cls2));
                            }
                            z2 = zM6072;
                            interfaceC8523 = interfaceC8523M14013;
                        } else {
                            cls2 = cls;
                            interfaceC8523 = interfaceC85232;
                            z2 = z6;
                        }
                        if (!z2 || !abstractC2897.m6090(i, obj)) {
                            Type type = this.f23346;
                            if (z4) {
                                interfaceC8523.mo14018(abstractC28972, obj, type, jM6078);
                                abstractC28972 = abstractC2897;
                            } else {
                                long j3 = jM6078;
                                abstractC28972 = abstractC2897;
                                interfaceC8523.mo5678(abstractC28972, obj, Integer.valueOf(i), type, j3);
                                jM6078 = j3;
                            }
                            if (z2) {
                                abstractC2897.m6083(obj);
                            }
                        }
                        interfaceC85232 = interfaceC8523;
                        cls = cls2;
                        z5 = z2;
                    }
                }
                return;
            }
            return;
        }
        Class<?> cls3 = null;
        long jM60782 = abstractC2897.m6078(j2);
        if ((JSONWriter$Feature.NotWriteEmptyArray.mask & jM60782) == 0 || !list.isEmpty()) {
            m14078(abstractC2897);
            boolean z7 = (JSONWriter$Feature.ReferenceDetection.mask & jM60782) != 0;
            abstractC2897.mo5999();
            InterfaceC8523 interfaceC8523M140132 = null;
            int i2 = 0;
            while (i2 < list.size()) {
                if (i2 != 0) {
                    abstractC2897.mo5982();
                }
                boolean z8 = z7;
                Object obj2 = list.get(i2);
                if (obj2 == null) {
                    abstractC2897.mo5967();
                } else {
                    Class<?> cls4 = obj2.getClass();
                    if (cls4 == String.class) {
                        abstractC2897.mo6017((String) obj2);
                    } else {
                        if (cls4 == cls3) {
                            cls4 = cls3;
                            z = z8;
                        } else {
                            boolean zM60722 = abstractC2897.m6072();
                            interfaceC8523M140132 = m14013(abstractC2897, cls4);
                            if (zM60722) {
                                zM60722 = !C8539.m14105(cls4);
                            }
                            z = zM60722;
                        }
                        InterfaceC8523 interfaceC85233 = interfaceC8523M140132;
                        if (z) {
                            if (abstractC2897.m6090(i2, obj2)) {
                                j = jM60782;
                            }
                            interfaceC8523M140132 = interfaceC85233;
                            cls3 = cls4;
                            z7 = z;
                            i2++;
                            jM60782 = j;
                        } else if (this.f23595) {
                            if (abstractC28972.f9167 == null) {
                                abstractC28972.f9167 = new IdentityHashMap(8);
                            }
                            abstractC28972.f9167.putIfAbsent(obj2, C2894.f9142);
                        }
                        j = jM60782;
                        interfaceC85233.mo5679(abstractC28972, obj2, null, this.f23346, j);
                        if (z) {
                            abstractC2897.m6083(obj2);
                        }
                        interfaceC8523M140132 = interfaceC85233;
                        cls3 = cls4;
                        z7 = z;
                        i2++;
                        jM60782 = j;
                    }
                }
                z7 = z8;
                j = jM60782;
                i2++;
                jM60782 = j;
            }
            abstractC2897.mo5995();
        }
    }
}
