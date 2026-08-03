package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0005\u001a\u00020\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\tJ+\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0005\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u0005\u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b\u0005\u0010 J&\u0010\u0012\u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b\u0012\u0010 J&\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001e¢\u0006\u0004\b\u0016\u0010 J\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$R(\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0005\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "<init>", "()V", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "type", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "", "count", "annotationCount", "(I)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "typeMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getTypeMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "value", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ParameterMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ParameterMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.ParameterMatcher create() {
            org.luckypray.dexkit.query.matchers.ParameterMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = r0.create()
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher addAnnotation(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher addAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotation"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Le:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher annotationCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        L9:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher annotations(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher annotations(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            Yue.C3329.m13906(r2, r0)
            r1.annotationsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
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

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r5) {
            r4 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r5, r0)
            org.luckypray.dexkit.schema.-ParameterMatcher$Companion r0 = org.luckypray.dexkit.schema.ParameterMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r1 = r4.annotationsMatcher
            r2 = 0
            if (r1 == 0) goto L11
            int r1 = r1.build$dexkit_android_release(r5)
            goto L12
        L11:
            r1 = r2
        L12:
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r4.typeMatcher
            if (r3 == 0) goto L1a
            int r2 = r3.build$dexkit_android_release(r5)
        L1a:
            int r0 = r0.createParameterMatcher(r5, r1, r2)
            r5.finish(r0)
            return r0
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher type(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
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
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ParameterMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ParameterMatcher r8 = type$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
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
    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "type"
            Yue.C3329.m13906(r2, r0)
            r1.typeMatcher = r2
            return r1
    }
}
