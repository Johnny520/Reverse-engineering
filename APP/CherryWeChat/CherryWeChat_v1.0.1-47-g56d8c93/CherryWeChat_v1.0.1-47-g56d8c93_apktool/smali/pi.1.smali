.class public final synthetic Lpi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lub;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lzi;


# direct methods
.method public synthetic constructor <init>(Lzi;I)V
    .locals 0

    iput p2, p0, Lpi;->a:I

    iput-object p1, p0, Lpi;->b:Lzi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lpi;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LOt;

    iget-object v0, p0, Lpi;->b:Lzi;

    invoke-virtual {v0}, Lzi;->I()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean p1, p1, LOt;->a:Z

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lzi;->r(Z)V

    :cond_0
    return-void

    :pswitch_0
    check-cast p1, Lss;

    iget-object v0, p0, Lpi;->b:Lzi;

    invoke-virtual {v0}, Lzi;->I()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean p1, p1, Lss;->a:Z

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lzi;->m(Z)V

    :cond_1
    return-void

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, Lpi;->b:Lzi;

    invoke-virtual {v0}, Lzi;->I()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0x50

    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lzi;->l(Z)V

    :cond_2
    return-void

    :pswitch_2
    check-cast p1, Landroid/content/res/Configuration;

    iget-object v0, p0, Lpi;->b:Lzi;

    invoke-virtual {v0}, Lzi;->I()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lzi;->h(ZLandroid/content/res/Configuration;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
