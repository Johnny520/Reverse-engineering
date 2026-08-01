.class public final Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "ClassMatcher.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassMatcher.kt\norg/luckypray/dexkit/query/matchers/ClassMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,997:1\n1547#2:998\n1618#2,3:999\n1547#2:1006\n1618#2,3:1007\n1547#2:1014\n1618#2,3:1015\n11328#3:1002\n11663#3,3:1003\n11328#3:1010\n11663#3,3:1011\n1#4:1018\n*S KotlinDebug\n*F\n+ 1 ClassMatcher.kt\norg/luckypray/dexkit/query/matchers/ClassMatcher\n*L\n790#1:998\n790#1:999,3\n818#1:1006\n818#1:1007,3\n991#1:1014\n991#1:1015,3\n806#1:1002\n806#1:1003,3\n830#1:1010\n830#1:1011,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u001e\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0001vB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0003B\u0013\u0008\u0016\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020GJ%\u0010E\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0008J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020PJ%\u0010N\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J$\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u00082\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J\u0012\u0010W\u001a\u00020\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0005J$\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u00082\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J$\u0010Y\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u0000J%\u0010Y\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010[\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020]J%\u0010[\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J$\u0010^\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00082\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0014J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010_\u001a\u00020\u00002\u0008\u0008\u0002\u0010a\u001a\u00020&2\u0008\u0008\u0002\u0010b\u001a\u00020&J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010_\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010f\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\u000bJ%\u0010f\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J$\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0014J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010h\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010h\u001a\u00020\u00002\u0008\u0008\u0002\u0010a\u001a\u00020&2\u0008\u0008\u0002\u0010b\u001a\u00020&J\u000e\u0010h\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010h\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010i\u001a\u00020\u00002\u0006\u0010i\u001a\u00020\u001aJ%\u0010i\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J\u0010\u0010j\u001a\u00020&2\u0006\u0010k\u001a\u00020lH\u0014J\u000e\u0010m\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010m\u001a\u00020\u00002\u0008\u0008\u0002\u0010a\u001a\u00020&2\u0008\u0008\u0002\u0010b\u001a\u00020&J\u000e\u0010m\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010m\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010n\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u001eJ%\u0010n\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010`\u001a\u00020&J\u001a\u0010o\u001a\u00020\u00002\u0008\u0008\u0002\u0010a\u001a\u00020&2\u0008\u0008\u0002\u0010b\u001a\u00020&J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010c\u001a\u00020dJ\u000e\u0010o\u001a\u00020\u00002\u0006\u0010c\u001a\u00020eJ\u000e\u0010p\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\"J%\u0010p\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J\u001a\u0010\'\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020&2\u0008\u0008\u0002\u0010S\u001a\u00020qH\u0007J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010g\u001a\u00020,J$\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00082\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u00100\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0014J$\u00105\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000J%\u00105\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000J\u001f\u0010r\u001a\u00020\u00002\u0012\u0010<\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080s\"\u00020\u0008\u00a2\u0006\u0002\u0010tJ\u0014\u0010r\u001a\u00020\u00002\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00080;J\u001f\u0010<\u001a\u00020\u00002\u0012\u0010<\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080s\"\u00020\u0008\u00a2\u0006\u0002\u0010tJ*\u0010<\u001a\u00020\u00002\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00080;2\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020VH\u0007J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020uJ%\u0010<\u001a\u00020\u00002\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\u0008KH\u0087\u0008\u00f8\u0001\u0000R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\tR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\n\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R$\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0018\u0010\u0012\"\u0004\u0008\u0019\u0010\tR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\n\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\n\u001a\u0004\u0018\u00010\u001e@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\"\u0010#\u001a\u0004\u0018\u00010\"2\u0008\u0010\n\u001a\u0004\u0018\u00010\"@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R$\u0010\'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020&8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\"\u0010-\u001a\u0004\u0018\u00010,2\u0008\u0010\n\u001a\u0004\u0018\u00010,@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R$\u00100\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00081\u0010\u0012\"\u0004\u00082\u0010\tR\"\u00103\u001a\u0004\u0018\u00010\u00142\u0008\u0010\n\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u0017R$\u00105\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00086\u0010\u0012\"\u0004\u00087\u0010\tR\"\u00108\u001a\u0004\u0018\u00010\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0000@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R0\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00080;2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080;8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R.\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010A2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010A@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010D\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006w"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "()V",
        "clazz",
        "Ljava/lang/Class;",
        "(Ljava/lang/Class;)V",
        "descriptor",
        "",
        "(Ljava/lang/String;)V",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "annotationsMatcher",
        "getAnnotationsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "value",
        "className",
        "getClassName",
        "()Ljava/lang/String;",
        "setClassName",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "classNameMatcher",
        "getClassNameMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "getDescriptor",
        "setDescriptor",
        "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;",
        "fieldsMatcher",
        "getFieldsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;",
        "interfacesMatcher",
        "getInterfacesMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
        "methodsMatcher",
        "getMethodsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
        "",
        "modifiers",
        "getModifiers",
        "()I",
        "setModifiers",
        "(I)V",
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "modifiersMatcher",
        "getModifiersMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "source",
        "getSource",
        "setSource",
        "sourceMatcher",
        "getSourceMatcher",
        "superClass",
        "getSuperClass",
        "setSuperClass",
        "superClassMatcher",
        "getSuperClassMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "",
        "usingStrings",
        "getUsingStrings",
        "()Ljava/util/Collection;",
        "setUsingStrings",
        "(Ljava/util/Collection;)V",
        "",
        "usingStringsMatcher",
        "getUsingStringsMatcher",
        "()Ljava/util/List;",
        "addAnnotation",
        "annotationMatcher",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addEqString",
        "usingString",
        "addField",
        "fieldMatcher",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "addFieldForName",
        "fieldName",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "addFieldForType",
        "typeName",
        "addInterface",
        "interfaceMatcher",
        "addMethod",
        "methodMatcher",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "addUsingString",
        "annotationCount",
        "count",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "annotations",
        "matcher",
        "fieldCount",
        "fields",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "interfaceCount",
        "interfaces",
        "methodCount",
        "methods",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "usingEqStrings",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;


