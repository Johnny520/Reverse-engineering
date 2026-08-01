.class public final Lorg/luckypray/dexkit/query/FindClass;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "FindClass.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/FindClass$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFindClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindClass.kt\norg/luckypray/dexkit/query/FindClass\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1547#2:204\n1618#2,3:205\n1547#2:209\n1618#2,3:210\n1547#2:213\n1618#2,3:214\n1#3:208\n*S KotlinDebug\n*F\n+ 1 FindClass.kt\norg/luckypray/dexkit/query/FindClass\n*L\n190#1:204\n190#1:205,3\n192#1:209\n192#1:210,3\n195#1:213\n195#1:214,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u001f\"\u00020\u0005\u00a2\u0006\u0002\u0010 J\u0014\u0010\u0006\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J%\u0010\u0015\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\'0&\u00a2\u0006\u0002\u0008(H\u0087\u0008\u00f8\u0001\u0000J\u0014\u0010)\u001a\u00020\u00002\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0004J\u001f\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u001f\"\u00020\u0005\u00a2\u0006\u0002\u0010 J\u0014\u0010\u001c\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR$\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\"\u0004\u0008\u0013\u0010\u0010R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R4\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u0008\"\u0004\u0008\u001b\u0010\nR4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0008\"\u0004\u0008\u001e\u0010\n\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006,"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/FindClass;",
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
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "matcher",
        "getMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "searchClasses",
        "getSearchClasses",
        "setSearchClasses",
        "searchPackages",
        "getSearchPackages",
        "setSearchPackages",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "searchIn",
        "classes",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/FindClass$Companion;


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

.field private matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
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

    new-instance v0, Lorg/luckypray/dexkit/query/FindClass$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/FindClass$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/FindClass;->Companion:Lorg/luckypray/dexkit/query/FindClass$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/FindClass;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/FindClass;->Companion:Lorg/luckypray/dexkit/query/FindClass$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindClass$Companion;->create()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v0

    return-object v0
.end method

