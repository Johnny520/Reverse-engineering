.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super LU/C;
.source "SourceFile"


# instance fields
.field public final k:I

.field public final l:[LU/W;

.field public final m:LU/u;

.field public final n:LU/u;

.field public final o:I

.field public final p:LU/p;

.field public final q:Z

.field public r:Z

.field public final s:Ljava/util/BitSet;

.field public final t:LA/c;

.field public final u:I

.field public v:Z

.field public w:LU/V;

.field public final x:Landroid/graphics/Rect;

.field public final y:Z

.field public final z:LA0/E;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 6

    invoke-direct {p0}, LU/C;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    new-instance v2, LA/c;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, LA/c;-><init>(I)V

    iput-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t:LA/c;

    const/4 v3, 0x2

    iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:I

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    new-instance v3, Lx0/e;

    invoke-direct {v3, p0}, Lx0/e;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    const/4 v3, 0x1

    iput-boolean v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z

    new-instance v4, LA0/E;

    const/4 v5, 0x5

    invoke-direct {v4, v5, p0}, LA0/E;-><init>(ILjava/lang/Object;)V

    iput-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:LA0/E;

    invoke-static {p1, p2, p3, p4}, LU/C;->E(Landroid/content/Context;Landroid/util/AttributeSet;II)LU/q;

    move-result-object p1

    iget p2, p1, LU/q;->b:I

    if-eqz p2, :cond_1

    if-ne p2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid orientation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-ne p2, p4, :cond_2

    goto :goto_1

    :cond_2
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:LU/u;

    iput-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:LU/u;

    invoke-virtual {p0}, LU/C;->Y()V

    :goto_1
    iget p2, p1, LU/q;->c:I

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-eq p2, p4, :cond_5

    iget-object p4, v2, LA/c;->b:Ljava/lang/Object;

    check-cast p4, [I

    if-eqz p4, :cond_3

    invoke-static {p4, v0}, Ljava/util/Arrays;->fill([II)V

    :cond_3
    iput-object p3, v2, LA/c;->c:Ljava/lang/Object;

    invoke-virtual {p0}, LU/C;->Y()V

    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    new-instance p2, Ljava/util/BitSet;

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:Ljava/util/BitSet;

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    new-array p2, p2, [LU/W;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    move p2, v1

    :goto_2
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge p2, p4, :cond_4

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    new-instance v0, LU/W;

    invoke-direct {v0, p0, p2}, LU/W;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    aput-object v0, p4, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, LU/C;->Y()V

    :cond_5
    iget-boolean p1, p1, LU/q;->d:Z

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:LU/V;

    if-eqz p2, :cond_6

    iget-boolean p3, p2, LU/V;->h:Z

    if-eq p3, p1, :cond_6

    iput-boolean p1, p2, LU/V;->h:Z

    :cond_6
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Z

    invoke-virtual {p0}, LU/C;->Y()V

    new-instance p1, LU/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-boolean v3, p1, LU/p;->a:Z

    iput v1, p1, LU/p;->f:I

    iput v1, p1, LU/p;->g:I

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:LU/p;

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    invoke-static {p0, p1}, LU/u;->a(LU/C;I)LU/u;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    sub-int/2addr v3, p1

    invoke-static {p0, v3}, LU/u;->a(LU/C;I)LU/u;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:LU/u;

    return-void
.end method

.method public static y0(III)I
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return p0

    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    return p0

    :cond_2
    :goto_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    sub-int/2addr p0, p1

    sub-int/2addr p0, p2

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final F(LU/I;LU/L;)I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, LU/C;->F(LU/I;LU/L;)I

    move-result p1

    return p1
.end method

.method public final H()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final K(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iget-object v0, p0, LU/C;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:LA0/E;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v1, v1, v0

    invoke-virtual {v1}, LU/W;->b()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public final L(Landroid/view/View;ILU/I;LU/L;)Landroid/view/View;
    .locals 8

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LU/C;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_1

    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->q(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, LU/C;->a:LJ0/d;

    invoke-virtual {v0, p1}, LJ0/d;->q(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    if-nez p1, :cond_4

    return-object v1

    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u0()V

    const/4 v0, 0x1

    const/4 v2, -0x1

    const/high16 v3, -0x80000000

    if-eq p2, v0, :cond_e

    const/4 v4, 0x2

    if-eq p2, v4, :cond_a

    const/16 v4, 0x11

    if-eq p2, v4, :cond_9

    const/16 v4, 0x21

    if-eq p2, v4, :cond_8

    const/16 v4, 0x42

    if-eq p2, v4, :cond_7

    const/16 v4, 0x82

    if-eq p2, v4, :cond_6

    :cond_5
    move p2, v3

    goto :goto_4

    :cond_6
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-ne p2, v0, :cond_5

    goto :goto_2

    :cond_7
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-nez p2, :cond_5

    goto :goto_2

    :cond_8
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-ne p2, v0, :cond_5

    goto :goto_3

    :cond_9
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-nez p2, :cond_5

    goto :goto_3

    :cond_a
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-ne p2, v0, :cond_c

    :cond_b
    :goto_2
    move p2, v0

    goto :goto_4

    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o0()Z

    move-result p2

    if-eqz p2, :cond_b

    :cond_d
    :goto_3
    move p2, v2

    goto :goto_4

    :cond_e
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-ne p2, v0, :cond_f

    goto :goto_3

    :cond_f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o0()Z

    move-result p2

    if-eqz p2, :cond_d

    goto :goto_2

    :goto_4
    if-ne p2, v3, :cond_10

    return-object v1

    :cond_10
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, LU/T;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, LU/T;->d:LU/W;

    if-ne p2, v0, :cond_11

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k0()I

    move-result v4

    goto :goto_5

    :cond_11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j0()I

    move-result v4

    :goto_5
    invoke-virtual {p0, v4, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w0(ILU/L;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v0(I)V

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:LU/p;

    iget v6, v5, LU/p;->d:I

    add-int/2addr v6, v4

    iput v6, v5, LU/p;->c:I

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v6}, LU/u;->l()I

    move-result v6

    int-to-float v6, v6

    const v7, 0x3eaaaaab

    mul-float/2addr v6, v7

    float-to-int v6, v6

    iput v6, v5, LU/p;->b:I

    iput-boolean v0, v5, LU/p;->h:Z

    const/4 v6, 0x0

    iput-boolean v6, v5, LU/p;->a:Z

    invoke-virtual {p0, p3, v5, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->g0(LU/I;LU/p;LU/L;)I

    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    invoke-virtual {v3, v4, p2}, LU/W;->g(II)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_12

    if-eq p3, p1, :cond_12

    return-object p3

    :cond_12
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q0(I)Z

    move-result p3

    if-eqz p3, :cond_14

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    sub-int/2addr p3, v0

    :goto_6
    if-ltz p3, :cond_16

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, LU/W;->g(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_13

    if-eq p4, p1, :cond_13

    return-object p4

    :cond_13
    add-int/lit8 p3, p3, -0x1

    goto :goto_6

    :cond_14
    move p3, v6

    :goto_7
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge p3, p4, :cond_16

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, LU/W;->g(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_15

    if-eq p4, p1, :cond_15

    return-object p4

    :cond_15
    add-int/lit8 p3, p3, 0x1

    goto :goto_7

    :cond_16
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Z

    xor-int/2addr p3, v0

    if-ne p2, v2, :cond_17

    move p4, v0

    goto :goto_8

    :cond_17
    move p4, v6

    :goto_8
    if-ne p3, p4, :cond_18

    move p3, v0

    goto :goto_9

    :cond_18
    move p3, v6

    :goto_9
    if-eqz p3, :cond_19

    invoke-virtual {v3}, LU/W;->c()I

    move-result p4

    goto :goto_a

    :cond_19
    invoke-virtual {v3}, LU/W;->d()I

    move-result p4

    :goto_a
    invoke-virtual {p0, p4}, LU/C;->m(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_1a

    if-eq p4, p1, :cond_1a

    return-object p4

    :cond_1a
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q0(I)Z

    move-result p2

    if-eqz p2, :cond_1e

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    sub-int/2addr p2, v0

    :goto_b
    if-ltz p2, :cond_21

    iget p4, v3, LU/W;->e:I

    if-ne p2, p4, :cond_1b

    goto :goto_d

    :cond_1b
    if-eqz p3, :cond_1c

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object p4, p4, p2

    invoke-virtual {p4}, LU/W;->c()I

    move-result p4

    goto :goto_c

    :cond_1c
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object p4, p4, p2

    invoke-virtual {p4}, LU/W;->d()I

    move-result p4

    :goto_c
    invoke-virtual {p0, p4}, LU/C;->m(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_1d

    if-eq p4, p1, :cond_1d

    return-object p4

    :cond_1d
    :goto_d
    add-int/lit8 p2, p2, -0x1

    goto :goto_b

    :cond_1e
    :goto_e
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v6, p2, :cond_21

    if-eqz p3, :cond_1f

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object p2, p2, v6

    invoke-virtual {p2}, LU/W;->c()I

    move-result p2

    goto :goto_f

    :cond_1f
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object p2, p2, v6

    invoke-virtual {p2}, LU/W;->d()I

    move-result p2

    :goto_f
    invoke-virtual {p0, p2}, LU/C;->m(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_20

    if-eq p2, p1, :cond_20

    return-object p2

    :cond_20
    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_21
    return-object v1
.end method

.method public final M(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    invoke-super {p0, p1}, LU/C;->M(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i0(Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h0(Z)Landroid/view/View;

    move-result-object v0

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    invoke-static {v0}, LU/C;->D(Landroid/view/View;)I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    nop

    :cond_2
    :goto_0
    return-void
.end method

.method public final N(LU/I;LU/L;Landroid/view/View;LE/j;)V
    .locals 2

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of p2, p1, LU/T;

    if-nez p2, :cond_0

    invoke-virtual {p0, p3, p4}, LU/C;->O(Landroid/view/View;LE/j;)V

    return-void

    :cond_0
    check-cast p1, LU/T;

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p2, :cond_2

    iget-object p1, p1, LU/T;->d:LU/W;

    if-nez p1, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    iget p1, p1, LU/W;->e:I

    :goto_0
    invoke-static {v0, p1, p3, v1, v1}, LE/i;->a(ZIIII)LE/i;

    move-result-object p1

    invoke-virtual {p4, p1}, LE/j;->h(LE/i;)V

    goto :goto_2

    :cond_2
    iget-object p1, p1, LU/T;->d:LU/W;

    if-nez p1, :cond_3

    move p1, v1

    goto :goto_1

    :cond_3
    iget p1, p1, LU/W;->e:I

    :goto_1
    invoke-static {v0, v1, v1, p1, p3}, LE/i;->a(ZIIII)LE/i;

    move-result-object p1

    invoke-virtual {p4, p1}, LE/j;->h(LE/i;)V

    :goto_2
    return-void
.end method

.method public final P(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, LU/V;

    if-eqz v0, :cond_0

    check-cast p1, LU/V;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:LU/V;

    invoke-virtual {p0}, LU/C;->Y()V

    :cond_0
    return-void
.end method

.method public final Q()Landroid/os/Parcelable;
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:LU/V;

    if-eqz v0, :cond_0

    new-instance v1, LU/V;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, v0, LU/V;->c:I

    iput v2, v1, LU/V;->c:I

    iget v2, v0, LU/V;->a:I

    iput v2, v1, LU/V;->a:I

    iget v2, v0, LU/V;->b:I

    iput v2, v1, LU/V;->b:I

    iget-object v2, v0, LU/V;->d:[I

    iput-object v2, v1, LU/V;->d:[I

    iget v2, v0, LU/V;->e:I

    iput v2, v1, LU/V;->e:I

    iget-object v2, v0, LU/V;->f:[I

    iput-object v2, v1, LU/V;->f:[I

    iget-boolean v2, v0, LU/V;->h:Z

    iput-boolean v2, v1, LU/V;->h:Z

    iget-boolean v2, v0, LU/V;->i:Z

    iput-boolean v2, v1, LU/V;->i:Z

    iget-boolean v2, v0, LU/V;->j:Z

    iput-boolean v2, v1, LU/V;->j:Z

    iget-object v0, v0, LU/V;->g:Ljava/util/List;

    iput-object v0, v1, LU/V;->g:Ljava/util/List;

    return-object v1

    :cond_0
    new-instance v0, LU/V;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Z

    iput-boolean v1, v0, LU/V;->h:Z

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    iput-boolean v1, v0, LU/V;->i:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, LU/V;->j:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t:LA/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v3, v1, LA/c;->b:Ljava/lang/Object;

    check-cast v3, [I

    if-eqz v3, :cond_1

    iput-object v3, v0, LU/V;->f:[I

    array-length v3, v3

    iput v3, v0, LU/V;->e:I

    iget-object v1, v1, LA/c;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iput-object v1, v0, LU/V;->g:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput v2, v0, LU/V;->e:I

    :goto_0
    invoke-virtual {p0}, LU/C;->r()I

    move-result v1

    const/4 v3, -0x1

    if-lez v1, :cond_7

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k0()I

    move-result v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j0()I

    move-result v1

    :goto_1
    iput v1, v0, LU/V;->a:I

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h0(Z)Landroid/view/View;

    move-result-object v1

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i0(Z)Landroid/view/View;

    move-result-object v1

    :goto_2
    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v1}, LU/C;->D(Landroid/view/View;)I

    move-result v3

    :goto_3
    iput v3, v0, LU/V;->b:I

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    iput v1, v0, LU/V;->c:I

    new-array v1, v1, [I

    iput-object v1, v0, LU/V;->d:[I

    :goto_4
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v2, v1, :cond_8

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:Z

    const/high16 v3, -0x80000000

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, LU/W;->f(I)I

    move-result v1

    if-eq v1, v3, :cond_6

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v3}, LU/u;->g()I

    move-result v3

    :goto_5
    sub-int/2addr v1, v3

    goto :goto_6

    :cond_5
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, LU/W;->h(I)I

    move-result v1

    if-eq v1, v3, :cond_6

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v3}, LU/u;->k()I

    move-result v3

    goto :goto_5

    :cond_6
    :goto_6
    iget-object v3, v0, LU/V;->d:[I

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    iput v3, v0, LU/V;->a:I

    iput v3, v0, LU/V;->b:I

    iput v2, v0, LU/V;->c:I

    :cond_8
    return-object v0
.end method

.method public final R(I)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c0()Z

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:LU/V;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, LU/C;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c0()Z
    .locals 3

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u:I

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LU/C;->e:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j0()I

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k0()I

    :goto_0
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t:LA/c;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n0()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v2, LA/c;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_2

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, v2, LA/c;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p0}, LU/C;->Y()V

    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final d()Z
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final d0(LU/L;)I
    .locals 6

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i0(Z)Landroid/view/View;

    move-result-object v2

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, LU/S;->j(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;Z)I

    move-result p1

    return p1
.end method

.method public final e(LU/D;)Z
    .locals 0

    instance-of p1, p1, LU/T;

    return p1
.end method

.method public final e0(LU/L;)I
    .locals 7

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i0(Z)Landroid/view/View;

    move-result-object v2

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, LU/S;->k(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;ZZ)I

    move-result p1

    return p1
.end method

.method public final f0(LU/L;)I
    .locals 6

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i0(Z)Landroid/view/View;

    move-result-object v2

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, LU/S;->l(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;Z)I

    move-result p1

    return p1
.end method

.method public final g(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final g0(LU/I;LU/p;LU/L;)I
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:Ljava/util/BitSet;

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Ljava/util/BitSet;->set(IIZ)V

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:LU/p;

    iget-boolean v1, v0, LU/p;->i:Z

    const/high16 v4, -0x80000000

    const v5, 0x7fffffff

    if-eqz v1, :cond_0

    iget v1, p2, LU/p;->e:I

    if-ne v1, v3, :cond_2

    move v4, v5

    goto :goto_0

    :cond_0
    iget v1, p2, LU/p;->e:I

    if-ne v1, v3, :cond_1

    iget v1, p2, LU/p;->g:I

    iget v4, p2, LU/p;->b:I

    add-int/2addr v4, v1

    goto :goto_0

    :cond_1
    iget v1, p2, LU/p;->f:I

    iget v4, p2, LU/p;->b:I

    sub-int v4, v1, v4

    :cond_2
    :goto_0
    iget v1, p2, LU/p;->e:I

    move v5, v2

    :goto_1
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v5, v6, :cond_4

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v6, v6, v5

    iget-object v6, v6, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v6, v6, v5

    invoke-virtual {p0, v6, v1, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x0(LU/W;II)V

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->g()I

    goto :goto_3

    :cond_5
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->k()I

    :goto_3
    iget v1, p2, LU/p;->c:I

    if-ltz v1, :cond_6

    invoke-virtual {p3}, LU/L;->a()I

    move-result p3

    if-ge v1, p3, :cond_6

    goto :goto_4

    :cond_6
    move v3, v2

    :goto_4
    const/4 p3, -0x1

    if-eqz v3, :cond_8

    iget-boolean v1, v0, LU/p;->i:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    iget p3, p2, LU/p;->c:I

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p1, p3, v0, v1}, LU/I;->i(IJ)LU/O;

    move-result-object p1

    iget p3, p2, LU/p;->c:I

    iget v0, p2, LU/p;->d:I

    add-int/2addr p3, v0

    iput p3, p2, LU/p;->c:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_8
    :goto_5
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r0(LU/I;LU/p;)V

    iget p1, v0, LU/p;->e:I

    if-ne p1, p3, :cond_9

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {p1}, LU/u;->k()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m0(I)I

    move-result p1

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {p3}, LU/u;->k()I

    move-result p3

    sub-int/2addr p3, p1

    goto :goto_6

    :cond_9
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {p1}, LU/u;->g()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l0(I)I

    move-result p1

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {p3}, LU/u;->g()I

    move-result p3

    sub-int p3, p1, p3

    :goto_6
    if-lez p3, :cond_a

    iget p1, p2, LU/p;->b:I

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_a
    return v2
.end method

.method public final h(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final h0(Z)Landroid/view/View;
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v0}, LU/u;->k()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->g()I

    move-result v1

    invoke-virtual {p0}, LU/C;->r()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ltz v2, :cond_4

    invoke-virtual {p0, v2}, LU/C;->q(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v5, v4}, LU/u;->e(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v6, v4}, LU/u;->b(Landroid/view/View;)I

    move-result v6

    if-le v6, v0, :cond_3

    if-lt v5, v1, :cond_0

    goto :goto_2

    :cond_0
    if-le v6, v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v4

    goto :goto_2

    :cond_2
    :goto_1
    return-object v4

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final i(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final i0(Z)Landroid/view/View;
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v0}, LU/u;->k()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->g()I

    move-result v1

    invoke-virtual {p0}, LU/C;->r()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    invoke-virtual {p0, v4}, LU/C;->q(I)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v6, v5}, LU/u;->e(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v7, v5}, LU/u;->b(Landroid/view/View;)I

    move-result v7

    if-le v7, v0, :cond_3

    if-lt v6, v1, :cond_0

    goto :goto_2

    :cond_0
    if-ge v6, v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v5

    goto :goto_2

    :cond_2
    :goto_1
    return-object v5

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final j(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final j0()I
    .locals 2

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    :goto_0
    return v1
.end method

.method public final k(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final k0()I
    .locals 1

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, LU/C;->D(Landroid/view/View;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final l(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->f0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final l0(I)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, LU/W;->f(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, LU/W;->f(I)I

    move-result v2

    if-le v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final m0(I)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, LU/W;->h(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, LU/W;->h(I)I

    move-result v2

    if-ge v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final n()LU/D;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, LU/T;

    invoke-direct {v0, v2, v1}, LU/D;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, LU/T;

    invoke-direct {v0, v1, v2}, LU/D;-><init>(II)V

    return-object v0
.end method

.method public final n0()Landroid/view/View;
    .locals 13

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    new-instance v2, Ljava/util/BitSet;

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v3, v5}, Ljava/util/BitSet;->set(IIZ)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    const/4 v6, -0x1

    if-ne v3, v5, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o0()Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    if-eqz v7, :cond_1

    move v0, v6

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    if-ge v1, v0, :cond_2

    move v6, v5

    :cond_2
    if-eq v1, v0, :cond_d

    invoke-virtual {p0, v1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, LU/T;

    iget-object v9, v8, LU/T;->d:LU/W;

    iget v9, v9, LU/W;->e:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_7

    iget-object v9, v8, LU/T;->d:LU/W;

    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    const/high16 v11, -0x80000000

    if-eqz v10, :cond_4

    iget v10, v9, LU/W;->c:I

    if-eq v10, v11, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v9}, LU/W;->a()V

    iget v10, v9, LU/W;->c:I

    :goto_2
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v11}, LU/u;->g()I

    move-result v11

    if-ge v10, v11, :cond_6

    iget-object v0, v9, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v5

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/T;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    :cond_4
    iget v10, v9, LU/W;->b:I

    if-eq v10, v11, :cond_5

    goto :goto_3

    :cond_5
    iget-object v10, v9, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, LU/T;

    iget-object v12, v9, LU/W;->f:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v12, v12, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v12, v10}, LU/u;->e(Landroid/view/View;)I

    move-result v10

    iput v10, v9, LU/W;->b:I

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v10, v9, LU/W;->b:I

    :goto_3
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v11}, LU/u;->k()I

    move-result v11

    if-le v10, v11, :cond_6

    iget-object v0, v9, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/T;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_4
    return-object v7

    :cond_6
    iget-object v9, v8, LU/T;->d:LU/W;

    iget v9, v9, LU/W;->e:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->clear(I)V

    :cond_7
    add-int/2addr v1, v6

    if-eq v1, v0, :cond_2

    invoke-virtual {p0, v1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v9

    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    if-eqz v10, :cond_9

    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v10, v7}, LU/u;->b(Landroid/view/View;)I

    move-result v10

    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v11, v9}, LU/u;->b(Landroid/view/View;)I

    move-result v11

    if-ge v10, v11, :cond_8

    return-object v7

    :cond_8
    if-ne v10, v11, :cond_2

    goto :goto_5

    :cond_9
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v10, v7}, LU/u;->e(Landroid/view/View;)I

    move-result v10

    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v11, v9}, LU/u;->e(Landroid/view/View;)I

    move-result v11

    if-le v10, v11, :cond_a

    return-object v7

    :cond_a
    if-ne v10, v11, :cond_2

    :goto_5
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, LU/T;

    iget-object v8, v8, LU/T;->d:LU/W;

    iget v8, v8, LU/W;->e:I

    iget-object v9, v9, LU/T;->d:LU/W;

    iget v9, v9, LU/W;->e:I

    sub-int/2addr v8, v9

    if-gez v8, :cond_b

    move v8, v5

    goto :goto_6

    :cond_b
    move v8, v4

    :goto_6
    if-gez v3, :cond_c

    move v9, v5

    goto :goto_7

    :cond_c
    move v9, v4

    :goto_7
    if-eq v8, v9, :cond_2

    return-object v7

    :cond_d
    const/4 v0, 0x0

    return-object v0
.end method

.method public final o(Landroid/content/Context;Landroid/util/AttributeSet;)LU/D;
    .locals 1

    new-instance v0, LU/T;

    invoke-direct {v0, p1, p2}, LU/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final o0()Z
    .locals 2

    invoke-virtual {p0}, LU/C;->y()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final p(Landroid/view/ViewGroup$LayoutParams;)LU/D;
    .locals 1

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    new-instance v0, LU/T;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, LU/D;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_0
    new-instance v0, LU/T;

    invoke-direct {v0, p1}, LU/D;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final p0(Landroid/view/View;II)V
    .locals 5

    iget-object v0, p0, LU/C;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->v(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/T;

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v4, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    invoke-static {p2, v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y0(III)I

    move-result p2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v1

    invoke-static {p3, v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y0(III)I

    move-result p3

    invoke-virtual {p0, p1, p2, p3, v0}, LU/C;->a0(Landroid/view/View;IILU/D;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_1
    return-void
.end method

.method public final q0(I)Z
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    if-ne p1, v1, :cond_0

    move p1, v3

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    if-eq p1, v0, :cond_1

    move v2, v3

    :cond_1
    return v2

    :cond_2
    if-ne p1, v1, :cond_3

    move p1, v3

    goto :goto_1

    :cond_3
    move p1, v2

    :goto_1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    if-ne p1, v0, :cond_4

    move p1, v3

    goto :goto_2

    :cond_4
    move p1, v2

    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o0()Z

    move-result v0

    if-ne p1, v0, :cond_5

    move v2, v3

    :cond_5
    return v2
.end method

.method public final r0(LU/I;LU/p;)V
    .locals 4

    iget-boolean v0, p2, LU/p;->a:Z

    if-eqz v0, :cond_a

    iget-boolean v0, p2, LU/p;->i:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget v0, p2, LU/p;->b:I

    const/4 v1, -0x1

    if-nez v0, :cond_2

    iget v0, p2, LU/p;->e:I

    if-ne v0, v1, :cond_1

    iget p2, p2, LU/p;->g:I

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s0(LU/I;I)V

    goto/16 :goto_4

    :cond_1
    iget p2, p2, LU/p;->f:I

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t0(LU/I;I)V

    goto :goto_4

    :cond_2
    iget v0, p2, LU/p;->e:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_6

    iget v0, p2, LU/p;->f:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, LU/W;->h(I)I

    move-result v1

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v3, v2, :cond_4

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v2, v2, v3

    invoke-virtual {v2, v0}, LU/W;->h(I)I

    move-result v2

    if-le v2, v1, :cond_3

    move v1, v2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    sub-int/2addr v0, v1

    if-gez v0, :cond_5

    iget p2, p2, LU/p;->g:I

    goto :goto_1

    :cond_5
    iget v1, p2, LU/p;->g:I

    iget p2, p2, LU/p;->b:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int p2, v1, p2

    :goto_1
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s0(LU/I;I)V

    goto :goto_4

    :cond_6
    iget v0, p2, LU/p;->g:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, LU/W;->f(I)I

    move-result v1

    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    if-ge v3, v2, :cond_8

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:[LU/W;

    aget-object v2, v2, v3

    invoke-virtual {v2, v0}, LU/W;->f(I)I

    move-result v2

    if-ge v2, v1, :cond_7

    move v1, v2

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_8
    iget v0, p2, LU/p;->g:I

    sub-int/2addr v1, v0

    if-gez v1, :cond_9

    iget p2, p2, LU/p;->f:I

    goto :goto_3

    :cond_9
    iget v0, p2, LU/p;->f:I

    iget p2, p2, LU/p;->b:I

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, v0

    :goto_3
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t0(LU/I;I)V

    :cond_a
    :goto_4
    return-void
.end method

.method public final s0(LU/I;I)V
    .locals 2

    invoke-virtual {p0}, LU/C;->r()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    if-ltz p1, :cond_1

    invoke-virtual {p0, p1}, LU/C;->q(I)Landroid/view/View;

    move-result-object p1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1, p1}, LU/u;->e(Landroid/view/View;)I

    move-result v1

    if-lt v1, p2, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1, p1}, LU/u;->n(Landroid/view/View;)I

    move-result v1

    if-lt v1, p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LU/T;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, LU/T;->d:LU/W;

    iget-object p2, p2, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ne p2, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, LU/T;->d:LU/W;

    iget-object p1, p1, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LU/T;

    const/4 p2, 0x0

    iput-object p2, p1, LU/T;->d:LU/W;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public final t(LU/I;LU/L;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, LU/C;->t(LU/I;LU/L;)I

    move-result p1

    return p1
.end method

.method public final t0(LU/I;I)V
    .locals 2

    invoke-virtual {p0}, LU/C;->r()I

    move-result p1

    if-lez p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1, v0}, LU/u;->b(Landroid/view/View;)I

    move-result v1

    if-gt v1, p2, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1, v0}, LU/u;->m(Landroid/view/View;)I

    move-result v1

    if-gt v1, p2, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, LU/T;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p2, LU/T;->d:LU/W;

    iget-object v0, v0, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object p2, p2, LU/T;->d:LU/W;

    iget-object v0, p2, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LU/T;

    const/4 v1, 0x0

    iput-object v1, p1, LU/T;->d:LU/W;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/high16 v1, -0x80000000

    if-nez v0, :cond_1

    iput v1, p2, LU/W;->c:I

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    return-void
.end method

.method public final u0()V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    :goto_1
    return-void
.end method

.method public final v0(I)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:LU/p;

    iput p1, v0, LU/p;->e:I

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne p1, v3, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne v1, p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    iput v2, v0, LU/p;->d:I

    return-void
.end method

.method public final w0(ILU/L;)V
    .locals 2

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:LU/p;

    const/4 v0, 0x0

    iput v0, p2, LU/p;->b:I

    iput p1, p2, LU/p;->c:I

    const/4 p1, 0x1

    iget-object v1, p0, LU/C;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_0

    iget-boolean v1, v1, Landroidx/recyclerview/widget/RecyclerView;->f:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->k()I

    move-result v1

    sub-int/2addr v1, v0

    iput v1, p2, LU/p;->f:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->g()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p2, LU/p;->g:I

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->f()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p2, LU/p;->g:I

    neg-int v1, v0

    iput v1, p2, LU/p;->f:I

    :goto_0
    iput-boolean v0, p2, LU/p;->h:Z

    iput-boolean p1, p2, LU/p;->a:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->i()I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->f()I

    move-result v1

    if-nez v1, :cond_1

    move v0, p1

    :cond_1
    iput-boolean v0, p2, LU/p;->i:Z

    return-void
.end method

.method public final x0(LU/W;II)V
    .locals 5

    iget v0, p1, LU/W;->d:I

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    const/4 v3, -0x1

    iget v4, p1, LU/W;->e:I

    if-ne p2, v3, :cond_1

    iget p2, p1, LU/W;->b:I

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p1, LU/W;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, LU/T;

    iget-object v3, p1, LU/W;->f:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:LU/u;

    invoke-virtual {v3, p2}, LU/u;->e(Landroid/view/View;)I

    move-result p2

    iput p2, p1, LU/W;->b:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p1, LU/W;->b:I

    :goto_0
    add-int/2addr p2, v0

    if-gt p2, p3, :cond_3

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:Ljava/util/BitSet;

    invoke-virtual {p1, v4, v2}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_2

    :cond_1
    iget p2, p1, LU/W;->c:I

    if-eq p2, v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LU/W;->a()V

    iget p2, p1, LU/W;->c:I

    :goto_1
    sub-int/2addr p2, v0

    if-lt p2, p3, :cond_3

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:Ljava/util/BitSet;

    invoke-virtual {p1, v4, v2}, Ljava/util/BitSet;->set(IZ)V

    :cond_3
    :goto_2
    return-void
.end method
