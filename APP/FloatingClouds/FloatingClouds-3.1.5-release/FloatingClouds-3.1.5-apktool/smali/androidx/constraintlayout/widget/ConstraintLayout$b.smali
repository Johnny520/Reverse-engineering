.class public final Landroidx/constraintlayout/widget/ConstraintLayout$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/ConstraintLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method


# virtual methods
.method public final a(La/N3;La/e2$a;)V
    .locals 21
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget v3, v1, La/N3;->X:I

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    iget-boolean v3, v1, La/N3;->x:Z

    if-nez v3, :cond_1

    iput v5, v2, La/e2$a;->e:I

    iput v5, v2, La/e2$a;->f:I

    iput v5, v2, La/e2$a;->g:I

    return-void

    :cond_1
    iget-object v3, v2, La/e2$a;->a:La/N3$a;

    iget-object v4, v2, La/e2$a;->b:La/N3$a;

    iget v6, v2, La/e2$a;->c:I

    iget v7, v2, La/e2$a;->d:I

    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b:I

    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->c:I

    add-int/2addr v8, v9

    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d:I

    iget-object v10, v1, La/N3;->W:Landroid/view/View;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    iget-object v12, v1, La/N3;->A:La/M3;

    iget-object v13, v1, La/N3;->y:La/M3;

    iget-object v14, v1, La/N3;->g:[I

    move/from16 v16, v5

    const/4 v15, 0x2

    const/4 v5, 0x1

    if-eqz v11, :cond_d

    if-eq v11, v5, :cond_c

    if-eq v11, v15, :cond_5

    const/4 v6, 0x3

    if-eq v11, v6, :cond_2

    move/from16 v19, v15

    move/from16 v6, v16

    move v9, v6

    goto/16 :goto_7

    :cond_2
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f:I

    if-eqz v13, :cond_3

    iget v11, v13, La/M3;->e:I

    goto :goto_0

    :cond_3
    move/from16 v11, v16

    :goto_0
    if-eqz v12, :cond_4

    move/from16 v19, v15

    iget v15, v12, La/M3;->e:I

    add-int/2addr v11, v15

    goto :goto_1

    :cond_4
    move/from16 v19, v15

    :goto_1
    add-int/2addr v9, v11

    const/4 v11, -0x1

    invoke-static {v6, v9, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    aput v11, v14, v19

    :goto_2
    move/from16 v9, v16

    goto/16 :goto_7

    :cond_5
    move/from16 v19, v15

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f:I

    const/4 v11, -0x2

    invoke-static {v6, v9, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    iget v9, v1, La/N3;->j:I

    if-ne v9, v5, :cond_6

    move v9, v5

    goto :goto_3

    :cond_6
    move/from16 v9, v16

    :goto_3
    aput v16, v14, v19

    iget-boolean v11, v2, La/e2$a;->j:Z

    if-eqz v11, :cond_a

    if-eqz v9, :cond_7

    const/16 v18, 0x3

    aget v11, v14, v18

    if-eqz v11, :cond_7

    aget v11, v14, v16

    invoke-virtual {v1}, La/N3;->l()I

    move-result v15

    if-ne v11, v15, :cond_8

    :cond_7
    instance-of v11, v10, Landroidx/constraintlayout/widget/h;

    if-eqz v11, :cond_9

    :cond_8
    move v11, v5

    goto :goto_4

    :cond_9
    move/from16 v11, v16

    :goto_4
    if-eqz v9, :cond_b

    if-eqz v11, :cond_a

    goto :goto_5

    :cond_a
    const/high16 v11, 0x40000000    # 2.0f

    goto :goto_6

    :cond_b
    :goto_5
    invoke-virtual {v1}, La/N3;->l()I

    move-result v6

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    goto :goto_2

    :goto_6
    move v9, v5

    goto :goto_7

    :cond_c
    move/from16 v19, v15

    const/high16 v11, 0x40000000    # 2.0f

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f:I

    const/4 v15, -0x2

    invoke-static {v6, v9, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    aput v15, v14, v19

    goto :goto_6

    :cond_d
    move/from16 v19, v15

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    aput v6, v14, v19

    move v6, v9

    goto :goto_2

    :goto_7
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_19

    if-eq v11, v5, :cond_18

    move/from16 v7, v19

    if-eq v11, v7, :cond_11

    const/4 v7, 0x3

    if-eq v11, v7, :cond_e

    move/from16 v7, v16

    move v8, v7

    goto/16 :goto_e

    :cond_e
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g:I

    if-eqz v13, :cond_f

    iget-object v11, v1, La/N3;->z:La/M3;

    iget v11, v11, La/M3;->e:I

    goto :goto_8

    :cond_f
    move/from16 v11, v16

    :goto_8
    if-eqz v12, :cond_10

    iget-object v12, v1, La/N3;->B:La/M3;

    iget v12, v12, La/M3;->e:I

    add-int/2addr v11, v12

    :cond_10
    add-int/2addr v8, v11

    const/4 v11, -0x1

    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    const/16 v18, 0x3

    aput v11, v14, v18

    :goto_9
    move/from16 v8, v16

    goto/16 :goto_e

    :cond_11
    const/16 v18, 0x3

    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g:I

    const/4 v15, -0x2

    invoke-static {v7, v8, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    iget v8, v1, La/N3;->k:I

    if-ne v8, v5, :cond_12

    move v8, v5

    goto :goto_a

    :cond_12
    move/from16 v8, v16

    :goto_a
    aput v16, v14, v18

    iget-boolean v11, v2, La/e2$a;->j:Z

    if-eqz v11, :cond_16

    if-eqz v8, :cond_13

    const/16 v19, 0x2

    aget v11, v14, v19

    if-eqz v11, :cond_13

    aget v11, v14, v5

    invoke-virtual {v1}, La/N3;->i()I

    move-result v12

    if-ne v11, v12, :cond_14

    :cond_13
    instance-of v11, v10, Landroidx/constraintlayout/widget/h;

    if-eqz v11, :cond_15

    :cond_14
    move v11, v5

    goto :goto_b

    :cond_15
    move/from16 v11, v16

    :goto_b
    if-eqz v8, :cond_17

    if-eqz v11, :cond_16

    goto :goto_c

    :cond_16
    const/high16 v11, 0x40000000    # 2.0f

    goto :goto_d

    :cond_17
    :goto_c
    invoke-virtual {v1}, La/N3;->i()I

    move-result v7

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v7, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_9

    :goto_d
    move v8, v5

    goto :goto_e

    :cond_18
    const/high16 v11, 0x40000000    # 2.0f

    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g:I

    const/4 v15, -0x2

    invoke-static {v7, v8, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    const/16 v18, 0x3

    aput v15, v14, v18

    goto :goto_d

    :cond_19
    const/high16 v11, 0x40000000    # 2.0f

    const/16 v18, 0x3

    invoke-static {v7, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    aput v7, v14, v18

    move v7, v8

    goto :goto_9

    :goto_e
    sget-object v11, La/N3$a;->c:La/N3$a;

    if-ne v3, v11, :cond_1a

    move v12, v5

    goto :goto_f

    :cond_1a
    move/from16 v12, v16

    :goto_f
    if-ne v4, v11, :cond_1b

    move v11, v5

    goto :goto_10

    :cond_1b
    move/from16 v11, v16

    :goto_10
    sget-object v13, La/N3$a;->d:La/N3$a;

    sget-object v15, La/N3$a;->a:La/N3$a;

    if-eq v4, v13, :cond_1d

    if-ne v4, v15, :cond_1c

    goto :goto_11

    :cond_1c
    move/from16 v4, v16

    goto :goto_12

    :cond_1d
    :goto_11
    move v4, v5

    :goto_12
    if-eq v3, v13, :cond_1f

    if-ne v3, v15, :cond_1e

    goto :goto_13

    :cond_1e
    move/from16 v3, v16

    goto :goto_14

    :cond_1f
    :goto_13
    move v3, v5

    :goto_14
    const/4 v13, 0x0

    if-eqz v12, :cond_20

    iget v15, v1, La/N3;->N:F

    cmpl-float v15, v15, v13

    if-lez v15, :cond_20

    move v15, v5

    goto :goto_15

    :cond_20
    move/from16 v15, v16

    :goto_15
    if-eqz v11, :cond_21

    move/from16 v17, v13

    iget v13, v1, La/N3;->N:F

    cmpl-float v13, v13, v17

    if-lez v13, :cond_21

    move v13, v5

    goto :goto_16

    :cond_21
    move/from16 v13, v16

    :goto_16
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    move/from16 v20, v5

    move-object/from16 v5, v17

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-boolean v0, v2, La/e2$a;->j:Z

    if-nez v0, :cond_24

    if-eqz v12, :cond_24

    iget v0, v1, La/N3;->j:I

    if-nez v0, :cond_24

    if-eqz v11, :cond_24

    iget v0, v1, La/N3;->k:I

    if-eqz v0, :cond_22

    goto :goto_18

    :cond_22
    move/from16 v8, v16

    move v9, v8

    move v12, v9

    :cond_23
    :goto_17
    const/4 v11, -0x1

    goto/16 :goto_20

    :cond_24
    :goto_18
    instance-of v0, v10, Landroidx/constraintlayout/widget/i;

    if-eqz v0, :cond_25

    instance-of v0, v1, La/Yg;

    if-eqz v0, :cond_25

    move-object v0, v1

    check-cast v0, La/Yg;

    move-object v11, v10

    check-cast v11, Landroidx/constraintlayout/widget/i;

    invoke-virtual {v11, v0, v6, v7}, Landroidx/constraintlayout/widget/i;->h(La/Yg;II)V

    goto :goto_19

    :cond_25
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    :goto_19
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v12

    if-eqz v9, :cond_26

    aput v0, v14, v16

    const/16 v19, 0x2

    aput v11, v14, v19

    goto :goto_1a

    :cond_26
    const/16 v19, 0x2

    aput v16, v14, v16

    aput v16, v14, v19

    :goto_1a
    if-eqz v8, :cond_27

    aput v11, v14, v20

    const/16 v18, 0x3

    aput v0, v14, v18

    goto :goto_1b

    :cond_27
    const/16 v18, 0x3

    aput v16, v14, v20

    aput v16, v14, v18

    :goto_1b
    iget v8, v1, La/N3;->m:I

    if-lez v8, :cond_28

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    goto :goto_1c

    :cond_28
    move v8, v0

    :goto_1c
    iget v9, v1, La/N3;->n:I

    if-lez v9, :cond_29

    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    :cond_29
    iget v9, v1, La/N3;->p:I

    if-lez v9, :cond_2a

    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1d

    :cond_2a
    move v9, v11

    :goto_1d
    iget v14, v1, La/N3;->q:I

    if-lez v14, :cond_2b

    invoke-static {v14, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    :cond_2b
    const/high16 v14, 0x3f000000    # 0.5f

    if-eqz v15, :cond_2c

    if-eqz v4, :cond_2c

    iget v3, v1, La/N3;->N:F

    int-to-float v4, v9

    mul-float/2addr v4, v3

    add-float/2addr v4, v14

    float-to-int v8, v4

    goto :goto_1e

    :cond_2c
    if-eqz v13, :cond_2d

    if-eqz v3, :cond_2d

    iget v3, v1, La/N3;->N:F

    int-to-float v4, v8

    div-float/2addr v4, v3

    add-float/2addr v4, v14

    float-to-int v9, v4

    :cond_2d
    :goto_1e
    if-ne v0, v8, :cond_2e

    if-eq v11, v9, :cond_23

    :cond_2e
    if-eq v0, v8, :cond_2f

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v8, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    goto :goto_1f

    :cond_2f
    const/high16 v0, 0x40000000    # 2.0f

    :goto_1f
    if-eq v11, v9, :cond_30

    invoke-static {v9, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    :cond_30
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v12

    goto/16 :goto_17

    :goto_20
    if-eq v12, v11, :cond_31

    move/from16 v0, v20

    goto :goto_21

    :cond_31
    move/from16 v0, v16

    :goto_21
    iget v3, v2, La/e2$a;->c:I

    if-ne v8, v3, :cond_33

    iget v3, v2, La/e2$a;->d:I

    if-eq v9, v3, :cond_32

    goto :goto_22

    :cond_32
    move/from16 v3, v16

    goto :goto_23

    :cond_33
    :goto_22
    move/from16 v3, v20

    :goto_23
    iput-boolean v3, v2, La/e2$a;->i:Z

    iget-boolean v3, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v3, :cond_34

    move/from16 v0, v20

    :cond_34
    if-eqz v0, :cond_35

    const/4 v11, -0x1

    if-eq v12, v11, :cond_35

    iget v1, v1, La/N3;->R:I

    if-eq v1, v12, :cond_35

    move/from16 v1, v20

    iput-boolean v1, v2, La/e2$a;->i:Z

    :cond_35
    iput v8, v2, La/e2$a;->e:I

    iput v9, v2, La/e2$a;->f:I

    iput-boolean v0, v2, La/e2$a;->h:Z

    iput v12, v2, La/e2$a;->g:I

    return-void
.end method
