.class public final Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;
.super Ljava/lang/Object;
.source "OpCodesMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOpCodesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,349:1\n1547#2:350\n1618#2,3:351\n11328#3:354\n11663#3,3:355\n11328#3:358\n11663#3,3:359\n*S KotlinDebug\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion\n*L\n302#1:350\n302#1:351,3\n321#1:354\n321#1:355,3\n334#1:358\n334#1:359,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0007H\u0007J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J,\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000c2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J1\u0010\r\u001a\u00020\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\u0011J!\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010\u0012J,\u0010\r\u001a\u00020\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000c2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;",
        "",
        "()V",
        "create",
        "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
        "opCodes",
        "",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
        "opCodeSize",
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "",
        "createForOpNames",
        "opNames",
        "",
        "",
        "([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 0

    .line 246
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 248
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 246
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 249
    const/4 p3, 0x0

    .line 246
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic create$default(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;[ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 0

    .line 265
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 267
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 265
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 268
    const/4 p3, 0x0

    .line 265
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->create([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createForOpNames$default(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 0

    .line 297
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 299
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 297
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 300
    const/4 p3, 0x0

    .line 297
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->createForOpNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createForOpNames$default(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;[Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 0

    .line 316
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 318
    sget-object p2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 316
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 319
    const/4 p3, 0x0

    .line 316
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;->createForOpNames([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .param p1, "opCodes"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .param p3, "opCodeSize"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    return-object v0
.end method

.method public final varargs create([I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 7
    .param p1, "opCodes"    # [I
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([I)Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final create([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 1
    .param p1, "opCodes"    # [I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .param p3, "opCodeSize"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "opCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    return-object v0
.end method

.method public final createForOpNames(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 9
    .param p1, "opNames"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .param p3, "opCodeSize"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
            "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 350
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 351
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 352
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 302
    .local v8, "$i$a$-map-OpCodesMatcher$Companion$createForOpNames$1":I
    invoke-static {v7}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpCode(Ljava/lang/String;)I

    move-result v7

    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-map-OpCodesMatcher$Companion$createForOpNames$1":I
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 352
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 351
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 353
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 350
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 302
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    invoke-direct {v0, v2, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    return-object v0
.end method

.method public final varargs createForOpNames([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 10
    .param p1, "opNames"    # [Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    move-object v0, p1

    .local v0, "$this$map$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 358
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 359
    .local v4, "$i$f$mapTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v3, v6

    .line 360
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 334
    .local v9, "$i$a$-map-OpCodesMatcher$Companion$createForOpNames$3":I
    invoke-static {v8}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpCode(Ljava/lang/String;)I

    move-result v8

    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-map-OpCodesMatcher$Companion$createForOpNames$3":I
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 360
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 359
    nop

    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 361
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 358
    nop

    .end local v0    # "$this$map$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$map":I
    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    .line 334
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final createForOpNames([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;
    .locals 10
    .param p1, "opNames"    # [Ljava/lang/String;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .param p3, "opCodeSize"    # Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "opNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    move-object v0, p1

    .local v0, "$this$map$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 354
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 355
    .local v4, "$i$f$mapTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v3, v6

    .line 356
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 321
    .local v9, "$i$a$-map-OpCodesMatcher$Companion$createForOpNames$2":I
    invoke-static {v8}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpCode(Ljava/lang/String;)I

    move-result v8

    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-map-OpCodesMatcher$Companion$createForOpNames$2":I
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 356
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 355
    nop

    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 357
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 354
    nop

    .end local v0    # "$this$map$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 321
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;

    invoke-direct {v0, v2, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V

    return-object v0
.end method
