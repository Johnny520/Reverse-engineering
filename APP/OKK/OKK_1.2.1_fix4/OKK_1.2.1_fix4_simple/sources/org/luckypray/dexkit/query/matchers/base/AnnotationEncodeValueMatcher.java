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
    public static final Companion Companion = null;
    private AnnotationEncodeValueType type;
    private IAnnotationEncodeValue value;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AnnotationEncodeValueMatcher createString$default(Companion r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = StringMatchType.Contains;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = false;
        L9:
            return r02.createString(r1, r2, r3);
        }

        public final AnnotationEncodeValueMatcher create(Number r2) {
            AbstractC0307g.m703e(r2, "number");
            return new AnnotationEncodeValueMatcher().numberValue(r2);
        }

        public final AnnotationEncodeValueMatcher createAnnotation(AnnotationMatcher r4) {
            AbstractC0307g.m703e(r4, "value");
            return new AnnotationEncodeValueMatcher(r4, AnnotationEncodeValueType.AnnotationValue, null);
        }

        public final AnnotationEncodeValueMatcher createArray(AnnotationEncodeArrayMatcher r4) {
            AbstractC0307g.m703e(r4, "value");
            return new AnnotationEncodeValueMatcher(r4, AnnotationEncodeValueType.ArrayValue, null);
        }

        public final AnnotationEncodeValueMatcher createBoolean(boolean r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.BoolValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueBoolean(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createByte(byte r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.ByteValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueByte(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createChar(char r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.CharValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueChar(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createClass(ClassMatcher r4) {
            AbstractC0307g.m703e(r4, "value");
            return new AnnotationEncodeValueMatcher(r4, AnnotationEncodeValueType.TypeValue, null);
        }

        public final AnnotationEncodeValueMatcher createDouble(double r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.DoubleValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueDouble(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createEnum(FieldMatcher r4) {
            AbstractC0307g.m703e(r4, "value");
            return new AnnotationEncodeValueMatcher(r4, AnnotationEncodeValueType.EnumValue, null);
        }

        public final AnnotationEncodeValueMatcher createFloat(float r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.FloatValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueFloat(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createInt(int r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.IntValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueInt(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createLong(long r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.LongValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueLong(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createMethod(MethodMatcher r4) {
            AbstractC0307g.m703e(r4, "value");
            return new AnnotationEncodeValueMatcher(r4, AnnotationEncodeValueType.MethodValue, null);
        }

        public final AnnotationEncodeValueMatcher createNull() {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.NullValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueNull(), r02, null);
        }

        public final AnnotationEncodeValueMatcher createShort(short r4) {
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.ShortValue;
            return new AnnotationEncodeValueMatcher(new EncodeValueShort(r4), r02, null);
        }

        public final AnnotationEncodeValueMatcher createString(String r8) {
            AbstractC0307g.m703e(r8, "value");
            return createString$default(this, r8, null, false, 6, null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AnnotationEncodeValueMatcher createString(String r8, StringMatchType r9) {
            AbstractC0307g.m703e(r8, "value");
            AbstractC0307g.m703e(r9, "matchType");
            return createString$default(this, r8, r9, false, 4, null);
        }

        public final AnnotationEncodeValueMatcher createString(StringMatcher r4) {
            AbstractC0307g.m703e(r4, "value");
            return new AnnotationEncodeValueMatcher(r4, AnnotationEncodeValueType.StringValue, null);
        }

        public final AnnotationEncodeValueMatcher createString(String r4, StringMatchType r5, boolean r6) {
            AbstractC0307g.m703e(r4, "value");
            AbstractC0307g.m703e(r5, "matchType");
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.StringValue;
            return new AnnotationEncodeValueMatcher(new StringMatcher(r4, r5, r6), r02, null);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationEncodeValueMatcher() {
    }

    public static final AnnotationEncodeValueMatcher create(Number r1) {
        return Companion.create(r1);
    }

    public static final AnnotationEncodeValueMatcher createAnnotation(AnnotationMatcher r1) {
        return Companion.createAnnotation(r1);
    }

    public static final AnnotationEncodeValueMatcher createArray(AnnotationEncodeArrayMatcher r1) {
        return Companion.createArray(r1);
    }

    public static final AnnotationEncodeValueMatcher createBoolean(boolean r1) {
        return Companion.createBoolean(r1);
    }

    public static final AnnotationEncodeValueMatcher createByte(byte r1) {
        return Companion.createByte(r1);
    }

    public static final AnnotationEncodeValueMatcher createChar(char r1) {
        return Companion.createChar(r1);
    }

    public static final AnnotationEncodeValueMatcher createClass(ClassMatcher r1) {
        return Companion.createClass(r1);
    }

    public static final AnnotationEncodeValueMatcher createDouble(double r1) {
        return Companion.createDouble(r1);
    }

    public static final AnnotationEncodeValueMatcher createEnum(FieldMatcher r1) {
        return Companion.createEnum(r1);
    }

    public static final AnnotationEncodeValueMatcher createFloat(float r1) {
        return Companion.createFloat(r1);
    }

    public static final AnnotationEncodeValueMatcher createInt(int r1) {
        return Companion.createInt(r1);
    }

    public static final AnnotationEncodeValueMatcher createLong(long r1) {
        return Companion.createLong(r1);
    }

    public static final AnnotationEncodeValueMatcher createMethod(MethodMatcher r1) {
        return Companion.createMethod(r1);
    }

    public static final AnnotationEncodeValueMatcher createNull() {
        return Companion.createNull();
    }

    public static final AnnotationEncodeValueMatcher createShort(short r1) {
        return Companion.createShort(r1);
    }

    public static final AnnotationEncodeValueMatcher createString(String r1) {
        return Companion.createString(r1);
    }

    public static /* synthetic */ AnnotationEncodeValueMatcher stringValue$default(AnnotationEncodeValueMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.stringValue(r1, r2, r3);
    }

    public final AnnotationEncodeValueMatcher annotationValue(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        this.value = r2;
        this.type = AnnotationEncodeValueType.AnnotationValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher arrayValue(AnnotationEncodeArrayMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        this.value = r2;
        this.type = AnnotationEncodeValueType.ArrayValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher boolValue(boolean r2) {
        this.value = new EncodeValueBoolean(r2);
        this.type = AnnotationEncodeValueType.BoolValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher byteValue(byte r2) {
        this.value = new EncodeValueByte(r2);
        this.type = AnnotationEncodeValueType.ByteValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher charValue(char r2) {
        this.value = new EncodeValueChar(r2);
        this.type = AnnotationEncodeValueType.CharValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher classValue(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        this.value = r2;
        this.type = AnnotationEncodeValueType.TypeValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher doubleValue(double r2) {
        this.value = new EncodeValueDouble(r2);
        this.type = AnnotationEncodeValueType.DoubleValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher enumValue(FieldMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        this.value = r2;
        this.type = AnnotationEncodeValueType.EnumValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher floatValue(float r2) {
        this.value = new EncodeValueFloat(r2);
        this.type = AnnotationEncodeValueType.FloatValue;
        return this;
    }

    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    public final IAnnotationEncodeValue getValue() {
        return this.value;
    }

    public final AnnotationEncodeValueMatcher intValue(int r2) {
        this.value = new EncodeValueInt(r2);
        this.type = AnnotationEncodeValueType.IntValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher longValue(long r2) {
        this.value = new EncodeValueLong(r2);
        this.type = AnnotationEncodeValueType.LongValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher methodValue(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        this.value = r2;
        this.type = AnnotationEncodeValueType.MethodValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher nullValue() {
        this.value = new EncodeValueNull();
        this.type = AnnotationEncodeValueType.NullValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher numberValue(Number r3) {
        AbstractC0307g.m703e(r3, "number");
        if ((r3 instanceof Byte) == false) goto L6;
        byteValue(r3.byteValue());
    L20:
        return this;
    L6:
        if ((r3 instanceof Short) == false) goto L9;
        shortValue(r3.shortValue());
        goto L20
    L9:
        if ((r3 instanceof Integer) == false) goto L12;
        intValue(r3.intValue());
        goto L20
    L12:
        if ((r3 instanceof Long) == false) goto L15;
        longValue(r3.longValue());
        goto L20
    L15:
        if ((r3 instanceof Float) == false) goto L18;
        floatValue(r3.floatValue());
        goto L20
    L18:
        if ((r3 instanceof Double) == false) goto L20;
        doubleValue(r3.doubleValue());
        goto L20
    }

    public final AnnotationEncodeValueMatcher shortValue(short r2) {
        this.value = new EncodeValueShort(r2);
        this.type = AnnotationEncodeValueType.ShortValue;
        return this;
    }

    public final AnnotationEncodeValueMatcher stringValue(String r8) {
        AbstractC0307g.m703e(r8, "value");
        return stringValue$default(this, r8, null, false, 6, null);
    }

    public /* synthetic */ AnnotationEncodeValueMatcher(IAnnotationEncodeValue r1, AnnotationEncodeValueType r2, AbstractC0304d r3) {
        this(r1, r2);
    }

    public static final AnnotationEncodeValueMatcher createString(String r1, StringMatchType r2) {
        return Companion.createString(r1, r2);
    }

    public final AnnotationEncodeValueMatcher stringValue(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "value");
        AbstractC0307g.m703e(r9, "matchType");
        return stringValue$default(this, r8, r9, false, 4, null);
    }

    private AnnotationEncodeValueMatcher(IAnnotationEncodeValue r1, AnnotationEncodeValueType r2) {
        this.value = r1;
        this.type = r2;
    }

    private final AnnotationEncodeValueMatcher annotationValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        annotationValue(r02);
        return this;
    }

    private final AnnotationEncodeValueMatcher arrayValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationEncodeArrayMatcher r02 = new AnnotationEncodeArrayMatcher();
        r2.invoke(r02);
        arrayValue(r02);
        return this;
    }

    private final AnnotationEncodeValueMatcher classValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        classValue(r02);
        return this;
    }

    public static final AnnotationEncodeValueMatcher createString(String r1, StringMatchType r2, boolean r3) {
        return Companion.createString(r1, r2, r3);
    }

    private final AnnotationEncodeValueMatcher enumValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FieldMatcher r02 = new FieldMatcher();
        r2.invoke(r02);
        enumValue(r02);
        return this;
    }

    private final AnnotationEncodeValueMatcher methodValue(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        methodValue(r02);
        return this;
    }

    public final AnnotationEncodeValueMatcher stringValue(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "value");
        this.value = r2;
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }

    public static final AnnotationEncodeValueMatcher createString(StringMatcher r1) {
        return Companion.createString(r1);
    }

    public final AnnotationEncodeValueMatcher stringValue(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "value");
        AbstractC0307g.m703e(r3, "matchType");
        this.value = new StringMatcher(r2, r3, r4);
        this.type = AnnotationEncodeValueType.StringValue;
        return this;
    }
}
