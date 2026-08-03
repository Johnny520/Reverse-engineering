.class public final synthetic LT8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, LT8;->a:I

    iput-object p1, p0, LT8;->b:Lparty/iroiro/luajava/Lua;

    iput p2, p0, LT8;->c:I

    iput-object p3, p0, LT8;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget v0, p0, LT8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LT8;->d:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    iget-object v1, p0, LT8;->b:Lparty/iroiro/luajava/Lua;

    iget v2, p0, LT8;->c:I

    invoke-static {v1, v2, v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->I0(Lparty/iroiro/luajava/Lua;ILandroid/widget/EditText;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, LT8;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, LT8;->b:Lparty/iroiro/luajava/Lua;

    iget v2, p0, LT8;->c:I

    invoke-static {v1, v2, v0, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->P0(Lparty/iroiro/luajava/Lua;ILjava/util/List;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
