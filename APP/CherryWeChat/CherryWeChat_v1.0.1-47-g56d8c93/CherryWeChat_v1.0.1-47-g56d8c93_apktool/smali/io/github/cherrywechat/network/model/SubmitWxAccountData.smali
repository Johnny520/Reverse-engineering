.class public final Lio/github/cherrywechat/network/model/SubmitWxAccountData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/SubmitWxAccountData$$serializer;,
        Lio/github/cherrywechat/network/model/SubmitWxAccountData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/SubmitWxAccountData$Companion;


# instance fields
.field private final adUrl:Ljava/lang/String;

.field private final adVersion:I

.field private final continuousDays:I

.field private final isUnlockedInt:I

.field private final totalCheckins:I

.field private final wxId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/SubmitWxAccountData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/SubmitWxAccountData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->Companion:Lio/github/cherrywechat/network/model/SubmitWxAccountData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IIIILGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    const-string v0, ""

    if-nez p8, :cond_0

    iput-object v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput p3, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    goto :goto_2

    :cond_2
    iput p4, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput p3, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    goto :goto_3

    :cond_3
    iput p5, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput p3, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    goto :goto_4

    :cond_4
    iput p6, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    :goto_4
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    iput p3, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    return-void

    :cond_5
    iput p7, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIII)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    .line 6
    iput p3, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    .line 7
    iput p4, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    .line 8
    iput p5, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    .line 9
    iput p6, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIIILOc;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    .line 10
    const-string v0, ""

    if-eqz p8, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move p7, v0

    :goto_0
    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p7, p6

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p7}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;-><init>(Ljava/lang/String;Ljava/lang/String;IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/SubmitWxAccountData;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Object;)Lio/github/cherrywechat/network/model/SubmitWxAccountData;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->copy(Ljava/lang/String;Ljava/lang/String;IIII)Lio/github/cherrywechat/network/model/SubmitWxAccountData;

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

.method public static synthetic getWxId$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isUnlockedInt$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/SubmitWxAccountData;LWa;LCx;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    if-eqz p2, :cond_5

    :goto_2
    iget p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    invoke-interface {p1}, LWa;->e()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    if-eqz p2, :cond_7

    :goto_3
    iget p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    invoke-interface {p1}, LWa;->e()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    if-eqz p2, :cond_9

    :goto_4
    iget p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    invoke-interface {p1}, LWa;->e()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget p2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    if-eqz p2, :cond_b

    :goto_5
    iget p0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    invoke-interface {p1}, LWa;->e()V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IIII)Lio/github/cherrywechat/network/model/SubmitWxAccountData;
    .locals 7

    new-instance v0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/SubmitWxAccountData;-><init>(Ljava/lang/String;Ljava/lang/String;IIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    iget v3, p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    iget v3, p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    iget v3, p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    iget p1, p1, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAdUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getAdVersion()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    return v0
.end method

.method public final getContinuousDays()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    return v0
.end method

.method public final getTotalCheckins()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    return v0
.end method

.method public final getWxId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isUnlocked()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isUnlockedInt()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SubmitWxAccountData(wxId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->wxId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", adUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", adVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->adVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isUnlockedInt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->isUnlockedInt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", continuousDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->continuousDays:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalCheckins="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/SubmitWxAccountData;->totalCheckins:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
