.class public final Lyyds/ᛴᛸᲇᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛴᛸᲇᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛴᛸᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p2, p0, Lyyds/ᛴᛸᲇᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᛸᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ᛵᛶᛲᲀ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 11
    .line 12
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->ᛵᲀᛵᛸ:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 p4, 0x1

    .line 19
    if-le p3, p4, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->ᛳᛸᛴᛶ:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    new-instance p5, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {p5}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ(Landroid/view/View;)Z

    .line 41
    .line 42
    .line 43
    move-result p6

    .line 44
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView;->ᛲᲀᛵᛷ:Z

    .line 45
    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const p0, 0x66070029

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const p7, 0x6607002a

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, p7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    add-int/2addr p3, p0

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 p3, 0x0

    .line 65
    :goto_0
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, p5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 70
    .line 71
    .line 72
    iget p0, p5, Landroid/graphics/Rect;->left:I

    .line 73
    .line 74
    if-eqz p6, :cond_1

    .line 75
    .line 76
    neg-int p0, p0

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    add-int/2addr p0, p3

    .line 79
    sub-int p0, p4, p0

    .line 80
    .line 81
    :goto_1
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    iget p2, p5, Landroid/graphics/Rect;->left:I

    .line 89
    .line 90
    add-int/2addr p0, p2

    .line 91
    iget p2, p5, Landroid/graphics/Rect;->right:I

    .line 92
    .line 93
    add-int/2addr p0, p2

    .line 94
    add-int/2addr p0, p3

    .line 95
    sub-int/2addr p0, p4

    .line 96
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    return-void

    .line 100
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p0, Lyyds/ᛴᛱᛱ;

    .line 109
    .line 110
    iget-object p2, p0, Lyyds/ᛴᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p2, Lyyds/ᲁᛲᛱᛳ;

    .line 113
    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    sget p3, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛸᲀᲁ:I

    .line 117
    .line 118
    const/4 p3, 0x0

    .line 119
    invoke-static {p3, p1}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance p3, Lyyds/ᲇᲁᲈᛳ;

    .line 124
    .line 125
    iget-object p0, p0, Lyyds/ᛴᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Lyyds/ᲇᲁᲈᛳ;

    .line 128
    .line 129
    invoke-direct {p3, p0}, Lyyds/ᲇᲁᲈᛳ;-><init>(Lyyds/ᲇᲁᲈᛳ;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, p1, p3}, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᲈᛶᲈᛴ;Lyyds/ᲇᲁᲈᛳ;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    sget p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛸᲀᲁ:I

    .line 137
    .line 138
    :goto_2
    return-void

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
