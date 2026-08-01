.class public final synthetic Lcom/google/android/material/timepicker/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Lcom/google/android/material/timepicker/ClockHandView;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/timepicker/ClockHandView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/timepicker/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/timepicker/ClockHandView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/material/timepicker/ClockHandView;->飘花落叶言子世楪兰苏哲:I

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p0, p0, Lcom/google/android/material/timepicker/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/timepicker/ClockHandView;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/google/android/material/timepicker/ClockHandView;->飘花落叶言子楪世苏兰哲(F)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
