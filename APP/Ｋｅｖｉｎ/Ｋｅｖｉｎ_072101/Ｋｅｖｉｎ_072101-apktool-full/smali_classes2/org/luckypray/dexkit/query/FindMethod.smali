.class public final Lorg/luckypray/dexkit/query/FindMethod;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "FindMethod.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/FindMethod$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFindMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindMethod.kt\norg/luckypray/dexkit/query/FindMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1547#2:227\n1618#2,3:228\n1547#2:232\n1618#2,3:233\n1547#2:236\n1618#2,3:237\n1547#2:240\n1618#2,3:241\n1#3:231\n*S KotlinDebug\n*F\n+ 1 FindMethod.kt\norg/luckypray/dexkit/query/FindMethod\n*L\n210#1:227\n210#1:228,3\n212#1:232\n212#1:233,3\n215#1:236\n215#1:237,3\n217#1:240\n217#1:241,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050#\"\u00020\u0005\u00a2\u0006\u0002\u0010$J\u0014\u0010\u0006\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J%\u0010\u0015\u001a\u00020\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020+0*\u00a2\u0006\u0002\u0008,H\u0087\u0008\u00f8\u0001\u0000J\u0014\u0010-\u001a\u00020\u00002\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0004J\u0014\u0010/\u001a\u00020\u00002\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0004J\u001f\u0010 \u001a\u00020\u00002\u0012\u0010 \u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050#\"\u00020\u0005\u00a2\u0006\u0002\u0010$J\u0014\u0010 \u001a\u00020\u00002\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR$\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\"\u0004\u0008\u0013\u0010\u0010R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R4\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u0008\"\u0004\u0008\u001b\u0010\nR4\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u0008\"\u0004\u0008\u001f\u0010\nR4\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u0008\"\u0004\u0008\"\u0010\n\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00062"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/FindMethod;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "<set-?>",
        "",
        "",
        "excludePackages",
        "getExcludePackages",
        "()Ljava/util/Collection;",
        "setExcludePackages",
        "(Ljava/util/Collection;)V",
        "",
        "findFirst",
        "getFindFirst",
        "()Z",
        "setFindFirst",
        "(Z)V",
        "ignorePackagesCase",
        "getIgnorePackagesCase",
        "setIgnorePackagesCase",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "matcher",
        "getMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "searchClasses",
        "getSearchClasses",
        "setSearchClasses",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "searchMethods",
        "getSearchMethods",
        "setSearchMethods",
        "searchPackages",
        "getSearchPackages",
        "setSearchPackages",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "searchInClass",
        "classes",
        "searchInMethod",
        "methods",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;


# instance fields
.field private excludePackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private findFirst:Z

.field private ignorePackagesCase:Z

.field private matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation
.end field

.field private searchMethods:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation
.end field

.field private searchPackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/FindMethod;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindMethod$Companion;->create()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    return-object v0
.end method

