.class public final synthetic Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.ExchangeThemeResponseData"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "name"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "id"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "baiduInputSkinLink"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;->descriptor:LCx;

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

    sget-object v0, Lsz;->a:Lsz;

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v1

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v2

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [LQm;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const/4 v1, 0x2

    aput-object v0, v3, v1

    return-object v3
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;
    .locals 10

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;->descriptor:LCx;

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

    const/4 v9, 0x2

    if-ne v4, v9, :cond_0

    sget-object v4, Lsz;->a:Lsz;

    invoke-interface {p1, v0, v9, v4, v8}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x4

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v4}, Lym;-><init>(I)V

    throw p1

    :cond_1
    sget-object v4, Lsz;->a:Lsz;

    invoke-interface {p1, v0, v1, v4, v7}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x2

    goto :goto_0

    :cond_2
    sget-object v4, Lsz;->a:Lsz;

    invoke-interface {p1, v0, v2, v4, v6}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    move v3, v2

    goto :goto_0

    :cond_4
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance v4, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LGx;)V

    return-object v4
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;->write$Self$app_release(Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/ExchangeThemeResponseData$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/ExchangeThemeResponseData;)V

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
