.class public final Lio/github/cherrywechat/network/model/SavedMusicItem;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;,
        Lio/github/cherrywechat/network/model/SavedMusicItem$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/SavedMusicItem$Companion;


# instance fields
.field private final album:Ljava/lang/String;

.field private final albumId:J

.field private final artist:Ljava/lang/String;

.field private final duration:J

.field private final imageUrl:Ljava/lang/String;

.field private final size:J

.field private final songId:J

.field private final title:Ljava/lang/String;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/SavedMusicItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/SavedMusicItem$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/SavedMusicItem;->Companion:Lio/github/cherrywechat/network/model/SavedMusicItem$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 16

    .line 1
    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lio/github/cherrywechat/network/model/SavedMusicItem;-><init>(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IJJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;LGx;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    iput-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    goto :goto_0

    :cond_0
    iput-wide p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    goto :goto_1

    :cond_1
    iput-wide p4, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const-string p3, ""

    if-nez p2, :cond_2

    iput-object p3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p6, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p7, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    goto :goto_4

    :cond_4
    iput-wide p8, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p10, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    goto :goto_6

    :cond_6
    iput-wide p11, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 p2, p13

    iput-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    :goto_7
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    return-void

    :cond_8
    move-object/from16 p1, p14

    iput-object p1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-wide p1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    .line 5
    iput-wide p3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    .line 6
    iput-object p5, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    .line 8
    iput-wide p7, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    .line 9
    iput-object p9, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    .line 10
    iput-wide p10, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    .line 11
    iput-object p12, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    .line 12
    iput-object p13, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILOc;)V
    .locals 14

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    move-wide v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-wide v6, v2

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 13
    const-string v8, ""

    if-eqz v1, :cond_2

    move-object v1, v8

    goto :goto_2

    :cond_2
    move-object/from16 v1, p5

    :goto_2
    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_3

    move-object v9, v8

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    move-wide v10, v2

    goto :goto_4

    :cond_4
    move-wide/from16 v10, p7

    :goto_4
    and-int/lit8 v12, v0, 0x20

    if-eqz v12, :cond_5

    move-object v12, v8

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    goto :goto_6

    :cond_6
    move-wide/from16 v2, p10

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    move-object v13, v8

    goto :goto_7

    :cond_7
    move-object/from16 v13, p12

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    move-object/from16 p14, v8

    :goto_8
    move-object p1, p0

    move-object/from16 p6, v1

    move-wide/from16 p11, v2

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move-object/from16 p7, v9

    move-wide/from16 p8, v10

    move-object/from16 p10, v12

    move-object/from16 p13, v13

    goto :goto_9

    :cond_8
    move-object/from16 p14, p13

    goto :goto_8

    :goto_9
    invoke-direct/range {p1 .. p14}, Lio/github/cherrywechat/network/model/SavedMusicItem;-><init>(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/SavedMusicItem;JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/SavedMusicItem;
    .locals 13

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    iget-object v5, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    iget-object v6, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p6

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    iget-object v9, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p9

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    iget-wide v10, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    goto :goto_6

    :cond_6
    move-wide/from16 v10, p10

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    iget-object v12, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v12, p12

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    move-object/from16 p14, v0

    :goto_8
    move-object p1, p0

    move-wide p2, v1

    move-wide/from16 p4, v3

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-wide/from16 p8, v7

    move-object/from16 p10, v9

    move-wide/from16 p11, v10

    move-object/from16 p13, v12

    goto :goto_9

    :cond_8
    move-object/from16 p14, p13

    goto :goto_8

    :goto_9
    invoke-virtual/range {p1 .. p14}, Lio/github/cherrywechat/network/model/SavedMusicItem;->copy(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lio/github/cherrywechat/network/model/SavedMusicItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/SavedMusicItem;LWa;LCx;)V
    .locals 5

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-wide/16 v0, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    cmp-long p2, v2, v0

    if-eqz p2, :cond_1

    :goto_0
    iget-wide v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    invoke-interface {p1}, LWa;->c()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    cmp-long p2, v2, v0

    if-eqz p2, :cond_3

    :goto_1
    iget-wide v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    invoke-interface {p1}, LWa;->c()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v2, ""

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    invoke-static {p2, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    invoke-static {p2, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    :goto_3
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    cmp-long p2, v3, v0

    if-eqz p2, :cond_9

    :goto_4
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    invoke-interface {p1}, LWa;->c()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    invoke-static {p2, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    :goto_5
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_b
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_c

    goto :goto_6

    :cond_c
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    cmp-long p2, v3, v0

    if-eqz p2, :cond_d

    :goto_6
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    invoke-interface {p1}, LWa;->c()V

    :cond_d
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_e

    goto :goto_7

    :cond_e
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    invoke-static {p2, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    :goto_7
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_f
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_10

    goto :goto_8

    :cond_10
    iget-object p2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    invoke-static {p2, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_11

    :goto_8
    iget-object p0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_11
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lio/github/cherrywechat/network/model/SavedMusicItem;
    .locals 14

    new-instance v0, Lio/github/cherrywechat/network/model/SavedMusicItem;

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-wide/from16 v7, p7

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lio/github/cherrywechat/network/model/SavedMusicItem;-><init>(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/SavedMusicItem;

    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAlbum()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    return-object v0
.end method

.method public final getAlbumId()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    return-wide v0
.end method

.method public final getArtist()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuration()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    return-wide v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    return-wide v0
.end method

.method public final getSongId()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-wide v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-wide v2, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SavedMusicItem(songId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->songId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", albumId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->albumId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", artist="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->artist:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->size:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", album="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->album:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/SavedMusicItem;->imageUrl:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
