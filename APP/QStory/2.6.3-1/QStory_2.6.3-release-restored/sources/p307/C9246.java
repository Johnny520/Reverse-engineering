package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9246 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Type f23662;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23663 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC9352 f23664;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Class f23665;

    public C9246(String str, Class cls, int i, long j, String str2, String str3, Type type, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls2, field, method);
        this.f23662 = cls;
        if (cls != null) {
            this.f23665 = cls;
        } else {
            this.f23665 = AbstractC3700.m6502(cls);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        C9348 c9348;
        switch (this.f23663) {
            case 0:
                if (cls == String[].class) {
                    return C9276.f23727;
                }
                DecimalFormat decimalFormat = this.f23957;
                if (cls == Float[].class) {
                    if (decimalFormat == null) {
                        return C9348.f24035;
                    }
                    c9348 = new C9348(Float.class, decimalFormat);
                } else if (cls == Double[].class) {
                    if (decimalFormat == null) {
                        return C9348.f24036;
                    }
                    c9348 = new C9348(Double.class, decimalFormat);
                } else {
                    if (cls != BigDecimal[].class) {
                        return abstractC3730.m6637(cls);
                    }
                    if (decimalFormat == null) {
                        return C9348.f24037;
                    }
                    c9348 = new C9348(BigDecimal.class, decimalFormat);
                }
                return c9348;
            default:
                return super.mo14553(abstractC3730, cls);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object mo14554(Object obj) {
        switch (this.f23663) {
            case 1:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C3775.m6961("field.get error, ", this.f23963, e);
                    return null;
                }
            default:
                return super.mo14554(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC9352 m14555(AbstractC3730 abstractC3730, Class cls) {
        int i = this.f23663;
        Class cls2 = this.f23665;
        DecimalFormat decimalFormat = this.f23957;
        Type type = this.f23662;
        switch (i) {
            case 0:
                if (cls != type) {
                    return abstractC3730.m6640(AbstractC3700.m6504(cls), cls);
                }
                InterfaceC9352 interfaceC9352 = this.f23664;
                if (interfaceC9352 != null) {
                    return interfaceC9352;
                }
                String str = this.f23959;
                if (cls == Double.class) {
                    this.f23664 = new C9304(new DecimalFormat(str), 0);
                } else if (cls == Float.class) {
                    this.f23664 = new C9304(new DecimalFormat(str), 1);
                } else if (cls != BigDecimal.class || decimalFormat == null) {
                    this.f23664 = abstractC3730.m6640(cls2, type);
                } else {
                    this.f23664 = new C9315(decimalFormat, 0, null);
                }
                return this.f23664;
            default:
                if (cls != type) {
                    return abstractC3730.m6640(null, cls);
                }
                InterfaceC9352 interfaceC93522 = this.f23664;
                if (interfaceC93522 != null) {
                    return interfaceC93522;
                }
                if (cls == Float[].class) {
                    return decimalFormat != null ? new C9348(Float.class, decimalFormat) : C9348.f24035;
                }
                if (cls == Double[].class) {
                    return decimalFormat != null ? new C9348(Double.class, decimalFormat) : C9348.f24036;
                }
                if (cls == BigDecimal[].class) {
                    return decimalFormat != null ? new C9348(BigDecimal.class, decimalFormat) : C9348.f24037;
                }
                if (cls == Float.class) {
                    return decimalFormat != null ? new C9304(decimalFormat, 1) : C9304.f23856;
                }
                if (cls == Double.class) {
                    return decimalFormat != null ? new C9304(decimalFormat, 0) : C9304.f23857;
                }
                if (cls == BigDecimal.class) {
                    return decimalFormat != null ? new C9315(decimalFormat, 0, null) : C9315.f23905;
                }
                InterfaceC9352 interfaceC9352M6640 = abstractC3730.m6640(cls2, type);
                this.f23664 = interfaceC9352M6640;
                return interfaceC9352M6640;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14556(AbstractC3730 abstractC3730, boolean z, Object[] objArr) {
        boolean z2;
        Class<?> cls;
        String strM6641;
        String strM6647;
        boolean z3;
        Class<?> cls2;
        String strM66412;
        String strM66472;
        int i = this.f23663;
        Class<?> cls3 = this.f23962;
        String str = this.f23963;
        Class<?> cls4 = null;
        int i2 = 0;
        switch (i) {
            case 0:
                long j = abstractC3730.f9523.f9498;
                boolean z4 = (JSONWriter$Feature.ReferenceDetection.mask & j) != 0;
                if (z) {
                    if (objArr.length != 0 || (j & JSONWriter$Feature.NotWriteEmptyArray.mask) == 0) {
                        m14637(abstractC3730);
                    }
                }
                if (z4 && (strM6647 = abstractC3730.m6647(objArr, str)) != null) {
                    abstractC3730.mo6580(strM6647);
                } else if (!abstractC3730.f9516) {
                    abstractC3730.mo6559();
                    InterfaceC9352 interfaceC9352M14555 = null;
                    while (i2 < objArr.length) {
                        if (i2 != 0) {
                            abstractC3730.mo6542();
                        }
                        Object obj = objArr[i2];
                        if (obj == null) {
                            abstractC3730.mo6527();
                        } else {
                            Class<?> cls5 = obj.getClass();
                            if (cls5 != cls4) {
                                interfaceC9352M14555 = m14555(abstractC3730, cls5);
                                cls4 = cls5;
                            }
                            interfaceC9352M14555.m14655(abstractC3730, obj);
                        }
                        i2++;
                    }
                    abstractC3730.mo6555();
                } else {
                    Class<?> cls6 = objArr.getClass();
                    if (cls6 != cls3) {
                        abstractC3730.mo6602(AbstractC3700.m6503(cls6));
                    }
                    int length = objArr.length;
                    abstractC3730.mo6600(length);
                    InterfaceC9352 interfaceC9352 = null;
                    boolean z5 = z4;
                    while (i2 < length) {
                        boolean z6 = z5;
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            abstractC3730.mo6527();
                            z5 = z6;
                        } else {
                            Class<?> cls7 = obj2.getClass();
                            if (cls7 != cls4) {
                                boolean zM6632 = abstractC3730.m6632();
                                InterfaceC9352 interfaceC9352M145552 = m14555(abstractC3730, cls7);
                                if (zM6632) {
                                    zM6632 = !C9368.m14664(cls7);
                                }
                                z2 = zM6632;
                                interfaceC9352 = interfaceC9352M145552;
                                cls = cls7;
                            } else {
                                z2 = z6;
                                cls = cls4;
                            }
                            if (!z2 || (strM6641 = abstractC3730.m6641(i2, obj2)) == null) {
                                interfaceC9352.mo6238(abstractC3730, obj2, Integer.valueOf(i2), this.f23662, this.f23956);
                                if (z2) {
                                    abstractC3730.m6643(obj2);
                                }
                            } else {
                                abstractC3730.mo6580(strM6641);
                                abstractC3730.m6643(obj2);
                            }
                            z5 = z2;
                            cls4 = cls;
                        }
                        i2++;
                    }
                    if (z4) {
                        abstractC3730.m6643(objArr);
                    }
                }
                break;
            default:
                if (z) {
                    m14637(abstractC3730);
                }
                boolean zM66322 = abstractC3730.m6632();
                if (zM66322 && (strM66472 = abstractC3730.m6647(objArr, str)) != null) {
                    abstractC3730.mo6580(strM66472);
                } else {
                    boolean z7 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23956) != 0;
                    if (!abstractC3730.f9516) {
                        abstractC3730.mo6559();
                        InterfaceC9352 interfaceC9352M145553 = null;
                        while (i2 < objArr.length) {
                            if (i2 != 0) {
                                abstractC3730.mo6542();
                            }
                            Object obj3 = objArr[i2];
                            if (obj3 == null) {
                                abstractC3730.mo6527();
                            } else if (z7) {
                                abstractC3730.mo6577(obj3.toString());
                            } else {
                                Class<?> cls8 = obj3.getClass();
                                if (cls8 != cls4) {
                                    interfaceC9352M145553 = m14555(abstractC3730, cls8);
                                    cls4 = cls8;
                                }
                                interfaceC9352M145553.m14655(abstractC3730, obj3);
                            }
                            i2++;
                        }
                        abstractC3730.mo6555();
                    } else {
                        Class<?> cls9 = objArr.getClass();
                        if (cls9 != cls3) {
                            abstractC3730.mo6602(AbstractC3700.m6503(cls9));
                        }
                        int length2 = objArr.length;
                        abstractC3730.mo6600(length2);
                        InterfaceC9352 interfaceC93522 = null;
                        boolean z8 = zM66322;
                        while (i2 < length2) {
                            boolean z9 = z8;
                            Object obj4 = objArr[i2];
                            if (obj4 == null) {
                                abstractC3730.mo6527();
                                z8 = z9;
                            } else {
                                Class<?> cls10 = obj4.getClass();
                                if (cls10 != cls4) {
                                    boolean zM66323 = abstractC3730.m6632();
                                    InterfaceC9352 interfaceC9352M145554 = m14555(abstractC3730, cls10);
                                    if (zM66323) {
                                        zM66323 = !C9368.m14664(cls10);
                                    }
                                    z3 = zM66323;
                                    interfaceC93522 = interfaceC9352M145554;
                                    cls2 = cls10;
                                } else {
                                    z3 = z9;
                                    cls2 = cls4;
                                }
                                if (!z3 || (strM66412 = abstractC3730.m6641(i2, obj4)) == null) {
                                    interfaceC93522.mo6238(abstractC3730, obj4, Integer.valueOf(i2), this.f23662, this.f23956);
                                    if (z3) {
                                        abstractC3730.m6643(obj4);
                                    }
                                } else {
                                    abstractC3730.mo6580(strM66412);
                                    abstractC3730.m6643(obj4);
                                }
                                z8 = z3;
                                cls4 = cls2;
                            }
                            i2++;
                        }
                        if (zM66322) {
                            abstractC3730.m6643(objArr);
                        }
                    }
                }
                break;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23663) {
            case 0:
                Object[] objArr = (Object[]) mo14554(obj);
                if (objArr != null) {
                    m14556(abstractC3730, false, objArr);
                } else {
                    abstractC3730.mo6527();
                }
                break;
            default:
                Object[] objArr2 = (Object[]) mo14554(obj);
                if (objArr2 != null) {
                    m14556(abstractC3730, false, objArr2);
                } else {
                    abstractC3730.mo6527();
                }
                break;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        int i = this.f23663;
        long j = this.f23956;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) mo14554(obj);
                if (objArr != null) {
                    m14556(abstractC3730, true, objArr);
                } else if (((j | abstractC3730.f9523.f9498) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) != 0) {
                    m14637(abstractC3730);
                    abstractC3730.mo6599();
                }
                break;
            default:
                Object[] objArr2 = (Object[]) mo14554(obj);
                if (objArr2 != null) {
                    m14556(abstractC3730, true, objArr2);
                } else if (((j | abstractC3730.f9523.f9498) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) != 0) {
                    m14637(abstractC3730);
                    abstractC3730.mo6599();
                }
                break;
        }
        return false;
    }

    public C9246(String str, Class cls, int i, long j, String str2, String str3, Class cls2, Class cls3, Field field) {
        super(str, i, j, str2, null, str3, cls2, cls3, field, null);
        this.f23662 = cls;
        if (cls != null) {
            this.f23665 = cls;
        } else {
            this.f23665 = AbstractC3700.m6502(cls);
        }
    }
}
