.class public final synthetic Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/ThemeConfig;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.ThemeConfig"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "name"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "author"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "version"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "description"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "isFullBg"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "autoDarkTheme"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;->descriptor:LCx;

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

    const/4 v0, 0x6

    new-array v0, v0, [LQm;

    sget-object v1, Lsz;->a:Lsz;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LU5;->a:LU5;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/ThemeConfig;
    .locals 13

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v2

    move v10, v5

    move v11, v10

    move-object v6, v3

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move v3, v1

    :goto_0
    if-eqz v3, :cond_0

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    new-instance p1, Lym;

    invoke-direct {p1, v4}, Lym;-><init>(I)V

    throw p1

    :pswitch_0
    const/4 v4, 0x5

    invoke-interface {p1, v0, v4}, LVa;->s(LCx;I)Z

    move-result v11

    or-int/lit8 v5, v5, 0x20

    goto :goto_0

    :pswitch_1
    const/4 v4, 0x4

    invoke-interface {p1, v0, v4}, LVa;->s(LCx;I)Z

    move-result v10

    or-int/lit8 v5, v5, 0x10

    goto :goto_0

    :pswitch_2
    const/4 v4, 0x3

    invoke-interface {p1, v0, v4}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v5, v5, 0x8

    goto :goto_0

    :pswitch_3
    const/4 v4, 0x2

    invoke-interface {p1, v0, v4}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v5, v5, 0x4

    goto :goto_0

    :pswitch_4
    invoke-interface {p1, v0, v1}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v7

    or-int/lit8 v5, v5, 0x2

    goto :goto_0

    :pswitch_5
    invoke-interface {p1, v0, v2}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v6

    or-int/lit8 v5, v5, 0x1

    goto :goto_0

    :pswitch_6
    move v3, v2

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance v4, Lio/github/cherrywechat/network/model/ThemeConfig;

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v12}, Lio/github/cherrywechat/network/model/ThemeConfig;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLGx;)V

    return-object v4

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/ThemeConfig;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/ThemeConfig;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/ThemeConfig;->write$Self$app_release(Lio/github/cherrywechat/network/model/ThemeConfig;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/ThemeConfig;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/ThemeConfig;)V

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
