package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
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
public final class C9321 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23935;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9321(String str, int i, long j, String str2, String str3, Field field, int i2) {
        super(str, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, field, null);
        this.f23935 = i2;
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

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo14554(Object obj) {
        switch (this.f23935) {
            case 1:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e);
                    return null;
                }
            case 2:
            case 8:
            default:
                return super.mo14554(obj);
            case 3:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e2);
                    return null;
                }
            case 4:
                throw null;
            case 5:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e3);
                    return null;
                }
            case 6:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e4) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e4);
                    return null;
                }
            case 7:
                throw null;
            case 9:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e5);
                    return null;
                }
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        int i = this.f23935;
        boolean z = this.f23949;
        boolean z2 = this.f23950;
        long j = this.f23956;
        DecimalFormat decimalFormat = this.f23957;
        switch (i) {
            case 0:
                abstractC3730.mo6550((BigDecimal) mo14554(obj), j, decimalFormat);
                return;
            case 1:
                abstractC3730.mo6550((BigDecimal) mo14554(obj), j, decimalFormat);
                return;
            case 2:
                abstractC3730.mo6547((BigInteger) mo14554(obj), j);
                return;
            case 3:
                Character ch = (Character) mo14554(obj);
                if (ch == null) {
                    abstractC3730.mo6527();
                    return;
                } else {
                    abstractC3730.mo6540(ch.charValue());
                    return;
                }
            case 4:
                throw null;
            case 5:
                Double d = (Double) mo14554(obj);
                if (d == null) {
                    abstractC3730.m6625();
                    return;
                }
                double dDoubleValue = d.doubleValue();
                if (decimalFormat != null) {
                    abstractC3730.m6630(dDoubleValue, decimalFormat);
                    return;
                } else {
                    abstractC3730.mo6551(dDoubleValue);
                    return;
                }
            case 6:
                Float f = (Float) mo14554(obj);
                if (f == null) {
                    abstractC3730.m6625();
                    return;
                }
                float fFloatValue = f.floatValue();
                if (decimalFormat != null) {
                    abstractC3730.m6627(fFloatValue, decimalFormat);
                    return;
                } else {
                    abstractC3730.mo6543(fFloatValue);
                    return;
                }
            case 7:
                throw null;
            case 8:
                String strTrim = (String) mo14554(obj);
                if (strTrim == null) {
                    abstractC3730.mo6527();
                    return;
                }
                if (z2) {
                    strTrim = strTrim.trim();
                }
                if (z) {
                    abstractC3730.mo6569(strTrim);
                    return;
                } else {
                    abstractC3730.mo6577(strTrim);
                    return;
                }
            default:
                String strTrim2 = (String) mo14554(obj);
                if (z2 && strTrim2 != null) {
                    strTrim2 = strTrim2.trim();
                }
                if (this.f23951 && abstractC3730.f9516) {
                    abstractC3730.mo6607(strTrim2);
                    return;
                } else if (z) {
                    abstractC3730.mo6569(strTrim2);
                    return;
                } else {
                    abstractC3730.mo6577(strTrim2);
                    return;
                }
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        String strTrim;
        long j;
        long j2;
        long j3;
        int i = this.f23935;
        boolean z = this.f23949;
        boolean z2 = this.f23951;
        boolean z3 = this.f23950;
        DecimalFormat decimalFormat = this.f23957;
        long j4 = this.f23956;
        switch (i) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) mo14554(obj);
                if (bigDecimal == null) {
                    return m14636(abstractC3730);
                }
                m14637(abstractC3730);
                abstractC3730.mo6550(bigDecimal, j4, decimalFormat);
                return true;
            case 1:
                try {
                    BigDecimal bigDecimal2 = (BigDecimal) mo14554(obj);
                    if (bigDecimal2 == null) {
                        return m14636(abstractC3730);
                    }
                    m14637(abstractC3730);
                    abstractC3730.mo6550(bigDecimal2, j4, decimalFormat);
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e;
                }
            case 2:
                BigInteger bigInteger = (BigInteger) mo14554(obj);
                if (bigInteger == null && ((abstractC3730.f9523.f9498 | j4) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                m14637(abstractC3730);
                abstractC3730.mo6547(bigInteger, j4);
                return true;
            case 3:
                Character ch = (Character) mo14554(obj);
                if (ch != null) {
                    m14637(abstractC3730);
                    abstractC3730.mo6540(ch.charValue());
                } else {
                    if (((abstractC3730.f9523.f9498 | j4) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14637(abstractC3730);
                    abstractC3730.mo6527();
                }
                return true;
            case 4:
                throw null;
            case 5:
                try {
                    Double d = (Double) mo14554(obj);
                    if (d == null) {
                        return m14636(abstractC3730);
                    }
                    m14637(abstractC3730);
                    double dDoubleValue = d.doubleValue();
                    if (decimalFormat != null) {
                        abstractC3730.m6630(dDoubleValue, decimalFormat);
                    } else if ((j4 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
                        abstractC3730.mo6577(Double.toString(dDoubleValue));
                    } else {
                        abstractC3730.mo6551(dDoubleValue);
                    }
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e2;
                }
            case 6:
                try {
                    Float f = (Float) mo14554(obj);
                    if (f == null) {
                        return m14636(abstractC3730);
                    }
                    m14637(abstractC3730);
                    float fFloatValue = f.floatValue();
                    if (decimalFormat != null) {
                        abstractC3730.m6627(fFloatValue, decimalFormat);
                    } else if ((j4 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
                        abstractC3730.mo6577(Float.toString(fFloatValue));
                    } else {
                        abstractC3730.mo6543(fFloatValue);
                    }
                    return true;
                } catch (RuntimeException e3) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e3;
                }
            case 7:
                try {
                    throw null;
                } catch (RuntimeException e4) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e4;
                }
            case 8:
                String strTrim2 = (String) mo14554(obj);
                long j5 = j4 | abstractC3730.f9523.f9498;
                if (strTrim2 == null) {
                    long j6 = JSONWriter$Feature.WriteNulls.mask;
                    JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
                    long j7 = j6 | jSONWriter$Feature.mask;
                    JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullStringAsEmpty;
                    if (((j7 | jSONWriter$Feature2.mask) & j5) != 0 && (JSONWriter$Feature.NotWriteDefaultValue.mask & j5) == 0) {
                        m14637(abstractC3730);
                        if ((j5 & (jSONWriter$Feature.mask | jSONWriter$Feature2.mask)) != 0) {
                            abstractC3730.mo6577("");
                        } else {
                            abstractC3730.mo6527();
                        }
                        return true;
                    }
                    return false;
                }
                if (z3) {
                    strTrim2 = strTrim2.trim();
                }
                if (!strTrim2.isEmpty() || (j5 & JSONWriter$Feature.IgnoreEmpty.mask) == 0) {
                    m14637(abstractC3730);
                    if (z2 && abstractC3730.f9516) {
                        abstractC3730.mo6607(strTrim2);
                    } else if (z) {
                        abstractC3730.mo6569(strTrim2);
                    } else {
                        abstractC3730.mo6577(strTrim2);
                    }
                    return true;
                }
                return false;
            default:
                try {
                    strTrim = (String) mo14554(obj);
                    j = abstractC3730.f9523.f9498 | j4;
                } catch (JSONException e5) {
                    if ((abstractC3730.m6638(j4) | JSONWriter$Feature.IgnoreNonFieldGetter.mask) == 0) {
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
                    m14637(abstractC3730);
                    if (strTrim != null || (j2 & (JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) == j3) {
                        if (z3 && strTrim != null) {
                            strTrim = strTrim.trim();
                        }
                        if (z2 && abstractC3730.f9516) {
                            abstractC3730.mo6607(strTrim);
                        } else if (z) {
                            abstractC3730.mo6569(strTrim);
                        } else {
                            abstractC3730.mo6577(strTrim);
                        }
                    } else {
                        abstractC3730.mo6577("");
                    }
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9321(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23935 = i2;
    }
}
