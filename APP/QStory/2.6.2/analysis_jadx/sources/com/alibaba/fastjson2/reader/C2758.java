package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2758 extends C2691 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final /* synthetic */ int f8407;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2758(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, null);
        this.f8407 = 21;
        this.f8162 = C2795.f8647;
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5426(Object obj, Object obj2) {
        switch (this.f8407) {
            case 0:
                BigDecimal bigDecimalM5869 = AbstractC2866.m5869(obj2);
                JSONSchema jSONSchema = this.f8411;
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigDecimalM5869);
                }
                try {
                    this.f8425.invoke(obj, bigDecimalM5869);
                } catch (Exception e) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM5867 = AbstractC2866.m5867(obj2);
                JSONSchema jSONSchema2 = this.f8411;
                if (jSONSchema2 != null) {
                    jSONSchema2.m5611(bigIntegerM5867);
                }
                try {
                    this.f8425.invoke(obj, bigIntegerM5867);
                } catch (Exception e2) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e2);
                    return;
                }
                break;
            case 2:
                try {
                    this.f8425.invoke(obj, AbstractC2866.m5866(obj2));
                } catch (Exception e3) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e3);
                    return;
                }
                break;
            case 3:
                try {
                    this.f8425.invoke(obj, Boolean.valueOf(AbstractC2866.m5865(obj2)));
                } catch (Exception e4) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e4);
                    return;
                }
                break;
            case 4:
                if (obj2 != null) {
                    try {
                        Collection collection = (Collection) this.f8425.invoke(obj, null);
                        if (collection == Collections.EMPTY_LIST || collection == Collections.EMPTY_SET || collection == null || collection.equals(obj2)) {
                            JSONSchema jSONSchema3 = this.f8411;
                            if (jSONSchema3 != null) {
                                jSONSchema3.m5611(collection);
                            }
                            break;
                        } else {
                            String name = collection.getClass().getName();
                            if (!"java.util.Collections$UnmodifiableRandomAccessList".equals(name) && !"java.util.Arrays$ArrayList".equals(name) && !"java.util.Collections$SingletonList".equals(name) && !name.startsWith("java.util.ImmutableCollections$") && !name.startsWith("java.util.Collections$Unmodifiable")) {
                                for (Object objMo5462 : (Collection) obj2) {
                                    if (objMo5462 == null) {
                                        collection.add(null);
                                    } else {
                                        if (objMo5462 instanceof Map) {
                                            Type type = this.f8415;
                                            if ((type instanceof Class) && !((Class) type).isAssignableFrom(objMo5462.getClass())) {
                                                if (this.f8414 == null) {
                                                    this.f8414 = AbstractC2932.m6329().m5588(this.f8415, false);
                                                }
                                                objMo5462 = this.f8414.mo5462((Map) objMo5462, 0L);
                                            }
                                        }
                                        collection.add(objMo5462);
                                    }
                                }
                                JSONSchema jSONSchema4 = this.f8411;
                                if (jSONSchema4 != null) {
                                    jSONSchema4.m5611(collection);
                                }
                                break;
                            }
                        }
                    } catch (Exception e5) {
                        C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e5);
                        return;
                    }
                }
                break;
            case 5:
                Double dM5873 = AbstractC2866.m5873(obj2);
                JSONSchema jSONSchema5 = this.f8411;
                if (jSONSchema5 != null) {
                    jSONSchema5.m5597(dM5873);
                }
                try {
                    this.f8425.invoke(obj, dM5873);
                } catch (Exception e6) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e6);
                    return;
                }
                break;
            case 6:
                double dM5872 = AbstractC2866.m5872(obj2);
                JSONSchema jSONSchema6 = this.f8411;
                if (jSONSchema6 != null) {
                    jSONSchema6.m5599(dM5872);
                }
                try {
                    this.f8425.invoke(obj, Double.valueOf(dM5872));
                } catch (Exception e7) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e7);
                    return;
                }
                break;
            case 7:
                Float fM5871 = AbstractC2866.m5871(obj2);
                JSONSchema jSONSchema7 = this.f8411;
                if (jSONSchema7 != null) {
                    jSONSchema7.m5596(fM5871);
                }
                try {
                    this.f8425.invoke(obj, fM5871);
                } catch (Exception e8) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e8);
                    return;
                }
                break;
            case 8:
                float fM5862 = AbstractC2866.m5862(obj2);
                JSONSchema jSONSchema8 = this.f8411;
                if (jSONSchema8 != null) {
                    jSONSchema8.m5599(fM5862);
                }
                try {
                    this.f8425.invoke(obj, Float.valueOf(fM5862));
                } catch (Exception e9) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e9);
                    return;
                }
                break;
            case 9:
                Short shM5856 = AbstractC2866.m5856(obj2);
                JSONSchema jSONSchema9 = this.f8411;
                if (jSONSchema9 != null) {
                    jSONSchema9.m5611(shM5856);
                }
                try {
                    this.f8425.invoke(obj, shM5856);
                } catch (Exception e10) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e10);
                    return;
                }
                break;
            case 10:
                short sM5855 = AbstractC2866.m5855(obj2);
                JSONSchema jSONSchema10 = this.f8411;
                if (jSONSchema10 != null) {
                    jSONSchema10.m5598(sM5855);
                }
                try {
                    this.f8425.invoke(obj, Short.valueOf(sM5855));
                } catch (Exception e11) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e11);
                    return;
                }
                break;
            case 11:
                Integer numM5863 = AbstractC2866.m5863(obj2);
                JSONSchema jSONSchema11 = this.f8411;
                if (jSONSchema11 != null) {
                    jSONSchema11.m5610(numM5863);
                }
                try {
                    this.f8425.invoke(obj, numM5863);
                } catch (Exception e12) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e12);
                    return;
                }
                break;
            case 12:
                int iM5864 = AbstractC2866.m5864(obj2);
                JSONSchema jSONSchema12 = this.f8411;
                if (jSONSchema12 != null) {
                    jSONSchema12.m5598(iM5864);
                }
                try {
                    this.f8425.invoke(obj, Integer.valueOf(iM5864));
                } catch (Exception e13) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e13);
                    return;
                }
                break;
            case 13:
                Long lM5859 = AbstractC2866.m5859(obj2);
                JSONSchema jSONSchema13 = this.f8411;
                if (jSONSchema13 != null) {
                    jSONSchema13.m5609(lM5859);
                }
                try {
                    this.f8425.invoke(obj, lM5859);
                } catch (Exception e14) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e14);
                    return;
                }
                break;
            case 14:
                long jM5860 = AbstractC2866.m5860(obj2);
                JSONSchema jSONSchema14 = this.f8411;
                if (jSONSchema14 != null) {
                    jSONSchema14.m5598(jM5860);
                }
                try {
                    this.f8425.invoke(obj, Long.valueOf(jM5860));
                } catch (Exception e15) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e15);
                    return;
                }
                break;
            case 15:
                Byte bM5876 = AbstractC2866.m5876(obj2);
                JSONSchema jSONSchema15 = this.f8411;
                if (jSONSchema15 != null) {
                    jSONSchema15.m5611(bM5876);
                }
                try {
                    this.f8425.invoke(obj, bM5876);
                } catch (Exception e16) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e16);
                    return;
                }
                break;
            case 16:
                byte bM5875 = AbstractC2866.m5875(obj2);
                JSONSchema jSONSchema16 = this.f8411;
                if (jSONSchema16 != null) {
                    jSONSchema16.m5598(bM5875);
                }
                try {
                    this.f8425.invoke(obj, Byte.valueOf(bM5875));
                } catch (Exception e17) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e17);
                    return;
                }
                break;
            case 17:
            case 19:
            default:
                super.mo5426(obj, obj2);
                break;
            case 18:
                Type type2 = this.f8421;
                if (type2 == Float.class) {
                    obj2 = AbstractC2866.m5871(obj2);
                } else if (type2 == Double.class) {
                    obj2 = AbstractC2866.m5873(obj2);
                }
                if (obj2 != null || this.f8427 != StackTraceElement[].class) {
                    JSONSchema jSONSchema17 = this.f8411;
                    if (jSONSchema17 != null) {
                        jSONSchema17.m5611(obj2);
                    }
                    this.f8161.accept(obj, obj2);
                }
                break;
            case 20:
                JSONSchema jSONSchema18 = this.f8411;
                if (jSONSchema18 != null) {
                    jSONSchema18.m5611(obj2);
                }
                if (obj2 != null || (this.f8420 & JSONReader$Feature.IgnoreSetNullValue.mask) == 0) {
                    if (obj2 instanceof Collection) {
                        Collection collection2 = (Collection) obj2;
                        Iterator it = collection2.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            if (it.next() == null) {
                                i++;
                            }
                        }
                        if (i == collection2.size()) {
                            obj2 = new StackTraceElement[0];
                        } else {
                            StackTraceElement[] stackTraceElementArr = new StackTraceElement[collection2.size()];
                            collection2.toArray(stackTraceElementArr);
                            obj2 = stackTraceElementArr;
                        }
                    }
                    this.f8161.accept(obj, obj2);
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo5440() {
        switch (this.f8407) {
            case 4:
                return true;
            default:
                return super.mo5440();
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo5427(AbstractC2898 abstractC2898, Object obj) {
        int i = this.f8407;
        Object objValueOf = null;
        String str = this.f8424;
        JSONSchema jSONSchema = this.f8411;
        String str2 = this.f8426;
        Method method = this.f8425;
        switch (i) {
            case 0:
                BigDecimal bigDecimalMo6065 = abstractC2898.mo6065();
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigDecimalMo6065);
                }
                try {
                    method.invoke(obj, bigDecimalMo6065);
                } catch (Exception e) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerMo6064 = abstractC2898.mo6064();
                if (jSONSchema != null) {
                    jSONSchema.m5611(bigIntegerMo6064);
                }
                try {
                    method.invoke(obj, bigIntegerMo6064);
                } catch (Exception e2) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e2);
                    return;
                }
                break;
            case 2:
                Boolean boolMo6066 = abstractC2898.mo6066();
                if (jSONSchema != null) {
                    jSONSchema.m5611(boolMo6066);
                }
                try {
                    method.invoke(obj, boolMo6066);
                } catch (Exception e3) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e3);
                    return;
                }
                break;
            case 3:
                try {
                    method.invoke(obj, Boolean.valueOf(abstractC2898.mo6062()));
                } catch (Exception e4) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e4);
                    return;
                }
                break;
            case 4:
                if (this.f8162 == null) {
                    this.f8162 = abstractC2898.f9199.m6353(this.f8421);
                }
                boolean z = abstractC2898.f9197;
                InterfaceC2787 interfaceC2787 = this.f8162;
                Type type = this.f8421;
                mo5426(obj, z ? interfaceC2787.mo5422(abstractC2898, type, this.f8426, 0L) : interfaceC2787.mo5418(abstractC2898, type, this.f8426, 0L));
                break;
            case 5:
                Double dM6085 = abstractC2898.m6085();
                if (jSONSchema != null) {
                    jSONSchema.m5597(dM6085);
                }
                if (dM6085 != null || this.f8413 == null) {
                    try {
                        method.invoke(obj, dM6085);
                    } catch (Exception e5) {
                        C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e5);
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
                    method.invoke(obj, Double.valueOf(dMo6081));
                } catch (Exception e6) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e6);
                    return;
                }
                break;
            case 7:
                Float fMo6071 = abstractC2898.mo6071();
                if (jSONSchema != null) {
                    jSONSchema.m5596(fMo6071);
                }
                try {
                    method.invoke(obj, fMo6071);
                } catch (Exception e7) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e7);
                    return;
                }
                break;
            case 8:
                float fMo6068 = abstractC2898.mo6068();
                if (jSONSchema != null) {
                    jSONSchema.m5599(fMo6068);
                }
                try {
                    method.invoke(obj, Float.valueOf(fMo6068));
                } catch (Exception e8) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e8);
                    return;
                }
                break;
            case 9:
                Integer numMo6168 = abstractC2898.mo6168();
                if (jSONSchema != null) {
                    jSONSchema.m5610(numMo6168);
                }
                if (numMo6168 != null) {
                    try {
                        objValueOf = Short.valueOf(numMo6168.shortValue());
                    } catch (Exception e9) {
                        C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e9);
                        return;
                    }
                }
                method.invoke(obj, objValueOf);
                break;
            case 10:
                int iMo6167 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo6167);
                }
                try {
                    method.invoke(obj, Short.valueOf((short) iMo6167));
                } catch (Exception e10) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e10);
                    return;
                }
                break;
            case 11:
                Integer numMo61682 = abstractC2898.mo6168();
                if (jSONSchema != null) {
                    jSONSchema.m5610(numMo61682);
                }
                try {
                    method.invoke(obj, numMo61682);
                } catch (Exception e11) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e11);
                    return;
                }
                break;
            case 12:
                int iMo61672 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo61672);
                }
                try {
                    method.invoke(obj, Integer.valueOf(iMo61672));
                } catch (Exception e12) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e12);
                    return;
                }
                break;
            case 13:
                Long lMo6165 = abstractC2898.mo6165();
                if (jSONSchema != null) {
                    jSONSchema.m5609(lMo6165);
                }
                try {
                    method.invoke(obj, lMo6165);
                } catch (Exception e13) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e13);
                    return;
                }
                break;
            case 14:
                long jMo6164 = abstractC2898.mo6164();
                if (jSONSchema != null) {
                    jSONSchema.m5598(jMo6164);
                }
                try {
                    method.invoke(obj, Long.valueOf(jMo6164));
                } catch (Exception e14) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e14);
                    return;
                }
                break;
            case 15:
                Integer numMo61683 = abstractC2898.mo6168();
                if (jSONSchema != null) {
                    jSONSchema.m5610(numMo61683);
                }
                if (numMo61683 != null) {
                    try {
                        objValueOf = Byte.valueOf(numMo61683.byteValue());
                    } catch (Exception e15) {
                        C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e15);
                        return;
                    }
                }
                method.invoke(obj, objValueOf);
                break;
            case 16:
                int iMo61673 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo61673);
                }
                try {
                    method.invoke(obj, Byte.valueOf((byte) iMo61673));
                } catch (Exception e16) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str2, " error", abstractC2898), e16);
                    return;
                }
                break;
            case 17:
                mo5426(obj, abstractC2898.f9197 ? (LocalDate) this.f8162.mo5422(abstractC2898, this.f8421, this.f8426, this.f8420) : str != null ? (LocalDate) this.f8162.mo5418(abstractC2898, this.f8421, this.f8426, this.f8420) : abstractC2898.mo6181());
                break;
            case 18:
            case 20:
            default:
                super.mo5427(abstractC2898, obj);
                break;
            case 19:
                mo5426(obj, str != null ? (OffsetDateTime) this.f8162.mo5423(abstractC2898) : abstractC2898.mo6146());
                break;
            case 21:
                mo5426(obj, abstractC2898.mo6140());
                break;
            case 22:
                mo5426(obj, abstractC2898.mo6198());
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo5436(AbstractC2898 abstractC2898, Object obj) {
        int i = this.f8407;
        JSONSchema jSONSchema = this.f8411;
        String str = this.f8426;
        Method method = this.f8425;
        switch (i) {
            case 3:
                try {
                    method.invoke(obj, Boolean.valueOf(abstractC2898.mo6062()));
                } catch (Exception e) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e);
                    return;
                }
                break;
            case 4:
            case 5:
            case 7:
            case 9:
            case 15:
            default:
                super.mo5436(abstractC2898, obj);
                break;
            case 6:
                double dMo6081 = abstractC2898.mo6081();
                if (jSONSchema != null) {
                    jSONSchema.m5599(dMo6081);
                }
                try {
                    method.invoke(obj, Double.valueOf(dMo6081));
                } catch (Exception e2) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e2);
                    return;
                }
                break;
            case 8:
                float fMo6068 = abstractC2898.mo6068();
                if (jSONSchema != null) {
                    jSONSchema.m5599(fMo6068);
                }
                try {
                    method.invoke(obj, Float.valueOf(fMo6068));
                } catch (Exception e3) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e3);
                    return;
                }
                break;
            case 10:
                int iMo6167 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo6167);
                }
                try {
                    method.invoke(obj, Short.valueOf((short) iMo6167));
                } catch (Exception e4) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e4);
                    return;
                }
                break;
            case 11:
                Integer numMo6168 = abstractC2898.mo6168();
                if (jSONSchema != null) {
                    jSONSchema.m5610(numMo6168);
                }
                try {
                    method.invoke(obj, numMo6168);
                } catch (Exception e5) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e5);
                    return;
                }
                break;
            case 12:
                int iMo61672 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo61672);
                }
                try {
                    method.invoke(obj, Integer.valueOf(iMo61672));
                } catch (Exception e6) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e6);
                    return;
                }
                break;
            case 13:
                Long lMo6165 = abstractC2898.mo6165();
                if (jSONSchema != null) {
                    jSONSchema.m5609(lMo6165);
                }
                try {
                    method.invoke(obj, lMo6165);
                } catch (Exception e7) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e7);
                    return;
                }
                break;
            case 14:
                long jMo6164 = abstractC2898.mo6164();
                if (jSONSchema != null) {
                    jSONSchema.m5598(jMo6164);
                }
                try {
                    method.invoke(obj, Long.valueOf(jMo6164));
                } catch (Exception e8) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e8);
                    return;
                }
                break;
            case 16:
                int iMo61673 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo61673);
                }
                try {
                    method.invoke(obj, Byte.valueOf((byte) iMo61673));
                } catch (Exception e9) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e9);
                    return;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo5428(AbstractC2898 abstractC2898) {
        switch (this.f8407) {
            case 3:
                return abstractC2898.mo6066();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 13:
            default:
                return super.mo5428(abstractC2898);
            case 9:
                return abstractC2898.mo6168();
            case 10:
                return Integer.valueOf(abstractC2898.mo6167());
            case 11:
                return abstractC2898.mo6168();
            case 12:
                return Integer.valueOf(abstractC2898.mo6167());
            case 14:
                return Long.valueOf(abstractC2898.mo6164());
            case 15:
                return abstractC2898.mo6168();
            case 16:
                return Byte.valueOf((byte) abstractC2898.mo6167());
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public InterfaceC2787 mo5450(AbstractC2898 abstractC2898) {
        switch (this.f8407) {
            case 17:
                return this.f8162;
            case 18:
            case 20:
            default:
                return super.mo5450(abstractC2898);
            case 19:
                return this.f8162;
            case 21:
                return this.f8162;
            case 22:
                return this.f8162;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC2787 mo5451(C2942 c2942) {
        switch (this.f8407) {
            case 17:
                return this.f8162;
            case 18:
            case 20:
            default:
                return super.mo5451(c2942);
            case 19:
                return this.f8162;
            case 21:
                return this.f8162;
            case 22:
                return this.f8162;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2758(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, int i2) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8407 = i2;
    }
}
