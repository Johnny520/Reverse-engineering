package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2867;
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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2756 extends C2691 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final /* synthetic */ int f8404;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2756(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8404 = 4;
    }

    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo5486(Object obj, float f) {
        switch (this.f8404) {
            case 9:
                mo5471(obj, Short.valueOf((short) f));
                break;
            case 10:
                mo5471(obj, Short.valueOf((short) f));
                break;
            case 11:
                mo5471(obj, Integer.valueOf((int) f));
                break;
            case 12:
            case 14:
            default:
                super.mo5486(obj, f);
                break;
            case 13:
                mo5471(obj, Long.valueOf((long) f));
                break;
            case 15:
                mo5471(obj, Byte.valueOf((byte) f));
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo5487(Object obj, double d) {
        switch (this.f8404) {
            case 9:
                mo5471(obj, Short.valueOf((short) d));
                break;
            case 10:
                mo5471(obj, Short.valueOf((short) d));
                break;
            case 11:
                mo5471(obj, Integer.valueOf((int) d));
                break;
            case 12:
            case 14:
            default:
                super.mo5487(obj, d);
                break;
            case 13:
                mo5471(obj, Long.valueOf((long) d));
                break;
            case 15:
                mo5471(obj, Byte.valueOf((byte) d));
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo5490(Object obj, boolean z) {
        switch (this.f8404) {
            case 2:
                mo5471(obj, Boolean.valueOf(z));
                break;
            default:
                super.mo5490(obj, z);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo5491(Object obj, short s) {
        switch (this.f8404) {
            case 15:
                mo5471(obj, Byte.valueOf((byte) s));
                break;
            default:
                super.mo5491(obj, s);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo5492(Object obj, int i) {
        int i2 = this.f8404;
        String str = this.f8428;
        Field field = this.f8424;
        JSONSchema jSONSchema = this.f8413;
        switch (i2) {
            case 0:
                if (jSONSchema != null) {
                    jSONSchema.m5643(i);
                }
                try {
                    field.set(obj, BigDecimal.valueOf(i));
                } catch (Exception e) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                if (jSONSchema != null) {
                    jSONSchema.m5643(i);
                }
                try {
                    field.set(obj, BigInteger.valueOf(i));
                } catch (Exception e2) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 2:
                mo5471(obj, AbstractC2867.m5911(Integer.valueOf(i)));
                break;
            case 9:
                mo5471(obj, Short.valueOf((short) i));
                break;
            case 10:
                if (jSONSchema != null) {
                    jSONSchema.m5643(i);
                }
                try {
                    field.setShort(obj, (short) i);
                } catch (Exception e3) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 15:
                mo5471(obj, Byte.valueOf((byte) i));
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m5643(i);
                }
                try {
                    field.setByte(obj, (byte) i);
                } catch (Exception e4) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e4);
                    return;
                }
                break;
            default:
                super.mo5492(obj, i);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5471(Object obj, Object obj2) {
        char cCharValue;
        int i = this.f8404;
        JSONSchema jSONSchema = this.f8413;
        String str = this.f8428;
        Field field = this.f8424;
        switch (i) {
            case 0:
                BigDecimal bigDecimalM5914 = AbstractC2867.m5914(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigDecimalM5914);
                }
                try {
                    field.set(obj, bigDecimalM5914);
                } catch (Exception e) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM5912 = AbstractC2867.m5912(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigIntegerM5912);
                }
                try {
                    field.set(obj, bigIntegerM5912);
                } catch (Exception e2) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 2:
                Boolean boolM5911 = AbstractC2867.m5911(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(boolM5911);
                }
                try {
                    field.set(obj, boolM5911);
                } catch (Exception e3) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 3:
                if (obj2 instanceof String) {
                    cCharValue = ((String) obj2).charAt(0);
                } else if (!(obj2 instanceof Character)) {
                    C0276.m850("cast to char error");
                } else {
                    cCharValue = ((Character) obj2).charValue();
                }
                m5488(obj, cCharValue);
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
                        C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e4);
                        return;
                    }
                }
                break;
            case 5:
                Double dM5918 = AbstractC2867.m5918(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5642(dM5918);
                }
                try {
                    field.set(obj, dM5918);
                } catch (Exception e5) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e5);
                    return;
                }
                break;
            case 6:
                double dM5917 = AbstractC2867.m5917(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5644(dM5917);
                }
                try {
                    field.set(obj, Double.valueOf(dM5917));
                } catch (Exception e6) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e6);
                    return;
                }
                break;
            case 7:
                Float fM5916 = AbstractC2867.m5916(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5641(fM5916);
                }
                try {
                    field.set(obj, fM5916);
                } catch (Exception e7) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e7);
                    return;
                }
                break;
            case 8:
                float fM5907 = AbstractC2867.m5907(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5644(fM5907);
                }
                try {
                    field.setFloat(obj, fM5907);
                } catch (Exception e8) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e8);
                    return;
                }
                break;
            case 9:
                Short shM5901 = AbstractC2867.m5901(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(shM5901);
                }
                try {
                    field.set(obj, shM5901);
                } catch (Exception e9) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e9);
                    return;
                }
                break;
            case 10:
                short sM5900 = AbstractC2867.m5900(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5643(sM5900);
                }
                try {
                    field.setShort(obj, sM5900);
                } catch (Exception e10) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e10);
                    return;
                }
                break;
            case 11:
                Integer numM5908 = AbstractC2867.m5908(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5655(numM5908);
                }
                if (obj2 != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8422) == 0) {
                    try {
                        field.set(obj, numM5908);
                    } catch (Exception e11) {
                        C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e11);
                        return;
                    }
                }
                break;
            case 12:
            case 14:
            default:
                super.mo5471(obj, obj2);
                break;
            case 13:
                Long lM5904 = AbstractC2867.m5904(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5654(lM5904);
                }
                try {
                    field.set(obj, lM5904);
                } catch (Exception e12) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e12);
                    return;
                }
                break;
            case 15:
                Byte bM5921 = AbstractC2867.m5921(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5656(bM5921);
                }
                try {
                    field.set(obj, bM5921);
                } catch (Exception e13) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e13);
                    return;
                }
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m5656(obj2);
                }
                try {
                    field.setByte(obj, AbstractC2867.m5920(obj2));
                } catch (Exception e14) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e14);
                    return;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5480(Object obj, long j) {
        int i = this.f8404;
        String str = this.f8428;
        Field field = this.f8424;
        JSONSchema jSONSchema = this.f8413;
        switch (i) {
            case 0:
                if (jSONSchema != null) {
                    jSONSchema.m5643(j);
                }
                try {
                    field.set(obj, BigDecimal.valueOf(j));
                } catch (Exception e) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                if (jSONSchema != null) {
                    jSONSchema.m5643(j);
                }
                try {
                    field.set(obj, BigInteger.valueOf(j));
                } catch (Exception e2) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 9:
                mo5471(obj, Short.valueOf((short) j));
                break;
            case 10:
                if (jSONSchema != null) {
                    jSONSchema.m5643(j);
                }
                try {
                    field.setShort(obj, (short) j);
                } catch (Exception e3) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 15:
                mo5471(obj, Byte.valueOf((byte) j));
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m5643(j);
                }
                try {
                    field.setByte(obj, (byte) j);
                } catch (Exception e4) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e4);
                    return;
                }
                break;
            default:
                super.mo5480(obj, j);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo5485() {
        switch (this.f8404) {
            case 4:
                return true;
            case 12:
                return true;
            case 14:
                return true;
            default:
                return super.mo5485();
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        int i = this.f8404;
        int i2 = 0;
        JSONSchema jSONSchema = this.f8413;
        String str = this.f8428;
        Field field = this.f8424;
        switch (i) {
            case 0:
                BigDecimal bigDecimalMo6111 = abstractC2899.mo6111();
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigDecimalMo6111);
                }
                try {
                    field.set(obj, bigDecimalMo6111);
                } catch (Exception e) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerMo6110 = abstractC2899.mo6110();
                if (jSONSchema != null) {
                    jSONSchema.m5656(bigIntegerMo6110);
                }
                try {
                    field.set(obj, bigIntegerMo6110);
                } catch (Exception e2) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e2);
                    return;
                }
                break;
            case 2:
                try {
                    field.set(obj, abstractC2899.mo6112());
                } catch (Exception e3) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e3);
                    return;
                }
                break;
            case 3:
                char cMo6109 = abstractC2899.mo6109();
                if (cMo6109 != 0 || !abstractC2899.f9196) {
                    m5488(obj, cMo6109);
                }
                break;
            case 4:
                if (this.f8164 == null) {
                    this.f8164 = abstractC2899.f9201.m6411(this.f8423);
                }
                mo5471(obj, this.f8164.mo5463(abstractC2899, this.f8423, this.f8428, 0L));
                break;
            case 5:
                Double dM6131 = abstractC2899.m6131();
                if (jSONSchema != null) {
                    jSONSchema.m5642(dM6131);
                }
                if (dM6131 != null || this.f8415 == null) {
                    try {
                        field.set(obj, dM6131);
                    } catch (Exception e4) {
                        C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e4);
                        return;
                    }
                }
                break;
            case 6:
                double dMo6127 = abstractC2899.mo6127();
                if (jSONSchema != null) {
                    jSONSchema.m5644(dMo6127);
                }
                try {
                    field.setDouble(obj, dMo6127);
                } catch (Exception e5) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e5);
                    return;
                }
                break;
            case 7:
                Float fMo6117 = abstractC2899.mo6117();
                if (jSONSchema != null) {
                    jSONSchema.m5641(fMo6117);
                }
                try {
                    field.set(obj, fMo6117);
                } catch (Exception e6) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e6);
                    return;
                }
                break;
            case 8:
                float fMo6114 = abstractC2899.mo6114();
                if (jSONSchema != null) {
                    jSONSchema.m5644(fMo6114);
                }
                try {
                    field.setFloat(obj, fMo6114);
                } catch (Exception e7) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e7);
                    return;
                }
                break;
            case 9:
                objValueOf = abstractC2899.f9196 ? null : Short.valueOf((short) abstractC2899.mo6212());
                if (jSONSchema != null) {
                    jSONSchema.m5656(objValueOf);
                }
                try {
                    field.set(obj, objValueOf);
                } catch (Exception e8) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e8);
                    return;
                }
                break;
            case 10:
                int iMo6212 = abstractC2899.mo6212();
                if (jSONSchema != null) {
                    jSONSchema.m5643(iMo6212);
                }
                try {
                    field.setShort(obj, (short) iMo6212);
                } catch (Exception e9) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e9);
                    return;
                }
                break;
            case 11:
                Integer numMo6213 = abstractC2899.mo6213();
                if (jSONSchema != null) {
                    jSONSchema.m5655(numMo6213);
                }
                try {
                    field.set(obj, numMo6213);
                } catch (Exception e10) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e10);
                    return;
                }
                break;
            case 12:
                if (!abstractC2899.mo6119()) {
                    try {
                        int[] iArr = (int[]) field.get(obj);
                        if (abstractC2899.mo6141()) {
                            while (!abstractC2899.mo6142()) {
                                int iMo62122 = abstractC2899.mo6212();
                                if (iArr != null && i2 < iArr.length) {
                                    iArr[i2] = iMo62122;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception e11) {
                        C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e11);
                        return;
                    }
                    break;
                }
                break;
            case 13:
                Long lMo6210 = abstractC2899.mo6210();
                if (jSONSchema != null) {
                    jSONSchema.m5654(lMo6210);
                }
                try {
                    field.set(obj, lMo6210);
                } catch (Exception e12) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e12);
                    return;
                }
                break;
            case 14:
                if (!abstractC2899.mo6119()) {
                    try {
                        long[] jArr = (long[]) field.get(obj);
                        if (abstractC2899.mo6141()) {
                            while (!abstractC2899.mo6142()) {
                                long jMo6209 = abstractC2899.mo6209();
                                if (jArr != null && i2 < jArr.length) {
                                    jArr[i2] = jMo6209;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception e13) {
                        C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e13);
                        return;
                    }
                    break;
                }
                break;
            case 15:
                Integer numMo62132 = abstractC2899.mo6213();
                if (jSONSchema != null) {
                    jSONSchema.m5655(numMo62132);
                }
                if (numMo62132 != null) {
                    try {
                        objValueOf = Byte.valueOf(numMo62132.byteValue());
                    } catch (Exception e14) {
                        C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e14);
                        return;
                    }
                }
                field.set(obj, objValueOf);
                break;
            default:
                int iMo62123 = abstractC2899.mo6212();
                if (jSONSchema != null) {
                    jSONSchema.m5643(iMo62123);
                }
                try {
                    field.setByte(obj, (byte) iMo62123);
                } catch (Exception e15) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e15);
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo5473(AbstractC2899 abstractC2899) {
        switch (this.f8404) {
            case 2:
                return abstractC2899.mo6112();
            case 3:
                String strMo6184 = abstractC2899.mo6184();
                char cCharAt = 0;
                if (strMo6184 != null && !strMo6184.isEmpty()) {
                    cCharAt = strMo6184.charAt(0);
                }
                return Character.valueOf(cCharAt);
            case 4:
            case 12:
            case 14:
            default:
                return super.mo5473(abstractC2899);
            case 5:
                return abstractC2899.m6131();
            case 6:
                return Double.valueOf(abstractC2899.mo6127());
            case 7:
                return abstractC2899.mo6117();
            case 8:
                return Float.valueOf(abstractC2899.mo6114());
            case 9:
                return Short.valueOf((short) abstractC2899.mo6212());
            case 10:
                return Short.valueOf((short) abstractC2899.mo6212());
            case 11:
                return abstractC2899.mo6213();
            case 13:
                return abstractC2899.mo6210();
            case 15:
                return Byte.valueOf((byte) abstractC2899.mo6212());
            case 16:
                return Byte.valueOf((byte) abstractC2899.mo6212());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2756(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field, int i2) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, field);
        this.f8404 = i2;
    }
}
