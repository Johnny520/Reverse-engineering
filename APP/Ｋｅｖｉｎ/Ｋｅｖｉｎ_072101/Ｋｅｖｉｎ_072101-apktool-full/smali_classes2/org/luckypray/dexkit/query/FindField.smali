.class public final Lorg/luckypray/dexkit/query/FindField;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "FindField.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/FindField$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFindField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindField.kt\norg/luckypray/dexkit/query/FindField\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1547#2:228\n1618#2,3:229\n1547#2:233\n1618#2,3:234\n1547#2:237\n1618#2,3:238\n1547#2:241\n1618#2,3:242\n1#3:232\n*S KotlinDebug\n*F\n+ 1 FindField.kt\norg/luckypray/dexkit/query/FindField\n*L\n211#1:228\n211#1:229,3\n213#1:233\n213#1:234,3\n216#1:237\n216#1:238,3\n218#1:241\n218#1:242,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050#\"\u00020\u0005\u00a2\u0006\u0002\u0010$J\u0014\u0010\u0006\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J%\u0010\u0015\u001a\u00020\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020+0*\u00a2\u0006\u0002\u0008,H\u0087\u0008\u00f8\u0001\u0000J\u0014\u0010-\u001a\u00020\u00002\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0004J\u0014\u0010/\u001a\u00020\u00002\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0004J\u001f\u0010 \u001a\u00020\u00002\u0012\u0010 \u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050#\"\u00020\u0005\u00a2\u0006\u0002\u0010$J\u0014\u0010 \u001a\u00020\u00002\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR$\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\"\u0004\u0008\u0013\u0010\u0010R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R4\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u0008\"\u0004\u0008\u001b\u0010\nR4\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u0008\"\u0004\u0008\u001f\u0010\nR4\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u0008\"\u0004\u0008\"\u0010\n\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00062"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/FindField;",
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
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "matcher",
        "getMatcher",
        "()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "searchClasses",
        "getSearchClasses",
        "setSearchClasses",
        "Lorg/luckypray/dexkit/result/FieldData;",
        "searchFields",
        "getSearchFields",
        "setSearchFields",
        "searchPackages",
        "getSearchPackages",
        "setSearchPackages",
        "",
        "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindField;",
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
        "searchInField",
        "fields",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/FindField$Companion;


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

.field private matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation
.end field

.field private searchFields:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/FieldData;",
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

    new-instance v0, Lorg/luckypray/dexkit/query/FindField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/FindField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/FindField;->Companion:Lorg/luckypray/dexkit/query/FindField$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/FindField;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/FindField;->Companion:Lorg/luckypray/dexkit/query/FindField$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindField$Companion;->create()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    return-object v0
.end method

