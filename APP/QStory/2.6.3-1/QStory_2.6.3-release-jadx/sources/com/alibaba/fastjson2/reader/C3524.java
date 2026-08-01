package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p025.AbstractC7012;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3524 extends C3525 {
    public C3524(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, null, type == null ? field.getType() : type, locale, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo6046(Object obj, float f) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6204(f);
        }
        long j = this.f8770;
        if (j != -1 && this.f8774 == Float.TYPE) {
            AbstractC3687.f9266.putFloat(obj, j, f);
            return;
        }
        try {
            this.f8769.setFloat(obj, f);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo6047(Object obj, double d) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6204(d);
        }
        long j = this.f8770;
        if (j != -1 && this.f8774 == Double.TYPE) {
            AbstractC3687.f9266.putDouble(obj, j, d);
            return;
        }
        try {
            this.f8769.setDouble(obj, d);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m6048(Object obj, char c) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(c);
        }
        long j = this.f8770;
        if (j != -1 && this.f8774 == Character.TYPE) {
            AbstractC3687.f9266.putChar(obj, j, c);
            return;
        }
        try {
            this.f8769.setChar(obj, c);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m6049(Object obj, byte b) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(b);
        }
        long j = this.f8770;
        if (j != -1 && this.f8774 == Byte.TYPE) {
            AbstractC3687.f9266.putByte(obj, j, b);
            return;
        }
        try {
            this.f8769.setByte(obj, b);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void mo6050(Object obj, boolean z) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(Boolean.valueOf(z));
        }
        long j = this.f8770;
        if (j != -1 && this.f8774 == Boolean.TYPE) {
            AbstractC3687.f9266.putBoolean(obj, j, z);
            return;
        }
        try {
            this.f8769.setBoolean(obj, z);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void mo6051(Object obj, short s) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(s);
        }
        long j = this.f8770;
        if (j != -1 && this.f8774 == Short.TYPE) {
            AbstractC3687.f9266.putShort(obj, j, s);
            return;
        }
        try {
            this.f8769.setShort(obj, s);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void mo6052(Object obj, int i) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(i);
        }
        long j = this.f8770;
        if (j != -1 && this.f8774 == Integer.TYPE) {
            AbstractC3687.f9266.putInt(obj, j, i);
            return;
        }
        try {
            this.f8769.setInt(obj, i);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6031(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(obj2);
        }
        String str = this.f8773;
        if (obj2 != null) {
            Class cls = this.f8774;
            if (cls.isPrimitive()) {
                if (cls == Integer.TYPE) {
                    if (obj2 instanceof Number) {
                        mo6052(obj, ((Number) obj2).intValue());
                        return;
                    }
                } else if (cls == Long.TYPE) {
                    if (obj2 instanceof Number) {
                        mo6040(obj, ((Number) obj2).longValue());
                        return;
                    }
                } else if (cls == Float.TYPE) {
                    if (obj2 instanceof Number) {
                        mo6046(obj, ((Number) obj2).floatValue());
                        return;
                    }
                } else if (cls == Double.TYPE) {
                    if (obj2 instanceof Number) {
                        mo6047(obj, ((Number) obj2).doubleValue());
                        return;
                    }
                } else if (cls == Short.TYPE) {
                    if (obj2 instanceof Number) {
                        mo6051(obj, ((Number) obj2).shortValue());
                        return;
                    }
                } else if (cls == Byte.TYPE) {
                    if (obj2 instanceof Number) {
                        m6049(obj, ((Number) obj2).byteValue());
                        return;
                    }
                } else if (cls == Character.TYPE) {
                    if (obj2 instanceof Character) {
                        m6048(obj, ((Character) obj2).charValue());
                        return;
                    }
                } else if (cls == Boolean.TYPE && (obj2 instanceof Boolean)) {
                    mo6050(obj, ((Boolean) obj2).booleanValue());
                    return;
                }
                C1123.m1410(AbstractC3275.m5141(obj2, AbstractC7012.m12144("set ", str, " error, type not support ")));
                return;
            }
            Type type = this.f8768;
            if (type != cls && Map.class.isAssignableFrom(cls) && (obj2 instanceof Map) && cls != Map.class) {
                obj2 = mo6056(AbstractC3766.m6949()).m6179((Map) obj2, new JSONReader$Feature[0]);
            } else if (!cls.isInstance(obj2)) {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    String str3 = this.f8771;
                    if (cls == LocalDate.class) {
                        obj2 = str3 != null ? LocalDate.parse(str2, DateTimeFormatter.ofPattern(str3)) : AbstractC3699.m6433(str2);
                    } else if (cls == Date.class) {
                        obj2 = str3 != null ? AbstractC3699.m6432(str2, str3, AbstractC3699.f9372) : AbstractC3699.m6428(str2);
                    }
                }
                if (!cls.isInstance(obj2)) {
                    obj2 = AbstractC3700.m6485(obj2, type);
                }
            }
        } else if ((JSONReader$Feature.IgnoreSetNullValue.mask & this.f8767) != 0) {
            return;
        }
        long j = this.f8770;
        if (j != -1) {
            AbstractC3687.f9266.putObject(obj, j, obj2);
            return;
        }
        try {
            this.f8769.set(obj, obj2);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m718("set ", str, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo6040(Object obj, long j) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(j);
        }
        long j2 = this.f8770;
        if (j2 != -1 && this.f8774 == Long.TYPE) {
            AbstractC3687.f9266.putLong(obj, j2, j);
            return;
        }
        try {
            this.f8769.setLong(obj, j);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }
}
