package org.luckypray.dexkit.result;

import com.google.flatbuffers.AbstractC0735d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.result.AnnotationData;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.result.base.BaseData;
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
import org.luckypray.dexkit.util.MUtf8Util;
import org.luckypray.dexkit.util.StringUnicodeEncoderDecoder;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayData extends BaseData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4417Companion = null;
    private final List<AnnotationEncodeValue> values;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
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

        public final AnnotationEncodeArrayData from(DexKitBridge r8, AnnotationEncodeArray r9) {
            AbstractC0307g.m703e(r8, "bridge");
            AbstractC0307g.m703e(r9, "annotationEncodeArray");
            ArrayList r02 = new ArrayList();
            int r1 = r9.getValuesLength();
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L36;
            AnnotationEncodeValueMeta r3 = r9.values(r2);
            AbstractC0307g.m700b(r3);
            AnnotationEncodeValueType r4 = AnnotationEncodeValueType.Companion.m2671from7apg3OU(r3.m2684getValueTypew2LRezQ());
            switch(WhenMappings.$EnumSwitchMapping$0[r4.ordinal()]) {
                case 1: goto L33;
                case 2: goto L32;
                case 3: goto L31;
                case 4: goto L30;
                case 5: goto L29;
                case 6: goto L28;
                case 7: goto L27;
                case 8: goto L15;
                case 9: goto L14;
                case 10: goto L13;
                case 11: goto L12;
                case 12: goto L11;
                case 13: goto L10;
                case 14: goto L9;
                case 15: goto L8;
                default: goto L7;
            };
        L8:
            AbstractC0735d r32 = r3.value(new EncodeValueBoolean());
            AbstractC0307g.m701c(r32, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
            Object r33 = Boolean.valueOf(((EncodeValueBoolean) r32).getValue());
        L34:
            AbstractC0307g.m702d(r33, "when (type) {\n          …lue\n                    }");
            r02.add(AnnotationEncodeValue.f4418Companion.from(r33, r4));
            r2 = r2 + 1;
            goto L3
        L9:
            AbstractC0735d r34 = r3.value(new EncodeValueNull());
            AbstractC0307g.m701c(r34, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
            r33 = (EncodeValueNull) r34;
            goto L34
        L10:
            AnnotationData.Companion r5 = AnnotationData.f4415Companion;
            AbstractC0735d r35 = r3.value(new AnnotationMeta());
            AbstractC0307g.m701c(r35, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
            r33 = r5.from(r8, (AnnotationMeta) r35);
            goto L34
        L11:
            Companion r52 = AnnotationEncodeArrayData.f4417Companion;
            AbstractC0735d r36 = r3.value(new AnnotationEncodeArray());
            AbstractC0307g.m701c(r36, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
            r33 = r52.from(r8, (AnnotationEncodeArray) r36);
            goto L34
        L12:
            FieldData.Companion r53 = FieldData.f4420Companion;
            AbstractC0735d r37 = r3.value(new FieldMeta());
            AbstractC0307g.m701c(r37, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
            r33 = r53.from(r8, (FieldMeta) r37);
            goto L34
        L13:
            MethodData.Companion r54 = MethodData.f4421Companion;
            AbstractC0735d r38 = r3.value(new MethodMeta());
            AbstractC0307g.m701c(r38, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
            r33 = r54.from(r8, (MethodMeta) r38);
            goto L34
        L14:
            ClassData.Companion r55 = ClassData.f4419Companion;
            AbstractC0735d r39 = r3.value(new ClassMeta());
            AbstractC0307g.m701c(r39, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
            r33 = r55.from(r8, (ClassMeta) r39);
            goto L34
        L15:
            AbstractC0735d r310 = r3.value(new EncodeValueString());
            AbstractC0307g.m701c(r310, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
            EncodeValueString r311 = (EncodeValueString) r310;
            String r56 = r311.getValue();     // Catch: IllegalArgumentException -> L18
            AbstractC0307g.m700b(r56);     // Catch: IllegalArgumentException -> L18
            r33 = r56;
        L18:
            Object r312 = StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(MUtf8Util.decode(r311.getValueAsByteBuffer()));     // Catch: Throwable -> L20
        L23:
            if (AbstractC0141g.m465a(r312) == null) goto L26;
            r312 = "";
        L26:
            r33 = (String) r312;
        L20:
            th = move-exception;
            r312 = AbstractC0040p.m116u(th);
            goto L23
        L27:
            AbstractC0735d r313 = r3.value(new EncodeValueDouble());
            AbstractC0307g.m701c(r313, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
            r33 = Double.valueOf(((EncodeValueDouble) r313).getValue());
            goto L34
        L28:
            AbstractC0735d r314 = r3.value(new EncodeValueFloat());
            AbstractC0307g.m701c(r314, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
            r33 = Float.valueOf(((EncodeValueFloat) r314).getValue());
            goto L34
        L29:
            AbstractC0735d r315 = r3.value(new EncodeValueLong());
            AbstractC0307g.m701c(r315, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
            r33 = Long.valueOf(((EncodeValueLong) r315).getValue());
            goto L34
        L30:
            AbstractC0735d r316 = r3.value(new EncodeValueInt());
            AbstractC0307g.m701c(r316, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
            r33 = Integer.valueOf(((EncodeValueInt) r316).getValue());
            goto L34
        L31:
            AbstractC0735d r317 = r3.value(new EncodeValueChar());
            AbstractC0307g.m701c(r317, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
            r33 = Short.valueOf(((EncodeValueChar) r317).getValue());
            goto L34
        L32:
            AbstractC0735d r318 = r3.value(new EncodeValueShort());
            AbstractC0307g.m701c(r318, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
            r33 = Short.valueOf(((EncodeValueShort) r318).getValue());
            goto L34
        L33:
            AbstractC0735d r319 = r3.value(new EncodeValueByte());
            AbstractC0307g.m701c(r319, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
            r33 = Byte.valueOf(((EncodeValueByte) r319).getValue());
            goto L34
        L7:
            throw new C0137c();
        L36:
            return new AnnotationEncodeArrayData(r8, r02, null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        f4417Companion = new Companion(null);
    }

    public /* synthetic */ AnnotationEncodeArrayData(DexKitBridge r1, List r2, AbstractC0304d r3) {
        this(r1, r2);
    }

    public final List<AnnotationEncodeValue> getValues() {
        return this.values;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("{");
        Iterator<T> r1 = this.values.iterator();
        int r2 = 0;
    L4:
        if (r1.hasNext() == false) goto L13;
        Object r3 = r1.next();
        int r4 = r2 + 1;
        if (r2 < 0) goto L11;
        AnnotationEncodeValue r32 = (AnnotationEncodeValue) r3;
        if (r2 == 0) goto L10;
        r02.append(", ");
    L10:
        r02.append(r32);
        r2 = r4;
        goto L4
    L11:
        AbstractC0182m.m558j0();
        throw null;
    L13:
        r02.append("}");
        String r03 = r02.toString();
        AbstractC0307g.m702d(r03, "StringBuilder().apply(builderAction).toString()");
        return r03;
    }

    private AnnotationEncodeArrayData(DexKitBridge r7, List<AnnotationEncodeValue> r8) {
        super(r7, 0, 0, 6, null);
        this.values = r8;
    }
}
