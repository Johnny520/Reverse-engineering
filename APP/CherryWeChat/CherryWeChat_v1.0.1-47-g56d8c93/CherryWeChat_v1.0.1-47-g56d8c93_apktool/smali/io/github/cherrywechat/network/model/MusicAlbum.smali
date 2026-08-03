.class public final Lio/github/cherrywechat/network/model/MusicAlbum;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/MusicAlbum$$serializer;,
        Lio/github/cherrywechat/network/model/MusicAlbum$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/MusicAlbum$Companion;


# instance fields
.field private final id:J

.field private final name:Ljava/lang/String;

.field private final picUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/MusicAlbum$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/MusicAlbum$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicAlbum;->Companion:Lio/github/cherrywechat/network/model/MusicAlbum$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v5, 0x7

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/MusicAlbum;-><init>(JLjava/lang/String;Ljava/lang/String;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/lang/String;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    if-nez p6, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    iput-wide p2, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    and-int/lit8 p2, p1, 0x2

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    return-void

    :cond_2
    iput-object p5, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-wide p1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    .line 5
    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;ILOc;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/MusicAlbum;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/MusicAlbum;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/MusicAlbum;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/MusicAlbum;->copy(JLjava/lang/String;Ljava/lang/String;)Lio/github/cherrywechat/network/model/MusicAlbum;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/MusicAlbum;LWa;LCx;)V
    .locals 4

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    :goto_0
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    invoke-interface {p1}, LWa;->c()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    if-eqz p2, :cond_3

    :goto_1
    sget-object p2, Lsz;->a:Lsz;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    if-eqz p2, :cond_5

    :goto_2
    sget-object p2, Lsz;->a:Lsz;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;)Lio/github/cherrywechat/network/model/MusicAlbum;
    .locals 1

    new-instance v0, Lio/github/cherrywechat/network/model/MusicAlbum;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/MusicAlbum;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/MusicAlbum;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/MusicAlbum;

    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPicUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MusicAlbum(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", picUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicAlbum;->picUrl:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
