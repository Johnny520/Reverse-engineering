.class public final Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
.super Ljava/lang/Object;
.source "AnnotationEncodeValueMatcher.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u0017\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eJ%\u0010\r\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0008\u0012H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014J%\u0010\u0013\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0008\u0012H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cJ%\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0008\u0012H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020 J%\u0010\u001f\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0008\u0012H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020(J%\u0010\'\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0008\u0012H\u0087\u0008\u00f8\u0001\u0000J\u0006\u0010)\u001a\u00020\u0000J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020.J$\u0010/\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u0002002\u0008\u0008\u0002\u00101\u001a\u0002022\u0008\u0008\u0002\u00103\u001a\u00020\u0016H\u0007J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000204R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00066"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/base/IQuery;",
        "()V",
        "value",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "type",
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V",
        "<set-?>",
        "getType",
        "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "getValue",
        "()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "annotationValue",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "arrayValue",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;",
        "boolValue",
        "",
        "byteValue",
        "",
        "charValue",
        "",
        "classValue",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "doubleValue",
        "",
        "enumValue",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "floatValue",
        "",
        "intValue",
        "",
        "longValue",
        "",
        "methodValue",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "nullValue",
        "numberValue",
        "number",
        "",
        "shortValue",
        "",
        "stringValue",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;


# instance fields
.field private type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field private value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V
    .locals 0
    .param p1, "value"    # Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
    .param p2, "type"    # Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 55
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 56
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V

    return-void
.end method

.method private final annotationValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 336
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$annotationValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 337
    nop

    .line 335
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$annotationValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 337
    return-object v0
.end method

.method private final arrayValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 328
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$arrayValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 329
    nop

    .line 327
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$arrayValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 329
    return-object v0
.end method

.method private final classValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 304
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$classValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 305
    nop

    .line 303
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$classValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 305
    return-object v0
.end method

.method public static final create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createArray(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createArray(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createBoolean(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createBoolean(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createByte(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createByte(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createChar(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createChar(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createInt(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createInt(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createLong(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createLong(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createNull()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createNull()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createShort(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createShort(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method private final enumValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 320
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$enumValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 321
    nop

    .line 319
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$enumValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 321
    return-object v0
.end method

.method private final methodValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 312
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$methodValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 313
    nop

    .line 311
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$methodValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 313
    return-object v0
.end method

.method public static synthetic stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    .line 194
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 196
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 194
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 197
    const/4 p3, 0x0

    .line 194
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 266
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$annotationValue$1":I
    move-object v2, p1

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 267
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 268
    nop

    .line 265
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$annotationValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 268
    return-object v0
.end method

.method public final arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 253
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$arrayValue$1":I
    move-object v2, p1

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 254
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 255
    nop

    .line 252
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$arrayValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 255
    return-object v0
.end method

.method public final boolValue(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Z

    .line 292
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 293
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$boolValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;-><init>(Z)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 294
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 295
    nop

    .line 292
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$boolValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 295
    return-object v0
.end method

.method public final byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # B

    .line 85
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 86
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$byteValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;-><init>(B)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 87
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 88
    nop

    .line 85
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$byteValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 88
    return-object v0
.end method

.method public final charValue(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # C

    .line 111
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 112
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$charValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;-><init>(C)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 113
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 114
    nop

    .line 111
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$charValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 114
    return-object v0
.end method

.method public final classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 212
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$classValue$1":I
    move-object v2, p1

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 213
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 214
    nop

    .line 211
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$classValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 214
    return-object v0
.end method

.method public final doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # D

    .line 165
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 166
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$doubleValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;-><init>(D)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 167
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 168
    nop

    .line 165
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$doubleValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 168
    return-object v0
.end method

.method public final enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 240
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$enumValue$1":I
    move-object v2, p1

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 241
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 242
    nop

    .line 239
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$enumValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 242
    return-object v0
.end method

.method public final floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # F

    .line 151
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 152
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$floatValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;-><init>(F)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 153
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 154
    nop

    .line 151
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$floatValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 154
    return-object v0
.end method

.method public final getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 1

    .line 48
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object v0
.end method

.method public final getValue()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
    .locals 1

    .line 46
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    return-object v0
.end method

.method public final intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # I

    .line 124
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 125
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$intValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;-><init>(I)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 126
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 127
    nop

    .line 124
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$intValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 127
    return-object v0
.end method

.method public final longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # J

    .line 137
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 138
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$longValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;-><init>(J)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 139
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 140
    nop

    .line 137
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$longValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 140
    return-object v0
.end method

.method public final methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 227
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$methodValue$1":I
    move-object v2, p1

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 228
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 229
    nop

    .line 226
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$methodValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 229
    return-object v0
.end method

.method public final nullValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3

    .line 279
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 280
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$nullValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;-><init>()V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 281
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 282
    nop

    .line 279
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$nullValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 282
    return-object v0
.end method

.method public final numberValue(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 4
    .param p1, "number"    # Ljava/lang/Number;

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 67
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$numberValue$1":I
    nop

    .line 68
    instance-of v2, p1, Ljava/lang/Byte;

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 69
    :cond_0
    instance-of v2, p1, Ljava/lang/Short;

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 70
    :cond_1
    instance-of v2, p1, Ljava/lang/Integer;

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 71
    :cond_2
    instance-of v2, p1, Ljava/lang/Long;

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 72
    :cond_3
    instance-of v2, p1, Ljava/lang/Float;

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 73
    :cond_4
    instance-of v2, p1, Ljava/lang/Double;

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 75
    :cond_5
    :goto_0
    nop

    .line 66
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$numberValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 75
    return-object v0
.end method

.method public final shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # S

    .line 98
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 99
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$shortValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;-><init>(S)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 100
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 101
    nop

    .line 98
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$shortValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 101
    return-object v0
.end method

.method public final stringValue(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 199
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$stringValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 200
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 201
    nop

    .line 198
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$stringValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 201
    return-object v0
.end method

.method public final stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v1, 0x0

    .line 179
    .local v1, "$i$a$-also-AnnotationEncodeValueMatcher$stringValue$1":I
    move-object v2, p1

    check-cast v2, Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 180
    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 181
    nop

    .line 178
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeValueMatcher$stringValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 181
    return-object v0
.end method
