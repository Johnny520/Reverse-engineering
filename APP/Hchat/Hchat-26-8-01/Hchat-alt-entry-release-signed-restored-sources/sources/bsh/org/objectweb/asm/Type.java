package bsh.org.objectweb.asm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final int BYTE = 3;
    public static final int CHAR = 2;
    public static final int DOUBLE = 8;
    public static final int FLOAT = 6;
    public static final int INT = 5;
    private static final int INTERNAL = 12;
    public static final int LONG = 7;
    public static final int METHOD = 11;
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final int VOID = 0;
    private final int sort;
    private final int valueBegin;
    private final String valueBuffer;
    private final int valueEnd;
    private static final String PRIMITIVE_DESCRIPTORS = "VZCBSIFJD";
    public static final Type VOID_TYPE = new Type(0, PRIMITIVE_DESCRIPTORS, 0, 1);
    public static final Type BOOLEAN_TYPE = new Type(1, PRIMITIVE_DESCRIPTORS, 1, 2);
    public static final Type CHAR_TYPE = new Type(2, PRIMITIVE_DESCRIPTORS, 2, 3);
    public static final Type BYTE_TYPE = new Type(3, PRIMITIVE_DESCRIPTORS, 3, 4);
    public static final Type SHORT_TYPE = new Type(4, PRIMITIVE_DESCRIPTORS, 4, 5);
    public static final Type INT_TYPE = new Type(5, PRIMITIVE_DESCRIPTORS, 5, 6);
    public static final Type FLOAT_TYPE = new Type(6, PRIMITIVE_DESCRIPTORS, 6, 7);
    public static final Type LONG_TYPE = new Type(7, PRIMITIVE_DESCRIPTORS, 7, 8);
    public static final Type DOUBLE_TYPE = new Type(8, PRIMITIVE_DESCRIPTORS, 8, 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Type(int i9, String str, int i10, int i11) {
        this.sort = i9;
        this.valueBuffer = str;
        this.valueBegin = i10;
        this.valueEnd = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void appendDescriptor(StringBuilder sb2, Class<?> cls) {
        char c10;
        while (cls.isArray()) {
            sb2.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = name.charAt(i9);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb2.append(cCharAt);
            }
            sb2.append(';');
            return;
        }
        if (cls == Integer.TYPE) {
            c10 = 'I';
        } else if (cls == Void.TYPE) {
            c10 = 'V';
        } else if (cls == Boolean.TYPE) {
            c10 = 'Z';
        } else if (cls == Byte.TYPE) {
            c10 = 'B';
        } else if (cls == Character.TYPE) {
            c10 = 'C';
        } else if (cls == Short.TYPE) {
            c10 = 'S';
        } else if (cls == Double.TYPE) {
            c10 = 'D';
        } else if (cls == Float.TYPE) {
            c10 = 'F';
        } else {
            if (cls != Long.TYPE) {
                throw new AssertionError();
            }
            c10 = 'J';
        }
        sb2.append(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type[] getArgumentTypes(String str) {
        int i9;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (str.charAt(i13) != ')') {
            while (str.charAt(i13) == '[') {
                i13++;
            }
            int i14 = i13 + 1;
            if (str.charAt(i13) == 'L') {
                while (true) {
                    i13 = i14 + 1;
                    if (str.charAt(i14) != ';') {
                        i14 = i13;
                    }
                }
            } else {
                i13 = i14;
            }
            i12++;
        }
        Type[] typeArr = new Type[i12];
        while (str.charAt(i11) != ')') {
            int i15 = i11;
            while (str.charAt(i15) == '[') {
                i15++;
            }
            int i16 = i15 + 1;
            if (str.charAt(i15) == 'L') {
                while (true) {
                    i9 = i16 + 1;
                    if (str.charAt(i16) != ';') {
                        i16 = i9;
                    }
                }
            } else {
                i9 = i16;
            }
            typeArr[i10] = getType(str, i11, i9);
            i11 = i9;
            i10++;
        }
        return typeArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getArgumentsAndReturnSizes(String str) {
        int i9;
        char cCharAt = str.charAt(1);
        int i10 = 1;
        int i11 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i10++;
                i11 += 2;
            } else {
                while (str.charAt(i10) == '[') {
                    i10++;
                }
                int i12 = i10 + 1;
                if (str.charAt(i10) == 'L') {
                    while (true) {
                        i9 = i12 + 1;
                        if (str.charAt(i12) == ';') {
                            break;
                        }
                        i12 = i9;
                    }
                    i12 = i9;
                }
                i11++;
                i10 = i12;
            }
            cCharAt = str.charAt(i10);
        }
        char cCharAt2 = str.charAt(i10 + 1);
        if (cCharAt2 == 'V') {
            return i11 << 2;
        }
        return (i11 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getConstructorDescriptor(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (Class<?> cls : constructor.getParameterTypes()) {
            appendDescriptor(sb2, cls);
        }
        sb2.append(")V");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getInternalName(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getMethodDescriptor(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            appendDescriptor(sb2, cls);
        }
        sb2.append(')');
        appendDescriptor(sb2, method.getReturnType());
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getMethodType(String str) {
        return new Type(11, str, 0, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getObjectType(String str) {
        return new Type(str.charAt(0) == '[' ? 9 : 12, str, 0, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getReturnType(String str) {
        int i9 = 1;
        while (str.charAt(i9) != ')') {
            while (str.charAt(i9) == '[') {
                i9++;
            }
            int i10 = i9 + 1;
            if (str.charAt(i9) == 'L') {
                while (true) {
                    i9 = i10 + 1;
                    if (str.charAt(i10) != ';') {
                        i10 = i9;
                    }
                }
            } else {
                i9 = i10;
            }
        }
        return getType(str, i9 + 1, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Type getType(String str, int i9, int i10) {
        char cCharAt = str.charAt(i9);
        if (cCharAt == '(') {
            return new Type(11, str, i9, i10);
        }
        if (cCharAt == 'F') {
            return FLOAT_TYPE;
        }
        if (cCharAt == 'L') {
            return new Type(10, str, i9 + 1, i10 - 1);
        }
        if (cCharAt == 'S') {
            return SHORT_TYPE;
        }
        if (cCharAt == 'V') {
            return VOID_TYPE;
        }
        if (cCharAt == 'I') {
            return INT_TYPE;
        }
        if (cCharAt == 'J') {
            return LONG_TYPE;
        }
        if (cCharAt == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (cCharAt == '[') {
            return new Type(9, str, i9, i10);
        }
        switch (cCharAt) {
            case 'B':
                return BYTE_TYPE;
            case 'C':
                return CHAR_TYPE;
            case 'D':
                return DOUBLE_TYPE;
            default:
                C2104o.m5289o();
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        int i9 = this.sort;
        if (i9 == 12) {
            i9 = 10;
        }
        int i10 = type.sort;
        if (i9 != (i10 != 12 ? i10 : 10)) {
            return false;
        }
        int i11 = this.valueBegin;
        int i12 = this.valueEnd;
        int i13 = type.valueBegin;
        if (i12 - i11 != type.valueEnd - i13) {
            return false;
        }
        while (i11 < i12) {
            if (this.valueBuffer.charAt(i11) != type.valueBuffer.charAt(i13)) {
                return false;
            }
            i11++;
            i13++;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getClassName() {
        switch (this.sort) {
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
                StringBuilder sb2 = new StringBuilder(getElementType().getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                }
                return sb2.toString();
            case 10:
            case 12:
                return this.valueBuffer.substring(this.valueBegin, this.valueEnd).replace('/', '.');
            case 11:
            default:
                throw new AssertionError();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getDescriptor() {
        int i9 = this.sort;
        if (i9 == 10) {
            return this.valueBuffer.substring(this.valueBegin - 1, this.valueEnd + 1);
        }
        String str = this.valueBuffer;
        if (i9 != 12) {
            return str.substring(this.valueBegin, this.valueEnd);
        }
        StringBuilder sb2 = new StringBuilder("L");
        sb2.append((CharSequence) str, this.valueBegin, this.valueEnd);
        sb2.append(';');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getDimensions() {
        int i9 = 1;
        while (this.valueBuffer.charAt(this.valueBegin + i9) == '[') {
            i9++;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Type getElementType() {
        return getType(this.valueBuffer, this.valueBegin + getDimensions(), this.valueEnd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getOpcode(int i9) {
        if (i9 == 46 || i9 == 79) {
            switch (this.sort) {
                case 0:
                case 11:
                    throw new UnsupportedOperationException();
                case 1:
                case 3:
                    return i9 + 5;
                case 2:
                    return i9 + 6;
                case 4:
                    return i9 + 7;
                case 5:
                    return i9;
                case 6:
                    return i9 + 2;
                case 7:
                    return i9 + 1;
                case 8:
                    return i9 + 3;
                case 9:
                case 10:
                case 12:
                    return i9 + 4;
                default:
                    throw new AssertionError();
            }
        }
        switch (this.sort) {
            case 0:
                if (i9 == 172) {
                    return Opcodes.RETURN;
                }
                throw new UnsupportedOperationException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i9;
            case 6:
                return i9 + 2;
            case 7:
                return i9 + 1;
            case 8:
                return i9 + 3;
            case 9:
            case 10:
            case 12:
                if (i9 == 21 || i9 == 54 || i9 == 172) {
                    return i9 + 4;
                }
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            default:
                throw new AssertionError();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSize() {
        switch (this.sort) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
                return 1;
            case 7:
            case 8:
                return 2;
            case 11:
            default:
                throw new AssertionError();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSort() {
        int i9 = this.sort;
        if (i9 == 12) {
            return 10;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int i9 = this.sort;
        int iCharAt = (i9 == 12 ? 10 : i9) * 13;
        if (i9 >= 9) {
            int i10 = this.valueEnd;
            for (int i11 = this.valueBegin; i11 < i10; i11++) {
                iCharAt = (this.valueBuffer.charAt(i11) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getDescriptor();
    }

    public static Type getMethodType(Type type, Type... typeArr) {
        return getType(getMethodDescriptor(type, typeArr));
    }

    public String getInternalName() {
        return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
    }

    public static String getMethodDescriptor(Type type, Type... typeArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (Type type2 : typeArr) {
            type2.appendDescriptor(sb2);
        }
        sb2.append(')');
        type.appendDescriptor(sb2);
        return sb2.toString();
    }

    public static Type getReturnType(Method method) {
        return getType(method.getReturnType());
    }

    public Type getReturnType() {
        return getReturnType(getDescriptor());
    }

    public static String getDescriptor(Class<?> cls) {
        StringBuilder sb2 = new StringBuilder();
        appendDescriptor(sb2, cls);
        return sb2.toString();
    }

    public int getArgumentsAndReturnSizes() {
        return getArgumentsAndReturnSizes(getDescriptor());
    }

    public static Type[] getArgumentTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Type[] typeArr = new Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }

    public Type[] getArgumentTypes() {
        return getArgumentTypes(getDescriptor());
    }

    public static Type getType(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return INT_TYPE;
            }
            if (cls == Void.TYPE) {
                return VOID_TYPE;
            }
            if (cls == Boolean.TYPE) {
                return BOOLEAN_TYPE;
            }
            if (cls == Byte.TYPE) {
                return BYTE_TYPE;
            }
            if (cls == Character.TYPE) {
                return CHAR_TYPE;
            }
            if (cls == Short.TYPE) {
                return SHORT_TYPE;
            }
            if (cls == Double.TYPE) {
                return DOUBLE_TYPE;
            }
            if (cls == Float.TYPE) {
                return FLOAT_TYPE;
            }
            if (cls == Long.TYPE) {
                return LONG_TYPE;
            }
            throw new AssertionError();
        }
        return getType(getDescriptor(cls));
    }

    public static Type getType(Constructor<?> constructor) {
        return getType(getConstructorDescriptor(constructor));
    }

    public static Type getType(Method method) {
        return getType(getMethodDescriptor(method));
    }

    public static Type getType(String str) {
        return getType(str, 0, str.length());
    }

    private void appendDescriptor(StringBuilder sb2) {
        int i9 = this.sort;
        if (i9 == 10) {
            sb2.append((CharSequence) this.valueBuffer, this.valueBegin - 1, this.valueEnd + 1);
        } else {
            if (i9 == 12) {
                sb2.append('L');
                sb2.append((CharSequence) this.valueBuffer, this.valueBegin, this.valueEnd);
                sb2.append(';');
                return;
            }
            sb2.append((CharSequence) this.valueBuffer, this.valueBegin, this.valueEnd);
        }
    }
}
