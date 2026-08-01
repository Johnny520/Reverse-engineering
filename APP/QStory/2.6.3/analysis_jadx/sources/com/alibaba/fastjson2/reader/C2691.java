package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p009.AbstractC6183;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2691 extends C2692 {
    public C2691(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, null, type == null ? field.getType() : type, locale, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo5486(Object obj, float f) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5644(f);
        }
        long j = this.f8425;
        if (j != -1 && this.f8429 == Float.TYPE) {
            AbstractC2854.f8921.putFloat(obj, j, f);
            return;
        }
        try {
            this.f8424.setFloat(obj, f);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo5487(Object obj, double d) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5644(d);
        }
        long j = this.f8425;
        if (j != -1 && this.f8429 == Double.TYPE) {
            AbstractC2854.f8921.putDouble(obj, j, d);
            return;
        }
        try {
            this.f8424.setDouble(obj, d);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m5488(Object obj, char c) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5643(c);
        }
        long j = this.f8425;
        if (j != -1 && this.f8429 == Character.TYPE) {
            AbstractC2854.f8921.putChar(obj, j, c);
            return;
        }
        try {
            this.f8424.setChar(obj, c);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m5489(Object obj, byte b) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5643(b);
        }
        long j = this.f8425;
        if (j != -1 && this.f8429 == Byte.TYPE) {
            AbstractC2854.f8921.putByte(obj, j, b);
            return;
        }
        try {
            this.f8424.setByte(obj, b);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void mo5490(Object obj, boolean z) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(Boolean.valueOf(z));
        }
        long j = this.f8425;
        if (j != -1 && this.f8429 == Boolean.TYPE) {
            AbstractC2854.f8921.putBoolean(obj, j, z);
            return;
        }
        try {
            this.f8424.setBoolean(obj, z);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void mo5491(Object obj, short s) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5643(s);
        }
        long j = this.f8425;
        if (j != -1 && this.f8429 == Short.TYPE) {
            AbstractC2854.f8921.putShort(obj, j, s);
            return;
        }
        try {
            this.f8424.setShort(obj, s);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void mo5492(Object obj, int i) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5643(i);
        }
        long j = this.f8425;
        if (j != -1 && this.f8429 == Integer.TYPE) {
            AbstractC2854.f8921.putInt(obj, j, i);
            return;
        }
        try {
            this.f8424.setInt(obj, i);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5471(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(obj2);
        }
        String str = this.f8428;
        if (obj2 != null) {
            Class cls = this.f8429;
            if (cls.isPrimitive()) {
                if (cls == Integer.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5492(obj, ((Number) obj2).intValue());
                        return;
                    }
                } else if (cls == Long.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5480(obj, ((Number) obj2).longValue());
                        return;
                    }
                } else if (cls == Float.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5486(obj, ((Number) obj2).floatValue());
                        return;
                    }
                } else if (cls == Double.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5487(obj, ((Number) obj2).doubleValue());
                        return;
                    }
                } else if (cls == Short.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5491(obj, ((Number) obj2).shortValue());
                        return;
                    }
                } else if (cls == Byte.TYPE) {
                    if (obj2 instanceof Number) {
                        m5489(obj, ((Number) obj2).byteValue());
                        return;
                    }
                } else if (cls == Character.TYPE) {
                    if (obj2 instanceof Character) {
                        m5488(obj, ((Character) obj2).charValue());
                        return;
                    }
                } else if (cls == Boolean.TYPE && (obj2 instanceof Boolean)) {
                    mo5490(obj, ((Boolean) obj2).booleanValue());
                    return;
                }
                C0276.m850(AbstractC2442.m4581(obj2, AbstractC6183.m11585("set ", str, " error, type not support ")));
                return;
            }
            Type type = this.f8423;
            if (type != cls && Map.class.isAssignableFrom(cls) && (obj2 instanceof Map) && cls != Map.class) {
                obj2 = mo5496(AbstractC2933.m6389()).m5619((Map) obj2, new JSONReader$Feature[0]);
            } else if (!cls.isInstance(obj2)) {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    String str3 = this.f8426;
                    if (cls == LocalDate.class) {
                        obj2 = str3 != null ? LocalDate.parse(str2, DateTimeFormatter.ofPattern(str3)) : AbstractC2866.m5873(str2);
                    } else if (cls == Date.class) {
                        obj2 = str3 != null ? AbstractC2866.m5872(str2, str3, AbstractC2866.f9027) : AbstractC2866.m5868(str2);
                    }
                }
                if (!cls.isInstance(obj2)) {
                    obj2 = AbstractC2867.m5925(obj2, type);
                }
            }
        } else if ((JSONReader$Feature.IgnoreSetNullValue.mask & this.f8422) != 0) {
            return;
        }
        long j = this.f8425;
        if (j != -1) {
            AbstractC2854.f8921.putObject(obj, j, obj2);
            return;
        }
        try {
            this.f8424.set(obj, obj2);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m158("set ", str, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5480(Object obj, long j) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5643(j);
        }
        long j2 = this.f8425;
        if (j2 != -1 && this.f8429 == Long.TYPE) {
            AbstractC2854.f8921.putLong(obj, j2, j);
            return;
        }
        try {
            this.f8424.setLong(obj, j);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }
}
