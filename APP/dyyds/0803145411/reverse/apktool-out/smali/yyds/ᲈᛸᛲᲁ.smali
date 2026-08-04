.class public final Lyyds/ᲈᛸᛲᲁ;
.super Lyyds/ᛱᛸᛳᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛳᛸᛴᛶ:Landroid/widget/TextView;

.field public final ᛶᲈᛴᲈ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    const-wide v0, -0xa416e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0xa41fe68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0xa425e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Lyyds/ᛱᛸᛳᛵ;-><init>(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lyyds/ᲈᛸᛲᲁ;->ᛳᛸᛴᛶ:Landroid/widget/TextView;

    .line 29
    .line 30
    iput-object p3, p0, Lyyds/ᲈᛸᛲᲁ;->ᛶᲈᛴᲈ:Landroid/widget/TextView;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final ᛵᛶᛲᲀ(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛸᛲᲁ;->ᛶᲈᛴᲈ:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-wide v1, -0xa432e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const-wide v1, -0xa435e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const v1, 0x66060098

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    const v1, 0x66060102

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_2
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x10

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    const p1, 0x66060087

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/content/Context;->getColor(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-static {v1}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 65
    .line 66
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 73
    .line 74
    .line 75
    int-to-float p1, v0

    .line 76
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_2
    const p1, 0x6606010f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroid/content/Context;->getColor(I)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {v1}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const v3, 0x66060075

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Landroid/content/Context;->getColor(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 99
    .line 100
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 107
    .line 108
    .line 109
    int-to-float p1, v1

    .line 110
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    invoke-virtual {v3, p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 115
    .line 116
    .line 117
    move-object v1, v3

    .line 118
    :goto_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method
