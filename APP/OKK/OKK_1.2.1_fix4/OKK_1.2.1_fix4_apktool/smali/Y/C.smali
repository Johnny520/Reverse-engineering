.class public LY/C;
.super LU/S;
.source "SourceFile"


# static fields
.field public static A:Z = true

.field public static B:Z = true

.field public static C:Z = true

.field public static z:Z = true


# virtual methods
.method public A0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, LY/C;->A:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LY/z;->c(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LY/C;->A:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public l0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, LU/S;->l0(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    sget-boolean v0, LY/C;->C:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, LY/B;->a(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LY/C;->C:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public y0(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, LY/C;->B:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, LY/A;->a(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LY/C;->B:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public z0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, LY/C;->z:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LY/z;->b(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LY/C;->z:Z

    :cond_0
    :goto_0
    return-void
.end method
