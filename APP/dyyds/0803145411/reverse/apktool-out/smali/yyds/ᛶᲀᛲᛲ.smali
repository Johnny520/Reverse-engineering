.class public abstract Lyyds/ᛶᲀᛲᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:[Ljava/lang/String;

.field public static final ᛲᛳᛶᲁ:I

.field public static final ᛲᛴᛳᛲ:[Ljava/lang/String;

.field public static final ᛲᲈᲁ:[Ljava/lang/String;

.field public static final ᛵᛸᛸᛷ:[Ljava/lang/String;

.field public static final ᛶᛷᛲᲁ:[Ljava/lang/String;

.field public static final ᛷᛲᲈᛱ:Ljava/lang/String;

.field public static final ᛷᲈᲈᲁ:Ljava/lang/String;

.field public static final ᲀᛲᛳᲀ:[Ljava/lang/String;

.field public static final ᲇᲇᲇᛱ:[Ljava/lang/String;

.field public static final ᲇᲈᛵᛷ:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    const-string v0, "ro.miui.region"

    .line 2
    .line 3
    const-string v1, "ro.vendor.miui.region"

    .line 4
    .line 5
    const-string v2, "ro.miui.build.region"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "ro.mi.os.version.name"

    .line 12
    .line 13
    const-string v2, "ro.mi.os.version.code"

    .line 14
    .line 15
    const-string v3, "ro.mi.os.version.incremental"

    .line 16
    .line 17
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᲈᲁ:[Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "ro.miui.ui.version.name"

    .line 24
    .line 25
    const-string v4, "ro.miui.ui.version.code"

    .line 26
    .line 27
    filled-new-array {v2, v4}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

    .line 32
    .line 33
    const-string v0, "ro.build.version.oplusrom.confidential"

    .line 34
    .line 35
    const-string v4, "ro.build.display.id"

    .line 36
    .line 37
    const-string v5, "ro.build.display.id.show"

    .line 38
    .line 39
    const-string v6, "persist.sys.oplus.ota_ver_display"

    .line 40
    .line 41
    const-string v7, "ro.build.version.oplusrom"

    .line 42
    .line 43
    filled-new-array {v4, v5, v6, v7, v0}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v13, "ro.vivo.system.product.version"

    .line 48
    .line 49
    const-string v14, "ro.build.software.version"

    .line 50
    .line 51
    const-string v8, "ro.vivo.product.version"

    .line 52
    .line 53
    const-string v9, "ro.vivo.default.version"

    .line 54
    .line 55
    const-string v10, "ro.vivo.build.version.incremental"

    .line 56
    .line 57
    const-string v11, "ro.vivo.product.version.incremental"

    .line 58
    .line 59
    const-string v12, "ro.vivo.build.version"

    .line 60
    .line 61
    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const-string v6, "msc.config.magic.version"

    .line 66
    .line 67
    const-string v8, "ro.build.version.magic"

    .line 68
    .line 69
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    const-string v8, "ro.product.os.dist.anco.apiversion"

    .line 74
    .line 75
    const-string v9, "ro.product.os.dist.anco.releasetype"

    .line 76
    .line 77
    const-string v10, "ro.product.anco.devicetype"

    .line 78
    .line 79
    const-string v11, "ro.sys.anco.product.software.version"

    .line 80
    .line 81
    filled-new-array {v10, v11, v8, v9}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    const-string v9, "ro.honor.build.display.id"

    .line 86
    .line 87
    const-string v10, "persist.sys.hiview.base_version"

    .line 88
    .line 89
    const-string v12, "ro.comp.hl.product_base_version"

    .line 90
    .line 91
    filled-new-array {v9, v10, v12, v4}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    const-string v13, "ro.huawei.build.display.id"

    .line 96
    .line 97
    const-string v14, "hw_sc.build.platform.version"

    .line 98
    .line 99
    filled-new-array {v13, v12, v10, v14}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    sput-object v10, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 104
    .line 105
    const-string v12, "ro.build.ohos.devicetype"

    .line 106
    .line 107
    const-string v13, "persist.sys.ohos.osd.cloud.switch"

    .line 108
    .line 109
    filled-new-array {v12, v13}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    const-string v13, "ro.flyme.published"

    .line 114
    .line 115
    const-string v14, "ro.flyme.version.id"

    .line 116
    .line 117
    filled-new-array {v13, v14}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    sput-object v13, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

    .line 122
    .line 123
    const-string v13, "ro.smartisan.sa"

    .line 124
    .line 125
    const-string v14, "ro.smartisan.version"

    .line 126
    .line 127
    filled-new-array {v13, v14}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    sput-object v13, Lyyds/ᛶᲀᛲᛲ;->ᛲᛴᛳᛲ:[Ljava/lang/String;

    .line 132
    .line 133
    const-string v21, "ro.config.leui_ringtone_slot2"

    .line 134
    .line 135
    const-string v22, "ro.leui_oem_unlock_enable"

    .line 136
    .line 137
    const-string v15, "ro.letv.release.version"

    .line 138
    .line 139
    const-string v16, "ro.letv.release.version_date"

    .line 140
    .line 141
    const-string v17, "ro.product.letv_model"

    .line 142
    .line 143
    const-string v18, "ro.product.letv_name"

    .line 144
    .line 145
    const-string v19, "sys.letv.fmodelaid"

    .line 146
    .line 147
    const-string v20, "persist.sys.leui.bootreason"

    .line 148
    .line 149
    filled-new-array/range {v15 .. v22}, [Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    sput-object v13, Lyyds/ᛶᲀᛲᛲ;->ᲇᲇᲇᛱ:[Ljava/lang/String;

    .line 154
    .line 155
    const-string v13, "ro.config.lgsi.fp.incremental"

    .line 156
    .line 157
    const-string v15, "ro.config.lgsi.os.version"

    .line 158
    .line 159
    filled-new-array {v13, v15}, [Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    sput-object v13, Lyyds/ᛶᲀᛲᛲ;->ᛶᛷᛲᲁ:[Ljava/lang/String;

    .line 164
    .line 165
    const-string v13, "persist.radio.zui.feature"

    .line 166
    .line 167
    const-string v15, "ro.config.zuisdk.enabled"

    .line 168
    .line 169
    move-object/from16 v16, v0

    .line 170
    .line 171
    const-string v0, "ro.com.zui.version"

    .line 172
    .line 173
    move-object/from16 v17, v1

    .line 174
    .line 175
    const-string v1, "ro.zui.version.status"

    .line 176
    .line 177
    move-object/from16 v18, v2

    .line 178
    .line 179
    const-string v2, "ro.zui.hardware.displayid"

    .line 180
    .line 181
    filled-new-array {v0, v1, v2, v13, v15}, [Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 186
    .line 187
    invoke-static/range {v17 .. v17}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    const-string v2, "ro.build.version.incremental"

    .line 192
    .line 193
    if-eqz v1, :cond_0

    .line 194
    .line 195
    const v1, -0x4a6b0ad0

    .line 196
    .line 197
    .line 198
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 199
    .line 200
    const-string v1, "HyperOS"

    .line 201
    .line 202
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 203
    .line 204
    filled-new-array {v3}, [Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v1}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_0
    invoke-static/range {v18 .. v18}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_1

    .line 220
    .line 221
    const v1, 0x241d30

    .line 222
    .line 223
    .line 224
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 225
    .line 226
    const-string v1, "MIUI"

    .line 227
    .line 228
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 229
    .line 230
    filled-new-array {v2}, [Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {v1}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 239
    .line 240
    :cond_1
    :goto_0
    sget-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 241
    .line 242
    if-nez v1, :cond_4

    .line 243
    .line 244
    const-string v3, "ro.build.version.realmeui"

    .line 245
    .line 246
    invoke-static {v3}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    if-nez v13, :cond_2

    .line 255
    .line 256
    const v1, -0x33399336

    .line 257
    .line 258
    .line 259
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 260
    .line 261
    const-string v1, "realmeUI"

    .line 262
    .line 263
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 264
    .line 265
    invoke-static {v3}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    sput-object v3, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_2
    invoke-static {v7}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    const-string v7, "ColorOS"

    .line 281
    .line 282
    const v13, -0x642e7b99

    .line 283
    .line 284
    .line 285
    if-nez v3, :cond_3

    .line 286
    .line 287
    sput v13, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 288
    .line 289
    sput-object v7, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 290
    .line 291
    invoke-static/range {v16 .. v16}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 296
    .line 297
    :goto_1
    move-object v1, v7

    .line 298
    goto :goto_2

    .line 299
    :cond_3
    const-string v3, "ro.build.version.opporom"

    .line 300
    .line 301
    invoke-static {v3}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v15

    .line 309
    if-nez v15, :cond_4

    .line 310
    .line 311
    sput v13, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 312
    .line 313
    sput-object v7, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 314
    .line 315
    invoke-static {v3}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 320
    .line 321
    goto :goto_1

    .line 322
    :cond_4
    :goto_2
    if-nez v1, :cond_6

    .line 323
    .line 324
    const-string v3, "ro.vivo.os.build.display.id"

    .line 325
    .line 326
    invoke-static {v3}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    if-nez v13, :cond_6

    .line 335
    .line 336
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    const-string v15, "origin"

    .line 341
    .line 342
    invoke-virtual {v13, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    if-eqz v13, :cond_5

    .line 347
    .line 348
    const v1, 0x560cebaa

    .line 349
    .line 350
    .line 351
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 352
    .line 353
    const-string v1, "OriginOS"

    .line 354
    .line 355
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v5}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    sput-object v3, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_5
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    const-string v7, "funtouch"

    .line 369
    .line 370
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-eqz v5, :cond_6

    .line 375
    .line 376
    const v1, -0x1186f8dc    # -1.92676E28f

    .line 377
    .line 378
    .line 379
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 380
    .line 381
    const-string v1, "FuntouchOS"

    .line 382
    .line 383
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 384
    .line 385
    filled-new-array {v3}, [Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    invoke-static {v3}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    sput-object v3, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 394
    .line 395
    :cond_6
    :goto_3
    if-nez v1, :cond_7

    .line 396
    .line 397
    invoke-static {v6}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    if-eqz v3, :cond_7

    .line 402
    .line 403
    const v1, -0x6b5d6bcf

    .line 404
    .line 405
    .line 406
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 407
    .line 408
    const-string v1, "MagicOS"

    .line 409
    .line 410
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v9}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    sput-object v3, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 417
    .line 418
    :cond_7
    if-nez v1, :cond_8

    .line 419
    .line 420
    invoke-static {v8}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-eqz v3, :cond_8

    .line 425
    .line 426
    const v1, -0xae345d4

    .line 427
    .line 428
    .line 429
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 430
    .line 431
    const-string v1, "HarmonyOS NEXT AndroidCompatible"

    .line 432
    .line 433
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 434
    .line 435
    filled-new-array {v11}, [Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    invoke-static {v3}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    sput-object v3, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 444
    .line 445
    :cond_8
    const-string v3, "HarmonyOS"

    .line 446
    .line 447
    const v5, 0x5e67d94a

    .line 448
    .line 449
    .line 450
    if-nez v1, :cond_9

    .line 451
    .line 452
    invoke-static {v12}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    if-eqz v6, :cond_9

    .line 457
    .line 458
    sput v5, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 459
    .line 460
    sput-object v3, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 461
    .line 462
    invoke-static {v10}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 467
    .line 468
    move-object v1, v3

    .line 469
    :cond_9
    if-nez v1, :cond_a

    .line 470
    .line 471
    const-string v6, "ro.build.version.emui"

    .line 472
    .line 473
    invoke-static {v6}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 478
    .line 479
    .line 480
    move-result v7

    .line 481
    if-nez v7, :cond_a

    .line 482
    .line 483
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    const-string v8, "emotionui"

    .line 488
    .line 489
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    if-eqz v7, :cond_a

    .line 494
    .line 495
    const v1, 0x20893c

    .line 496
    .line 497
    .line 498
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 499
    .line 500
    const-string v1, "EMUI"

    .line 501
    .line 502
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 503
    .line 504
    invoke-static {v6}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v6

    .line 508
    sput-object v6, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 509
    .line 510
    :cond_a
    const/4 v6, 0x1

    .line 511
    const/4 v7, 0x0

    .line 512
    if-nez v1, :cond_e

    .line 513
    .line 514
    const-string v1, "ro.build.version.oneui"

    .line 515
    .line 516
    invoke-static {v1}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    const-string v9, "OneUI"

    .line 525
    .line 526
    const v10, 0x48cc75a

    .line 527
    .line 528
    .line 529
    if-nez v8, :cond_c

    .line 530
    .line 531
    sput v10, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 532
    .line 533
    sput-object v9, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 534
    .line 535
    const-string v8, "\\d+"

    .line 536
    .line 537
    invoke-virtual {v1, v8}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 538
    .line 539
    .line 540
    move-result v8

    .line 541
    if-eqz v8, :cond_b

    .line 542
    .line 543
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    invoke-static {v1}, Lyyds/ᛶᲀᛲᛲ;->ᛲᛴᛳᛲ(I)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 552
    .line 553
    goto :goto_4

    .line 554
    :cond_b
    const-string v8, "\\d+(?:\\.\\d+)+"

    .line 555
    .line 556
    invoke-virtual {v1, v8}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    if-eqz v8, :cond_c

    .line 561
    .line 562
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 563
    .line 564
    :catch_0
    :cond_c
    :goto_4
    sget-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 565
    .line 566
    if-eqz v1, :cond_d

    .line 567
    .line 568
    sget-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 569
    .line 570
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-eqz v1, :cond_e

    .line 575
    .line 576
    :cond_d
    :try_start_1
    const-class v1, Landroid/os/Build$VERSION;

    .line 577
    .line 578
    const-string v8, "SEM_PLATFORM_INT"

    .line 579
    .line 580
    invoke-virtual {v1, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    invoke-virtual {v1, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v1, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    sput v10, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 592
    .line 593
    sput-object v9, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 594
    .line 595
    const v8, 0x15f90

    .line 596
    .line 597
    .line 598
    if-lt v1, v8, :cond_e

    .line 599
    .line 600
    sub-int/2addr v1, v8

    .line 601
    invoke-static {v1}, Lyyds/ᛶᲀᛲᛲ;->ᛲᛴᛳᛲ(I)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 606
    .line 607
    :catch_1
    :cond_e
    sget-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 608
    .line 609
    if-nez v1, :cond_f

    .line 610
    .line 611
    const-string v8, "ro.oxygen.version"

    .line 612
    .line 613
    invoke-static {v8}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v8

    .line 617
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 618
    .line 619
    .line 620
    move-result v9

    .line 621
    if-nez v9, :cond_f

    .line 622
    .line 623
    const v1, -0x5141f85c

    .line 624
    .line 625
    .line 626
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 627
    .line 628
    const-string v1, "OxygenOS"

    .line 629
    .line 630
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 631
    .line 632
    invoke-static {v8}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v8

    .line 636
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 637
    .line 638
    :cond_f
    if-nez v1, :cond_10

    .line 639
    .line 640
    const-string v8, "ro.rom.version"

    .line 641
    .line 642
    invoke-static {v8}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v8

    .line 646
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 647
    .line 648
    .line 649
    move-result v9

    .line 650
    if-nez v9, :cond_10

    .line 651
    .line 652
    const v1, 0x21804e

    .line 653
    .line 654
    .line 655
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 656
    .line 657
    const-string v1, "H2OS"

    .line 658
    .line 659
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 660
    .line 661
    invoke-static {v8}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v8

    .line 665
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 666
    .line 667
    :cond_10
    if-nez v1, :cond_11

    .line 668
    .line 669
    sget-object v8, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

    .line 670
    .line 671
    invoke-static {v8}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 672
    .line 673
    .line 674
    move-result v8

    .line 675
    if-eqz v8, :cond_11

    .line 676
    .line 677
    const v1, 0x40d592b

    .line 678
    .line 679
    .line 680
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 681
    .line 682
    const-string v1, "Flyme"

    .line 683
    .line 684
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 685
    .line 686
    filled-new-array {v4}, [Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    invoke-static {v8}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 695
    .line 696
    :cond_11
    const-string v8, "RedMagicOS"

    .line 697
    .line 698
    const v9, -0x18e1dd60

    .line 699
    .line 700
    .line 701
    if-nez v1, :cond_15

    .line 702
    .line 703
    const-string v10, "ro.build.MiFavor_version"

    .line 704
    .line 705
    invoke-static {v10}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v11

    .line 709
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 710
    .line 711
    .line 712
    move-result v11

    .line 713
    if-nez v11, :cond_15

    .line 714
    .line 715
    invoke-static {v4}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v4

    .line 719
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 720
    .line 721
    .line 722
    move-result v11

    .line 723
    if-nez v11, :cond_15

    .line 724
    .line 725
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v11

    .line 729
    const-string v12, "nebulaaios"

    .line 730
    .line 731
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 732
    .line 733
    .line 734
    move-result v12

    .line 735
    if-eqz v12, :cond_12

    .line 736
    .line 737
    const v1, -0x63728815

    .line 738
    .line 739
    .line 740
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 741
    .line 742
    const-string v1, "NebulaAIOS"

    .line 743
    .line 744
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 745
    .line 746
    invoke-static {v4}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v4

    .line 750
    sput-object v4, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 751
    .line 752
    goto :goto_5

    .line 753
    :cond_12
    const-string v12, "redmagicos"

    .line 754
    .line 755
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 756
    .line 757
    .line 758
    move-result v12

    .line 759
    if-eqz v12, :cond_13

    .line 760
    .line 761
    sput v9, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 762
    .line 763
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 764
    .line 765
    invoke-static {v4}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 770
    .line 771
    move-object v1, v8

    .line 772
    goto :goto_5

    .line 773
    :cond_13
    const-string v12, "myos"

    .line 774
    .line 775
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 776
    .line 777
    .line 778
    move-result v12

    .line 779
    if-eqz v12, :cond_14

    .line 780
    .line 781
    const v1, 0x24d0b0

    .line 782
    .line 783
    .line 784
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 785
    .line 786
    const-string v1, "MyOS"

    .line 787
    .line 788
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 789
    .line 790
    invoke-static {v4}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    sput-object v4, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 795
    .line 796
    goto :goto_5

    .line 797
    :cond_14
    const-string v4, "zte"

    .line 798
    .line 799
    invoke-virtual {v11, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    if-eqz v4, :cond_15

    .line 804
    .line 805
    const v1, -0xc1a83ea

    .line 806
    .line 807
    .line 808
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 809
    .line 810
    const-string v1, "MifavorUI"

    .line 811
    .line 812
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 813
    .line 814
    filled-new-array {v10}, [Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    invoke-static {v4}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    sput-object v4, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 823
    .line 824
    :cond_15
    :goto_5
    const-string v4, ""

    .line 825
    .line 826
    if-nez v1, :cond_1c

    .line 827
    .line 828
    const-string v10, "ro.build.nubia.rom.name"

    .line 829
    .line 830
    invoke-static {v10}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v10

    .line 834
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 835
    .line 836
    .line 837
    move-result v11

    .line 838
    if-nez v11, :cond_1c

    .line 839
    .line 840
    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v10

    .line 844
    const-string v11, "nubiaui"

    .line 845
    .line 846
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 847
    .line 848
    .line 849
    move-result v10

    .line 850
    if-eqz v10, :cond_1c

    .line 851
    .line 852
    const v1, -0x77d55859

    .line 853
    .line 854
    .line 855
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 856
    .line 857
    const-string v1, "nubiaUI"

    .line 858
    .line 859
    sput-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 860
    .line 861
    const-string v10, "ro.build.nubia.rom.code"

    .line 862
    .line 863
    filled-new-array {v10}, [Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v10

    .line 867
    invoke-static {v10}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v10

    .line 871
    sput-object v10, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 872
    .line 873
    sget-object v10, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 874
    .line 875
    const/4 v11, 0x0

    .line 876
    const-string v12, "\\."

    .line 877
    .line 878
    const/4 v13, -0x1

    .line 879
    if-eqz v10, :cond_17

    .line 880
    .line 881
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 882
    .line 883
    .line 884
    move-result v15

    .line 885
    if-eqz v15, :cond_16

    .line 886
    .line 887
    goto :goto_6

    .line 888
    :cond_16
    invoke-virtual {v10, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v10

    .line 892
    array-length v15, v10

    .line 893
    if-nez v15, :cond_18

    .line 894
    .line 895
    :catch_2
    :cond_17
    :goto_6
    move v10, v13

    .line 896
    goto :goto_7

    .line 897
    :cond_18
    :try_start_2
    aget-object v10, v10, v11

    .line 898
    .line 899
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 900
    .line 901
    .line 902
    move-result v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 903
    :goto_7
    sget-object v15, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 904
    .line 905
    if-eqz v15, :cond_19

    .line 906
    .line 907
    goto :goto_8

    .line 908
    :cond_19
    move-object v15, v4

    .line 909
    :goto_8
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    .line 910
    .line 911
    .line 912
    move-result v16

    .line 913
    if-eqz v16, :cond_1a

    .line 914
    .line 915
    goto :goto_9

    .line 916
    :cond_1a
    invoke-virtual {v15, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v12

    .line 920
    array-length v15, v12

    .line 921
    if-nez v15, :cond_1b

    .line 922
    .line 923
    goto :goto_9

    .line 924
    :cond_1b
    :try_start_3
    aget-object v11, v12, v11

    .line 925
    .line 926
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 927
    .line 928
    .line 929
    move-result v13
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 930
    :catch_3
    :goto_9
    sub-int/2addr v10, v13

    .line 931
    const/4 v11, 0x5

    .line 932
    if-lt v10, v11, :cond_1c

    .line 933
    .line 934
    sput v9, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 935
    .line 936
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 937
    .line 938
    goto :goto_a

    .line 939
    :cond_1c
    move-object v8, v1

    .line 940
    :goto_a
    if-nez v8, :cond_1e

    .line 941
    .line 942
    const-string v1, "ro.config.lgsi.os.name"

    .line 943
    .line 944
    invoke-static {v1}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 949
    .line 950
    .line 951
    move-result v9

    .line 952
    if-nez v9, :cond_1d

    .line 953
    .line 954
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    const-string v9, "zuxos"

    .line 959
    .line 960
    invoke-virtual {v1, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 961
    .line 962
    .line 963
    move-result v1

    .line 964
    if-eqz v1, :cond_1d

    .line 965
    .line 966
    const v0, 0x51c3b21

    .line 967
    .line 968
    .line 969
    sput v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 970
    .line 971
    const-string v8, "ZUXOS"

    .line 972
    .line 973
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 974
    .line 975
    sget-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛶᛷᛲᲁ:[Ljava/lang/String;

    .line 976
    .line 977
    invoke-static {v0}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 982
    .line 983
    goto :goto_b

    .line 984
    :cond_1d
    sget-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ:[Ljava/lang/String;

    .line 985
    .line 986
    invoke-static {v1}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 987
    .line 988
    .line 989
    move-result v1

    .line 990
    if-eqz v1, :cond_1e

    .line 991
    .line 992
    const v1, 0x15c6e

    .line 993
    .line 994
    .line 995
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 996
    .line 997
    const-string v8, "ZUI"

    .line 998
    .line 999
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1000
    .line 1001
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    invoke-static {v0}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 1010
    .line 1011
    :cond_1e
    :goto_b
    if-nez v8, :cond_1f

    .line 1012
    .line 1013
    const-string v0, "ro.asus.rog"

    .line 1014
    .line 1015
    invoke-static {v0}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    if-nez v0, :cond_1f

    .line 1024
    .line 1025
    const v0, 0x4a885be

    .line 1026
    .line 1027
    .line 1028
    sput v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 1029
    .line 1030
    const-string v8, "ROGUI"

    .line 1031
    .line 1032
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1033
    .line 1034
    filled-new-array {v2}, [Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    invoke-static {v0}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 1043
    .line 1044
    :cond_1f
    if-nez v8, :cond_20

    .line 1045
    .line 1046
    sget-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛴᛳᛲ:[Ljava/lang/String;

    .line 1047
    .line 1048
    invoke-static {v0}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v0

    .line 1052
    if-eqz v0, :cond_20

    .line 1053
    .line 1054
    const v0, 0x6ba129e4

    .line 1055
    .line 1056
    .line 1057
    sput v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 1058
    .line 1059
    const-string v8, "SmartisanOS"

    .line 1060
    .line 1061
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1062
    .line 1063
    filled-new-array {v14}, [Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    invoke-static {v0}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 1072
    .line 1073
    :cond_20
    if-nez v8, :cond_21

    .line 1074
    .line 1075
    sget-object v0, Lyyds/ᛶᲀᛲᛲ;->ᲇᲇᲇᛱ:[Ljava/lang/String;

    .line 1076
    .line 1077
    invoke-static {v0}, Lyyds/ᲇᛲᲁᛱ;->ᛱᛳᲇ([Ljava/lang/String;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    if-eqz v0, :cond_21

    .line 1082
    .line 1083
    const v0, 0x10d99

    .line 1084
    .line 1085
    .line 1086
    sput v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 1087
    .line 1088
    const-string v8, "EUI"

    .line 1089
    .line 1090
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1091
    .line 1092
    const-string v0, "ro.letv.release.version"

    .line 1093
    .line 1094
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    invoke-static {v0}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 1103
    .line 1104
    :cond_21
    if-nez v8, :cond_22

    .line 1105
    .line 1106
    const-string v0, "ro.build.uiversion"

    .line 1107
    .line 1108
    invoke-static {v0}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1113
    .line 1114
    .line 1115
    move-result v1

    .line 1116
    if-nez v1, :cond_22

    .line 1117
    .line 1118
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    const-string v2, "360ui"

    .line 1123
    .line 1124
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v1

    .line 1128
    if-eqz v1, :cond_22

    .line 1129
    .line 1130
    const v1, 0x2e7f981

    .line 1131
    .line 1132
    .line 1133
    sput v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 1134
    .line 1135
    const-string v8, "360UI"

    .line 1136
    .line 1137
    sput-object v8, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1138
    .line 1139
    invoke-static {v0}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 1144
    .line 1145
    :cond_22
    if-nez v8, :cond_23

    .line 1146
    .line 1147
    :try_start_4
    const-string v0, "com.huawei.system.BuildEx"

    .line 1148
    .line 1149
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    const-string v1, "getOsBrand"

    .line 1154
    .line 1155
    invoke-virtual {v0, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v1

    .line 1159
    invoke-virtual {v1, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v1, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    if-eqz v0, :cond_23

    .line 1167
    .line 1168
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v0

    .line 1176
    const-string v1, "harmony"

    .line 1177
    .line 1178
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v0

    .line 1182
    if-eqz v0, :cond_23

    .line 1183
    .line 1184
    sput v5, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 1185
    .line 1186
    sput-object v3, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1187
    .line 1188
    sget-object v0, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 1189
    .line 1190
    invoke-static {v0}, Lyyds/ᛶᲀᛲᛲ;->ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    sput-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 1195
    .line 1196
    :catch_4
    :cond_23
    sget-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1197
    .line 1198
    if-nez v0, :cond_24

    .line 1199
    .line 1200
    sput-object v4, Lyyds/ᛶᲀᛲᛲ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 1201
    .line 1202
    :cond_24
    sget-object v0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 1203
    .line 1204
    if-nez v0, :cond_25

    .line 1205
    .line 1206
    sput-object v4, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 1207
    .line 1208
    :cond_25
    return-void
.end method

.method public static ᛱᲈᲁ()Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    const-string v1, "android.os.SystemProperties"

    .line 3
    .line 4
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "get"

    .line 9
    .line 10
    const-class v3, Ljava/lang/String;

    .line 11
    .line 12
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v4, "ro.miui.cts"

    .line 21
    .line 22
    const-string v5, ""

    .line 23
    .line 24
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v4, "getBoolean"

    .line 37
    .line 38
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    filled-new-array {v3, v5}, [Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v4, "persist.sys.miui_optimization"

    .line 49
    .line 50
    const-string v5, "1"

    .line 51
    .line 52
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    xor-int/2addr v2, v0

    .line 57
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v3, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :catch_0
    return v0
.end method

.method public static ᛲᛴᛳᛲ(I)Ljava/lang/String;
    .locals 4

    .line 1
    div-int/lit16 v0, p0, 0x2710

    .line 2
    .line 3
    rem-int/lit16 v1, p0, 0x2710

    .line 4
    .line 5
    rem-int/lit8 p0, p0, 0x64

    .line 6
    .line 7
    const-string v2, "."

    .line 8
    .line 9
    if-lez p0, :cond_0

    .line 10
    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    div-int/lit8 v1, v1, 0x64

    .line 23
    .line 24
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    div-int/lit8 v1, v1, 0x64

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static ᛲᲈᲁ(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "(\\d+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return p0

    .line 35
    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "(\\d+(?:\\.\\d+)+)"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    :goto_0
    const-string p0, ""

    .line 39
    .line 40
    return-object p0
.end method

.method public static ᛶᛷᛲᲁ()Z
    .locals 6

    .line 1
    sget v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    const v1, 0x241d30

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    new-array v1, v0, [Ljava/lang/String;

    .line 11
    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v0, :cond_0

    .line 14
    .line 15
    sget-object v4, Lyyds/ᛶᲀᛲᛲ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

    .line 16
    .line 17
    aget-object v4, v4, v3

    .line 18
    .line 19
    invoke-static {v4}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    aput-object v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v2

    .line 29
    :goto_1
    if-ge v3, v0, :cond_2

    .line 30
    .line 31
    aget-object v4, v1, v3

    .line 32
    .line 33
    const-string v5, "cn"

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    return v0

    .line 43
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    return v2
.end method

.method public static varargs ᲀᛲᛳᲀ([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    invoke-static {v3}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3}, Lyyds/ᛶᲀᛲᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    array-length v0, p0

    .line 27
    :goto_1
    if-ge v1, v0, :cond_3

    .line 28
    .line 29
    aget-object v2, p0, v1

    .line 30
    .line 31
    invoke-static {v2}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Lyyds/ᛶᲀᛲᛲ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-lez v2, :cond_2

    .line 40
    .line 41
    new-instance p0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, ".0"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    const-string p0, ""

    .line 63
    .line 64
    return-object p0
.end method

.method public static ᲇᲇᲇᛱ()Z
    .locals 6

    .line 1
    sget v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    const v1, -0x4a6b0ad0

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    new-array v1, v0, [Ljava/lang/String;

    .line 11
    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v0, :cond_0

    .line 14
    .line 15
    sget-object v4, Lyyds/ᛶᲀᛲᛲ;->ᛲᲈᲁ:[Ljava/lang/String;

    .line 16
    .line 17
    aget-object v4, v4, v3

    .line 18
    .line 19
    invoke-static {v4}, Lyyds/ᲇᛲᲁᛱ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    aput-object v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v2

    .line 29
    :goto_1
    if-ge v3, v0, :cond_2

    .line 30
    .line 31
    aget-object v4, v1, v3

    .line 32
    .line 33
    const-string v5, "cn"

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    return v0

    .line 43
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    return v2
.end method

.method public static ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lyyds/ᛶᲀᛲᛲ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {p0}, Lyyds/ᛶᲀᛲᛲ;->ᛲᲈᲁ(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, ".0"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    const-string p0, ""

    .line 37
    .line 38
    return-object p0
.end method
