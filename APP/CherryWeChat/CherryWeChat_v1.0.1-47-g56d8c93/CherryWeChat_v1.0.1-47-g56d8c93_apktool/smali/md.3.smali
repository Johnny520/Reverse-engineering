.class public final Lmd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:LMy;

.field public final synthetic b:Lnd;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Ljd;


# direct methods
.method public constructor <init>(LMy;Lnd;Landroid/view/View;Ljd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd;->a:LMy;

    iput-object p2, p0, Lmd;->b:Lnd;

    iput-object p3, p0, Lmd;->c:Landroid/view/View;

    iput-object p4, p0, Lmd;->d:Ljd;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 5

    iget-object p1, p0, Lmd;->b:Lnd;

    iget-object v0, p1, Lnd;->a:Landroid/view/ViewGroup;

    new-instance v1, Lr8;

    const/4 v2, 0x2

    iget-object v3, p0, Lmd;->c:Landroid/view/View;

    iget-object v4, p0, Lmd;->d:Ljd;

    invoke-direct {v1, p1, v3, v4, v2}, Lr8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x2

    invoke-static {p1}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lmd;->a:LMy;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    const/4 p1, 0x2

    invoke-static {p1}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lmd;->a:LMy;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method
