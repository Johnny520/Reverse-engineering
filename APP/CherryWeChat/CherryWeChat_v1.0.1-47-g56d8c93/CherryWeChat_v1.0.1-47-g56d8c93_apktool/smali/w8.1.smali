.class public final synthetic Lw8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;


# direct methods
.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;I)V
    .locals 0

    iput p2, p0, Lw8;->a:I

    iput-object p1, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final __call(Lparty/iroiro/luajava/Lua;)I
    .locals 1

    iget v0, p0, Lw8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->c(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->q(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->t(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_2
    iget-object v0, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->p(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_3
    iget-object v0, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->f(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_4
    iget-object v0, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->z(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_5
    iget-object v0, p0, Lw8;->b:Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->s(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

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
