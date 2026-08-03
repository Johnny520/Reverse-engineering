.class public final synthetic Lio/github/cherrywechat/network/model/UpdateType$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/UpdateType;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/UpdateType$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/UpdateType$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/UpdateType$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/UpdateType$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.UpdateType"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "name"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "label"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "color"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[LQm;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [LQm;

    sget-object v1, Lsz;->a:Lsz;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/UpdateType;
    .locals 10

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v2

    move-object v6, v3

    move-object v7, v6

    move-object v8, v7

    move v3, v1

    :goto_0
    if-eqz v3, :cond_4

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v4

    const/4 v9, -0x1

    if-eq v4, v9, :cond_3

    if-eqz v4, :cond_2

    if-eq v4, v1, :cond_1

    const/4 v8, 0x2

    if-ne v4, v8, :cond_0

    invoke-interface {p1, v0, v8}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v5, v5, 0x4

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v4}, Lym;-><init>(I)V

    throw p1

    :cond_1
    invoke-interface {p1, v0, v1}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v7

    or-int/lit8 v5, v5, 0x2

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0, v2}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v6

    or-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    move v3, v2

    goto :goto_0

    :cond_4
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance v4, Lio/github/cherrywechat/network/model/UpdateType;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lio/github/cherrywechat/network/model/UpdateType;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LGx;)V

    return-object v4
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/UpdateType;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/UpdateType;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/UpdateType;->write$Self$app_release(Lio/github/cherrywechat/network/model/UpdateType;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/UpdateType;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/UpdateType;)V

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
