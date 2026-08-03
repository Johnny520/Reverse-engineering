.class public La/nh$c;
.super La/nh$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/nh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/nh$e;-><init>()V

    .line 2
    invoke-static {}, La/E;->f()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(La/nh;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, La/nh$e;-><init>(La/nh;)V

    .line 4
    invoke-virtual {p1}, La/nh;->f()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, La/oh;->b(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, La/E;->f()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()La/nh;
    .locals 3

    invoke-virtual {p0}, La/nh$e;->a()V

    iget-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, La/E;->g(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, La/nh;->g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;

    move-result-object v0

    iget-object v1, p0, La/nh$e;->b:[La/a9;

    iget-object v2, v0, La/nh;->a:La/nh$k;

    invoke-virtual {v2, v1}, La/nh$k;->o([La/a9;)V

    return-object v0
.end method

.method public d(La/a9;)V
    .locals 1

    iget-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, La/E;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(La/a9;)V
    .locals 1

    iget-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, La/E;->u(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(La/a9;)V
    .locals 1

    iget-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, La/E;->z(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(La/a9;)V
    .locals 1

    iget-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, La/E;->n(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(La/a9;)V
    .locals 1

    iget-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, La/E;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
