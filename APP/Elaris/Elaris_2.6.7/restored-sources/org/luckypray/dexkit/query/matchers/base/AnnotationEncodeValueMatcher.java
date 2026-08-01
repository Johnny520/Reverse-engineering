package org.luckypray.dexkit.query.matchers.base;

import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.QueryComponent;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher;
import org.luckypray.dexkit.query.matchers.AnnotationMatcher;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.EncodeValueBoolean;
import org.luckypray.dexkit.query.matchers.EncodeValueByte;
import org.luckypray.dexkit.query.matchers.EncodeValueChar;
import org.luckypray.dexkit.query.matchers.EncodeValueDouble;
import org.luckypray.dexkit.query.matchers.EncodeValueFloat;
import org.luckypray.dexkit.query.matchers.EncodeValueInt;
import org.luckypray.dexkit.query.matchers.EncodeValueLong;
import org.luckypray.dexkit.query.matchers.EncodeValueNull;
import org.luckypray.dexkit.query.matchers.EncodeValueShort;
import org.luckypray.dexkit.query.matchers.FieldMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import p000.AbstractC0431r2;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeValueMatcher implements QueryComponent {
    public static final Companion Companion = new Companion(null);
    private AnnotationEncodeValueType type;
    private IAnnotationEncodeValue value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AnnotationEncodeValueMatcher(IAnnotationEncodeValue iAnnotationEncodeValue, AnnotationEncodeValueType annotationEncodeValueType) {
        this.value = iAnnotationEncodeValue;
        this.type = annotationEncodeValueType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher create(Number number) {
        return Companion.create(number);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createAnnotation(AnnotationMatcher annotationMatcher) {
        return Companion.createAnnotation(annotationMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createArray(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
        return Companion.createArray(annotationEncodeArrayMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createBoolean(boolean z) {
        return Companion.createBoolean(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createByte(byte b) {
        return Companion.createByte(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createChar(char c) {
        return Companion.createChar(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createClass(ClassMatcher classMatcher) {
        return Companion.createClass(classMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createDouble(double d) {
        return Companion.createDouble(d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createEnum(FieldMatcher fieldMatcher) {
        return Companion.createEnum(fieldMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createFloat(float f) {
        return Companion.createFloat(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createInt(int i) {
        return Companion.createInt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createLong(long j) {
        return Companion.createLong(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createMethod(MethodMatcher methodMatcher) {
        return Companion.createMethod(methodMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createNull() {
        return Companion.createNull();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createShort(short s) {
        return Companion.createShort(s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationEncodeValueMatcher createString(String str) {
        return Companion.createString(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationEncodeValueMatcher stringValue$default(AnnotationEncodeValueMatcher annotationEncodeValueMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return annotationEncodeValueMatcher.stringValue(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ AnnotationEncodeValueMatcher annotationValue(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0482u5.invoke(annotationMatcher);
        annotationValue(annotationMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ AnnotationEncodeValueMatcher arrayValue(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher = new AnnotationEncodeArrayMatcher();
        interfaceC0482u5.invoke(annotationEncodeArrayMatcher);
        arrayValue(annotationEncodeArrayMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher boolValue(boolean z) {
        this.value = new EncodeValueBoolean(z);
        this.type = AnnotationEncodeValueType.BoolValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher byteValue(byte b) {
        this.value = new EncodeValueByte(b);
        this.type = AnnotationEncodeValueType.ByteValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher charValue(char c) {
        this.value = new EncodeValueChar(c);
        this.type = AnnotationEncodeValueType.CharValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ AnnotationEncodeValueMatcher classValue(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        classValue(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher doubleValue(double d) {
        this.value = new EncodeValueDouble(d);
        this.type = AnnotationEncodeValueType.DoubleValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ AnnotationEncodeValueMatcher enumValue(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        enumValue(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher floatValue(float f) {
        this.value = new EncodeValueFloat(f);
        this.type = AnnotationEncodeValueType.FloatValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IAnnotationEncodeValue getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher intValue(int i) {
        this.value = new EncodeValueInt(i);
        this.type = AnnotationEncodeValueType.IntValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher longValue(long j) {
        this.value = new EncodeValueLong(j);
        this.type = AnnotationEncodeValueType.LongValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ AnnotationEncodeValueMatcher methodValue(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        methodValue(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher nullValue() {
        this.value = new EncodeValueNull();
        this.type = AnnotationEncodeValueType.NullValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher numberValue(Number number) {
        number.getClass();
        if (number instanceof Byte) {
            byteValue(number.byteValue());
            return this;
        }
        if (number instanceof Short) {
            shortValue(number.shortValue());
            return this;
        }
        if (number instanceof Integer) {
            intValue(number.intValue());
            return this;
        }
        if (number instanceof Long) {
            longValue(number.longValue());
            return this;
        }
        if (number instanceof Float) {
            floatValue(number.floatValue());
            return this;
        }
        if (number instanceof Double) {
            doubleValue(number.doubleValue());
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher shortValue(short s) {
        this.value = new EncodeValueShort(s);
        this.type = AnnotationEncodeValueType.ShortValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueMatcher stringValue(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.value = new StringMatcher(str, stringMatchType, z);
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ AnnotationEncodeValueMatcher createString$default(Companion companion, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                stringMatchType = StringMatchType.Contains;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.createString(str, stringMatchType, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher create(Number number) {
            number.getClass();
            return new AnnotationEncodeValueMatcher().numberValue(number);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createAnnotation(AnnotationMatcher annotationMatcher) {
            annotationMatcher.getClass();
            return new AnnotationEncodeValueMatcher(annotationMatcher, AnnotationEncodeValueType.AnnotationValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createArray(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
            annotationEncodeArrayMatcher.getClass();
            return new AnnotationEncodeValueMatcher(annotationEncodeArrayMatcher, AnnotationEncodeValueType.ArrayValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createBoolean(boolean z) {
            return new AnnotationEncodeValueMatcher(new EncodeValueBoolean(z), AnnotationEncodeValueType.BoolValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createByte(byte b) {
            return new AnnotationEncodeValueMatcher(new EncodeValueByte(b), AnnotationEncodeValueType.ByteValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createChar(char c) {
            return new AnnotationEncodeValueMatcher(new EncodeValueChar(c), AnnotationEncodeValueType.CharValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createClass(ClassMatcher classMatcher) {
            classMatcher.getClass();
            return new AnnotationEncodeValueMatcher(classMatcher, AnnotationEncodeValueType.TypeValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createDouble(double d) {
            return new AnnotationEncodeValueMatcher(new EncodeValueDouble(d), AnnotationEncodeValueType.DoubleValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createEnum(FieldMatcher fieldMatcher) {
            fieldMatcher.getClass();
            return new AnnotationEncodeValueMatcher(fieldMatcher, AnnotationEncodeValueType.EnumValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createFloat(float f) {
            return new AnnotationEncodeValueMatcher(new EncodeValueFloat(f), AnnotationEncodeValueType.FloatValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createInt(int i) {
            return new AnnotationEncodeValueMatcher(new EncodeValueInt(i), AnnotationEncodeValueType.IntValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createLong(long j) {
            return new AnnotationEncodeValueMatcher(new EncodeValueLong(j), AnnotationEncodeValueType.LongValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createMethod(MethodMatcher methodMatcher) {
            methodMatcher.getClass();
            return new AnnotationEncodeValueMatcher(methodMatcher, AnnotationEncodeValueType.MethodValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createNull() {
            return new AnnotationEncodeValueMatcher(new EncodeValueNull(), AnnotationEncodeValueType.NullValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createShort(short s) {
            return new AnnotationEncodeValueMatcher(new EncodeValueShort(s), AnnotationEncodeValueType.ShortValue, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType, boolean z) {
            str.getClass();
            stringMatchType.getClass();
            return new AnnotationEncodeValueMatcher(new StringMatcher(str, stringMatchType, z), AnnotationEncodeValueType.StringValue, null);
        }

        private Companion() {
        }

        public final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType) {
            str.getClass();
            stringMatchType.getClass();
            return createString$default(this, str, stringMatchType, false, 4, null);
        }

        public final AnnotationEncodeValueMatcher createString(StringMatcher stringMatcher) {
            stringMatcher.getClass();
            return new AnnotationEncodeValueMatcher(stringMatcher, AnnotationEncodeValueType.StringValue, null);
        }

        public final AnnotationEncodeValueMatcher createString(String str) {
            str.getClass();
            return createString$default(this, str, null, false, 6, null);
        }
    }

    public static final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType) {
        return Companion.createString(str, stringMatchType);
    }

    public AnnotationEncodeValueMatcher() {
    }

    public static final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType, boolean z) {
        return Companion.createString(str, stringMatchType, z);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.query.base.IAnnotationEncodeValue)
  (r2v0 org.luckypray.dexkit.query.enums.AnnotationEncodeValueType)
 A[MD:(org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void (m)] (LINE:10) call: org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.<init>(org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void type: THIS */
    public /* synthetic */ AnnotationEncodeValueMatcher(IAnnotationEncodeValue iAnnotationEncodeValue, AnnotationEncodeValueType annotationEncodeValueType, AbstractC0431r2 abstractC0431r2) {
        this(iAnnotationEncodeValue, annotationEncodeValueType);
    }

    public static final AnnotationEncodeValueMatcher createString(StringMatcher stringMatcher) {
        return Companion.createString(stringMatcher);
    }

    public final AnnotationEncodeValueMatcher annotationValue(AnnotationMatcher annotationMatcher) {
        annotationMatcher.getClass();
        this.value = annotationMatcher;
        this.type = AnnotationEncodeValueType.AnnotationValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher arrayValue(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
        annotationEncodeArrayMatcher.getClass();
        this.value = annotationEncodeArrayMatcher;
        this.type = AnnotationEncodeValueType.ArrayValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher classValue(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.value = classMatcher;
        this.type = AnnotationEncodeValueType.TypeValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher enumValue(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        this.value = fieldMatcher;
        this.type = AnnotationEncodeValueType.EnumValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher methodValue(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        this.value = methodMatcher;
        this.type = AnnotationEncodeValueType.MethodValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher stringValue(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return stringValue$default(this, str, stringMatchType, false, 4, null);
    }

    public final AnnotationEncodeValueMatcher stringValue(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        this.value = stringMatcher;
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher stringValue(String str) {
        str.getClass();
        return stringValue$default(this, str, null, false, 6, null);
    }
}
