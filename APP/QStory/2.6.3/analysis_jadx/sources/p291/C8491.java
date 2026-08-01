package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8491 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Object f23588;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23589;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8491(String str, int i, long j, String str2, String str3, Field field, Method method, Function function, int i2) {
        super(str, i, j, str2, null, str3, Double.class, Double.class, field, method);
        this.f23589 = i2;
        switch (i2) {
            case 3:
                super(str, i, j, str2, null, str3, Float.class, Float.class, field, method);
                this.f23588 = function;
                break;
            default:
                this.f23588 = function;
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14000() {
        switch (this.f23589) {
            case 0:
                return (Function) this.f23588;
            case 1:
                return (Function) this.f23588;
            case 2:
                return (Function) this.f23588;
            case 3:
                return (Function) this.f23588;
            default:
                return super.mo14000();
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        int i = this.f23589;
        Object obj2 = this.f23588;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            case 1:
                return ((Function) obj2).apply(obj);
            case 2:
                return ((Function) obj2).apply(obj);
            case 3:
                return ((Function) obj2).apply(obj);
            case 4:
                return ((Function) obj2).apply(obj);
            default:
                return Double.valueOf(((ToDoubleFunction) obj2).applyAsDouble(obj));
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        int i = this.f23589;
        long j = this.f23611;
        DecimalFormat decimalFormat = this.f23612;
        Object obj2 = this.f23588;
        switch (i) {
            case 0:
                abstractC2897.mo5990((BigDecimal) ((Function) obj2).apply(obj), j, decimalFormat);
                break;
            case 1:
                abstractC2897.mo5987((BigInteger) ((Function) obj2).apply(obj), j);
                break;
            case 2:
                Double d = (Double) ((Function) obj2).apply(obj);
                if (d != null) {
                    double dDoubleValue = d.doubleValue();
                    if (decimalFormat == null) {
                        abstractC2897.mo5991(dDoubleValue);
                    } else {
                        abstractC2897.m6070(dDoubleValue, decimalFormat);
                    }
                } else {
                    abstractC2897.m6065();
                }
                break;
            case 3:
                Float f = (Float) ((Function) obj2).apply(obj);
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    if (decimalFormat == null) {
                        abstractC2897.mo5983(fFloatValue);
                    } else {
                        abstractC2897.m6067(fFloatValue, decimalFormat);
                    }
                } else {
                    abstractC2897.m6065();
                }
                break;
            case 4:
                List list = (List) ((Function) obj2).apply(obj);
                if (list != null) {
                    int i2 = 0;
                    if (!abstractC2897.f9171) {
                        abstractC2897.mo5999();
                        while (i2 < list.size()) {
                            if (i2 != 0) {
                                abstractC2897.mo5982();
                            }
                            String str = (String) list.get(i2);
                            if (str == null) {
                                abstractC2897.mo5967();
                            } else {
                                abstractC2897.mo6017(str);
                            }
                            i2++;
                        }
                        abstractC2897.mo5995();
                    } else {
                        int size = list.size();
                        abstractC2897.mo6040(size);
                        while (i2 < size) {
                            String str2 = (String) list.get(i2);
                            if (str2 == null) {
                                abstractC2897.mo5967();
                            } else {
                                abstractC2897.mo6017(str2);
                            }
                            i2++;
                        }
                    }
                } else {
                    abstractC2897.mo5967();
                }
                break;
            default:
                double dApplyAsDouble = ((ToDoubleFunction) obj2).applyAsDouble(obj);
                if (decimalFormat == null) {
                    abstractC2897.mo5991(dApplyAsDouble);
                } else {
                    abstractC2897.m6070(dApplyAsDouble, decimalFormat);
                }
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        int i = this.f23589;
        long j = this.f23611;
        DecimalFormat decimalFormat = this.f23612;
        int i2 = 0;
        Object obj2 = this.f23588;
        switch (i) {
            case 0:
                try {
                    BigDecimal bigDecimal = (BigDecimal) ((Function) obj2).apply(obj);
                    if (bigDecimal == null) {
                        return m14077(abstractC2897);
                    }
                    m14078(abstractC2897);
                    abstractC2897.mo5990(bigDecimal, j, decimalFormat);
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e;
                }
            case 1:
                BigInteger bigInteger = (BigInteger) ((Function) obj2).apply(obj);
                if (bigInteger == null) {
                    if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask) & (abstractC2897.f9178.f9153 | j)) == 0) {
                        return false;
                    }
                }
                m14078(abstractC2897);
                abstractC2897.mo5987(bigInteger, j);
                return true;
            case 2:
                try {
                    Double d = (Double) ((Function) obj2).apply(obj);
                    if (d == null) {
                        return m14077(abstractC2897);
                    }
                    m14078(abstractC2897);
                    double dDoubleValue = d.doubleValue();
                    if (decimalFormat != null) {
                        abstractC2897.m6070(dDoubleValue, decimalFormat);
                    } else {
                        abstractC2897.mo5991(dDoubleValue);
                    }
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e2;
                }
            case 3:
                try {
                    Float f = (Float) ((Function) obj2).apply(obj);
                    if (f == null) {
                        return m14077(abstractC2897);
                    }
                    m14078(abstractC2897);
                    float fFloatValue = f.floatValue();
                    if (decimalFormat != null) {
                        abstractC2897.m6067(fFloatValue, decimalFormat);
                    } else {
                        abstractC2897.mo5983(fFloatValue);
                    }
                    return true;
                } catch (RuntimeException e3) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e3;
                }
            case 4:
                try {
                    List list = (List) ((Function) obj2).apply(obj);
                    long j2 = j | abstractC2897.f9178.f9153;
                    if (list == null) {
                        if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j2) == 0) {
                            return false;
                        }
                        m14078(abstractC2897);
                        abstractC2897.mo6038(j2);
                    } else {
                        if ((j2 & JSONWriter$Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                            return false;
                        }
                        m14078(abstractC2897);
                        if (abstractC2897.f9171) {
                            int size = list.size();
                            abstractC2897.mo6040(size);
                            while (i2 < size) {
                                String str = (String) list.get(i2);
                                if (str == null) {
                                    abstractC2897.mo5967();
                                } else {
                                    abstractC2897.mo6017(str);
                                }
                                i2++;
                            }
                        } else {
                            abstractC2897.mo5999();
                            while (i2 < list.size()) {
                                if (i2 != 0) {
                                    abstractC2897.mo5982();
                                }
                                String str2 = (String) list.get(i2);
                                if (str2 == null) {
                                    abstractC2897.mo5967();
                                } else {
                                    abstractC2897.mo6017(str2);
                                }
                                i2++;
                            }
                            abstractC2897.mo5995();
                        }
                    }
                    return true;
                } catch (RuntimeException e4) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e4;
                }
            default:
                try {
                    double dApplyAsDouble = ((ToDoubleFunction) obj2).applyAsDouble(obj);
                    m14078(abstractC2897);
                    if (decimalFormat != null) {
                        abstractC2897.m6070(dApplyAsDouble, decimalFormat);
                    } else {
                        abstractC2897.mo5991(dApplyAsDouble);
                    }
                    return true;
                } catch (RuntimeException e5) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e5;
                }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8491(String str, int i, long j, String str2, String str3, Field field, Method method, ToDoubleFunction toDoubleFunction) {
        this.f23589 = 5;
        Class cls = Double.TYPE;
        super(str, i, j, str2, null, str3, cls, cls, field, method);
        this.f23588 = toDoubleFunction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8491(String str, int i, long j, String str2, String str3, Method method, Function function, int i2) {
        super(str, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, null, method);
        this.f23589 = i2;
        switch (i2) {
            case 1:
                super(str, i, j, str2, null, str3, BigInteger.class, BigInteger.class, null, method);
                this.f23588 = function;
                break;
            default:
                this.f23588 = function;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8491(int i, long j, Class cls, String str, String str2, String str3, Field field, Method method, Type type, Function function) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        this.f23589 = 4;
        this.f23588 = function;
    }
}
