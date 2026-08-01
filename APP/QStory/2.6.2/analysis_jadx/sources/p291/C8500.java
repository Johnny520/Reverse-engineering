package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8500 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23599;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8500(String str, int i, long j, String str2, String str3, Field field, int i2) {
        super(str, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, field, null);
        this.f23599 = i2;
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

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo13976(Object obj) {
        switch (this.f23599) {
            case 1:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e);
                    return null;
                }
            case 2:
            case 8:
            default:
                return super.mo13976(obj);
            case 3:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e2);
                    return null;
                }
            case 4:
                throw null;
            case 5:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e3);
                    return null;
                }
            case 6:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e4) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e4);
                    return null;
                }
            case 7:
                throw null;
            case 9:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e5);
                    return null;
                }
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        int i = this.f23599;
        boolean z = this.f23613;
        boolean z2 = this.f23614;
        long j = this.f23620;
        DecimalFormat decimalFormat = this.f23621;
        switch (i) {
            case 0:
                abstractC2896.mo5945((BigDecimal) mo13976(obj), j, decimalFormat);
                return;
            case 1:
                abstractC2896.mo5945((BigDecimal) mo13976(obj), j, decimalFormat);
                return;
            case 2:
                abstractC2896.mo5942((BigInteger) mo13976(obj), j);
                return;
            case 3:
                Character ch = (Character) mo13976(obj);
                if (ch == null) {
                    abstractC2896.mo5922();
                    return;
                } else {
                    abstractC2896.mo5935(ch.charValue());
                    return;
                }
            case 4:
                throw null;
            case 5:
                Double d = (Double) mo13976(obj);
                if (d == null) {
                    abstractC2896.m6019();
                    return;
                }
                double dDoubleValue = d.doubleValue();
                if (decimalFormat != null) {
                    abstractC2896.m6024(dDoubleValue, decimalFormat);
                    return;
                } else {
                    abstractC2896.mo5946(dDoubleValue);
                    return;
                }
            case 6:
                Float f = (Float) mo13976(obj);
                if (f == null) {
                    abstractC2896.m6019();
                    return;
                }
                float fFloatValue = f.floatValue();
                if (decimalFormat != null) {
                    abstractC2896.m6021(fFloatValue, decimalFormat);
                    return;
                } else {
                    abstractC2896.mo5938(fFloatValue);
                    return;
                }
            case 7:
                throw null;
            case 8:
                String strTrim = (String) mo13976(obj);
                if (strTrim == null) {
                    abstractC2896.mo5922();
                    return;
                }
                if (z2) {
                    strTrim = strTrim.trim();
                }
                if (z) {
                    abstractC2896.mo5964(strTrim);
                    return;
                } else {
                    abstractC2896.mo5972(strTrim);
                    return;
                }
            default:
                String strTrim2 = (String) mo13976(obj);
                if (z2 && strTrim2 != null) {
                    strTrim2 = strTrim2.trim();
                }
                if (this.f23615 && abstractC2896.f9169) {
                    abstractC2896.mo6002(strTrim2);
                    return;
                } else if (z) {
                    abstractC2896.mo5964(strTrim2);
                    return;
                } else {
                    abstractC2896.mo5972(strTrim2);
                    return;
                }
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        String strTrim;
        long j;
        long j2;
        long j3;
        int i = this.f23599;
        boolean z = this.f23613;
        boolean z2 = this.f23615;
        boolean z3 = this.f23614;
        DecimalFormat decimalFormat = this.f23621;
        long j4 = this.f23620;
        switch (i) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) mo13976(obj);
                if (bigDecimal == null) {
                    return m14058(abstractC2896);
                }
                m14059(abstractC2896);
                abstractC2896.mo5945(bigDecimal, j4, decimalFormat);
                return true;
            case 1:
                try {
                    BigDecimal bigDecimal2 = (BigDecimal) mo13976(obj);
                    if (bigDecimal2 == null) {
                        return m14058(abstractC2896);
                    }
                    m14059(abstractC2896);
                    abstractC2896.mo5945(bigDecimal2, j4, decimalFormat);
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e;
                }
            case 2:
                BigInteger bigInteger = (BigInteger) mo13976(obj);
                if (bigInteger == null && ((abstractC2896.f9176.f9151 | j4) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                m14059(abstractC2896);
                abstractC2896.mo5942(bigInteger, j4);
                return true;
            case 3:
                Character ch = (Character) mo13976(obj);
                if (ch != null) {
                    m14059(abstractC2896);
                    abstractC2896.mo5935(ch.charValue());
                } else {
                    if (((abstractC2896.f9176.f9151 | j4) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14059(abstractC2896);
                    abstractC2896.mo5922();
                }
                return true;
            case 4:
                throw null;
            case 5:
                try {
                    Double d = (Double) mo13976(obj);
                    if (d == null) {
                        return m14058(abstractC2896);
                    }
                    m14059(abstractC2896);
                    double dDoubleValue = d.doubleValue();
                    if (decimalFormat != null) {
                        abstractC2896.m6024(dDoubleValue, decimalFormat);
                    } else if ((j4 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
                        abstractC2896.mo5972(Double.toString(dDoubleValue));
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
            case 6:
                try {
                    Float f = (Float) mo13976(obj);
                    if (f == null) {
                        return m14058(abstractC2896);
                    }
                    m14059(abstractC2896);
                    float fFloatValue = f.floatValue();
                    if (decimalFormat != null) {
                        abstractC2896.m6021(fFloatValue, decimalFormat);
                    } else if ((j4 & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
                        abstractC2896.mo5972(Float.toString(fFloatValue));
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
            case 7:
                try {
                    throw null;
                } catch (RuntimeException e4) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e4;
                }
            case 8:
                String strTrim2 = (String) mo13976(obj);
                long j5 = j4 | abstractC2896.f9176.f9151;
                if (strTrim2 == null) {
                    long j6 = JSONWriter$Feature.WriteNulls.mask;
                    JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
                    long j7 = j6 | jSONWriter$Feature.mask;
                    JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullStringAsEmpty;
                    if (((j7 | jSONWriter$Feature2.mask) & j5) != 0 && (JSONWriter$Feature.NotWriteDefaultValue.mask & j5) == 0) {
                        m14059(abstractC2896);
                        if ((j5 & (jSONWriter$Feature.mask | jSONWriter$Feature2.mask)) != 0) {
                            abstractC2896.mo5972("");
                        } else {
                            abstractC2896.mo5922();
                        }
                        return true;
                    }
                    return false;
                }
                if (z3) {
                    strTrim2 = strTrim2.trim();
                }
                if (!strTrim2.isEmpty() || (j5 & JSONWriter$Feature.IgnoreEmpty.mask) == 0) {
                    m14059(abstractC2896);
                    if (z2 && abstractC2896.f9169) {
                        abstractC2896.mo6002(strTrim2);
                    } else if (z) {
                        abstractC2896.mo5964(strTrim2);
                    } else {
                        abstractC2896.mo5972(strTrim2);
                    }
                    return true;
                }
                return false;
            default:
                try {
                    strTrim = (String) mo13976(obj);
                    j = abstractC2896.f9176.f9151 | j4;
                } catch (JSONException e5) {
                    if ((abstractC2896.m6032(j4) | JSONWriter$Feature.IgnoreNonFieldGetter.mask) == 0) {
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
                    m14059(abstractC2896);
                    if (strTrim != null || (j2 & (JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) == j3) {
                        if (z3 && strTrim != null) {
                            strTrim = strTrim.trim();
                        }
                        if (z2 && abstractC2896.f9169) {
                            abstractC2896.mo6002(strTrim);
                        } else if (z) {
                            abstractC2896.mo5964(strTrim);
                        } else {
                            abstractC2896.mo5972(strTrim);
                        }
                    } else {
                        abstractC2896.mo5972("");
                    }
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8500(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23599 = i2;
    }
}
