.class public final Lef3;
.super Ldf3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldf3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 4
    .line 5
    invoke-static {p0}, Lce3;->c(Landroid/view/WindowInsetsController;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final b(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldf3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/16 p1, 0x10

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-static {p0, p1}, Lce3;->u(Landroid/view/WindowInsetsController;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldf3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/16 p1, 0x8

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-static {p0, p1}, Lce3;->w(Landroid/view/WindowInsetsController;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldf3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lce3;->o(Landroid/view/WindowInsetsController;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
