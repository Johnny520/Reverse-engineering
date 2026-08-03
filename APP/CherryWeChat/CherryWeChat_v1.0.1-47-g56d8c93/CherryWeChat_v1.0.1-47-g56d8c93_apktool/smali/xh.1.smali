.class public final Lxh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lyh;


# direct methods
.method public constructor <init>(Lyh;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxh;->b:Lyh;

    iput-object p2, p0, Lxh;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onDraw()V
    .locals 2

    new-instance v0, LB0;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p0}, LB0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LvD;->f()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
