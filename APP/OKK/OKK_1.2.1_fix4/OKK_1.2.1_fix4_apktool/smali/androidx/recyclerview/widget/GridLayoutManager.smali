.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# instance fields
.field public final A:Landroid/graphics/Rect;

.field public v:I

.field public w:[I

.field public final x:Landroid/util/SparseIntArray;

.field public final y:Landroid/util/SparseIntArray;

.field public final z:LD/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->x:Landroid/util/SparseIntArray;

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->y:Landroid/util/SparseIntArray;

    new-instance v0, LD/d;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, LD/d;-><init>(I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->z:LD/d;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->A:Landroid/graphics/Rect;

    invoke-static {p1, p2, p3, p4}, LU/C;->E(Landroid/content/Context;Landroid/util/AttributeSet;II)LU/q;

    move-result-object p1

    iget p1, p1, LU/q;->c:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->E0(I)V

    return-void
.end method


# virtual methods
.method public final A0(LU/I;LU/L;I)I
    .locals 1

    iget-boolean p2, p2, LU/L;->f:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->z:LD/d;

    if-nez p2, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p1}, LD/d;->x(II)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1, p3}, LU/I;->b(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, LD/d;->x(II)I

    move-result p1

    return p1
.end method

.method public final B0(LU/I;LU/L;I)I
    .locals 2

    iget-boolean p2, p2, LU/L;->f:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->z:LD/d;

    if-nez p2, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    rem-int/2addr p3, p1

    return p3

    :cond_0
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->y:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {p2, p3, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v1, :cond_1

    return p2

    :cond_1
    invoke-virtual {p1, p3}, LU/I;->b(I)I

    move-result p1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    rem-int/2addr p1, p2

    return p1
.end method

.method public final C0(LU/I;LU/L;I)I
    .locals 3

    iget-boolean p2, p2, LU/L;->f:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->z:LD/d;

    const/4 v1, 0x1

    if-nez p2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    :cond_0
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->x:Landroid/util/SparseIntArray;

    const/4 v2, -0x1

    invoke-virtual {p2, p3, v2}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v2, :cond_1

    return p2

    :cond_1
    invoke-virtual {p1, p3}, LU/I;->b(I)I

    move-result p1

    if-ne p1, v2, :cond_2

    return v1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method

.method public final D0(Landroid/view/View;IZ)V
    .locals 8

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/o;

    iget-object v1, v0, LU/D;->a:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    iget v1, v0, LU/o;->d:I

    iget v4, v0, LU/o;->e:I

    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->z0(II)I

    move-result v1

    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, v6, :cond_0

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v5, v1, p2, v3, v4}, LU/C;->s(ZIIII)I

    move-result p2

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->l()I

    move-result v1

    iget v3, p0, LU/C;->h:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v6, v1, v3, v2, v0}, LU/C;->s(ZIIII)I

    move-result v0

    goto :goto_0

    :cond_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v5, v1, p2, v2, v4}, LU/C;->s(ZIIII)I

    move-result p2

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->l()I

    move-result v1

    iget v2, p0, LU/C;->g:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v6, v1, v2, v3, v0}, LU/C;->s(ZIIII)I

    move-result v0

    move v7, v0

    move v0, p2

    move p2, v7

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, LU/D;

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2, v0, v1}, LU/C;->b0(Landroid/view/View;IILU/D;)Z

    move-result p3

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, p2, v0, v1}, LU/C;->a0(Landroid/view/View;IILU/D;)Z

    move-result p3

    :goto_1
    if-eqz p3, :cond_2

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    :cond_2
    return-void
.end method

