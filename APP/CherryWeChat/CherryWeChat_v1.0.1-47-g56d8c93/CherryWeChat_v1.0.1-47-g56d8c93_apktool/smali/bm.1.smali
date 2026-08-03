.class public final synthetic Lbm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lbm;->a:I

    iput-object p2, p0, Lbm;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final __call(Lparty/iroiro/luajava/Lua;)I
    .locals 1

    iget v0, p0, Lbm;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->L(Lkotlin/jvm/functions/Function2;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lbm;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->b(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Lbm;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->g(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    :pswitch_2
    iget-object v0, p0, Lbm;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->f(Ljava/lang/Class;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
