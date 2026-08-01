package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2867;
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
public final class C2765 extends AbstractC2762 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8432;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2765(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, int i2) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field);
        this.f8432 = i2;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        int i = this.f8432;
        int i2 = 0;
        JSONSchema jSONSchema = this.f8413;
        Method method = this.f8427;
        String str = this.f8428;
        switch (i) {
            case 0:
                if (obj2 == null) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8424.get(obj);
                    if (obj2 instanceof AtomicBoolean) {
                        obj2 = Boolean.valueOf(((AtomicBoolean) obj2).get());
                    }
                    atomicBoolean.set(((Boolean) obj2).booleanValue());
                    return;
                } catch (Exception e) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e);
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
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e2);
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
                        atomicIntegerArray.set(i2, AbstractC2867.m5909(list.get(i2)));
                        i2++;
                    }
                    return;
                } catch (Exception e3) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e3);
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
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e4);
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
                        atomicLongArray.set(i2, AbstractC2867.m5909(list2.get(i2)));
                        i2++;
                    }
                    return;
                } catch (Exception e5) {
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e5);
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
                    C0276.m843(AbstractC0053.m151(new StringBuilder("set "), str, " error"), e6);
                    return;
                }
            case 6:
                AbstractC2867.m5910(obj2);
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
                float fM5907 = AbstractC2867.m5907(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5644(fM5907);
                throw null;
            case 9:
                short sM5900 = AbstractC2867.m5900(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5643(sM5900);
                throw null;
            default:
                byte bM5920 = AbstractC2867.m5920(obj2);
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5643(bM5920);
                throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo5485() {
        switch (this.f8432) {
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
                return super.mo5485();
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        int i = this.f8432;
        String str = this.f8428;
        int i2 = 0;
        Method method = this.f8427;
        JSONSchema jSONSchema = this.f8413;
        switch (i) {
            case 0:
                mo5471(obj, abstractC2899.mo6112());
                return;
            case 1:
                mo5471(obj, abstractC2899.mo6112());
                return;
            case 2:
                if (abstractC2899.mo6119()) {
                    return;
                }
                try {
                    AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) method.invoke(obj, null);
                    if (abstractC2899.mo6141()) {
                        while (!abstractC2899.mo6142()) {
                            int iMo6212 = abstractC2899.mo6212();
                            if (atomicIntegerArray != null && i2 < atomicIntegerArray.length()) {
                                atomicIntegerArray.set(i2, iMo6212);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e);
                    return;
                }
            case 3:
                mo5471(obj, abstractC2899.mo6213());
                return;
            case 4:
                if (abstractC2899.mo6119()) {
                    return;
                }
                try {
                    AtomicLongArray atomicLongArray = (AtomicLongArray) method.invoke(obj, null);
                    if (abstractC2899.mo6141()) {
                        while (!abstractC2899.mo6142()) {
                            long jMo6209 = abstractC2899.mo6209();
                            if (atomicLongArray != null && i2 < atomicLongArray.length()) {
                                atomicLongArray.set(i2, jMo6209);
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), str, " error", abstractC2899), e2);
                    return;
                }
            case 5:
                mo5471(obj, abstractC2899.mo6210());
                return;
            case 6:
                abstractC2899.mo6108();
                throw null;
            case 7:
                if (abstractC2899.mo6109() != 0 || !abstractC2899.f9196) {
                    throw null;
                }
                return;
            case 8:
                float fMo6114 = abstractC2899.mo6114();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5644(fMo6114);
                throw null;
            case 9:
                short sMo6212 = (short) abstractC2899.mo6212();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5643(sMo6212);
                throw null;
            default:
                byte bMo6212 = (byte) abstractC2899.mo6212();
                if (jSONSchema == null) {
                    throw null;
                }
                jSONSchema.m5643(bMo6212);
                throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        switch (this.f8432) {
            case 0:
                return abstractC2899.mo6112();
            case 1:
                return abstractC2899.mo6112();
            case 2:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                return abstractC2899.mo6122(Integer.class);
            case 3:
                int iMo6212 = abstractC2899.mo6212();
                if (abstractC2899.f9196) {
                    return null;
                }
                return new AtomicInteger(iMo6212);
            case 4:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                return abstractC2899.mo6122(Long.class);
            case 5:
                long jMo6209 = abstractC2899.mo6209();
                if (abstractC2899.f9196) {
                    return null;
                }
                return new AtomicLong(jMo6209);
            case 6:
                return abstractC2899.mo6112();
            case 7:
                return abstractC2899.mo6184();
            case 8:
                return Float.valueOf(abstractC2899.mo6114());
            case 9:
                return Short.valueOf((short) abstractC2899.mo6212());
            default:
                return Byte.valueOf((byte) abstractC2899.mo6212());
        }
    }
}
