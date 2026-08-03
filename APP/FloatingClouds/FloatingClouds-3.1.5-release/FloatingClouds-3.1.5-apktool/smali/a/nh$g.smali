.class public La/nh$g;
.super La/nh$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/nh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public m:La/a9;


# direct methods
.method public constructor <init>(La/nh;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/nh$f;-><init>(La/nh;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, La/nh$g;->m:La/a9;

    return-void
.end method


# virtual methods
.method public b()La/nh;
    .locals 2

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, La/nh;->g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;

    move-result-object v0

    return-object v0
.end method

.method public c()La/nh;
    .locals 2

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, La/nh;->g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;

    move-result-object v0

    return-object v0
.end method

.method public final h()La/a9;
    .locals 4

    iget-object v0, p0, La/nh$g;->m:La/a9;

    if-nez v0, :cond_0

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v0

    invoke-static {v1, v2, v3, v0}, La/a9;->b(IIII)La/a9;

    move-result-object v0

    iput-object v0, p0, La/nh$g;->m:La/a9;

    :cond_0
    iget-object v0, p0, La/nh$g;->m:La/a9;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public q(La/a9;)V
    .locals 0

    iput-object p1, p0, La/nh$g;->m:La/a9;

    return-void
.end method
