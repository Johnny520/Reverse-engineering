.class public final Lt9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lv9;

.field public final synthetic b:Lw9;


# direct methods
.method public constructor <init>(Lw9;Lv9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9;->b:Lw9;

    iput-object p2, p0, Lt9;->a:Lv9;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lt9;->a:Lv9;

    invoke-static {p1, v0}, Lw9;->d(FLv9;)V

    const/4 v1, 0x0

    iget-object v2, p0, Lt9;->b:Lw9;

    invoke-virtual {v2, p1, v0, v1}, Lw9;->a(FLv9;Z)V

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
