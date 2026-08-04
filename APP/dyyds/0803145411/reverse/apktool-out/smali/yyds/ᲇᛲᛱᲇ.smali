.class public final Lyyds/ᲇᛲᛱᲇ;
.super Lyyds/ᛱᛵᛱᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public final ᛶᲀᲈᲇ()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-interface {p0, v0}, Landroid/view/WindowInsetsController;->setSystemBarsBehavior(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᛸᛴᛵᛶ(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    move p1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-interface {p0, p1, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final ᲁᛶᛴᛸ(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/WindowInsetsController;

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    move p1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-interface {p0, p1, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
