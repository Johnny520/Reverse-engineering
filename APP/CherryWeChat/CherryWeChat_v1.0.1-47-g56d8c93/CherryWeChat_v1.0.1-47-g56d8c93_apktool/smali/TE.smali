.class public LTE;
.super LOj;
.source ""


# static fields
.field public static p:Z = true

.field public static q:Z = true

.field public static r:Z = true

.field public static s:Z = true


# virtual methods
.method public R(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, LOj;->R(Landroid/view/View;I)V

    return-void

    :cond_0
    sget-boolean v0, LTE;->s:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, LSE;->a(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LTE;->s:Z

    :cond_1
    return-void
.end method

.method public Z(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, LTE;->r:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, LRE;->a(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LTE;->r:Z

    :cond_0
    return-void
.end method

.method public a0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, LTE;->p:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LQE;->b(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LTE;->p:Z

    :cond_0
    return-void
.end method

.method public b0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, LTE;->q:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LQE;->c(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LTE;->q:Z

    :cond_0
    return-void
.end method
