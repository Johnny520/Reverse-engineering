package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: FieldMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u000208J%\u00106\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\bJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@J%\u0010=\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\bJ\u000e\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020@J%\u0010A\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u001eJ\u001a\u0010C\u001a\u00020\u00002\b\b\u0002\u0010E\u001a\u00020\u001e2\b\b\u0002\u0010F\u001a\u00020\u001eJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010G\u001a\u00020HJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010G\u001a\u00020IJ\u000e\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u000bJ%\u0010J\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000J\u0012\u0010\u0014\u001a\u00020\u00002\n\u0010K\u001a\u0006\u0012\u0002\b\u00030LJ$\u0010\u0014\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020QH\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fJ%\u0010\u0014\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020TH\u0014J\u001a\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010N\u001a\u00020UH\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020$J$\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020QH\u0007J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020+J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u001aJ%\u0010V\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000J\u0012\u00101\u001a\u00020\u00002\n\u0010K\u001a\u0006\u0012\u0002\b\u00030LJ$\u00101\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\b2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020QH\u0007J\u000e\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u000fJ%\u00101\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000J\u000e\u0010X\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u001aJ%\u0010X\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020;0:¢\u0006\u0002\b<H\u0087\bø\u0001\u0000R\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\tR$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\tR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\n\u001a\u0004\u0018\u00010$@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R$\u0010(\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\tR\"\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\n\u001a\u0004\u0018\u00010+@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\"\u0010/\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR$\u00101\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\tR\"\u00104\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Z"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "descriptor", "", "(Ljava/lang/String;)V", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotationsMatcher", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "classMatcher", "getClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "value", "declaredClass", "getDeclaredClass", "()Ljava/lang/String;", "setDeclaredClass", "getDescriptor", "setDescriptor", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "getMethodsMatcher", "getGetMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "", "modifiers", "getModifiers", "()I", "setModifiers", "(I)V", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiersMatcher", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "name", "getName", "setName", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "nameMatcher", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "putMethodsMatcher", "getPutMethodsMatcher", "type", "getType", "setType", "typeMatcher", "getTypeMatcher", "addAnnotation", "annotation", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addReadMethod", "methodDescriptor", "readMethod", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "addWriteMethod", "writeMethod", "annotationCount", "count", "min", "max", "range", "Lkotlin/ranges/IntRange;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "annotations", "clazz", "Ljava/lang/Class;", "className", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "readMethods", "typeName", "writeMethods", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class FieldMatcher extends org.luckypray.dexkit.query.base.BaseQuery implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher classMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher getMethodsMatcher;
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher putMethodsMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;

    /* JADX INFO: compiled from: FieldMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "field", "Ljava/lang/reflect/Field;", "descriptor", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.FieldMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.reflect.Field r2) {
                r1 = this;
                java.lang.String r0 = "field"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.FieldMatcher.Companion = r0
            return
    }

    public FieldMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public FieldMatcher(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.descriptor(r2)
            return
    }

    public FieldMatcher(java.lang.reflect.Field r2) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getFieldDescriptor(r2)
            r1.descriptor(r0)
            return
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher addAnnotation(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addAnnotation(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addReadMethod(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addWriteMethod(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher annotations(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.annotations(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create() {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.create()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.reflect.Field r1) {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.create(r1)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.declaredClass(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher modifiers$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher name$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher readMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.readMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher type(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.type(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher type$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.FieldMatcher writeMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.writeMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
            r3 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
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
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "methodDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.getMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r4.getMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.getMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r3.<init>(r5)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "readMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.getMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.getMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.getMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "methodDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.putMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r4.putMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r4.putMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r3.<init>(r5)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "writeMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.putMethodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.putMethodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.putMethodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
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
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        Ld:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4, r5)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        L12:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
        L12:
            r3.annotationsMatcher = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            r2.annotationsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r9)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r2, r3, r4, r5, r6, r7)
            r8.classMatcher = r2
            r0 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r2.className(r4, r5, r6)
            r3.classMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "declaredClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            r2.classMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher descriptor(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r6 = r9
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r6
            r7 = 0
            org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
            r0.<init>(r10)
            r8 = r0
            java.lang.String r1 = r8.getName()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r9
            name$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r8.getClassName()
            declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r8.getTypeName()
            type$default(r0, r1, r2, r3, r4, r5)
            r0 = r9
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getClassMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.classMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDeclaredClass() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDescriptor() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getGetMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.getMethodsMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher getModifiersMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r1.modifiersMatcher
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

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getPutMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.putMethodsMatcher
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
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r11) {
            r10 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            org.luckypray.dexkit.schema.-FieldMatcher$Companion r1 = org.luckypray.dexkit.schema.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r10.nameMatcher
            r2 = 0
            if (r0 == 0) goto L15
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r11)
            r3 = r0
            goto L16
        L15:
            r3 = r2
        L16:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r10.modifiersMatcher
            if (r0 == 0) goto L22
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r11)
            r4 = r0
            goto L23
        L22:
            r4 = r2
        L23:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r10.classMatcher
            if (r0 == 0) goto L2f
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r11)
            r5 = r0
            goto L30
        L2f:
            r5 = r2
        L30:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r10.typeMatcher
            if (r0 == 0) goto L3c
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r11)
            r6 = r0
            goto L3d
        L3c:
            r6 = r2
        L3d:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r10.annotationsMatcher
            if (r0 == 0) goto L49
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r11)
            r7 = r0
            goto L4a
        L49:
            r7 = r2
        L4a:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r10.getMethodsMatcher
            if (r0 == 0) goto L56
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r11)
            r8 = r0
            goto L57
        L56:
            r8 = r2
        L57:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r10.putMethodsMatcher
            if (r0 == 0) goto L63
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r11)
            r9 = r0
            goto L64
        L63:
            r9 = r2
        L64:
            r2 = r11
            int r0 = r1.createFieldMatcher(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = modifiers$default(r2, r3, r0, r1, r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(int r4, org.luckypray.dexkit.query.enums.MatchType r5) {
            r3 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r2.<init>(r4, r5)
            r3.modifiersMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "modifiers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            r2.modifiersMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.nameMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(org.luckypray.dexkit.query.matchers.base.StringMatcher r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            r2.nameMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher readMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "readMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            r2.getMethodsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final /* synthetic */ void setDeclaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            declaredClass$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setDescriptor(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.descriptor(r2)
            return
    }

    public final /* synthetic */ void setModifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            modifiers$default(r2, r3, r0, r1, r0)
            return
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

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
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
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r2.className(r4, r5, r6)
            r3.typeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            r2.typeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher writeMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "writeMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r1 = 0
            r2.putMethodsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }
}
