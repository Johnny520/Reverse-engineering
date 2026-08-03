.class public final Lew;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lew;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LtF;LGy;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lew;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lew;->b:Ljava/lang/Object;

    iput-object p3, p0, Lew;->c:Ljava/lang/Object;

    iput-object p4, p0, Lew;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lew;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lew;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lew;->c:Ljava/lang/Object;

    check-cast v1, LGy;

    invoke-static {v0, v1}, LpF;->h(Landroid/view/View;LGy;)V

    iget-object v0, p0, Lew;->d:Ljava/lang/Object;

    check-cast v0, Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lew;->b:Ljava/lang/Object;

    check-cast v0, LQh;

    invoke-virtual {v0}, LQh;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lew;->c:Ljava/lang/Object;

    check-cast v1, LRh;

    iget-object v2, p0, Lew;->d:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    new-instance v3, LB0;

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-direct {v3, v1, v0, v4, v5}, LB0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
