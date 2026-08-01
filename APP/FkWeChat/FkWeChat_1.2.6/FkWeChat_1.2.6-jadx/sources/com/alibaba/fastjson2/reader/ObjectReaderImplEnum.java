package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1573e;
import com.alibaba.fastjson2.C1575f;
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

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
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
            for (int i10 = 0; i10 < enumArr.length; i10++) {
                Enum r92 = enumArr[i10];
                try {
                    Object objInvoke = member instanceof Field ? ((Field) member).get(r92) : ((Method) member).invoke(r92, null);
                    String[] strArr = this.stringValues;
                    if (type == String.class) {
                        strArr[i10] = (String) objInvoke;
                    } else {
                        strArr[i10] = objInvoke == null ? null : objInvoke.toString();
                        if (objInvoke instanceof Number) {
                            this.intValues[i10] = ((Number) objInvoke).longValue();
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

    private void oomCheck(Type type) {
        if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            C1569c.m6258a(ObjectReaderImplEnum.class.getSimpleName().concat(" parses error, JSONReader not forward when field type belongs to collection to avoid OOM"));
        }
    }

    public Enum getEnum(String str) {
        if (str == null) {
            return null;
        }
        return getEnumByHashCode(Fnv.hashCode64(str));
    }

    public Enum getEnumByHashCode(long j10) {
        int iBinarySearch;
        if (this.enums != null && (iBinarySearch = Arrays.binarySearch(this.enumNameHashCodes, j10)) >= 0) {
            return this.enums[iBinarySearch];
        }
        return null;
    }

    public Enum getEnumByOrdinal(int i10) {
        if (i10 >= 0) {
            Enum[] enumArr = this.ordinalEnums;
            if (i10 < enumArr.length) {
                return enumArr[i10];
            }
        }
        C1573e.m6261a("No enum ordinal ", this.enumClass.getCanonicalName(), ".", i10);
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.enumClass;
    }

    /* JADX INFO: renamed from: of */
    public Enum m6368of(int i10) {
        Member member = this.valueField;
        Enum r12 = null;
        if (member == null) {
            if (i10 >= 0) {
                Enum[] enumArr = this.ordinalEnums;
                if (i10 < enumArr.length) {
                    return enumArr[i10];
                }
            }
            return null;
        }
        try {
            int i11 = 0;
            if (!(member instanceof Field)) {
                Method method = (Method) member;
                while (true) {
                    Enum[] enumArr2 = this.enums;
                    if (i11 >= enumArr2.length) {
                        break;
                    }
                    Enum r22 = enumArr2[i11];
                    if (((Number) method.invoke(r22, null)).intValue() == i10) {
                        r12 = r22;
                        break;
                    }
                    i11++;
                }
            } else {
                while (true) {
                    Enum[] enumArr3 = this.enums;
                    if (i11 >= enumArr3.length) {
                        break;
                    }
                    Enum r02 = enumArr3[i11];
                    if (((Field) this.valueField).getInt(r02) == i10) {
                        r12 = r02;
                        break;
                    }
                    i11++;
                }
            }
            if (r12 != null) {
                return r12;
            }
            C1575f.m6263a("None enum ordinal or value ", i10);
            return null;
        } catch (Exception e10) {
            throw new JSONException("parse enum error, class " + this.enumClass.getName() + ", value " + i10, e10);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Enum enumByHashCode;
        int offset = jSONReader.getOffset();
        int type2 = jSONReader.getType();
        if (type2 == -110) {
            ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.enumClass, 0L, j10);
            if (objectReaderCheckAutoType != null) {
                if (objectReaderCheckAutoType != this) {
                    return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j10);
                }
            } else if (jSONReader.isEnabled(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                C1569c.m6258a(jSONReader.info("not support enumType : " + jSONReader.getString()));
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
            C1573e.m6261a("No enum ordinal ", this.enumClass.getCanonicalName(), ".", type2);
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

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        int i10;
        int offset = jSONReader.getOffset();
        Type type2 = this.createMethodParamType;
        Enum enumValueOf = null;
        if (type2 != null) {
            Object obj2 = jSONReader.read(type2);
            try {
                return this.createMethod.invoke(null, obj2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                C1565a.m6255a(jSONReader.info("create enum error, enumClass " + this.enumClass.getName() + ", paramValue " + obj2), e10);
                return null;
            }
        }
        int i11 = 0;
        if (jSONReader.isInt()) {
            int int32Value = jSONReader.readInt32Value();
            if (this.valueField == null) {
                if (int32Value >= 0) {
                    Enum[] enumArr = this.ordinalEnums;
                    if (int32Value < enumArr.length) {
                        enumValueOf = enumArr[int32Value];
                    }
                }
                C1573e.m6261a("No enum ordinal ", this.enumClass.getCanonicalName(), ".", int32Value);
                return null;
            }
            if (this.intValues != null) {
                while (true) {
                    long[] jArr = this.intValues;
                    if (i11 >= jArr.length) {
                        break;
                    }
                    if (jArr[i11] == int32Value) {
                        enumValueOf = this.enums[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (enumValueOf == null && jSONReader.isEnabled(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                C1569c.m6258a(jSONReader.info("parse enum error, class " + this.enumClass.getName() + ", " + this.valueField.getName() + " " + int32Value));
                return null;
            }
        } else if (!jSONReader.nextIfNullOrEmptyString()) {
            if (this.stringValues != null && jSONReader.isString()) {
                String string = jSONReader.readString();
                while (true) {
                    String[] strArr = this.stringValues;
                    if (i11 >= strArr.length) {
                        break;
                    }
                    if (string.equals(strArr[i11])) {
                        enumValueOf = this.enums[i11];
                        break;
                    }
                    i11++;
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
                    if (TypeUtils.isInteger(string2) && (i10 = Integer.parseInt(string2)) >= 0) {
                        Enum[] enumArr2 = this.ordinalEnums;
                        if (i10 < enumArr2.length) {
                            enumByHashCode = enumArr2[i10];
                        }
                    }
                }
                enumValueOf = enumByHashCode;
            } else {
                int int32Value2 = jSONReader.readInt32Value();
                while (true) {
                    long[] jArr2 = this.intValues;
                    if (i11 >= jArr2.length) {
                        break;
                    }
                    if (jArr2[i11] == int32Value2) {
                        enumValueOf = this.enums[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (enumValueOf == null && jSONReader.isEnabled(JSONReader.Feature.ErrorOnEnumNotMatch)) {
                C1569c.m6258a(jSONReader.info("parse enum error, class " + this.enumClass.getName() + ", value " + jSONReader.getString()));
                return null;
            }
        }
        if (enumValueOf == null && jSONReader.getOffset() == offset) {
            oomCheck(type);
        }
        return enumValueOf;
    }
}
