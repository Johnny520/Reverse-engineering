.class public LDF;
.super LCF;
.source ""


# instance fields
.field public o:Lyl;

.field public p:Lyl;

.field public q:Lyl;


# direct methods
.method public constructor <init>(LLF;LDF;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, LCF;-><init>(LLF;LCF;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, LDF;->o:Lyl;

    .line 7
    iput-object p1, p0, LDF;->p:Lyl;

    .line 8
    iput-object p1, p0, LDF;->q:Lyl;

    return-void
.end method

.method public constructor <init>(LLF;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LCF;-><init>(LLF;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LDF;->o:Lyl;

    .line 3
    iput-object p1, p0, LDF;->p:Lyl;

    .line 4
    iput-object p1, p0, LDF;->q:Lyl;

    return-void
.end method


# virtual methods
.method public h()Lyl;
    .locals 1

    iget-object v0, p0, LDF;->p:Lyl;

    if-nez v0, :cond_0

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LOE;->k(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lyl;->c(Landroid/graphics/Insets;)Lyl;

    move-result-object v0

    iput-object v0, p0, LDF;->p:Lyl;

    :cond_0
    iget-object v0, p0, LDF;->p:Lyl;

    return-object v0
.end method

.method public j()Lyl;
    .locals 1

    iget-object v0, p0, LDF;->o:Lyl;

    if-nez v0, :cond_0

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LOE;->n(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lyl;->c(Landroid/graphics/Insets;)Lyl;

    move-result-object v0

    iput-object v0, p0, LDF;->o:Lyl;

    :cond_0
    iget-object v0, p0, LDF;->o:Lyl;

    return-object v0
.end method

.method public l()Lyl;
    .locals 1

    iget-object v0, p0, LDF;->q:Lyl;

    if-nez v0, :cond_0

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LOE;->b(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lyl;->c(Landroid/graphics/Insets;)Lyl;

    move-result-object v0

    iput-object v0, p0, LDF;->q:Lyl;

    :cond_0
    iget-object v0, p0, LDF;->q:Lyl;

    return-object v0
.end method

.method public m(IIII)LLF;
    .locals 1

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, LOE;->f(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object p1

    return-object p1
.end method

.method public s(Lyl;)V
    .locals 0

    return-void
.end method
