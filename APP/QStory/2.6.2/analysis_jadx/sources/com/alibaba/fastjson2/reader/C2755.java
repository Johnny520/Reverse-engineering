package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2755 extends C2690 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final /* synthetic */ int f8402;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2755(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8402 = 4;
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo5441(Object obj, float f) {
        switch (this.f8402) {
            case 9:
                mo5426(obj, Short.valueOf((short) f));
                break;
            case 10:
                mo5426(obj, Short.valueOf((short) f));
                break;
            case 11:
                mo5426(obj, Integer.valueOf((int) f));
                break;
            case 12:
            case 14:
            default:
                super.mo5441(obj, f);
                break;
            case 13:
                mo5426(obj, Long.valueOf((long) f));
                break;
            case 15:
                mo5426(obj, Byte.valueOf((byte) f));
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo5442(Object obj, double d) {
        switch (this.f8402) {
            case 9:
                mo5426(obj, Short.valueOf((short) d));
                break;
            case 10:
                mo5426(obj, Short.valueOf((short) d));
                break;
            case 11:
                mo5426(obj, Integer.valueOf((int) d));
                break;
            case 12:
            case 14:
            default:
                super.mo5442(obj, d);
                break;
            case 13:
                mo5426(obj, Long.valueOf((long) d));
                break;
            case 15:
                mo5426(obj, Byte.valueOf((byte) d));
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo5445(Object obj, boolean z) {
        switch (this.f8402) {
            case 2:
                mo5426(obj, Boolean.valueOf(z));
                break;
            default:
                super.mo5445(obj, z);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo5446(Object obj, short s) {
        switch (this.f8402) {
            case 15:
                mo5426(obj, Byte.valueOf((byte) s));
                break;
            default:
                super.mo5446(obj, s);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo5447(Object obj, int i) {
        int i2 = this.f8402;
        String str = this.f8426;
        Field field = this.f8422;
        JSONSchema jSONSchema = this.f8411;
        switch (i2) {
            case 0:
                if (jSONSchema != null) {
                    jSONSchema.m5598(i);
                }
                try {
                    field.set(obj, BigDecimal.valueOf(i));
                } catch (Exception e) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                if (jSONSchema != null) {
                    jSONSchema.m5598(i);
                }
                try {
                    field.set(obj, BigInteger.valueOf(i));
                } catch (Exception e2) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 2:
                mo5426(obj, AbstractC2866.m5866(Integer.valueOf(i)));
                break;
            case 9:
                mo5426(obj, Short.valueOf((short) i));
                break;
            case 10:
                if (jSONSchema != null) {
                    jSONSchema.m5598(i);
                }
                try {
                    field.setShort(obj, (short) i);
                } catch (Exception e3) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 15:
                mo5426(obj, Byte.valueOf((byte) i));
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m5598(i);
                }
                try {
                    field.setByte(obj, (byte) i);
                } catch (Exception e4) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e4);
                    return;
                }
                break;
            default:
                super.mo5447(obj, i);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5426(Object obj, Object obj2) {
        char cCharValue;
        int i = this.f8402;
        JSONSchema jSONSchema = this.f8411;
        String str = this.f8426;
        Field field = this.f8422;
        switch (i) {
            case 0:
                BigDecimal bigDecimalM5869 = AbstractC2866.m5869(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigDecimalM5869);
                }
                try {
                    field.set(obj, bigDecimalM5869);
                } catch (Exception e) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM5867 = AbstractC2866.m5867(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigIntegerM5867);
                }
                try {
                    field.set(obj, bigIntegerM5867);
                } catch (Exception e2) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 2:
                Boolean boolM5866 = AbstractC2866.m5866(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(boolM5866);
                }
                try {
                    field.set(obj, boolM5866);
                } catch (Exception e3) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 3:
                if (obj2 instanceof String) {
                    cCharValue = ((String) obj2).charAt(0);
                } else if (!(obj2 instanceof Character)) {
                    C0276.m849("cast to char error");
                } else {
                    cCharValue = ((Character) obj2).charValue();
                }
                m5443(obj, cCharValue);
                break;
            case 4:
                if (obj2 != null) {
                    try {
                        Collection collection = (Collection) field.get(obj);
                        if (collection != Collections.EMPTY_LIST && collection != Collections.EMPTY_SET && collection != null && !collection.equals(obj2)) {
                            String name = collection.getClass().getName();
                            if (!"java.util.Collections$UnmodifiableRandomAccessList".equals(name) && !"java.util.Arrays$ArrayList".equals(name) && !"java.util.Collections$SingletonList".equals(name) && !name.startsWith("java.util.ImmutableCollections$")) {
                                collection.addAll((Collection) obj2);
                                break;
                            }
                        }
                    } catch (Exception e4) {
                        C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e4);
                        return;
                    }
                }
                break;
            case 5:
                Double dM5873 = AbstractC2866.m5873(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5597(dM5873);
                }
                try {
                    field.set(obj, dM5873);
                } catch (Exception e5) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e5);
                    return;
                }
                break;
            case 6:
                double dM5872 = AbstractC2866.m5872(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5599(dM5872);
                }
                try {
                    field.set(obj, Double.valueOf(dM5872));
                } catch (Exception e6) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e6);
                    return;
                }
                break;
            case 7:
                Float fM5871 = AbstractC2866.m5871(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5596(fM5871);
                }
                try {
                    field.set(obj, fM5871);
                } catch (Exception e7) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e7);
                    return;
                }
                break;
            case 8:
                float fM5862 = AbstractC2866.m5862(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5599(fM5862);
                }
                try {
                    field.setFloat(obj, fM5862);
                } catch (Exception e8) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e8);
                    return;
                }
                break;
            case 9:
                Short shM5856 = AbstractC2866.m5856(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(shM5856);
                }
                try {
                    field.set(obj, shM5856);
                } catch (Exception e9) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e9);
                    return;
                }
                break;
            case 10:
                short sM5855 = AbstractC2866.m5855(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5598(sM5855);
                }
                try {
                    field.setShort(obj, sM5855);
                } catch (Exception e10) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e10);
                    return;
                }
                break;
            case 11:
                Integer numM5863 = AbstractC2866.m5863(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5610(numM5863);
                }
                if (obj2 != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8420) == 0) {
                    try {
                        field.set(obj, numM5863);
                    } catch (Exception e11) {
                        C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e11);
                        return;
                    }
                }
                break;
            case 12:
            case 14:
            default:
                super.mo5426(obj, obj2);
                break;
            case 13:
                Long lM5859 = AbstractC2866.m5859(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5609(lM5859);
                }
                try {
                    field.set(obj, lM5859);
                } catch (Exception e12) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e12);
                    return;
                }
                break;
            case 15:
                Byte bM5876 = AbstractC2866.m5876(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5611(bM5876);
                }
                try {
                    field.set(obj, bM5876);
                } catch (Exception e13) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e13);
                    return;
                }
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m5611(obj2);
                }
                try {
                    field.setByte(obj, AbstractC2866.m5875(obj2));
                } catch (Exception e14) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e14);
                    return;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5435(Object obj, long j) {
        int i = this.f8402;
        String str = this.f8426;
        Field field = this.f8422;
        JSONSchema jSONSchema = this.f8411;
        switch (i) {
            case 0:
                if (jSONSchema != null) {
                    jSONSchema.m5598(j);
                }
                try {
                    field.set(obj, BigDecimal.valueOf(j));
                } catch (Exception e) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                if (jSONSchema != null) {
                    jSONSchema.m5598(j);
                }
                try {
                    field.set(obj, BigInteger.valueOf(j));
                } catch (Exception e2) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 9:
                mo5426(obj, Short.valueOf((short) j));
                break;
            case 10:
                if (jSONSchema != null) {
                    jSONSchema.m5598(j);
                }
                try {
                    field.setShort(obj, (short) j);
                } catch (Exception e3) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 15:
                mo5426(obj, Byte.valueOf((byte) j));
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m5598(j);
                }
                try {
                    field.setByte(obj, (byte) j);
                } catch (Exception e4) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e4);
                    return;
                }
                break;
            default:
                super.mo5435(obj, j);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo5440() {
        switch (this.f8402) {
            case 4:
                return true;
            case 12:
                return true;
            case 14:
                return true;
            default:
                return super.mo5440();
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        int i = this.f8402;
        int i2 = 0;
        JSONSchema jSONSchema = this.f8411;
        String str = this.f8426;
        Field field = this.f8422;
        switch (i) {
            case 0:
                BigDecimal bigDecimalMo6065 = abstractC2898.mo6065();
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigDecimalMo6065);
                }
                try {
                    field.set(obj, bigDecimalMo6065);
                } catch (Exception e) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerMo6064 = abstractC2898.mo6064();
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigIntegerMo6064);
                }
                try {
                    field.set(obj, bigIntegerMo6064);
                } catch (Exception e2) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e2);
                    return;
                }
                break;
            case 2:
                try {
                    field.set(obj, abstractC2898.mo6066());
                } catch (Exception e3) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e3);
                    return;
                }
                break;
            case 3:
                char cMo6063 = abstractC2898.mo6063();
                if (cMo6063 != 0 || !abstractC2898.f9194) {
                    m5443(obj, cMo6063);
                }
                break;
            case 4:
                if (this.f8162 == null) {
                    this.f8162 = abstractC2898.f9199.m6353(this.f8421);
                }
                mo5426(obj, this.f8162.mo5418(abstractC2898, this.f8421, this.f8426, 0L));
                break;
            case 5:
                Double dM6085 = abstractC2898.m6085();
                if (jSONSchema != null) {
                    jSONSchema.m5597(dM6085);
                }
                if (dM6085 != null || this.f8413 == null) {
                    try {
                        field.set(obj, dM6085);
                    } catch (Exception e4) {
                        C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e4);
                        return;
                    }
                }
                break;
            case 6:
                double dMo6081 = abstractC2898.mo6081();
                if (jSONSchema != null) {
                    jSONSchema.m5599(dMo6081);
                }
                try {
                    field.setDouble(obj, dMo6081);
                } catch (Exception e5) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e5);
                    return;
                }
                break;
            case 7:
                Float fMo6071 = abstractC2898.mo6071();
                if (jSONSchema != null) {
                    jSONSchema.m5596(fMo6071);
                }
                try {
                    field.set(obj, fMo6071);
                } catch (Exception e6) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e6);
                    return;
                }
                break;
            case 8:
                float fMo6068 = abstractC2898.mo6068();
                if (jSONSchema != null) {
                    jSONSchema.m5599(fMo6068);
                }
                try {
                    field.setFloat(obj, fMo6068);
                } catch (Exception e7) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e7);
                    return;
                }
                break;
            case 9:
                objValueOf = abstractC2898.f9194 ? null : Short.valueOf((short) abstractC2898.mo6167());
                if (jSONSchema != null) {
                    jSONSchema.m5611(objValueOf);
                }
                try {
                    field.set(obj, objValueOf);
                } catch (Exception e8) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e8);
                    return;
                }
                break;
            case 10:
                int iMo6167 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo6167);
                }
                try {
                    field.setShort(obj, (short) iMo6167);
                } catch (Exception e9) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e9);
                    return;
                }
                break;
            case 11:
                Integer numMo6168 = abstractC2898.mo6168();
                if (jSONSchema != null) {
                    jSONSchema.m5610(numMo6168);
                }
                try {
                    field.set(obj, numMo6168);
                } catch (Exception e10) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e10);
                    return;
                }
                break;
            case 12:
                if (!abstractC2898.mo6073()) {
                    try {
                        int[] iArr = (int[]) field.get(obj);
                        if (abstractC2898.mo6095()) {
                            while (!abstractC2898.mo6096()) {
                                int iMo61672 = abstractC2898.mo6167();
                                if (iArr != null && i2 < iArr.length) {
                                    iArr[i2] = iMo61672;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception e11) {
                        C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e11);
                        return;
                    }
                    break;
                }
                break;
            case 13:
                Long lMo6165 = abstractC2898.mo6165();
                if (jSONSchema != null) {
                    jSONSchema.m5609(lMo6165);
                }
                try {
                    field.set(obj, lMo6165);
                } catch (Exception e12) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e12);
                    return;
                }
                break;
            case 14:
                if (!abstractC2898.mo6073()) {
                    try {
                        long[] jArr = (long[]) field.get(obj);
                        if (abstractC2898.mo6095()) {
                            while (!abstractC2898.mo6096()) {
                                long jMo6164 = abstractC2898.mo6164();
                                if (jArr != null && i2 < jArr.length) {
                                    jArr[i2] = jMo6164;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception e13) {
                        C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e13);
                        return;
                    }
                    break;
                }
                break;
            case 15:
                Integer numMo61682 = abstractC2898.mo6168();
                if (jSONSchema != null) {
                    jSONSchema.m5610(numMo61682);
                }
                if (numMo61682 != null) {
                    try {
                        objValueOf = Byte.valueOf(numMo61682.byteValue());
                    } catch (Exception e14) {
                        C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e14);
                        return;
                    }
                }
                field.set(obj, objValueOf);
                break;
            default:
                int iMo61673 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo61673);
                }
                try {
                    field.setByte(obj, (byte) iMo61673);
                } catch (Exception e15) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e15);
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo5428(AbstractC2898 abstractC2898) {
        switch (this.f8402) {
            case 2:
                return abstractC2898.mo6066();
            case 3:
                String strMo6139 = abstractC2898.mo6139();
                char cCharAt = 0;
                if (strMo6139 != null && !strMo6139.isEmpty()) {
                    cCharAt = strMo6139.charAt(0);
                }
                return Character.valueOf(cCharAt);
            case 4:
            case 12:
            case 14:
            default:
                return super.mo5428(abstractC2898);
            case 5:
                return abstractC2898.m6085();
            case 6:
                return Double.valueOf(abstractC2898.mo6081());
            case 7:
                return abstractC2898.mo6071();
            case 8:
                return Float.valueOf(abstractC2898.mo6068());
            case 9:
                return Short.valueOf((short) abstractC2898.mo6167());
            case 10:
                return Short.valueOf((short) abstractC2898.mo6167());
            case 11:
                return abstractC2898.mo6168();
            case 13:
                return abstractC2898.mo6165();
            case 15:
                return Byte.valueOf((byte) abstractC2898.mo6167());
            case 16:
                return Byte.valueOf((byte) abstractC2898.mo6167());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2755(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field, int i2) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, field);
        this.f8402 = i2;
    }
}
