package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2893;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2866;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8443 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public InterfaceC8531 f23352;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean f23353;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Class f23354;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Type f23355;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC8531 f23356;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23357;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Class f23358;

    static {
        Collections.EMPTY_LIST.getClass();
        Collections.EMPTY_SET.getClass();
    }

    public AbstractC8443(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field, Method method, Class cls2) {
        super(str, i, j, str2, null, str3, type2, cls, field, method);
        this.f23358 = cls2;
        boolean z = false;
        this.f23353 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0;
        Type type3 = type == null ? Object.class : type;
        this.f23355 = type3;
        if (type3 instanceof Class) {
            Class cls3 = (Class) type;
            this.f23354 = cls3;
            if (cls3 != null) {
                if (Enum.class.isAssignableFrom(cls3)) {
                    this.f23356 = new C8471(cls, cls3, j);
                } else if (cls3 == String.class) {
                    this.f23356 = C8496.f23588;
                } else {
                    this.f23356 = new C8450(type2, cls3, type, j);
                }
            }
        } else {
            this.f23354 = AbstractC2866.m5897(type);
        }
        Class cls4 = this.f23354;
        if (cls4 != null && C8547.m14086(cls4)) {
            z = true;
        }
        this.f23357 = z;
        if (str2 == null || this.f23354 != Date.class) {
            return;
        }
        this.f23352 = new C8484(str2, null);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        InterfaceC8531 interfaceC8531 = this.f23356;
        Class cls2 = this.f23626;
        if (interfaceC8531 != null && cls2.isAssignableFrom(cls)) {
            return interfaceC8531;
        }
        if (interfaceC8531 != null || cls != cls2) {
            return abstractC2896.m6031(cls);
        }
        InterfaceC8531 interfaceC8531M6031 = abstractC2896.m6031(cls);
        this.f23356 = interfaceC8531M6031;
        return interfaceC8531M6031;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class mo13991() {
        return this.f23354;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13992(AbstractC2896 abstractC2896, List list) {
        Class<?> cls;
        boolean z;
        Class<?> cls2;
        InterfaceC8531 interfaceC8531M13994;
        AbstractC2896 abstractC28962 = abstractC2896;
        boolean z2 = abstractC28962.f9169;
        long j = this.f23620;
        if (!z2) {
            long jM6032 = abstractC28962.m6032(j);
            boolean z3 = (JSONWriter$Feature.ReferenceDetection.mask & jM6032) != 0;
            abstractC28962.mo5954();
            int i = 0;
            InterfaceC8531 interfaceC8531M139942 = null;
            Class<?> cls3 = null;
            while (i < list.size()) {
                if (i != 0) {
                    abstractC28962.mo5937();
                }
                long j2 = jM6032;
                Object obj = list.get(i);
                if (obj == null) {
                    abstractC28962.mo5922();
                } else {
                    Class<?> cls4 = obj.getClass();
                    if (cls4 == String.class) {
                        abstractC28962.mo5972((String) obj);
                    } else if (this.f23353) {
                        abstractC28962.mo5972(obj.toString());
                    } else {
                        if (cls4 == cls3) {
                            cls = cls3;
                        } else {
                            z3 = (JSONWriter$Feature.ReferenceDetection.mask & j2) != 0;
                            interfaceC8531M139942 = m13994(abstractC28962, cls4);
                            if (z3) {
                                z3 = !C8547.m14086(cls4);
                            }
                            cls = cls4;
                        }
                        boolean z4 = z3;
                        InterfaceC8531 interfaceC8531 = interfaceC8531M139942;
                        if (!z4 || !abstractC28962.m6045(i, obj)) {
                            if (this.f23604) {
                                if (abstractC28962.f9165 == null) {
                                    abstractC28962.f9165 = new IdentityHashMap(8);
                                }
                                abstractC28962.f9165.putIfAbsent(obj, C2893.f9140);
                            }
                            interfaceC8531.mo5634(abstractC28962, obj, null, this.f23355, j2);
                            if (z4) {
                                abstractC28962.m6037(obj);
                            }
                        }
                        interfaceC8531M139942 = interfaceC8531;
                        z3 = z4;
                        cls3 = cls;
                    }
                }
                i++;
                jM6032 = j2;
            }
            abstractC28962.mo5950();
            return;
        }
        long jM60322 = abstractC28962.m6032(j);
        boolean z5 = (JSONWriter$Feature.BeanToArray.mask & jM60322) != 0;
        int size = list.size();
        boolean z6 = (JSONWriter$Feature.ReferenceDetection.mask & jM60322) != 0;
        if (abstractC28962.m6016(this.f23626, list)) {
            abstractC28962.mo5997(AbstractC2866.m5898(list.getClass()));
        }
        abstractC28962.mo5995(size);
        Class<?> cls5 = null;
        InterfaceC8531 interfaceC85312 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 == null) {
                abstractC28962.mo5922();
            } else {
                Class<?> cls6 = obj2.getClass();
                if (cls6 != cls5) {
                    boolean zM6028 = abstractC28962.m6028();
                    if (cls6 != this.f23355 || (interfaceC8531M13994 = this.f23352) == null) {
                        interfaceC8531M13994 = m13994(abstractC28962, cls6);
                    }
                    interfaceC85312 = interfaceC8531M13994;
                    if (zM6028) {
                        zM6028 = !(cls6 == this.f23354 ? this.f23357 : C8547.m14086(cls6));
                    }
                    cls2 = cls6;
                    z = zM6028;
                } else {
                    z = z6;
                    cls2 = cls5;
                }
                InterfaceC8531 interfaceC85313 = interfaceC85312;
                if (!z || !abstractC28962.m6045(i2, obj2)) {
                    Type type = this.f23355;
                    if (z5) {
                        interfaceC85313.mo13999(abstractC28962, obj2, type, jM60322);
                        abstractC28962 = abstractC2896;
                    } else {
                        long j3 = jM60322;
                        abstractC28962 = abstractC2896;
                        interfaceC85313.mo5633(abstractC28962, obj2, Integer.valueOf(i2), type, j3);
                        jM60322 = j3;
                    }
                    if (z) {
                        abstractC28962.m6037(obj2);
                    }
                }
                interfaceC85312 = interfaceC85313;
                z6 = z;
                cls5 = cls2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13993(AbstractC2896 abstractC2896, List list) {
        m14059(abstractC2896);
        if (abstractC2896.f9169 && abstractC2896.m6016(this.f23626, list)) {
            abstractC2896.mo5997(AbstractC2866.m5898(list.getClass()));
        }
        abstractC2896.mo5971(list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8531 m13994(AbstractC2896 abstractC2896, Class cls) {
        Class cls2 = this.f23358;
        if (cls2 != null) {
            InterfaceC8531 interfaceC8531 = this.f23352;
            if (interfaceC8531 != null) {
                return interfaceC8531;
            }
            InterfaceC8531 interfaceC8531M6034 = abstractC2896.m6034(cls2, cls2);
            this.f23352 = interfaceC8531M6034;
            return interfaceC8531M6034;
        }
        Type type = this.f23355;
        if (cls != type) {
            return abstractC2896.m6034(AbstractC2866.m5899(cls), cls);
        }
        InterfaceC8531 interfaceC85312 = this.f23352;
        if (interfaceC85312 != null) {
            return interfaceC85312;
        }
        String str = this.f23623;
        if (str != null) {
            C8547 c8547 = abstractC2896.f9176.f9152;
            c8547.getClass();
            return cls == Double.class ? new C8483(new DecimalFormat(str), 0) : cls == Float.class ? new C8483(new DecimalFormat(str), 1) : cls == BigDecimal.class ? new C8494(new DecimalFormat(str), 0, null) : cls == LocalDate.class ? new C8472(str, null) : cls == LocalDateTime.class ? new C8468(str, null) : cls == LocalTime.class ? new C8467(str, null) : cls == Date.class ? new C8484(str, null) : cls == OffsetDateTime.class ? new C8469(str, null) : cls == ZonedDateTime.class ? new C8460(str, null, null) : c8547.m14087(cls, AbstractC2866.m5899(cls), false);
        }
        InterfaceC8531 interfaceC8531M60342 = abstractC2896.m6034(this.f23354, type);
        this.f23352 = interfaceC8531M60342;
        return interfaceC8531M60342;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13995(AbstractC2896 abstractC2896, List list) {
        boolean z;
        long j;
        InterfaceC8531 interfaceC8531;
        boolean z2;
        InterfaceC8531 interfaceC8531M13994;
        AbstractC2896 abstractC28962 = abstractC2896;
        boolean z3 = abstractC28962.f9169;
        long j2 = this.f23620;
        if (z3) {
            Class<?> cls = null;
            long jM6032 = abstractC2896.m6032(j2);
            boolean z4 = (JSONWriter$Feature.BeanToArray.mask & jM6032) != 0;
            int size = list.size();
            if ((JSONWriter$Feature.NotWriteEmptyArray.mask & jM6032) == 0 || size != 0) {
                m14059(abstractC2896);
                boolean z5 = (JSONWriter$Feature.ReferenceDetection.mask & jM6032) != 0;
                if (abstractC2896.m6016(this.f23626, list)) {
                    abstractC2896.mo5997(AbstractC2866.m5898(list.getClass()));
                }
                abstractC2896.mo5995(size);
                InterfaceC8531 interfaceC85312 = null;
                for (int i = 0; i < size; i++) {
                    boolean z6 = z5;
                    Object obj = list.get(i);
                    if (obj == null) {
                        abstractC2896.mo5922();
                        z5 = z6;
                    } else {
                        Class<?> cls2 = obj.getClass();
                        if (cls2 != cls) {
                            boolean zM6028 = abstractC2896.m6028();
                            if (cls2 != this.f23355 || (interfaceC8531M13994 = this.f23352) == null) {
                                interfaceC8531M13994 = m13994(abstractC2896, cls2);
                            }
                            if (zM6028) {
                                zM6028 = !(cls2 == this.f23354 ? this.f23357 : C8547.m14086(cls2));
                            }
                            z2 = zM6028;
                            interfaceC8531 = interfaceC8531M13994;
                        } else {
                            cls2 = cls;
                            interfaceC8531 = interfaceC85312;
                            z2 = z6;
                        }
                        if (!z2 || !abstractC2896.m6045(i, obj)) {
                            Type type = this.f23355;
                            if (z4) {
                                interfaceC8531.mo13999(abstractC28962, obj, type, jM6032);
                                abstractC28962 = abstractC2896;
                            } else {
                                long j3 = jM6032;
                                abstractC28962 = abstractC2896;
                                interfaceC8531.mo5633(abstractC28962, obj, Integer.valueOf(i), type, j3);
                                jM6032 = j3;
                            }
                            if (z2) {
                                abstractC2896.m6037(obj);
                            }
                        }
                        interfaceC85312 = interfaceC8531;
                        cls = cls2;
                        z5 = z2;
                    }
                }
                return;
            }
            return;
        }
        Class<?> cls3 = null;
        long jM60322 = abstractC2896.m6032(j2);
        if ((JSONWriter$Feature.NotWriteEmptyArray.mask & jM60322) == 0 || !list.isEmpty()) {
            m14059(abstractC2896);
            boolean z7 = (JSONWriter$Feature.ReferenceDetection.mask & jM60322) != 0;
            abstractC2896.mo5954();
            InterfaceC8531 interfaceC8531M139942 = null;
            int i2 = 0;
            while (i2 < list.size()) {
                if (i2 != 0) {
                    abstractC2896.mo5937();
                }
                boolean z8 = z7;
                Object obj2 = list.get(i2);
                if (obj2 == null) {
                    abstractC2896.mo5922();
                } else {
                    Class<?> cls4 = obj2.getClass();
                    if (cls4 == String.class) {
                        abstractC2896.mo5972((String) obj2);
                    } else {
                        if (cls4 == cls3) {
                            cls4 = cls3;
                            z = z8;
                        } else {
                            boolean zM60282 = abstractC2896.m6028();
                            interfaceC8531M139942 = m13994(abstractC2896, cls4);
                            if (zM60282) {
                                zM60282 = !C8547.m14086(cls4);
                            }
                            z = zM60282;
                        }
                        InterfaceC8531 interfaceC85313 = interfaceC8531M139942;
                        if (z) {
                            if (abstractC2896.m6045(i2, obj2)) {
                                j = jM60322;
                            }
                            interfaceC8531M139942 = interfaceC85313;
                            cls3 = cls4;
                            z7 = z;
                            i2++;
                            jM60322 = j;
                        } else if (this.f23604) {
                            if (abstractC28962.f9165 == null) {
                                abstractC28962.f9165 = new IdentityHashMap(8);
                            }
                            abstractC28962.f9165.putIfAbsent(obj2, C2893.f9140);
                        }
                        j = jM60322;
                        interfaceC85313.mo5634(abstractC28962, obj2, null, this.f23355, j);
                        if (z) {
                            abstractC2896.m6037(obj2);
                        }
                        interfaceC8531M139942 = interfaceC85313;
                        cls3 = cls4;
                        z7 = z;
                        i2++;
                        jM60322 = j;
                    }
                }
                z7 = z8;
                j = jM60322;
                i2++;
                jM60322 = j;
            }
            abstractC2896.mo5950();
        }
    }
}
