.class public final synthetic Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/ThemeStoreItem;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.ThemeStoreItem"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "id"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "name"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "author"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "price"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "demoUrl"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "coverImage"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "screenshots"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "description"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "featured"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "downloadCount"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;->descriptor:LCx;

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

    sget-object v0, Lsz;->a:Lsz;

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v1

    invoke-static {v0}, LOj;->v(LQm;)LQm;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [LQm;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v4, 0x2

    aput-object v0, v3, v4

    sget-object v4, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;

    const/4 v5, 0x3

    aput-object v4, v3, v5

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v1, 0x5

    aput-object v2, v3, v1

    sget-object v1, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/ScreenshotsSerializer;

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v1, 0x7

    aput-object v0, v3, v1

    sget-object v0, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;

    const/16 v1, 0x8

    aput-object v0, v3, v1

    sget-object v0, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantIntSerializer;

    const/16 v1, 0x9

    aput-object v0, v3, v1

    return-object v3
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/ThemeStoreItem;
    .locals 21

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;->descriptor:LCx;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LJc;->B(LCx;)LVa;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v9, v4

    move-object v10, v9

    move-object v11, v10

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v17, v15

    move-wide v12, v5

    const/4 v8, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move v5, v2

    :goto_0
    if-eqz v5, :cond_0

    invoke-interface {v1, v0}, LVa;->j(LCx;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lym;

    invoke-direct {v0, v6}, Lym;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantIntSerializer;

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v3, 0x9

    invoke-interface {v1, v0, v3, v6, v7}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v19

    or-int/lit16 v8, v8, 0x200

    goto :goto_0

    :pswitch_1
    sget-object v3, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v7, 0x8

    invoke-interface {v1, v0, v7, v3, v6}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    or-int/lit16 v8, v8, 0x100

    goto :goto_0

    :pswitch_2
    const/4 v3, 0x7

    invoke-interface {v1, v0, v3}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit16 v8, v8, 0x80

    goto :goto_0

    :pswitch_3
    sget-object v3, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/ScreenshotsSerializer;

    const/4 v6, 0x6

    invoke-interface {v1, v0, v6, v3, v4}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    or-int/lit8 v8, v8, 0x40

    goto :goto_0

    :pswitch_4
    sget-object v3, Lsz;->a:Lsz;

    const/4 v6, 0x5

    invoke-interface {v1, v0, v6, v3, v15}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x20

    goto :goto_0

    :pswitch_5
    sget-object v3, Lsz;->a:Lsz;

    const/4 v6, 0x4

    invoke-interface {v1, v0, v6, v3, v14}, LVa;->i(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x10

    goto :goto_0

    :pswitch_6
    sget-object v3, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const/4 v7, 0x3

    invoke-interface {v1, v0, v7, v3, v6}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v12

    or-int/lit8 v8, v8, 0x8

    goto :goto_0

    :pswitch_7
    const/4 v3, 0x2

    invoke-interface {v1, v0, v3}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v11

    or-int/lit8 v8, v8, 0x4

    goto/16 :goto_0

    :pswitch_8
    invoke-interface {v1, v0, v2}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v8, v8, 0x2

    goto/16 :goto_0

    :pswitch_9
    const/4 v3, 0x0

    invoke-interface {v1, v0, v3}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :pswitch_a
    const/4 v3, 0x0

    move v5, v3

    goto/16 :goto_0

    :cond_0
    invoke-interface {v1, v0}, LVa;->r(LCx;)V

    new-instance v7, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    const/16 v20, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v7 .. v20}, Lio/github/cherrywechat/network/model/ThemeStoreItem;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZILGx;)V

    return-object v7

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
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
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/ThemeStoreItem;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/ThemeStoreItem;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->write$Self$app_release(Lio/github/cherrywechat/network/model/ThemeStoreItem;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/ThemeStoreItem;)V

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
