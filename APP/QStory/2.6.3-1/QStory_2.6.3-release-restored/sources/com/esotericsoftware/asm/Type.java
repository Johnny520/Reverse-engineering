package com.esotericsoftware.asm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final Type BOOLEAN_TYPE;
    public static final int BYTE = 3;
    public static final Type BYTE_TYPE;
    public static final int CHAR = 2;
    public static final Type CHAR_TYPE;
    public static final int DOUBLE = 8;
    public static final Type DOUBLE_TYPE;
    public static final int FLOAT = 6;
    public static final Type FLOAT_TYPE;
    public static final int INT = 5;
    public static final Type INT_TYPE;
    public static final int LONG = 7;
    public static final Type LONG_TYPE;
    public static final int METHOD = 11;
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final Type SHORT_TYPE;
    public static final int VOID = 0;
    public static final Type VOID_TYPE;

    /* JADX INFO: renamed from: a */
    private final int f281a;

    /* JADX INFO: renamed from: b */
    private final char[] f282b;

    /* JADX INFO: renamed from: c */
    private final int f283c;

    /* JADX INFO: renamed from: d */
    private final int f284d;

    static {
        _clinit_();
        VOID_TYPE = new Type(0, null, 1443168256, 1);
        BOOLEAN_TYPE = new Type(1, null, 1509950721, 1);
        CHAR_TYPE = new Type(2, null, 1124075009, 1);
        BYTE_TYPE = new Type(3, null, 1107297537, 1);
        SHORT_TYPE = new Type(4, null, 1392510721, 1);
        INT_TYPE = new Type(5, null, 1224736769, 1);
        FLOAT_TYPE = new Type(6, null, 1174536705, 1);
        LONG_TYPE = new Type(7, null, 1241579778, 1);
        DOUBLE_TYPE = new Type(8, null, 1141048066, 1);
    }

    private Type(int i, char[] cArr, int i2, int i3) {
        this.f281a = i;
        this.f282b = cArr;
        this.f283c = i2;
        this.f284d = i3;
    }

    /* JADX INFO: renamed from: a */
    private static Type m134a(char[] cArr, int i) {
        char c;
        char c2 = cArr[i];
        if (c2 == 'F') {
            return FLOAT_TYPE;
        }
        if (c2 == 'L') {
            int i2 = 1;
            while (cArr[i + i2] != ';') {
                i2++;
            }
            return new Type(10, cArr, i + 1, i2 - 1);
        }
        if (c2 == 'S') {
            return SHORT_TYPE;
        }
        if (c2 == 'V') {
            return VOID_TYPE;
        }
        if (c2 == 'I') {
            return INT_TYPE;
        }
        if (c2 == 'J') {
            return LONG_TYPE;
        }
        if (c2 == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (c2 != '[') {
            switch (c2) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    return new Type(11, cArr, i, cArr.length - i);
            }
        }
        int i3 = 1;
        while (true) {
            c = cArr[i + i3];
            if (c != '[') {
                break;
            }
            i3++;
        }
        if (c == 'L') {
            do {
                i3++;
            } while (cArr[i + i3] != ';');
        }
        return new Type(9, cArr, i, i3 + 1);
    }

    public static Type[] getArgumentTypes(String str) {
        char[] charArray = str.toCharArray();
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = charArray[i2];
            if (c == ')') {
                break;
            }
            if (c == 'L') {
                while (true) {
                    i2 = i4 + 1;
                    if (charArray[i4] == ';') {
                        break;
                    }
                    i4 = i2;
                }
                i3++;
            } else {
                if (c != '[') {
                    i3++;
                }
                i2 = i4;
            }
        }
        Type[] typeArr = new Type[i3];
        int i5 = 0;
        while (charArray[i] != ')') {
            Type typeM134a = m134a(charArray, i);
            typeArr[i5] = typeM134a;
            i += typeM134a.f284d + (typeM134a.f281a == 10 ? 2 : 0);
            i5++;
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        int i;
        char cCharAt;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            i = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 == ')') {
                break;
            }
            if (cCharAt2 == 'L') {
                while (true) {
                    i3 = i + 1;
                    if (str.charAt(i) == ';') {
                        break;
                    }
                    i = i3;
                }
                i4++;
            } else {
                if (cCharAt2 == '[') {
                    while (true) {
                        cCharAt = str.charAt(i);
                        if (cCharAt != '[') {
                            break;
                        }
                        i++;
                    }
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i4--;
                    }
                } else {
                    i4 = (cCharAt2 == 'D' || cCharAt2 == 'J') ? i4 + 2 : i4 + 1;
                }
                i3 = i;
            }
        }
        char cCharAt3 = str.charAt(i);
        int i5 = i4 << 2;
        if (cCharAt3 == 'V') {
            i2 = 0;
        } else if (cCharAt3 == 'D' || cCharAt3 == 'J') {
            i2 = 2;
        }
        return i5 | i2;
    }

    public static String getConstructorDescriptor(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Class<?> cls : parameterTypes) {
            m136a(stringBuffer, cls);
        }
        stringBuffer.append(")V");
        return stringBuffer.toString();
    }

    public static String getInternalName(Class cls) {
        return cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
    }

    public static String getMethodDescriptor(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Class<?> cls : parameterTypes) {
            m136a(stringBuffer, cls);
        }
        stringBuffer.append(')');
        m136a(stringBuffer, method.getReturnType());
        return stringBuffer.toString();
    }

    public static Type getMethodType(String str) {
        return m134a(str.toCharArray(), 0);
    }

    public static Type getObjectType(String str) {
        char[] charArray = str.toCharArray();
        return new Type(charArray[0] == '[' ? 9 : 10, charArray, 0, charArray.length);
    }

    public static Type getReturnType(String str) {
        return m134a(str.toCharArray(), str.indexOf(41) + 1);
    }

    public static Type getType(Class cls) {
        return cls.isPrimitive() ? cls == Integer.TYPE ? INT_TYPE : cls == Void.TYPE ? VOID_TYPE : cls == Boolean.TYPE ? BOOLEAN_TYPE : cls == Byte.TYPE ? BYTE_TYPE : cls == Character.TYPE ? CHAR_TYPE : cls == Short.TYPE ? SHORT_TYPE : cls == Double.TYPE ? DOUBLE_TYPE : cls == Float.TYPE ? FLOAT_TYPE : LONG_TYPE : getType(getDescriptor(cls));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        int i = this.f281a;
        if (i != type.f281a) {
            return false;
        }
        if (i >= 9) {
            int i2 = this.f284d;
            if (i2 != type.f284d) {
                return false;
            }
            int i3 = this.f283c;
            int i4 = type.f283c;
            int i5 = i2 + i3;
            while (i3 < i5) {
                if (this.f282b[i3] != type.f282b[i4]) {
                    return false;
                }
                i3++;
                i4++;
            }
        }
        return true;
    }

    public String getClassName() {
        switch (this.f281a) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuffer stringBuffer = new StringBuffer(getElementType().getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    stringBuffer.append("[]");
                }
                return stringBuffer.toString();
            case 10:
                return new String(this.f282b, this.f283c, this.f284d).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            default:
                return null;
        }
    }

    public String getDescriptor() {
        StringBuffer stringBuffer = new StringBuffer();
        m135a(stringBuffer);
        return stringBuffer.toString();
    }

    public int getDimensions() {
        int i = 1;
        while (this.f282b[this.f283c + i] == '[') {
            i++;
        }
        return i;
    }

    public Type getElementType() {
        return m134a(this.f282b, getDimensions() + this.f283c);
    }

    public int getOpcode(int i) {
        if (i == 46 || i == 79) {
            return i + (this.f282b == null ? (this.f283c & 65280) >> 8 : 4);
        }
        return i + (this.f282b == null ? (this.f283c & 16711680) >> 16 : 4);
    }

    public int getSize() {
        if (this.f282b == null) {
            return this.f283c & com.android.p002dx.p005io.Opcodes.CONST_METHOD_TYPE;
        }
        return 1;
    }

    public int getSort() {
        return this.f281a;
    }

    public int hashCode() {
        int i = this.f281a;
        int i2 = i * 13;
        if (i >= 9) {
            int i3 = this.f283c;
            int i4 = this.f284d + i3;
            while (i3 < i4) {
                i2 = (i2 + this.f282b[i3]) * 17;
                i3++;
            }
        }
        return i2;
    }

    public String toString() {
        return getDescriptor();
    }

    public static Type getMethodType(Type type, Type... typeArr) {
        return getType(getMethodDescriptor(type, typeArr));
    }

    public static String getDescriptor(Class cls) {
        StringBuffer stringBuffer = new StringBuffer();
        m136a(stringBuffer, cls);
        return stringBuffer.toString();
    }

    public String getInternalName() {
        return new String(this.f282b, this.f283c, this.f284d);
    }

    public Type getReturnType() {
        return getReturnType(getDescriptor());
    }

    public static Type getReturnType(Method method) {
        return getType(method.getReturnType());
    }

    public static /* synthetic */ void _clinit_() {
    }

    public static String getMethodDescriptor(Type type, Type... typeArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Type type2 : typeArr) {
            type2.m135a(stringBuffer);
        }
        stringBuffer.append(')');
        type.m135a(stringBuffer);
        return stringBuffer.toString();
    }

    public Type[] getArgumentTypes() {
        return getArgumentTypes(getDescriptor());
    }

    public static Type[] getArgumentTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Type[] typeArr = new Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }

    public static Type getType(String str) {
        return m134a(str.toCharArray(), 0);
    }

    public static Type getType(Constructor constructor) {
        return getType(getConstructorDescriptor(constructor));
    }

    public static Type getType(Method method) {
        return getType(getMethodDescriptor(method));
    }

    public int getArgumentsAndReturnSizes() {
        return getArgumentsAndReturnSizes(getDescriptor());
    }

    /* JADX INFO: renamed from: a */
    private void m135a(StringBuffer stringBuffer) {
        char[] cArr = this.f282b;
        if (cArr == null) {
            stringBuffer.append((char) ((this.f283c & (-16777216)) >>> 24));
        } else {
            if (this.f281a != 10) {
                stringBuffer.append(cArr, this.f283c, this.f284d);
                return;
            }
            stringBuffer.append('L');
            stringBuffer.append(this.f282b, this.f283c, this.f284d);
            stringBuffer.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m136a(StringBuffer stringBuffer, Class cls) {
        while (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                stringBuffer.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = name.charAt(i);
                    if (cCharAt == '.') {
                        cCharAt = '/';
                    }
                    stringBuffer.append(cCharAt);
                }
                stringBuffer.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                return;
            }
            stringBuffer.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            cls = cls.getComponentType();
        }
        stringBuffer.append(cls == Integer.TYPE ? 'I' : cls == Void.TYPE ? 'V' : cls == Boolean.TYPE ? 'Z' : cls == Byte.TYPE ? 'B' : cls == Character.TYPE ? 'C' : cls == Short.TYPE ? 'S' : cls == Double.TYPE ? 'D' : cls == Float.TYPE ? 'F' : 'J');
    }
}
