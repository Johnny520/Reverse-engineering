.class public final synthetic Lio/github/cherrywechat/network/model/ApiResponse$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/ApiResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwj;"
    }
.end annotation


# instance fields
.field private final descriptor:LCx;

.field private final synthetic typeSerial0:LQm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQm;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    new-instance v0, LSt;

    const-string v1, "io.github.cherrywechat.network.model.ApiResponse"

    const/4 v2, 0x4

    invoke-direct {v0, v1, p0, v2}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v1, "code"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    const-string v1, "msg"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    const-string v1, "message"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    const-string v1, "data"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->descriptor:LCx;

    return-void
.end method

.method public constructor <init>(LQm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQm;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->typeSerial0:LQm;

    return-void
.end method

.method private final synthetic getTypeSerial0()LQm;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->typeSerial0:LQm;

    return-object v0
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

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->typeSerial0:LQm;

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [LQm;

    sget-object v2, LHl;->a:LHl;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lsz;->a:Lsz;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/ApiResponse;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJc;",
            ")",
            "Lio/github/cherrywechat/network/model/ApiResponse<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v2

    move v6, v5

    move-object v7, v3

    move-object v8, v7

    move-object v9, v8

    move v3, v1

    :goto_0
    if-eqz v3, :cond_5

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v4

    const/4 v10, -0x1

    if-eq v4, v10, :cond_4

    if-eqz v4, :cond_3

    if-eq v4, v1, :cond_2

    const/4 v10, 0x2

    if-eq v4, v10, :cond_1

    const/4 v10, 0x3

    if-ne v4, v10, :cond_0

    iget-object v4, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->typeSerial0:LQm;

    check-cast v4, LQm;

    invoke-interface {p1, v0, v10, v4, v9}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit8 v5, v5, 0x8

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v4}, Lym;-><init>(I)V

    throw p1

    :cond_1
    invoke-interface {p1, v0, v10}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v5, v5, 0x4

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0, v1}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v7

    or-int/lit8 v5, v5, 0x2

    goto :goto_0

    :cond_3
    invoke-interface {p1, v0, v2}, LVa;->w(LCx;I)I

    move-result v6

    or-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    move v3, v2

    goto :goto_0

    :cond_5
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance v4, Lio/github/cherrywechat/network/model/ApiResponse;

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v10}, Lio/github/cherrywechat/network/model/ApiResponse;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;LGx;)V

    return-object v4
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/ApiResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/ApiResponse;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOf;",
            "Lio/github/cherrywechat/network/model/ApiResponse<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    iget-object p1, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->typeSerial0:LQm;

    const/4 v1, 0x0

    invoke-static {p2, v1, v0, p1}, Lio/github/cherrywechat/network/model/ApiResponse;->write$Self$app_release(Lio/github/cherrywechat/network/model/ApiResponse;LWa;LCx;LQm;)V

    throw v1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/ApiResponse;)V

    return-void
.end method

.method public final typeParametersSerializers()[LQm;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse$$serializer;->typeSerial0:LQm;

    const/4 v1, 0x1

    new-array v1, v1, [LQm;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method