.method private final matcher(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/query/FindField;
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
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 198
    .local v1, "$i$a$-also-FindField$matcher$2":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v2}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/FindField;->matcher(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/FindField;

    .line 199
    nop

    .line 197
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$matcher$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 199
    return-object v0
.end method


# virtual methods
.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 2
    .param p1, "excludePackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 138
    .local v1, "$i$a$-also-FindField$excludePackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    .line 139
    nop

    .line 137
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$excludePackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 139
    return-object v0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindField;
    .locals 3
    .param p1, "excludePackages"    # [Ljava/lang/String;

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 124
    .local v1, "$i$a$-also-FindField$excludePackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    .line 125
    nop

    .line 123
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$excludePackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 125
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
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final getFindFirst()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindField;->findFirst:Z

    return v0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    return v0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    .line 82
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

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
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    return-object v0
.end method

.method public final getSearchFields()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/FieldData;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

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
    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/FindField;
    .locals 2
    .param p1, "ignorePackagesCase"    # Z

    .line 149
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 150
    .local v1, "$i$a$-also-FindField$ignorePackagesCase$1":I
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    .line 151
    nop

    .line 149
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$ignorePackagesCase$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 151
    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 17
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    const-string v1, "fbb"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    sget-object v1, Lorg/luckypray/dexkit/schema/-FindField;->Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;

    .line 210
    nop

    .line 211
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 228
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

    .line 229
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 230
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 211
    .local v13, "$i$a$-map-FindField$innerBuild$root$1":I
    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;

    invoke-virtual {v10, v14}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v12

    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-map-FindField$innerBuild$root$1":I
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 230
    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 229
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 231
    :cond_0
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo":I
    check-cast v6, Ljava/util/List;

    .line 228
    nop

    .line 211
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 212
    if-eqz v2, :cond_1

    .line 211
    nop

    .line 212
    nop

    .line 232
    nop

    .local v2, "it":[I
    const/4 v5, 0x0

    .line 212
    .local v5, "$i$a$-let-FindField$innerBuild$root$2":I
    invoke-virtual {v10, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 211
    .end local v2    # "it":[I
    .end local v5    # "$i$a$-let-FindField$innerBuild$root$2":I
    move v5, v2

    goto :goto_1

    .line 212
    :cond_1
    move v5, v4

    .line 213
    :goto_1
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    if-eqz v2, :cond_3

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 233
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

    .line 234
    .local v9, "$i$f$mapTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 235
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 213
    .local v14, "$i$a$-map-FindField$innerBuild$root$3":I
    move-object v15, v13

    check-cast v15, Ljava/lang/CharSequence;

    invoke-virtual {v10, v15}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v13

    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-FindField$innerBuild$root$3":I
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 235
    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 234
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_2

    .line 236
    :cond_2
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo":I
    check-cast v7, Ljava/util/List;

    .line 233
    nop

    .line 213
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map":I
    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v2

    .line 214
    if-eqz v2, :cond_3

    .line 213
    nop

    .line 214
    nop

    .line 232
    nop

    .local v2, "it":[I
    const/4 v6, 0x0

    .line 214
    .local v6, "$i$a$-let-FindField$innerBuild$root$4":I
    invoke-virtual {v10, v2}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    move-result v2

    .line 213
    .end local v2    # "it":[I
    .end local v6    # "$i$a$-let-FindField$innerBuild$root$4":I
    move v6, v2

    goto :goto_3

    .line 214
    :cond_3
    move v6, v4

    .line 215
    :goto_3
    iget-boolean v7, v0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    .line 216
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 237
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

    .line 238
    .local v12, "$i$f$mapTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 239
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lorg/luckypray/dexkit/result/ClassData;

    .local v15, "it":Lorg/luckypray/dexkit/result/ClassData;
    const/16 v16, 0x0

    .line 216
    .local v16, "$i$a$-map-FindField$innerBuild$root$5":I
    invoke-virtual {v15}, Lorg/luckypray/dexkit/result/ClassData;->getEncodeId()J

    move-result-wide v15

    .end local v15    # "it":Lorg/luckypray/dexkit/result/ClassData;
    .end local v16    # "$i$a$-map-FindField$innerBuild$root$5":I
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    .line 239
    invoke-interface {v9, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 238
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_4

    .line 240
    :cond_4
    nop

    .end local v9    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo":I
    check-cast v9, Ljava/util/List;

    .line 237
    nop

    .line 216
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$map":I
    check-cast v9, Ljava/util/Collection;

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v2

    .line 217
    if-eqz v2, :cond_5

    .line 216
    nop

    .line 217
    nop

    .line 232
    nop

    .local v2, "it":[J
    const/4 v8, 0x0

    .line 217
    .local v8, "$i$a$-let-FindField$innerBuild$root$6":I
    sget-object v9, Lorg/luckypray/dexkit/schema/-FindField;->Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;

    invoke-virtual {v9, v10, v2}, Lorg/luckypray/dexkit/schema/-FindField$Companion;->createInClassesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I

    move-result v2

    .line 216
    .end local v2    # "it":[J
    .end local v8    # "$i$a$-let-FindField$innerBuild$root$6":I
    move v8, v2

    goto :goto_5

    .line 217
    :cond_5
    move v8, v4

    .line 218
    :goto_5
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

    if-eqz v2, :cond_7

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 241
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

    .line 242
    .restart local v12    # "$i$f$mapTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 243
    .restart local v14    # "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lorg/luckypray/dexkit/result/FieldData;

    .local v15, "it":Lorg/luckypray/dexkit/result/FieldData;
    const/16 v16, 0x0

    .line 218
    .local v16, "$i$a$-map-FindField$innerBuild$root$7":I
    invoke-virtual {v15}, Lorg/luckypray/dexkit/result/FieldData;->getEncodeId()J

    move-result-wide v15

    .end local v15    # "it":Lorg/luckypray/dexkit/result/FieldData;
    .end local v16    # "$i$a$-map-FindField$innerBuild$root$7":I
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    .line 243
    invoke-interface {v3, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 242
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 244
    :cond_6
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;

    .line 241
    nop

    .line 218
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v2

    .line 219
    if-eqz v2, :cond_7

    .line 218
    nop

    .line 219
    nop

    .line 232
    nop

    .local v2, "it":[J
    const/4 v3, 0x0

    .line 219
    .local v3, "$i$a$-let-FindField$innerBuild$root$8":I
    sget-object v9, Lorg/luckypray/dexkit/schema/-FindField;->Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;

    invoke-virtual {v9, v10, v2}, Lorg/luckypray/dexkit/schema/-FindField$Companion;->createInFieldsVector(Lcom/google/flatbuffers/FlatBufferBuilder;[J)I

    move-result v2

    .line 218
    .end local v2    # "it":[J
    .end local v3    # "$i$a$-let-FindField$innerBuild$root$8":I
    move v9, v2

    goto :goto_7

    .line 219
    :cond_7
    move v9, v4

    .line 220
    :goto_7
    iget-boolean v11, v0, Lorg/luckypray/dexkit/query/FindField;->findFirst:Z

    .line 221
    iget-object v2, v0, Lorg/luckypray/dexkit/query/FindField;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-eqz v2, :cond_8

    check-cast v2, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v2, v10}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    move v12, v2

    goto :goto_8

    :cond_8
    move v12, v4

    .line 209
    :goto_8
    move-object/from16 v2, p1

    move v3, v5

    move v4, v6

    move v5, v7

    move v6, v8

    move v7, v9

    move v8, v11

    move v9, v12

    invoke-virtual/range {v1 .. v9}, Lorg/luckypray/dexkit/schema/-FindField$Companion;->createFindField(Lcom/google/flatbuffers/FlatBufferBuilder;IIZIIZI)I

    move-result v1

    .line 223
    .local v1, "root":I
    invoke-virtual {v10, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 224
    return v1
.end method

.method public final matcher(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/FindField;
    .locals 2
    .param p1, "matcher"    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 188
    .local v1, "$i$a$-also-FindField$matcher$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 189
    nop

    .line 187
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$matcher$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 189
    return-object v0
.end method

.method public final searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 2
    .param p1, "classes"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "classes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 162
    .local v1, "$i$a$-also-FindField$searchInClass$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    .line 163
    nop

    .line 161
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$searchInClass$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 163
    return-object v0
.end method

.method public final searchInField(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 2
    .param p1, "fields"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/FieldData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "fields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 174
    .local v1, "$i$a$-also-FindField$searchInField$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

    .line 175
    nop

    .line 173
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$searchInField$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 175
    return-object v0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 2
    .param p1, "searchPackages"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 110
    .local v1, "$i$a$-also-FindField$searchPackages$2":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    .line 111
    nop

    .line 109
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$searchPackages$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 111
    return-object v0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindField;
    .locals 3
    .param p1, "searchPackages"    # [Ljava/lang/String;

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .local v0, "it":Lorg/luckypray/dexkit/query/FindField;
    const/4 v1, 0x0

    .line 96
    .local v1, "$i$a$-also-FindField$searchPackages$1":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    .line 97
    nop

    .line 95
    .end local v0    # "it":Lorg/luckypray/dexkit/query/FindField;
    .end local v1    # "$i$a$-also-FindField$searchPackages$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/FindField;

    .line 97
    return-object v0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 48
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setFindFirst(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 80
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindField;->findFirst:Z

    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 56
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 64
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchFields(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 72
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 40
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    return-void
.end method
