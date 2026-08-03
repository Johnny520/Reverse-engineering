.class public final LGy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lsc;
.implements Lse;
.implements LJo;
.implements Lgt;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LGy;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LGy;->a:I

    iput-object p2, p0, LGy;->b:Ljava/lang/Object;

    iput-object p3, p0, LGy;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LFE;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LGy;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGy;->c:Ljava/lang/Object;

    .line 5
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, LGy;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LHy;LZr;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LGy;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGy;->c:Ljava/lang/Object;

    iput-object p2, p0, LGy;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LGy;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LGy;->c:Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, LGy;->c:Ljava/lang/Object;

    check-cast v0, LHy;

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, LZr;

    iget-object v0, v0, LHy;->f:LZr;

    if-eqz v0, :cond_0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LGy;->c:Ljava/lang/Object;

    check-cast v0, LHy;

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, LZr;

    iget-object v2, v0, LHy;->b:LHc;

    iget-object v0, v0, LHy;->g:Lrc;

    iget-object v1, v1, LZr;->c:Ltc;

    invoke-interface {v1}, Ltc;->f()I

    move-result v3

    invoke-virtual {v2, v0, p1, v1, v3}, LHc;->a(LSm;Ljava/lang/Exception;Ltc;I)V

    :cond_0
    return-void
.end method

