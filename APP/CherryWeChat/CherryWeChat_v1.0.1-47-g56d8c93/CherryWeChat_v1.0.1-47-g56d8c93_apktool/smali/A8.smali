.class public final synthetic LA8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, LA8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA8;->d:Ljava/lang/String;

    iput-object p2, p0, LA8;->b:Lparty/iroiro/luajava/Lua;

    iput p3, p0, LA8;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V
    .locals 0

    .line 2
    iput p4, p0, LA8;->a:I

    iput-object p1, p0, LA8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, LA8;->c:I

    iput-object p3, p0, LA8;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, LA8;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LA8;->c:I

    iget-object v1, p0, LA8;->d:Ljava/lang/String;

    iget-object v2, p0, LA8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/NetworkAPI;->b(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, LA8;->b:Lparty/iroiro/luajava/Lua;

    iget v1, p0, LA8;->c:I

    iget-object v2, p0, LA8;->d:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->e(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_1
    iget v0, p0, LA8;->c:I

    iget-object v1, p0, LA8;->d:Ljava/lang/String;

    iget-object v2, p0, LA8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/NetworkAPI;->h(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_2
    iget v0, p0, LA8;->c:I

    iget-object v1, p0, LA8;->d:Ljava/lang/String;

    iget-object v2, p0, LA8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->w(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V

    return-void

    :pswitch_3
    iget v0, p0, LA8;->c:I

    iget-object v1, p0, LA8;->d:Ljava/lang/String;

    iget-object v2, p0, LA8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v1, v2, v0}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->q(Ljava/lang/String;Lparty/iroiro/luajava/Lua;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
