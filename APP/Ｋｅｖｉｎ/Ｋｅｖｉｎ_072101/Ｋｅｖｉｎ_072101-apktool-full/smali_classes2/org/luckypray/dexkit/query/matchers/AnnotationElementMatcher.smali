.class public final Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "AnnotationElementMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationElementMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationElementMatcher.kt\norg/luckypray/dexkit/query/matchers/AnnotationElementMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0002\u0008\u0004\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017J%\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008\u001bH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001dJ%\u0010\u001c\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008\u001bH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020!J$\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\u001fH\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\'J%\u0010\"\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008\u001bH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020+J%\u0010*\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008\u001bH\u0087\u0008\u00f8\u0001\u0000J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020-J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020/J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000204J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000206J%\u00105\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008\u001bH\u0087\u0008\u00f8\u0001\u0000J$\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\u001fH\u0007J\u0006\u00107\u001a\u00020\u0000J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000209J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020;J$\u0010<\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\u001fH\u0007J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000fJ%\u0010\u0003\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0008\u001bH\u0087\u0008\u00f8\u0001\u0000R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR$\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8G@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006?"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "value",
        "",
        "name",
        "getName",
        "()Ljava/lang/String;",
        "setName",
        "(Ljava/lang/String;)V",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "nameMatcher",
        "getNameMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "getValue",
        "()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "setValue",
        "(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)V",
        "valueMatcher",
        "getValueMatcher",
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
        "classValue",
        "className",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "doubleValue",
        "",
        "enumValue",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "floatValue",
        "",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "intValue",
        "longValue",
        "",
        "methodValue",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "nullValue",
        "numberValue",
        "",
        "shortValue",
        "",
        "stringValue",
        "matcher",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;


# instance fields
.field private nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

.field private valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method private final annotationValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 396
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 397
    .local v1, "$i$a$-also-AnnotationElementMatcher$annotationValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 398
    nop

    .line 396
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$annotationValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 398
    return-object v0
.end method

.method private final arrayValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 389
    .local v1, "$i$a$-also-AnnotationElementMatcher$arrayValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 390
    nop

    .line 388
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$arrayValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 390
    return-object v0
.end method

.method private final classValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 365
    .local v1, "$i$a$-also-AnnotationElementMatcher$classValue$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 366
    nop

    .line 364
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$classValue$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 366
    return-object v0
.end method

.method public static synthetic classValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 0

    .line 265
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 267
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 265
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 268
    const/4 p3, 0x0

    .line 265
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object v0

    return-object v0
.end method

.method private final enumValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 381
    .local v1, "$i$a$-also-AnnotationElementMatcher$enumValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 382
    nop

    .line 380
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$enumValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 382
    return-object v0
.end method

