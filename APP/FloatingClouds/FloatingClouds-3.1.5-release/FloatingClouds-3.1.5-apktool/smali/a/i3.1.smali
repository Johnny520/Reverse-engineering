.class public final synthetic La/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/c6;


# direct methods
.method public synthetic constructor <init>(La/c6;I)V
    .locals 0

    iput p2, p0, La/i3;->a:I

    iput-object p1, p0, La/i3;->b:La/c6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    iget p1, p0, La/i3;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, La/i3;->b:La/c6;

    check-cast p1, La/F5;

    iput-boolean p2, p1, La/F5;->l:Z

    invoke-virtual {p1}, La/c6;->q()V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, La/F5;->t(Z)V

    iput-boolean p2, p1, La/F5;->m:Z

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, La/i3;->b:La/c6;

    check-cast p1, La/l3;

    invoke-virtual {p1}, La/l3;->u()Z

    move-result p2

    invoke-virtual {p1, p2}, La/l3;->t(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
