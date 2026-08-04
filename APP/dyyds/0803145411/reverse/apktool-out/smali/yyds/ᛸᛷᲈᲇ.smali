.class public final Lyyds/ᛸᛷᲈᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᲇᲇᛵᛲ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲇᲇᛵᛲ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛸᛷᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᛷᲈᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲇᛵᛲ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Landroid/view/View;)I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛸᛷᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 11
    .line 12
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᲈᲀᛲᲀ(Landroid/view/View;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 17
    .line 18
    :goto_0
    add-int/2addr p1, p0

    .line 19
    return p1

    .line 20
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 25
    .line 26
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛸᲇᛶ(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ(Landroid/view/View;)I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛸᛷᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 11
    .line 12
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᛶᛳ(Landroid/view/View;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 17
    .line 18
    :goto_0
    sub-int/2addr p1, p0

    .line 19
    return p1

    .line 20
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 25
    .line 26
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᛵᛸ(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲀᛲᛳᲀ()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛷᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᛷᲈᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲇᛵᛲ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    :goto_0
    sub-int/2addr v0, p0

    .line 15
    return v0

    .line 16
    :pswitch_0
    iget v0, p0, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲇᲈᛵᛷ()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛷᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᛷᲈᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲇᛵᛲ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
