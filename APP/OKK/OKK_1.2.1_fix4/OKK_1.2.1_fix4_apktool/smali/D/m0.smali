.class public LD/m0;
.super LD/l0;
.source "SourceFile"


# instance fields
.field public n:Lv/c;

.field public o:Lv/c;

.field public p:Lv/c;


# direct methods
.method public constructor <init>(LD/q0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LD/l0;-><init>(LD/q0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, LD/m0;->n:Lv/c;

    iput-object p1, p0, LD/m0;->o:Lv/c;

    iput-object p1, p0, LD/m0;->p:Lv/c;

    return-void
.end method


# virtual methods
.method public g()Lv/c;
    .locals 1

    iget-object v0, p0, LD/m0;->o:Lv/c;

    if-nez v0, :cond_0

    iget-object v0, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LA0/B;->t(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lv/c;->c(Landroid/graphics/Insets;)Lv/c;

    move-result-object v0

    iput-object v0, p0, LD/m0;->o:Lv/c;

    :cond_0
    iget-object v0, p0, LD/m0;->o:Lv/c;

    return-object v0
.end method

.method public i()Lv/c;
    .locals 1

    iget-object v0, p0, LD/m0;->n:Lv/c;

    if-nez v0, :cond_0

    iget-object v0, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LA0/B;->x(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lv/c;->c(Landroid/graphics/Insets;)Lv/c;

    move-result-object v0

    iput-object v0, p0, LD/m0;->n:Lv/c;

    :cond_0
    iget-object v0, p0, LD/m0;->n:Lv/c;

    return-object v0
.end method

.method public k()Lv/c;
    .locals 1

    iget-object v0, p0, LD/m0;->p:Lv/c;

    if-nez v0, :cond_0

    iget-object v0, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LA0/B;->c(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lv/c;->c(Landroid/graphics/Insets;)Lv/c;

    move-result-object v0

    iput-object v0, p0, LD/m0;->p:Lv/c;

    :cond_0
    iget-object v0, p0, LD/m0;->p:Lv/c;

    return-object v0
.end method

.method public l(IIII)LD/q0;
    .locals 1

    iget-object v0, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, LA0/B;->i(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, LD/q0;->d(Landroid/view/View;Landroid/view/WindowInsets;)LD/q0;

    move-result-object p1

    return-object p1
.end method

.method public q(Lv/c;)V
    .locals 0

    return-void
.end method
