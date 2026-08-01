package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: AnnotationEncodeArrayMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\rJ%\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\"J%\u0010!\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020&J$\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010\u0012\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020$H\u0007J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020,J%\u0010'\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020.J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000200J%\u0010/\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000202J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000205J\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000207J%\u00106\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u0006\u00108\u001a\u00020\u0000J\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020=J$\u0010>\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020)2\b\b\u0002\u0010\u0012\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020$H\u0007J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020?J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010@\u001a\u00020\u00052\b\b\u0002\u0010A\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010B\u001a\u00020CJ\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0017J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0005J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0005J\u0010\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020HH\u0014J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010I\u001a\u00020\u00002\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\r0KR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "value", "", "count", "getCount", "()I", "setCount", "(I)V", "<set-?>", "", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "encodeValuesMatcher", "getEncodeValuesMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "rangeMatcher", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "add", "element", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addAnnotation", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "addBool", "", "addByte", "", "addClass", "className", "", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "addDouble", "", "addEnum", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "addFloat", "", "addInt", "addLong", "", "addMethod", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "addNull", "addNumber", "number", "", "addShort", "", "addString", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "min", "max", "range", "Lkotlin/ranges/IntRange;", "countMax", "countMin", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "values", "elements", "", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationEncodeArrayMatcher extends org.luckypray.dexkit.query.base.BaseQuery implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> encodeValuesMatcher;
    private org.luckypray.dexkit.query.enums.MatchType matchType;
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    /* JADX INFO: compiled from: AnnotationEncodeArrayMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion = r0
            return
    }

    public AnnotationEncodeArrayMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.matchType = r0
            return
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher add(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addAnnotation(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addAnnotation(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addClass(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass$default(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.addClass(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addEnum(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.FieldMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addEnum(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addMethod(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addMethod(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString$default(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.addString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count$default(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.count(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.create()
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher add(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r4) {
            r3 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r2 = r3.encodeValuesMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r3.encodeValuesMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r2 = r3.encodeValuesMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.annotationValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addBool(boolean r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.boolValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addByte(byte r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.byteValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = addClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = addClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(java.lang.String r9, org.luckypray.dexkit.query.enums.StringMatchType r10, boolean r11) {
            r8 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r5 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r5.<init>()
            r6 = r5
            r7 = 0
            r6.className(r9, r10, r11)
            r3.classValue(r5)
            r8.add(r2)
            r0 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(org.luckypray.dexkit.query.matchers.ClassMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.classValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addDouble(double r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.doubleValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addEnum(org.luckypray.dexkit.query.matchers.FieldMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.enumValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addFloat(float r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.floatValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addInt(int r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.intValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addLong(long r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.longValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.methodValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addNull() {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.nullValue()
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addNumber(java.lang.Number r8) {
            r7 = this;
            java.lang.String r0 = "number"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r7
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            boolean r5 = r8 instanceof java.lang.Byte
            if (r5 == 0) goto L1d
            byte r5 = r8.byteValue()
            r3.byteValue(r5)
            goto L58
        L1d:
            boolean r5 = r8 instanceof java.lang.Short
            if (r5 == 0) goto L29
            short r5 = r8.shortValue()
            r3.shortValue(r5)
            goto L58
        L29:
            boolean r5 = r8 instanceof java.lang.Integer
            if (r5 == 0) goto L35
            int r5 = r8.intValue()
            r3.intValue(r5)
            goto L58
        L35:
            boolean r5 = r8 instanceof java.lang.Long
            if (r5 == 0) goto L41
            long r5 = r8.longValue()
            r3.longValue(r5)
            goto L58
        L41:
            boolean r5 = r8 instanceof java.lang.Float
            if (r5 == 0) goto L4d
            float r5 = r8.floatValue()
            r3.floatValue(r5)
            goto L58
        L4d:
            boolean r5 = r8 instanceof java.lang.Double
            if (r5 == 0) goto L58
            double r5 = r8.doubleValue()
            r3.doubleValue(r5)
        L58:
            r7.add(r2)
            r0 = r7
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addShort(short r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.shortValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = addString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = addString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(java.lang.String r6, org.luckypray.dexkit.query.enums.StringMatchType r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.stringValue(r6, r7, r8)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(org.luckypray.dexkit.query.matchers.base.StringMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.stringValue(r6)
            r5.add(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4, r5)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            r2 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            r2.rangeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher countMax(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 0
            r2.<init>(r3, r5)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher countMin(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r5, r3)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> getEncodeValuesMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r0 = r1.encodeValuesMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r1.matchType
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r1.rangeMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r15) {
            r14 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r1 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r0 = r14.encodeValuesMatcher
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L5a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r0
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L23:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L44
            java.lang.Object r9 = r8.next()
            r10 = r9
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r10 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r10
            r11 = 0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r12 = r10.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            byte r10 = r12.m10390getValuew2LRezQ()
            kotlin.UByte r10 = kotlin.UByte.m8681boximpl(r10)
            r5.add(r10)
            goto L23
        L44:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            byte[] r0 = kotlin.collections.UCollectionsKt.toUByteArray(r5)
            r4 = 0
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r5 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            int r0 = r5.m10403createValuesTypeVectorVUfvBY(r15, r0)
            goto L5b
        L5a:
            r0 = r3
        L5b:
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r4 = r14.encodeValuesMatcher
            if (r4 == 0) goto Lb1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r2)
            r6.<init>(r2)
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            r6 = r4
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L74:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.next()
            r10 = r9
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r10 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r10
            r11 = 0
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r12 = r10.getValue()
            java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r13)
            org.luckypray.dexkit.query.base.BaseQuery r12 = (org.luckypray.dexkit.query.base.BaseQuery) r12
            int r12 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r12, r15)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r2.add(r10)
            goto L74
        L99:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r2)
            if (r2 == 0) goto Lb1
        La8:
            r4 = 0
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r5 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            int r2 = r5.createValuesVector(r15, r2)
            r4 = r2
            goto Lb2
        Lb1:
            r4 = r3
        Lb2:
            org.luckypray.dexkit.query.enums.MatchType r2 = r14.matchType
            byte r5 = r2.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = r14.rangeMatcher
            if (r2 == 0) goto Lc4
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r6 = r2
            goto Lc5
        Lc4:
            r6 = r3
        Lc5:
            r2 = r15
            r3 = r0
            int r0 = r1.createAnnotationEncodeArrayMatcher(r2, r3, r4, r5, r6)
            r15.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher matchType(org.luckypray.dexkit.query.enums.MatchType r3) {
            r2 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            r2.matchType = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }

    public final /* synthetic */ void setCount(int r1) {
            r0 = this;
            r0.count(r1)
            return
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.matchType = r2
            return
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher values(java.util.Collection<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r3.encodeValuesMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher) r0
            return r0
    }
}
