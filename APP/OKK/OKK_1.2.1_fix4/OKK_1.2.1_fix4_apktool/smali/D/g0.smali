.class public LD/g0;
.super LD/i0;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LD/i0;-><init>()V

    .line 2
    invoke-static {}, LA0/B;->f()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LD/q0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LD/i0;-><init>(LD/q0;)V

    .line 4
    invoke-virtual {p1}, LD/q0;->c()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LA0/B;->g(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LA0/B;->f()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()LD/q0;
    .locals 3

    invoke-virtual {p0}, LD/i0;->a()V

    iget-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, LA0/B;->h(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LD/q0;->d(Landroid/view/View;Landroid/view/WindowInsets;)LD/q0;

    move-result-object v0

    iget-object v1, p0, LD/i0;->b:[Lv/c;

    iget-object v2, v0, LD/q0;->a:LD/o0;

    invoke-virtual {v2, v1}, LD/o0;->o([Lv/c;)V

    return-object v0
.end method

.method public d(Lv/c;)V
    .locals 1

    iget-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA0/B;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(Lv/c;)V
    .locals 1

    iget-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA0/B;->w(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(Lv/c;)V
    .locals 1

    iget-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA0/B;->A(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(Lv/c;)V
    .locals 1

    iget-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA0/B;->p(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(Lv/c;)V
    .locals 1

    iget-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lv/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA0/B;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
