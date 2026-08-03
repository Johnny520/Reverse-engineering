package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nAnnotationEncodeArrayMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,462:1\n1#2:463\n1547#3:464\n1618#3,3:465\n1547#3:468\n1618#3,3:469\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher\n*L\n452#1:464\n452#1:465,3\n454#1:468\n454#1:469,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0014\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0001gB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0014J!\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u000fJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\r¢\u0006\u0004\b(\u0010\u000fJ\u0015\u0010*\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u0010\"\u001a\u000202¢\u0006\u0004\b3\u00104J+\u00103\u001a\u00020\u00002\u0006\u0010\"\u001a\u0002052\b\b\u0002\u0010\u000b\u001a\u0002062\b\b\u0002\u00108\u001a\u000207H\u0007¢\u0006\u0004\b3\u00109J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020:¢\u0006\u0004\b;\u0010<J+\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u0002052\b\b\u0002\u0010\u000b\u001a\u0002062\b\b\u0002\u00108\u001a\u000207H\u0007¢\u0006\u0004\b;\u00109J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020>¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\u00002\u0006\u0010\"\u001a\u000207¢\u0006\u0004\bI\u0010JJ&\u0010\u001b\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\b\u001b\u0010OJ&\u0010;\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\b;\u0010OJ&\u0010?\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\b?\u0010OJ&\u0010B\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\bB\u0010OJ&\u0010E\u001a\u00020\u00002\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020L0K¢\u0006\u0002\bM¢\u0006\u0004\bE\u0010OJ\u0017\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020PH\u0014¢\u0006\u0004\bR\u0010SR4\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010T2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010T8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR*\u0010\u000b\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010_\u001a\u0004\u0018\u00010\u00102\b\u0010U\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006h"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "<init>", "()V", "", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "elements", "values", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "countMin", "countMax", "element", "add", "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "number", "addNumber", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "value", "addByte", "(B)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "addShort", "(S)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "addInt", "", "addLong", "(J)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "addFloat", "(F)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "addDouble", "(D)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "addString", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "addClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "className", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "addMethod", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "addEnum", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "addNull", "()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "addBool", "(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "encodeValuesMatcher", "Ljava/util/List;", "getEncodeValuesMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationEncodeArrayMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> encodeValuesMatcher;

    @Yue.InterfaceC4418
    private org.luckypray.dexkit.query.enums.MatchType matchType;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.create()
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher add(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher add(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r0 = r1.encodeValuesMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.encodeValuesMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addAnnotation(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.annotationValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addBool(boolean r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.boolValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addByte(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.byteValue(r2)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addClass(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r8 = addClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r8 = addClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$addClass$2$1$1 r1 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$addClass$2$1$1
            r1.<init>(r3, r4, r5)
            r0.classValue(r1)
            r2.add(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.classValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addDouble(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.doubleValue(r2)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addEnum(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addEnum(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addEnum(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.enumValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addFloat(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.floatValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addInt(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.intValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addLong(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.longValue(r2)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addMethod(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addMethod(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.methodValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addNull() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.nullValue()
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addNumber(@Yue.InterfaceC4418 java.lang.Number r4) {
            r3 = this;
            java.lang.String r0 = "number"
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
            r3.add(r0)
            return r3
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addShort(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.shortValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r8 = addString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r8 = addString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2, r3)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            r1.rangeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher countMax(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 0
            r0.<init>(r1, r3)
            r2.rangeMatcher = r0
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher countMin(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r1)
            r2.rangeMatcher = r0
            return r2
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> getEncodeValuesMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r0 = r1.encodeValuesMatcher
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r1.matchType
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r1.rangeMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r8) {
            r7 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r1 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r0 = r7.encodeValuesMatcher
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L45
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = Yue.C1210.m6231(r0, r2)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r0.next()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r5 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r5
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r5 = r5.getType()
            Yue.C3329.m13903(r5)
            byte r5 = r5.m30789getValuew2LRezQ()
            Yue.ۥۢۢۥۥ r5 = Yue.C6517.m24793(r5)
            r4.add(r5)
            goto L1b
        L3a:
            byte[] r0 = Yue.C6524.m24881(r4)
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r4 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            int r0 = r4.m30802createValuesTypeVectorVUfvBY(r8, r0)
            goto L46
        L45:
            r0 = r3
        L46:
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r4 = r7.encodeValuesMatcher
            if (r4 == 0) goto L88
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = Yue.C1210.m6231(r4, r2)
            r5.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L57:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r2.next()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r4 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r4 = r4.getValue()
            java.lang.String r6 = "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseMatcher"
            Yue.C3329.m13904(r4, r6)
            org.luckypray.dexkit.query.base.BaseMatcher r4 = (org.luckypray.dexkit.query.base.BaseMatcher) r4
            int r4 = r4.build$dexkit_android_release(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.add(r4)
            goto L57
        L7a:
            int[] r2 = Yue.C1219.m6536(r5)
            if (r2 == 0) goto L88
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r4 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            int r2 = r4.createValuesVector(r8, r2)
            r4 = r2
            goto L89
        L88:
            r4 = r3
        L89:
            org.luckypray.dexkit.query.enums.MatchType r2 = r7.matchType
            byte r5 = r2.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = r7.rangeMatcher
            if (r2 == 0) goto L99
            int r2 = r2.build$dexkit_android_release(r8)
            r6 = r2
            goto L9a
        L99:
            r6 = r3
        L9a:
            r2 = r8
            r3 = r0
            int r0 = r1.createAnnotationEncodeArrayMatcher(r2, r3, r4, r5, r6)
            r8.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher matchType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return r1
    }

    public final /* synthetic */ void setCount(int r1) {
            r0 = this;
            r0.count(r1)
            return
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher values(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C1219.m6540(r2)
            r1.encodeValuesMatcher = r2
            return r1
    }
}
