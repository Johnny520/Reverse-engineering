.class public final Landroidx/transition/a$b;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroidx/transition/a$g;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# virtual methods
.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/transition/a$g;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Landroidx/transition/a$g;

    check-cast p2, Landroid/graphics/PointF;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroidx/transition/a$g;->c:I

    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iput p2, p1, Landroidx/transition/a$g;->d:I

    iget v0, p1, Landroidx/transition/a$g;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroidx/transition/a$g;->g:I

    iget v1, p1, Landroidx/transition/a$g;->f:I

    if-ne v1, v0, :cond_0

    iget v0, p1, Landroidx/transition/a$g;->a:I

    iget v1, p1, Landroidx/transition/a$g;->b:I

    iget v2, p1, Landroidx/transition/a$g;->c:I

    iget-object v3, p1, Landroidx/transition/a$g;->e:Landroid/view/View;

    invoke-static {v3, v0, v1, v2, p2}, La/Qg;->a(Landroid/view/View;IIII)V

    const/4 p2, 0x0

    iput p2, p1, Landroidx/transition/a$g;->f:I

    iput p2, p1, Landroidx/transition/a$g;->g:I

    :cond_0
    return-void
.end method
