.class public final synthetic Lio/github/cherrywechat/network/model/MusicTrack$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/MusicTrack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwj;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/MusicTrack$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicTrack$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.MusicTrack"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "id"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "name"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "artists"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "album"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "duration"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "hMusic"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "mMusic"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "lMusic"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[LQm;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    invoke-static {}, Lio/github/cherrywechat/network/model/MusicTrack;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/16 v1, 0x8

    new-array v1, v1, [LQm;

    sget-object v2, Lup;->a:Lup;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v3, Lsz;->a:Lsz;

    invoke-static {v3}, LOj;->v(LQm;)LQm;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v3, 0x2

    aget-object v0, v0, v3

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v3

    sget-object v0, Lio/github/cherrywechat/network/model/MusicAlbum$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicAlbum$$serializer;

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v0

    const/4 v3, 0x3

    aput-object v0, v1, v3

    const/4 v0, 0x4

    aput-object v2, v1, v0

    sget-object v0, Lio/github/cherrywechat/network/model/MusicQuality$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicQuality$$serializer;

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x6

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x7

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/MusicTrack;
    .locals 21

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->descriptor:LCx;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LJc;->B(LCx;)LVa;

    move-result-object v1

    invoke-static {}, Lio/github/cherrywechat/network/model/MusicTrack;->access$get$childSerializers$cp()[LDn;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-wide v10, v5

    move-wide v15, v10

    move-object v5, v7

    move-object v6, v5

    move-object v12, v6

    move-object v13, v12

    move-object v14, v13

    const/4 v8, 0x1

    const/4 v9, 0x0

    :goto_0
    if-eqz v8, :cond_0

    invoke-interface {v1, v0}, LVa;->j(LCx;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    new-instance v0, Lym;

    invoke-direct {v0, v4}, Lym;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v4, Lio/github/cherrywechat/network/model/MusicQuality$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicQuality$$serializer;

    const/4 v3, 0x7

    invoke-interface {v1, v0, v3, v4, v6}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lio/github/cherrywechat/network/model/MusicQuality;

    or-int/lit16 v9, v9, 0x80

    goto :goto_0

    :pswitch_1
    sget-object v3, Lio/github/cherrywechat/network/model/MusicQuality$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicQuality$$serializer;

    const/4 v4, 0x6

    invoke-interface {v1, v0, v4, v3, v5}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lio/github/cherrywechat/network/model/MusicQuality;

    or-int/lit8 v9, v9, 0x40

    goto :goto_0

    :pswitch_2
    sget-object v3, Lio/github/cherrywechat/network/model/MusicQuality$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicQuality$$serializer;

    const/4 v4, 0x5

    invoke-interface {v1, v0, v4, v3, v7}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lio/github/cherrywechat/network/model/MusicQuality;

    or-int/lit8 v9, v9, 0x20

    goto :goto_0

    :pswitch_3
    const/4 v3, 0x4

    invoke-interface {v1, v0, v3}, LVa;->A(LCx;I)J

    move-result-wide v15

    or-int/lit8 v9, v9, 0x10

    goto :goto_0

    :pswitch_4
    sget-object v3, Lio/github/cherrywechat/network/model/MusicAlbum$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicAlbum$$serializer;

    const/4 v4, 0x3

    invoke-interface {v1, v0, v4, v3, v14}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lio/github/cherrywechat/network/model/MusicAlbum;

    or-int/lit8 v9, v9, 0x8

    goto :goto_0

    :pswitch_5
    const/4 v3, 0x2

    aget-object v4, v2, v3

    invoke-interface {v4}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LQm;

    invoke-interface {v1, v0, v3, v4, v13}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/util/List;

    or-int/lit8 v9, v9, 0x4

    goto :goto_0

    :pswitch_6
    sget-object v3, Lsz;->a:Lsz;

    const/4 v4, 0x1

    invoke-interface {v1, v0, v4, v3, v12}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x2

    goto :goto_0

    :pswitch_7
    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-interface {v1, v0, v3}, LVa;->A(LCx;I)J

    move-result-wide v10

    or-int/lit8 v9, v9, 0x1

    goto :goto_0

    :pswitch_8
    const/4 v3, 0x0

    const/4 v4, 0x1

    move v8, v3

    goto :goto_0

    :cond_0
    invoke-interface {v1, v0}, LVa;->r(LCx;)V

    new-instance v8, Lio/github/cherrywechat/network/model/MusicTrack;

    const/16 v20, 0x0

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v17, v7

    invoke-direct/range {v8 .. v20}, Lio/github/cherrywechat/network/model/MusicTrack;-><init>(IJLjava/lang/String;Ljava/util/List;Lio/github/cherrywechat/network/model/MusicAlbum;JLio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;Lio/github/cherrywechat/network/model/MusicQuality;LGx;)V

    return-object v8

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/MusicTrack;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/MusicTrack;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/MusicTrack;->write$Self$app_release(Lio/github/cherrywechat/network/model/MusicTrack;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/MusicTrack;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/MusicTrack$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/MusicTrack;)V

    return-void
.end method

.method public typeParametersSerializers()[LQm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    sget-object v0, LGu;->i:[LQm;

    return-object v0
.end method
