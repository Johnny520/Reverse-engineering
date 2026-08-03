.class public final synthetic LG8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lparty/iroiro/luajava/Lua;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lparty/iroiro/luajava/Lua;II)V
    .locals 0

    iput p5, p0, LG8;->a:I

    iput-object p1, p0, LG8;->b:Ljava/lang/String;

    iput-object p2, p0, LG8;->e:Ljava/lang/Object;

    iput-object p3, p0, LG8;->c:Lparty/iroiro/luajava/Lua;

    iput p4, p0, LG8;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, LG8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LG8;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LG8;->c:Lparty/iroiro/luajava/Lua;

    iget v2, p0, LG8;->d:I

    iget-object v3, p0, LG8;->b:Ljava/lang/String;

    invoke-static {v3, v0, v2, v1}, Lio/github/cherrywechat/lua/api/NetworkAPI;->q(Ljava/lang/String;Ljava/lang/String;ILparty/iroiro/luajava/Lua;)V

    return-void

    :pswitch_0
    iget-object v0, p0, LG8;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, LG8;->c:Lparty/iroiro/luajava/Lua;

    iget v2, p0, LG8;->d:I

    iget-object v3, p0, LG8;->b:Ljava/lang/String;

    invoke-static {v3, v0, v1, v2}, Lio/github/cherrywechat/lua/api/CherryNetworkAPI;->A(Ljava/lang/String;Ljava/util/Map;Lparty/iroiro/luajava/Lua;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
