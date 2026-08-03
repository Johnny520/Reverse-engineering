.class public final synthetic LKs;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LKs;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final __call(Lparty/iroiro/luajava/Lua;)I
    .locals 1

    iget v0, p0, LKs;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->j(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->p(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->c(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->m(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_3
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->o(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_4
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->r(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_5
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->e(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_6
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->g(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_7
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->a(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_8
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->l(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_9
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->q(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_a
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->i(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->k(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_c
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->n(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_d
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->h(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_e
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->d(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_f
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->f(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_10
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/WeChatAPI;->b(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_11
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->f(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_12
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->c(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_13
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->l(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_14
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->n(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_15
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->g(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_16
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->m(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_17
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->a(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
