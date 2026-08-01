package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3727;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3700;
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
public abstract class AbstractC9264 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC9352 f23688;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean f23689;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Class f23690;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Type f23691;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC9352 f23692;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23693;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Class f23694;

    static {
        Collections.EMPTY_LIST.getClass();
        Collections.EMPTY_SET.getClass();
    }

    public AbstractC9264(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field, Method method, Class cls2) {
        super(str, i, j, str2, null, str3, type2, cls, field, method);
        this.f23694 = cls2;
        boolean z = false;
        this.f23689 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Type type3 = type == null ? Object.class : type;
        this.f23691 = type3;
        if (type3 instanceof Class) {
            Class cls3 = (Class) type;
            this.f23690 = cls3;
            if (cls3 != null) {
                if (Enum.class.isAssignableFrom(cls3)) {
                    this.f23692 = new C9292(cls, cls3, j);
                } else if (cls3 == String.class) {
                    this.f23692 = C9317.f23924;
                } else {
                    this.f23692 = new C9271(type2, cls3, type, j);
                }
            }
        } else {
            this.f23690 = AbstractC3700.m6502(type);
        }
        Class cls4 = this.f23690;
        if (cls4 != null && C9368.m14664(cls4)) {
            z = true;
        }
        this.f23693 = z;
        if (str2 == null || this.f23690 != Date.class) {
            return;
        }
        this.f23688 = new C9305(str2, null);
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        InterfaceC9352 interfaceC9352 = this.f23692;
        Class cls2 = this.f23962;
        if (interfaceC9352 != null && cls2.isAssignableFrom(cls)) {
            return interfaceC9352;
        }
        if (interfaceC9352 != null || cls != cls2) {
            return abstractC3730.m6637(cls);
        }
        InterfaceC9352 interfaceC9352M6637 = abstractC3730.m6637(cls);
        this.f23692 = interfaceC9352M6637;
        return interfaceC9352M6637;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class mo14569() {
        return this.f23690;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14570(AbstractC3730 abstractC3730, List list) {
        Class<?> cls;
        boolean z;
        Class<?> cls2;
        InterfaceC9352 interfaceC9352M14572;
        AbstractC3730 abstractC37302 = abstractC3730;
        boolean z2 = abstractC37302.f9516;
        long j = this.f23956;
        if (!z2) {
            long jM6638 = abstractC37302.m6638(j);
            boolean z3 = (JSONWriter$Feature.ReferenceDetection.mask & jM6638) != 0;
            abstractC37302.mo6559();
            int i = 0;
            InterfaceC9352 interfaceC9352M145722 = null;
            Class<?> cls3 = null;
            while (i < list.size()) {
                if (i != 0) {
                    abstractC37302.mo6542();
                }
                long j2 = jM6638;
                Object obj = list.get(i);
                if (obj == null) {
                    abstractC37302.mo6527();
                } else {
                    Class<?> cls4 = obj.getClass();
                    if (cls4 == String.class) {
                        abstractC37302.mo6577((String) obj);
                    } else if (this.f23689) {
                        abstractC37302.mo6577(obj.toString());
                    } else {
                        if (cls4 == cls3) {
                            cls = cls3;
                        } else {
                            z3 = (JSONWriter$Feature.ReferenceDetection.mask & j2) != 0;
                            interfaceC9352M145722 = m14572(abstractC37302, cls4);
                            if (z3) {
                                z3 = !C9368.m14664(cls4);
                            }
                            cls = cls4;
                        }
                        boolean z4 = z3;
                        InterfaceC9352 interfaceC9352 = interfaceC9352M145722;
                        if (!z4 || !abstractC37302.m6650(i, obj)) {
                            if (this.f23940) {
                                if (abstractC37302.f9512 == null) {
                                    abstractC37302.f9512 = new IdentityHashMap(8);
                                }
                                abstractC37302.f9512.putIfAbsent(obj, C3727.f9487);
                            }
                            interfaceC9352.mo6239(abstractC37302, obj, null, this.f23691, j2);
                            if (z4) {
                                abstractC37302.m6643(obj);
                            }
                        }
                        interfaceC9352M145722 = interfaceC9352;
                        z3 = z4;
                        cls3 = cls;
                    }
                }
                i++;
                jM6638 = j2;
            }
            abstractC37302.mo6555();
            return;
        }
        long jM66382 = abstractC37302.m6638(j);
        boolean z5 = (JSONWriter$Feature.BeanToArray.mask & jM66382) != 0;
        int size = list.size();
        boolean z6 = (JSONWriter$Feature.ReferenceDetection.mask & jM66382) != 0;
        if (abstractC37302.m6622(this.f23962, list)) {
            abstractC37302.mo6602(AbstractC3700.m6503(list.getClass()));
        }
        abstractC37302.mo6600(size);
        Class<?> cls5 = null;
        InterfaceC9352 interfaceC93522 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 == null) {
                abstractC37302.mo6527();
            } else {
                Class<?> cls6 = obj2.getClass();
                if (cls6 != cls5) {
                    boolean zM6632 = abstractC37302.m6632();
                    if (cls6 != this.f23691 || (interfaceC9352M14572 = this.f23688) == null) {
                        interfaceC9352M14572 = m14572(abstractC37302, cls6);
                    }
                    interfaceC93522 = interfaceC9352M14572;
                    if (zM6632) {
                        zM6632 = !(cls6 == this.f23690 ? this.f23693 : C9368.m14664(cls6));
                    }
                    cls2 = cls6;
                    z = zM6632;
                } else {
                    z = z6;
                    cls2 = cls5;
                }
                InterfaceC9352 interfaceC93523 = interfaceC93522;
                if (!z || !abstractC37302.m6650(i2, obj2)) {
                    Type type = this.f23691;
                    if (z5) {
                        interfaceC93523.mo14577(abstractC37302, obj2, type, jM66382);
                        abstractC37302 = abstractC3730;
                    } else {
                        long j3 = jM66382;
                        abstractC37302 = abstractC3730;
                        interfaceC93523.mo6238(abstractC37302, obj2, Integer.valueOf(i2), type, j3);
                        jM66382 = j3;
                    }
                    if (z) {
                        abstractC37302.m6643(obj2);
                    }
                }
                interfaceC93522 = interfaceC93523;
                z6 = z;
                cls5 = cls2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14571(AbstractC3730 abstractC3730, List list) {
        m14637(abstractC3730);
        if (abstractC3730.f9516 && abstractC3730.m6622(this.f23962, list)) {
            abstractC3730.mo6602(AbstractC3700.m6503(list.getClass()));
        }
        abstractC3730.mo6576(list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC9352 m14572(AbstractC3730 abstractC3730, Class cls) {
        Class cls2 = this.f23694;
        if (cls2 != null) {
            InterfaceC9352 interfaceC9352 = this.f23688;
            if (interfaceC9352 != null) {
                return interfaceC9352;
            }
            InterfaceC9352 interfaceC9352M6640 = abstractC3730.m6640(cls2, cls2);
            this.f23688 = interfaceC9352M6640;
            return interfaceC9352M6640;
        }
        Type type = this.f23691;
        if (cls != type) {
            return abstractC3730.m6640(AbstractC3700.m6504(cls), cls);
        }
        InterfaceC9352 interfaceC93522 = this.f23688;
        if (interfaceC93522 != null) {
            return interfaceC93522;
        }
        String str = this.f23959;
        if (str != null) {
            C9368 c9368 = abstractC3730.f9523.f9499;
            c9368.getClass();
            return cls == Double.class ? new C9304(new DecimalFormat(str), 0) : cls == Float.class ? new C9304(new DecimalFormat(str), 1) : cls == BigDecimal.class ? new C9315(new DecimalFormat(str), 0, null) : cls == LocalDate.class ? new C9293(str, null) : cls == LocalDateTime.class ? new C9289(str, null) : cls == LocalTime.class ? new C9288(str, null) : cls == Date.class ? new C9305(str, null) : cls == OffsetDateTime.class ? new C9290(str, null) : cls == ZonedDateTime.class ? new C9281(str, null, null) : c9368.m14665(cls, AbstractC3700.m6504(cls), false);
        }
        InterfaceC9352 interfaceC9352M66402 = abstractC3730.m6640(this.f23690, type);
        this.f23688 = interfaceC9352M66402;
        return interfaceC9352M66402;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14573(AbstractC3730 abstractC3730, List list) {
        boolean z;
        long j;
        InterfaceC9352 interfaceC9352;
        boolean z2;
        InterfaceC9352 interfaceC9352M14572;
        AbstractC3730 abstractC37302 = abstractC3730;
        boolean z3 = abstractC37302.f9516;
        long j2 = this.f23956;
        if (z3) {
            Class<?> cls = null;
            long jM6638 = abstractC3730.m6638(j2);
            boolean z4 = (JSONWriter$Feature.BeanToArray.mask & jM6638) != 0;
            int size = list.size();
            if ((JSONWriter$Feature.NotWriteEmptyArray.mask & jM6638) == 0 || size != 0) {
                m14637(abstractC3730);
                boolean z5 = (JSONWriter$Feature.ReferenceDetection.mask & jM6638) != 0;
                if (abstractC3730.m6622(this.f23962, list)) {
                    abstractC3730.mo6602(AbstractC3700.m6503(list.getClass()));
                }
                abstractC3730.mo6600(size);
                InterfaceC9352 interfaceC93522 = null;
                for (int i = 0; i < size; i++) {
                    boolean z6 = z5;
                    Object obj = list.get(i);
                    if (obj == null) {
                        abstractC3730.mo6527();
                        z5 = z6;
                    } else {
                        Class<?> cls2 = obj.getClass();
                        if (cls2 != cls) {
                            boolean zM6632 = abstractC3730.m6632();
                            if (cls2 != this.f23691 || (interfaceC9352M14572 = this.f23688) == null) {
                                interfaceC9352M14572 = m14572(abstractC3730, cls2);
                            }
                            if (zM6632) {
                                zM6632 = !(cls2 == this.f23690 ? this.f23693 : C9368.m14664(cls2));
                            }
                            z2 = zM6632;
                            interfaceC9352 = interfaceC9352M14572;
                        } else {
                            cls2 = cls;
                            interfaceC9352 = interfaceC93522;
                            z2 = z6;
                        }
                        if (!z2 || !abstractC3730.m6650(i, obj)) {
                            Type type = this.f23691;
                            if (z4) {
                                interfaceC9352.mo14577(abstractC37302, obj, type, jM6638);
                                abstractC37302 = abstractC3730;
                            } else {
                                long j3 = jM6638;
                                abstractC37302 = abstractC3730;
                                interfaceC9352.mo6238(abstractC37302, obj, Integer.valueOf(i), type, j3);
                                jM6638 = j3;
                            }
                            if (z2) {
                                abstractC3730.m6643(obj);
                            }
                        }
                        interfaceC93522 = interfaceC9352;
                        cls = cls2;
                        z5 = z2;
                    }
                }
                return;
            }
            return;
        }
        Class<?> cls3 = null;
        long jM66382 = abstractC3730.m6638(j2);
        if ((JSONWriter$Feature.NotWriteEmptyArray.mask & jM66382) == 0 || !list.isEmpty()) {
            m14637(abstractC3730);
            boolean z7 = (JSONWriter$Feature.ReferenceDetection.mask & jM66382) != 0;
            abstractC3730.mo6559();
            InterfaceC9352 interfaceC9352M145722 = null;
            int i2 = 0;
            while (i2 < list.size()) {
                if (i2 != 0) {
                    abstractC3730.mo6542();
                }
                boolean z8 = z7;
                Object obj2 = list.get(i2);
                if (obj2 == null) {
                    abstractC3730.mo6527();
                } else {
                    Class<?> cls4 = obj2.getClass();
                    if (cls4 == String.class) {
                        abstractC3730.mo6577((String) obj2);
                    } else {
                        if (cls4 == cls3) {
                            cls4 = cls3;
                            z = z8;
                        } else {
                            boolean zM66322 = abstractC3730.m6632();
                            interfaceC9352M145722 = m14572(abstractC3730, cls4);
                            if (zM66322) {
                                zM66322 = !C9368.m14664(cls4);
                            }
                            z = zM66322;
                        }
                        InterfaceC9352 interfaceC93523 = interfaceC9352M145722;
                        if (z) {
                            if (abstractC3730.m6650(i2, obj2)) {
                                j = jM66382;
                            }
                            interfaceC9352M145722 = interfaceC93523;
                            cls3 = cls4;
                            z7 = z;
                            i2++;
                            jM66382 = j;
                        } else if (this.f23940) {
                            if (abstractC37302.f9512 == null) {
                                abstractC37302.f9512 = new IdentityHashMap(8);
                            }
                            abstractC37302.f9512.putIfAbsent(obj2, C3727.f9487);
                        }
                        j = jM66382;
                        interfaceC93523.mo6239(abstractC37302, obj2, null, this.f23691, j);
                        if (z) {
                            abstractC3730.m6643(obj2);
                        }
                        interfaceC9352M145722 = interfaceC93523;
                        cls3 = cls4;
                        z7 = z;
                        i2++;
                        jM66382 = j;
                    }
                }
                z7 = z8;
                j = jM66382;
                i2++;
                jM66382 = j;
            }
            abstractC3730.mo6555();
        }
    }
}
