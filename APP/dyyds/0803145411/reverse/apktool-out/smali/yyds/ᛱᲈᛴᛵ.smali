.class public final synthetic Lyyds/ᛱᲈᛴᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/view/KeyEvent$Callback;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;II)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛱᲈᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛱᲈᛴᛵ;->ᛲᛴᛳᛲ:Landroid/view/KeyEvent$Callback;

    .line 4
    .line 5
    iput p2, p0, Lyyds/ᛱᲈᛴᛵ;->ᲇᲈᛵᛷ:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛱᲈᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lyyds/ᛱᲈᛴᛵ;->ᲇᲈᛵᛷ:I

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛱᲈᛴᛵ;->ᛲᛴᛳᛲ:Landroid/view/KeyEvent$Callback;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 14
    .line 15
    sget-object v3, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 16
    .line 17
    if-ne v0, v3, :cond_a

    .line 18
    .line 19
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛸᛷᛱ:Lyyds/ᛱᛷᛲᲀ;

    .line 20
    .line 21
    invoke-virtual {v0}, Lyyds/ᛱᛷᛲᲀ;->ᛲᲈᲁ()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ge v2, v0, :cond_a

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_a

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    const-wide v4, -0xf89de68a836eL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-object v0, v3

    .line 55
    :cond_1
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    instance-of v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move-object v0, v3

    .line 67
    :goto_0
    if-nez v0, :cond_3

    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {v0, v1, v4, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲇᛸᛴᛱ(IIZ)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    const/4 v1, -0x1

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {v1}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    :goto_1
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᛶᛳᛶᛵ(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_5
    invoke-static {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛳᛴᛸ(Landroid/view/View;)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    sub-int/2addr v2, v1

    .line 99
    mul-int/2addr v4, v2

    .line 100
    invoke-static {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᛵᛸ(Landroid/view/View;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    add-int/2addr v0, v4

    .line 105
    iget-object v1, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 106
    .line 107
    if-nez v1, :cond_6

    .line 108
    .line 109
    const-wide v4, -0xf8aae68a836eL

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-object v1, v3

    .line 118
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    sub-int v5, v0, v1

    .line 123
    .line 124
    if-nez v5, :cond_7

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_7
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    mul-int/lit8 v0, v0, 0x78

    .line 132
    .line 133
    add-int/lit16 v0, v0, 0x28a

    .line 134
    .line 135
    const/16 v1, 0x5dc

    .line 136
    .line 137
    if-le v0, v1, :cond_8

    .line 138
    .line 139
    move v8, v1

    .line 140
    goto :goto_2

    .line 141
    :cond_8
    move v8, v0

    .line 142
    :goto_2
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 143
    .line 144
    if-nez p0, :cond_9

    .line 145
    .line 146
    const-wide v0, -0xf8b7e68a836eL

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-object v4, v3

    .line 155
    goto :goto_3

    .line 156
    :cond_9
    move-object v4, p0

    .line 157
    :goto_3
    new-instance v7, Landroid/view/animation/PathInterpolator;

    .line 158
    .line 159
    const p0, 0x3e4ccccd    # 0.2f

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const v1, 0x3ecccccd    # 0.4f

    .line 165
    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    invoke-direct {v7, v1, v2, p0, v0}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 169
    .line 170
    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v6, 0x0

    .line 173
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛵᲇᛲᛱ;->ᛴᛵᛷᛳ(IILandroid/view/animation/PathInterpolator;IZ)V

    .line 174
    .line 175
    .line 176
    :cond_a
    :goto_4
    return-void

    .line 177
    :pswitch_0
    check-cast p0, Lyyds/ᲀᛱᛷᲀ;

    .line 178
    .line 179
    iput-boolean v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲇᛲᛱ:Z

    .line 180
    .line 181
    if-nez v2, :cond_b

    .line 182
    .line 183
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 184
    .line 185
    iget-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 186
    .line 187
    invoke-virtual {p0, v0, v1}, Lyyds/ᲀᛱᛷᲀ;->ᛲᲈᲁ(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v0, "PixelCopy fallback failed: "

    .line 197
    .line 198
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    const-string v0, "BaseBlurView"

    .line 209
    .line 210
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    :goto_5
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
