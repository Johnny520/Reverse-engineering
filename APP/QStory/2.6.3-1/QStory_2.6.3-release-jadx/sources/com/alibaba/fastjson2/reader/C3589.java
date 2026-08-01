package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
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
public final class C3589 extends C3524 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final /* synthetic */ int f8749;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3589(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8749 = 4;
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo6046(Object obj, float f) {
        switch (this.f8749) {
            case 9:
                mo6031(obj, Short.valueOf((short) f));
                break;
            case 10:
                mo6031(obj, Short.valueOf((short) f));
                break;
            case 11:
                mo6031(obj, Integer.valueOf((int) f));
                break;
            case 12:
            case 14:
            default:
                super.mo6046(obj, f);
                break;
            case 13:
                mo6031(obj, Long.valueOf((long) f));
                break;
            case 15:
                mo6031(obj, Byte.valueOf((byte) f));
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo6047(Object obj, double d) {
        switch (this.f8749) {
            case 9:
                mo6031(obj, Short.valueOf((short) d));
                break;
            case 10:
                mo6031(obj, Short.valueOf((short) d));
                break;
            case 11:
                mo6031(obj, Integer.valueOf((int) d));
                break;
            case 12:
            case 14:
            default:
                super.mo6047(obj, d);
                break;
            case 13:
                mo6031(obj, Long.valueOf((long) d));
                break;
            case 15:
                mo6031(obj, Byte.valueOf((byte) d));
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo6050(Object obj, boolean z) {
        switch (this.f8749) {
            case 2:
                mo6031(obj, Boolean.valueOf(z));
                break;
            default:
                super.mo6050(obj, z);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo6051(Object obj, short s) {
        switch (this.f8749) {
            case 15:
                mo6031(obj, Byte.valueOf((byte) s));
                break;
            default:
                super.mo6051(obj, s);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo6052(Object obj, int i) {
        int i2 = this.f8749;
        String str = this.f8773;
        Field field = this.f8769;
        JSONSchema jSONSchema = this.f8758;
        switch (i2) {
            case 0:
                if (jSONSchema != null) {
                    jSONSchema.m6203(i);
                }
                try {
                    field.set(obj, BigDecimal.valueOf(i));
                } catch (Exception e) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                if (jSONSchema != null) {
                    jSONSchema.m6203(i);
                }
                try {
                    field.set(obj, BigInteger.valueOf(i));
                } catch (Exception e2) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 2:
                mo6031(obj, AbstractC3700.m6471(Integer.valueOf(i)));
                break;
            case 9:
                mo6031(obj, Short.valueOf((short) i));
                break;
            case 10:
                if (jSONSchema != null) {
                    jSONSchema.m6203(i);
                }
                try {
                    field.setShort(obj, (short) i);
                } catch (Exception e3) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 15:
                mo6031(obj, Byte.valueOf((byte) i));
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m6203(i);
                }
                try {
                    field.setByte(obj, (byte) i);
                } catch (Exception e4) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e4);
                    return;
                }
                break;
            default:
                super.mo6052(obj, i);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6031(Object obj, Object obj2) {
        char cCharValue;
        int i = this.f8749;
        JSONSchema jSONSchema = this.f8758;
        String str = this.f8773;
        Field field = this.f8769;
        switch (i) {
            case 0:
                BigDecimal bigDecimalM6474 = AbstractC3700.m6474(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigDecimalM6474);
                }
                try {
                    field.set(obj, bigDecimalM6474);
                } catch (Exception e) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM6472 = AbstractC3700.m6472(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigIntegerM6472);
                }
                try {
                    field.set(obj, bigIntegerM6472);
                } catch (Exception e2) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 2:
                Boolean boolM6471 = AbstractC3700.m6471(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(boolM6471);
                }
                try {
                    field.set(obj, boolM6471);
                } catch (Exception e3) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 3:
                if (obj2 instanceof String) {
                    cCharValue = ((String) obj2).charAt(0);
                } else if (!(obj2 instanceof Character)) {
                    C1123.m1410("cast to char error");
                } else {
                    cCharValue = ((Character) obj2).charValue();
                }
                m6048(obj, cCharValue);
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
                        C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e4);
                        return;
                    }
                }
                break;
            case 5:
                Double dM6478 = AbstractC3700.m6478(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6202(dM6478);
                }
                try {
                    field.set(obj, dM6478);
                } catch (Exception e5) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e5);
                    return;
                }
                break;
            case 6:
                double dM6477 = AbstractC3700.m6477(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6204(dM6477);
                }
                try {
                    field.set(obj, Double.valueOf(dM6477));
                } catch (Exception e6) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e6);
                    return;
                }
                break;
            case 7:
                Float fM6476 = AbstractC3700.m6476(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6201(fM6476);
                }
                try {
                    field.set(obj, fM6476);
                } catch (Exception e7) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e7);
                    return;
                }
                break;
            case 8:
                float fM6467 = AbstractC3700.m6467(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6204(fM6467);
                }
                try {
                    field.setFloat(obj, fM6467);
                } catch (Exception e8) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e8);
                    return;
                }
                break;
            case 9:
                Short shM6461 = AbstractC3700.m6461(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(shM6461);
                }
                try {
                    field.set(obj, shM6461);
                } catch (Exception e9) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e9);
                    return;
                }
                break;
            case 10:
                short sM6460 = AbstractC3700.m6460(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6203(sM6460);
                }
                try {
                    field.setShort(obj, sM6460);
                } catch (Exception e10) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e10);
                    return;
                }
                break;
            case 11:
                Integer numM6468 = AbstractC3700.m6468(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6215(numM6468);
                }
                if (obj2 != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8767) == 0) {
                    try {
                        field.set(obj, numM6468);
                    } catch (Exception e11) {
                        C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e11);
                        return;
                    }
                }
                break;
            case 12:
            case 14:
            default:
                super.mo6031(obj, obj2);
                break;
            case 13:
                Long lM6464 = AbstractC3700.m6464(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6214(lM6464);
                }
                try {
                    field.set(obj, lM6464);
                } catch (Exception e12) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e12);
                    return;
                }
                break;
            case 15:
                Byte bM6481 = AbstractC3700.m6481(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6216(bM6481);
                }
                try {
                    field.set(obj, bM6481);
                } catch (Exception e13) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e13);
                    return;
                }
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m6216(obj2);
                }
                try {
                    field.setByte(obj, AbstractC3700.m6480(obj2));
                } catch (Exception e14) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e14);
                    return;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo6040(Object obj, long j) {
        int i = this.f8749;
        String str = this.f8773;
        Field field = this.f8769;
        JSONSchema jSONSchema = this.f8758;
        switch (i) {
            case 0:
                if (jSONSchema != null) {
                    jSONSchema.m6203(j);
                }
                try {
                    field.set(obj, BigDecimal.valueOf(j));
                } catch (Exception e) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e);
                    return;
                }
                break;
            case 1:
                if (jSONSchema != null) {
                    jSONSchema.m6203(j);
                }
                try {
                    field.set(obj, BigInteger.valueOf(j));
                } catch (Exception e2) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
                break;
            case 9:
                mo6031(obj, Short.valueOf((short) j));
                break;
            case 10:
                if (jSONSchema != null) {
                    jSONSchema.m6203(j);
                }
                try {
                    field.setShort(obj, (short) j);
                } catch (Exception e3) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
                break;
            case 15:
                mo6031(obj, Byte.valueOf((byte) j));
                break;
            case 16:
                if (jSONSchema != null) {
                    jSONSchema.m6203(j);
                }
                try {
                    field.setByte(obj, (byte) j);
                } catch (Exception e4) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e4);
                    return;
                }
                break;
            default:
                super.mo6040(obj, j);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo6045() {
        switch (this.f8749) {
            case 4:
                return true;
            case 12:
                return true;
            case 14:
                return true;
            default:
                return super.mo6045();
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        int i = this.f8749;
        int i2 = 0;
        JSONSchema jSONSchema = this.f8758;
        String str = this.f8773;
        Field field = this.f8769;
        switch (i) {
            case 0:
                BigDecimal bigDecimalMo6671 = abstractC3732.mo6671();
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigDecimalMo6671);
                }
                try {
                    field.set(obj, bigDecimalMo6671);
                } catch (Exception e) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerMo6670 = abstractC3732.mo6670();
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigIntegerMo6670);
                }
                try {
                    field.set(obj, bigIntegerMo6670);
                } catch (Exception e2) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e2);
                    return;
                }
                break;
            case 2:
                try {
                    field.set(obj, abstractC3732.mo6672());
                } catch (Exception e3) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e3);
                    return;
                }
                break;
            case 3:
                char cMo6669 = abstractC3732.mo6669();
                if (cMo6669 != 0 || !abstractC3732.f9541) {
                    m6048(obj, cMo6669);
                }
                break;
            case 4:
                if (this.f8509 == null) {
                    this.f8509 = abstractC3732.f9546.m6971(this.f8768);
                }
                mo6031(obj, this.f8509.mo6023(abstractC3732, this.f8768, this.f8773, 0L));
                break;
            case 5:
                Double dM6691 = abstractC3732.m6691();
                if (jSONSchema != null) {
                    jSONSchema.m6202(dM6691);
                }
                if (dM6691 != null || this.f8760 == null) {
                    try {
                        field.set(obj, dM6691);
                    } catch (Exception e4) {
                        C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e4);
                        return;
                    }
                }
                break;
            case 6:
                double dMo6687 = abstractC3732.mo6687();
                if (jSONSchema != null) {
                    jSONSchema.m6204(dMo6687);
                }
                try {
                    field.setDouble(obj, dMo6687);
                } catch (Exception e5) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e5);
                    return;
                }
                break;
            case 7:
                Float fMo6677 = abstractC3732.mo6677();
                if (jSONSchema != null) {
                    jSONSchema.m6201(fMo6677);
                }
                try {
                    field.set(obj, fMo6677);
                } catch (Exception e6) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e6);
                    return;
                }
                break;
            case 8:
                float fMo6674 = abstractC3732.mo6674();
                if (jSONSchema != null) {
                    jSONSchema.m6204(fMo6674);
                }
                try {
                    field.setFloat(obj, fMo6674);
                } catch (Exception e7) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e7);
                    return;
                }
                break;
            case 9:
                objValueOf = abstractC3732.f9541 ? null : Short.valueOf((short) abstractC3732.mo6772());
                if (jSONSchema != null) {
                    jSONSchema.m6216(objValueOf);
                }
                try {
                    field.set(obj, objValueOf);
                } catch (Exception e8) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e8);
                    return;
                }
                break;
            case 10:
                int iMo6772 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo6772);
                }
                try {
                    field.setShort(obj, (short) iMo6772);
                } catch (Exception e9) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e9);
                    return;
                }
                break;
            case 11:
                Integer numMo6773 = abstractC3732.mo6773();
                if (jSONSchema != null) {
                    jSONSchema.m6215(numMo6773);
                }
                try {
                    field.set(obj, numMo6773);
                } catch (Exception e10) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e10);
                    return;
                }
                break;
            case 12:
                if (!abstractC3732.mo6679()) {
                    try {
                        int[] iArr = (int[]) field.get(obj);
                        if (abstractC3732.mo6701()) {
                            while (!abstractC3732.mo6702()) {
                                int iMo67722 = abstractC3732.mo6772();
                                if (iArr != null && i2 < iArr.length) {
                                    iArr[i2] = iMo67722;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception e11) {
                        C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e11);
                        return;
                    }
                    break;
                }
                break;
            case 13:
                Long lMo6770 = abstractC3732.mo6770();
                if (jSONSchema != null) {
                    jSONSchema.m6214(lMo6770);
                }
                try {
                    field.set(obj, lMo6770);
                } catch (Exception e12) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e12);
                    return;
                }
                break;
            case 14:
                if (!abstractC3732.mo6679()) {
                    try {
                        long[] jArr = (long[]) field.get(obj);
                        if (abstractC3732.mo6701()) {
                            while (!abstractC3732.mo6702()) {
                                long jMo6769 = abstractC3732.mo6769();
                                if (jArr != null && i2 < jArr.length) {
                                    jArr[i2] = jMo6769;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception e13) {
                        C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e13);
                        return;
                    }
                    break;
                }
                break;
            case 15:
                Integer numMo67732 = abstractC3732.mo6773();
                if (jSONSchema != null) {
                    jSONSchema.m6215(numMo67732);
                }
                if (numMo67732 != null) {
                    try {
                        objValueOf = Byte.valueOf(numMo67732.byteValue());
                    } catch (Exception e14) {
                        C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e14);
                        return;
                    }
                }
                field.set(obj, objValueOf);
                break;
            default:
                int iMo67723 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo67723);
                }
                try {
                    field.setByte(obj, (byte) iMo67723);
                } catch (Exception e15) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e15);
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo6033(AbstractC3732 abstractC3732) {
        switch (this.f8749) {
            case 2:
                return abstractC3732.mo6672();
            case 3:
                String strMo6744 = abstractC3732.mo6744();
                char cCharAt = 0;
                if (strMo6744 != null && !strMo6744.isEmpty()) {
                    cCharAt = strMo6744.charAt(0);
                }
                return Character.valueOf(cCharAt);
            case 4:
            case 12:
            case 14:
            default:
                return super.mo6033(abstractC3732);
            case 5:
                return abstractC3732.m6691();
            case 6:
                return Double.valueOf(abstractC3732.mo6687());
            case 7:
                return abstractC3732.mo6677();
            case 8:
                return Float.valueOf(abstractC3732.mo6674());
            case 9:
                return Short.valueOf((short) abstractC3732.mo6772());
            case 10:
                return Short.valueOf((short) abstractC3732.mo6772());
            case 11:
                return abstractC3732.mo6773();
            case 13:
                return abstractC3732.mo6770();
            case 15:
                return Byte.valueOf((byte) abstractC3732.mo6772());
            case 16:
                return Byte.valueOf((byte) abstractC3732.mo6772());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3589(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field, int i2) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, field);
        this.f8749 = i2;
    }
}
