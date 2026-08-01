package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: AnnotationEncodeValueMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eJ%\u0010\r\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014J%\u0010\u0013\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cJ%\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020 J%\u0010\u001f\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020(J%\u0010'\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000J\u0006\u0010)\u001a\u00020\u0000J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020.J$\u0010/\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u00020\u0016H\u0007J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000204R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/base/IQuery;", "()V", "value", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "type", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V", "<set-?>", "getType", "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "getValue", "()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "annotationValue", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "arrayValue", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "boolValue", "", "byteValue", "", "charValue", "", "classValue", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "doubleValue", "", "enumValue", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "floatValue", "", "intValue", "", "longValue", "", "methodValue", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "nullValue", "numberValue", "number", "", "shortValue", "", "stringValue", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationEncodeValueMatcher implements org.luckypray.dexkit.query.base.IQuery {
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.enums.AnnotationEncodeValueType type;
    private org.luckypray.dexkit.query.base.IAnnotationEncodeValue value;

    /* JADX INFO: compiled from: AnnotationEncodeValueMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\"H\u0007J$\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\rH\u0007J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020(H\u0007¨\u0006)"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "number", "", "createAnnotation", "value", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "createArray", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "createBoolean", "", "createByte", "", "createChar", "", "createClass", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "createDouble", "", "createEnum", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "createFloat", "", "createInt", "", "createLong", "", "createMethod", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "createNull", "createShort", "", "createString", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString$default(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createString(r1, r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher create(java.lang.Number r2) {
                r1 = this;
                java.lang.String r0 = "number"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.numberValue(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = r5
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createArray(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = r5
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createBoolean(boolean r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueBoolean r2 = new org.luckypray.dexkit.query.matchers.EncodeValueBoolean
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createByte(byte r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueByte r2 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createChar(char r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueChar r2 = new org.luckypray.dexkit.query.matchers.EncodeValueChar
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createClass(org.luckypray.dexkit.query.matchers.ClassMatcher r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = r5
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createDouble(double r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueDouble r2 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createEnum(org.luckypray.dexkit.query.matchers.FieldMatcher r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = r5
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createFloat(float r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueFloat r2 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createInt(int r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueInt r2 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createLong(long r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueLong r2 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = r5
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createNull() {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueNull r2 = new org.luckypray.dexkit.query.matchers.EncodeValueNull
                r2.<init>()
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createShort(short r5) {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueShort r2 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
                r2.<init>(r5)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r5 = 6
                r6 = 0
                r3 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = createString$default(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
                r7 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r5 = 4
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = createString$default(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
                r2.<init>(r5, r6, r7)
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(org.luckypray.dexkit.query.matchers.base.StringMatcher r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = r5
                org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion = r0
            return
    }

    public AnnotationEncodeValueMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private AnnotationEncodeValueMatcher(org.luckypray.dexkit.query.base.IAnnotationEncodeValue r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    public /* synthetic */ AnnotationEncodeValueMatcher(org.luckypray.dexkit.query.base.IAnnotationEncodeValue r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher annotationValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.annotationValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher arrayValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.arrayValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher classValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.classValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher create(java.lang.Number r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createAnnotation(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createArray(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createArray(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createBoolean(boolean r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createBoolean(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createByte(byte r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createByte(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createChar(char r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createChar(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createClass(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createClass(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createDouble(double r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createDouble(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createEnum(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createEnum(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createFloat(float r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createFloat(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createInt(int r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createInt(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createLong(long r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createLong(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createMethod(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createNull() {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createNull()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createShort(short r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createShort(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createString(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createString(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createString(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createString(r1)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher enumValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.FieldMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.enumValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher methodValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.methodValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue$default(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.stringValue(r1, r2, r3)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher annotationValue(org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            r2 = r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher arrayValue(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r4) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            r2 = r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher boolValue(boolean r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueBoolean r2 = new org.luckypray.dexkit.query.matchers.EncodeValueBoolean
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher byteValue(byte r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueByte r2 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher charValue(char r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueChar r2 = new org.luckypray.dexkit.query.matchers.EncodeValueChar
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher classValue(org.luckypray.dexkit.query.matchers.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            r2 = r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher doubleValue(double r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueDouble r2 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher enumValue(org.luckypray.dexkit.query.matchers.FieldMatcher r4) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            r2 = r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher floatValue(float r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueFloat r2 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType getType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r1.type
            return r0
    }

    public final org.luckypray.dexkit.query.base.IAnnotationEncodeValue getValue() {
            r1 = this;
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r0 = r1.value
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher intValue(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueInt r2 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher longValue(long r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueLong r2 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher methodValue(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            r2 = r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher nullValue() {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueNull r2 = new org.luckypray.dexkit.query.matchers.EncodeValueNull
            r2.<init>()
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher numberValue(java.lang.Number r5) {
            r4 = this;
            java.lang.String r0 = "number"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            boolean r2 = r5 instanceof java.lang.Byte
            if (r2 == 0) goto L16
            byte r2 = r5.byteValue()
            r4.byteValue(r2)
            goto L51
        L16:
            boolean r2 = r5 instanceof java.lang.Short
            if (r2 == 0) goto L22
            short r2 = r5.shortValue()
            r4.shortValue(r2)
            goto L51
        L22:
            boolean r2 = r5 instanceof java.lang.Integer
            if (r2 == 0) goto L2e
            int r2 = r5.intValue()
            r4.intValue(r2)
            goto L51
        L2e:
            boolean r2 = r5 instanceof java.lang.Long
            if (r2 == 0) goto L3a
            long r2 = r5.longValue()
            r4.longValue(r2)
            goto L51
        L3a:
            boolean r2 = r5 instanceof java.lang.Float
            if (r2 == 0) goto L46
            float r2 = r5.floatValue()
            r4.floatValue(r2)
            goto L51
        L46:
            boolean r2 = r5 instanceof java.lang.Double
            if (r2 == 0) goto L51
            double r2 = r5.doubleValue()
            r4.doubleValue(r2)
        L51:
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher shortValue(short r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueShort r2 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(org.luckypray.dexkit.query.matchers.base.StringMatcher r4) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            r1 = 0
            r2 = r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r2 = (org.luckypray.dexkit.query.base.IAnnotationEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r0
            return r0
    }
}
