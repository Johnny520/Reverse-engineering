package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 h2\u00020\u0001:\u0001hB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0013\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001b\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0019\u0010!\u001a\u00020\u00002\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#¢\u0006\u0004\b!\u0010%J+\u0010!\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020 ¢\u0006\u0004\b'\u0010\"J\u0019\u0010'\u001a\u00020\u00002\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#¢\u0006\u0004\b'\u0010%J+\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b'\u0010\u0019J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u001d¢\u0006\u0004\b1\u00102J\u0015\u00101\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b1\u00105J\u0015\u00101\u001a\u00020\u00002\u0006\u00104\u001a\u000206¢\u0006\u0004\b1\u00107J!\u00101\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u001d¢\u0006\u0004\b1\u0010:J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\t¢\u0006\u0004\b@\u0010\u0011J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020;¢\u0006\u0004\bD\u0010=J\u0015\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020>¢\u0006\u0004\bF\u0010AJ\u0015\u0010F\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\t¢\u0006\u0004\bF\u0010\u0011J&\u0010\u0005\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b\u0005\u0010KJ&\u0010!\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b!\u0010KJ&\u0010'\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b'\u0010KJ&\u0010*\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b*\u0010KJ&\u0010.\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b.\u0010KJ&\u0010<\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b<\u0010KJ&\u0010@\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\b@\u0010KJ&\u0010D\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\bD\u0010KJ&\u0010F\u001a\u00020\u00002\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI¢\u0006\u0004\bF\u0010KJ\u0017\u0010N\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020LH\u0014¢\u0006\u0004\bN\u0010OR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010P\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u0010SR*\u0010\u0007\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\u0010\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010\u0013\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010[\"\u0004\b_\u0010]R$\u0010\u001b\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020\u001d8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010!\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010[\"\u0004\be\u0010]R$\u0010'\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010[\"\u0004\bg\u0010]¨\u0006i"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "<init>", "()V", "Ljava/lang/reflect/Field;", "field", "Lorg/luckypray/dexkit/query/enums/UsingType;", "usingType", "(Ljava/lang/reflect/Field;Lorg/luckypray/dexkit/query/enums/UsingType;)V", "", "fieldDescriptor", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)V", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "matcher", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "(Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "descriptor", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "name", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "declaredClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "className", "type", "typeName", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "count", "annotationCount", "(I)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "readMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "readMethod", "addReadMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "methodDescriptor", "putMethods", "writeMethods", "putMethod", "addWriteMethod", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/enums/UsingType;", "getUsingType", "()Lorg/luckypray/dexkit/query/enums/UsingType;", "setUsingType", "(Lorg/luckypray/dexkit/query/enums/UsingType;)V", "value", "getDescriptor", "()Ljava/lang/String;", "setDescriptor", "(Ljava/lang/String;)V", "getName", "setName", "getModifiers", "()I", "setModifiers", "(I)V", "getDeclaredClass", "setDeclaredClass", "getType", "setType", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class UsingFieldMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.FieldMatcher matcher;

    @Yue.InterfaceC4418
    private org.luckypray.dexkit.query.enums.UsingType usingType;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    public UsingFieldMatcher(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.UsingType r3) {
            r1 = this;
            java.lang.String r0 = "fieldDescriptor"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "usingType"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>(r2)
            r1.matcher = r0
            r1.usingType = r3
            return
    }

    public /* synthetic */ UsingFieldMatcher(java.lang.String r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            r0.<init>(r1, r2)
            return
    }

    public UsingFieldMatcher(@Yue.InterfaceC4418 java.lang.reflect.Field r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.UsingType r3) {
            r1 = this;
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "usingType"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>(r2)
            r1.matcher = r0
            r1.usingType = r3
            return
    }

    public /* synthetic */ UsingFieldMatcher(java.lang.reflect.Field r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            r0.<init>(r1, r2)
            return
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.UsingFieldMatcher create() {
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.create()
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher addAnnotation(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotation"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.addAnnotation(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addReadMethods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "methodDescriptor"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r2.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r2.matcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.addReadMethod(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "readMethod"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.addReadMethod(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addWriteMethod(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "methodDescriptor"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r2.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r2.matcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.addWriteMethod(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "putMethod"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.addWriteMethod(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        L9:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.annotationCount(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        L9:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.annotationCount(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.annotationCount(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.annotationCount(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotations(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotations(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.annotations(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.declaredClass(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.declaredClass(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r8 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r8 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto L13
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        L13:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.declaredClass(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "declaredClass"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.declaredClass(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher descriptor(@Yue.InterfaceC4418 java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r14, r0)
            org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
            r0.<init>(r14)
            java.lang.String r2 = r0.getName()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r13
            name$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = r0.getClassName()
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r13
            declaredClass$default(r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = r0.getTypeName()
            type$default(r1, r2, r3, r4, r5, r6)
            return r13
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher field(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.field(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher field(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.matcher = r2
            return r1
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDeclaredClass() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDescriptor() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.FieldMatcher getMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
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

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getType() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.UsingType getUsingType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.UsingType r0 = r1.usingType
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r4) {
            r3 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r3.matcher
            if (r0 == 0) goto L20
            org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion r1 = org.luckypray.dexkit.schema.UsingFieldMatcher.Companion
            Yue.C3329.m13903(r0)
            int r0 = r0.build$dexkit_android_release(r4)
            org.luckypray.dexkit.query.enums.UsingType r2 = r3.usingType
            byte r2 = r2.getValue()
            int r0 = r1.createUsingFieldMatcher(r4, r0, r2)
            r4.finish(r0)
            return r0
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "UsingFieldMatcher matcher not set"
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r3 = modifiers$default(r2, r3, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(int r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.modifiers(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "modifiers"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.modifiers(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto L13
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        L13:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.name(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.name(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher readMethods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.readMethods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher readMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "readMethods"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.readMethods(r2)
            return r1
    }

    public final /* synthetic */ void setDeclaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
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
            Yue.C3329.m13906(r2, r0)
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

    public final /* synthetic */ void setUsingType(org.luckypray.dexkit.query.enums.UsingType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            Yue.C3329.m13906(r2, r0)
            r1.usingType = r2
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(@Yue.InterfaceC4418 java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.type(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto L13
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        L13:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.type(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "type"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.type(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher usingType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.UsingType r2) {
            r1 = this;
            java.lang.String r0 = "usingType"
            Yue.C3329.m13906(r2, r0)
            r1.usingType = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher writeMethods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.writeMethods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher writeMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "putMethods"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Le:
            r1.matcher = r0
            Yue.C3329.m13903(r0)
            r0.writeMethods(r2)
            return r1
    }
}
