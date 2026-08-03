.class public final synthetic Lm8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;II)V
    .locals 0

    iput p3, p0, Lm8;->a:I

    iput-object p1, p0, Lm8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, Lm8;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lm8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lm8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->B(Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lm8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lm8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->s(Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lm8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lm8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->y(Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lm8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lm8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->a(Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lm8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lm8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->N(Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lm8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Lm8;->c:I

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPI;->S(Lparty/iroiro/luajava/Lua;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
