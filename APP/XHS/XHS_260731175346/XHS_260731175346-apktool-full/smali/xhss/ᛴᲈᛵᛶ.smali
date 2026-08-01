.class public final Lxhss/ᛴᲈᛵᛶ;
.super Landroid/view/ViewOutlineProvider;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛴᲈᛵᛶ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛴᲈᛵᛶ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 13

    .line 1
    iget v0, p0, Lxhss/ᛴᲈᛵᛶ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛴᲈᛵᛶ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    check-cast p0, Lxhss/ᲀᲀ;

    .line 17
    .line 18
    iget-object p0, p0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 19
    .line 20
    iget v6, p0, Lxhss/ᛳᛴᛵ;->ᲀᛷᲁᲀ:F

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    move-object v1, p2

    .line 25
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    move-object v7, p2

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    check-cast p0, Lxhss/ᲁᛳᛵᛷ;

    .line 39
    .line 40
    iget-object p0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 41
    .line 42
    iget v12, p0, Lxhss/ᛱᛴᛳᛴ;->ᛵᛲᲁᛶ:F

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    move-object v7, p2

    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    int-to-float p1, p1

    .line 60
    check-cast p0, Lxhss/ᛲᛵᛶᲁ;

    .line 61
    .line 62
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 63
    .line 64
    iget v12, p0, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᛴᛸ:F

    .line 65
    .line 66
    add-float/2addr p1, v12

    .line 67
    float-to-int v11, p1

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
