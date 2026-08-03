.class public final synthetic LFp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/github/cherrywechat/lua/LuaContext;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, LFp;->a:I

    iput-object p1, p0, LFp;->b:Lio/github/cherrywechat/lua/LuaContext;

    iput-object p2, p0, LFp;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LFp;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LFp;->b:Lio/github/cherrywechat/lua/LuaContext;

    iget-object v1, p0, LFp;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/LuaContext;->f(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LFp;->b:Lio/github/cherrywechat/lua/LuaContext;

    iget-object v1, p0, LFp;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/cherrywechat/lua/LuaContext;->l(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)LHw;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
