.class public Lyyds/ᲁᛵᛷᛲ;
.super Lyyds/ᲇᛷᛱᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final ᛱᛳᲇ:Lyyds/ᲈᲀᛴᛴ;

.field public ᛳᲁᲁᲇ:I

.field public ᛶᛳᛶᛵ:Z

.field public ᲇᛱᛲ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lyyds/ᲇᛷᛱᛵ;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛴᛶᛳᛸ;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lyyds/ᲈᲀᛴᛴ;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lyyds/ᲁᛵᛷᛲ;->ᛱᛳᲇ:Lyyds/ᲈᲀᛴᛴ;

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    iput v0, p0, Lyyds/ᲁᛵᛷᛲ;->ᛳᲁᲁᲇ:I

    .line 19
    .line 20
    new-instance v0, Lyyds/ᛱᛵᲈᲁ;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lyyds/ᛱᛵᲈᲁ;-><init>(Lyyds/ᲁᛵᛷᛲ;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lyyds/ᲁᛵᛷᛲ;->ᲇᛱᛲ:Z

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-static {p1}, Lyyds/ᲈᲇᲀᛲ;->ᲇᛱᛲ(I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v0, "onDismiss called for DialogFragment "

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "FragmentManager"

    .line 27
    .line 28
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲁᛵᛷᛲ;->ᛶᛷᛲᲁ()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lyyds/ᲁᛵᛷᛲ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᲁᛵᛷᛲ;->ᛶᛳᛶᛵ:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lyyds/ᲁᛵᛷᛲ;->ᲇᛱᛲ:Z

    .line 10
    .line 11
    iget v1, p0, Lyyds/ᲁᛵᛷᛲ;->ᛳᲁᲁᲇ:I

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    if-ltz v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᲇᛷᛱᛵ;->ᲇᲇᲇᛱ()Lyyds/ᲈᲇᲀᛲ;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, p0, Lyyds/ᲁᛵᛷᛲ;->ᛳᲁᲁᲇ:I

    .line 21
    .line 22
    if-ltz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lyyds/ᲈᲇᲀᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iput v2, p0, Lyyds/ᲁᛵᛷᛲ;->ᛳᲁᲁᲇ:I

    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0

    .line 36
    :cond_1
    const-string p0, "Bad id: "

    .line 37
    .line 38
    invoke-static {v1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-virtual {p0}, Lyyds/ᲇᛷᛱᛵ;->ᲇᲇᲇᛱ()Lyyds/ᲈᲇᲀᛲ;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v3, Lyyds/ᛸᛴᲀᛶ;

    .line 51
    .line 52
    invoke-direct {v3, v1}, Lyyds/ᛸᛴᲀᛶ;-><init>(Lyyds/ᲈᲇᲀᛲ;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lyyds/ᛲᛱᛸᲈ;

    .line 56
    .line 57
    const/4 v4, 0x3

    .line 58
    invoke-direct {v1, v4, p0}, Lyyds/ᛲᛱᛸᲈ;-><init>(ILyyds/ᲇᛷᛱᛵ;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, v3, Lyyds/ᛸᛴᲀᛶ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    iput p0, v1, Lyyds/ᛲᛱᛸᲈ;->ᲀᛲᛳᲀ:I

    .line 68
    .line 69
    iput p0, v1, Lyyds/ᛲᛱᛸᲈ;->ᲇᲈᛵᛷ:I

    .line 70
    .line 71
    iput p0, v1, Lyyds/ᛲᛱᛸᲈ;->ᛲᛴᛳᛲ:I

    .line 72
    .line 73
    iput p0, v1, Lyyds/ᛲᛱᛸᲈ;->ᲇᲇᲇᛱ:I

    .line 74
    .line 75
    iget-object v1, v3, Lyyds/ᛸᛴᲀᛶ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲇᲀᛲ;

    .line 76
    .line 77
    const-string v4, "FragmentManager"

    .line 78
    .line 79
    iget-boolean v5, v3, Lyyds/ᛸᛴᲀᛶ;->ᲀᛲᛳᲀ:Z

    .line 80
    .line 81
    if-nez v5, :cond_9

    .line 82
    .line 83
    const/4 v5, 0x2

    .line 84
    invoke-static {v5}, Lyyds/ᲈᲇᲀᛲ;->ᲇᛱᛲ(I)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_8

    .line 89
    .line 90
    new-instance v5, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v6, "Commit: "

    .line 93
    .line 94
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    new-instance v4, Lyyds/ᲇᲀᛵ;

    .line 108
    .line 109
    invoke-direct {v4}, Lyyds/ᲇᲀᛵ;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v5, Ljava/io/PrintWriter;

    .line 113
    .line 114
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 115
    .line 116
    .line 117
    const-string v4, "  "

    .line 118
    .line 119
    iget-object v6, v3, Lyyds/ᛸᛴᲀᛶ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v7, "mName="

    .line 125
    .line 126
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const-string v7, " mIndex="

    .line 134
    .line 135
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget v7, v3, Lyyds/ᛸᛴᲀᛶ;->ᲇᲈᛵᛷ:I

    .line 139
    .line 140
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(I)V

    .line 141
    .line 142
    .line 143
    const-string v7, " mCommitted="

    .line 144
    .line 145
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-boolean v7, v3, Lyyds/ᛸᛴᲀᛶ;->ᲀᛲᛳᲀ:Z

    .line 149
    .line 150
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->println(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-nez v7, :cond_7

    .line 158
    .line 159
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v7, "Operations:"

    .line 163
    .line 164
    invoke-virtual {v5, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    :goto_0
    if-ge p0, v7, :cond_7

    .line 172
    .line 173
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    check-cast v8, Lyyds/ᛲᛱᛸᲈ;

    .line 178
    .line 179
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᛲᲈᲁ:I

    .line 180
    .line 181
    packed-switch v9, :pswitch_data_0

    .line 182
    .line 183
    .line 184
    new-instance v9, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v10, "cmd="

    .line 187
    .line 188
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iget v10, v8, Lyyds/ᛲᛱᛸᲈ;->ᛲᲈᲁ:I

    .line 192
    .line 193
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    goto :goto_1

    .line 201
    :pswitch_0
    const-string v9, "OP_SET_MAX_LIFECYCLE"

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :pswitch_1
    const-string v9, "UNSET_PRIMARY_NAV"

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :pswitch_2
    const-string v9, "SET_PRIMARY_NAV"

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :pswitch_3
    const-string v9, "ATTACH"

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :pswitch_4
    const-string v9, "DETACH"

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :pswitch_5
    const-string v9, "SHOW"

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :pswitch_6
    const-string v9, "HIDE"

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :pswitch_7
    const-string v9, "REMOVE"

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :pswitch_8
    const-string v9, "REPLACE"

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :pswitch_9
    const-string v9, "ADD"

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :pswitch_a
    const-string v9, "NULL"

    .line 232
    .line 233
    :goto_1
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const-string v10, "  Op #"

    .line 237
    .line 238
    invoke-virtual {v5, v10}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, p0}, Ljava/io/PrintWriter;->print(I)V

    .line 242
    .line 243
    .line 244
    const-string v10, ": "

    .line 245
    .line 246
    invoke-virtual {v5, v10}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const-string v9, " "

    .line 253
    .line 254
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iget-object v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᛵᛸᛸᛷ:Lyyds/ᲇᛷᛱᛵ;

    .line 258
    .line 259
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᲀᛲᛳᲀ:I

    .line 263
    .line 264
    if-nez v9, :cond_3

    .line 265
    .line 266
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᲇᲈᛵᛷ:I

    .line 267
    .line 268
    if-eqz v9, :cond_4

    .line 269
    .line 270
    :cond_3
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    const-string v9, "enterAnim=#"

    .line 274
    .line 275
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᲀᛲᛳᲀ:I

    .line 279
    .line 280
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    const-string v9, " exitAnim=#"

    .line 288
    .line 289
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᲇᲈᛵᛷ:I

    .line 293
    .line 294
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    :cond_4
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᛲᛴᛳᛲ:I

    .line 302
    .line 303
    if-nez v9, :cond_5

    .line 304
    .line 305
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᲇᲇᲇᛱ:I

    .line 306
    .line 307
    if-eqz v9, :cond_6

    .line 308
    .line 309
    :cond_5
    invoke-virtual {v5, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    const-string v9, "popEnterAnim=#"

    .line 313
    .line 314
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    iget v9, v8, Lyyds/ᛲᛱᛸᲈ;->ᛲᛴᛳᛲ:I

    .line 318
    .line 319
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const-string v9, " popExitAnim=#"

    .line 327
    .line 328
    invoke-virtual {v5, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iget v8, v8, Lyyds/ᛲᛱᛸᲈ;->ᲇᲇᲇᛱ:I

    .line 332
    .line 333
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    invoke-virtual {v5, v8}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :cond_6
    add-int/lit8 p0, p0, 0x1

    .line 341
    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_7
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 345
    .line 346
    .line 347
    :cond_8
    iput-boolean v0, v3, Lyyds/ᛸᛴᲀᛶ;->ᲀᛲᛳᲀ:Z

    .line 348
    .line 349
    iput v2, v3, Lyyds/ᛸᛴᲀᛶ;->ᲇᲈᛵᛷ:I

    .line 350
    .line 351
    iget-object p0, v1, Lyyds/ᲈᲇᲀᛲ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast p0, Ljava/util/ArrayList;

    .line 354
    .line 355
    monitor-enter p0

    .line 356
    :try_start_2
    monitor-exit p0

    .line 357
    goto :goto_2

    .line 358
    :catchall_1
    move-exception v0

    .line 359
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 360
    throw v0

    .line 361
    :cond_9
    const-string p0, "commit already called"

    .line 362
    .line 363
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    :goto_2
    return-void

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
