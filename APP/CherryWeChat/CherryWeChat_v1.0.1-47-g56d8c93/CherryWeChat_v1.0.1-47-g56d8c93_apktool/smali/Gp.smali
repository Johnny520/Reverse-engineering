.class public final synthetic LGp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, LGp;->a:I

    iput-object p1, p0, LGp;->b:Lparty/iroiro/luajava/Lua;

    iput-object p2, p0, LGp;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LGp;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LGp;->b:Lparty/iroiro/luajava/Lua;

    iget-object v1, p0, LGp;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/LuaEngine;->a(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LHw;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LGp;->b:Lparty/iroiro/luajava/Lua;

    iget-object v1, p0, LGp;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/LuaEngine;->c(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