.method public final E0(I)V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->z:LD/d;

    invoke-virtual {p1}, LD/d;->y()V

    invoke-virtual {p0}, LU/C;->Y()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Span count should be at least 1. Provided "

    invoke-static {v1, p1}, LS/d;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final F(LU/I;LU/L;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    return p1

    :cond_0
    invoke-virtual {p2}, LU/L;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, LU/L;->a()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->A0(LU/I;LU/L;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final F0()V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, LU/C;->i:I

    invoke-virtual {p0}, LU/C;->B()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, LU/C;->A()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    goto :goto_1

    :cond_0
    iget v0, p0, LU/C;->j:I

    invoke-virtual {p0}, LU/C;->z()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, LU/C;->C()I

    move-result v1

    goto :goto_0

    :goto_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->y0(I)V

    return-void
.end method

.method public final L(Landroid/view/View;ILU/I;LU/L;)Landroid/view/View;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    iget-object v3, v0, LU/C;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move-object/from16 v5, p1

    :goto_0
    move-object v3, v4

    goto :goto_2

    :cond_0
    move-object/from16 v5, p1

    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->q(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_1

    :goto_1
    goto :goto_0

    :cond_1
    iget-object v6, v0, LU/C;->a:LJ0/d;

    invoke-virtual {v6, v3}, LJ0/d;->q(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    if-nez v3, :cond_3

    return-object v4

    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, LU/o;

    iget v7, v6, LU/o;->d:I

    iget v6, v6, LU/o;->e:I

    add-int/2addr v6, v7

    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->L(Landroid/view/View;ILU/I;LU/L;)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_4

    return-object v4

    :cond_4
    move/from16 v5, p2

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->g0(I)I

    move-result v5

    const/4 v9, 0x1

    if-ne v5, v9, :cond_5

    move v5, v9

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :goto_3
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    const/4 v11, -0x1

    if-eq v5, v10, :cond_6

    invoke-virtual/range {p0 .. p0}, LU/C;->r()I

    move-result v5

    sub-int/2addr v5, v9

    move v10, v11

    move v12, v10

    goto :goto_4

    :cond_6
    invoke-virtual/range {p0 .. p0}, LU/C;->r()I

    move-result v5

    move v10, v5

    move v12, v9

    const/4 v5, 0x0

    :goto_4
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-ne v13, v9, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q0()Z

    move-result v13

    if-eqz v13, :cond_7

    move v13, v9

    goto :goto_5

    :cond_7
    const/4 v13, 0x0

    :goto_5
    invoke-virtual {v0, v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->A0(LU/I;LU/L;I)I

    move-result v14

    move v8, v11

    move v15, v8

    move/from16 v16, v12

    const/4 v9, 0x0

    const/4 v12, 0x0

    move v11, v5

    move-object v5, v4

    :goto_6
    if-eq v11, v10, :cond_8

    move/from16 v17, v10

    invoke-virtual {v0, v1, v2, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->A0(LU/I;LU/L;I)I

    move-result v10

    invoke-virtual {v0, v11}, LU/C;->q(I)Landroid/view/View;

    move-result-object v1

    if-ne v1, v3, :cond_9

    :cond_8
    :goto_7
    move-object/from16 v21, v5

    goto/16 :goto_10

    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v18

    if-eqz v18, :cond_c

    if-eq v10, v14, :cond_c

    if-eqz v4, :cond_a

    goto :goto_7

    :cond_a
    move-object/from16 v18, v3

    move-object/from16 v21, v5

    :cond_b
    move/from16 v19, v9

    const/4 v9, 0x1

    goto/16 :goto_e

    :cond_c
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, LU/o;

    iget v2, v10, LU/o;->d:I

    move-object/from16 v18, v3

    iget v3, v10, LU/o;->e:I

    add-int/2addr v3, v2

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_d

    if-ne v2, v7, :cond_d

    if-ne v3, v6, :cond_d

    return-object v1

    :cond_d
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_e

    if-eqz v4, :cond_f

    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-nez v19, :cond_10

    if-nez v5, :cond_10

    :cond_f
    move-object/from16 v21, v5

    :goto_8
    move/from16 v19, v9

    const/4 v9, 0x1

    goto :goto_d

    :cond_10
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v19

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v20

    move-object/from16 v21, v5

    sub-int v5, v20, v19

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_13

    if-le v5, v9, :cond_11

    :goto_9
    goto :goto_8

    :cond_11
    if-ne v5, v9, :cond_b

    if-le v2, v15, :cond_12

    const/4 v5, 0x1

    goto :goto_a

    :cond_12
    const/4 v5, 0x0

    :goto_a
    if-ne v13, v5, :cond_b

    goto :goto_9

    :cond_13
    if-nez v4, :cond_b

    move/from16 v19, v9

    iget-object v9, v0, LU/C;->c:LA/c;

    invoke-virtual {v9, v1}, LA/c;->e(Landroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_14

    iget-object v9, v0, LU/C;->d:LA/c;

    invoke-virtual {v9, v1}, LA/c;->e(Landroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_14

    const/4 v9, 0x1

    const/16 v20, 0x1

    goto :goto_b

    :cond_14
    const/4 v9, 0x1

    const/16 v20, 0x0

    :goto_b
    xor-int/lit8 v20, v20, 0x1

    if-eqz v20, :cond_18

    if-le v5, v12, :cond_15

    goto :goto_d

    :cond_15
    if-ne v5, v12, :cond_18

    if-le v2, v8, :cond_16

    move v5, v9

    goto :goto_c

    :cond_16
    const/4 v5, 0x0

    :goto_c
    if-ne v13, v5, :cond_18

    :goto_d
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v5

    if-eqz v5, :cond_17

    iget v4, v10, LU/o;->d:I

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v2, v3, v2

    move/from16 v19, v2

    move v15, v4

    move-object/from16 v5, v21

    move-object v4, v1

    goto :goto_f

    :cond_17
    iget v5, v10, LU/o;->d:I

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v12, v3, v2

    move v8, v5

    move-object v5, v1

    goto :goto_f

    :cond_18
    :goto_e
    move-object/from16 v5, v21

    :goto_f
    add-int v11, v11, v16

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v10, v17

    move-object/from16 v3, v18

    move/from16 v9, v19

    goto/16 :goto_6

    :goto_10
    if-eqz v4, :cond_19

    goto :goto_11

    :cond_19
    move-object/from16 v4, v21

    :goto_11
    return-object v4
.end method

.method public final N(LU/I;LU/L;Landroid/view/View;LE/j;)V
    .locals 0

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of p2, p1, LU/o;

    if-nez p2, :cond_0

    invoke-virtual {p0, p3, p4}, LU/C;->O(Landroid/view/View;LE/j;)V

    return-void

    :cond_0
    check-cast p1, LU/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method

.method public final e(LU/D;)Z
    .locals 0

    instance-of p1, p1, LU/o;

    return p1
.end method

.method public final h(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final i(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final k(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final l(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final n()LU/D;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, LU/o;

    invoke-direct {v0, v2, v1}, LU/o;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, LU/o;

    invoke-direct {v0, v1, v2}, LU/o;-><init>(II)V

    return-object v0
.end method

.method public final o(Landroid/content/Context;Landroid/util/AttributeSet;)LU/D;
    .locals 1

    new-instance v0, LU/o;

    invoke-direct {v0, p1, p2}, LU/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    iput p1, v0, LU/o;->d:I

    const/4 p1, 0x0

    iput p1, v0, LU/o;->e:I

    return-object v0
.end method

.method public final p(Landroid/view/ViewGroup$LayoutParams;)LU/D;
    .locals 3

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    new-instance v0, LU/o;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, LU/D;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    iput v2, v0, LU/o;->d:I

    iput v1, v0, LU/o;->e:I

    return-object v0

    :cond_0
    new-instance v0, LU/o;

    invoke-direct {v0, p1}, LU/D;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    iput v2, v0, LU/o;->d:I

    iput v1, v0, LU/o;->e:I

    return-object v0
.end method

.method public final r0(LU/I;LU/L;LU/s;LU/r;)V
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v0}, LU/u;->j()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, LU/C;->r()I

    move-result v3

    if-lez v3, :cond_1

    iget-object v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->w:[I

    iget v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    aget v3, v3, v4

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->F0()V

    :cond_2
    iget v0, p3, LU/s;->e:I

    if-ne v0, v1, :cond_3

    move v2, v1

    :cond_3
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    if-nez v2, :cond_4

    iget v0, p3, LU/s;->d:I

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->B0(LU/I;LU/L;I)I

    move-result v0

    iget v2, p3, LU/s;->d:I

    invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->C0(LU/I;LU/L;I)I

    move-result v2

    add-int/2addr v0, v2

    :cond_4
    iget v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    if-lez v2, :cond_8

    iget v2, p3, LU/s;->d:I

    if-ltz v2, :cond_8

    invoke-virtual {p2}, LU/L;->a()I

    move-result v3

    if-ge v2, v3, :cond_8

    if-lez v0, :cond_8

    iget v2, p3, LU/s;->d:I

    invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->C0(LU/I;LU/L;I)I

    move-result p2

    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    if-gt p2, v3, :cond_7

    sub-int/2addr v0, p2

    if-gez v0, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p3, p1}, LU/s;->b(LU/I;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Item at position "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " requires "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " spans but GridLayoutManager has only "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " spans."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_1
    iput-boolean v1, p4, LU/r;->b:Z

    return-void
.end method

.method public final t(LU/I;LU/L;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    return p1

    :cond_0
    invoke-virtual {p2}, LU/L;->a()I

    move-result v0

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, LU/L;->a()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->A0(LU/I;LU/L;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final w0(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->w0(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y0(I)V
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->w:[I

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    array-length v3, v0

    add-int/lit8 v4, v1, 0x1

    if-ne v3, v4, :cond_0

    array-length v3, v0

    sub-int/2addr v3, v2

    aget v3, v0, v3

    if-eq v3, p1, :cond_1

    :cond_0
    add-int/lit8 v0, v1, 0x1

    new-array v0, v0, [I

    :cond_1
    const/4 v3, 0x0

    aput v3, v0, v3

    div-int v4, p1, v1

    rem-int/2addr p1, v1

    move v5, v3

    :goto_0
    if-gt v2, v1, :cond_3

    add-int/2addr v3, p1

    if-lez v3, :cond_2

    sub-int v6, v1, v3

    if-ge v6, p1, :cond_2

    add-int/lit8 v6, v4, 0x1

    sub-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move v6, v4

    :goto_1
    add-int/2addr v5, v6

    aput v5, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->w:[I

    return-void
.end method

.method public final z0(II)I
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->w:[I

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->v:I

    sub-int v2, v1, p1

    aget v2, v0, v2

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    aget p1, v0, v1

    sub-int/2addr v2, p1

    return v2

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->w:[I

    add-int/2addr p2, p1

    aget p2, v0, p2

    aget p1, v0, p1

    sub-int/2addr p2, p1

    return p2
.end method
