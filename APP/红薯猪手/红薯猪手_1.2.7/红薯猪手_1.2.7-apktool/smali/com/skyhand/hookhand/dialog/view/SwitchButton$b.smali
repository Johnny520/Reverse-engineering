.class public final Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


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

    iput-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 7

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_1

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget-object v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v2, v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    iget-object v3, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v3, v3, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    sub-float/2addr v3, v2

    mul-float/2addr v3, p1

    add-float/2addr v3, v2

    iput v3, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    iget p1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡ۠:F

    sub-float/2addr v3, p1

    iget v2, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۡ:F

    sub-float/2addr v2, p1

    div-float/2addr v3, v2

    iget-object p1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ:Landroid/animation/ArgbEvaluator;

    iget v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۨ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget v2, v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v3, v0, v2}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget-object v0, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v1, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟۠:F

    mul-float/2addr v1, v3

    iput v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    iget-object p1, p1, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ:Landroid/animation/ArgbEvaluator;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget v2, v2, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۠۠:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v3, v1, v2}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget-object v3, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ:Landroid/animation/ArgbEvaluator;

    iget-object v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v4, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget-object v4, v4, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v4, v4, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, p1, v0, v4}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۟:I

    iget-object v0, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget-object v1, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۤ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget-object v3, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v4, v3, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    iget-object v5, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v6, v5, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    sub-float/2addr v6, v4

    mul-float/2addr v6, p1

    add-float/2addr v6, v4

    iput v6, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟۠:F

    iget v4, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۧ:I

    if-eq v4, v2, :cond_2

    iget v2, v3, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    iget v4, v5, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    sub-float/2addr v4, v2

    mul-float/2addr v4, p1

    add-float/2addr v4, v2

    iput v4, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ:F

    :cond_2
    iget-object v0, v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۢ:Landroid/animation/ArgbEvaluator;

    iget v2, v3, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iget-object v3, v3, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥۡۦ:Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;

    iget v3, v3, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v1, Lcom/skyhand/hookhand/dialog/view/SwitchButton$e;->ۥ۟:I

    :goto_0
    iget-object p1, p0, Lcom/skyhand/hookhand/dialog/view/SwitchButton$b;->ۥ:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
