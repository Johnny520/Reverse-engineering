.class public final Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "TargetElementTypesMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTargetElementTypesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetElementTypesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1547#2:133\n1618#2,3:134\n1#3:137\n*S KotlinDebug\n*F\n+ 1 TargetElementTypesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher\n*L\n125#1:133\n125#1:134,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u001f\u0008\u0017\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\u0003\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u0016\"\u00020\u0005\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0003\u001a\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR4\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0019"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "types",
        "",
        "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V",
        "<set-?>",
        "getMatchType",
        "()Lorg/luckypray/dexkit/query/enums/MatchType;",
        "setMatchType",
        "(Lorg/luckypray/dexkit/query/enums/MatchType;)V",
        "getTypes",
        "()Ljava/util/Collection;",
        "setTypes",
        "(Ljava/util/Collection;)V",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "",
        "([Lorg/luckypray/dexkit/query/enums/TargetElementType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;


# instance fields
.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private types:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 48
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "types"    # Ljava/util/Collection;
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/MatchType;",
            ")V"
        }
    .end annotation

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 48
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 65
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 66
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 67
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 61
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 63
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 61
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V

    .line 67
    return-void
.end method

.method public static final create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/MatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;->create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    .line 48
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getTypes()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    return-object v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 10
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    sget-object v0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;

    .line 124
    nop

    .line 125
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 133
    .local v2, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 134
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 135
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    .local v8, "it":Lorg/luckypray/dexkit/query/enums/TargetElementType;
    const/4 v9, 0x0

    .line 125
    .local v9, "$i$a$-map-TargetElementTypesMatcher$innerBuild$root$1":I
    invoke-virtual {v8}, Lorg/luckypray/dexkit/query/enums/TargetElementType;->getValue()B

    move-result v8

    .end local v8    # "it":Lorg/luckypray/dexkit/query/enums/TargetElementType;
    .end local v9    # "$i$a$-map-TargetElementTypesMatcher$innerBuild$root$1":I
    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    .line 135
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 134
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 136
    :cond_0
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;

    .line 133
    nop

    .line 125
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toByteArray(Ljava/util/Collection;)[B

    move-result-object v1

    .line 126
    if-eqz v1, :cond_1

    .line 125
    nop

    .line 126
    nop

    .line 137
    nop

    .local v1, "it":[B
    const/4 v2, 0x0

    .line 126
    .local v2, "$i$a$-let-TargetElementTypesMatcher$innerBuild$root$2":I
    sget-object v3, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;

    invoke-virtual {v3, p1, v1}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;->createTypesVector(Lcom/google/flatbuffers/FlatBufferBuilder;[B)I

    move-result v1

    .line 125
    .end local v1    # "it":[B
    .end local v2    # "$i$a$-let-TargetElementTypesMatcher$innerBuild$root$2":I
    goto :goto_1

    .line 126
    :cond_1
    const/4 v1, 0x0

    .line 127
    :goto_1
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v2

    .line 123
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;->createTargetElementTypesMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I

    move-result v0

    .line 129
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 130
    return v0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 2
    .param p1, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    const/4 v1, 0x0

    .line 103
    .local v1, "$i$a$-also-TargetElementTypesMatcher$matchType$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 104
    nop

    .line 102
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .end local v1    # "$i$a$-also-TargetElementTypesMatcher$matchType$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 104
    return-object v0
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public final synthetic setTypes(Ljava/util/Collection;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/util/Collection;

    .line 40
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    return-void
.end method

.method public final types(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 2
    .param p1, "types"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;"
        }
    .end annotation

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    const/4 v1, 0x0

    .line 78
    .local v1, "$i$a$-also-TargetElementTypesMatcher$types$1":I
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 79
    nop

    .line 77
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .end local v1    # "$i$a$-also-TargetElementTypesMatcher$types$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 79
    return-object v0
.end method

.method public final varargs types([Lorg/luckypray/dexkit/query/enums/TargetElementType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 3
    .param p1, "types"    # [Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    const/4 v1, 0x0

    .line 91
    .local v1, "$i$a$-also-TargetElementTypesMatcher$types$2":I
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 92
    nop

    .line 90
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .end local v1    # "$i$a$-also-TargetElementTypesMatcher$types$2":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 92
    return-object v0
.end method
