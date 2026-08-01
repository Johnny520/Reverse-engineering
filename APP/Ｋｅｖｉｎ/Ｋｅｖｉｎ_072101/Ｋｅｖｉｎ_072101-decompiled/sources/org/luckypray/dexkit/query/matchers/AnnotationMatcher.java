package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: AnnotationMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J%\u0010)\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u000e\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0014J$\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00142\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206H\u0007J\u000e\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020%J\u000e\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u001a\u00107\u001a\u00020\u00002\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u000209J\u000e\u00107\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=J\u000e\u00107\u001a\u00020\u00002\u0006\u0010<\u001a\u00020>J\u000e\u0010?\u001a\u00020\u00002\u0006\u00103\u001a\u00020@J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0005J%\u0010A\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u0010\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020DH\u0014J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010E\u001a\u00020\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u001e2\b\b\u0002\u00103\u001a\u00020@J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u000fJ%\u0010E\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u0012\u0010\u0015\u001a\u00020\u00002\n\u0010G\u001a\u0006\u0012\u0002\b\u00030HJ$\u0010\u0015\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u00142\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206H\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001aJ%\u0010\u0015\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u001f\u0010J\u001a\u00020\u00002\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140K\"\u00020\u0014¢\u0006\u0002\u0010LJ\u0014\u0010J\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001eJ\u001f\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140K\"\u00020\u0014¢\u0006\u0002\u0010LJ*\u0010\u001f\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206H\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020MR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006O"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "elementsMatcher", "getElementsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationElementsMatcher;", "Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "policy", "getPolicy", "()Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "setPolicy", "(Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;)V", "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "targetElementTypesMatcher", "getTargetElementTypesMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "value", "", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "typeMatcher", "getTypeMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "usingStrings", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "usingStringsMatcher", "getUsingStringsMatcher", "()Ljava/util/List;", "addElement", "element", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addEqString", "usingString", "addUsingString", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "elementCount", "count", "", "min", "max", "range", "Lkotlin/ranges/IntRange;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "elementMatchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "elements", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "targetElementTypes", "Lorg/luckypray/dexkit/query/enums/TargetElementType;", "clazz", "Ljava/lang/Class;", "typeName", "usingEqStrings", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationMatcher extends org.luckypray.dexkit.query.base.BaseQuery implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher elementsMatcher;
    private org.luckypray.dexkit.query.enums.RetentionPolicyType policy;
    private org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher targetElementTypesMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> usingStringsMatcher;

    /* JADX INFO: compiled from: AnnotationMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

    private final org.luckypray.dexkit.query.matchers.AnnotationMatcher addElement(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationElementMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addElement(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
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

    @kotlin.jvm.JvmStatic
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

    private final org.luckypray.dexkit.query.matchers.AnnotationMatcher elements(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.elements(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r2 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.targetElementTypes(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
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

    private final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.type(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
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

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addElement(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r5) {
            r4 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r2.<init>()
        L12:
            r4.elementsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r2.add(r5)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addEqString(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r6.usingStringsMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r6.usingStringsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r6.usingStringsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r4 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r5 = 0
            r3.<init>(r7, r4, r5)
            r2.add(r3)
            r0 = r6
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(java.lang.String r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r4.usingStringsMatcher
            if (r2 != 0) goto L19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L19:
            r4.usingStringsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r4.usingStringsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r3.<init>(r5, r6, r7)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(org.luckypray.dexkit.query.matchers.base.StringMatcher r4) {
            r3 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r3.usingStringsMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r3.usingStringsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r3.usingStringsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r2.<init>()
        Ld:
            r4.elementsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r2.count(r5)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r2.<init>()
        Ld:
            r4.elementsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r2.count(r5, r6)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(kotlin.ranges.IntRange r5) {
            r4 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r2.<init>()
        L12:
            r4.elementsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r2.count(r5)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(org.luckypray.dexkit.query.matchers.base.IntRange r5) {
            r4 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r2.<init>()
        L12:
            r4.elementsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r2.count(r5)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementMatchType(org.luckypray.dexkit.query.enums.MatchType r5) {
            r4 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r2.<init>()
        L12:
            r4.elementsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r4.elementsMatcher
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r2.matchType(r5)
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elements(org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            r2.elementsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher getElementsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.enums.RetentionPolicyType getPolicy() {
            r1 = this;
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = r1.policy
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher getTargetElementTypesMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = r1.targetElementTypesMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getType() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getTypeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.typeMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingStrings() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getUsingStringsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.usingStringsMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r19) {
            r18 = this;
            r0 = r18
            r8 = r19
            java.lang.String r1 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            org.luckypray.dexkit.schema.-AnnotationMatcher$Companion r1 = org.luckypray.dexkit.schema.AnnotationMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.typeMatcher
            if (r2 == 0) goto L18
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r8)
            r4 = r2
            goto L19
        L18:
            r4 = 0
        L19:
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r2 = r0.targetElementTypesMatcher
            if (r2 == 0) goto L25
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r8)
            r5 = r2
            goto L26
        L25:
            r5 = 0
        L26:
            org.luckypray.dexkit.query.enums.RetentionPolicyType r2 = r0.policy
            if (r2 == 0) goto L30
            byte r2 = r2.getValue()
            r6 = r2
            goto L31
        L30:
            r6 = 0
        L31:
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r2 = r0.elementsMatcher
            if (r2 == 0) goto L3d
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r8)
            r7 = r2
            goto L3e
        L3d:
            r7 = 0
        L3e:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r0.usingStringsMatcher
            if (r2 == 0) goto L8e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r11)
            r10.<init>(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r2
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L58:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L76
            java.lang.Object r14 = r13.next()
            r15 = r14
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r15
            r16 = 0
            r3 = r15
            org.luckypray.dexkit.query.base.BaseQuery r3 = (org.luckypray.dexkit.query.base.BaseQuery) r3
            int r3 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r3, r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.add(r3)
            goto L58
        L76:
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r3)
            if (r2 == 0) goto L8e
        L86:
            r3 = 0
            int r2 = r8.createVectorOfTables(r2)
            r17 = r2
            goto L90
        L8e:
            r17 = 0
        L90:
            r2 = r19
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r17
            int r1 = r1.createAnnotationMatcher(r2, r3, r4, r5, r6, r7)
            r8.finish(r1)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher policy(org.luckypray.dexkit.query.enums.RetentionPolicyType r3) {
            r2 = this;
            java.lang.String r0 = "policy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            r2.policy = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final /* synthetic */ void setPolicy(org.luckypray.dexkit.query.enums.RetentionPolicyType r1) {
            r0 = this;
            r0.policy = r1
            return
    }

    public final /* synthetic */ void setType(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
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
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            usingStrings$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r6, org.luckypray.dexkit.query.enums.MatchType r7) {
            r5 = this;
            java.lang.String r0 = "targetElementTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r2 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.types(r6)
            r3.matchType(r7)
            r5.targetElementTypesMatcher = r2
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r3) {
            r2 = this;
            java.lang.String r0 = "targetElementTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            r2.targetElementTypesMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            java.lang.String r3 = r9.getName()
            java.lang.String r4 = "clazz.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r2, r3, r4, r5, r6, r7)
            r8.typeMatcher = r2
            r0 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r2.className(r4, r5, r6)
            r3.typeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            r2.typeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingEqStrings(java.util.Collection<java.lang.String> r15) {
            r14 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = r14
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            r2 = r15
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L20:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3a
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r11 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r12 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r13 = 0
            r11.<init>(r9, r12, r13)
            r4.add(r11)
            goto L20
        L3a:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r14.usingStringsMatcher = r2
            r0 = r14
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingEqStrings(java.lang.String... r18) {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "usingStrings"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r1 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r1
            r3 = 0
            r4 = r18
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.length
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r4
            r8 = 0
            int r9 = r7.length
            r10 = 0
            r11 = r10
        L1d:
            if (r11 >= r9) goto L35
            r12 = r7[r11]
            r13 = r12
            r14 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r16 = r1
            org.luckypray.dexkit.query.enums.StringMatchType r1 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r15.<init>(r13, r1, r10)
            r6.add(r15)
            int r11 = r11 + 1
            r1 = r16
            goto L1d
        L35:
            r16 = r1
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)
            r0.usingStringsMatcher = r1
            r1 = r0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r1 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r1
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.util.Collection<java.lang.String> r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.util.Collection<java.lang.String> r13, org.luckypray.dexkit.query.enums.StringMatchType r14, boolean r15) {
            r12 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r12
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            r2 = r13
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L25:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3c
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r11 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r11.<init>(r9, r14, r15)
            r4.add(r11)
            goto L25
        L3c:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r12.usingStringsMatcher = r2
            r0 = r12
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(org.luckypray.dexkit.query.StringMatcherList r4) {
            r3 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            r1 = 0
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            r3.usingStringsMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.lang.String... r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "usingStrings"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r1 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r1
            r3 = 0
            r4 = r22
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.length
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r4
            r8 = 0
            int r9 = r7.length
            r10 = 0
        L1c:
            if (r10 >= r9) goto L3f
            r17 = r7[r10]
            r12 = r17
            r18 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r16 = 6
            r19 = 0
            r13 = 0
            r14 = 0
            r11 = r15
            r20 = r15
            r15 = r16
            r16 = r19
            r11.<init>(r12, r13, r14, r15, r16)
            r11 = r20
            r6.add(r11)
            int r10 = r10 + 1
            goto L1c
        L3f:
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r4 = kotlin.collections.CollectionsKt.toMutableList(r6)
            r0.usingStringsMatcher = r4
            r1 = r0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r1 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r1
            return r1
    }
}
