.class public final synthetic LV8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:Lparty/iroiro/luajava/Lua;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    iput p3, p0, LV8;->a:I

    iput-object p1, p0, LV8;->b:Ljava/lang/Integer;

    iput-object p2, p0, LV8;->c:Lparty/iroiro/luajava/Lua;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget v0, p0, LV8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LV8;->b:Ljava/lang/Integer;

    iget-object v1, p0, LV8;->c:Lparty/iroiro/luajava/Lua;

    invoke-static {v0, v1, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->q0(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, LV8;->b:Ljava/lang/Integer;

    iget-object v1, p0, LV8;->c:Lparty/iroiro/luajava/Lua;

    invoke-static {v0, v1, p1, p2}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->c(Ljava/lang/Integer;Lparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
