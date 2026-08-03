package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nAnnotationElementMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationElementMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationElementMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020$¢\u0006\u0004\b%\u0010&J+\u0010%\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010\nJ\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020'¢\u0006\u0004\b(\u0010)J+\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010\nJ\u0015\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u0010\r\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00002\u0006\u0010\r\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0000¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b9\u0010:J&\u0010\r\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b\r\u0010?J&\u0010(\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b(\u0010?J&\u0010,\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b,\u0010?J&\u0010/\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b/\u0010?J&\u00102\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b2\u0010?J&\u00105\u001a\u00020\u00002\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020<0;¢\u0006\u0002\b=¢\u0006\u0004\b5\u0010?J\u0017\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@H\u0014¢\u0006\u0004\bB\u0010CR(\u0010E\u001a\u0004\u0018\u00010$2\b\u0010D\u001a\u0004\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR(\u0010I\u001a\u0004\u0018\u00010\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\r\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "<init>", "()V", "", "name", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "matcher", "value", "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "numberValue", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "byteValue", "(B)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "shortValue", "(S)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "intValue", "(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "longValue", "(J)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "floatValue", "(F)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "", "doubleValue", "(D)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "stringValue", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "classValue", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "className", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodValue", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "enumValue", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "arrayValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotationValue", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "nullValue", "()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "boolValue", "(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "nameMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "valueMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "getValueMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getValue", "setValue", "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationElementMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher valueMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion = r0
            return
    }

    public AnnotationElementMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue$default(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.classValue(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name$default(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue$default(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.stringValue(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher annotationValue(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher annotationValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.annotationValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher arrayValue(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher arrayValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.arrayValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher boolValue(boolean r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.boolValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher byteValue(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.byteValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(Yue.InterfaceC2825 r2) {
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
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r8 = classValue$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r8 = classValue$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$classValue$2$1$1 r1 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$classValue$2$1$1
            r1.<init>(r3, r4, r5)
            r0.classValue(r1)
            r2.value(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.classValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher doubleValue(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.doubleValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher enumValue(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher enumValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.enumValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher floatValue(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.floatValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getName() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getNameMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.nameMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher getValue() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher getValueMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r1.valueMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r6) {
            r5 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r6, r0)
            org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion r0 = org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = r5.nameMatcher
            r2 = 0
            if (r1 == 0) goto L11
            int r1 = r1.build$dexkit_android_release(r6)
            goto L12
        L11:
            r1 = r2
        L12:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r3 = r5.valueMatcher
            if (r3 == 0) goto L21
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r3 = r3.getType()
            if (r3 == 0) goto L21
            byte r3 = r3.m30789getValuew2LRezQ()
            goto L22
        L21:
            r3 = r2
        L22:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r4 = r5.valueMatcher
            if (r4 == 0) goto L2b
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r4 = r4.getValue()
            goto L2c
        L2b:
            r4 = 0
        L2c:
            org.luckypray.dexkit.query.base.BaseMatcher r4 = (org.luckypray.dexkit.query.base.BaseMatcher) r4
            if (r4 == 0) goto L34
            int r2 = r4.build$dexkit_android_release(r6)
        L34:
            int r0 = r0.m30799createAnnotationElementMatcherSpDDLgk(r6, r1, r3, r2)
            r6.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher intValue(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.intValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher longValue(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.longValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher methodValue(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher methodValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.methodValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.nameMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher nullValue() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.nullValue()
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher numberValue(@Yue.InterfaceC4418 java.lang.Number r4) {
            r3 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            boolean r1 = r4 instanceof java.lang.Byte
            if (r1 == 0) goto L16
            byte r4 = r4.byteValue()
            r0.byteValue(r4)
            goto L51
        L16:
            boolean r1 = r4 instanceof java.lang.Short
            if (r1 == 0) goto L22
            short r4 = r4.shortValue()
            r0.shortValue(r4)
            goto L51
        L22:
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L2e
            int r4 = r4.intValue()
            r0.intValue(r4)
            goto L51
        L2e:
            boolean r1 = r4 instanceof java.lang.Long
            if (r1 == 0) goto L3a
            long r1 = r4.longValue()
            r0.longValue(r1)
            goto L51
        L3a:
            boolean r1 = r4 instanceof java.lang.Float
            if (r1 == 0) goto L46
            float r4 = r4.floatValue()
            r0.floatValue(r4)
            goto L51
        L46:
            boolean r1 = r4 instanceof java.lang.Double
            if (r1 == 0) goto L51
            double r1 = r4.doubleValue()
            r0.doubleValue(r1)
        L51:
            r3.value(r0)
            return r3
    }

    public final /* synthetic */ void setName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            name$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setValue(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.value(r2)
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher shortValue(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.shortValue(r2)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r8 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r8 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2, r3, r4)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher value(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.value(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher value(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.valueMatcher = r2
            return r1
    }
}
