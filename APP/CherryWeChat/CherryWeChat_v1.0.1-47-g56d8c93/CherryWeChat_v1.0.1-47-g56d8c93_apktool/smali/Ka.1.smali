.class public final synthetic LKa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUn;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, LKa;->a:I

    iput-object p2, p0, LKa;->b:Ljava/lang/Object;

    iput-object p3, p0, LKa;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(LYn;LOn;)V
    .locals 2

    iget p1, p0, LKa;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LKa;->b:Ljava/lang/Object;

    check-cast p1, Lw4;

    iget-object v0, p0, LKa;->c:Ljava/lang/Object;

    check-cast v0, LEr;

    sget-object v1, LOn;->ON_DESTROY:LOn;

    if-ne p2, v1, :cond_0

    invoke-virtual {p1, v0}, Lw4;->F(LEr;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p0, LKa;->b:Ljava/lang/Object;

    check-cast p1, Lot;

    iget-object v0, p0, LKa;->c:Ljava/lang/Object;

    check-cast v0, LTa;

    sget-object v1, LOn;->ON_CREATE:LOn;

    if-ne p2, v1, :cond_1

    invoke-static {v0}, LX;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p2

    iput-object p2, p1, Lot;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p2, p1, Lot;->g:Z

    invoke-virtual {p1, p2}, Lot;->c(Z)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
