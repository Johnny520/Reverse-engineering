.class public final Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "FieldMatcher.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u000208J%\u00106\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0008J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@J%\u0010=\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0008J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020@J%\u0010A\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u001eJ\u001a\u0010C\u001a\u00020\u00002\u0008\u0008\u0002\u0010E\u001a\u00020\u001e2\u0008\u0008\u0002\u0010F\u001a\u00020\u001eJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010G\u001a\u00020HJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010G\u001a\u00020IJ\u000e\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u000bJ%\u0010J\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000J\u0012\u0010\u0014\u001a\u00020\u00002\n\u0010K\u001a\u0006\u0012\u0002\u0008\u00030LJ$\u0010\u0014\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00082\u0008\u0008\u0002\u0010N\u001a\u00020O2\u0008\u0008\u0002\u0010P\u001a\u00020QH\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fJ%\u0010\u0014\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u0010\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020TH\u0014J\u001a\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0002\u0010N\u001a\u00020UH\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020$J$\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00082\u0008\u0008\u0002\u0010N\u001a\u00020O2\u0008\u0008\u0002\u0010P\u001a\u00020QH\u0007J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020+J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u001aJ%\u0010V\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000J\u0012\u00101\u001a\u00020\u00002\n\u0010K\u001a\u0006\u0012\u0002\u0008\u00030LJ$\u00101\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u00082\u0008\u0008\u0002\u0010N\u001a\u00020O2\u0008\u0008\u0002\u0010P\u001a\u00020QH\u0007J\u000e\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u000fJ%\u00101\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010X\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u001aJ%\u0010X\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020;0:\u00a2\u0006\u0002\u0008<H\u0087\u0008\u00f8\u0001\u0000R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\tR$\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0018\u0010\u0016\"\u0004\u0008\u0019\u0010\tR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\n\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\"\u0010%\u001a\u0004\u0018\u00010$2\u0008\u0010\n\u001a\u0004\u0018\u00010$@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R$\u0010(\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008)\u0010\u0016\"\u0004\u0008*\u0010\tR\"\u0010,\u001a\u0004\u0018\u00010+2\u0008\u0010\n\u001a\u0004\u0018\u00010+@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\"\u0010/\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\n\u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u001dR$\u00101\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00088G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00082\u0010\u0016\"\u0004\u00083\u0010\tR\"\u00104\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010\u0012\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006Z"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "()V",
        "field",
        "Ljava/lang/reflect/Field;",
        "(Ljava/lang/reflect/Field;)V",
        "descriptor",
        "",
        "(Ljava/lang/String;)V",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "annotationsMatcher",
        "getAnnotationsMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "classMatcher",
        "getClassMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "value",
        "declaredClass",
        "getDeclaredClass",
        "()Ljava/lang/String;",
        "setDeclaredClass",
        "getDescriptor",
        "setDescriptor",
        "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;",
        "getMethodsMatcher",
        "getGetMethodsMatcher",
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
        "name",
        "getName",
        "setName",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "nameMatcher",
        "getNameMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "putMethodsMatcher",
        "getPutMethodsMatcher",
        "type",
        "getType",
        "setType",
        "typeMatcher",
        "getTypeMatcher",
        "addAnnotation",
        "annotation",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addReadMethod",
        "methodDescriptor",
        "readMethod",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "addWriteMethod",
        "writeMethod",
        "annotationCount",
        "count",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "annotations",
        "clazz",
        "Ljava/lang/Class;",
        "className",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "readMethods",
        "typeName",
        "writeMethods",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;


# instance fields
.field private annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

.field private classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

.field private nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

