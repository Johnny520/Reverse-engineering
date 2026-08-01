package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: AnnotationElementMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017J%\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001dJ%\u0010\u001c\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020!J$\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u001fH\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020'J%\u0010\"\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020+J%\u0010*\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020-J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020/J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000204J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000206J%\u00105\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000J$\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u001fH\u0007J\u0006\u00107\u001a\u00020\u0000J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000209J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020;J$\u0010<\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u001fH\u0007J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000fJ%\u0010\u0003\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006?"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "nameMatcher", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "getValue", "()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;", "setValue", "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)V", "valueMatcher", "getValueMatcher", "annotationValue", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "arrayValue", "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;", "boolValue", "", "byteValue", "", "classValue", "className", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "doubleValue", "", "enumValue", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "floatValue", "", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "intValue", "longValue", "", "methodValue", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "nullValue", "numberValue", "", "shortValue", "", "stringValue", "matcher", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationElementMatcher extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;
    private org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher valueMatcher;

    /* JADX INFO: compiled from: AnnotationElementMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

    private final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher annotationValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.annotationValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher arrayValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.arrayValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.classValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
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

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.create()
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher enumValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.FieldMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.enumValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher methodValue(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.methodValue(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
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

    private final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher value(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.value(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher annotationValue(org.luckypray.dexkit.query.matchers.AnnotationMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.annotationValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher arrayValue(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.arrayValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher boolValue(boolean r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.boolValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher byteValue(byte r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.byteValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = classValue$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = classValue$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(java.lang.String r9, org.luckypray.dexkit.query.enums.StringMatchType r10, boolean r11) {
            r8 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
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
            r8.value(r2)
            r0 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(org.luckypray.dexkit.query.matchers.ClassMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.classValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher doubleValue(double r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.doubleValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher enumValue(org.luckypray.dexkit.query.matchers.FieldMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.enumValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher floatValue(float r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.floatValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getName() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getNameMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.nameMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher getValue() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher getValueMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r1.valueMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r6) {
            r5 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion r0 = org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = r5.nameMatcher
            r2 = 0
            if (r1 == 0) goto L14
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            int r1 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r6)
            goto L15
        L14:
            r1 = r2
        L15:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r3 = r5.valueMatcher
            if (r3 == 0) goto L24
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r3 = r3.getType()
            if (r3 == 0) goto L24
            byte r3 = r3.m10390getValuew2LRezQ()
            goto L25
        L24:
            r3 = r2
        L25:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r4 = r5.valueMatcher
            if (r4 == 0) goto L2e
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r4 = r4.getValue()
            goto L2f
        L2e:
            r4 = 0
        L2f:
            org.luckypray.dexkit.query.base.BaseQuery r4 = (org.luckypray.dexkit.query.base.BaseQuery) r4
            if (r4 == 0) goto L37
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r4, r6)
        L37:
            int r0 = r0.m10400createAnnotationElementMatcherSpDDLgk(r6, r1, r3, r2)
            r6.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher intValue(int r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.intValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher longValue(long r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.longValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher methodValue(org.luckypray.dexkit.query.matchers.MethodMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.methodValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.nameMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher nullValue() {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.nullValue()
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher numberValue(java.lang.Number r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r7
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
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
            r7.value(r2)
            r0 = r7
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final /* synthetic */ void setName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
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
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.value(r2)
            return
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher shortValue(short r6) {
            r5 = this;
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.shortValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = stringValue$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(java.lang.String r6, org.luckypray.dexkit.query.enums.StringMatchType r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.stringValue(r6, r7, r8)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(org.luckypray.dexkit.query.matchers.base.StringMatcher r6) {
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r2.<init>()
            r3 = r2
            r4 = 0
            r3.stringValue(r6)
            r5.value(r2)
            r0 = r5
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher value(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r3) {
            r2 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            r1 = 0
            r2.valueMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationElementMatcher) r0
            return r0
    }
}
