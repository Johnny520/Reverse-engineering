.class public final Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "AnnotationEncodeArrayMatcher.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationEncodeArrayMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,462:1\n1#2:463\n1547#3:464\n1618#3,3:465\n1547#3:468\n1618#3,3:469\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher\n*L\n452#1:464\n452#1:465,3\n454#1:468\n454#1:469,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\rJ%\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\"J%\u0010!\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020&J$\u0010\'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0008\u0008\u0002\u0010\u0012\u001a\u00020*2\u0008\u0008\u0002\u0010+\u001a\u00020$H\u0007J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020,J%\u0010\'\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020.J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000200J%\u0010/\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000202J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000205J\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u000207J%\u00106\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u0006\u00108\u001a\u00020\u0000J\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020=J$\u0010>\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020)2\u0008\u0008\u0002\u0010\u0012\u001a\u00020*2\u0008\u0008\u0002\u0010+\u001a\u00020$H\u0007J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020?J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\u0008\u0008\u0002\u0010@\u001a\u00020\u00052\u0008\u0008\u0002\u0010A\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010B\u001a\u00020CJ\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0017J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0005J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0005J\u0010\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020HH\u0014J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010I\u001a\u00020\u00002\u000c\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\r0KR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR.\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0011@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0017@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006M"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "()V",
        "value",
        "",
        "count",
        "getCount",
        "()I",
        "setCount",
        "(I)V",
        "<set-?>",
        "",
        "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "encodeValuesMatcher",
        "getEncodeValuesMatcher",
        "()Ljava/util/List;",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "matchType",
        "getMatchType",
        "()Lorg/luckypray/dexkit/query/enums/MatchType;",
        "setMatchType",
        "(Lorg/luckypray/dexkit/query/enums/MatchType;)V",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "rangeMatcher",
        "getRangeMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "add",
        "element",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "addAnnotation",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "addBool",
        "",
        "addByte",
        "",
        "addClass",
        "className",
        "",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "addDouble",
        "",
        "addEnum",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "addFloat",
        "",
        "addInt",
        "addLong",
        "",
        "addMethod",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "addNull",
        "addNumber",
        "number",
        "",
        "addShort",
        "",
        "addString",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "min",
        "max",
        "range",
        "Lkotlin/ranges/IntRange;",
        "countMax",
        "countMin",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "values",
        "elements",
        "",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;


# instance fields
.field private encodeValuesMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 46
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 36
    return-void
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 406
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 407
    nop

    .line 405
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 407
    return-object v0
.end method

