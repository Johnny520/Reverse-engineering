.class public final Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/skyhand/hookhand/dialog/view/SwitchButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;


# direct methods
.method public constructor <init>(Lcom/skyhand/hookhand/dialog/view/SwitchButton;)V
    .locals 0

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/4 v3, 0x5

    if-eq v0, v3, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ۟:Z

    iput v2, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$c;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    invoke-virtual {p1}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ()V

    goto :goto_2

    :cond_1
    iput v2, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    goto :goto_0

    :cond_2
    iput v2, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    goto :goto_1

    :cond_3
    const/4 v0, 0x2

    iput v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    iget-object v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iput v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    iget v1, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    iput v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    :goto_2
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
