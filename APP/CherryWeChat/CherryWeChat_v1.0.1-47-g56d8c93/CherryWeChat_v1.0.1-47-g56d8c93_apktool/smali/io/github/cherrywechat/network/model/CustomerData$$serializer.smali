.class public final synthetic Lio/github/cherrywechat/network/model/CustomerData$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/CustomerData;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/CustomerData$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/CustomerData$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/CustomerData$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/CustomerData$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/CustomerData$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.CustomerData"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "customer"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "accessToken"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "expires"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "authorizedThemes"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/CustomerData$$serializer;->descriptor:LCx;

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

    invoke-static {}, Lio/github/cherrywechat/network/model/CustomerData;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [LQm;

    sget-object v2, Lio/github/cherrywechat/network/model/CustomerInfo$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/CustomerInfo$$serializer;

    invoke-static {v2}, LOj;->v(LQm;)LQm;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    sget-object v3, Lsz;->a:Lsz;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    sget-object v3, Lup;->a:Lup;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/CustomerData;
    .locals 16

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/CustomerData$$serializer;->descriptor:LCx;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LJc;->B(LCx;)LVa;

    move-result-object v1

    invoke-static {}, Lio/github/cherrywechat/network/model/CustomerData;->access$get$childSerializers$cp()[LDn;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move v9, v4

    move-object v10, v5

    move-object v11, v10

    move-object v14, v11

    move-wide v12, v6

    move v5, v3

    :goto_0
    if-eqz v5, :cond_5

    invoke-interface {v1, v0}, LVa;->j(LCx;)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_4

    if-eqz v6, :cond_3

    if-eq v6, v3, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    const/4 v7, 0x3

    if-ne v6, v7, :cond_0

    aget-object v6, v2, v7

    invoke-interface {v6}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LQm;

    invoke-interface {v1, v0, v7, v6, v14}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Ljava/util/List;

    or-int/lit8 v9, v9, 0x8

    goto :goto_0

    :cond_0
    new-instance v0, Lym;

    invoke-direct {v0, v6}, Lym;-><init>(I)V

    throw v0

    :cond_1
    invoke-interface {v1, v0, v7}, LVa;->A(LCx;I)J

    move-result-wide v12

    or-int/lit8 v9, v9, 0x4

    goto :goto_0

    :cond_2
    invoke-interface {v1, v0, v3}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v11

    or-int/lit8 v9, v9, 0x2

    goto :goto_0

    :cond_3
    sget-object v6, Lio/github/cherrywechat/network/model/CustomerInfo$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/CustomerInfo$$serializer;

    invoke-interface {v1, v0, v4, v6, v10}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lio/github/cherrywechat/network/model/CustomerInfo;

    or-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_4
    move v5, v4

    goto :goto_0

    :cond_5
    invoke-interface {v1, v0}, LVa;->r(LCx;)V

    new-instance v8, Lio/github/cherrywechat/network/model/CustomerData;

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v15}, Lio/github/cherrywechat/network/model/CustomerData;-><init>(ILio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;LGx;)V

    return-object v8
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/CustomerData$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/CustomerData;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/CustomerData$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/CustomerData;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/CustomerData$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/CustomerData;->write$Self$app_release(Lio/github/cherrywechat/network/model/CustomerData;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/CustomerData;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/CustomerData$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/CustomerData;)V

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
