package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p007.AbstractC6136;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2690 extends C2691 {
    public C2690(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, null, type == null ? field.getType() : type, locale, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo5441(Object obj, float f) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5599(f);
        }
        long j = this.f8423;
        if (j != -1 && this.f8427 == Float.TYPE) {
            AbstractC2853.f8919.putFloat(obj, j, f);
            return;
        }
        try {
            this.f8422.setFloat(obj, f);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo5442(Object obj, double d) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5599(d);
        }
        long j = this.f8423;
        if (j != -1 && this.f8427 == Double.TYPE) {
            AbstractC2853.f8919.putDouble(obj, j, d);
            return;
        }
        try {
            this.f8422.setDouble(obj, d);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m5443(Object obj, char c) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(c);
        }
        long j = this.f8423;
        if (j != -1 && this.f8427 == Character.TYPE) {
            AbstractC2853.f8919.putChar(obj, j, c);
            return;
        }
        try {
            this.f8422.setChar(obj, c);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m5444(Object obj, byte b) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(b);
        }
        long j = this.f8423;
        if (j != -1 && this.f8427 == Byte.TYPE) {
            AbstractC2853.f8919.putByte(obj, j, b);
            return;
        }
        try {
            this.f8422.setByte(obj, b);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void mo5445(Object obj, boolean z) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(Boolean.valueOf(z));
        }
        long j = this.f8423;
        if (j != -1 && this.f8427 == Boolean.TYPE) {
            AbstractC2853.f8919.putBoolean(obj, j, z);
            return;
        }
        try {
            this.f8422.setBoolean(obj, z);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void mo5446(Object obj, short s) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(s);
        }
        long j = this.f8423;
        if (j != -1 && this.f8427 == Short.TYPE) {
            AbstractC2853.f8919.putShort(obj, j, s);
            return;
        }
        try {
            this.f8422.setShort(obj, s);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void mo5447(Object obj, int i) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(i);
        }
        long j = this.f8423;
        if (j != -1 && this.f8427 == Integer.TYPE) {
            AbstractC2853.f8919.putInt(obj, j, i);
            return;
        }
        try {
            this.f8422.setInt(obj, i);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5426(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(obj2);
        }
        String str = this.f8426;
        if (obj2 != null) {
            Class cls = this.f8427;
            if (cls.isPrimitive()) {
                if (cls == Integer.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5447(obj, ((Number) obj2).intValue());
                        return;
                    }
                } else if (cls == Long.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5435(obj, ((Number) obj2).longValue());
                        return;
                    }
                } else if (cls == Float.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5441(obj, ((Number) obj2).floatValue());
                        return;
                    }
                } else if (cls == Double.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5442(obj, ((Number) obj2).doubleValue());
                        return;
                    }
                } else if (cls == Short.TYPE) {
                    if (obj2 instanceof Number) {
                        mo5446(obj, ((Number) obj2).shortValue());
                        return;
                    }
                } else if (cls == Byte.TYPE) {
                    if (obj2 instanceof Number) {
                        m5444(obj, ((Number) obj2).byteValue());
                        return;
                    }
                } else if (cls == Character.TYPE) {
                    if (obj2 instanceof Character) {
                        m5443(obj, ((Character) obj2).charValue());
                        return;
                    }
                } else if (cls == Boolean.TYPE && (obj2 instanceof Boolean)) {
                    mo5445(obj, ((Boolean) obj2).booleanValue());
                    return;
                }
                C0276.m849(AbstractC2442.m4571(obj2, AbstractC6136.m11550("set ", str, " error, type not support ")));
                return;
            }
            Type type = this.f8421;
            if (type != cls && Map.class.isAssignableFrom(cls) && (obj2 instanceof Map) && cls != Map.class) {
                obj2 = mo5451(AbstractC2932.m6331()).m5574((Map) obj2, new JSONReader$Feature[0]);
            } else if (!cls.isInstance(obj2)) {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    String str3 = this.f8424;
                    if (cls == LocalDate.class) {
                        obj2 = str3 != null ? LocalDate.parse(str2, DateTimeFormatter.ofPattern(str3)) : AbstractC2865.m5828(str2);
                    } else if (cls == Date.class) {
                        obj2 = str3 != null ? AbstractC2865.m5827(str2, str3, AbstractC2865.f9025) : AbstractC2865.m5823(str2);
                    }
                }
                if (!cls.isInstance(obj2)) {
                    obj2 = AbstractC2866.m5880(obj2, type);
                }
            }
        } else if ((JSONReader$Feature.IgnoreSetNullValue.mask & this.f8420) != 0) {
            return;
        }
        long j = this.f8423;
        if (j != -1) {
            AbstractC2853.f8919.putObject(obj, j, obj2);
            return;
        }
        try {
            this.f8422.set(obj, obj2);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m156("set ", str, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5435(Object obj, long j) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(j);
        }
        long j2 = this.f8423;
        if (j2 != -1 && this.f8427 == Long.TYPE) {
            AbstractC2853.f8919.putLong(obj, j2, j);
            return;
        }
        try {
            this.f8422.setLong(obj, j);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }
}
