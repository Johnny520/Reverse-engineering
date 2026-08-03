.class public final synthetic Lio/github/cherrywechat/lua/api/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;


# direct methods
.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;I)V
    .locals 0

    iput p2, p0, Lio/github/cherrywechat/lua/api/a;->a:I

    iput-object p1, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->i(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->M(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->E(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->k(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->j(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->w(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lio/github/cherrywechat/lua/api/a;->b:Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->p(Lio/github/cherrywechat/lua/api/CherryThreadAPI$LuaTaskRef;)LTC;

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