.method public c(LN5;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, LGy;->c:Ljava/lang/Object;

    check-cast v0, Lvg;

    iget-object v0, v0, Lvg;->b:Ljava/io/IOException;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, LN5;->h(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public d(I)V
    .locals 4

    iget-object v0, p0, LGy;->b:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, LGy;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    return-void

    :cond_0
    array-length v2, v0

    if-lt p1, v2, :cond_2

    array-length v2, v0

    :goto_0
    if-gt v2, p1, :cond_1

    mul-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_1
    new-array p1, v2, [I

    iput-object p1, p0, LGy;->b:Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, LGy;->b:Ljava/lang/Object;

    check-cast p1, [I

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    :cond_2
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, LGy;->c:Ljava/lang/Object;

    check-cast v0, LHy;

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, LZr;

    iget-object v0, v0, LHy;->f:LZr;

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LGy;->c:Ljava/lang/Object;

    check-cast v0, LHy;

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, LZr;

    iget-object v2, v0, LHy;->a:LFc;

    iget-object v2, v2, LFc;->p:LVd;

    if-eqz p1, :cond_0

    iget-object v3, v1, LZr;->c:Ltc;

    invoke-interface {v3}, Ltc;->f()I

    move-result v3

    invoke-virtual {v2, v3}, LVd;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object p1, v0, LHy;->e:Ljava/lang/Object;

    iget-object p1, v0, LHy;->b:LHc;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, LHc;->k(I)V

    return-void

    :cond_0
    move-object v2, v1

    iget-object v1, v0, LHy;->b:LHc;

    move-object v3, v2

    iget-object v2, v3, LZr;->a:LSm;

    iget-object v4, v3, LZr;->c:Ltc;

    invoke-interface {v4}, Ltc;->f()I

    move-result v5

    iget-object v6, v0, LHy;->g:Lrc;

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, LHc;->b(LSm;Ljava/lang/Object;Ltc;ILSm;)V

    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, LGy;->b:Ljava/lang/Object;

    check-cast v0, Ldv;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Ldv;->a:[B

    array-length v1, v1

    iput v1, v0, Ldv;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public g(II)V
    .locals 3

    iget-object v0, p0, LGy;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_3

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, LGy;->d(I)V

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, -0x1

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v0, p0, LGy;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v1, p0, LGy;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LSy;

    iget v2, v1, LSy;->a:I

    if-ge v2, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v2, p2

    iput v2, v1, LSy;->a:I

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public h(II)V
    .locals 5

    iget-object v0, p0, LGy;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_4

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, LGy;->d(I)V

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p2

    array-length v3, v1

    const/4 v4, -0x1

    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v1, p0, LGy;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_4

    iget-object v2, p0, LGy;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LSy;

    iget v3, v2, LSy;->a:I

    if-ge v3, p1, :cond_2

    goto :goto_1

    :cond_2
    if-ge v3, v0, :cond_3

    iget-object v2, p0, LGy;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    sub-int/2addr v3, p2

    iput v3, v2, LSy;->a:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public onApplyWindowInsets(Landroid/view/View;LLF;)LLF;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, LGy;->a:I

    packed-switch v3, :pswitch_data_0

    iget-object v3, v0, LGy;->b:Ljava/lang/Object;

    check-cast v3, LY5;

    iget-object v4, v0, LGy;->c:Ljava/lang/Object;

    check-cast v4, Lhr;

    iget v5, v4, Lhr;->a:I

    iget v6, v4, Lhr;->b:I

    iget v4, v4, Lhr;->c:I

    iget-object v7, v2, LLF;->a:LHF;

    const/16 v8, 0x207

    invoke-virtual {v7, v8}, LHF;->g(I)Lyl;

    move-result-object v8

    const/16 v9, 0x20

    invoke-virtual {v7, v9}, LHF;->g(I)Lyl;

    move-result-object v7

    iget-object v9, v3, LY5;->b:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v10, v8, Lyl;->b:I

    iget v11, v8, Lyl;->c:I

    iget v12, v8, Lyl;->a:I

    iput v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    move-result v10

    const/4 v14, 0x1

    if-ne v10, v14, :cond_0

    move v10, v14

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v15

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v16

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v17

    iget-boolean v13, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-eqz v13, :cond_1

    invoke-virtual {v2}, LLF;->a()I

    move-result v15

    iput v15, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    add-int/2addr v15, v4

    :cond_1
    iget-boolean v4, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    if-eqz v4, :cond_3

    if-eqz v10, :cond_2

    move v4, v6

    goto :goto_1

    :cond_2
    move v4, v5

    :goto_1
    add-int v16, v4, v12

    :cond_3
    move/from16 v4, v16

    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    if-eqz v14, :cond_5

    if-eqz v10, :cond_4

    goto :goto_2

    :cond_4
    move v5, v6

    :goto_2
    add-int v17, v5, v11

    :cond_5
    move/from16 v5, v17

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    if-eqz v10, :cond_6

    iget v10, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-eq v10, v12, :cond_6

    iput v12, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/16 v18, 0x1

    goto :goto_3

    :cond_6
    const/16 v18, 0x0

    :goto_3
    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    if-eqz v10, :cond_7

    iget v10, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v10, v11, :cond_7

    iput v11, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/16 v18, 0x1

    :cond_7
    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    if-eqz v10, :cond_8

    iget v10, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v8, v8, Lyl;->b:I

    if-eq v10, v8, :cond_8

    iput v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 v14, 0x1

    goto :goto_4

    :cond_8
    move/from16 v14, v18

    :goto_4
    if-eqz v14, :cond_9

    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {v1, v4, v6, v5, v15}, Landroid/view/View;->setPadding(IIII)V

    iget-boolean v1, v3, LY5;->a:Z

    if-eqz v1, :cond_a

    iget v3, v7, Lyl;->d:I

    iput v3, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    :cond_a
    if-nez v13, :cond_b

    if-eqz v1, :cond_c

    :cond_b
    invoke-virtual {v9}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I()V

    :cond_c
    return-object v2

    :pswitch_0
    iget-object v3, v0, LGy;->c:Ljava/lang/Object;

    check-cast v3, LFE;

    invoke-static/range {p1 .. p2}, LlE;->g(Landroid/view/View;LLF;)LLF;

    move-result-object v1

    iget-object v2, v1, LLF;->a:LHF;

    invoke-virtual {v2}, LHF;->n()Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_6

    :cond_d
    iget-object v2, v0, LGy;->b:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Rect;

    invoke-virtual {v1}, LLF;->b()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {v1}, LLF;->d()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, LLF;->c()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, LLF;->a()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v4, :cond_e

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6, v1}, LlE;->b(Landroid/view/View;LLF;)LLF;

    move-result-object v6

    invoke-virtual {v6}, LLF;->b()I

    move-result v7

    iget v8, v2, Landroid/graphics/Rect;->left:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    iput v7, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {v6}, LLF;->d()I

    move-result v7

    iget v8, v2, Landroid/graphics/Rect;->top:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    iput v7, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v6}, LLF;->c()I

    move-result v7

    iget v8, v2, Landroid/graphics/Rect;->right:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    iput v7, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v6}, LLF;->a()I

    move-result v6

    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    iput v6, v2, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_e
    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v4, v5, v2}, LLF;->f(IIII)LLF;

    move-result-object v1

    :goto_6
    return-object v1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LGy;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds{lower="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LGy;->b:Ljava/lang/Object;

    check-cast v1, Lyl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LGy;->c:Ljava/lang/Object;

    check-cast v1, Lyl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method
