package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8492 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23590;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8492(String str, int i, long j, String str2, String str3, Field field, int i2) {
        super(str, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, field, null);
        this.f23590 = i2;
        switch (i2) {
            case 2:
                super(str, i, j, str2, null, str3, BigInteger.class, BigInteger.class, field, null);
                break;
            case 8:
                super(str, i, j, str2, null, str3, String.class, String.class, field, null);
                break;
            default:
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo13995(Object obj) {
        switch (this.f23590) {
            case 1:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e);
                    return null;
                }
            case 2:
            case 8:
            default:
                return super.mo13995(obj);
            case 3:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e2);
                    return null;
                }
            case 4:
                throw null;
            case 5:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e3);
                    return null;
                }
            case 6:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e4) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e4);
                    return null;
                }
            case 7:
                throw null;
            case 9:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e5);
                    return null;
                }
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        int i = this.f23590;
        boolean z = this.f23604;
        boolean z2 = this.f23605;
        long j = this.f23611;
        DecimalFormat decimalFormat = this.f23612;
        switch (i) {
            case 0:
                abstractC2897.mo5990((BigDecimal) mo13995(obj), j, decimalFormat);
                return;
            case 1:
                abstractC2897.mo5990((BigDecimal) mo13995(obj), j, decimalFormat);
                return;
            case 2:
                abstractC2897.mo5987((BigInteger) mo13995(obj), j);
                return;
            case 3:
                Character ch = (Character) mo13995(obj);
                if (ch == null) {
                    abstractC2897.mo5967();
                    return;
                } else {
                    abstractC2897.mo5980(ch.charValue());
                    return;
                }
            case 4:
                throw null;
            case 5:
                Double d = (Double) mo13995(obj);
                if (d == null) {
                    abstractC2897.m6065();
                    return;
                }
                double dDoubleValue = d.doubleValue();
                if (decimalFormat != null) {
                    abstractC2897.m6070(dDoubleValue, decimalFormat);
                    return;
                } else {
                    abstractC2897.mo5991(dDoubleValue);
                    return;
                }
            case 6:
                Float f = (Float) mo13995(obj);
                if (f == null) {
                    abstractC2897.m6065();
                    return;
                }
                float fFloatValue = f.floatValue();
                if (decimalFormat != null) {
                    abstractC2897.m6067(fFloatValue, decimalFormat);
                    return;
                } else {
                    abstractC2897.mo5983(fFloatValue);
                    return;
                }
            case 7:
                throw null;
            case 8:
                String strTrim = (String) mo13995(obj);
                if (strTrim == null) {
                    abstractC2897.mo5967();
                    return;
                }
                if (z2) {
                    strTrim = strTrim.trim();
                }
                if (z) {
                    abstractC2897.mo6009(strTrim);
                    return;
                } else {
                    abstractC2897.mo6017(strTrim);
                    return;
                }
            default:
                String strTrim2 = (String) mo13995(obj);
                if (z2 && strTrim2 != null) {
                    strTrim2 = strTrim2.trim();
                }
                if (this.f23606 && abstractC2897.f9171) {
                    abstractC2897.mo6047(strTrim2);
                    return;
                } else if (z) {
                    abstractC2897.mo6009(strTrim2);
                    return;
                } else {
                    abstractC2897.mo6017(strTrim2);
                    return;
                }
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        String strTrim;
        long j;
        long j2;
        long j3;
        int i = this.f23590;
        boolean z = this.f23604;
        boolean z2 = this.f23606;
        boolean z3 = this.f23605;
        DecimalFormat decimalFormat = this.f23612;
        long j4 = this.f23611;
        switch (i) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) mo13995(obj);
                if (bigDecimal == null) {
                    return m14077(abstractC2897);
                }
                m14078(abstractC2897);
                abstractC2897.mo5990(bigDecimal, j4, decimalFormat);
                return true;
            case 1:
                try {
                    BigDecimal bigDecimal2 = (BigDecimal) mo13995(obj);
                    if (bigDecimal2 == null) {
                        return m14077(abstractC2897);
                    }
                    m14078(abstractC2897);
                    abstractC2897.mo5990(bigDecimal2, j4, decimalFormat);
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e;
                }
            case 2:
                BigInteger bigInteger = (BigInteger) mo13995(obj);
                if (bigInteger == null && ((abstractC2897.f9178.f9153 | j4) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                m14078(abstractC2897);
                abstractC2897.mo5987(bigInteger, j4);
                return true;
            case 3:
                Character ch = (Character) mo13995(obj);
                if (ch != null) {
                    m14078(abstractC2897);
                    abstractC2897.mo5980(ch.charValue());
                } else {
                    if (((abstractC2897.f9178.f9153 | j4) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14078(abstractC2897);
                    abstractC2897.mo5967();
                }
                return true;
            case 4:
                throw null;
            case 5:
                try {
                    Double d = (Double) mo13995(obj);
                    if (d == null) {
                        return m14077(abstractC2897);
                    }
                    m14078(abstractC2897);
                    double dDoubleValue = d.doubleValue();
                    if (decimalFormat != null) {
                        abstractC2897.m6070(dDoubleValue, decimalFormat);
                    } else if ((j4 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
                        abstractC2897.mo6017(Double.toString(dDoubleValue));
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
            case 6:
                try {
                    Float f = (Float) mo13995(obj);
                    if (f == null) {
                        return m14077(abstractC2897);
                    }
                    m14078(abstractC2897);
                    float fFloatValue = f.floatValue();
                    if (decimalFormat != null) {
                        abstractC2897.m6067(fFloatValue, decimalFormat);
                    } else if ((j4 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
                        abstractC2897.mo6017(Float.toString(fFloatValue));
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
            case 7:
                try {
                    throw null;
                } catch (RuntimeException e4) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e4;
                }
            case 8:
                String strTrim2 = (String) mo13995(obj);
                long j5 = j4 | abstractC2897.f9178.f9153;
                if (strTrim2 == null) {
                    long j6 = JSONWriter$Feature.WriteNulls.mask;
                    JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
                    long j7 = j6 | jSONWriter$Feature.mask;
                    JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullStringAsEmpty;
                    if (((j7 | jSONWriter$Feature2.mask) & j5) != 0 && (JSONWriter$Feature.NotWriteDefaultValue.mask & j5) == 0) {
                        m14078(abstractC2897);
                        if ((j5 & (jSONWriter$Feature.mask | jSONWriter$Feature2.mask)) != 0) {
                            abstractC2897.mo6017("");
                        } else {
                            abstractC2897.mo5967();
                        }
                        return true;
                    }
                    return false;
                }
                if (z3) {
                    strTrim2 = strTrim2.trim();
                }
                if (!strTrim2.isEmpty() || (j5 & JSONWriter$Feature.IgnoreEmpty.mask) == 0) {
                    m14078(abstractC2897);
                    if (z2 && abstractC2897.f9171) {
                        abstractC2897.mo6047(strTrim2);
                    } else if (z) {
                        abstractC2897.mo6009(strTrim2);
                    } else {
                        abstractC2897.mo6017(strTrim2);
                    }
                    return true;
                }
                return false;
            default:
                try {
                    strTrim = (String) mo13995(obj);
                    j = abstractC2897.f9178.f9153 | j4;
                } catch (JSONException e5) {
                    if ((abstractC2897.m6078(j4) | JSONWriter$Feature.IgnoreNonFieldGetter.mask) == 0) {
                        throw e5;
                    }
                }
                if (strTrim == null) {
                    j3 = 0;
                    j2 = j4;
                    if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask) & j) != 0) {
                    }
                    return false;
                }
                j2 = j4;
                j3 = 0;
                if (z3) {
                    strTrim = strTrim.trim();
                }
                if (strTrim == null || !strTrim.isEmpty() || (j & JSONWriter$Feature.IgnoreEmpty.mask) == j3) {
                    m14078(abstractC2897);
                    if (strTrim != null || (j2 & (JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) == j3) {
                        if (z3 && strTrim != null) {
                            strTrim = strTrim.trim();
                        }
                        if (z2 && abstractC2897.f9171) {
                            abstractC2897.mo6047(strTrim);
                        } else if (z) {
                            abstractC2897.mo6009(strTrim);
                        } else {
                            abstractC2897.mo6017(strTrim);
                        }
                    } else {
                        abstractC2897.mo6017("");
                    }
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8492(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23590 = i2;
    }
}
