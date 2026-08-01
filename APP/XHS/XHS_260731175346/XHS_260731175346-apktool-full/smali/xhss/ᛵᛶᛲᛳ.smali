.class public final Lxhss/ᛵᛶᛲᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:I

.field public final ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    iput p3, p0, Lxhss/ᛵᛶᛲᛳ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string p3, "initCallbacks cannot be null"

    .line 8
    .line 9
    invoke-static {p1, p3}, Lxhss/ᛱᛷᛵᛷ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lxhss/ᛵᛶᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 18
    .line 19
    iput p2, p0, Lxhss/ᛵᛶᛲᛳ;->ᛳᲁᲇᛸ:I

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lxhss/ᲀᲀ;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxhss/ᛵᛶᛲᛳ;->ᛱᛱᛲᲇ:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxhss/ᛵᛶᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    iput p2, p0, Lxhss/ᛵᛶᛲᛳ;->ᛳᲁᲇᛸ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lxhss/ᛵᛶᛲᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget v1, p0, Lxhss/ᛵᛶᛲᛳ;->ᛳᲁᲇᛸ:I

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᛵᛶᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Lxhss/ᲀᲀ;

    .line 13
    .line 14
    iget-object v0, v2, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 15
    .line 16
    invoke-static {v1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    iput v5, v0, Lxhss/ᛳᛴᛵ;->ᛳᛸᛵᲀ:I

    .line 21
    .line 22
    iget-object v5, v2, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    invoke-static {v1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_b

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    const/4 v6, 0x2

    .line 36
    const/high16 v7, 0x3f800000    # 1.0f

    .line 37
    .line 38
    if-eq v1, v4, :cond_7

    .line 39
    .line 40
    const/4 v8, 0x3

    .line 41
    const/high16 v9, 0x40000000    # 2.0f

    .line 42
    .line 43
    if-eq v1, v6, :cond_4

    .line 44
    .line 45
    if-eq v1, v8, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v1, v2, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 49
    .line 50
    iget v6, v1, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 51
    .line 52
    if-ne v6, v8, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    if-ne v6, v5, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1, v7}, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ(F)V

    .line 58
    .line 59
    .line 60
    new-instance v6, Lxhss/ᲈᛵᛲᲁ;

    .line 61
    .line 62
    invoke-direct {v6, v1, v5}, Lxhss/ᲈᛵᛲᲁ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 63
    .line 64
    .line 65
    iput-object v6, v1, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    new-instance v5, Landroid/view/animation/DecelerateInterpolator;

    .line 69
    .line 70
    invoke-direct {v5, v9}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v8, v5}, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    iget-object v1, v2, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 78
    .line 79
    iget v10, v1, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 80
    .line 81
    if-ne v10, v6, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    if-ne v10, v5, :cond_6

    .line 85
    .line 86
    invoke-virtual {v1, v7}, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ(F)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Lxhss/ᲈᛵᛲᲁ;

    .line 90
    .line 91
    invoke-direct {v5, v1, v8}, Lxhss/ᲈᛵᛲᲁ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 92
    .line 93
    .line 94
    iput-object v5, v1, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_6
    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    .line 98
    .line 99
    invoke-direct {v5, v9}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v6, v5}, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    iget-object v1, v2, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 107
    .line 108
    iget v8, v1, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 109
    .line 110
    if-ne v8, v4, :cond_8

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_8
    if-ne v8, v5, :cond_9

    .line 114
    .line 115
    invoke-virtual {v1, v7}, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ(F)V

    .line 116
    .line 117
    .line 118
    new-instance v5, Lxhss/ᲈᛵᛲᲁ;

    .line 119
    .line 120
    invoke-direct {v5, v1, v6}, Lxhss/ᲈᛵᛲᲁ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 121
    .line 122
    .line 123
    iput-object v5, v1, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_9
    new-instance v5, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 127
    .line 128
    invoke-direct {v5}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v4, v5}, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V

    .line 132
    .line 133
    .line 134
    :goto_0
    iget-object v1, v2, Lxhss/ᲀᲀ;->ᲇᛴᲇᛵ:Landroid/widget/RelativeLayout;

    .line 135
    .line 136
    if-eqz v1, :cond_a

    .line 137
    .line 138
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_a

    .line 143
    .line 144
    iget-object v0, v2, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 145
    .line 146
    new-instance v1, Lxhss/ᛷᛸᲇᛸ;

    .line 147
    .line 148
    invoke-direct {v1, p0, v3}, Lxhss/ᛷᛸᲇᛸ;-><init>(Lxhss/ᛵᛶᛲᛳ;I)V

    .line 149
    .line 150
    .line 151
    iput-object v1, v0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲇᛲ:Lxhss/ᛷᛸᲇᛸ;

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_a
    new-instance v1, Lxhss/ᲁᛲᛸᛴ;

    .line 155
    .line 156
    invoke-direct {v1}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lxhss/ᲁᛲᛸᛴ;->ᛳᲁᲇᛸ()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ()V

    .line 163
    .line 164
    .line 165
    iget-wide v0, v0, Lxhss/ᛳᛴᛵ;->ᛲᛴᲇᛲ:J

    .line 166
    .line 167
    const-wide/16 v2, 0x0

    .line 168
    .line 169
    cmp-long v2, v0, v2

    .line 170
    .line 171
    if-lez v2, :cond_f

    .line 172
    .line 173
    new-instance v2, Lxhss/ᛷᛸᲇᛸ;

    .line 174
    .line 175
    invoke-direct {v2, p0, v4}, Lxhss/ᛷᛸᲇᛸ;-><init>(Lxhss/ᛵᛶᛲᛳ;I)V

    .line 176
    .line 177
    .line 178
    invoke-static {v2, v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛲᲁᛶ(Ljava/lang/Runnable;J)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_b
    iget-object p0, v2, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 183
    .line 184
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 185
    .line 186
    if-nez v0, :cond_c

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_c
    iput-boolean v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᲁᛴᲁ:Z

    .line 190
    .line 191
    iput v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 192
    .line 193
    iput v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛲᛴᛴ:I

    .line 194
    .line 195
    iput v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛲᛵᲁ:I

    .line 196
    .line 197
    iput v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 198
    .line 199
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 200
    .line 201
    if-eqz v0, :cond_d

    .line 202
    .line 203
    iput-boolean v3, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 204
    .line 205
    :cond_d
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛱᛲᛶ;

    .line 206
    .line 207
    if-eqz v0, :cond_e

    .line 208
    .line 209
    iput-boolean v3, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 210
    .line 211
    :cond_e
    iput-boolean v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᲁᲁ:Z

    .line 212
    .line 213
    invoke-virtual {p0}, Lxhss/ᛵᛲᲇᛴ;->ᛱᛱᛲᲇ()V

    .line 214
    .line 215
    .line 216
    :cond_f
    :goto_1
    return-void

    .line 217
    :pswitch_0
    check-cast v2, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eq v1, v4, :cond_10

    .line 224
    .line 225
    :goto_2
    if-ge v3, p0, :cond_11

    .line 226
    .line 227
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Lxhss/ᛳᛱᛲᲈ;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    add-int/lit8 v3, v3, 0x1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_10
    :goto_3
    if-ge v3, p0, :cond_11

    .line 240
    .line 241
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Lxhss/ᛳᛱᛲᲈ;

    .line 246
    .line 247
    invoke-virtual {v0}, Lxhss/ᛳᛱᛲᲈ;->ᛷᛵᛵᲈ()V

    .line 248
    .line 249
    .line 250
    add-int/lit8 v3, v3, 0x1

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_11
    return-void

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
