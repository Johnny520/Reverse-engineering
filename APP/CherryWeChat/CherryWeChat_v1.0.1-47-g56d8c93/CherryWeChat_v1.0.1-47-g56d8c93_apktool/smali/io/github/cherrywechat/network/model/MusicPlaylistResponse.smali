.class public final Lio/github/cherrywechat/network/model/MusicPlaylistResponse;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;,
        Lio/github/cherrywechat/network/model/MusicPlaylistResponse$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/MusicPlaylistResponse$Companion;


# instance fields
.field private final code:I

.field private final result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->Companion:Lio/github/cherrywechat/network/model/MusicPlaylistResponse$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;-><init>(ILio/github/cherrywechat/network/model/MusicPlaylistResult;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IILio/github/cherrywechat/network/model/MusicPlaylistResult;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p4, p1, 0x1

    if-nez p4, :cond_0

    const/4 p2, -0x1

    :cond_0
    iput p2, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    return-void

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    return-void
.end method

.method public constructor <init>(ILio/github/cherrywechat/network/model/MusicPlaylistResult;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    .line 5
    iput-object p2, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    return-void
.end method

.method public synthetic constructor <init>(ILio/github/cherrywechat/network/model/MusicPlaylistResult;ILOc;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, -0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;-><init>(ILio/github/cherrywechat/network/model/MusicPlaylistResult;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/MusicPlaylistResponse;ILio/github/cherrywechat/network/model/MusicPlaylistResult;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/MusicPlaylistResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->copy(ILio/github/cherrywechat/network/model/MusicPlaylistResult;)Lio/github/cherrywechat/network/model/MusicPlaylistResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/MusicPlaylistResponse;LWa;LCx;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget p2, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    :goto_0
    iget p2, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    invoke-interface {p1}, LWa;->e()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    if-eqz p2, :cond_3

    :goto_1
    sget-object p2, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    invoke-interface {p1}, LWa;->f()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    return v0
.end method

.method public final component2()Lio/github/cherrywechat/network/model/MusicPlaylistResult;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    return-object v0
.end method

.method public final copy(ILio/github/cherrywechat/network/model/MusicPlaylistResult;)Lio/github/cherrywechat/network/model/MusicPlaylistResponse;
    .locals 1

    new-instance v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;

    invoke-direct {v0, p1, p2}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;-><init>(ILio/github/cherrywechat/network/model/MusicPlaylistResult;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;

    iget v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    iget v3, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCode()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    return v0
.end method

.method public final getResult()Lio/github/cherrywechat/network/model/MusicPlaylistResult;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MusicPlaylistResponse(code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->result:Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
