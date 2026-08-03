.class public final synthetic Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/FriendLinkData;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.FriendLinkData"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "items"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;->descriptor:LCx;

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

    invoke-static {}, Lio/github/cherrywechat/network/model/FriendLinkData;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LQm;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/FriendLinkData;
    .locals 10

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    invoke-static {}, Lio/github/cherrywechat/network/model/FriendLinkData;->access$get$childSerializers$cp()[LDn;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v2

    move v6, v3

    move-object v7, v4

    :goto_0
    if-eqz v5, :cond_2

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_1

    if-nez v8, :cond_0

    aget-object v6, v1, v3

    invoke-interface {v6}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LQm;

    invoke-interface {p1, v0, v3, v6, v7}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/util/List;

    move v6, v2

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v8}, Lym;-><init>(I)V

    throw p1

    :cond_1
    move v5, v3

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance p1, Lio/github/cherrywechat/network/model/FriendLinkData;

    invoke-direct {p1, v6, v7, v4}, Lio/github/cherrywechat/network/model/FriendLinkData;-><init>(ILjava/util/List;LGx;)V

    return-object p1
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/FriendLinkData;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/FriendLinkData;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/FriendLinkData;->write$Self$app_release(Lio/github/cherrywechat/network/model/FriendLinkData;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/FriendLinkData;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/FriendLinkData;)V

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
