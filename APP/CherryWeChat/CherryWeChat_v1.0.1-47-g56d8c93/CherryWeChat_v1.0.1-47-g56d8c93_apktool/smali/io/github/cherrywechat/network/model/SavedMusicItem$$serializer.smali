.class public final synthetic Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/SavedMusicItem;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.SavedMusicItem"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "songId"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "albumId"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "title"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "artist"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "size"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "url"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "duration"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "album"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[LQm;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    const/16 v0, 0x9

    new-array v0, v0, [LQm;

    sget-object v1, Lup;->a:Lup;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v2, Lsz;->a:Lsz;

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const/4 v1, 0x7

    aput-object v2, v0, v1

    const/16 v1, 0x8

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/SavedMusicItem;
    .locals 23

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;->descriptor:LCx;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LJc;->B(LCx;)LVa;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move v8, v3

    move-wide v9, v4

    move-wide v11, v9

    move-wide v15, v11

    move-wide/from16 v18, v15

    move-object v13, v6

    move-object v14, v13

    move-object/from16 v17, v14

    move-object/from16 v20, v17

    move-object/from16 v21, v20

    move v4, v2

    :goto_0
    if-eqz v4, :cond_0

    invoke-interface {v1, v0}, LVa;->j(LCx;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lym;

    invoke-direct {v0, v5}, Lym;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v5, 0x8

    invoke-interface {v1, v0, v5}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit16 v8, v8, 0x100

    goto :goto_0

    :pswitch_1
    const/4 v5, 0x7

    invoke-interface {v1, v0, v5}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit16 v8, v8, 0x80

    goto :goto_0

    :pswitch_2
    const/4 v5, 0x6

    invoke-interface {v1, v0, v5}, LVa;->A(LCx;I)J

    move-result-wide v18

    or-int/lit8 v8, v8, 0x40

    goto :goto_0

    :pswitch_3
    const/4 v5, 0x5

    invoke-interface {v1, v0, v5}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v8, v8, 0x20

    goto :goto_0

    :pswitch_4
    const/4 v5, 0x4

    invoke-interface {v1, v0, v5}, LVa;->A(LCx;I)J

    move-result-wide v15

    or-int/lit8 v8, v8, 0x10

    goto :goto_0

    :pswitch_5
    const/4 v5, 0x3

    invoke-interface {v1, v0, v5}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v14

    or-int/lit8 v8, v8, 0x8

    goto :goto_0

    :pswitch_6
    const/4 v5, 0x2

    invoke-interface {v1, v0, v5}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v13

    or-int/lit8 v8, v8, 0x4

    goto :goto_0

    :pswitch_7
    invoke-interface {v1, v0, v2}, LVa;->A(LCx;I)J

    move-result-wide v11

    or-int/lit8 v8, v8, 0x2

    goto :goto_0

    :pswitch_8
    invoke-interface {v1, v0, v3}, LVa;->A(LCx;I)J

    move-result-wide v9

    or-int/lit8 v8, v8, 0x1

    goto :goto_0

    :pswitch_9
    move v4, v3

    goto :goto_0

    :cond_0
    invoke-interface {v1, v0}, LVa;->r(LCx;)V

    new-instance v7, Lio/github/cherrywechat/network/model/SavedMusicItem;

    const/16 v22, 0x0

    invoke-direct/range {v7 .. v22}, Lio/github/cherrywechat/network/model/SavedMusicItem;-><init>(IJJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;LGx;)V

    return-object v7

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
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
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/SavedMusicItem;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/SavedMusicItem;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/SavedMusicItem;->write$Self$app_release(Lio/github/cherrywechat/network/model/SavedMusicItem;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/SavedMusicItem;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/SavedMusicItem$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/SavedMusicItem;)V

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
