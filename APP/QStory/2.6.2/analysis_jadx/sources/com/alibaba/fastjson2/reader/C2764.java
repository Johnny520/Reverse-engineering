package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2866;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2764 extends AbstractC2761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8430;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2764(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, int i2) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field);
        this.f8430 = i2;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        int i = this.f8430;
        int i2 = 0;
        JSONSchema jSONSchema = this.f8411;
        Method method = this.f8425;
        String str = this.f8426;
        switch (i) {
            case 0:
                if (obj2 == null) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8422.get(obj);
                    if (obj2 instanceof AtomicBoolean) {
                        obj2 = Boolean.valueOf(((AtomicBoolean) obj2).get());
                    }
                    atomicBoolean.set(((Boolean) obj2).booleanValue());
                    return;
                } catch (Exception e) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e);
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
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e2);
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
                        atomicIntegerArray.set(i2, AbstractC2866.m5864(list.get(i2)));
                        i2++;
                    }
                    return;
                } catch (Exception e3) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e3);
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
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e4);
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
                        atomicLongArray.set(i2, AbstractC2866.m5864(list2.get(i2)));
                        i2++;
                    }
                    return;
                } catch (Exception e5) {
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e5);
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
                    C0276.m842(AbstractC0053.m146(new StringBuilder("set "), str, " error"), e6);
                    return;
                }
            case 6:
                AbstractC2866.m5865(obj2);
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
                float fM5862 = AbstractC2866.m5862(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5599(fM5862);
                throw null;
            case 9:
                short sM5855 = AbstractC2866.m5855(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5598(sM5855);
                throw null;
            default:
                byte bM5875 = AbstractC2866.m5875(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5598(bM5875);
                throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo5440() {
        switch (this.f8430) {
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
                return super.mo5440();
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        int i = this.f8430;
        String str = this.f8426;
        int i2 = 0;
        Method method = this.f8425;
        JSONSchema jSONSchema = this.f8411;
        switch (i) {
            case 0:
                mo5426(obj, abstractC2898.mo6066());
                return;
            case 1:
                mo5426(obj, abstractC2898.mo6066());
                return;
            case 2:
                if (abstractC2898.mo6073()) {
                    return;
                }
                try {
                    AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) method.invoke(obj, null);
                    if (abstractC2898.mo6095()) {
                        while (!abstractC2898.mo6096()) {
                            int iMo6167 = abstractC2898.mo6167();
                            if (atomicIntegerArray != null && i2 < atomicIntegerArray.length()) {
                                atomicIntegerArray.set(i2, iMo6167);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e);
                    return;
                }
            case 3:
                mo5426(obj, abstractC2898.mo6168());
                return;
            case 4:
                if (abstractC2898.mo6073()) {
                    return;
                }
                try {
                    AtomicLongArray atomicLongArray = (AtomicLongArray) method.invoke(obj, null);
                    if (abstractC2898.mo6095()) {
                        while (!abstractC2898.mo6096()) {
                            long jMo6164 = abstractC2898.mo6164();
                            if (atomicLongArray != null && i2 < atomicLongArray.length()) {
                                atomicLongArray.set(i2, jMo6164);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), str, " error", abstractC2898), e2);
                    return;
                }
            case 5:
                mo5426(obj, abstractC2898.mo6165());
                return;
            case 6:
                abstractC2898.mo6062();
                throw null;
            case 7:
                if (abstractC2898.mo6063() != 0 || !abstractC2898.f9194) {
                    throw null;
                }
                return;
            case 8:
                float fMo6068 = abstractC2898.mo6068();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5599(fMo6068);
                throw null;
            case 9:
                short sMo6167 = (short) abstractC2898.mo6167();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5598(sMo6167);
                throw null;
            default:
                byte bMo6167 = (byte) abstractC2898.mo6167();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5598(bMo6167);
                throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        switch (this.f8430) {
            case 0:
                return abstractC2898.mo6066();
            case 1:
                return abstractC2898.mo6066();
            case 2:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                return abstractC2898.mo6076(Integer.class);
            case 3:
                int iMo6167 = abstractC2898.mo6167();
                if (abstractC2898.f9194) {
                    return null;
                }
                return new AtomicInteger(iMo6167);
            case 4:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                return abstractC2898.mo6076(Long.class);
            case 5:
                long jMo6164 = abstractC2898.mo6164();
                if (abstractC2898.f9194) {
                    return null;
                }
                return new AtomicLong(jMo6164);
            case 6:
                return abstractC2898.mo6066();
            case 7:
                return abstractC2898.mo6139();
            case 8:
                return Float.valueOf(abstractC2898.mo6068());
            case 9:
                return Short.valueOf((short) abstractC2898.mo6167());
            default:
                return Byte.valueOf((byte) abstractC2898.mo6167());
        }
    }
}
