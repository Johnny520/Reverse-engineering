.class public LvF;
.super LzF;
.source ""


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LzF;-><init>()V

    .line 2
    invoke-static {}, LOE;->c()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LLF;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LzF;-><init>(LLF;)V

    .line 4
    invoke-virtual {p1}, LLF;->g()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LOE;->d(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LOE;->c()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()LLF;
    .locals 3

    invoke-virtual {p0}, LzF;->a()V

    iget-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, LOE;->e(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v0

    iget-object v1, p0, LzF;->b:[Lyl;

    iget-object v2, v0, LLF;->a:LHF;

    invoke-virtual {v2, v1}, LHF;->p([Lyl;)V

    return-object v0
.end method

.method public d(Lyl;)V
    .locals 1

    iget-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lyl;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LOE;->q(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(Lyl;)V
    .locals 1

    iget-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lyl;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LOE;->m(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(Lyl;)V
    .locals 1

    iget-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lyl;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LOE;->p(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(Lyl;)V
    .locals 1

    iget-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lyl;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LOE;->j(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(Lyl;)V
    .locals 1

    iget-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lyl;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LOE;->r(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
