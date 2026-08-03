.class public abstract Landroidx/transition/i;
.super Landroidx/transition/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/i$c;,
        Landroidx/transition/i$b;,
        Landroidx/transition/i$a;
    }
.end annotation


# static fields
.field public static final D:[Ljava/lang/String;


# instance fields
.field public C:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "android:visibility:visibility"

    const-string v1, "android:visibility:parent"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/i;->D:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/transition/e;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Landroidx/transition/i;->C:I

    return-void
.end method

.method public static K(La/Ff;)V
    .locals 3

    iget-object v0, p0, La/Ff;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p0, La/Ff;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "android:visibility:visibility"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, La/Ff;->b:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v2, "android:visibility:parent"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const-string p0, "android:visibility:screenLocation"

    invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static L(La/Ff;La/Ff;)Landroidx/transition/i$c;
    .locals 8

    new-instance v0, Landroidx/transition/i$c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/transition/i$c;->a:Z

    iput-boolean v1, v0, Landroidx/transition/i$c;->b:Z

    const/4 v2, 0x0

    const/4 v3, -0x1

    const-string v4, "android:visibility:parent"

    const-string v5, "android:visibility:visibility"

    if-eqz p0, :cond_0

    iget-object v6, p0, La/Ff;->a:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iput v7, v0, Landroidx/transition/i$c;->c:I

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, Landroidx/transition/i$c;->e:Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    iput v3, v0, Landroidx/transition/i$c;->c:I

    iput-object v2, v0, Landroidx/transition/i$c;->e:Landroid/view/ViewGroup;

    :goto_0
    if-eqz p1, :cond_1

    iget-object v6, p1, La/Ff;->a:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, Landroidx/transition/i$c;->d:I

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, Landroidx/transition/i$c;->f:Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    iput v3, v0, Landroidx/transition/i$c;->d:I

    iput-object v2, v0, Landroidx/transition/i$c;->f:Landroid/view/ViewGroup;

    :goto_1
    const/4 v2, 0x1

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    iget p0, v0, Landroidx/transition/i$c;->c:I

    iget p1, v0, Landroidx/transition/i$c;->d:I

    if-ne p0, p1, :cond_2

    iget-object v3, v0, Landroidx/transition/i$c;->e:Landroid/view/ViewGroup;

    iget-object v4, v0, Landroidx/transition/i$c;->f:Landroid/view/ViewGroup;

    if-ne v3, v4, :cond_2

    goto :goto_2

    :cond_2
    if-eq p0, p1, :cond_4

    if-nez p0, :cond_3

    iput-boolean v1, v0, Landroidx/transition/i$c;->b:Z

    iput-boolean v2, v0, Landroidx/transition/i$c;->a:Z

    return-object v0

    :cond_3
    if-nez p1, :cond_8

    iput-boolean v2, v0, Landroidx/transition/i$c;->b:Z

    iput-boolean v2, v0, Landroidx/transition/i$c;->a:Z

    return-object v0

    :cond_4
    iget-object p0, v0, Landroidx/transition/i$c;->f:Landroid/view/ViewGroup;

    if-nez p0, :cond_5

    iput-boolean v1, v0, Landroidx/transition/i$c;->b:Z

    iput-boolean v2, v0, Landroidx/transition/i$c;->a:Z

    return-object v0

    :cond_5
    iget-object p0, v0, Landroidx/transition/i$c;->e:Landroid/view/ViewGroup;

    if-nez p0, :cond_8

    iput-boolean v2, v0, Landroidx/transition/i$c;->b:Z

    iput-boolean v2, v0, Landroidx/transition/i$c;->a:Z

    return-object v0

    :cond_6
    if-nez p0, :cond_7

    iget p0, v0, Landroidx/transition/i$c;->d:I

    if-nez p0, :cond_7

    iput-boolean v2, v0, Landroidx/transition/i$c;->b:Z

    iput-boolean v2, v0, Landroidx/transition/i$c;->a:Z

    return-object v0

    :cond_7
    if-nez p1, :cond_8

    iget p0, v0, Landroidx/transition/i$c;->c:I

    if-nez p0, :cond_8

    iput-boolean v1, v0, Landroidx/transition/i$c;->b:Z

    iput-boolean v2, v0, Landroidx/transition/i$c;->a:Z

    :cond_8
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final d(La/Ff;)V
    .locals 0

    invoke-static {p1}, Landroidx/transition/i;->K(La/Ff;)V

    return-void
.end method

.method public final k(Landroid/widget/FrameLayout;La/Ff;La/Ff;)Landroid/animation/Animator;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-static/range {p2 .. p3}, Landroidx/transition/i;->L(La/Ff;La/Ff;)Landroidx/transition/i$c;

    move-result-object v4

    iget-boolean v5, v4, Landroidx/transition/i$c;->a:Z

    if-eqz v5, :cond_0

    iget-object v5, v4, Landroidx/transition/i$c;->e:Landroid/view/ViewGroup;

    if-nez v5, :cond_1

    iget-object v5, v4, Landroidx/transition/i$c;->f:Landroid/view/ViewGroup;

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, v0

    const/16 v16, 0x0

    goto/16 :goto_f

    :cond_1
    :goto_1
    iget-boolean v5, v4, Landroidx/transition/i$c;->b:Z

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v5, :cond_4

    iget v1, v0, Landroidx/transition/i;->C:I

    and-int/2addr v1, v10

    if-ne v1, v10, :cond_0

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, v3, La/Ff;->b:Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v0, v3, v9}, Landroidx/transition/e;->n(Landroid/view/View;Z)La/Ff;

    move-result-object v4

    invoke-virtual {v0, v3, v9}, Landroidx/transition/e;->r(Landroid/view/View;Z)La/Ff;

    move-result-object v3

    invoke-static {v4, v3}, Landroidx/transition/i;->L(La/Ff;La/Ff;)Landroidx/transition/i$c;

    move-result-object v3

    iget-boolean v3, v3, Landroidx/transition/i$c;->a:Z

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    move-object v3, v0

    check-cast v3, Landroidx/transition/c;

    sget-object v4, La/Qg;->a:La/Vg;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v7}, Landroidx/transition/c;->N(La/Ff;F)F

    move-result v2

    invoke-virtual {v3, v1, v2, v8}, Landroidx/transition/c;->M(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v1

    return-object v1

    :cond_4
    iget v4, v4, Landroidx/transition/i$c;->d:I

    iget v5, v0, Landroidx/transition/i;->C:I

    const/4 v11, 0x2

    and-int/2addr v5, v11

    if-eq v5, v11, :cond_5

    goto :goto_0

    :cond_5
    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    if-eqz v3, :cond_7

    iget-object v5, v3, La/Ff;->b:Landroid/view/View;

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    :goto_2
    sget v12, Landroidx/transition/R$id;->save_overlay_view:I

    iget-object v13, v2, La/Ff;->b:Landroid/view/View;

    invoke-virtual {v13, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_8

    move/from16 v22, v4

    move/from16 v18, v9

    move v9, v10

    move/from16 v17, v9

    const/4 v6, 0x0

    :goto_3
    const/16 v16, 0x0

    goto/16 :goto_e

    :cond_8
    if-eqz v5, :cond_c

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v12

    if-nez v12, :cond_9

    goto :goto_6

    :cond_9
    const/4 v12, 0x4

    if-ne v4, v12, :cond_a

    goto :goto_4

    :cond_a
    if-ne v13, v5, :cond_b

    :goto_4
    move-object v12, v5

    move v14, v9

    const/4 v5, 0x0

    goto :goto_7

    :cond_b
    move v14, v10

    const/4 v5, 0x0

    :goto_5
    const/4 v12, 0x0

    goto :goto_7

    :cond_c
    :goto_6
    if-eqz v5, :cond_b

    move v14, v9

    goto :goto_5

    :goto_7
    if-eqz v14, :cond_15

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v14

    if-nez v14, :cond_d

    move/from16 v22, v4

    move/from16 v18, v9

    move/from16 v17, v10

    move-object v6, v12

    move-object v12, v13

    goto :goto_3

    :cond_d
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v14

    instance-of v14, v14, Landroid/view/View;

    if-eqz v14, :cond_15

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    invoke-virtual {v0, v14, v10}, Landroidx/transition/e;->r(Landroid/view/View;Z)La/Ff;

    move-result-object v15

    const/16 v16, 0x0

    invoke-virtual {v0, v14, v10}, Landroidx/transition/e;->n(Landroid/view/View;Z)La/Ff;

    move-result-object v6

    invoke-static {v15, v6}, Landroidx/transition/i;->L(La/Ff;La/Ff;)Landroidx/transition/i$c;

    move-result-object v6

    iget-boolean v6, v6, Landroidx/transition/i$c;->a:Z

    if-nez v6, :cond_14

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v14}, Landroid/view/View;->getScrollX()I

    move-result v6

    neg-int v6, v6

    int-to-float v6, v6

    invoke-virtual {v14}, Landroid/view/View;->getScrollY()I

    move-result v14

    neg-int v14, v14

    int-to-float v14, v14

    invoke-virtual {v5, v6, v14}, Landroid/graphics/Matrix;->setTranslate(FF)V

    sget-object v6, La/Qg;->a:La/Vg;

    invoke-virtual {v6, v13, v5}, La/Tg;->d(Landroid/view/View;Landroid/graphics/Matrix;)V

    invoke-virtual {v6, v1, v5}, La/Tg;->e(Landroid/view/View;Landroid/graphics/Matrix;)V

    new-instance v6, Landroid/graphics/RectF;

    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    move-result v15

    int-to-float v15, v15

    invoke-direct {v6, v7, v7, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v14, v6, Landroid/graphics/RectF;->left:F

    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    move-result v14

    iget v15, v6, Landroid/graphics/RectF;->top:F

    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    move-result v15

    move/from16 v17, v10

    iget v10, v6, Landroid/graphics/RectF;->right:F

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    move/from16 v18, v9

    iget v9, v6, Landroid/graphics/RectF;->bottom:F

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    new-instance v7, Landroid/widget/ImageView;

    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v7, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v11, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v7, v11}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v13}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v11

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v19

    if-eqz v19, :cond_e

    move/from16 v19, v17

    goto :goto_8

    :cond_e
    move/from16 v19, v18

    :goto_8
    if-nez v11, :cond_10

    if-nez v19, :cond_f

    move/from16 v22, v4

    move-object/from16 v21, v12

    move-object/from16 v0, v16

    goto/16 :goto_b

    :cond_f
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v19

    move-object/from16 v8, v19

    check-cast v8, Landroid/view/ViewGroup;

    invoke-virtual {v8, v13}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v19

    move-object/from16 v20, v8

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v8

    invoke-virtual {v8, v13}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    move/from16 v8, v19

    move/from16 v19, v11

    move v11, v8

    move-object/from16 v8, v20

    goto :goto_9

    :cond_10
    move/from16 v19, v11

    move-object/from16 v8, v16

    move/from16 v11, v18

    :goto_9
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v20

    move-object/from16 v21, v12

    invoke-static/range {v20 .. v20}, Ljava/lang/Math;->round(F)I

    move-result v12

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v20

    move/from16 v22, v4

    invoke-static/range {v20 .. v20}, Ljava/lang/Math;->round(F)I

    move-result v4

    if-lez v12, :cond_11

    if-lez v4, :cond_11

    mul-int v0, v12, v4

    int-to-float v0, v0

    const/high16 v20, 0x49800000    # 1048576.0f

    div-float v0, v20, v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    int-to-float v3, v12

    mul-float/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v4, v4

    mul-float/2addr v4, v0

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v12, v6, Landroid/graphics/RectF;->left:F

    neg-float v12, v12

    iget v6, v6, Landroid/graphics/RectF;->top:F

    neg-float v6, v6

    invoke-virtual {v5, v12, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    new-instance v0, Landroid/graphics/Picture;

    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {v13, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    invoke-static {v0}, La/Ef;->a(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_a

    :cond_11
    move-object/from16 v0, v16

    :goto_a
    if-nez v19, :cond_12

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v3

    invoke-virtual {v3, v13}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    invoke-virtual {v8, v13, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_12
    :goto_b
    if-eqz v0, :cond_13

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_13
    sub-int v0, v10, v14

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    sub-int v4, v9, v15

    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v7, v0, v3}, Landroid/view/View;->measure(II)V

    invoke-virtual {v7, v14, v15, v10, v9}, Landroid/view/View;->layout(IIII)V

    move-object v12, v7

    :goto_c
    move/from16 v9, v18

    move-object/from16 v6, v21

    goto :goto_e

    :cond_14
    move/from16 v22, v4

    move/from16 v18, v9

    move/from16 v17, v10

    move-object/from16 v21, v12

    invoke-virtual {v14}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {v14}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_16

    const/4 v3, -0x1

    if-eq v0, v3, :cond_16

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    goto :goto_d

    :cond_15
    move/from16 v22, v4

    move/from16 v18, v9

    move/from16 v17, v10

    move-object/from16 v21, v12

    const/16 v16, 0x0

    :cond_16
    :goto_d
    move-object v12, v5

    goto :goto_c

    :goto_e
    if-eqz v12, :cond_1b

    if-nez v9, :cond_17

    iget-object v0, v2, La/Ff;->a:Ljava/util/HashMap;

    const-string v3, "android:visibility:screenLocation"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    aget v3, v0, v18

    aget v0, v0, v17

    const/4 v4, 0x2

    new-array v4, v4, [I

    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v5, v4, v18

    sub-int/2addr v3, v5

    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {v12, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    aget v3, v4, v17

    sub-int/2addr v0, v3

    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {v12, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    :cond_17
    move-object/from16 v0, p0

    check-cast v0, Landroidx/transition/c;

    sget-object v3, La/Qg;->a:La/Vg;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/transition/c;->N(La/Ff;F)F

    move-result v2

    const/4 v5, 0x0

    invoke-virtual {v0, v12, v2, v5}, Landroidx/transition/c;->M(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v0

    if-nez v0, :cond_18

    move-object/from16 v5, p3

    invoke-static {v5, v4}, Landroidx/transition/c;->N(La/Ff;F)F

    move-result v2

    invoke-virtual {v3, v12, v2}, La/Sg;->b(Landroid/view/View;F)V

    :cond_18
    if-nez v9, :cond_1a

    if-nez v0, :cond_19

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-object v0

    :cond_19
    sget v2, Landroidx/transition/R$id;->save_overlay_view:I

    invoke-virtual {v13, v2, v12}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v2, Landroidx/transition/i$b;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1, v12, v13}, Landroidx/transition/i$b;-><init>(Landroidx/transition/i;Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    invoke-virtual {v3}, Landroidx/transition/e;->o()Landroidx/transition/e;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroidx/transition/e;->a(Landroidx/transition/e$f;)V

    return-object v0

    :cond_1a
    move-object/from16 v3, p0

    return-object v0

    :cond_1b
    move-object/from16 v3, p0

    move-object/from16 v5, p3

    if-eqz v6, :cond_1e

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    move/from16 v1, v18

    invoke-static {v6, v1}, La/Qg;->b(Landroid/view/View;I)V

    move-object v1, v3

    check-cast v1, Landroidx/transition/c;

    sget-object v4, La/Qg;->a:La/Vg;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v2, v7}, Landroidx/transition/c;->N(La/Ff;F)F

    move-result v2

    const/4 v8, 0x0

    invoke-virtual {v1, v6, v2, v8}, Landroidx/transition/c;->M(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v1

    if-nez v1, :cond_1c

    invoke-static {v5, v7}, Landroidx/transition/c;->N(La/Ff;F)F

    move-result v2

    invoke-virtual {v4, v6, v2}, La/Sg;->b(Landroid/view/View;F)V

    :cond_1c
    if-eqz v1, :cond_1d

    new-instance v0, Landroidx/transition/i$a;

    move/from16 v2, v22

    invoke-direct {v0, v6, v2}, Landroidx/transition/i$a;-><init>(Landroid/view/View;I)V

    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v3}, Landroidx/transition/e;->o()Landroidx/transition/e;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroidx/transition/e;->a(Landroidx/transition/e$f;)V

    return-object v1

    :cond_1d
    invoke-static {v6, v0}, La/Qg;->b(Landroid/view/View;I)V

    return-object v1

    :cond_1e
    :goto_f
    return-object v16
.end method

.method public final q()[Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/transition/i;->D:[Ljava/lang/String;

    return-object v0
.end method

.method public final t(La/Ff;La/Ff;)Z
    .locals 3

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-object v0, p2, La/Ff;->a:Ljava/util/HashMap;

    const-string v1, "android:visibility:visibility"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p1, La/Ff;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Landroidx/transition/i;->L(La/Ff;La/Ff;)Landroidx/transition/i$c;

    move-result-object p1

    iget-boolean p2, p1, Landroidx/transition/i$c;->a:Z

    if-eqz p2, :cond_3

    iget p2, p1, Landroidx/transition/i$c;->c:I

    if-eqz p2, :cond_2

    iget p1, p1, Landroidx/transition/i$c;->d:I

    if-nez p1, :cond_3

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
