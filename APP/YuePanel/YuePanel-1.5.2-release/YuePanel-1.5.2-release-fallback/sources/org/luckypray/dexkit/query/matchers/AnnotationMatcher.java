package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nAnnotationMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n1547#2:489\n1618#2,3:490\n1547#2:497\n1618#2,3:498\n1547#2:505\n1618#2,3:506\n11328#3:493\n11663#3,3:494\n11328#3:501\n11663#3,3:502\n1#4:509\n*S KotlinDebug\n*F\n+ 1 AnnotationMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationMatcher\n*L\n341#1:489\n341#1:490,3\n369#1:497\n369#1:498,3\n482#1:505\n482#1:506,3\n357#1:493\n357#1:494,3\n381#1:501\n381#1:502,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0018\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001hB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0006\u001a\u00020\u00002\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0006\u0010\nJ+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0006\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b'\u0010+J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010*\u001a\u00020,¢\u0006\u0004\b'\u0010-J!\u0010'\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020%2\b\b\u0002\u0010/\u001a\u00020%¢\u0006\u0004\b'\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J1\u00102\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b2\u00104J!\u00102\u001a\u00020\u00002\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b05\"\u00020\u000b¢\u0006\u0004\b2\u00106J\u001b\u00107\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b7\u00108J!\u00107\u001a\u00020\u00002\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b05\"\u00020\u000b¢\u0006\u0004\b7\u00106J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J+\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b;\u0010\u0011J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000b¢\u0006\u0004\b=\u0010>J&\u0010\u0006\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b\u0006\u0010CJ&\u0010\u0013\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b\u0013\u0010CJ&\u0010\u001d\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b\u001d\u0010CJ&\u0010!\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020@0?¢\u0006\u0002\bA¢\u0006\u0004\b!\u0010CJ\u0017\u0010F\u001a\u00020%2\u0006\u0010E\u001a\u00020DH\u0014¢\u0006\u0004\bF\u0010GR(\u0010I\u001a\u0004\u0018\u00010\u00052\b\u0010H\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR(\u0010M\u001a\u0004\u0018\u00010\u00122\b\u0010H\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR4\u0010R\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010Q2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010Q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR.\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010H\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010[\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R$\u0010\u0006\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR0\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "<init>", "()V", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "type", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "targetElementTypes", "(Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "Lorg/luckypray/dexkit/query/enums/TargetElementType;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "policy", "(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "elements", "(Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "element", "addElement", "(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "elementMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "count", "elementCount", "(I)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "usingEqStrings", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "usingString", "addUsingString", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "addEqString", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "typeMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getTypeMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "targetElementTypesMatcher", "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "getTargetElementTypesMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "", "usingStringsMatcher", "Ljava/util/List;", "getUsingStringsMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "getPolicy", "()Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "setPolicy", "(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)V", "elementsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "getElementsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "value", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher elementsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.enums.RetentionPolicyType policy;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher targetElementTypesMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> usingStringsMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.AnnotationMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.AnnotationMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion = r0
            return
    }

    public AnnotationMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.AnnotationMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.elementCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.targetElementTypes(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher type$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher addElement(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addElement(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addElement(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r3) {
            r2 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r2.elementsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Le:
            r2.elementsMatcher = r0
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            Yue.C3329.m13904(r0, r1)
            r0.add(r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addEqString(@Yue.InterfaceC4418 java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r5, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r4.usingStringsMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r4.usingStringsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r3 = 0
            r1.<init>(r5, r2, r3)
            r0.add(r1)
            return r4
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r8 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r8 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r2.usingStringsMatcher
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L13:
            r2.usingStringsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r1.<init>(r3, r4, r5)
            r0.add(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.usingStringsMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.usingStringsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r2.elementsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        L9:
            r2.elementsMatcher = r0
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            Yue.C3329.m13904(r0, r1)
            r0.count(r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(int r3, int r4) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r2.elementsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        L9:
            r2.elementsMatcher = r0
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            Yue.C3329.m13904(r0, r1)
            r0.count(r3, r4)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(@Yue.InterfaceC4418 Yue.C3279 r3) {
            r2 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r2.elementsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Le:
            r2.elementsMatcher = r0
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            Yue.C3329.m13904(r0, r1)
            r0.count(r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            r2 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r2.elementsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Le:
            r2.elementsMatcher = r0
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            Yue.C3329.m13904(r0, r1)
            r0.count(r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementMatchType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r2 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r2.elementsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Le:
            r2.elementsMatcher = r0
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            Yue.C3329.m13904(r0, r1)
            r0.matchType(r3)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher elements(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.elements(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elements(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            r1.elementsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher getElementsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.enums.RetentionPolicyType getPolicy() {
            r1 = this;
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = r1.policy
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher getTargetElementTypesMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = r1.targetElementTypesMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getType() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.ClassMatcher getTypeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.typeMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingStrings() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getUsingStringsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.usingStringsMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r10) {
            r9 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r10, r0)
            org.luckypray.dexkit.schema.-AnnotationMatcher$Companion r1 = org.luckypray.dexkit.schema.AnnotationMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r9.typeMatcher
            r2 = 0
            if (r0 == 0) goto L12
            int r0 = r0.build$dexkit_android_release(r10)
            r3 = r0
            goto L13
        L12:
            r3 = r2
        L13:
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = r9.targetElementTypesMatcher
            if (r0 == 0) goto L1d
            int r0 = r0.build$dexkit_android_release(r10)
            r4 = r0
            goto L1e
        L1d:
            r4 = r2
        L1e:
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = r9.policy
            if (r0 == 0) goto L28
            byte r0 = r0.getValue()
            r5 = r0
            goto L29
        L28:
            r5 = r2
        L29:
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r9.elementsMatcher
            if (r0 == 0) goto L33
            int r0 = r0.build$dexkit_android_release(r10)
            r6 = r0
            goto L34
        L33:
            r6 = r2
        L34:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r9.usingStringsMatcher
            if (r0 == 0) goto L6b
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = Yue.C1210.m6231(r0, r8)
            r7.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r0.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r8 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r8
            int r8 = r8.build$dexkit_android_release(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.add(r8)
            goto L47
        L5f:
            int[] r0 = Yue.C1219.m6536(r7)
            if (r0 == 0) goto L6b
            int r0 = r10.createVectorOfTables(r0)
            r7 = r0
            goto L6c
        L6b:
            r7 = r2
        L6c:
            r2 = r10
            int r0 = r1.createAnnotationMatcher(r2, r3, r4, r5, r6, r7)
            r10.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher policy(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.RetentionPolicyType r2) {
            r1 = this;
            java.lang.String r0 = "policy"
            Yue.C3329.m13906(r2, r0)
            r1.policy = r2
            return r1
    }

    public final /* synthetic */ void setPolicy(org.luckypray.dexkit.query.enums.RetentionPolicyType r1) {
            r0 = this;
            r0.policy = r1
            return
    }

    public final /* synthetic */ void setType(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            type$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setUsingStrings(java.util.Collection r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            usingStrings$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.targetElementTypes(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(@Yue.InterfaceC4418 java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            java.lang.String r0 = "targetElementTypes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
            r0.<init>()
            r0.types(r2)
            r0.matchType(r3)
            r1.targetElementTypesMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r2) {
            r1 = this;
            java.lang.String r0 = "targetElementTypes"
            Yue.C3329.m13906(r2, r0)
            r1.targetElementTypesMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher type(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.type(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            java.lang.String r2 = r8.getName()
            java.lang.String r8 = "clazz.name"
            Yue.C3329.m13905(r2, r8)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r1, r2, r3, r4, r5, r6)
            r7.typeMatcher = r8
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.typeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "type"
            Yue.C3329.m13906(r2, r0)
            r1.typeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingEqStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r6) {
            r5 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r4 = 0
            r2.<init>(r1, r3, r4)
            r0.add(r2)
            goto L14
        L2c:
            java.util.List r6 = Yue.C1219.m6540(r0)
            r5.usingStringsMatcher = r6
            return r5
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingEqStrings(@Yue.InterfaceC4418 java.lang.String... r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L1f
            r4 = r8[r3]
            org.luckypray.dexkit.query.matchers.base.StringMatcher r5 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r6 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r5.<init>(r4, r6, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto Le
        L1f:
            java.util.List r8 = Yue.C1219.m6540(r0)
            r7.usingStringsMatcher = r8
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r4, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r5, r6)
            r0.add(r2)
            goto L19
        L2e:
            java.util.List r4 = Yue.C1219.m6540(r0)
            r3.usingStringsMatcher = r4
            return r3
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(@Yue.InterfaceC4418 org.luckypray.dexkit.query.StringMatcherList r2) {
            r1 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r2, r0)
            r1.usingStringsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(@Yue.InterfaceC4418 java.lang.String... r11) {
            r10 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L21
            r4 = r11[r2]
            org.luckypray.dexkit.query.matchers.base.StringMatcher r9 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r9)
            int r2 = r2 + 1
            goto Ld
        L21:
            java.util.List r11 = Yue.C1219.m6540(r0)
            r10.usingStringsMatcher = r11
            return r10
    }
}
