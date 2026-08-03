.class public final Lio/github/cherrywechat/network/model/MusicQuality;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/MusicQuality$$serializer;,
        Lio/github/cherrywechat/network/model/MusicQuality$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/MusicQuality$Companion;


# instance fields
.field private final size:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/MusicQuality$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/MusicQuality$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicQuality;->Companion:Lio/github/cherrywechat/network/model/MusicQuality$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lio/github/cherrywechat/network/model/MusicQuality;-><init>(JILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IJLGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    return-void

    :cond_0
    iput-wide p2, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-wide p1, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    return-void
.end method

.method public synthetic constructor <init>(JILOc;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/network/model/MusicQuality;-><init>(J)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/MusicQuality;JILjava/lang/Object;)Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/MusicQuality;->copy(J)Lio/github/cherrywechat/network/model/MusicQuality;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/MusicQuality;LWa;LCx;)V
    .locals 4

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    :goto_0
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    invoke-interface {p1}, LWa;->c()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    return-wide v0
.end method

.method public final copy(J)Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 1

    new-instance v0, Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-direct {v0, p1, p2}, Lio/github/cherrywechat/network/model/MusicQuality;-><init>(J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/MusicQuality;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/MusicQuality;

    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getSize()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MusicQuality(size="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/MusicQuality;->size:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
