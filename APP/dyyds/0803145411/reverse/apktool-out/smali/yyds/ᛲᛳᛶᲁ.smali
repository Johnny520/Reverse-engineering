.class public final Lyyds/ᛲᛳᛶᲁ;
.super Lyyds/ᛲᛵᲇᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᲀ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᲀᛵᛸ;

.field public final ᲇᲈᛵᛷ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lyyds/ᲈᲀᛲᲀ;Lyyds/ᛵᲀᛵᛸ;)V
    .locals 2

    .line 1
    const-wide v0, -0xbba5e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0xbbade68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lyyds/ᛲᛵᲇᛳ;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lyyds/ᛲᛳᛶᲁ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᲀ;

    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᛲᛳᛶᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲀᛵᛸ;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lyyds/ᛲᛳᛶᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Lyyds/ᛱᛸᛳᛵ;I)V
    .locals 12

    .line 1
    check-cast p1, Lyyds/ᛱᲈᲁ;

    .line 2
    .line 3
    const-wide v0, -0xbbdbe68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛲᛳᛶᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lyyds/ᛲᛴᛳᛲ;

    .line 18
    .line 19
    iget-object p2, p1, Lyyds/ᛱᲈᲁ;->ᛶᲈᛴᲈ:Lyyds/ᛲᛳᛶᲁ;

    .line 20
    .line 21
    const-wide v0, -0xd5bfe68a836eL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lyyds/ᛲᛴᛳᛲ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p1, Lyyds/ᛱᲈᲁ;->ᛳᛸᛴᛶ:Lyyds/ᛵᛶᲇ;

    .line 32
    .line 33
    iget-object v1, p1, Lyyds/ᛵᛶᲇ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v2, p1, Lyyds/ᛵᛶᲇ;->ᲇᲈᛵᛷ:Landroid/widget/TextView;

    .line 36
    .line 37
    iget-object v3, p1, Lyyds/ᛵᛶᲇ;->ᛱᲈᲁ:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object v4, p1, Lyyds/ᛵᛶᲇ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 40
    .line 41
    check-cast v4, Landroid/widget/Switch;

    .line 42
    .line 43
    iget-object v5, p0, Lyyds/ᛲᛴᛳᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p1, Lyyds/ᛵᛶᲇ;->ᛲᛳᛶᲁ:Landroid/widget/TextView;

    .line 49
    .line 50
    iget-object v5, p0, Lyyds/ᛲᛴᛳᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛸᛷᛱ;

    .line 51
    .line 52
    iget-object v5, v5, Lyyds/ᛸᛸᛷᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p1, Lyyds/ᛵᛶᲇ;->ᛶᛷᛲᲁ:Landroid/widget/TextView;

    .line 58
    .line 59
    iget-object v5, p0, Lyyds/ᛲᛴᛳᛲ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 60
    .line 61
    const/16 v6, 0xb4

    .line 62
    .line 63
    if-nez v5, :cond_0

    .line 64
    .line 65
    const-wide v7, -0xd5c5e68a836eL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const-wide v7, -0xd5cde68a836eL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {v6, v5}, Lyyds/ᛱᲈᲁ;->ᛵᛶᛲᲀ(ILjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    :goto_0
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lyyds/ᛲᛴᛳᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲈᛵᛷ;

    .line 96
    .line 97
    const/16 v5, 0x8

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    if-nez v1, :cond_1

    .line 101
    .line 102
    move v8, v5

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move v8, v7

    .line 105
    :goto_1
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    const/4 v8, 0x0

    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    new-instance v9, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    iget-boolean v10, v1, Lyyds/ᲇᲈᛵᛷ;->ᲇᲈᛵᛷ:Z

    .line 114
    .line 115
    if-eqz v10, :cond_2

    .line 116
    .line 117
    const-wide v10, -0xd5d1e68a836eL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    :goto_2
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    goto :goto_3

    .line 127
    :cond_2
    const-wide v10, -0xd5d4e68a836eL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :goto_3
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const v10, 0xff1a

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v10, v1, Lyyds/ᲇᲈᛵᛷ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v6, v10}, Lyyds/ᛱᲈᲁ;->ᛵᛶᛲᲀ(ILjava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    goto :goto_4

    .line 156
    :cond_3
    move-object v6, v8

    .line 157
    :goto_4
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v8}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 161
    .line 162
    .line 163
    if-nez v1, :cond_4

    .line 164
    .line 165
    move v3, v5

    .line 166
    goto :goto_5

    .line 167
    :cond_4
    move v3, v7

    .line 168
    :goto_5
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    if-eqz v1, :cond_5

    .line 172
    .line 173
    iget-boolean v3, v1, Lyyds/ᲇᲈᛵᛷ;->ᲇᲈᛵᛷ:Z

    .line 174
    .line 175
    const/4 v6, 0x1

    .line 176
    if-ne v3, v6, :cond_5

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_5
    move v6, v7

    .line 180
    :goto_6
    invoke-virtual {v4, v6}, Landroid/widget/Switch;->setChecked(Z)V

    .line 181
    .line 182
    .line 183
    if-nez v1, :cond_6

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_6
    new-instance v8, Lyyds/ᲇᲇᲇᛱ;

    .line 187
    .line 188
    invoke-direct {v8, p2, v7, p0}, Lyyds/ᲇᲇᲇᛱ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :goto_7
    invoke-virtual {v4, v8}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 192
    .line 193
    .line 194
    iget-boolean v1, p0, Lyyds/ᛲᛴᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 195
    .line 196
    if-eqz v1, :cond_7

    .line 197
    .line 198
    const-wide v3, -0xd5dce68a836eL

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    :goto_8
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    goto :goto_9

    .line 208
    :cond_7
    const-wide v3, -0xd5e4e68a836eL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    goto :goto_8

    .line 214
    :goto_9
    iget-object v3, p1, Lyyds/ᛵᛶᲇ;->ᲇᲇᲇᛱ:Landroid/widget/TextView;

    .line 215
    .line 216
    new-instance v4, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iget-object v1, p0, Lyyds/ᛲᛴᛳᛲ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 222
    .line 223
    if-eqz v1, :cond_8

    .line 224
    .line 225
    const-wide v8, -0xd5f0e68a836eL

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    :cond_8
    iget-object v1, p0, Lyyds/ᛲᛴᛳᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 241
    .line 242
    if-eqz v1, :cond_9

    .line 243
    .line 244
    const-wide v8, -0xd5f4e68a836eL

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const/16 v6, 0x50

    .line 257
    .line 258
    invoke-static {v6, v1}, Lyyds/ᛱᲈᲁ;->ᛵᛶᛲᲀ(ILjava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    :cond_9
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    if-eqz v0, :cond_b

    .line 273
    .line 274
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_a

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_a
    move v5, v7

    .line 282
    :cond_b
    :goto_a
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    .line 287
    .line 288
    iget-object p1, p1, Lyyds/ᛵᛶᲇ;->ᲀᛲᛳᲀ:Landroid/view/View;

    .line 289
    .line 290
    check-cast p1, Landroid/widget/LinearLayout;

    .line 291
    .line 292
    new-instance v0, Lyyds/ᛶᛷᛲᲁ;

    .line 293
    .line 294
    invoke-direct {v0, p2, v7, p0}, Lyyds/ᛶᛷᛲᲁ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 298
    .line 299
    .line 300
    return-void
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛳᛶᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᲇᲇᲇᛱ(Landroid/view/ViewGroup;I)Lyyds/ᛱᛸᛳᛵ;
    .locals 10

    .line 1
    const-wide v0, -0xbbc7e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const v0, 0x660c0072

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const p2, 0x66090017

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v3, v0

    .line 33
    check-cast v3, Landroid/widget/Switch;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const p2, 0x66090018

    .line 38
    .line 39
    .line 40
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v4, v0

    .line 45
    check-cast v4, Landroid/widget/TextView;

    .line 46
    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    const p2, 0x66090019

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v5, v0

    .line 57
    check-cast v5, Landroid/widget/TextView;

    .line 58
    .line 59
    if-eqz v5, :cond_0

    .line 60
    .line 61
    const p2, 0x6609001b

    .line 62
    .line 63
    .line 64
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v6, v0

    .line 69
    check-cast v6, Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    const p2, 0x6609001c

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v7, v0

    .line 81
    check-cast v7, Landroid/widget/TextView;

    .line 82
    .line 83
    if-eqz v7, :cond_0

    .line 84
    .line 85
    const p2, 0x6609001d

    .line 86
    .line 87
    .line 88
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v8, v0

    .line 93
    check-cast v8, Landroid/widget/TextView;

    .line 94
    .line 95
    if-eqz v8, :cond_0

    .line 96
    .line 97
    const p2, 0x6609001e

    .line 98
    .line 99
    .line 100
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-object v9, v0

    .line 105
    check-cast v9, Landroid/widget/TextView;

    .line 106
    .line 107
    if-eqz v9, :cond_0

    .line 108
    .line 109
    new-instance v1, Lyyds/ᛵᛶᲇ;

    .line 110
    .line 111
    move-object v2, p1

    .line 112
    check-cast v2, Landroid/widget/LinearLayout;

    .line 113
    .line 114
    invoke-direct/range {v1 .. v9}, Lyyds/ᛵᛶᲇ;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 115
    .line 116
    .line 117
    const-wide p1, -0xbbcee68a836eL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    sget-object p1, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Lyyds/ᲈᛷᛵᛷ;->ᛳᛸᛴᛶ(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    new-instance p1, Lyyds/ᛱᲈᲁ;

    .line 134
    .line 135
    invoke-direct {p1, p0, v1}, Lyyds/ᛱᲈᲁ;-><init>(Lyyds/ᛲᛳᛶᲁ;Lyyds/ᛵᛶᲇ;)V

    .line 136
    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const-wide p1, -0x63331e68a836eL

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛱᛳᲇ(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    return-object p0
.end method
