.class public final Lxhss/ᲁᛳᛵᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

.field public final ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

.field public final ᛳᲈᲈᛲ:Landroid/widget/TextView;

.field public final synthetic ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

.field public ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛶᛷ;

.field public final ᛷᛵᛵᲈ:Ljava/util/ArrayList;

.field public final ᛷᲁᲁ:Landroid/view/View;

.field public final ᛸᛲᲀᛵ:Landroid/widget/EditText;

.field public final ᛸᛴᛶᛳ:Landroid/widget/RelativeLayout;

.field public final ᛸᛶᲈᛶ:Landroid/view/View;

.field public final ᛸᛷᲈᲈ:Landroid/widget/LinearLayout;

.field public final ᲀᲇᛳᲁ:Landroid/view/ViewGroup;

.field public final ᲇᛴᲇᛵ:Landroid/widget/TextView;

.field public final ᲇᛶᛴᲀ:Landroid/widget/TextView;

.field public final ᲇᛸᛳᲁ:Landroid/widget/TextView;

.field public final ᲈᛳᲀ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lxhss/ᛱᛴᛳᛴ;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    const v0, 0x64080051

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 24
    .line 25
    iput-object v0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 26
    .line 27
    const v1, 0x64080045

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 35
    .line 36
    iput-object v1, p0, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 37
    .line 38
    const v1, 0x64080122

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/widget/TextView;

    .line 46
    .line 47
    iput-object v1, p0, Lxhss/ᲁᛳᛵᛷ;->ᲇᛴᲇᛵ:Landroid/widget/TextView;

    .line 48
    .line 49
    const v2, 0x640800d7

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lxhss/ᛵᛳᛶᛷ;

    .line 57
    .line 58
    iput-object v2, p0, Lxhss/ᲁᛳᛵᛷ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛶᛷ;

    .line 59
    .line 60
    const v2, 0x64080121

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Landroid/widget/TextView;

    .line 68
    .line 69
    iput-object v2, p0, Lxhss/ᲁᛳᛵᛷ;->ᲇᛶᛴᲀ:Landroid/widget/TextView;

    .line 70
    .line 71
    const v3, 0x6408004f

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/view/ViewGroup;

    .line 79
    .line 80
    iput-object v3, p0, Lxhss/ᲁᛳᛵᛷ;->ᲀᲇᛳᲁ:Landroid/view/ViewGroup;

    .line 81
    .line 82
    const v3, 0x6408004c

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Landroid/widget/RelativeLayout;

    .line 90
    .line 91
    iput-object v3, p0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛴᛶᛳ:Landroid/widget/RelativeLayout;

    .line 92
    .line 93
    const v3, 0x64080129

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Landroid/widget/EditText;

    .line 101
    .line 102
    iput-object v3, p0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛲᲀᛵ:Landroid/widget/EditText;

    .line 103
    .line 104
    const v3, 0x6408004a

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Landroid/widget/LinearLayout;

    .line 112
    .line 113
    iput-object v3, p0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛷᲈᲈ:Landroid/widget/LinearLayout;

    .line 114
    .line 115
    const v3, 0x64080055

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Landroid/widget/TextView;

    .line 123
    .line 124
    iput-object v3, p0, Lxhss/ᲁᛳᛵᛷ;->ᲈᛳᲀ:Landroid/widget/TextView;

    .line 125
    .line 126
    const v4, 0x640800f2

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    iput-object v4, p0, Lxhss/ᲁᛳᛵᛷ;->ᛷᲁᲁ:Landroid/view/View;

    .line 134
    .line 135
    const-string v4, "split"

    .line 136
    .line 137
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iput-object v4, p0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛶᲈᛶ:Landroid/view/View;

    .line 142
    .line 143
    const v4, 0x64080054

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Landroid/widget/TextView;

    .line 151
    .line 152
    iput-object v4, p0, Lxhss/ᲁᛳᛵᛷ;->ᲇᛸᛳᲁ:Landroid/widget/TextView;

    .line 153
    .line 154
    const v5, 0x64080056

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    check-cast v5, Landroid/widget/TextView;

    .line 162
    .line 163
    iput-object v5, p0, Lxhss/ᲁᛳᛵᛷ;->ᛳᲈᲈᛲ:Landroid/widget/TextView;

    .line 164
    .line 165
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    iput-object p2, p0, Lxhss/ᲁᛳᛵᛷ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    const/4 v6, 0x0

    .line 176
    invoke-virtual {p2, v6}, Landroid/view/View;->setTranslationZ(F)V

    .line 177
    .line 178
    .line 179
    sget-object p2, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 180
    .line 181
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    const/4 v1, 0x1

    .line 186
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ(F)V

    .line 218
    .line 219
    .line 220
    iget-object p2, p1, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 221
    .line 222
    invoke-virtual {v0, p2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛴᲇᛵ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V

    .line 223
    .line 224
    .line 225
    new-instance p2, Lxhss/ᲀᲈᛵᛸ;

    .line 226
    .line 227
    invoke-direct {p2, v1, p0}, Lxhss/ᲀᲈᛵᛸ;-><init>(ILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    iput-object p2, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᛵᛸ;

    .line 231
    .line 232
    new-instance p2, Lxhss/ᲇᛵᛲᲁ;

    .line 233
    .line 234
    const/16 v2, 0xe

    .line 235
    .line 236
    invoke-direct {p2, v2, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iput-object p2, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛴᛶᛳ:Lxhss/ᛱᛱᲇᲁ;

    .line 240
    .line 241
    new-instance p2, Lxhss/ᲁᲇᲁᲀ;

    .line 242
    .line 243
    const/4 v0, 0x0

    .line 244
    invoke-direct {p2, p0, v0}, Lxhss/ᲁᲇᲁᲀ;-><init>(Lxhss/ᲁᛳᛵᛷ;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 248
    .line 249
    .line 250
    new-instance p2, Lxhss/ᲁᲇᲁᲀ;

    .line 251
    .line 252
    invoke-direct {p2, p0, v1}, Lxhss/ᲁᲇᲁᲀ;-><init>(Lxhss/ᲁᛳᛵᛷ;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 256
    .line 257
    .line 258
    new-instance p2, Lxhss/ᲁᲇᲁᲀ;

    .line 259
    .line 260
    const/4 v0, 0x2

    .line 261
    invoke-direct {p2, p0, v0}, Lxhss/ᲁᲇᲁᲀ;-><init>(Lxhss/ᲁᛳᛵᛷ;I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 265
    .line 266
    .line 267
    iput-object p0, p1, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 268
    .line 269
    invoke-virtual {p0}, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ()V

    .line 270
    .line 271
    .line 272
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Landroid/view/animation/Animation;)J
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    if-eqz p1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/animation/Animation;->getDuration()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p1}, Landroid/view/animation/Animation;->getDuration()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    const-wide/16 v0, 0x12c

    .line 34
    .line 35
    :goto_1
    iget-object p0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 36
    .line 37
    iget-wide p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ:J

    .line 38
    .line 39
    const-wide/16 v2, -0x1

    .line 40
    .line 41
    cmp-long v2, p0, v2

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    return-wide p0

    .line 46
    :cond_3
    return-wide v0
.end method

.method public final ᛳᲁᲇᛸ()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 4
    .line 5
    iget-object v2, v1, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 6
    .line 7
    iget-object v3, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 8
    .line 9
    iget-object v4, v0, Lxhss/ᲁᛳᛵᛷ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 10
    .line 11
    if-eqz v4, :cond_21

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    goto/16 :goto_a

    .line 20
    .line 21
    :cond_0
    iget-boolean v5, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 22
    .line 23
    iput-boolean v5, v4, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ:Z

    .line 24
    .line 25
    iget-object v5, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛸᛳᲁ:[I

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    aget v7, v5, v6

    .line 29
    .line 30
    const/4 v8, 0x1

    .line 31
    aget v9, v5, v8

    .line 32
    .line 33
    const/4 v10, 0x2

    .line 34
    aget v11, v5, v10

    .line 35
    .line 36
    const/4 v12, 0x3

    .line 37
    aget v5, v5, v12

    .line 38
    .line 39
    iget-object v13, v4, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

    .line 40
    .line 41
    aput v7, v13, v6

    .line 42
    .line 43
    aput v9, v13, v8

    .line 44
    .line 45
    aput v11, v13, v10

    .line 46
    .line 47
    aput v5, v13, v12

    .line 48
    .line 49
    sget-object v5, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 50
    .line 51
    iget-object v5, v0, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v6}, Landroid/view/View;->setMinimumWidth(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v6}, Landroid/view/View;->setMinimumHeight(I)V

    .line 60
    .line 61
    .line 62
    const-string v7, "dialogx_editbox"

    .line 63
    .line 64
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    iget-object v9, v0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛲᲀᛵ:Landroid/widget/EditText;

    .line 69
    .line 70
    if-nez v9, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v1, v9}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛲᛴᛴ(Landroid/widget/EditText;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9}, Landroid/view/View;->clearFocus()V

    .line 77
    .line 78
    .line 79
    :goto_0
    const/16 v11, 0x8

    .line 80
    .line 81
    if-eqz v7, :cond_2

    .line 82
    .line 83
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v8}, Landroid/view/View;->setClickable(Z)V

    .line 90
    .line 91
    .line 92
    iget v7, v1, Lxhss/ᛱᛴᛳᛴ;->ᛵᛲᲁᛶ:F

    .line 93
    .line 94
    const/high16 v13, -0x40800000    # -1.0f

    .line 95
    .line 96
    cmpl-float v7, v7, v13

    .line 97
    .line 98
    if-lez v7, :cond_4

    .line 99
    .line 100
    new-instance v7, Lxhss/ᛴᲈᛵᛶ;

    .line 101
    .line 102
    invoke-direct {v7, v8, v0}, Lxhss/ᛴᲈᛵᛶ;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v7}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v8}, Landroid/view/View;->setClipToOutline(Z)V

    .line 109
    .line 110
    .line 111
    iget-object v5, v0, Lxhss/ᲁᛳᛵᛷ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 112
    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-nez v7, :cond_3

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Landroid/view/View;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v0, Ljava/lang/ClassCastException;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_4
    :goto_1
    iget-object v5, v1, Lxhss/ᛱᛴᛳᛴ;->ᛲᛴᲇᛲ:Ljava/lang/String;

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    if-nez v5, :cond_5

    .line 145
    .line 146
    move-object v5, v7

    .line 147
    :cond_5
    iget-object v13, v0, Lxhss/ᲁᛳᛵᛷ;->ᲇᛴᲇᛵ:Landroid/widget/TextView;

    .line 148
    .line 149
    invoke-static {v13, v5}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    iget-object v5, v1, Lxhss/ᛱᛴᛳᛴ;->ᲁᲁᛴᲁ:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v14, v0, Lxhss/ᲁᛳᛵᛷ;->ᲇᛶᛴᲀ:Landroid/widget/TextView;

    .line 155
    .line 156
    invoke-static {v14, v5}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    iget-object v5, v1, Lxhss/ᛱᛴᛳᛴ;->ᛳᛸᛵᲀ:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v15, v0, Lxhss/ᲁᛳᛵᛷ;->ᛳᲈᲈᛲ:Landroid/widget/TextView;

    .line 162
    .line 163
    invoke-static {v15, v5}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    iget-object v5, v1, Lxhss/ᛱᛴᛳᛴ;->ᲁᛴᛴᛸ:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v8, v0, Lxhss/ᲁᛳᛵᛷ;->ᲇᛸᛳᲁ:Landroid/widget/TextView;

    .line 169
    .line 170
    invoke-static {v8, v5}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    iget-object v5, v0, Lxhss/ᲁᛳᛵᛷ;->ᲈᛳᲀ:Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-static {v5, v7}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    iget-object v9, v0, Lxhss/ᲁᛳᛵᛷ;->ᛷᲁᲁ:Landroid/view/View;

    .line 185
    .line 186
    if-eqz v9, :cond_6

    .line 187
    .line 188
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    :cond_6
    invoke-static {v13, v7}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v14, v7}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v15, v7}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v8, v7}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v5, v7}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 204
    .line 205
    .line 206
    iget-object v9, v0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛷᲈᲈ:Landroid/widget/LinearLayout;

    .line 207
    .line 208
    if-eqz v9, :cond_b

    .line 209
    .line 210
    if-eqz v8, :cond_7

    .line 211
    .line 212
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    if-eqz v13, :cond_9

    .line 217
    .line 218
    :cond_7
    if-eqz v5, :cond_8

    .line 219
    .line 220
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-eqz v13, :cond_9

    .line 225
    .line 226
    :cond_8
    if-eqz v15, :cond_a

    .line 227
    .line 228
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    if-nez v13, :cond_a

    .line 233
    .line 234
    :cond_9
    move v13, v6

    .line 235
    goto :goto_2

    .line 236
    :cond_a
    move v13, v11

    .line 237
    :goto_2
    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    .line 238
    .line 239
    .line 240
    :cond_b
    iget-object v13, v1, Lxhss/ᛱᛴᛳᛴ;->ᛳᛸᛵᲀ:Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v13}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛲᛴᲀᲈ(Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    iget-object v13, v1, Lxhss/ᛱᛴᛳᛴ;->ᲁᛴᛴᛸ:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v13}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛲᛴᲀᲈ(Ljava/lang/CharSequence;)Z

    .line 248
    .line 249
    .line 250
    iget-object v13, v0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛶᲈᛶ:Landroid/view/View;

    .line 251
    .line 252
    if-eqz v13, :cond_c

    .line 253
    .line 254
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v6}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ(I)I

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    invoke-virtual {v13, v14}, Landroid/view/View;->setBackgroundColor(I)V

    .line 265
    .line 266
    .line 267
    :cond_c
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    const/4 v13, 0x4

    .line 283
    const/4 v14, 0x1

    .line 284
    filled-new-array {v12, v13, v10, v14}, [I

    .line 285
    .line 286
    .line 287
    move-result-object v17

    .line 288
    move v7, v6

    .line 289
    :goto_3
    if-ge v7, v13, :cond_1a

    .line 290
    .line 291
    aget v6, v17, v7

    .line 292
    .line 293
    const v16, 0x6407007b

    .line 294
    .line 295
    .line 296
    const v18, 0x6407007a

    .line 297
    .line 298
    .line 299
    if-eq v6, v14, :cond_17

    .line 300
    .line 301
    if-eq v6, v10, :cond_15

    .line 302
    .line 303
    if-eq v6, v12, :cond_13

    .line 304
    .line 305
    const/4 v10, -0x1

    .line 306
    if-eq v6, v13, :cond_10

    .line 307
    .line 308
    const/4 v13, 0x5

    .line 309
    if-eq v6, v13, :cond_d

    .line 310
    .line 311
    goto/16 :goto_7

    .line 312
    .line 313
    :cond_d
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-lt v6, v14, :cond_19

    .line 318
    .line 319
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    sub-int/2addr v6, v14

    .line 324
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-ne v6, v11, :cond_e

    .line 333
    .line 334
    goto/16 :goto_7

    .line 335
    .line 336
    :cond_e
    new-instance v6, Landroid/view/View;

    .line 337
    .line 338
    iget-object v13, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 339
    .line 340
    if-nez v13, :cond_f

    .line 341
    .line 342
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    :cond_f
    invoke-direct {v6, v13}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 350
    .line 351
    .line 352
    move-result-object v13

    .line 353
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    const/4 v14, 0x0

    .line 360
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getColor(I)I

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    invoke-virtual {v6, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 365
    .line 366
    .line 367
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x1

    .line 373
    invoke-direct {v13, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v9, v6, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_7

    .line 380
    .line 381
    :cond_10
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-lt v6, v14, :cond_19

    .line 386
    .line 387
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    sub-int/2addr v6, v14

    .line 392
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    if-ne v6, v11, :cond_11

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_11
    new-instance v6, Landroid/widget/Space;

    .line 404
    .line 405
    iget-object v13, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 406
    .line 407
    if-nez v13, :cond_12

    .line 408
    .line 409
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 410
    .line 411
    .line 412
    move-result-object v13

    .line 413
    :cond_12
    invoke-direct {v6, v13}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 414
    .line 415
    .line 416
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 417
    .line 418
    const/4 v14, -0x2

    .line 419
    invoke-direct {v13, v10, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 420
    .line 421
    .line 422
    const/high16 v10, 0x3f800000    # 1.0f

    .line 423
    .line 424
    iput v10, v13, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 425
    .line 426
    invoke-virtual {v9, v6, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 427
    .line 428
    .line 429
    goto :goto_7

    .line 430
    :cond_13
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    if-eqz v6, :cond_14

    .line 444
    .line 445
    move/from16 v6, v18

    .line 446
    .line 447
    goto :goto_4

    .line 448
    :cond_14
    move/from16 v6, v16

    .line 449
    .line 450
    :goto_4
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 451
    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_15
    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 464
    .line 465
    .line 466
    move-result v6

    .line 467
    if-eqz v6, :cond_16

    .line 468
    .line 469
    move/from16 v6, v18

    .line 470
    .line 471
    goto :goto_5

    .line 472
    :cond_16
    move/from16 v6, v16

    .line 473
    .line 474
    :goto_5
    invoke-virtual {v8, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 475
    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_17
    invoke-virtual {v9, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-eqz v6, :cond_18

    .line 492
    .line 493
    move/from16 v6, v18

    .line 494
    .line 495
    goto :goto_6

    .line 496
    :cond_18
    move/from16 v6, v16

    .line 497
    .line 498
    :goto_6
    invoke-virtual {v15, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 499
    .line 500
    .line 501
    :cond_19
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    const/4 v10, 0x2

    .line 505
    const/4 v13, 0x4

    .line 506
    const/4 v14, 0x1

    .line 507
    goto/16 :goto_3

    .line 508
    .line 509
    :cond_1a
    iget-boolean v3, v1, Lxhss/ᛱᛴᛳᛴ;->ᲁᛴᲇᛲ:Z

    .line 510
    .line 511
    if-eqz v3, :cond_1c

    .line 512
    .line 513
    invoke-virtual {v1}, Lxhss/ᛱᛴᛳᛴ;->ᛱᲁᛳᛲ()Z

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    if-eqz v3, :cond_1b

    .line 518
    .line 519
    new-instance v3, Lxhss/ᲁᲇᲁᲀ;

    .line 520
    .line 521
    invoke-direct {v3, v0, v12}, Lxhss/ᲁᲇᲁᲀ;-><init>(Lxhss/ᲁᛳᛵᛷ;I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 525
    .line 526
    .line 527
    :goto_8
    const/4 v14, 0x0

    .line 528
    goto :goto_9

    .line 529
    :cond_1b
    const/4 v3, 0x0

    .line 530
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 531
    .line 532
    .line 533
    goto :goto_8

    .line 534
    :cond_1c
    const/4 v14, 0x0

    .line 535
    invoke-virtual {v4, v14}, Landroid/view/View;->setClickable(Z)V

    .line 536
    .line 537
    .line 538
    :goto_9
    iget-object v3, v1, Lxhss/ᛱᛴᛳᛴ;->ᲀᛷᲁᲀ:Lxhss/ᲁᛵᛷᛷ;

    .line 539
    .line 540
    iget-object v4, v0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛴᛶᛳ:Landroid/widget/RelativeLayout;

    .line 541
    .line 542
    if-eqz v3, :cond_20

    .line 543
    .line 544
    invoke-virtual {v3}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    if-eqz v3, :cond_20

    .line 549
    .line 550
    iget-object v3, v1, Lxhss/ᛱᛴᛳᛴ;->ᲀᛷᲁᲀ:Lxhss/ᲁᛵᛷᛷ;

    .line 551
    .line 552
    invoke-virtual {v3, v4, v2}, Lxhss/ᲁᛵᛷᛷ;->ᛷᛵᛵᲈ(Landroid/view/ViewGroup;Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v4, v14}, Landroid/view/View;->setVisibility(I)V

    .line 556
    .line 557
    .line 558
    iget-object v2, v1, Lxhss/ᛱᛴᛳᛴ;->ᲀᛷᲁᲀ:Lxhss/ᲁᛵᛷᛷ;

    .line 559
    .line 560
    invoke-virtual {v2}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    instance-of v2, v2, Lxhss/ᛵᛳᛶᛷ;

    .line 565
    .line 566
    if-eqz v2, :cond_1e

    .line 567
    .line 568
    iget-object v2, v0, Lxhss/ᲁᛳᛵᛷ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛶᛷ;

    .line 569
    .line 570
    instance-of v3, v2, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 571
    .line 572
    if-eqz v3, :cond_1d

    .line 573
    .line 574
    check-cast v2, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 575
    .line 576
    invoke-virtual {v2, v14}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 577
    .line 578
    .line 579
    :cond_1d
    iget-object v1, v1, Lxhss/ᛱᛴᛳᛴ;->ᲀᛷᲁᲀ:Lxhss/ᲁᛵᛷᛷ;

    .line 580
    .line 581
    invoke-virtual {v1}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    check-cast v1, Lxhss/ᛵᛳᛶᛷ;

    .line 586
    .line 587
    iput-object v1, v0, Lxhss/ᲁᛳᛵᛷ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛶᛷ;

    .line 588
    .line 589
    return-void

    .line 590
    :cond_1e
    iget-object v1, v1, Lxhss/ᛱᛴᛳᛴ;->ᲀᛷᲁᲀ:Lxhss/ᲁᛵᛷᛷ;

    .line 591
    .line 592
    invoke-virtual {v1}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    const-string v2, "ScrollController"

    .line 597
    .line 598
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    instance-of v2, v1, Lxhss/ᛵᛳᛶᛷ;

    .line 603
    .line 604
    if-eqz v2, :cond_21

    .line 605
    .line 606
    iget-object v2, v0, Lxhss/ᲁᛳᛵᛷ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛶᛷ;

    .line 607
    .line 608
    instance-of v3, v2, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 609
    .line 610
    if-eqz v3, :cond_1f

    .line 611
    .line 612
    check-cast v2, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 613
    .line 614
    const/4 v14, 0x0

    .line 615
    invoke-virtual {v2, v14}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 616
    .line 617
    .line 618
    :cond_1f
    check-cast v1, Lxhss/ᛵᛳᛶᛷ;

    .line 619
    .line 620
    iput-object v1, v0, Lxhss/ᲁᛳᛵᛷ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛶᛷ;

    .line 621
    .line 622
    return-void

    .line 623
    :cond_20
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 624
    .line 625
    .line 626
    :cond_21
    :goto_a
    return-void
.end method

.method public final ᛷᛵᛵᲈ(Landroid/view/View;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    :cond_0
    iget-object p1, p0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-boolean v0, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 17
    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    iget-object v0, p1, Lxhss/ᛱᛴᛳᛴ;->ᛲᛴᲀᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    new-instance v0, Lxhss/ᛶᲈᛴᛲ;

    .line 26
    .line 27
    invoke-direct {v0, v1, p0}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p1, Lxhss/ᛱᛴᛳᛴ;->ᛲᛴᲀᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 31
    .line 32
    :cond_2
    iput-boolean v1, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    new-instance v0, Lxhss/ᛶᲈᛴᛲ;

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p1, Lxhss/ᛱᛴᛳᛴ;->ᛲᛴᲀᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 42
    .line 43
    :cond_3
    invoke-virtual {v0, p1}, Lxhss/ᛶᲈᛴᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lxhss/ᛴᲈᲀᲇ;

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    invoke-direct {p1, v0, p0}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, v0}, Lxhss/ᲁᛳᛵᛷ;->ᛱᛱᛲᲇ(Landroid/view/animation/Animation;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-static {p1, v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛲᲁᛶ(Ljava/lang/Runnable;J)V

    .line 58
    .line 59
    .line 60
    :cond_4
    :goto_0
    return-void
.end method