.method private final matcher(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/FindMethod;
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
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 197
    .local v1, "$i$a$-also-FindMethod$matcher$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 198
    nop

    .line 196
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$matcher$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 198
    return-object v0
.end method


# virtual methods
.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2
    .param p1, "excludePackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 137
    .local v1, "$i$a$-also-FindMethod$excludePackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    .line 138
    nop

    .line 136
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$excludePackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 138
    return-object v0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 3
    .param p1, "excludePackages"    # [Ljava/lang/String;

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 123
    .local v1, "$i$a$-also-FindMethod$excludePackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    .line 124
    nop

    .line 122
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$excludePackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 124
    return-object v0
.end method

.method public final getExcludePackages()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final getFindFirst()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindMethod;->findFirst:Z

    return v0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    return v0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 1

    .line 81
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindMethod;->matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    return-object v0
.end method

.method public final getSearchClasses()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    return-object v0
.end method

.method public final getSearchMethods()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    return-object v0
.end method

.method public final getSearchPackages()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2
    .param p1, "ignorePackagesCase"    # Z

    .line 148
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 149
    .local v1, "$i$a$-also-FindMethod$ignorePackagesCase$1":I
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    .line 150
    nop

    .line 148
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$ignorePackagesCase$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 150
    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 17
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    const-string v1, "fbb"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    sget-object v1, Lorg/luckypray/dexkit/schema/-FindMethod;->Companion:Lorg/luckypray/dexkit/schema/-FindMethod$Companion;

    .line 209
    nop

    .line 210
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 227
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v2

    .local v7, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 228
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 229
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 210
    .local v13, "$i$a$-map-FindMethod$innerBuild$root$1":I
    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;

    invoke-virtual {v10, v14}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v12

    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-map-FindMethod$innerBuild$root$1":I
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 229
    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 228
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 230
    :cond_0
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 227
    nop

    .line 210
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 211
    if-eqz v2, :cond_1

    .line 210
    nop

    .line 211
    nop

    .line 231
    nop

    .local v2, "it":[I
    const/4 v5, 0x0

    .line 211
    .local v5, "$i$a$-let-FindMethod$innerBuild$root$2":I
    invoke-virtual {v10, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 210
    .end local v2    # "it":[I
    .end local v5    # "$i$a$-let-FindMethod$innerBuild$root$2":I
    move v5, v2

    goto :goto_1

    .line 211
    :cond_1
    move v5, v4

    .line 212
    :goto_1
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    if-eqz v2, :cond_3

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 232
    .local v6, "$i$f$map":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v2

    .local v8, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 233
    .local v9, "$i$f$mapTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 234
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 212
    .local v14, "$i$a$-map-FindMethod$innerBuild$root$3":I
    move-object v15, v13

    check-cast v15, Ljava/lang/CharSequence;

    invoke-virtual {v10, v15}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v13

    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-FindMethod$innerBuild$root$3":I
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 234
    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 233
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_2

    .line 235
    :cond_2
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo":I
    check-cast v7, Ljava/util/List;

    .line 232
    nop

    .line 212
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map":I
    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 213
    if-eqz v2, :cond_3

    .line 212
    nop

    .line 213
    nop

    .line 231
    nop

    .local v2, "it":[I
    const/4 v6, 0x0

    .line 213
    .local v6, "$i$a$-let-FindMethod$innerBuild$root$4":I
    invoke-virtual {v10, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 212
    .end local v2    # "it":[I
    .end local v6    # "$i$a$-let-FindMethod$innerBuild$root$4":I
    move v6, v2

    goto :goto_3

    .line 213
    :cond_3
    move v6, v4

    .line 214
    :goto_3
    iget-boolean v7, v0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    .line 215
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 236
    .local v8, "$i$f$map":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v2

    .local v11, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 237
    .local v12, "$i$f$mapTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 238
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lorg/luckypray/dexkit/result/ClassData;

    .local v15, "it":Lorg/luckypray/dexkit/result/ClassData;
    const/16 v16, 0x0

    .line 215
    .local v16, "$i$a$-map-FindMethod$innerBuild$root$5":I
    invoke-virtual {v15}, Lorg/luckypray/dexkit/result/ClassData;->getEncodeId()J

    move-result-wide v15

    .end local v15    # "it":Lorg/luckypray/dexkit/result/ClassData;
    .end local v16    # "$i$a$-map-FindMethod$innerBuild$root$5":I
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    .line 238
    invoke-interface {v9, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 237
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_4

    .line 239
    :cond_4
    nop

    .end local v9    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo":I
    check-cast v9, Ljava/util/List;

    .line 236
    nop

    .line 215
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$map":I
    check-cast v9, Ljava/util/Collection;

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v2

    .line 216
    if-eqz v2, :cond_5

    .line 215
    nop

    .line 216
    nop

    .line 231
    nop

    .local v2, "it":[J
    const/4 v8, 0x0

    .line 216
    .local v8, "$i$a$-let-FindMethod$innerBuild$root$6":I
    sget-object v9, Lorg/luckypray/dexkit/schema/-FindMethod;->Companion:Lorg/luckypray/dexkit/schema/-FindMethod$Companion;

    invoke-virtual {v9, v10, v2}, Lorg/luckypray/dexkit/schema/-FindMethod$Companion;->createInClassesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I

    move-result v2

    .line 215
    .end local v2    # "it":[J
    .end local v8    # "$i$a$-let-FindMethod$innerBuild$root$6":I
    move v8, v2

    goto :goto_5

    .line 216
    :cond_5
    move v8, v4

    .line 217
    :goto_5
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    if-eqz v2, :cond_7

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 240
    .local v9, "$i$f$map":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v11

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v2

    .restart local v11    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 241
    .restart local v12    # "$i$f$mapTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 242
    .restart local v14    # "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lorg/luckypray/dexkit/result/MethodData;

    .local v15, "it":Lorg/luckypray/dexkit/result/MethodData;
    const/16 v16, 0x0

    .line 217
    .local v16, "$i$a$-map-FindMethod$innerBuild$root$7":I
    invoke-virtual {v15}, Lorg/luckypray/dexkit/result/MethodData;->getEncodeId()J

    move-result-wide v15

    .end local v15    # "it":Lorg/luckypray/dexkit/result/MethodData;
    .end local v16    # "$i$a$-map-FindMethod$innerBuild$root$7":I
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    .line 242
    invoke-interface {v3, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 241
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 243
    :cond_6
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;

    .line 240
    nop

    .line 217
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v2

    .line 218
    if-eqz v2, :cond_7

    .line 217
    nop

    .line 218
    nop

    .line 231
    nop

    .local v2, "it":[J
    const/4 v3, 0x0

    .line 218
    .local v3, "$i$a$-let-FindMethod$innerBuild$root$8":I
    sget-object v9, Lorg/luckypray/dexkit/schema/-FindMethod;->Companion:Lorg/luckypray/dexkit/schema/-FindMethod$Companion;

    invoke-virtual {v9, v10, v2}, Lorg/luckypray/dexkit/schema/-FindMethod$Companion;->createInMethodsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I

    move-result v2

    .line 217
    .end local v2    # "it":[J
    .end local v3    # "$i$a$-let-FindMethod$innerBuild$root$8":I
    move v9, v2

    goto :goto_7

    .line 218
    :cond_7
    move v9, v4

    .line 219
    :goto_7
    iget-boolean v11, v0, Lorg/luckypray/dexkit/query/FindMethod;->findFirst:Z

    .line 220
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindMethod;->matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    if-eqz v2, :cond_8

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v10}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v12, v2

    goto :goto_8

    :cond_8
    move v12, v4

    .line 208
    :goto_8
    move-object/from16 v2, p1

    move v3, v5

    move v4, v6

    move v5, v7

    move v6, v8

    move v7, v9

    move v8, v11

    move v9, v12

    invoke-virtual/range {v1 .. v9}, Lorg/luckypray/dexkit/schema/-FindMethod$Companion;->createFindMethod(Lcom/google/flatbuffers/FlatBufferBuilder;IIZIIZI)I

    move-result v1

    .line 222
    .local v1, "root":I
    invoke-virtual {v10, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 223
    return v1
.end method

.method public final matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 187
    .local v1, "$i$a$-also-FindMethod$matcher$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->matcher:Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 188
    nop

    .line 186
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$matcher$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 188
    return-object v0
.end method

.method public final searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2
    .param p1, "classes"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    const-string v0, "classes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 161
    .local v1, "$i$a$-also-FindMethod$searchInClass$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    .line 162
    nop

    .line 160
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$searchInClass$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 162
    return-object v0
.end method

.method public final searchInMethod(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2
    .param p1, "methods"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    const-string v0, "methods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 173
    .local v1, "$i$a$-also-FindMethod$searchInMethod$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    .line 174
    nop

    .line 172
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$searchInMethod$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 174
    return-object v0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 2
    .param p1, "searchPackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindMethod;"
        }
    .end annotation

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 109
    .local v1, "$i$a$-also-FindMethod$searchPackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    .line 110
    nop

    .line 108
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$searchPackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 110
    return-object v0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;
    .locals 3
    .param p1, "searchPackages"    # [Ljava/lang/String;

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindMethod;
    const/4 v1, 0x0

    .line 95
    .local v1, "$i$a$-also-FindMethod$searchPackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    .line 96
    nop

    .line 94
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindMethod;
    .end local v1    # "$i$a$-also-FindMethod$searchPackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 96
    return-object v0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 48
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->excludePackages:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setFindFirst(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 80
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->findFirst:Z

    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 56
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->ignorePackagesCase:Z

    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 64
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchClasses:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchMethods(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 72
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchMethods:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 40
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages:Ljava/util/Collection;

    return-void
.end method
