.class public final Lio/github/cherrywechat/network/model/MusicLrc;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/MusicLrc$$serializer;,
        Lio/github/cherrywechat/network/model/MusicLrc$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/MusicLrc$Companion;


# instance fields
.field private final lyric:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/MusicLrc$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/MusicLrc$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicLrc;->Companion:Lio/github/cherrywechat/network/model/MusicLrc$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/github/cherrywechat/network/model/MusicLrc;-><init>(Ljava/lang/String;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    return-void

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILOc;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lio/github/cherrywechat/network/model/MusicLrc;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/MusicLrc;Ljava/lang/String;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/MusicLrc;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/MusicLrc;->copy(Ljava/lang/String;)Lio/github/cherrywechat/network/model/MusicLrc;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/MusicLrc;LWa;LCx;)V
    .locals 0

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    if-eqz p2, :cond_1

    :goto_0
    sget-object p2, Lsz;->a:Lsz;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lio/github/cherrywechat/network/model/MusicLrc;
    .locals 1

    new-instance v0, Lio/github/cherrywechat/network/model/MusicLrc;

    invoke-direct {v0, p1}, Lio/github/cherrywechat/network/model/MusicLrc;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/MusicLrc;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/MusicLrc;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getLyric()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MusicLrc(lyric="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicLrc;->lyric:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
