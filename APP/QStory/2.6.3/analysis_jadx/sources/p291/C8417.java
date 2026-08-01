package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8417 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Type f23317;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23318 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC8523 f23319;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Class f23320;

    public C8417(String str, Class cls, int i, long j, String str2, String str3, Type type, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls2, field, method);
        this.f23317 = cls;
        if (cls != null) {
            this.f23320 = cls;
        } else {
            this.f23320 = AbstractC2867.m5942(cls);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        C8519 c8519;
        switch (this.f23318) {
            case 0:
                if (cls == String[].class) {
                    return C8447.f23382;
                }
                DecimalFormat decimalFormat = this.f23612;
                if (cls == Float[].class) {
                    if (decimalFormat == null) {
                        return C8519.f23690;
                    }
                    c8519 = new C8519(Float.class, decimalFormat);
                } else if (cls == Double[].class) {
                    if (decimalFormat == null) {
                        return C8519.f23691;
                    }
                    c8519 = new C8519(Double.class, decimalFormat);
                } else {
                    if (cls != BigDecimal[].class) {
                        return abstractC2897.m6077(cls);
                    }
                    if (decimalFormat == null) {
                        return C8519.f23692;
                    }
                    c8519 = new C8519(BigDecimal.class, decimalFormat);
                }
                return c8519;
            default:
                return super.mo13994(abstractC2897, cls);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object mo13995(Object obj) {
        switch (this.f23318) {
            case 1:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2942.m6401("field.get error, ", this.f23618, e);
                    return null;
                }
            default:
                return super.mo13995(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8523 m13996(AbstractC2897 abstractC2897, Class cls) {
        int i = this.f23318;
        Class cls2 = this.f23320;
        DecimalFormat decimalFormat = this.f23612;
        Type type = this.f23317;
        switch (i) {
            case 0:
                if (cls != type) {
                    return abstractC2897.m6080(AbstractC2867.m5944(cls), cls);
                }
                InterfaceC8523 interfaceC8523 = this.f23319;
                if (interfaceC8523 != null) {
                    return interfaceC8523;
                }
                String str = this.f23614;
                if (cls == Double.class) {
                    this.f23319 = new C8475(new DecimalFormat(str), 0);
                } else if (cls == Float.class) {
                    this.f23319 = new C8475(new DecimalFormat(str), 1);
                } else if (cls != BigDecimal.class || decimalFormat == null) {
                    this.f23319 = abstractC2897.m6080(cls2, type);
                } else {
                    this.f23319 = new C8486(decimalFormat, 0, null);
                }
                return this.f23319;
            default:
                if (cls != type) {
                    return abstractC2897.m6080(null, cls);
                }
                InterfaceC8523 interfaceC85232 = this.f23319;
                if (interfaceC85232 != null) {
                    return interfaceC85232;
                }
                if (cls == Float[].class) {
                    return decimalFormat != null ? new C8519(Float.class, decimalFormat) : C8519.f23690;
                }
                if (cls == Double[].class) {
                    return decimalFormat != null ? new C8519(Double.class, decimalFormat) : C8519.f23691;
                }
                if (cls == BigDecimal[].class) {
                    return decimalFormat != null ? new C8519(BigDecimal.class, decimalFormat) : C8519.f23692;
                }
                if (cls == Float.class) {
                    return decimalFormat != null ? new C8475(decimalFormat, 1) : C8475.f23511;
                }
                if (cls == Double.class) {
                    return decimalFormat != null ? new C8475(decimalFormat, 0) : C8475.f23512;
                }
                if (cls == BigDecimal.class) {
                    return decimalFormat != null ? new C8486(decimalFormat, 0, null) : C8486.f23560;
                }
                InterfaceC8523 interfaceC8523M6080 = abstractC2897.m6080(cls2, type);
                this.f23319 = interfaceC8523M6080;
                return interfaceC8523M6080;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13997(AbstractC2897 abstractC2897, boolean z, Object[] objArr) {
        boolean z2;
        Class<?> cls;
        String strM6081;
        String strM6087;
        boolean z3;
        Class<?> cls2;
        String strM60812;
        String strM60872;
        int i = this.f23318;
        Class<?> cls3 = this.f23617;
        String str = this.f23618;
        Class<?> cls4 = null;
        int i2 = 0;
        switch (i) {
            case 0:
                long j = abstractC2897.f9178.f9153;
                boolean z4 = (JSONWriter$Feature.ReferenceDetection.mask & j) != 0;
                if (z) {
                    if (objArr.length != 0 || (j & JSONWriter$Feature.NotWriteEmptyArray.mask) == 0) {
                        m14078(abstractC2897);
                    }
                }
                if (z4 && (strM6087 = abstractC2897.m6087(objArr, str)) != null) {
                    abstractC2897.mo6020(strM6087);
                } else if (!abstractC2897.f9171) {
                    abstractC2897.mo5999();
                    InterfaceC8523 interfaceC8523M13996 = null;
                    while (i2 < objArr.length) {
                        if (i2 != 0) {
                            abstractC2897.mo5982();
                        }
                        Object obj = objArr[i2];
                        if (obj == null) {
                            abstractC2897.mo5967();
                        } else {
                            Class<?> cls5 = obj.getClass();
                            if (cls5 != cls4) {
                                interfaceC8523M13996 = m13996(abstractC2897, cls5);
                                cls4 = cls5;
                            }
                            interfaceC8523M13996.m14096(abstractC2897, obj);
                        }
                        i2++;
                    }
                    abstractC2897.mo5995();
                } else {
                    Class<?> cls6 = objArr.getClass();
                    if (cls6 != cls3) {
                        abstractC2897.mo6042(AbstractC2867.m5943(cls6));
                    }
                    int length = objArr.length;
                    abstractC2897.mo6040(length);
                    InterfaceC8523 interfaceC8523 = null;
                    boolean z5 = z4;
                    while (i2 < length) {
                        boolean z6 = z5;
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            abstractC2897.mo5967();
                            z5 = z6;
                        } else {
                            Class<?> cls7 = obj2.getClass();
                            if (cls7 != cls4) {
                                boolean zM6072 = abstractC2897.m6072();
                                InterfaceC8523 interfaceC8523M139962 = m13996(abstractC2897, cls7);
                                if (zM6072) {
                                    zM6072 = !C8539.m14105(cls7);
                                }
                                z2 = zM6072;
                                interfaceC8523 = interfaceC8523M139962;
                                cls = cls7;
                            } else {
                                z2 = z6;
                                cls = cls4;
                            }
                            if (!z2 || (strM6081 = abstractC2897.m6081(i2, obj2)) == null) {
                                interfaceC8523.mo5678(abstractC2897, obj2, Integer.valueOf(i2), this.f23317, this.f23611);
                                if (z2) {
                                    abstractC2897.m6083(obj2);
                                }
                            } else {
                                abstractC2897.mo6020(strM6081);
                                abstractC2897.m6083(obj2);
                            }
                            z5 = z2;
                            cls4 = cls;
                        }
                        i2++;
                    }
                    if (z4) {
                        abstractC2897.m6083(objArr);
                    }
                }
                break;
            default:
                if (z) {
                    m14078(abstractC2897);
                }
                boolean zM60722 = abstractC2897.m6072();
                if (zM60722 && (strM60872 = abstractC2897.m6087(objArr, str)) != null) {
                    abstractC2897.mo6020(strM60872);
                } else {
                    boolean z7 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23611) != 0;
                    if (!abstractC2897.f9171) {
                        abstractC2897.mo5999();
                        InterfaceC8523 interfaceC8523M139963 = null;
                        while (i2 < objArr.length) {
                            if (i2 != 0) {
                                abstractC2897.mo5982();
                            }
                            Object obj3 = objArr[i2];
                            if (obj3 == null) {
                                abstractC2897.mo5967();
                            } else if (z7) {
                                abstractC2897.mo6017(obj3.toString());
                            } else {
                                Class<?> cls8 = obj3.getClass();
                                if (cls8 != cls4) {
                                    interfaceC8523M139963 = m13996(abstractC2897, cls8);
                                    cls4 = cls8;
                                }
                                interfaceC8523M139963.m14096(abstractC2897, obj3);
                            }
                            i2++;
                        }
                        abstractC2897.mo5995();
                    } else {
                        Class<?> cls9 = objArr.getClass();
                        if (cls9 != cls3) {
                            abstractC2897.mo6042(AbstractC2867.m5943(cls9));
                        }
                        int length2 = objArr.length;
                        abstractC2897.mo6040(length2);
                        InterfaceC8523 interfaceC85232 = null;
                        boolean z8 = zM60722;
                        while (i2 < length2) {
                            boolean z9 = z8;
                            Object obj4 = objArr[i2];
                            if (obj4 == null) {
                                abstractC2897.mo5967();
                                z8 = z9;
                            } else {
                                Class<?> cls10 = obj4.getClass();
                                if (cls10 != cls4) {
                                    boolean zM60723 = abstractC2897.m6072();
                                    InterfaceC8523 interfaceC8523M139964 = m13996(abstractC2897, cls10);
                                    if (zM60723) {
                                        zM60723 = !C8539.m14105(cls10);
                                    }
                                    z3 = zM60723;
                                    interfaceC85232 = interfaceC8523M139964;
                                    cls2 = cls10;
                                } else {
                                    z3 = z9;
                                    cls2 = cls4;
                                }
                                if (!z3 || (strM60812 = abstractC2897.m6081(i2, obj4)) == null) {
                                    interfaceC85232.mo5678(abstractC2897, obj4, Integer.valueOf(i2), this.f23317, this.f23611);
                                    if (z3) {
                                        abstractC2897.m6083(obj4);
                                    }
                                } else {
                                    abstractC2897.mo6020(strM60812);
                                    abstractC2897.m6083(obj4);
                                }
                                z8 = z3;
                                cls4 = cls2;
                            }
                            i2++;
                        }
                        if (zM60722) {
                            abstractC2897.m6083(objArr);
                        }
                    }
                }
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23318) {
            case 0:
                Object[] objArr = (Object[]) mo13995(obj);
                if (objArr != null) {
                    m13997(abstractC2897, false, objArr);
                } else {
                    abstractC2897.mo5967();
                }
                break;
            default:
                Object[] objArr2 = (Object[]) mo13995(obj);
                if (objArr2 != null) {
                    m13997(abstractC2897, false, objArr2);
                } else {
                    abstractC2897.mo5967();
                }
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        int i = this.f23318;
        long j = this.f23611;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) mo13995(obj);
                if (objArr != null) {
                    m13997(abstractC2897, true, objArr);
                } else if (((j | abstractC2897.f9178.f9153) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) != 0) {
                    m14078(abstractC2897);
                    abstractC2897.mo6039();
                }
                break;
            default:
                Object[] objArr2 = (Object[]) mo13995(obj);
                if (objArr2 != null) {
                    m13997(abstractC2897, true, objArr2);
                } else if (((j | abstractC2897.f9178.f9153) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask)) != 0) {
                    m14078(abstractC2897);
                    abstractC2897.mo6039();
                }
                break;
        }
        return false;
    }

    public C8417(String str, Class cls, int i, long j, String str2, String str3, Class cls2, Class cls3, Field field) {
        super(str, i, j, str2, null, str3, cls2, cls3, field, null);
        this.f23317 = cls;
        if (cls != null) {
            this.f23320 = cls;
        } else {
            this.f23320 = AbstractC2867.m5942(cls);
        }
    }
}
