.class public final enum Lf5/a;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum l:Lf5/a;

.field public static final enum m:Lf5/a;

.field public static final n:[Lf5/a;

.field public static final o:Ljava/util/HashMap;

.field public static final synthetic p:[Lf5/a;


# instance fields
.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 1
    new-instance v0, Lf5/a;

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    const/4 v7, 0x1

    .line 5
    const-string v1, "PUBLIC"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const-string v4, "public"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    invoke-direct/range {v0 .. v7}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lf5/a;

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    const-string v2, "PRIVATE"

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    const-string v5, "private"

    .line 22
    .line 23
    invoke-direct/range {v1 .. v8}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lf5/a;

    .line 27
    .line 28
    const/4 v9, 0x1

    .line 29
    const-string v3, "PROTECTED"

    .line 30
    .line 31
    const/4 v5, 0x4

    .line 32
    const-string v6, "protected"

    .line 33
    .line 34
    invoke-direct/range {v2 .. v9}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Lf5/a;

    .line 38
    .line 39
    const/4 v10, 0x1

    .line 40
    const-string v4, "STATIC"

    .line 41
    .line 42
    const/4 v5, 0x3

    .line 43
    const/16 v6, 0x8

    .line 44
    .line 45
    const-string v7, "static"

    .line 46
    .line 47
    invoke-direct/range {v3 .. v10}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 48
    .line 49
    .line 50
    sput-object v3, Lf5/a;->l:Lf5/a;

    .line 51
    .line 52
    new-instance v4, Lf5/a;

    .line 53
    .line 54
    const/4 v11, 0x1

    .line 55
    const-string v5, "FINAL"

    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    const/16 v7, 0x10

    .line 59
    .line 60
    const-string v8, "final"

    .line 61
    .line 62
    invoke-direct/range {v4 .. v11}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 63
    .line 64
    .line 65
    sput-object v4, Lf5/a;->m:Lf5/a;

    .line 66
    .line 67
    new-instance v5, Lf5/a;

    .line 68
    .line 69
    const/4 v12, 0x0

    .line 70
    const-string v6, "SYNCHRONIZED"

    .line 71
    .line 72
    const/4 v7, 0x5

    .line 73
    const/16 v8, 0x20

    .line 74
    .line 75
    const-string v9, "synchronized"

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    invoke-direct/range {v5 .. v12}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 79
    .line 80
    .line 81
    new-instance v6, Lf5/a;

    .line 82
    .line 83
    const/4 v13, 0x1

    .line 84
    const-string v7, "VOLATILE"

    .line 85
    .line 86
    const/4 v8, 0x6

    .line 87
    const/16 v9, 0x40

    .line 88
    .line 89
    const-string v10, "volatile"

    .line 90
    .line 91
    const/4 v11, 0x0

    .line 92
    invoke-direct/range {v6 .. v13}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 93
    .line 94
    .line 95
    new-instance v7, Lf5/a;

    .line 96
    .line 97
    const/4 v14, 0x0

    .line 98
    const-string v8, "BRIDGE"

    .line 99
    .line 100
    const/4 v9, 0x7

    .line 101
    const/16 v10, 0x40

    .line 102
    .line 103
    const-string v11, "bridge"

    .line 104
    .line 105
    invoke-direct/range {v7 .. v14}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 106
    .line 107
    .line 108
    new-instance v8, Lf5/a;

    .line 109
    .line 110
    const/4 v15, 0x1

    .line 111
    const-string v9, "TRANSIENT"

    .line 112
    .line 113
    const/16 v10, 0x8

    .line 114
    .line 115
    const/16 v11, 0x80

    .line 116
    .line 117
    const-string v12, "transient"

    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    invoke-direct/range {v8 .. v15}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 121
    .line 122
    .line 123
    new-instance v9, Lf5/a;

    .line 124
    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const-string v10, "VARARGS"

    .line 128
    .line 129
    const/16 v11, 0x9

    .line 130
    .line 131
    const/16 v12, 0x80

    .line 132
    .line 133
    const-string v13, "varargs"

    .line 134
    .line 135
    invoke-direct/range {v9 .. v16}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 136
    .line 137
    .line 138
    new-instance v10, Lf5/a;

    .line 139
    .line 140
    const/16 v16, 0x1

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const-string v11, "NATIVE"

    .line 145
    .line 146
    const/16 v12, 0xa

    .line 147
    .line 148
    const/16 v13, 0x100

    .line 149
    .line 150
    const-string v14, "native"

    .line 151
    .line 152
    const/4 v15, 0x0

    .line 153
    invoke-direct/range {v10 .. v17}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 154
    .line 155
    .line 156
    new-instance v11, Lf5/a;

    .line 157
    .line 158
    const/16 v18, 0x0

    .line 159
    .line 160
    const-string v12, "INTERFACE"

    .line 161
    .line 162
    const/16 v13, 0xb

    .line 163
    .line 164
    const/16 v14, 0x200

    .line 165
    .line 166
    const-string v15, "interface"

    .line 167
    .line 168
    invoke-direct/range {v11 .. v18}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 169
    .line 170
    .line 171
    new-instance v12, Lf5/a;

    .line 172
    .line 173
    const/16 v18, 0x1

    .line 174
    .line 175
    const/16 v19, 0x0

    .line 176
    .line 177
    const-string v13, "ABSTRACT"

    .line 178
    .line 179
    const/16 v14, 0xc

    .line 180
    .line 181
    const/16 v15, 0x400

    .line 182
    .line 183
    const-string v16, "abstract"

    .line 184
    .line 185
    const/16 v17, 0x1

    .line 186
    .line 187
    invoke-direct/range {v12 .. v19}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 188
    .line 189
    .line 190
    new-instance v13, Lf5/a;

    .line 191
    .line 192
    const/16 v19, 0x1

    .line 193
    .line 194
    const/16 v20, 0x0

    .line 195
    .line 196
    const-string v14, "STRICTFP"

    .line 197
    .line 198
    const/16 v15, 0xd

    .line 199
    .line 200
    const/16 v16, 0x800

    .line 201
    .line 202
    const-string v17, "strictfp"

    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    invoke-direct/range {v13 .. v20}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 207
    .line 208
    .line 209
    new-instance v14, Lf5/a;

    .line 210
    .line 211
    const/16 v20, 0x1

    .line 212
    .line 213
    const/16 v21, 0x1

    .line 214
    .line 215
    const-string v15, "SYNTHETIC"

    .line 216
    .line 217
    const/16 v16, 0xe

    .line 218
    .line 219
    const/16 v17, 0x1000

    .line 220
    .line 221
    const-string v18, "synthetic"

    .line 222
    .line 223
    invoke-direct/range {v14 .. v21}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 224
    .line 225
    .line 226
    new-instance v16, Lf5/a;

    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    move-object/from16 v15, v16

    .line 233
    .line 234
    const-string v16, "ANNOTATION"

    .line 235
    .line 236
    const/16 v17, 0xf

    .line 237
    .line 238
    const/16 v18, 0x2000

    .line 239
    .line 240
    const-string v19, "annotation"

    .line 241
    .line 242
    invoke-direct/range {v15 .. v22}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 243
    .line 244
    .line 245
    new-instance v16, Lf5/a;

    .line 246
    .line 247
    const/16 v23, 0x1

    .line 248
    .line 249
    const-string v17, "ENUM"

    .line 250
    .line 251
    const/16 v18, 0x10

    .line 252
    .line 253
    const/16 v19, 0x4000

    .line 254
    .line 255
    const-string v20, "enum"

    .line 256
    .line 257
    const/16 v21, 0x1

    .line 258
    .line 259
    invoke-direct/range {v16 .. v23}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 260
    .line 261
    .line 262
    new-instance v17, Lf5/a;

    .line 263
    .line 264
    const/16 v24, 0x0

    .line 265
    .line 266
    const-string v18, "CONSTRUCTOR"

    .line 267
    .line 268
    const/16 v19, 0x11

    .line 269
    .line 270
    const/high16 v20, 0x10000

    .line 271
    .line 272
    const-string v21, "constructor"

    .line 273
    .line 274
    invoke-direct/range {v17 .. v24}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 275
    .line 276
    .line 277
    new-instance v18, Lf5/a;

    .line 278
    .line 279
    const/16 v24, 0x1

    .line 280
    .line 281
    const/16 v25, 0x0

    .line 282
    .line 283
    const-string v19, "DECLARED_SYNCHRONIZED"

    .line 284
    .line 285
    const/16 v20, 0x12

    .line 286
    .line 287
    const/high16 v21, 0x20000

    .line 288
    .line 289
    const-string v22, "declared-synchronized"

    .line 290
    .line 291
    const/16 v23, 0x0

    .line 292
    .line 293
    invoke-direct/range {v18 .. v25}, Lf5/a;-><init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v19, v18

    .line 297
    .line 298
    move-object/from16 v18, v17

    .line 299
    .line 300
    move-object/from16 v17, v16

    .line 301
    .line 302
    move-object/from16 v16, v15

    .line 303
    .line 304
    move-object v15, v14

    .line 305
    move-object v14, v13

    .line 306
    move-object v13, v12

    .line 307
    move-object v12, v11

    .line 308
    move-object v11, v10

    .line 309
    move-object v10, v9

    .line 310
    move-object v9, v8

    .line 311
    move-object v8, v7

    .line 312
    move-object v7, v6

    .line 313
    move-object v6, v5

    .line 314
    move-object v5, v4

    .line 315
    move-object v4, v3

    .line 316
    move-object v3, v2

    .line 317
    move-object v2, v1

    .line 318
    move-object v1, v0

    .line 319
    filled-new-array/range {v1 .. v19}, [Lf5/a;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    sput-object v0, Lf5/a;->p:[Lf5/a;

    .line 324
    .line 325
    invoke-static {}, Lf5/a;->values()[Lf5/a;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    sput-object v0, Lf5/a;->n:[Lf5/a;

    .line 330
    .line 331
    new-instance v1, Ljava/util/HashMap;

    .line 332
    .line 333
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 334
    .line 335
    .line 336
    sput-object v1, Lf5/a;->o:Ljava/util/HashMap;

    .line 337
    .line 338
    array-length v1, v0

    .line 339
    const/4 v2, 0x0

    .line 340
    :goto_0
    if-ge v2, v1, :cond_0

    .line 341
    .line 342
    aget-object v3, v0, v2

    .line 343
    .line 344
    sget-object v4, Lf5/a;->o:Ljava/util/HashMap;

    .line 345
    .line 346
    iget-object v5, v3, Lf5/a;->h:Ljava/lang/String;

    .line 347
    .line 348
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    add-int/lit8 v2, v2, 0x1

    .line 352
    .line 353
    goto :goto_0

    .line 354
    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lf5/a;->g:I

    .line 5
    .line 6
    iput-object p4, p0, Lf5/a;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p5, p0, Lf5/a;->i:Z

    .line 9
    .line 10
    iput-boolean p6, p0, Lf5/a;->j:Z

    .line 11
    .line 12
    iput-boolean p7, p0, Lf5/a;->k:Z

    .line 13
    .line 14
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf5/a;
    .locals 1

    .line 1
    const-class v0, Lf5/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf5/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lf5/a;
    .locals 1

    .line 1
    sget-object v0, Lf5/a;->p:[Lf5/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lf5/a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lf5/a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lf5/a;->g:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/a;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
