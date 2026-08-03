.class public final Lio/github/cherrywechat/network/model/UnlockStatusData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/UnlockStatusData$$serializer;,
        Lio/github/cherrywechat/network/model/UnlockStatusData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/UnlockStatusData$Companion;


# instance fields
.field private final adUrl:Ljava/lang/String;

.field private final adVersion:I

.field private final continuousDays:I

.field private final isUnlockedInt:I

.field private final totalCheckins:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/UnlockStatusData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/UnlockStatusData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/UnlockStatusData;->Companion:Lio/github/cherrywechat/network/model/UnlockStatusData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lio/github/cherrywechat/network/model/UnlockStatusData;-><init>(IILjava/lang/String;IIILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;IILGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_0

    iput v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    goto :goto_1

    :cond_1
    iput p3, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 3
    const-string p2, ""

    .line 4
    iput-object p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    goto :goto_3

    :cond_3
    iput p5, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    return-void

    :cond_4
    iput p6, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;II)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    .line 7
    iput p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    .line 8
    iput-object p3, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    .line 9
    iput p4, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    .line 10
    iput p5, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;IIILOc;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 11
    const-string p3, ""

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v0

    :goto_0
    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p6}, Lio/github/cherrywechat/network/model/UnlockStatusData;-><init>(IILjava/lang/String;II)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/UnlockStatusData;IILjava/lang/String;IIILjava/lang/Object;)Lio/github/cherrywechat/network/model/UnlockStatusData;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/github/cherrywechat/network/model/UnlockStatusData;->copy(IILjava/lang/String;II)Lio/github/cherrywechat/network/model/UnlockStatusData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAdUrl$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getAdVersion$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getContinuousDays$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTotalCheckins$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isUnlockedInt$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/UnlockStatusData;LWa;LCx;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    if-eqz p2, :cond_1

    :goto_0
    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    invoke-interface {p1}, LWa;->e()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    if-eqz p2, :cond_3

    :goto_1
    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    invoke-interface {p1}, LWa;->e()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    const-string v0, ""

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    if-eqz p2, :cond_7

    :goto_3
    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    invoke-interface {p1}, LWa;->e()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget p2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    if-eqz p2, :cond_9

    :goto_4
    iget p0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    invoke-interface {p1}, LWa;->e()V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    return v0
.end method

.method public final copy(IILjava/lang/String;II)Lio/github/cherrywechat/network/model/UnlockStatusData;
    .locals 6

    new-instance v0, Lio/github/cherrywechat/network/model/UnlockStatusData;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/UnlockStatusData;-><init>(IILjava/lang/String;II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/UnlockStatusData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/UnlockStatusData;

    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    iget v3, p1, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    iget v3, p1, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    iget v3, p1, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    iget p1, p1, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAdUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getAdVersion()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    return v0
.end method

.method public final getContinuousDays()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    return v0
.end method

.method public final getTotalCheckins()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isUnlocked()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isUnlockedInt()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UnlockStatusData(isUnlockedInt="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->isUnlockedInt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", continuousDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->continuousDays:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", adUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", adVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->adVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalCheckins="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/UnlockStatusData;->totalCheckins:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
