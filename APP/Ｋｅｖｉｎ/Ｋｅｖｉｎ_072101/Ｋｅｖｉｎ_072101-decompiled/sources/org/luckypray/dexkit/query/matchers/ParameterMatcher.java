package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: ParameterMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J%\u0010\u0013\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J%\u0010\u001d\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0012\u0010\n\u001a\u00020\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"J$\u0010\n\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'H\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000fJ%\u0010\n\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotationsMatcher", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "value", "", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "typeMatcher", "getTypeMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "addAnnotation", "annotation", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "annotationCount", "count", "", "annotations", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "clazz", "Ljava/lang/Class;", "typeName", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class ParameterMatcher extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;

    /* JADX INFO: compiled from: ParameterMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.ParameterMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.ParameterMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.ParameterMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion = r0
            return
    }

    public ParameterMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private final org.luckypray.dexkit.query.matchers.ParameterMatcher addAnnotation(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addAnnotation(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ParameterMatcher annotations(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.annotations(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.ParameterMatcher create() {
            org.luckypray.dexkit.query.matchers.ParameterMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = r0.create()
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ParameterMatcher type(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.type(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher type$default(org.luckypray.dexkit.query.matchers.ParameterMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
            r3 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        L12:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher annotationCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        Ld:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            r2.annotationsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
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

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r5) {
            r4 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            org.luckypray.dexkit.schema.-ParameterMatcher$Companion r0 = org.luckypray.dexkit.schema.ParameterMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r1 = r4.annotationsMatcher
            r2 = 0
            if (r1 == 0) goto L14
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            int r1 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r5)
            goto L15
        L14:
            r1 = r2
        L15:
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r4.typeMatcher
            if (r3 == 0) goto L1f
            org.luckypray.dexkit.query.base.BaseQuery r3 = (org.luckypray.dexkit.query.base.BaseQuery) r3
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r3, r5)
        L1f:
            int r0 = r0.createParameterMatcher(r5, r1, r2)
            r5.finish(r0)
            return r0
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

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r9)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r2, r3, r4, r5, r6, r7)
            r8.typeMatcher = r2
            r0 = r8
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r2.className(r4, r5, r6)
            r3.typeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            r1 = 0
            r2.typeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r0
            return r0
    }
}
