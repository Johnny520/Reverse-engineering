.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source ""


# static fields
.field public static p:Lgy;


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lsb;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:Lqb;

.field public k:LP3;

.field public l:I

.field public m:Ljava/util/HashMap;

.field public final n:Landroid/util/SparseArray;

.field public final o:Lhb;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lsb;

    invoke-direct {p1}, Lsb;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const v0, 0x7fffffff

    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 8
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 v0, 0x101

    .line 10
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lqb;

    .line 12
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:LP3;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 15
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    .line 16
    new-instance v0, Lhb;

    invoke-direct {v0, p0, p0}, Lhb;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lhb;

    .line 17
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 21
    new-instance p1, Lsb;

    invoke-direct {p1}, Lsb;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 23
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const p1, 0x7fffffff

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 25
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 p1, 0x101

    .line 27
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lqb;

    .line 29
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:LP3;

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 32
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    .line 33
    new-instance p1, Lhb;

    invoke-direct {p1, p0, p0}, Lhb;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lhb;

    .line 34
    invoke-virtual {p0, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static g()Lgb;
    .locals 8

    new-instance v0, Lgb;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v1, -0x1

    iput v1, v0, Lgb;->a:I

    iput v1, v0, Lgb;->b:I

    const/high16 v2, -0x40800000    # -1.0f

    iput v2, v0, Lgb;->c:F

    const/4 v3, 0x1

    iput-boolean v3, v0, Lgb;->d:Z

    iput v1, v0, Lgb;->e:I

    iput v1, v0, Lgb;->f:I

    iput v1, v0, Lgb;->g:I

    iput v1, v0, Lgb;->h:I

    iput v1, v0, Lgb;->i:I

    iput v1, v0, Lgb;->j:I

    iput v1, v0, Lgb;->k:I

    iput v1, v0, Lgb;->l:I

    iput v1, v0, Lgb;->m:I

    iput v1, v0, Lgb;->n:I

    iput v1, v0, Lgb;->o:I

    iput v1, v0, Lgb;->p:I

    const/4 v4, 0x0

    iput v4, v0, Lgb;->q:I

    const/4 v5, 0x0

    iput v5, v0, Lgb;->r:F

    iput v1, v0, Lgb;->s:I

    iput v1, v0, Lgb;->t:I

    iput v1, v0, Lgb;->u:I

    iput v1, v0, Lgb;->v:I

    const/high16 v5, -0x80000000

    iput v5, v0, Lgb;->w:I

    iput v5, v0, Lgb;->x:I

    iput v5, v0, Lgb;->y:I

    iput v5, v0, Lgb;->z:I

    iput v5, v0, Lgb;->A:I

    iput v5, v0, Lgb;->B:I

    iput v5, v0, Lgb;->C:I

    iput v4, v0, Lgb;->D:I

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, v0, Lgb;->E:F

    iput v6, v0, Lgb;->F:F

    const/4 v7, 0x0

    iput-object v7, v0, Lgb;->G:Ljava/lang/String;

    iput v2, v0, Lgb;->H:F

    iput v2, v0, Lgb;->I:F

    iput v4, v0, Lgb;->J:I

    iput v4, v0, Lgb;->K:I

    iput v4, v0, Lgb;->L:I

    iput v4, v0, Lgb;->M:I

    iput v4, v0, Lgb;->N:I

    iput v4, v0, Lgb;->O:I

    iput v4, v0, Lgb;->P:I

    iput v4, v0, Lgb;->Q:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lgb;->R:F

    iput v2, v0, Lgb;->S:F

    iput v1, v0, Lgb;->T:I

    iput v1, v0, Lgb;->U:I

    iput v1, v0, Lgb;->V:I

    iput-boolean v4, v0, Lgb;->W:Z

    iput-boolean v4, v0, Lgb;->X:Z

    iput-object v7, v0, Lgb;->Y:Ljava/lang/String;

    iput v4, v0, Lgb;->Z:I

    iput-boolean v3, v0, Lgb;->a0:Z

    iput-boolean v3, v0, Lgb;->b0:Z

    iput-boolean v4, v0, Lgb;->c0:Z

    iput-boolean v4, v0, Lgb;->d0:Z

    iput-boolean v4, v0, Lgb;->e0:Z

    iput v1, v0, Lgb;->f0:I

    iput v1, v0, Lgb;->g0:I

    iput v1, v0, Lgb;->h0:I

    iput v1, v0, Lgb;->i0:I

    iput v5, v0, Lgb;->j0:I

    iput v5, v0, Lgb;->k0:I

    iput v6, v0, Lgb;->l0:F

    new-instance v1, Lrb;

    invoke-direct {v1}, Lrb;-><init>()V

    iput-object v1, v0, Lgb;->p0:Lrb;

    return-object v0
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-lez v1, :cond_0

    return v1

    :cond_0
    return v2
.end method

.method public static getSharedValues()Lgy;
    .locals 2

    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgy;

    if-nez v0, :cond_0

    new-instance v0, Lgy;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgy;

    :cond_0
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgy;

    return-object v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Lgb;

    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_3

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    aget-object v7, v6, v1

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float/2addr v7, v2

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float/2addr v8, v3

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float/2addr v9, v2

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float/2addr v6, v3

    float-to-int v6, v6

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v11, v7

    int-to-float v12, v8

    add-int/2addr v7, v9

    int-to-float v13, v7

    move v14, v12

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v7, v11

    add-int/2addr v8, v6

    int-to-float v14, v8

    move v11, v13

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v6, v12

    move v12, v14

    move v13, v7

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v7, v11

    move v11, v13

    move v14, v6

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v16, v14

    move v14, v12

    move/from16 v12, v16

    const v6, -0xff0100

    invoke-virtual {v15, v6}, Landroid/graphics/Paint;->setColor(I)V

    move v13, v7

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v16, v14

    move v14, v12

    move/from16 v12, v16

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public final forceLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    return-void
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->g()Lgb;

    move-result-object v0

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 11

    .line 1
    new-instance v0, Lgb;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v2, -0x1

    .line 3
    iput v2, v0, Lgb;->a:I

    .line 4
    iput v2, v0, Lgb;->b:I

    const/high16 v3, -0x40800000    # -1.0f

    .line 5
    iput v3, v0, Lgb;->c:F

    const/4 v4, 0x1

    .line 6
    iput-boolean v4, v0, Lgb;->d:Z

    .line 7
    iput v2, v0, Lgb;->e:I

    .line 8
    iput v2, v0, Lgb;->f:I

    .line 9
    iput v2, v0, Lgb;->g:I

    .line 10
    iput v2, v0, Lgb;->h:I

    .line 11
    iput v2, v0, Lgb;->i:I

    .line 12
    iput v2, v0, Lgb;->j:I

    .line 13
    iput v2, v0, Lgb;->k:I

    .line 14
    iput v2, v0, Lgb;->l:I

    .line 15
    iput v2, v0, Lgb;->m:I

    .line 16
    iput v2, v0, Lgb;->n:I

    .line 17
    iput v2, v0, Lgb;->o:I

    .line 18
    iput v2, v0, Lgb;->p:I

    const/4 v5, 0x0

    .line 19
    iput v5, v0, Lgb;->q:I

    const/4 v6, 0x0

    .line 20
    iput v6, v0, Lgb;->r:F

    .line 21
    iput v2, v0, Lgb;->s:I

    .line 22
    iput v2, v0, Lgb;->t:I

    .line 23
    iput v2, v0, Lgb;->u:I

    .line 24
    iput v2, v0, Lgb;->v:I

    const/high16 v7, -0x80000000

    .line 25
    iput v7, v0, Lgb;->w:I

    .line 26
    iput v7, v0, Lgb;->x:I

    .line 27
    iput v7, v0, Lgb;->y:I

    .line 28
    iput v7, v0, Lgb;->z:I

    .line 29
    iput v7, v0, Lgb;->A:I

    .line 30
    iput v7, v0, Lgb;->B:I

    .line 31
    iput v7, v0, Lgb;->C:I

    .line 32
    iput v5, v0, Lgb;->D:I

    const/high16 v8, 0x3f000000    # 0.5f

    .line 33
    iput v8, v0, Lgb;->E:F

    .line 34
    iput v8, v0, Lgb;->F:F

    const/4 v9, 0x0

    .line 35
    iput-object v9, v0, Lgb;->G:Ljava/lang/String;

    .line 36
    iput v3, v0, Lgb;->H:F

    .line 37
    iput v3, v0, Lgb;->I:F

    .line 38
    iput v5, v0, Lgb;->J:I

    .line 39
    iput v5, v0, Lgb;->K:I

    .line 40
    iput v5, v0, Lgb;->L:I

    .line 41
    iput v5, v0, Lgb;->M:I

    .line 42
    iput v5, v0, Lgb;->N:I

    .line 43
    iput v5, v0, Lgb;->O:I

    .line 44
    iput v5, v0, Lgb;->P:I

    .line 45
    iput v5, v0, Lgb;->Q:I

    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    iput v3, v0, Lgb;->R:F

    .line 47
    iput v3, v0, Lgb;->S:F

    .line 48
    iput v2, v0, Lgb;->T:I

    .line 49
    iput v2, v0, Lgb;->U:I

    .line 50
    iput v2, v0, Lgb;->V:I

    .line 51
    iput-boolean v5, v0, Lgb;->W:Z

    .line 52
    iput-boolean v5, v0, Lgb;->X:Z

    .line 53
    iput-object v9, v0, Lgb;->Y:Ljava/lang/String;

    .line 54
    iput v5, v0, Lgb;->Z:I

    .line 55
    iput-boolean v4, v0, Lgb;->a0:Z

    .line 56
    iput-boolean v4, v0, Lgb;->b0:Z

    .line 57
    iput-boolean v5, v0, Lgb;->c0:Z

    .line 58
    iput-boolean v5, v0, Lgb;->d0:Z

    .line 59
    iput-boolean v5, v0, Lgb;->e0:Z

    .line 60
    iput v2, v0, Lgb;->f0:I

    .line 61
    iput v2, v0, Lgb;->g0:I

    .line 62
    iput v2, v0, Lgb;->h0:I

    .line 63
    iput v2, v0, Lgb;->i0:I

    .line 64
    iput v7, v0, Lgb;->j0:I

    .line 65
    iput v7, v0, Lgb;->k0:I

    .line 66
    iput v8, v0, Lgb;->l0:F

    .line 67
    new-instance v3, Lrb;

    invoke-direct {v3}, Lrb;-><init>()V

    iput-object v3, v0, Lgb;->p0:Lrb;

    .line 68
    sget-object v3, LOu;->b:[I

    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    move v3, v5

    :goto_0
    if-ge v3, v1, :cond_1

    .line 70
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v7

    .line 71
    sget-object v8, Lfb;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseIntArray;->get(I)I

    move-result v8

    const/4 v9, 0x2

    const/4 v10, -0x2

    packed-switch v8, :pswitch_data_0

    packed-switch v8, :pswitch_data_1

    packed-switch v8, :pswitch_data_2

    goto/16 :goto_1

    .line 72
    :pswitch_0
    iget-boolean v8, v0, Lgb;->d:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lgb;->d:Z

    goto/16 :goto_1

    .line 73
    :pswitch_1
    iget v8, v0, Lgb;->Z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->Z:I

    goto/16 :goto_1

    .line 74
    :pswitch_2
    invoke-static {v0, p1, v7, v4}, Lqb;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 75
    :pswitch_3
    invoke-static {v0, p1, v7, v5}, Lqb;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 76
    :pswitch_4
    iget v8, v0, Lgb;->C:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->C:I

    goto/16 :goto_1

    .line 77
    :pswitch_5
    iget v8, v0, Lgb;->D:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->D:I

    goto/16 :goto_1

    .line 78
    :pswitch_6
    iget v8, v0, Lgb;->o:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->o:I

    if-ne v8, v2, :cond_0

    .line 79
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->o:I

    goto/16 :goto_1

    .line 80
    :pswitch_7
    iget v8, v0, Lgb;->n:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->n:I

    if-ne v8, v2, :cond_0

    .line 81
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->n:I

    goto/16 :goto_1

    .line 82
    :pswitch_8
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lgb;->Y:Ljava/lang/String;

    goto/16 :goto_1

    .line 83
    :pswitch_9
    iget v8, v0, Lgb;->U:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lgb;->U:I

    goto/16 :goto_1

    .line 84
    :pswitch_a
    iget v8, v0, Lgb;->T:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lgb;->T:I

    goto/16 :goto_1

    .line 85
    :pswitch_b
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->K:I

    goto/16 :goto_1

    .line 86
    :pswitch_c
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->J:I

    goto/16 :goto_1

    .line 87
    :pswitch_d
    iget v8, v0, Lgb;->I:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lgb;->I:F

    goto/16 :goto_1

    .line 88
    :pswitch_e
    iget v8, v0, Lgb;->H:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lgb;->H:F

    goto/16 :goto_1

    .line 89
    :pswitch_f
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lqb;->h(Lgb;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 90
    :pswitch_10
    iget v8, v0, Lgb;->S:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Lgb;->S:F

    .line 91
    iput v9, v0, Lgb;->M:I

    goto/16 :goto_1

    .line 92
    :pswitch_11
    :try_start_0
    iget v8, v0, Lgb;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lgb;->Q:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 93
    :catch_0
    iget v8, v0, Lgb;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v10, :cond_0

    .line 94
    iput v10, v0, Lgb;->Q:I

    goto/16 :goto_1

    .line 95
    :pswitch_12
    :try_start_1
    iget v8, v0, Lgb;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lgb;->O:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    .line 96
    :catch_1
    iget v8, v0, Lgb;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v10, :cond_0

    .line 97
    iput v10, v0, Lgb;->O:I

    goto/16 :goto_1

    .line 98
    :pswitch_13
    iget v8, v0, Lgb;->R:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Lgb;->R:F

    .line 99
    iput v9, v0, Lgb;->L:I

    goto/16 :goto_1

    .line 100
    :pswitch_14
    :try_start_2
    iget v8, v0, Lgb;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lgb;->P:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    .line 101
    :catch_2
    iget v8, v0, Lgb;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v10, :cond_0

    .line 102
    iput v10, v0, Lgb;->P:I

    goto/16 :goto_1

    .line 103
    :pswitch_15
    :try_start_3
    iget v8, v0, Lgb;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lgb;->N:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_1

    .line 104
    :catch_3
    iget v8, v0, Lgb;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v10, :cond_0

    .line 105
    iput v10, v0, Lgb;->N:I

    goto/16 :goto_1

    .line 106
    :pswitch_16
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->M:I

    goto/16 :goto_1

    .line 107
    :pswitch_17
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->L:I

    goto/16 :goto_1

    .line 108
    :pswitch_18
    iget v8, v0, Lgb;->F:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lgb;->F:F

    goto/16 :goto_1

    .line 109
    :pswitch_19
    iget v8, v0, Lgb;->E:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lgb;->E:F

    goto/16 :goto_1

    .line 110
    :pswitch_1a
    iget-boolean v8, v0, Lgb;->X:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lgb;->X:Z

    goto/16 :goto_1

    .line 111
    :pswitch_1b
    iget-boolean v8, v0, Lgb;->W:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lgb;->W:Z

    goto/16 :goto_1

    .line 112
    :pswitch_1c
    iget v8, v0, Lgb;->B:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->B:I

    goto/16 :goto_1

    .line 113
    :pswitch_1d
    iget v8, v0, Lgb;->A:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->A:I

    goto/16 :goto_1

    .line 114
    :pswitch_1e
    iget v8, v0, Lgb;->z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->z:I

    goto/16 :goto_1

    .line 115
    :pswitch_1f
    iget v8, v0, Lgb;->y:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->y:I

    goto/16 :goto_1

    .line 116
    :pswitch_20
    iget v8, v0, Lgb;->x:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->x:I

    goto/16 :goto_1

    .line 117
    :pswitch_21
    iget v8, v0, Lgb;->w:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->w:I

    goto/16 :goto_1

    .line 118
    :pswitch_22
    iget v8, v0, Lgb;->v:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->v:I

    if-ne v8, v2, :cond_0

    .line 119
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->v:I

    goto/16 :goto_1

    .line 120
    :pswitch_23
    iget v8, v0, Lgb;->u:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->u:I

    if-ne v8, v2, :cond_0

    .line 121
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->u:I

    goto/16 :goto_1

    .line 122
    :pswitch_24
    iget v8, v0, Lgb;->t:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->t:I

    if-ne v8, v2, :cond_0

    .line 123
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->t:I

    goto/16 :goto_1

    .line 124
    :pswitch_25
    iget v8, v0, Lgb;->s:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->s:I

    if-ne v8, v2, :cond_0

    .line 125
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->s:I

    goto/16 :goto_1

    .line 126
    :pswitch_26
    iget v8, v0, Lgb;->m:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->m:I

    if-ne v8, v2, :cond_0

    .line 127
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->m:I

    goto/16 :goto_1

    .line 128
    :pswitch_27
    iget v8, v0, Lgb;->l:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->l:I

    if-ne v8, v2, :cond_0

    .line 129
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->l:I

    goto/16 :goto_1

    .line 130
    :pswitch_28
    iget v8, v0, Lgb;->k:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->k:I

    if-ne v8, v2, :cond_0

    .line 131
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->k:I

    goto/16 :goto_1

    .line 132
    :pswitch_29
    iget v8, v0, Lgb;->j:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->j:I

    if-ne v8, v2, :cond_0

    .line 133
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->j:I

    goto/16 :goto_1

    .line 134
    :pswitch_2a
    iget v8, v0, Lgb;->i:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->i:I

    if-ne v8, v2, :cond_0

    .line 135
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->i:I

    goto/16 :goto_1

    .line 136
    :pswitch_2b
    iget v8, v0, Lgb;->h:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->h:I

    if-ne v8, v2, :cond_0

    .line 137
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->h:I

    goto/16 :goto_1

    .line 138
    :pswitch_2c
    iget v8, v0, Lgb;->g:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->g:I

    if-ne v8, v2, :cond_0

    .line 139
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->g:I

    goto/16 :goto_1

    .line 140
    :pswitch_2d
    iget v8, v0, Lgb;->f:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->f:I

    if-ne v8, v2, :cond_0

    .line 141
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->f:I

    goto :goto_1

    .line 142
    :pswitch_2e
    iget v8, v0, Lgb;->e:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->e:I

    if-ne v8, v2, :cond_0

    .line 143
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->e:I

    goto :goto_1

    .line 144
    :pswitch_2f
    iget v8, v0, Lgb;->c:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lgb;->c:F

    goto :goto_1

    .line 145
    :pswitch_30
    iget v8, v0, Lgb;->b:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lgb;->b:I

    goto :goto_1

    .line 146
    :pswitch_31
    iget v8, v0, Lgb;->a:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lgb;->a:I

    goto :goto_1

    .line 147
    :pswitch_32
    iget v8, v0, Lgb;->r:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    const/high16 v8, 0x43b40000    # 360.0f

    rem-float/2addr v7, v8

    iput v7, v0, Lgb;->r:F

    cmpg-float v9, v7, v6

    if-gez v9, :cond_0

    sub-float v7, v8, v7

    rem-float/2addr v7, v8

    .line 148
    iput v7, v0, Lgb;->r:F

    goto :goto_1

    .line 149
    :pswitch_33
    iget v8, v0, Lgb;->q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lgb;->q:I

    goto :goto_1

    .line 150
    :pswitch_34
    iget v8, v0, Lgb;->p:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lgb;->p:I

    if-ne v8, v2, :cond_0

    .line 151
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->p:I

    goto :goto_1

    .line 152
    :pswitch_35
    iget v8, v0, Lgb;->V:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lgb;->V:I

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 153
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 154
    invoke-virtual {v0}, Lgb;->a()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x40
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 8

    .line 155
    new-instance v0, Lgb;

    .line 156
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, -0x1

    .line 157
    iput v1, v0, Lgb;->a:I

    .line 158
    iput v1, v0, Lgb;->b:I

    const/high16 v2, -0x40800000    # -1.0f

    .line 159
    iput v2, v0, Lgb;->c:F

    const/4 v3, 0x1

    .line 160
    iput-boolean v3, v0, Lgb;->d:Z

    .line 161
    iput v1, v0, Lgb;->e:I

    .line 162
    iput v1, v0, Lgb;->f:I

    .line 163
    iput v1, v0, Lgb;->g:I

    .line 164
    iput v1, v0, Lgb;->h:I

    .line 165
    iput v1, v0, Lgb;->i:I

    .line 166
    iput v1, v0, Lgb;->j:I

    .line 167
    iput v1, v0, Lgb;->k:I

    .line 168
    iput v1, v0, Lgb;->l:I

    .line 169
    iput v1, v0, Lgb;->m:I

    .line 170
    iput v1, v0, Lgb;->n:I

    .line 171
    iput v1, v0, Lgb;->o:I

    .line 172
    iput v1, v0, Lgb;->p:I

    const/4 v4, 0x0

    .line 173
    iput v4, v0, Lgb;->q:I

    const/4 v5, 0x0

    .line 174
    iput v5, v0, Lgb;->r:F

    .line 175
    iput v1, v0, Lgb;->s:I

    .line 176
    iput v1, v0, Lgb;->t:I

    .line 177
    iput v1, v0, Lgb;->u:I

    .line 178
    iput v1, v0, Lgb;->v:I

    const/high16 v5, -0x80000000

    .line 179
    iput v5, v0, Lgb;->w:I

    .line 180
    iput v5, v0, Lgb;->x:I

    .line 181
    iput v5, v0, Lgb;->y:I

    .line 182
    iput v5, v0, Lgb;->z:I

    .line 183
    iput v5, v0, Lgb;->A:I

    .line 184
    iput v5, v0, Lgb;->B:I

    .line 185
    iput v5, v0, Lgb;->C:I

    .line 186
    iput v4, v0, Lgb;->D:I

    const/high16 v6, 0x3f000000    # 0.5f

    .line 187
    iput v6, v0, Lgb;->E:F

    .line 188
    iput v6, v0, Lgb;->F:F

    const/4 v7, 0x0

    .line 189
    iput-object v7, v0, Lgb;->G:Ljava/lang/String;

    .line 190
    iput v2, v0, Lgb;->H:F

    .line 191
    iput v2, v0, Lgb;->I:F

    .line 192
    iput v4, v0, Lgb;->J:I

    .line 193
    iput v4, v0, Lgb;->K:I

    .line 194
    iput v4, v0, Lgb;->L:I

    .line 195
    iput v4, v0, Lgb;->M:I

    .line 196
    iput v4, v0, Lgb;->N:I

    .line 197
    iput v4, v0, Lgb;->O:I

    .line 198
    iput v4, v0, Lgb;->P:I

    .line 199
    iput v4, v0, Lgb;->Q:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 200
    iput v2, v0, Lgb;->R:F

    .line 201
    iput v2, v0, Lgb;->S:F

    .line 202
    iput v1, v0, Lgb;->T:I

    .line 203
    iput v1, v0, Lgb;->U:I

    .line 204
    iput v1, v0, Lgb;->V:I

    .line 205
    iput-boolean v4, v0, Lgb;->W:Z

    .line 206
    iput-boolean v4, v0, Lgb;->X:Z

    .line 207
    iput-object v7, v0, Lgb;->Y:Ljava/lang/String;

    .line 208
    iput v4, v0, Lgb;->Z:I

    .line 209
    iput-boolean v3, v0, Lgb;->a0:Z

    .line 210
    iput-boolean v3, v0, Lgb;->b0:Z

    .line 211
    iput-boolean v4, v0, Lgb;->c0:Z

    .line 212
    iput-boolean v4, v0, Lgb;->d0:Z

    .line 213
    iput-boolean v4, v0, Lgb;->e0:Z

    .line 214
    iput v1, v0, Lgb;->f0:I

    .line 215
    iput v1, v0, Lgb;->g0:I

    .line 216
    iput v1, v0, Lgb;->h0:I

    .line 217
    iput v1, v0, Lgb;->i0:I

    .line 218
    iput v5, v0, Lgb;->j0:I

    .line 219
    iput v5, v0, Lgb;->k0:I

    .line 220
    iput v6, v0, Lgb;->l0:F

    .line 221
    new-instance v1, Lrb;

    invoke-direct {v1}, Lrb;-><init>()V

    iput-object v1, v0, Lgb;->p0:Lrb;

    .line 222
    instance-of v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    .line 223
    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 224
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 225
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 226
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 227
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 228
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 229
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 230
    :cond_0
    instance-of v1, p1, Lgb;

    if-nez v1, :cond_1

    return-object v0

    .line 231
    :cond_1
    check-cast p1, Lgb;

    .line 232
    iget v1, p1, Lgb;->a:I

    iput v1, v0, Lgb;->a:I

    .line 233
    iget v1, p1, Lgb;->b:I

    iput v1, v0, Lgb;->b:I

    .line 234
    iget v1, p1, Lgb;->c:F

    iput v1, v0, Lgb;->c:F

    .line 235
    iget-boolean v1, p1, Lgb;->d:Z

    iput-boolean v1, v0, Lgb;->d:Z

    .line 236
    iget v1, p1, Lgb;->e:I

    iput v1, v0, Lgb;->e:I

    .line 237
    iget v1, p1, Lgb;->f:I

    iput v1, v0, Lgb;->f:I

    .line 238
    iget v1, p1, Lgb;->g:I

    iput v1, v0, Lgb;->g:I

    .line 239
    iget v1, p1, Lgb;->h:I

    iput v1, v0, Lgb;->h:I

    .line 240
    iget v1, p1, Lgb;->i:I

    iput v1, v0, Lgb;->i:I

    .line 241
    iget v1, p1, Lgb;->j:I

    iput v1, v0, Lgb;->j:I

    .line 242
    iget v1, p1, Lgb;->k:I

    iput v1, v0, Lgb;->k:I

    .line 243
    iget v1, p1, Lgb;->l:I

    iput v1, v0, Lgb;->l:I

    .line 244
    iget v1, p1, Lgb;->m:I

    iput v1, v0, Lgb;->m:I

    .line 245
    iget v1, p1, Lgb;->n:I

    iput v1, v0, Lgb;->n:I

    .line 246
    iget v1, p1, Lgb;->o:I

    iput v1, v0, Lgb;->o:I

    .line 247
    iget v1, p1, Lgb;->p:I

    iput v1, v0, Lgb;->p:I

    .line 248
    iget v1, p1, Lgb;->q:I

    iput v1, v0, Lgb;->q:I

    .line 249
    iget v1, p1, Lgb;->r:F

    iput v1, v0, Lgb;->r:F

    .line 250
    iget v1, p1, Lgb;->s:I

    iput v1, v0, Lgb;->s:I

    .line 251
    iget v1, p1, Lgb;->t:I

    iput v1, v0, Lgb;->t:I

    .line 252
    iget v1, p1, Lgb;->u:I

    iput v1, v0, Lgb;->u:I

    .line 253
    iget v1, p1, Lgb;->v:I

    iput v1, v0, Lgb;->v:I

    .line 254
    iget v1, p1, Lgb;->w:I

    iput v1, v0, Lgb;->w:I

    .line 255
    iget v1, p1, Lgb;->x:I

    iput v1, v0, Lgb;->x:I

    .line 256
    iget v1, p1, Lgb;->y:I

    iput v1, v0, Lgb;->y:I

    .line 257
    iget v1, p1, Lgb;->z:I

    iput v1, v0, Lgb;->z:I

    .line 258
    iget v1, p1, Lgb;->A:I

    iput v1, v0, Lgb;->A:I

    .line 259
    iget v1, p1, Lgb;->B:I

    iput v1, v0, Lgb;->B:I

    .line 260
    iget v1, p1, Lgb;->C:I

    iput v1, v0, Lgb;->C:I

    .line 261
    iget v1, p1, Lgb;->D:I

    iput v1, v0, Lgb;->D:I

    .line 262
    iget v1, p1, Lgb;->E:F

    iput v1, v0, Lgb;->E:F

    .line 263
    iget v1, p1, Lgb;->F:F

    iput v1, v0, Lgb;->F:F

    .line 264
    iget-object v1, p1, Lgb;->G:Ljava/lang/String;

    iput-object v1, v0, Lgb;->G:Ljava/lang/String;

    .line 265
    iget v1, p1, Lgb;->H:F

    iput v1, v0, Lgb;->H:F

    .line 266
    iget v1, p1, Lgb;->I:F

    iput v1, v0, Lgb;->I:F

    .line 267
    iget v1, p1, Lgb;->J:I

    iput v1, v0, Lgb;->J:I

    .line 268
    iget v1, p1, Lgb;->K:I

    iput v1, v0, Lgb;->K:I

    .line 269
    iget-boolean v1, p1, Lgb;->W:Z

    iput-boolean v1, v0, Lgb;->W:Z

    .line 270
    iget-boolean v1, p1, Lgb;->X:Z

    iput-boolean v1, v0, Lgb;->X:Z

    .line 271
    iget v1, p1, Lgb;->L:I

    iput v1, v0, Lgb;->L:I

    .line 272
    iget v1, p1, Lgb;->M:I

    iput v1, v0, Lgb;->M:I

    .line 273
    iget v1, p1, Lgb;->N:I

    iput v1, v0, Lgb;->N:I

    .line 274
    iget v1, p1, Lgb;->P:I

    iput v1, v0, Lgb;->P:I

    .line 275
    iget v1, p1, Lgb;->O:I

    iput v1, v0, Lgb;->O:I

    .line 276
    iget v1, p1, Lgb;->Q:I

    iput v1, v0, Lgb;->Q:I

    .line 277
    iget v1, p1, Lgb;->R:F

    iput v1, v0, Lgb;->R:F

    .line 278
    iget v1, p1, Lgb;->S:F

    iput v1, v0, Lgb;->S:F

    .line 279
    iget v1, p1, Lgb;->T:I

    iput v1, v0, Lgb;->T:I

    .line 280
    iget v1, p1, Lgb;->U:I

    iput v1, v0, Lgb;->U:I

    .line 281
    iget v1, p1, Lgb;->V:I

    iput v1, v0, Lgb;->V:I

    .line 282
    iget-boolean v1, p1, Lgb;->a0:Z

    iput-boolean v1, v0, Lgb;->a0:Z

    .line 283
    iget-boolean v1, p1, Lgb;->b0:Z

    iput-boolean v1, v0, Lgb;->b0:Z

    .line 284
    iget-boolean v1, p1, Lgb;->c0:Z

    iput-boolean v1, v0, Lgb;->c0:Z

    .line 285
    iget-boolean v1, p1, Lgb;->d0:Z

    iput-boolean v1, v0, Lgb;->d0:Z

    .line 286
    iget v1, p1, Lgb;->f0:I

    iput v1, v0, Lgb;->f0:I

    .line 287
    iget v1, p1, Lgb;->g0:I

    iput v1, v0, Lgb;->g0:I

    .line 288
    iget v1, p1, Lgb;->h0:I

    iput v1, v0, Lgb;->h0:I

    .line 289
    iget v1, p1, Lgb;->i0:I

    iput v1, v0, Lgb;->i0:I

    .line 290
    iget v1, p1, Lgb;->j0:I

    iput v1, v0, Lgb;->j0:I

    .line 291
    iget v1, p1, Lgb;->k0:I

    iput v1, v0, Lgb;->k0:I

    .line 292
    iget v1, p1, Lgb;->l0:F

    iput v1, v0, Lgb;->l0:F

    .line 293
    iget-object v1, p1, Lgb;->Y:Ljava/lang/String;

    iput-object v1, v0, Lgb;->Y:Ljava/lang/String;

    .line 294
    iget v1, p1, Lgb;->Z:I

    iput v1, v0, Lgb;->Z:I

    .line 295
    iget-object p1, p1, Lgb;->p0:Lrb;

    iput-object p1, v0, Lgb;->p0:Lrb;

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    iget v0, v0, Lsb;->D0:I

    return v0
.end method

.method public getSceneString()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    iget-object v2, v1, Lrb;->j:Ljava/lang/String;

    const/4 v3, -0x1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    if-eq v2, v3, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lrb;->j:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, "parent"

    iput-object v2, v1, Lrb;->j:Ljava/lang/String;

    :cond_1
    :goto_0
    iget-object v2, v1, Lrb;->h0:Ljava/lang/String;

    if-nez v2, :cond_2

    iget-object v2, v1, Lrb;->j:Ljava/lang/String;

    iput-object v2, v1, Lrb;->h0:Ljava/lang/String;

    :cond_2
    iget-object v2, v1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrb;

    iget-object v5, v4, Lrb;->f0:Landroid/view/View;

    if-eqz v5, :cond_3

    iget-object v6, v4, Lrb;->j:Ljava/lang/String;

    if-nez v6, :cond_4

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    if-eq v5, v3, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lrb;->j:Ljava/lang/String;

    :cond_4
    iget-object v5, v4, Lrb;->h0:Ljava/lang/String;

    if-nez v5, :cond_3

    iget-object v5, v4, Lrb;->j:Ljava/lang/String;

    iput-object v5, v4, Lrb;->h0:Ljava/lang/String;

    goto :goto_1

    :cond_5
    invoke-virtual {v1, v0}, Lsb;->n(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Landroid/view/View;)Lrb;
    .locals 1

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Lgb;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Lgb;

    iget-object p1, p1, Lgb;->p0:Lrb;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Lgb;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Lgb;

    iget-object p1, p1, Lgb;->p0:Lrb;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i(Landroid/util/AttributeSet;I)V
    .locals 7

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    iput-object p0, v0, Lrb;->f0:Landroid/view/View;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lhb;

    iput-object v1, v0, Lsb;->u0:Lhb;

    iget-object v2, v0, Lsb;->s0:Lud;

    iput-object v1, v2, Lud;->f:Lhb;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lqb;

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, LOu;->b:[I

    const/4 v4, 0x0

    invoke-virtual {v2, p1, v3, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    move v2, v4

    :goto_0
    if-ge v2, p2, :cond_7

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    const/16 v5, 0x10

    if-ne v3, v5, :cond_0

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    goto :goto_2

    :cond_0
    const/16 v5, 0x11

    if-ne v3, v5, :cond_1

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    goto :goto_2

    :cond_1
    const/16 v5, 0xe

    if-ne v3, v5, :cond_2

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_2
    const/16 v5, 0xf

    if-ne v3, v5, :cond_3

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_3
    const/16 v5, 0x71

    if-ne v3, v5, :cond_4

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    goto :goto_2

    :cond_4
    const/16 v5, 0x38

    if-ne v3, v5, :cond_5

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_6

    :try_start_0
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->j(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:LP3;

    goto :goto_2

    :cond_5
    const/16 v5, 0x22

    if-ne v3, v5, :cond_6

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    :try_start_1
    new-instance v5, Lqb;

    invoke-direct {v5}, Lqb;-><init>()V

    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lqb;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Lqb;->e(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lqb;

    :goto_1
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    iput p1, v0, Lsb;->D0:I

    const/16 p1, 0x200

    invoke-virtual {v0, p1}, Lsb;->W(I)Z

    move-result p1

    sput-boolean p1, Lmo;->q:Z

    return-void
.end method

.method public final j(I)V
    .locals 5

    new-instance v0, LP3;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0xc

    invoke-direct {v0, v2}, LP3;-><init>(I)V

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, LP3;->b:Ljava/lang/Object;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, LP3;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    const/4 v4, 0x2

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v4, "Variant"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljb;

    invoke-direct {v2, v1, p1}, Ljb;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eqz v3, :cond_1

    iget-object v4, v3, Lib;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_1
    const-string v4, "layoutDescription"

    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_2
    const-string v4, "StateSet"

    goto :goto_1

    :sswitch_3
    const-string v4, "State"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lib;

    invoke-direct {v2, v1, p1}, Lib;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    iget-object v3, v0, LP3;->b:Ljava/lang/Object;

    check-cast v3, Landroid/util/SparseArray;

    iget v4, v2, Lib;->b:I

    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object v3, v2

    goto :goto_2

    :sswitch_4
    const-string v4, "ConstraintSet"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1, p1}, LP3;->M(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    :cond_1
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:LP3;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final k(Lsb;III)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int v10, v7, v9

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v11

    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lhb;

    iput v7, v12, Lhb;->b:I

    iput v9, v12, Lhb;->c:I

    iput v11, v12, Lhb;->d:I

    iput v10, v12, Lhb;->e:I

    move/from16 v9, p3

    iput v9, v12, Lhb;->f:I

    move/from16 v9, p4

    iput v9, v12, Lhb;->g:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v13

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-gtz v9, :cond_1

    if-lez v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v15

    iget v15, v15, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v16, 0x400000

    and-int v15, v15, v16

    if-eqz v15, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v15

    if-ne v14, v15, :cond_2

    move v9, v13

    :cond_2
    :goto_1
    sub-int/2addr v4, v11

    sub-int/2addr v6, v10

    iget v10, v12, Lhb;->e:I

    iget v11, v12, Lhb;->d:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const/high16 v15, 0x40000000    # 2.0f

    const/high16 v13, -0x80000000

    if-eq v3, v13, :cond_6

    if-eqz v3, :cond_4

    if-eq v3, v15, :cond_3

    move/from16 v17, v8

    goto :goto_4

    :cond_3
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v14, v11

    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v14

    move/from16 v17, v14

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    if-nez v12, :cond_5

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    :goto_2
    move/from16 v17, v14

    :goto_3
    const/4 v14, 0x2

    goto :goto_4

    :cond_5
    move/from16 v17, v8

    goto :goto_3

    :cond_6
    if-nez v12, :cond_7

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_2

    :cond_7
    move/from16 v17, v4

    goto :goto_3

    :goto_4
    if-eq v5, v13, :cond_b

    if-eqz v5, :cond_9

    if-eq v5, v15, :cond_8

    move v13, v8

    :goto_5
    const/4 v12, 0x1

    goto :goto_8

    :cond_8
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v12, v10

    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v13, v12

    goto :goto_5

    :cond_9
    if-nez v12, :cond_a

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    :goto_6
    move v13, v12

    :goto_7
    const/4 v12, 0x2

    goto :goto_8

    :cond_a
    move v13, v8

    goto :goto_7

    :cond_b
    if-nez v12, :cond_c

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    goto :goto_6

    :cond_c
    move v13, v6

    goto :goto_7

    :goto_8
    invoke-virtual {v1}, Lrb;->q()I

    move-result v15

    iget-object v8, v1, Lsb;->s0:Lud;

    move/from16 v19, v10

    iget-object v10, v1, Lrb;->C:[I

    move-object/from16 v20, v10

    move/from16 v10, v17

    if-ne v10, v15, :cond_d

    invoke-virtual {v1}, Lrb;->k()I

    move-result v15

    if-eq v13, v15, :cond_e

    :cond_d
    const/4 v15, 0x1

    goto :goto_a

    :cond_e
    const/16 p4, 0x1

    :goto_9
    const/4 v15, 0x0

    goto :goto_b

    :goto_a
    iput-boolean v15, v8, Lud;->c:Z

    move/from16 p4, v15

    goto :goto_9

    :goto_b
    iput v15, v1, Lrb;->Y:I

    iput v15, v1, Lrb;->Z:I

    move/from16 v18, v15

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v15, v11

    aput v15, v20, v18

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int v15, v15, v19

    aput v15, v20, p4

    move/from16 v15, v18

    iput v15, v1, Lrb;->b0:I

    iput v15, v1, Lrb;->c0:I

    invoke-virtual {v1, v14}, Lrb;->M(I)V

    invoke-virtual {v1, v10}, Lrb;->O(I)V

    invoke-virtual {v1, v12}, Lrb;->N(I)V

    invoke-virtual {v1, v13}, Lrb;->L(I)V

    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    sub-int/2addr v10, v11

    if-gez v10, :cond_f

    iput v15, v1, Lrb;->b0:I

    goto :goto_c

    :cond_f
    iput v10, v1, Lrb;->b0:I

    :goto_c
    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    sub-int v10, v10, v19

    if-gez v10, :cond_10

    iput v15, v1, Lrb;->c0:I

    goto :goto_d

    :cond_10
    iput v10, v1, Lrb;->c0:I

    :goto_d
    iput v9, v1, Lsb;->x0:I

    iput v7, v1, Lsb;->y0:I

    iget-object v7, v1, Lsb;->r0:Lw4;

    iget-object v9, v7, Lw4;->d:Ljava/lang/Object;

    check-cast v9, Lsb;

    iget-object v10, v7, Lw4;->b:Ljava/lang/Object;

    check-cast v10, Ljava/util/ArrayList;

    iget-object v11, v1, Lsb;->u0:Lhb;

    iget-object v12, v1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-virtual {v1}, Lrb;->q()I

    move-result v13

    invoke-virtual {v1}, Lrb;->k()I

    move-result v14

    const/16 v15, 0x80

    invoke-static {v2, v15}, LQj;->n(II)Z

    move-result v15

    const/16 v0, 0x40

    if-nez v15, :cond_12

    invoke-static {v2, v0}, LQj;->n(II)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_e

    :cond_11
    const/4 v2, 0x0

    goto :goto_f

    :cond_12
    :goto_e
    const/4 v2, 0x1

    :goto_f
    const/16 v17, 0x0

    if-eqz v2, :cond_1b

    const/4 v0, 0x0

    :goto_10
    if-ge v0, v12, :cond_1b

    move/from16 v21, v2

    iget-object v2, v1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrb;

    move/from16 v22, v0

    iget-object v0, v2, Lrb;->p0:[I

    move-object/from16 v23, v0

    const/16 v18, 0x0

    aget v0, v23, v18

    move/from16 v24, v12

    const/4 v12, 0x3

    if-ne v0, v12, :cond_13

    const/16 v26, 0x1

    :goto_11
    const/16 v25, 0x1

    goto :goto_12

    :cond_13
    const/16 v26, 0x0

    goto :goto_11

    :goto_12
    aget v0, v23, v25

    if-ne v0, v12, :cond_14

    const/4 v0, 0x1

    goto :goto_13

    :cond_14
    const/4 v0, 0x0

    :goto_13
    if-eqz v26, :cond_15

    if-eqz v0, :cond_15

    iget v0, v2, Lrb;->W:F

    cmpl-float v0, v0, v17

    if-lez v0, :cond_15

    const/4 v0, 0x1

    goto :goto_14

    :cond_15
    const/4 v0, 0x0

    :goto_14
    invoke-virtual {v2}, Lrb;->x()Z

    move-result v12

    if-eqz v12, :cond_17

    if-eqz v0, :cond_17

    :cond_16
    :goto_15
    const/high16 v0, 0x40000000    # 2.0f

    const/16 v21, 0x0

    goto :goto_16

    :cond_17
    invoke-virtual {v2}, Lrb;->y()Z

    move-result v12

    if-eqz v12, :cond_18

    if-eqz v0, :cond_18

    goto :goto_15

    :cond_18
    instance-of v0, v2, LIh;

    if-eqz v0, :cond_19

    goto :goto_15

    :cond_19
    invoke-virtual {v2}, Lrb;->x()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {v2}, Lrb;->y()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_15

    :cond_1a
    add-int/lit8 v0, v22, 0x1

    move/from16 v2, v21

    move/from16 v12, v24

    goto :goto_10

    :cond_1b
    move/from16 v21, v2

    move/from16 v24, v12

    const/high16 v0, 0x40000000    # 2.0f

    :goto_16
    if-ne v3, v0, :cond_1c

    if-eq v5, v0, :cond_1d

    :cond_1c
    if-eqz v15, :cond_1e

    :cond_1d
    const/4 v0, 0x1

    goto :goto_17

    :cond_1e
    const/4 v0, 0x0

    :goto_17
    and-int v0, v21, v0

    if-eqz v0, :cond_3e

    const/16 v18, 0x0

    aget v12, v20, v18

    invoke-static {v12, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v12, 0x1

    aget v2, v20, v12

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/high16 v6, 0x40000000    # 2.0f

    if-ne v3, v6, :cond_20

    invoke-virtual {v1}, Lrb;->q()I

    move-result v6

    if-eq v6, v4, :cond_1f

    invoke-virtual {v1, v4}, Lrb;->O(I)V

    iput-boolean v12, v8, Lud;->b:Z

    :cond_1f
    const/high16 v6, 0x40000000    # 2.0f

    :cond_20
    if-ne v5, v6, :cond_21

    invoke-virtual {v1}, Lrb;->k()I

    move-result v4

    if-eq v4, v2, :cond_21

    invoke-virtual {v1, v2}, Lrb;->L(I)V

    iput-boolean v12, v8, Lud;->b:Z

    :cond_21
    if-ne v3, v6, :cond_37

    if-ne v5, v6, :cond_37

    iget-object v2, v8, Lud;->e:Ljava/util/ArrayList;

    iget-object v4, v8, Lud;->a:Lsb;

    iget-boolean v6, v8, Lud;->b:Z

    if-nez v6, :cond_23

    iget-boolean v6, v8, Lud;->c:Z

    if-eqz v6, :cond_22

    goto :goto_18

    :cond_22
    move/from16 v20, v0

    const/4 v0, 0x0

    goto :goto_1a

    :cond_23
    :goto_18
    iget-object v6, v4, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_24

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lrb;

    invoke-virtual {v12}, Lrb;->h()V

    move/from16 v20, v0

    const/4 v0, 0x0

    iput-boolean v0, v12, Lrb;->a:Z

    iget-object v0, v12, Lrb;->d:LRk;

    invoke-virtual {v0}, LRk;->n()V

    iget-object v0, v12, Lrb;->e:LTD;

    invoke-virtual {v0}, LTD;->m()V

    move/from16 v0, v20

    goto :goto_19

    :cond_24
    move/from16 v20, v0

    invoke-virtual {v4}, Lrb;->h()V

    const/4 v0, 0x0

    iput-boolean v0, v4, Lrb;->a:Z

    iget-object v6, v4, Lrb;->d:LRk;

    invoke-virtual {v6}, LRk;->n()V

    iget-object v6, v4, Lrb;->e:LTD;

    invoke-virtual {v6}, LTD;->m()V

    iput-boolean v0, v8, Lud;->c:Z

    :goto_1a
    iget-object v6, v8, Lud;->d:Lsb;

    invoke-virtual {v8, v6}, Lud;->b(Lsb;)V

    iput v0, v4, Lrb;->Y:I

    iget-object v6, v4, Lrb;->p0:[I

    iput v0, v4, Lrb;->Z:I

    invoke-virtual {v4, v0}, Lrb;->j(I)I

    move-result v12

    move-object/from16 v22, v2

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lrb;->j(I)I

    move-result v2

    iget-boolean v0, v8, Lud;->b:Z

    if-eqz v0, :cond_25

    invoke-virtual {v8}, Lud;->c()V

    :cond_25
    invoke-virtual {v4}, Lrb;->r()I

    move-result v0

    move-object/from16 v23, v6

    invoke-virtual {v4}, Lrb;->s()I

    move-result v6

    move-object/from16 v25, v11

    iget-object v11, v4, Lrb;->d:LRk;

    iget-object v11, v11, LgF;->h:Lvd;

    invoke-virtual {v11, v0}, Lvd;->d(I)V

    iget-object v11, v4, Lrb;->e:LTD;

    iget-object v11, v11, LgF;->h:Lvd;

    invoke-virtual {v11, v6}, Lvd;->d(I)V

    invoke-virtual {v8}, Lud;->g()V

    const/4 v11, 0x2

    if-eq v12, v11, :cond_28

    if-ne v2, v11, :cond_26

    goto :goto_1c

    :cond_26
    move/from16 v26, v0

    :cond_27
    const/4 v11, 0x1

    :goto_1b
    const/16 v18, 0x0

    goto :goto_1e

    :cond_28
    :goto_1c
    if-eqz v15, :cond_2a

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_29
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_2a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    check-cast v26, LgF;

    invoke-virtual/range {v26 .. v26}, LgF;->k()Z

    move-result v26

    if-nez v26, :cond_29

    const/4 v15, 0x0

    :cond_2a
    if-eqz v15, :cond_2b

    const/4 v11, 0x2

    if-ne v12, v11, :cond_2b

    const/4 v11, 0x1

    invoke-virtual {v4, v11}, Lrb;->M(I)V

    move/from16 v26, v0

    const/4 v11, 0x0

    invoke-virtual {v8, v4, v11}, Lud;->d(Lsb;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lrb;->O(I)V

    iget-object v0, v4, Lrb;->d:LRk;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v4}, Lrb;->q()I

    move-result v11

    invoke-virtual {v0, v11}, LRd;->d(I)V

    goto :goto_1d

    :cond_2b
    move/from16 v26, v0

    :goto_1d
    if-eqz v15, :cond_27

    const/4 v11, 0x2

    if-ne v2, v11, :cond_27

    const/4 v11, 0x1

    invoke-virtual {v4, v11}, Lrb;->N(I)V

    invoke-virtual {v8, v4, v11}, Lud;->d(Lsb;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lrb;->L(I)V

    iget-object v0, v4, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->e:LRd;

    invoke-virtual {v4}, Lrb;->k()I

    move-result v15

    invoke-virtual {v0, v15}, LRd;->d(I)V

    goto :goto_1b

    :goto_1e
    aget v0, v23, v18

    if-eq v0, v11, :cond_2d

    const/4 v11, 0x4

    if-ne v0, v11, :cond_2c

    goto :goto_1f

    :cond_2c
    const/4 v0, 0x0

    goto :goto_20

    :cond_2d
    :goto_1f
    invoke-virtual {v4}, Lrb;->q()I

    move-result v0

    add-int v0, v0, v26

    iget-object v11, v4, Lrb;->d:LRk;

    iget-object v11, v11, LgF;->i:Lvd;

    invoke-virtual {v11, v0}, Lvd;->d(I)V

    iget-object v11, v4, Lrb;->d:LRk;

    iget-object v11, v11, LgF;->e:LRd;

    sub-int v0, v0, v26

    invoke-virtual {v11, v0}, LRd;->d(I)V

    invoke-virtual {v8}, Lud;->g()V

    const/4 v11, 0x1

    aget v0, v23, v11

    if-eq v0, v11, :cond_2e

    const/4 v11, 0x4

    if-ne v0, v11, :cond_2f

    :cond_2e
    invoke-virtual {v4}, Lrb;->k()I

    move-result v0

    add-int/2addr v0, v6

    iget-object v11, v4, Lrb;->e:LTD;

    iget-object v11, v11, LgF;->i:Lvd;

    invoke-virtual {v11, v0}, Lvd;->d(I)V

    iget-object v11, v4, Lrb;->e:LTD;

    iget-object v11, v11, LgF;->e:LRd;

    sub-int/2addr v0, v6

    invoke-virtual {v11, v0}, LRd;->d(I)V

    :cond_2f
    invoke-virtual {v8}, Lud;->g()V

    const/4 v0, 0x1

    :goto_20
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_21
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_31

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LgF;

    iget-object v11, v8, LgF;->b:Lrb;

    if-ne v11, v4, :cond_30

    iget-boolean v11, v8, LgF;->g:Z

    if-nez v11, :cond_30

    goto :goto_21

    :cond_30
    invoke-virtual {v8}, LgF;->e()V

    goto :goto_21

    :cond_31
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_32
    :goto_22
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_36

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LgF;

    if-nez v0, :cond_33

    iget-object v11, v8, LgF;->b:Lrb;

    if-ne v11, v4, :cond_33

    goto :goto_22

    :cond_33
    iget-object v11, v8, LgF;->h:Lvd;

    iget-boolean v11, v11, Lvd;->j:Z

    if-nez v11, :cond_34

    :goto_23
    const/4 v0, 0x0

    goto :goto_24

    :cond_34
    iget-object v11, v8, LgF;->i:Lvd;

    iget-boolean v11, v11, Lvd;->j:Z

    if-nez v11, :cond_35

    instance-of v11, v8, Llk;

    if-nez v11, :cond_35

    goto :goto_23

    :cond_35
    iget-object v11, v8, LgF;->e:LRd;

    iget-boolean v11, v11, Lvd;->j:Z

    if-nez v11, :cond_32

    instance-of v11, v8, Lm7;

    if-nez v11, :cond_32

    instance-of v8, v8, Llk;

    if-nez v8, :cond_32

    goto :goto_23

    :cond_36
    const/4 v0, 0x1

    :goto_24
    invoke-virtual {v4, v12}, Lrb;->M(I)V

    invoke-virtual {v4, v2}, Lrb;->N(I)V

    move v2, v0

    const/4 v0, 0x2

    const/high16 v6, 0x40000000    # 2.0f

    goto/16 :goto_28

    :cond_37
    move/from16 v20, v0

    move-object/from16 v25, v11

    iget-object v0, v8, Lud;->a:Lsb;

    iget-boolean v2, v8, Lud;->b:Z

    if-eqz v2, :cond_39

    iget-object v2, v0, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrb;

    invoke-virtual {v4}, Lrb;->h()V

    const/4 v11, 0x0

    iput-boolean v11, v4, Lrb;->a:Z

    iget-object v6, v4, Lrb;->d:LRk;

    iget-object v12, v6, LgF;->e:LRd;

    iput-boolean v11, v12, Lvd;->j:Z

    iput-boolean v11, v6, LgF;->g:Z

    invoke-virtual {v6}, LRk;->n()V

    iget-object v4, v4, Lrb;->e:LTD;

    iget-object v6, v4, LgF;->e:LRd;

    iput-boolean v11, v6, Lvd;->j:Z

    iput-boolean v11, v4, LgF;->g:Z

    invoke-virtual {v4}, LTD;->m()V

    goto :goto_25

    :cond_38
    const/4 v11, 0x0

    invoke-virtual {v0}, Lrb;->h()V

    iput-boolean v11, v0, Lrb;->a:Z

    iget-object v2, v0, Lrb;->d:LRk;

    iget-object v4, v2, LgF;->e:LRd;

    iput-boolean v11, v4, Lvd;->j:Z

    iput-boolean v11, v2, LgF;->g:Z

    invoke-virtual {v2}, LRk;->n()V

    iget-object v2, v0, Lrb;->e:LTD;

    iget-object v4, v2, LgF;->e:LRd;

    iput-boolean v11, v4, Lvd;->j:Z

    iput-boolean v11, v2, LgF;->g:Z

    invoke-virtual {v2}, LTD;->m()V

    invoke-virtual {v8}, Lud;->c()V

    goto :goto_26

    :cond_39
    const/4 v11, 0x0

    :goto_26
    iget-object v2, v8, Lud;->d:Lsb;

    invoke-virtual {v8, v2}, Lud;->b(Lsb;)V

    iput v11, v0, Lrb;->Y:I

    iput v11, v0, Lrb;->Z:I

    iget-object v2, v0, Lrb;->d:LRk;

    iget-object v2, v2, LgF;->h:Lvd;

    invoke-virtual {v2, v11}, Lvd;->d(I)V

    iget-object v0, v0, Lrb;->e:LTD;

    iget-object v0, v0, LgF;->h:Lvd;

    invoke-virtual {v0, v11}, Lvd;->d(I)V

    const/high16 v6, 0x40000000    # 2.0f

    if-ne v3, v6, :cond_3a

    invoke-virtual {v1, v11, v15}, Lsb;->T(IZ)Z

    move-result v0

    move v2, v0

    const/4 v0, 0x1

    goto :goto_27

    :cond_3a
    const/4 v0, 0x0

    const/4 v2, 0x1

    :goto_27
    if-ne v5, v6, :cond_3b

    const/4 v11, 0x1

    invoke-virtual {v1, v11, v15}, Lsb;->T(IZ)Z

    move-result v4

    and-int/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    :cond_3b
    :goto_28
    if-eqz v2, :cond_3f

    if-ne v3, v6, :cond_3c

    const/4 v3, 0x1

    goto :goto_29

    :cond_3c
    const/4 v3, 0x0

    :goto_29
    if-ne v5, v6, :cond_3d

    const/4 v4, 0x1

    goto :goto_2a

    :cond_3d
    const/4 v4, 0x0

    :goto_2a
    invoke-virtual {v1, v3, v4}, Lsb;->P(ZZ)V

    goto :goto_2b

    :cond_3e
    move/from16 v20, v0

    move-object/from16 v25, v11

    const/4 v0, 0x0

    const/4 v2, 0x0

    :cond_3f
    :goto_2b
    if-eqz v2, :cond_41

    const/4 v11, 0x2

    if-eq v0, v11, :cond_40

    goto :goto_2c

    :cond_40
    return-void

    :cond_41
    :goto_2c
    iget v0, v1, Lsb;->D0:I

    if-lez v24, :cond_4f

    iget-object v2, v1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x40

    invoke-virtual {v1, v3}, Lsb;->W(I)Z

    move-result v3

    iget-object v4, v1, Lsb;->u0:Lhb;

    const/4 v15, 0x0

    :goto_2d
    if-ge v15, v2, :cond_4d

    iget-object v5, v1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrb;

    instance-of v6, v5, Lkk;

    if-eqz v6, :cond_42

    :goto_2e
    move/from16 v16, v2

    const/4 v12, 0x3

    goto/16 :goto_31

    :cond_42
    instance-of v6, v5, Lq5;

    if-eqz v6, :cond_43

    goto :goto_2e

    :cond_43
    iget-boolean v6, v5, Lrb;->F:Z

    if-eqz v6, :cond_44

    goto :goto_2e

    :cond_44
    if-eqz v3, :cond_45

    iget-object v6, v5, Lrb;->d:LRk;

    if-eqz v6, :cond_45

    iget-object v8, v5, Lrb;->e:LTD;

    if-eqz v8, :cond_45

    iget-object v6, v6, LgF;->e:LRd;

    iget-boolean v6, v6, Lvd;->j:Z

    if-eqz v6, :cond_45

    iget-object v6, v8, LgF;->e:LRd;

    iget-boolean v6, v6, Lvd;->j:Z

    if-eqz v6, :cond_45

    goto :goto_2e

    :cond_45
    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Lrb;->j(I)I

    move-result v6

    const/4 v11, 0x1

    invoke-virtual {v5, v11}, Lrb;->j(I)I

    move-result v8

    const/4 v12, 0x3

    move/from16 v16, v2

    if-ne v6, v12, :cond_46

    iget v2, v5, Lrb;->r:I

    if-eq v2, v11, :cond_46

    if-ne v8, v12, :cond_46

    iget v2, v5, Lrb;->s:I

    if-eq v2, v11, :cond_46

    move v2, v11

    goto :goto_2f

    :cond_46
    const/4 v2, 0x0

    :goto_2f
    if-nez v2, :cond_4a

    invoke-virtual {v1, v11}, Lsb;->W(I)Z

    move-result v12

    if-eqz v12, :cond_4a

    instance-of v11, v5, LIh;

    if-nez v11, :cond_4a

    const/4 v12, 0x3

    if-ne v6, v12, :cond_47

    iget v11, v5, Lrb;->r:I

    if-nez v11, :cond_47

    if-eq v8, v12, :cond_47

    invoke-virtual {v5}, Lrb;->x()Z

    move-result v11

    if-nez v11, :cond_47

    const/4 v2, 0x1

    :cond_47
    if-ne v8, v12, :cond_48

    iget v11, v5, Lrb;->s:I

    if-nez v11, :cond_48

    if-eq v6, v12, :cond_48

    invoke-virtual {v5}, Lrb;->x()Z

    move-result v11

    if-nez v11, :cond_48

    const/4 v2, 0x1

    :cond_48
    if-eq v6, v12, :cond_49

    if-ne v8, v12, :cond_4b

    :cond_49
    iget v6, v5, Lrb;->W:F

    cmpl-float v6, v6, v17

    if-lez v6, :cond_4b

    const/4 v2, 0x1

    goto :goto_30

    :cond_4a
    const/4 v12, 0x3

    :cond_4b
    :goto_30
    if-eqz v2, :cond_4c

    goto :goto_31

    :cond_4c
    const/4 v11, 0x0

    invoke-virtual {v7, v11, v4, v5}, Lw4;->z(ILhb;Lrb;)Z

    :goto_31
    add-int/lit8 v15, v15, 0x1

    move/from16 v2, v16

    goto/16 :goto_2d

    :cond_4d
    iget-object v2, v4, Lhb;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    iget-object v4, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    const/4 v15, 0x0

    :goto_32
    if-ge v15, v3, :cond_4e

    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v15, v15, 0x1

    goto :goto_32

    :cond_4e
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_4f

    const/4 v15, 0x0

    :goto_33
    if-ge v15, v2, :cond_4f

    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v15, v15, 0x1

    goto :goto_33

    :cond_4f
    invoke-virtual {v7, v1}, Lw4;->K(Lsb;)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v11, 0x0

    if-lez v24, :cond_50

    invoke-virtual {v7, v1, v11, v13, v14}, Lw4;->H(Lsb;III)V

    :cond_50
    if-lez v2, :cond_66

    iget-object v3, v1, Lrb;->p0:[I

    aget v4, v3, v11

    const/4 v5, 0x2

    if-ne v4, v5, :cond_51

    const/4 v15, 0x1

    :goto_34
    const/4 v12, 0x1

    goto :goto_35

    :cond_51
    move v15, v11

    goto :goto_34

    :goto_35
    aget v3, v3, v12

    if-ne v3, v5, :cond_52

    const/4 v3, 0x1

    goto :goto_36

    :cond_52
    move v3, v11

    :goto_36
    invoke-virtual {v1}, Lrb;->q()I

    move-result v4

    iget v5, v9, Lrb;->b0:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v1}, Lrb;->k()I

    move-result v5

    iget v6, v9, Lrb;->c0:I

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v6, v11

    move v8, v6

    :goto_37
    if-ge v6, v2, :cond_58

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lrb;

    instance-of v11, v12, LIh;

    if-nez v11, :cond_53

    move/from16 v16, v3

    move/from16 v17, v6

    move-object/from16 v3, v25

    goto/16 :goto_38

    :cond_53
    invoke-virtual {v12}, Lrb;->q()I

    move-result v11

    invoke-virtual {v12}, Lrb;->k()I

    move-result v9

    move/from16 v16, v3

    move/from16 v17, v6

    move-object/from16 v3, v25

    const/4 v6, 0x1

    invoke-virtual {v7, v6, v3, v12}, Lw4;->z(ILhb;Lrb;)Z

    move-result v19

    or-int v6, v8, v19

    invoke-virtual {v12}, Lrb;->q()I

    move-result v8

    move/from16 v19, v6

    invoke-virtual {v12}, Lrb;->k()I

    move-result v6

    if-eq v8, v11, :cond_55

    invoke-virtual {v12, v8}, Lrb;->O(I)V

    if-eqz v15, :cond_54

    invoke-virtual {v12}, Lrb;->r()I

    move-result v8

    iget v11, v12, Lrb;->U:I

    add-int/2addr v8, v11

    if-le v8, v4, :cond_54

    invoke-virtual {v12}, Lrb;->r()I

    move-result v8

    iget v11, v12, Lrb;->U:I

    add-int/2addr v8, v11

    const/4 v11, 0x4

    invoke-virtual {v12, v11}, Lrb;->i(I)Lcb;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcb;->e()I

    move-result v11

    add-int/2addr v11, v8

    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_54
    const/16 v19, 0x1

    :cond_55
    if-eq v6, v9, :cond_57

    invoke-virtual {v12, v6}, Lrb;->L(I)V

    if-eqz v16, :cond_56

    invoke-virtual {v12}, Lrb;->s()I

    move-result v6

    iget v8, v12, Lrb;->V:I

    add-int/2addr v6, v8

    if-le v6, v5, :cond_56

    invoke-virtual {v12}, Lrb;->s()I

    move-result v6

    iget v8, v12, Lrb;->V:I

    add-int/2addr v6, v8

    const/4 v8, 0x5

    invoke-virtual {v12, v8}, Lrb;->i(I)Lcb;

    move-result-object v8

    invoke-virtual {v8}, Lcb;->e()I

    move-result v8

    add-int/2addr v8, v6

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    :cond_56
    const/16 v19, 0x1

    :cond_57
    check-cast v12, LIh;

    iget-boolean v6, v12, LIh;->y0:Z

    or-int v6, v19, v6

    move v8, v6

    :goto_38
    add-int/lit8 v6, v17, 0x1

    move-object/from16 v25, v3

    move/from16 v3, v16

    const/4 v11, 0x0

    goto/16 :goto_37

    :cond_58
    move/from16 v16, v3

    const/4 v6, 0x0

    :goto_39
    move-object/from16 v3, v25

    const/4 v11, 0x2

    if-ge v6, v11, :cond_66

    move v9, v8

    const/4 v8, 0x0

    :goto_3a
    if-ge v8, v2, :cond_65

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lrb;

    instance-of v11, v12, Luk;

    if-eqz v11, :cond_5a

    instance-of v11, v12, LIh;

    if-eqz v11, :cond_59

    goto :goto_3c

    :cond_59
    :goto_3b
    move/from16 v17, v2

    goto :goto_3d

    :cond_5a
    :goto_3c
    instance-of v11, v12, Lkk;

    if-eqz v11, :cond_5b

    goto :goto_3b

    :cond_5b
    iget v11, v12, Lrb;->g0:I

    move/from16 v17, v2

    const/16 v2, 0x8

    if-ne v11, v2, :cond_5c

    goto :goto_3d

    :cond_5c
    if-eqz v20, :cond_5d

    iget-object v2, v12, Lrb;->d:LRk;

    iget-object v2, v2, LgF;->e:LRd;

    iget-boolean v2, v2, Lvd;->j:Z

    if-eqz v2, :cond_5d

    iget-object v2, v12, Lrb;->e:LTD;

    iget-object v2, v2, LgF;->e:LRd;

    iget-boolean v2, v2, Lvd;->j:Z

    if-eqz v2, :cond_5d

    goto :goto_3d

    :cond_5d
    instance-of v2, v12, LIh;

    if-eqz v2, :cond_5e

    :goto_3d
    move-object/from16 v25, v3

    move/from16 v23, v6

    move/from16 v19, v8

    const/4 v3, 0x4

    const/4 v6, 0x5

    goto/16 :goto_42

    :cond_5e
    invoke-virtual {v12}, Lrb;->q()I

    move-result v2

    invoke-virtual {v12}, Lrb;->k()I

    move-result v11

    move/from16 v19, v8

    iget v8, v12, Lrb;->a0:I

    move/from16 v22, v9

    const/4 v9, 0x1

    if-ne v6, v9, :cond_5f

    const/4 v9, 0x2

    :cond_5f
    invoke-virtual {v7, v9, v3, v12}, Lw4;->z(ILhb;Lrb;)Z

    move-result v9

    or-int v9, v22, v9

    move-object/from16 v25, v3

    invoke-virtual {v12}, Lrb;->q()I

    move-result v3

    move/from16 v23, v6

    invoke-virtual {v12}, Lrb;->k()I

    move-result v6

    if-eq v3, v2, :cond_61

    invoke-virtual {v12, v3}, Lrb;->O(I)V

    if-eqz v15, :cond_60

    invoke-virtual {v12}, Lrb;->r()I

    move-result v2

    iget v3, v12, Lrb;->U:I

    add-int/2addr v2, v3

    if-le v2, v4, :cond_60

    invoke-virtual {v12}, Lrb;->r()I

    move-result v2

    iget v3, v12, Lrb;->U:I

    add-int/2addr v2, v3

    const/4 v3, 0x4

    invoke-virtual {v12, v3}, Lrb;->i(I)Lcb;

    move-result-object v9

    invoke-virtual {v9}, Lcb;->e()I

    move-result v9

    add-int/2addr v9, v2

    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_3e

    :cond_60
    const/4 v3, 0x4

    :goto_3e
    const/4 v9, 0x1

    goto :goto_3f

    :cond_61
    const/4 v3, 0x4

    :goto_3f
    if-eq v6, v11, :cond_63

    invoke-virtual {v12, v6}, Lrb;->L(I)V

    if-eqz v16, :cond_62

    invoke-virtual {v12}, Lrb;->s()I

    move-result v2

    iget v6, v12, Lrb;->V:I

    add-int/2addr v2, v6

    if-le v2, v5, :cond_62

    invoke-virtual {v12}, Lrb;->s()I

    move-result v2

    iget v6, v12, Lrb;->V:I

    add-int/2addr v2, v6

    const/4 v6, 0x5

    invoke-virtual {v12, v6}, Lrb;->i(I)Lcb;

    move-result-object v9

    invoke-virtual {v9}, Lcb;->e()I

    move-result v9

    add-int/2addr v9, v2

    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_40

    :cond_62
    const/4 v6, 0x5

    :goto_40
    const/4 v9, 0x1

    goto :goto_41

    :cond_63
    const/4 v6, 0x5

    :goto_41
    iget-boolean v2, v12, Lrb;->E:Z

    if-eqz v2, :cond_64

    iget v2, v12, Lrb;->a0:I

    if-eq v8, v2, :cond_64

    const/4 v9, 0x1

    :cond_64
    :goto_42
    add-int/lit8 v8, v19, 0x1

    move/from16 v2, v17

    move/from16 v6, v23

    move-object/from16 v3, v25

    const/4 v11, 0x2

    goto/16 :goto_3a

    :cond_65
    move/from16 v17, v2

    move-object/from16 v25, v3

    move/from16 v23, v6

    move/from16 v22, v9

    const/4 v3, 0x4

    const/4 v6, 0x5

    if-eqz v22, :cond_66

    add-int/lit8 v2, v23, 0x1

    invoke-virtual {v7, v1, v2, v13, v14}, Lw4;->H(Lsb;III)V

    move v6, v2

    move/from16 v2, v17

    const/4 v8, 0x0

    goto/16 :goto_39

    :cond_66
    iput v0, v1, Lsb;->D0:I

    const/16 v0, 0x200

    invoke-virtual {v1, v0}, Lsb;->W(I)Z

    move-result v0

    sput-boolean v0, Lmo;->q:Z

    return-void
.end method

.method public final l(Lrb;Lgb;Landroid/util/SparseArray;II)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p3, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lrb;

    if-eqz p3, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    instance-of p4, p4, Lgb;

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    iput-boolean p4, p2, Lgb;->c0:Z

    const/4 v1, 0x6

    if-ne p5, v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lgb;

    iput-boolean p4, v0, Lgb;->c0:Z

    iget-object v0, v0, Lgb;->p0:Lrb;

    iput-boolean p4, v0, Lrb;->E:Z

    :cond_0
    invoke-virtual {p1, v1}, Lrb;->i(I)Lcb;

    move-result-object v0

    invoke-virtual {p3, p5}, Lrb;->i(I)Lcb;

    move-result-object p3

    iget p5, p2, Lgb;->D:I

    iget p2, p2, Lgb;->C:I

    invoke-virtual {v0, p3, p5, p2, p4}, Lcb;->b(Lcb;IIZ)Z

    iput-boolean p4, p1, Lrb;->E:Z

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lrb;->i(I)Lcb;

    move-result-object p2

    invoke-virtual {p2}, Lcb;->j()V

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Lrb;->i(I)Lcb;

    move-result-object p1

    invoke-virtual {p1}, Lcb;->j()V

    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_1

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lgb;

    iget-object v1, v0, Lgb;->p0:Lrb;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Lgb;->d0:Z

    if-nez v2, :cond_0

    iget-boolean v0, v0, Lgb;->e0:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lrb;->r()I

    move-result v0

    invoke-virtual {v1}, Lrb;->s()I

    move-result v2

    invoke-virtual {v1}, Lrb;->q()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Lrb;->k()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_2

    :goto_2
    if-ge p3, p2, :cond_2

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Leb;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v6, p1

    move/from16 v7, p2

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, v9

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    iput-boolean v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v2, 0x400000

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v1

    if-ne v8, v1, :cond_2

    move v1, v8

    goto :goto_2

    :cond_2
    move v1, v9

    :goto_2
    iget-object v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    iput-boolean v1, v10, Lsb;->v0:Z

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    if-eqz v1, :cond_50

    iput-boolean v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, v9

    :goto_3
    if-ge v2, v1, :cond_4

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_3

    move v11, v8

    goto :goto_4

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    move v11, v9

    :goto_4
    if-eqz v11, :cond_4f

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v12

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v13

    move v1, v9

    :goto_5
    if-ge v1, v13, :cond_6

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lrb;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_6

    :cond_5
    invoke-virtual {v2}, Lrb;->C()V

    :goto_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_6
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    const/4 v14, -0x1

    if-eqz v12, :cond_f

    move v3, v9

    :goto_7
    if-ge v3, v13, :cond_f

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v15

    invoke-virtual {v5, v15}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_9

    move/from16 v16, v8

    :try_start_1
    iget-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    if-nez v8, :cond_7

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    iput-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    :cond_7
    const-string v8, "/"

    invoke-virtual {v5, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    if-eq v8, v14, :cond_8

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v5, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_8

    :cond_8
    move-object v8, v5

    :goto_8
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    invoke-virtual {v2, v8, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_9
    move/from16 v16, v8

    :goto_9
    const/16 v2, 0x2f

    invoke-virtual {v5, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-eq v2, v14, :cond_a

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v2

    if-nez v2, :cond_b

    :goto_a
    move-object v2, v10

    goto :goto_b

    :cond_b
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_c

    if-eq v4, v0, :cond_c

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-ne v2, v0, :cond_c

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_c
    if-ne v4, v0, :cond_d

    goto :goto_a

    :cond_d
    if-nez v4, :cond_e

    const/4 v2, 0x0

    goto :goto_b

    :cond_e
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lgb;

    iget-object v2, v2, Lgb;->p0:Lrb;

    :goto_b
    iput-object v5, v2, Lrb;->h0:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_c

    :catch_0
    move/from16 v16, v8

    :catch_1
    :goto_c
    add-int/lit8 v3, v3, 0x1

    move/from16 v8, v16

    goto/16 :goto_7

    :cond_f
    move/from16 v16, v8

    iget v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    if-eq v2, v14, :cond_10

    move v2, v9

    :goto_d
    if-ge v2, v13, :cond_10

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_10
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lqb;

    if-eqz v2, :cond_11

    invoke-virtual {v2, v0}, Lqb;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_11
    iget-object v2, v10, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_19

    move v4, v9

    :goto_e
    if-ge v4, v3, :cond_19

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb;

    iget-object v15, v5, Leb;->g:Ljava/util/HashMap;

    invoke-virtual {v5}, Landroid/view/View;->isInEditMode()Z

    move-result v18

    if-eqz v18, :cond_12

    const/16 v18, 0x2

    iget-object v8, v5, Leb;->e:Ljava/lang/String;

    invoke-virtual {v5, v8}, Leb;->setIds(Ljava/lang/String;)V

    goto :goto_f

    :cond_12
    const/16 v18, 0x2

    :goto_f
    iget-object v8, v5, Leb;->d:Luk;

    if-nez v8, :cond_13

    move-object/from16 v19, v1

    move-object/from16 v21, v2

    goto/16 :goto_15

    :cond_13
    iput v9, v8, Luk;->r0:I

    iget-object v8, v8, Luk;->q0:[Lrb;

    const/4 v14, 0x0

    invoke-static {v8, v14}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    move v8, v9

    :goto_10
    iget v14, v5, Leb;->b:I

    if-ge v8, v14, :cond_18

    iget-object v14, v5, Leb;->a:[I

    aget v14, v14, v8

    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroid/view/View;

    if-nez v19, :cond_14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v5, v0, v14}, Leb;->f(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_14

    move-object/from16 v21, v2

    iget-object v2, v5, Leb;->a:[I

    aput v9, v2, v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v2, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroid/view/View;

    :goto_11
    move-object/from16 v2, v19

    goto :goto_12

    :cond_14
    move-object/from16 v21, v2

    goto :goto_11

    :goto_12
    if-eqz v2, :cond_17

    iget-object v9, v5, Leb;->d:Luk;

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lrb;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v2, v9, :cond_17

    if-nez v2, :cond_15

    goto :goto_13

    :cond_15
    iget v14, v9, Luk;->r0:I

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v19, v1

    iget-object v1, v9, Luk;->q0:[Lrb;

    move-object/from16 v22, v2

    array-length v2, v1

    if-le v14, v2, :cond_16

    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lrb;

    iput-object v1, v9, Luk;->q0:[Lrb;

    :cond_16
    iget-object v1, v9, Luk;->q0:[Lrb;

    iget v2, v9, Luk;->r0:I

    aput-object v22, v1, v2

    add-int/lit8 v2, v2, 0x1

    iput v2, v9, Luk;->r0:I

    goto :goto_14

    :cond_17
    :goto_13
    move-object/from16 v19, v1

    :goto_14
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v19

    move-object/from16 v2, v21

    const/4 v9, 0x0

    goto :goto_10

    :cond_18
    move-object/from16 v19, v1

    move-object/from16 v21, v2

    iget-object v1, v5, Leb;->d:Luk;

    invoke-virtual {v1}, Luk;->S()V

    :goto_15
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, v19

    move-object/from16 v2, v21

    const/4 v9, 0x0

    const/4 v14, -0x1

    goto/16 :goto_e

    :cond_19
    const/16 v18, 0x2

    const/4 v1, 0x0

    :goto_16
    if-ge v1, v13, :cond_1a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v1, v1, 0x1

    goto :goto_16

    :cond_1a
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v3, v1, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x0

    :goto_17
    if-ge v1, v13, :cond_1b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lrb;

    move-result-object v4

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v3, v2, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_17

    :cond_1b
    const/4 v8, 0x0

    :goto_18
    if-ge v8, v13, :cond_4f

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lrb;

    move-result-object v2

    if-nez v2, :cond_1d

    :cond_1c
    :goto_19
    move/from16 v17, v8

    move/from16 v29, v11

    move/from16 v4, v18

    const/4 v15, -0x1

    goto/16 :goto_30

    :cond_1d
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Lgb;

    iget-object v5, v10, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v2, Lrb;->T:Lrb;

    if-eqz v5, :cond_1e

    check-cast v5, Lsb;

    iget-object v5, v5, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lrb;->C()V

    :cond_1e
    iput-object v10, v2, Lrb;->T:Lrb;

    invoke-virtual {v4}, Lgb;->a()V

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v5

    iput v5, v2, Lrb;->g0:I

    iput-object v1, v2, Lrb;->f0:Landroid/view/View;

    instance-of v5, v1, Leb;

    if-eqz v5, :cond_1f

    check-cast v1, Leb;

    iget-boolean v5, v10, Lsb;->v0:Z

    invoke-virtual {v1, v2, v5}, Leb;->h(Lrb;Z)V

    :cond_1f
    iget-boolean v1, v4, Lgb;->d0:Z

    if-eqz v1, :cond_23

    check-cast v2, Lkk;

    iget v1, v4, Lgb;->m0:I

    iget v5, v4, Lgb;->n0:I

    iget v4, v4, Lgb;->o0:F

    const/high16 v9, -0x40800000    # -1.0f

    cmpl-float v14, v4, v9

    if-eqz v14, :cond_20

    if-lez v14, :cond_1c

    iput v4, v2, Lkk;->q0:F

    const/4 v4, -0x1

    iput v4, v2, Lkk;->r0:I

    iput v4, v2, Lkk;->s0:I

    goto :goto_1a

    :cond_20
    const/4 v4, -0x1

    if-eq v1, v4, :cond_22

    if-le v1, v4, :cond_21

    iput v9, v2, Lkk;->q0:F

    iput v1, v2, Lkk;->r0:I

    iput v4, v2, Lkk;->s0:I

    :cond_21
    :goto_1a
    move v15, v4

    move/from16 v17, v8

    move/from16 v29, v11

    move/from16 v4, v18

    goto/16 :goto_30

    :cond_22
    if-eq v5, v4, :cond_21

    if-le v5, v4, :cond_21

    iput v9, v2, Lkk;->q0:F

    iput v4, v2, Lkk;->r0:I

    iput v5, v2, Lkk;->s0:I

    goto :goto_19

    :cond_23
    iget v1, v4, Lgb;->f0:I

    iget v5, v4, Lgb;->g0:I

    iget v9, v4, Lgb;->h0:I

    iget v14, v4, Lgb;->i0:I

    iget v15, v4, Lgb;->j0:I

    iget v0, v4, Lgb;->k0:I

    move/from16 v17, v8

    iget v8, v4, Lgb;->l0:F

    move/from16 v19, v0

    iget v0, v4, Lgb;->p:I

    const/16 v27, 0x4

    const/16 v28, 0x2

    move/from16 v29, v11

    const/16 v30, 0x5

    const/16 v31, 0x3

    const/4 v11, -0x1

    const/16 v32, 0x0

    if-eq v0, v11, :cond_25

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_24

    iget v0, v4, Lgb;->r:F

    iget v1, v4, Lgb;->q:I

    const/16 v22, 0x7

    const/16 v25, 0x0

    move/from16 v23, v22

    move/from16 v24, v1

    move-object/from16 v21, v2

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    iput v0, v2, Lrb;->D:F

    :cond_24
    move-object/from16 v0, p0

    move-object v1, v2

    move-object v2, v4

    move/from16 v14, v27

    move/from16 v9, v28

    move/from16 v5, v30

    move/from16 v15, v31

    goto/16 :goto_25

    :cond_25
    if-eq v1, v11, :cond_28

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_26

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move/from16 v23, v28

    move/from16 v24, v0

    move-object/from16 v21, v2

    move/from16 v25, v15

    move/from16 v22, v28

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    goto :goto_1b

    :cond_26
    move-object/from16 v21, v2

    move/from16 v22, v28

    :cond_27
    :goto_1b
    move/from16 v23, v22

    move/from16 v22, v27

    goto :goto_1c

    :cond_28
    move-object/from16 v21, v2

    move/from16 v25, v15

    move/from16 v22, v28

    if-eq v5, v11, :cond_27

    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_27

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move/from16 v24, v0

    move/from16 v23, v27

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    move/from16 v33, v23

    move/from16 v23, v22

    move/from16 v22, v33

    :goto_1c
    if-eq v9, v11, :cond_2b

    invoke-virtual {v3, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_29

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move/from16 v24, v0

    move/from16 v25, v19

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    :cond_29
    move/from16 v9, v23

    :cond_2a
    :goto_1d
    move/from16 v14, v22

    goto :goto_1e

    :cond_2b
    move/from16 v25, v19

    move/from16 v9, v23

    if-eq v14, v11, :cond_2a

    invoke-virtual {v3, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_2a

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move/from16 v23, v22

    move/from16 v24, v0

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    goto :goto_1d

    :goto_1e
    iget v0, v4, Lgb;->i:I

    if-eq v0, v11, :cond_2d

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_2c

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v4, Lgb;->x:I

    move/from16 v23, v31

    move/from16 v24, v0

    move/from16 v25, v1

    move/from16 v22, v31

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    goto :goto_1f

    :cond_2c
    move/from16 v22, v31

    :goto_1f
    move/from16 v5, v22

    move/from16 v22, v30

    const/4 v11, -0x1

    goto :goto_20

    :cond_2d
    move/from16 v22, v31

    iget v0, v4, Lgb;->j:I

    const/4 v11, -0x1

    if-eq v0, v11, :cond_2e

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_2e

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v4, Lgb;->x:I

    move/from16 v24, v0

    move/from16 v25, v1

    move/from16 v23, v30

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    move/from16 v5, v22

    move/from16 v22, v23

    goto :goto_20

    :cond_2e
    move/from16 v5, v22

    move/from16 v22, v30

    :goto_20
    iget v0, v4, Lgb;->k:I

    if-eq v0, v11, :cond_31

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_2f

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v4, Lgb;->z:I

    move/from16 v24, v0

    move/from16 v25, v1

    move/from16 v23, v5

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    move/from16 v15, v23

    goto :goto_21

    :cond_2f
    move v15, v5

    :cond_30
    :goto_21
    move-object v2, v4

    goto :goto_22

    :cond_31
    move v15, v5

    iget v0, v4, Lgb;->l:I

    if-eq v0, v11, :cond_30

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lrb;

    if-eqz v26, :cond_30

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v4, Lgb;->z:I

    move/from16 v23, v22

    move/from16 v24, v0

    move/from16 v25, v1

    invoke-virtual/range {v21 .. v26}, Lrb;->v(IIIILrb;)V

    goto :goto_21

    :goto_22
    iget v4, v2, Lgb;->m:I

    const/4 v11, -0x1

    if-eq v4, v11, :cond_32

    const/4 v5, 0x6

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lrb;Lgb;Landroid/util/SparseArray;II)V

    :goto_23
    move/from16 v5, v22

    goto :goto_24

    :cond_32
    iget v4, v2, Lgb;->n:I

    if-eq v4, v11, :cond_33

    move-object/from16 v0, p0

    move v5, v15

    move-object/from16 v1, v21

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lrb;Lgb;Landroid/util/SparseArray;II)V

    goto :goto_23

    :cond_33
    iget v4, v2, Lgb;->o:I

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move/from16 v5, v22

    if-eq v4, v11, :cond_34

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lrb;Lgb;Landroid/util/SparseArray;II)V

    :cond_34
    :goto_24
    cmpl-float v4, v8, v32

    if-ltz v4, :cond_35

    iput v8, v1, Lrb;->d0:F

    :cond_35
    iget v4, v2, Lgb;->F:F

    cmpl-float v8, v4, v32

    if-ltz v8, :cond_36

    iput v4, v1, Lrb;->e0:F

    :cond_36
    :goto_25
    if-eqz v12, :cond_38

    iget v4, v2, Lgb;->T:I

    const/4 v11, -0x1

    if-ne v4, v11, :cond_37

    iget v8, v2, Lgb;->U:I

    if-eq v8, v11, :cond_38

    :cond_37
    iget v8, v2, Lgb;->U:I

    iput v4, v1, Lrb;->Y:I

    iput v8, v1, Lrb;->Z:I

    :cond_38
    iget-boolean v4, v2, Lgb;->a0:Z

    const/4 v8, 0x3

    const/4 v11, -0x2

    const/4 v5, 0x4

    if-nez v4, :cond_3b

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v15, -0x1

    if-ne v4, v15, :cond_3a

    iget-boolean v4, v2, Lgb;->W:Z

    if-eqz v4, :cond_39

    invoke-virtual {v1, v8}, Lrb;->M(I)V

    goto :goto_26

    :cond_39
    invoke-virtual {v1, v5}, Lrb;->M(I)V

    :goto_26
    invoke-virtual {v1, v9}, Lrb;->i(I)Lcb;

    move-result-object v4

    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v9, v4, Lcb;->g:I

    invoke-virtual {v1, v14}, Lrb;->i(I)Lcb;

    move-result-object v4

    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v9, v4, Lcb;->g:I

    goto :goto_27

    :cond_3a
    invoke-virtual {v1, v8}, Lrb;->M(I)V

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lrb;->O(I)V

    goto :goto_27

    :cond_3b
    move/from16 v4, v16

    invoke-virtual {v1, v4}, Lrb;->M(I)V

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v1, v4}, Lrb;->O(I)V

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v4, v11, :cond_3c

    move/from16 v4, v18

    invoke-virtual {v1, v4}, Lrb;->M(I)V

    :cond_3c
    :goto_27
    iget-boolean v4, v2, Lgb;->b0:Z

    if-nez v4, :cond_3f

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v15, -0x1

    if-ne v4, v15, :cond_3e

    iget-boolean v4, v2, Lgb;->X:Z

    if-eqz v4, :cond_3d

    invoke-virtual {v1, v8}, Lrb;->N(I)V

    :goto_28
    const/4 v5, 0x3

    goto :goto_29

    :cond_3d
    invoke-virtual {v1, v5}, Lrb;->N(I)V

    goto :goto_28

    :goto_29
    invoke-virtual {v1, v5}, Lrb;->i(I)Lcb;

    move-result-object v4

    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v5, v4, Lcb;->g:I

    const/4 v5, 0x5

    invoke-virtual {v1, v5}, Lrb;->i(I)Lcb;

    move-result-object v4

    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v5, v4, Lcb;->g:I

    goto :goto_2a

    :cond_3e
    invoke-virtual {v1, v8}, Lrb;->N(I)V

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lrb;->L(I)V

    goto :goto_2a

    :cond_3f
    const/4 v4, 0x1

    const/4 v15, -0x1

    invoke-virtual {v1, v4}, Lrb;->N(I)V

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v1, v4}, Lrb;->L(I)V

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v4, v11, :cond_40

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Lrb;->N(I)V

    :cond_40
    :goto_2a
    iget-object v4, v2, Lgb;->G:Ljava/lang/String;

    if-eqz v4, :cond_41

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_42

    :cond_41
    move/from16 v4, v32

    goto/16 :goto_2e

    :cond_42
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v9, 0x2c

    invoke-virtual {v4, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-lez v9, :cond_45

    add-int/lit8 v11, v5, -0x1

    if-ge v9, v11, :cond_45

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    const-string v11, "W"

    invoke-virtual {v14, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_43

    const/4 v11, 0x0

    goto :goto_2b

    :cond_43
    const-string v11, "H"

    invoke-virtual {v14, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_44

    const/4 v11, 0x1

    goto :goto_2b

    :cond_44
    move v11, v15

    :goto_2b
    add-int/lit8 v9, v9, 0x1

    goto :goto_2c

    :cond_45
    move v11, v15

    const/4 v9, 0x0

    :goto_2c
    const/16 v14, 0x3a

    invoke-virtual {v4, v14}, Ljava/lang/String;->indexOf(I)I

    move-result v14

    if-ltz v14, :cond_47

    add-int/lit8 v5, v5, -0x1

    if-ge v14, v5, :cond_47

    invoke-virtual {v4, v9, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v14, v14, 0x1

    invoke-virtual {v4, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_48

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_48

    :try_start_2
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    cmpl-float v9, v5, v32

    if-lez v9, :cond_48

    cmpl-float v9, v4, v32

    if-lez v9, :cond_48

    const/4 v9, 0x1

    if-ne v11, v9, :cond_46

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    goto :goto_2d

    :cond_46
    div-float/2addr v5, v4

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v4
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2d

    :cond_47
    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_48

    :try_start_3
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2d

    :catch_2
    :cond_48
    move/from16 v4, v32

    :goto_2d
    cmpl-float v5, v4, v32

    if-lez v5, :cond_49

    iput v4, v1, Lrb;->W:F

    iput v11, v1, Lrb;->X:I

    goto :goto_2f

    :goto_2e
    iput v4, v1, Lrb;->W:F

    :cond_49
    :goto_2f
    iget v4, v2, Lgb;->H:F

    iget-object v5, v1, Lrb;->k0:[F

    const/16 v20, 0x0

    aput v4, v5, v20

    iget v4, v2, Lgb;->I:F

    const/16 v16, 0x1

    aput v4, v5, v16

    iget v4, v2, Lgb;->J:I

    iput v4, v1, Lrb;->i0:I

    iget v4, v2, Lgb;->K:I

    iput v4, v1, Lrb;->j0:I

    iget v4, v2, Lgb;->Z:I

    if-ltz v4, :cond_4a

    if-gt v4, v8, :cond_4a

    iput v4, v1, Lrb;->q:I

    :cond_4a
    iget v4, v2, Lgb;->L:I

    iget v5, v2, Lgb;->N:I

    iget v8, v2, Lgb;->P:I

    iget v9, v2, Lgb;->R:F

    iput v4, v1, Lrb;->r:I

    iput v5, v1, Lrb;->u:I

    const v5, 0x7fffffff

    if-ne v8, v5, :cond_4b

    const/4 v8, 0x0

    :cond_4b
    iput v8, v1, Lrb;->v:I

    iput v9, v1, Lrb;->w:F

    const/16 v32, 0x0

    cmpl-float v8, v9, v32

    const/high16 v11, 0x3f800000    # 1.0f

    if-lez v8, :cond_4c

    cmpg-float v8, v9, v11

    if-gez v8, :cond_4c

    if-nez v4, :cond_4c

    const/4 v4, 0x2

    iput v4, v1, Lrb;->r:I

    :cond_4c
    iget v4, v2, Lgb;->M:I

    iget v8, v2, Lgb;->O:I

    iget v9, v2, Lgb;->Q:I

    iget v2, v2, Lgb;->S:F

    iput v4, v1, Lrb;->s:I

    iput v8, v1, Lrb;->x:I

    if-ne v9, v5, :cond_4d

    const/4 v9, 0x0

    :cond_4d
    iput v9, v1, Lrb;->y:I

    iput v2, v1, Lrb;->z:F

    const/16 v32, 0x0

    cmpl-float v5, v2, v32

    if-lez v5, :cond_4e

    cmpg-float v2, v2, v11

    if-gez v2, :cond_4e

    if-nez v4, :cond_4e

    const/4 v4, 0x2

    iput v4, v1, Lrb;->s:I

    goto :goto_30

    :cond_4e
    const/4 v4, 0x2

    :goto_30
    add-int/lit8 v8, v17, 0x1

    move/from16 v18, v4

    move/from16 v11, v29

    goto/16 :goto_18

    :cond_4f
    move/from16 v29, v11

    if-eqz v29, :cond_50

    iget-object v1, v10, Lsb;->r0:Lw4;

    invoke-virtual {v1, v10}, Lw4;->K(Lsb;)V

    :cond_50
    iget-object v1, v10, Lsb;->w0:Lmo;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {v0, v10, v1, v6, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->k(Lsb;III)V

    invoke-virtual {v10}, Lrb;->q()I

    move-result v1

    invoke-virtual {v10}, Lrb;->k()I

    move-result v2

    iget-boolean v3, v10, Lsb;->E0:Z

    iget-boolean v4, v10, Lsb;->F0:Z

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lhb;

    iget v8, v5, Lhb;->e:I

    iget v5, v5, Lhb;->d:I

    add-int/2addr v1, v5

    add-int/2addr v2, v8

    const/4 v11, 0x0

    invoke-static {v1, v6, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-static {v2, v7, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    const v5, 0xffffff

    and-int/2addr v1, v5

    and-int/2addr v2, v5

    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/high16 v5, 0x1000000

    if-eqz v3, :cond_51

    or-int/2addr v1, v5

    :cond_51
    if-eqz v4, :cond_52

    or-int/2addr v2, v5

    :cond_52
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lrb;

    move-result-object v0

    instance-of v1, p1, Ljk;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, Lkk;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lgb;

    new-instance v1, Lkk;

    invoke-direct {v1}, Lkk;-><init>()V

    iput-object v1, v0, Lgb;->p0:Lrb;

    iput-boolean v2, v0, Lgb;->d0:Z

    iget v0, v0, Lgb;->V:I

    invoke-virtual {v1, v0}, Lkk;->S(I)V

    :cond_0
    instance-of v0, p1, Leb;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Leb;

    invoke-virtual {v0}, Leb;->i()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lgb;

    iput-boolean v2, v1, Lgb;->e0:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lrb;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    iget-object v1, v1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lrb;->C()V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Lqb;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lqb;

    return-void
.end method

.method public setId(I)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v1, p1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Ltb;)V
    .locals 0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:LP3;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lsb;

    iput p1, v0, Lsb;->D0:I

    const/16 p1, 0x200

    invoke-virtual {v0, p1}, Lsb;->W(I)Z

    move-result p1

    sput-boolean p1, Lmo;->q:Z

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
