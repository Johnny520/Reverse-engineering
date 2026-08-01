package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: ClassMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0001vB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0013\b\u0016\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020GJ%\u0010E\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\bJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020PJ%\u0010N\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J$\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J\u0012\u0010W\u001a\u00020\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005J$\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J$\u0010Y\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u0000J%\u0010Y\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J\u000e\u0010[\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020]J%\u0010[\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J$\u0010^\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0014J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010_\u001a\u00020\u00002\b\b\u0002\u0010a\u001a\u00020&2\b\b\u0002\u0010b\u001a\u00020&J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010_\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010f\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u000bJ%\u0010f\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J$\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0014J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010h\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010h\u001a\u00020\u00002\b\b\u0002\u0010a\u001a\u00020&2\b\b\u0002\u0010b\u001a\u00020&J\u000e\u0010h\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010h\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010i\u001a\u00020\u00002\u0006\u0010i\u001a\u00020\u001aJ%\u0010i\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J\u0010\u0010j\u001a\u00020&2\u0006\u0010k\u001a\u00020lH\u0014J\u000e\u0010m\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010m\u001a\u00020\u00002\b\b\u0002\u0010a\u001a\u00020&2\b\b\u0002\u0010b\u001a\u00020&J\u000e\u0010m\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010m\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010n\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u001eJ%\u0010n\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010o\u001a\u00020\u00002\b\b\u0002\u0010a\u001a\u00020&2\b\b\u0002\u0010b\u001a\u00020&J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010o\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010p\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\"J%\u0010p\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J\u001a\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010S\u001a\u00020qH\u0007J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010g\u001a\u00020,J$\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u00100\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0014J$\u00105\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000J%\u00105\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000J\u001f\u0010r\u001a\u00020\u00002\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0s\"\u00020\b¢\u0006\u0002\u0010tJ\u0014\u0010r\u001a\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0;J\u001f\u0010<\u001a\u00020\u00002\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0s\"\u00020\b¢\u0006\u0002\u0010tJ*\u0010<\u001a\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0;2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020uJ%\u0010<\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020J0I¢\u0006\u0002\bKH\u0087\bø\u0001\u0000R\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\tR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\tR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\u001e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\"\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020&8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\n\u001a\u0004\u0018\u00010,@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R$\u00100\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\tR\"\u00103\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0017R$\u00105\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0012\"\u0004\b7\u0010\tR\"\u00108\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0000@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R0\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0;2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0;8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R.\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010A2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010A@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006w"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "descriptor", "", "(Ljava/lang/String;)V", "<set-?>", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotationsMatcher", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "value", "className", "getClassName", "()Ljava/lang/String;", "setClassName", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "classNameMatcher", "getClassNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getDescriptor", "setDescriptor", "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "fieldsMatcher", "getFieldsMatcher", "()Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "interfacesMatcher", "getInterfacesMatcher", "()Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "methodsMatcher", "getMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "", "modifiers", "getModifiers", "()I", "setModifiers", "(I)V", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiersMatcher", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "source", "getSource", "setSource", "sourceMatcher", "getSourceMatcher", "superClass", "getSuperClass", "setSuperClass", "superClassMatcher", "getSuperClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "usingStrings", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "", "usingStringsMatcher", "getUsingStringsMatcher", "()Ljava/util/List;", "addAnnotation", "annotationMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addEqString", "usingString", "addField", "fieldMatcher", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "addFieldForName", "fieldName", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "addFieldForType", "typeName", "addInterface", "interfaceMatcher", "addMethod", "methodMatcher", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "addUsingString", "annotationCount", "count", "min", "max", "range", "Lkotlin/ranges/IntRange;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "annotations", "matcher", "fieldCount", "fields", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "interfaceCount", "interfaces", "methodCount", "methods", "Lorg/luckypray/dexkit/query/enums/MatchType;", "usingEqStrings", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class ClassMatcher extends org.luckypray.dexkit.query.base.BaseQuery implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher classNameMatcher;
    private org.luckypray.dexkit.query.matchers.FieldsMatcher fieldsMatcher;
    private org.luckypray.dexkit.query.matchers.InterfacesMatcher interfacesMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher methodsMatcher;
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher sourceMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher superClassMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> usingStringsMatcher;

    /* JADX INFO: compiled from: ClassMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "clazz", "Ljava/lang/Class;", "descriptor", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.ClassMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.String r0 = "clazz"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.ClassMatcher.Companion = r0
            return
    }

    public ClassMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public ClassMatcher(java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getClassDescriptor(r8)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            className$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public ClassMatcher(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.descriptor(r2)
            return
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher addAnnotation(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addAnnotation(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher addField(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.FieldMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addField(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addFieldForName(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addFieldForType(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addInterface(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addInterface$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addInterface(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher addMethod(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.addMethod(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher annotations(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.annotations(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher className$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.className(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create() {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.create()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.Class<?> r1) {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.create(r1)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.fieldCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher fields(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.FieldsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.fields(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.interfaceCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher interfaces(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.InterfacesMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.interfaces(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher methodCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.methodCount(r1, r2)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher methods(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodsMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.methods(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher modifiers$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher source$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.source(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.superClass(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher superClass$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.superClass(r1, r2, r3)
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.StringMatcherList, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.StringMatcherList r2 = new org.luckypray.dexkit.query.StringMatcherList
            r2.<init>()
            r4.invoke(r2)
            r3.usingStrings(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
            r3 = this;
            java.lang.String r0 = "annotationMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addEqString(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addField(org.luckypray.dexkit.query.matchers.FieldMatcher r4) {
            r3 = this;
            java.lang.String r0 = "fieldMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        L12:
            r3.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "fieldName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addFieldForName$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "fieldName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addFieldForName$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(java.lang.String r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "fieldName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r4.fieldsMatcher
            if (r2 != 0) goto L17
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        L17:
            r4.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r4.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r3.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r3.name(r5, r6, r7)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r4.fieldsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        L12:
            r4.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r4.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r3.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r3.type(r5)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addFieldForType$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addFieldForType$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.String r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r4.fieldsMatcher
            if (r2 != 0) goto L17
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        L17:
            r4.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r4.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r3.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r3.type(r5, r6, r7)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addInterface$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addInterface$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(java.lang.String r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r4.interfacesMatcher
            if (r2 != 0) goto L17
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r2.<init>()
        L17:
            r4.interfacesMatcher = r2
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r4.interfacesMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r3.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r3.className(r5, r6, r7)
            r2.add(r3)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(org.luckypray.dexkit.query.matchers.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "interfaceMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r2.<init>()
        L12:
            r3.interfacesMatcher = r2
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r4) {
            r3 = this;
            java.lang.String r0 = "methodMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.methodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.addUsingString(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(org.luckypray.dexkit.query.matchers.base.StringMatcher r4) {
            r3 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.annotationsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = className$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = className$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.classNameMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(org.luckypray.dexkit.query.matchers.base.StringMatcher r3) {
            r2 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.classNameMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher descriptor(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r9
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.wrap.DexClass r2 = new org.luckypray.dexkit.wrap.DexClass
            r2.<init>(r10)
            java.lang.String r4 = r2.getTypeName()
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            className$default(r3, r4, r5, r6, r7, r8)
            r0 = r9
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        Ld:
            r3.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        Ld:
            r3.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4, r5)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        L12:
            r3.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r2.<init>()
        L12:
            r3.fieldsMatcher = r2
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r3.fieldsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fields(org.luckypray.dexkit.query.matchers.FieldsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "fields"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.fieldsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getClassName() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getClassNameMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.classNameMatcher
            return r0
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

    public final org.luckypray.dexkit.query.matchers.FieldsMatcher getFieldsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher getInterfacesMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
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
    public final /* synthetic */ java.lang.String getSource() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getSourceMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.sourceMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getSuperClass() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getSuperClassMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.superClassMatcher
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
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r23) {
            r22 = this;
            r0 = r22
            r12 = r23
            java.lang.String r1 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            org.luckypray.dexkit.schema.-ClassMatcher$Companion r1 = org.luckypray.dexkit.schema.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = r0.sourceMatcher
            if (r2 == 0) goto L18
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r4 = r2
            goto L19
        L18:
            r4 = 0
        L19:
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = r0.classNameMatcher
            if (r2 == 0) goto L25
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r5 = r2
            goto L26
        L25:
            r5 = 0
        L26:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = r0.modifiersMatcher
            if (r2 == 0) goto L32
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r6 = r2
            goto L33
        L32:
            r6 = 0
        L33:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.superClassMatcher
            if (r2 == 0) goto L3f
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r7 = r2
            goto L40
        L3f:
            r7 = 0
        L40:
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r0.interfacesMatcher
            if (r2 == 0) goto L4c
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r8 = r2
            goto L4d
        L4c:
            r8 = 0
        L4d:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r0.annotationsMatcher
            if (r2 == 0) goto L59
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r9 = r2
            goto L5a
        L59:
            r9 = 0
        L5a:
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r0.fieldsMatcher
            if (r2 == 0) goto L66
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r10 = r2
            goto L67
        L66:
            r10 = 0
        L67:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r0.methodsMatcher
            if (r2 == 0) goto L73
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r12)
            r11 = r2
            goto L74
        L73:
            r11 = 0
        L74:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r0.usingStringsMatcher
            if (r2 == 0) goto Lc7
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r13 = 0
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r15)
            r14.<init>(r15)
            java.util.Collection r14 = (java.util.Collection) r14
            r15 = r2
            r16 = 0
            java.util.Iterator r17 = r15.iterator()
        L8f:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto Laf
            java.lang.Object r18 = r17.next()
            r19 = r18
            org.luckypray.dexkit.query.matchers.base.StringMatcher r19 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r19
            r20 = 0
            r3 = r19
            org.luckypray.dexkit.query.base.BaseQuery r3 = (org.luckypray.dexkit.query.base.BaseQuery) r3
            int r3 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r3, r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14.add(r3)
            goto L8f
        Laf:
            r3 = r14
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r3)
            if (r2 == 0) goto Lc7
        Lbf:
            r3 = 0
            int r2 = r12.createVectorOfTables(r2)
            r21 = r2
            goto Lc9
        Lc7:
            r21 = 0
        Lc9:
            r2 = r23
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r21
            int r1 = r1.createClassMatcher(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.finish(r1)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r2.<init>()
        Ld:
            r3.interfacesMatcher = r2
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r2.<init>()
        Ld:
            r3.interfacesMatcher = r2
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4, r5)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r2.<init>()
        L12:
            r3.interfacesMatcher = r2
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r2.<init>()
        L12:
            r3.interfacesMatcher = r2
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r3.interfacesMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaces(org.luckypray.dexkit.query.matchers.InterfacesMatcher r3) {
            r2 = this;
            java.lang.String r0 = "interfaces"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.interfacesMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        Ld:
            r3.methodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            if (r2 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        Ld:
            r3.methodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4, r5)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.methodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            if (r2 != 0) goto L12
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r2.<init>()
        L12:
            r3.methodsMatcher = r2
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r3.methodsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.count(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methods(org.luckypray.dexkit.query.matchers.MethodsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "methods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.methodsMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = modifiers$default(r2, r3, r0, r1, r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(int r4, org.luckypray.dexkit.query.enums.MatchType r5) {
            r3 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r2.<init>(r4, r5)
            r3.modifiersMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r3) {
            r2 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.modifiersMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final /* synthetic */ void setClassName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            className$default(r1, r2, r3, r4, r5, r6)
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

    public final /* synthetic */ void setSource(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            source$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setSuperClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            superClass$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setUsingStrings(java.util.Collection<java.lang.String> r8) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = source$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = source$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.sourceMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(org.luckypray.dexkit.query.matchers.base.StringMatcher r3) {
            r2 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.sourceMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = superClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = superClass$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(java.lang.String r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r3.<init>(r5, r6, r7)
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r2.className(r3)
            r4.superClassMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "superClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2.superClassMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingEqStrings(java.util.Collection<java.lang.String> r15) {
            r14 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = r14
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingEqStrings(java.lang.String... r18) {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "usingStrings"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r1
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r1
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.util.Collection<java.lang.String> r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.util.Collection<java.lang.String> r13, org.luckypray.dexkit.query.enums.StringMatchType r14, boolean r15) {
            r12 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r12
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(org.luckypray.dexkit.query.StringMatcherList r4) {
            r3 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r1 = 0
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            r3.usingStringsMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.lang.String... r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "usingStrings"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r1
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r1
            return r1
    }
}
