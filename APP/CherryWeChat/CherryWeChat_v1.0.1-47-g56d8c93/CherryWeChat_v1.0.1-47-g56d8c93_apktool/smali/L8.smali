.class public final synthetic LL8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;ILjava/lang/String;I)V
    .locals 0

    iput p4, p0, LL8;->a:I

    iput-object p1, p0, LL8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, LL8;->c:I

    iput-object p3, p0, LL8;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget v0, p0, LL8;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LL8;->c:I

    iget-object v1, p0, LL8;->d:Ljava/lang/String;

    iget-object v2, p0, LL8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->k(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget v0, p0, LL8;->c:I

    iget-object v1, p0, LL8;->d:Ljava/lang/String;

    iget-object v2, p0, LL8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->k0(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget v0, p0, LL8;->c:I

    iget-object v1, p0, LL8;->d:Ljava/lang/String;

    iget-object v2, p0, LL8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v2, v0, v1, p1}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->d(Lparty/iroiro/luajava/Lua;ILjava/lang/String;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
