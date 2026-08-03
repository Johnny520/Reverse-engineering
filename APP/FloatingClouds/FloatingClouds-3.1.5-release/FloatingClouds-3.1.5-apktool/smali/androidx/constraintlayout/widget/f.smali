.class public final Landroidx/constraintlayout/widget/f;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/f$a;
    }
.end annotation


# virtual methods
.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    new-instance v0, Landroidx/constraintlayout/widget/f$a;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroidx/constraintlayout/widget/f$a;->m0:F

    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/constraintlayout/widget/f$a;->n0:Z

    const/4 v2, 0x0

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->o0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->p0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->q0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->r0:F

    iput v1, v0, Landroidx/constraintlayout/widget/f$a;->s0:F

    iput v1, v0, Landroidx/constraintlayout/widget/f$a;->t0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->u0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->v0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->w0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->x0:F

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->y0:F

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 5

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/f$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 3
    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->m0:F

    const/4 v3, 0x0

    .line 4
    iput-boolean v3, v0, Landroidx/constraintlayout/widget/f$a;->n0:Z

    const/4 v4, 0x0

    .line 5
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->o0:F

    .line 6
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->p0:F

    .line 7
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->q0:F

    .line 8
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->r0:F

    .line 9
    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->s0:F

    .line 10
    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->t0:F

    .line 11
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->u0:F

    .line 12
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->v0:F

    .line 13
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->w0:F

    .line 14
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->x0:F

    .line 15
    iput v4, v0, Landroidx/constraintlayout/widget/f$a;->y0:F

    .line 16
    sget-object v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    :goto_0
    if-ge v3, v1, :cond_c

    .line 18
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 19
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_alpha:I

    if-ne v2, v4, :cond_0

    .line 20
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->m0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->m0:F

    goto/16 :goto_1

    .line 21
    :cond_0
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_elevation:I

    if-ne v2, v4, :cond_1

    .line 22
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->o0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->o0:F

    const/4 v2, 0x1

    .line 23
    iput-boolean v2, v0, Landroidx/constraintlayout/widget/f$a;->n0:Z

    goto/16 :goto_1

    .line 24
    :cond_1
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_rotationX:I

    if-ne v2, v4, :cond_2

    .line 25
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->q0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->q0:F

    goto/16 :goto_1

    .line 26
    :cond_2
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_rotationY:I

    if-ne v2, v4, :cond_3

    .line 27
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->r0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->r0:F

    goto/16 :goto_1

    .line 28
    :cond_3
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_rotation:I

    if-ne v2, v4, :cond_4

    .line 29
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->p0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->p0:F

    goto :goto_1

    .line 30
    :cond_4
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_scaleX:I

    if-ne v2, v4, :cond_5

    .line 31
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->s0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->s0:F

    goto :goto_1

    .line 32
    :cond_5
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_scaleY:I

    if-ne v2, v4, :cond_6

    .line 33
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->t0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->t0:F

    goto :goto_1

    .line 34
    :cond_6
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_transformPivotX:I

    if-ne v2, v4, :cond_7

    .line 35
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->u0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->u0:F

    goto :goto_1

    .line 36
    :cond_7
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_transformPivotY:I

    if-ne v2, v4, :cond_8

    .line 37
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->v0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->v0:F

    goto :goto_1

    .line 38
    :cond_8
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_translationX:I

    if-ne v2, v4, :cond_9

    .line 39
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->w0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->w0:F

    goto :goto_1

    .line 40
    :cond_9
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_translationY:I

    if-ne v2, v4, :cond_a

    .line 41
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->x0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->x0:F

    goto :goto_1

    .line 42
    :cond_a
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_translationZ:I

    if-ne v2, v4, :cond_b

    .line 43
    iget v4, v0, Landroidx/constraintlayout/widget/f$a;->y0:F

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/f$a;->y0:F

    :cond_b
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_c
    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 44
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getConstraintSet()Landroidx/constraintlayout/widget/e;
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    const/4 v0, 0x0

    throw v0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    return-void
.end method
