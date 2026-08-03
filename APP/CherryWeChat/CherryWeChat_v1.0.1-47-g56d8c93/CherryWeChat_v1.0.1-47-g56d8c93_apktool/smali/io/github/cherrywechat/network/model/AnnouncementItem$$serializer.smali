.class public final synthetic Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/AnnouncementItem;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.AnnouncementItem"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "id"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "title"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "content"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "type"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "isPopup"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "canClose"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "targetUsers"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "betaUserList"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[LQm;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    invoke-static {}, Lio/github/cherrywechat/network/model/AnnouncementItem;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQm;

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v0

    const/16 v2, 0x8

    new-array v2, v2, [LQm;

    sget-object v3, Lsz;->a:Lsz;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v4, 0x3

    aput-object v3, v2, v4

    sget-object v4, LU5;->a:LU5;

    const/4 v5, 0x4

    aput-object v4, v2, v5

    const/4 v5, 0x5

    aput-object v4, v2, v5

    const/4 v4, 0x6

    aput-object v3, v2, v4

    aput-object v0, v2, v1

    return-object v2
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/AnnouncementItem;
    .locals 17

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;->descriptor:LCx;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LJc;->B(LCx;)LVa;

    move-result-object v1

    invoke-static {}, Lio/github/cherrywechat/network/model/AnnouncementItem;->access$get$childSerializers$cp()[LDn;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v8, v5

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v14, v11

    move-object v15, v14

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v5, v3

    :goto_0
    if-eqz v5, :cond_0

    invoke-interface {v1, v0}, LVa;->j(LCx;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lym;

    invoke-direct {v0, v6}, Lym;-><init>(I)V

    throw v0

    :pswitch_0
    const/4 v6, 0x7

    aget-object v16, v2, v6

    invoke-interface/range {v16 .. v16}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, LQm;

    invoke-interface {v1, v0, v6, v4, v15}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Ljava/util/List;

    or-int/lit16 v7, v7, 0x80

    goto :goto_0

    :pswitch_1
    const/4 v4, 0x6

    invoke-interface {v1, v0, v4}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v14

    or-int/lit8 v7, v7, 0x40

    goto :goto_0

    :pswitch_2
    const/4 v4, 0x5

    invoke-interface {v1, v0, v4}, LVa;->s(LCx;I)Z

    move-result v13

    or-int/lit8 v7, v7, 0x20

    goto :goto_0

    :pswitch_3
    const/4 v4, 0x4

    invoke-interface {v1, v0, v4}, LVa;->s(LCx;I)Z

    move-result v12

    or-int/lit8 v7, v7, 0x10

    goto :goto_0

    :pswitch_4
    const/4 v4, 0x3

    invoke-interface {v1, v0, v4}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v11

    or-int/lit8 v7, v7, 0x8

    goto :goto_0

    :pswitch_5
    const/4 v4, 0x2

    invoke-interface {v1, v0, v4}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v7, v7, 0x4

    goto :goto_0

    :pswitch_6
    invoke-interface {v1, v0, v3}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v7, v7, 0x2

    goto :goto_0

    :pswitch_7
    const/4 v4, 0x0

    invoke-interface {v1, v0, v4}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v7, v7, 0x1

    goto :goto_0

    :pswitch_8
    const/4 v4, 0x0

    move v5, v4

    goto :goto_0

    :cond_0
    invoke-interface {v1, v0}, LVa;->r(LCx;)V

    new-instance v6, Lio/github/cherrywechat/network/model/AnnouncementItem;

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v16}, Lio/github/cherrywechat/network/model/AnnouncementItem;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;LGx;)V

    return-object v6

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
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/AnnouncementItem;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/AnnouncementItem;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/AnnouncementItem;->write$Self$app_release(Lio/github/cherrywechat/network/model/AnnouncementItem;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/AnnouncementItem;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/AnnouncementItem$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/AnnouncementItem;)V

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
