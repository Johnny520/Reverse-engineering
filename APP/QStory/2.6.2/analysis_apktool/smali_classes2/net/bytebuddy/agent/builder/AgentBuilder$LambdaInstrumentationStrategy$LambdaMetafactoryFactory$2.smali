.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$2;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;III)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;-><init>(Ljava/lang/String;IIILnet/bytebuddy/agent/builder/AgentBuilder$1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onDispatch(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 33

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/16 v6, 0x19

    .line 4
    .line 5
    const/4 v7, 0x3

    .line 6
    invoke-virtual {v0, v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 7
    .line 8
    .line 9
    const/4 v8, 0x6

    .line 10
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 11
    .line 12
    .line 13
    const/16 v9, 0x32

    .line 14
    .line 15
    invoke-virtual {v0, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 16
    .line 17
    .line 18
    const/16 v10, 0xc0

    .line 19
    .line 20
    const-string v11, "java/lang/Integer"

    .line 21
    .line 22
    invoke-virtual {v0, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v4, "()I"

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const/16 v1, 0xb6

    .line 29
    .line 30
    const-string v2, "java/lang/Integer"

    .line 31
    .line 32
    const-string v3, "intValue"

    .line 33
    .line 34
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const/16 v12, 0x36

    .line 38
    .line 39
    const/4 v13, 0x4

    .line 40
    invoke-virtual {v0, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 41
    .line 42
    .line 43
    const/4 v14, 0x7

    .line 44
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 45
    .line 46
    .line 47
    const/4 v15, 0x5

    .line 48
    invoke-virtual {v0, v12, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x15

    .line 52
    .line 53
    invoke-virtual {v0, v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 57
    .line 58
    .line 59
    const/16 v2, 0x7e

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lnet/bytebuddy/jar/asm/Label;

    .line 65
    .line 66
    invoke-direct {v3}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 67
    .line 68
    .line 69
    const/16 v4, 0x99

    .line 70
    .line 71
    invoke-virtual {v0, v4, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 78
    .line 79
    .line 80
    const/4 v5, 0x1

    .line 81
    invoke-virtual {v0, v15, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move/from16 v16, v4

    .line 91
    .line 92
    const-string v4, "()I"

    .line 93
    .line 94
    move/from16 v17, v5

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    move/from16 v18, v1

    .line 98
    .line 99
    const/16 v1, 0xb6

    .line 100
    .line 101
    move/from16 v19, v2

    .line 102
    .line 103
    const-string v2, "java/lang/Integer"

    .line 104
    .line 105
    move-object/from16 v20, v3

    .line 106
    .line 107
    const-string v3, "intValue"

    .line 108
    .line 109
    move/from16 v9, v18

    .line 110
    .line 111
    move-object/from16 v10, v20

    .line 112
    .line 113
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v12, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v9, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 120
    .line 121
    .line 122
    const/16 v1, 0xbd

    .line 123
    .line 124
    const-string v2, "java/lang/Class"

    .line 125
    .line 126
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const/16 v3, 0x3a

    .line 130
    .line 131
    invoke-virtual {v0, v3, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v9, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 147
    .line 148
    .line 149
    const-string v4, "(Ljava/lang/Object;ILjava/lang/Object;II)V"

    .line 150
    .line 151
    move/from16 v17, v1

    .line 152
    .line 153
    const/16 v1, 0xb8

    .line 154
    .line 155
    move-object/from16 v18, v2

    .line 156
    .line 157
    const-string v2, "java/lang/System"

    .line 158
    .line 159
    move/from16 v19, v3

    .line 160
    .line 161
    const-string v3, "arraycopy"

    .line 162
    .line 163
    move/from16 v6, v17

    .line 164
    .line 165
    move-object/from16 v13, v18

    .line 166
    .line 167
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v9, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 174
    .line 175
    .line 176
    const/16 v1, 0x60

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v12, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 182
    .line 183
    .line 184
    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    .line 185
    .line 186
    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 187
    .line 188
    .line 189
    const/16 v2, 0xa7

    .line 190
    .line 191
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 195
    .line 196
    .line 197
    sget-object v10, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    .line 198
    .line 199
    filled-new-array {v10, v10}, [Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    const/4 v4, 0x0

    .line 204
    const/4 v5, 0x0

    .line 205
    move-object/from16 v18, v1

    .line 206
    .line 207
    const/4 v1, 0x1

    .line 208
    move/from16 v19, v2

    .line 209
    .line 210
    const/4 v2, 0x2

    .line 211
    move-object/from16 v14, v18

    .line 212
    .line 213
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v6, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const/16 v13, 0x3a

    .line 223
    .line 224
    invoke-virtual {v0, v13, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 228
    .line 229
    .line 230
    const-string v1, "[Ljava/lang/Class;"

    .line 231
    .line 232
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    const/4 v1, 0x1

    .line 237
    const/4 v2, 0x1

    .line 238
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    const/4 v1, 0x4

    .line 242
    invoke-virtual {v0, v9, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 246
    .line 247
    .line 248
    const/16 v14, 0x7e

    .line 249
    .line 250
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 251
    .line 252
    .line 253
    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    .line 254
    .line 255
    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 256
    .line 257
    .line 258
    const/16 v2, 0x99

    .line 259
    .line 260
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 261
    .line 262
    .line 263
    const/16 v3, 0x19

    .line 264
    .line 265
    invoke-virtual {v0, v3, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 269
    .line 270
    .line 271
    const/4 v3, 0x1

    .line 272
    invoke-virtual {v0, v15, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 273
    .line 274
    .line 275
    const/16 v3, 0x32

    .line 276
    .line 277
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 278
    .line 279
    .line 280
    const/16 v3, 0xc0

    .line 281
    .line 282
    invoke-virtual {v0, v3, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const-string v4, "()I"

    .line 286
    .line 287
    const/4 v5, 0x0

    .line 288
    move-object v3, v1

    .line 289
    const/16 v1, 0xb6

    .line 290
    .line 291
    move/from16 v22, v2

    .line 292
    .line 293
    const-string v2, "java/lang/Integer"

    .line 294
    .line 295
    move-object v11, v3

    .line 296
    const-string v3, "intValue"

    .line 297
    .line 298
    move/from16 v8, v22

    .line 299
    .line 300
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 301
    .line 302
    .line 303
    const/16 v1, 0x8

    .line 304
    .line 305
    invoke-virtual {v0, v12, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v9, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 309
    .line 310
    .line 311
    const-string v2, "java/lang/invoke/MethodType"

    .line 312
    .line 313
    invoke-virtual {v0, v6, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const/4 v3, 0x7

    .line 317
    invoke-virtual {v0, v13, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 318
    .line 319
    .line 320
    const/16 v4, 0x19

    .line 321
    .line 322
    invoke-virtual {v0, v4, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v4, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v9, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 335
    .line 336
    .line 337
    const-string v4, "(Ljava/lang/Object;ILjava/lang/Object;II)V"

    .line 338
    .line 339
    move v3, v1

    .line 340
    const/16 v1, 0xb8

    .line 341
    .line 342
    move-object/from16 v19, v2

    .line 343
    .line 344
    const-string v2, "java/lang/System"

    .line 345
    .line 346
    move/from16 v21, v3

    .line 347
    .line 348
    const-string v3, "arraycopy"

    .line 349
    .line 350
    move-object/from16 v8, v19

    .line 351
    .line 352
    move/from16 v12, v21

    .line 353
    .line 354
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 355
    .line 356
    .line 357
    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    .line 358
    .line 359
    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 360
    .line 361
    .line 362
    const/16 v2, 0xa7

    .line 363
    .line 364
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 368
    .line 369
    .line 370
    const/4 v4, 0x0

    .line 371
    const/4 v5, 0x0

    .line 372
    move-object v3, v1

    .line 373
    const/4 v1, 0x3

    .line 374
    move/from16 v32, v2

    .line 375
    .line 376
    const/4 v2, 0x0

    .line 377
    move-object v11, v3

    .line 378
    const/4 v3, 0x0

    .line 379
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 386
    .line 387
    .line 388
    const/4 v3, 0x7

    .line 389
    invoke-virtual {v0, v13, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 393
    .line 394
    .line 395
    const-string v1, "[Ljava/lang/invoke/MethodType;"

    .line 396
    .line 397
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    const/4 v1, 0x1

    .line 402
    const/4 v2, 0x1

    .line 403
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    const/16 v3, 0x19

    .line 407
    .line 408
    invoke-virtual {v0, v3, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 412
    .line 413
    .line 414
    const/16 v1, 0x32

    .line 415
    .line 416
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 417
    .line 418
    .line 419
    const/16 v2, 0xc0

    .line 420
    .line 421
    invoke-virtual {v0, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v13, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v3, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 428
    .line 429
    .line 430
    const/4 v4, 0x4

    .line 431
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 435
    .line 436
    .line 437
    const-string v4, "java/lang/invoke/MethodHandle"

    .line 438
    .line 439
    invoke-virtual {v0, v2, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 440
    .line 441
    .line 442
    const/16 v6, 0x9

    .line 443
    .line 444
    invoke-virtual {v0, v13, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v3, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 457
    .line 458
    .line 459
    const/16 v11, 0xa

    .line 460
    .line 461
    invoke-virtual {v0, v13, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 462
    .line 463
    .line 464
    const/4 v1, 0x4

    .line 465
    invoke-virtual {v0, v9, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 472
    .line 473
    .line 474
    new-instance v2, Lnet/bytebuddy/jar/asm/Label;

    .line 475
    .line 476
    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 477
    .line 478
    .line 479
    const/16 v3, 0x99

    .line 480
    .line 481
    invoke-virtual {v0, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 485
    .line 486
    .line 487
    new-instance v14, Lnet/bytebuddy/jar/asm/Label;

    .line 488
    .line 489
    invoke-direct {v14}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 490
    .line 491
    .line 492
    const/16 v1, 0xa7

    .line 493
    .line 494
    invoke-virtual {v0, v1, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 498
    .line 499
    .line 500
    filled-new-array {v8, v4, v8}, [Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    const/4 v4, 0x0

    .line 505
    const/4 v1, 0x1

    .line 506
    const/4 v2, 0x3

    .line 507
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 514
    .line 515
    .line 516
    const/4 v4, 0x1

    .line 517
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v5

    .line 521
    const/4 v1, 0x4

    .line 522
    const/4 v2, 0x0

    .line 523
    const/4 v3, 0x0

    .line 524
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    const/16 v8, 0xb

    .line 528
    .line 529
    const/16 v1, 0x36

    .line 530
    .line 531
    invoke-virtual {v0, v1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 532
    .line 533
    .line 534
    const/4 v1, 0x6

    .line 535
    const/16 v14, 0x19

    .line 536
    .line 537
    invoke-virtual {v0, v14, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 538
    .line 539
    .line 540
    const-string v4, "([Ljava/lang/Object;)Ljava/util/List;"

    .line 541
    .line 542
    const/4 v5, 0x0

    .line 543
    const/16 v1, 0xb8

    .line 544
    .line 545
    const-string v2, "java/util/Arrays"

    .line 546
    .line 547
    const-string v3, "asList"

    .line 548
    .line 549
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 550
    .line 551
    .line 552
    const/16 v1, 0xc

    .line 553
    .line 554
    invoke-virtual {v0, v13, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 555
    .line 556
    .line 557
    const/4 v3, 0x7

    .line 558
    invoke-virtual {v0, v14, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 559
    .line 560
    .line 561
    const-string v4, "([Ljava/lang/Object;)Ljava/util/List;"

    .line 562
    .line 563
    move v2, v1

    .line 564
    const/16 v1, 0xb8

    .line 565
    .line 566
    move v3, v2

    .line 567
    const-string v2, "java/util/Arrays"

    .line 568
    .line 569
    move/from16 v16, v3

    .line 570
    .line 571
    const-string v3, "asList"

    .line 572
    .line 573
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 574
    .line 575
    .line 576
    const/16 v1, 0xd

    .line 577
    .line 578
    invoke-virtual {v0, v13, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v14, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v13, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0, v14, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 588
    .line 589
    .line 590
    const/4 v4, 0x4

    .line 591
    invoke-virtual {v0, v13, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v14, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0, v13, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0, v9, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 601
    .line 602
    .line 603
    const/4 v2, 0x6

    .line 604
    const/16 v3, 0x36

    .line 605
    .line 606
    invoke-virtual {v0, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 607
    .line 608
    .line 609
    const/16 v2, 0xc

    .line 610
    .line 611
    invoke-virtual {v0, v14, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 612
    .line 613
    .line 614
    const/4 v3, 0x7

    .line 615
    invoke-virtual {v0, v13, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v0, v14, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0, v13, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 622
    .line 623
    .line 624
    const-string v30, "java/util/List"

    .line 625
    .line 626
    const-string v31, "java/util/List"

    .line 627
    .line 628
    const-string v23, "java/lang/invoke/MethodHandles$Lookup"

    .line 629
    .line 630
    const-string v24, "java/lang/String"

    .line 631
    .line 632
    const-string v25, "java/lang/invoke/MethodType"

    .line 633
    .line 634
    const-string v26, "java/lang/invoke/MethodType"

    .line 635
    .line 636
    const-string v27, "java/lang/invoke/MethodHandle"

    .line 637
    .line 638
    const-string v28, "java/lang/invoke/MethodType"

    .line 639
    .line 640
    move-object/from16 v29, v10

    .line 641
    .line 642
    filled-new-array/range {v23 .. v31}, [Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    const/4 v4, 0x0

    .line 647
    const/4 v5, 0x0

    .line 648
    const/4 v1, 0x0

    .line 649
    const/16 v2, 0x9

    .line 650
    .line 651
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    return-void
.end method
