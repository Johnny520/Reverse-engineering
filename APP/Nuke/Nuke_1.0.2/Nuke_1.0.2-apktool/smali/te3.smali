.class public Lte3;
.super Lse3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public t:Lzz0;

.field public u:Lzz0;

.field public v:Lzz0;


# direct methods
.method public constructor <init>(Lcf3;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lse3;-><init>(Lcf3;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lte3;->t:Lzz0;

    .line 6
    .line 7
    iput-object p1, p0, Lte3;->u:Lzz0;

    .line 8
    .line 9
    iput-object p1, p0, Lte3;->v:Lzz0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lcf3;Lte3;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lse3;-><init>(Lcf3;Lse3;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lte3;->t:Lzz0;

    .line 14
    iput-object p1, p0, Lte3;->u:Lzz0;

    .line 15
    iput-object p1, p0, Lte3;->v:Lzz0;

    return-void
.end method


# virtual methods
.method public k()Lzz0;
    .locals 1

    .line 1
    iget-object v0, p0, Lte3;->u:Lzz0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lie3;->e(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lzz0;->c(Landroid/graphics/Insets;)Lzz0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lte3;->u:Lzz0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lte3;->u:Lzz0;

    .line 18
    .line 19
    return-object p0
.end method

.method public m()Lzz0;
    .locals 1

    .line 1
    iget-object v0, p0, Lte3;->t:Lzz0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lie3;->f(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lzz0;->c(Landroid/graphics/Insets;)Lzz0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lte3;->t:Lzz0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lte3;->t:Lzz0;

    .line 18
    .line 19
    return-object p0
.end method

.method public o()Lzz0;
    .locals 1

    .line 1
    iget-object v0, p0, Lte3;->v:Lzz0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lie3;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lzz0;->c(Landroid/graphics/Insets;)Lzz0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lte3;->v:Lzz0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lte3;->v:Lzz0;

    .line 18
    .line 19
    return-object p0
.end method

.method public r(IIII)Lcf3;
    .locals 0

    .line 1
    iget-object p0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lie3;->b(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p1, p0}, Lcf3;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lcf3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public z(Lzz0;)V
    .locals 0

    .line 1
    return-void
.end method
