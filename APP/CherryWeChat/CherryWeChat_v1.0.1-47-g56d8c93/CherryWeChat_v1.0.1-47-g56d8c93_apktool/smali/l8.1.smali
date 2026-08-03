.class public final synthetic Ll8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lparty/iroiro/luajava/Lua;


# direct methods
.method public synthetic constructor <init>(ILparty/iroiro/luajava/Lua;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll8;->a:I

    iput p1, p0, Ll8;->b:I

    iput-object p2, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;II)V
    .locals 0

    .line 2
    iput p3, p0, Ll8;->a:I

    iput-object p1, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    iput p2, p0, Ll8;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget v0, p0, Ll8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Ll8;->b:I

    invoke-static {v1, v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->Q0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget v0, p0, Ll8;->b:I

    iget-object v1, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    invoke-static {v0, v1, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->z0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Ll8;->b:I

    invoke-static {v1, v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->v0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_2
    iget-object v0, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Ll8;->b:I

    invoke-static {v1, v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->G(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_3
    iget-object v0, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    iget v1, p0, Ll8;->b:I

    invoke-static {v1, v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->L(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_4
    iget v0, p0, Ll8;->b:I

    iget-object v1, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    invoke-static {v0, v1, p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->n(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_5
    iget v0, p0, Ll8;->b:I

    iget-object v1, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    invoke-static {v0, v1, p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->D(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_6
    iget v0, p0, Ll8;->b:I

    iget-object v1, p0, Ll8;->c:Lparty/iroiro/luajava/Lua;

    invoke-static {v0, v1, p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->a0(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