.method private final matcher(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/FindClass;
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
            "Lorg/luckypray/dexkit/query/FindClass;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 177
    .local v1, "$i$a$-also-FindClass$matcher$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/FindClass;->matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;

    .line 178
    nop

    .line 176
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$matcher$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 178
    return-object v0
.end method


# virtual methods
.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 2
    .param p1, "excludePackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindClass;"
        }
    .end annotation

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 129
    .local v1, "$i$a$-also-FindClass$excludePackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    .line 130
    nop

    .line 128
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$excludePackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 130
    return-object v0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 3
    .param p1, "excludePackages"    # [Ljava/lang/String;

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 115
    .local v1, "$i$a$-also-FindClass$excludePackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    .line 116
    nop

    .line 114
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$excludePackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 116
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

    .line 47
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final getFindFirst()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindClass;->findFirst:Z

    return v0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    return v0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 1

    .line 73
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindClass;->matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

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

    .line 63
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

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

    .line 39
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/FindClass;
    .locals 2
    .param p1, "ignorePackagesCase"    # Z

    .line 140
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 141
    .local v1, "$i$a$-also-FindClass$ignorePackagesCase$1":I
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    .line 142
    nop

    .line 140
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$ignorePackagesCase$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 142
    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 14
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    sget-object v1, Lorg/luckypray/dexkit/schema/-FindClass;->Companion:Lorg/luckypray/dexkit/schema/-FindClass$Companion;

    .line 189
    nop

    .line 190
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 204
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

    .line 205
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 206
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 190
    .local v11, "$i$a$-map-FindClass$innerBuild$root$1":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    invoke-virtual {p1, v12}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v10

    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-map-FindClass$innerBuild$root$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 206
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 205
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 207
    :cond_0
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v5, Ljava/util/List;

    .line 204
    nop

    .line 190
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v0

    .line 191
    if-eqz v0, :cond_1

    .line 190
    nop

    .line 191
    nop

    .line 208
    nop

    .local v0, "it":[I
    const/4 v4, 0x0

    .line 191
    .local v4, "$i$a$-let-FindClass$innerBuild$root$2":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v0

    .line 190
    .end local v0    # "it":[I
    .end local v4    # "$i$a$-let-FindClass$innerBuild$root$2":I
    goto :goto_1

    .line 191
    :cond_1
    move v0, v3

    .line 192
    :goto_1
    iget-object v4, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    if-eqz v4, :cond_3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 209
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 210
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 211
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .local v11, "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 192
    .local v12, "$i$a$-map-FindClass$innerBuild$root$3":I
    move-object v13, v11

    check-cast v13, Ljava/lang/CharSequence;

    invoke-virtual {p1, v13}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v11

    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-map-FindClass$innerBuild$root$3":I
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 211
    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 210
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_2

    .line 212
    :cond_2
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 209
    nop

    .line 192
    .end local v4    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v4

    .line 193
    if-eqz v4, :cond_3

    .line 192
    nop

    .line 193
    nop

    .line 208
    nop

    .local v4, "it":[I
    const/4 v5, 0x0

    .line 193
    .local v5, "$i$a$-let-FindClass$innerBuild$root$4":I
    invoke-virtual {p1, v4}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v4

    .line 192
    .end local v4    # "it":[I
    .end local v5    # "$i$a$-let-FindClass$innerBuild$root$4":I
    goto :goto_3

    .line 193
    :cond_3
    move v4, v3

    .line 194
    :goto_3
    iget-boolean v5, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    .line 195
    iget-object v6, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

    if-eqz v6, :cond_5

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 213
    .local v7, "$i$f$map":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v6, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v8

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v6

    .local v8, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 214
    .local v9, "$i$f$mapTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 215
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lorg/luckypray/dexkit/result/ClassData;

    .local v12, "it":Lorg/luckypray/dexkit/result/ClassData;
    const/4 v13, 0x0

    .line 195
    .local v13, "$i$a$-map-FindClass$innerBuild$root$5":I
    invoke-virtual {v12}, Lorg/luckypray/dexkit/result/ClassData;->getEncodeId()J

    move-result-wide v12

    .end local v12    # "it":Lorg/luckypray/dexkit/result/ClassData;
    .end local v13    # "$i$a$-map-FindClass$innerBuild$root$5":I
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    .line 215
    invoke-interface {v2, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 214
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_4

    .line 216
    :cond_4
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 213
    nop

    .line 195
    .end local v6    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v2

    .line 196
    if-eqz v2, :cond_5

    .line 195
    nop

    .line 196
    nop

    .line 208
    nop

    .local v2, "it":[J
    const/4 v6, 0x0

    .line 196
    .local v6, "$i$a$-let-FindClass$innerBuild$root$6":I
    sget-object v7, Lorg/luckypray/dexkit/schema/-FindClass;->Companion:Lorg/luckypray/dexkit/schema/-FindClass$Companion;

    invoke-virtual {v7, p1, v2}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->createInClassesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I

    move-result v2

    .line 195
    .end local v2    # "it":[J
    .end local v6    # "$i$a$-let-FindClass$innerBuild$root$6":I
    move v6, v2

    goto :goto_5

    .line 196
    :cond_5
    move v6, v3

    .line 197
    :goto_5
    iget-boolean v7, p0, Lorg/luckypray/dexkit/query/FindClass;->findFirst:Z

    .line 198
    iget-object v2, p0, Lorg/luckypray/dexkit/query/FindClass;->matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    if-eqz v2, :cond_6

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v8, v2

    goto :goto_6

    :cond_6
    move v8, v3

    .line 188
    :goto_6
    move-object v2, p1

    move v3, v0

    invoke-virtual/range {v1 .. v8}, Lorg/luckypray/dexkit/schema/-FindClass$Companion;->createFindClass(Lcom/google/flatbuffers/FlatBufferBuilder;IIZIZI)I

    move-result v0

    .line 200
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 201
    return v0
.end method

.method public final matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 167
    .local v1, "$i$a$-also-FindClass$matcher$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->matcher:Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 168
    nop

    .line 166
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$matcher$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 168
    return-object v0
.end method

.method public final searchIn(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 2
    .param p1, "classes"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindClass;"
        }
    .end annotation

    const-string v0, "classes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 153
    .local v1, "$i$a$-also-FindClass$searchIn$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

    .line 154
    nop

    .line 152
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$searchIn$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 154
    return-object v0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 2
    .param p1, "searchPackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindClass;"
        }
    .end annotation

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 101
    .local v1, "$i$a$-also-FindClass$searchPackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    .line 102
    nop

    .line 100
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$searchPackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 102
    return-object v0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 3
    .param p1, "searchPackages"    # [Ljava/lang/String;

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindClass;
    const/4 v1, 0x0

    .line 87
    .local v1, "$i$a$-also-FindClass$searchPackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    .line 88
    nop

    .line 86
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindClass;
    .end local v1    # "$i$a$-also-FindClass$searchPackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 88
    return-object v0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 47
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->excludePackages:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setFindFirst(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 71
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindClass;->findFirst:Z

    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 55
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindClass;->ignorePackagesCase:Z

    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 63
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchClasses:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 39
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindClass;->searchPackages:Ljava/util/Collection;

    return-void
.end method
