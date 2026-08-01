.class public final Lxhss/ᲀᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

.field public ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

.field public ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

.field public ᛷᛵᛵᲈ:Ljava/util/ArrayList;

.field public ᛸᛲᲀᛵ:F

.field public final ᛸᛴᛶᛳ:I

.field public final synthetic ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

.field public ᲀᲇᛳᲁ:Landroid/widget/TextView;

.field public ᲇᛴᲇᛵ:Landroid/widget/RelativeLayout;

.field public ᲇᛶᛴᲀ:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Lxhss/ᛳᛴᛵ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 5
    .line 6
    const/high16 v0, -0x40800000    # -1.0f

    .line 7
    .line 8
    iput v0, p0, Lxhss/ᲀᲀ;->ᛸᛲᲀᛵ:F

    .line 9
    .line 10
    invoke-virtual {p1}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const p1, 0x640b003d

    .line 30
    .line 31
    .line 32
    :goto_0
    iput p1, p0, Lxhss/ᲀᲀ;->ᛸᛴᛶᛳ:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Landroid/view/animation/Animation;)J
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/animation/Animation;->getDuration()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1}, Landroid/view/animation/Animation;->getDuration()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    const-wide/16 v0, 0x12c

    .line 36
    .line 37
    :goto_1
    iget-object p0, p0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 38
    .line 39
    iget-wide p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ:J

    .line 40
    .line 41
    const-wide/16 v2, -0x1

    .line 42
    .line 43
    cmp-long v2, p0, v2

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    return-wide p0

    .line 48
    :cond_3
    return-wide v0
.end method

.method public final ᛳᲁᲇᛸ()V
    .locals 11

    .line 1
    iget-object v0, p0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 6
    .line 7
    if-eqz v2, :cond_8

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 18
    .line 19
    iget-boolean v3, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 20
    .line 21
    iput-boolean v3, v2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ:Z

    .line 22
    .line 23
    iget-object v3, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛸᛳᲁ:[I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aget v5, v3, v4

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    aget v7, v3, v6

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    aget v9, v3, v8

    .line 33
    .line 34
    const/4 v10, 0x3

    .line 35
    aget v3, v3, v10

    .line 36
    .line 37
    iget-object v2, v2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

    .line 38
    .line 39
    aput v5, v2, v4

    .line 40
    .line 41
    aput v7, v2, v6

    .line 42
    .line 43
    aput v9, v2, v8

    .line 44
    .line 45
    aput v3, v2, v10

    .line 46
    .line 47
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 48
    .line 49
    sget-object v3, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setMinWidth(I)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setMinHeight(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const v2, 0x64050021

    .line 80
    .line 81
    .line 82
    const v3, 0x64050088

    .line 83
    .line 84
    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    move v2, v3

    .line 88
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᲀᲇᛳᲁ:Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iput v1, v2, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ:I

    .line 123
    .line 124
    iget-object v2, v2, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 125
    .line 126
    if-eqz v2, :cond_2

    .line 127
    .line 128
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 129
    .line 130
    .line 131
    :cond_2
    iget v1, v0, Lxhss/ᛳᛴᛵ;->ᲁᲁᛴᲁ:F

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    cmpl-float v2, v1, v2

    .line 135
    .line 136
    if-ltz v2, :cond_3

    .line 137
    .line 138
    const/high16 v2, 0x3f800000    # 1.0f

    .line 139
    .line 140
    cmpg-float v2, v1, v2

    .line 141
    .line 142
    if-gtz v2, :cond_3

    .line 143
    .line 144
    iget v2, p0, Lxhss/ᲀᲀ;->ᛸᛲᲀᛵ:F

    .line 145
    .line 146
    cmpl-float v2, v2, v1

    .line 147
    .line 148
    if-eqz v2, :cond_3

    .line 149
    .line 150
    iget-object v2, p0, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 151
    .line 152
    invoke-virtual {v2, v1}, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ(F)V

    .line 153
    .line 154
    .line 155
    iget v1, v0, Lxhss/ᛳᛴᛵ;->ᲁᲁᛴᲁ:F

    .line 156
    .line 157
    iput v1, p0, Lxhss/ᲀᲀ;->ᛸᛲᲀᛵ:F

    .line 158
    .line 159
    :cond_3
    iget v1, v0, Lxhss/ᛳᛴᛵ;->ᲀᛷᲁᲀ:F

    .line 160
    .line 161
    const/high16 v2, -0x40800000    # -1.0f

    .line 162
    .line 163
    cmpl-float v1, v1, v2

    .line 164
    .line 165
    if-lez v1, :cond_5

    .line 166
    .line 167
    iget-object v1, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 168
    .line 169
    new-instance v2, Lxhss/ᛴᲈᛵᛶ;

    .line 170
    .line 171
    invoke-direct {v2, v8, p0}, Lxhss/ᛴᲈᛵᛶ;-><init>(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 175
    .line 176
    .line 177
    iget-object v1, p0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 178
    .line 179
    invoke-virtual {v1, v6}, Landroid/view/View;->setClipToOutline(Z)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lxhss/ᲀᲀ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 183
    .line 184
    if-eqz v1, :cond_5

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-nez v2, :cond_4

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Landroid/view/View;

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    new-instance p0, Ljava/lang/ClassCastException;

    .line 207
    .line 208
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 209
    .line 210
    .line 211
    throw p0

    .line 212
    :cond_5
    :goto_0
    iget-object v1, p0, Lxhss/ᲀᲀ;->ᲀᲇᛳᲁ:Landroid/widget/TextView;

    .line 213
    .line 214
    iget-object v2, v0, Lxhss/ᛳᛴᛵ;->ᛲᛴᲀᲈ:Ljava/lang/String;

    .line 215
    .line 216
    const/4 v3, 0x0

    .line 217
    if-nez v2, :cond_6

    .line 218
    .line 219
    iget v2, v0, Lxhss/ᛳᛴᛵ;->ᛵᛷᛲᛸ:I

    .line 220
    .line 221
    invoke-static {v2}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 222
    .line 223
    .line 224
    move-object v2, v3

    .line 225
    :cond_6
    invoke-static {v1, v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    iget-object v1, p0, Lxhss/ᲀᲀ;->ᲀᲇᛳᲁ:Landroid/widget/TextView;

    .line 229
    .line 230
    invoke-static {v1, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 231
    .line 232
    .line 233
    iget-object v1, p0, Lxhss/ᲀᲀ;->ᲇᛶᛴᲀ:Landroid/widget/RelativeLayout;

    .line 234
    .line 235
    const/16 v2, 0x8

    .line 236
    .line 237
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, Lxhss/ᲀᲀ;->ᲇᛴᲇᛵ:Landroid/widget/RelativeLayout;

    .line 241
    .line 242
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    iget-boolean v0, v0, Lxhss/ᛳᛴᛵ;->ᲁᛴᲇᛲ:Z

    .line 246
    .line 247
    iget-object p0, p0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 248
    .line 249
    if-eqz v0, :cond_7

    .line 250
    .line 251
    invoke-virtual {p0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_7
    invoke-virtual {p0, v4}, Landroid/view/View;->setClickable(Z)V

    .line 256
    .line 257
    .line 258
    :cond_8
    :goto_1
    return-void
.end method

.method public final ᛷᛵᛵᲈ(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-boolean v0, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 25
    .line 26
    new-instance p1, Lxhss/ᲈᛱᛳᛲ;

    .line 27
    .line 28
    invoke-direct {p1, p0, v1}, Lxhss/ᲈᛱᛳᛲ;-><init>(Lxhss/ᲀᲀ;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    return-void
.end method
