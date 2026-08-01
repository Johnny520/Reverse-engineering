.class public final Lorg/luckypray/dexkit/query/StringMatchersGroupList;
.super Ljava/util/ArrayList;
.source "MatcherCollections.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
        ">;",
        "Lorg/luckypray/dexkit/query/base/IQuery;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMatcherCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/StringMatchersGroupList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n1547#2:310\n1618#2,3:311\n*S KotlinDebug\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/StringMatchersGroupList\n*L\n278#1:310\n278#1:311,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0005B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u0015\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013H\u0007J-\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00a2\u0006\u0002\u0008\u0018H\u0087\u0008\u00f8\u0001\u0000J%\u0010\u000c\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0015\u00a2\u0006\u0002\u0008\u0018H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0019"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/StringMatchersGroupList;",
        "Ljava/util/ArrayList;",
        "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
        "Lkotlin/collections/ArrayList;",
        "Lorg/luckypray/dexkit/query/base/IQuery;",
        "()V",
        "initialCapacity",
        "",
        "(I)V",
        "elements",
        "",
        "(Ljava/util/Collection;)V",
        "add",
        "groupName",
        "",
        "usingStrings",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "ignoreCase",
        "",
        "init",
        "Lkotlin/Function1;",
        "Lorg/luckypray/dexkit/query/StringMatcherList;",
        "",
        "Lkotlin/ExtensionFunctionType;",
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
.method public constructor <init>()V
    .locals 0

    .line 256
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "initialCapacity"    # I

    .line 257
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private final add(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .locals 4
    .param p1, "groupName"    # Ljava/lang/String;
    .param p2, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/StringMatcherList;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/StringMatchersGroupList;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "init"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    .local v0, "it":Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    const/4 v1, 0x0

    .line 295
    .local v1, "$i$a$-also-StringMatchersGroupList$add$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    new-instance v3, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v3}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v2, p1, v3}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->add(Ljava/lang/Object;)Z

    .line 296
    nop

    .line 294
    .end local v0    # "it":Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .end local v1    # "$i$a$-also-StringMatchersGroupList$add$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    .line 296
    return-object v0
.end method

.method private final add(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .locals 3
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/query/StringMatchersGroupList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 304
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    .local v0, "it":Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    const/4 v1, 0x0

    .line 305
    .local v1, "$i$a$-also-StringMatchersGroupList$add$3":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->add(Ljava/lang/Object;)Z

    .line 306
    nop

    .line 304
    .end local v0    # "it":Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .end local v1    # "$i$a$-also-StringMatchersGroupList$add$3":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    .line 306
    return-object v0
.end method

.method public static synthetic add$default(Lorg/luckypray/dexkit/query/StringMatchersGroupList;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .locals 0

    .line 272
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 275
    sget-object p3, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 272
    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 276
    const/4 p4, 0x0

    .line 272
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->add(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final add(Ljava/lang/String;Ljava/util/Collection;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/StringMatchersGroupList;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingStrings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->add$default(Lorg/luckypray/dexkit/query/StringMatchersGroupList;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/StringMatchersGroupList;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingStrings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->add$default(Lorg/luckypray/dexkit/query/StringMatchersGroupList;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    move-result-object v0

    return-object v0
.end method

.method public final add(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .locals 16
    .param p1, "groupName"    # Ljava/lang/String;
    .param p2, "usingStrings"    # Ljava/util/Collection;
    .param p3, "matchType"    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
    .param p4, "ignoreCase"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/StringMatchersGroupList;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "groupName"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "usingStrings"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "matchType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    move-object v4, v0

    check-cast v4, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    .local v4, "it":Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    const/4 v5, 0x0

    .line 278
    .local v5, "$i$a$-also-StringMatchersGroupList$add$1":I
    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 310
    .local v7, "$i$f$map":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 311
    .local v10, "$i$f$mapTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 312
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 278
    .local v14, "$i$a$-map-StringMatchersGroupList$add$1$1":I
    new-instance v15, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    move/from16 v2, p4

    invoke-direct {v15, v13, v3, v2}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 312
    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-StringMatchersGroupList$add$1$1":I
    invoke-interface {v8, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 311
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, p2

    goto :goto_0

    .line 313
    :cond_0
    move/from16 v2, p4

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo":I
    check-cast v8, Ljava/util/List;

    .line 310
    nop

    .end local v6    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map":I
    check-cast v8, Ljava/util/Collection;

    .line 278
    new-instance v6, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-direct {v6, v1, v8}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    invoke-virtual {v0, v6}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->add(Ljava/lang/Object;)Z

    .line 279
    nop

    .line 277
    .end local v4    # "it":Lorg/luckypray/dexkit/query/StringMatchersGroupList;
    .end local v5    # "$i$a$-also-StringMatchersGroupList$add$1":I
    move-object v4, v0

    check-cast v4, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    .line 279
    return-object v4
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 255
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->contains(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Z

    move-result v0

    return v0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 255
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge getSize()I
    .locals 1

    .line 255
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 255
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->indexOf(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)I

    move-result v0

    return v0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 255
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 255
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->lastIndexOf(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)I

    move-result v0

    return v0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 255
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 1
    .param p1, "index"    # I

    .line 255
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->removeAt(I)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    move-result-object v0

    return-object v0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 255
    instance-of v0, p1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->remove(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Z

    move-result v0

    return v0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 255
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;
    .locals 1
    .param p1, "p0"    # I

    .line 255
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    return-object v0
.end method

.method public final bridge size()I
    .locals 1

    .line 255
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;->getSize()I

    move-result v0

    return v0
.end method
