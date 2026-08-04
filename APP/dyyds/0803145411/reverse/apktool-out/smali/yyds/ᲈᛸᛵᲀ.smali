.class public final Lyyds/ᲈᛸᛵᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᲈᛸᛵᲀ;

.field public static final ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛵᲀ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲈᛸᛵᲀ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᲈᛸᛵᲀ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᲈᛸᛵᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛸᛵᲀ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᲈᛸᛵᲀ;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᲈᛸᛵᲀ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᲈᛸᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛵᲀ;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲈᛸᛵᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static ᛲᲈᲁ(Lyyds/ᛴᛴᛷᲁ;Lyyds/ᲀᲇᛶᲇ;Lyyds/ᲇᲁᲁᲈ;)Lyyds/ᲀᲁᲁ;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p0, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 13
    .line 14
    iget-object v3, p0, Lyyds/ᛴᛴᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲁᲁ;

    .line 15
    .line 16
    iget-object v3, v3, Lyyds/ᲀᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    const/16 v6, 0x134

    .line 21
    .line 22
    const/16 v7, 0x133

    .line 23
    .line 24
    if-eq v2, v7, :cond_c

    .line 25
    .line 26
    if-eq v2, v6, :cond_c

    .line 27
    .line 28
    const/16 v8, 0x191

    .line 29
    .line 30
    if-eq v2, v8, :cond_b

    .line 31
    .line 32
    const/16 v8, 0x1a5

    .line 33
    .line 34
    if-eq v2, v8, :cond_9

    .line 35
    .line 36
    const/16 p1, 0x1f7

    .line 37
    .line 38
    if-eq v2, p1, :cond_7

    .line 39
    .line 40
    const/16 p1, 0x197

    .line 41
    .line 42
    if-eq v2, p1, :cond_5

    .line 43
    .line 44
    const/16 p1, 0x198

    .line 45
    .line 46
    if-eq v2, p1, :cond_1

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    iget-boolean p2, p2, Lyyds/ᲇᲁᲁᲈ;->ᛶᛳᛶᛵ:Z

    .line 54
    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_2
    iget-object p2, p0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛴᛷᲁ;

    .line 60
    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    iget p2, p2, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 64
    .line 65
    if-ne p2, p1, :cond_3

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    invoke-static {p0, v4}, Lyyds/ᲈᛸᛵᲀ;->ᲇᲈᛵᛷ(Lyyds/ᛴᛴᛷᲁ;I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-lez p1, :cond_4

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_4
    iget-object p0, p0, Lyyds/ᛴᛴᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲁᲁ;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_5
    iget-object p1, v1, Lyyds/ᛶᛶᲈᛷ;->ᛵᛸᛸᛷ:Ljava/net/Proxy;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 87
    .line 88
    if-ne p1, v0, :cond_6

    .line 89
    .line 90
    iget-object p1, p2, Lyyds/ᲇᲁᲁᲈ;->ᛳᲁᲁᲇ:Lyyds/ᲈᛵᛴᲀ;

    .line 91
    .line 92
    invoke-interface {p1, v1, p0}, Lyyds/ᲈᛵᛴᲀ;->ᲇᲈᛵᛷ(Lyyds/ᛶᛶᲈᛷ;Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᲀᲁᲁ;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_6
    new-instance p0, Ljava/net/ProtocolException;

    .line 98
    .line 99
    const-string p1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_7
    iget-object p2, p0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛴᛴᛷᲁ;

    .line 106
    .line 107
    if-eqz p2, :cond_8

    .line 108
    .line 109
    iget p2, p2, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 110
    .line 111
    if-ne p2, p1, :cond_8

    .line 112
    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :cond_8
    const p1, 0x7fffffff

    .line 116
    .line 117
    .line 118
    invoke-static {p0, p1}, Lyyds/ᲈᛸᛵᲀ;->ᲇᲈᛵᛷ(Lyyds/ᛴᛴᛷᲁ;I)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_12

    .line 123
    .line 124
    iget-object p0, p0, Lyyds/ᛴᛴᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲁᲁ;

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_9
    if-eqz p1, :cond_12

    .line 128
    .line 129
    iget-object p2, p1, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p2, Lyyds/ᛵᛱᲈᛳ;

    .line 132
    .line 133
    invoke-interface {p2}, Lyyds/ᛵᛱᲈᛳ;->ᛲᛴᛳᛲ()Lyyds/ᛸᲀᛷᛷ;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    iget-object p2, p2, Lyyds/ᛸᲀᛷᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 138
    .line 139
    iget-object p2, p2, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 140
    .line 141
    iget-object p2, p2, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v1, p1, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Lyyds/ᲀᲇᲇᛵ;

    .line 146
    .line 147
    invoke-interface {v1}, Lyyds/ᲀᲇᲇᛵ;->ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-interface {v1}, Lyyds/ᛷᛷᲈᛸ;->ᲇᲇᲇᛱ()Lyyds/ᛶᛶᲈᛷ;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget-object v1, v1, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 156
    .line 157
    iget-object v1, v1, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 158
    .line 159
    iget-object v1, v1, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {p2, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-eqz p2, :cond_a

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_a
    invoke-virtual {p1}, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    monitor-enter p1

    .line 173
    :try_start_0
    iput-boolean v5, p1, Lyyds/ᲈᛸᲀᛸ;->ᛷᛲᲈᛱ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    monitor-exit p1

    .line 176
    iget-object p0, p0, Lyyds/ᛴᛴᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲁᲁ;

    .line 177
    .line 178
    return-object p0

    .line 179
    :catchall_0
    move-exception p0

    .line 180
    monitor-exit p1

    .line 181
    throw p0

    .line 182
    :cond_b
    iget-object p1, p2, Lyyds/ᲇᲁᲁᲈ;->ᛲᛳᛶᲁ:Lyyds/ᲈᛵᛴᲀ;

    .line 183
    .line 184
    invoke-interface {p1, v1, p0}, Lyyds/ᲈᛵᛴᲀ;->ᲇᲈᛵᛷ(Lyyds/ᛶᛶᲈᛷ;Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᲀᲁᲁ;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :cond_c
    :pswitch_0
    const-string p1, "PROPFIND"

    .line 190
    .line 191
    iget-object v1, p2, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 192
    .line 193
    iget-object v1, v1, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 194
    .line 195
    iget-boolean v1, v1, Lyyds/ᛶᛲᛷ;->ᛱᲈᲁ:Z

    .line 196
    .line 197
    if-nez v1, :cond_d

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_d
    const-string v1, "Location"

    .line 201
    .line 202
    iget-object v2, p0, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 203
    .line 204
    invoke-virtual {v2, v1}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-nez v1, :cond_e

    .line 209
    .line 210
    move-object v1, v0

    .line 211
    :cond_e
    iget-object v2, p0, Lyyds/ᛴᛴᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲁᲁ;

    .line 212
    .line 213
    if-nez v1, :cond_f

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_f
    iget-object v8, v2, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 217
    .line 218
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    :try_start_1
    new-instance v9, Lyyds/ᛱᛲᛴᛲ;

    .line 222
    .line 223
    invoke-direct {v9}, Lyyds/ᛱᛲᛴᛲ;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9, v8, v1}, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ(Lyyds/ᛱᛲᲀᛶ;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :catch_0
    move-object v9, v0

    .line 231
    :goto_1
    if-eqz v9, :cond_10

    .line 232
    .line 233
    invoke-virtual {v9}, Lyyds/ᛱᛲᛴᛲ;->ᛲᲈᲁ()Lyyds/ᛱᛲᲀᛶ;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    goto :goto_2

    .line 238
    :cond_10
    move-object v1, v0

    .line 239
    :goto_2
    if-nez v1, :cond_11

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_11
    iget-object v8, v1, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v9, v2, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 245
    .line 246
    iget-object v9, v9, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v8, v9}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-nez v8, :cond_13

    .line 253
    .line 254
    iget-object p2, p2, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 255
    .line 256
    iget-object p2, p2, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 257
    .line 258
    iget-boolean p2, p2, Lyyds/ᛶᛲᛷ;->ᛲᛳᛶᲁ:Z

    .line 259
    .line 260
    if-nez p2, :cond_13

    .line 261
    .line 262
    :cond_12
    :goto_3
    return-object v0

    .line 263
    :cond_13
    invoke-virtual {v2}, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ()Lyyds/ᛷᲀᲇᲈ;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    invoke-static {v3}, Lyyds/ᛳᛵᲀ;->ᛱᲈᲁ(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_18

    .line 272
    .line 273
    iget p0, p0, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 274
    .line 275
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    if-nez v8, :cond_14

    .line 280
    .line 281
    if-eq p0, v6, :cond_14

    .line 282
    .line 283
    if-ne p0, v7, :cond_15

    .line 284
    .line 285
    :cond_14
    move v4, v5

    .line 286
    :cond_15
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    if-nez p1, :cond_16

    .line 291
    .line 292
    if-eq p0, v6, :cond_16

    .line 293
    .line 294
    if-eq p0, v7, :cond_16

    .line 295
    .line 296
    const-string p0, "GET"

    .line 297
    .line 298
    invoke-virtual {p2, p0, v0}, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_16
    if-eqz v4, :cond_17

    .line 303
    .line 304
    iget-object v0, v2, Lyyds/ᲀᲁᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛸᲀᛵ;

    .line 305
    .line 306
    :cond_17
    invoke-virtual {p2, v3, v0}, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V

    .line 307
    .line 308
    .line 309
    :goto_4
    if-nez v4, :cond_18

    .line 310
    .line 311
    const-string p0, "Transfer-Encoding"

    .line 312
    .line 313
    invoke-virtual {p2, p0}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const-string p0, "Content-Length"

    .line 317
    .line 318
    invoke-virtual {p2, p0}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    const-string p0, "Content-Type"

    .line 322
    .line 323
    invoke-virtual {p2, p0}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    :cond_18
    iget-object p0, v2, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 327
    .line 328
    invoke-static {p0, v1}, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ(Lyyds/ᛱᛲᲀᛶ;Lyyds/ᛱᛲᲀᛶ;)Z

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    if-nez p0, :cond_19

    .line 333
    .line 334
    const-string p0, "Authorization"

    .line 335
    .line 336
    invoke-virtual {p2, p0}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    :cond_19
    iput-object v1, p2, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 340
    .line 341
    new-instance p0, Lyyds/ᲀᲁᲁ;

    .line 342
    .line 343
    invoke-direct {p0, p2}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 344
    .line 345
    .line 346
    return-object p0

    .line 347
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ᲀᛲᛳᲀ(Ljava/io/IOException;Lyyds/ᲈᲀᛱᛷ;Lyyds/ᲇᲁᲁᲈ;Lyyds/ᲀᲁᲁ;)Z
    .locals 0

    .line 1
    instance-of p3, p0, Lyyds/ᛷᛲᛷᲀ;

    .line 2
    .line 3
    iget-boolean p2, p2, Lyyds/ᲇᲁᲁᲈ;->ᛶᛳᛶᛵ:Z

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    if-nez p3, :cond_1

    .line 9
    .line 10
    instance-of p2, p0, Ljava/io/FileNotFoundException;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    instance-of p2, p0, Ljava/net/ProtocolException;

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_2
    instance-of p2, p0, Ljava/io/InterruptedIOException;

    .line 21
    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    .line 25
    .line 26
    if-eqz p0, :cond_7

    .line 27
    .line 28
    if-eqz p3, :cond_7

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    instance-of p2, p0, Ljavax/net/ssl/SSLHandshakeException;

    .line 32
    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    instance-of p2, p2, Ljava/security/cert/CertificateException;

    .line 40
    .line 41
    if-eqz p2, :cond_4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_4
    instance-of p0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 45
    .line 46
    if-eqz p0, :cond_5

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_5
    :goto_0
    iget-object p0, p1, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 50
    .line 51
    if-eqz p0, :cond_7

    .line 52
    .line 53
    iget-boolean p0, p0, Lyyds/ᲀᲇᛶᲇ;->ᛲᲈᲁ:Z

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    if-ne p0, p2, :cond_7

    .line 57
    .line 58
    iget-object p0, p1, Lyyds/ᲈᲀᛱᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛱᲈᛳ;

    .line 59
    .line 60
    invoke-interface {p0}, Lyyds/ᛵᛱᲈᛳ;->ᛲᛴᛳᛲ()Lyyds/ᛸᲀᛷᛷ;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p1, p1, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 65
    .line 66
    if-eqz p1, :cond_6

    .line 67
    .line 68
    invoke-virtual {p1}, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :cond_6
    const/4 p1, 0x0

    .line 74
    :goto_1
    invoke-virtual {p0, p1}, Lyyds/ᛸᲀᛷᛷ;->ᛲᲈᲁ(Lyyds/ᲈᛸᲀᛸ;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_7

    .line 79
    .line 80
    return p2

    .line 81
    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 82
    return p0
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᛴᛴᛷᲁ;I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 2
    .line 3
    const-string v0, "Retry-After"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    const-string p1, "\\d+"

    .line 16
    .line 17
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    const p0, 0x7fffffff

    .line 41
    .line 42
    .line 43
    return p0
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ(Lyyds/ᲇᲁᲁᲈ;)Lyyds/ᛴᛴᛷᲁ;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lyyds/ᲈᛸᛵᲀ;->ᛲᲈᲁ:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲁᲁ;

    .line 11
    .line 12
    iget-object v6, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 13
    .line 14
    sget-object v7, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 15
    .line 16
    move-object v8, v7

    .line 17
    const/16 v19, 0x0

    .line 18
    .line 19
    const/16 v20, 0x0

    .line 20
    .line 21
    move-object v7, v0

    .line 22
    :goto_0
    const/4 v0, 0x1

    .line 23
    :goto_1
    iget-object v9, v6, Lyyds/ᲈᲀᛱᛷ;->ᛲᛲᲈᲈ:Lyyds/ᲀᲇᛶᲇ;

    .line 24
    .line 25
    if-nez v9, :cond_b

    .line 26
    .line 27
    monitor-enter v6

    .line 28
    :try_start_0
    iget-boolean v9, v6, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 29
    .line 30
    if-nez v9, :cond_a

    .line 31
    .line 32
    iget-boolean v9, v6, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 33
    .line 34
    if-nez v9, :cond_9

    .line 35
    .line 36
    iget-boolean v9, v6, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z

    .line 37
    .line 38
    if-nez v9, :cond_9

    .line 39
    .line 40
    iget-boolean v9, v6, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 41
    .line 42
    if-nez v9, :cond_9

    .line 43
    .line 44
    monitor-exit v6

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    new-instance v0, Lyyds/ᛸᲀᛷᛷ;

    .line 48
    .line 49
    iget-object v9, v6, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 50
    .line 51
    iget-object v10, v9, Lyyds/ᛶᛲᛷ;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᛳᛱ;

    .line 52
    .line 53
    iget-object v11, v1, Lyyds/ᲇᲁᲁᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛱᛴ;

    .line 54
    .line 55
    iget-object v11, v11, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v11, Lyyds/ᲀᲈᲁᛵ;

    .line 58
    .line 59
    iget v12, v1, Lyyds/ᲇᲁᲁᲈ;->ᛶᛷᛲᲁ:I

    .line 60
    .line 61
    move-object v13, v10

    .line 62
    iget v10, v1, Lyyds/ᲇᲁᲁᲈ;->ᛱᲈᲁ:I

    .line 63
    .line 64
    move-object v14, v8

    .line 65
    move-object v8, v11

    .line 66
    iget v11, v1, Lyyds/ᲇᲁᲁᲈ;->ᲇᲇᲇᛱ:I

    .line 67
    .line 68
    move-object v15, v13

    .line 69
    iget-boolean v13, v1, Lyyds/ᲇᲁᲁᲈ;->ᛶᛳᛶᛵ:Z

    .line 70
    .line 71
    iget-boolean v9, v9, Lyyds/ᛶᛲᛷ;->ᲇᲇᲇᛱ:Z

    .line 72
    .line 73
    iget-object v5, v7, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 74
    .line 75
    iget-object v3, v5, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 76
    .line 77
    const-string v2, "https"

    .line 78
    .line 79
    invoke-static {v3, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    iget-object v2, v1, Lyyds/ᲇᲁᲁᲈ;->ᲀᛲᛲᲇ:Ljavax/net/ssl/SSLSocketFactory;

    .line 86
    .line 87
    iget-object v3, v1, Lyyds/ᲇᲁᲁᲈ;->ᛱᛳᲇ:Ljavax/net/ssl/HostnameVerifier;

    .line 88
    .line 89
    iget-object v4, v1, Lyyds/ᲇᲁᲁᲈ;->ᛷᲈᲈᲁ:Lyyds/ᲁᲁᲈᛵ;

    .line 90
    .line 91
    move-object/from16 v27, v2

    .line 92
    .line 93
    move-object/from16 v28, v3

    .line 94
    .line 95
    move-object/from16 v29, v4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_0
    const/16 v27, 0x0

    .line 99
    .line 100
    const/16 v28, 0x0

    .line 101
    .line 102
    const/16 v29, 0x0

    .line 103
    .line 104
    :goto_2
    new-instance v22, Lyyds/ᛷᛸᲇᛴ;

    .line 105
    .line 106
    iget-object v2, v5, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 107
    .line 108
    iget v3, v5, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 109
    .line 110
    iget-object v4, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᛲᲈᲈ:Lyyds/ᛱᛵᲈᲁ;

    .line 111
    .line 112
    iget-object v5, v1, Lyyds/ᲇᲁᲁᲈ;->ᛵᛶᛲᲀ:Ljavax/net/SocketFactory;

    .line 113
    .line 114
    move-object/from16 v16, v0

    .line 115
    .line 116
    iget-object v0, v1, Lyyds/ᲇᲁᲁᲈ;->ᛳᲁᲁᲇ:Lyyds/ᲈᛵᛴᲀ;

    .line 117
    .line 118
    move-object/from16 v30, v0

    .line 119
    .line 120
    iget-object v0, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 121
    .line 122
    iget-object v0, v0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 123
    .line 124
    move-object/from16 v23, v2

    .line 125
    .line 126
    iget-object v2, v0, Lyyds/ᛶᛲᛷ;->ᛵᛶᛲᲀ:Ljava/util/List;

    .line 127
    .line 128
    iget-object v0, v0, Lyyds/ᛶᛲᛷ;->ᛶᛳᛶᛵ:Ljava/util/List;

    .line 129
    .line 130
    move-object/from16 v32, v0

    .line 131
    .line 132
    iget-object v0, v1, Lyyds/ᲇᲁᲁᲈ;->ᲇᛱᛲ:Ljava/net/ProxySelector;

    .line 133
    .line 134
    move-object/from16 v33, v0

    .line 135
    .line 136
    move-object/from16 v31, v2

    .line 137
    .line 138
    move/from16 v24, v3

    .line 139
    .line 140
    move-object/from16 v25, v4

    .line 141
    .line 142
    move-object/from16 v26, v5

    .line 143
    .line 144
    invoke-direct/range {v22 .. v33}, Lyyds/ᛷᛸᲇᛴ;-><init>(Ljava/lang/String;ILyyds/ᛱᛵᲈᲁ;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lyyds/ᲁᲁᲈᛵ;Lyyds/ᲈᛵᛴᲀ;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, v6, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 148
    .line 149
    iget-object v0, v0, Lyyds/ᛶᛲᛷ;->ᛲᛳᛴᛸ:Lyyds/ᲀᛵᲁᛴ;

    .line 150
    .line 151
    move-object v2, v14

    .line 152
    move v14, v9

    .line 153
    move v9, v12

    .line 154
    move-object/from16 v17, v6

    .line 155
    .line 156
    move-object/from16 v18, v7

    .line 157
    .line 158
    move-object v7, v15

    .line 159
    move-object/from16 v6, v16

    .line 160
    .line 161
    move-object/from16 v15, v22

    .line 162
    .line 163
    move-object/from16 v16, v0

    .line 164
    .line 165
    invoke-direct/range {v6 .. v18}, Lyyds/ᛸᲀᛷᛷ;-><init>(Lyyds/ᛱᛴᛳᛱ;Lyyds/ᲀᲈᲁᛵ;IIIIZZLyyds/ᛷᛸᲇᛴ;Lyyds/ᲀᛵᲁᛴ;Lyyds/ᲈᲀᛱᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 166
    .line 167
    .line 168
    move-object/from16 v3, v17

    .line 169
    .line 170
    move-object/from16 v7, v18

    .line 171
    .line 172
    iget-object v0, v3, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 173
    .line 174
    iget-boolean v4, v0, Lyyds/ᛶᛲᛷ;->ᲇᲇᲇᛱ:Z

    .line 175
    .line 176
    if-eqz v4, :cond_1

    .line 177
    .line 178
    new-instance v4, Lyyds/ᲀᲇᛱᲇ;

    .line 179
    .line 180
    iget-object v0, v0, Lyyds/ᛶᛲᛷ;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᛳᛱ;

    .line 181
    .line 182
    invoke-direct {v4, v6, v0}, Lyyds/ᲀᲇᛱᲇ;-><init>(Lyyds/ᛸᲀᛷᛷ;Lyyds/ᛱᛴᛳᛱ;)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_1
    new-instance v4, Lyyds/ᲀᛵᲁᛴ;

    .line 187
    .line 188
    const/16 v0, 0x10

    .line 189
    .line 190
    invoke-direct {v4, v0, v6}, Lyyds/ᲀᛵᲁᛴ;-><init>(ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :goto_3
    iput-object v4, v3, Lyyds/ᲈᲀᛱᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛱᲈᛳ;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_2
    move-object v3, v6

    .line 197
    move-object v2, v8

    .line 198
    :goto_4
    :try_start_1
    iget-boolean v0, v3, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    .line 200
    if-nez v0, :cond_8

    .line 201
    .line 202
    :try_start_2
    invoke-virtual {v1, v7}, Lyyds/ᲇᲁᲁᲈ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲁᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 203
    .line 204
    .line 205
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 206
    :try_start_3
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->ᛲᲈᲁ()Lyyds/ᲁᛸᛶᛲ;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iput-object v7, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲁ;

    .line 211
    .line 212
    if-eqz v19, :cond_3

    .line 213
    .line 214
    invoke-static/range {v19 .. v19}, Lyyds/ᛱᛳᛳᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    goto :goto_5

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    const/4 v1, 0x1

    .line 221
    goto/16 :goto_7

    .line 222
    .line 223
    :cond_3
    const/4 v4, 0x0

    .line 224
    :goto_5
    iput-object v4, v0, Lyyds/ᲁᛸᛶᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛴᛴᛷᲁ;

    .line 225
    .line 226
    invoke-virtual {v0}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v4, v3, Lyyds/ᲈᲀᛱᛷ;->ᛲᛲᲈᲈ:Lyyds/ᲀᲇᛶᲇ;

    .line 231
    .line 232
    invoke-static {v0, v4, v1}, Lyyds/ᲈᛸᛵᲀ;->ᛲᲈᲁ(Lyyds/ᛴᛴᛷᲁ;Lyyds/ᲀᲇᛶᲇ;Lyyds/ᲇᲁᲁᲈ;)Lyyds/ᲀᲁᲁ;

    .line 233
    .line 234
    .line 235
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 236
    if-nez v7, :cond_4

    .line 237
    .line 238
    :try_start_4
    iget-object v1, v3, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 241
    .line 242
    .line 243
    const/4 v1, 0x0

    .line 244
    invoke-virtual {v3, v1}, Lyyds/ᲈᲀᛱᛷ;->ᛲᛴᛳᛲ(Z)V

    .line 245
    .line 246
    .line 247
    move-object v5, v0

    .line 248
    goto/16 :goto_a

    .line 249
    .line 250
    :catchall_1
    move-exception v0

    .line 251
    const/4 v1, 0x0

    .line 252
    goto :goto_7

    .line 253
    :cond_4
    :try_start_5
    iget-object v4, v0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 254
    .line 255
    invoke-static {v4}, Lyyds/ᛶᲁᛵᛲ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 256
    .line 257
    .line 258
    add-int/lit8 v4, v20, 0x1

    .line 259
    .line 260
    iget-object v5, v3, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 261
    .line 262
    const/16 v6, 0x14

    .line 263
    .line 264
    if-gt v4, v6, :cond_5

    .line 265
    .line 266
    :try_start_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 267
    .line 268
    .line 269
    const/4 v5, 0x1

    .line 270
    invoke-virtual {v3, v5}, Lyyds/ᲈᲀᛱᛷ;->ᛲᛴᛳᛲ(Z)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v19, v0

    .line 274
    .line 275
    move-object v8, v2

    .line 276
    move-object v6, v3

    .line 277
    move/from16 v20, v4

    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_5
    :try_start_7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    new-instance v0, Ljava/net/ProtocolException;

    .line 285
    .line 286
    new-instance v1, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    .line 290
    .line 291
    const-string v2, "Too many follow-up requests: "

    .line 292
    .line 293
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :catch_0
    move-exception v0

    .line 308
    invoke-static {v0, v3, v1, v7}, Lyyds/ᲈᛸᛵᲀ;->ᲀᛲᛳᲀ(Ljava/io/IOException;Lyyds/ᲈᲀᛱᛷ;Lyyds/ᲇᲁᲁᲈ;Lyyds/ᲀᲁᲁ;)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    iget-object v5, v3, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 313
    .line 314
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    if-nez v4, :cond_7

    .line 318
    .line 319
    sget-object v1, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 320
    .line 321
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_6

    .line 330
    .line 331
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    check-cast v2, Ljava/lang/Exception;

    .line 336
    .line 337
    invoke-static {v0, v2}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_6
    throw v0

    .line 342
    :cond_7
    invoke-static {v2, v0}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛴᛵᛶ(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 343
    .line 344
    .line 345
    move-result-object v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 346
    const/4 v5, 0x1

    .line 347
    invoke-virtual {v3, v5}, Lyyds/ᲈᲀᛱᛷ;->ᛲᛴᛳᛲ(Z)V

    .line 348
    .line 349
    .line 350
    move-object v6, v3

    .line 351
    const/4 v0, 0x0

    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :cond_8
    :try_start_8
    new-instance v0, Ljava/io/IOException;

    .line 355
    .line 356
    const-string v1, "Canceled"

    .line 357
    .line 358
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 362
    :goto_7
    invoke-virtual {v3, v1}, Lyyds/ᲈᲀᛱᛷ;->ᛲᛴᛳᛲ(Z)V

    .line 363
    .line 364
    .line 365
    throw v0

    .line 366
    :cond_9
    move-object v3, v6

    .line 367
    goto :goto_8

    .line 368
    :catchall_2
    move-exception v0

    .line 369
    move-object v3, v6

    .line 370
    goto :goto_9

    .line 371
    :goto_8
    :try_start_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 372
    .line 373
    const-string v1, "Check failed."

    .line 374
    .line 375
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    throw v0

    .line 379
    :catchall_3
    move-exception v0

    .line 380
    goto :goto_9

    .line 381
    :cond_a
    move-object v3, v6

    .line 382
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 383
    .line 384
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 390
    :goto_9
    monitor-exit v3

    .line 391
    throw v0

    .line 392
    :cond_b
    const-string v0, "Check failed."

    .line 393
    .line 394
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const/4 v5, 0x0

    .line 398
    :goto_a
    return-object v5

    .line 399
    :pswitch_0
    const-string v0, "networkResponse"

    .line 400
    .line 401
    const-string v2, "Content-Type"

    .line 402
    .line 403
    const-string v3, "Content-Encoding"

    .line 404
    .line 405
    const-string v4, "Content-Length"

    .line 406
    .line 407
    const-string v5, "cacheResponse"

    .line 408
    .line 409
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 410
    .line 411
    .line 412
    iget-object v6, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲁᲁ;

    .line 413
    .line 414
    new-instance v7, Lyyds/ᲀᲈᛶᲈ;

    .line 415
    .line 416
    const/16 v8, 0xc

    .line 417
    .line 418
    const/4 v9, 0x0

    .line 419
    invoke-direct {v7, v6, v8, v9}, Lyyds/ᲀᲈᛶᲈ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    iget-object v9, v6, Lyyds/ᲀᲁᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛳᛷᲁ;

    .line 423
    .line 424
    if-nez v9, :cond_27

    .line 425
    .line 426
    sget v9, Lyyds/ᛲᛳᛷᲁ;->ᛱᛳᲇ:I

    .line 427
    .line 428
    iget-object v9, v6, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 429
    .line 430
    invoke-virtual {v9}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    const/4 v12, 0x0

    .line 435
    const/4 v13, 0x1

    .line 436
    const/4 v14, 0x0

    .line 437
    const/16 v23, 0x0

    .line 438
    .line 439
    const/16 v24, 0x0

    .line 440
    .line 441
    const/16 v25, -0x1

    .line 442
    .line 443
    const/16 v26, -0x1

    .line 444
    .line 445
    const/16 v27, 0x0

    .line 446
    .line 447
    const/16 v28, 0x0

    .line 448
    .line 449
    const/16 v29, 0x0

    .line 450
    .line 451
    const/16 v30, -0x1

    .line 452
    .line 453
    const/16 v31, -0x1

    .line 454
    .line 455
    const/16 v32, 0x0

    .line 456
    .line 457
    const/16 v33, 0x0

    .line 458
    .line 459
    const/16 v34, 0x0

    .line 460
    .line 461
    :goto_b
    if-ge v14, v10, :cond_25

    .line 462
    .line 463
    invoke-static {v9, v14}, Lyyds/ᛴᛲᛴᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v15

    .line 467
    invoke-static {v9, v14}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    const-string v11, "Cache-Control"

    .line 472
    .line 473
    invoke-virtual {v15, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 474
    .line 475
    .line 476
    move-result v11

    .line 477
    if-eqz v11, :cond_d

    .line 478
    .line 479
    if-eqz v12, :cond_c

    .line 480
    .line 481
    :goto_c
    const/4 v13, 0x0

    .line 482
    goto :goto_d

    .line 483
    :cond_c
    move-object v12, v8

    .line 484
    goto :goto_d

    .line 485
    :cond_d
    const-string v11, "Pragma"

    .line 486
    .line 487
    invoke-virtual {v15, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 488
    .line 489
    .line 490
    move-result v11

    .line 491
    if-eqz v11, :cond_24

    .line 492
    .line 493
    goto :goto_c

    .line 494
    :goto_d
    const/4 v11, 0x0

    .line 495
    :goto_e
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 496
    .line 497
    .line 498
    move-result v15

    .line 499
    if-ge v11, v15, :cond_23

    .line 500
    .line 501
    const-string v15, "=,;"

    .line 502
    .line 503
    move-object/from16 v18, v7

    .line 504
    .line 505
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    move-object/from16 v19, v9

    .line 510
    .line 511
    move v9, v11

    .line 512
    :goto_f
    if-ge v9, v7, :cond_f

    .line 513
    .line 514
    move/from16 v20, v7

    .line 515
    .line 516
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 517
    .line 518
    .line 519
    move-result v7

    .line 520
    invoke-static {v15, v7}, Lyyds/ᛲᲇᛸᲇ;->ᛲᛶᛱᲈ(Ljava/lang/CharSequence;C)Z

    .line 521
    .line 522
    .line 523
    move-result v7

    .line 524
    if-eqz v7, :cond_e

    .line 525
    .line 526
    goto :goto_10

    .line 527
    :cond_e
    add-int/lit8 v9, v9, 0x1

    .line 528
    .line 529
    move/from16 v7, v20

    .line 530
    .line 531
    goto :goto_f

    .line 532
    :cond_f
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 533
    .line 534
    .line 535
    move-result v9

    .line 536
    :goto_10
    invoke-virtual {v8, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v7

    .line 540
    invoke-static {v7}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 541
    .line 542
    .line 543
    move-result-object v7

    .line 544
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v7

    .line 548
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    if-eq v9, v11, :cond_10

    .line 553
    .line 554
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 555
    .line 556
    .line 557
    move-result v11

    .line 558
    const/16 v15, 0x2c

    .line 559
    .line 560
    if-eq v11, v15, :cond_10

    .line 561
    .line 562
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 563
    .line 564
    .line 565
    move-result v11

    .line 566
    const/16 v15, 0x3b

    .line 567
    .line 568
    if-ne v11, v15, :cond_11

    .line 569
    .line 570
    :cond_10
    move/from16 v20, v10

    .line 571
    .line 572
    move-object/from16 v22, v12

    .line 573
    .line 574
    goto/16 :goto_15

    .line 575
    .line 576
    :cond_11
    add-int/lit8 v9, v9, 0x1

    .line 577
    .line 578
    sget-object v11, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 579
    .line 580
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 581
    .line 582
    .line 583
    move-result v11

    .line 584
    :goto_11
    if-ge v9, v11, :cond_13

    .line 585
    .line 586
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 587
    .line 588
    .line 589
    move-result v15

    .line 590
    move/from16 v20, v9

    .line 591
    .line 592
    const/16 v9, 0x20

    .line 593
    .line 594
    if-eq v15, v9, :cond_12

    .line 595
    .line 596
    const/16 v9, 0x9

    .line 597
    .line 598
    if-eq v15, v9, :cond_12

    .line 599
    .line 600
    move/from16 v9, v20

    .line 601
    .line 602
    goto :goto_12

    .line 603
    :cond_12
    add-int/lit8 v9, v20, 0x1

    .line 604
    .line 605
    goto :goto_11

    .line 606
    :cond_13
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 607
    .line 608
    .line 609
    move-result v9

    .line 610
    :goto_12
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 611
    .line 612
    .line 613
    move-result v11

    .line 614
    if-ge v9, v11, :cond_14

    .line 615
    .line 616
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 617
    .line 618
    .line 619
    move-result v11

    .line 620
    const/16 v15, 0x22

    .line 621
    .line 622
    if-ne v11, v15, :cond_14

    .line 623
    .line 624
    add-int/lit8 v9, v9, 0x1

    .line 625
    .line 626
    const/4 v11, 0x4

    .line 627
    invoke-static {v8, v15, v9, v11}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 628
    .line 629
    .line 630
    move-result v11

    .line 631
    invoke-virtual {v8, v9, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v9

    .line 635
    const/16 v21, 0x1

    .line 636
    .line 637
    add-int/lit8 v11, v11, 0x1

    .line 638
    .line 639
    move/from16 v20, v10

    .line 640
    .line 641
    move-object/from16 v22, v12

    .line 642
    .line 643
    goto :goto_16

    .line 644
    :cond_14
    const-string v11, ",;"

    .line 645
    .line 646
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 647
    .line 648
    .line 649
    move-result v15

    .line 650
    move/from16 v20, v10

    .line 651
    .line 652
    move v10, v9

    .line 653
    :goto_13
    if-ge v10, v15, :cond_16

    .line 654
    .line 655
    move-object/from16 v22, v12

    .line 656
    .line 657
    invoke-virtual {v8, v10}, Ljava/lang/String;->charAt(I)C

    .line 658
    .line 659
    .line 660
    move-result v12

    .line 661
    invoke-static {v11, v12}, Lyyds/ᛲᲇᛸᲇ;->ᛲᛶᛱᲈ(Ljava/lang/CharSequence;C)Z

    .line 662
    .line 663
    .line 664
    move-result v12

    .line 665
    if-eqz v12, :cond_15

    .line 666
    .line 667
    goto :goto_14

    .line 668
    :cond_15
    add-int/lit8 v10, v10, 0x1

    .line 669
    .line 670
    move-object/from16 v12, v22

    .line 671
    .line 672
    goto :goto_13

    .line 673
    :cond_16
    move-object/from16 v22, v12

    .line 674
    .line 675
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 676
    .line 677
    .line 678
    move-result v10

    .line 679
    :goto_14
    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v9

    .line 683
    invoke-static {v9}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 684
    .line 685
    .line 686
    move-result-object v9

    .line 687
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v9

    .line 691
    move v11, v10

    .line 692
    goto :goto_16

    .line 693
    :goto_15
    add-int/lit8 v9, v9, 0x1

    .line 694
    .line 695
    move v11, v9

    .line 696
    const/4 v9, 0x0

    .line 697
    :goto_16
    const-string v10, "no-cache"

    .line 698
    .line 699
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 700
    .line 701
    .line 702
    move-result v10

    .line 703
    if-eqz v10, :cond_17

    .line 704
    .line 705
    move-object/from16 v7, v18

    .line 706
    .line 707
    move-object/from16 v9, v19

    .line 708
    .line 709
    move/from16 v10, v20

    .line 710
    .line 711
    move-object/from16 v12, v22

    .line 712
    .line 713
    const/16 v23, 0x1

    .line 714
    .line 715
    goto/16 :goto_e

    .line 716
    .line 717
    :cond_17
    const-string v10, "no-store"

    .line 718
    .line 719
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 720
    .line 721
    .line 722
    move-result v10

    .line 723
    if-eqz v10, :cond_18

    .line 724
    .line 725
    move-object/from16 v7, v18

    .line 726
    .line 727
    move-object/from16 v9, v19

    .line 728
    .line 729
    move/from16 v10, v20

    .line 730
    .line 731
    move-object/from16 v12, v22

    .line 732
    .line 733
    const/16 v24, 0x1

    .line 734
    .line 735
    goto/16 :goto_e

    .line 736
    .line 737
    :cond_18
    const-string v10, "max-age"

    .line 738
    .line 739
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 740
    .line 741
    .line 742
    move-result v10

    .line 743
    if-eqz v10, :cond_1a

    .line 744
    .line 745
    const/4 v10, -0x1

    .line 746
    invoke-static {v10, v9}, Lyyds/ᛶᲁᛵᛲ;->ᛱᛳᲇ(ILjava/lang/String;)I

    .line 747
    .line 748
    .line 749
    move-result v25

    .line 750
    :cond_19
    :goto_17
    move-object/from16 v7, v18

    .line 751
    .line 752
    move-object/from16 v9, v19

    .line 753
    .line 754
    move/from16 v10, v20

    .line 755
    .line 756
    move-object/from16 v12, v22

    .line 757
    .line 758
    goto/16 :goto_e

    .line 759
    .line 760
    :cond_1a
    const/4 v10, -0x1

    .line 761
    const-string v12, "s-maxage"

    .line 762
    .line 763
    invoke-virtual {v12, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 764
    .line 765
    .line 766
    move-result v12

    .line 767
    if-eqz v12, :cond_1b

    .line 768
    .line 769
    invoke-static {v10, v9}, Lyyds/ᛶᲁᛵᛲ;->ᛱᛳᲇ(ILjava/lang/String;)I

    .line 770
    .line 771
    .line 772
    move-result v26

    .line 773
    goto :goto_17

    .line 774
    :cond_1b
    const-string v10, "private"

    .line 775
    .line 776
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 777
    .line 778
    .line 779
    move-result v10

    .line 780
    if-eqz v10, :cond_1c

    .line 781
    .line 782
    move-object/from16 v7, v18

    .line 783
    .line 784
    move-object/from16 v9, v19

    .line 785
    .line 786
    move/from16 v10, v20

    .line 787
    .line 788
    move-object/from16 v12, v22

    .line 789
    .line 790
    const/16 v27, 0x1

    .line 791
    .line 792
    goto/16 :goto_e

    .line 793
    .line 794
    :cond_1c
    const-string v10, "public"

    .line 795
    .line 796
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 797
    .line 798
    .line 799
    move-result v10

    .line 800
    if-eqz v10, :cond_1d

    .line 801
    .line 802
    move-object/from16 v7, v18

    .line 803
    .line 804
    move-object/from16 v9, v19

    .line 805
    .line 806
    move/from16 v10, v20

    .line 807
    .line 808
    move-object/from16 v12, v22

    .line 809
    .line 810
    const/16 v28, 0x1

    .line 811
    .line 812
    goto/16 :goto_e

    .line 813
    .line 814
    :cond_1d
    const-string v10, "must-revalidate"

    .line 815
    .line 816
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 817
    .line 818
    .line 819
    move-result v10

    .line 820
    if-eqz v10, :cond_1e

    .line 821
    .line 822
    move-object/from16 v7, v18

    .line 823
    .line 824
    move-object/from16 v9, v19

    .line 825
    .line 826
    move/from16 v10, v20

    .line 827
    .line 828
    move-object/from16 v12, v22

    .line 829
    .line 830
    const/16 v29, 0x1

    .line 831
    .line 832
    goto/16 :goto_e

    .line 833
    .line 834
    :cond_1e
    const-string v10, "max-stale"

    .line 835
    .line 836
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 837
    .line 838
    .line 839
    move-result v10

    .line 840
    if-eqz v10, :cond_1f

    .line 841
    .line 842
    const v7, 0x7fffffff

    .line 843
    .line 844
    .line 845
    invoke-static {v7, v9}, Lyyds/ᛶᲁᛵᛲ;->ᛱᛳᲇ(ILjava/lang/String;)I

    .line 846
    .line 847
    .line 848
    move-result v30

    .line 849
    goto :goto_17

    .line 850
    :cond_1f
    const-string v10, "min-fresh"

    .line 851
    .line 852
    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 853
    .line 854
    .line 855
    move-result v10

    .line 856
    if-eqz v10, :cond_20

    .line 857
    .line 858
    const/4 v10, -0x1

    .line 859
    invoke-static {v10, v9}, Lyyds/ᛶᲁᛵᛲ;->ᛱᛳᲇ(ILjava/lang/String;)I

    .line 860
    .line 861
    .line 862
    move-result v31

    .line 863
    goto :goto_17

    .line 864
    :cond_20
    const/4 v10, -0x1

    .line 865
    const-string v9, "only-if-cached"

    .line 866
    .line 867
    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 868
    .line 869
    .line 870
    move-result v9

    .line 871
    if-eqz v9, :cond_21

    .line 872
    .line 873
    move-object/from16 v7, v18

    .line 874
    .line 875
    move-object/from16 v9, v19

    .line 876
    .line 877
    move/from16 v10, v20

    .line 878
    .line 879
    move-object/from16 v12, v22

    .line 880
    .line 881
    const/16 v32, 0x1

    .line 882
    .line 883
    goto/16 :goto_e

    .line 884
    .line 885
    :cond_21
    const-string v9, "no-transform"

    .line 886
    .line 887
    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 888
    .line 889
    .line 890
    move-result v9

    .line 891
    if-eqz v9, :cond_22

    .line 892
    .line 893
    move-object/from16 v7, v18

    .line 894
    .line 895
    move-object/from16 v9, v19

    .line 896
    .line 897
    move/from16 v10, v20

    .line 898
    .line 899
    move-object/from16 v12, v22

    .line 900
    .line 901
    const/16 v33, 0x1

    .line 902
    .line 903
    goto/16 :goto_e

    .line 904
    .line 905
    :cond_22
    const-string v9, "immutable"

    .line 906
    .line 907
    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 908
    .line 909
    .line 910
    move-result v7

    .line 911
    if-eqz v7, :cond_19

    .line 912
    .line 913
    move-object/from16 v7, v18

    .line 914
    .line 915
    move-object/from16 v9, v19

    .line 916
    .line 917
    move/from16 v10, v20

    .line 918
    .line 919
    move-object/from16 v12, v22

    .line 920
    .line 921
    const/16 v34, 0x1

    .line 922
    .line 923
    goto/16 :goto_e

    .line 924
    .line 925
    :cond_23
    move-object/from16 v22, v12

    .line 926
    .line 927
    :cond_24
    move-object/from16 v18, v7

    .line 928
    .line 929
    move-object/from16 v19, v9

    .line 930
    .line 931
    move/from16 v20, v10

    .line 932
    .line 933
    const/4 v10, -0x1

    .line 934
    add-int/lit8 v14, v14, 0x1

    .line 935
    .line 936
    move-object/from16 v7, v18

    .line 937
    .line 938
    move-object/from16 v9, v19

    .line 939
    .line 940
    move/from16 v10, v20

    .line 941
    .line 942
    const/16 v8, 0xc

    .line 943
    .line 944
    goto/16 :goto_b

    .line 945
    .line 946
    :cond_25
    move-object/from16 v18, v7

    .line 947
    .line 948
    if-nez v13, :cond_26

    .line 949
    .line 950
    const/16 v35, 0x0

    .line 951
    .line 952
    goto :goto_18

    .line 953
    :cond_26
    move-object/from16 v35, v12

    .line 954
    .line 955
    :goto_18
    new-instance v22, Lyyds/ᛲᛳᛷᲁ;

    .line 956
    .line 957
    invoke-direct/range {v22 .. v35}, Lyyds/ᛲᛳᛷᲁ;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 958
    .line 959
    .line 960
    move-object/from16 v9, v22

    .line 961
    .line 962
    iput-object v9, v6, Lyyds/ᲀᲁᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛳᛷᲁ;

    .line 963
    .line 964
    goto :goto_19

    .line 965
    :cond_27
    move-object/from16 v18, v7

    .line 966
    .line 967
    :goto_19
    iget-boolean v6, v9, Lyyds/ᛲᛳᛷᲁ;->ᛷᲈᲈᲁ:Z

    .line 968
    .line 969
    if-eqz v6, :cond_28

    .line 970
    .line 971
    new-instance v7, Lyyds/ᲀᲈᛶᲈ;

    .line 972
    .line 973
    const/16 v6, 0xc

    .line 974
    .line 975
    const/4 v9, 0x0

    .line 976
    invoke-direct {v7, v9, v6, v9}, Lyyds/ᲀᲈᛶᲈ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    goto :goto_1a

    .line 980
    :cond_28
    move-object/from16 v7, v18

    .line 981
    .line 982
    :goto_1a
    iget-object v6, v7, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v6, Lyyds/ᲀᲁᲁ;

    .line 985
    .line 986
    iget-object v7, v7, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v7, Lyyds/ᛴᛴᛷᲁ;

    .line 989
    .line 990
    if-nez v6, :cond_29

    .line 991
    .line 992
    if-nez v7, :cond_29

    .line 993
    .line 994
    sget-object v29, Lyyds/ᛲᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᲈᲀ;

    .line 995
    .line 996
    sget-object v39, Lyyds/ᛶᲀᲁᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛶᲇᲁ;

    .line 997
    .line 998
    new-instance v0, Ljava/util/ArrayList;

    .line 999
    .line 1000
    const/16 v6, 0x14

    .line 1001
    .line 1002
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1003
    .line 1004
    .line 1005
    iget-object v2, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲁᲁ;

    .line 1006
    .line 1007
    sget-object v24, Lyyds/ᛴᲀᲁᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲀᲁᛲ;

    .line 1008
    .line 1009
    const-string v25, "Unsatisfiable Request (only-if-cached)"

    .line 1010
    .line 1011
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1012
    .line 1013
    .line 1014
    move-result-wide v36

    .line 1015
    new-instance v3, Lyyds/ᛷᛸᛱᛴ;

    .line 1016
    .line 1017
    const/4 v4, 0x0

    .line 1018
    new-array v4, v4, [Ljava/lang/String;

    .line 1019
    .line 1020
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    check-cast v0, [Ljava/lang/String;

    .line 1025
    .line 1026
    invoke-direct {v3, v0}, Lyyds/ᛷᛸᛱᛴ;-><init>([Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    new-instance v22, Lyyds/ᛴᛴᛷᲁ;

    .line 1030
    .line 1031
    const/16 v26, 0x1f8

    .line 1032
    .line 1033
    const/16 v27, 0x0

    .line 1034
    .line 1035
    const/16 v30, 0x0

    .line 1036
    .line 1037
    const/16 v31, 0x0

    .line 1038
    .line 1039
    const/16 v32, 0x0

    .line 1040
    .line 1041
    const/16 v33, 0x0

    .line 1042
    .line 1043
    const-wide/16 v34, -0x1

    .line 1044
    .line 1045
    const/16 v38, 0x0

    .line 1046
    .line 1047
    move-object/from16 v23, v2

    .line 1048
    .line 1049
    move-object/from16 v28, v3

    .line 1050
    .line 1051
    invoke-direct/range {v22 .. v39}, Lyyds/ᛴᛴᛷᲁ;-><init>(Lyyds/ᲀᲁᲁ;Lyyds/ᛴᲀᲁᛲ;Ljava/lang/String;ILyyds/ᲀᲈᛴᛴ;Lyyds/ᛷᛸᛱᛴ;Lyyds/ᛲᛶᲀ;Lyyds/ᲁᛸᛶᲁ;Lyyds/ᛴᛴᛷᲁ;Lyyds/ᛴᛴᛷᲁ;Lyyds/ᛴᛴᛷᲁ;JJLyyds/ᲀᲇᛶᲇ;Lyyds/ᛶᲀᲁᛲ;)V

    .line 1052
    .line 1053
    .line 1054
    iget-object v0, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 1055
    .line 1056
    iget-object v0, v0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1057
    .line 1058
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    goto/16 :goto_21

    .line 1062
    .line 1063
    :cond_29
    if-nez v6, :cond_2a

    .line 1064
    .line 1065
    invoke-virtual {v7}, Lyyds/ᛴᛴᛷᲁ;->ᛲᲈᲁ()Lyyds/ᲁᛸᛶᛲ;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    invoke-static {v7}, Lyyds/ᛱᛳᛳᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    invoke-static {v5, v2}, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛴᛴᛷᲁ;)V

    .line 1074
    .line 1075
    .line 1076
    iput-object v2, v0, Lyyds/ᲁᛸᛶᛲ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛷᲁ;

    .line 1077
    .line 1078
    invoke-virtual {v0}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v22

    .line 1082
    iget-object v0, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 1083
    .line 1084
    iget-object v0, v0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1085
    .line 1086
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1087
    .line 1088
    .line 1089
    goto/16 :goto_21

    .line 1090
    .line 1091
    :cond_2a
    if-eqz v7, :cond_2b

    .line 1092
    .line 1093
    iget-object v8, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 1094
    .line 1095
    iget-object v8, v8, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1096
    .line 1097
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    :cond_2b
    invoke-virtual {v1, v6}, Lyyds/ᲇᲁᲁᲈ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲁᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    if-eqz v7, :cond_35

    .line 1105
    .line 1106
    iget v6, v1, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 1107
    .line 1108
    const/16 v8, 0x130

    .line 1109
    .line 1110
    if-ne v6, v8, :cond_34

    .line 1111
    .line 1112
    invoke-virtual {v7}, Lyyds/ᛴᛴᛷᲁ;->ᛲᲈᲁ()Lyyds/ᲁᛸᛶᛲ;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v6

    .line 1116
    iget-object v8, v7, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 1117
    .line 1118
    iget-object v9, v1, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 1119
    .line 1120
    new-instance v10, Ljava/util/ArrayList;

    .line 1121
    .line 1122
    const/16 v11, 0x14

    .line 1123
    .line 1124
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v8}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 1128
    .line 1129
    .line 1130
    move-result v11

    .line 1131
    const/4 v12, 0x0

    .line 1132
    :goto_1b
    if-ge v12, v11, :cond_30

    .line 1133
    .line 1134
    invoke-static {v8, v12}, Lyyds/ᛴᛲᛴᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v13

    .line 1138
    invoke-static {v8, v12}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v14

    .line 1142
    const-string v15, "Warning"

    .line 1143
    .line 1144
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v15

    .line 1148
    if-eqz v15, :cond_2c

    .line 1149
    .line 1150
    const-string v15, "1"

    .line 1151
    .line 1152
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v15

    .line 1156
    if-eqz v15, :cond_2c

    .line 1157
    .line 1158
    goto :goto_1d

    .line 1159
    :cond_2c
    invoke-virtual {v4, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v15

    .line 1163
    if-nez v15, :cond_2e

    .line 1164
    .line 1165
    invoke-virtual {v3, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v15

    .line 1169
    if-nez v15, :cond_2e

    .line 1170
    .line 1171
    invoke-virtual {v2, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v15

    .line 1175
    if-eqz v15, :cond_2d

    .line 1176
    .line 1177
    goto :goto_1c

    .line 1178
    :cond_2d
    invoke-static {v13}, Lyyds/ᲀᛳᛳᛱ;->ᛶᛷᛲᲁ(Ljava/lang/String;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v15

    .line 1182
    if-eqz v15, :cond_2e

    .line 1183
    .line 1184
    invoke-virtual {v9, v13}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v15

    .line 1188
    if-nez v15, :cond_2f

    .line 1189
    .line 1190
    :cond_2e
    :goto_1c
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1191
    .line 1192
    .line 1193
    invoke-static {v14}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v13

    .line 1197
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v13

    .line 1201
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    :cond_2f
    :goto_1d
    add-int/lit8 v12, v12, 0x1

    .line 1205
    .line 1206
    goto :goto_1b

    .line 1207
    :cond_30
    invoke-virtual {v9}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 1208
    .line 1209
    .line 1210
    move-result v8

    .line 1211
    const/4 v11, 0x0

    .line 1212
    :goto_1e
    if-ge v11, v8, :cond_33

    .line 1213
    .line 1214
    invoke-static {v9, v11}, Lyyds/ᛴᛲᛴᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v12

    .line 1218
    invoke-virtual {v4, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v13

    .line 1222
    if-nez v13, :cond_32

    .line 1223
    .line 1224
    invoke-virtual {v3, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v13

    .line 1228
    if-nez v13, :cond_32

    .line 1229
    .line 1230
    invoke-virtual {v2, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v13

    .line 1234
    if-eqz v13, :cond_31

    .line 1235
    .line 1236
    goto :goto_1f

    .line 1237
    :cond_31
    invoke-static {v12}, Lyyds/ᲀᛳᛳᛱ;->ᛶᛷᛲᲁ(Ljava/lang/String;)Z

    .line 1238
    .line 1239
    .line 1240
    move-result v13

    .line 1241
    if-eqz v13, :cond_32

    .line 1242
    .line 1243
    invoke-static {v9, v11}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v13

    .line 1247
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1248
    .line 1249
    .line 1250
    invoke-static {v13}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v12

    .line 1254
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v12

    .line 1258
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    :cond_32
    :goto_1f
    add-int/lit8 v11, v11, 0x1

    .line 1262
    .line 1263
    goto :goto_1e

    .line 1264
    :cond_33
    const/4 v11, 0x0

    .line 1265
    new-array v2, v11, [Ljava/lang/String;

    .line 1266
    .line 1267
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v2

    .line 1271
    check-cast v2, [Ljava/lang/String;

    .line 1272
    .line 1273
    new-instance v3, Lyyds/ᲀᲈᛷᛷ;

    .line 1274
    .line 1275
    const/4 v4, 0x2

    .line 1276
    invoke-direct {v3, v4}, Lyyds/ᲀᲈᛷᛷ;-><init>(I)V

    .line 1277
    .line 1278
    .line 1279
    iget-object v4, v3, Lyyds/ᲀᲈᛷᛷ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 1280
    .line 1281
    invoke-static {v4, v2}, Lyyds/ᛶᲁᛶᲁ;->ᛵᲀᲈᛴ(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 1282
    .line 1283
    .line 1284
    iput-object v3, v6, Lyyds/ᲁᛸᛶᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 1285
    .line 1286
    iget-wide v2, v1, Lyyds/ᛴᛴᛷᲁ;->ᛱᛳᲇ:J

    .line 1287
    .line 1288
    iput-wide v2, v6, Lyyds/ᲁᛸᛶᛲ;->ᛷᛵᲇᲀ:J

    .line 1289
    .line 1290
    iget-wide v2, v1, Lyyds/ᛴᛴᛷᲁ;->ᛳᲁᲁᲇ:J

    .line 1291
    .line 1292
    iput-wide v2, v6, Lyyds/ᲁᛸᛶᛲ;->ᛲᛲᲈᲈ:J

    .line 1293
    .line 1294
    invoke-static {v7}, Lyyds/ᛱᛳᛳᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v2

    .line 1298
    invoke-static {v5, v2}, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛴᛴᛷᲁ;)V

    .line 1299
    .line 1300
    .line 1301
    iput-object v2, v6, Lyyds/ᲁᛸᛶᛲ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛷᲁ;

    .line 1302
    .line 1303
    invoke-static {v1}, Lyyds/ᛱᛳᛳᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    invoke-static {v0, v2}, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛴᛴᛷᲁ;)V

    .line 1308
    .line 1309
    .line 1310
    iput-object v2, v6, Lyyds/ᲁᛸᛶᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛴᛷᲁ;

    .line 1311
    .line 1312
    invoke-virtual {v6}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 1313
    .line 1314
    .line 1315
    iget-object v0, v1, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 1316
    .line 1317
    invoke-virtual {v0}, Lyyds/ᛲᛶᲀ;->close()V

    .line 1318
    .line 1319
    .line 1320
    const/4 v9, 0x0

    .line 1321
    throw v9

    .line 1322
    :cond_34
    iget-object v2, v7, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 1323
    .line 1324
    invoke-static {v2}, Lyyds/ᛶᲁᛵᛲ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;)V

    .line 1325
    .line 1326
    .line 1327
    :cond_35
    invoke-virtual {v1}, Lyyds/ᛴᛴᛷᲁ;->ᛲᲈᲁ()Lyyds/ᲁᛸᛶᛲ;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    if-eqz v7, :cond_36

    .line 1332
    .line 1333
    invoke-static {v7}, Lyyds/ᛱᛳᛳᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v3

    .line 1337
    goto :goto_20

    .line 1338
    :cond_36
    const/4 v3, 0x0

    .line 1339
    :goto_20
    invoke-static {v5, v3}, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛴᛴᛷᲁ;)V

    .line 1340
    .line 1341
    .line 1342
    iput-object v3, v2, Lyyds/ᲁᛸᛶᛲ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛷᲁ;

    .line 1343
    .line 1344
    invoke-static {v1}, Lyyds/ᛱᛳᛳᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v1

    .line 1348
    invoke-static {v0, v1}, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛴᛴᛷᲁ;)V

    .line 1349
    .line 1350
    .line 1351
    iput-object v1, v2, Lyyds/ᲁᛸᛶᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛴᛷᲁ;

    .line 1352
    .line 1353
    invoke-virtual {v2}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v22

    .line 1357
    :goto_21
    return-object v22

    .line 1358
    :pswitch_1
    const-string v0, "Content-Encoding"

    .line 1359
    .line 1360
    const-string v2, "User-Agent"

    .line 1361
    .line 1362
    const-string v3, "gzip"

    .line 1363
    .line 1364
    const-string v4, "Accept-Encoding"

    .line 1365
    .line 1366
    const-string v5, "Connection"

    .line 1367
    .line 1368
    const-string v6, "Host"

    .line 1369
    .line 1370
    const-string v7, "Transfer-Encoding"

    .line 1371
    .line 1372
    const-string v8, "Content-Type"

    .line 1373
    .line 1374
    const-string v9, "Content-Length"

    .line 1375
    .line 1376
    iget-object v10, v1, Lyyds/ᲇᲁᲁᲈ;->ᛷᛵᲇᲀ:Lyyds/ᲀᛴᛱᛷ;

    .line 1377
    .line 1378
    iget-object v11, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲁᲁ;

    .line 1379
    .line 1380
    invoke-virtual {v11}, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ()Lyyds/ᛷᲀᲇᲈ;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v12

    .line 1384
    iget-object v13, v11, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 1385
    .line 1386
    iget-object v14, v11, Lyyds/ᲀᲁᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛸᲀᛵ;

    .line 1387
    .line 1388
    move-object/from16 v16, v14

    .line 1389
    .line 1390
    const-wide/16 v17, -0x1

    .line 1391
    .line 1392
    if-eqz v16, :cond_39

    .line 1393
    .line 1394
    invoke-virtual/range {v16 .. v16}, Lyyds/ᛳᛸᲀᛵ;->ᛵᛸᛸᛷ()Lyyds/ᛴᛲᲁᲈ;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v14

    .line 1398
    if-eqz v14, :cond_37

    .line 1399
    .line 1400
    iget-object v14, v14, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 1401
    .line 1402
    invoke-virtual {v12, v8, v14}, Lyyds/ᛷᲀᲇᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1403
    .line 1404
    .line 1405
    :cond_37
    invoke-virtual/range {v16 .. v16}, Lyyds/ᛳᛸᲀᛵ;->ᛲᲈᲁ()J

    .line 1406
    .line 1407
    .line 1408
    move-result-wide v14

    .line 1409
    cmp-long v16, v14, v17

    .line 1410
    .line 1411
    if-eqz v16, :cond_38

    .line 1412
    .line 1413
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v14

    .line 1417
    invoke-virtual {v12, v9, v14}, Lyyds/ᛷᲀᲇᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v12, v7}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 1421
    .line 1422
    .line 1423
    goto :goto_22

    .line 1424
    :cond_38
    const-string v14, "chunked"

    .line 1425
    .line 1426
    invoke-virtual {v12, v7, v14}, Lyyds/ᛷᲀᲇᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v12, v9}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 1430
    .line 1431
    .line 1432
    :cond_39
    :goto_22
    invoke-virtual {v13, v6}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v7

    .line 1436
    if-nez v7, :cond_3a

    .line 1437
    .line 1438
    iget-object v7, v11, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 1439
    .line 1440
    const/4 v11, 0x0

    .line 1441
    invoke-static {v7, v11}, Lyyds/ᛴᛲᛲᲇ;->ᛲᛳᛶᲁ(Lyyds/ᛱᛲᲀᛶ;Z)Ljava/lang/String;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v7

    .line 1445
    invoke-virtual {v12, v6, v7}, Lyyds/ᛷᲀᲇᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1446
    .line 1447
    .line 1448
    :cond_3a
    invoke-virtual {v13, v5}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v6

    .line 1452
    if-nez v6, :cond_3b

    .line 1453
    .line 1454
    const-string v6, "Keep-Alive"

    .line 1455
    .line 1456
    invoke-virtual {v12, v5, v6}, Lyyds/ᛷᲀᲇᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    :cond_3b
    invoke-virtual {v13, v4}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v5

    .line 1463
    if-nez v5, :cond_3c

    .line 1464
    .line 1465
    const-string v5, "Range"

    .line 1466
    .line 1467
    invoke-virtual {v13, v5}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v5

    .line 1471
    if-nez v5, :cond_3c

    .line 1472
    .line 1473
    invoke-virtual {v12, v4, v3}, Lyyds/ᛷᲀᲇᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1474
    .line 1475
    .line 1476
    const/16 v21, 0x1

    .line 1477
    .line 1478
    goto :goto_23

    .line 1479
    :cond_3c
    const/16 v21, 0x0

    .line 1480
    .line 1481
    :goto_23
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v13, v2}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v4

    .line 1488
    if-nez v4, :cond_3d

    .line 1489
    .line 1490
    const-string v4, "okhttp/5.4.0"

    .line 1491
    .line 1492
    invoke-virtual {v12, v2, v4}, Lyyds/ᛷᲀᲇᲈ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1493
    .line 1494
    .line 1495
    :cond_3d
    new-instance v2, Lyyds/ᲀᲁᲁ;

    .line 1496
    .line 1497
    invoke-direct {v2, v12}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 1498
    .line 1499
    .line 1500
    invoke-virtual {v1, v2}, Lyyds/ᲇᲁᲁᲈ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲁᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v1

    .line 1504
    iget-object v4, v1, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 1505
    .line 1506
    iget-object v5, v2, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 1507
    .line 1508
    invoke-static {v10, v5, v4}, Lyyds/ᲁᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᲀᛴᛱᛷ;Lyyds/ᛱᛲᲀᛶ;Lyyds/ᛷᛸᛱᛴ;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v1}, Lyyds/ᛴᛴᛷᲁ;->ᛲᲈᲁ()Lyyds/ᲁᛸᛶᛲ;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v5

    .line 1515
    iput-object v2, v5, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲁ;

    .line 1516
    .line 1517
    if-eqz v21, :cond_40

    .line 1518
    .line 1519
    invoke-virtual {v4, v0}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v2

    .line 1523
    if-nez v2, :cond_3e

    .line 1524
    .line 1525
    const/4 v2, 0x0

    .line 1526
    :cond_3e
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1527
    .line 1528
    .line 1529
    move-result v2

    .line 1530
    if-eqz v2, :cond_40

    .line 1531
    .line 1532
    invoke-static {v1}, Lyyds/ᲁᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Z

    .line 1533
    .line 1534
    .line 1535
    move-result v2

    .line 1536
    if-eqz v2, :cond_40

    .line 1537
    .line 1538
    iget-object v1, v1, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 1539
    .line 1540
    new-instance v2, Lyyds/ᲇᲀᛵᛴ;

    .line 1541
    .line 1542
    invoke-virtual {v1}, Lyyds/ᛲᛶᲀ;->ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v1

    .line 1546
    invoke-direct {v2, v1}, Lyyds/ᲇᲀᛵᛴ;-><init>(Lyyds/ᛴᲇᛸ;)V

    .line 1547
    .line 1548
    .line 1549
    invoke-static {v4}, Lyyds/ᛴᛲᛴᛲ;->ᲇᲈᛵᛷ(Lyyds/ᛷᛸᛱᛴ;)Lyyds/ᲀᲈᛷᛷ;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v1

    .line 1553
    invoke-virtual {v1, v0}, Lyyds/ᲀᲈᛷᛷ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v1, v9}, Lyyds/ᲀᲈᛷᛷ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 1557
    .line 1558
    .line 1559
    invoke-static {v1}, Lyyds/ᛴᛲᛴᛲ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲈᛷᛷ;)Lyyds/ᛷᛸᛱᛴ;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v0

    .line 1563
    invoke-static {v0}, Lyyds/ᛴᛲᛴᛲ;->ᲇᲈᛵᛷ(Lyyds/ᛷᛸᛱᛴ;)Lyyds/ᲀᲈᛷᛷ;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    iput-object v0, v5, Lyyds/ᲁᛸᛶᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 1568
    .line 1569
    invoke-virtual {v4, v8}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    if-nez v0, :cond_3f

    .line 1574
    .line 1575
    const/4 v0, 0x0

    .line 1576
    :cond_3f
    new-instance v1, Lyyds/ᛳᛶᲈᲈ;

    .line 1577
    .line 1578
    new-instance v3, Lyyds/ᲀᲀᛵᲈ;

    .line 1579
    .line 1580
    invoke-direct {v3, v2}, Lyyds/ᲀᲀᛵᲈ;-><init>(Lyyds/ᛷᛷᛳᛷ;)V

    .line 1581
    .line 1582
    .line 1583
    move-wide/from16 v6, v17

    .line 1584
    .line 1585
    invoke-direct {v1, v0, v6, v7, v3}, Lyyds/ᛳᛶᲈᲈ;-><init>(Ljava/lang/String;JLyyds/ᲀᲀᛵᲈ;)V

    .line 1586
    .line 1587
    .line 1588
    iput-object v1, v5, Lyyds/ᲁᛸᛶᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛶᲀ;

    .line 1589
    .line 1590
    :cond_40
    invoke-virtual {v5}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v0

    .line 1594
    return-object v0

    .line 1595
    :pswitch_2
    iget-object v2, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛱᛷ;

    .line 1596
    .line 1597
    monitor-enter v2

    .line 1598
    :try_start_a
    iget-boolean v0, v2, Lyyds/ᲈᲀᛱᛷ;->ᛵᛶᛲᲀ:Z

    .line 1599
    .line 1600
    if-eqz v0, :cond_44

    .line 1601
    .line 1602
    iget-boolean v0, v2, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 1603
    .line 1604
    if-nez v0, :cond_43

    .line 1605
    .line 1606
    iget-boolean v0, v2, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 1607
    .line 1608
    if-nez v0, :cond_43

    .line 1609
    .line 1610
    iget-boolean v0, v2, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z

    .line 1611
    .line 1612
    if-nez v0, :cond_43

    .line 1613
    .line 1614
    iget-boolean v0, v2, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1615
    .line 1616
    if-nez v0, :cond_43

    .line 1617
    .line 1618
    monitor-exit v2

    .line 1619
    iget-object v0, v2, Lyyds/ᲈᲀᛱᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛱᲈᛳ;

    .line 1620
    .line 1621
    invoke-interface {v0}, Lyyds/ᛵᛱᲈᛳ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v3

    .line 1625
    iget-object v4, v2, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 1626
    .line 1627
    iget v5, v1, Lyyds/ᲇᲁᲁᲈ;->ᛶᛷᛲᲁ:I

    .line 1628
    .line 1629
    iget-object v6, v3, Lyyds/ᲈᛸᲀᛸ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 1630
    .line 1631
    iget-object v7, v3, Lyyds/ᲈᛸᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

    .line 1632
    .line 1633
    if-eqz v7, :cond_41

    .line 1634
    .line 1635
    new-instance v5, Lyyds/ᲁᛴᛷᲇ;

    .line 1636
    .line 1637
    invoke-direct {v5, v4, v3, v1, v7}, Lyyds/ᲁᛴᛷᲇ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲈᛸᲀᛸ;Lyyds/ᲇᲁᲁᲈ;Lyyds/ᛴᲀᛷᛷ;)V

    .line 1638
    .line 1639
    .line 1640
    goto :goto_24

    .line 1641
    :cond_41
    iget-object v7, v3, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 1642
    .line 1643
    invoke-virtual {v7, v5}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 1644
    .line 1645
    .line 1646
    iget-object v7, v6, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1647
    .line 1648
    check-cast v7, Lyyds/ᲀᲀᛵᲈ;

    .line 1649
    .line 1650
    iget-object v7, v7, Lyyds/ᲀᲀᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛷᛳᛷ;

    .line 1651
    .line 1652
    invoke-interface {v7}, Lyyds/ᛷᛷᛳᛷ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v7

    .line 1656
    int-to-long v8, v5

    .line 1657
    invoke-virtual {v7, v8, v9}, Lyyds/ᲈᲁᛴᛲ;->ᛶᛷᛲᲁ(J)Lyyds/ᲈᲁᛴᛲ;

    .line 1658
    .line 1659
    .line 1660
    iget-object v5, v6, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 1661
    .line 1662
    check-cast v5, Lyyds/ᲈᲇᛲᛴ;

    .line 1663
    .line 1664
    iget-object v5, v5, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 1665
    .line 1666
    invoke-interface {v5}, Lyyds/ᲀᛳᲇᲁ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v5

    .line 1670
    iget v7, v1, Lyyds/ᲇᲁᲁᲈ;->ᛱᲈᲁ:I

    .line 1671
    .line 1672
    int-to-long v7, v7

    .line 1673
    invoke-virtual {v5, v7, v8}, Lyyds/ᲈᲁᛴᛲ;->ᛶᛷᛲᲁ(J)Lyyds/ᲈᲁᛴᛲ;

    .line 1674
    .line 1675
    .line 1676
    new-instance v5, Lyyds/ᛱᛷᛳᛳ;

    .line 1677
    .line 1678
    invoke-direct {v5, v4, v3, v6}, Lyyds/ᛱᛷᛳᛳ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᛷᛷᲈᛸ;Lyyds/ᛳᛷᲀᛴ;)V

    .line 1679
    .line 1680
    .line 1681
    :goto_24
    new-instance v3, Lyyds/ᲀᲇᛶᲇ;

    .line 1682
    .line 1683
    invoke-direct {v3, v2, v0, v5}, Lyyds/ᲀᲇᛶᲇ;-><init>(Lyyds/ᲈᲀᛱᛷ;Lyyds/ᛵᛱᲈᛳ;Lyyds/ᲀᲇᲇᛵ;)V

    .line 1684
    .line 1685
    .line 1686
    iput-object v3, v2, Lyyds/ᲈᲀᛱᛷ;->ᛲᛲᲈᲈ:Lyyds/ᲀᲇᛶᲇ;

    .line 1687
    .line 1688
    iput-object v3, v2, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 1689
    .line 1690
    monitor-enter v2

    .line 1691
    const/4 v5, 0x1

    .line 1692
    :try_start_b
    iput-boolean v5, v2, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 1693
    .line 1694
    iput-boolean v5, v2, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1695
    .line 1696
    monitor-exit v2

    .line 1697
    iget-boolean v0, v2, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z

    .line 1698
    .line 1699
    if-nez v0, :cond_42

    .line 1700
    .line 1701
    const v0, 0x1ffffd

    .line 1702
    .line 1703
    .line 1704
    const/4 v9, 0x0

    .line 1705
    const/4 v11, 0x0

    .line 1706
    invoke-static {v1, v11, v3, v9, v0}, Lyyds/ᲇᲁᲁᲈ;->ᛲᲈᲁ(Lyyds/ᲇᲁᲁᲈ;ILyyds/ᲀᲇᛶᲇ;Lyyds/ᲀᲁᲁ;I)Lyyds/ᲇᲁᲁᲈ;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    iget-object v1, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲁᲁ;

    .line 1711
    .line 1712
    invoke-virtual {v0, v1}, Lyyds/ᲇᲁᲁᲈ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲁᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v5

    .line 1716
    goto :goto_25

    .line 1717
    :cond_42
    const/4 v9, 0x0

    .line 1718
    const-string v0, "Canceled"

    .line 1719
    .line 1720
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 1721
    .line 1722
    .line 1723
    move-object v5, v9

    .line 1724
    :goto_25
    return-object v5

    .line 1725
    :catchall_4
    move-exception v0

    .line 1726
    monitor-exit v2

    .line 1727
    throw v0

    .line 1728
    :catchall_5
    move-exception v0

    .line 1729
    goto :goto_26

    .line 1730
    :cond_43
    :try_start_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1731
    .line 1732
    const-string v1, "Check failed."

    .line 1733
    .line 1734
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1735
    .line 1736
    .line 1737
    throw v0

    .line 1738
    :cond_44
    const-string v0, "released"

    .line 1739
    .line 1740
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1741
    .line 1742
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 1746
    :goto_26
    monitor-exit v2

    .line 1747
    throw v0

    .line 1748
    :pswitch_3
    const/4 v9, 0x0

    .line 1749
    const-string v2, "close"

    .line 1750
    .line 1751
    const-string v3, "upgrade"

    .line 1752
    .line 1753
    const-string v4, "Connection"

    .line 1754
    .line 1755
    iget-object v11, v1, Lyyds/ᲇᲁᲁᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲇᛶᲇ;

    .line 1756
    .line 1757
    iget-object v1, v1, Lyyds/ᲇᲁᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲁᲁ;

    .line 1758
    .line 1759
    iget-object v0, v1, Lyyds/ᲀᲁᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛸᲀᛵ;

    .line 1760
    .line 1761
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1762
    .line 1763
    .line 1764
    move-result-wide v5

    .line 1765
    iget-object v7, v1, Lyyds/ᲀᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 1766
    .line 1767
    invoke-static {v7}, Lyyds/ᛳᛵᲀ;->ᛱᲈᲁ(Ljava/lang/String;)Z

    .line 1768
    .line 1769
    .line 1770
    move-result v7

    .line 1771
    if-eqz v7, :cond_45

    .line 1772
    .line 1773
    if-eqz v0, :cond_45

    .line 1774
    .line 1775
    const/4 v7, 0x1

    .line 1776
    goto :goto_27

    .line 1777
    :cond_45
    const/4 v7, 0x0

    .line 1778
    :goto_27
    iget-object v8, v1, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 1779
    .line 1780
    invoke-virtual {v8, v4}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v8

    .line 1784
    invoke-virtual {v3, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1785
    .line 1786
    .line 1787
    move-result v8

    .line 1788
    :try_start_d
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5

    .line 1789
    .line 1790
    .line 1791
    :try_start_e
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1792
    .line 1793
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 1794
    .line 1795
    iget-object v10, v10, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1796
    .line 1797
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1798
    .line 1799
    .line 1800
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v10, Lyyds/ᲀᲇᲇᛵ;

    .line 1803
    .line 1804
    invoke-interface {v10, v1}, Lyyds/ᲀᲇᲇᛵ;->ᛲᲈᲁ(Lyyds/ᲀᲁᲁ;)V

    .line 1805
    .line 1806
    .line 1807
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1808
    .line 1809
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 1810
    .line 1811
    iget-object v10, v10, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1812
    .line 1813
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7

    .line 1814
    .line 1815
    .line 1816
    if-eqz v7, :cond_49

    .line 1817
    .line 1818
    :try_start_f
    const-string v7, "100-continue"

    .line 1819
    .line 1820
    const-string v10, "Expect"

    .line 1821
    .line 1822
    iget-object v12, v1, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 1823
    .line 1824
    invoke-virtual {v12, v10}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v10

    .line 1828
    invoke-virtual {v7, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1829
    .line 1830
    .line 1831
    move-result v7
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5

    .line 1832
    if-eqz v7, :cond_46

    .line 1833
    .line 1834
    :try_start_10
    iget-object v7, v11, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1835
    .line 1836
    check-cast v7, Lyyds/ᲀᲇᲇᛵ;

    .line 1837
    .line 1838
    invoke-interface {v7}, Lyyds/ᲀᲇᲇᛵ;->ᲇᲈᛵᛷ()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_3

    .line 1839
    .line 1840
    .line 1841
    const/4 v7, 0x1

    .line 1842
    :try_start_11
    invoke-virtual {v11, v7}, Lyyds/ᲀᲇᛶᲇ;->ᲇᲇᲇᛱ(Z)Lyyds/ᲁᛸᛶᛲ;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v10
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_2

    .line 1846
    :try_start_12
    iget-object v12, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1847
    .line 1848
    check-cast v12, Lyyds/ᲈᲀᛱᛷ;

    .line 1849
    .line 1850
    iget-object v12, v12, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1851
    .line 1852
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_1

    .line 1853
    .line 1854
    .line 1855
    move-object/from16 v17, v10

    .line 1856
    .line 1857
    const/16 v18, 0x0

    .line 1858
    .line 1859
    goto :goto_29

    .line 1860
    :catch_1
    move-exception v0

    .line 1861
    move/from16 v18, v7

    .line 1862
    .line 1863
    move-object/from16 v17, v10

    .line 1864
    .line 1865
    goto/16 :goto_2c

    .line 1866
    .line 1867
    :catch_2
    move-exception v0

    .line 1868
    :goto_28
    move/from16 v18, v7

    .line 1869
    .line 1870
    move-object/from16 v17, v9

    .line 1871
    .line 1872
    goto/16 :goto_2c

    .line 1873
    .line 1874
    :catch_3
    move-exception v0

    .line 1875
    const/4 v7, 0x1

    .line 1876
    :try_start_13
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1877
    .line 1878
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 1879
    .line 1880
    iget-object v10, v10, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1881
    .line 1882
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1883
    .line 1884
    .line 1885
    invoke-virtual {v11, v0}, Lyyds/ᲀᲇᛶᲇ;->ᛶᛷᛲᲁ(Ljava/io/IOException;)V

    .line 1886
    .line 1887
    .line 1888
    throw v0
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_2

    .line 1889
    :cond_46
    const/4 v7, 0x1

    .line 1890
    move/from16 v18, v7

    .line 1891
    .line 1892
    move-object/from16 v17, v9

    .line 1893
    .line 1894
    :goto_29
    if-nez v17, :cond_47

    .line 1895
    .line 1896
    :try_start_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1897
    .line 1898
    .line 1899
    iget-object v10, v1, Lyyds/ᲀᲁᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛸᲀᛵ;

    .line 1900
    .line 1901
    invoke-virtual {v10}, Lyyds/ᛳᛸᲀᛵ;->ᛲᲈᲁ()J

    .line 1902
    .line 1903
    .line 1904
    move-result-wide v13

    .line 1905
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1906
    .line 1907
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 1908
    .line 1909
    iget-object v10, v10, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 1910
    .line 1911
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1912
    .line 1913
    .line 1914
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1915
    .line 1916
    check-cast v10, Lyyds/ᲀᲇᲇᛵ;

    .line 1917
    .line 1918
    invoke-interface {v10, v1, v13, v14}, Lyyds/ᲀᲇᲇᛵ;->ᛶᛷᛲᲁ(Lyyds/ᲀᲁᲁ;J)Lyyds/ᲀᛳᲇᲁ;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v12

    .line 1922
    new-instance v10, Lyyds/ᛷᲈᲀᛴ;

    .line 1923
    .line 1924
    const/4 v15, 0x0

    .line 1925
    invoke-direct/range {v10 .. v15}, Lyyds/ᛷᲈᲀᛴ;-><init>(Lyyds/ᲀᲇᛶᲇ;Lyyds/ᲀᛳᲇᲁ;JZ)V

    .line 1926
    .line 1927
    .line 1928
    new-instance v12, Lyyds/ᲈᲇᛲᛴ;

    .line 1929
    .line 1930
    invoke-direct {v12, v10}, Lyyds/ᲈᲇᛲᛴ;-><init>(Lyyds/ᲀᛳᲇᲁ;)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v0, v12}, Lyyds/ᛳᛸᲀᛵ;->ᲀᛲᛳᲀ(Lyyds/ᲈᲇᛲᛴ;)V

    .line 1934
    .line 1935
    .line 1936
    invoke-virtual {v12}, Lyyds/ᲈᲇᛲᛴ;->close()V

    .line 1937
    .line 1938
    .line 1939
    goto :goto_2b

    .line 1940
    :catch_4
    move-exception v0

    .line 1941
    goto :goto_2c

    .line 1942
    :cond_47
    iget-object v0, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1943
    .line 1944
    move-object v10, v0

    .line 1945
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 1946
    .line 1947
    const/4 v14, 0x0

    .line 1948
    const/4 v15, 0x0

    .line 1949
    const/16 v16, 0x0

    .line 1950
    .line 1951
    const/4 v12, 0x1

    .line 1952
    const/4 v13, 0x0

    .line 1953
    invoke-virtual/range {v10 .. v16}, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ(Lyyds/ᲀᲇᛶᲇ;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 1954
    .line 1955
    .line 1956
    invoke-virtual {v11}, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v0

    .line 1960
    iget-object v0, v0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

    .line 1961
    .line 1962
    if-eqz v0, :cond_48

    .line 1963
    .line 1964
    move v0, v7

    .line 1965
    goto :goto_2a

    .line 1966
    :cond_48
    const/4 v0, 0x0

    .line 1967
    :goto_2a
    if-nez v0, :cond_4a

    .line 1968
    .line 1969
    iget-object v0, v11, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1970
    .line 1971
    check-cast v0, Lyyds/ᲀᲇᲇᛵ;

    .line 1972
    .line 1973
    invoke-interface {v0}, Lyyds/ᲀᲇᲇᛵ;->ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v0

    .line 1977
    invoke-interface {v0}, Lyyds/ᛷᛷᲈᛸ;->ᛱᲈᲁ()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_4

    .line 1978
    .line 1979
    .line 1980
    goto :goto_2b

    .line 1981
    :catch_5
    move-exception v0

    .line 1982
    const/4 v7, 0x1

    .line 1983
    goto :goto_28

    .line 1984
    :cond_49
    const/4 v7, 0x1

    .line 1985
    :try_start_15
    iget-object v0, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1986
    .line 1987
    move-object v10, v0

    .line 1988
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 1989
    .line 1990
    const/4 v14, 0x0

    .line 1991
    const/4 v15, 0x0

    .line 1992
    const/16 v16, 0x0

    .line 1993
    .line 1994
    const/4 v12, 0x1

    .line 1995
    const/4 v13, 0x0

    .line 1996
    invoke-virtual/range {v10 .. v16}, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ(Lyyds/ᲀᲇᛶᲇ;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_2

    .line 1997
    .line 1998
    .line 1999
    move/from16 v18, v7

    .line 2000
    .line 2001
    move-object/from16 v17, v9

    .line 2002
    .line 2003
    :cond_4a
    :goto_2b
    :try_start_16
    iget-object v0, v11, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2004
    .line 2005
    check-cast v0, Lyyds/ᲀᲇᲇᛵ;

    .line 2006
    .line 2007
    invoke-interface {v0}, Lyyds/ᲀᲇᲇᛵ;->ᛵᛸᛸᛷ()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_6

    .line 2008
    .line 2009
    .line 2010
    move-object v10, v9

    .line 2011
    goto :goto_2d

    .line 2012
    :catch_6
    move-exception v0

    .line 2013
    :try_start_17
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 2014
    .line 2015
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 2016
    .line 2017
    iget-object v10, v10, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 2018
    .line 2019
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2020
    .line 2021
    .line 2022
    invoke-virtual {v11, v0}, Lyyds/ᲀᲇᛶᲇ;->ᛶᛷᛲᲁ(Ljava/io/IOException;)V

    .line 2023
    .line 2024
    .line 2025
    throw v0
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_4

    .line 2026
    :catch_7
    move-exception v0

    .line 2027
    const/4 v7, 0x1

    .line 2028
    :try_start_18
    iget-object v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 2029
    .line 2030
    check-cast v10, Lyyds/ᲈᲀᛱᛷ;

    .line 2031
    .line 2032
    iget-object v10, v10, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 2033
    .line 2034
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2035
    .line 2036
    .line 2037
    invoke-virtual {v11, v0}, Lyyds/ᲀᲇᛶᲇ;->ᛶᛷᛲᲁ(Ljava/io/IOException;)V

    .line 2038
    .line 2039
    .line 2040
    throw v0
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_2

    .line 2041
    :goto_2c
    instance-of v10, v0, Lyyds/ᛷᛲᛷᲀ;

    .line 2042
    .line 2043
    if-nez v10, :cond_5e

    .line 2044
    .line 2045
    iget-boolean v10, v11, Lyyds/ᲀᲇᛶᲇ;->ᛲᲈᲁ:Z

    .line 2046
    .line 2047
    if-eqz v10, :cond_5d

    .line 2048
    .line 2049
    move-object v10, v0

    .line 2050
    :goto_2d
    if-nez v17, :cond_4b

    .line 2051
    .line 2052
    const/4 v12, 0x0

    .line 2053
    :try_start_19
    invoke-virtual {v11, v12}, Lyyds/ᲀᲇᛶᲇ;->ᲇᲇᲇᛱ(Z)Lyyds/ᲁᛸᛶᛲ;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v17

    .line 2057
    if-eqz v18, :cond_4b

    .line 2058
    .line 2059
    iget-object v0, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 2060
    .line 2061
    check-cast v0, Lyyds/ᲈᲀᛱᛷ;

    .line 2062
    .line 2063
    iget-object v0, v0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 2064
    .line 2065
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2066
    .line 2067
    .line 2068
    move-object/from16 v0, v17

    .line 2069
    .line 2070
    const/16 v18, 0x0

    .line 2071
    .line 2072
    goto :goto_2e

    .line 2073
    :cond_4b
    move-object/from16 v0, v17

    .line 2074
    .line 2075
    goto :goto_2e

    .line 2076
    :catch_8
    move-exception v0

    .line 2077
    goto/16 :goto_38

    .line 2078
    .line 2079
    :goto_2e
    iput-object v1, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲁ;

    .line 2080
    .line 2081
    invoke-virtual {v11}, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v12

    .line 2085
    iget-object v12, v12, Lyyds/ᲈᛸᲀᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛴᛴ;

    .line 2086
    .line 2087
    iput-object v12, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲈᛴᛴ;

    .line 2088
    .line 2089
    iput-wide v5, v0, Lyyds/ᲁᛸᛶᛲ;->ᛷᛵᲇᲀ:J

    .line 2090
    .line 2091
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2092
    .line 2093
    .line 2094
    move-result-wide v12

    .line 2095
    iput-wide v12, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᛲᲈᲈ:J

    .line 2096
    .line 2097
    invoke-virtual {v0}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v0

    .line 2101
    iget v12, v0, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 2102
    .line 2103
    :goto_2f
    const/16 v13, 0x64

    .line 2104
    .line 2105
    if-ne v12, v13, :cond_4c

    .line 2106
    .line 2107
    :goto_30
    const/4 v13, 0x0

    .line 2108
    goto :goto_31

    .line 2109
    :cond_4c
    const/16 v13, 0x66

    .line 2110
    .line 2111
    if-gt v13, v12, :cond_4e

    .line 2112
    .line 2113
    const/16 v13, 0xc8

    .line 2114
    .line 2115
    if-ge v12, v13, :cond_4e

    .line 2116
    .line 2117
    goto :goto_30

    .line 2118
    :goto_31
    invoke-virtual {v11, v13}, Lyyds/ᲀᲇᛶᲇ;->ᲇᲇᲇᛱ(Z)Lyyds/ᲁᛸᛶᛲ;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v0

    .line 2122
    if-eqz v18, :cond_4d

    .line 2123
    .line 2124
    iget-object v12, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 2125
    .line 2126
    check-cast v12, Lyyds/ᲈᲀᛱᛷ;

    .line 2127
    .line 2128
    iget-object v12, v12, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 2129
    .line 2130
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2131
    .line 2132
    .line 2133
    :cond_4d
    iput-object v1, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ:Lyyds/ᲀᲁᲁ;

    .line 2134
    .line 2135
    invoke-virtual {v11}, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v12

    .line 2139
    iget-object v12, v12, Lyyds/ᲈᛸᲀᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛴᛴ;

    .line 2140
    .line 2141
    iput-object v12, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲈᛴᛴ;

    .line 2142
    .line 2143
    iput-wide v5, v0, Lyyds/ᲁᛸᛶᛲ;->ᛷᛵᲇᲀ:J

    .line 2144
    .line 2145
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2146
    .line 2147
    .line 2148
    move-result-wide v14

    .line 2149
    iput-wide v14, v0, Lyyds/ᲁᛸᛶᛲ;->ᛲᛲᲈᲈ:J

    .line 2150
    .line 2151
    invoke-virtual {v0}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v0

    .line 2155
    iget v12, v0, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 2156
    .line 2157
    goto :goto_2f

    .line 2158
    :cond_4e
    const/4 v13, 0x0

    .line 2159
    iget-object v1, v11, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 2160
    .line 2161
    check-cast v1, Lyyds/ᲈᲀᛱᛷ;

    .line 2162
    .line 2163
    iget-object v1, v1, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 2164
    .line 2165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2166
    .line 2167
    .line 2168
    const/16 v1, 0x65

    .line 2169
    .line 2170
    if-ne v12, v1, :cond_4f

    .line 2171
    .line 2172
    move v1, v7

    .line 2173
    goto :goto_32

    .line 2174
    :cond_4f
    move v1, v13

    .line 2175
    :goto_32
    if-eqz v1, :cond_52

    .line 2176
    .line 2177
    invoke-virtual {v11}, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v5

    .line 2181
    iget-object v5, v5, Lyyds/ᲈᛸᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

    .line 2182
    .line 2183
    if-eqz v5, :cond_50

    .line 2184
    .line 2185
    move v5, v7

    .line 2186
    goto :goto_33

    .line 2187
    :cond_50
    move v5, v13

    .line 2188
    :goto_33
    if-nez v5, :cond_51

    .line 2189
    .line 2190
    goto :goto_34

    .line 2191
    :cond_51
    new-instance v0, Ljava/net/ProtocolException;

    .line 2192
    .line 2193
    const-string v1, "Unexpected 101 code on HTTP/2 connection"

    .line 2194
    .line 2195
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 2196
    .line 2197
    .line 2198
    throw v0

    .line 2199
    :cond_52
    :goto_34
    if-eqz v1, :cond_54

    .line 2200
    .line 2201
    iget-object v1, v0, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 2202
    .line 2203
    invoke-virtual {v1, v4}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v1

    .line 2207
    if-nez v1, :cond_53

    .line 2208
    .line 2209
    move-object v1, v9

    .line 2210
    :cond_53
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 2211
    .line 2212
    .line 2213
    move-result v1

    .line 2214
    if-eqz v1, :cond_54

    .line 2215
    .line 2216
    move v3, v7

    .line 2217
    goto :goto_35

    .line 2218
    :cond_54
    move v3, v13

    .line 2219
    :goto_35
    if-eqz v8, :cond_55

    .line 2220
    .line 2221
    if-eqz v3, :cond_55

    .line 2222
    .line 2223
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->ᛲᲈᲁ()Lyyds/ᲁᛸᛶᛲ;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v1

    .line 2227
    new-instance v3, Lyyds/ᛸᛸᛱᲀ;

    .line 2228
    .line 2229
    iget-object v5, v0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 2230
    .line 2231
    invoke-virtual {v5}, Lyyds/ᛲᛶᲀ;->ᛷᲈᲈᲁ()Lyyds/ᛴᛲᲁᲈ;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v5

    .line 2235
    iget-object v0, v0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 2236
    .line 2237
    invoke-virtual {v0}, Lyyds/ᛲᛶᲀ;->ᛶᛷᛲᲁ()J

    .line 2238
    .line 2239
    .line 2240
    move-result-wide v6

    .line 2241
    invoke-direct {v3, v5, v6, v7}, Lyyds/ᛸᛸᛱᲀ;-><init>(Lyyds/ᛴᛲᲁᲈ;J)V

    .line 2242
    .line 2243
    .line 2244
    iput-object v3, v1, Lyyds/ᲁᛸᛶᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛶᲀ;

    .line 2245
    .line 2246
    invoke-virtual {v11}, Lyyds/ᲀᲇᛶᲇ;->ᛱᲈᲁ()Lyyds/ᲀᲈᛶᲈ;

    .line 2247
    .line 2248
    .line 2249
    move-result-object v0

    .line 2250
    iput-object v0, v1, Lyyds/ᲁᛸᛶᛲ;->ᛱᲈᲁ:Lyyds/ᲁᛸᛶᲁ;

    .line 2251
    .line 2252
    invoke-virtual {v1}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v0

    .line 2256
    goto :goto_36

    .line 2257
    :cond_55
    invoke-virtual {v11, v0}, Lyyds/ᲀᲇᛶᲇ;->ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛳᛶᲈᲈ;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v1

    .line 2261
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->ᛲᲈᲁ()Lyyds/ᲁᛸᛶᛲ;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v0

    .line 2265
    iput-object v1, v0, Lyyds/ᲁᛸᛶᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛶᲀ;

    .line 2266
    .line 2267
    new-instance v1, Lyyds/ᛲᲁᲈ;

    .line 2268
    .line 2269
    const/16 v3, 0xa

    .line 2270
    .line 2271
    invoke-direct {v1, v3}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 2272
    .line 2273
    .line 2274
    iput-object v1, v0, Lyyds/ᲁᛸᛶᛲ;->ᛳᲁᲁᲇ:Lyyds/ᛶᲀᲁᛲ;

    .line 2275
    .line 2276
    invoke-virtual {v0}, Lyyds/ᲁᛸᛶᛲ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛷᲁ;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v0

    .line 2280
    :goto_36
    iget-object v1, v0, Lyyds/ᛴᛴᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲁᲁ;

    .line 2281
    .line 2282
    iget-object v1, v1, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 2283
    .line 2284
    invoke-virtual {v1, v4}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v1

    .line 2288
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 2289
    .line 2290
    .line 2291
    move-result v1

    .line 2292
    if-nez v1, :cond_57

    .line 2293
    .line 2294
    iget-object v1, v0, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 2295
    .line 2296
    invoke-virtual {v1, v4}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v1

    .line 2300
    if-nez v1, :cond_56

    .line 2301
    .line 2302
    move-object v5, v9

    .line 2303
    goto :goto_37

    .line 2304
    :cond_56
    move-object v5, v1

    .line 2305
    :goto_37
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 2306
    .line 2307
    .line 2308
    move-result v1

    .line 2309
    if-eqz v1, :cond_58

    .line 2310
    .line 2311
    :cond_57
    iget-object v1, v11, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2312
    .line 2313
    check-cast v1, Lyyds/ᲀᲇᲇᛵ;

    .line 2314
    .line 2315
    invoke-interface {v1}, Lyyds/ᲀᲇᲇᛵ;->ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v1

    .line 2319
    invoke-interface {v1}, Lyyds/ᛷᛷᲈᛸ;->ᛱᲈᲁ()V

    .line 2320
    .line 2321
    .line 2322
    :cond_58
    const/16 v1, 0xcc

    .line 2323
    .line 2324
    if-eq v12, v1, :cond_59

    .line 2325
    .line 2326
    const/16 v1, 0xcd

    .line 2327
    .line 2328
    if-ne v12, v1, :cond_5a

    .line 2329
    .line 2330
    :cond_59
    iget-object v1, v0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 2331
    .line 2332
    invoke-virtual {v1}, Lyyds/ᛲᛶᲀ;->ᛶᛷᛲᲁ()J

    .line 2333
    .line 2334
    .line 2335
    move-result-wide v1

    .line 2336
    const-wide/16 v3, 0x0

    .line 2337
    .line 2338
    cmp-long v1, v1, v3

    .line 2339
    .line 2340
    if-gtz v1, :cond_5b

    .line 2341
    .line 2342
    :cond_5a
    return-object v0

    .line 2343
    :cond_5b
    new-instance v1, Ljava/net/ProtocolException;

    .line 2344
    .line 2345
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2346
    .line 2347
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2348
    .line 2349
    .line 2350
    const-string v3, "HTTP "

    .line 2351
    .line 2352
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2353
    .line 2354
    .line 2355
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2356
    .line 2357
    .line 2358
    const-string v3, " had non-zero Content-Length: "

    .line 2359
    .line 2360
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2361
    .line 2362
    .line 2363
    iget-object v0, v0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 2364
    .line 2365
    invoke-virtual {v0}, Lyyds/ᛲᛶᲀ;->ᛶᛷᛲᲁ()J

    .line 2366
    .line 2367
    .line 2368
    move-result-wide v3

    .line 2369
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2370
    .line 2371
    .line 2372
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v0

    .line 2376
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 2377
    .line 2378
    .line 2379
    throw v1
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_8

    .line 2380
    :goto_38
    if-eqz v10, :cond_5c

    .line 2381
    .line 2382
    invoke-static {v10, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 2383
    .line 2384
    .line 2385
    throw v10

    .line 2386
    :cond_5c
    throw v0

    .line 2387
    :cond_5d
    throw v0

    .line 2388
    :cond_5e
    throw v0

    .line 2389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
