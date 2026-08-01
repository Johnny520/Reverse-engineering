.class public final Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;


# instance fields
.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private modifiers:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 15
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 18
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILr2;)V

    return-void
.end method

.method public constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 8
    .line 9
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    .line 10
    .line 11
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILr2;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 16
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 17
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V

    return-void
.end method


# virtual methods
.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public innerBuild(Lc5;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v1, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;

    .line 9
    .line 10
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {v1, p1, v0, p0}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->createAccessFlagsMatcher-OsBMiQA(Lc5;IB)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-virtual {p1, p0}, Lc5;->n(I)V

    .line 21
    .line 22
    .line 23
    return p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p1, "modifiers must not be 0"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    .line 2
    .line 3
    return-void
.end method
