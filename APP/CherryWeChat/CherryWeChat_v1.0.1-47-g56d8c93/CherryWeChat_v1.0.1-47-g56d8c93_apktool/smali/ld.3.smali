.class public final Lld;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic a:Lnd;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:LMy;

.field public final synthetic e:Ljd;


# direct methods
.method public constructor <init>(Lnd;Landroid/view/View;ZLMy;Ljd;)V
    .locals 0

    iput-object p1, p0, Lld;->a:Lnd;

    iput-object p2, p0, Lld;->b:Landroid/view/View;

    iput-boolean p3, p0, Lld;->c:Z

    iput-object p4, p0, Lld;->d:LMy;

    iput-object p5, p0, Lld;->e:Ljd;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lld;->a:Lnd;

    iget-object p1, p1, Lnd;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lld;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean p1, p0, Lld;->c:Z

    iget-object v1, p0, Lld;->d:LMy;

    if-eqz p1, :cond_0

    iget p1, v1, LMy;->a:I

    invoke-static {v0, p1}, Lph;->a(Landroid/view/View;I)V

    :cond_0
    iget-object p1, p0, Lld;->e:Ljd;

    invoke-virtual {p1}, LB3;->d()V

    const/4 p1, 0x2

    invoke-static {p1}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    return-void
.end method
