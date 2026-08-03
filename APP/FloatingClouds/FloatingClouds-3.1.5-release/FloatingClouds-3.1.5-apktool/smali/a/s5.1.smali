.class public final synthetic La/s5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/v5;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(La/v5;Landroid/app/Activity;I)V
    .locals 0

    iput p3, p0, La/s5;->a:I

    iput-object p1, p0, La/s5;->b:La/v5;

    iput-object p2, p0, La/s5;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, La/s5;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/s5;->b:La/v5;

    iget-object v1, p0, La/s5;->c:Landroid/app/Activity;

    invoke-virtual {v0, v1}, La/v5;->c(Landroid/app/Activity;)V

    invoke-virtual {v0}, La/v5;->l()V

    invoke-virtual {v0}, La/v5;->k()V

    iget-boolean v1, v0, La/v5;->a:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, La/v5;->i()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, La/s5;->b:La/v5;

    iget-object v1, p0, La/s5;->c:Landroid/app/Activity;

    invoke-virtual {v0, v1}, La/v5;->c(Landroid/app/Activity;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
