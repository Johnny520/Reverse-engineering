.class public final synthetic Lj8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;II)V
    .locals 0

    iput p3, p0, Lj8;->a:I

    iput-object p1, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, Lj8;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->u0(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->h(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->s(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->J(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->y(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->C(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->H(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->v(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->l(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->F(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->r(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->t(Lparty/iroiro/luajava/Lua;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->L(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->x(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->z(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->e(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->p(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->v(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->p(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->j(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->l(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->e(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->b0(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->k(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->w(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->v(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->G(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->K(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->R(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lj8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lj8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->i(Lparty/iroiro/luajava/Lua;I)LTC;

    move-result-object v0

    return-object v0

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
