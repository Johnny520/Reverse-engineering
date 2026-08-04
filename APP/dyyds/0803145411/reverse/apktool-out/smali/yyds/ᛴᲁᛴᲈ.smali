.class public final Lyyds/ᛴᲁᛴᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/ComponentCallbacks;


# instance fields
.field public ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 12

    .line 1
    iget v0, p0, Lyyds/ᛴᲁᛴᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iput p1, p0, Lyyds/ᛴᲁᛴᲈ;->ᲀᛲᛳᲀ:I

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛴᲁᛴᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lyyds/ᛴᛸᛵᲈ;

    .line 20
    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-boolean p1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 25
    .line 26
    if-nez p1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v1, p0, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛳᛴᛲᲀ;

    .line 30
    .line 31
    if-nez v1, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-object p0, v1, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 35
    .line 36
    if-nez p0, :cond_5

    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :cond_5
    iget p1, v1, Lyyds/ᛳᛴᛲᲀ;->ᛷᛲᲈᛱ:I

    .line 40
    .line 41
    iget v0, v1, Lyyds/ᛳᛴᛲᲀ;->ᛲᛳᛶᲁ:I

    .line 42
    .line 43
    sub-int/2addr p1, v0

    .line 44
    iget v0, v1, Lyyds/ᛳᛴᛲᲀ;->ᛷᛵᲇᲀ:I

    .line 45
    .line 46
    iget v2, v1, Lyyds/ᛳᛴᛲᲀ;->ᛷᲈᲈᲁ:I

    .line 47
    .line 48
    sub-int/2addr v0, v2

    .line 49
    invoke-virtual {v1}, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ()F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    int-to-float v3, p1

    .line 54
    cmpg-float v4, v3, v2

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 58
    .line 59
    const-wide/16 v8, 0x0

    .line 60
    .line 61
    if-gtz v4, :cond_6

    .line 62
    .line 63
    move-wide v3, v8

    .line 64
    goto :goto_5

    .line 65
    :cond_6
    iget v4, v1, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 66
    .line 67
    iget-object v10, v1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 68
    .line 69
    if-nez v10, :cond_7

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_7
    iget-object v10, v10, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 73
    .line 74
    if-nez v10, :cond_8

    .line 75
    .line 76
    :goto_1
    move v10, v5

    .line 77
    goto :goto_2

    .line 78
    :cond_8
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    :goto_2
    add-int/2addr v10, p1

    .line 83
    sub-int/2addr v4, v10

    .line 84
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    int-to-float p1, p1

    .line 89
    cmpg-float p1, p1, v2

    .line 90
    .line 91
    if-gez p1, :cond_9

    .line 92
    .line 93
    move-wide v3, v6

    .line 94
    goto :goto_5

    .line 95
    :cond_9
    iget-object p1, v1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 96
    .line 97
    if-nez p1, :cond_a

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_a
    iget-object p1, p1, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 101
    .line 102
    if-nez p1, :cond_b

    .line 103
    .line 104
    :goto_3
    move p1, v5

    .line 105
    goto :goto_4

    .line 106
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    :goto_4
    int-to-float p1, p1

    .line 111
    const/high16 v4, 0x40000000    # 2.0f

    .line 112
    .line 113
    div-float/2addr p1, v4

    .line 114
    add-float/2addr p1, v3

    .line 115
    float-to-double v3, p1

    .line 116
    iget p1, v1, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 117
    .line 118
    int-to-double v10, p1

    .line 119
    div-double/2addr v3, v10

    .line 120
    :goto_5
    int-to-float p1, v0

    .line 121
    cmpg-float p1, p1, v2

    .line 122
    .line 123
    if-gtz p1, :cond_c

    .line 124
    .line 125
    move-wide v6, v8

    .line 126
    goto :goto_9

    .line 127
    :cond_c
    iget p1, v1, Lyyds/ᛳᛴᛲᲀ;->ᛱᲈᲁ:I

    .line 128
    .line 129
    iget-object v8, v1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 130
    .line 131
    if-nez v8, :cond_d

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_d
    iget-object v8, v8, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 135
    .line 136
    if-nez v8, :cond_e

    .line 137
    .line 138
    :goto_6
    move v8, v5

    .line 139
    goto :goto_7

    .line 140
    :cond_e
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    :goto_7
    add-int/2addr v8, v0

    .line 145
    sub-int/2addr p1, v8

    .line 146
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    int-to-float p1, p1

    .line 151
    cmpg-float p1, p1, v2

    .line 152
    .line 153
    if-gez p1, :cond_f

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_f
    int-to-double v6, v0

    .line 157
    iget-object p1, v1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 158
    .line 159
    if-nez p1, :cond_10

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_10
    iget-object p1, p1, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 163
    .line 164
    if-nez p1, :cond_11

    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_11
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    :goto_8
    int-to-double v8, v5

    .line 172
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    .line 173
    .line 174
    div-double/2addr v8, v10

    .line 175
    add-double/2addr v8, v6

    .line 176
    iget p1, v1, Lyyds/ᛳᛴᛲᲀ;->ᛱᲈᲁ:I

    .line 177
    .line 178
    int-to-double v5, p1

    .line 179
    div-double v6, v8, v5

    .line 180
    .line 181
    :goto_9
    new-instance v0, Lyyds/ᛷᲈᛳᛲ;

    .line 182
    .line 183
    move-wide v2, v3

    .line 184
    move-wide v4, v6

    .line 185
    invoke-direct/range {v0 .. v5}, Lyyds/ᛷᲈᛳᛲ;-><init>(Lyyds/ᛳᛴᛲᲀ;DD)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    .line 1
    return-void
.end method
