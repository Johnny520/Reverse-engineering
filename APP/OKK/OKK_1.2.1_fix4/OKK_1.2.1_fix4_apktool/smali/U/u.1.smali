.class public final LU/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LU/C;

.field public final b:Landroid/graphics/Rect;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LU/C;I)V
    .locals 0

    iput p2, p0, LU/u;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, LU/u;->b:Landroid/graphics/Rect;

    iput-object p1, p0, LU/u;->a:LU/C;

    return-void
.end method

.method public static a(LU/C;I)LU/u;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    new-instance p1, LU/u;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LU/u;-><init>(LU/C;I)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, LU/u;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LU/u;-><init>(LU/C;I)V

    return-object p1
.end method


# virtual methods
.method public final b(Landroid/view/View;)I
    .locals 2

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LU/D;

    iget-object p1, p1, LU/D;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LU/D;

    iget-object p1, p1, LU/D;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/view/View;)I
    .locals 2

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LU/C;->v(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LU/C;->w(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;)I
    .locals 2

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LU/C;->w(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LU/C;->v(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroid/view/View;)I
    .locals 2

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LU/D;

    iget-object p1, p1, LU/D;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LU/D;

    iget-object v1, p0, LU/u;->a:LU/C;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LU/D;

    iget-object p1, p1, LU/D;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    iget v0, v0, LU/C;->j:I

    return v0

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    iget v0, v0, LU/C;->i:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()I
    .locals 2

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    iget v1, v0, LU/C;->j:I

    invoke-virtual {v0}, LU/C;->z()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    iget v1, v0, LU/C;->i:I

    invoke-virtual {v0}, LU/C;->B()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    invoke-virtual {v0}, LU/C;->z()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    invoke-virtual {v0}, LU/C;->B()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    iget v0, v0, LU/C;->h:I

    return v0

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    iget v0, v0, LU/C;->g:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j()I
    .locals 1

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    iget v0, v0, LU/C;->g:I

    return v0

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    iget v0, v0, LU/C;->h:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()I
    .locals 1

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    invoke-virtual {v0}, LU/C;->C()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    invoke-virtual {v0}, LU/C;->A()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()I
    .locals 3

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    iget v1, v0, LU/C;->j:I

    invoke-virtual {v0}, LU/C;->C()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, LU/C;->z()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    iget v1, v0, LU/C;->i:I

    invoke-virtual {v0}, LU/C;->A()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, LU/C;->B()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Landroid/view/View;)I
    .locals 2

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    iget-object v1, p0, LU/u;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1}, LU/C;->G(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, v1, Landroid/graphics/Rect;->bottom:I

    return p1

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    iget-object v1, p0, LU/u;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1}, LU/C;->G(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, v1, Landroid/graphics/Rect;->right:I

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Landroid/view/View;)I
    .locals 2

    iget v0, p0, LU/u;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LU/u;->a:LU/C;

    iget-object v1, p0, LU/u;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1}, LU/C;->G(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, v1, Landroid/graphics/Rect;->top:I

    return p1

    :pswitch_0
    iget-object v0, p0, LU/u;->a:LU/C;

    iget-object v1, p0, LU/u;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1}, LU/C;->G(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, v1, Landroid/graphics/Rect;->left:I

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
