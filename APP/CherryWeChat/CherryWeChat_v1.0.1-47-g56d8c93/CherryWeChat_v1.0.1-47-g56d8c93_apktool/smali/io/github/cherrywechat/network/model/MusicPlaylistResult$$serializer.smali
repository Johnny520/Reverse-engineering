.class public final synthetic Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/MusicPlaylistResult;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.MusicPlaylistResult"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "id"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "name"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "coverImgUrl"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "description"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "tracks"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->descriptor:LCx;

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

    invoke-static {}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/4 v1, 0x5

    new-array v1, v1, [LQm;

    const/4 v2, 0x0

    sget-object v3, Lup;->a:Lup;

    aput-object v3, v1, v2

    sget-object v2, Lsz;->a:Lsz;

    invoke-static {v2}, LOj;->v(LQm;)LQm;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v2}, LOj;->v(LQm;)LQm;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x3

    invoke-static {v2}, LOj;->v(LQm;)LQm;

    move-result-object v2

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/MusicPlaylistResult;
    .locals 17

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->descriptor:LCx;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LJc;->B(LCx;)LVa;

    move-result-object v1

    invoke-static {}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->access$get$childSerializers$cp()[LDn;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move v9, v4

    move-wide v10, v5

    move-object v12, v7

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move v5, v3

    :goto_0
    if-eqz v5, :cond_6

    invoke-interface {v1, v0}, LVa;->j(LCx;)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_5

    if-eqz v6, :cond_4

    if-eq v6, v3, :cond_3

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1

    const/4 v7, 0x4

    if-ne v6, v7, :cond_0

    aget-object v6, v2, v7

    invoke-interface {v6}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LQm;

    invoke-interface {v1, v0, v7, v6, v15}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Ljava/util/List;

    or-int/lit8 v9, v9, 0x10

    goto :goto_0

    :cond_0
    new-instance v0, Lym;

    invoke-direct {v0, v6}, Lym;-><init>(I)V

    throw v0

    :cond_1
    sget-object v6, Lsz;->a:Lsz;

    invoke-interface {v1, v0, v7, v6, v14}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x8

    goto :goto_0

    :cond_2
    sget-object v6, Lsz;->a:Lsz;

    invoke-interface {v1, v0, v7, v6, v13}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x4

    goto :goto_0

    :cond_3
    sget-object v6, Lsz;->a:Lsz;

    invoke-interface {v1, v0, v3, v6, v12}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x2

    goto :goto_0

    :cond_4
    invoke-interface {v1, v0, v4}, LVa;->A(LCx;I)J

    move-result-wide v10

    or-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_5
    move v5, v4

    goto :goto_0

    :cond_6
    invoke-interface {v1, v0}, LVa;->r(LCx;)V

    new-instance v8, Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v16}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LGx;)V

    return-object v8
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/MusicPlaylistResult;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/MusicPlaylistResult;->write$Self$app_release(Lio/github/cherrywechat/network/model/MusicPlaylistResult;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/MusicPlaylistResult;)V

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
