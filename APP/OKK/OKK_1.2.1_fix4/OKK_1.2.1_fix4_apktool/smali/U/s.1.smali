.class public final LU/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Ljava/util/List;

.field public k:Z


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LU/s;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    if-gtz p1, :cond_0

    const/4 p1, -0x1

    iput p1, p0, LU/s;->d:I

    return-void

    :cond_0
    iget-object p1, p0, LU/s;->j:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LU/O;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(LU/I;)Landroid/view/View;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, LU/s;->j:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x0

    if-gtz p1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, LU/s;->j:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LU/O;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_1
    iget v0, p0, LU/s;->d:I

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {p1, v0, v1, v2}, LU/I;->i(IJ)LU/O;

    move-result-object p1

    iget v0, p0, LU/s;->d:I

    iget v1, p0, LU/s;->e:I

    add-int/2addr v0, v1

    iput v0, p0, LU/s;->d:I

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method
