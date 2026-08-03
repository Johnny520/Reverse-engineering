.class public final synthetic Loe;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqe;


# direct methods
.method public synthetic constructor <init>(Lqe;I)V
    .locals 0

    iput p2, p0, Loe;->a:I

    iput-object p1, p0, Loe;->b:Lqe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Loe;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loe;->b:Lqe;

    iget-boolean v1, v0, Lqe;->b:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, v0, Lqe;->a:I

    const/16 v3, 0x25

    invoke-static {v1, v2, v3}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-wide v1, -0x1c1cffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Loe;->b:Lqe;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lqe;->b:Z

    iput v1, v0, Lqe;->a:I

    const-wide v1, -0x1c1ccfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :pswitch_1
    const/4 v0, 0x0

    iget-object v1, p0, Loe;->b:Lqe;

    iput-boolean v0, v1, Lqe;->b:Z

    const/16 v0, 0x64

    iput v0, v1, Lqe;->a:I

    const-wide v2, -0x1c1c9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    return-void

    :pswitch_2
    const/4 v0, 0x1

    iget-object v1, p0, Loe;->b:Lqe;

    iput-boolean v0, v1, Lqe;->b:Z

    const/4 v0, 0x0

    iput v0, v1, Lqe;->a:I

    new-instance v0, Loe;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Loe;-><init>(Lqe;I)V

    invoke-static {v0}, LbA;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
