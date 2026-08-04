.class public final Lyyds/ᲇᛳᛱ;
.super Lyyds/ᛱᛱᲁᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᛲᲈᲈ:Landroid/view/View;

.field public final synthetic ᛷᛵᲇᲀ:I


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᲇᛳᛱ;->ᛷᛵᲇᲀ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲇᛳᛱ;->ᛲᛲᲈᲈ:Landroid/view/View;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lyyds/ᛱᛱᲁᛴ;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lyyds/ᛴᲇᛵᛸ;Lyyds/ᛴᲇᛵᛸ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᲇᛳᛱ;->ᛷᛵᲇᲀ:I

    .line 10
    iput-object p1, p0, Lyyds/ᲇᛳᛱ;->ᛲᛲᲈᲈ:Landroid/view/View;

    invoke-direct {p0, p2}, Lyyds/ᛱᛱᲁᛴ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ()Lyyds/ᛴᛸᛵ;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲇᛳᛱ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lyyds/ᲇᛳᛱ;->ᛲᛲᲈᲈ:Landroid/view/View;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lyyds/ᛴᲇᛵᛸ;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛴᲇᛵᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᛲᛸ;

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛶᛴᛲᛸ;->ᛶᲈᛴᲈ:Lyyds/ᛳᛷᛶᛵ;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᛸ;->ᛲᲈᲁ()Lyyds/ᲁᲇᲈᲈ;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    return-object v1

    .line 23
    :pswitch_0
    check-cast p0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 24
    .line 25
    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->ᛱᛳᲇ:Lyyds/ᲁᛸᛲᲈ;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    check-cast p0, Lyyds/ᛷᛶᛱᛸ;

    .line 30
    .line 31
    iget-object p0, p0, Lyyds/ᛷᛶᛱᛸ;->ᛲᲈᲁ:Lyyds/ᛶᛴᛲᛸ;

    .line 32
    .line 33
    iget-object p0, p0, Lyyds/ᛶᛴᛲᛸ;->ᛶᛸᲀᲁ:Lyyds/ᛳᛷᛶᛵ;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᛸ;->ᛲᲈᲁ()Lyyds/ᲁᲇᲈᲈ;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_1
    return-object v1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᲇᛳᛱ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lyyds/ᲇᛳᛱ;->ᛲᛲᲈᲈ:Landroid/view/View;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lyyds/ᛴᲇᛵᛸ;

    .line 10
    .line 11
    iget-object p0, v2, Lyyds/ᛴᲇᛵᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᛲᛸ;

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᛶᛴᛲᛸ;->ᛷᛵᲇᲀ()Z

    .line 14
    .line 15
    .line 16
    return v1

    .line 17
    :pswitch_0
    check-cast v2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 18
    .line 19
    iget-object v0, v2, Landroidx/appcompat/view/menu/ActionMenuItemView;->ᛷᛵᲇᲀ:Lyyds/ᛷᲀᲁᲈ;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v2, v2, Landroidx/appcompat/view/menu/ActionMenuItemView;->ᛲᛳᛶᲁ:Lyyds/ᛵᛷᛸᲈ;

    .line 24
    .line 25
    invoke-interface {v0, v2}, Lyyds/ᛷᲀᲁᲈ;->ᛲᲈᲁ(Lyyds/ᛵᛷᛸᲈ;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lyyds/ᲇᛳᛱ;->ᛵᛸᛸᛷ()Lyyds/ᛴᛸᛵ;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    invoke-interface {p0}, Lyyds/ᛴᛸᛵ;->ᛲᲈᲁ()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    :goto_0
    return v1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᲇᲈᛵᛷ()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲇᛳᛱ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lyyds/ᛱᛱᲁᛴ;->ᲇᲈᛵᛷ()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲇᛳᛱ;->ᛲᛲᲈᲈ:Landroid/view/View;

    .line 12
    .line 13
    check-cast p0, Lyyds/ᛴᲇᛵᛸ;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛴᲇᛵᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᛲᛸ;

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛶᛴᛲᛸ;->ᛵᲀᲈᛴ:Lyyds/ᲈᛵᛶᛲ;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛶᛴᛲᛸ;->ᲇᲇᲇᛱ()Z

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    :goto_0
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
