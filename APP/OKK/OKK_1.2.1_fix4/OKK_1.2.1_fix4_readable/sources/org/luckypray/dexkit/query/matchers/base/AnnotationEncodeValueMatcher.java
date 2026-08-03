package org.luckypray.dexkit.query.matchers.base;

import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.IQuery;
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
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeValueMatcher implements IQuery {
    public static final Companion Companion = new Companion(null);
    private AnnotationEncodeValueType type;
    private IAnnotationEncodeValue value;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AnnotationEncodeValueMatcher createString$default(Companion companion, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                stringMatchType = StringMatchType.Contains;
            }
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return companion.createString(str, stringMatchType, z2);
        }

        public final AnnotationEncodeValueMatcher create(Number number) {
            AbstractC0307g.m703e(number, "number");
            return new AnnotationEncodeValueMatcher().numberValue(number);
        }

        public final AnnotationEncodeValueMatcher createAnnotation(AnnotationMatcher annotationMatcher) {
            AbstractC0307g.m703e(annotationMatcher, "value");
            return new AnnotationEncodeValueMatcher(annotationMatcher, AnnotationEncodeValueType.AnnotationValue, null);
        }

        public final AnnotationEncodeValueMatcher createArray(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
            AbstractC0307g.m703e(annotationEncodeArrayMatcher, "value");
            return new AnnotationEncodeValueMatcher(annotationEncodeArrayMatcher, AnnotationEncodeValueType.ArrayValue, null);
        }

        public final AnnotationEncodeValueMatcher createBoolean(boolean z2) {
            return new AnnotationEncodeValueMatcher(new EncodeValueBoolean(z2), AnnotationEncodeValueType.BoolValue, null);
        }

        public final AnnotationEncodeValueMatcher createByte(byte b2) {
            return new AnnotationEncodeValueMatcher(new EncodeValueByte(b2), AnnotationEncodeValueType.ByteValue, null);
        }

        public final AnnotationEncodeValueMatcher createChar(char c) {
            return new AnnotationEncodeValueMatcher(new EncodeValueChar(c), AnnotationEncodeValueType.CharValue, null);
        }

        public final AnnotationEncodeValueMatcher createClass(ClassMatcher classMatcher) {
            AbstractC0307g.m703e(classMatcher, "value");
            return new AnnotationEncodeValueMatcher(classMatcher, AnnotationEncodeValueType.TypeValue, null);
        }

        public final AnnotationEncodeValueMatcher createDouble(double d2) {
            return new AnnotationEncodeValueMatcher(new EncodeValueDouble(d2), AnnotationEncodeValueType.DoubleValue, null);
        }

        public final AnnotationEncodeValueMatcher createEnum(FieldMatcher fieldMatcher) {
            AbstractC0307g.m703e(fieldMatcher, "value");
            return new AnnotationEncodeValueMatcher(fieldMatcher, AnnotationEncodeValueType.EnumValue, null);
        }

        public final AnnotationEncodeValueMatcher createFloat(float f2) {
            return new AnnotationEncodeValueMatcher(new EncodeValueFloat(f2), AnnotationEncodeValueType.FloatValue, null);
        }

        public final AnnotationEncodeValueMatcher createInt(int i2) {
            return new AnnotationEncodeValueMatcher(new EncodeValueInt(i2), AnnotationEncodeValueType.IntValue, null);
        }

        public final AnnotationEncodeValueMatcher createLong(long j2) {
            return new AnnotationEncodeValueMatcher(new EncodeValueLong(j2), AnnotationEncodeValueType.LongValue, null);
        }

        public final AnnotationEncodeValueMatcher createMethod(MethodMatcher methodMatcher) {
            AbstractC0307g.m703e(methodMatcher, "value");
            return new AnnotationEncodeValueMatcher(methodMatcher, AnnotationEncodeValueType.MethodValue, null);
        }

        public final AnnotationEncodeValueMatcher createNull() {
            return new AnnotationEncodeValueMatcher(new EncodeValueNull(), AnnotationEncodeValueType.NullValue, null);
        }

        public final AnnotationEncodeValueMatcher createShort(short s2) {
            return new AnnotationEncodeValueMatcher(new EncodeValueShort(s2), AnnotationEncodeValueType.ShortValue, null);
        }

        public final AnnotationEncodeValueMatcher createString(String str) {
            AbstractC0307g.m703e(str, "value");
            return createString$default(this, str, null, false, 6, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType) {
            AbstractC0307g.m703e(str, "value");
            AbstractC0307g.m703e(stringMatchType, "matchType");
            return createString$default(this, str, stringMatchType, false, 4, null);
        }

        public final AnnotationEncodeValueMatcher createString(StringMatcher stringMatcher) {
            AbstractC0307g.m703e(stringMatcher, "value");
            return new AnnotationEncodeValueMatcher(stringMatcher, AnnotationEncodeValueType.StringValue, null);
        }

        public final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType, boolean z2) {
            AbstractC0307g.m703e(str, "value");
            AbstractC0307g.m703e(stringMatchType, "matchType");
            return new AnnotationEncodeValueMatcher(new StringMatcher(str, stringMatchType, z2), AnnotationEncodeValueType.StringValue, null);
        }
    }

    public AnnotationEncodeValueMatcher() {
    }

    public static final AnnotationEncodeValueMatcher create(Number number) {
        return Companion.create(number);
    }

    public static final AnnotationEncodeValueMatcher createAnnotation(AnnotationMatcher annotationMatcher) {
        return Companion.createAnnotation(annotationMatcher);
    }

    public static final AnnotationEncodeValueMatcher createArray(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
        return Companion.createArray(annotationEncodeArrayMatcher);
    }

    public static final AnnotationEncodeValueMatcher createBoolean(boolean z2) {
        return Companion.createBoolean(z2);
    }

    public static final AnnotationEncodeValueMatcher createByte(byte b2) {
        return Companion.createByte(b2);
    }

    public static final AnnotationEncodeValueMatcher createChar(char c) {
        return Companion.createChar(c);
    }

    public static final AnnotationEncodeValueMatcher createClass(ClassMatcher classMatcher) {
        return Companion.createClass(classMatcher);
    }

    public static final AnnotationEncodeValueMatcher createDouble(double d2) {
        return Companion.createDouble(d2);
    }

    public static final AnnotationEncodeValueMatcher createEnum(FieldMatcher fieldMatcher) {
        return Companion.createEnum(fieldMatcher);
    }

    public static final AnnotationEncodeValueMatcher createFloat(float f2) {
        return Companion.createFloat(f2);
    }

    public static final AnnotationEncodeValueMatcher createInt(int i2) {
        return Companion.createInt(i2);
    }

    public static final AnnotationEncodeValueMatcher createLong(long j2) {
        return Companion.createLong(j2);
    }

    public static final AnnotationEncodeValueMatcher createMethod(MethodMatcher methodMatcher) {
        return Companion.createMethod(methodMatcher);
    }

    public static final AnnotationEncodeValueMatcher createNull() {
        return Companion.createNull();
    }

    public static final AnnotationEncodeValueMatcher createShort(short s2) {
        return Companion.createShort(s2);
    }

    public static final AnnotationEncodeValueMatcher createString(String str) {
        return Companion.createString(str);
    }

    public static /* synthetic */ AnnotationEncodeValueMatcher stringValue$default(AnnotationEncodeValueMatcher annotationEncodeValueMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return annotationEncodeValueMatcher.stringValue(str, stringMatchType, z2);
    }

    public final AnnotationEncodeValueMatcher annotationValue(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "value");
        this.value = annotationMatcher;
        this.type = AnnotationEncodeValueType.AnnotationValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher arrayValue(AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
        AbstractC0307g.m703e(annotationEncodeArrayMatcher, "value");
        this.value = annotationEncodeArrayMatcher;
        this.type = AnnotationEncodeValueType.ArrayValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher boolValue(boolean z2) {
        this.value = new EncodeValueBoolean(z2);
        this.type = AnnotationEncodeValueType.BoolValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher byteValue(byte b2) {
        this.value = new EncodeValueByte(b2);
        this.type = AnnotationEncodeValueType.ByteValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher charValue(char c) {
        this.value = new EncodeValueChar(c);
        this.type = AnnotationEncodeValueType.CharValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher classValue(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "value");
        this.value = classMatcher;
        this.type = AnnotationEncodeValueType.TypeValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher doubleValue(double d2) {
        this.value = new EncodeValueDouble(d2);
        this.type = AnnotationEncodeValueType.DoubleValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher enumValue(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "value");
        this.value = fieldMatcher;
        this.type = AnnotationEncodeValueType.EnumValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher floatValue(float f2) {
        this.value = new EncodeValueFloat(f2);
        this.type = AnnotationEncodeValueType.FloatValue;
        return this;
    }

    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    public final IAnnotationEncodeValue getValue() {
        return this.value;
    }

    public final AnnotationEncodeValueMatcher intValue(int i2) {
        this.value = new EncodeValueInt(i2);
        this.type = AnnotationEncodeValueType.IntValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher longValue(long j2) {
        this.value = new EncodeValueLong(j2);
        this.type = AnnotationEncodeValueType.LongValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher methodValue(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "value");
        this.value = methodMatcher;
        this.type = AnnotationEncodeValueType.MethodValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher nullValue() {
        this.value = new EncodeValueNull();
        this.type = AnnotationEncodeValueType.NullValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher numberValue(Number number) {
        AbstractC0307g.m703e(number, "number");
        if (number instanceof Byte) {
            byteValue(number.byteValue());
        } else if (number instanceof Short) {
            shortValue(number.shortValue());
        } else if (number instanceof Integer) {
            intValue(number.intValue());
        } else if (number instanceof Long) {
            longValue(number.longValue());
        } else if (number instanceof Float) {
            floatValue(number.floatValue());
        } else if (number instanceof Double) {
            doubleValue(number.doubleValue());
        }
        return this;
    }

    public final AnnotationEncodeValueMatcher shortValue(short s2) {
        this.value = new EncodeValueShort(s2);
        this.type = AnnotationEncodeValueType.ShortValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher stringValue(String str) {
        AbstractC0307g.m703e(str, "value");
        return stringValue$default(this, str, null, false, 6, null);
    }

    public /* synthetic */ AnnotationEncodeValueMatcher(IAnnotationEncodeValue iAnnotationEncodeValue, AnnotationEncodeValueType annotationEncodeValueType, AbstractC0304d abstractC0304d) {
        this(iAnnotationEncodeValue, annotationEncodeValueType);
    }

    public static final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType) {
        return Companion.createString(str, stringMatchType);
    }

    public final AnnotationEncodeValueMatcher stringValue(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return stringValue$default(this, str, stringMatchType, false, 4, null);
    }

    private AnnotationEncodeValueMatcher(IAnnotationEncodeValue iAnnotationEncodeValue, AnnotationEncodeValueType annotationEncodeValueType) {
        this.value = iAnnotationEncodeValue;
        this.type = annotationEncodeValueType;
    }

    private final AnnotationEncodeValueMatcher annotationValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        annotationValue(annotationMatcher);
        return this;
    }

    private final AnnotationEncodeValueMatcher arrayValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher = new AnnotationEncodeArrayMatcher();
        interfaceC0286l.invoke(annotationEncodeArrayMatcher);
        arrayValue(annotationEncodeArrayMatcher);
        return this;
    }

    private final AnnotationEncodeValueMatcher classValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        classValue(classMatcher);
        return this;
    }

    public static final AnnotationEncodeValueMatcher createString(String str, StringMatchType stringMatchType, boolean z2) {
        return Companion.createString(str, stringMatchType, z2);
    }

    private final AnnotationEncodeValueMatcher enumValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0286l.invoke(fieldMatcher);
        enumValue(fieldMatcher);
        return this;
    }

    private final AnnotationEncodeValueMatcher methodValue(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        methodValue(methodMatcher);
        return this;
    }

    public final AnnotationEncodeValueMatcher stringValue(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "value");
        this.value = stringMatcher;
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }

    public static final AnnotationEncodeValueMatcher createString(StringMatcher stringMatcher) {
        return Companion.createString(stringMatcher);
    }

    public final AnnotationEncodeValueMatcher stringValue(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "value");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.value = new StringMatcher(str, stringMatchType, z2);
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }
}
