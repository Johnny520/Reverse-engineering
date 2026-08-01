.class public final Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "AccessFlagsMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u0019\u0008\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "()V",
        "modifiers",
        "",
        "matchType",
        "Lorg/luckypray/dexkit/query/enums/MatchType;",
        "(ILorg/luckypray/dexkit/query/enums/MatchType;)V",
        "<set-?>",
        "getMatchType",
        "()Lorg/luckypray/dexkit/query/enums/MatchType;",
        "setMatchType",
        "(Lorg/luckypray/dexkit/query/enums/MatchType;)V",
        "getModifiers",
        "()I",
        "setModifiers",
        "(I)V",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
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
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;


# instance fields
.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private modifiers:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 48
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 50
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "modifiers"    # I
    .param p2, "matchType"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "matchType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 48
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 66
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    .line 67
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 68
    return-void
.end method

.method public synthetic constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 62
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 64
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 62
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    .line 68
    return-void
.end method


# virtual methods
.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1

    .line 48
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getModifiers()I
    .locals 1

    .line 40
    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    return v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 3
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    if-eqz v0, :cond_0

    .line 89
    sget-object v0, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;

    .line 90
    nop

    .line 91
    iget v1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    .line 92
    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v2

    .line 89
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->createAccessFlagsMatcher-OsBMiQA(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I

    move-result v0

    .line 94
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 95
    return v0

    .line 88
    .end local v0    # "root":I
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "modifiers must not be 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p1, "<set-?>"    # Lorg/luckypray/dexkit/query/enums/MatchType;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 40
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    return-void
.end method
