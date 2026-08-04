.class public final Lyyds/ᲁᲀᛷᲀ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛸᛳᛱ;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲁᲀᛷᲀ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᲀᛷᲀ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lyyds/ᲁᲀᛷᲀ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    sget-object v2, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᲁᲀᛷᲀ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lyyds/ᲁᲀᛷᲀ;->ᛱᲈᲁ:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide p0, -0xb824e68a836eL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v1, v5

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    :goto_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-boolean p1, v3, Lyyds/ᛱᛸᛳᛱ;->ᛶᲀᲈᲇ:Z

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-object p1, v3, Lyyds/ᛱᛸᛳᛱ;->ᛵᲀᛵᛸ:Landroid/media/MediaPlayer;

    .line 43
    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    :try_start_0
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-lez p1, :cond_3

    .line 61
    .line 62
    mul-int/lit8 v5, v0, 0x64

    .line 63
    .line 64
    div-int/2addr v5, p1

    .line 65
    iget-object p1, v3, Lyyds/ᛱᛸᛳᛱ;->ᛶᛸᲀᲁ:Landroid/widget/SeekBar;

    .line 66
    .line 67
    invoke-virtual {p1, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 68
    .line 69
    .line 70
    iget-object p1, v3, Lyyds/ᛱᛸᛳᛱ;->ᛵᲀᲈᛴ:Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-static {v0}, Lyyds/ᛱᛸᛳᛱ;->ᲇᲈᛵᛷ(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catch_0
    move-exception p1

    .line 81
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 82
    .line 83
    new-instance v5, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-wide v6, -0xb81be68a836eL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v0, p1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_1
    iput v4, p0, Lyyds/ᲁᲀᛷᲀ;->ᛱᲈᲁ:I

    .line 112
    .line 113
    const-wide/16 v5, 0x64

    .line 114
    .line 115
    invoke-static {v5, v6, p0}, Lyyds/ᛴᛸᛲ;->ᲀᛲᛳᲀ(JLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v2, :cond_2

    .line 120
    .line 121
    move-object v1, v2

    .line 122
    :cond_4
    :goto_2
    return-object v1

    .line 123
    :pswitch_0
    iget-object v0, v3, Lyyds/ᛱᛸᛳᛱ;->ᛳᲁᲁᲇ:Landroid/widget/Spinner;

    .line 124
    .line 125
    iget-object v6, v3, Lyyds/ᛱᛸᛳᛱ;->ᲈᲀᛲᲀ:Landroid/widget/TextView;

    .line 126
    .line 127
    iget v7, p0, Lyyds/ᲁᲀᛷᲀ;->ᛱᲈᲁ:I

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    if-eqz v7, :cond_6

    .line 131
    .line 132
    if-ne v7, v4, :cond_5

    .line 133
    .line 134
    :try_start_1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :catch_1
    move-exception p0

    .line 139
    goto/16 :goto_6

    .line 140
    .line 141
    :cond_5
    const-wide p0, -0x8897e68a836eL

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    move-object v1, v5

    .line 154
    goto/16 :goto_7

    .line 155
    .line 156
    :cond_6
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :try_start_2
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    sget-object p1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 163
    .line 164
    sget-object p1, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 165
    .line 166
    new-instance v7, Lyyds/ᛴᛵᛵᛸ;

    .line 167
    .line 168
    invoke-direct {v7, v3, v5, v8}, Lyyds/ᛴᛵᛵᛸ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 169
    .line 170
    .line 171
    iput v4, p0, Lyyds/ᲁᲀᛷᲀ;->ᛱᲈᲁ:I

    .line 172
    .line 173
    invoke-static {p1, v7, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-ne p1, v2, :cond_7

    .line 178
    .line 179
    move-object v1, v2

    .line 180
    goto/16 :goto_7

    .line 181
    .line 182
    :cond_7
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 183
    .line 184
    iput-object p1, v3, Lyyds/ᛱᛸᛳᛱ;->ᛲᛱᲁᛳ:Ljava/util/List;

    .line 185
    .line 186
    new-instance p0, Landroid/widget/ArrayAdapter;

    .line 187
    .line 188
    iget-object v2, v3, Lyyds/ᛱᛸᛳᛱ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 189
    .line 190
    const v3, 0x1090008

    .line 191
    .line 192
    .line 193
    invoke-direct {p0, v2, v3, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 194
    .line 195
    .line 196
    const v2, 0x1090009

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, p0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 203
    .line 204
    .line 205
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛷᛶᲁᛱ:Lyyds/ᛳᲀᛲ;

    .line 211
    .line 212
    sget-object v2, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 213
    .line 214
    const/16 v3, 0xc7

    .line 215
    .line 216
    aget-object v2, v2, v3

    .line 217
    .line 218
    invoke-virtual {p0, v2}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    check-cast p0, Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-lez v2, :cond_a

    .line 229
    .line 230
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_9

    .line 239
    .line 240
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Lyyds/ᲁᛸᲇᛲ;

    .line 245
    .line 246
    iget-object v2, v2, Lyyds/ᲁᛸᲇᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v2, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_8

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_9
    const/4 v8, -0x1

    .line 259
    :goto_5
    if-ltz v8, :cond_a

    .line 260
    .line 261
    invoke-virtual {v0, v8}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 262
    .line 263
    .line 264
    :cond_a
    const/16 p0, 0x8

    .line 265
    .line 266
    invoke-virtual {v6, p0}, Landroid/view/View;->setVisibility(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :goto_6
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 271
    .line 272
    const-wide v2, -0x8878e68a836eL

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    const-wide v2, -0x8881e68a836eL

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    .line 295
    .line 296
    new-instance p1, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    const-wide v2, -0x888ce68a836eL

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 322
    .line 323
    .line 324
    :goto_7
    return-object v1

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 1

    .line 1
    iget p1, p0, Lyyds/ᲁᲀᛷᲀ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᲀᛷᲀ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛸᛳᛱ;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lyyds/ᲁᲀᛷᲀ;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, Lyyds/ᲁᲀᛷᲀ;-><init>(Lyyds/ᛱᛸᛳᛱ;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lyyds/ᲁᲀᛷᲀ;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, Lyyds/ᲁᲀᛷᲀ;-><init>(Lyyds/ᛱᛸᛳᛱ;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲁᲀᛷᲀ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᲀᛷᲀ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᲁᲀᛷᲀ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᲁᲀᛷᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᲀᛷᲀ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᲁᲀᛷᲀ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᲁᲀᛷᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
