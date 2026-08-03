package org.luckypray.dexkit.result;

import com.google.flatbuffers.AbstractC0735d;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.result.AnnotationData;
import org.luckypray.dexkit.result.AnnotationEncodeArrayData;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.AnnotationEncodeArray;
import org.luckypray.dexkit.schema.AnnotationEncodeValueMeta;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.schema.ClassMeta;
import org.luckypray.dexkit.schema.EncodeValueBoolean;
import org.luckypray.dexkit.schema.EncodeValueByte;
import org.luckypray.dexkit.schema.EncodeValueChar;
import org.luckypray.dexkit.schema.EncodeValueDouble;
import org.luckypray.dexkit.schema.EncodeValueFloat;
import org.luckypray.dexkit.schema.EncodeValueInt;
import org.luckypray.dexkit.schema.EncodeValueLong;
import org.luckypray.dexkit.schema.EncodeValueNull;
import org.luckypray.dexkit.schema.EncodeValueShort;
import org.luckypray.dexkit.schema.EncodeValueString;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.schema.MethodMeta;
import p007D0.C0137c;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeValue {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4418Companion = null;
    private final AnnotationEncodeValueType type;
    private final Object value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] r02 = new int[AnnotationEncodeValueType.values().length];
                r02[AnnotationEncodeValueType.ByteValue.ordinal()] = 1;     // Catch: NoSuchFieldError -> L20
            L53:
                r02[AnnotationEncodeValueType.ShortValue.ordinal()] = 2;     // Catch: NoSuchFieldError -> L21
            L63:
                r02[AnnotationEncodeValueType.CharValue.ordinal()] = 3;     // Catch: NoSuchFieldError -> L22
            L39:
                r02[AnnotationEncodeValueType.IntValue.ordinal()] = 4;     // Catch: NoSuchFieldError -> L23
            L41:
                r02[AnnotationEncodeValueType.LongValue.ordinal()] = 5;     // Catch: NoSuchFieldError -> L24
            L49:
                r02[AnnotationEncodeValueType.FloatValue.ordinal()] = 6;     // Catch: NoSuchFieldError -> L25
            L59:
                r02[AnnotationEncodeValueType.DoubleValue.ordinal()] = 7;     // Catch: NoSuchFieldError -> L26
            L45:
                r02[AnnotationEncodeValueType.StringValue.ordinal()] = 8;     // Catch: NoSuchFieldError -> L27
            L55:
                r02[AnnotationEncodeValueType.TypeValue.ordinal()] = 9;     // Catch: NoSuchFieldError -> L28
            L57:
                r02[AnnotationEncodeValueType.MethodValue.ordinal()] = 10;     // Catch: NoSuchFieldError -> L29
            L37:
                r02[AnnotationEncodeValueType.EnumValue.ordinal()] = 11;     // Catch: NoSuchFieldError -> L30
            L51:
                r02[AnnotationEncodeValueType.ArrayValue.ordinal()] = 12;     // Catch: NoSuchFieldError -> L31
            L61:
                r02[AnnotationEncodeValueType.AnnotationValue.ordinal()] = 13;     // Catch: NoSuchFieldError -> L32
            L35:
                r02[AnnotationEncodeValueType.NullValue.ordinal()] = 14;     // Catch: NoSuchFieldError -> L33
            L43:
                r02[AnnotationEncodeValueType.BoolValue.ordinal()] = 15;     // Catch: NoSuchFieldError -> L34
            L18:
                $EnumSwitchMapping$0 = r02;
            }
        }

        private Companion() {
        }

        public final AnnotationEncodeValue from(DexKitBridge r4, AnnotationEncodeValueMeta r5) {
            AbstractC0307g.m703e(r4, "bridge");
            AbstractC0307g.m703e(r5, "encodeValueMeta");
            AnnotationEncodeValueType r02 = AnnotationEncodeValueType.Companion.m2671from7apg3OU(r5.m2684getValueTypew2LRezQ());
            switch(WhenMappings.$EnumSwitchMapping$0[r02.ordinal()]) {
                case 1: goto L20;
                case 2: goto L19;
                case 3: goto L18;
                case 4: goto L17;
                case 5: goto L16;
                case 6: goto L15;
                case 7: goto L14;
                case 8: goto L13;
                case 9: goto L12;
                case 10: goto L11;
                case 11: goto L10;
                case 12: goto L9;
                case 13: goto L8;
                case 14: goto L7;
                case 15: goto L6;
                default: goto L5;
            };
        L6:
            AbstractC0735d r42 = r5.value(new EncodeValueBoolean());
            AbstractC0307g.m701c(r42, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
            Object r43 = Boolean.valueOf(((EncodeValueBoolean) r42).getValue());
        L22:
            return new AnnotationEncodeValue(r43, r02, null);
        L7:
            AbstractC0735d r44 = r5.value(new EncodeValueNull());
            AbstractC0307g.m701c(r44, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
            r43 = (EncodeValueNull) r44;
            goto L22
        L8:
            AnnotationData.Companion r1 = AnnotationData.f4415Companion;
            AbstractC0735d r52 = r5.value(new AnnotationMeta());
            AbstractC0307g.m701c(r52, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
            r43 = r1.from(r4, (AnnotationMeta) r52);
            goto L22
        L9:
            AnnotationEncodeArrayData.Companion r12 = AnnotationEncodeArrayData.f4417Companion;
            AbstractC0735d r53 = r5.value(new AnnotationEncodeArray());
            AbstractC0307g.m701c(r53, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
            r43 = r12.from(r4, (AnnotationEncodeArray) r53);
            goto L22
        L10:
            FieldData.Companion r13 = FieldData.f4420Companion;
            AbstractC0735d r54 = r5.value(new FieldMeta());
            AbstractC0307g.m701c(r54, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
            r43 = r13.from(r4, (FieldMeta) r54);
            goto L22
        L11:
            MethodData.Companion r14 = MethodData.f4421Companion;
            AbstractC0735d r55 = r5.value(new MethodMeta());
            AbstractC0307g.m701c(r55, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
            r43 = r14.from(r4, (MethodMeta) r55);
            goto L22
        L12:
            ClassData.Companion r15 = ClassData.f4419Companion;
            AbstractC0735d r56 = r5.value(new ClassMeta());
            AbstractC0307g.m701c(r56, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
            r43 = r15.from(r4, (ClassMeta) r56);
            goto L22
        L13:
            AbstractC0735d r45 = r5.value(new EncodeValueString());
            AbstractC0307g.m701c(r45, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
            r43 = ((EncodeValueString) r45).getValue();
            AbstractC0307g.m700b(r43);
            goto L22
        L14:
            AbstractC0735d r46 = r5.value(new EncodeValueDouble());
            AbstractC0307g.m701c(r46, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
            r43 = Double.valueOf(((EncodeValueDouble) r46).getValue());
            goto L22
        L15:
            AbstractC0735d r47 = r5.value(new EncodeValueFloat());
            AbstractC0307g.m701c(r47, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
            r43 = Float.valueOf(((EncodeValueFloat) r47).getValue());
            goto L22
        L16:
            AbstractC0735d r48 = r5.value(new EncodeValueLong());
            AbstractC0307g.m701c(r48, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
            r43 = Long.valueOf(((EncodeValueLong) r48).getValue());
            goto L22
        L17:
            AbstractC0735d r49 = r5.value(new EncodeValueInt());
            AbstractC0307g.m701c(r49, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
            r43 = Integer.valueOf(((EncodeValueInt) r49).getValue());
            goto L22
        L18:
            AbstractC0735d r410 = r5.value(new EncodeValueChar());
            AbstractC0307g.m701c(r410, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
            r43 = Short.valueOf(((EncodeValueChar) r410).getValue());
            goto L22
        L19:
            AbstractC0735d r411 = r5.value(new EncodeValueShort());
            AbstractC0307g.m701c(r411, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
            r43 = Short.valueOf(((EncodeValueShort) r411).getValue());
            goto L22
        L20:
            AbstractC0735d r412 = r5.value(new EncodeValueByte());
            AbstractC0307g.m701c(r412, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
            r43 = Byte.valueOf(((EncodeValueByte) r412).getValue());
            goto L22
        L5:
            throw new C0137c();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AnnotationEncodeValue from(Object r3, AnnotationEncodeValueType r4) {
            AbstractC0307g.m703e(r3, "value");
            AbstractC0307g.m703e(r4, "type");
            return new AnnotationEncodeValue(r3, r4, null);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r02 = new int[AnnotationEncodeValueType.values().length];
            r02[AnnotationEncodeValueType.ByteValue.ordinal()] = 1;     // Catch: NoSuchFieldError -> L18
        L37:
            r02[AnnotationEncodeValueType.ShortValue.ordinal()] = 2;     // Catch: NoSuchFieldError -> L19
        L55:
            r02[AnnotationEncodeValueType.IntValue.ordinal()] = 3;     // Catch: NoSuchFieldError -> L20
        L41:
            r02[AnnotationEncodeValueType.LongValue.ordinal()] = 4;     // Catch: NoSuchFieldError -> L21
        L45:
            r02[AnnotationEncodeValueType.FloatValue.ordinal()] = 5;     // Catch: NoSuchFieldError -> L22
        L31:
            r02[AnnotationEncodeValueType.DoubleValue.ordinal()] = 6;     // Catch: NoSuchFieldError -> L23
        L47:
            r02[AnnotationEncodeValueType.TypeValue.ordinal()] = 7;     // Catch: NoSuchFieldError -> L24
        L49:
            r02[AnnotationEncodeValueType.MethodValue.ordinal()] = 8;     // Catch: NoSuchFieldError -> L25
        L39:
            r02[AnnotationEncodeValueType.EnumValue.ordinal()] = 9;     // Catch: NoSuchFieldError -> L26
        L43:
            r02[AnnotationEncodeValueType.ArrayValue.ordinal()] = 10;     // Catch: NoSuchFieldError -> L27
        L33:
            r02[AnnotationEncodeValueType.AnnotationValue.ordinal()] = 11;     // Catch: NoSuchFieldError -> L28
        L35:
            r02[AnnotationEncodeValueType.StringValue.ordinal()] = 12;     // Catch: NoSuchFieldError -> L29
        L53:
            r02[AnnotationEncodeValueType.NullValue.ordinal()] = 13;     // Catch: NoSuchFieldError -> L30
        L16:
            $EnumSwitchMapping$0 = r02;
        }
    }

    static {
        f4418Companion = new Companion(null);
    }

    public /* synthetic */ AnnotationEncodeValue(Object r1, AnnotationEncodeValueType r2, AbstractC0304d r3) {
        this(r1, r2);
    }

    public final AnnotationData annotationValue() {
        if (this.type != AnnotationEncodeValueType.AnnotationValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
        return (AnnotationData) r02;
    L7:
        throw new IllegalStateException("type is not AnnotationValue".toString());
    }

    public final AnnotationEncodeArrayData arrayValue() {
        if (this.type != AnnotationEncodeValueType.ArrayValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
        return (AnnotationEncodeArrayData) r02;
    L7:
        throw new IllegalStateException("type is not ArrayValue".toString());
    }

    public final boolean boolValue() {
        if (this.type != AnnotationEncodeValueType.BoolValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) r02).booleanValue();
    L7:
        throw new IllegalStateException("type is not BoolValue".toString());
    }

    public final byte byteValue() {
        if (this.type != AnnotationEncodeValueType.ByteValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) r02).byteValue();
    L7:
        throw new IllegalStateException("type is not ByteValue".toString());
    }

    public final char charValue() {
        if (this.type != AnnotationEncodeValueType.CharValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) r02).charValue();
    L7:
        throw new IllegalStateException("type is not CharValue".toString());
    }

    public final double doubleValue() {
        if (this.type != AnnotationEncodeValueType.DoubleValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) r02).doubleValue();
    L7:
        throw new IllegalStateException("type is not DoubleValue".toString());
    }

    public final FieldData enumValue() {
        if (this.type != AnnotationEncodeValueType.EnumValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
        return (FieldData) r02;
    L7:
        throw new IllegalStateException("type is not EnumValue".toString());
    }

    public final float floatValue() {
        if (this.type != AnnotationEncodeValueType.FloatValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) r02).floatValue();
    L7:
        throw new IllegalStateException("type is not FloatValue".toString());
    }

    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public final int intValue() {
        if (this.type != AnnotationEncodeValueType.IntValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) r02).intValue();
    L7:
        throw new IllegalStateException("type is not IntValue".toString());
    }

    public final boolean isNullValue() {
        if (this.type != AnnotationEncodeValueType.NullValue) goto L5;
        return true;
    L5:
        return false;
    }

    public final long longValue() {
        if (this.type != AnnotationEncodeValueType.LongValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) r02).longValue();
    L7:
        throw new IllegalStateException("type is not LongValue".toString());
    }

    public final MethodData methodValue() {
        if (this.type != AnnotationEncodeValueType.MethodValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
        return (MethodData) r02;
    L7:
        throw new IllegalStateException("type is not MethodValue".toString());
    }

    public final Number numberValue() {
        AnnotationEncodeValueType r02 = this.type;
        switch(WhenMappings.$EnumSwitchMapping$0[r02.ordinal()]) {
            case 1: goto L12;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L14;
            case 6: goto L13;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException("type is not number".toString());
    L13:
        return Double.valueOf(doubleValue());
    L14:
        return Float.valueOf(floatValue());
    L15:
        return Long.valueOf(longValue());
    L16:
        return Integer.valueOf(intValue());
    L17:
        return Short.valueOf(shortValue());
    L12:
        return Byte.valueOf(byteValue());
    }

    public final short shortValue() {
        if (this.type != AnnotationEncodeValueType.ShortValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) r02).shortValue();
    L7:
        throw new IllegalStateException("type is not ShortValue".toString());
    }

    public final String stringValue() {
        if (this.type != AnnotationEncodeValueType.StringValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type kotlin.String");
        return (String) r02;
    L7:
        throw new IllegalStateException("type is not StringValue".toString());
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        AnnotationEncodeValueType r1 = this.type;
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 7: goto L11;
            case 8: goto L10;
            case 9: goto L9;
            case 10: goto L8;
            case 11: goto L7;
            case 12: goto L6;
            case 13: goto L5;
            default: goto L4;
        };
    L4:
        r02.append(this.value);
    L12:
        String r03 = r02.toString();
        AbstractC0307g.m702d(r03, "StringBuilder().apply(builderAction).toString()");
        return r03;
    L5:
        r02.append("null");
        goto L12
    L6:
        r02.append("\"");
        r02.append(this.value);
        r02.append("\"");
        goto L12
    L7:
        Object r12 = this.value;
        AbstractC0307g.m701c(r12, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
        r02.append(((AnnotationData) r12).toString());
        goto L12
    L8:
        r02.append("{");
        Object r13 = this.value;
        AbstractC0307g.m701c(r13, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
        r02.append(AbstractC0181l.m546r0(((AnnotationEncodeArrayData) r13).getValues(), ", ", null, null, null, 62));
        r02.append("}");
        goto L12
    L9:
        Object r14 = this.value;
        AbstractC0307g.m701c(r14, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
        FieldData r15 = (FieldData) r14;
        r02.append(r15.getTypeName());
        r02.append(".");
        r02.append(r15.getFieldName());
        goto L12
    L10:
        Object r16 = this.value;
        AbstractC0307g.m701c(r16, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
        MethodData r17 = (MethodData) r16;
        r02.append(r17.getReturnTypeName());
        r02.append(" ");
        r02.append(r17.getClassName());
        r02.append(".");
        r02.append(r17.getMethodName());
        r02.append("(");
        r02.append(AbstractC0181l.m546r0(r17.getParamTypeNames(), ", ", null, null, null, 62));
        r02.append(")");
        goto L12
    L11:
        Object r18 = this.value;
        AbstractC0307g.m701c(r18, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
        r02.append(((ClassData) r18).getName());
        goto L12
    }

    public final ClassData typeValue() {
        if (this.type != AnnotationEncodeValueType.TypeValue) goto L7;
        Object r02 = this.value;
        AbstractC0307g.m701c(r02, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
        return (ClassData) r02;
    L7:
        throw new IllegalStateException("type is not TypeValue".toString());
    }

    private AnnotationEncodeValue(Object r1, AnnotationEncodeValueType r2) {
        this.value = r1;
        this.type = r2;
    }
}