.field private typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 62
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 63
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/reflect/Field;

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 58
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getFieldDescriptor(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 59
    return-void
.end method

.method private final addAnnotation(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 534
    .local v1, "$i$a$-also-FieldMatcher$addAnnotation$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 535
    nop

    .line 533
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addAnnotation$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 535
    return-object v0
.end method

.method private final addReadMethod(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 550
    .local v1, "$i$a$-also-FieldMatcher$addReadMethod$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 551
    nop

    .line 549
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addReadMethod$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 551
    return-object v0
.end method

.method private final addWriteMethod(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 566
    .local v1, "$i$a$-also-FieldMatcher$addWriteMethod$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 567
    nop

    .line 565
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addWriteMethod$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 567
    return-object v0
.end method

.method public static synthetic annotationCount$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 410
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationCount(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final annotations(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 525
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 526
    .local v1, "$i$a$-also-FieldMatcher$annotations$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 527
    nop

    .line 525
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$annotations$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 527
    return-object v0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;->create(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method private final declaredClass(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 510
    .local v1, "$i$a$-also-FieldMatcher$declaredClass$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 511
    nop

    .line 509
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$declaredClass$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 511
    return-object v0
.end method

.method public static synthetic declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 272
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 274
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 272
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 275
    const/4 p3, 0x0

    .line 272
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic modifiers$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 224
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 226
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 224
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 190
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 192
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 190
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 193
    const/4 p3, 0x0

    .line 190
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final readMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 541
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 542
    .local v1, "$i$a$-also-FieldMatcher$readMethods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 543
    nop

    .line 541
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$readMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 543
    return-object v0
.end method

.method private final type(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 517
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 518
    .local v1, "$i$a$-also-FieldMatcher$type$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 519
    nop

    .line 517
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$type$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 519
    return-object v0
.end method

.method public static synthetic type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 0

    .line 319
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 321
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 319
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 322
    const/4 p3, 0x0

    .line 319
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final writeMethods(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 558
    .local v1, "$i$a$-also-FieldMatcher$writeMethods$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 559
    nop

    .line 557
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$writeMethods$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 559
    return-object v0
.end method


# virtual methods
.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "annotation"    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 352
    .local v1, "$i$a$-also-FieldMatcher$addAnnotation$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 353
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 354
    nop

    .line 351
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addAnnotation$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 354
    return-object v0
.end method

.method public final addReadMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 4
    .param p1, "methodDescriptor"    # Ljava/lang/String;

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 455
    .local v1, "$i$a$-also-FieldMatcher$addReadMethod$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 456
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 457
    nop

    .line 454
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addReadMethod$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 457
    return-object v0
.end method

.method public final addReadMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "readMethod"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "readMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 440
    .local v1, "$i$a$-also-FieldMatcher$addReadMethod$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 441
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 442
    nop

    .line 439
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addReadMethod$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 442
    return-object v0
.end method

.method public final addWriteMethod(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 4
    .param p1, "methodDescriptor"    # Ljava/lang/String;

    const-string v0, "methodDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 499
    .local v1, "$i$a$-also-FieldMatcher$addWriteMethod$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 500
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v3, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 501
    nop

    .line 498
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addWriteMethod$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 501
    return-object v0
.end method

.method public final addWriteMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "writeMethod"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "writeMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 484
    .local v1, "$i$a$-also-FieldMatcher$addWriteMethod$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 485
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 486
    nop

    .line 483
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$addWriteMethod$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 486
    return-object v0
.end method

.method public final annotationCount(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 364
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 365
    .local v1, "$i$a$-also-FieldMatcher$annotationCount$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 366
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 367
    nop

    .line 364
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$annotationCount$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 367
    return-object v0
.end method

.method public final annotationCount(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 410
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 411
    .local v1, "$i$a$-also-FieldMatcher$annotationCount$4":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 412
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 413
    nop

    .line 410
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$annotationCount$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 413
    return-object v0
.end method

.method public final annotationCount(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 395
    .local v1, "$i$a$-also-FieldMatcher$annotationCount$3":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 396
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 397
    nop

    .line 394
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$annotationCount$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 397
    return-object v0
.end method

.method public final annotationCount(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 380
    .local v1, "$i$a$-also-FieldMatcher$annotationCount$2":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-nez v2, :cond_0

    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;-><init>()V

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 381
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 382
    nop

    .line 379
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$annotationCount$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 382
    return-object v0
.end method

.method public final annotations(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .param p1, "annotations"    # Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 338
    .local v1, "$i$a$-also-FieldMatcher$annotations$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 339
    nop

    .line 337
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$annotations$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 339
    return-object v0
.end method

.method public final declaredClass(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 8
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 256
    .local v1, "$i$a$-also-FieldMatcher$declaredClass$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 257
    nop

    .line 255
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$declaredClass$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 257
    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final declaredClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 277
    .local v1, "$i$a$-also-FieldMatcher$declaredClass$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 278
    nop

    .line 276
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$declaredClass$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 278
    return-object v0
.end method

.method public final declaredClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .param p1, "declaredClass"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "declaredClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 242
    .local v1, "$i$a$-also-FieldMatcher$declaredClass$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 243
    nop

    .line 241
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$declaredClass$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 243
    return-object v0
.end method

.method public final descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 9
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    move-object v6, p0

    check-cast v6, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v6, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v7, 0x0

    .line 157
    .local v7, "$i$a$-also-FieldMatcher$descriptor$1":I
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 158
    .local v8, "dexField":Lorg/luckypray/dexkit/wrap/DexField;
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 159
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 160
    invoke-virtual {v8}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 161
    nop

    .line 156
    .end local v6    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v7    # "$i$a$-also-FieldMatcher$descriptor$1":I
    .end local v8    # "dexField":Lorg/luckypray/dexkit/wrap/DexField;
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 161
    return-object v0
.end method

.method public final getAnnotationsMatcher()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 48
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object v0
.end method

.method public final getClassMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1

    .line 44
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object v0
.end method

.method public final synthetic getDeclaredClass()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 124
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final synthetic getDescriptor()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 75
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getGetMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 50
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object v0
.end method

.method public final synthetic getModifiers()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 108
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getModifiersMatcher()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
    .locals 1

    .line 42
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    return-object v0
.end method

.method public final synthetic getName()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 89
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getNameMatcher()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 40
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object v0
.end method

.method public final getPutMethodsMatcher()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 52
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object v0
.end method

.method public final synthetic getType()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 140
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getTypeMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1

    .line 46
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 10
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 586
    sget-object v1, Lorg/luckypray/dexkit/schema/-FieldMatcher;->Companion:Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;

    .line 587
    nop

    .line 588
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, v2

    .line 589
    :goto_0
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    if-eqz v0, :cond_1

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v2

    .line 590
    :goto_1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->classMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    if-eqz v0, :cond_2

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, v2

    .line 591
    :goto_2
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    if-eqz v0, :cond_3

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    move v6, v0

    goto :goto_3

    :cond_3
    move v6, v2

    .line 592
    :goto_3
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->annotationsMatcher:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    if-eqz v0, :cond_4

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    move v7, v0

    goto :goto_4

    :cond_4
    move v7, v2

    .line 593
    :goto_4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-eqz v0, :cond_5

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    move v8, v0

    goto :goto_5

    :cond_5
    move v8, v2

    .line 594
    :goto_5
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    if-eqz v0, :cond_6

    check-cast v0, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    move v9, v0

    goto :goto_6

    :cond_6
    move v9, v2

    .line 586
    :goto_6
    move-object v2, p1

    invoke-virtual/range {v1 .. v9}, Lorg/luckypray/dexkit/schema/-FieldMatcher$Companion;->createFieldMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IIIIIII)I

    move-result v0

    .line 596
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 597
    return v0
.end method

.method public final modifiers(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final modifiers(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "modifiers"    # I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 228
    .local v1, "$i$a$-also-FieldMatcher$modifiers$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 229
    nop

    .line 227
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$modifiers$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 229
    return-object v0
.end method

.method public final modifiers(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .param p1, "modifiers"    # Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    const-string v0, "modifiers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 209
    .local v1, "$i$a$-also-FieldMatcher$modifiers$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiersMatcher:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;

    .line 210
    nop

    .line 208
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$modifiers$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 210
    return-object v0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 195
    .local v1, "$i$a$-also-FieldMatcher$name$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 196
    nop

    .line 194
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$name$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 196
    return-object v0
.end method

.method public final name(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .param p1, "name"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 174
    .local v1, "$i$a$-also-FieldMatcher$name$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 175
    nop

    .line 173
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$name$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 175
    return-object v0
.end method

.method public final readMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .param p1, "readMethods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    const-string v0, "readMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 426
    .local v1, "$i$a$-also-FieldMatcher$readMethods$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->getMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 427
    nop

    .line 425
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$readMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 427
    return-object v0
.end method

.method public final synthetic setDeclaredClass(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 128
    return-void
.end method

.method public final synthetic setDescriptor(Ljava/lang/String;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->descriptor(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 79
    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 2
    .param p1, "value"    # I

    .line 111
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->modifiers$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;ILorg/luckypray/dexkit/query/enums/MatchType;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 112
    return-void
.end method

.method public final synthetic setName(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 93
    return-void
.end method

.method public final synthetic setType(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 144
    return-void
.end method

.method public final type(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 8
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 303
    .local v1, "$i$a$-also-FieldMatcher$type$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 304
    nop

    .line 302
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$type$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 304
    return-object v0
.end method

.method public final type(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 7

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final type(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 3
    .param p1, "typeName"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "typeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 324
    .local v1, "$i$a$-also-FieldMatcher$type$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 325
    nop

    .line 323
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$type$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 325
    return-object v0
.end method

.method public final type(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .param p1, "type"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 291
    .local v1, "$i$a$-also-FieldMatcher$type$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->typeMatcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 292
    nop

    .line 290
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$type$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 292
    return-object v0
.end method

.method public final writeMethods(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 2
    .param p1, "writeMethods"    # Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    const-string v0, "writeMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    const/4 v1, 0x0

    .line 470
    .local v1, "$i$a$-also-FieldMatcher$writeMethods$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->putMethodsMatcher:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 471
    nop

    .line 469
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .end local v1    # "$i$a$-also-FieldMatcher$writeMethods$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 471
    return-object v0
.end method
