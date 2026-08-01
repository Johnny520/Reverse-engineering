.class public final synthetic Llh;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Llh;->a:I

    iput-object p2, p0, Llh;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll0;Landroid/view/View;)V
    .locals 0

    .line 2
    const/4 p2, 0x3

    iput p2, p0, Llh;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget v0, p0, Llh;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Llh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ll0;

    .line 9
    .line 10
    iget-object p1, p1, Ll0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lyb0;

    .line 13
    .line 14
    iget-object p1, p1, Lyb0;->z:Landroidx/appcompat/widget/ActionBarContainer;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Llh;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/widget/FrameLayout;

    .line 29
    .line 30
    const-string v1, "W2s=\n"

    .line 31
    .line 32
    const-string v2, "Mh80cBTZgFI=\n"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v1, "gfIwzb4DTW+B6CiB/AUMYo70KIHqDwxvgOlxz+sMQCGb/izEvgtDdYPuMo/YDENgmw==\n"

    .line 46
    .line 47
    const-string v2, "74dcoZ5gLAE=\n"

    .line 48
    .line 49
    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1, p1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, Ljava/lang/Float;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    iget-object v0, p0, Llh;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    .line 69
    .line 70
    const-string v1, "IAY=\n"

    .line 71
    .line 72
    const-string v2, "SXLmdnhOoq8=\n"

    .line 73
    .line 74
    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-string v1, "pRJqVfO3EPqlCHIZsbFR96oUchmnu1H6pAkrV6a4HbS/HnZc878e4KcOaBeaugU=\n"

    .line 86
    .line 87
    const-string v2, "y2cGOdPUcZQ=\n"

    .line 88
    .line 89
    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1, p1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    check-cast p1, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_2
    iget-object v0, p0, Llh;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lph;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/Float;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iget-object v0, v0, Lfj;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
