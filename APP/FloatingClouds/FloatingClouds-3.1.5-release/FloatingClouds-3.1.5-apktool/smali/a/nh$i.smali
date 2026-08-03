.class public La/nh$i;
.super La/nh$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/nh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public n:La/a9;

.field public o:La/a9;

.field public p:La/a9;


# direct methods
.method public constructor <init>(La/nh;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/nh$h;-><init>(La/nh;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, La/nh$i;->n:La/a9;

    iput-object p1, p0, La/nh$i;->o:La/a9;

    iput-object p1, p0, La/nh$i;->p:La/a9;

    return-void
.end method


# virtual methods
.method public g()La/a9;
    .locals 1

    iget-object v0, p0, La/nh$i;->o:La/a9;

    if-nez v0, :cond_0

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, La/oh;->d(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La/a9;->c(Landroid/graphics/Insets;)La/a9;

    move-result-object v0

    iput-object v0, p0, La/nh$i;->o:La/a9;

    :cond_0
    iget-object v0, p0, La/nh$i;->o:La/a9;

    return-object v0
.end method

.method public i()La/a9;
    .locals 1

    iget-object v0, p0, La/nh$i;->n:La/a9;

    if-nez v0, :cond_0

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, La/oh;->e(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La/a9;->c(Landroid/graphics/Insets;)La/a9;

    move-result-object v0

    iput-object v0, p0, La/nh$i;->n:La/a9;

    :cond_0
    iget-object v0, p0, La/nh$i;->n:La/a9;

    return-object v0
.end method

.method public k()La/a9;
    .locals 1

    iget-object v0, p0, La/nh$i;->p:La/a9;

    if-nez v0, :cond_0

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, La/oh;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La/a9;->c(Landroid/graphics/Insets;)La/a9;

    move-result-object v0

    iput-object v0, p0, La/nh$i;->p:La/a9;

    :cond_0
    iget-object v0, p0, La/nh$i;->p:La/a9;

    return-object v0
.end method

.method public l(IIII)La/nh;
    .locals 1

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, La/oh;->c(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, La/nh;->g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;

    move-result-object p1

    return-object p1
.end method

.method public q(La/a9;)V
    .locals 0

    return-void
.end method
