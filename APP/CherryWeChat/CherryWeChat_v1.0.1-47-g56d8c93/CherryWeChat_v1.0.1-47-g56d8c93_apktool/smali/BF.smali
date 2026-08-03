.class public LBF;
.super LAF;
.source ""


# instance fields
.field public n:Lyl;


# direct methods
.method public constructor <init>(LLF;LBF;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, LAF;-><init>(LLF;LAF;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, LBF;->n:Lyl;

    .line 5
    iget-object p1, p2, LBF;->n:Lyl;

    iput-object p1, p0, LBF;->n:Lyl;

    return-void
.end method

.method public constructor <init>(LLF;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LAF;-><init>(LLF;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LBF;->n:Lyl;

    return-void
.end method


# virtual methods
.method public b()LLF;
    .locals 2

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v0

    return-object v0
.end method

.method public c()LLF;
    .locals 2

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lyl;
    .locals 4

    iget-object v0, p0, LBF;->n:Lyl;

    if-nez v0, :cond_0

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v0

    invoke-static {v1, v2, v3, v0}, Lyl;->b(IIII)Lyl;

    move-result-object v0

    iput-object v0, p0, LBF;->n:Lyl;

    :cond_0
    iget-object v0, p0, LBF;->n:Lyl;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public s(Lyl;)V
    .locals 0

    iput-object p1, p0, LBF;->n:Lyl;

    return-void
.end method
