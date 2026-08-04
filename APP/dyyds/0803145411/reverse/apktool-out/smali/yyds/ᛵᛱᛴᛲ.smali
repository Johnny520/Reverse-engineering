.class public final Lyyds/ᛵᛱᛴᛲ;
.super Lyyds/ᛴᛴᛵᛸ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public final ᛱᛳᛶᛳ:Lyyds/ᛵᛷᛸᲈ;

.field public final ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;Lyyds/ᛵᛷᛸᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᛴᛴᛵᛸ;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 5
    .line 6
    iput-object p3, p0, Lyyds/ᛵᛱᛴᛲ;->ᛱᛳᛶᛳ:Lyyds/ᛵᛷᛸᲈ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getItem()Landroid/view/MenuItem;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛱᛳᛶᛳ:Lyyds/ᛵᛷᛸᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setGroupDividerEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛴᛴᛵᛸ;->setGroupDividerEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move v3, p1

    .line 11
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛴᛴᛵᛸ;->ᛶᲈᛴᲈ(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    return-object v0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 6

    .line 1
    const/4 v3, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v4, p1

    .line 7
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛴᛴᛵᛸ;->ᛶᲈᛴᲈ(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    .line 11
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛴᛴᛵᛸ;->ᛶᲈᛴᲈ(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    return-object v0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v2, p1

    .line 7
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛴᛴᛵᛸ;->ᛶᲈᛴᲈ(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 6

    .line 1
    const/4 v3, 0x0

    .line 2
    const/4 v4, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v5, p1

    .line 7
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛴᛴᛵᛸ;->ᛶᲈᛴᲈ(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 7
    iget-object v0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛱᛳᛶᛳ:Lyyds/ᛵᛷᛸᲈ;

    invoke-virtual {v0, p1}, Lyyds/ᛵᛷᛸᲈ;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛱᛳᛶᛳ:Lyyds/ᛵᛷᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lyyds/ᛵᛷᛸᲈ;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final setQwertyMode(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛴᛴᛵᛸ;->setQwertyMode(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛱᛳᲇ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᛴᛵᛸ;->ᛱᛳᲇ()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛲᛲᲈᲈ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᛴᛵᛸ;->ᛲᛲᲈᲈ()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛵᛸ;Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lyyds/ᛴᛴᛵᛸ;->ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛵᛸ;Landroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛴᛵᛸ;->ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛵᛸ;Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final ᛳᲁᲁᲇ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᛴᛵᛸ;->ᛳᲁᲁᲇ()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛷᛲᲈᛱ()Lyyds/ᛴᛴᛵᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᛴᛵᛸ;->ᛷᛲᲈᛱ()Lyyds/ᛴᛴᛵᛸ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛱᛳᛶᛳ:Lyyds/ᛵᛷᛸᲈ;

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛵᛷᛸᲈ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string v0, "android:menu:actionviewstates:"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᛵᛷᛸᲈ;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛴᛴᛵᛸ;->ᲇᲇᲇᛱ(Lyyds/ᛵᛷᛸᲈ;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛵᛷᛸᲈ;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛱᛴᛲ;->ᛷᛸᲇᛶ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛴᛴᛵᛸ;->ᲇᲈᛵᛷ(Lyyds/ᛵᛷᛸᲈ;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
