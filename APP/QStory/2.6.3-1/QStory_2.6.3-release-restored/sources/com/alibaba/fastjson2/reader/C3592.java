package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3592 extends C3525 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final /* synthetic */ int f8754;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3592(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, null);
        this.f8754 = 21;
        this.f8509 = C3629.f8994;
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6031(Object obj, Object obj2) {
        switch (this.f8754) {
            case 0:
                BigDecimal bigDecimalM6474 = AbstractC3700.m6474(obj2);
                JSONSchema jSONSchema = this.f8758;
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigDecimalM6474);
                }
                try {
                    this.f8772.invoke(obj, bigDecimalM6474);
                } catch (Exception e) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerM6472 = AbstractC3700.m6472(obj2);
                JSONSchema jSONSchema2 = this.f8758;
                if (jSONSchema2 != null) {
                    jSONSchema2.m6216(bigIntegerM6472);
                }
                try {
                    this.f8772.invoke(obj, bigIntegerM6472);
                } catch (Exception e2) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e2);
                    return;
                }
                break;
            case 2:
                try {
                    this.f8772.invoke(obj, AbstractC3700.m6471(obj2));
                } catch (Exception e3) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e3);
                    return;
                }
                break;
            case 3:
                try {
                    this.f8772.invoke(obj, Boolean.valueOf(AbstractC3700.m6470(obj2)));
                } catch (Exception e4) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e4);
                    return;
                }
                break;
            case 4:
                if (obj2 != null) {
                    try {
                        Collection collection = (Collection) this.f8772.invoke(obj, null);
                        if (collection == Collections.EMPTY_LIST || collection == Collections.EMPTY_SET || collection == null || collection.equals(obj2)) {
                            JSONSchema jSONSchema3 = this.f8758;
                            if (jSONSchema3 != null) {
                                jSONSchema3.m6216(collection);
                            }
                            break;
                        } else {
                            String name = collection.getClass().getName();
                            if (!"java.util.Collections$UnmodifiableRandomAccessList".equals(name) && !"java.util.Arrays$ArrayList".equals(name) && !"java.util.Collections$SingletonList".equals(name) && !name.startsWith("java.util.ImmutableCollections$") && !name.startsWith("java.util.Collections$Unmodifiable")) {
                                for (Object objMo6067 : (Collection) obj2) {
                                    if (objMo6067 == null) {
                                        collection.add(null);
                                    } else {
                                        if (objMo6067 instanceof Map) {
                                            Type type = this.f8762;
                                            if ((type instanceof Class) && !((Class) type).isAssignableFrom(objMo6067.getClass())) {
                                                if (this.f8761 == null) {
                                                    this.f8761 = AbstractC3766.m6947().m6193(this.f8762, false);
                                                }
                                                objMo6067 = this.f8761.mo6067((Map) objMo6067, 0L);
                                            }
                                        }
                                        collection.add(objMo6067);
                                    }
                                }
                                JSONSchema jSONSchema4 = this.f8758;
                                if (jSONSchema4 != null) {
                                    jSONSchema4.m6216(collection);
                                }
                                break;
                            }
                        }
                    } catch (Exception e5) {
                        C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e5);
                        return;
                    }
                }
                break;
            case 5:
                Double dM6478 = AbstractC3700.m6478(obj2);
                JSONSchema jSONSchema5 = this.f8758;
                if (jSONSchema5 != null) {
                    jSONSchema5.m6202(dM6478);
                }
                try {
                    this.f8772.invoke(obj, dM6478);
                } catch (Exception e6) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e6);
                    return;
                }
                break;
            case 6:
                double dM6477 = AbstractC3700.m6477(obj2);
                JSONSchema jSONSchema6 = this.f8758;
                if (jSONSchema6 != null) {
                    jSONSchema6.m6204(dM6477);
                }
                try {
                    this.f8772.invoke(obj, Double.valueOf(dM6477));
                } catch (Exception e7) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e7);
                    return;
                }
                break;
            case 7:
                Float fM6476 = AbstractC3700.m6476(obj2);
                JSONSchema jSONSchema7 = this.f8758;
                if (jSONSchema7 != null) {
                    jSONSchema7.m6201(fM6476);
                }
                try {
                    this.f8772.invoke(obj, fM6476);
                } catch (Exception e8) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e8);
                    return;
                }
                break;
            case 8:
                float fM6467 = AbstractC3700.m6467(obj2);
                JSONSchema jSONSchema8 = this.f8758;
                if (jSONSchema8 != null) {
                    jSONSchema8.m6204(fM6467);
                }
                try {
                    this.f8772.invoke(obj, Float.valueOf(fM6467));
                } catch (Exception e9) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e9);
                    return;
                }
                break;
            case 9:
                Short shM6461 = AbstractC3700.m6461(obj2);
                JSONSchema jSONSchema9 = this.f8758;
                if (jSONSchema9 != null) {
                    jSONSchema9.m6216(shM6461);
                }
                try {
                    this.f8772.invoke(obj, shM6461);
                } catch (Exception e10) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e10);
                    return;
                }
                break;
            case 10:
                short sM6460 = AbstractC3700.m6460(obj2);
                JSONSchema jSONSchema10 = this.f8758;
                if (jSONSchema10 != null) {
                    jSONSchema10.m6203(sM6460);
                }
                try {
                    this.f8772.invoke(obj, Short.valueOf(sM6460));
                } catch (Exception e11) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e11);
                    return;
                }
                break;
            case 11:
                Integer numM6468 = AbstractC3700.m6468(obj2);
                JSONSchema jSONSchema11 = this.f8758;
                if (jSONSchema11 != null) {
                    jSONSchema11.m6215(numM6468);
                }
                try {
                    this.f8772.invoke(obj, numM6468);
                } catch (Exception e12) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e12);
                    return;
                }
                break;
            case 12:
                int iM6469 = AbstractC3700.m6469(obj2);
                JSONSchema jSONSchema12 = this.f8758;
                if (jSONSchema12 != null) {
                    jSONSchema12.m6203(iM6469);
                }
                try {
                    this.f8772.invoke(obj, Integer.valueOf(iM6469));
                } catch (Exception e13) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e13);
                    return;
                }
                break;
            case 13:
                Long lM6464 = AbstractC3700.m6464(obj2);
                JSONSchema jSONSchema13 = this.f8758;
                if (jSONSchema13 != null) {
                    jSONSchema13.m6214(lM6464);
                }
                try {
                    this.f8772.invoke(obj, lM6464);
                } catch (Exception e14) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e14);
                    return;
                }
                break;
            case 14:
                long jM6465 = AbstractC3700.m6465(obj2);
                JSONSchema jSONSchema14 = this.f8758;
                if (jSONSchema14 != null) {
                    jSONSchema14.m6203(jM6465);
                }
                try {
                    this.f8772.invoke(obj, Long.valueOf(jM6465));
                } catch (Exception e15) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e15);
                    return;
                }
                break;
            case 15:
                Byte bM6481 = AbstractC3700.m6481(obj2);
                JSONSchema jSONSchema15 = this.f8758;
                if (jSONSchema15 != null) {
                    jSONSchema15.m6216(bM6481);
                }
                try {
                    this.f8772.invoke(obj, bM6481);
                } catch (Exception e16) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e16);
                    return;
                }
                break;
            case 16:
                byte bM6480 = AbstractC3700.m6480(obj2);
                JSONSchema jSONSchema16 = this.f8758;
                if (jSONSchema16 != null) {
                    jSONSchema16.m6203(bM6480);
                }
                try {
                    this.f8772.invoke(obj, Byte.valueOf(bM6480));
                } catch (Exception e17) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e17);
                    return;
                }
                break;
            case 17:
            case 19:
            default:
                super.mo6031(obj, obj2);
                break;
            case 18:
                Type type2 = this.f8768;
                if (type2 == Float.class) {
                    obj2 = AbstractC3700.m6476(obj2);
                } else if (type2 == Double.class) {
                    obj2 = AbstractC3700.m6478(obj2);
                }
                if (obj2 != null || this.f8774 != StackTraceElement[].class) {
                    JSONSchema jSONSchema17 = this.f8758;
                    if (jSONSchema17 != null) {
                        jSONSchema17.m6216(obj2);
                    }
                    this.f8508.accept(obj, obj2);
                }
                break;
            case 20:
                JSONSchema jSONSchema18 = this.f8758;
                if (jSONSchema18 != null) {
                    jSONSchema18.m6216(obj2);
                }
                if (obj2 != null || (this.f8767 & JSONReader$Feature.IgnoreSetNullValue.mask) == 0) {
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
                    this.f8508.accept(obj, obj2);
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo6045() {
        switch (this.f8754) {
            case 4:
                return true;
            default:
                return super.mo6045();
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo6032(AbstractC3732 abstractC3732, Object obj) {
        int i = this.f8754;
        Object objValueOf = null;
        String str = this.f8771;
        JSONSchema jSONSchema = this.f8758;
        String str2 = this.f8773;
        Method method = this.f8772;
        switch (i) {
            case 0:
                BigDecimal bigDecimalMo6671 = abstractC3732.mo6671();
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigDecimalMo6671);
                }
                try {
                    method.invoke(obj, bigDecimalMo6671);
                } catch (Exception e) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e);
                    return;
                }
                break;
            case 1:
                BigInteger bigIntegerMo6670 = abstractC3732.mo6670();
                if (jSONSchema != null) {
                    jSONSchema.m6216(bigIntegerMo6670);
                }
                try {
                    method.invoke(obj, bigIntegerMo6670);
                } catch (Exception e2) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e2);
                    return;
                }
                break;
            case 2:
                Boolean boolMo6672 = abstractC3732.mo6672();
                if (jSONSchema != null) {
                    jSONSchema.m6216(boolMo6672);
                }
                try {
                    method.invoke(obj, boolMo6672);
                } catch (Exception e3) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e3);
                    return;
                }
                break;
            case 3:
                try {
                    method.invoke(obj, Boolean.valueOf(abstractC3732.mo6668()));
                } catch (Exception e4) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e4);
                    return;
                }
                break;
            case 4:
                if (this.f8509 == null) {
                    this.f8509 = abstractC3732.f9546.m6971(this.f8768);
                }
                boolean z = abstractC3732.f9544;
                InterfaceC3621 interfaceC3621 = this.f8509;
                Type type = this.f8768;
                mo6031(obj, z ? interfaceC3621.mo6027(abstractC3732, type, this.f8773, 0L) : interfaceC3621.mo6023(abstractC3732, type, this.f8773, 0L));
                break;
            case 5:
                Double dM6691 = abstractC3732.m6691();
                if (jSONSchema != null) {
                    jSONSchema.m6202(dM6691);
                }
                if (dM6691 != null || this.f8760 == null) {
                    try {
                        method.invoke(obj, dM6691);
                    } catch (Exception e5) {
                        C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e5);
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
                    method.invoke(obj, Double.valueOf(dMo6687));
                } catch (Exception e6) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e6);
                    return;
                }
                break;
            case 7:
                Float fMo6677 = abstractC3732.mo6677();
                if (jSONSchema != null) {
                    jSONSchema.m6201(fMo6677);
                }
                try {
                    method.invoke(obj, fMo6677);
                } catch (Exception e7) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e7);
                    return;
                }
                break;
            case 8:
                float fMo6674 = abstractC3732.mo6674();
                if (jSONSchema != null) {
                    jSONSchema.m6204(fMo6674);
                }
                try {
                    method.invoke(obj, Float.valueOf(fMo6674));
                } catch (Exception e8) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e8);
                    return;
                }
                break;
            case 9:
                Integer numMo6773 = abstractC3732.mo6773();
                if (jSONSchema != null) {
                    jSONSchema.m6215(numMo6773);
                }
                if (numMo6773 != null) {
                    try {
                        objValueOf = Short.valueOf(numMo6773.shortValue());
                    } catch (Exception e9) {
                        C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e9);
                        return;
                    }
                }
                method.invoke(obj, objValueOf);
                break;
            case 10:
                int iMo6772 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo6772);
                }
                try {
                    method.invoke(obj, Short.valueOf((short) iMo6772));
                } catch (Exception e10) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e10);
                    return;
                }
                break;
            case 11:
                Integer numMo67732 = abstractC3732.mo6773();
                if (jSONSchema != null) {
                    jSONSchema.m6215(numMo67732);
                }
                try {
                    method.invoke(obj, numMo67732);
                } catch (Exception e11) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e11);
                    return;
                }
                break;
            case 12:
                int iMo67722 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo67722);
                }
                try {
                    method.invoke(obj, Integer.valueOf(iMo67722));
                } catch (Exception e12) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e12);
                    return;
                }
                break;
            case 13:
                Long lMo6770 = abstractC3732.mo6770();
                if (jSONSchema != null) {
                    jSONSchema.m6214(lMo6770);
                }
                try {
                    method.invoke(obj, lMo6770);
                } catch (Exception e13) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e13);
                    return;
                }
                break;
            case 14:
                long jMo6769 = abstractC3732.mo6769();
                if (jSONSchema != null) {
                    jSONSchema.m6203(jMo6769);
                }
                try {
                    method.invoke(obj, Long.valueOf(jMo6769));
                } catch (Exception e14) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e14);
                    return;
                }
                break;
            case 15:
                Integer numMo67733 = abstractC3732.mo6773();
                if (jSONSchema != null) {
                    jSONSchema.m6215(numMo67733);
                }
                if (numMo67733 != null) {
                    try {
                        objValueOf = Byte.valueOf(numMo67733.byteValue());
                    } catch (Exception e15) {
                        C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e15);
                        return;
                    }
                }
                method.invoke(obj, objValueOf);
                break;
            case 16:
                int iMo67723 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo67723);
                }
                try {
                    method.invoke(obj, Byte.valueOf((byte) iMo67723));
                } catch (Exception e16) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str2, " error", abstractC3732), e16);
                    return;
                }
                break;
            case 17:
                mo6031(obj, abstractC3732.f9544 ? (LocalDate) this.f8509.mo6027(abstractC3732, this.f8768, this.f8773, this.f8767) : str != null ? (LocalDate) this.f8509.mo6023(abstractC3732, this.f8768, this.f8773, this.f8767) : abstractC3732.mo6786());
                break;
            case 18:
            case 20:
            default:
                super.mo6032(abstractC3732, obj);
                break;
            case 19:
                mo6031(obj, str != null ? (OffsetDateTime) this.f8509.mo6028(abstractC3732) : abstractC3732.mo6751());
                break;
            case 21:
                mo6031(obj, abstractC3732.mo6745());
                break;
            case 22:
                mo6031(obj, abstractC3732.mo6803());
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo6041(AbstractC3732 abstractC3732, Object obj) {
        int i = this.f8754;
        JSONSchema jSONSchema = this.f8758;
        String str = this.f8773;
        Method method = this.f8772;
        switch (i) {
            case 3:
                try {
                    method.invoke(obj, Boolean.valueOf(abstractC3732.mo6668()));
                } catch (Exception e) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e);
                    return;
                }
                break;
            case 4:
            case 5:
            case 7:
            case 9:
            case 15:
            default:
                super.mo6041(abstractC3732, obj);
                break;
            case 6:
                double dMo6687 = abstractC3732.mo6687();
                if (jSONSchema != null) {
                    jSONSchema.m6204(dMo6687);
                }
                try {
                    method.invoke(obj, Double.valueOf(dMo6687));
                } catch (Exception e2) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e2);
                    return;
                }
                break;
            case 8:
                float fMo6674 = abstractC3732.mo6674();
                if (jSONSchema != null) {
                    jSONSchema.m6204(fMo6674);
                }
                try {
                    method.invoke(obj, Float.valueOf(fMo6674));
                } catch (Exception e3) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e3);
                    return;
                }
                break;
            case 10:
                int iMo6772 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo6772);
                }
                try {
                    method.invoke(obj, Short.valueOf((short) iMo6772));
                } catch (Exception e4) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e4);
                    return;
                }
                break;
            case 11:
                Integer numMo6773 = abstractC3732.mo6773();
                if (jSONSchema != null) {
                    jSONSchema.m6215(numMo6773);
                }
                try {
                    method.invoke(obj, numMo6773);
                } catch (Exception e5) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e5);
                    return;
                }
                break;
            case 12:
                int iMo67722 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo67722);
                }
                try {
                    method.invoke(obj, Integer.valueOf(iMo67722));
                } catch (Exception e6) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e6);
                    return;
                }
                break;
            case 13:
                Long lMo6770 = abstractC3732.mo6770();
                if (jSONSchema != null) {
                    jSONSchema.m6214(lMo6770);
                }
                try {
                    method.invoke(obj, lMo6770);
                } catch (Exception e7) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e7);
                    return;
                }
                break;
            case 14:
                long jMo6769 = abstractC3732.mo6769();
                if (jSONSchema != null) {
                    jSONSchema.m6203(jMo6769);
                }
                try {
                    method.invoke(obj, Long.valueOf(jMo6769));
                } catch (Exception e8) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e8);
                    return;
                }
                break;
            case 16:
                int iMo67723 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo67723);
                }
                try {
                    method.invoke(obj, Byte.valueOf((byte) iMo67723));
                } catch (Exception e9) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e9);
                    return;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo6033(AbstractC3732 abstractC3732) {
        switch (this.f8754) {
            case 3:
                return abstractC3732.mo6672();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 13:
            default:
                return super.mo6033(abstractC3732);
            case 9:
                return abstractC3732.mo6773();
            case 10:
                return Integer.valueOf(abstractC3732.mo6772());
            case 11:
                return abstractC3732.mo6773();
            case 12:
                return Integer.valueOf(abstractC3732.mo6772());
            case 14:
                return Long.valueOf(abstractC3732.mo6769());
            case 15:
                return abstractC3732.mo6773();
            case 16:
                return Byte.valueOf((byte) abstractC3732.mo6772());
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public InterfaceC3621 mo6055(AbstractC3732 abstractC3732) {
        switch (this.f8754) {
            case 17:
                return this.f8509;
            case 18:
            case 20:
            default:
                return super.mo6055(abstractC3732);
            case 19:
                return this.f8509;
            case 21:
                return this.f8509;
            case 22:
                return this.f8509;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC3621 mo6056(C3776 c3776) {
        switch (this.f8754) {
            case 17:
                return this.f8509;
            case 18:
            case 20:
            default:
                return super.mo6056(c3776);
            case 19:
                return this.f8509;
            case 21:
                return this.f8509;
            case 22:
                return this.f8509;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3592(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, int i2) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8754 = i2;
    }
}
