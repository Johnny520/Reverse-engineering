package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplEnum implements ObjectReader {
    final Method createMethod;
    final Type createMethodParamType;
    final Class enumClass;
    private final long[] enumNameHashCodes;
    private final Enum[] enums;
    private long[] intValues;
    private final Enum[] ordinalEnums;
    private String[] stringValues;
    final long typeNameHash;
    final Member valueField;
    final Type valueFieldType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.lang.reflect.Member */
    /* JADX WARN: Multi-variable type inference failed */
    public ObjectReaderImplEnum(Class cls, Method method, Member member, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.enumClass = cls;
        this.createMethod = method;
        if (member instanceof AccessibleObject) {
            ((AccessibleObject) member).setAccessible(true);
        }
        this.valueField = member;
        Class<?> cls2 = null;
        Class<?> type = member instanceof Field ? ((Field) member).getType() : member instanceof Method ? ((Method) member).getReturnType() : null;
        this.valueFieldType = type;
        if (type != null) {
            this.stringValues = new String[enumArr.length];
            if (type != String.class) {
                this.intValues = new long[enumArr.length];
            }
            for (int i9 = 0; i9 < enumArr.length; i9++) {
                Enum r92 = enumArr[i9];
                try {
                    Object objInvoke = member instanceof Field ? ((Field) member).get(r92) : ((Method) member).invoke(r92, null);
                    String[] strArr = this.stringValues;
                    if (type == String.class) {
                        strArr[i9] = (String) objInvoke;
                    } else {
                        strArr[i9] = objInvoke == null ? null : objInvoke.toString();
                        if (objInvoke instanceof Number) {
                            this.intValues[i9] = ((Number) objInvoke).longValue();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (method != null && method.getParameterCount() == 1) {
            cls2 = method.getParameterTypes()[0];
        }
        this.createMethodParamType = cls2;
        this.typeNameHash = Fnv.hashCode64(TypeUtils.getTypeName(cls));
        this.enums = enumArr;
        this.ordinalEnums = enumArr2;
        this.enumNameHashCodes = jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void oomCheck(Type type) {
        if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            C0086a.m464w("ObjectReaderImplEnum parses error, JSONReader not forward when field type belongs to collection to avoid OOM");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Enum getEnum(String str) {
        if (str == null) {
            return null;
        }
        return getEnumByHashCode(Fnv.hashCode64(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Enum getEnumByHashCode(long j3) {
        int iBinarySearch;
        if (this.enums != null && (iBinarySearch = Arrays.binarySearch(this.enumNameHashCodes, j3)) >= 0) {
            return this.enums[iBinarySearch];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Enum getEnumByOrdinal(int i9) {
        if (i9 >= 0) {
            Enum[] enumArr = this.ordinalEnums;
            if (i9 < enumArr.length) {
                return enumArr[i9];
            }
        }
        C0086a.m447f(i9, this.enumClass.getCanonicalName(), ".", "No enum ordinal ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.enumClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public Enum m1712of(int i9) {
        Member member = this.valueField;
        Enum r12 = null;
        if (member == null) {
            if (i9 >= 0) {
                Enum[] enumArr = this.ordinalEnums;
                if (i9 < enumArr.length) {
                    return enumArr[i9];
                }
            }
            return null;
        }
        try {
            int i10 = 0;
            if (!(member instanceof Field)) {
                Method method = (Method) member;
                while (true) {
                    Enum[] enumArr2 = this.enums;
                    if (i10 >= enumArr2.length) {
                        break;
                    }
                    Enum r2 = enumArr2[i10];
                    if (((Number) method.invoke(r2, null)).intValue() == i9) {
                        r12 = r2;
                        break;
                    }
                    i10++;
                }
            } else {
                while (true) {
                    Enum[] enumArr3 = this.enums;
                    if (i10 >= enumArr3.length) {
                        break;
                    }
                    Enum r02 = enumArr3[i10];
                    if (((Field) this.valueField).getInt(r02) == i9) {
                        r12 = r02;
                        break;
                    }
                    i10++;
                }
            }
            if (r12 != null) {
                return r12;
            }
            C0086a.m464w(AbstractC0921a.m2249l(i9, "None enum ordinal or value "));
            return null;
        } catch (Exception e6) {
            throw new JSONException("parse enum error, class " + this.enumClass.getName() + ", value " + i9, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Enum enumByHashCode;
        int offset = jSONReader.getOffset();
        int type2 = jSONReader.getType();
        if (type2 == -110) {
            ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.enumClass, 0L, j3);
            if (objectReaderCheckAutoType != null) {
                if (objectReaderCheckAutoType != this) {
                    return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
                }
            } else if (jSONReader.isEnabled(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                C0086a.m464w(jSONReader.info("not support enumType : " + jSONReader.getString()));
                return null;
            }
        }
        if (type2 >= -16 && type2 <= 72) {
            if (type2 <= 47) {
                jSONReader.next();
            } else {
                type2 = jSONReader.readInt32Value();
            }
            if (type2 >= 0) {
                Enum[] enumArr = this.ordinalEnums;
                if (type2 < enumArr.length) {
                    enumByHashCode = enumArr[type2];
                }
            }
            C0086a.m447f(type2, this.enumClass.getCanonicalName(), ".", "No enum ordinal ");
            return null;
        }
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        enumByHashCode = getEnumByHashCode(jSONReader.readValueHashCode());
        if (enumByHashCode == null) {
            enumByHashCode = getEnumByHashCode(jSONReader.getNameHashCodeLCase());
        }
        if (enumByHashCode == null && jSONReader.getOffset() == offset) {
            oomCheck(type);
        }
        return enumByHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        int i9;
        int offset = jSONReader.getOffset();
        Type type2 = this.createMethodParamType;
        Enum enumValueOf = null;
        if (type2 != null) {
            Object obj2 = jSONReader.read(type2);
            try {
                return this.createMethod.invoke(null, obj2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                C0086a.m465x(jSONReader.info("create enum error, enumClass " + this.enumClass.getName() + ", paramValue " + obj2), e6);
                return null;
            }
        }
        int i10 = 0;
        if (jSONReader.isInt()) {
            int int32Value = jSONReader.readInt32Value();
            if (this.valueField == null) {
                if (int32Value >= 0) {
                    Enum[] enumArr = this.ordinalEnums;
                    if (int32Value < enumArr.length) {
                        enumValueOf = enumArr[int32Value];
                    }
                }
                C0086a.m447f(int32Value, this.enumClass.getCanonicalName(), ".", "No enum ordinal ");
                return null;
            }
            if (this.intValues != null) {
                while (true) {
                    long[] jArr = this.intValues;
                    if (i10 >= jArr.length) {
                        break;
                    }
                    if (jArr[i10] == int32Value) {
                        enumValueOf = this.enums[i10];
                        break;
                    }
                    i10++;
                }
            }
            if (enumValueOf == null && jSONReader.isEnabled(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                C0086a.m464w(jSONReader.info("parse enum error, class " + this.enumClass.getName() + ", " + this.valueField.getName() + " " + int32Value));
                return null;
            }
        } else if (!jSONReader.nextIfNullOrEmptyString()) {
            if (this.stringValues != null && jSONReader.isString()) {
                String string = jSONReader.readString();
                while (true) {
                    String[] strArr = this.stringValues;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if (string.equals(strArr[i10])) {
                        enumValueOf = this.enums[i10];
                        break;
                    }
                    i10++;
                }
                if (enumValueOf == null && this.valueField != null) {
                    try {
                        enumValueOf = Enum.valueOf(this.enumClass, string);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } else if (this.intValues == null || !jSONReader.isInt()) {
                long valueHashCode = jSONReader.readValueHashCode();
                if (valueHashCode == Fnv.MAGIC_HASH_CODE) {
                    return null;
                }
                Enum enumByHashCode = getEnumByHashCode(valueHashCode);
                if (enumByHashCode == null) {
                    enumByHashCode = getEnumByHashCode(jSONReader.getNameHashCodeLCase());
                }
                if (enumByHashCode == null) {
                    String string2 = jSONReader.getString();
                    if (TypeUtils.isInteger(string2) && (i9 = Integer.parseInt(string2)) >= 0) {
                        Enum[] enumArr2 = this.ordinalEnums;
                        if (i9 < enumArr2.length) {
                            enumByHashCode = enumArr2[i9];
                        }
                    }
                }
                enumValueOf = enumByHashCode;
            } else {
                int int32Value2 = jSONReader.readInt32Value();
                while (true) {
                    long[] jArr2 = this.intValues;
                    if (i10 >= jArr2.length) {
                        break;
                    }
                    if (jArr2[i10] == int32Value2) {
                        enumValueOf = this.enums[i10];
                        break;
                    }
                    i10++;
                }
            }
            if (enumValueOf == null && jSONReader.isEnabled(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                C0086a.m464w(jSONReader.info("parse enum error, class " + this.enumClass.getName() + ", value " + jSONReader.getString()));
                return null;
            }
        }
        if (enumValueOf == null && jSONReader.getOffset() == offset) {
            oomCheck(type);
        }
        return enumValueOf;
    }
}
