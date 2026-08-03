.class public final Lio/github/cherrywechat/network/model/MusicPlaylistResult;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;,
        Lio/github/cherrywechat/network/model/MusicPlaylistResult$Companion;
    }
.end annotation


# static fields
.field private static final $childSerializers:[LDn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LDn;"
        }
    .end annotation
.end field

.field public static final Companion:Lio/github/cherrywechat/network/model/MusicPlaylistResult$Companion;


# instance fields
.field private final coverImgUrl:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final id:J

.field private final name:Ljava/lang/String;

.field private final tracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicTrack;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/MusicPlaylistResult$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->Companion:Lio/github/cherrywechat/network/model/MusicPlaylistResult$Companion;

    new-instance v0, Ld;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Ld;-><init>(I)V

    const/4 v2, 0x2

    invoke-static {v2, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [LDn;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x1f

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    if-nez p8, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    iput-wide p2, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    and-int/lit8 p2, p1, 0x2

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    .line 3
    sget-object p1, LKf;->a:LKf;

    .line 4
    iput-object p1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    return-void

    :cond_4
    iput-object p7, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicTrack;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-wide p1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    .line 7
    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILOc;)V
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move-object v3, p2

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move-object v4, p2

    goto :goto_1

    :cond_2
    move-object v4, p4

    :goto_1
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    move-object v5, p2

    goto :goto_2

    :cond_3
    move-object v5, p5

    :goto_2
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    .line 11
    sget-object p6, LKf;->a:LKf;

    :cond_4
    move-object v0, p0

    move-object v6, p6

    .line 12
    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicTrack$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/MusicPlaylistResult;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/MusicPlaylistResult;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/MusicPlaylistResult;LWa;LCx;)V
    .locals 4

    sget-object p2, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    :goto_0
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    invoke-interface {p1}, LWa;->c()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    if-eqz v0, :cond_3

    :goto_1
    sget-object v0, Lsz;->a:Lsz;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    if-eqz v0, :cond_5

    :goto_2
    sget-object v0, Lsz;->a:Lsz;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    if-eqz v0, :cond_7

    :goto_3
    sget-object v0, Lsz;->a:Lsz;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    sget-object v1, LKf;->a:LKf;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :goto_4
    const/4 v0, 0x4

    aget-object p2, p2, v0

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicTrack;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/github/cherrywechat/network/model/MusicPlaylistResult;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicTrack;",
            ">;)",
            "Lio/github/cherrywechat/network/model/MusicPlaylistResult;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCoverImgUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getTracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicTrack;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

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

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MusicPlaylistResult(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", coverImgUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->coverImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tracks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->tracks:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
