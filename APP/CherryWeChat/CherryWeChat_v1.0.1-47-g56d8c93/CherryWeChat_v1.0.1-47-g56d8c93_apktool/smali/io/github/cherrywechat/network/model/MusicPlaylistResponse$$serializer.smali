.class public final synthetic Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/MusicPlaylistResponse;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.MusicPlaylistResponse"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "code"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "result"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;->descriptor:LCx;

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

    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [LQm;

    sget-object v2, LHl;->a:LHl;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/MusicPlaylistResponse;
    .locals 10

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v1

    move v5, v2

    move v6, v5

    move-object v7, v3

    :goto_0
    if-eqz v4, :cond_3

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_2

    if-eqz v8, :cond_1

    if-ne v8, v1, :cond_0

    sget-object v8, Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/MusicPlaylistResult$$serializer;

    invoke-interface {p1, v0, v1, v8, v7}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/github/cherrywechat/network/model/MusicPlaylistResult;

    or-int/lit8 v5, v5, 0x2

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v8}, Lym;-><init>(I)V

    throw p1

    :cond_1
    invoke-interface {p1, v0, v2}, LVa;->w(LCx;I)I

    move-result v6

    or-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move v4, v2

    goto :goto_0

    :cond_3
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance p1, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;

    invoke-direct {p1, v5, v6, v7, v3}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;-><init>(IILio/github/cherrywechat/network/model/MusicPlaylistResult;LGx;)V

    return-object p1
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/MusicPlaylistResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/MusicPlaylistResponse;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;->write$Self$app_release(Lio/github/cherrywechat/network/model/MusicPlaylistResponse;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/MusicPlaylistResponse;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/MusicPlaylistResponse$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/MusicPlaylistResponse;)V

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
