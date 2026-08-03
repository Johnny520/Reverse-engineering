.class public final Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u0019\u0008\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;",
        "Lorg/luckypray/dexkit/query/base/BaseMatcher;",
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private modifiers:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 3
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .param p2    # Lorg/luckypray/dexkit/query/enums/MatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 7
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 8
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    .line 9
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public synthetic constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    return-void
.end method


# virtual methods
.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getModifiers()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    return v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 3
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fbb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    if-eqz v0, :cond_0

    sget-object v1, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result v0

    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v2

    invoke-virtual {v1, p1, v0, v2}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->createAccessFlagsMatcher-OsBMiQA(Lcom/google/flatbuffers/FlatBufferBuilder;IB)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "modifiers must not be 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 0

    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    return-void
.end method
