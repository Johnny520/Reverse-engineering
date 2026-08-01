.class public Lcom/google/android/material/sidesheet/SideSheetBehavior;
.super Lxd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Lxd;"
    }
.end annotation


# instance fields
.field public a:Lgu;

.field public final b:Liu;

.field public final c:Landroid/content/res/ColorStateList;

.field public final d:Lm30;

.field public final e:Le8;

.field public final f:F

.field public final g:Z

.field public h:I

.field public i:Lra0;

.field public j:Z

.field public final k:F

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Ljava/lang/ref/WeakReference;

.field public q:Ljava/lang/ref/WeakReference;

.field public final r:I

.field public s:Landroid/view/VelocityTracker;

.field public t:I

.field public final u:Ljava/util/LinkedHashSet;

.field public final v:Lc8;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le8;

    invoke-direct {v0, p0}, Le8;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->e:Le8;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    const/4 v0, 0x5

    .line 4
    iput v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    const v0, 0x3dcccccd    # 0.1f

    .line 5
    iput v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->k:F

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r:I

    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/util/LinkedHashSet;

    .line 8
    new-instance v0, Lc8;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lc8;-><init>(Lxd;I)V

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->v:Lc8;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Le8;

    invoke-direct {v0, p0}, Le8;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V

    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->e:Le8;

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    const/4 v1, 0x5

    .line 12
    iput v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    const v2, 0x3dcccccd    # 0.1f

    .line 13
    iput v2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->k:F

    const/4 v2, -0x1

    .line 14
    iput v2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r:I

    .line 15
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/util/LinkedHashSet;

    .line 16
    new-instance v3, Lc8;

    invoke-direct {v3, p0, v0}, Lc8;-><init>(Lxd;I)V

    iput-object v3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->v:Lc8;

    .line 17
    sget-object v3, Ldz;->w:[I

    invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    const/4 v4, 0x3

    .line 18
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 19
    invoke-static {p1, v3, v4}, Lgu;->i(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->c:Landroid/content/res/ColorStateList;

    :cond_0
    const/4 v4, 0x6

    .line 20
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    const v5, 0x7f1103c1

    .line 21
    invoke-static {p1, p2, v4, v5}, Lm30;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Ll30;

    move-result-object p2

    invoke-virtual {p2}, Ll30;->a()Lm30;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->d:Lm30;

    .line 22
    :cond_1
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 23
    invoke-virtual {v3, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 24
    iput p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r:I

    .line 25
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->q:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_2

    .line 26
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    :cond_2
    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->q:Ljava/lang/ref/WeakReference;

    .line 28
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_3

    .line 29
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eq p2, v2, :cond_3

    .line 30
    sget-object p2, Loa0;->a:Ljava/util/WeakHashMap;

    .line 31
    invoke-static {v1}, Laa0;->c(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 33
    :cond_3
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->d:Lm30;

    if-nez p2, :cond_4

    goto :goto_0

    .line 34
    :cond_4
    new-instance v1, Liu;

    invoke-direct {v1, p2}, Liu;-><init>(Lm30;)V

    iput-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->b:Liu;

    .line 35
    invoke-virtual {v1, p1}, Liu;->h(Landroid/content/Context;)V

    .line 36
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->c:Landroid/content/res/ColorStateList;

    if-eqz p2, :cond_5

    .line 37
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->b:Liu;

    invoke-virtual {v1, p2}, Liu;->j(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 38
    :cond_5
    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x1010031

    invoke-virtual {v1, v2, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 40
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->b:Liu;

    iget p2, p2, Landroid/util/TypedValue;->data:I

    invoke-virtual {v1, p2}, Liu;->setTint(I)V

    :goto_0
    const/4 p2, 0x2

    const/high16 v1, -0x40800000    # -1.0f

    .line 41
    invoke-virtual {v3, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:F

    const/4 p2, 0x4

    .line 42
    invoke-virtual {v3, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 43
    iput-boolean p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    .line 44
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 45
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    return-void
.end method


# virtual methods
.method public final c(Lae;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 5
    .line 6
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 5
    .line 6
    return-void
.end method

.method public final f(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, Loa0;->d(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_7

    .line 14
    .line 15
    :cond_0
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    .line 16
    .line 17
    if-eqz p1, :cond_7

    .line 18
    .line 19
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/VelocityTracker;->recycle()V

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    iput-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 34
    .line 35
    :cond_1
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 36
    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 44
    .line 45
    :cond_2
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 46
    .line 47
    invoke-virtual {p2, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 48
    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    if-eq p1, v0, :cond_3

    .line 53
    .line 54
    const/4 p2, 0x3

    .line 55
    if-eq p1, p2, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->j:Z

    .line 59
    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    iput-boolean v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->j:Z

    .line 63
    .line 64
    return v1

    .line 65
    :cond_4
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    float-to-int p1, p1

    .line 70
    iput p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t:I

    .line 71
    .line 72
    :cond_5
    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->j:Z

    .line 73
    .line 74
    if-nez p1, :cond_6

    .line 75
    .line 76
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 77
    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    invoke-virtual {p1, p3}, Lra0;->p(Landroid/view/MotionEvent;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    return v0

    .line 87
    :cond_6
    return v1

    .line 88
    :cond_7
    iput-boolean v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->j:Z

    .line 89
    .line 90
    return v1
.end method

.method public final g(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 10

    .line 1
    sget-object v0, Loa0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Lx90;->b(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p2}, Lx90;->b(Landroid/view/View;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->b:Liu;

    .line 22
    .line 23
    const/4 v3, 0x5

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    if-nez v0, :cond_7

    .line 27
    .line 28
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/high16 v6, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-static {v4, v4, v4, v6}, Lvx;->b(FFFF)Landroid/view/animation/PathInterpolator;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const v7, 0x7f04030c

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v7, v6}, Lgu;->F(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 49
    .line 50
    .line 51
    const v6, 0x7f0402fb

    .line 52
    .line 53
    .line 54
    const/16 v7, 0x12c

    .line 55
    .line 56
    invoke-static {v0, v6, v7}, Lgu;->E(Landroid/content/Context;II)I

    .line 57
    .line 58
    .line 59
    const v6, 0x7f040300

    .line 60
    .line 61
    .line 62
    const/16 v7, 0x96

    .line 63
    .line 64
    invoke-static {v0, v6, v7}, Lgu;->E(Landroid/content/Context;II)I

    .line 65
    .line 66
    .line 67
    const v6, 0x7f0402ff

    .line 68
    .line 69
    .line 70
    const/16 v7, 0x64

    .line 71
    .line 72
    invoke-static {v0, v6, v7}, Lgu;->E(Landroid/content/Context;II)I

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const v6, 0x7f0700b1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 83
    .line 84
    .line 85
    const v6, 0x7f0700b0

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 89
    .line 90
    .line 91
    const v6, 0x7f0700b2

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 95
    .line 96
    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    invoke-static {p2, v2}, Lx90;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 100
    .line 101
    .line 102
    const/high16 v0, -0x40800000    # -1.0f

    .line 103
    .line 104
    iget v6, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:F

    .line 105
    .line 106
    cmpl-float v0, v6, v0

    .line 107
    .line 108
    if-nez v0, :cond_1

    .line 109
    .line 110
    invoke-static {p2}, Lda0;->i(Landroid/view/View;)F

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    :cond_1
    invoke-virtual {v2, v6}, Liu;->i(F)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->c:Landroid/content/res/ColorStateList;

    .line 119
    .line 120
    if-eqz v0, :cond_3

    .line 121
    .line 122
    invoke-static {p2, v0}, Lda0;->q(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    :goto_0
    iget v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 126
    .line 127
    if-ne v0, v3, :cond_4

    .line 128
    .line 129
    const/4 v0, 0x4

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    move v0, v5

    .line 132
    :goto_1
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eq v6, v0, :cond_5

    .line 137
    .line 138
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 139
    .line 140
    .line 141
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u()V

    .line 142
    .line 143
    .line 144
    invoke-static {p2}, Lx90;->c(Landroid/view/View;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_6

    .line 149
    .line 150
    invoke-static {p2, v1}, Lx90;->s(Landroid/view/View;I)V

    .line 151
    .line 152
    .line 153
    :cond_6
    invoke-static {p2}, Loa0;->d(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-nez v0, :cond_7

    .line 158
    .line 159
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const v6, 0x7f10009d

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {p2, v0}, Loa0;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    :cond_7
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Lae;

    .line 178
    .line 179
    iget v0, v0, Lae;->c:I

    .line 180
    .line 181
    invoke-static {v0, p3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    const/4 v6, 0x3

    .line 186
    if-ne v0, v6, :cond_8

    .line 187
    .line 188
    move v0, v1

    .line 189
    goto :goto_2

    .line 190
    :cond_8
    move v0, v5

    .line 191
    :goto_2
    iget-object v7, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 192
    .line 193
    if-eqz v7, :cond_9

    .line 194
    .line 195
    invoke-virtual {v7}, Lgu;->s()I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-eq v7, v0, :cond_f

    .line 200
    .line 201
    :cond_9
    const/4 v7, 0x0

    .line 202
    iget-object v8, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->d:Lm30;

    .line 203
    .line 204
    if-nez v0, :cond_c

    .line 205
    .line 206
    new-instance v0, Liq;

    .line 207
    .line 208
    invoke-direct {v0, p0, v1}, Liq;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V

    .line 209
    .line 210
    .line 211
    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 212
    .line 213
    if-eqz v8, :cond_f

    .line 214
    .line 215
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 216
    .line 217
    if-eqz v0, :cond_a

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Landroid/view/View;

    .line 224
    .line 225
    if-eqz v0, :cond_a

    .line 226
    .line 227
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    instance-of v9, v9, Lae;

    .line 232
    .line 233
    if-eqz v9, :cond_a

    .line 234
    .line 235
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    move-object v7, v0

    .line 240
    check-cast v7, Lae;

    .line 241
    .line 242
    :cond_a
    if-eqz v7, :cond_b

    .line 243
    .line 244
    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 245
    .line 246
    if-lez v0, :cond_b

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_b
    invoke-virtual {v8}, Lm30;->e()Ll30;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    new-instance v7, Le;

    .line 254
    .line 255
    invoke-direct {v7, v4}, Le;-><init>(F)V

    .line 256
    .line 257
    .line 258
    iput-object v7, v0, Ll30;->f:Lee;

    .line 259
    .line 260
    new-instance v7, Le;

    .line 261
    .line 262
    invoke-direct {v7, v4}, Le;-><init>(F)V

    .line 263
    .line 264
    .line 265
    iput-object v7, v0, Ll30;->g:Lee;

    .line 266
    .line 267
    invoke-virtual {v0}, Ll30;->a()Lm30;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-eqz v2, :cond_f

    .line 272
    .line 273
    invoke-virtual {v2, v0}, Liu;->setShapeAppearanceModel(Lm30;)V

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_c
    if-ne v0, v1, :cond_18

    .line 278
    .line 279
    new-instance v0, Liq;

    .line 280
    .line 281
    invoke-direct {v0, p0, v5}, Liq;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V

    .line 282
    .line 283
    .line 284
    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 285
    .line 286
    if-eqz v8, :cond_f

    .line 287
    .line 288
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 289
    .line 290
    if-eqz v0, :cond_d

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, Landroid/view/View;

    .line 297
    .line 298
    if-eqz v0, :cond_d

    .line 299
    .line 300
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    instance-of v9, v9, Lae;

    .line 305
    .line 306
    if-eqz v9, :cond_d

    .line 307
    .line 308
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    move-object v7, v0

    .line 313
    check-cast v7, Lae;

    .line 314
    .line 315
    :cond_d
    if-eqz v7, :cond_e

    .line 316
    .line 317
    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 318
    .line 319
    if-lez v0, :cond_e

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_e
    invoke-virtual {v8}, Lm30;->e()Ll30;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    new-instance v7, Le;

    .line 327
    .line 328
    invoke-direct {v7, v4}, Le;-><init>(F)V

    .line 329
    .line 330
    .line 331
    iput-object v7, v0, Ll30;->e:Lee;

    .line 332
    .line 333
    new-instance v7, Le;

    .line 334
    .line 335
    invoke-direct {v7, v4}, Le;-><init>(F)V

    .line 336
    .line 337
    .line 338
    iput-object v7, v0, Ll30;->h:Lee;

    .line 339
    .line 340
    invoke-virtual {v0}, Ll30;->a()Lm30;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-eqz v2, :cond_f

    .line 345
    .line 346
    invoke-virtual {v2, v0}, Liu;->setShapeAppearanceModel(Lm30;)V

    .line 347
    .line 348
    .line 349
    :cond_f
    :goto_3
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 350
    .line 351
    if-nez v0, :cond_10

    .line 352
    .line 353
    new-instance v0, Lra0;

    .line 354
    .line 355
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    iget-object v4, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->v:Lc8;

    .line 360
    .line 361
    invoke-direct {v0, v2, p1, v4}, Lra0;-><init>(Landroid/content/Context;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lmu;)V

    .line 362
    .line 363
    .line 364
    iput-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 365
    .line 366
    :cond_10
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 367
    .line 368
    invoke-virtual {v0, p2}, Lgu;->q(Landroid/view/View;)I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(Landroid/view/View;I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 376
    .line 377
    .line 378
    move-result p3

    .line 379
    iput p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 380
    .line 381
    iget-object p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 382
    .line 383
    invoke-virtual {p3, p1}, Lgu;->r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I

    .line 384
    .line 385
    .line 386
    move-result p3

    .line 387
    iput p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:I

    .line 388
    .line 389
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 390
    .line 391
    .line 392
    move-result p3

    .line 393
    iput p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->l:I

    .line 394
    .line 395
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 396
    .line 397
    .line 398
    move-result-object p3

    .line 399
    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 400
    .line 401
    if-eqz p3, :cond_11

    .line 402
    .line 403
    iget-object v2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 404
    .line 405
    invoke-virtual {v2, p3}, Lgu;->a(Landroid/view/ViewGroup$MarginLayoutParams;)I

    .line 406
    .line 407
    .line 408
    move-result p3

    .line 409
    goto :goto_4

    .line 410
    :cond_11
    move p3, v5

    .line 411
    :goto_4
    iput p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:I

    .line 412
    .line 413
    iget p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 414
    .line 415
    if-eq p3, v1, :cond_13

    .line 416
    .line 417
    const/4 v2, 0x2

    .line 418
    if-eq p3, v2, :cond_13

    .line 419
    .line 420
    if-eq p3, v6, :cond_14

    .line 421
    .line 422
    if-ne p3, v3, :cond_12

    .line 423
    .line 424
    iget-object p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 425
    .line 426
    invoke-virtual {p3}, Lgu;->l()I

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    goto :goto_5

    .line 431
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 432
    .line 433
    new-instance p2, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    const-string p3, "Unexpected value: "

    .line 436
    .line 437
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    iget p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 441
    .line 442
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p2

    .line 449
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw p1

    .line 453
    :cond_13
    iget-object p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 454
    .line 455
    invoke-virtual {p3, p2}, Lgu;->q(Landroid/view/View;)I

    .line 456
    .line 457
    .line 458
    move-result p3

    .line 459
    sub-int v5, v0, p3

    .line 460
    .line 461
    :cond_14
    :goto_5
    invoke-virtual {p2, v5}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 462
    .line 463
    .line 464
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->q:Ljava/lang/ref/WeakReference;

    .line 465
    .line 466
    if-nez p2, :cond_15

    .line 467
    .line 468
    const/4 p2, -0x1

    .line 469
    iget p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r:I

    .line 470
    .line 471
    if-eq p3, p2, :cond_15

    .line 472
    .line 473
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    if-eqz p1, :cond_15

    .line 478
    .line 479
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 480
    .line 481
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    iput-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->q:Ljava/lang/ref/WeakReference;

    .line 485
    .line 486
    :cond_15
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/util/LinkedHashSet;

    .line 487
    .line 488
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result p2

    .line 496
    if-eqz p2, :cond_17

    .line 497
    .line 498
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object p2

    .line 502
    if-nez p2, :cond_16

    .line 503
    .line 504
    goto :goto_6

    .line 505
    :cond_16
    new-instance p1, Ljava/lang/ClassCastException;

    .line 506
    .line 507
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 508
    .line 509
    .line 510
    throw p1

    .line 511
    :cond_17
    return v1

    .line 512
    :cond_18
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 513
    .line 514
    new-instance p2, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    const-string p3, "Invalid sheet edge position value: "

    .line 517
    .line 518
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    const-string p3, ". Must be 0 or 1."

    .line 525
    .line 526
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object p2

    .line 533
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    throw p1
.end method

.method public final h(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v2, v1

    .line 16
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 17
    .line 18
    add-int/2addr v2, v1

    .line 19
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 20
    .line 21
    add-int/2addr v2, v1

    .line 22
    add-int/2addr v2, p4

    .line 23
    iget p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 24
    .line 25
    invoke-static {p3, v2, p4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    add-int/2addr p1, p4

    .line 38
    iget p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 39
    .line 40
    add-int/2addr p1, p4

    .line 41
    iget p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 42
    .line 43
    add-int/2addr p1, p4

    .line 44
    iget p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 45
    .line 46
    invoke-static {p5, p1, p4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p2, p3, p1}, Landroid/view/View;->measure(II)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1
.end method

.method public final m(Landroid/view/View;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    check-cast p2, La40;

    .line 2
    .line 3
    iget p1, p2, La40;->c:I

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    if-ne p1, p2, :cond_1

    .line 10
    .line 11
    :cond_0
    const/4 p1, 0x5

    .line 12
    :cond_1
    iput p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 13
    .line 14
    return-void
.end method

.method public final n(Landroid/view/View;)Landroid/os/Parcelable;
    .locals 1

    .line 1
    new-instance p1, La40;

    .line 2
    .line 3
    sget-object v0, Landroid/view/View$BaseSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 4
    .line 5
    invoke-direct {p1, p0}, La40;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final q(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 28
    .line 29
    invoke-virtual {v1, p2}, Lra0;->j(Landroid/view/MotionEvent;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    iput-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 43
    .line 44
    :cond_3
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 53
    .line 54
    :cond_4
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s:Landroid/view/VelocityTracker;

    .line 55
    .line 56
    invoke-virtual {v1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    const/4 v1, 0x2

    .line 66
    if-ne v0, v1, :cond_6

    .line 67
    .line 68
    iget-boolean v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->j:Z

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    iget v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t:I

    .line 80
    .line 81
    int-to-float v0, v0

    .line 82
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    sub-float/2addr v0, v1

    .line 87
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 92
    .line 93
    iget v3, v1, Lra0;->b:I

    .line 94
    .line 95
    int-to-float v3, v3

    .line 96
    cmpl-float v0, v0, v3

    .line 97
    .line 98
    if-lez v0, :cond_6

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    invoke-virtual {v1, p1, p2}, Lra0;->b(Landroid/view/View;I)V

    .line 109
    .line 110
    .line 111
    :cond_6
    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->j:Z

    .line 112
    .line 113
    xor-int/2addr p1, v2

    .line 114
    return p1
.end method

.method public final r(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    const/4 v1, 0x5

    .line 10
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/view/View;

    .line 20
    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_2
    iget v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 25
    .line 26
    if-ne v0, v1, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    goto :goto_1

    .line 30
    :cond_3
    const/4 v0, 0x0

    .line 31
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eq v1, v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    :cond_4
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_5
    invoke-static {p1}, Lg40;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    throw p1
.end method

.method public final s()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    :cond_0
    return v1

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final t(Landroid/view/View;IZ)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p2, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 8
    .line 9
    invoke-virtual {v0}, Lgu;->l()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance p3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v0, "Invalid state to get outer edge offset: "

    .line 19
    .line 20
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lgu;

    .line 35
    .line 36
    invoke-virtual {v0}, Lgu;->k()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lra0;

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v1, v0, p1}, Lra0;->o(II)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    iput-object p1, v1, Lra0;->r:Landroid/view/View;

    .line 62
    .line 63
    const/4 p1, -0x1

    .line 64
    iput p1, v1, Lra0;->c:I

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    invoke-virtual {v1, v0, p3, p1, p1}, Lra0;->h(IIII)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    iget p3, v1, Lra0;->a:I

    .line 74
    .line 75
    if-nez p3, :cond_3

    .line 76
    .line 77
    iget-object p3, v1, Lra0;->r:Landroid/view/View;

    .line 78
    .line 79
    if-eqz p3, :cond_3

    .line 80
    .line 81
    const/4 p3, 0x0

    .line 82
    iput-object p3, v1, Lra0;->r:Landroid/view/View;

    .line 83
    .line 84
    :cond_3
    if-eqz p1, :cond_4

    .line 85
    .line 86
    :goto_1
    const/4 p1, 0x2

    .line 87
    invoke-virtual {p0, p1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->e:Le8;

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Le8;->a(I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    invoke-virtual {p0, p2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final u()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/high16 v1, 0x40000

    .line 16
    .line 17
    invoke-static {v0, v1}, Loa0;->i(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1}, Loa0;->g(Landroid/view/View;I)V

    .line 22
    .line 23
    .line 24
    const/high16 v2, 0x100000

    .line 25
    .line 26
    invoke-static {v0, v2}, Loa0;->i(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Loa0;->g(Landroid/view/View;I)V

    .line 30
    .line 31
    .line 32
    iget v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    if-eq v1, v2, :cond_2

    .line 36
    .line 37
    sget-object v1, Lh0;->j:Lh0;

    .line 38
    .line 39
    new-instance v3, Lz30;

    .line 40
    .line 41
    invoke-direct {v3, p0, v2}, Lz30;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v3}, Loa0;->j(Landroid/view/View;Lh0;Lv0;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget v1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 48
    .line 49
    const/4 v2, 0x3

    .line 50
    if-eq v1, v2, :cond_3

    .line 51
    .line 52
    sget-object v1, Lh0;->h:Lh0;

    .line 53
    .line 54
    new-instance v3, Lz30;

    .line 55
    .line 56
    invoke-direct {v3, p0, v2}, Lz30;-><init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1, v3}, Loa0;->j(Landroid/view/View;Lh0;Lv0;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_0
    return-void
.end method
