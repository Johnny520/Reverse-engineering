package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderObjectField<T> extends FieldReaderObject<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderObjectField(String str, Type type, Class cls, int i9, long j3, String str2, Object obj, Field field) {
        super(str, type == null ? field.getType() : type, cls, i9, j3, str2, null, obj, null, field, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj != null) {
            Class<?> cls = this.fieldClass;
            if (cls.isPrimitive()) {
                acceptPrimitive(t9, obj);
                return;
            }
            if (this.fieldType != cls && Map.class.isAssignableFrom(cls) && (obj instanceof Map) && cls != Map.class) {
                obj = getObjectReader(JSONFactory.createReadContext()).createInstance((Map) obj, new JSONReader.Feature[0]);
            } else if (cls != obj.getClass() && !cls.isInstance(obj)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (cls == Date.class) {
                        String str2 = this.format;
                        if (str2 != null) {
                            obj = DateUtils.parseDate(str, str2, DateUtils.DEFAULT_ZONE_ID);
                        } else {
                            long millis = DateUtils.parseMillis(str, DateUtils.DEFAULT_ZONE_ID);
                            obj = millis == 0 ? null : new Date(millis);
                        }
                    }
                }
                if (!cls.isInstance(obj)) {
                    obj = TypeUtils.cast(obj, this.fieldType);
                }
            }
        } else if ((this.features & JSONReader.Feature.IgnoreSetNullValue.mask) != 0) {
            return;
        }
        long j3 = this.fieldOffset;
        if (j3 != -1) {
            JDKUtils.UNSAFE.putObject(t9, j3, obj);
            return;
        }
        try {
            this.field.set(t9, obj);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void acceptPrimitive(T t9, Object obj) {
        Class cls = this.fieldClass;
        if (cls == Integer.TYPE) {
            if (obj instanceof Number) {
                accept((Object) t9, ((Number) obj).intValue());
                return;
            }
        } else if (cls == Long.TYPE) {
            if (obj instanceof Number) {
                accept((Object) t9, ((Number) obj).longValue());
                return;
            }
        } else if (cls == Float.TYPE) {
            if (obj instanceof Number) {
                accept((Object) t9, ((Number) obj).floatValue());
                return;
            }
        } else if (cls == Double.TYPE) {
            if (obj instanceof Number) {
                accept(t9, ((Number) obj).doubleValue());
                return;
            }
        } else if (cls == Short.TYPE) {
            if (obj instanceof Number) {
                accept((Object) t9, ((Number) obj).shortValue());
                return;
            }
        } else if (cls == Byte.TYPE) {
            if (obj instanceof Number) {
                accept((Object) t9, ((Number) obj).byteValue());
                return;
            }
        } else if (cls == Character.TYPE) {
            if (obj instanceof Character) {
                accept((Object) t9, ((Character) obj).charValue());
                return;
            }
        } else if (cls == Boolean.TYPE && (obj instanceof Boolean)) {
            accept(t9, ((Boolean) obj).booleanValue());
            return;
        }
        C0086a.m454m("set ", this.fieldName, " error, type not support ", obj.getClass());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, byte b10) {
        long j3 = this.fieldOffset;
        if (j3 != -1 && this.fieldClass == Byte.TYPE) {
            JDKUtils.UNSAFE.putByte(t9, j3, b10);
            return;
        }
        try {
            this.field.setByte(t9, b10);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, short s10) {
        long j3 = this.fieldOffset;
        if (j3 != -1 && this.fieldClass == Short.TYPE) {
            JDKUtils.UNSAFE.putShort(t9, j3, s10);
            return;
        }
        try {
            this.field.setShort(t9, s10);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, int i9) {
        long j3 = this.fieldOffset;
        if (j3 != -1 && this.fieldClass == Integer.TYPE) {
            JDKUtils.UNSAFE.putInt(t9, j3, i9);
            return;
        }
        try {
            this.field.setInt(t9, i9);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        long j4 = this.fieldOffset;
        if (j4 != -1 && this.fieldClass == Long.TYPE) {
            JDKUtils.UNSAFE.putLong(t9, j4, j3);
            return;
        }
        try {
            this.field.setLong(t9, j3);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, float f3) {
        long j3 = this.fieldOffset;
        if (j3 != -1 && this.fieldClass == Float.TYPE) {
            JDKUtils.UNSAFE.putFloat(t9, j3, f3);
            return;
        }
        try {
            this.field.setFloat(t9, f3);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, double d10) {
        long j3 = this.fieldOffset;
        if (j3 != -1 && this.fieldClass == Double.TYPE) {
            JDKUtils.UNSAFE.putDouble(t9, j3, d10);
            return;
        }
        try {
            this.field.setDouble(t9, d10);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, char c10) {
        long j3 = this.fieldOffset;
        if (j3 != -1 && this.fieldClass == Character.TYPE) {
            JDKUtils.UNSAFE.putChar(t9, j3, c10);
            return;
        }
        try {
            this.field.setChar(t9, c10);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, boolean z9) {
        long j3 = this.fieldOffset;
        if (j3 != -1 && this.fieldClass == Boolean.TYPE) {
            JDKUtils.UNSAFE.putBoolean(t9, j3, z9);
            return;
        }
        try {
            this.field.setBoolean(t9, z9);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }
}