.method private final methodValue(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 373
    .local v1, "$i$a$-also-AnnotationElementMatcher$methodValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 374
    nop

    .line 372
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$methodValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 374
    return-object v0
.end method

.method public static synthetic name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 0

    .line 90
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 92
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 90
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 93
    const/4 p3, 0x0

    .line 90
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic stringValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 0

    .line 234
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 236
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 234
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 237
    const/4 p3, 0x0

    .line 234
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object p0

    return-object p0
.end method

.method private final value(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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
            "Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 357
    .local v1, "$i$a$-also-AnnotationElementMatcher$value$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 358
    nop

    .line 356
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$value$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 358
    return-object v0
.end method


# virtual methods
.method public final annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 322
    .local v1, "$i$a$-also-AnnotationElementMatcher$annotationValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$annotationValue_u24lambda_u2432_u24lambda_u2431":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 322
    .local v4, "$i$a$-apply-AnnotationElementMatcher$annotationValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$annotationValue_u24lambda_u2432_u24lambda_u2431":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$annotationValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 323
    nop

    .line 321
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$annotationValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 323
    return-object v0
.end method

.method public final arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 310
    .local v1, "$i$a$-also-AnnotationElementMatcher$arrayValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$arrayValue_u24lambda_u2430_u24lambda_u2429":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 310
    .local v4, "$i$a$-apply-AnnotationElementMatcher$arrayValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$arrayValue_u24lambda_u2430_u24lambda_u2429":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$arrayValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 311
    nop

    .line 309
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$arrayValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 311
    return-object v0
.end method

.method public final boolValue(Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Z

    .line 346
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 347
    .local v1, "$i$a$-also-AnnotationElementMatcher$boolValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$boolValue_u24lambda_u2436_u24lambda_u2435":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 347
    .local v4, "$i$a$-apply-AnnotationElementMatcher$boolValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->boolValue(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$boolValue_u24lambda_u2436_u24lambda_u2435":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$boolValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 348
    nop

    .line 346
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$boolValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 348
    return-object v0
.end method

.method public final byteValue(B)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # B

    .line 143
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 144
    .local v1, "$i$a$-also-AnnotationElementMatcher$byteValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$byteValue_u24lambda_u245_u24lambda_u244":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 144
    .local v4, "$i$a$-apply-AnnotationElementMatcher$byteValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$byteValue_u24lambda_u245_u24lambda_u244":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$byteValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 145
    nop

    .line 143
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$byteValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 145
    return-object v0
.end method

.method public final classValue(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 7

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final classValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->classValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final classValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 8
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 270
    .local v1, "$i$a$-also-AnnotationElementMatcher$classValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    move-object v3, v2

    .local v3, "$this$classValue_u24lambda_u2424_u24lambda_u2423":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 271
    .local v4, "$i$a$-apply-AnnotationElementMatcher$classValue$2$1":I
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v5}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    .line 418
    move-object v6, v5

    .local v6, "$this$classValue_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    const/4 v7, 0x0

    .line 271
    .local v7, "$i$a$-classValue-AnnotationElementMatcher$classValue$2$1$1":I
    invoke-virtual {v6, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .end local v6    # "$this$classValue_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422":Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .end local v7    # "$i$a$-classValue-AnnotationElementMatcher$classValue$2$1$1":I
    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 272
    nop

    .line 270
    .end local v3    # "$this$classValue_u24lambda_u2424_u24lambda_u2423":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$classValue$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 273
    nop

    .line 269
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$classValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 273
    return-object v0
.end method

.method public final classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 251
    .local v1, "$i$a$-also-AnnotationElementMatcher$classValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$classValue_u24lambda_u2421_u24lambda_u2420":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 251
    .local v4, "$i$a$-apply-AnnotationElementMatcher$classValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$classValue_u24lambda_u2421_u24lambda_u2420":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$classValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 252
    nop

    .line 250
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$classValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 252
    return-object v0
.end method

.method public final doubleValue(D)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # D

    .line 207
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 208
    .local v1, "$i$a$-also-AnnotationElementMatcher$doubleValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$doubleValue_u24lambda_u2415_u24lambda_u2414":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 208
    .local v4, "$i$a$-apply-AnnotationElementMatcher$doubleValue$1$1":I
    invoke-virtual {v3, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$doubleValue_u24lambda_u2415_u24lambda_u2414":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$doubleValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 209
    nop

    .line 207
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$doubleValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 209
    return-object v0
.end method

.method public final enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 298
    .local v1, "$i$a$-also-AnnotationElementMatcher$enumValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$enumValue_u24lambda_u2428_u24lambda_u2427":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 298
    .local v4, "$i$a$-apply-AnnotationElementMatcher$enumValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$enumValue_u24lambda_u2428_u24lambda_u2427":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$enumValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 299
    nop

    .line 297
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$enumValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 299
    return-object v0
.end method

.method public final floatValue(F)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # F

    .line 193
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 194
    .local v1, "$i$a$-also-AnnotationElementMatcher$floatValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$floatValue_u24lambda_u2413_u24lambda_u2412":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 194
    .local v4, "$i$a$-apply-AnnotationElementMatcher$floatValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$floatValue_u24lambda_u2413_u24lambda_u2412":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$floatValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 195
    nop

    .line 193
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$floatValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 195
    return-object v0
.end method

.method public final synthetic getName()Ljava/lang/String;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 51
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getNameMatcher()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
    .locals 1

    .line 34
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    return-object v0
.end method

.method public final synthetic getValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Property can only be written."
    .end annotation

    .line 69
    new-instance v0, Lkotlin/NotImplementedError;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final getValueMatcher()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 36
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 5
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 408
    sget-object v0, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;

    .line 409
    nop

    .line 410
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v1, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v1, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    .line 411
    :goto_0
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->getValue-w2LRezQ()B

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    .line 412
    :goto_1
    iget-object v4, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->getValue()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    move-result-object v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    check-cast v4, Lorg/luckypray/dexkit/query/base/BaseQuery;

    if-eqz v4, :cond_3

    invoke-static {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .line 408
    :cond_3
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMatcher$Companion;->createAnnotationElementMatcher-SpDDLgk(Lcom/google/flatbuffers/FlatBufferBuilder;IBI)I

    move-result v0

    .line 414
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 415
    return v0
.end method

.method public final intValue(I)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # I

    .line 167
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 168
    .local v1, "$i$a$-also-AnnotationElementMatcher$intValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$intValue_u24lambda_u249_u24lambda_u248":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 168
    .local v4, "$i$a$-apply-AnnotationElementMatcher$intValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$intValue_u24lambda_u249_u24lambda_u248":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$intValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 169
    nop

    .line 167
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$intValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 169
    return-object v0
.end method

.method public final longValue(J)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # J

    .line 179
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 180
    .local v1, "$i$a$-also-AnnotationElementMatcher$longValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$longValue_u24lambda_u2411_u24lambda_u2410":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 180
    .local v4, "$i$a$-apply-AnnotationElementMatcher$longValue$1$1":I
    invoke-virtual {v3, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$longValue_u24lambda_u2411_u24lambda_u2410":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$longValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 181
    nop

    .line 179
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$longValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 181
    return-object v0
.end method

.method public final methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 286
    .local v1, "$i$a$-also-AnnotationElementMatcher$methodValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$methodValue_u24lambda_u2426_u24lambda_u2425":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 286
    .local v4, "$i$a$-apply-AnnotationElementMatcher$methodValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$methodValue_u24lambda_u2426_u24lambda_u2425":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$methodValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 287
    nop

    .line 285
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$methodValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 287
    return-object v0
.end method

.method public final name(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final name(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 95
    .local v1, "$i$a$-also-AnnotationElementMatcher$name$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v2, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->nameMatcher:Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 96
    nop

    .line 94
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$name$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 96
    return-object v0
.end method

.method public final nullValue()Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5

    .line 334
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 335
    .local v1, "$i$a$-also-AnnotationElementMatcher$nullValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$nullValue_u24lambda_u2434_u24lambda_u2433":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 335
    .local v4, "$i$a$-apply-AnnotationElementMatcher$nullValue$1$1":I
    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->nullValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$nullValue_u24lambda_u2434_u24lambda_u2433":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$nullValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 336
    nop

    .line 334
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$nullValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 336
    return-object v0
.end method

.method public final numberValue(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 7
    .param p1, "value"    # Ljava/lang/Number;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 123
    .local v1, "$i$a$-also-AnnotationElementMatcher$numberValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    move-object v3, v2

    .local v3, "$this$numberValue_u24lambda_u243_u24lambda_u242":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 124
    .local v4, "$i$a$-apply-AnnotationElementMatcher$numberValue$1$1":I
    nop

    .line 125
    instance-of v5, p1, Ljava/lang/Byte;

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 126
    :cond_0
    instance-of v5, p1, Ljava/lang/Short;

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 127
    :cond_1
    instance-of v5, p1, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 128
    :cond_2
    instance-of v5, p1, Ljava/lang/Long;

    if-eqz v5, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 129
    :cond_3
    instance-of v5, p1, Ljava/lang/Float;

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    .line 130
    :cond_4
    instance-of v5, p1, Ljava/lang/Double;

    if-eqz v5, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 132
    :cond_5
    :goto_0
    nop

    .line 123
    .end local v3    # "$this$numberValue_u24lambda_u243_u24lambda_u242":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$numberValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 133
    nop

    .line 122
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$numberValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 133
    return-object v0
.end method

.method public final synthetic setName(Ljava/lang/String;)V
    .locals 7
    .param p1, "value"    # Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 55
    return-void
.end method

.method public final synthetic setValue(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)V
    .locals 1
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 73
    return-void
.end method

.method public final shortValue(S)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # S

    .line 155
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 156
    .local v1, "$i$a$-also-AnnotationElementMatcher$shortValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$shortValue_u24lambda_u247_u24lambda_u246":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 156
    .local v4, "$i$a$-apply-AnnotationElementMatcher$shortValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$shortValue_u24lambda_u247_u24lambda_u246":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$shortValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 157
    nop

    .line 155
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$shortValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 157
    return-object v0
.end method

.method public final stringValue(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
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

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    move-result-object v0

    return-object v0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p3, "ignoreCase"    # Z

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 239
    .local v1, "$i$a$-also-AnnotationElementMatcher$stringValue$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$stringValue_u24lambda_u2419_u24lambda_u2418":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 239
    .local v4, "$i$a$-apply-AnnotationElementMatcher$stringValue$2$1":I
    invoke-virtual {v3, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$stringValue_u24lambda_u2419_u24lambda_u2418":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$stringValue$2$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 240
    nop

    .line 238
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$stringValue$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 240
    return-object v0
.end method

.method public final stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 5
    .param p1, "value"    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 220
    .local v1, "$i$a$-also-AnnotationElementMatcher$stringValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 418
    move-object v3, v2

    .local v3, "$this$stringValue_u24lambda_u2417_u24lambda_u2416":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    const/4 v4, 0x0

    .line 220
    .local v4, "$i$a$-apply-AnnotationElementMatcher$stringValue$1$1":I
    invoke-virtual {v3, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .end local v3    # "$this$stringValue_u24lambda_u2417_u24lambda_u2416":Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .end local v4    # "$i$a$-apply-AnnotationElementMatcher$stringValue$1$1":I
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 221
    nop

    .line 219
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$stringValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 221
    return-object v0
.end method

.method public final value(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    const/4 v1, 0x0

    .line 111
    .local v1, "$i$a$-also-AnnotationElementMatcher$value$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;->valueMatcher:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 112
    nop

    .line 110
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;
    .end local v1    # "$i$a$-also-AnnotationElementMatcher$value$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 112
    return-object v0
.end method
