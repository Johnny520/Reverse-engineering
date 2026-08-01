package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8425 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Type f23326;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23327 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC8531 f23328;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Class f23329;

    public C8425(String str, Class cls, int i, long j, String str2, String str3, Type type, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls2, field, method);
        this.f23326 = cls;
        if (cls != null) {
            this.f23329 = cls;
        } else {
            this.f23329 = AbstractC2866.m5897(cls);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        C8527 c8527;
        switch (this.f23327) {
            case 0:
                if (cls == String[].class) {
                    return C8455.f23391;
                }
                DecimalFormat decimalFormat = this.f23621;
                if (cls == Float[].class) {
                    if (decimalFormat == null) {
                        return C8527.f23699;
                    }
                    c8527 = new C8527(Float.class, decimalFormat);
                } else if (cls == Double[].class) {
                    if (decimalFormat == null) {
                        return C8527.f23700;
                    }
                    c8527 = new C8527(Double.class, decimalFormat);
                } else {
                    if (cls != BigDecimal[].class) {
                        return abstractC2896.m6031(cls);
                    }
                    if (decimalFormat == null) {
                        return C8527.f23701;
                    }
                    c8527 = new C8527(BigDecimal.class, decimalFormat);
                }
                return c8527;
            default:
                return super.mo13975(abstractC2896, cls);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object mo13976(Object obj) {
        switch (this.f23327) {
            case 1:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2941.m6343("field.get error, ", this.f23627, e);
                    return null;
                }
            default:
                return super.mo13976(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8531 m13977(AbstractC2896 abstractC2896, Class cls) {
        int i = this.f23327;
        Class cls2 = this.f23329;
        DecimalFormat decimalFormat = this.f23621;
        Type type = this.f23326;
        switch (i) {
            case 0:
                if (cls != type) {
                    return abstractC2896.m6034(AbstractC2866.m5899(cls), cls);
                }
                InterfaceC8531 interfaceC8531 = this.f23328;
                if (interfaceC8531 != null) {
                    return interfaceC8531;
                }
                String str = this.f23623;
                if (cls == Double.class) {
                    this.f23328 = new C8483(new DecimalFormat(str), 0);
                } else if (cls == Float.class) {
                    this.f23328 = new C8483(new DecimalFormat(str), 1);
                } else if (cls != BigDecimal.class || decimalFormat == null) {
                    this.f23328 = abstractC2896.m6034(cls2, type);
                } else {
                    this.f23328 = new C8494(decimalFormat, 0, null);
                }
                return this.f23328;
            default:
                if (cls != type) {
                    return abstractC2896.m6034(null, cls);
                }
                InterfaceC8531 interfaceC85312 = this.f23328;
                if (interfaceC85312 != null) {
                    return interfaceC85312;
                }
                if (cls == Float[].class) {
                    return decimalFormat != null ? new C8527(Float.class, decimalFormat) : C8527.f23699;
                }
                if (cls == Double[].class) {
                    return decimalFormat != null ? new C8527(Double.class, decimalFormat) : C8527.f23700;
                }
                if (cls == BigDecimal[].class) {
                    return decimalFormat != null ? new C8527(BigDecimal.class, decimalFormat) : C8527.f23701;
                }
                if (cls == Float.class) {
                    return decimalFormat != null ? new C8483(decimalFormat, 1) : C8483.f23520;
                }
                if (cls == Double.class) {
                    return decimalFormat != null ? new C8483(decimalFormat, 0) : C8483.f23521;
                }
                if (cls == BigDecimal.class) {
                    return decimalFormat != null ? new C8494(decimalFormat, 0, null) : C8494.f23569;
                }
                InterfaceC8531 interfaceC8531M6034 = abstractC2896.m6034(cls2, type);
                this.f23328 = interfaceC8531M6034;
                return interfaceC8531M6034;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13978(AbstractC2896 abstractC2896, boolean z, Object[] objArr) {
        boolean z2;
        Class<?> cls;
        String strM6035;
        String strM6041;
        boolean z3;
        Class<?> cls2;
        String strM60352;
        String strM60412;
        int i = this.f23327;
        Class<?> cls3 = this.f23626;
        String str = this.f23627;
        Class<?> cls4 = null;
        int i2 = 0;
        switch (i) {
            case 0:
                long j = abstractC2896.f9176.f9151;
                boolean z4 = (JSONWriter$Feature.ReferenceDetection.mask & j) != 0;
                if (z) {
                    if (objArr.length != 0 || (j & JSONWriter$Feature.NotWriteEmptyArray.mask) == 0) {
                        m14059(abstractC2896);
                    }
                }
                if (z4 && (strM6041 = abstractC2896.m6041(objArr, str)) != null) {
                    abstractC2896.mo5975(strM6041);
                } else if (!abstractC2896.f9169) {
                    abstractC2896.mo5954();
                    InterfaceC8531 interfaceC8531M13977 = null;
                    while (i2 < objArr.length) {
                        if (i2 != 0) {
                            abstractC2896.mo5937();
                        }
                        Object obj = objArr[i2];
                        if (obj == null) {
                            abstractC2896.mo5922();
                        } else {
                            Class<?> cls5 = obj.getClass();
                            if (cls5 != cls4) {
                                interfaceC8531M13977 = m13977(abstractC2896, cls5);
                                cls4 = cls5;
                            }
                            interfaceC8531M13977.m14077(abstractC2896, obj);
                        }
                        i2++;
                    }
                    abstractC2896.mo5950();
                } else {
                    Class<?> cls6 = objArr.getClass();
                    if (cls6 != cls3) {
                        abstractC2896.mo5997(AbstractC2866.m5898(cls6));
                    }
                    int length = objArr.length;
                    abstractC2896.mo5995(length);
                    InterfaceC8531 interfaceC8531 = null;
                    boolean z5 = z4;
                    while (i2 < length) {
                        boolean z6 = z5;
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            abstractC2896.mo5922();
                            z5 = z6;
                        } else {
                            Class<?> cls7 = obj2.getClass();
                            if (cls7 != cls4) {
                                boolean zM6028 = abstractC2896.m6028();
                                InterfaceC8531 interfaceC8531M139772 = m13977(abstractC2896, cls7);
                                if (zM6028) {
                                    zM6028 = !C8547.m14086(cls7);
                                }
                                z2 = zM6028;
                                interfaceC8531 = interfaceC8531M139772;
                                cls = cls7;
                            } else {
                                z2 = z6;
                                cls = cls4;
                            }
                            if (!z2 || (strM6035 = abstractC2896.m6035(i2, obj2)) == null) {
                                interfaceC8531.mo5633(abstractC2896, obj2, Integer.valueOf(i2), this.f23326, this.f23620);
                                if (z2) {
                                    abstractC2896.m6037(obj2);
                                }
                            } else {
                                abstractC2896.mo5975(strM6035);
                                abstractC2896.m6037(obj2);
                            }
                            z5 = z2;
                            cls4 = cls;
                        }
                        i2++;
                    }
                    if (z4) {
                        abstractC2896.m6037(objArr);
                    }
                }
                break;
            default:
                if (z) {
                    m14059(abstractC2896);
                }
                boolean zM60282 = abstractC2896.m6028();
                if (zM60282 && (strM60412 = abstractC2896.m6041(objArr, str)) != null) {
                    abstractC2896.mo5975(strM60412);
                } else {
                    boolean z7 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23620) != 0;
                    if (!abstractC2896.f9169) {
                        abstractC2896.mo5954();
                        InterfaceC8531 interfaceC8531M139773 = null;
                        while (i2 < objArr.length) {
                            if (i2 != 0) {
                                abstractC2896.mo5937();
                            }
                            Object obj3 = objArr[i2];
                            if (obj3 == null) {
                                abstractC2896.mo5922();
                            } else if (z7) {
                                abstractC2896.mo5972(obj3.toString());
                            } else {
                                Class<?> cls8 = obj3.getClass();
                                if (cls8 != cls4) {
                                    interfaceC8531M139773 = m13977(abstractC2896, cls8);
                                    cls4 = cls8;
                                }
                                interfaceC8531M139773.m14077(abstractC2896, obj3);
                            }
                            i2++;
                        }
                        abstractC2896.mo5950();
                    } else {
                        Class<?> cls9 = objArr.getClass();
                        if (cls9 != cls3) {
                            abstractC2896.mo5997(AbstractC2866.m5898(cls9));
                        }
                        int length2 = objArr.length;
                        abstractC2896.mo5995(length2);
                        InterfaceC8531 interfaceC85312 = null;
                        boolean z8 = zM60282;
                        while (i2 < length2) {
                            boolean z9 = z8;
                            Object obj4 = objArr[i2];
                            if (obj4 == null) {
                                abstractC2896.mo5922();
                                z8 = z9;
                            } else {
                                Class<?> cls10 = obj4.getClass();
                                if (cls10 != cls4) {
                                    boolean zM60283 = abstractC2896.m6028();
                                    InterfaceC8531 interfaceC8531M139774 = m13977(abstractC2896, cls10);
                                    if (zM60283) {
                                        zM60283 = !C8547.m14086(cls10);
                                    }
                                    z3 = zM60283;
                                    interfaceC85312 = interfaceC8531M139774;
                                    cls2 = cls10;
                                } else {
                                    z3 = z9;
                                    cls2 = cls4;
                                }
                                if (!z3 || (strM60352 = abstractC2896.m6035(i2, obj4)) == null) {
                                    interfaceC85312.mo5633(abstractC2896, obj4, Integer.valueOf(i2), this.f23326, this.f23620);
                                    if (z3) {
                                        abstractC2896.m6037(obj4);
                                    }
                                } else {
                                    abstractC2896.mo5975(strM60352);
                                    abstractC2896.m6037(obj4);
                                }
                                z8 = z3;
                                cls4 = cls2;
                            }
                            i2++;
                        }
                        if (zM60282) {
                            abstractC2896.m6037(objArr);
                        }
                    }
                }
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23327) {
            case 0:
                Object[] objArr = (Object[]) mo13976(obj);
                if (objArr != null) {
                    m13978(abstractC2896, false, objArr);
                } else {
                    abstractC2896.mo5922();
                }
                break;
            default:
                Object[] objArr2 = (Object[]) mo13976(obj);
                if (objArr2 != null) {
                    m13978(abstractC2896, false, objArr2);
                } else {
                    abstractC2896.mo5922();
                }
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        int i = this.f23327;
        long j = this.f23620;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) mo13976(obj);
                if (objArr != null) {
                    m13978(abstractC2896, true, objArr);
                } else if (((j | abstractC2896.f9176.f9151) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) != 0) {
                    m14059(abstractC2896);
                    abstractC2896.mo5994();
                }
                break;
            default:
                Object[] objArr2 = (Object[]) mo13976(obj);
                if (objArr2 != null) {
                    m13978(abstractC2896, true, objArr2);
                } else if (((j | abstractC2896.f9176.f9151) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) != 0) {
                    m14059(abstractC2896);
                    abstractC2896.mo5994();
                }
                break;
        }
        return false;
    }

    public C8425(String str, Class cls, int i, long j, String str2, String str3, Class cls2, Class cls3, Field field) {
        super(str, i, j, str2, null, str3, cls2, cls3, field, null);
        this.f23326 = cls;
        if (cls != null) {
            this.f23329 = cls;
        } else {
            this.f23329 = AbstractC2866.m5897(cls);
        }
    }
}
