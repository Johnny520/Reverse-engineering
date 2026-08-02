.class public Lre3;
.super Lqe3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public s:Lzz0;


# direct methods
.method public constructor <init>(Lcf3;Landroid/view/WindowInsets;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lqe3;-><init>(Lcf3;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lre3;->s:Lzz0;

    return-void
.end method

.method public constructor <init>(Lcf3;Lre3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lqe3;-><init>(Lcf3;Lqe3;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lre3;->s:Lzz0;

    .line 6
    .line 7
    iget-object p1, p2, Lre3;->s:Lzz0;

    .line 8
    .line 9
    iput-object p1, p0, Lre3;->s:Lzz0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b()Lcf3;
    .locals 1

    .line 1
    iget-object p0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p0}, Lcf3;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lcf3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public c()Lcf3;
    .locals 1

    .line 1
    iget-object p0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p0}, Lcf3;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lcf3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final l()Lzz0;
    .locals 4

    .line 1
    iget-object v0, p0, Lre3;->s:Lzz0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetTop()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetRight()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v1, v2, v3, v0}, Lzz0;->b(IIII)Lzz0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lre3;->s:Lzz0;

    .line 28
    .line 29
    :cond_0
    iget-object p0, p0, Lre3;->s:Lzz0;

    .line 30
    .line 31
    return-object p0
.end method

.method public s()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->isConsumed()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public z(Lzz0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lre3;->s:Lzz0;

    .line 2
    .line 3
    return-void
.end method
