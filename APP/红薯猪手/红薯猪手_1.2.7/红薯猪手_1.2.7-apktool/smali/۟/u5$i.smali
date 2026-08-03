.class public final L۟/u5$i;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/u5;->ۥ۟ۧ()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "L\u06df/p0;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/q8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/q8<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:L۟/u5;


# direct methods
.method public constructor <init>(L۟/q8;L۟/u5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/q8<",
            "Ljava/lang/String;",
            ">;",
            "L\u06df/u5;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, L۟/u5$i;->ۥ:L۟/q8;

    iput-object p2, p0, L۟/u5$i;->ۥ۟:L۟/u5;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, L۟/p0;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, L۟/d1;->ۥ:L۟/kb;

    .line 23
    .line 24
    invoke-static {}, L۟/d1$b;->ۥ()L۟/x3;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/16 v0, 0xb

    .line 29
    .line 30
    new-array v0, v0, [B

    .line 31
    .line 32
    fill-array-data v0, :array_2

    .line 33
    .line 34
    .line 35
    new-array v2, v1, [B

    .line 36
    .line 37
    fill-array-data v2, :array_3

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v2, p0, L۟/u5$i;->ۥ:L۟/q8;

    .line 45
    .line 46
    iget-object v2, v2, L۟/q8;->ۥ:Ljava/lang/Object;

    .line 47
    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "/Download"

    .line 57
    .line 58
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {p1, v0, v2}, L۟/x3;->ۥ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v0, Ljava/io/File;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    const-string v2, ""

    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    array-length v0, p1

    .line 91
    const/4 v5, 0x0

    .line 92
    :goto_0
    if-ge v5, v0, :cond_1

    .line 93
    .line 94
    aget-object v6, p1, v5

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    const/16 v8, 0xc

    .line 101
    .line 102
    new-array v9, v8, [B

    .line 103
    .line 104
    fill-array-data v9, :array_4

    .line 105
    .line 106
    .line 107
    new-array v10, v1, [B

    .line 108
    .line 109
    fill-array-data v10, :array_5

    .line 110
    .line 111
    .line 112
    invoke-static {v9, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-static {v9, v7}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-array v8, v8, [B

    .line 120
    .line 121
    fill-array-data v8, :array_6

    .line 122
    .line 123
    .line 124
    new-array v9, v1, [B

    .line 125
    .line 126
    fill-array-data v9, :array_7

    .line 127
    .line 128
    .line 129
    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-static {v7, v8}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_0

    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    cmp-long v7, v7, v3

    .line 144
    .line 145
    if-lez v7, :cond_0

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const/16 v3, 0x14

    .line 152
    .line 153
    new-array v3, v3, [B

    .line 154
    .line 155
    fill-array-data v3, :array_8

    .line 156
    .line 157
    .line 158
    new-array v4, v1, [B

    .line 159
    .line 160
    fill-array-data v4, :array_9

    .line 161
    .line 162
    .line 163
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {v3, v2}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    .line 171
    .line 172
    .line 173
    move-result-wide v3

    .line 174
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_1
    move-object v9, v2

    .line 178
    new-instance p1, L۟/b2;

    .line 179
    .line 180
    iget-object v0, p0, L۟/u5$i;->ۥ۟:L۟/u5;

    .line 181
    .line 182
    iget-object v7, v0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 183
    .line 184
    new-array v0, v1, [B

    .line 185
    .line 186
    fill-array-data v0, :array_a

    .line 187
    .line 188
    .line 189
    new-array v2, v1, [B

    .line 190
    .line 191
    fill-array-data v2, :array_b

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    const/16 v0, 0x1b

    .line 199
    .line 200
    new-array v0, v0, [B

    .line 201
    .line 202
    fill-array-data v0, :array_c

    .line 203
    .line 204
    .line 205
    new-array v1, v1, [B

    .line 206
    .line 207
    fill-array-data v1, :array_d

    .line 208
    .line 209
    .line 210
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    new-instance v11, L۟/x5;

    .line 215
    .line 216
    iget-object v0, p0, L۟/u5$i;->ۥ۟:L۟/u5;

    .line 217
    .line 218
    invoke-direct {v11, v0}, L۟/x5;-><init>(L۟/u5;)V

    .line 219
    .line 220
    .line 221
    move-object v6, p1

    .line 222
    invoke-direct/range {v6 .. v11}, L۟/b2;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L۟/g3;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, L۟/ya;->show()V

    .line 226
    .line 227
    .line 228
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 229
    .line 230
    return-object p1

    .line 231
    :array_0
    .array-data 1
        0x1ct
        0x18t
    .end array-data

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    nop

    .line 237
    :array_1
    .array-data 1
        0x75t
        0x6ct
        0x42t
        -0x65t
        -0x39t
        -0x3ct
    .end array-data

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    nop

    .line 245
    :array_2
    .array-data 1
        -0x6dt
        -0x54t
        -0x27t
        -0x4ft
        -0x9t
        -0x4ft
        -0x57t
        -0x5ct
        -0x38t
        -0x56t
        -0x13t
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    :array_3
    .array-data 1
        -0xat
        -0x2ct
        -0x57t
        -0x22t
        -0x7bt
        -0x3bt
    .end array-data

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    nop

    .line 263
    :array_4
    .array-data 1
        0x3bt
        0x11t
        0xet
        -0x61t
        0x4ft
        -0x36t
        0x39t
        0x5ct
        0x54t
        -0x1t
        0x0t
        -0x72t
    .end array-data

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    :array_5
    .array-data 1
        0x5ct
        0x74t
        0x7at
        -0x2ft
        0x2et
        -0x59t
    .end array-data

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    nop

    .line 281
    :array_6
    .array-data 1
        0x66t
        0x1bt
        0x7at
        0x3et
        0x29t
        0x2t
        0x66t
        0x2dt
        0x72t
        0x30t
        0x36t
        0x26t
    .end array-data

    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    :array_7
    .array-data 1
        -0x7ft
        -0x5ft
        -0x28t
        -0x2at
        -0x41t
        -0x53t
    .end array-data

    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    nop

    .line 299
    :array_8
    .array-data 1
        0x47t
        -0x66t
        -0x75t
        0x2ft
        -0x2bt
        0x2bt
        0x4ft
        -0x6dt
        -0x76t
        0x1at
        -0x2et
        0x8t
        0x41t
        -0x75t
        -0x69t
        0x46t
        -0x67t
        0x76t
        0xet
        -0x2at
    .end array-data

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    :array_9
    .array-data 1
        0x20t
        -0x1t
        -0x1t
        0x6et
        -0x49t
        0x58t
    .end array-data

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    nop

    .line 321
    :array_a
    .array-data 1
        -0x6et
        0x53t
        0x5t
        -0x5ct
        0x6t
        0x5bt
    .end array-data

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    nop

    .line 329
    :array_b
    .array-data 1
        0x77t
        -0x4t
        -0x47t
        0x41t
        -0x7dt
        -0x2t
    .end array-data

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    nop

    .line 337
    :array_c
    .array-data 1
        -0x11t
        -0x66t
        0x35t
        0x5bt
        -0x3et
        0x2at
        -0x20t
        -0x77t
        0x3ft
        0x58t
        -0x3ct
        0x32t
        -0x1ft
        -0x7bt
        0x3ct
        0x59t
        -0x2ft
        0x8t
        -0x20t
        -0x76t
        0xct
        0x54t
        -0x38t
        0x2bt
        -0x1dt
        -0x5ft
        0x3ct
    .end array-data

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    :array_d
    .array-data 1
        0x6t
        0x1ft
        -0x48t
        -0x44t
        0x7ft
        -0x7ct
    .end array-data
.end method
