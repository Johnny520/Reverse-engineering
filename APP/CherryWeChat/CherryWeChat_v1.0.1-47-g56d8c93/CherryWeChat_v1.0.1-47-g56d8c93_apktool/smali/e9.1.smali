.class public final synthetic Le9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Le9;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final __call(Lparty/iroiro/luajava/Lua;)I
    .locals 1

    iget v0, p0, Le9;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->o(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->m(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->h(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->x(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_3
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->c(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_4
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->g(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_5
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->E(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_6
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->u(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_7
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->s(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_8
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->i(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_9
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->f(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_a
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->q(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->B(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_c
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->F(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_d
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/MessageAPI;->a(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_e
    invoke-static {p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->i(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_f
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->a(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_10
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->c(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_11
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->b(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_12
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->f(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_13
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->d(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_14
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->h(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_15
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->g(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_16
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/HookAPI;->e(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_17
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->a(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_18
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->l(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_19
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->v(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1a
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->j(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1b
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->U(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1c
    invoke-static {p1}, Lio/github/cherrywechat/lua/api/CherryXposedAPI;->V(Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
