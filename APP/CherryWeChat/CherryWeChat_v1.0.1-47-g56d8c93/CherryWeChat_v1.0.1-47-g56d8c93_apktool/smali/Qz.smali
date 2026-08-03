.class public final LQz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, LQz;->a:I

    iput-object p1, p0, LQz;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final c(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final d(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final e(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final f(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 11

    iget p1, p0, LQz;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LQz;->b:Landroid/view/ViewGroup;

    check-cast p1, Landroid/widget/LinearLayout;

    const-wide v0, -0x2c77ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Landroid/view/animation/ScaleAnimation;

    const/4 v9, 0x1

    const/high16 v10, 0x3f000000    # 0.5f

    const v3, 0x3f866666    # 1.05f

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move v5, v3

    move v6, v4

    invoke-direct/range {v2 .. v10}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    const-wide/16 v0, 0x96

    invoke-virtual {v2, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    :pswitch_0
    iget-object p1, p0, LQz;->b:Landroid/view/ViewGroup;

    check-cast p1, LWz;

    new-instance v0, LRz;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LRz;-><init>(LWz;I)V

    iput-object v0, p1, LWz;->B:LRz;

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, p1, LWz;->t:Ls9;

    const/4 v1, 0x0

    iput-object v1, v0, Ls9;->a:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p1, LWz;->t:Ls9;

    iget-object p1, p1, LWz;->B:LRz;

    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    :pswitch_1
    iget-object p1, p0, LQz;->b:Landroid/view/ViewGroup;

    check-cast p1, LWz;

    iget-boolean v0, p1, LWz;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p1, LWz;->z:Lw9;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Lw9;->setAlpha(I)V

    iget-object v0, p1, LWz;->z:Lw9;

    invoke-virtual {v0}, Lw9;->start()V

    iget-boolean v0, p1, LWz;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, LWz;->b:LUz;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LUz;->a()V

    :cond_0
    iget-object v0, p1, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p1, LWz;->n:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LWz;->l()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    iget p1, p0, LQz;->a:I

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    iget p1, p0, LQz;->a:I

    return-void
.end method