# instance fields
.field private annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

.field private classNameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

.field private interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

.field private methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

.field private sourceMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private superClassMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private usingStringsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 7
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 62
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getClassDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 63
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 66
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 67
    return-void
.end method

.method private final addAnnotation(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 920
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 921
    .local v1, "$i$a$-also-ClassMatcher$addAnnotation$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 922
    nop

    .line 920
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addAnnotation$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 922
    return-object v0
.end method

.method private final addField(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 936
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 937
    .local v1, "$i$a$-also-ClassMatcher$addField$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 938
    nop

    .line 936
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addField$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 938
    return-object v0
.end method

.method public static synthetic addFieldForName$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 567
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 569
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 567
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 570
    const/4 p3, 0x0

    .line 567
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addFieldForName(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addFieldForType$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 589
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 591
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 589
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 592
    const/4 p3, 0x0

    .line 589
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addFieldForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final addInterface(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 904
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 905
    .local v1, "$i$a$-also-ClassMatcher$addInterface$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addInterface(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 906
    nop

    .line 904
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addInterface$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 906
    return-object v0
.end method

.method public static synthetic addInterface$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 366
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 368
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 366
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 369
    const/4 p3, 0x0

    .line 366
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addInterface(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final addMethod(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 952
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 953
    .local v1, "$i$a$-also-ClassMatcher$addMethod$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 954
    nop

    .line 952
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addMethod$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 954
    return-object v0
.end method

.method public static synthetic addUsingString$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 861
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 863
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 861
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 864
    const/4 p3, 0x0

    .line 861
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 520
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final annotations(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 912
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 913
    .local v1, "$i$a$-also-ClassMatcher$annotations$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 914
    nop

    .line 912
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$annotations$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 914
    return-object v0
.end method

.method public static synthetic className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 248
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 250
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 248
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 251
    const/4 p3, 0x0

    .line 248
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;->create(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic fieldCount$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 665
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final fields(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 928
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 929
    .local v1, "$i$a$-also-ClassMatcher$fields$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fields(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 930
    nop

    .line 928
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$fields$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 930
    return-object v0
.end method

.method public static synthetic interfaceCount$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 431
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfaceCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final interfaces(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 896
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 897
    .local v1, "$i$a$-also-ClassMatcher$interfaces$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfaces(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 898
    nop

    .line 896
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$interfaces$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 898
    return-object v0
.end method

.method public static synthetic methodCount$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 753
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final methods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 944
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 945
    .local v1, "$i$a$-also-ClassMatcher$methods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 946
    nop

    .line 944
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$methods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 946
    return-object v0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 282
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 284
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 282
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic source$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 213
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 215
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 213
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 216
    const/4 p3, 0x0

    .line 213
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->source(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final superClass(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 888
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 889
    .local v1, "$i$a$-also-ClassMatcher$superClass$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 890
    nop

    .line 888
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$superClass$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 890
    return-object v0
.end method

.method public static synthetic superClass$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 316
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 318
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 316
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 319
    const/4 p3, 0x0

    .line 316
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final usingStrings(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/StringMatcherList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 960
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 961
    .local v1, "$i$a$-also-ClassMatcher$usingStrings$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 962
    nop

    .line 960
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$usingStrings$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 962
    return-object v0
.end method

.method public static synthetic usingStrings$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 0

    .line 785
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 787
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 785
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 788
    const/4 p3, 0x0

    .line 785
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "annotationMatcher"    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    const-string v0, "annotationMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 462
    .local v1, "$i$a$-also-ClassMatcher$addAnnotation$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 463
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 464
    nop

    .line 461
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addAnnotation$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 464
    return-object v0
.end method

.method public final addEqString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 6
    .param p1, "usingString"    # Ljava/lang/String;

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 877
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 878
    .local v1, "$i$a$-also-ClassMatcher$addEqString$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 879
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    sget-object v4, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 880
    nop

    .line 877
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addEqString$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 880
    return-object v0
.end method

.method public final addField(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "fieldMatcher"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    const-string v0, "fieldMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 550
    .local v1, "$i$a$-also-ClassMatcher$addField$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 551
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 552
    nop

    .line 549
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addField$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 552
    return-object v0
.end method

.method public final addFieldForName(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addFieldForName$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addFieldForName(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addFieldForName$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addFieldForName(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 4
    .param p1, "fieldName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 571
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 572
    .local v1, "$i$a$-also-ClassMatcher$addFieldForName$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 573
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 574
    nop

    .line 571
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addFieldForName$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 574
    return-object v0
.end method

.method public final addFieldForType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 4
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 607
    .local v1, "$i$a$-also-ClassMatcher$addFieldForType$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 608
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 609
    nop

    .line 606
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addFieldForType$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 609
    return-object v0
.end method

.method public final addFieldForType(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addFieldForType$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addFieldForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addFieldForType$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addFieldForType(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 4
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 593
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 594
    .local v1, "$i$a$-also-ClassMatcher$addFieldForType$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 595
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 596
    nop

    .line 593
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addFieldForType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 596
    return-object v0
.end method

.method public final addInterface(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addInterface$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addInterface(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addInterface$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addInterface(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 4
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 371
    .local v1, "$i$a$-also-ClassMatcher$addInterface$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 372
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 373
    nop

    .line 370
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addInterface$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 373
    return-object v0
.end method

.method public final addInterface(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "interfaceMatcher"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "interfaceMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 349
    .local v1, "$i$a$-also-ClassMatcher$addInterface$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 350
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->add(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 351
    nop

    .line 348
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addInterface$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 351
    return-object v0
.end method

.method public final addMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "methodMatcher"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "methodMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 694
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 695
    .local v1, "$i$a$-also-ClassMatcher$addMethod$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 696
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 697
    nop

    .line 694
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addMethod$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 697
    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addUsingString$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addUsingString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "usingString"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 865
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 866
    .local v1, "$i$a$-also-ClassMatcher$addUsingString$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addUsingString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 867
    nop

    .line 865
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addUsingString$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 867
    return-object v0
.end method

.method public final addUsingString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "usingString"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "usingString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 843
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 844
    .local v1, "$i$a$-also-ClassMatcher$addUsingString$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 845
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 846
    nop

    .line 843
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$addUsingString$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 846
    return-object v0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 474
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 475
    .local v1, "$i$a$-also-ClassMatcher$annotationCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 476
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 477
    nop

    .line 474
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$annotationCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 477
    return-object v0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 520
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 521
    .local v1, "$i$a$-also-ClassMatcher$annotationCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 522
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 523
    nop

    .line 520
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$annotationCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 523
    return-object v0
.end method

.method public final annotationCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 504
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 505
    .local v1, "$i$a$-also-ClassMatcher$annotationCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 506
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 507
    nop

    .line 504
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$annotationCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 507
    return-object v0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 490
    .local v1, "$i$a$-also-ClassMatcher$annotationCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 491
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 492
    nop

    .line 489
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$annotationCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 492
    return-object v0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "annotations"    # Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 448
    .local v1, "$i$a$-also-ClassMatcher$annotations$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 449
    nop

    .line 447
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$annotations$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 449
    return-object v0
.end method

.method public final className(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 253
    .local v1, "$i$a$-also-ClassMatcher$className$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->classNameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 254
    nop

    .line 252
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$className$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 254
    return-object v0
.end method

.method public final className(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 232
    .local v1, "$i$a$-also-ClassMatcher$className$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->classNameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 233
    nop

    .line 231
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$className$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 233
    return-object v0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 9
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 185
    .local v1, "$i$a$-also-ClassMatcher$descriptor$1":I
    new-instance v2, Lorg/luckypray/dexkit/wrap/DexClass;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/wrap/DexClass;-><init>(Ljava/lang/String;)V

    .line 186
    .local v2, "dexClass":Lorg/luckypray/dexkit/wrap/DexClass;
    invoke-virtual {v2}, Lorg/luckypray/dexkit/wrap/DexClass;->getTypeName()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 187
    nop

    .line 184
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$descriptor$1":I
    .end local v2    # "dexClass":Lorg/luckypray/dexkit/wrap/DexClass;
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 187
    return-object v0
.end method

.method public final fieldCount(I)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 619
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 620
    .local v1, "$i$a$-also-ClassMatcher$fieldCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 621
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 622
    nop

    .line 619
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$fieldCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 622
    return-object v0
.end method

.method public final fieldCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 665
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 666
    .local v1, "$i$a$-also-ClassMatcher$fieldCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 667
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 668
    nop

    .line 665
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$fieldCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 668
    return-object v0
.end method

.method public final fieldCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 649
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 650
    .local v1, "$i$a$-also-ClassMatcher$fieldCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 651
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 652
    nop

    .line 649
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$fieldCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 652
    return-object v0
.end method

.method public final fieldCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 634
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 635
    .local v1, "$i$a$-also-ClassMatcher$fieldCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 636
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 637
    nop

    .line 634
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$fieldCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 637
    return-object v0
.end method

.method public final fields(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "fields"    # Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    const-string v0, "fields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 535
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 536
    .local v1, "$i$a$-also-ClassMatcher$fields$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    .line 537
    nop

    .line 535
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$fields$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 537
    return-object v0
.end method

.method public final getAnnotationsMatcher()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 50
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object v0
.end method

.method public final synthetic getClassName()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 112
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getClassNameMatcher()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 42
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->classNameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object v0
.end method

.method public final synthetic getDescriptor()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 79
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getFieldsMatcher()Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;
    .locals 1

    .line 52
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    return-object v0
.end method

.method public final getInterfacesMatcher()Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;
    .locals 1

    .line 48
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    return-object v0
.end method

.method public final getMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 54
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object v0
.end method

.method public final synthetic getModifiers()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 137
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getModifiersMatcher()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 1

    .line 44
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    return-object v0
.end method

.method public final synthetic getSource()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 95
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getSourceMatcher()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 40
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->sourceMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object v0
.end method

.method public final synthetic getSuperClass()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 154
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getSuperClassMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1

    .line 46
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClassMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object v0
.end method

.method public final synthetic getUsingStrings()Ljava/util/Collection;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 169
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getUsingStringsMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 22
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    const-string v1, "fbb"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 981
    sget-object v1, Lorg/luckypray/dexkit/schema/-ClassMatcher;->Companion:Lorg/luckypray/dexkit/schema/-ClassMatcher$Companion;

    .line 982
    nop

    .line 983
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->sourceMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-eqz v2, :cond_0

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v4, v2

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 984
    :goto_0
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->classNameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    if-eqz v2, :cond_1

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v5, v2

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 985
    :goto_1
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    if-eqz v2, :cond_2

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v6, v2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 986
    :goto_2
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClassMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    if-eqz v2, :cond_3

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v7, v2

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    .line 987
    :goto_3
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    if-eqz v2, :cond_4

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v8, v2

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    .line 988
    :goto_4
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-eqz v2, :cond_5

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v9, v2

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    .line 989
    :goto_5
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->fieldsMatcher:Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;

    if-eqz v2, :cond_6

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v10, v2

    goto :goto_6

    :cond_6
    const/4 v10, 0x0

    .line 990
    :goto_6
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-eqz v2, :cond_7

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v11, v2

    goto :goto_7

    :cond_7
    const/4 v11, 0x0

    .line 991
    :goto_7
    iget-object v2, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    if-eqz v2, :cond_9

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 1014
    .local v13, "$i$f$map":I
    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v2, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v14, Ljava/util/Collection;

    .local v14, "destination$iv$iv":Ljava/util/Collection;
    move-object v15, v2

    .local v15, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 1015
    .local v16, "$i$f$mapTo":I
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_8
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 1016
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .local v19, "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    const/16 v20, 0x0

    .line 991
    .local v20, "$i$a$-map-ClassMatcher$innerBuild$root$1":I
    move-object/from16 v3, v19

    check-cast v3, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v3, v12}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v3

    .end local v19    # "it":Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .end local v20    # "$i$a$-map-ClassMatcher$innerBuild$root$1":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 1016
    invoke-interface {v14, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1015
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_8

    .line 1017
    :cond_8
    nop

    .end local v14    # "destination$iv$iv":Ljava/util/Collection;
    .end local v15    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$mapTo":I
    move-object v3, v14

    check-cast v3, Ljava/util/List;

    .line 1014
    nop

    .line 991
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 992
    if-eqz v2, :cond_9

    .line 991
    nop

    .line 992
    nop

    .line 1018
    nop

    .local v2, "it":[I
    const/4 v3, 0x0

    .line 992
    .local v3, "$i$a$-let-ClassMatcher$innerBuild$root$2":I
    invoke-virtual {v12, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 991
    .end local v2    # "it":[I
    .end local v3    # "$i$a$-let-ClassMatcher$innerBuild$root$2":I
    move/from16 v21, v2

    goto :goto_9

    .line 992
    :cond_9
    const/16 v21, 0x0

    .line 981
    :goto_9
    move-object/from16 v2, p1

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move/from16 v11, v21

    invoke-virtual/range {v1 .. v11}, Lorg/luckypray/dexkit/schema/-ClassMatcher$Companion;->createClassMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIIIII)I

    move-result v1

    .line 994
    .local v1, "root":I
    invoke-virtual {v12, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 995
    return v1
.end method

.method public final interfaceCount(I)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 385
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 386
    .local v1, "$i$a$-also-ClassMatcher$interfaceCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 387
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 388
    nop

    .line 385
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$interfaceCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 388
    return-object v0
.end method

.method public final interfaceCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 431
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 432
    .local v1, "$i$a$-also-ClassMatcher$interfaceCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 433
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 434
    nop

    .line 431
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$interfaceCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 434
    return-object v0
.end method

.method public final interfaceCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 416
    .local v1, "$i$a$-also-ClassMatcher$interfaceCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 417
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 418
    nop

    .line 415
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$interfaceCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 418
    return-object v0
.end method

.method public final interfaceCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 401
    .local v1, "$i$a$-also-ClassMatcher$interfaceCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 402
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 403
    nop

    .line 400
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$interfaceCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 403
    return-object v0
.end method

.method public final interfaces(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "interfaces"    # Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    const-string v0, "interfaces"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 335
    .local v1, "$i$a$-also-ClassMatcher$interfaces$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->interfacesMatcher:Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;

    .line 336
    nop

    .line 334
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$interfaces$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 336
    return-object v0
.end method

.method public final methodCount(I)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 707
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 708
    .local v1, "$i$a$-also-ClassMatcher$methodCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 709
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 710
    nop

    .line 707
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$methodCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 710
    return-object v0
.end method

.method public final methodCount(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 753
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 754
    .local v1, "$i$a$-also-ClassMatcher$methodCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 755
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 756
    nop

    .line 753
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$methodCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 756
    return-object v0
.end method

.method public final methodCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 738
    .local v1, "$i$a$-also-ClassMatcher$methodCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 739
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 740
    nop

    .line 737
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$methodCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 740
    return-object v0
.end method

.method public final methodCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 722
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 723
    .local v1, "$i$a$-also-ClassMatcher$methodCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 724
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 725
    nop

    .line 722
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$methodCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 725
    return-object v0
.end method

.method public final methods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "methods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    const-string v0, "methods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 681
    .local v1, "$i$a$-also-ClassMatcher$methods$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 682
    nop

    .line 680
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$methods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 682
    return-object v0
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "modifiers"    # I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 286
    .local v1, "$i$a$-also-ClassMatcher$modifiers$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 287
    nop

    .line 285
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$modifiers$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 287
    return-object v0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 267
    .local v1, "$i$a$-also-ClassMatcher$modifiers$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 268
    nop

    .line 266
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$modifiers$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 268
    return-object v0
.end method

.method public final synthetic setClassName(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 116
    return-void
.end method

.method public final synthetic setDescriptor(Ljava/lang/String;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 83
    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 2
    .param p1, "value"    # I

    .line 140
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 141
    return-void
.end method

.method public final synthetic setSource(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->source$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 99
    return-void
.end method

.method public final setSuperClass(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClass$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 157
    return-void
.end method

.method public final setUsingStrings(Ljava/util/Collection;)V
    .locals 7
    .param p1, "value"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 172
    return-void
.end method

.method public final source(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->source$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final source(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->source$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final source(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "source"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 218
    .local v1, "$i$a$-also-ClassMatcher$source$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->sourceMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 219
    nop

    .line 217
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$source$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 219
    return-object v0
.end method

.method public final source(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 197
    .local v1, "$i$a$-also-ClassMatcher$source$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->sourceMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 198
    nop

    .line 196
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$source$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 198
    return-object v0
.end method

.method public final superClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClass$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final superClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClass$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final superClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 4
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 321
    .local v1, "$i$a$-also-ClassMatcher$superClass$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClassMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 322
    nop

    .line 320
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$superClass$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 322
    return-object v0
.end method

.method public final superClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2
    .param p1, "superClass"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "superClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 300
    .local v1, "$i$a$-also-ClassMatcher$superClass$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->superClassMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 301
    nop

    .line 299
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$superClass$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 301
    return-object v0
.end method

.method public final usingEqStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 14
    .param p1, "usingStrings"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 817
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 818
    .local v1, "$i$a$-also-ClassMatcher$usingEqStrings$1":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1006
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 1007
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 1008
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 818
    .local v10, "$i$a$-map-ClassMatcher$usingEqStrings$1$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    sget-object v12, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    const/4 v13, 0x0

    invoke-direct {v11, v9, v12, v13}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 1008
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-ClassMatcher$usingEqStrings$1$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1007
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1009
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 1006
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 818
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 819
    nop

    .line 817
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$usingEqStrings$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 819
    return-object v0
.end method

.method public final varargs usingEqStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 17
    .param p1, "usingStrings"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "usingStrings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 829
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v3, 0x0

    .line 830
    .local v3, "$i$a$-also-ClassMatcher$usingEqStrings$2":I
    move-object/from16 v4, p1

    .local v4, "$this$map$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1010
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1011
    .local v8, "$i$f$mapTo":I
    array-length v9, v7

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    if-ge v11, v9, :cond_0

    aget-object v12, v7, v11

    .line 1012
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 830
    .local v14, "$i$a$-map-ClassMatcher$usingEqStrings$2$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .local v16, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    sget-object v1, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    invoke-direct {v15, v13, v1, v10}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 1012
    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-ClassMatcher$usingEqStrings$2$1":I
    invoke-interface {v6, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1011
    nop

    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v16

    goto :goto_0

    .line 1013
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .restart local v1    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    :cond_0
    move-object/from16 v16, v1

    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$mapTo":I
    .restart local v16    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 1010
    nop

    .end local v4    # "$this$map$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$map":I
    check-cast v1, Ljava/util/Collection;

    .line 830
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 831
    nop

    .line 829
    .end local v3    # "$i$a$-also-ClassMatcher$usingEqStrings$2":I
    .end local v16    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 831
    return-object v1
.end method

.method public final usingStrings(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStrings$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final usingStrings(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 12
    .param p1, "usingStrings"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;"
        }
    .end annotation

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 789
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 790
    .local v1, "$i$a$-also-ClassMatcher$usingStrings$2":I
    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 998
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 999
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 1000
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 790
    .local v10, "$i$a$-map-ClassMatcher$usingStrings$2$1":I
    new-instance v11, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v11, v9, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 1000
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-map-ClassMatcher$usingStrings$2$1":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 999
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1001
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 998
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 790
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 791
    nop

    .line 789
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$usingStrings$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 791
    return-object v0
.end method

.method public final usingStrings(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 3
    .param p1, "usingStrings"    # Lorg/luckypray/dexkit/query/StringMatcherList;

    const-string v0, "usingStrings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 768
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v1, 0x0

    .line 769
    .local v1, "$i$a$-also-ClassMatcher$usingStrings$1":I
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 770
    nop

    .line 768
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v1    # "$i$a$-also-ClassMatcher$usingStrings$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 770
    return-object v0
.end method

.method public final varargs usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 21
    .param p1, "usingStrings"    # [Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "usingStrings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 805
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .local v1, "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v3, 0x0

    .line 806
    .local v3, "$i$a$-also-ClassMatcher$usingStrings$3":I
    move-object/from16 v4, p1

    .local v4, "$this$map$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1002
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1003
    .local v8, "$i$f$mapTo":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_0

    aget-object v17, v7, v10

    .line 1004
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v12, v17

    .local v12, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 806
    .local v18, "$i$a$-map-ClassMatcher$usingStrings$3$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const/16 v16, 0x6

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v15

    move-object/from16 v20, v15

    move/from16 v15, v16

    move-object/from16 v16, v19

    invoke-direct/range {v11 .. v16}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1004
    .end local v12    # "it":Ljava/lang/String;
    .end local v18    # "$i$a$-map-ClassMatcher$usingStrings$3$1":I
    move-object/from16 v11, v20

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1003
    nop

    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 1005
    :cond_0
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 1002
    nop

    .end local v4    # "$this$map$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    .line 806
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->usingStringsMatcher:Ljava/util/List;

    .line 807
    nop

    .line 805
    .end local v1    # "it":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v3    # "$i$a$-also-ClassMatcher$usingStrings$3":I
    move-object v1, v0

    check-cast v1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 807
    return-object v1
.end method
