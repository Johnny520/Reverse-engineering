.class public final enum Lg21;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lt23;


# static fields
.field public static final enum k:Lg21;

.field public static final enum l:Lg21;

.field public static final enum m:Lg21;

.field public static final enum n:Lg21;

.field public static final enum o:Lg21;

.field public static final enum p:Lg21;

.field public static final enum q:Lg21;

.field public static final enum r:Lg21;

.field public static final enum s:Lg21;

.field public static final enum t:Lg21;

.field public static final enum u:Lg21;

.field public static final enum v:Lg21;

.field public static final enum w:Lg21;

.field public static final enum x:Lg21;

.field public static final enum y:Lg21;

.field public static final synthetic z:[Lg21;


# instance fields
.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    new-instance v1, Lg21;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v2, "header_item"

    .line 5
    .line 6
    const-string v3, "TYPE_HEADER_ITEM"

    .line 7
    .line 8
    invoke-direct {v1, v3, v0, v2, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lg21;->k:Lg21;

    .line 12
    .line 13
    new-instance v2, Lg21;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    const-string v3, "string_id_item"

    .line 17
    .line 18
    const-string v4, "TYPE_STRING_ID_ITEM"

    .line 19
    .line 20
    invoke-direct {v2, v4, v0, v3, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lg21;->l:Lg21;

    .line 24
    .line 25
    new-instance v3, Lg21;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    const-string v4, "type_id_item"

    .line 29
    .line 30
    const-string v5, "TYPE_TYPE_ID_ITEM"

    .line 31
    .line 32
    invoke-direct {v3, v5, v0, v4, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Lg21;->m:Lg21;

    .line 36
    .line 37
    new-instance v4, Lg21;

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    const-string v5, "proto_id_item"

    .line 41
    .line 42
    const-string v6, "TYPE_PROTO_ID_ITEM"

    .line 43
    .line 44
    invoke-direct {v4, v6, v0, v5, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lg21;->n:Lg21;

    .line 48
    .line 49
    new-instance v5, Lg21;

    .line 50
    .line 51
    const/4 v0, 0x4

    .line 52
    const-string v6, "field_id_item"

    .line 53
    .line 54
    const-string v7, "TYPE_FIELD_ID_ITEM"

    .line 55
    .line 56
    invoke-direct {v5, v7, v0, v6, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lg21;->o:Lg21;

    .line 60
    .line 61
    new-instance v6, Lg21;

    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    const-string v7, "method_id_item"

    .line 65
    .line 66
    const-string v8, "TYPE_METHOD_ID_ITEM"

    .line 67
    .line 68
    invoke-direct {v6, v8, v0, v7, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 69
    .line 70
    .line 71
    sput-object v6, Lg21;->p:Lg21;

    .line 72
    .line 73
    new-instance v7, Lg21;

    .line 74
    .line 75
    const/4 v0, 0x6

    .line 76
    const-string v8, "class_def_item"

    .line 77
    .line 78
    const-string v9, "TYPE_CLASS_DEF_ITEM"

    .line 79
    .line 80
    invoke-direct {v7, v9, v0, v8, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    sput-object v7, Lg21;->q:Lg21;

    .line 84
    .line 85
    new-instance v8, Lg21;

    .line 86
    .line 87
    const/4 v0, 0x7

    .line 88
    const-string v9, "call_site_id_item"

    .line 89
    .line 90
    const-string v10, "TYPE_CALL_SITE_ID_ITEM"

    .line 91
    .line 92
    invoke-direct {v8, v10, v0, v9, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    new-instance v9, Lg21;

    .line 96
    .line 97
    const/16 v0, 0x8

    .line 98
    .line 99
    const-string v10, "method_handle_item"

    .line 100
    .line 101
    const-string v11, "TYPE_METHOD_HANDLE_ITEM"

    .line 102
    .line 103
    invoke-direct {v9, v11, v0, v10, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    new-instance v10, Lg21;

    .line 107
    .line 108
    const/16 v0, 0x1000

    .line 109
    .line 110
    const-string v11, "map_list"

    .line 111
    .line 112
    const-string v12, "TYPE_MAP_LIST"

    .line 113
    .line 114
    const/16 v13, 0x9

    .line 115
    .line 116
    invoke-direct {v10, v12, v13, v11, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    sput-object v10, Lg21;->r:Lg21;

    .line 120
    .line 121
    new-instance v11, Lg21;

    .line 122
    .line 123
    const/16 v0, 0x1001

    .line 124
    .line 125
    const-string v12, "type_list"

    .line 126
    .line 127
    const-string v13, "TYPE_TYPE_LIST"

    .line 128
    .line 129
    const/16 v14, 0xa

    .line 130
    .line 131
    invoke-direct {v11, v13, v14, v12, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v11, Lg21;->s:Lg21;

    .line 135
    .line 136
    new-instance v12, Lg21;

    .line 137
    .line 138
    const/16 v0, 0x1002

    .line 139
    .line 140
    const-string v13, "annotation_set_ref_list"

    .line 141
    .line 142
    const-string v14, "TYPE_ANNOTATION_SET_REF_LIST"

    .line 143
    .line 144
    const/16 v15, 0xb

    .line 145
    .line 146
    invoke-direct {v12, v14, v15, v13, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    new-instance v13, Lg21;

    .line 150
    .line 151
    const/16 v0, 0x1003

    .line 152
    .line 153
    const-string v14, "annotation_set_item"

    .line 154
    .line 155
    const-string v15, "TYPE_ANNOTATION_SET_ITEM"

    .line 156
    .line 157
    move-object/from16 v16, v1

    .line 158
    .line 159
    const/16 v1, 0xc

    .line 160
    .line 161
    invoke-direct {v13, v15, v1, v14, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 162
    .line 163
    .line 164
    new-instance v14, Lg21;

    .line 165
    .line 166
    const/16 v0, 0x2000

    .line 167
    .line 168
    const-string v1, "class_data_item"

    .line 169
    .line 170
    const-string v15, "TYPE_CLASS_DATA_ITEM"

    .line 171
    .line 172
    move-object/from16 v17, v2

    .line 173
    .line 174
    const/16 v2, 0xd

    .line 175
    .line 176
    invoke-direct {v14, v15, v2, v1, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 177
    .line 178
    .line 179
    sput-object v14, Lg21;->t:Lg21;

    .line 180
    .line 181
    new-instance v15, Lg21;

    .line 182
    .line 183
    const/16 v0, 0x2001

    .line 184
    .line 185
    const-string v1, "code_item"

    .line 186
    .line 187
    const-string v2, "TYPE_CODE_ITEM"

    .line 188
    .line 189
    move-object/from16 v18, v3

    .line 190
    .line 191
    const/16 v3, 0xe

    .line 192
    .line 193
    invoke-direct {v15, v2, v3, v1, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 194
    .line 195
    .line 196
    sput-object v15, Lg21;->u:Lg21;

    .line 197
    .line 198
    new-instance v0, Lg21;

    .line 199
    .line 200
    const/16 v1, 0x2002

    .line 201
    .line 202
    const-string v2, "string_data_item"

    .line 203
    .line 204
    const-string v3, "TYPE_STRING_DATA_ITEM"

    .line 205
    .line 206
    move-object/from16 v19, v4

    .line 207
    .line 208
    const/16 v4, 0xf

    .line 209
    .line 210
    invoke-direct {v0, v3, v4, v2, v1}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    sput-object v0, Lg21;->v:Lg21;

    .line 214
    .line 215
    new-instance v1, Lg21;

    .line 216
    .line 217
    const/16 v2, 0x2003

    .line 218
    .line 219
    const-string v3, "debug_info_item"

    .line 220
    .line 221
    const-string v4, "TYPE_DEBUG_INFO_ITEM"

    .line 222
    .line 223
    move-object/from16 v20, v0

    .line 224
    .line 225
    const/16 v0, 0x10

    .line 226
    .line 227
    invoke-direct {v1, v4, v0, v3, v2}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Lg21;

    .line 231
    .line 232
    const/16 v2, 0x2004

    .line 233
    .line 234
    const-string v3, "annotation_item"

    .line 235
    .line 236
    const-string v4, "TYPE_ANNOTATION_ITEM"

    .line 237
    .line 238
    move-object/from16 v21, v1

    .line 239
    .line 240
    const/16 v1, 0x11

    .line 241
    .line 242
    invoke-direct {v0, v4, v1, v3, v2}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 243
    .line 244
    .line 245
    new-instance v1, Lg21;

    .line 246
    .line 247
    const/16 v2, 0x2005

    .line 248
    .line 249
    const-string v3, "encoded_array_item"

    .line 250
    .line 251
    const-string v4, "TYPE_ENCODED_ARRAY_ITEM"

    .line 252
    .line 253
    move-object/from16 v22, v0

    .line 254
    .line 255
    const/16 v0, 0x12

    .line 256
    .line 257
    invoke-direct {v1, v4, v0, v3, v2}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 258
    .line 259
    .line 260
    sput-object v1, Lg21;->w:Lg21;

    .line 261
    .line 262
    new-instance v0, Lg21;

    .line 263
    .line 264
    const/16 v2, 0x2006

    .line 265
    .line 266
    const-string v3, "annotations_directory_item"

    .line 267
    .line 268
    const-string v4, "TYPE_ANNOTATIONS_DIRECTORY_ITEM"

    .line 269
    .line 270
    move-object/from16 v23, v1

    .line 271
    .line 272
    const/16 v1, 0x13

    .line 273
    .line 274
    invoke-direct {v0, v4, v1, v3, v2}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 275
    .line 276
    .line 277
    sput-object v0, Lg21;->x:Lg21;

    .line 278
    .line 279
    new-instance v1, Lg21;

    .line 280
    .line 281
    const-string v2, "map_item"

    .line 282
    .line 283
    const-string v3, "TYPE_MAP_ITEM"

    .line 284
    .line 285
    const/16 v4, 0x14

    .line 286
    .line 287
    move-object/from16 v24, v0

    .line 288
    .line 289
    const/4 v0, -0x1

    .line 290
    invoke-direct {v1, v3, v4, v2, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 291
    .line 292
    .line 293
    sput-object v1, Lg21;->y:Lg21;

    .line 294
    .line 295
    new-instance v2, Lg21;

    .line 296
    .line 297
    const/16 v3, 0x15

    .line 298
    .line 299
    const-string v4, "type_item"

    .line 300
    .line 301
    move-object/from16 v25, v1

    .line 302
    .line 303
    const-string v1, "TYPE_TYPE_ITEM"

    .line 304
    .line 305
    invoke-direct {v2, v1, v3, v4, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 306
    .line 307
    .line 308
    new-instance v1, Lg21;

    .line 309
    .line 310
    const/16 v3, 0x16

    .line 311
    .line 312
    const-string v4, "exception_handler_item"

    .line 313
    .line 314
    move-object/from16 v26, v2

    .line 315
    .line 316
    const-string v2, "TYPE_EXCEPTION_HANDLER_ITEM"

    .line 317
    .line 318
    invoke-direct {v1, v2, v3, v4, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 319
    .line 320
    .line 321
    new-instance v2, Lg21;

    .line 322
    .line 323
    const/16 v3, 0x17

    .line 324
    .line 325
    const-string v4, "annotation_set_ref_item"

    .line 326
    .line 327
    move-object/from16 v27, v1

    .line 328
    .line 329
    const-string v1, "TYPE_ANNOTATION_SET_REF_ITEM"

    .line 330
    .line 331
    invoke-direct {v2, v1, v3, v4, v0}, Lg21;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 332
    .line 333
    .line 334
    move-object/from16 v1, v16

    .line 335
    .line 336
    move-object/from16 v3, v18

    .line 337
    .line 338
    move-object/from16 v4, v19

    .line 339
    .line 340
    move-object/from16 v16, v20

    .line 341
    .line 342
    move-object/from16 v18, v22

    .line 343
    .line 344
    move-object/from16 v19, v23

    .line 345
    .line 346
    move-object/from16 v20, v24

    .line 347
    .line 348
    move-object/from16 v22, v26

    .line 349
    .line 350
    move-object/from16 v23, v27

    .line 351
    .line 352
    move-object/from16 v24, v2

    .line 353
    .line 354
    move-object/from16 v2, v17

    .line 355
    .line 356
    move-object/from16 v17, v21

    .line 357
    .line 358
    move-object/from16 v21, v25

    .line 359
    .line 360
    filled-new-array/range {v1 .. v24}, [Lg21;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    sput-object v0, Lg21;->z:[Lg21;

    .line 365
    .line 366
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lg21;->h:I

    .line 5
    .line 6
    iput-object p3, p0, Lg21;->i:Ljava/lang/String;

    .line 7
    .line 8
    const-string p1, "_item"

    .line 9
    .line 10
    invoke-virtual {p3, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/lit8 p1, p1, -0x5

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-virtual {p3, p2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    :cond_0
    const/16 p1, 0x5f

    .line 28
    .line 29
    const/16 p2, 0x20

    .line 30
    .line 31
    invoke-virtual {p3, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lg21;->j:Ljava/lang/String;

    .line 36
    .line 37
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg21;
    .locals 1

    .line 1
    const-class v0, Lg21;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lg21;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lg21;
    .locals 1

    .line 1
    sget-object v0, Lg21;->z:[Lg21;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lg21;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lg21;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lg21;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
