.class public final synthetic Lyyds/ᛲᛲᛶᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᛵᲈᛴ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᛵᲈᛴ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛲᛲᛶᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛲᛲᛶᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛵᲈᛴ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget p1, p0, Lyyds/ᛲᛲᛶᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-wide/16 v0, 0x1

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛲᛲᛶᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛵᲈᛴ;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, Lyyds/ᛳᛳᲇᲀ;->ᛲᲈᲁ:Lyyds/ᛳᛳᲇᲀ;

    .line 11
    .line 12
    const-wide v2, -0x1ef73e68a836eL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    sget-object p1, Lyyds/ᛳᛳᲇᲀ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    aget-object p1, p1, v2

    .line 27
    .line 28
    monitor-enter p1

    .line 29
    :try_start_0
    sget-object v2, Lyyds/ᛳᛳᲇᲀ;->ᲇᲈᛵᛷ:[J

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    aget-wide v4, v2, v3

    .line 36
    .line 37
    add-long/2addr v4, v0

    .line 38
    aput-wide v4, v2, v3

    .line 39
    .line 40
    invoke-static {p0}, Lyyds/ᛳᛳᲇᲀ;->ᛲᛳᛶᲁ(Lyyds/ᛴᛵᲈᛴ;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    const-wide v1, -0x1ef78e68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {p0, v1}, Lyyds/ᛳᛳᲇᲀ;->ᛲᛲᲈᲈ(Lyyds/ᛴᛵᲈᛴ;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto :goto_3

    .line 65
    :cond_0
    :goto_0
    invoke-static {}, Lyyds/ᛳᛳᲇᲀ;->ᛱᲈᲁ()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {p0, v1}, Lyyds/ᛳᛳᲇᲀ;->ᛱᛳᲇ(Lyyds/ᛴᛵᲈᛴ;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    sget-object v1, Lyyds/ᛳᛳᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :try_start_1
    sget-object v2, Lyyds/ᛳᛳᲇᲀ;->ᛲᛴᛳᛲ:Ljava/util/EnumMap;

    .line 76
    .line 77
    invoke-virtual {v2, p0}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    sget-object v2, Lyyds/ᛳᛳᲇᲀ;->ᲇᲇᲇᛱ:Ljava/util/EnumMap;

    .line 81
    .line 82
    invoke-virtual {v2, p0}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    monitor-exit p1

    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    new-instance p1, Lyyds/ᛵᲇᛵᲇ;

    .line 93
    .line 94
    const/16 v1, 0x8

    .line 95
    .line 96
    invoke-direct {p1, v1, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    invoke-virtual {p1}, Lyyds/ᛵᲇᛵᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    sget-object v1, Lyyds/ᛳᛳᲇᲀ;->ᛲᛳᛶᲁ:Landroid/os/Handler;

    .line 118
    .line 119
    new-instance v2, Lyyds/ᛲᛳᛵᛱ;

    .line 120
    .line 121
    const/4 v3, 0x5

    .line 122
    invoke-direct {v2, v3, p1}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 126
    .line 127
    .line 128
    :cond_2
    :goto_1
    iget-object p0, p0, Lyyds/ᛴᛵᲈᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v0, :cond_3

    .line 131
    .line 132
    const-wide v0, -0x8e3ee68a836eL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_3
    const-wide v0, -0x8e44e68a836eL

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    :goto_2
    return-void

    .line 166
    :catchall_1
    move-exception p0

    .line 167
    :try_start_3
    monitor-exit v1

    .line 168
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 169
    :goto_3
    monitor-exit p1

    .line 170
    throw p0

    .line 171
    :pswitch_0
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-nez p1, :cond_4

    .line 176
    .line 177
    const-wide p0, -0x8dcce68a836eL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_4
    new-instance v2, Landroid/content/Intent;

    .line 191
    .line 192
    const-wide v3, -0x8dd4e68a836eL

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const-wide v3, -0x8df8e68a836eL

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 214
    .line 215
    .line 216
    const-wide v3, -0x8e19e68a836eL

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 226
    .line 227
    .line 228
    const/4 v3, 0x1

    .line 229
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 230
    .line 231
    .line 232
    :try_start_4
    sget-object v3, Lyyds/ᛳᛳᲇᲀ;->ᛲᲈᲁ:Lyyds/ᛳᛳᲇᲀ;

    .line 233
    .line 234
    const-wide v3, -0x1ef3ee68a836eL

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    sget-object v3, Lyyds/ᛳᛳᲇᲀ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    aget-object v3, v3, v4

    .line 249
    .line 250
    monitor-enter v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 251
    :try_start_5
    sget-object v4, Lyyds/ᛳᛳᲇᲀ;->ᲇᲈᛵᛷ:[J

    .line 252
    .line 253
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    aget-wide v6, v4, v5

    .line 258
    .line 259
    add-long/2addr v6, v0

    .line 260
    aput-wide v6, v4, v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 261
    .line 262
    :try_start_6
    monitor-exit v3

    .line 263
    iget p0, p0, Lyyds/ᛴᛵᲈᛴ;->ᲇᲈᛵᛷ:I

    .line 264
    .line 265
    invoke-virtual {p1, v2, p0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :catchall_2
    move-exception p0

    .line 270
    monitor-exit v3

    .line 271
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 272
    :catch_0
    move-exception p0

    .line 273
    const-wide v0, -0x8e21e68a836eL

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 286
    .line 287
    const-wide v0, -0x8e2be68a836eL

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    :goto_4
    return-void

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
