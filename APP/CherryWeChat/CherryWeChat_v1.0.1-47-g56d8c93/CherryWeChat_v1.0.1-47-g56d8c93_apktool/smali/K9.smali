.class public final synthetic LK9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbg;


# direct methods
.method public synthetic constructor <init>(Lbg;I)V
    .locals 0

    iput p2, p0, LK9;->a:I

    iput-object p1, p0, LK9;->b:Lbg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    iget p1, p0, LK9;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LK9;->b:Lbg;

    check-cast p1, LLe;

    iput-boolean p2, p1, LLe;->l:Z

    invoke-virtual {p1}, Lbg;->p()V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LLe;->s(Z)V

    iput-boolean p2, p1, LLe;->m:Z

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, LK9;->b:Lbg;

    check-cast p1, LN9;

    invoke-virtual {p1}, LN9;->t()Z

    move-result p2

    invoke-virtual {p1, p2}, LN9;->s(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