.method private final addAnnotation(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 437
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 438
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addAnnotation$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 439
    nop

    .line 437
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addAnnotation$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 439
    return-object v0
.end method

.method private final addClass(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 414
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addClass$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 415
    nop

    .line 413
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addClass$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 415
    return-object v0
.end method

.method public static synthetic addClass$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 0

    .line 326
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 328
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 326
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 329
    const/4 p3, 0x0

    .line 326
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final addEnum(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 430
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addEnum$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 431
    nop

    .line 429
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addEnum$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 431
    return-object v0
.end method

.method private final addMethod(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 422
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addMethod$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 423
    nop

    .line 421
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addMethod$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 423
    return-object v0
.end method

.method public static synthetic addString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 0

    .line 295
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 297
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 295
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 298
    const/4 p3, 0x0

    .line 295
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 0

    .line 133
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 3
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 170
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$add$1":I
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    :cond_0
    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    .line 171
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    nop

    .line 169
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$add$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 172
    return-object v0
.end method

.method public final addAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 371
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addAnnotation$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addAnnotation_u24lambda_u2437_u24lambda_u2436":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 371
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addAnnotation$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addAnnotation_u24lambda_u2437_u24lambda_u2436":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addAnnotation$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 372
    nop

    .line 370
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addAnnotation$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 372
    return-object v0
.end method

.method public final addBool(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # Z

    .line 395
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 396
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addBool$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addBool_u24lambda_u2441_u24lambda_u2440":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 396
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addBool$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->boolValue(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addBool_u24lambda_u2441_u24lambda_u2440":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addBool$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 397
    nop

    .line 395
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addBool$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 397
    return-object v0
.end method

.method public final addByte(B)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # B

    .line 203
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 204
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addByte$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addByte_u24lambda_u2412_u24lambda_u2411":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 204
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addByte$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addByte_u24lambda_u2412_u24lambda_u2411":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addByte$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 205
    nop

    .line 203
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addByte$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 205
    return-object v0
.end method

.method public final addClass(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addClass$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addClass(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 8
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 331
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addClass$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    move-object v3, v2

    .local v3, "$this$addClass_u24lambda_u2431_u24lambda_u2430":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 332
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addClass$2$1":I
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v5}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    .line 463
    move-object v6, v5

    .local v6, "$this$addClass_u24lambda_u2431_u24lambda_u2430_u24lambda_u2429":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v7, 0x0

    .line 332
    .local v7, "$i$a$-classValue-AnnotationEncodeArrayMatcher$addClass$2$1$1":I
    invoke-virtual {v6, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .end local v6    # "$this$addClass_u24lambda_u2431_u24lambda_u2430_u24lambda_u2429":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v7    # "$i$a$-classValue-AnnotationEncodeArrayMatcher$addClass$2$1$1":I
    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 333
    nop

    .line 331
    .end local v3    # "$this$addClass_u24lambda_u2431_u24lambda_u2430":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addClass$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 334
    nop

    .line 330
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addClass$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 334
    return-object v0
.end method

.method public final addClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 312
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addClass$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addClass_u24lambda_u2428_u24lambda_u2427":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 312
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addClass$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addClass_u24lambda_u2428_u24lambda_u2427":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addClass$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 313
    nop

    .line 311
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addClass$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 313
    return-object v0
.end method

.method public final addDouble(D)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # D

    .line 267
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 268
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addDouble$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addDouble_u24lambda_u2422_u24lambda_u2421":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 268
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addDouble$1$1":I
    invoke-virtual {v3, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addDouble_u24lambda_u2422_u24lambda_u2421":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addDouble$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 269
    nop

    .line 267
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addDouble$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 269
    return-object v0
.end method

.method public final addEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 359
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addEnum$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addEnum_u24lambda_u2435_u24lambda_u2434":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 359
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addEnum$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addEnum_u24lambda_u2435_u24lambda_u2434":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addEnum$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 360
    nop

    .line 358
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addEnum$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 360
    return-object v0
.end method

.method public final addFloat(F)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # F

    .line 253
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 254
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addFloat$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addFloat_u24lambda_u2420_u24lambda_u2419":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 254
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addFloat$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addFloat_u24lambda_u2420_u24lambda_u2419":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addFloat$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 255
    nop

    .line 253
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addFloat$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 255
    return-object v0
.end method

.method public final addInt(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # I

    .line 227
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 228
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addInt$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addInt_u24lambda_u2416_u24lambda_u2415":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 228
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addInt$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addInt_u24lambda_u2416_u24lambda_u2415":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addInt$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 229
    nop

    .line 227
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addInt$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 229
    return-object v0
.end method

.method public final addLong(J)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # J

    .line 239
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 240
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addLong$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addLong_u24lambda_u2418_u24lambda_u2417":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 240
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addLong$1$1":I
    invoke-virtual {v3, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addLong_u24lambda_u2418_u24lambda_u2417":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addLong$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 241
    nop

    .line 239
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addLong$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 241
    return-object v0
.end method

.method public final addMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 347
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addMethod$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addMethod_u24lambda_u2433_u24lambda_u2432":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 347
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addMethod$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addMethod_u24lambda_u2433_u24lambda_u2432":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addMethod$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 348
    nop

    .line 346
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addMethod$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 348
    return-object v0
.end method

.method public final addNull()Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5

    .line 383
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 384
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addNull$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addNull_u24lambda_u2439_u24lambda_u2438":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 384
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addNull$1$1":I
    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->nullValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addNull_u24lambda_u2439_u24lambda_u2438":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addNull$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 385
    nop

    .line 383
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addNull$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 385
    return-object v0
.end method

.method public final addNumber(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 7
    .param p1, "number"    # Ljava/lang/Number;

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 183
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addNumber$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    move-object v3, v2

    .local v3, "$this$addNumber_u24lambda_u2410_u24lambda_u249":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 184
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addNumber$1$1":I
    nop

    .line 185
    instance-of v5, p1, Ljava/lang/Byte;

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 186
    :cond_0
    instance-of v5, p1, Ljava/lang/Short;

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 187
    :cond_1
    instance-of v5, p1, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 188
    :cond_2
    instance-of v5, p1, Ljava/lang/Long;

    if-eqz v5, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 189
    :cond_3
    instance-of v5, p1, Ljava/lang/Float;

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 190
    :cond_4
    instance-of v5, p1, Ljava/lang/Double;

    if-eqz v5, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 192
    :cond_5
    :goto_0
    nop

    .line 183
    .end local v3    # "$this$addNumber_u24lambda_u2410_u24lambda_u249":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addNumber$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 193
    nop

    .line 182
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addNumber$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 193
    return-object v0
.end method

.method public final addShort(S)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # S

    .line 215
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 216
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addShort$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addShort_u24lambda_u2414_u24lambda_u2413":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 216
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addShort$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addShort_u24lambda_u2414_u24lambda_u2413":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addShort$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 217
    nop

    .line 215
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addShort$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 217
    return-object v0
.end method

.method public final addString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->addString$default(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final addString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 300
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addString$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addString_u24lambda_u2426_u24lambda_u2425":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 300
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addString$2$1":I
    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addString_u24lambda_u2426_u24lambda_u2425":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addString$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 301
    nop

    .line 299
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addString$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 301
    return-object v0
.end method

.method public final addString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 280
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$addString$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 463
    move-object v3, v2

    .local v3, "$this$addString_u24lambda_u2424_u24lambda_u2423":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 280
    .local v4, "$i$a$-apply-AnnotationEncodeArrayMatcher$addString$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$addString_u24lambda_u2424_u24lambda_u2423":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationEncodeArrayMatcher$addString$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->add(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 281
    nop

    .line 279
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$addString$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 281
    return-object v0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 3
    .param p1, "count"    # I

    .line 96
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 97
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$count$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 98
    nop

    .line 96
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$count$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 98
    return-object v0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 133
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 134
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$count$4":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 135
    nop

    .line 133
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$count$4":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 135
    return-object v0
.end method

.method public final count(Lkotlin/ranges/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 3
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 121
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$count$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lkotlin/ranges/IntRange;)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 122
    nop

    .line 120
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$count$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 122
    return-object v0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 2
    .param p1, "range"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 109
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$count$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 110
    nop

    .line 108
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$count$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 110
    return-object v0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 4
    .param p1, "max"    # I

    .line 157
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 158
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$countMax$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 159
    nop

    .line 157
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$countMax$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 159
    return-object v0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 4
    .param p1, "min"    # I

    .line 145
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 146
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$countMin$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    const v3, 0x7fffffff

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 147
    nop

    .line 145
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$countMin$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 147
    return-object v0
.end method

.method public final synthetic getCount()I
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 58
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getEncodeValuesMatcher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    return-object v0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    .line 46
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 1

    .line 47
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 14
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 450
    sget-object v1, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;

    .line 451
    nop

    .line 452
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 464
    .local v4, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 465
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 466
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .local v10, "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v11, 0x0

    .line 452
    .local v11, "$i$a$-map-AnnotationEncodeArrayMatcher$innerBuild$root$1":I
    invoke-virtual {v10}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->getValue-w2LRezQ()B

    move-result v10

    .end local v10    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v11    # "$i$a$-map-AnnotationEncodeArrayMatcher$innerBuild$root$1":I
    invoke-static {v10}, Lkotlin/UByte;->box-impl(B)Lkotlin/UByte;

    move-result-object v10

    .line 466
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 465
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 467
    :cond_0
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v5, Ljava/util/List;

    .line 464
    nop

    .line 452
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lkotlin/collections/UCollectionsKt;->toUByteArray(Ljava/util/Collection;)[B

    move-result-object v0

    .line 453
    nop

    .line 452
    nop

    .line 453
    nop

    .line 463
    nop

    .local v0, "it":[B
    const/4 v4, 0x0

    .line 453
    .local v4, "$i$a$-let-AnnotationEncodeArrayMatcher$innerBuild$root$2":I
    sget-object v5, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;

    invoke-virtual {v5, p1, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;->createValuesTypeVector-VU-fvBY(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I

    move-result v0

    .line 452
    .end local v0    # "it":[B
    .end local v4    # "$i$a$-let-AnnotationEncodeArrayMatcher$innerBuild$root$2":I
    goto :goto_1

    .line 453
    :cond_1
    move v0, v3

    .line 454
    :goto_1
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    if-eqz v4, :cond_3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 468
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v6

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v4

    .restart local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 469
    .restart local v7    # "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 470
    .restart local v9    # "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .restart local v10    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v11, 0x0

    .line 454
    .local v11, "$i$a$-map-AnnotationEncodeArrayMatcher$innerBuild$root$3":I
    invoke-virtual {v10}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getValue()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    move-result-object v12

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v12, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v12

    .end local v10    # "it":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v11    # "$i$a$-map-AnnotationEncodeArrayMatcher$innerBuild$root$3":I
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 470
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 469
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_2

    .line 471
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 468
    nop

    .line 454
    .end local v4    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 455
    if-eqz v2, :cond_3

    .line 454
    nop

    .line 455
    nop

    .line 463
    nop

    .local v2, "it":[I
    const/4 v4, 0x0

    .line 455
    .local v4, "$i$a$-let-AnnotationEncodeArrayMatcher$innerBuild$root$4":I
    sget-object v5, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;

    invoke-virtual {v5, p1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;->createValuesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v2

    .line 454
    .end local v2    # "it":[I
    .end local v4    # "$i$a$-let-AnnotationEncodeArrayMatcher$innerBuild$root$4":I
    move v4, v2

    goto :goto_3

    .line 455
    :cond_3
    move v4, v3

    .line 456
    :goto_3
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v5

    .line 457
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    if-eqz v2, :cond_4

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v6, v2

    goto :goto_4

    :cond_4
    move v6, v3

    .line 450
    :goto_4
    move-object v2, p1

    move v3, v0

    invoke-virtual/range {v1 .. v6}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArrayMatcher$Companion;->createAnnotationEncodeArrayMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IIBI)I

    move-result v0

    .line 459
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 460
    return v0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 2
    .param p1, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 85
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$matchType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 86
    nop

    .line 84
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$matchType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 86
    return-object v0
.end method

.method public final synthetic setCount(I)V
    .locals 0
    .param p1, "value"    # I

    .line 61
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 62
    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public final values(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .locals 3
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    const/4 v1, 0x0

    .line 73
    .local v1, "$i$a$-also-AnnotationEncodeArrayMatcher$values$1":I
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;->encodeValuesMatcher:Ljava/util/List;

    .line 74
    nop

    .line 72
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
    .end local v1    # "$i$a$-also-AnnotationEncodeArrayMatcher$values$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 74
    return-object v0
.end method
