.class public final Lio/github/cherrywechat/network/model/MusicTrack;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/MusicTrack$$serializer;,
        Lio/github/cherrywechat/network/model/MusicTrack$Companion;
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

.field public static final Companion:Lio/github/cherrywechat/network/model/MusicTrack$Companion;


# instance fields
.field private final album:Lio/github/cherrywechat/network/model/MusicAlbum;

.field private final artists:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicArtist;",
            ">;"
        }
    .end annotation
.end field

.field private final duration:J

.field private final hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

.field private final id:J

.field private final lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

.field private final mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/github/cherrywechat/network/model/MusicTrack$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/MusicTrack$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicTrack;->Companion:Lio/github/cherrywechat/network/model/MusicTrack$Companion;

    new-instance v0, Ld;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Ld;-><init>(I)V

    const/4 v2, 0x2

    invoke-static {v2, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    const/16 v3, 0x8

    new-array v3, v3, [LDn;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    aput-object v0, v3, v2

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    const/4 v0, 0x5

    aput-object v1, v3, v0

    const/4 v0, 0x6

    aput-object v1, v3, v0

    const/4 v0, 0x7

    aput-object v1, v3, v0

    sput-object v3, Lio/github/cherrywechat/network/model/MusicTrack;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0xff

    const/4 v12, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lio/github/cherrywechat/network/model/MusicTrack;-><init>(JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;LGx;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const-wide/16 v0, 0x0

    if-nez p12, :cond_0

    iput-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    goto :goto_0

    :cond_0
    iput-wide p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p4, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 3
    sget-object p2, LKf;->a:LKf;

    .line 4
    iput-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    goto :goto_2

    :cond_2
    iput-object p5, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    goto :goto_3

    :cond_3
    iput-object p6, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    goto :goto_4

    :cond_4
    iput-wide p7, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    goto :goto_5

    :cond_5
    iput-object p9, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    goto :goto_6

    :cond_6
    iput-object p10, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-void

    :cond_7
    iput-object p11, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicArtist;",
            ">;",
            "Lio/github/cherrywechat/network/model/MusicAlbum;",
            "J",
            "Lio/github/cherrywechat/network/model/MusicQuality;",
            "Lio/github/cherrywechat/network/model/MusicQuality;",
            "Lio/github/cherrywechat/network/model/MusicQuality;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-wide p1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    .line 7
    iput-object p3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    .line 9
    iput-object p5, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    .line 10
    iput-wide p6, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    .line 11
    iput-object p8, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    .line 12
    iput-object p9, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    .line 13
    iput-object p10, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;ILOc;)V
    .locals 3

    and-int/lit8 p12, p11, 0x1

    const-wide/16 v0, 0x0

    if-eqz p12, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    const/4 v2, 0x0

    if-eqz p12, :cond_1

    move-object p3, v2

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    .line 14
    sget-object p4, LKf;->a:LKf;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move-object p5, v2

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-wide p6, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move-object p8, v2

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move-object p9, v2

    :cond_6
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_7

    move-object p11, v2

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-wide p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p11, p10

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p11}, Lio/github/cherrywechat/network/model/MusicTrack;-><init>(JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/MusicArtist$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicArtist$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/MusicTrack;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/MusicTrack;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/MusicTrack;JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/MusicTrack;
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    move-object v5, p1

    goto :goto_0

    :cond_3
    move-object/from16 v5, p5

    :goto_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-wide p1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    move-wide v6, p1

    goto :goto_1

    :cond_4
    move-wide/from16 v6, p6

    :goto_1
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    move-object v8, p1

    goto :goto_2

    :cond_5
    move-object/from16 v8, p8

    :goto_2
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    move-object v9, p1

    goto :goto_3

    :cond_6
    move-object/from16 v9, p9

    :goto_3
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    move-object v10, p1

    :goto_4
    move-object v0, p0

    goto :goto_5

    :cond_7
    move-object/from16 v10, p10

    goto :goto_4

    :goto_5
    invoke-virtual/range {v0 .. v10}, Lio/github/cherrywechat/network/model/MusicTrack;->copy(JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;)Lio/github/cherrywechat/network/model/MusicTrack;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/MusicTrack;LWa;LCx;)V
    .locals 5

    sget-object p2, Lio/github/cherrywechat/network/model/MusicTrack;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    :goto_0
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    invoke-interface {p1}, LWa;->c()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    if-eqz v0, :cond_3

    :goto_1
    sget-object v0, Lsz;->a:Lsz;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    sget-object v3, LKf;->a:LKf;

    invoke-static {v0, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_2
    const/4 v0, 0x2

    aget-object p2, p2, v0

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    if-eqz p2, :cond_7

    :goto_3
    sget-object p2, Lio/github/cherrywechat/network/model/MusicAlbum$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicAlbum$$serializer;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    invoke-interface {p1}, LWa;->f()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    cmp-long p2, v3, v1

    if-eqz p2, :cond_9

    :goto_4
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    invoke-interface {p1}, LWa;->c()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    if-eqz p2, :cond_b

    :goto_5
    sget-object p2, Lio/github/cherrywechat/network/model/MusicQuality$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicQuality$$serializer;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-interface {p1}, LWa;->f()V

    :cond_b
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_c

    goto :goto_6

    :cond_c
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    if-eqz p2, :cond_d

    :goto_6
    sget-object p2, Lio/github/cherrywechat/network/model/MusicQuality$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicQuality$$serializer;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-interface {p1}, LWa;->f()V

    :cond_d
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_e

    goto :goto_7

    :cond_e
    iget-object p2, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    if-eqz p2, :cond_f

    :goto_7
    sget-object p2, Lio/github/cherrywechat/network/model/MusicQuality$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicQuality$$serializer;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-interface {p1}, LWa;->f()V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicArtist;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lio/github/cherrywechat/network/model/MusicAlbum;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    return-wide v0
.end method

.method public final component6()Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-object v0
.end method

.method public final component7()Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-object v0
.end method

.method public final component8()Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;)Lio/github/cherrywechat/network/model/MusicTrack;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicArtist;",
            ">;",
            "Lio/github/cherrywechat/network/model/MusicAlbum;",
            "J",
            "Lio/github/cherrywechat/network/model/MusicQuality;",
            "Lio/github/cherrywechat/network/model/MusicQuality;",
            "Lio/github/cherrywechat/network/model/MusicQuality;",
            ")",
            "Lio/github/cherrywechat/network/model/MusicTrack;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/MusicTrack;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lio/github/cherrywechat/network/model/MusicTrack;-><init>(JLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/MusicTrack;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/MusicTrack;

    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAlbum()Lio/github/cherrywechat/network/model/MusicAlbum;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    return-object v0
.end method

.method public final getArtists()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/MusicArtist;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    return-object v0
.end method

.method public final getDuration()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    return-wide v0
.end method

.method public final getHMusic()Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    return-wide v0
.end method

.method public final getLMusic()Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-object v0
.end method

.method public final getMMusic()Lio/github/cherrywechat/network/model/MusicQuality;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

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

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/MusicAlbum;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/MusicQuality;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/MusicQuality;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/MusicQuality;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MusicTrack(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", artists="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->artists:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", album="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->album:Lio/github/cherrywechat/network/model/MusicAlbum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", hMusic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->hMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mMusic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->mMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lMusic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/MusicTrack;->lMusic:Lio/github/cherrywechat/network/model/MusicQuality;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
