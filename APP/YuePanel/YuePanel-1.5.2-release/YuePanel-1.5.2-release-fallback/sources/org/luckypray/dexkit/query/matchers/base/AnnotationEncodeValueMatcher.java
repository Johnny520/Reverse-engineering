package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 J2\u00020\u0001:\u0001JB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\"¢\u0006\u0004\b#\u0010$J+\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b#\u0010*J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000204¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000207¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0000¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020(¢\u0006\u0004\b<\u0010=J&\u0010,\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b,\u0010BJ&\u0010/\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b/\u0010BJ&\u00102\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b2\u0010BJ&\u00105\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b5\u0010BJ&\u00108\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020?0>¢\u0006\u0002\b@¢\u0006\u0004\b8\u0010BR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010FR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010C\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "<init>", "()V", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "value", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "type", "(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V", "", "number", "numberValue", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "byteValue", "(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "shortValue", "(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "charValue", "(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "intValue", "(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "longValue", "(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "floatValue", "(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "doubleValue", "(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "stringValue", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "classValue", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodValue", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "enumValue", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "arrayValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotationValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "nullValue", "()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "boolValue", "(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "<set-?>", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "getValue", "()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "getType", "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationEncodeValueMatcher implements org.luckypray.dexkit.query.base.QueryComponent {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.enums.AnnotationEncodeValueType type;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.base.IAnnotationEncodeValue value;

    @Yue.InterfaceC4201(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\"H\u0007J$\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\rH\u0007J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020(H\u0007¨\u0006)"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "number", "", "createAnnotation", "value", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "createArray", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "createBoolean", "", "createByte", "", "createChar", "", "createClass", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "createDouble", "", "createEnum", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "createFloat", "", "createInt", "", "createLong", "", "createMethod", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "createNull", "createShort", "", "createString", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
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

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher create(@Yue.InterfaceC4418 java.lang.Number r2) {
                r1 = this;
                java.lang.String r0 = "number"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = r0.numberValue(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
                r3 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = 0
                r1.<init>(r4, r0, r2)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createArray(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r4) {
                r3 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = 0
                r1.<init>(r4, r0, r2)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createBoolean(boolean r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueBoolean r2 = new org.luckypray.dexkit.query.matchers.EncodeValueBoolean
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createByte(byte r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueByte r2 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createChar(char r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueChar r2 = new org.luckypray.dexkit.query.matchers.EncodeValueChar
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r4) {
                r3 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = 0
                r1.<init>(r4, r0, r2)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createDouble(double r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueDouble r2 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createEnum(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r4) {
                r3 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = 0
                r1.<init>(r4, r0, r2)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createFloat(float r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueFloat r2 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createInt(int r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueInt r2 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createLong(long r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueLong r2 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
                r3 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = 0
                r1.<init>(r4, r0, r2)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createNull() {
                r4 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueNull r2 = new org.luckypray.dexkit.query.matchers.EncodeValueNull
                r2.<init>()
                r3 = 0
                r1.<init>(r2, r0, r3)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createShort(short r4) {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueShort r2 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
                r2.<init>(r4)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3422
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r8, r0)
                r5 = 6
                r6 = 0
                r3 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r8 = createString$default(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3422
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
                r7 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r8, r0)
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r9, r0)
                r5 = 4
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r8 = createString$default(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3422
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
                r3 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
                r2.<init>(r4, r5, r6)
                r4 = 0
                r1.<init>(r2, r0, r4)
                return r1
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r4) {
                r3 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r2 = 0
                r1.<init>(r4, r0, r2)
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

    public /* synthetic */ AnnotationEncodeValueMatcher(org.luckypray.dexkit.query.base.IAnnotationEncodeValue r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2, Yue.C1769 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher create(@Yue.InterfaceC4418 java.lang.Number r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createAnnotation(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createArray(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createArray(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createBoolean(boolean r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createBoolean(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createByte(byte r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createByte(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createChar(char r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createChar(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createClass(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createDouble(double r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createDouble(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createEnum(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createEnum(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createFloat(float r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createFloat(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createInt(int r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createInt(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createLong(long r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createLong(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createMethod(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createNull() {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createNull()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createShort(short r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createShort(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3422
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3422
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r2) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3422
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1)
            return r1
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher annotationValue(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotationValue(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher annotationValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
            r1.type = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher arrayValue(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.arrayValue(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher arrayValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher boolValue(boolean r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueBoolean r0 = new org.luckypray.dexkit.query.matchers.EncodeValueBoolean
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher byteValue(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueByte r0 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher charValue(char r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueChar r0 = new org.luckypray.dexkit.query.matchers.EncodeValueChar
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
            r1.type = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher classValue(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.classValue(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher classValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher doubleValue(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueDouble r0 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
            r1.type = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher enumValue(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.enumValue(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher enumValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher floatValue(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueFloat r0 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType getType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r1.type
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.base.IAnnotationEncodeValue getValue() {
            r1 = this;
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r0 = r1.value
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher intValue(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueInt r0 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher longValue(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueLong r0 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
            r1.type = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher methodValue(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.methodValue(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher methodValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher nullValue() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueNull r0 = new org.luckypray.dexkit.query.matchers.EncodeValueNull
            r0.<init>()
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
            r1.type = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher numberValue(@Yue.InterfaceC4418 java.lang.Number r3) {
            r2 = this;
            java.lang.String r0 = "number"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto L11
            byte r3 = r3.byteValue()
            r2.byteValue(r3)
            goto L4c
        L11:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L1d
            short r3 = r3.shortValue()
            r2.shortValue(r3)
            goto L4c
        L1d:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L29
            int r3 = r3.intValue()
            r2.intValue(r3)
            goto L4c
        L29:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L35
            long r0 = r3.longValue()
            r2.longValue(r0)
            goto L4c
        L35:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L41
            float r3 = r3.floatValue()
            r2.floatValue(r3)
            goto L4c
        L41:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L4c
            double r0 = r3.doubleValue()
            r2.doubleValue(r0)
        L4c:
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher shortValue(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueShort r0 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r8 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r8 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.value = r2
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            r1.type = r2
            return r1
    }
}
