.class public final synthetic LM8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, LM8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8;->c:Ljava/lang/Object;

    iput-object p2, p0, LM8;->b:Ljava/lang/Object;

    iput-object p3, p0, LM8;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/AutoCloseable;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p4, p0, LM8;->a:I

    iput-object p1, p0, LM8;->c:Ljava/lang/Object;

    iput-object p2, p0, LM8;->d:Ljava/lang/Object;

    iput-object p3, p0, LM8;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LM8;->a:I

    iput-object p1, p0, LM8;->b:Ljava/lang/Object;

    iput-object p2, p0, LM8;->c:Ljava/lang/Object;

    iput-object p3, p0, LM8;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LM8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM8;->b:Ljava/lang/Object;

    check-cast v0, Lparty/iroiro/luajava/Lua;

    iget-object v1, p0, LM8;->c:Ljava/lang/Object;

    check-cast v1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;

    iget-object v2, p0, LM8;->d:Ljava/lang/Object;

    check-cast v2, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;

    invoke-static {v0, v1, v2}, Lio/github/cherrywechat/lua/api/MessageAPI;->k(Lparty/iroiro/luajava/Lua;Lio/github/cherrywechat/lua/api/MessageAPI$MessageCallback;Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LM8;->d:Ljava/lang/Object;

    check-cast v0, Lparty/iroiro/luajava/Lua;

    iget-object v1, p0, LM8;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LM8;->c:Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/LuaEngine;->b(Ljava/lang/Object;Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LM8;->c:Ljava/lang/Object;

    check-cast v0, Lio/github/cherrywechat/lua/LuaContext;

    iget-object v1, p0, LM8;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LM8;->d:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaContext;->i(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;[Ljava/lang/Object;)LHw;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, LM8;->d:Ljava/lang/Object;

    check-cast v0, Lio/github/cherrywechat/lua/LuaContext;

    iget-object v1, p0, LM8;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LM8;->c:Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lio/github/cherrywechat/lua/LuaContext;->d(Ljava/lang/Object;Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, LM8;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LM8;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LM8;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LTC;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
