package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3598 extends AbstractC3595 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8777;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3598(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, int i2) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field);
        this.f8777 = i2;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        int i = this.f8777;
        int i2 = 0;
        JSONSchema jSONSchema = this.f8758;
        Method method = this.f8772;
        String str = this.f8773;
        switch (i) {
            case 0:
                if (obj2 == null) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8769.get(obj);
                    if (obj2 instanceof AtomicBoolean) {
                        obj2 = Boolean.valueOf(((AtomicBoolean) obj2).get());
                    }
                    atomicBoolean.set(((Boolean) obj2).booleanValue());
                    return;
                } catch (Exception e) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e);
                    return;
                }
            case 1:
                if (obj2 == null) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean2 = (AtomicBoolean) method.invoke(obj, null);
                    if (obj2 instanceof AtomicBoolean) {
                        obj2 = Boolean.valueOf(((AtomicBoolean) obj2).get());
                    }
                    atomicBoolean2.set(((Boolean) obj2).booleanValue());
                    return;
                } catch (Exception e2) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e2);
                    return;
                }
            case 2:
                if (obj2 == null) {
                    return;
                }
                try {
                    AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) method.invoke(obj, null);
                    if (obj2 instanceof AtomicIntegerArray) {
                        AtomicIntegerArray atomicIntegerArray2 = (AtomicIntegerArray) obj2;
                        while (i2 < atomicIntegerArray2.length()) {
                            atomicIntegerArray.set(i2, atomicIntegerArray2.get(i2));
                            i2++;
                        }
                        return;
                    }
                    List list = (List) obj2;
                    while (i2 < list.size()) {
                        atomicIntegerArray.set(i2, AbstractC3700.m6469(list.get(i2)));
                        i2++;
                    }
                    return;
                } catch (Exception e3) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e3);
                    return;
                }
            case 3:
                if (obj2 == null) {
                    return;
                }
                try {
                    ((AtomicInteger) method.invoke(obj, null)).set(((Number) obj2).intValue());
                    return;
                } catch (Exception e4) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e4);
                    return;
                }
            case 4:
                if (obj2 == null) {
                    return;
                }
                try {
                    AtomicLongArray atomicLongArray = (AtomicLongArray) method.invoke(obj, null);
                    if (obj2 instanceof AtomicLongArray) {
                        AtomicLongArray atomicLongArray2 = (AtomicLongArray) obj2;
                        while (i2 < atomicLongArray2.length()) {
                            atomicLongArray.set(i2, atomicLongArray2.get(i2));
                            i2++;
                        }
                        return;
                    }
                    List list2 = (List) obj2;
                    while (i2 < list2.size()) {
                        atomicLongArray.set(i2, AbstractC3700.m6469(list2.get(i2)));
                        i2++;
                    }
                    return;
                } catch (Exception e5) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e5);
                    return;
                }
            case 5:
                if (obj2 == null) {
                    return;
                }
                try {
                    ((AtomicLong) method.invoke(obj, null)).set(((Number) obj2).longValue());
                    return;
                } catch (Exception e6) {
                    C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), str, " error"), e6);
                    return;
                }
            case 6:
                AbstractC3700.m6470(obj2);
                throw null;
            case 7:
                if (obj2 instanceof String) {
                    ((String) obj2).charAt(0);
                    throw null;
                }
                if (!(obj2 instanceof Character)) {
                    throw new JSONException("cast to char error");
                }
                throw null;
            case 8:
                float fM6467 = AbstractC3700.m6467(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m6204(fM6467);
                throw null;
            case 9:
                short sM6460 = AbstractC3700.m6460(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m6203(sM6460);
                throw null;
            default:
                byte bM6480 = AbstractC3700.m6480(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m6203(bM6480);
                throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo6045() {
        switch (this.f8777) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            default:
                return super.mo6045();
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        int i = this.f8777;
        String str = this.f8773;
        int i2 = 0;
        Method method = this.f8772;
        JSONSchema jSONSchema = this.f8758;
        switch (i) {
            case 0:
                mo6031(obj, abstractC3732.mo6672());
                return;
            case 1:
                mo6031(obj, abstractC3732.mo6672());
                return;
            case 2:
                if (abstractC3732.mo6679()) {
                    return;
                }
                try {
                    AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) method.invoke(obj, null);
                    if (abstractC3732.mo6701()) {
                        while (!abstractC3732.mo6702()) {
                            int iMo6772 = abstractC3732.mo6772();
                            if (atomicIntegerArray != null && i2 < atomicIntegerArray.length()) {
                                atomicIntegerArray.set(i2, iMo6772);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e);
                    return;
                }
            case 3:
                mo6031(obj, abstractC3732.mo6773());
                return;
            case 4:
                if (abstractC3732.mo6679()) {
                    return;
                }
                try {
                    AtomicLongArray atomicLongArray = (AtomicLongArray) method.invoke(obj, null);
                    if (abstractC3732.mo6701()) {
                        while (!abstractC3732.mo6702()) {
                            long jMo6769 = abstractC3732.mo6769();
                            if (atomicLongArray != null && i2 < atomicLongArray.length()) {
                                atomicLongArray.set(i2, jMo6769);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), str, " error", abstractC3732), e2);
                    return;
                }
            case 5:
                mo6031(obj, abstractC3732.mo6770());
                return;
            case 6:
                abstractC3732.mo6668();
                throw null;
            case 7:
                if (abstractC3732.mo6669() != 0 || !abstractC3732.f9541) {
                    throw null;
                }
                return;
            case 8:
                float fMo6674 = abstractC3732.mo6674();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m6204(fMo6674);
                throw null;
            case 9:
                short sMo6772 = (short) abstractC3732.mo6772();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m6203(sMo6772);
                throw null;
            default:
                byte bMo6772 = (byte) abstractC3732.mo6772();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m6203(bMo6772);
                throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        switch (this.f8777) {
            case 0:
                return abstractC3732.mo6672();
            case 1:
                return abstractC3732.mo6672();
            case 2:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return abstractC3732.mo6682(Integer.class);
            case 3:
                int iMo6772 = abstractC3732.mo6772();
                if (abstractC3732.f9541) {
                    return null;
                }
                return new AtomicInteger(iMo6772);
            case 4:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return abstractC3732.mo6682(Long.class);
            case 5:
                long jMo6769 = abstractC3732.mo6769();
                if (abstractC3732.f9541) {
                    return null;
                }
                return new AtomicLong(jMo6769);
            case 6:
                return abstractC3732.mo6672();
            case 7:
                return abstractC3732.mo6744();
            case 8:
                return Float.valueOf(abstractC3732.mo6674());
            case 9:
                return Short.valueOf((short) abstractC3732.mo6772());
            default:
                return Byte.valueOf((byte) abstractC3732.mo6772());
        }
    }
}
