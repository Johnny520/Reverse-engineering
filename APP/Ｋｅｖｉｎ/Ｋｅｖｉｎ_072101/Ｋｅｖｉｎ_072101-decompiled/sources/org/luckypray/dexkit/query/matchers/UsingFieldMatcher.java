package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: UsingFieldMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\u00020\u0001:\u0001RB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J%\u0010)\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u000e\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\tJ\u000e\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u000203J%\u00100\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u000e\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u00020\tJ\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u000203J%\u00104\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0019J\u001a\u00106\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u0019J\u000e\u00106\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u00106\u001a\u00020\u00002\u0006\u0010:\u001a\u00020<J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>J%\u0010=\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u0012\u0010\f\u001a\u00020\u00002\n\u0010?\u001a\u0006\u0012\u0002\b\u00030@J$\u0010\f\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020EH\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020FJ%\u0010\f\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J%\u0010\u0003\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u0010\u0010G\u001a\u00020\u00192\u0006\u0010H\u001a\u00020IH\u0014J\u001a\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010B\u001a\u00020JH\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020KJ$\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020EH\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020LJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010M\u001a\u00020NJ%\u0010M\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u0012\u0010\"\u001a\u00020\u00002\n\u0010?\u001a\u0006\u0012\u0002\b\u00030@J$\u0010\"\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020EH\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020FJ%\u0010\"\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020NJ%\u0010P\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020.0-¢\u0006\u0002\b/H\u0087\bø\u0001\u0000R$\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00198G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R$\u0010\"\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "field", "Ljava/lang/reflect/Field;", "usingType", "Lorg/luckypray/dexkit/query/enums/UsingType;", "(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V", "fieldDescriptor", "", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V", "value", "declaredClass", "getDeclaredClass", "()Ljava/lang/String;", "setDeclaredClass", "(Ljava/lang/String;)V", "descriptor", "getDescriptor", "setDescriptor", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "matcher", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "", "modifiers", "getModifiers", "()I", "setModifiers", "(I)V", "name", "getName", "setName", "type", "getType", "setType", "getUsingType", "()Lorg/luckypray/dexkit/query/enums/UsingType;", "setUsingType", "(Lorg/luckypray/dexkit/query/enums/UsingType;)V", "addAnnotation", "annotation", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addReadMethods", "methodDescriptor", "readMethod", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "addWriteMethod", "putMethod", "annotationCount", "count", "min", "max", "range", "Lkotlin/ranges/IntRange;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "annotations", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "clazz", "Ljava/lang/Class;", "className", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "readMethods", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "typeName", "writeMethods", "putMethods", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class UsingFieldMatcher extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.FieldMatcher matcher;
    private org.luckypray.dexkit.query.enums.UsingType usingType;

    /* JADX INFO: compiled from: UsingFieldMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion = r0
            return
    }

    public UsingFieldMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            return
    }

    public UsingFieldMatcher(java.lang.String r2, org.luckypray.dexkit.query.enums.UsingType r3) {
            r1 = this;
            java.lang.String r0 = "fieldDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "usingType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>(r2)
            r1.matcher = r0
            r1.usingType = r3
            return
    }

    public /* synthetic */ UsingFieldMatcher(java.lang.String r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            r0.<init>(r1, r2)
            return
    }

    public UsingFieldMatcher(java.lang.reflect.Field r2, org.luckypray.dexkit.query.enums.UsingType r3) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "usingType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>(r2)
            r1.matcher = r0
            r1.usingType = r3
            return
    }

    public /* synthetic */ UsingFieldMatcher(java.lang.reflect.Field r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            r0.<init>(r1, r2)
            return
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addAnnotation(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addAnnotation(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addReadMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addWriteMethod(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotations(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.annotations(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.UsingFieldMatcher create() {
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.create()
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.declaredClass(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher field(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.FieldMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.field(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher name$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher readMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.readMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.type(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher type$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.UsingFieldMatcher writeMethods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.writeMethods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
            r3 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.addAnnotation(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "methodDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r4.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r4.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r4.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r3.<init>(r5)
            r2.addReadMethod(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "readMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.addReadMethod(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "methodDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r4.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r4.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r4.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r3.<init>(r5)
            r2.addWriteMethod(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "putMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.addWriteMethod(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        Ld:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.annotationCount(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        Ld:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.annotationCount(r4, r5)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.annotationCount(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.annotationCount(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.annotations(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.Class<?> r4) {
            r3 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.declaredClass(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L17
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L17:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.declaredClass(r4, r5, r6)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(org.luckypray.dexkit.query.matchers.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "declaredClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.declaredClass(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher descriptor(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r6 = r9
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r6 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r6
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
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher field(org.luckypray.dexkit.query.matchers.FieldMatcher r3) {
            r2 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            r2.matcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
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

    public final org.luckypray.dexkit.query.matchers.FieldMatcher getMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
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

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getName() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
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

    public final org.luckypray.dexkit.query.enums.UsingType getUsingType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.UsingType r0 = r1.usingType
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r4) {
            r3 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r3.matcher
            if (r0 == 0) goto L25
            org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion r0 = org.luckypray.dexkit.schema.UsingFieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            int r1 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r4)
            org.luckypray.dexkit.query.enums.UsingType r2 = r3.usingType
            byte r2 = r2.getValue()
            int r0 = r0.createUsingFieldMatcher(r4, r1, r2)
            r4.finish(r0)
            return r0
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "UsingFieldMatcher matcher not set"
            r0.<init>(r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = modifiers$default(r2, r3, r0, r1, r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(int r4, org.luckypray.dexkit.query.enums.MatchType r5) {
            r3 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.modifiers(r4, r5)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "modifiers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.modifiers(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = name$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L17
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L17:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.name(r4, r5, r6)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(org.luckypray.dexkit.query.matchers.base.StringMatcher r4) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.name(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher readMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "readMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.readMethods(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
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

    public final /* synthetic */ void setUsingType(org.luckypray.dexkit.query.enums.UsingType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.usingType = r2
            return
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.Class<?> r4) {
            r3 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.type(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = type$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L17
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L17:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.type(r4, r5, r6)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.type(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher usingType(org.luckypray.dexkit.query.enums.UsingType r3) {
            r2 = this;
            java.lang.String r0 = "usingType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            r2.usingType = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher writeMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r4) {
            r3 = this;
            java.lang.String r0 = "putMethods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
        L12:
            r3.matcher = r2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = r3.matcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.writeMethods(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }
}
