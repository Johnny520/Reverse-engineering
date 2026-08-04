.class public final Lyyds/ᛲᲇᲁᲁ;
.super Lyyds/ᲁᲈᛳᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛲᲇᲁᲁ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛲᲇᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ(Lyyds/ᛵᲇᛲᛱ;II)V
    .locals 7

    .line 1
    iget p2, p0, Lyyds/ᛲᲇᲁᲁ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛲᲇᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyyds/ᛶᛱᲁᲀ;

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᛶᛱᲁᲀ;->run()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lyyds/ᲈᲇᛲᛶ;

    .line 15
    .line 16
    invoke-virtual {p1}, Lyyds/ᛵᲇᛲᛱ;->computeHorizontalScrollOffset()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p1}, Lyyds/ᛵᲇᛲᛱ;->computeVerticalScrollOffset()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget p3, p0, Lyyds/ᲈᲇᛲᛶ;->ᛲᲈᲁ:I

    .line 25
    .line 26
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛶ;->ᲀᛲᛲᲇ:Lyyds/ᛵᲇᛲᛱ;

    .line 27
    .line 28
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->computeVerticalScrollRange()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛵᛶᛲᲀ:I

    .line 33
    .line 34
    sub-int v2, v0, v1

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x1

    .line 38
    if-lez v2, :cond_0

    .line 39
    .line 40
    if-lt v1, p3, :cond_0

    .line 41
    .line 42
    move v2, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v2, v3

    .line 45
    :goto_0
    iput-boolean v2, p0, Lyyds/ᲈᲇᛲᛶ;->ᛳᛸᛴᛶ:Z

    .line 46
    .line 47
    iget-object v2, p0, Lyyds/ᲈᲇᛲᛶ;->ᲀᛲᛲᲇ:Lyyds/ᛵᲇᛲᛱ;

    .line 48
    .line 49
    invoke-virtual {v2}, Lyyds/ᛵᲇᛲᛱ;->computeHorizontalScrollRange()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget v5, p0, Lyyds/ᲈᲇᛲᛶ;->ᛶᛳᛶᛵ:I

    .line 54
    .line 55
    sub-int v6, v2, v5

    .line 56
    .line 57
    if-lez v6, :cond_1

    .line 58
    .line 59
    if-lt v5, p3, :cond_1

    .line 60
    .line 61
    move p3, v4

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move p3, v3

    .line 64
    :goto_1
    iput-boolean p3, p0, Lyyds/ᲈᲇᛲᛶ;->ᛶᲈᛴᲈ:Z

    .line 65
    .line 66
    iget-boolean v6, p0, Lyyds/ᲈᲇᛲᛶ;->ᛳᛸᛴᛶ:Z

    .line 67
    .line 68
    if-nez v6, :cond_2

    .line 69
    .line 70
    if-nez p3, :cond_2

    .line 71
    .line 72
    iget p1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛶᛸᲀᲁ:I

    .line 73
    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    invoke-virtual {p0, v3}, Lyyds/ᲈᲇᛲᛶ;->ᛷᲈᲈᲁ(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/high16 p3, 0x40000000    # 2.0f

    .line 81
    .line 82
    if-eqz v6, :cond_3

    .line 83
    .line 84
    int-to-float p1, p1

    .line 85
    int-to-float v3, v1

    .line 86
    div-float v6, v3, p3

    .line 87
    .line 88
    add-float/2addr v6, p1

    .line 89
    mul-float/2addr v6, v3

    .line 90
    int-to-float p1, v0

    .line 91
    div-float/2addr v6, p1

    .line 92
    float-to-int p1, v6

    .line 93
    iput p1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛷᛵᲇᲀ:I

    .line 94
    .line 95
    mul-int p1, v1, v1

    .line 96
    .line 97
    div-int/2addr p1, v0

    .line 98
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput p1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛷᛲᲈᛱ:I

    .line 103
    .line 104
    :cond_3
    iget-boolean p1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛶᲈᛴᲈ:Z

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    int-to-float p1, p2

    .line 109
    int-to-float p2, v5

    .line 110
    div-float p3, p2, p3

    .line 111
    .line 112
    add-float/2addr p3, p1

    .line 113
    mul-float/2addr p3, p2

    .line 114
    int-to-float p1, v2

    .line 115
    div-float/2addr p3, p1

    .line 116
    float-to-int p1, p3

    .line 117
    iput p1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛳᲁᲁᲇ:I

    .line 118
    .line 119
    mul-int p1, v5, v5

    .line 120
    .line 121
    div-int/2addr p1, v2

    .line 122
    invoke-static {v5, p1}, Ljava/lang/Math;->min(II)I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    iput p1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛱᛳᲇ:I

    .line 127
    .line 128
    :cond_4
    iget p1, p0, Lyyds/ᲈᲇᛲᛶ;->ᛶᛸᲀᲁ:I

    .line 129
    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    if-ne p1, v4, :cond_6

    .line 133
    .line 134
    :cond_5
    invoke-virtual {p0, v4}, Lyyds/ᲈᲇᛲᛶ;->ᛷᲈᲈᲁ(I)V

    .line 135
    .line 136
    .line 137
    :cond_6
    :goto_2
    return-void

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
