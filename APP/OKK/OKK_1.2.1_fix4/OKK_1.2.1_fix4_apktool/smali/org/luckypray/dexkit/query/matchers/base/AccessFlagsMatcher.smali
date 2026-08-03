.class public final Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "SourceFile"


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

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 3
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;-><init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILQ0/d;)V

    return-void
.end method

.method public constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1

    const-string v0, "matchType"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 7
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 8
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    .line 9
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public synthetic constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;ILQ0/d;)V
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

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-object v0
.end method

.method public final getModifiers()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    return v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 3

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    if-eqz v0, :cond_0

    sget-object v1, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;

    iget-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    move-result v2

    invoke-virtual {v1, p1, v0, v2}, Lorg/luckypray/dexkit/schema/-AccessFlagsMatcher$Companion;->createAccessFlagsMatcher-OsBMiQA(Lcom/google/flatbuffers/b;IB)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

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

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public final synthetic setModifiers(I)V
    .locals 0

    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;->modifiers:I

    return-void
.end method
