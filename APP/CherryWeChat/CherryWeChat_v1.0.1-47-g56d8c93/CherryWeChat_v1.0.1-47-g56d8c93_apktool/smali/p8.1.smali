.class public final synthetic Lp8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lparty/iroiro/luajava/Lua;


# direct methods
.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lp8;->a:I

    iput-object p1, p0, Lp8;->b:Lparty/iroiro/luajava/Lua;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget v0, p0, Lp8;->a:I

    iget-object v1, p0, Lp8;->b:Lparty/iroiro/luajava/Lua;

    invoke-static {v0, v1, p1}, Lio/github/cherrywechat/lua/api/CherryAPI;->t(ILparty/iroiro/luajava/Lua;Landroid/content/DialogInterface;)V

    return-void
.end method
