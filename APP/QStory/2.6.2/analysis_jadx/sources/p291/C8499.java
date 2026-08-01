package p291;

import com.alibaba.fastjson2.AbstractC2896;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8499 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Object f23597;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23598;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8499(String str, int i, long j, String str2, String str3, Field field, Method method, Function function, int i2) {
        super(str, i, j, str2, null, str3, Double.class, Double.class, field, method);
        this.f23598 = i2;
        switch (i2) {
            case 3:
                super(str, i, j, str2, null, str3, Float.class, Float.class, field, method);
                this.f23597 = function;
                break;
            default:
                this.f23597 = function;
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo13981() {
        switch (this.f23598) {
            case 0:
                return (Function) this.f23597;
            case 1:
                return (Function) this.f23597;
            case 2:
                return (Function) this.f23597;
            case 3:
                return (Function) this.f23597;
            default:
                return super.mo13981();
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        int i = this.f23598;
        Object obj2 = this.f23597;
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

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        int i = this.f23598;
        long j = this.f23620;
        DecimalFormat decimalFormat = this.f23621;
        Object obj2 = this.f23597;
        switch (i) {
            case 0:
                abstractC2896.mo5945((BigDecimal) ((Function) obj2).apply(obj), j, decimalFormat);
                break;
            case 1:
                abstractC2896.mo5942((BigInteger) ((Function) obj2).apply(obj), j);
                break;
            case 2:
                Double d = (Double) ((Function) obj2).apply(obj);
                if (d != null) {
                    double dDoubleValue = d.doubleValue();
                    if (decimalFormat == null) {
                        abstractC2896.mo5946(dDoubleValue);
                    } else {
                        abstractC2896.m6024(dDoubleValue, decimalFormat);
                    }
                } else {
                    abstractC2896.m6019();
                }
                break;
            case 3:
                Float f = (Float) ((Function) obj2).apply(obj);
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    if (decimalFormat == null) {
                        abstractC2896.mo5938(fFloatValue);
                    } else {
                        abstractC2896.m6021(fFloatValue, decimalFormat);
                    }
                } else {
                    abstractC2896.m6019();
                }
                break;
            case 4:
                List list = (List) ((Function) obj2).apply(obj);
                if (list != null) {
                    int i2 = 0;
                    if (!abstractC2896.f9169) {
                        abstractC2896.mo5954();
                        while (i2 < list.size()) {
                            if (i2 != 0) {
                                abstractC2896.mo5937();
                            }
                            String str = (String) list.get(i2);
                            if (str == null) {
                                abstractC2896.mo5922();
                            } else {
                                abstractC2896.mo5972(str);
                            }
                            i2++;
                        }
                        abstractC2896.mo5950();
                    } else {
                        int size = list.size();
                        abstractC2896.mo5995(size);
                        while (i2 < size) {
                            String str2 = (String) list.get(i2);
                            if (str2 == null) {
                                abstractC2896.mo5922();
                            } else {
                                abstractC2896.mo5972(str2);
                            }
                            i2++;
                        }
                    }
                } else {
                    abstractC2896.mo5922();
                }
                break;
            default:
                double dApplyAsDouble = ((ToDoubleFunction) obj2).applyAsDouble(obj);
                if (decimalFormat == null) {
                    abstractC2896.mo5946(dApplyAsDouble);
                } else {
                    abstractC2896.m6024(dApplyAsDouble, decimalFormat);
                }
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        int i = this.f23598;
        long j = this.f23620;
        DecimalFormat decimalFormat = this.f23621;
        int i2 = 0;
        Object obj2 = this.f23597;
        switch (i) {
            case 0:
                try {
                    BigDecimal bigDecimal = (BigDecimal) ((Function) obj2).apply(obj);
                    if (bigDecimal == null) {
                        return m14058(abstractC2896);
                    }
                    m14059(abstractC2896);
                    abstractC2896.mo5945(bigDecimal, j, decimalFormat);
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e;
                }
            case 1:
                BigInteger bigInteger = (BigInteger) ((Function) obj2).apply(obj);
                if (bigInteger == null) {
                    if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask) & (abstractC2896.f9176.f9151 | j)) == 0) {
                        return false;
                    }
                }
                m14059(abstractC2896);
                abstractC2896.mo5942(bigInteger, j);
                return true;
            case 2:
                try {
                    Double d = (Double) ((Function) obj2).apply(obj);
                    if (d == null) {
                        return m14058(abstractC2896);
                    }
                    m14059(abstractC2896);
                    double dDoubleValue = d.doubleValue();
                    if (decimalFormat != null) {
                        abstractC2896.m6024(dDoubleValue, decimalFormat);
                    } else {
                        abstractC2896.mo5946(dDoubleValue);
                    }
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e2;
                }
            case 3:
                try {
                    Float f = (Float) ((Function) obj2).apply(obj);
                    if (f == null) {
                        return m14058(abstractC2896);
                    }
                    m14059(abstractC2896);
                    float fFloatValue = f.floatValue();
                    if (decimalFormat != null) {
                        abstractC2896.m6021(fFloatValue, decimalFormat);
                    } else {
                        abstractC2896.mo5938(fFloatValue);
                    }
                    return true;
                } catch (RuntimeException e3) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e3;
                }
            case 4:
                try {
                    List list = (List) ((Function) obj2).apply(obj);
                    long j2 = j | abstractC2896.f9176.f9151;
                    if (list == null) {
                        if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j2) == 0) {
                            return false;
                        }
                        m14059(abstractC2896);
                        abstractC2896.mo5993(j2);
                    } else {
                        if ((j2 & JSONWriter$Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                            return false;
                        }
                        m14059(abstractC2896);
                        if (abstractC2896.f9169) {
                            int size = list.size();
                            abstractC2896.mo5995(size);
                            while (i2 < size) {
                                String str = (String) list.get(i2);
                                if (str == null) {
                                    abstractC2896.mo5922();
                                } else {
                                    abstractC2896.mo5972(str);
                                }
                                i2++;
                            }
                        } else {
                            abstractC2896.mo5954();
                            while (i2 < list.size()) {
                                if (i2 != 0) {
                                    abstractC2896.mo5937();
                                }
                                String str2 = (String) list.get(i2);
                                if (str2 == null) {
                                    abstractC2896.mo5922();
                                } else {
                                    abstractC2896.mo5972(str2);
                                }
                                i2++;
                            }
                            abstractC2896.mo5950();
                        }
                    }
                    return true;
                } catch (RuntimeException e4) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e4;
                }
            default:
                try {
                    double dApplyAsDouble = ((ToDoubleFunction) obj2).applyAsDouble(obj);
                    m14059(abstractC2896);
                    if (decimalFormat != null) {
                        abstractC2896.m6024(dApplyAsDouble, decimalFormat);
                    } else {
                        abstractC2896.mo5946(dApplyAsDouble);
                    }
                    return true;
                } catch (RuntimeException e5) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e5;
                }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8499(String str, int i, long j, String str2, String str3, Field field, Method method, ToDoubleFunction toDoubleFunction) {
        this.f23598 = 5;
        Class cls = Double.TYPE;
        super(str, i, j, str2, null, str3, cls, cls, field, method);
        this.f23597 = toDoubleFunction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8499(String str, int i, long j, String str2, String str3, Method method, Function function, int i2) {
        super(str, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, null, method);
        this.f23598 = i2;
        switch (i2) {
            case 1:
                super(str, i, j, str2, null, str3, BigInteger.class, BigInteger.class, null, method);
                this.f23597 = function;
                break;
            default:
                this.f23597 = function;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8499(int i, long j, Class cls, String str, String str2, String str3, Field field, Method method, Type type, Function function) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        this.f23598 = 4;
        this.f23597 = function;
    }
}
