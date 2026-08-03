.class public final Lu9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:Lv9;

.field public final synthetic b:Lw9;


# direct methods
.method public constructor <init>(Lw9;Lv9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9;->b:Lw9;

    iput-object p2, p0, Lu9;->a:Lv9;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 5

    iget-object v0, p0, Lu9;->b:Lw9;

    const/high16 v1, 0x3f800000    # 1.0f

    iget-object v2, p0, Lu9;->a:Lv9;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lw9;->a(FLv9;Z)V

    iget v4, v2, Lv9;->e:F

    iput v4, v2, Lv9;->k:F

    iget v4, v2, Lv9;->f:F

    iput v4, v2, Lv9;->l:F

    iget v4, v2, Lv9;->g:F

    iput v4, v2, Lv9;->m:F

    iget v4, v2, Lv9;->j:I

    add-int/2addr v4, v3

    iget-object v3, v2, Lv9;->i:[I

    array-length v3, v3

    rem-int/2addr v4, v3

    invoke-virtual {v2, v4}, Lv9;->a(I)V

    iget-boolean v3, v0, Lw9;->f:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, v0, Lw9;->f:Z

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v3, 0x534

    invoke-virtual {p1, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    iget-boolean p1, v2, Lv9;->n:Z

    if-eqz p1, :cond_0

    iput-boolean v1, v2, Lv9;->n:Z

    :cond_0
    return-void

    :cond_1
    iget p1, v0, Lw9;->e:F

    add-float/2addr p1, v1

    iput p1, v0, Lw9;->e:F

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lu9;->b:Lw9;

    const/4 v0, 0x0

    iput v0, p1, Lw9;->e:F

    return-void
.end method
