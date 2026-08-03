.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super LU/C;
.source "SourceFile"


# instance fields
.field public k:I

.field public l:LU/s;

.field public m:LU/u;

.field public final n:Z

.field public o:Z

.field public p:Z

.field public final q:Z

.field public r:LU/t;

.field public final s:LU/q;

.field public final t:LU/r;

.field public final u:[I


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, LU/C;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    .line 4
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    .line 5
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:Z

    .line 6
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:LU/t;

    .line 8
    new-instance v3, LU/q;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, LU/q;-><init>(I)V

    iput-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:LU/q;

    .line 9
    new-instance v3, LU/r;

    .line 10
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:LU/r;

    const/4 v3, 0x2

    .line 12
    new-array v3, v3, [I

    iput-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:[I

    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->v0(I)V

    .line 14
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(Ljava/lang/String;)V

    .line 15
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    .line 17
    invoke-virtual {p0}, LU/C;->Y()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 18
    invoke-direct {p0}, LU/C;-><init>()V

    const/4 v0, 0x1

    .line 19
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v1, 0x0

    .line 20
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    .line 21
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    .line 22
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:Z

    .line 23
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:LU/t;

    .line 25
    new-instance v1, LU/q;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LU/q;-><init>(I)V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:LU/q;

    .line 26
    new-instance v1, LU/r;

    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:LU/r;

    const/4 v1, 0x2

    .line 29
    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:[I

    .line 30
    invoke-static {p1, p2, p3, p4}, LU/C;->E(Landroid/content/Context;Landroid/util/AttributeSet;II)LU/q;

    move-result-object p1

    .line 31
    iget p2, p1, LU/q;->b:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->v0(I)V

    .line 32
    iget-boolean p2, p1, LU/q;->d:Z

    .line 33
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(Ljava/lang/String;)V

    .line 34
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 35
    :cond_0
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    .line 36
    invoke-virtual {p0}, LU/C;->Y()V

    .line 37
    :goto_0
    iget-boolean p1, p1, LU/q;->e:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->w0(Z)V

    return-void
.end method


# virtual methods
.method public final H()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final K(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public L(Landroid/view/View;ILU/I;LU/L;)Landroid/view/View;
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->u0()V

    invoke-virtual {p0}, LU/C;->r()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->g0(I)I

    move-result p1

    const/high16 p2, -0x80000000

    if-ne p1, p2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->l()I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3eaaaaab

    mul-float/2addr v1, v2

    float-to-int v1, v1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->x0(IIZLU/L;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iput p2, v1, LU/s;->g:I

    iput-boolean v2, v1, LU/s;->a:Z

    const/4 p2, 0x1

    invoke-virtual {p0, p3, v1, p4, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->i0(LU/I;LU/s;LU/L;Z)I

    const/4 p3, -0x1

    if-ne p1, p3, :cond_3

    iget-boolean p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz p4, :cond_2

    invoke-virtual {p0}, LU/C;->r()I

    move-result p4

    sub-int/2addr p4, p2

    invoke-virtual {p0, p4, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->m0(II)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LU/C;->r()I

    move-result p2

    invoke-virtual {p0, v2, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->m0(II)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    :cond_3
    iget-boolean p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz p4, :cond_4

    invoke-virtual {p0}, LU/C;->r()I

    move-result p2

    invoke-virtual {p0, v2, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->m0(II)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LU/C;->r()I

    move-result p4

    sub-int/2addr p4, p2

    invoke-virtual {p0, p4, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->m0(II)Landroid/view/View;

    move-result-object p2

    :goto_0
    if-ne p1, p3, :cond_5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->p0()Landroid/view/View;

    move-result-object p1

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->o0()Landroid/view/View;

    move-result-object p1

    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    move-result p3

    if-eqz p3, :cond_7

    if-nez p2, :cond_6

    return-object v0

    :cond_6
    return-object p1

    :cond_7
    return-object p2
.end method

.method public final M(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    invoke-super {p0, p1}, LU/C;->M(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->n0(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, LU/C;->D(Landroid/view/View;)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->l0()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_1
    return-void
.end method

.method public final P(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, LU/t;

    if-eqz v0, :cond_0

    check-cast p1, LU/t;

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:LU/t;

    invoke-virtual {p0}, LU/C;->Y()V

    :cond_0
    return-void
.end method

.method public final Q()Landroid/os/Parcelable;
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:LU/t;

    if-eqz v0, :cond_0

    new-instance v1, LU/t;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, v0, LU/t;->a:I

    iput v2, v1, LU/t;->a:I

    iget v2, v0, LU/t;->b:I

    iput v2, v1, LU/t;->b:I

    iget-boolean v0, v0, LU/t;->c:Z

    iput-boolean v0, v1, LU/t;->c:Z

    return-object v1

    :cond_0
    new-instance v0, LU/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, LU/C;->r()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0()V

    const/4 v1, 0x0

    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    xor-int/2addr v1, v2

    iput-boolean v1, v0, LU/t;->c:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->o0()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v2}, LU/u;->g()I

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v3, v1}, LU/u;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, LU/t;->b:I

    invoke-static {v1}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    iput v1, v0, LU/t;->a:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->p0()Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, LU/C;->D(Landroid/view/View;)I

    move-result v2

    iput v2, v0, LU/t;->a:I

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v2, v1}, LU/u;->e(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v2}, LU/u;->k()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, LU/t;->b:I

    goto :goto_0

    :cond_2
    const/4 v1, -0x1

    iput v1, v0, LU/t;->a:I

    :goto_0
    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:LU/t;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, LU/C;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c0(LU/L;[I)V
    .locals 3

    iget p1, p1, LU/L;->a:I

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p1}, LU/u;->l()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iget v2, v2, LU/s;->f:I

    if-ne v2, v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, p1

    move p1, v1

    :goto_1
    aput p1, p2, v1

    const/4 p1, 0x1

    aput v0, p2, p1

    return-void
.end method

.method public final d()Z
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

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
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->k0(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->j0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, LU/S;->j(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;Z)I

    move-result p1

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
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->k0(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->j0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

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
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->k0(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->j0(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, LU/S;->l(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;Z)I

    move-result p1

    return p1
.end method

.method public final g(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->d0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final g0(I)I
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_b

    const/4 v2, 0x2

    if-eq p1, v2, :cond_8

    const/16 v2, 0x11

    const/high16 v3, -0x80000000

    if-eq p1, v2, :cond_6

    const/16 v2, 0x21

    if-eq p1, v2, :cond_4

    const/16 v0, 0x42

    if-eq p1, v0, :cond_2

    const/16 v0, 0x82

    if-eq p1, v0, :cond_0

    return v3

    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    return v1

    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    return v1

    :cond_4
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    return v0

    :cond_6
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    move v0, v3

    :goto_3
    return v0

    :cond_8
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-ne p1, v1, :cond_9

    return v1

    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q0()Z

    move-result p1

    if-eqz p1, :cond_a

    return v0

    :cond_a
    return v1

    :cond_b
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-ne p1, v1, :cond_c

    return v0

    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q0()Z

    move-result p1

    if-eqz p1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public h(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final h0()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    if-nez v0, :cond_0

    new-instance v0, LU/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, LU/s;->a:Z

    const/4 v1, 0x0

    iput v1, v0, LU/s;->h:I

    iput v1, v0, LU/s;->i:I

    const/4 v1, 0x0

    iput-object v1, v0, LU/s;->j:Ljava/util/List;

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    :cond_0
    return-void
.end method

.method public i(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final i0(LU/I;LU/s;LU/L;Z)I
    .locals 7

    iget v0, p2, LU/s;->c:I

    iget v1, p2, LU/s;->g:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    if-gez v0, :cond_0

    add-int/2addr v1, v0

    iput v1, p2, LU/s;->g:I

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->s0(LU/I;LU/s;)V

    :cond_1
    iget v1, p2, LU/s;->c:I

    iget v3, p2, LU/s;->h:I

    add-int/2addr v1, v3

    :cond_2
    iget-boolean v3, p2, LU/s;->k:Z

    if-nez v3, :cond_3

    if-lez v1, :cond_9

    :cond_3
    iget v3, p2, LU/s;->d:I

    if-ltz v3, :cond_9

    invoke-virtual {p3}, LU/L;->a()I

    move-result v4

    if-ge v3, v4, :cond_9

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:LU/r;

    const/4 v4, 0x0

    iput v4, v3, LU/r;->a:I

    iput-boolean v4, v3, LU/r;->b:Z

    iput-boolean v4, v3, LU/r;->c:Z

    iput-boolean v4, v3, LU/r;->d:Z

    invoke-virtual {p0, p1, p3, p2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->r0(LU/I;LU/L;LU/s;LU/r;)V

    iget-boolean v4, v3, LU/r;->b:Z

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    iget v4, p2, LU/s;->b:I

    iget v5, v3, LU/r;->a:I

    iget v6, p2, LU/s;->f:I

    mul-int/2addr v6, v5

    add-int/2addr v6, v4

    iput v6, p2, LU/s;->b:I

    iget-boolean v4, v3, LU/r;->c:Z

    if-eqz v4, :cond_5

    iget-object v4, p2, LU/s;->j:Ljava/util/List;

    if-nez v4, :cond_5

    iget-boolean v4, p3, LU/L;->f:Z

    if-nez v4, :cond_6

    :cond_5
    iget v4, p2, LU/s;->c:I

    sub-int/2addr v4, v5

    iput v4, p2, LU/s;->c:I

    sub-int/2addr v1, v5

    :cond_6
    iget v4, p2, LU/s;->g:I

    if-eq v4, v2, :cond_8

    add-int/2addr v4, v5

    iput v4, p2, LU/s;->g:I

    iget v5, p2, LU/s;->c:I

    if-gez v5, :cond_7

    add-int/2addr v4, v5

    iput v4, p2, LU/s;->g:I

    :cond_7
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->s0(LU/I;LU/s;)V

    :cond_8
    if-eqz p4, :cond_2

    iget-boolean v3, v3, LU/r;->d:Z

    if-eqz v3, :cond_2

    :cond_9
    :goto_0
    iget p1, p2, LU/s;->c:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final j(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->d0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final j0(Z)Landroid/view/View;
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0}, LU/C;->r()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->n0(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->n0(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public k(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final k0(Z)Landroid/view/View;
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->n0(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0}, LU/C;->r()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->n0(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public l(LU/L;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f0(LU/L;)I

    move-result p1

    return p1
.end method

.method public final l0()I
    .locals 3

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->n0(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    :goto_0
    return v1
.end method

.method public final m(I)Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    sub-int v1, p1, v1

    if-ltz v1, :cond_1

    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    if-ne v1, p1, :cond_1

    return-object v0

    :cond_1
    invoke-super {p0, p1}, LU/C;->m(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final m0(II)Landroid/view/View;
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0()V

    if-le p2, p1, :cond_0

    goto :goto_0

    :cond_0
    if-ge p2, p1, :cond_3

    :goto_0
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p0, p1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, LU/u;->e(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->k()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/16 v0, 0x4104

    const/16 v1, 0x4004

    goto :goto_1

    :cond_1
    const/16 v0, 0x1041

    const/16 v1, 0x1001

    :goto_1
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-nez v2, :cond_2

    iget-object v2, p0, LU/C;->c:LA/c;

    invoke-virtual {v2, p1, p2, v0, v1}, LA/c;->b(IIII)Landroid/view/View;

    move-result-object p1

    goto :goto_2

    :cond_2
    iget-object v2, p0, LU/C;->d:LA/c;

    invoke-virtual {v2, p1, p2, v0, v1}, LA/c;->b(IIII)Landroid/view/View;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    invoke-virtual {p0, p1}, LU/C;->q(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public n()LU/D;
    .locals 2

    new-instance v0, LU/D;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, LU/D;-><init>(II)V

    return-object v0
.end method

.method public final n0(IIZ)Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0()V

    const/16 v0, 0x140

    if-eqz p3, :cond_0

    const/16 p3, 0x6003

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-nez v1, :cond_1

    iget-object v1, p0, LU/C;->c:LA/c;

    invoke-virtual {v1, p1, p2, p3, v0}, LA/c;->b(IIII)Landroid/view/View;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LU/C;->d:LA/c;

    invoke-virtual {v1, p1, p2, p3, v0}, LA/c;->b(IIII)Landroid/view/View;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final o0()Landroid/view/View;
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, v0}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final p0()Landroid/view/View;
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LU/C;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final q0()Z
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

.method public r0(LU/I;LU/L;LU/s;LU/r;)V
    .locals 11

    invoke-virtual {p3, p1}, LU/s;->b(LU/I;)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p1, :cond_0

    iput-boolean p2, p4, LU/r;->b:Z

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p3, LU/s;->j:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-nez v1, :cond_3

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    iget v4, p3, LU/s;->f:I

    if-ne v4, v3, :cond_1

    move v4, p2

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    if-ne v1, v4, :cond_2

    invoke-virtual {p0, p1, v3, v2}, LU/C;->a(Landroid/view/View;IZ)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0, p1, v2, v2}, LU/C;->a(Landroid/view/View;IZ)V

    goto :goto_2

    :cond_3
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    iget v4, p3, LU/s;->f:I

    if-ne v4, v3, :cond_4

    move v4, p2

    goto :goto_1

    :cond_4
    move v4, v2

    :goto_1
    if-ne v1, v4, :cond_5

    invoke-virtual {p0, p1, v3, p2}, LU/C;->a(Landroid/view/View;IZ)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p1, v2, p2}, LU/C;->a(Landroid/view/View;IZ)V

    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, LU/D;

    iget-object v2, p0, LU/C;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView;->v(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    iget v4, v2, Landroid/graphics/Rect;->left:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iget v5, v2, Landroid/graphics/Rect;->top:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v2

    iget v2, p0, LU/C;->i:I

    iget v6, p0, LU/C;->g:I

    invoke-virtual {p0}, LU/C;->A()I

    move-result v7

    invoke-virtual {p0}, LU/C;->B()I

    move-result v8

    add-int/2addr v8, v7

    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, v7

    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v8, v7

    add-int/2addr v8, v4

    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c()Z

    move-result v7

    invoke-static {v7, v2, v6, v8, v4}, LU/C;->s(ZIIII)I

    move-result v2

    iget v4, p0, LU/C;->j:I

    iget v6, p0, LU/C;->h:I

    invoke-virtual {p0}, LU/C;->C()I

    move-result v7

    invoke-virtual {p0}, LU/C;->z()I

    move-result v8

    add-int/2addr v8, v7

    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v7

    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v8, v7

    add-int/2addr v8, v5

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->d()Z

    move-result v7

    invoke-static {v7, v4, v6, v8, v5}, LU/C;->s(ZIIII)I

    move-result v4

    invoke-virtual {p0, p1, v2, v4, v1}, LU/C;->a0(Landroid/view/View;IILU/D;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1, v2, v4}, Landroid/view/View;->measure(II)V

    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1, p1}, LU/u;->c(Landroid/view/View;)I

    move-result v1

    iput v1, p4, LU/r;->a:I

    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-ne v1, p2, :cond_9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q0()Z

    move-result p2

    if-eqz p2, :cond_7

    iget p2, p0, LU/C;->i:I

    invoke-virtual {p0}, LU/C;->B()I

    move-result v1

    sub-int/2addr p2, v1

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1, p1}, LU/u;->d(Landroid/view/View;)I

    move-result v1

    sub-int v1, p2, v1

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, LU/C;->A()I

    move-result v1

    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p2, p1}, LU/u;->d(Landroid/view/View;)I

    move-result p2

    add-int/2addr p2, v1

    :goto_3
    iget v2, p3, LU/s;->f:I

    if-ne v2, v3, :cond_8

    iget p3, p3, LU/s;->b:I

    iget p4, p4, LU/r;->a:I

    sub-int p4, p3, p4

    goto :goto_4

    :cond_8
    iget p3, p3, LU/s;->b:I

    iget p4, p4, LU/r;->a:I

    add-int/2addr p4, p3

    move v9, p4

    move p4, p3

    move p3, v9

    goto :goto_4

    :cond_9
    invoke-virtual {p0}, LU/C;->C()I

    move-result p2

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1, p1}, LU/u;->d(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, p2

    iget v2, p3, LU/s;->f:I

    if-ne v2, v3, :cond_a

    iget p3, p3, LU/s;->b:I

    iget p4, p4, LU/r;->a:I

    sub-int p4, p3, p4

    move v9, p4

    move p4, p2

    move p2, p3

    move p3, v1

    move v1, v9

    goto :goto_4

    :cond_a
    iget p3, p3, LU/s;->b:I

    iget p4, p4, LU/r;->a:I

    add-int/2addr p4, p3

    move v9, p4

    move p4, p2

    move p2, v9

    move v10, v1

    move v1, p3

    move p3, v10

    :goto_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, LU/D;

    iget-object v3, v2, LU/D;->a:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v4

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v4

    iget v4, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr p4, v4

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p4, v4

    iget v4, v3, Landroid/graphics/Rect;->right:I

    sub-int/2addr p2, v4

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p2, v4

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p3, v3

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p3, v2

    invoke-virtual {p1, v1, p4, p2, p3}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method

.method public final s0(LU/I;LU/s;)V
    .locals 5

    iget-boolean v0, p2, LU/s;->a:Z

    if-eqz v0, :cond_e

    iget-boolean v0, p2, LU/s;->k:Z

    if-eqz v0, :cond_0

    goto/16 :goto_8

    :cond_0
    iget v0, p2, LU/s;->g:I

    iget v1, p2, LU/s;->i:I

    iget p2, p2, LU/s;->f:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p2, v2, :cond_7

    invoke-virtual {p0}, LU/C;->r()I

    move-result p2

    if-gez v0, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v2}, LU/u;->f()I

    move-result v2

    sub-int/2addr v2, v0

    add-int/2addr v2, v1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v0, :cond_4

    move v0, v3

    :goto_0
    if-ge v0, p2, :cond_e

    invoke-virtual {p0, v0}, LU/C;->q(I)Landroid/view/View;

    move-result-object v1

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v4, v1}, LU/u;->e(Landroid/view/View;)I

    move-result v4

    if-lt v4, v2, :cond_3

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v4, v1}, LU/u;->n(Landroid/view/View;)I

    move-result v1

    if-ge v1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {p0, p1, v3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->t0(LU/I;II)V

    goto/16 :goto_8

    :cond_4
    add-int/lit8 p2, p2, -0x1

    move v0, p2

    :goto_2
    if-ltz v0, :cond_e

    invoke-virtual {p0, v0}, LU/C;->q(I)Landroid/view/View;

    move-result-object v1

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v3, v1}, LU/u;->e(Landroid/view/View;)I

    move-result v3

    if-lt v3, v2, :cond_6

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v3, v1}, LU/u;->n(Landroid/view/View;)I

    move-result v1

    if-ge v1, v2, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_6
    :goto_3
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->t0(LU/I;II)V

    goto :goto_8

    :cond_7
    if-gez v0, :cond_8

    goto :goto_8

    :cond_8
    sub-int/2addr v0, v1

    invoke-virtual {p0}, LU/C;->r()I

    move-result p2

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v1, :cond_b

    add-int/lit8 p2, p2, -0x1

    move v1, p2

    :goto_4
    if-ltz v1, :cond_e

    invoke-virtual {p0, v1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v3, v2}, LU/u;->b(Landroid/view/View;)I

    move-result v3

    if-gt v3, v0, :cond_a

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v3, v2}, LU/u;->m(Landroid/view/View;)I

    move-result v2

    if-le v2, v0, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v1, v1, -0x1

    goto :goto_4

    :cond_a
    :goto_5
    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->t0(LU/I;II)V

    goto :goto_8

    :cond_b
    move v1, v3

    :goto_6
    if-ge v1, p2, :cond_e

    invoke-virtual {p0, v1}, LU/C;->q(I)Landroid/view/View;

    move-result-object v2

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v4, v2}, LU/u;->b(Landroid/view/View;)I

    move-result v4

    if-gt v4, v0, :cond_d

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v4, v2}, LU/u;->m(Landroid/view/View;)I

    move-result v2

    if-le v2, v0, :cond_c

    goto :goto_7

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_d
    :goto_7
    invoke-virtual {p0, p1, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->t0(LU/I;II)V

    :cond_e
    :goto_8
    return-void
.end method

.method public final t0(LU/I;II)V
    .locals 1

    if-ne p2, p3, :cond_0

    return-void

    :cond_0
    if-le p3, p2, :cond_1

    add-int/lit8 p3, p3, -0x1

    :goto_0
    if-lt p3, p2, :cond_2

    invoke-virtual {p0, p3}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p3}, LU/C;->W(I)V

    invoke-virtual {p1, v0}, LU/I;->f(Landroid/view/View;)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-le p2, p3, :cond_2

    invoke-virtual {p0, p2}, LU/C;->q(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p2}, LU/C;->W(I)V

    invoke-virtual {p1, v0}, LU/I;->f(Landroid/view/View;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final u0()V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    :goto_1
    return-void
.end method

.method public final v0(I)V
    .locals 2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation:"

    invoke-static {v1, p1}, LS/d;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(Ljava/lang/String;)V

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p0, p1}, LU/u;->a(LU/C;I)LU/u;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:LU/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:I

    invoke-virtual {p0}, LU/C;->Y()V

    :cond_3
    return-void
.end method

.method public w0(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:Z

    invoke-virtual {p0}, LU/C;->Y()V

    return-void
.end method

.method public final x0(IIZLU/L;)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->i()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v1}, LU/u;->f()I

    move-result v1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, v0, LU/s;->k:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iput p1, v0, LU/s;->f:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:[I

    aput v2, v0, v2

    aput v2, v0, v3

    invoke-virtual {p0, p4, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c0(LU/L;[I)V

    aget p4, v0, v2

    invoke-static {v2, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    aget v0, v0, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-ne p1, v3, :cond_1

    move v2, v3

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    if-eqz v2, :cond_2

    move v1, v0

    goto :goto_1

    :cond_2
    move v1, p4

    :goto_1
    iput v1, p1, LU/s;->h:I

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    move p4, v0

    :goto_2
    iput p4, p1, LU/s;->i:I

    const/4 p4, -0x1

    if-eqz v2, :cond_5

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v0}, LU/u;->h()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p1, LU/s;->h:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->o0()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v1, :cond_4

    move v3, p4

    :cond_4
    iput v3, v0, LU/s;->e:I

    invoke-static {p1}, LU/C;->D(Landroid/view/View;)I

    move-result p4

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iget v2, v1, LU/s;->e:I

    add-int/2addr p4, v2

    iput p4, v0, LU/s;->d:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p4, p1}, LU/u;->b(Landroid/view/View;)I

    move-result p4

    iput p4, v1, LU/s;->b:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p4, p1}, LU/u;->b(Landroid/view/View;)I

    move-result p1

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p4}, LU/u;->g()I

    move-result p4

    sub-int/2addr p1, p4

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->p0()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iget v1, v0, LU/s;->h:I

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {v2}, LU/u;->k()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v0, LU/s;->h:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Z

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    move v3, p4

    :goto_3
    iput v3, v0, LU/s;->e:I

    invoke-static {p1}, LU/C;->D(Landroid/view/View;)I

    move-result p4

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iget v2, v1, LU/s;->e:I

    add-int/2addr p4, v2

    iput p4, v0, LU/s;->d:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p4, p1}, LU/u;->e(Landroid/view/View;)I

    move-result p4

    iput p4, v1, LU/s;->b:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p4, p1}, LU/u;->e(Landroid/view/View;)I

    move-result p1

    neg-int p1, p1

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:LU/u;

    invoke-virtual {p4}, LU/u;->k()I

    move-result p4

    add-int/2addr p1, p4

    :goto_4
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:LU/s;

    iput p2, p4, LU/s;->c:I

    if-eqz p3, :cond_7

    sub-int/2addr p2, p1

    iput p2, p4, LU/s;->c:I

    :cond_7
    iput p1, p4, LU/s;->g:I

    return-void
.end method
