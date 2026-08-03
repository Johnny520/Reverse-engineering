.class public final synthetic LLp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LRp;


# direct methods
.method public synthetic constructor <init>(LRp;I)V
    .locals 0

    iput p2, p0, LLp;->a:I

    iput-object p1, p0, LLp;->b:LRp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget p1, p0, LLp;->a:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadAll()V

    iget-object p1, p0, LLp;->b:LRp;

    invoke-virtual {p1}, LRp;->g()V

    const-wide v0, -0x1b715fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LRp;->a(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, LLp;->b:LRp;

    iget-object v0, p1, LRp;->b:Landroid/widget/EditText;

    iget-object v1, p1, LRp;->q:Ljava/util/List;

    if-nez v0, :cond_0

    const-wide v2, -0x1b7f6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LOp;

    iget-object v2, v2, LOp;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x1b781fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LOp;

    iget-object p2, p2, LOp;->a:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LRp;->a(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
