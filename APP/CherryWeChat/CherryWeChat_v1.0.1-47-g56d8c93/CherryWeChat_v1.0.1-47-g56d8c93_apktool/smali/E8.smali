.class public final synthetic LE8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V
    .locals 0

    iput p4, p0, LE8;->a:I

    iput-object p1, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, LE8;->c:I

    iput-object p3, p0, LE8;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LE8;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LE8;->c:I

    iget-object v1, p0, LE8;->d:Ljava/lang/String;

    iget-object v2, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/NetworkAPI;->s(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, LE8;->c:I

    iget-object v1, p0, LE8;->d:Ljava/lang/String;

    iget-object v2, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/NetworkAPI;->k(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget v0, p0, LE8;->c:I

    iget-object v1, p0, LE8;->d:Ljava/lang/String;

    iget-object v2, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->x(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget v0, p0, LE8;->c:I

    iget-object v1, p0, LE8;->d:Ljava/lang/String;

    iget-object v2, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->H(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget v0, p0, LE8;->c:I

    iget-object v1, p0, LE8;->d:Ljava/lang/String;

    iget-object v2, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->e0(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget v0, p0, LE8;->c:I

    iget-object v1, p0, LE8;->d:Ljava/lang/String;

    iget-object v2, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->d(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget v0, p0, LE8;->c:I

    iget-object v1, p0, LE8;->d:Ljava/lang/String;

    iget-object v2, p0, LE8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->h(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
