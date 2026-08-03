.class public final Lfb/n0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final c:Ljava/lang/Object;

.field public static final d:Ljava/util/LinkedHashMap;

.field public static e:Lfb/j0;

.field public static final f:Ljava/util/List;

.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;

.field public static final i:Ljava/util/List;

.field public static final j:Ljava/util/List;

.field public static final k:Ljava/util/List;

.field public static final l:Ljava/util/List;

.field public static final m:Ljava/util/List;

.field public static final n:Ljava/util/List;

.field public static final o:Ljava/util/List;

.field public static final p:Ljava/util/List;

.field public static final q:Ljava/util/List;

.field public static final r:Ljava/util/List;

.field public static final s:Ljava/util/List;

.field public static final t:Ljava/util/List;

.field public static final u:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    const-string v20, "decode_xml"

    .line 2
    .line 3
    const-string v21, "manifest"

    .line 4
    .line 5
    const-string v1, "open_target_session"

    .line 6
    .line 7
    const-string v2, "list_target_sessions"

    .line 8
    .line 9
    const-string v3, "get_target_session"

    .line 10
    .line 11
    const-string v4, "close_target_session"

    .line 12
    .line 13
    const-string v5, "compare_methods_using_strings"

    .line 14
    .line 15
    const-string v6, "find_classes_using_strings"

    .line 16
    .line 17
    const-string v7, "find_methods_using_strings"

    .line 18
    .line 19
    const-string v8, "find_methods_using_resource"

    .line 20
    .line 21
    const-string v9, "find_methods"

    .line 22
    .line 23
    const-string v10, "inspect_method"

    .line 24
    .line 25
    const-string v11, "inspect_class"

    .line 26
    .line 27
    const-string v12, "export_method_java"

    .line 28
    .line 29
    const-string v13, "export_class_java"

    .line 30
    .line 31
    const-string v14, "export_method_smali"

    .line 32
    .line 33
    const-string v15, "export_class_smali"

    .line 34
    .line 35
    const-string v16, "read_tool_result"

    .line 36
    .line 37
    const-string v17, "find_resource_values"

    .line 38
    .line 39
    const-string v18, "get_resource_value"

    .line 40
    .line 41
    const-string v19, "list_res"

    .line 42
    .line 43
    filled-new-array/range {v1 .. v21}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lfb/n0;->a:Ljava/util/Set;

    .line 52
    .line 53
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lfb/n0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 60
    .line 61
    new-instance v0, Ljava/lang/Object;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lfb/n0;->c:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    const-string v7, "sourcePath"

    .line 76
    .line 77
    const-string v8, "sourceEntry"

    .line 78
    .line 79
    const-string v1, "className"

    .line 80
    .line 81
    const-string v2, "descriptor"

    .line 82
    .line 83
    const-string v3, "sourceFile"

    .line 84
    .line 85
    const-string v4, "methodCount"

    .line 86
    .line 87
    const-string v5, "fieldCount"

    .line 88
    .line 89
    const-string v6, "modifiers"

    .line 90
    .line 91
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lfb/n0;->f:Ljava/util/List;

    .line 100
    .line 101
    const-string v0, "methodCount"

    .line 102
    .line 103
    const-string v1, "fieldCount"

    .line 104
    .line 105
    const-string v2, "className"

    .line 106
    .line 107
    const-string v3, "descriptor"

    .line 108
    .line 109
    const-string v4, "sourceFile"

    .line 110
    .line 111
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lfb/n0;->g:Ljava/util/List;

    .line 120
    .line 121
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    sput-object v0, Lfb/n0;->h:Ljava/util/List;

    .line 130
    .line 131
    const-string v12, "sourcePath"

    .line 132
    .line 133
    const-string v13, "sourceEntry"

    .line 134
    .line 135
    const-string v4, "className"

    .line 136
    .line 137
    const-string v5, "methodName"

    .line 138
    .line 139
    const-string v6, "descriptor"

    .line 140
    .line 141
    const-string v7, "methodSign"

    .line 142
    .line 143
    const-string v8, "returnType"

    .line 144
    .line 145
    const-string v9, "paramTypes"

    .line 146
    .line 147
    const-string v10, "paramCount"

    .line 148
    .line 149
    const-string v11, "modifiers"

    .line 150
    .line 151
    filled-new-array/range {v4 .. v13}, [Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Lfb/n0;->i:Ljava/util/List;

    .line 160
    .line 161
    const-string v10, "paramCount"

    .line 162
    .line 163
    const-string v11, "modifiers"

    .line 164
    .line 165
    const-string v4, "className"

    .line 166
    .line 167
    const-string v5, "methodName"

    .line 168
    .line 169
    const-string v6, "descriptor"

    .line 170
    .line 171
    const-string v7, "methodSign"

    .line 172
    .line 173
    const-string v8, "returnType"

    .line 174
    .line 175
    const-string v9, "paramTypes"

    .line 176
    .line 177
    filled-new-array/range {v4 .. v11}, [Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    sput-object v0, Lfb/n0;->j:Ljava/util/List;

    .line 186
    .line 187
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lfb/n0;->k:Ljava/util/List;

    .line 192
    .line 193
    const-string v6, "sourceEntry"

    .line 194
    .line 195
    const-string v7, "resolution"

    .line 196
    .line 197
    const-string v1, "resourceId"

    .line 198
    .line 199
    const-string v2, "type"

    .line 200
    .line 201
    const-string v3, "name"

    .line 202
    .line 203
    const-string v4, "filePath"

    .line 204
    .line 205
    const-string v5, "sourcePath"

    .line 206
    .line 207
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, Lfb/n0;->l:Ljava/util/List;

    .line 216
    .line 217
    const-string v9, "sourceEntry"

    .line 218
    .line 219
    const-string v10, "resolution"

    .line 220
    .line 221
    const-string v1, "resourceId"

    .line 222
    .line 223
    const-string v2, "type"

    .line 224
    .line 225
    const-string v3, "name"

    .line 226
    .line 227
    const-string v4, "value"

    .line 228
    .line 229
    const-string v5, "qualifiers"

    .line 230
    .line 231
    const-string v6, "default"

    .line 232
    .line 233
    const-string v7, "filePath"

    .line 234
    .line 235
    const-string v8, "sourcePath"

    .line 236
    .line 237
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sput-object v0, Lfb/n0;->m:Ljava/util/List;

    .line 246
    .line 247
    const-string v0, "sourcePath"

    .line 248
    .line 249
    const-string v1, "resourceId"

    .line 250
    .line 251
    const-string v2, "type"

    .line 252
    .line 253
    const-string v3, "name"

    .line 254
    .line 255
    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sput-object v0, Lfb/n0;->n:Ljava/util/List;

    .line 264
    .line 265
    const-string v9, "default"

    .line 266
    .line 267
    const-string v10, "sourcePath"

    .line 268
    .line 269
    const-string v4, "resourceId"

    .line 270
    .line 271
    const-string v5, "type"

    .line 272
    .line 273
    const-string v6, "name"

    .line 274
    .line 275
    const-string v7, "value"

    .line 276
    .line 277
    const-string v8, "qualifiers"

    .line 278
    .line 279
    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sput-object v0, Lfb/n0;->o:Ljava/util/List;

    .line 288
    .line 289
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    sput-object v0, Lfb/n0;->p:Ljava/util/List;

    .line 298
    .line 299
    sput-object v0, Lfb/n0;->q:Ljava/util/List;

    .line 300
    .line 301
    const-string v5, "annotations"

    .line 302
    .line 303
    const-string v6, "opcodes"

    .line 304
    .line 305
    const-string v1, "strings"

    .line 306
    .line 307
    const-string v2, "using-fields"

    .line 308
    .line 309
    const-string v3, "invokes"

    .line 310
    .line 311
    const-string v4, "callers"

    .line 312
    .line 313
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    sput-object v0, Lfb/n0;->r:Ljava/util/List;

    .line 322
    .line 323
    const-string v0, "methods"

    .line 324
    .line 325
    const-string v1, "annotations"

    .line 326
    .line 327
    const-string v2, "fields"

    .line 328
    .line 329
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    sput-object v0, Lfb/n0;->s:Ljava/util/List;

    .line 338
    .line 339
    const-string v9, "receivers"

    .line 340
    .line 341
    const-string v10, "providers"

    .line 342
    .line 343
    const-string v1, "uses-sdk"

    .line 344
    .line 345
    const-string v2, "application"

    .line 346
    .line 347
    const-string v3, "uses-permissions"

    .line 348
    .line 349
    const-string v4, "defined-permissions"

    .line 350
    .line 351
    const-string v5, "uses-features"

    .line 352
    .line 353
    const-string v6, "activities"

    .line 354
    .line 355
    const-string v7, "activity-aliases"

    .line 356
    .line 357
    const-string v8, "services"

    .line 358
    .line 359
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, Lfb/n0;->t:Ljava/util/List;

    .line 368
    .line 369
    const-string v0, "close_target_session"

    .line 370
    .line 371
    const-string v1, "compare_methods_using_strings"

    .line 372
    .line 373
    const-string v2, "open_target_session"

    .line 374
    .line 375
    const-string v3, "list_target_sessions"

    .line 376
    .line 377
    const-string v4, "get_target_session"

    .line 378
    .line 379
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    sput-object v0, Lfb/n0;->u:Ljava/util/Set;

    .line 388
    .line 389
    return-void
.end method

.method public static A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "integer"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    invoke-static {v2, v0, v1, p0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "default"

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    const-string p1, "minimum"

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const-string p2, "maximum"

    .line 28
    .line 29
    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-object p0
.end method

.method public static B(Lorg/json/JSONObject;)I
    .locals 2

    .line 1
    const-string v0, "limit"

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x64

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lr9/e0;->r(III)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static C(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lfb/j0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v1}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v1, Ll7/l;

    .line 19
    .line 20
    new-instance v2, Ll7/d;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v1, v3}, Ll7/l;->W(Ll7/f;)Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v2, v1, v4}, Ll7/d;-><init>(Ljava/util/Iterator;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lng/m;->R(Ljava/util/Iterator;)Lng/j;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lca/s;

    .line 36
    .line 37
    const/4 v4, 0x7

    .line 38
    invoke-direct {v2, v0, v4}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lng/i;

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    invoke-direct {v0, v1, v4, v2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, Lfb/n0;->p:Ljava/util/List;

    .line 52
    .line 53
    sget-object v2, Lfb/n0;->n:Ljava/util/List;

    .line 54
    .line 55
    sget-object v4, Lfb/n0;->l:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {p1, v4, v1, v2}, Lfb/n0;->N(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "offset"

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-gez v2, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move v4, v2

    .line 72
    :goto_0
    invoke-static {v4, v0}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {p1}, Lfb/n0;->B(Lorg/json/JSONObject;)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-static {v4, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v4, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_1

    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Lt7/b;

    .line 108
    .line 109
    invoke-static {p0, v5, v3, v1}, Lfb/n0;->S(Lfb/j0;Lt7/b;Lfb/l0;Ljava/util/Set;)Lorg/json/JSONObject;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-static {v4, p0, p1}, Lfb/n0;->T(Ljava/util/ArrayList;ILorg/json/JSONObject;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method

.method public static D(Lfb/j0;)Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v1, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Lfb/m0;

    .line 33
    .line 34
    iget-object v5, v4, Lfb/m0;->c:Ljava/lang/String;

    .line 35
    .line 36
    const-string v6, "external_wechat_apk"

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    new-instance v5, Ljava/io/File;

    .line 45
    .line 46
    iget-object v4, v4, Lfb/m0;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Lfb/m0;

    .line 85
    .line 86
    iget-object v3, v3, Lfb/m0;->a:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_3

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_7

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    sget-object v3, Lfb/n0;->e:Lfb/j0;

    .line 119
    .line 120
    const/4 v4, 0x0

    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    iget-object v3, v3, Lfb/j0;->j:Ljava/lang/String;

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-object v3, v4

    .line 127
    :goto_3
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_4

    .line 132
    .line 133
    sget-object v2, Lfb/n0;->e:Lfb/j0;

    .line 134
    .line 135
    if-eqz v2, :cond_6

    .line 136
    .line 137
    invoke-virtual {v2}, Lfb/j0;->close()V

    .line 138
    .line 139
    .line 140
    :cond_6
    sput-object v4, Lfb/n0;->e:Lfb/j0;

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    invoke-static {p0}, Lfb/n0;->L(Lfb/j0;)V

    .line 144
    .line 145
    .line 146
    :goto_4
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    check-cast v0, Ljava/lang/Iterable;

    .line 154
    .line 155
    new-instance v1, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_8

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Lfb/m0;

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {p0, v2}, Lfb/n0;->d0(Lfb/j0;Lfb/m0;)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_8
    new-instance v0, Lorg/json/JSONObject;

    .line 192
    .line 193
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v2, "total"

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 203
    .line 204
    .line 205
    const-string v2, "default_session_id"

    .line 206
    .line 207
    iget-object p0, p0, Lfb/j0;->j:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 210
    .line 211
    .line 212
    new-instance p0, Lorg/json/JSONArray;

    .line 213
    .line 214
    invoke-direct {p0, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 215
    .line 216
    .line 217
    const-string v1, "items"

    .line 218
    .line 219
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    return-object p0
.end method

.method public static E(Lfb/j0;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lfb/j0;->g:Landroid/content/Context;

    .line 4
    .line 5
    const-string v3, "Hchat_agent_reverse_targets"

    .line 6
    .line 7
    invoke-static {v2, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v4, "targets_v1"

    .line 12
    .line 13
    const-string v5, ""

    .line 14
    .line 15
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    move-object v0, v5

    .line 22
    :cond_0
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_1

    .line 27
    .line 28
    goto/16 :goto_8

    .line 29
    .line 30
    :cond_1
    :try_start_0
    new-instance v6, Lorg/json/JSONArray;

    .line 31
    .line 32
    invoke-direct {v6, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 36
    .line 37
    .line 38
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    const/4 v0, 0x0

    .line 40
    move v8, v0

    .line 41
    move v9, v8

    .line 42
    :goto_0
    sget-object v10, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    if-lt v8, v7, :cond_4

    .line 45
    .line 46
    :try_start_1
    invoke-virtual {v10}, Ljava/util/AbstractMap;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {v1}, Lfb/n0;->O(Lfb/j0;)V

    .line 51
    .line 52
    .line 53
    if-nez v9, :cond_2

    .line 54
    .line 55
    invoke-virtual {v10}, Ljava/util/AbstractMap;->size()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eq v5, v0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_2
    :goto_1
    invoke-static {v1}, Lfb/n0;->L(Lfb/j0;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    goto/16 :goto_7

    .line 71
    .line 72
    :cond_4
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    const/4 v12, 0x1

    .line 77
    if-nez v11, :cond_6

    .line 78
    .line 79
    :cond_5
    :goto_2
    move v9, v12

    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_6
    :try_start_2
    new-instance v0, Ljava/io/File;

    .line 83
    .line 84
    const-string v13, "path"

    .line 85
    .line 86
    invoke-virtual {v11, v13, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    invoke-direct {v0, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    goto :goto_3

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    :try_start_3
    new-instance v13, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    move-object v0, v13

    .line 105
    :goto_3
    nop

    .line 106
    instance-of v13, v0, Lsf/f;

    .line 107
    .line 108
    if-eqz v13, :cond_7

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    :cond_7
    check-cast v0, Ljava/io/File;

    .line 112
    .line 113
    if-nez v0, :cond_8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-eqz v13, :cond_5

    .line 121
    .line 122
    invoke-static {v0}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    const-string v14, "apk"

    .line 127
    .line 128
    invoke-virtual {v13, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-eqz v13, :cond_5

    .line 133
    .line 134
    new-instance v13, Ljava/io/File;

    .line 135
    .line 136
    iget-object v14, v1, Lfb/j0;->i:Ljava/lang/String;

    .line 137
    .line 138
    invoke-direct {v13, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v13}, Lfb/n0;->W(Ljava/io/File;Ljava/io/File;)Z

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    if-eqz v13, :cond_9

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_9
    new-instance v14, Lfb/m0;

    .line 149
    .line 150
    invoke-static {v0}, Lfb/n0;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const-string v17, "external_wechat_apk"

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 164
    .line 165
    .line 166
    move-result-wide v18

    .line 167
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 168
    .line 169
    .line 170
    move-result-wide v20

    .line 171
    const-string v12, "addedAt"

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    invoke-virtual {v11, v12, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v0

    .line 181
    const-wide/16 v11, 0x0

    .line 182
    .line 183
    cmp-long v13, v0, v11

    .line 184
    .line 185
    if-gez v13, :cond_a

    .line 186
    .line 187
    move-wide/from16 v22, v11

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_a
    move-wide/from16 v22, v0

    .line 191
    .line 192
    :goto_4
    invoke-direct/range {v14 .. v23}, Lfb/m0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v10, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 196
    .line 197
    .line 198
    :goto_5
    add-int/lit8 v8, v8, 0x1

    .line 199
    .line 200
    move-object/from16 v1, p0

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :goto_6
    new-instance v1, Lsf/f;

    .line 205
    .line 206
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    move-object v0, v1

    .line 210
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-eqz v0, :cond_b

    .line 215
    .line 216
    invoke-static {v2, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-interface {v0, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 229
    .line 230
    .line 231
    :cond_b
    :goto_8
    return-void
.end method

.method public static F(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "include"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v1, v2}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Ljava/lang/Iterable;

    .line 17
    .line 18
    instance-of v3, v2, Ljava/util/Collection;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    sget-object v4, Lfb/n0;->t:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string v0, "manifest include \u5305\u542b\u4e0d\u652f\u6301\u7684\u503c"

    .line 58
    .line 59
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    return-object v0

    .line 64
    :cond_2
    :goto_1
    iget-object v2, v0, Lfb/j0;->g:Landroid/content/Context;

    .line 65
    .line 66
    iget-object v0, v0, Lfb/j0;->i:Ljava/lang/String;

    .line 67
    .line 68
    const/16 v3, 0x508f

    .line 69
    .line 70
    invoke-static {v2, v0, v3}, Lfb/n0;->c(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_4b

    .line 75
    .line 76
    new-instance v3, Lorg/json/JSONObject;

    .line 77
    .line 78
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v4, "packageName"

    .line 82
    .line 83
    iget-object v5, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    iget-object v4, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 89
    .line 90
    const-string v5, ""

    .line 91
    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object v4, v5

    .line 96
    :goto_2
    const-string v6, "versionName"

    .line 97
    .line 98
    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    const-string v4, "versionCode"

    .line 102
    .line 103
    invoke-static {v2}, Lb0/b0;->b(Landroid/content/pm/PackageInfo;)J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    invoke-virtual {v3, v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    const-string v4, "sourcePath"

    .line 111
    .line 112
    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    const-string v0, "sourceEntry"

    .line 116
    .line 117
    const-string v4, "AndroidManifest.xml"

    .line 118
    .line 119
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 123
    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_4
    move-object v0, v5

    .line 132
    :goto_3
    const-string v4, "applicationClass"

    .line 133
    .line 134
    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    .line 136
    .line 137
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    const/4 v0, 0x0

    .line 145
    :goto_4
    const-string v6, "minSdk"

    .line 146
    .line 147
    invoke-virtual {v3, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 151
    .line 152
    if-eqz v0, :cond_6

    .line 153
    .line 154
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_6
    const/4 v0, 0x0

    .line 158
    :goto_5
    const-string v6, "targetSdk"

    .line 159
    .line 160
    invoke-virtual {v3, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    new-instance v0, Lorg/json/JSONArray;

    .line 164
    .line 165
    iget-object v6, v2, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 166
    .line 167
    if-eqz v6, :cond_7

    .line 168
    .line 169
    invoke-static {v6}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    goto :goto_6

    .line 174
    :cond_7
    const/4 v6, 0x0

    .line 175
    :goto_6
    sget-object v8, Ltf/t;->g:Ltf/t;

    .line 176
    .line 177
    if-nez v6, :cond_8

    .line 178
    .line 179
    move-object v6, v8

    .line 180
    :cond_8
    invoke-direct {v0, v6}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 181
    .line 182
    .line 183
    const-string v6, "permissions"

    .line 184
    .line 185
    invoke-virtual {v3, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 189
    .line 190
    if-eqz v0, :cond_9

    .line 191
    .line 192
    new-instance v6, Ljava/util/ArrayList;

    .line 193
    .line 194
    array-length v9, v0

    .line 195
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    array-length v9, v0

    .line 199
    const/4 v10, 0x0

    .line 200
    :goto_7
    if-ge v10, v9, :cond_a

    .line 201
    .line 202
    aget-object v11, v0, v10

    .line 203
    .line 204
    iget-object v11, v11, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    add-int/lit8 v10, v10, 0x1

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_9
    const/4 v6, 0x0

    .line 213
    :cond_a
    if-nez v6, :cond_b

    .line 214
    .line 215
    move-object v6, v8

    .line 216
    :cond_b
    new-instance v0, Lorg/json/JSONArray;

    .line 217
    .line 218
    invoke-direct {v0, v6}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 219
    .line 220
    .line 221
    const-string v6, "activities"

    .line 222
    .line 223
    invoke-virtual {v3, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 227
    .line 228
    if-eqz v0, :cond_c

    .line 229
    .line 230
    new-instance v9, Ljava/util/ArrayList;

    .line 231
    .line 232
    array-length v10, v0

    .line 233
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 234
    .line 235
    .line 236
    array-length v10, v0

    .line 237
    const/4 v11, 0x0

    .line 238
    :goto_8
    if-ge v11, v10, :cond_d

    .line 239
    .line 240
    aget-object v12, v0, v11

    .line 241
    .line 242
    iget-object v12, v12, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    add-int/lit8 v11, v11, 0x1

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_c
    const/4 v9, 0x0

    .line 251
    :cond_d
    if-nez v9, :cond_e

    .line 252
    .line 253
    move-object v9, v8

    .line 254
    :cond_e
    new-instance v0, Lorg/json/JSONArray;

    .line 255
    .line 256
    invoke-direct {v0, v9}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 257
    .line 258
    .line 259
    const-string v9, "services"

    .line 260
    .line 261
    invoke-virtual {v3, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 262
    .line 263
    .line 264
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 265
    .line 266
    if-eqz v0, :cond_f

    .line 267
    .line 268
    new-instance v10, Ljava/util/ArrayList;

    .line 269
    .line 270
    array-length v11, v0

    .line 271
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 272
    .line 273
    .line 274
    array-length v11, v0

    .line 275
    const/4 v12, 0x0

    .line 276
    :goto_9
    if-ge v12, v11, :cond_10

    .line 277
    .line 278
    aget-object v13, v0, v12

    .line 279
    .line 280
    iget-object v13, v13, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    add-int/lit8 v12, v12, 0x1

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_f
    const/4 v10, 0x0

    .line 289
    :cond_10
    if-nez v10, :cond_11

    .line 290
    .line 291
    move-object v10, v8

    .line 292
    :cond_11
    new-instance v0, Lorg/json/JSONArray;

    .line 293
    .line 294
    invoke-direct {v0, v10}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 295
    .line 296
    .line 297
    const-string v10, "receivers"

    .line 298
    .line 299
    invoke-virtual {v3, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 300
    .line 301
    .line 302
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    .line 303
    .line 304
    if-eqz v0, :cond_12

    .line 305
    .line 306
    new-instance v11, Ljava/util/ArrayList;

    .line 307
    .line 308
    array-length v12, v0

    .line 309
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 310
    .line 311
    .line 312
    array-length v12, v0

    .line 313
    const/4 v13, 0x0

    .line 314
    :goto_a
    if-ge v13, v12, :cond_13

    .line 315
    .line 316
    aget-object v14, v0, v13

    .line 317
    .line 318
    iget-object v14, v14, Landroid/content/pm/ProviderInfo;->name:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    add-int/lit8 v13, v13, 0x1

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_12
    const/4 v11, 0x0

    .line 327
    :cond_13
    if-nez v11, :cond_14

    .line 328
    .line 329
    move-object v11, v8

    .line 330
    :cond_14
    new-instance v0, Lorg/json/JSONArray;

    .line 331
    .line 332
    invoke-direct {v0, v11}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 333
    .line 334
    .line 335
    const-string v11, "providers"

    .line 336
    .line 337
    invoke-virtual {v3, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 338
    .line 339
    .line 340
    const-string v0, "uses-sdk"

    .line 341
    .line 342
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_17

    .line 347
    .line 348
    new-instance v0, Lorg/json/JSONObject;

    .line 349
    .line 350
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 351
    .line 352
    .line 353
    iget-object v12, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 354
    .line 355
    if-eqz v12, :cond_15

    .line 356
    .line 357
    iget v12, v12, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 358
    .line 359
    goto :goto_b

    .line 360
    :cond_15
    const/4 v12, 0x0

    .line 361
    :goto_b
    const-string v13, "minSdkVersion"

    .line 362
    .line 363
    invoke-virtual {v0, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 364
    .line 365
    .line 366
    iget-object v12, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 367
    .line 368
    if-eqz v12, :cond_16

    .line 369
    .line 370
    iget v12, v12, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 371
    .line 372
    goto :goto_c

    .line 373
    :cond_16
    const/4 v12, 0x0

    .line 374
    :goto_c
    const-string v13, "targetSdkVersion"

    .line 375
    .line 376
    invoke-virtual {v0, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 377
    .line 378
    .line 379
    const-string v12, "usesSdk"

    .line 380
    .line 381
    invoke-virtual {v3, v12, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 382
    .line 383
    .line 384
    :cond_17
    const-string v0, "application"

    .line 385
    .line 386
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v12

    .line 390
    const-string v13, "metaData"

    .line 391
    .line 392
    const-string v14, "name"

    .line 393
    .line 394
    if-eqz v12, :cond_1b

    .line 395
    .line 396
    iget-object v12, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 397
    .line 398
    if-eqz v12, :cond_1a

    .line 399
    .line 400
    new-instance v15, Lorg/json/JSONObject;

    .line 401
    .line 402
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 403
    .line 404
    .line 405
    iget-object v4, v12, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 406
    .line 407
    if-eqz v4, :cond_18

    .line 408
    .line 409
    goto :goto_d

    .line 410
    :cond_18
    move-object v4, v5

    .line 411
    :goto_d
    invoke-virtual {v15, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 412
    .line 413
    .line 414
    iget-object v4, v12, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 415
    .line 416
    if-eqz v4, :cond_19

    .line 417
    .line 418
    move-object v5, v4

    .line 419
    :cond_19
    const-string v4, "process"

    .line 420
    .line 421
    invoke-virtual {v15, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 422
    .line 423
    .line 424
    const-string v4, "enabled"

    .line 425
    .line 426
    iget-boolean v5, v12, Landroid/content/pm/ApplicationInfo;->enabled:Z

    .line 427
    .line 428
    invoke-virtual {v15, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 429
    .line 430
    .line 431
    const-string v4, "labelRes"

    .line 432
    .line 433
    iget v5, v12, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 434
    .line 435
    invoke-virtual {v15, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 436
    .line 437
    .line 438
    const-string v4, "icon"

    .line 439
    .line 440
    iget v5, v12, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 441
    .line 442
    invoke-virtual {v15, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 443
    .line 444
    .line 445
    iget-object v4, v12, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 446
    .line 447
    invoke-static {v4}, Lfb/n0;->f(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    invoke-virtual {v15, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 452
    .line 453
    .line 454
    goto :goto_e

    .line 455
    :cond_1a
    sget-object v15, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 456
    .line 457
    :goto_e
    invoke-virtual {v3, v0, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 458
    .line 459
    .line 460
    :cond_1b
    const-string v0, "uses-permissions"

    .line 461
    .line 462
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-eqz v0, :cond_1e

    .line 467
    .line 468
    new-instance v0, Lorg/json/JSONArray;

    .line 469
    .line 470
    iget-object v4, v2, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 471
    .line 472
    if-eqz v4, :cond_1c

    .line 473
    .line 474
    invoke-static {v4}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    goto :goto_f

    .line 479
    :cond_1c
    const/4 v4, 0x0

    .line 480
    :goto_f
    if-nez v4, :cond_1d

    .line 481
    .line 482
    move-object v4, v8

    .line 483
    :cond_1d
    invoke-direct {v0, v4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 484
    .line 485
    .line 486
    const-string v4, "usesPermissions"

    .line 487
    .line 488
    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 489
    .line 490
    .line 491
    :cond_1e
    const-string v0, "defined-permissions"

    .line 492
    .line 493
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_22

    .line 498
    .line 499
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    .line 500
    .line 501
    if-eqz v0, :cond_1f

    .line 502
    .line 503
    new-instance v4, Ljava/util/ArrayList;

    .line 504
    .line 505
    array-length v5, v0

    .line 506
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 507
    .line 508
    .line 509
    array-length v5, v0

    .line 510
    const/4 v12, 0x0

    .line 511
    :goto_10
    if-ge v12, v5, :cond_20

    .line 512
    .line 513
    aget-object v15, v0, v12

    .line 514
    .line 515
    new-instance v7, Lorg/json/JSONObject;

    .line 516
    .line 517
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 518
    .line 519
    .line 520
    move-object/from16 v16, v0

    .line 521
    .line 522
    iget-object v0, v15, Landroid/content/pm/PermissionInfo;->name:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v7, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 525
    .line 526
    .line 527
    const-string v0, "protectionLevel"

    .line 528
    .line 529
    iget v15, v15, Landroid/content/pm/PermissionInfo;->protectionLevel:I

    .line 530
    .line 531
    invoke-virtual {v7, v0, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    add-int/lit8 v12, v12, 0x1

    .line 538
    .line 539
    move-object/from16 v0, v16

    .line 540
    .line 541
    goto :goto_10

    .line 542
    :cond_1f
    const/4 v4, 0x0

    .line 543
    :cond_20
    if-nez v4, :cond_21

    .line 544
    .line 545
    move-object v4, v8

    .line 546
    :cond_21
    new-instance v0, Lorg/json/JSONArray;

    .line 547
    .line 548
    invoke-direct {v0, v4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 549
    .line 550
    .line 551
    const-string v4, "definedPermissions"

    .line 552
    .line 553
    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 554
    .line 555
    .line 556
    :cond_22
    const-string v0, "uses-features"

    .line 557
    .line 558
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_2a

    .line 563
    .line 564
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->reqFeatures:[Landroid/content/pm/FeatureInfo;

    .line 565
    .line 566
    if-eqz v0, :cond_28

    .line 567
    .line 568
    new-instance v5, Ljava/util/ArrayList;

    .line 569
    .line 570
    array-length v7, v0

    .line 571
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 572
    .line 573
    .line 574
    array-length v7, v0

    .line 575
    const/4 v12, 0x0

    .line 576
    :goto_11
    if-ge v12, v7, :cond_27

    .line 577
    .line 578
    aget-object v15, v0, v12

    .line 579
    .line 580
    const/16 v16, 0x1

    .line 581
    .line 582
    new-instance v4, Lorg/json/JSONObject;

    .line 583
    .line 584
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 585
    .line 586
    .line 587
    move-object/from16 v17, v0

    .line 588
    .line 589
    iget-object v0, v15, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    .line 590
    .line 591
    if-eqz v0, :cond_23

    .line 592
    .line 593
    goto :goto_12

    .line 594
    :cond_23
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 595
    .line 596
    :goto_12
    invoke-virtual {v4, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 597
    .line 598
    .line 599
    iget v0, v15, Landroid/content/pm/FeatureInfo;->flags:I

    .line 600
    .line 601
    and-int/lit8 v0, v0, 0x1

    .line 602
    .line 603
    if-eqz v0, :cond_24

    .line 604
    .line 605
    move/from16 v0, v16

    .line 606
    .line 607
    :goto_13
    move/from16 v18, v7

    .line 608
    .line 609
    goto :goto_14

    .line 610
    :cond_24
    const/4 v0, 0x0

    .line 611
    goto :goto_13

    .line 612
    :goto_14
    const-string v7, "required"

    .line 613
    .line 614
    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 615
    .line 616
    .line 617
    iget v0, v15, Landroid/content/pm/FeatureInfo;->reqGlEsVersion:I

    .line 618
    .line 619
    const/16 v7, 0x10

    .line 620
    .line 621
    invoke-static {v7}, La/a;->w(I)V

    .line 622
    .line 623
    .line 624
    move/from16 v19, v7

    .line 625
    .line 626
    move-object v15, v8

    .line 627
    int-to-long v7, v0

    .line 628
    const-wide v20, 0xffffffffL

    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    and-long v7, v7, v20

    .line 634
    .line 635
    const-wide/16 v20, 0x0

    .line 636
    .line 637
    cmp-long v0, v7, v20

    .line 638
    .line 639
    if-ltz v0, :cond_25

    .line 640
    .line 641
    invoke-static/range {v19 .. v19}, La/a;->w(I)V

    .line 642
    .line 643
    .line 644
    move/from16 v0, v19

    .line 645
    .line 646
    invoke-static {v7, v8, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    move-object/from16 v21, v14

    .line 654
    .line 655
    move-object/from16 v19, v15

    .line 656
    .line 657
    goto :goto_15

    .line 658
    :cond_25
    move/from16 v0, v19

    .line 659
    .line 660
    ushr-long v20, v7, v16

    .line 661
    .line 662
    move-wide/from16 v22, v7

    .line 663
    .line 664
    int-to-long v7, v0

    .line 665
    div-long v20, v20, v7

    .line 666
    .line 667
    shl-long v20, v20, v16

    .line 668
    .line 669
    mul-long v24, v20, v7

    .line 670
    .line 671
    sub-long v22, v22, v24

    .line 672
    .line 673
    cmp-long v0, v22, v7

    .line 674
    .line 675
    if-ltz v0, :cond_26

    .line 676
    .line 677
    sub-long v22, v22, v7

    .line 678
    .line 679
    const-wide/16 v7, 0x1

    .line 680
    .line 681
    add-long v20, v20, v7

    .line 682
    .line 683
    :cond_26
    move-object v0, v14

    .line 684
    move-object/from16 v19, v15

    .line 685
    .line 686
    move-wide/from16 v7, v20

    .line 687
    .line 688
    move-wide/from16 v14, v22

    .line 689
    .line 690
    const/16 v20, 0x10

    .line 691
    .line 692
    invoke-static/range {v20 .. v20}, La/a;->w(I)V

    .line 693
    .line 694
    .line 695
    move-object/from16 v21, v0

    .line 696
    .line 697
    move/from16 v0, v20

    .line 698
    .line 699
    invoke-static {v7, v8, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    invoke-static {v0}, La/a;->w(I)V

    .line 707
    .line 708
    .line 709
    invoke-static {v14, v15, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    :goto_15
    const/16 v7, 0x8

    .line 721
    .line 722
    invoke-static {v7, v0}, Log/m;->y0(ILjava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    new-instance v7, Ljava/lang/StringBuilder;

    .line 727
    .line 728
    const-string v8, "0x"

    .line 729
    .line 730
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    const-string v7, "glEsVersion"

    .line 741
    .line 742
    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    add-int/lit8 v12, v12, 0x1

    .line 749
    .line 750
    move-object/from16 v0, v17

    .line 751
    .line 752
    move/from16 v7, v18

    .line 753
    .line 754
    move-object/from16 v8, v19

    .line 755
    .line 756
    move-object/from16 v14, v21

    .line 757
    .line 758
    goto/16 :goto_11

    .line 759
    .line 760
    :cond_27
    :goto_16
    move-object/from16 v19, v8

    .line 761
    .line 762
    const/16 v16, 0x1

    .line 763
    .line 764
    goto :goto_17

    .line 765
    :cond_28
    const/4 v5, 0x0

    .line 766
    goto :goto_16

    .line 767
    :goto_17
    if-nez v5, :cond_29

    .line 768
    .line 769
    move-object/from16 v5, v19

    .line 770
    .line 771
    :cond_29
    new-instance v0, Lorg/json/JSONArray;

    .line 772
    .line 773
    invoke-direct {v0, v5}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 774
    .line 775
    .line 776
    const-string v4, "usesFeatures"

    .line 777
    .line 778
    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 779
    .line 780
    .line 781
    goto :goto_18

    .line 782
    :cond_2a
    move-object/from16 v19, v8

    .line 783
    .line 784
    const/16 v16, 0x1

    .line 785
    .line 786
    :goto_18
    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v0

    .line 790
    if-eqz v0, :cond_32

    .line 791
    .line 792
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 793
    .line 794
    if-eqz v0, :cond_2f

    .line 795
    .line 796
    new-instance v4, Ljava/util/ArrayList;

    .line 797
    .line 798
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 799
    .line 800
    .line 801
    array-length v5, v0

    .line 802
    const/4 v7, 0x0

    .line 803
    :goto_19
    if-ge v7, v5, :cond_2e

    .line 804
    .line 805
    aget-object v8, v0, v7

    .line 806
    .line 807
    iget-object v12, v8, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    .line 808
    .line 809
    if-eqz v12, :cond_2c

    .line 810
    .line 811
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 812
    .line 813
    .line 814
    move-result v12

    .line 815
    if-eqz v12, :cond_2b

    .line 816
    .line 817
    goto :goto_1a

    .line 818
    :cond_2b
    const/4 v12, 0x0

    .line 819
    goto :goto_1b

    .line 820
    :cond_2c
    :goto_1a
    move/from16 v12, v16

    .line 821
    .line 822
    :goto_1b
    if-eqz v12, :cond_2d

    .line 823
    .line 824
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    :cond_2d
    add-int/lit8 v7, v7, 0x1

    .line 828
    .line 829
    goto :goto_19

    .line 830
    :cond_2e
    new-instance v0, Ljava/util/ArrayList;

    .line 831
    .line 832
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    :goto_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 844
    .line 845
    .line 846
    move-result v5

    .line 847
    if-eqz v5, :cond_30

    .line 848
    .line 849
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v5

    .line 853
    check-cast v5, Landroid/content/pm/ActivityInfo;

    .line 854
    .line 855
    invoke-static {v5}, Lfb/n0;->a(Landroid/content/pm/ActivityInfo;)Lorg/json/JSONObject;

    .line 856
    .line 857
    .line 858
    move-result-object v5

    .line 859
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    goto :goto_1c

    .line 863
    :cond_2f
    const/4 v0, 0x0

    .line 864
    :cond_30
    if-nez v0, :cond_31

    .line 865
    .line 866
    move-object/from16 v0, v19

    .line 867
    .line 868
    :cond_31
    new-instance v4, Lorg/json/JSONArray;

    .line 869
    .line 870
    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 874
    .line 875
    .line 876
    :cond_32
    const-string v0, "activity-aliases"

    .line 877
    .line 878
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-eqz v0, :cond_3a

    .line 883
    .line 884
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 885
    .line 886
    if-eqz v0, :cond_37

    .line 887
    .line 888
    new-instance v4, Ljava/util/ArrayList;

    .line 889
    .line 890
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 891
    .line 892
    .line 893
    array-length v5, v0

    .line 894
    const/4 v6, 0x0

    .line 895
    :goto_1d
    if-ge v6, v5, :cond_36

    .line 896
    .line 897
    aget-object v7, v0, v6

    .line 898
    .line 899
    iget-object v8, v7, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    .line 900
    .line 901
    if-eqz v8, :cond_34

    .line 902
    .line 903
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 904
    .line 905
    .line 906
    move-result v8

    .line 907
    if-eqz v8, :cond_33

    .line 908
    .line 909
    goto :goto_1e

    .line 910
    :cond_33
    const/4 v8, 0x0

    .line 911
    goto :goto_1f

    .line 912
    :cond_34
    :goto_1e
    move/from16 v8, v16

    .line 913
    .line 914
    :goto_1f
    if-nez v8, :cond_35

    .line 915
    .line 916
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    :cond_35
    add-int/lit8 v6, v6, 0x1

    .line 920
    .line 921
    goto :goto_1d

    .line 922
    :cond_36
    new-instance v0, Ljava/util/ArrayList;

    .line 923
    .line 924
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 925
    .line 926
    .line 927
    move-result v5

    .line 928
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 932
    .line 933
    .line 934
    move-result-object v4

    .line 935
    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 936
    .line 937
    .line 938
    move-result v5

    .line 939
    if-eqz v5, :cond_38

    .line 940
    .line 941
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v5

    .line 945
    check-cast v5, Landroid/content/pm/ActivityInfo;

    .line 946
    .line 947
    invoke-static {v5}, Lfb/n0;->a(Landroid/content/pm/ActivityInfo;)Lorg/json/JSONObject;

    .line 948
    .line 949
    .line 950
    move-result-object v5

    .line 951
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    goto :goto_20

    .line 955
    :cond_37
    const/4 v0, 0x0

    .line 956
    :cond_38
    if-nez v0, :cond_39

    .line 957
    .line 958
    move-object/from16 v0, v19

    .line 959
    .line 960
    :cond_39
    new-instance v4, Lorg/json/JSONArray;

    .line 961
    .line 962
    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 963
    .line 964
    .line 965
    const-string v0, "activityAliases"

    .line 966
    .line 967
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 968
    .line 969
    .line 970
    :cond_3a
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    if-eqz v0, :cond_3f

    .line 975
    .line 976
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 977
    .line 978
    if-eqz v0, :cond_3c

    .line 979
    .line 980
    new-instance v4, Ljava/util/ArrayList;

    .line 981
    .line 982
    array-length v5, v0

    .line 983
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 984
    .line 985
    .line 986
    array-length v5, v0

    .line 987
    const/4 v6, 0x0

    .line 988
    :goto_21
    if-ge v6, v5, :cond_3d

    .line 989
    .line 990
    aget-object v7, v0, v6

    .line 991
    .line 992
    invoke-static {v7}, Lfb/n0;->j(Landroid/content/pm/ComponentInfo;)Lorg/json/JSONObject;

    .line 993
    .line 994
    .line 995
    move-result-object v8

    .line 996
    iget-object v12, v7, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;

    .line 997
    .line 998
    if-eqz v12, :cond_3b

    .line 999
    .line 1000
    goto :goto_22

    .line 1001
    :cond_3b
    sget-object v12, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1002
    .line 1003
    :goto_22
    const-string v14, "permission"

    .line 1004
    .line 1005
    invoke-virtual {v8, v14, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1006
    .line 1007
    .line 1008
    iget-object v7, v7, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 1009
    .line 1010
    invoke-static {v7}, Lfb/n0;->f(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v7

    .line 1014
    invoke-virtual {v8, v13, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    add-int/lit8 v6, v6, 0x1

    .line 1021
    .line 1022
    goto :goto_21

    .line 1023
    :cond_3c
    const/4 v4, 0x0

    .line 1024
    :cond_3d
    if-nez v4, :cond_3e

    .line 1025
    .line 1026
    move-object/from16 v4, v19

    .line 1027
    .line 1028
    :cond_3e
    new-instance v0, Lorg/json/JSONArray;

    .line 1029
    .line 1030
    invoke-direct {v0, v4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v3, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1034
    .line 1035
    .line 1036
    :cond_3f
    invoke-interface {v1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v0

    .line 1040
    if-eqz v0, :cond_43

    .line 1041
    .line 1042
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 1043
    .line 1044
    if-eqz v0, :cond_40

    .line 1045
    .line 1046
    new-instance v4, Ljava/util/ArrayList;

    .line 1047
    .line 1048
    array-length v5, v0

    .line 1049
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1050
    .line 1051
    .line 1052
    array-length v5, v0

    .line 1053
    const/4 v6, 0x0

    .line 1054
    :goto_23
    if-ge v6, v5, :cond_41

    .line 1055
    .line 1056
    aget-object v7, v0, v6

    .line 1057
    .line 1058
    invoke-static {v7}, Lfb/n0;->a(Landroid/content/pm/ActivityInfo;)Lorg/json/JSONObject;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v7

    .line 1062
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    add-int/lit8 v6, v6, 0x1

    .line 1066
    .line 1067
    goto :goto_23

    .line 1068
    :cond_40
    const/4 v4, 0x0

    .line 1069
    :cond_41
    if-nez v4, :cond_42

    .line 1070
    .line 1071
    move-object/from16 v4, v19

    .line 1072
    .line 1073
    :cond_42
    new-instance v0, Lorg/json/JSONArray;

    .line 1074
    .line 1075
    invoke-direct {v0, v4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v3, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1079
    .line 1080
    .line 1081
    :cond_43
    invoke-interface {v1, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v0

    .line 1085
    if-eqz v0, :cond_4a

    .line 1086
    .line 1087
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    .line 1088
    .line 1089
    if-eqz v0, :cond_47

    .line 1090
    .line 1091
    new-instance v7, Ljava/util/ArrayList;

    .line 1092
    .line 1093
    array-length v1, v0

    .line 1094
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1095
    .line 1096
    .line 1097
    array-length v1, v0

    .line 1098
    const/4 v4, 0x0

    .line 1099
    :goto_24
    if-ge v4, v1, :cond_48

    .line 1100
    .line 1101
    aget-object v2, v0, v4

    .line 1102
    .line 1103
    invoke-static {v2}, Lfb/n0;->j(Landroid/content/pm/ComponentInfo;)Lorg/json/JSONObject;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v5

    .line 1107
    iget-object v6, v2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 1108
    .line 1109
    if-eqz v6, :cond_44

    .line 1110
    .line 1111
    goto :goto_25

    .line 1112
    :cond_44
    sget-object v6, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1113
    .line 1114
    :goto_25
    const-string v8, "authorities"

    .line 1115
    .line 1116
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1117
    .line 1118
    .line 1119
    iget-object v6, v2, Landroid/content/pm/ProviderInfo;->readPermission:Ljava/lang/String;

    .line 1120
    .line 1121
    if-eqz v6, :cond_45

    .line 1122
    .line 1123
    goto :goto_26

    .line 1124
    :cond_45
    sget-object v6, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1125
    .line 1126
    :goto_26
    const-string v8, "readPermission"

    .line 1127
    .line 1128
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1129
    .line 1130
    .line 1131
    iget-object v6, v2, Landroid/content/pm/ProviderInfo;->writePermission:Ljava/lang/String;

    .line 1132
    .line 1133
    if-eqz v6, :cond_46

    .line 1134
    .line 1135
    goto :goto_27

    .line 1136
    :cond_46
    sget-object v6, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1137
    .line 1138
    :goto_27
    const-string v8, "writePermission"

    .line 1139
    .line 1140
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1141
    .line 1142
    .line 1143
    iget-object v2, v2, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;

    .line 1144
    .line 1145
    invoke-static {v2}, Lfb/n0;->f(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v2

    .line 1149
    invoke-virtual {v5, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1153
    .line 1154
    .line 1155
    add-int/lit8 v4, v4, 0x1

    .line 1156
    .line 1157
    goto :goto_24

    .line 1158
    :cond_47
    const/4 v7, 0x0

    .line 1159
    :cond_48
    if-nez v7, :cond_49

    .line 1160
    .line 1161
    move-object/from16 v8, v19

    .line 1162
    .line 1163
    goto :goto_28

    .line 1164
    :cond_49
    move-object v8, v7

    .line 1165
    :goto_28
    new-instance v0, Lorg/json/JSONArray;

    .line 1166
    .line 1167
    invoke-direct {v0, v8}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v3, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1171
    .line 1172
    .line 1173
    :cond_4a
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    return-object v0

    .line 1181
    :cond_4b
    const-string v1, "\u65e0\u6cd5\u89e3\u6790 APK Manifest: "

    .line 1182
    .line 1183
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    invoke-static {v0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    return-object v0
.end method

.method public static G(Lfb/j0;Ljava/util/List;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 10

    .line 1
    sget-object v0, Lfb/n0;->k:Ljava/util/List;

    .line 2
    .line 3
    sget-object v1, Lfb/n0;->j:Ljava/util/List;

    .line 4
    .line 5
    sget-object v2, Lfb/n0;->i:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p2, v2, v0, v1}, Lfb/n0;->N(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "offset"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-gez v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v1

    .line 22
    :goto_0
    invoke-static {v2, p1}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p2}, Lfb/n0;->B(Lorg/json/JSONObject;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v2, v1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "sourceEntry"

    .line 35
    .line 36
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const-string v4, "->"

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    iget-object v3, p0, Lfb/j0;->n:Lfb/l1;

    .line 45
    .line 46
    new-instance v5, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_1

    .line 64
    .line 65
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, Lhh/o;

    .line 70
    .line 71
    iget-object v7, v7, Lhh/o;->j:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v7, v4}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v3, v5, p3}, Lfb/l1;->f(Ljava/util/List;Lfb/b;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    sget-object p3, Ltf/u;->g:Ltf/u;

    .line 87
    .line 88
    :goto_2
    new-instance v3, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Lhh/o;

    .line 112
    .line 113
    new-instance v6, Lorg/json/JSONObject;

    .line 114
    .line 115
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget-object v8, v5, Lhh/o;->j:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v7, v7, Llh/d;->g:Ljava/lang/String;

    .line 125
    .line 126
    const-string v9, "className"

    .line 127
    .line 128
    invoke-static {v6, v0, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iget-object v7, v7, Llh/d;->h:Ljava/lang/String;

    .line 136
    .line 137
    const-string v9, "methodName"

    .line 138
    .line 139
    invoke-static {v6, v0, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    const-string v7, "descriptor"

    .line 143
    .line 144
    invoke-static {v6, v0, v7, v8}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    iget-object v7, v7, Llh/d;->k:Lsf/i;

    .line 152
    .line 153
    invoke-virtual {v7}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, Ljava/lang/String;

    .line 158
    .line 159
    const-string v9, "methodSign"

    .line 160
    .line 161
    invoke-static {v6, v0, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    iget-object v7, v7, Llh/d;->j:Ljava/lang/String;

    .line 169
    .line 170
    const-string v9, "returnType"

    .line 171
    .line 172
    invoke-static {v6, v0, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    new-instance v7, Lorg/json/JSONArray;

    .line 176
    .line 177
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    iget-object v9, v9, Llh/d;->i:Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {v7, v9}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 184
    .line 185
    .line 186
    const-string v9, "paramTypes"

    .line 187
    .line 188
    invoke-static {v6, v0, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object v7, v5, Lhh/o;->l:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    const-string v9, "paramCount"

    .line 202
    .line 203
    invoke-static {v6, v0, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget v5, v5, Lhh/o;->i:I

    .line 207
    .line 208
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    const-string v7, "modifiers"

    .line 213
    .line 214
    invoke-static {v6, v0, v7, v5}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    const-string v5, "sourcePath"

    .line 218
    .line 219
    iget-object v7, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {v6, v0, v5, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v8, v4}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-interface {p3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    check-cast v5, Ljava/lang/String;

    .line 233
    .line 234
    if-eqz v5, :cond_3

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_3
    sget-object v5, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 238
    .line 239
    :goto_4
    invoke-static {v6, v0, v2, v5}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto/16 :goto_3

    .line 246
    .line 247
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    invoke-static {v3, p0, p2}, Lfb/n0;->T(Ljava/util/ArrayList;ILorg/json/JSONObject;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    return-object p0
.end method

.method public static H(Lhh/o;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, Llh/d;->g:Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, "className"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, Llh/d;->h:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "methodName"

    .line 24
    .line 25
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string v1, "descriptor"

    .line 29
    .line 30
    iget-object v2, p0, Lhh/o;->j:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v1, v1, Llh/d;->k:Lsf/i;

    .line 40
    .line 41
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    const-string v2, "methodSign"

    .line 48
    .line 49
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v1, v1, Llh/d;->j:Ljava/lang/String;

    .line 57
    .line 58
    const-string v2, "returnType"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    new-instance v1, Lorg/json/JSONArray;

    .line 64
    .line 65
    invoke-virtual {p0}, Lhh/o;->p()Llh/d;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v2, v2, Llh/d;->i:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 72
    .line 73
    .line 74
    const-string v2, "paramTypes"

    .line 75
    .line 76
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lhh/o;->l:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const-string v2, "paramCount"

    .line 86
    .line 87
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const-string v1, "modifiers"

    .line 91
    .line 92
    iget p0, p0, Lhh/o;->i:I

    .line 93
    .line 94
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

.method public static I(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "hchat.reverse."

    .line 10
    .line 11
    invoke-static {p0, v0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "local."

    .line 16
    .line 17
    invoke-static {p0, v0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static J(Lfb/j0;Lorg/json/JSONObject;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 14

    .line 1
    const-string v1, "input"

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    invoke-static {v1, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v3, "session_id"

    .line 10
    .line 11
    invoke-static {v3, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    new-instance v3, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/io/File;->isAbsolute()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string p0, "open_target_session \u4e0d\u80fd\u540c\u65f6\u4f20 input \u548c session_id"

    .line 46
    .line 47
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_1
    move-object v2, v0

    .line 53
    :cond_2
    :goto_0
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sget-object v3, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    if-nez v0, :cond_13

    .line 60
    .line 61
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    new-instance v2, Lsf/f;

    .line 73
    .line 74
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v2

    .line 78
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-nez v2, :cond_12

    .line 83
    .line 84
    move-object v1, v0

    .line 85
    check-cast v1, Ljava/io/File;

    .line 86
    .line 87
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v2, 0x0

    .line 92
    if-nez v0, :cond_11

    .line 93
    .line 94
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_11

    .line 103
    .line 104
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/io/File;

    .line 109
    .line 110
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 111
    .line 112
    .line 113
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    goto :goto_2

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    new-instance v5, Lsf/f;

    .line 117
    .line 118
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v5

    .line 122
    :goto_2
    nop

    .line 123
    instance-of v5, v0, Lsf/f;

    .line 124
    .line 125
    if-eqz v5, :cond_4

    .line 126
    .line 127
    move-object v0, v2

    .line 128
    :cond_4
    check-cast v0, Ljava/io/File;

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_5

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    const/4 v6, 0x1

    .line 161
    new-array v6, v6, [C

    .line 162
    .line 163
    sget-char v7, Ljava/io/File;->separatorChar:C

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    aput-char v7, v6, v8

    .line 167
    .line 168
    invoke-static {v0, v6}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    .line 173
    .line 174
    new-instance v7, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v5, v0, v8}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_3

    .line 194
    .line 195
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_10

    .line 203
    .line 204
    invoke-static {v1}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    const-string v4, "apk"

    .line 209
    .line 210
    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_f

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 217
    .line 218
    .line 219
    move-result-wide v4

    .line 220
    const-wide/16 v6, 0x0

    .line 221
    .line 222
    cmp-long v0, v4, v6

    .line 223
    .line 224
    if-lez v0, :cond_e

    .line 225
    .line 226
    new-instance v2, Ljava/util/zip/ZipFile;

    .line 227
    .line 228
    invoke-direct {v2, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    .line 229
    .line 230
    .line 231
    :try_start_2
    const-string v0, "AndroidManifest.xml"

    .line 232
    .line 233
    invoke-virtual {v2, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-eqz v0, :cond_d

    .line 238
    .line 239
    const-string v0, "classes.dex"

    .line 240
    .line 241
    invoke-virtual {v2, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 242
    .line 243
    .line 244
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 245
    if-eqz v0, :cond_c

    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 248
    .line 249
    .line 250
    new-instance v0, Ljava/io/File;

    .line 251
    .line 252
    iget-object v2, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 253
    .line 254
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v1, v0}, Lfb/n0;->W(Ljava/io/File;Ljava/io/File;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_6

    .line 262
    .line 263
    goto/16 :goto_7

    .line 264
    .line 265
    :cond_6
    invoke-static {v1}, Lfb/n0;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Lfb/m0;

    .line 274
    .line 275
    if-eqz v0, :cond_7

    .line 276
    .line 277
    invoke-static {p0, v5}, Lfb/n0;->Q(Lfb/j0;Ljava/lang/String;)Lfb/j0;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    goto/16 :goto_8

    .line 282
    .line 283
    :cond_7
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    check-cast v0, Ljava/lang/Iterable;

    .line 291
    .line 292
    new-instance v2, Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-eqz v4, :cond_9

    .line 306
    .line 307
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    move-object v6, v4

    .line 312
    check-cast v6, Lfb/m0;

    .line 313
    .line 314
    iget-object v7, v6, Lfb/m0;->c:Ljava/lang/String;

    .line 315
    .line 316
    const-string v8, "external_wechat_apk"

    .line 317
    .line 318
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    if-eqz v7, :cond_8

    .line 323
    .line 324
    iget-object v6, v6, Lfb/m0;->b:Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-eqz v6, :cond_8

    .line 335
    .line 336
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    if-eqz v4, :cond_a

    .line 358
    .line 359
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    check-cast v4, Lfb/m0;

    .line 364
    .line 365
    iget-object v4, v4, Lfb/m0;->a:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_a
    new-instance v4, Lfb/m0;

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 381
    .line 382
    .line 383
    move-result-wide v8

    .line 384
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 385
    .line 386
    .line 387
    move-result-wide v10

    .line 388
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 389
    .line 390
    .line 391
    move-result-wide v12

    .line 392
    const-string v7, "external_wechat_apk"

    .line 393
    .line 394
    invoke-direct/range {v4 .. v13}, Lfb/m0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 395
    .line 396
    .line 397
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    :try_start_3
    invoke-static {p0, v5}, Lfb/n0;->Q(Lfb/j0;Ljava/lang/String;)Lfb/j0;

    .line 401
    .line 402
    .line 403
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 404
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_b

    .line 413
    .line 414
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    check-cast v2, Ljava/lang/String;

    .line 419
    .line 420
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_b
    invoke-static {p0}, Lfb/n0;->O(Lfb/j0;)V

    .line 425
    .line 426
    .line 427
    invoke-static {p0}, Lfb/n0;->L(Lfb/j0;)V

    .line 428
    .line 429
    .line 430
    move-object v0, v1

    .line 431
    goto :goto_8

    .line 432
    :catchall_2
    move-exception v0

    .line 433
    move-object p0, v0

    .line 434
    iget-object v0, v4, Lfb/m0;->a:Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v3, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    throw p0

    .line 440
    :cond_c
    :try_start_4
    const-string p0, "APK \u7f3a\u5c11 classes.dex"

    .line 441
    .line 442
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 443
    .line 444
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v0

    .line 448
    :catchall_3
    move-exception v0

    .line 449
    move-object p0, v0

    .line 450
    goto :goto_6

    .line 451
    :cond_d
    const-string p0, "APK \u7f3a\u5c11 AndroidManifest.xml"

    .line 452
    .line 453
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 454
    .line 455
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 459
    :goto_6
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 460
    :catchall_4
    move-exception v0

    .line 461
    invoke-static {v2, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 462
    .line 463
    .line 464
    throw v0

    .line 465
    :cond_e
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    const-string v0, "APK \u6587\u4ef6\u4e3a\u7a7a: "

    .line 470
    .line 471
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    return-object v2

    .line 479
    :cond_f
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    const-string v0, "\u76ee\u6807\u5fc5\u987b\u662f APK \u6587\u4ef6: "

    .line 484
    .line 485
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    return-object v2

    .line 493
    :cond_10
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    const-string v0, "APK \u6587\u4ef6\u4e0d\u5b58\u5728\u6216\u4e0d\u53ef\u8bfb\u53d6: "

    .line 498
    .line 499
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-object v2

    .line 507
    :cond_11
    const-string p0, "\u53ea\u80fd\u6253\u5f00\u7528\u6237\u6d88\u606f\u4e2d\u660e\u786e\u63d0\u4f9b\u7684 APK \u8def\u5f84\u6216\u5176\u5b50\u9879"

    .line 508
    .line 509
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    return-object v2

    .line 513
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 514
    .line 515
    const-string v0, "APK \u8def\u5f84\u65e0\u6548: "

    .line 516
    .line 517
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-direct {p0, v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 522
    .line 523
    .line 524
    throw p0

    .line 525
    :cond_13
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-nez v0, :cond_14

    .line 530
    .line 531
    invoke-static {p0, v2}, Lfb/n0;->Q(Lfb/j0;Ljava/lang/String;)Lfb/j0;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    goto :goto_8

    .line 536
    :cond_14
    :goto_7
    move-object v0, p0

    .line 537
    :goto_8
    iget-object v7, v0, Lfb/j0;->k:Ljava/lang/String;

    .line 538
    .line 539
    iget-object v6, v0, Lfb/j0;->i:Ljava/lang/String;

    .line 540
    .line 541
    iget-object v5, v0, Lfb/j0;->j:Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    check-cast v1, Lfb/m0;

    .line 548
    .line 549
    if-eqz v1, :cond_15

    .line 550
    .line 551
    goto :goto_9

    .line 552
    :cond_15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 553
    .line 554
    .line 555
    move-result-wide v12

    .line 556
    new-instance v1, Ljava/io/File;

    .line 557
    .line 558
    invoke-direct {v1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    new-instance v4, Lfb/m0;

    .line 562
    .line 563
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 564
    .line 565
    .line 566
    move-result-wide v8

    .line 567
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 568
    .line 569
    .line 570
    move-result-wide v10

    .line 571
    invoke-direct/range {v4 .. v13}, Lfb/m0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 572
    .line 573
    .line 574
    move-object v1, v4

    .line 575
    :goto_9
    invoke-static {p0, v1}, Lfb/n0;->d0(Lfb/j0;Lfb/m0;)Lorg/json/JSONObject;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    iget-object v0, v0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 580
    .line 581
    invoke-virtual {v0}, Lorg/luckypray/dexkit/DexKitBridge;->getDexNum()I

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    const-string v1, "dexCount"

    .line 586
    .line 587
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 588
    .line 589
    .line 590
    const-string v0, "current_wechat_apk"

    .line 591
    .line 592
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    if-eqz v0, :cond_16

    .line 597
    .line 598
    const-string v0, "\u5f53\u524d\u8fd0\u884c\u5fae\u4fe1\u5df2\u7ed1\u5b9a\uff1b\u7701\u7565 session_id \u65f6\u9ed8\u8ba4\u67e5\u8be2\u6b64\u76ee\u6807"

    .line 599
    .line 600
    goto :goto_a

    .line 601
    :cond_16
    const-string v0, "\u5916\u90e8\u5fae\u4fe1 APK \u5df2\u6253\u5f00\uff1b\u540e\u7eed\u6bcf\u6b21\u67e5\u8be2\u5fc5\u987b\u4f20\u6b64 session_id"

    .line 602
    .line 603
    :goto_a
    const-string v1, "message"

    .line 604
    .line 605
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 606
    .line 607
    .line 608
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object p0

    .line 612
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    return-object p0
.end method

.method public static K(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    :try_start_0
    const-string v0, "0x"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/16 v0, 0x10

    .line 32
    .line 33
    invoke-static {v0}, La/a;->w(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    :goto_0
    long-to-int p0, v2

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    goto :goto_0

    .line 49
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_3

    .line 54
    :goto_2
    new-instance v0, Lsf/f;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object p0, v0

    .line 60
    :goto_3
    nop

    .line 61
    instance-of v0, p0, Lsf/f;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_2
    move-object v1, p0

    .line 67
    :goto_4
    check-cast v1, Ljava/lang/Integer;

    .line 68
    .line 69
    return-object v1
.end method

.method public static L(Lfb/j0;)V
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v1, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move-object v4, v3

    .line 37
    check-cast v4, Lfb/m0;

    .line 38
    .line 39
    iget-object v4, v4, Lfb/m0;->c:Ljava/lang/String;

    .line 40
    .line 41
    const-string v5, "external_wechat_apk"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance v1, Lfb/r;

    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    invoke-direct {v1, v3}, Lfb/r;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v1}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lfb/m0;

    .line 78
    .line 79
    new-instance v3, Lorg/json/JSONObject;

    .line 80
    .line 81
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v4, "path"

    .line 85
    .line 86
    iget-object v5, v2, Lfb/m0;->b:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    const-string v4, "addedAt"

    .line 92
    .line 93
    iget-wide v5, v2, Lfb/m0;->f:J

    .line 94
    .line 95
    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    iget-object p0, p0, Lfb/j0;->g:Landroid/content/Context;

    .line 103
    .line 104
    const-string v1, "Hchat_agent_reverse_targets"

    .line 105
    .line 106
    invoke-static {p0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const-string v1, "targets_v1"

    .line 115
    .line 116
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public static M(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto/16 :goto_0

    .line 9
    .line 10
    :sswitch_0
    const-string v0, "compare_methods_using_strings"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    const-string p0, "\u6a2a\u5411\u67e5\u8be2\u591a\u4e2a\u5fae\u4fe1\u7248\u672c"

    .line 21
    .line 22
    return-object p0

    .line 23
    :sswitch_1
    const-string v0, "export_class_smali"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_6

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :sswitch_2
    const-string v0, "read_tool_result"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_1
    const-string p0, "\u8bfb\u53d6\u7ed3\u679c\u5206\u9875"

    .line 44
    .line 45
    return-object p0

    .line 46
    :sswitch_3
    const-string v0, "list_res"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_7

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :sswitch_4
    const-string v0, "export_method_java"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_5

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :sswitch_5
    const-string v0, "inspect_class"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :sswitch_6
    const-string v0, "manifest"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const-string p0, "\u89e3\u6790 Manifest"

    .line 84
    .line 85
    return-object p0

    .line 86
    :sswitch_7
    const-string v0, "open_target_session"

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-nez p0, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    const-string p0, "\u6253\u5f00 APK \u9006\u5411\u76ee\u6807"

    .line 96
    .line 97
    return-object p0

    .line 98
    :sswitch_8
    const-string v0, "inspect_method"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-nez p0, :cond_4

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    const-string p0, "\u68c0\u67e5 Dex \u7ed3\u6784"

    .line 108
    .line 109
    return-object p0

    .line 110
    :sswitch_9
    const-string v0, "decode_xml"

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_7

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :sswitch_a
    const-string v0, "export_class_java"

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-nez p0, :cond_5

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_5
    const-string p0, "\u53cd\u7f16\u8bd1 Java"

    .line 129
    .line 130
    return-object p0

    .line 131
    :sswitch_b
    const-string v0, "export_method_smali"

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-nez p0, :cond_6

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_6
    const-string p0, "\u5bfc\u51fa Smali"

    .line 141
    .line 142
    return-object p0

    .line 143
    :sswitch_c
    const-string v0, "get_resource_value"

    .line 144
    .line 145
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_7

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :sswitch_d
    const-string v0, "find_resource_values"

    .line 153
    .line 154
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-nez p0, :cond_7

    .line 159
    .line 160
    :goto_0
    const-string p0, "\u67e5\u8be2 Dex \u7d22\u5f15"

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_7
    const-string p0, "\u89e3\u6790 APK \u8d44\u6e90"

    .line 164
    .line 165
    return-object p0

    .line 166
    nop

    .line 167
    :sswitch_data_0
    .sparse-switch
        -0x79817c13 -> :sswitch_d
        -0x759b81f7 -> :sswitch_c
        -0x70d9292f -> :sswitch_b
        -0x4f0e720c -> :sswitch_a
        -0x480715ba -> :sswitch_9
        -0x1c315294 -> :sswitch_8
        -0x1b0ddb83 -> :sswitch_7
        0x7c92e2f -> :sswitch_6
        0x30198f8d -> :sswitch_5
        0x4eec7ab5 -> :sswitch_4
        0x503a197f -> :sswitch_3
        0x6b8be77b -> :sswitch_2
        0x6dc42b72 -> :sswitch_1
        0x713d7420 -> :sswitch_0
    .end sparse-switch
.end method

.method public static N(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Set;
    .locals 7

    .line 1
    const-string v0, "fields"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    check-cast v4, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, p0}, Ltf/m;->N1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_2
    const-string p1, "brief"

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {p2, p0}, Ltf/m;->N1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_3
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 87
    .line 88
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {p3, p0}, Ltf/m;->N1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_4
    const/4 v5, 0x0

    .line 96
    const/16 v6, 0x3f

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v4, 0x0

    .line 101
    invoke-static/range {v1 .. v6}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string p1, "fields \u5305\u542b\u4e0d\u652f\u6301\u7684\u503c: "

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/4 p0, 0x0

    .line 115
    return-object p0
.end method

.method public static O(Lfb/j0;)V
    .locals 7

    .line 1
    sget-object v0, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v1, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Lfb/m0;

    .line 33
    .line 34
    iget-object v4, v4, Lfb/m0;->c:Ljava/lang/String;

    .line 35
    .line 36
    const-string v5, "external_wechat_apk"

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v1, Lfb/r;

    .line 49
    .line 50
    const/4 v3, 0x4

    .line 51
    invoke-direct {v1, v3}, Lfb/r;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/16 v2, 0x10

    .line 59
    .line 60
    invoke-static {v2, v1}, Ltf/m;->r1(ILjava/util/List;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lfb/m0;

    .line 79
    .line 80
    iget-object v5, v4, Lfb/m0;->a:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    sget-object v5, Lfb/n0;->e:Lfb/j0;

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    iget-object v5, v5, Lfb/j0;->j:Ljava/lang/String;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v5, v6

    .line 94
    :goto_2
    iget-object v4, v4, Lfb/m0;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v5, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_2

    .line 101
    .line 102
    sget-object v4, Lfb/n0;->e:Lfb/j0;

    .line 103
    .line 104
    if-eqz v4, :cond_4

    .line 105
    .line 106
    invoke-virtual {v4}, Lfb/j0;->close()V

    .line 107
    .line 108
    .line 109
    :cond_4
    sput-object v6, Lfb/n0;->e:Lfb/j0;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-le v0, v2, :cond_6

    .line 117
    .line 118
    invoke-static {p0}, Lfb/n0;->L(Lfb/j0;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    return-void
.end method

.method public static P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public static Q(Lfb/j0;Ljava/lang/String;)Lfb/j0;
    .locals 9

    .line 1
    iget-object v0, p0, Lfb/j0;->j:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object v0, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lfb/m0;

    .line 32
    .line 33
    if-eqz v0, :cond_8

    .line 34
    .line 35
    iget-object v4, v0, Lfb/m0;->b:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v1, Ljava/io/File;

    .line 38
    .line 39
    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_7

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    iget-wide v5, v0, Lfb/m0;->d:J

    .line 53
    .line 54
    cmp-long v2, v2, v5

    .line 55
    .line 56
    if-nez v2, :cond_7

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    iget-wide v5, v0, Lfb/m0;->e:J

    .line 63
    .line 64
    cmp-long v2, v2, v5

    .line 65
    .line 66
    if-nez v2, :cond_7

    .line 67
    .line 68
    sget-object v2, Lfb/n0;->e:Lfb/j0;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    iget-object v5, v2, Lfb/j0;->j:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    iget-object p1, v2, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 82
    .line 83
    invoke-virtual {p1}, Lorg/luckypray/dexkit/DexKitBridge;->isValid()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    const/4 p1, 0x0

    .line 92
    :goto_0
    if-eqz p1, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    move-object v2, v3

    .line 96
    :goto_1
    if-eqz v2, :cond_4

    .line 97
    .line 98
    return-object v2

    .line 99
    :cond_4
    sget-object p1, Lfb/n0;->e:Lfb/j0;

    .line 100
    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1}, Lfb/j0;->close()V

    .line 104
    .line 105
    .line 106
    :cond_5
    sput-object v3, Lfb/n0;->e:Lfb/j0;

    .line 107
    .line 108
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-object p1, v3

    .line 121
    new-instance v3, Lorg/luckypray/dexkit/DexKitBridge;

    .line 122
    .line 123
    invoke-direct {v3, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;Lgg/g;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Lorg/luckypray/dexkit/DexKitBridge;->isValid()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    iget-object v2, p0, Lfb/j0;->g:Landroid/content/Context;

    .line 133
    .line 134
    new-instance v1, Lfb/j0;

    .line 135
    .line 136
    iget-object v5, v0, Lfb/m0;->a:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v6, v0, Lfb/m0;->c:Ljava/lang/String;

    .line 139
    .line 140
    const-string v7, ""

    .line 141
    .line 142
    const/4 v8, 0x1

    .line 143
    invoke-direct/range {v1 .. v8}, Lfb/j0;-><init>(Landroid/content/Context;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 144
    .line 145
    .line 146
    sput-object v1, Lfb/n0;->e:Lfb/j0;

    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_6
    invoke-virtual {v3}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const-string p1, "DexKit \u65e0\u6cd5\u6253\u5f00\u76ee\u6807 APK: "

    .line 157
    .line 158
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_2
    const/4 p0, 0x0

    .line 166
    return-object p0

    .line 167
    :cond_7
    const-string p0, "\u76ee\u6807 APK \u5df2\u79fb\u52a8\u6216\u53d1\u751f\u53d8\u5316\uff0c\u8bf7\u4f7f\u7528 open_target_session(input) \u91cd\u65b0\u6253\u5f00"

    .line 168
    .line 169
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    const-string p0, "\u6ca1\u6709\u627e\u5230\u76ee\u6807\u4f1a\u8bdd: "

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2
.end method

.method public static R(Lt7/b;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lt7/b;->d(Z)Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p0}, Lng/m;->R(Ljava/util/Iterator;)Lng/j;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v1, Lfb/g0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, v2}, Lfb/g0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v1, Lfb/g0;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v1, v2}, Lfb/g0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lng/i;

    .line 27
    .line 28
    invoke-direct {v2, p0, v0, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lng/m;->S(Lng/j;)Lng/c;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static S(Lfb/j0;Lt7/b;Lfb/l0;Ljava/util/Set;)Lorg/json/JSONObject;
    .locals 8

    .line 1
    move-object v0, p3

    .line 2
    check-cast v0, Ljava/lang/Iterable;

    .line 3
    .line 4
    instance-of v1, v0, Ljava/util/Collection;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const-string v3, "resolution"

    .line 8
    .line 9
    const-string v4, "sourceEntry"

    .line 10
    .line 11
    const-string v5, "filePath"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Ljava/util/Collection;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-nez v6, :cond_3

    .line 46
    .line 47
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_3

    .line 52
    .line 53
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const/4 v1, 0x0

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    move v1, v2

    .line 63
    :goto_1
    if-eqz v1, :cond_1

    .line 64
    .line 65
    iget v0, p1, Lt7/b;->g:I

    .line 66
    .line 67
    iget-object v1, p0, Lfb/j0;->r:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-interface {v1}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/String;

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_2
    const/4 v0, 0x0

    .line 87
    :goto_3
    new-instance v1, Lorg/json/JSONObject;

    .line 88
    .line 89
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 90
    .line 91
    .line 92
    iget v6, p1, Lt7/b;->g:I

    .line 93
    .line 94
    const/16 v7, 0x8

    .line 95
    .line 96
    invoke-static {v6, v7}, Ly7/a;->k(II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    const-string v7, "resourceId"

    .line 101
    .line 102
    invoke-static {v1, p3, v7, v6}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string v6, "type"

    .line 106
    .line 107
    invoke-virtual {p1}, Lt7/b;->c()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-static {v1, p3, v6, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const-string v6, "name"

    .line 115
    .line 116
    invoke-virtual {p1}, Lt7/b;->b()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v1, p3, v6, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    if-eqz p2, :cond_5

    .line 124
    .line 125
    const-string v6, "value"

    .line 126
    .line 127
    iget-object v7, p2, Lfb/l0;->a:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v1, p3, v6, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const-string v6, "qualifiers"

    .line 133
    .line 134
    iget-object v7, p2, Lfb/l0;->b:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v1, p3, v6, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-boolean p2, p2, Lfb/l0;->c:Z

    .line 140
    .line 141
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    const-string v6, "default"

    .line 146
    .line 147
    invoke-static {v1, p3, v6, p2}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_5
    if-eqz v0, :cond_6

    .line 151
    .line 152
    move-object p2, v0

    .line 153
    goto :goto_4

    .line 154
    :cond_6
    sget-object p2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 155
    .line 156
    :goto_4
    invoke-static {v1, p3, v5, p2}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const-string p2, "sourcePath"

    .line 160
    .line 161
    iget-object p0, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1, p3, p2, p0}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    move-object p0, v0

    .line 169
    goto :goto_5

    .line 170
    :cond_7
    sget-object p0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 171
    .line 172
    :goto_5
    invoke-static {v1, p3, v4, p0}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    const-string p0, "table-backed"

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_8
    invoke-virtual {p1, v2}, Lt7/b;->d(Z)Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_9

    .line 189
    .line 190
    const-string p0, "table-value"

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_9
    invoke-virtual {p1}, Lt7/b;->b()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-eqz p0, :cond_a

    .line 198
    .line 199
    const-string p0, "table-hole"

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_a
    const-string p0, "unresolved"

    .line 203
    .line 204
    :goto_6
    invoke-static {v1, p3, v3, p0}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-object v1
.end method

.method public static T(Ljava/util/ArrayList;ILorg/json/JSONObject;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "offset"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-gez v2, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    :cond_0
    invoke-static {p2}, Lfb/n0;->B(Lorg/json/JSONObject;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    new-instance v3, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v4, "total"

    .line 21
    .line 22
    invoke-virtual {v3, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string v0, "limit"

    .line 29
    .line 30
    invoke-virtual {v3, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    add-int/2addr p2, v2

    .line 38
    if-ge p2, p1, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    :cond_1
    const-string p1, "hasMore"

    .line 42
    .line 43
    invoke-virtual {v3, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    new-instance p1, Lorg/json/JSONArray;

    .line 47
    .line 48
    invoke-direct {p1, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    const-string p0, "items"

    .line 52
    .line 53
    invoke-virtual {v3, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    return-object p0
.end method

.method public static U()Lorg/json/JSONObject;
    .locals 4

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "\u672c\u6b21\u6700\u591a\u8fd4\u56de\u7684\u5019\u9009\u6570\u91cf"

    .line 8
    .line 9
    const/16 v2, 0x1e

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v1, v2, v3, v0}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public static V()Lorg/json/JSONObject;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "\u5019\u9009\u6216\u6587\u672c\u7684\u8d77\u59cb\u504f\u79fb"

    .line 4
    .line 5
    invoke-static {v2, v1, v1, v0}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static W(Ljava/io/File;Ljava/io/File;)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    new-instance v1, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of p1, v0, Lsf/f;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    move-object v0, p0

    .line 46
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method

.method public static X(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p0, "offset"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-gez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v2

    .line 21
    :goto_0
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    const/16 p0, 0x5dc0

    .line 25
    .line 26
    const-string v1, "max_chars"

    .line 27
    .line 28
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/16 v2, 0x3e8

    .line 33
    .line 34
    const v3, 0xbb80

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v2, v3}, Lr9/e0;->r(III)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public static Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "array"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    invoke-static {v2, v0, v1, p0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const-string p2, "minItems"

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string p2, "string"

    .line 20
    .line 21
    invoke-static {v2, p2}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Lorg/json/JSONArray;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "enum"

    .line 37
    .line 38
    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    :cond_1
    const-string p1, "items"

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public static synthetic Z(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static a(Landroid/content/pm/ActivityInfo;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    invoke-static {p0}, Lfb/n0;->j(Landroid/content/pm/ComponentInfo;)Lorg/json/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 11
    .line 12
    :goto_0
    const-string v2, "permission"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string v1, "targetActivity"

    .line 29
    .line 30
    iget-object v2, p0, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_1
    iget-object p0, p0, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-static {p0}, Lfb/n0;->f(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v1, "metaData"

    .line 42
    .line 43
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public static a0(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    invoke-static {v2, v0, v1, p0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "minLength"

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public static b(Lhh/a;)Lorg/json/JSONObject;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lhh/a;->k:Lsf/i;

    .line 7
    .line 8
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Llh/a;

    .line 13
    .line 14
    iget-object v1, v1, Llh/a;->g:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "typeName"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    const-string v1, "typeDescriptor"

    .line 22
    .line 23
    iget-object v2, p0, Lhh/a;->h:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lhh/a;->i:I

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    if-eq v1, v2, :cond_1

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    if-ne v1, v2, :cond_0

    .line 40
    .line 41
    const-string v1, "System"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p0, 0x0

    .line 45
    throw p0

    .line 46
    :cond_1
    const-string v1, "Runtime"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string v1, "Build"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const-string v1, "UNKNOWN"

    .line 53
    .line 54
    :goto_0
    const-string v2, "visibility"

    .line 55
    .line 56
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lhh/a;->j:Ljava/util/ArrayList;

    .line 60
    .line 61
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lhh/b;

    .line 85
    .line 86
    new-instance v3, Lorg/json/JSONObject;

    .line 87
    .line 88
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 89
    .line 90
    .line 91
    iget-object v4, v2, Lhh/b;->h:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v2, v2, Lhh/b;->i:Lhh/d;

    .line 94
    .line 95
    const-string v5, "name"

    .line 96
    .line 97
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    iget v4, v2, Lhh/d;->b:I

    .line 101
    .line 102
    packed-switch v4, :pswitch_data_0

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x0

    .line 106
    throw p0

    .line 107
    :pswitch_0
    const-string v4, "BoolValue"

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :pswitch_1
    const-string v4, "NullValue"

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :pswitch_2
    const-string v4, "AnnotationValue"

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :pswitch_3
    const-string v4, "ArrayValue"

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :pswitch_4
    const-string v4, "EnumValue"

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :pswitch_5
    const-string v4, "MethodValue"

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :pswitch_6
    const-string v4, "TypeValue"

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :pswitch_7
    const-string v4, "StringValue"

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :pswitch_8
    const-string v4, "DoubleValue"

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :pswitch_9
    const-string v4, "FloatValue"

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :pswitch_a
    const-string v4, "LongValue"

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :pswitch_b
    const-string v4, "IntValue"

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :pswitch_c
    const-string v4, "CharValue"

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :pswitch_d
    const-string v4, "ShortValue"

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :pswitch_e
    const-string v4, "ByteValue"

    .line 150
    .line 151
    :goto_2
    const-string v5, "type"

    .line 152
    .line 153
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 154
    .line 155
    .line 156
    iget-object v2, v2, Lhh/d;->a:Ljava/lang/Object;

    .line 157
    .line 158
    if-eqz v2, :cond_4

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-eqz v2, :cond_4

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_4
    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 168
    .line 169
    :goto_3
    const-string v4, "value"

    .line 170
    .line 171
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    new-instance p0, Lorg/json/JSONArray;

    .line 179
    .line 180
    invoke-direct {p0, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 181
    .line 182
    .line 183
    const-string v1, "elements"

    .line 184
    .line 185
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method public static b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_7

    .line 6
    .line 7
    instance-of p1, p0, Lorg/json/JSONArray;

    .line 8
    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    check-cast p0, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0, p1}, Lr9/e0;->r0(II)Llg/d;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_0
    :goto_0
    move-object v1, p1

    .line 32
    check-cast v1, Llg/c;

    .line 33
    .line 34
    iget-boolean v2, v1, Llg/c;->i:Z

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Llg/c;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const/4 v1, 0x0

    .line 71
    :goto_1
    if-eqz v1, :cond_0

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return-object v0

    .line 78
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const/4 p1, 0x2

    .line 83
    new-array p1, p1, [C

    .line 84
    .line 85
    fill-array-data p1, :array_0

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x6

    .line 89
    invoke-static {p0, p1, v0}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-instance p1, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0, p1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object v1, v0

    .line 142
    check-cast v1, Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_5

    .line 149
    .line 150
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    return-object p0

    .line 155
    :cond_7
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 156
    .line 157
    return-object p0

    .line 158
    nop

    .line 159
    :array_0
    .array-data 2
        0x2cs
        0xas
    .end array-data
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    .locals 2

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    int-to-long v0, p2

    .line 12
    invoke-static {v0, v1}, Lai/a;->b(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-static {p0, p1, p2}, Lai/a;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    new-instance p1, Lsf/f;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, p1

    .line 37
    :goto_0
    nop

    .line 38
    instance-of p1, p0, Lsf/f;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    :cond_1
    check-cast p0, Landroid/content/pm/PackageInfo;

    .line 44
    .line 45
    return-object p0
.end method

.method public static c0(Ljava/io/File;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, "\u0000"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "SHA-256"

    .line 40
    .line 41
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lfb/g0;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, v1}, Lfb/g0;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v0}, Ltf/l;->E0([BLfg/l;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const/16 v0, 0x18

    .line 72
    .line 73
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string v0, "hchat-local-"

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public static d(Lfb/j0;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "session_id"

    .line 7
    .line 8
    iget-object v2, p0, Lfb/j0;->j:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "sourcePath"

    .line 14
    .line 15
    iget-object v2, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "targetKind"

    .line 21
    .line 22
    iget-object p0, p0, Lfb/j0;->k:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    new-instance v0, Lsf/f;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p0, v0

    .line 39
    :goto_0
    nop

    .line 40
    instance-of v0, p0, Lsf/f;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move-object p1, p0

    .line 46
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    return-object p1
.end method

.method public static d0(Lfb/j0;Lfb/m0;)Lorg/json/JSONObject;
    .locals 9

    .line 1
    iget-object v0, p0, Lfb/j0;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p1, Lfb/m0;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/16 v2, 0x80

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lfb/n0;->c(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p1, Lfb/m0;->a:Ljava/lang/String;

    .line 17
    .line 18
    const-string v4, "session_id"

    .line 19
    .line 20
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    const-string v4, "input"

    .line 24
    .line 25
    invoke-virtual {v2, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string v4, "sourcePath"

    .line 29
    .line 30
    invoke-virtual {v2, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    iget-object v4, p1, Lfb/m0;->c:Ljava/lang/String;

    .line 34
    .line 35
    const-string v5, "kind"

    .line 36
    .line 37
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    iget-object v5, p0, Lfb/j0;->j:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const-string v7, "default"

    .line 47
    .line 48
    invoke-virtual {v2, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/4 v6, 0x0

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    sget-object v5, Lfb/n0;->e:Lfb/j0;

    .line 59
    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    iget-object v5, v5, Lfb/j0;->j:Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object v5, v6

    .line 66
    :goto_0
    invoke-static {v5, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/4 v3, 0x0

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    :goto_1
    const/4 v3, 0x1

    .line 76
    :goto_2
    const-string v5, "loaded"

    .line 77
    .line 78
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    new-instance v3, Ljava/io/File;

    .line 82
    .line 83
    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v3, "fileName"

    .line 91
    .line 92
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v1, "fileSize"

    .line 96
    .line 97
    iget-wide v7, p1, Lfb/m0;->d:J

    .line 98
    .line 99
    invoke-virtual {v2, v1, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    const-string v1, "lastModified"

    .line 103
    .line 104
    iget-wide v7, p1, Lfb/m0;->e:J

    .line 105
    .line 106
    invoke-virtual {v2, v1, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    iget-object p1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    move-object p1, v6

    .line 115
    :goto_3
    const-string v1, ""

    .line 116
    .line 117
    if-nez p1, :cond_4

    .line 118
    .line 119
    move-object p1, v1

    .line 120
    :cond_4
    const-string v3, "packageName"

    .line 121
    .line 122
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    iget-object v6, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 128
    .line 129
    :cond_5
    if-nez v6, :cond_6

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_6
    move-object v1, v6

    .line 133
    :goto_4
    const-string p1, "versionName"

    .line 134
    .line 135
    invoke-virtual {v2, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    if-eqz v0, :cond_7

    .line 139
    .line 140
    invoke-static {v0}, Lb0/b0;->b(Landroid/content/pm/PackageInfo;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    const-wide/16 v0, 0x0

    .line 146
    .line 147
    :goto_5
    const-string p1, "versionCode"

    .line 148
    .line 149
    invoke-virtual {v2, p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 150
    .line 151
    .line 152
    const-string p1, "current_wechat_apk"

    .line 153
    .line 154
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_8

    .line 159
    .line 160
    const-string p1, "classLoader"

    .line 161
    .line 162
    iget-object p0, p0, Lfb/j0;->l:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v2, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 165
    .line 166
    .line 167
    :cond_8
    return-object v2
.end method

.method public static e(Ljava/lang/String;Z)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "boolean"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    invoke-static {v2, v0, v1, p0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "default"

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static e0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lfb/n0;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {v1, p3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    sget-object p3, Lfb/n0;->u:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-nez p3, :cond_0

    .line 17
    .line 18
    const-string p3, "read_tool_result"

    .line 19
    .line 20
    invoke-virtual {v0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-nez p3, :cond_0

    .line 25
    .line 26
    const-string p3, "\u53ef\u9009\u76ee\u6807 session_id\uff1b\u7701\u7565\u65f6\u67e5\u8be2\u5f53\u524d\u8fd0\u884c\u5fae\u4fe1 APK"

    .line 27
    .line 28
    invoke-static {p3}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    const-string v0, "session_id"

    .line 33
    .line 34
    invoke-interface {v1, v0, p3}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    const-string p3, "name"

    .line 38
    .line 39
    const-string v0, "description"

    .line 40
    .line 41
    invoke-static {p3, p1, v0, p2}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "type"

    .line 46
    .line 47
    const-string p3, "object"

    .line 48
    .line 49
    invoke-static {p2, p3}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    new-instance p3, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Ljava/util/Map$Entry;

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lorg/json/JSONObject;

    .line 89
    .line 90
    invoke-virtual {p3, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    const-string v0, "properties"

    .line 95
    .line 96
    invoke-virtual {p2, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    const-string v0, "required"

    .line 104
    .line 105
    if-nez p3, :cond_2

    .line 106
    .line 107
    new-instance p3, Lorg/json/JSONArray;

    .line 108
    .line 109
    invoke-direct {p3, p4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-interface {p5}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    if-nez p3, :cond_4

    .line 120
    .line 121
    new-instance p3, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-static {p5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 124
    .line 125
    .line 126
    move-result p4

    .line 127
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p4

    .line 134
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result p5

    .line 138
    if-eqz p5, :cond_3

    .line 139
    .line 140
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p5

    .line 144
    check-cast p5, Ljava/util/List;

    .line 145
    .line 146
    new-instance v1, Lorg/json/JSONObject;

    .line 147
    .line 148
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v2, Lorg/json/JSONArray;

    .line 152
    .line 153
    invoke-direct {v2, p5}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    move-result-object p5

    .line 160
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_3
    new-instance p4, Lorg/json/JSONArray;

    .line 165
    .line 166
    invoke-direct {p4, p3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 167
    .line 168
    .line 169
    const-string p3, "anyOf"

    .line 170
    .line 171
    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    .line 173
    .line 174
    :cond_4
    const-string p3, "additionalProperties"

    .line 175
    .line 176
    const/4 p4, 0x0

    .line 177
    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 178
    .line 179
    .line 180
    const-string p3, "inputSchema"

    .line 181
    .line 182
    invoke-virtual {p1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public static f(Landroid/os/Bundle;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {v1}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    sget-object v3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 50
    .line 51
    :goto_1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-object v0
.end method

.method public static synthetic f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V
    .locals 6

    .line 1
    and-int/lit8 v0, p6, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p3, Ltf/u;->g:Ltf/u;

    .line 6
    .line 7
    :cond_0
    move-object v3, p3

    .line 8
    and-int/lit8 p3, p6, 0x10

    .line 9
    .line 10
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v4, p4

    .line 17
    :goto_0
    and-int/lit8 p3, p6, 0x20

    .line 18
    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    move-object v5, v0

    .line 22
    move-object v1, p1

    .line 23
    move-object v2, p2

    .line 24
    move-object v0, p0

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    move-object v5, p5

    .line 27
    move-object v0, p0

    .line 28
    move-object v1, p1

    .line 29
    move-object v2, p2

    .line 30
    :goto_1
    invoke-static/range {v0 .. v5}, Lfb/n0;->e0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static final g(Ljava/lang/String;Lorg/json/JSONObject;Lfb/b;Lfg/l;Landroid/content/Context;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "\u672a\u77e5\u7684\u5185\u7f6e\u9006\u5411\u5de5\u5177: "

    .line 2
    .line 3
    invoke-static {p0}, Lfb/n0;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "read_tool_result"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lfb/n0;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p3, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {p4, p1}, Lr9/e0;->d0(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 31
    .line 32
    .line 33
    const-string p1, "\u6574\u7406\u9006\u5411\u7ed3\u679c"

    .line 34
    .line 35
    invoke-interface {p3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    new-instance p1, Lsf/f;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p0, p1

    .line 46
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_0
    invoke-virtual {p2, p1}, Lfb/b;->b(Ljava/lang/Throwable;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eq p0, v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_1
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :goto_2
    check-cast p0, Ljava/lang/String;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_2
    throw p1

    .line 82
    :cond_3
    sget-object p4, Lfb/n0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 83
    .line 84
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    check-cast p4, Lfb/j0;

    .line 89
    .line 90
    if-eqz p4, :cond_1c

    .line 91
    .line 92
    sget-object v2, Lfb/n0;->a:Ljava/util/Set;

    .line 93
    .line 94
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_4

    .line 99
    .line 100
    const-string p1, "\u672a\u77e5\u7684\u5185\u7f6e\u9006\u5411\u5de5\u5177: "

    .line 101
    .line 102
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_4
    :try_start_1
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 112
    .line 113
    .line 114
    sget-object v2, Lfb/n0;->c:Ljava/lang/Object;

    .line 115
    .line 116
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 117
    :try_start_2
    invoke-static {v1}, Lfb/n0;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-interface {p3, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    sparse-switch v4, :sswitch_data_0

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :sswitch_0
    const-string p5, "compare_methods_using_strings"

    .line 133
    .line 134
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p5

    .line 138
    if-nez p5, :cond_5

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    invoke-static {p4, p1, p2}, Lfb/n0;->i(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :catchall_1
    move-exception p0

    .line 148
    goto/16 :goto_7

    .line 149
    .line 150
    :sswitch_1
    const-string p5, "get_target_session"

    .line 151
    .line 152
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p5

    .line 156
    if-nez p5, :cond_6

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    invoke-static {p4, p1}, Lfb/n0;->x(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    goto/16 :goto_6

    .line 164
    .line 165
    :sswitch_2
    const-string p5, "list_target_sessions"

    .line 166
    .line 167
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p5

    .line 171
    if-nez p5, :cond_7

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_7
    invoke-static {p4}, Lfb/n0;->D(Lfb/j0;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    goto/16 :goto_6

    .line 179
    .line 180
    :sswitch_3
    const-string v4, "open_target_session"

    .line 181
    .line 182
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-nez v4, :cond_8

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    invoke-static {p4, p1, p5}, Lfb/n0;->J(Lfb/j0;Lorg/json/JSONObject;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    goto/16 :goto_6

    .line 194
    .line 195
    :sswitch_4
    const-string p5, "close_target_session"

    .line 196
    .line 197
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p5

    .line 201
    if-nez p5, :cond_18

    .line 202
    .line 203
    :goto_3
    const-string p5, "session_id"

    .line 204
    .line 205
    const-string v4, ""

    .line 206
    .line 207
    invoke-virtual {p1, p5, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p5

    .line 211
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {p4, p5}, Lfb/n0;->Q(Lfb/j0;Ljava/lang/String;)Lfb/j0;

    .line 215
    .line 216
    .line 217
    move-result-object p4

    .line 218
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 219
    .line 220
    .line 221
    move-result p5

    .line 222
    sparse-switch p5, :sswitch_data_1

    .line 223
    .line 224
    .line 225
    goto/16 :goto_4

    .line 226
    .line 227
    :sswitch_5
    const-string p5, "find_methods_using_strings"

    .line 228
    .line 229
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p5

    .line 233
    if-nez p5, :cond_9

    .line 234
    .line 235
    goto/16 :goto_4

    .line 236
    .line 237
    :cond_9
    invoke-static {p4, p1, p2}, Lfb/n0;->u(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    goto/16 :goto_5

    .line 242
    .line 243
    :sswitch_6
    const-string p5, "export_class_smali"

    .line 244
    .line 245
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p5

    .line 249
    if-nez p5, :cond_a

    .line 250
    .line 251
    goto/16 :goto_4

    .line 252
    .line 253
    :cond_a
    invoke-static {p4, p1, p2}, Lfb/n0;->n(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    goto/16 :goto_5

    .line 258
    .line 259
    :sswitch_7
    const-string p5, "list_res"

    .line 260
    .line 261
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p5

    .line 265
    if-nez p5, :cond_b

    .line 266
    .line 267
    goto/16 :goto_4

    .line 268
    .line 269
    :cond_b
    invoke-static {p4, p1}, Lfb/n0;->C(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    goto/16 :goto_5

    .line 274
    .line 275
    :sswitch_8
    const-string p5, "export_method_java"

    .line 276
    .line 277
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result p5

    .line 281
    if-nez p5, :cond_c

    .line 282
    .line 283
    goto/16 :goto_4

    .line 284
    .line 285
    :cond_c
    invoke-static {p4, p1, p2}, Lfb/n0;->o(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    goto/16 :goto_5

    .line 290
    .line 291
    :sswitch_9
    const-string p5, "find_methods_using_resource"

    .line 292
    .line 293
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result p5

    .line 297
    if-nez p5, :cond_d

    .line 298
    .line 299
    goto/16 :goto_4

    .line 300
    .line 301
    :cond_d
    invoke-static {p4, p1, p2}, Lfb/n0;->t(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    goto/16 :goto_5

    .line 306
    .line 307
    :sswitch_a
    const-string p5, "inspect_class"

    .line 308
    .line 309
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p5

    .line 313
    if-nez p5, :cond_e

    .line 314
    .line 315
    goto/16 :goto_4

    .line 316
    .line 317
    :cond_e
    invoke-static {p4, p1, p2}, Lfb/n0;->y(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    goto/16 :goto_5

    .line 322
    .line 323
    :sswitch_b
    const-string p5, "manifest"

    .line 324
    .line 325
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p5

    .line 329
    if-nez p5, :cond_f

    .line 330
    .line 331
    goto/16 :goto_4

    .line 332
    .line 333
    :cond_f
    invoke-static {p4, p1}, Lfb/n0;->F(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    goto/16 :goto_5

    .line 338
    .line 339
    :sswitch_c
    const-string p5, "inspect_method"

    .line 340
    .line 341
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result p5

    .line 345
    if-nez p5, :cond_10

    .line 346
    .line 347
    goto/16 :goto_4

    .line 348
    .line 349
    :cond_10
    invoke-static {p4, p1, p2}, Lfb/n0;->z(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    goto/16 :goto_5

    .line 354
    .line 355
    :sswitch_d
    const-string p5, "find_methods"

    .line 356
    .line 357
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result p5

    .line 361
    if-nez p5, :cond_11

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_11
    invoke-static {p4, p1, p2}, Lfb/n0;->s(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    goto :goto_5

    .line 369
    :sswitch_e
    const-string p5, "decode_xml"

    .line 370
    .line 371
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result p5

    .line 375
    if-nez p5, :cond_12

    .line 376
    .line 377
    goto :goto_4

    .line 378
    :cond_12
    invoke-static {p4, p1}, Lfb/n0;->k(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    goto :goto_5

    .line 383
    :sswitch_f
    const-string p5, "export_class_java"

    .line 384
    .line 385
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result p5

    .line 389
    if-nez p5, :cond_13

    .line 390
    .line 391
    goto :goto_4

    .line 392
    :cond_13
    invoke-static {p4, p1, p2}, Lfb/n0;->m(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    goto :goto_5

    .line 397
    :sswitch_10
    const-string p5, "find_classes_using_strings"

    .line 398
    .line 399
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result p5

    .line 403
    if-nez p5, :cond_14

    .line 404
    .line 405
    goto :goto_4

    .line 406
    :cond_14
    invoke-static {p4, p1, p2}, Lfb/n0;->r(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    goto :goto_5

    .line 411
    :sswitch_11
    const-string p5, "export_method_smali"

    .line 412
    .line 413
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result p5

    .line 417
    if-nez p5, :cond_15

    .line 418
    .line 419
    goto :goto_4

    .line 420
    :cond_15
    invoke-static {p4, p1, p2}, Lfb/n0;->p(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    goto :goto_5

    .line 425
    :sswitch_12
    const-string p5, "get_resource_value"

    .line 426
    .line 427
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result p5

    .line 431
    if-nez p5, :cond_16

    .line 432
    .line 433
    goto :goto_4

    .line 434
    :cond_16
    invoke-static {p4, p1}, Lfb/n0;->w(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    goto :goto_5

    .line 439
    :sswitch_13
    const-string p5, "find_resource_values"

    .line 440
    .line 441
    invoke-virtual {v1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result p5

    .line 445
    if-nez p5, :cond_17

    .line 446
    .line 447
    :goto_4
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    goto :goto_5

    .line 456
    :cond_17
    invoke-static {p4, p1}, Lfb/n0;->v(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    :goto_5
    invoke-static {p4, p0}, Lfb/n0;->d(Lfb/j0;Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    goto :goto_6

    .line 465
    :cond_18
    invoke-static {p4, p1}, Lfb/n0;->h(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    :goto_6
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 470
    .line 471
    .line 472
    const-string p1, "\u6574\u7406\u9006\u5411\u7ed3\u679c"

    .line 473
    .line 474
    invoke-interface {p3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 475
    .line 476
    .line 477
    :try_start_3
    monitor-exit v2

    .line 478
    goto :goto_9

    .line 479
    :catchall_2
    move-exception p0

    .line 480
    goto :goto_8

    .line 481
    :goto_7
    monitor-exit v2

    .line 482
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 483
    :goto_8
    new-instance p1, Lsf/f;

    .line 484
    .line 485
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 486
    .line 487
    .line 488
    move-object p0, p1

    .line 489
    :goto_9
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    if-nez p1, :cond_19

    .line 494
    .line 495
    goto :goto_b

    .line 496
    :cond_19
    invoke-virtual {p2, p1}, Lfb/b;->b(Ljava/lang/Throwable;)Z

    .line 497
    .line 498
    .line 499
    move-result p0

    .line 500
    if-eq p0, v3, :cond_1b

    .line 501
    .line 502
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    if-eqz p0, :cond_1a

    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    move-result-object p0

    .line 513
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    :goto_a
    const-string p1, "\u5185\u7f6e\u9006\u5411\u5de5\u5177\u6267\u884c\u5931\u8d25: "

    .line 518
    .line 519
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object p0

    .line 527
    :goto_b
    check-cast p0, Ljava/lang/String;

    .line 528
    .line 529
    return-object p0

    .line 530
    :cond_1b
    throw p1

    .line 531
    :cond_1c
    const-string p0, "\u5185\u7f6e\u9006\u5411\u5de5\u5177\u5c1a\u672a\u7ed1\u5b9a\u5230\u5fae\u4fe1\u8fd0\u884c\u65f6"

    .line 532
    .line 533
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    return-object p0

    .line 538
    nop

    :sswitch_data_0
    .sparse-switch
        -0x39dfa4f1 -> :sswitch_4
        -0x1b0ddb83 -> :sswitch_3
        0x6b9cdea -> :sswitch_2
        0x185c01f1 -> :sswitch_1
        0x713d7420 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x79817c13 -> :sswitch_13
        -0x759b81f7 -> :sswitch_12
        -0x70d9292f -> :sswitch_11
        -0x5bb4d898 -> :sswitch_10
        -0x4f0e720c -> :sswitch_f
        -0x480715ba -> :sswitch_e
        -0x359ce0d4 -> :sswitch_d
        -0x1c315294 -> :sswitch_c
        0x7c92e2f -> :sswitch_b
        0x30198f8d -> :sswitch_a
        0x4691bedc -> :sswitch_9
        0x4eec7ab5 -> :sswitch_8
        0x503a197f -> :sswitch_7
        0x6dc42b72 -> :sswitch_6
        0x79ff15f4 -> :sswitch_5
    .end sparse-switch
.end method

.method public static final g0()Ljava/lang/String;
    .locals 35

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "\u53ef\u9009\u7684\u5fae\u4fe1 APK \u7edd\u5bf9\u8def\u5f84\uff1b\u53ea\u4f20\u6b64\u53c2\u6570\uff0c\u7701\u7565\u65f6\u4f7f\u7528\u5f53\u524d\u8fd0\u884c\u5fae\u4fe1"

    .line 7
    .line 8
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lsf/e;

    .line 13
    .line 14
    const-string v3, "input"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v2}, [Lsf/e;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v5, 0x0

    .line 28
    const/16 v6, 0x30

    .line 29
    .line 30
    const-string v1, "hchat.reverse.open_target_session"

    .line 31
    .line 32
    const-string v2, "\u6ce8\u518c\u5e76\u6253\u5f00\u6307\u5b9a\u5fae\u4fe1 APK\uff0c\u6216\u5728\u7701\u7565\u53c2\u6570\u65f6\u8fd4\u56de\u5f53\u524d\u8fd0\u884c\u5fae\u4fe1\u76ee\u6807\uff1b\u8fd4\u56de\u7684 session_id \u4ec5\u7528\u4e8e\u540e\u7eed\u67e5\u8be2\u5de5\u5177"

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 36
    .line 37
    .line 38
    const/16 v6, 0x38

    .line 39
    .line 40
    const-string v1, "hchat.reverse.list_target_sessions"

    .line 41
    .line 42
    const-string v2, "\u5217\u51fa\u5f53\u524d\u5fae\u4fe1\u548c\u5df2\u6ce8\u518c\u7684\u5916\u90e8\u5fae\u4fe1 APK \u76ee\u6807"

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 46
    .line 47
    .line 48
    const-string v1, "list_target_sessions \u8fd4\u56de\u7684 session_id"

    .line 49
    .line 50
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lsf/e;

    .line 55
    .line 56
    const-string v7, "session_id"

    .line 57
    .line 58
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    filled-new-array {v2}, [Lsf/e;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/16 v6, 0x20

    .line 74
    .line 75
    const-string v1, "hchat.reverse.get_target_session"

    .line 76
    .line 77
    const-string v2, "\u8bfb\u53d6\u4e00\u4e2a\u76ee\u6807\u4f1a\u8bdd\u7684\u8def\u5f84\u3001\u5fae\u4fe1\u7248\u672c\u548c\u5f53\u524d\u52a0\u8f7d\u72b6\u6001"

    .line 78
    .line 79
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 80
    .line 81
    .line 82
    const-string v1, "\u8981\u5173\u95ed\u7684\u5916\u90e8\u76ee\u6807 session_id"

    .line 83
    .line 84
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, Lsf/e;

    .line 89
    .line 90
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    filled-new-array {v2}, [Lsf/e;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const-string v1, "hchat.reverse.close_target_session"

    .line 106
    .line 107
    const-string v2, "\u5173\u95ed\u5e76\u53d6\u6d88\u6ce8\u518c\u4e00\u4e2a\u5916\u90e8 APK \u76ee\u6807\uff1b\u4e0d\u4f1a\u5220\u9664\u539f APK \u6587\u4ef6"

    .line 108
    .line 109
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 110
    .line 111
    .line 112
    const-string v1, "\u81f3\u5c11\u4e24\u4e2a\u76ee\u6807 session_id"

    .line 113
    .line 114
    invoke-static {v1}, Lfb/n0;->Z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v2, Lsf/e;

    .line 119
    .line 120
    const-string v3, "session_ids"

    .line 121
    .line 122
    invoke-direct {v2, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    const-string v7, "\u5019\u9009\u65b9\u6cd5\u5fc5\u987b\u540c\u65f6\u4f7f\u7528\u7684\u5168\u90e8\u5b57\u7b26\u4e32"

    .line 126
    .line 127
    invoke-static {v7}, Lfb/n0;->Z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    new-instance v4, Lsf/e;

    .line 132
    .line 133
    const-string v8, "contains_all_strings"

    .line 134
    .line 135
    invoke-direct {v4, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const-string v9, "\u5019\u9009\u65b9\u6cd5\u4f7f\u7528\u4efb\u610f\u4e00\u4e2a\u5373\u53ef\u547d\u4e2d\u7684\u5b57\u7b26\u4e32"

    .line 139
    .line 140
    invoke-static {v9}, Lfb/n0;->Z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    new-instance v5, Lsf/e;

    .line 145
    .line 146
    const-string v10, "contains_any_strings"

    .line 147
    .line 148
    invoke-direct {v5, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const/16 v1, 0x64

    .line 152
    .line 153
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    const-string v1, "\u6bcf\u4e2a\u76ee\u6807\u6700\u591a\u8fd4\u56de\u7684\u5019\u9009\u6570\u91cf"

    .line 158
    .line 159
    const/16 v12, 0x1e

    .line 160
    .line 161
    const/4 v13, 0x1

    .line 162
    invoke-static {v1, v12, v13, v11}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    new-instance v6, Lsf/e;

    .line 167
    .line 168
    const-string v14, "limit"

    .line 169
    .line 170
    invoke-direct {v6, v14, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    filled-new-array {v2, v4, v5, v6}, [Lsf/e;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-static {v8}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    const/4 v15, 0x2

    .line 194
    new-array v5, v15, [Ljava/util/List;

    .line 195
    .line 196
    const/4 v6, 0x0

    .line 197
    aput-object v2, v5, v6

    .line 198
    .line 199
    aput-object v3, v5, v13

    .line 200
    .line 201
    invoke-static {v5}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    move-object v3, v1

    .line 206
    const-string v1, "hchat.reverse.compare_methods_using_strings"

    .line 207
    .line 208
    const-string v2, "\u5728\u591a\u4e2a\u5fae\u4fe1 APK \u4e2d\u4f7f\u7528\u540c\u4e00\u7ec4\u5b57\u7b26\u4e32\u951a\u70b9\u5b9a\u4f4d\u65b9\u6cd5\uff0c\u8fd4\u56de\u5404\u7248\u672c\u5019\u9009\u4ee5\u4fbf\u6a2a\u5411\u6bd4\u8f83"

    .line 209
    .line 210
    invoke-static/range {v0 .. v5}, Lfb/n0;->e0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V

    .line 211
    .line 212
    .line 213
    const-string v1, "\u5019\u9009\u7c7b\u5fc5\u987b\u540c\u65f6\u4f7f\u7528\u7684\u5168\u90e8\u5b57\u7b26\u4e32"

    .line 214
    .line 215
    invoke-static {v1}, Lfb/n0;->Z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    new-instance v2, Lsf/e;

    .line 220
    .line 221
    invoke-direct {v2, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    const-string v1, "\u5019\u9009\u7c7b\u4f7f\u7528\u4efb\u610f\u4e00\u4e2a\u5373\u53ef\u547d\u4e2d\u7684\u5b57\u7b26\u4e32"

    .line 225
    .line 226
    invoke-static {v1}, Lfb/n0;->Z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    new-instance v3, Lsf/e;

    .line 231
    .line 232
    invoke-direct {v3, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    const-string v1, "\u53ea\u8fd4\u56de\u7ee7\u7eed\u5b9a\u4f4d\u6240\u9700\u7684\u7d27\u51d1\u5b57\u6bb5"

    .line 236
    .line 237
    invoke-static {v1, v6}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    new-instance v4, Lsf/e;

    .line 242
    .line 243
    const-string v5, "brief"

    .line 244
    .line 245
    invoke-direct {v4, v5, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    sget-object v1, Lfb/n0;->f:Ljava/util/List;

    .line 249
    .line 250
    const-string v12, "\u9700\u8981\u8fd4\u56de\u7684\u5b57\u6bb5"

    .line 251
    .line 252
    invoke-static {v12, v1, v6}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move/from16 v22, v6

    .line 257
    .line 258
    new-instance v6, Lsf/e;

    .line 259
    .line 260
    move/from16 v23, v13

    .line 261
    .line 262
    const-string v13, "fields"

    .line 263
    .line 264
    invoke-direct {v6, v13, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-static {}, Lfb/n0;->U()Lorg/json/JSONObject;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    new-instance v15, Lsf/e;

    .line 272
    .line 273
    invoke-direct {v15, v14, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Lfb/n0;->V()Lorg/json/JSONObject;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    move-object/from16 v25, v0

    .line 281
    .line 282
    new-instance v0, Lsf/e;

    .line 283
    .line 284
    move-object/from16 v18, v4

    .line 285
    .line 286
    const-string v4, "offset"

    .line 287
    .line 288
    invoke-direct {v0, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    move-object/from16 v21, v0

    .line 292
    .line 293
    move-object/from16 v16, v2

    .line 294
    .line 295
    move-object/from16 v17, v3

    .line 296
    .line 297
    move-object/from16 v19, v6

    .line 298
    .line 299
    move-object/from16 v20, v15

    .line 300
    .line 301
    filled-new-array/range {v16 .. v21}, [Lsf/e;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {v0}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-static {v8}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    const/4 v2, 0x2

    .line 318
    new-array v6, v2, [Ljava/util/List;

    .line 319
    .line 320
    aput-object v0, v6, v22

    .line 321
    .line 322
    aput-object v1, v6, v23

    .line 323
    .line 324
    invoke-static {v6}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const/16 v6, 0x10

    .line 329
    .line 330
    const-string v1, "hchat.reverse.find_classes_using_strings"

    .line 331
    .line 332
    const-string v2, "\u6309\u5b57\u7b26\u4e32\u5e38\u91cf\u951a\u70b9\u5b9a\u4f4d\u7c7b\u5019\u9009\uff0c\u5148\u7528\u72ec\u7279\u5b57\u7b26\u4e32\u7f29\u5c0f\u8303\u56f4"

    .line 333
    .line 334
    move-object v15, v4

    .line 335
    const/4 v4, 0x0

    .line 336
    move-object/from16 v26, v5

    .line 337
    .line 338
    move-object/from16 v27, v15

    .line 339
    .line 340
    move/from16 v15, v22

    .line 341
    .line 342
    move-object v5, v0

    .line 343
    move-object/from16 v0, v25

    .line 344
    .line 345
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 346
    .line 347
    .line 348
    invoke-static {v7}, Lfb/n0;->Z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    new-instance v2, Lsf/e;

    .line 353
    .line 354
    invoke-direct {v2, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-static {v9}, Lfb/n0;->Z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    new-instance v3, Lsf/e;

    .line 362
    .line 363
    invoke-direct {v3, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    const-string v9, "\u53ea\u8fd4\u56de descriptor \u548c Dex \u6765\u6e90"

    .line 367
    .line 368
    invoke-static {v9, v15}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    new-instance v4, Lsf/e;

    .line 373
    .line 374
    move-object/from16 v5, v26

    .line 375
    .line 376
    invoke-direct {v4, v5, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    sget-object v1, Lfb/n0;->i:Ljava/util/List;

    .line 380
    .line 381
    invoke-static {v12, v1, v15}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    new-instance v5, Lsf/e;

    .line 386
    .line 387
    invoke-direct {v5, v13, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    invoke-static {}, Lfb/n0;->U()Lorg/json/JSONObject;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    new-instance v7, Lsf/e;

    .line 395
    .line 396
    invoke-direct {v7, v14, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-static {}, Lfb/n0;->V()Lorg/json/JSONObject;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    move-object/from16 v16, v7

    .line 404
    .line 405
    new-instance v7, Lsf/e;

    .line 406
    .line 407
    move-object/from16 v15, v27

    .line 408
    .line 409
    invoke-direct {v7, v15, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v17, v8

    .line 413
    .line 414
    move-object/from16 v6, v16

    .line 415
    .line 416
    move-object/from16 v8, v26

    .line 417
    .line 418
    filled-new-array/range {v2 .. v7}, [Lsf/e;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-static {v2}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-static/range {v17 .. v17}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    const/4 v5, 0x2

    .line 435
    new-array v6, v5, [Ljava/util/List;

    .line 436
    .line 437
    aput-object v2, v6, v22

    .line 438
    .line 439
    aput-object v4, v6, v23

    .line 440
    .line 441
    invoke-static {v6}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    const/16 v6, 0x10

    .line 446
    .line 447
    move-object v2, v1

    .line 448
    const-string v1, "hchat.reverse.find_methods_using_strings"

    .line 449
    .line 450
    move-object v4, v2

    .line 451
    const-string v2, "\u6309\u5b57\u7b26\u4e32\u5e38\u91cf\u951a\u70b9\u5b9a\u4f4d\u65b9\u6cd5\u5019\u9009\uff0c\u8fd4\u56de\u53ef\u7ee7\u7eed\u68c0\u67e5\u7684\u5b8c\u6574 descriptor"

    .line 452
    .line 453
    move-object v7, v4

    .line 454
    const/4 v4, 0x0

    .line 455
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 456
    .line 457
    .line 458
    const-string v1, "bool"

    .line 459
    .line 460
    const-string v2, "color"

    .line 461
    .line 462
    const-string v3, "string"

    .line 463
    .line 464
    const-string v4, "integer"

    .line 465
    .line 466
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    const-string v2, "description"

    .line 475
    .line 476
    const-string v10, "type"

    .line 477
    .line 478
    const-string v4, "\u8d44\u6e90\u7c7b\u578b"

    .line 479
    .line 480
    invoke-static {v10, v3, v2, v4}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    new-instance v3, Lorg/json/JSONArray;

    .line 485
    .line 486
    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 487
    .line 488
    .line 489
    const-string v1, "enum"

    .line 490
    .line 491
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 492
    .line 493
    .line 494
    new-instance v1, Lsf/e;

    .line 495
    .line 496
    invoke-direct {v1, v10, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    const-string v2, "\u8981\u67e5\u627e\u7684\u8d44\u6e90\u503c"

    .line 500
    .line 501
    invoke-static {v2}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    new-instance v3, Lsf/e;

    .line 506
    .line 507
    const-string v4, "value"

    .line 508
    .line 509
    invoke-direct {v3, v4, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    const-string v2, "\u5b57\u7b26\u4e32\u662f\u5426\u4f7f\u7528\u5305\u542b\u5339\u914d\uff1b\u9ed8\u8ba4 true"

    .line 513
    .line 514
    move/from16 v5, v23

    .line 515
    .line 516
    invoke-static {v2, v5}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    new-instance v5, Lsf/e;

    .line 521
    .line 522
    const-string v6, "contains"

    .line 523
    .line 524
    invoke-direct {v5, v6, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    const-string v2, "\u5b57\u7b26\u4e32\u5339\u914d\u662f\u5426\u5ffd\u7565\u5927\u5c0f\u5199"

    .line 528
    .line 529
    move/from16 v6, v22

    .line 530
    .line 531
    invoke-static {v2, v6}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    new-instance v6, Lsf/e;

    .line 536
    .line 537
    move-object/from16 v16, v0

    .line 538
    .line 539
    const-string v0, "ignore_case"

    .line 540
    .line 541
    invoke-direct {v6, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    const-string v0, "\u53ea\u8fd4\u56de\u8d44\u6e90 ID\u3001\u7c7b\u578b\u548c\u540d\u79f0"

    .line 545
    .line 546
    move-object/from16 v25, v1

    .line 547
    .line 548
    const/4 v2, 0x0

    .line 549
    invoke-static {v0, v2}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    new-instance v2, Lsf/e;

    .line 554
    .line 555
    invoke-direct {v2, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    sget-object v1, Lfb/n0;->m:Ljava/util/List;

    .line 559
    .line 560
    move-object/from16 v17, v0

    .line 561
    .line 562
    const/4 v0, 0x0

    .line 563
    invoke-static {v12, v1, v0}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    new-instance v0, Lsf/e;

    .line 568
    .line 569
    invoke-direct {v0, v13, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    invoke-static {}, Lfb/n0;->U()Lorg/json/JSONObject;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    move-object/from16 v30, v0

    .line 577
    .line 578
    new-instance v0, Lsf/e;

    .line 579
    .line 580
    invoke-direct {v0, v14, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    invoke-static {}, Lfb/n0;->V()Lorg/json/JSONObject;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    move-object/from16 v31, v0

    .line 588
    .line 589
    new-instance v0, Lsf/e;

    .line 590
    .line 591
    invoke-direct {v0, v15, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    move-object/from16 v32, v0

    .line 595
    .line 596
    move-object/from16 v29, v2

    .line 597
    .line 598
    move-object/from16 v26, v3

    .line 599
    .line 600
    move-object/from16 v27, v5

    .line 601
    .line 602
    move-object/from16 v28, v6

    .line 603
    .line 604
    filled-new-array/range {v25 .. v32}, [Lsf/e;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-static {v0}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    filled-new-array {v10, v4}, [Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    const/4 v5, 0x0

    .line 621
    const/16 v6, 0x20

    .line 622
    .line 623
    const-string v1, "hchat.reverse.find_resource_values"

    .line 624
    .line 625
    const-string v2, "\u6309 APK resources.arsc \u4e2d\u7684\u8d44\u6e90\u503c\u5b9a\u4f4d\u5b57\u7b26\u4e32\u3001\u6574\u6570\u3001\u5e03\u5c14\u503c\u6216\u989c\u8272\uff1b\u754c\u9762\u6587\u672c\u5fc5\u987b\u4f18\u5148\u4f7f\u7528\u6b64\u5de5\u5177\uff0c\u4e0d\u8981\u62ff\u8d44\u6e90\u6587\u672c\u505a DEX \u5b57\u7b26\u4e32\u68c0\u7d22"

    .line 626
    .line 627
    move-object/from16 v18, v11

    .line 628
    .line 629
    move-object/from16 v0, v16

    .line 630
    .line 631
    move-object/from16 v11, v17

    .line 632
    .line 633
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 634
    .line 635
    .line 636
    const-string v16, "\u8d44\u6e90 ID\uff0c\u4f8b\u5982 0x7f111663"

    .line 637
    .line 638
    invoke-static/range {v16 .. v16}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    new-instance v2, Lsf/e;

    .line 643
    .line 644
    const-string v3, "resource_id"

    .line 645
    .line 646
    invoke-direct {v2, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    const-string v1, "\u8d44\u6e90\u7c7b\u578b\uff0c\u4f8b\u5982 string"

    .line 650
    .line 651
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    new-instance v4, Lsf/e;

    .line 656
    .line 657
    invoke-direct {v4, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    const-string v1, "\u8d44\u6e90\u540d\u79f0\uff0c\u4f8b\u5982 cfs"

    .line 661
    .line 662
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    new-instance v5, Lsf/e;

    .line 667
    .line 668
    const-string v6, "name"

    .line 669
    .line 670
    invoke-direct {v5, v6, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    filled-new-array {v2, v4, v5}, [Lsf/e;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    filled-new-array {v10, v6}, [Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    const/4 v5, 0x2

    .line 694
    new-array v6, v5, [Ljava/util/List;

    .line 695
    .line 696
    const/16 v22, 0x0

    .line 697
    .line 698
    aput-object v2, v6, v22

    .line 699
    .line 700
    const/16 v23, 0x1

    .line 701
    .line 702
    aput-object v4, v6, v23

    .line 703
    .line 704
    invoke-static {v6}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    const/16 v6, 0x10

    .line 709
    .line 710
    move-object v2, v3

    .line 711
    move-object v3, v1

    .line 712
    const-string v1, "hchat.reverse.get_resource_value"

    .line 713
    .line 714
    move-object v4, v2

    .line 715
    const-string v2, "\u6309\u8d44\u6e90 ID \u6216\u8d44\u6e90\u7c7b\u578b/\u540d\u79f0\u8bfb\u53d6 resources.arsc \u4e2d\u7684\u5168\u90e8\u914d\u7f6e\u503c"

    .line 716
    .line 717
    move-object/from16 v17, v4

    .line 718
    .line 719
    const/4 v4, 0x0

    .line 720
    move-object/from16 v19, v11

    .line 721
    .line 722
    move-object/from16 v11, v17

    .line 723
    .line 724
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 725
    .line 726
    .line 727
    invoke-static/range {v16 .. v16}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    new-instance v2, Lsf/e;

    .line 732
    .line 733
    invoke-direct {v2, v11, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    const/4 v6, 0x0

    .line 737
    invoke-static {v9, v6}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    new-instance v3, Lsf/e;

    .line 742
    .line 743
    invoke-direct {v3, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    invoke-static {v12, v7, v6}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    new-instance v4, Lsf/e;

    .line 751
    .line 752
    invoke-direct {v4, v13, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    invoke-static {}, Lfb/n0;->U()Lorg/json/JSONObject;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    new-instance v5, Lsf/e;

    .line 760
    .line 761
    invoke-direct {v5, v14, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    invoke-static {}, Lfb/n0;->V()Lorg/json/JSONObject;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    new-instance v6, Lsf/e;

    .line 769
    .line 770
    invoke-direct {v6, v15, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    filled-new-array {v2, v3, v4, v5, v6}, [Lsf/e;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 778
    .line 779
    .line 780
    move-result-object v3

    .line 781
    invoke-static {v11}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v4

    .line 785
    const/4 v5, 0x0

    .line 786
    const/16 v6, 0x20

    .line 787
    .line 788
    const-string v1, "hchat.reverse.find_methods_using_resource"

    .line 789
    .line 790
    const-string v2, "\u6309\u8d44\u6e90 ID \u5b9a\u4f4d\u76f4\u63a5\u4f7f\u7528\u8be5\u5e38\u91cf\u7684\u65b9\u6cd5\uff1b\u5148\u7528\u8d44\u6e90\u503c\u68c0\u7d22\u53d6\u5f97 resource_id"

    .line 791
    .line 792
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 793
    .line 794
    .line 795
    const-string v1, "\u53ef\u9009\u8d44\u6e90\u7c7b\u578b\uff0c\u4f8b\u5982 string\u3001layout\u3001drawable"

    .line 796
    .line 797
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    new-instance v2, Lsf/e;

    .line 802
    .line 803
    invoke-direct {v2, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    move-object/from16 v11, v19

    .line 807
    .line 808
    const/4 v6, 0x0

    .line 809
    invoke-static {v11, v6}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    new-instance v3, Lsf/e;

    .line 814
    .line 815
    invoke-direct {v3, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    sget-object v1, Lfb/n0;->l:Ljava/util/List;

    .line 819
    .line 820
    invoke-static {v12, v1, v6}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    new-instance v4, Lsf/e;

    .line 825
    .line 826
    invoke-direct {v4, v13, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    invoke-static {}, Lfb/n0;->U()Lorg/json/JSONObject;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    new-instance v5, Lsf/e;

    .line 834
    .line 835
    invoke-direct {v5, v14, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    invoke-static {}, Lfb/n0;->V()Lorg/json/JSONObject;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    new-instance v6, Lsf/e;

    .line 843
    .line 844
    invoke-direct {v6, v15, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    filled-new-array {v2, v3, v4, v5, v6}, [Lsf/e;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 852
    .line 853
    .line 854
    move-result-object v3

    .line 855
    const/4 v5, 0x0

    .line 856
    const/16 v6, 0x30

    .line 857
    .line 858
    const-string v1, "hchat.reverse.list_res"

    .line 859
    .line 860
    const-string v2, "\u5217\u51fa\u5f53\u524d APK \u7684\u8d44\u6e90\u8868\u6761\u76ee\uff1b\u53ef\u6309\u8d44\u6e90\u7c7b\u578b\u8fc7\u6ee4"

    .line 861
    .line 862
    const/4 v4, 0x0

    .line 863
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 864
    .line 865
    .line 866
    const-string v1, "APK \u5185\u8def\u5f84\uff0c\u4f8b\u5982 AndroidManifest.xml \u6216 res/layout/main.xml"

    .line 867
    .line 868
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    new-instance v2, Lsf/e;

    .line 873
    .line 874
    const-string v3, "path"

    .line 875
    .line 876
    invoke-direct {v2, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    const-string v1, "XML \u5b57\u7b26\u504f\u79fb\uff0c\u7eed\u8bfb\u65f6\u4f7f\u7528\u4e0a\u6b21\u8fd4\u56de\u7684 nextOffset"

    .line 880
    .line 881
    const/4 v10, 0x0

    .line 882
    const/4 v6, 0x0

    .line 883
    invoke-static {v1, v6, v6, v10}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 884
    .line 885
    .line 886
    move-result-object v1

    .line 887
    new-instance v4, Lsf/e;

    .line 888
    .line 889
    invoke-direct {v4, v15, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    const v1, 0xbb80

    .line 893
    .line 894
    .line 895
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v11

    .line 899
    const-string v1, "\u672c\u6b21\u6700\u591a\u8fd4\u56de\u5b57\u7b26\u6570"

    .line 900
    .line 901
    const/16 v5, 0x5dc0

    .line 902
    .line 903
    const/16 v6, 0x3e8

    .line 904
    .line 905
    invoke-static {v1, v5, v6, v11}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 906
    .line 907
    .line 908
    move-result-object v10

    .line 909
    new-instance v5, Lsf/e;

    .line 910
    .line 911
    const-string v6, "max_chars"

    .line 912
    .line 913
    invoke-direct {v5, v6, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    filled-new-array {v2, v4, v5}, [Lsf/e;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    invoke-static {v2}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object v4

    .line 928
    const/4 v5, 0x0

    .line 929
    move-object v3, v6

    .line 930
    const/16 v6, 0x20

    .line 931
    .line 932
    move-object v10, v1

    .line 933
    const-string v1, "hchat.reverse.decode_xml"

    .line 934
    .line 935
    move-object/from16 v20, v3

    .line 936
    .line 937
    move-object v3, v2

    .line 938
    const-string v2, "\u89e3\u7801 APK \u5185\u7684\u4e8c\u8fdb\u5236 XML\uff0c\u4f8b\u5982 AndroidManifest.xml \u6216 res/layout/*.xml\uff1btruncated=true \u65f6\u6309 nextOffset \u7eed\u8bfb"

    .line 939
    .line 940
    move-object/from16 v33, v10

    .line 941
    .line 942
    const/16 v10, 0x5dc0

    .line 943
    .line 944
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 945
    .line 946
    .line 947
    const-string v1, "\u5b8c\u6574\u65b9\u6cd5 descriptor\uff0c\u4f8b\u5982 Lpkg/Class;->name(I)Z\uff1b\u586b\u5199\u65f6\u7cbe\u786e\u67e5\u8be2"

    .line 948
    .line 949
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    new-instance v2, Lsf/e;

    .line 954
    .line 955
    const-string v3, "descriptor"

    .line 956
    .line 957
    invoke-direct {v2, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 958
    .line 959
    .line 960
    const-string v1, "\u58f0\u660e\u7c7b\u540d\u5305\u542b\u7684\u6587\u672c\uff0c\u53ef\u7528\u70b9\u5206\u7c7b\u540d\u6216 descriptor \u7247\u6bb5"

    .line 961
    .line 962
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    new-instance v4, Lsf/e;

    .line 967
    .line 968
    const-string v5, "class_name_contains"

    .line 969
    .line 970
    invoke-direct {v4, v5, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    const-string v1, "\u65b9\u6cd5\u540d\u5305\u542b\u7684\u6587\u672c\uff0c\u533a\u5206\u5927\u5c0f\u5199"

    .line 974
    .line 975
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    new-instance v6, Lsf/e;

    .line 980
    .line 981
    const-string v10, "method_name_contains"

    .line 982
    .line 983
    invoke-direct {v6, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 984
    .line 985
    .line 986
    const-string v1, "\u5728\u7c7b\u540d/\u65b9\u6cd5\u540d\u7b5b\u9009\u7ed3\u679c\u4e0a\u7ee7\u7eed\u8fc7\u6ee4 descriptor \u7684\u6587\u672c"

    .line 987
    .line 988
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    move-object/from16 v19, v0

    .line 993
    .line 994
    new-instance v0, Lsf/e;

    .line 995
    .line 996
    move-object/from16 v25, v2

    .line 997
    .line 998
    const-string v2, "descriptor_contains"

    .line 999
    .line 1000
    invoke-direct {v0, v2, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1001
    .line 1002
    .line 1003
    const/4 v2, 0x0

    .line 1004
    invoke-static {v9, v2}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    new-instance v9, Lsf/e;

    .line 1009
    .line 1010
    invoke-direct {v9, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v12, v7, v2}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    new-instance v2, Lsf/e;

    .line 1018
    .line 1019
    invoke-direct {v2, v13, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-static {}, Lfb/n0;->U()Lorg/json/JSONObject;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v1

    .line 1026
    new-instance v7, Lsf/e;

    .line 1027
    .line 1028
    invoke-direct {v7, v14, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-static {}, Lfb/n0;->V()Lorg/json/JSONObject;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    new-instance v12, Lsf/e;

    .line 1036
    .line 1037
    invoke-direct {v12, v15, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1038
    .line 1039
    .line 1040
    move-object/from16 v28, v0

    .line 1041
    .line 1042
    move-object/from16 v30, v2

    .line 1043
    .line 1044
    move-object/from16 v26, v4

    .line 1045
    .line 1046
    move-object/from16 v27, v6

    .line 1047
    .line 1048
    move-object/from16 v31, v7

    .line 1049
    .line 1050
    move-object/from16 v29, v9

    .line 1051
    .line 1052
    move-object/from16 v32, v12

    .line 1053
    .line 1054
    filled-new-array/range {v25 .. v32}, [Lsf/e;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    invoke-static {v0}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v0

    .line 1062
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v1

    .line 1066
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v4

    .line 1074
    const/4 v5, 0x3

    .line 1075
    new-array v5, v5, [Ljava/util/List;

    .line 1076
    .line 1077
    const/16 v22, 0x0

    .line 1078
    .line 1079
    aput-object v1, v5, v22

    .line 1080
    .line 1081
    const/16 v23, 0x1

    .line 1082
    .line 1083
    aput-object v2, v5, v23

    .line 1084
    .line 1085
    const/16 v24, 0x2

    .line 1086
    .line 1087
    aput-object v4, v5, v24

    .line 1088
    .line 1089
    invoke-static {v5}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v5

    .line 1093
    const/16 v6, 0x10

    .line 1094
    .line 1095
    const-string v1, "hchat.reverse.find_methods"

    .line 1096
    .line 1097
    const-string v2, "\u6309\u5b8c\u6574 descriptor \u7cbe\u786e\u5b9a\u4f4d\uff0c\u6216\u6309\u7c7b\u540d/\u65b9\u6cd5\u540d\u7ec4\u5408\u7b5b\u9009\u65b9\u6cd5"

    .line 1098
    .line 1099
    const/4 v4, 0x0

    .line 1100
    move-object v7, v3

    .line 1101
    move-object v3, v0

    .line 1102
    move-object/from16 v0, v19

    .line 1103
    .line 1104
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1105
    .line 1106
    .line 1107
    const-string v1, "find_methods \u8fd4\u56de\u7684\u5b8c\u6574\u65b9\u6cd5 descriptor"

    .line 1108
    .line 1109
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    new-instance v2, Lsf/e;

    .line 1114
    .line 1115
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1116
    .line 1117
    .line 1118
    const-string v29, "annotations"

    .line 1119
    .line 1120
    const-string v30, "opcodes"

    .line 1121
    .line 1122
    const-string v25, "strings"

    .line 1123
    .line 1124
    const-string v26, "using-fields"

    .line 1125
    .line 1126
    const-string v27, "invokes"

    .line 1127
    .line 1128
    const-string v28, "callers"

    .line 1129
    .line 1130
    filled-new-array/range {v25 .. v30}, [Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v1

    .line 1134
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v1

    .line 1138
    const-string v3, "\u53ef\u9009\u8bc1\u636e\uff1b\u7701\u7565\u6216\u4f20\u7a7a\u6570\u7ec4\u65f6\u8fd4\u56de\u5168\u90e8\u8bc1\u636e"

    .line 1139
    .line 1140
    const/4 v6, 0x0

    .line 1141
    invoke-static {v3, v1, v6}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    new-instance v3, Lsf/e;

    .line 1146
    .line 1147
    const-string v9, "include"

    .line 1148
    .line 1149
    invoke-direct {v3, v9, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1150
    .line 1151
    .line 1152
    const-string v1, "\u53ea\u8fd4\u56de\u5404\u7c7b\u8bc1\u636e\u6570\u91cf"

    .line 1153
    .line 1154
    invoke-static {v1, v6}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    new-instance v4, Lsf/e;

    .line 1159
    .line 1160
    invoke-direct {v4, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1161
    .line 1162
    .line 1163
    filled-new-array {v2, v3, v4}, [Lsf/e;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v3

    .line 1171
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v4

    .line 1175
    const/4 v5, 0x0

    .line 1176
    const/16 v6, 0x20

    .line 1177
    .line 1178
    const-string v1, "hchat.reverse.inspect_method"

    .line 1179
    .line 1180
    const-string v2, "\u68c0\u67e5\u4e00\u4e2a\u65b9\u6cd5\u7684\u5b57\u7b26\u4e32\u3001\u5b57\u6bb5\u3001opcode\uff0c\u5e76\u6309\u9700\u8fd4\u56de\u4e00\u5c42\u8c03\u7528\u76ee\u6807\u6216\u8c03\u7528\u8005"

    .line 1181
    .line 1182
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1183
    .line 1184
    .line 1185
    const-string v1, "\u5b8c\u6574\u7c7b descriptor\uff0c\u4f8b\u5982 Lpkg/Class;"

    .line 1186
    .line 1187
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    new-instance v2, Lsf/e;

    .line 1192
    .line 1193
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1194
    .line 1195
    .line 1196
    const-string v1, "\u5b8c\u6574\u70b9\u5206\u7c7b\u540d\u6216\u7c7b descriptor"

    .line 1197
    .line 1198
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v1

    .line 1202
    new-instance v3, Lsf/e;

    .line 1203
    .line 1204
    const-string v10, "class_name"

    .line 1205
    .line 1206
    invoke-direct {v3, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1207
    .line 1208
    .line 1209
    const-string v1, "methods"

    .line 1210
    .line 1211
    const-string v4, "annotations"

    .line 1212
    .line 1213
    filled-new-array {v13, v1, v4}, [Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    const-string v4, "\u53ef\u9009\u5185\u5bb9\uff1b\u7701\u7565\u65f6\u8fd4\u56de\u5b57\u6bb5\u548c\u65b9\u6cd5\uff0cannotations \u9700\u663e\u5f0f\u8bf7\u6c42"

    .line 1222
    .line 1223
    const/4 v6, 0x0

    .line 1224
    invoke-static {v4, v1, v6}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v1

    .line 1228
    new-instance v4, Lsf/e;

    .line 1229
    .line 1230
    invoke-direct {v4, v9, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    const-string v1, "\u53ea\u8fd4\u56de\u7c7b\u6458\u8981\u548c\u5185\u5bb9\u6570\u91cf"

    .line 1234
    .line 1235
    invoke-static {v1, v6}, Lfb/n0;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v1

    .line 1239
    new-instance v5, Lsf/e;

    .line 1240
    .line 1241
    invoke-direct {v5, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1242
    .line 1243
    .line 1244
    const-string v1, "\u8fd4\u56de\u7684\u5b57\u6bb5\u548c\u65b9\u6cd5\u5404\u81ea\u6700\u5927\u6570\u91cf"

    .line 1245
    .line 1246
    move-object/from16 v6, v18

    .line 1247
    .line 1248
    const/16 v8, 0x1e

    .line 1249
    .line 1250
    const/4 v12, 0x1

    .line 1251
    invoke-static {v1, v8, v12, v6}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v1

    .line 1255
    new-instance v6, Lsf/e;

    .line 1256
    .line 1257
    invoke-direct {v6, v14, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1258
    .line 1259
    .line 1260
    filled-new-array {v2, v3, v4, v5, v6}, [Lsf/e;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v1

    .line 1264
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v3

    .line 1268
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v1

    .line 1272
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    const/4 v5, 0x2

    .line 1277
    new-array v4, v5, [Ljava/util/List;

    .line 1278
    .line 1279
    const/16 v22, 0x0

    .line 1280
    .line 1281
    aput-object v1, v4, v22

    .line 1282
    .line 1283
    aput-object v2, v4, v12

    .line 1284
    .line 1285
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v5

    .line 1289
    const/16 v6, 0x10

    .line 1290
    .line 1291
    const-string v1, "hchat.reverse.inspect_class"

    .line 1292
    .line 1293
    const-string v2, "\u5217\u51fa\u4e00\u4e2a\u7c7b\u7684\u7236\u7c7b\u3001\u63a5\u53e3\u3001\u5b57\u6bb5\u548c\u65b9\u6cd5 descriptor"

    .line 1294
    .line 1295
    const/4 v4, 0x0

    .line 1296
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1297
    .line 1298
    .line 1299
    const-string v8, "\u8981\u5bfc\u51fa\u7684\u5b8c\u6574\u65b9\u6cd5 descriptor"

    .line 1300
    .line 1301
    invoke-static {v8}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v1

    .line 1305
    new-instance v2, Lsf/e;

    .line 1306
    .line 1307
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1308
    .line 1309
    .line 1310
    const-string v12, "Java \u5b57\u7b26\u504f\u79fb\uff0c\u7eed\u8bfb\u65f6\u4f7f\u7528\u4e0a\u6b21\u8fd4\u56de\u7684 nextOffset"

    .line 1311
    .line 1312
    const/4 v1, 0x0

    .line 1313
    const/4 v6, 0x0

    .line 1314
    invoke-static {v12, v6, v6, v1}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v3

    .line 1318
    new-instance v1, Lsf/e;

    .line 1319
    .line 1320
    invoke-direct {v1, v15, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1321
    .line 1322
    .line 1323
    const-string v13, "\u672c\u6b21\u6700\u591a\u8fd4\u56de\u5b57\u7b26\u6570\uff1b\u5927\u65b9\u6cd5\u5e94\u5206\u9875\u8bfb\u53d6"

    .line 1324
    .line 1325
    const/16 v3, 0x5dc0

    .line 1326
    .line 1327
    const/16 v14, 0x3e8

    .line 1328
    .line 1329
    invoke-static {v13, v3, v14, v11}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v4

    .line 1333
    new-instance v3, Lsf/e;

    .line 1334
    .line 1335
    move-object/from16 v5, v20

    .line 1336
    .line 1337
    invoke-direct {v3, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1338
    .line 1339
    .line 1340
    filled-new-array {v2, v1, v3}, [Lsf/e;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v3

    .line 1348
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v4

    .line 1352
    const/4 v5, 0x0

    .line 1353
    const/16 v6, 0x20

    .line 1354
    .line 1355
    const-string v1, "hchat.reverse.export_method_java"

    .line 1356
    .line 1357
    const-string v2, "\u6309\u5b8c\u6574\u65b9\u6cd5 descriptor \u5bfc\u51fa Java \u8bed\u4e49\u4ee3\u7801\uff1btruncated=true \u65f6\u7528 nextOffset \u7ee7\u7eed\u8bfb\u53d6"

    .line 1358
    .line 1359
    move-object/from16 v34, v20

    .line 1360
    .line 1361
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1362
    .line 1363
    .line 1364
    const-string v18, "\u8981\u5bfc\u51fa\u7684\u5b8c\u6574\u7c7b descriptor"

    .line 1365
    .line 1366
    invoke-static/range {v18 .. v18}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v1

    .line 1370
    new-instance v2, Lsf/e;

    .line 1371
    .line 1372
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1373
    .line 1374
    .line 1375
    const-string v19, "\u8981\u5bfc\u51fa\u7684\u5b8c\u6574\u70b9\u5206\u7c7b\u540d"

    .line 1376
    .line 1377
    invoke-static/range {v19 .. v19}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v1

    .line 1381
    new-instance v3, Lsf/e;

    .line 1382
    .line 1383
    invoke-direct {v3, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    const/4 v1, 0x0

    .line 1387
    const/4 v6, 0x0

    .line 1388
    invoke-static {v12, v6, v6, v1}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v4

    .line 1392
    new-instance v1, Lsf/e;

    .line 1393
    .line 1394
    invoke-direct {v1, v15, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1395
    .line 1396
    .line 1397
    const-string v4, "\u672c\u6b21\u6700\u591a\u8fd4\u56de\u5b57\u7b26\u6570\uff1b\u6574\u7c7b Java \u5e94\u5206\u9875\u8bfb\u53d6"

    .line 1398
    .line 1399
    const/16 v5, 0x5dc0

    .line 1400
    .line 1401
    invoke-static {v4, v5, v14, v11}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v4

    .line 1405
    new-instance v5, Lsf/e;

    .line 1406
    .line 1407
    move-object/from16 v12, v34

    .line 1408
    .line 1409
    invoke-direct {v5, v12, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1410
    .line 1411
    .line 1412
    filled-new-array {v2, v3, v1, v5}, [Lsf/e;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v1

    .line 1416
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v3

    .line 1420
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v1

    .line 1424
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    const/4 v5, 0x2

    .line 1429
    new-array v4, v5, [Ljava/util/List;

    .line 1430
    .line 1431
    const/16 v22, 0x0

    .line 1432
    .line 1433
    aput-object v1, v4, v22

    .line 1434
    .line 1435
    const/16 v23, 0x1

    .line 1436
    .line 1437
    aput-object v2, v4, v23

    .line 1438
    .line 1439
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v5

    .line 1443
    const/16 v6, 0x10

    .line 1444
    .line 1445
    const-string v1, "hchat.reverse.export_class_java"

    .line 1446
    .line 1447
    const-string v2, "\u6309\u7c7b descriptor \u6216\u7c7b\u540d\u5bfc\u51fa\u6574\u7c7b Java \u8bed\u4e49\u4ee3\u7801\uff1btruncated=true \u65f6\u7528 nextOffset \u7ee7\u7eed\u8bfb\u53d6"

    .line 1448
    .line 1449
    const/4 v4, 0x0

    .line 1450
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1451
    .line 1452
    .line 1453
    invoke-static {v8}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v1

    .line 1457
    new-instance v2, Lsf/e;

    .line 1458
    .line 1459
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1460
    .line 1461
    .line 1462
    const-string v8, "Smali \u5b57\u7b26\u504f\u79fb\uff0c\u7eed\u8bfb\u65f6\u4f7f\u7528\u4e0a\u6b21\u8fd4\u56de\u7684 nextOffset"

    .line 1463
    .line 1464
    const/4 v1, 0x0

    .line 1465
    const/4 v6, 0x0

    .line 1466
    invoke-static {v8, v6, v6, v1}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v3

    .line 1470
    new-instance v1, Lsf/e;

    .line 1471
    .line 1472
    invoke-direct {v1, v15, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1473
    .line 1474
    .line 1475
    const/16 v3, 0x5dc0

    .line 1476
    .line 1477
    invoke-static {v13, v3, v14, v11}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v4

    .line 1481
    new-instance v3, Lsf/e;

    .line 1482
    .line 1483
    invoke-direct {v3, v12, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1484
    .line 1485
    .line 1486
    filled-new-array {v2, v1, v3}, [Lsf/e;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v1

    .line 1490
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v3

    .line 1494
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v4

    .line 1498
    const/4 v5, 0x0

    .line 1499
    const/16 v6, 0x20

    .line 1500
    .line 1501
    const-string v1, "hchat.reverse.export_method_smali"

    .line 1502
    .line 1503
    const-string v2, "\u6309\u5b8c\u6574\u65b9\u6cd5 descriptor \u5bfc\u51fa Smali\uff1btruncated=true \u65f6\u7528 nextOffset \u7ee7\u7eed\u8bfb\u53d6"

    .line 1504
    .line 1505
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1506
    .line 1507
    .line 1508
    invoke-static/range {v18 .. v18}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v1

    .line 1512
    new-instance v2, Lsf/e;

    .line 1513
    .line 1514
    invoke-direct {v2, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1515
    .line 1516
    .line 1517
    invoke-static/range {v19 .. v19}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    new-instance v3, Lsf/e;

    .line 1522
    .line 1523
    invoke-direct {v3, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1524
    .line 1525
    .line 1526
    const/4 v1, 0x0

    .line 1527
    const/4 v6, 0x0

    .line 1528
    invoke-static {v8, v6, v6, v1}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v4

    .line 1532
    new-instance v1, Lsf/e;

    .line 1533
    .line 1534
    invoke-direct {v1, v15, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1535
    .line 1536
    .line 1537
    const-string v4, "\u672c\u6b21\u6700\u591a\u8fd4\u56de\u5b57\u7b26\u6570\uff1b\u6574\u7c7b Smali \u5e94\u5206\u9875\u8bfb\u53d6"

    .line 1538
    .line 1539
    const/16 v5, 0x5dc0

    .line 1540
    .line 1541
    invoke-static {v4, v5, v14, v11}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v4

    .line 1545
    new-instance v5, Lsf/e;

    .line 1546
    .line 1547
    invoke-direct {v5, v12, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1548
    .line 1549
    .line 1550
    filled-new-array {v2, v3, v1, v5}, [Lsf/e;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v1

    .line 1554
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v3

    .line 1558
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v1

    .line 1562
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v2

    .line 1566
    const/4 v5, 0x2

    .line 1567
    new-array v4, v5, [Ljava/util/List;

    .line 1568
    .line 1569
    const/16 v22, 0x0

    .line 1570
    .line 1571
    aput-object v1, v4, v22

    .line 1572
    .line 1573
    const/16 v23, 0x1

    .line 1574
    .line 1575
    aput-object v2, v4, v23

    .line 1576
    .line 1577
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v5

    .line 1581
    const/16 v6, 0x10

    .line 1582
    .line 1583
    const-string v1, "hchat.reverse.export_class_smali"

    .line 1584
    .line 1585
    const-string v2, "\u6309\u7c7b descriptor \u6216\u7c7b\u540d\u5bfc\u51fa\u6574\u7c7b Smali\uff1btruncated=true \u65f6\u7528 nextOffset \u7ee7\u7eed\u8bfb\u53d6"

    .line 1586
    .line 1587
    const/4 v4, 0x0

    .line 1588
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1589
    .line 1590
    .line 1591
    const-string v1, "\u957f\u5de5\u5177\u7ed3\u679c\u8fd4\u56de\u7684 handle"

    .line 1592
    .line 1593
    invoke-static {v1}, Lfb/n0;->a0(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v1

    .line 1597
    new-instance v2, Lsf/e;

    .line 1598
    .line 1599
    const-string v3, "handle"

    .line 1600
    .line 1601
    invoke-direct {v2, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1602
    .line 1603
    .line 1604
    const-string v1, "\u4ece nextOffset \u6307\u5b9a\u7684\u4f4d\u7f6e\u7ee7\u7eed\u8bfb\u53d6"

    .line 1605
    .line 1606
    const/4 v4, 0x0

    .line 1607
    const/4 v6, 0x0

    .line 1608
    invoke-static {v1, v6, v6, v4}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v1

    .line 1612
    new-instance v4, Lsf/e;

    .line 1613
    .line 1614
    invoke-direct {v4, v15, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1615
    .line 1616
    .line 1617
    move-object/from16 v10, v33

    .line 1618
    .line 1619
    const/16 v5, 0x5dc0

    .line 1620
    .line 1621
    invoke-static {v10, v5, v14, v11}, Lfb/n0;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v1

    .line 1625
    new-instance v5, Lsf/e;

    .line 1626
    .line 1627
    invoke-direct {v5, v12, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1628
    .line 1629
    .line 1630
    filled-new-array {v2, v4, v5}, [Lsf/e;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v1

    .line 1634
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v1

    .line 1638
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v4

    .line 1642
    const/4 v5, 0x0

    .line 1643
    const/16 v6, 0x20

    .line 1644
    .line 1645
    move-object v3, v1

    .line 1646
    const-string v1, "hchat.reverse.read_tool_result"

    .line 1647
    .line 1648
    const-string v2, "\u6309 handle \u548c\u5b57\u7b26\u504f\u79fb\u7ee7\u7eed\u8bfb\u53d6\u88ab\u5206\u9875\u4fdd\u5b58\u7684\u4efb\u610f\u5de5\u5177\u7ed3\u679c"

    .line 1649
    .line 1650
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1651
    .line 1652
    .line 1653
    const-string v1, "\u9700\u8981\u5c55\u5f00\u7684 Manifest \u5206\u533a"

    .line 1654
    .line 1655
    sget-object v2, Lfb/n0;->t:Ljava/util/List;

    .line 1656
    .line 1657
    const/4 v6, 0x0

    .line 1658
    invoke-static {v1, v2, v6}, Lfb/n0;->Y(Ljava/lang/String;Ljava/util/List;Z)Lorg/json/JSONObject;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v1

    .line 1662
    new-instance v2, Lsf/e;

    .line 1663
    .line 1664
    invoke-direct {v2, v9, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1665
    .line 1666
    .line 1667
    filled-new-array {v2}, [Lsf/e;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v1

    .line 1671
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v3

    .line 1675
    const/16 v6, 0x30

    .line 1676
    .line 1677
    const-string v1, "hchat.reverse.manifest"

    .line 1678
    .line 1679
    const-string v2, "\u8bfb\u53d6\u76ee\u6807 APK \u7684\u7ed3\u6784\u5316 Manifest\uff1binclude \u7701\u7565\u65f6\u4fdd\u6301\u57fa\u7840\u6458\u8981"

    .line 1680
    .line 1681
    const/4 v4, 0x0

    .line 1682
    invoke-static/range {v0 .. v6}, Lfb/n0;->f0(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;I)V

    .line 1683
    .line 1684
    .line 1685
    const-string v1, "instructions"

    .line 1686
    .line 1687
    const-string v2, "\u9ed8\u8ba4\u76ee\u6807\u662f\u5f53\u524d\u5fae\u4fe1 APK\u3002\u5206\u6790\u5176\u5b83\u7248\u672c\u65f6\u5148\u7528 open_target_session(input) \u6ce8\u518c APK\uff0c\u5e76\u5728\u540e\u7eed\u6bcf\u6b21\u67e5\u8be2\u4e2d\u4f20\u8fd4\u56de\u7684 session_id\uff1b\u591a\u7248\u672c\u521d\u7b5b\u4f18\u5148\u4f7f\u7528 compare_methods_using_strings\u3002find/list \u9996\u6b21\u67e5\u8be2\u4f18\u5148 brief=true\uff0c\u786e\u6709\u9700\u8981\u518d\u9009\u62e9 fields\u3002Java/Smali/XML \u6309 nextOffset \u5206\u9875\u8bfb\u53d6\u3002"

    .line 1688
    .line 1689
    const-string v3, "source"

    .line 1690
    .line 1691
    const-string v4, "Hchat \u5185\u7f6e\u9006\u5411\u5de5\u5177"

    .line 1692
    .line 1693
    invoke-static {v3, v4, v1, v2}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v1

    .line 1697
    const-string v2, "tools"

    .line 1698
    .line 1699
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1700
    .line 1701
    .line 1702
    const-string v0, "target"

    .line 1703
    .line 1704
    const-string v2, "\u5f53\u524d\u5fae\u4fe1 APK\uff0c\u53ef\u6309 session_id \u67e5\u8be2\u5df2\u6ce8\u518c\u7684\u5176\u5b83\u5fae\u4fe1 APK"

    .line 1705
    .line 1706
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v0

    .line 1713
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1714
    .line 1715
    .line 1716
    return-object v0
.end method

.method public static h(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "session_id"

    .line 4
    .line 5
    invoke-static {v1, v0, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string p0, "close_target_session \u9700\u8981 session_id"

    .line 16
    .line 17
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    iget-object v0, p0, Lfb/j0;->j:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string p0, "\u5f53\u524d\u8fd0\u884c\u5fae\u4fe1\u76ee\u6807\u4e0d\u80fd\u5173\u95ed"

    .line 31
    .line 32
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object v0, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lfb/m0;

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    sget-object v2, Lfb/n0;->e:Lfb/j0;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object v2, v2, Lfb/j0;->j:Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v2, v3

    .line 56
    :goto_0
    invoke-static {v2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    sget-object p1, Lfb/n0;->e:Lfb/j0;

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Lfb/j0;->close()V

    .line 67
    .line 68
    .line 69
    :cond_3
    sput-object v3, Lfb/n0;->e:Lfb/j0;

    .line 70
    .line 71
    :cond_4
    invoke-static {p0}, Lfb/n0;->L(Lfb/j0;)V

    .line 72
    .line 73
    .line 74
    new-instance p0, Lorg/json/JSONObject;

    .line 75
    .line 76
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string p1, "ok"

    .line 80
    .line 81
    const/4 v2, 0x1

    .line 82
    invoke-virtual {p0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    iget-object p1, v0, Lfb/m0;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const-string p1, "sourcePath"

    .line 91
    .line 92
    iget-object v0, v0, Lfb/m0;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    const-string p1, "message"

    .line 98
    .line 99
    const-string v0, "\u5916\u90e8\u76ee\u6807\u5df2\u5173\u95ed\uff0c\u539f APK \u6587\u4ef6\u672a\u5220\u9664"

    .line 100
    .line 101
    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_5
    const-string p0, "\u6ca1\u6709\u627e\u5230\u76ee\u6807\u4f1a\u8bdd: "

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0
.end method

.method public static i(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const-string v4, "hasMore"

    .line 8
    .line 9
    const-string v5, "limit"

    .line 10
    .line 11
    const-string v6, "offset"

    .line 12
    .line 13
    const-string v7, "total"

    .line 14
    .line 15
    const-string v0, "session_ids"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v9, 0x2

    .line 34
    if-ge v0, v9, :cond_0

    .line 35
    .line 36
    const-string v0, "compare_methods_using_strings \u81f3\u5c11\u9700\u8981\u4e24\u4e2a session_id"

    .line 37
    .line 38
    invoke-static {v0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/16 v9, 0xc

    .line 48
    .line 49
    if-le v0, v9, :cond_1

    .line 50
    .line 51
    const-string v0, "compare_methods_using_strings \u4e00\u6b21\u6700\u591a\u6bd4\u8f83 12 \u4e2a\u76ee\u6807"

    .line 52
    .line 53
    invoke-static {v0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :cond_1
    const-string v0, "contains_all_strings"

    .line 59
    .line 60
    invoke-static {v0, v2}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v9, "contains_any_strings"

    .line 65
    .line 66
    invoke-static {v9, v2}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    const-string v0, "\u81f3\u5c11\u63d0\u4f9b contains_all_strings \u6216 contains_any_strings"

    .line 83
    .line 84
    invoke-static {v0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_2
    new-instance v9, Lorg/json/JSONArray;

    .line 90
    .line 91
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    const/4 v12, 0x0

    .line 99
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const-string v13, "items"

    .line 104
    .line 105
    const-string v14, "ok"

    .line 106
    .line 107
    if-eqz v0, :cond_a

    .line 108
    .line 109
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v3}, Lfb/b;->d()V

    .line 116
    .line 117
    .line 118
    sget-object v15, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 119
    .line 120
    invoke-virtual {v15, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    check-cast v15, Lfb/m0;

    .line 125
    .line 126
    const-string v11, "error"

    .line 127
    .line 128
    if-nez v15, :cond_3

    .line 129
    .line 130
    add-int/lit8 v12, v12, 0x1

    .line 131
    .line 132
    new-instance v13, Lorg/json/JSONObject;

    .line 133
    .line 134
    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v15, "session_id"

    .line 138
    .line 139
    invoke-virtual {v13, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    const/4 v15, 0x0

    .line 143
    invoke-virtual {v13, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    const-string v0, "\u6ca1\u6709\u627e\u5230\u76ee\u6807\u4f1a\u8bdd"

    .line 147
    .line 148
    invoke-virtual {v13, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 152
    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    goto/16 :goto_7

    .line 156
    .line 157
    :cond_3
    invoke-static {v1, v15}, Lfb/n0;->d0(Lfb/j0;Lfb/m0;)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    :try_start_0
    invoke-static {v1, v0}, Lfb/n0;->Q(Lfb/j0;Ljava/lang/String;)Lfb/j0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v1, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-static {v0, v2, v3}, Lfb/n0;->u(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string v0, ""

    .line 175
    .line 176
    invoke-virtual {v1, v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-object/from16 v16, v0

    .line 184
    .line 185
    invoke-static/range {v16 .. v16}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-virtual {v1, v14, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_4

    .line 194
    .line 195
    add-int/lit8 v12, v12, 0x1

    .line 196
    .line 197
    :cond_4
    invoke-virtual {v15, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 198
    .line 199
    .line 200
    const/4 v2, 0x0

    .line 201
    invoke-virtual {v1, v7, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    invoke-virtual {v15, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v6, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-virtual {v15, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    invoke-static/range {p1 .. p1}, Lfb/n0;->B(Lorg/json/JSONObject;)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    invoke-virtual {v1, v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {v15, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    invoke-virtual {v15, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-eqz v0, :cond_5

    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_5
    new-instance v0, Lorg/json/JSONArray;

    .line 241
    .line 242
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 243
    .line 244
    .line 245
    :goto_1
    invoke-virtual {v15, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 246
    .line 247
    .line 248
    invoke-static/range {v16 .. v16}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_6

    .line 253
    .line 254
    move-object/from16 v0, v16

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_6
    const/4 v0, 0x0

    .line 258
    :goto_2
    if-eqz v0, :cond_7

    .line 259
    .line 260
    invoke-virtual {v15, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :catchall_0
    move-exception v0

    .line 265
    goto :goto_4

    .line 266
    :cond_7
    :goto_3
    const/4 v1, 0x0

    .line 267
    goto :goto_6

    .line 268
    :goto_4
    invoke-virtual {v3, v0}, Lfb/b;->b(Ljava/lang/Throwable;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    const/4 v2, 0x1

    .line 273
    if-eq v1, v2, :cond_9

    .line 274
    .line 275
    add-int/2addr v12, v2

    .line 276
    const/4 v1, 0x0

    .line 277
    invoke-virtual {v15, v14, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    if-eqz v2, :cond_8

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    :goto_5
    invoke-virtual {v15, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 296
    .line 297
    .line 298
    :goto_6
    invoke-virtual {v9, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 299
    .line 300
    .line 301
    :goto_7
    move-object/from16 v1, p0

    .line 302
    .line 303
    move-object/from16 v2, p1

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_9
    throw v0

    .line 308
    :cond_a
    const/4 v1, 0x0

    .line 309
    const/4 v2, 0x1

    .line 310
    new-instance v0, Lorg/json/JSONObject;

    .line 311
    .line 312
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 313
    .line 314
    .line 315
    if-nez v12, :cond_b

    .line 316
    .line 317
    move v11, v2

    .line 318
    goto :goto_8

    .line 319
    :cond_b
    move v11, v1

    .line 320
    :goto_8
    invoke-virtual {v0, v14, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 321
    .line 322
    .line 323
    const-string v1, "requested"

    .line 324
    .line 325
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 330
    .line 331
    .line 332
    const-string v1, "compared"

    .line 333
    .line 334
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 339
    .line 340
    .line 341
    const-string v1, "failed"

    .line 342
    .line 343
    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v13, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    return-object v0
.end method

.method public static j(Landroid/content/pm/ComponentInfo;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v2

    .line 14
    :goto_0
    const-string v3, "name"

    .line 15
    .line 16
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroid/content/pm/ComponentInfo;->processName:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    :cond_1
    const-string v1, "process"

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string v1, "exported"

    .line 30
    .line 31
    iget-boolean v2, p0, Landroid/content/pm/ComponentInfo;->exported:Z

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string v1, "enabled"

    .line 37
    .line 38
    iget-boolean p0, p0, Landroid/content/pm/ComponentInfo;->enabled:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public static k(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "offset"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "path"

    .line 6
    .line 7
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "/"

    .line 23
    .line 24
    invoke-static {v1, v3}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    const-string p0, "decode_xml \u9700\u8981 APK \u5185\u8def\u5f84"

    .line 35
    .line 36
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    :try_start_0
    iget-object v3, p0, Lfb/j0;->p:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-interface {v3}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    check-cast v3, La7/c;

    .line 51
    .line 52
    invoke-virtual {v3, v1}, La7/c;->m(Ljava/lang/String;)Lm7/f;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Lm7/i;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-virtual {p1, v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    invoke-static {v5, v4, v6}, Lr9/e0;->r(III)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    const-string v6, "max_chars"

    .line 77
    .line 78
    const/16 v7, 0x5dc0

    .line 79
    .line 80
    invoke-virtual {p1, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const/16 v6, 0x3e8

    .line 85
    .line 86
    const v7, 0xbb80

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v6, v7}, Lr9/e0;->r(III)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    add-int/2addr p1, v5

    .line 94
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-le p1, v6, :cond_1

    .line 99
    .line 100
    move p1, v6

    .line 101
    :cond_1
    new-instance v6, Lorg/json/JSONObject;

    .line 102
    .line 103
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    const-string v2, "sourcePath"

    .line 110
    .line 111
    iget-object p0, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v6, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    const-string p0, "sourceEntry"

    .line 117
    .line 118
    invoke-virtual {v6, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-string p0, "returnedLength"

    .line 125
    .line 126
    sub-int v0, p1, v5

    .line 127
    .line 128
    invoke-virtual {v6, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    const-string p0, "totalLength"

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-virtual {v6, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    const-string p0, "truncated"

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-ge p1, v0, :cond_2

    .line 147
    .line 148
    const/4 v4, 0x1

    .line 149
    :cond_2
    invoke-virtual {v6, p0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-ge p1, p0, :cond_3

    .line 157
    .line 158
    const-string p0, "nextOffset"

    .line 159
    .line 160
    invoke-virtual {v6, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :catchall_0
    move-exception p0

    .line 165
    goto :goto_1

    .line 166
    :cond_3
    :goto_0
    const-string p0, "xml"

    .line 167
    .line 168
    invoke-virtual {v3, v5, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v6, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    goto :goto_2

    .line 180
    :goto_1
    new-instance p1, Lsf/f;

    .line 181
    .line 182
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    move-object p0, p1

    .line 186
    :goto_2
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-nez p1, :cond_4

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-eqz p0, :cond_5

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v0, "\u65e0\u6cd5\u89e3\u7801 XML "

    .line 211
    .line 212
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v0, ": "

    .line 219
    .line 220
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    :goto_4
    check-cast p0, Ljava/lang/String;

    .line 235
    .line 236
    return-object p0
.end method

.method public static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "error"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    const-string p0, "ok"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static m(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "class_name"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "descriptor"

    .line 10
    .line 11
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const-string p0, "export_class_java \u9700\u8981 descriptor \u6216 class_name"

    .line 33
    .line 34
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    iget-object p0, p0, Lfb/j0;->o:Lfb/d0;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lfb/d0;->b:Lfb/l1;

    .line 45
    .line 46
    invoke-virtual {v1, v0, p2}, Lfb/l1;->g(Ljava/lang/String;Lfb/b;)Lfb/j1;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Le9/h;

    .line 51
    .line 52
    const/16 v2, 0x1c

    .line 53
    .line 54
    invoke-direct {v1, v2}, Le9/h;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p2, v1}, Lfb/d0;->b(Lfb/j1;Lfb/b;Lfg/l;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iget-object v1, v0, Lfb/j1;->a:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v0, v0, Lfb/j1;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p0, v1, v0, p2, p1}, Lfb/d0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public static n(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "class_name"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "descriptor"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const-string v0, "export_class_smali \u9700\u8981 descriptor \u6216 class_name"

    .line 35
    .line 36
    invoke-static {v0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_0
    move-object/from16 v2, p0

    .line 42
    .line 43
    iget-object v2, v2, Lfb/j0;->n:Lfb/l1;

    .line 44
    .line 45
    invoke-static {v0}, Lfb/n0;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lfb/l1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    move-object/from16 v3, p2

    .line 57
    .line 58
    invoke-virtual {v2, v1, v3}, Lfb/l1;->e(Ljava/lang/String;Lfb/b;)Lfb/i1;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_20

    .line 63
    .line 64
    iget-object v4, v3, Lfb/i1;->b:Lk5/u;

    .line 65
    .line 66
    iget-object v6, v3, Lfb/i1;->c:Lk5/o;

    .line 67
    .line 68
    iget-object v8, v6, Lk5/o;->l:Lk5/n;

    .line 69
    .line 70
    iget v5, v6, Lk5/o;->k:I

    .line 71
    .line 72
    iget-object v13, v6, Lk5/o;->j:Lk5/u;

    .line 73
    .line 74
    new-instance v14, Ljava/io/StringWriter;

    .line 75
    .line 76
    invoke-direct {v14}, Ljava/io/StringWriter;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v15, Le5/a;

    .line 80
    .line 81
    invoke-virtual {v6}, Lk5/o;->getType()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-direct {v15, v14, v7}, Le5/a;-><init>(Ljava/io/Writer;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v7, Lb5/c;

    .line 89
    .line 90
    invoke-static {v4}, Lfb/l1;->h(Lk5/u;)La5/a;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-direct {v7, v4, v6}, Lb5/c;-><init>(La5/a;Lk5/o;)V

    .line 95
    .line 96
    .line 97
    iget-object v4, v7, Lb5/c;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v4, La2/a;

    .line 100
    .line 101
    const-string v9, ".class "

    .line 102
    .line 103
    invoke-virtual {v15, v9}, Lq5/a;->write(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v9, v13, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 107
    .line 108
    add-int/lit8 v10, v5, 0x4

    .line 109
    .line 110
    invoke-virtual {v9, v10}, Landroidx/lifecycle/x;->N(I)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    sget-object v10, Lf5/a;->n:[Lf5/a;

    .line 115
    .line 116
    array-length v11, v10

    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    move/from16 p0, v5

    .line 120
    .line 121
    move/from16 v5, v16

    .line 122
    .line 123
    move v12, v5

    .line 124
    :goto_0
    if-ge v12, v11, :cond_2

    .line 125
    .line 126
    move-object/from16 p1, v7

    .line 127
    .line 128
    aget-object v7, v10, v12

    .line 129
    .line 130
    move/from16 p2, v9

    .line 131
    .line 132
    iget-boolean v9, v7, Lf5/a;->i:Z

    .line 133
    .line 134
    if-eqz v9, :cond_1

    .line 135
    .line 136
    iget v7, v7, Lf5/a;->g:I

    .line 137
    .line 138
    and-int v7, p2, v7

    .line 139
    .line 140
    if-eqz v7, :cond_1

    .line 141
    .line 142
    add-int/lit8 v5, v5, 0x1

    .line 143
    .line 144
    :cond_1
    add-int/lit8 v12, v12, 0x1

    .line 145
    .line 146
    move-object/from16 v7, p1

    .line 147
    .line 148
    move/from16 v9, p2

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_2
    move-object/from16 p1, v7

    .line 152
    .line 153
    move/from16 p2, v9

    .line 154
    .line 155
    new-array v7, v5, [Lf5/a;

    .line 156
    .line 157
    array-length v9, v10

    .line 158
    move/from16 v11, v16

    .line 159
    .line 160
    move v12, v11

    .line 161
    :goto_1
    if-ge v11, v9, :cond_4

    .line 162
    .line 163
    move-object/from16 v17, v7

    .line 164
    .line 165
    aget-object v7, v10, v11

    .line 166
    .line 167
    move/from16 v18, v9

    .line 168
    .line 169
    iget-boolean v9, v7, Lf5/a;->i:Z

    .line 170
    .line 171
    if-eqz v9, :cond_3

    .line 172
    .line 173
    iget v9, v7, Lf5/a;->g:I

    .line 174
    .line 175
    and-int v9, p2, v9

    .line 176
    .line 177
    if-eqz v9, :cond_3

    .line 178
    .line 179
    add-int/lit8 v9, v12, 0x1

    .line 180
    .line 181
    aput-object v7, v17, v12

    .line 182
    .line 183
    move v12, v9

    .line 184
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 185
    .line 186
    move-object/from16 v7, v17

    .line 187
    .line 188
    move/from16 v9, v18

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_4
    move-object/from16 v17, v7

    .line 192
    .line 193
    move/from16 v7, v16

    .line 194
    .line 195
    :goto_2
    if-ge v7, v5, :cond_5

    .line 196
    .line 197
    aget-object v9, v17, v7

    .line 198
    .line 199
    iget-object v9, v9, Lf5/a;->h:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v15, v9}, Lq5/a;->write(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const/16 v9, 0x20

    .line 205
    .line 206
    invoke-virtual {v15, v9}, Lq5/a;->write(I)V

    .line 207
    .line 208
    .line 209
    add-int/lit8 v7, v7, 0x1

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_5
    invoke-virtual {v6}, Lk5/o;->getType()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v15, v5}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 217
    .line 218
    .line 219
    const/16 v5, 0xa

    .line 220
    .line 221
    invoke-virtual {v15, v5}, Lq5/a;->write(I)V

    .line 222
    .line 223
    .line 224
    iget-object v7, v13, Lk5/u;->s:Lk5/s;

    .line 225
    .line 226
    iget-object v9, v13, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 227
    .line 228
    add-int/lit8 v10, p0, 0x8

    .line 229
    .line 230
    invoke-virtual {v9, v10}, Landroidx/lifecycle/x;->L(I)I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    invoke-virtual {v7, v10}, Lk5/s;->d(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    if-eqz v7, :cond_6

    .line 239
    .line 240
    const-string v10, ".super "

    .line 241
    .line 242
    invoke-virtual {v15, v10}, Lq5/a;->write(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v15, v7}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v15, v5}, Lq5/a;->write(I)V

    .line 249
    .line 250
    .line 251
    :cond_6
    iget-object v7, v13, Lk5/u;->r:Lk5/s;

    .line 252
    .line 253
    add-int/lit8 v10, p0, 0x10

    .line 254
    .line 255
    invoke-virtual {v9, v10}, Landroidx/lifecycle/x;->L(I)I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    invoke-virtual {v7, v10}, Lk5/s;->d(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    if-eqz v7, :cond_7

    .line 264
    .line 265
    const-string v10, ".source "

    .line 266
    .line 267
    invoke-virtual {v15, v10}, Lq5/a;->write(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v15, v7}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    const-string v7, "\n"

    .line 274
    .line 275
    invoke-virtual {v15, v7}, Lq5/a;->write(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_7
    add-int/lit8 v7, p0, 0xc

    .line 279
    .line 280
    invoke-virtual {v9, v7}, Landroidx/lifecycle/x;->N(I)I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-lez v7, :cond_8

    .line 285
    .line 286
    iget-object v9, v13, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 287
    .line 288
    invoke-virtual {v9, v7}, Landroidx/lifecycle/x;->N(I)I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    new-instance v10, Lk5/e;

    .line 293
    .line 294
    invoke-direct {v10, v6, v7, v9}, Lk5/e;-><init>(Lk5/o;II)V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_8
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 299
    .line 300
    :goto_3
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    if-eqz v7, :cond_9

    .line 305
    .line 306
    invoke-virtual {v15, v5}, Lq5/a;->write(I)V

    .line 307
    .line 308
    .line 309
    const-string v7, "# interfaces\n"

    .line 310
    .line 311
    invoke-virtual {v15, v7}, Lq5/a;->write(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    if-eqz v9, :cond_9

    .line 323
    .line 324
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    check-cast v9, Ljava/lang/String;

    .line 329
    .line 330
    const-string v10, ".implements "

    .line 331
    .line 332
    invoke-virtual {v15, v10}, Lq5/a;->write(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v15, v9}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v15, v5}, Lq5/a;->write(I)V

    .line 339
    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_9
    invoke-virtual {v6}, Lk5/o;->e1()Lo5/e;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    invoke-virtual {v7}, Lo5/e;->b()Ljava/util/Set;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 351
    .line 352
    .line 353
    move-result v9

    .line 354
    const-string v10, "\n\n"

    .line 355
    .line 356
    if-eqz v9, :cond_a

    .line 357
    .line 358
    invoke-virtual {v15, v10}, Lq5/a;->write(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const-string v9, "# annotations\n"

    .line 362
    .line 363
    invoke-virtual {v15, v9}, Lq5/a;->write(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    check-cast v7, Ljava/util/Set;

    .line 367
    .line 368
    invoke-static {v15, v7}, Lac/p;->Q(Le5/a;Ljava/util/Set;)V

    .line 369
    .line 370
    .line 371
    :cond_a
    new-instance v7, Ljava/util/HashSet;

    .line 372
    .line 373
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 374
    .line 375
    .line 376
    iget v9, v6, Lk5/o;->q:I

    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    if-lez v9, :cond_c

    .line 381
    .line 382
    iget-object v9, v13, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 383
    .line 384
    iget v11, v6, Lk5/o;->m:I

    .line 385
    .line 386
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v6}, Lk5/o;->e1()Lo5/e;

    .line 390
    .line 391
    .line 392
    move-result-object v18

    .line 393
    iget-object v9, v13, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 394
    .line 395
    add-int/lit8 v12, p0, 0x1c

    .line 396
    .line 397
    invoke-virtual {v9, v12}, Landroidx/lifecycle/x;->N(I)I

    .line 398
    .line 399
    .line 400
    move-result v19

    .line 401
    if-nez v8, :cond_b

    .line 402
    .line 403
    move-object v12, v7

    .line 404
    move-object/from16 v7, p1

    .line 405
    .line 406
    move-object/from16 p1, v14

    .line 407
    .line 408
    move-object v14, v12

    .line 409
    move-object/from16 v20, v0

    .line 410
    .line 411
    move-object v0, v10

    .line 412
    move/from16 v21, v11

    .line 413
    .line 414
    move-object/from16 v10, v17

    .line 415
    .line 416
    :goto_5
    move-object v12, v8

    .line 417
    goto :goto_6

    .line 418
    :cond_b
    move-object v9, v7

    .line 419
    new-instance v7, Lk5/l;

    .line 420
    .line 421
    iget-object v12, v8, Lk5/n;->l:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v12, Lk5/o;

    .line 424
    .line 425
    iget-object v5, v12, Lk5/o;->j:Lk5/u;

    .line 426
    .line 427
    iget-object v5, v5, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 428
    .line 429
    move-object/from16 v20, v10

    .line 430
    .line 431
    iget v10, v8, Lk5/n;->h:I

    .line 432
    .line 433
    iget v12, v12, Lk5/o;->q:I

    .line 434
    .line 435
    move/from16 v21, v11

    .line 436
    .line 437
    move v11, v12

    .line 438
    const/4 v12, 0x0

    .line 439
    move-object/from16 v23, v5

    .line 440
    .line 441
    move-object/from16 v5, p1

    .line 442
    .line 443
    move-object/from16 p1, v14

    .line 444
    .line 445
    move-object v14, v9

    .line 446
    move-object/from16 v9, v23

    .line 447
    .line 448
    move-object/from16 v23, v20

    .line 449
    .line 450
    move-object/from16 v20, v0

    .line 451
    .line 452
    move-object/from16 v0, v23

    .line 453
    .line 454
    invoke-direct/range {v7 .. v12}, Lk5/l;-><init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V

    .line 455
    .line 456
    .line 457
    move-object v10, v7

    .line 458
    move-object v7, v5

    .line 459
    goto :goto_5

    .line 460
    :goto_6
    new-instance v5, Lk5/g;

    .line 461
    .line 462
    move-object/from16 v22, v1

    .line 463
    .line 464
    move-object v1, v7

    .line 465
    move/from16 v11, v16

    .line 466
    .line 467
    move-object/from16 v7, v18

    .line 468
    .line 469
    move/from16 v8, v19

    .line 470
    .line 471
    move/from16 v9, v21

    .line 472
    .line 473
    move-object/from16 v16, v2

    .line 474
    .line 475
    const/16 v2, 0xa

    .line 476
    .line 477
    invoke-direct/range {v5 .. v11}, Lk5/g;-><init>(Lk5/o;Lo5/e;IILk5/l;Z)V

    .line 478
    .line 479
    .line 480
    move-object v7, v6

    .line 481
    move v6, v11

    .line 482
    goto :goto_7

    .line 483
    :cond_c
    move-object/from16 v20, v0

    .line 484
    .line 485
    move-object/from16 v22, v1

    .line 486
    .line 487
    move-object v12, v8

    .line 488
    move-object v0, v10

    .line 489
    move-object/from16 v1, p1

    .line 490
    .line 491
    move-object/from16 p1, v14

    .line 492
    .line 493
    move-object v14, v7

    .line 494
    move-object v7, v6

    .line 495
    move/from16 v6, v16

    .line 496
    .line 497
    move-object/from16 v16, v2

    .line 498
    .line 499
    move v2, v5

    .line 500
    iget v5, v7, Lk5/o;->m:I

    .line 501
    .line 502
    iput v5, v7, Lk5/o;->n:I

    .line 503
    .line 504
    sget-object v5, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 505
    .line 506
    :goto_7
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    move v8, v6

    .line 511
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 512
    .line 513
    .line 514
    move-result v9

    .line 515
    const-string v10, "Ignoring duplicate field: "

    .line 516
    .line 517
    const-string v11, "# duplicate field ignored\n"

    .line 518
    .line 519
    const-string v2, "->"

    .line 520
    .line 521
    const/16 v18, 0x1

    .line 522
    .line 523
    if-eqz v9, :cond_f

    .line 524
    .line 525
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v9

    .line 529
    check-cast v9, Lk5/w;

    .line 530
    .line 531
    if-nez v8, :cond_d

    .line 532
    .line 533
    invoke-virtual {v15, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    const-string v8, "# static fields"

    .line 537
    .line 538
    invoke-virtual {v15, v8}, Lq5/a;->write(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    move/from16 v8, v18

    .line 542
    .line 543
    :cond_d
    const/16 v6, 0xa

    .line 544
    .line 545
    invoke-virtual {v15, v6}, Lq5/a;->write(I)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v4, v9}, La2/a;->h(Li5/a;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    invoke-virtual {v14, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v18

    .line 556
    if-nez v18, :cond_e

    .line 557
    .line 558
    invoke-virtual {v15, v11}, Lq5/a;->write(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v1, v15}, Lb5/c;->q(Le5/a;)Le5/a;

    .line 562
    .line 563
    .line 564
    move-result-object v11

    .line 565
    move-object/from16 v19, v5

    .line 566
    .line 567
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 568
    .line 569
    move/from16 v18, v8

    .line 570
    .line 571
    invoke-virtual {v7}, Lk5/o;->getType()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v8

    .line 575
    move-object/from16 v21, v11

    .line 576
    .line 577
    new-instance v11, Ljava/lang/StringBuilder;

    .line 578
    .line 579
    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    invoke-virtual {v5, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    move-object/from16 v11, v21

    .line 599
    .line 600
    const/4 v2, 0x0

    .line 601
    goto :goto_9

    .line 602
    :cond_e
    move-object/from16 v19, v5

    .line 603
    .line 604
    move/from16 v18, v8

    .line 605
    .line 606
    iget-object v2, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v2, Ljava/util/HashSet;

    .line 609
    .line 610
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v2

    .line 614
    move-object v11, v15

    .line 615
    :goto_9
    invoke-static {v11, v9, v2}, Lbe/h;->m0(Le5/a;Lk5/w;Z)V

    .line 616
    .line 617
    .line 618
    move/from16 v8, v18

    .line 619
    .line 620
    move-object/from16 v5, v19

    .line 621
    .line 622
    const/16 v2, 0xa

    .line 623
    .line 624
    const/4 v6, 0x0

    .line 625
    goto :goto_8

    .line 626
    :cond_f
    new-instance v5, Ljava/util/HashSet;

    .line 627
    .line 628
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 629
    .line 630
    .line 631
    iget v6, v7, Lk5/o;->r:I

    .line 632
    .line 633
    if-lez v6, :cond_11

    .line 634
    .line 635
    iget-object v6, v13, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 636
    .line 637
    invoke-virtual {v7}, Lk5/o;->h1()I

    .line 638
    .line 639
    .line 640
    move-result v13

    .line 641
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v7}, Lk5/o;->e1()Lo5/e;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    if-nez v12, :cond_10

    .line 649
    .line 650
    move-object/from16 v21, v7

    .line 651
    .line 652
    move-object/from16 v19, v10

    .line 653
    .line 654
    move-object v7, v11

    .line 655
    move-object/from16 v9, v17

    .line 656
    .line 657
    move-object/from16 v17, v5

    .line 658
    .line 659
    goto :goto_a

    .line 660
    :cond_10
    move-object v8, v7

    .line 661
    new-instance v7, Lk5/l;

    .line 662
    .line 663
    iget-object v9, v12, Lk5/n;->l:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v9, Lk5/o;

    .line 666
    .line 667
    move-object/from16 v17, v5

    .line 668
    .line 669
    iget-object v5, v9, Lk5/o;->j:Lk5/u;

    .line 670
    .line 671
    iget-object v5, v5, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 672
    .line 673
    move-object/from16 v19, v10

    .line 674
    .line 675
    invoke-virtual {v12}, Lk5/n;->e()I

    .line 676
    .line 677
    .line 678
    move-result v10

    .line 679
    iget v9, v9, Lk5/o;->r:I

    .line 680
    .line 681
    move-object/from16 v21, v8

    .line 682
    .line 683
    move-object v8, v12

    .line 684
    const/4 v12, 0x1

    .line 685
    move/from16 v23, v9

    .line 686
    .line 687
    move-object v9, v5

    .line 688
    move-object v5, v11

    .line 689
    move/from16 v11, v23

    .line 690
    .line 691
    invoke-direct/range {v7 .. v12}, Lk5/l;-><init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V

    .line 692
    .line 693
    .line 694
    move-object v9, v7

    .line 695
    move-object v7, v5

    .line 696
    :goto_a
    new-instance v5, Lk5/i;

    .line 697
    .line 698
    const/4 v11, 0x0

    .line 699
    move-object/from16 p2, v3

    .line 700
    .line 701
    move-object v3, v7

    .line 702
    move v8, v13

    .line 703
    move-object/from16 v12, v17

    .line 704
    .line 705
    move-object/from16 v13, v19

    .line 706
    .line 707
    const/4 v10, 0x0

    .line 708
    move-object v7, v6

    .line 709
    move-object/from16 v6, v21

    .line 710
    .line 711
    invoke-direct/range {v5 .. v11}, Lk5/i;-><init>(Lk5/o;Lo5/e;ILo5/s;ZI)V

    .line 712
    .line 713
    .line 714
    move-object v7, v6

    .line 715
    move v6, v10

    .line 716
    goto :goto_b

    .line 717
    :cond_11
    move-object/from16 p2, v3

    .line 718
    .line 719
    move-object v12, v5

    .line 720
    move-object v13, v10

    .line 721
    move-object v3, v11

    .line 722
    const/4 v6, 0x0

    .line 723
    iget v5, v7, Lk5/o;->n:I

    .line 724
    .line 725
    if-lez v5, :cond_12

    .line 726
    .line 727
    iput v5, v7, Lk5/o;->o:I

    .line 728
    .line 729
    :cond_12
    sget-object v5, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 730
    .line 731
    :goto_b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    move v8, v6

    .line 736
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v9

    .line 740
    if-eqz v9, :cond_16

    .line 741
    .line 742
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v9

    .line 746
    check-cast v9, Lk5/w;

    .line 747
    .line 748
    if-nez v8, :cond_13

    .line 749
    .line 750
    invoke-virtual {v15, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    const-string v8, "# instance fields"

    .line 754
    .line 755
    invoke-virtual {v15, v8}, Lq5/a;->write(Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    move/from16 v8, v18

    .line 759
    .line 760
    :cond_13
    const/16 v10, 0xa

    .line 761
    .line 762
    invoke-virtual {v15, v10}, Lq5/a;->write(I)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v4, v9}, La2/a;->h(Li5/a;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v10

    .line 769
    invoke-virtual {v12, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v11

    .line 773
    if-nez v11, :cond_14

    .line 774
    .line 775
    invoke-virtual {v15, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1, v15}, Lb5/c;->q(Le5/a;)Le5/a;

    .line 779
    .line 780
    .line 781
    move-result-object v11

    .line 782
    sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 783
    .line 784
    move-object/from16 v19, v3

    .line 785
    .line 786
    invoke-virtual {v7}, Lk5/o;->getType()Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    move-object/from16 v21, v5

    .line 791
    .line 792
    new-instance v5, Ljava/lang/StringBuilder;

    .line 793
    .line 794
    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    invoke-virtual {v6, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    :goto_d
    const/4 v6, 0x0

    .line 814
    goto :goto_e

    .line 815
    :cond_14
    move-object/from16 v19, v3

    .line 816
    .line 817
    move-object/from16 v21, v5

    .line 818
    .line 819
    invoke-virtual {v14, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    if-eqz v3, :cond_15

    .line 824
    .line 825
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 826
    .line 827
    invoke-virtual {v7}, Lk5/o;->getType()Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v5

    .line 831
    new-instance v6, Ljava/lang/StringBuilder;

    .line 832
    .line 833
    const-string v11, "Duplicate static+instance field found: "

    .line 834
    .line 835
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v5

    .line 851
    invoke-virtual {v3, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 855
    .line 856
    const-string v5, "You will need to rename one of these fields, including all references."

    .line 857
    .line 858
    invoke-virtual {v3, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    const-string v3, "# There is both a static and instance field with this signature.\n# You will need to rename one of these fields, including all references.\n"

    .line 862
    .line 863
    invoke-virtual {v15, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    :cond_15
    move-object v11, v15

    .line 867
    goto :goto_d

    .line 868
    :goto_e
    invoke-static {v11, v9, v6}, Lbe/h;->m0(Le5/a;Lk5/w;Z)V

    .line 869
    .line 870
    .line 871
    move-object/from16 v3, v19

    .line 872
    .line 873
    move-object/from16 v5, v21

    .line 874
    .line 875
    goto/16 :goto_c

    .line 876
    .line 877
    :cond_16
    new-instance v3, Ljava/util/HashSet;

    .line 878
    .line 879
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v7, v6}, Lk5/o;->f1(Z)Ljava/lang/Iterable;

    .line 883
    .line 884
    .line 885
    move-result-object v5

    .line 886
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 887
    .line 888
    .line 889
    move-result-object v5

    .line 890
    const/4 v6, 0x0

    .line 891
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 892
    .line 893
    .line 894
    move-result v8

    .line 895
    const-string v9, "Unexpected IOException"

    .line 896
    .line 897
    const-string v10, "# duplicate method ignored\n"

    .line 898
    .line 899
    if-eqz v8, :cond_1a

    .line 900
    .line 901
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v8

    .line 905
    check-cast v8, Lk5/z;

    .line 906
    .line 907
    if-nez v6, :cond_17

    .line 908
    .line 909
    invoke-virtual {v15, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    const-string v6, "# direct methods"

    .line 913
    .line 914
    invoke-virtual {v15, v6}, Lq5/a;->write(Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    move/from16 v6, v18

    .line 918
    .line 919
    :cond_17
    const/16 v11, 0xa

    .line 920
    .line 921
    invoke-virtual {v15, v11}, Lq5/a;->write(I)V

    .line 922
    .line 923
    .line 924
    new-instance v11, Ljava/io/StringWriter;

    .line 925
    .line 926
    invoke-direct {v11}, Ljava/io/StringWriter;-><init>()V

    .line 927
    .line 928
    .line 929
    :try_start_0
    invoke-virtual {v4, v11}, La2/a;->j(Ljava/io/StringWriter;)Lq5/a;

    .line 930
    .line 931
    .line 932
    move-result-object v12

    .line 933
    invoke-virtual {v12, v8}, Lq5/a;->q(Li5/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 934
    .line 935
    .line 936
    invoke-virtual {v11}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v9

    .line 940
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    move-result v9

    .line 944
    if-nez v9, :cond_18

    .line 945
    .line 946
    invoke-virtual {v15, v10}, Lq5/a;->write(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v1, v15}, Lb5/c;->q(Le5/a;)Le5/a;

    .line 950
    .line 951
    .line 952
    move-result-object v9

    .line 953
    goto :goto_10

    .line 954
    :cond_18
    move-object v9, v15

    .line 955
    :goto_10
    invoke-virtual {v8}, Lk5/z;->i1()Lac/k;

    .line 956
    .line 957
    .line 958
    move-result-object v10

    .line 959
    if-nez v10, :cond_19

    .line 960
    .line 961
    invoke-static {v9, v8, v1}, Lb5/i;->k(Le5/a;Lk5/z;Lb5/c;)V

    .line 962
    .line 963
    .line 964
    goto :goto_f

    .line 965
    :cond_19
    new-instance v11, Lb5/i;

    .line 966
    .line 967
    invoke-direct {v11, v1, v8, v10}, Lb5/i;-><init>(Lb5/c;Lk5/z;Lac/k;)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v11, v9}, Lb5/i;->m(Le5/a;)V

    .line 971
    .line 972
    .line 973
    goto :goto_f

    .line 974
    :catch_0
    invoke-static {v9}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    const/4 v0, 0x0

    .line 978
    return-object v0

    .line 979
    :cond_1a
    new-instance v5, Ljava/util/HashSet;

    .line 980
    .line 981
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 982
    .line 983
    .line 984
    const/4 v6, 0x0

    .line 985
    invoke-virtual {v7, v6}, Lk5/o;->i1(Z)Ljava/lang/Iterable;

    .line 986
    .line 987
    .line 988
    move-result-object v8

    .line 989
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 990
    .line 991
    .line 992
    move-result-object v8

    .line 993
    :goto_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 994
    .line 995
    .line 996
    move-result v11

    .line 997
    if-eqz v11, :cond_1f

    .line 998
    .line 999
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v11

    .line 1003
    check-cast v11, Lk5/z;

    .line 1004
    .line 1005
    if-nez v6, :cond_1b

    .line 1006
    .line 1007
    invoke-virtual {v15, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    const-string v6, "# virtual methods"

    .line 1011
    .line 1012
    invoke-virtual {v15, v6}, Lq5/a;->write(Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    move/from16 v6, v18

    .line 1016
    .line 1017
    :cond_1b
    const/16 v12, 0xa

    .line 1018
    .line 1019
    invoke-virtual {v15, v12}, Lq5/a;->write(I)V

    .line 1020
    .line 1021
    .line 1022
    new-instance v13, Ljava/io/StringWriter;

    .line 1023
    .line 1024
    invoke-direct {v13}, Ljava/io/StringWriter;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    :try_start_1
    invoke-virtual {v4, v13}, La2/a;->j(Ljava/io/StringWriter;)Lq5/a;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v14

    .line 1031
    invoke-virtual {v14, v11}, Lq5/a;->q(Li5/b;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v13}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v13

    .line 1038
    invoke-virtual {v5, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v14

    .line 1042
    if-nez v14, :cond_1c

    .line 1043
    .line 1044
    invoke-virtual {v15, v10}, Lq5/a;->write(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v1, v15}, Lb5/c;->q(Le5/a;)Le5/a;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v13

    .line 1051
    move-object/from16 v17, v0

    .line 1052
    .line 1053
    move-object/from16 v19, v3

    .line 1054
    .line 1055
    goto :goto_13

    .line 1056
    :cond_1c
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v14

    .line 1060
    if-eqz v14, :cond_1d

    .line 1061
    .line 1062
    const-string v14, "# There is both a direct and virtual method with this signature.\n# You will need to rename one of these methods, including all references.\n"

    .line 1063
    .line 1064
    invoke-virtual {v15, v14}, Lq5/a;->write(Ljava/lang/String;)V

    .line 1065
    .line 1066
    .line 1067
    sget-object v14, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 1068
    .line 1069
    invoke-virtual {v7}, Lk5/o;->getType()Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v12

    .line 1073
    move-object/from16 v17, v0

    .line 1074
    .line 1075
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    move-object/from16 v19, v3

    .line 1078
    .line 1079
    const-string v3, "Duplicate direct+virtual method found: "

    .line 1080
    .line 1081
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    invoke-virtual {v14, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 1101
    .line 1102
    const-string v3, "You will need to rename one of these methods, including all references."

    .line 1103
    .line 1104
    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1105
    .line 1106
    .line 1107
    goto :goto_12

    .line 1108
    :cond_1d
    move-object/from16 v17, v0

    .line 1109
    .line 1110
    move-object/from16 v19, v3

    .line 1111
    .line 1112
    :goto_12
    move-object v13, v15

    .line 1113
    :goto_13
    invoke-virtual {v11}, Lk5/z;->i1()Lac/k;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    if-nez v0, :cond_1e

    .line 1118
    .line 1119
    invoke-static {v13, v11, v1}, Lb5/i;->k(Le5/a;Lk5/z;Lb5/c;)V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_14

    .line 1123
    :cond_1e
    new-instance v3, Lb5/i;

    .line 1124
    .line 1125
    invoke-direct {v3, v1, v11, v0}, Lb5/i;-><init>(Lb5/c;Lk5/z;Lac/k;)V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v3, v13}, Lb5/i;->m(Le5/a;)V

    .line 1129
    .line 1130
    .line 1131
    :goto_14
    move-object/from16 v0, v17

    .line 1132
    .line 1133
    move-object/from16 v3, v19

    .line 1134
    .line 1135
    goto/16 :goto_11

    .line 1136
    .line 1137
    :catch_1
    invoke-static {v9}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 1138
    .line 1139
    .line 1140
    const/4 v0, 0x0

    .line 1141
    return-object v0

    .line 1142
    :cond_1f
    invoke-virtual {v15}, Lq5/a;->flush()V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual/range {p1 .. p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1150
    .line 1151
    .line 1152
    move-object/from16 v1, p2

    .line 1153
    .line 1154
    iget-object v1, v1, Lfb/i1;->a:Ljava/lang/String;

    .line 1155
    .line 1156
    move-object/from16 v2, v16

    .line 1157
    .line 1158
    move-object/from16 v3, v20

    .line 1159
    .line 1160
    move-object/from16 v4, v22

    .line 1161
    .line 1162
    invoke-virtual {v2, v4, v1, v0, v3}, Lfb/l1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    return-object v0

    .line 1167
    :cond_20
    move-object v4, v1

    .line 1168
    const-string v0, "\u6ca1\u6709\u627e\u5230\u7c7b: "

    .line 1169
    .line 1170
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1175
    .line 1176
    .line 1177
    const/4 v0, 0x0

    .line 1178
    return-object v0
.end method

.method public static o(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "export_method_java \u9700\u8981\u5b8c\u6574 descriptor"

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {v2}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    iget-object p0, p0, Lfb/j0;->o:Lfb/d0;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const-string v3, "->"

    .line 29
    .line 30
    invoke-static {v0, v3, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lfb/d0;->b:Lfb/l1;

    .line 37
    .line 38
    invoke-static {v0, v3}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2, p2}, Lfb/l1;->g(Ljava/lang/String;Lfb/b;)Lfb/j1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v0, v3}, Log/m;->K0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v2, v1, Lfb/j1;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v2, v3, v0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Leb/g;

    .line 57
    .line 58
    const/16 v4, 0x9

    .line 59
    .line 60
    invoke-direct {v3, v4, v0, v2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, p2, v3}, Lfb/d0;->b(Lfb/j1;Lfb/b;Lfg/l;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iget-object v0, v1, Lfb/j1;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, v2, v0, p2, p1}, Lfb/d0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_1
    invoke-static {v2}, Lj8/o;->t(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public static p(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 10

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "export_method_smali \u9700\u8981\u5b8c\u6574 descriptor"

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {v2}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    iget-object p0, p0, Lfb/j0;->n:Lfb/l1;

    .line 23
    .line 24
    invoke-static {p1}, Lfb/n0;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const-string v3, "->"

    .line 33
    .line 34
    invoke-static {v0, v3, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_9

    .line 39
    .line 40
    invoke-static {v0, v3}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Lfb/l1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v0, v3}, Log/m;->K0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v1, v3, v0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v1, p2}, Lfb/l1;->e(Ljava/lang/String;Lfb/b;)Lfb/i1;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_8

    .line 61
    .line 62
    iget-object v2, p2, Lfb/i1;->c:Lk5/o;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-virtual {v2, v1}, Lk5/o;->f1(Z)Ljava/lang/Iterable;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v2, v1}, Lk5/o;->i1(Z)Ljava/lang/Iterable;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    const/4 v1, 0x0

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :goto_1
    move-object v6, v1

    .line 112
    check-cast v6, Lk5/z;

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v7, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    iget-object v8, v6, Lk5/z;->k:Lk5/o;

    .line 123
    .line 124
    invoke-virtual {v8}, Lk5/o;->getType()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Lk5/z;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const/16 v8, 0x28

    .line 142
    .line 143
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6}, Lk5/z;->j1()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-eqz v9, :cond_5

    .line 162
    .line 163
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    check-cast v9, Lo5/p;

    .line 168
    .line 169
    iget-object v9, v9, Lo5/p;->l:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    const/16 v8, 0x29

    .line 176
    .line 177
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6}, Lk5/z;->h1()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-virtual {v6, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-eqz v6, :cond_1

    .line 196
    .line 197
    :goto_3
    check-cast v1, Lk5/z;

    .line 198
    .line 199
    if-eqz v1, :cond_7

    .line 200
    .line 201
    iget-object v3, p2, Lfb/i1;->b:Lk5/u;

    .line 202
    .line 203
    new-instance v4, Ljava/io/StringWriter;

    .line 204
    .line 205
    invoke-direct {v4}, Ljava/io/StringWriter;-><init>()V

    .line 206
    .line 207
    .line 208
    new-instance v5, Le5/a;

    .line 209
    .line 210
    invoke-virtual {v2}, Lk5/o;->getType()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-direct {v5, v4, v6}, Le5/a;-><init>(Ljava/io/Writer;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    new-instance v6, Lb5/c;

    .line 218
    .line 219
    invoke-static {v3}, Lfb/l1;->h(Lk5/u;)La5/a;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-direct {v6, v3, v2}, Lb5/c;-><init>(La5/a;Lk5/o;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1}, Lk5/z;->i1()Lac/k;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    if-nez v2, :cond_6

    .line 231
    .line 232
    invoke-static {v5, v1, v6}, Lb5/i;->k(Le5/a;Lk5/z;Lb5/c;)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_6
    new-instance v3, Lb5/i;

    .line 237
    .line 238
    invoke-direct {v3, v6, v1, v2}, Lb5/i;-><init>(Lb5/c;Lk5/z;Lac/k;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3, v5}, Lb5/i;->m(Le5/a;)V

    .line 242
    .line 243
    .line 244
    :goto_4
    invoke-virtual {v5}, Lq5/a;->flush()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object p2, p2, Lfb/i1;->a:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {p0, v0, p2, v1, p1}, Lfb/l1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :cond_7
    const-string p0, "\u6ca1\u6709\u627e\u5230\u65b9\u6cd5: "

    .line 262
    .line 263
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    const/4 p0, 0x0

    .line 271
    return-object p0

    .line 272
    :cond_8
    const-string p0, "\u6ca1\u6709\u627e\u5230\u7c7b: "

    .line 273
    .line 274
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const/4 p0, 0x0

    .line 282
    return-object p0

    .line 283
    :cond_9
    invoke-static {v2}, Lj8/o;->t(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    const/4 p0, 0x0

    .line 287
    return-object p0
.end method

.method public static q(Lhh/l;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lhh/l;->p()Llh/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Llh/b;->g:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "className"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lhh/l;->p()Llh/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, Llh/b;->h:Ljava/lang/String;

    .line 25
    .line 26
    const-string v2, "fieldName"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    const-string v1, "descriptor"

    .line 32
    .line 33
    iget-object v2, p0, Lhh/l;->j:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lhh/l;->p()Llh/b;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-object p0, p0, Llh/b;->i:Ljava/lang/String;

    .line 43
    .line 44
    const-string v1, "type"

    .line 45
    .line 46
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static r(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    const-string v1, "contains_all_strings"

    .line 4
    .line 5
    invoke-static {v1, p1}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "contains_any_strings"

    .line 10
    .line 11
    invoke-static {v2, p1}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const-string p0, "\u81f3\u5c11\u63d0\u4f9b contains_all_strings \u6216 contains_any_strings"

    .line 28
    .line 29
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    new-instance v4, Lfh/a;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v1}, Lfh/a;->r0(Lfh/a;Ljava/util/Collection;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lch/c;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v4, v1, Lch/c;->h:Lfh/a;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lhh/i;

    .line 79
    .line 80
    invoke-virtual {v4}, Lhh/i;->p()Llh/a;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    iget-object v5, v5, Llh/a;->g:Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/lang/String;

    .line 105
    .line 106
    new-instance v4, Lfh/a;

    .line 107
    .line 108
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    filled-new-array {v2}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v4, v2}, Lfh/a;->q0([Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v2, Lch/c;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v4, v2, Lch/c;->h:Lfh/a;

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_2

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    check-cast v4, Lhh/i;

    .line 144
    .line 145
    invoke-virtual {v4}, Lhh/i;->p()Llh/a;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    iget-object v5, v5, Llh/a;->g:Ljava/lang/String;

    .line 150
    .line 151
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    check-cast v0, Ljava/lang/Iterable;

    .line 163
    .line 164
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sget-object v1, Lfb/n0;->h:Ljava/util/List;

    .line 169
    .line 170
    sget-object v2, Lfb/n0;->g:Ljava/util/List;

    .line 171
    .line 172
    sget-object v3, Lfb/n0;->f:Ljava/util/List;

    .line 173
    .line 174
    invoke-static {p1, v3, v1, v2}, Lfb/n0;->N(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    const-string v2, "offset"

    .line 179
    .line 180
    const/4 v3, 0x0

    .line 181
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-gez v2, :cond_4

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    move v3, v2

    .line 189
    :goto_2
    invoke-static {v3, v0}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-static {p1}, Lfb/n0;->B(Lorg/json/JSONObject;)I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-static {v3, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const-string v3, "sourceEntry"

    .line 202
    .line 203
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_6

    .line 208
    .line 209
    iget-object v4, p0, Lfb/j0;->n:Lfb/l1;

    .line 210
    .line 211
    new-instance v5, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_5

    .line 229
    .line 230
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    check-cast v7, Lhh/i;

    .line 235
    .line 236
    iget-object v7, v7, Lhh/i;->j:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_5
    invoke-virtual {v4, v5, p2}, Lfb/l1;->f(Ljava/util/List;Lfb/b;)Ljava/util/Map;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    goto :goto_4

    .line 247
    :cond_6
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 248
    .line 249
    :goto_4
    new-instance v4, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    if-eqz v5, :cond_9

    .line 267
    .line 268
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    check-cast v5, Lhh/i;

    .line 273
    .line 274
    new-instance v6, Lorg/json/JSONObject;

    .line 275
    .line 276
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5}, Lhh/i;->p()Llh/a;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    iget-object v8, v5, Lhh/i;->j:Ljava/lang/String;

    .line 284
    .line 285
    iget-object v7, v7, Llh/a;->g:Ljava/lang/String;

    .line 286
    .line 287
    const-string v9, "className"

    .line 288
    .line 289
    invoke-static {v6, v1, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    const-string v7, "descriptor"

    .line 293
    .line 294
    invoke-static {v6, v1, v7, v8}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iget-object v7, v5, Lhh/i;->h:Ljava/lang/String;

    .line 298
    .line 299
    if-eqz v7, :cond_7

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_7
    const-string v7, ""

    .line 303
    .line 304
    :goto_6
    const-string v9, "sourceFile"

    .line 305
    .line 306
    invoke-static {v6, v1, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    iget-object v7, v5, Lhh/i;->m:Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    const-string v9, "methodCount"

    .line 320
    .line 321
    invoke-static {v6, v1, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    iget-object v7, v5, Lhh/i;->n:Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    const-string v9, "fieldCount"

    .line 335
    .line 336
    invoke-static {v6, v1, v9, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    iget v5, v5, Lhh/i;->i:I

    .line 340
    .line 341
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    const-string v7, "modifiers"

    .line 346
    .line 347
    invoke-static {v6, v1, v7, v5}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    const-string v5, "sourcePath"

    .line 351
    .line 352
    iget-object v7, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 353
    .line 354
    invoke-static {v6, v1, v5, v7}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {p2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    check-cast v5, Ljava/lang/String;

    .line 362
    .line 363
    if-eqz v5, :cond_8

    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_8
    sget-object v5, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 367
    .line 368
    :goto_7
    invoke-static {v6, v1, v3, v5}, Lfb/n0;->P(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    invoke-static {v4, p0, p1}, Lfb/n0;->T(Ljava/util/ArrayList;ILorg/json/JSONObject;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    return-object p0
.end method

.method public static s(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    const-string v1, "descriptor"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-static {v1, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-string v4, "descriptor_contains"

    .line 16
    .line 17
    const-string v5, "->"

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-static {v1, v5, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lhh/o;

    .line 36
    .line 37
    .line 38
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    new-instance v1, Lsf/f;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :goto_0
    nop

    .line 48
    instance-of v1, v0, Lsf/f;

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move-object v6, v0

    .line 54
    :goto_1
    check-cast v6, Lhh/o;

    .line 55
    .line 56
    invoke-static {v6}, La/a;->A0(Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {p0, v0, p1, p2}, Lfb/n0;->G(Lfb/j0;Ljava/util/List;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_1
    const-string v3, "class_name_contains"

    .line 66
    .line 67
    invoke-static {v3, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v8, "method_name_contains"

    .line 72
    .line 73
    invoke-static {v8, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v4, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    invoke-static {v1, v5, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    :try_start_1
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lhh/o;

    .line 100
    .line 101
    .line 102
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    goto :goto_2

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    new-instance v1, Lsf/f;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v1

    .line 111
    :goto_2
    nop

    .line 112
    instance-of v1, v0, Lsf/f;

    .line 113
    .line 114
    if-eqz v1, :cond_2

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    move-object v6, v0

    .line 118
    :goto_3
    check-cast v6, Lhh/o;

    .line 119
    .line 120
    invoke-static {v6}, La/a;->A0(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {p0, v0, p1, p2}, Lfb/n0;->G(Lfb/j0;Ljava/util/List;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_3
    const-string p0, "\u81f3\u5c11\u63d0\u4f9b class_name_contains\u3001method_name_contains \u6216\u5b8c\u6574 descriptor"

    .line 130
    .line 131
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :cond_4
    new-instance v4, Lfh/k;

    .line 137
    .line 138
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    const/4 v6, 0x1

    .line 146
    if-nez v5, :cond_5

    .line 147
    .line 148
    invoke-virtual {v4, v6, v3}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-nez v3, :cond_6

    .line 156
    .line 157
    new-instance v3, Lgh/c;

    .line 158
    .line 159
    invoke-direct {v3, v2, v6}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 160
    .line 161
    .line 162
    iput-object v3, v4, Lfh/k;->g:Lgh/c;

    .line 163
    .line 164
    :cond_6
    new-instance v2, Lch/e;

    .line 165
    .line 166
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v4, v2, Lch/e;->h:Lfh/k;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v2, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_a

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    move-object v4, v3

    .line 195
    check-cast v4, Lhh/o;

    .line 196
    .line 197
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-nez v5, :cond_9

    .line 202
    .line 203
    iget-object v4, v4, Lhh/o;->j:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v4, v1, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_8

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_8
    move v4, v7

    .line 213
    goto :goto_6

    .line 214
    :cond_9
    :goto_5
    move v4, v6

    .line 215
    :goto_6
    if-eqz v4, :cond_7

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_a
    invoke-static {p0, v2, p1, p2}, Lfb/n0;->G(Lfb/j0;Ljava/util/List;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0
.end method

.method public static t(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "resource_id"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lfb/n0;->K(Ljava/lang/String;)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 19
    .line 20
    new-instance v2, Lch/e;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lfh/k;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    new-array v4, v4, [Ljava/lang/Number;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    aput-object v0, v4, v5

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Lfh/k;->s0([Ljava/lang/Number;)V

    .line 37
    .line 38
    .line 39
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p0, v0, p1, p2}, Lfb/n0;->G(Lfb/j0;Ljava/util/List;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_0
    const-string p0, "find_methods_using_resource \u9700\u8981\u6709\u6548\u7684 resource_id"

    .line 55
    .line 56
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static u(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    const-string v1, "contains_all_strings"

    .line 4
    .line 5
    invoke-static {v1, p1}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "contains_any_strings"

    .line 10
    .line 11
    invoke-static {v2, p1}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const-string p0, "\u81f3\u5c11\u63d0\u4f9b contains_all_strings \u6216 contains_any_strings"

    .line 28
    .line 29
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    new-instance v4, Lfh/k;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v1}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lch/e;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v4, v1, Lch/e;->h:Lfh/k;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lhh/o;

    .line 79
    .line 80
    iget-object v5, v4, Lhh/o;->j:Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Ljava/lang/String;

    .line 101
    .line 102
    new-instance v4, Lfh/k;

    .line 103
    .line 104
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    filled-new-array {v2}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v5, Ljava/util/ArrayList;

    .line 112
    .line 113
    const/4 v6, 0x1

    .line 114
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    aget-object v2, v2, v7

    .line 119
    .line 120
    new-instance v7, Lgh/c;

    .line 121
    .line 122
    invoke-direct {v7, v2, v6}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    new-instance v2, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 131
    .line 132
    .line 133
    iput-object v2, v4, Lfh/k;->k:Ljava/util/List;

    .line 134
    .line 135
    new-instance v2, Lch/e;

    .line 136
    .line 137
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object v4, v2, Lch/e;->h:Lfh/k;

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_2

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Lhh/o;

    .line 161
    .line 162
    iget-object v5, v4, Lhh/o;->j:Ljava/lang/String;

    .line 163
    .line 164
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    check-cast v0, Ljava/lang/Iterable;

    .line 176
    .line 177
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {p0, v0, p1, p2}, Lfb/n0;->G(Lfb/j0;Ljava/util/List;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0
.end method

.method public static v(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "value"

    .line 10
    .line 11
    invoke-static {v2, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_5

    .line 20
    .line 21
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    const-string v2, "contains"

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v2, v4

    .line 44
    :goto_0
    const-string v3, "ignore_case"

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-virtual {p1, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 54
    .line 55
    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v6, p0, Lfb/j0;->q:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-interface {v6}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v6, Ll7/l;

    .line 72
    .line 73
    new-instance v7, Ll7/d;

    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    invoke-virtual {v6, v8}, Ll7/l;->W(Ll7/f;)Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const/4 v8, 0x1

    .line 81
    invoke-direct {v7, v6, v8}, Ll7/d;-><init>(Ljava/util/Iterator;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v7}, Lng/m;->R(Ljava/util/Iterator;)Lng/j;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    new-instance v7, Lca/s;

    .line 89
    .line 90
    const/16 v8, 0x8

    .line 91
    .line 92
    invoke-direct {v7, v0, v8}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lng/i;

    .line 96
    .line 97
    invoke-direct {v0, v6, v4, v7}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 98
    .line 99
    .line 100
    new-instance v4, Lfb/h0;

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-direct {v4, v3, v2, v1, v6}, Lfb/h0;-><init>(ZZLjava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Ldg/j;

    .line 107
    .line 108
    sget-object v2, Lng/q;->n:Lng/q;

    .line 109
    .line 110
    invoke-direct {v1, v0, v4, v2}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Lfb/n0;->q:Ljava/util/List;

    .line 118
    .line 119
    sget-object v2, Lfb/n0;->o:Ljava/util/List;

    .line 120
    .line 121
    sget-object v3, Lfb/n0;->m:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {p1, v3, v1, v2}, Lfb/n0;->N(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Set;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-string v2, "offset"

    .line 128
    .line 129
    invoke-virtual {p1, v2, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-gez v2, :cond_3

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    move v5, v2

    .line 137
    :goto_1
    invoke-static {v5, v0}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static {p1}, Lfb/n0;->B(Lorg/json/JSONObject;)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    invoke-static {v3, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    new-instance v3, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_4

    .line 167
    .line 168
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, Lfb/k0;

    .line 173
    .line 174
    iget-object v5, v4, Lfb/k0;->a:Lt7/b;

    .line 175
    .line 176
    iget-object v4, v4, Lfb/k0;->b:Lfb/l0;

    .line 177
    .line 178
    invoke-static {p0, v5, v4, v1}, Lfb/n0;->S(Lfb/j0;Lt7/b;Lfb/l0;Ljava/util/Set;)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    invoke-static {v3, p0, p1}, Lfb/n0;->T(Ljava/util/ArrayList;ILorg/json/JSONObject;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :cond_5
    :goto_3
    const-string p0, "find_resource_values \u9700\u8981 type \u548c value"

    .line 196
    .line 197
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0
.end method

.method public static w(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lfb/j0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "resource_id"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lfb/n0;->K(Ljava/lang/String;)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v3, "type"

    .line 19
    .line 20
    invoke-static {v3, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "name"

    .line 25
    .line 26
    invoke-static {v4, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_7

    .line 32
    .line 33
    :try_start_0
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast p1, Ll7/l;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    :cond_0
    :goto_0
    move-object v3, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {p1, v2}, Ll7/l;->V(Ll7/f;)Lz7/f;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_2
    invoke-virtual {v1}, Lz7/f;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Lz7/f;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ll7/f;

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ll7/f;->W(I)Lt7/b;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-virtual {p1, v0}, Ll7/l;->a0(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    if-ne v1, v0, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    invoke-virtual {p1, v2}, Ll7/l;->V(Ll7/f;)Lz7/f;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :cond_5
    invoke-virtual {p1}, Lz7/f;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-virtual {p1}, Lz7/f;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ll7/f;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ll7/f;->W(I)Lt7/b;

    .line 99
    .line 100
    .line 101
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    new-instance v3, Lsf/f;

    .line 107
    .line 108
    invoke-direct {v3, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    instance-of p1, v3, Lsf/f;

    .line 112
    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    move-object v3, v2

    .line 116
    :cond_6
    check-cast v3, Lt7/b;

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_b

    .line 124
    .line 125
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-nez v1, :cond_b

    .line 130
    .line 131
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    check-cast v0, Ll7/l;

    .line 139
    .line 140
    new-instance v1, Ll7/d;

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Ll7/l;->W(Ll7/f;)Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const/4 v4, 0x1

    .line 147
    invoke-direct {v1, v0, v4}, Ll7/d;-><init>(Ljava/util/Iterator;I)V

    .line 148
    .line 149
    .line 150
    invoke-static {v1}, Lng/m;->R(Ljava/util/Iterator;)Lng/j;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lng/a;

    .line 155
    .line 156
    invoke-virtual {v0}, Lng/a;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_a

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    move-object v4, v1

    .line 171
    check-cast v4, Lt7/b;

    .line 172
    .line 173
    invoke-virtual {v4}, Lt7/b;->c()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-static {v5, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_9

    .line 182
    .line 183
    invoke-virtual {v4}, Lt7/b;->b()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-static {v4, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_9

    .line 192
    .line 193
    const/4 v4, 0x1

    .line 194
    goto :goto_2

    .line 195
    :cond_9
    const/4 v4, 0x0

    .line 196
    :goto_2
    if-eqz v4, :cond_8

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_a
    move-object v1, v2

    .line 200
    :goto_3
    move-object v3, v1

    .line 201
    check-cast v3, Lt7/b;

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_b
    move-object v3, v2

    .line 205
    :goto_4
    if-eqz v3, :cond_d

    .line 206
    .line 207
    sget-object p1, Lfb/n0;->o:Ljava/util/List;

    .line 208
    .line 209
    invoke-static {p1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-static {p0, v3, v2, p1}, Lfb/n0;->S(Lfb/j0;Lt7/b;Lfb/l0;Ljava/util/Set;)Lorg/json/JSONObject;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {v3}, Lfb/n0;->R(Lt7/b;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    new-instance v0, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_c

    .line 239
    .line 240
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, Lfb/l0;

    .line 245
    .line 246
    new-instance v2, Lorg/json/JSONObject;

    .line 247
    .line 248
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 249
    .line 250
    .line 251
    const-string v3, "value"

    .line 252
    .line 253
    iget-object v4, v1, Lfb/l0;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 256
    .line 257
    .line 258
    const-string v3, "qualifiers"

    .line 259
    .line 260
    iget-object v4, v1, Lfb/l0;->b:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 263
    .line 264
    .line 265
    const-string v3, "default"

    .line 266
    .line 267
    iget-boolean v1, v1, Lfb/l0;->c:Z

    .line 268
    .line 269
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_c
    new-instance p1, Lorg/json/JSONArray;

    .line 277
    .line 278
    invoke-direct {p1, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 279
    .line 280
    .line 281
    const-string v0, "values"

    .line 282
    .line 283
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    return-object p0

    .line 294
    :cond_d
    const-string p0, "\u6ca1\u6709\u627e\u5230\u8d44\u6e90\uff1b\u8bf7\u63d0\u4f9b resource_id\uff0c\u6216\u540c\u65f6\u63d0\u4f9b type \u548c name"

    .line 295
    .line 296
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    return-object p0
.end method

.method public static x(Lfb/j0;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "session_id"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lfb/n0;->d:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lfb/m0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p0, v0}, Lfb/n0;->d0(Lfb/j0;Lfb/m0;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, "\u6ca1\u6709\u627e\u5230\u76ee\u6807\u4f1a\u8bdd: "

    .line 34
    .line 35
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static y(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "class_name"

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v4, "descriptor"

    .line 14
    .line 15
    invoke-virtual {v2, v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const-string v0, "inspect_class \u9700\u8981 descriptor \u6216 class_name"

    .line 37
    .line 38
    invoke-static {v0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_0
    :try_start_0
    iget-object v0, v1, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 44
    .line 45
    invoke-virtual {v0, v5}, Lorg/luckypray/dexkit/DexKitBridge;->getClassData(Ljava/lang/String;)Lhh/i;

    .line 46
    .line 47
    .line 48
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    new-instance v6, Lsf/f;

    .line 52
    .line 53
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v6

    .line 57
    :goto_0
    nop

    .line 58
    instance-of v6, v0, Lsf/f;

    .line 59
    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    :cond_1
    move-object v6, v0

    .line 64
    check-cast v6, Lhh/i;

    .line 65
    .line 66
    if-eqz v6, :cond_16

    .line 67
    .line 68
    iget-object v5, v6, Lhh/i;->n:Ljava/util/ArrayList;

    .line 69
    .line 70
    iget-object v8, v6, Lhh/i;->m:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v0, v6, Lhh/i;->j:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v2}, Lfb/n0;->B(Lorg/json/JSONObject;)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    const-string v10, "include"

    .line 79
    .line 80
    invoke-static {v10, v2}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-static {v11}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    move-object v12, v11

    .line 89
    check-cast v12, Ljava/lang/Iterable;

    .line 90
    .line 91
    instance-of v13, v12, Ljava/util/Collection;

    .line 92
    .line 93
    if-eqz v13, :cond_2

    .line 94
    .line 95
    move-object v13, v12

    .line 96
    check-cast v13, Ljava/util/Collection;

    .line 97
    .line 98
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    if-eqz v13, :cond_2

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    if-eqz v13, :cond_4

    .line 114
    .line 115
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    check-cast v13, Ljava/lang/String;

    .line 120
    .line 121
    sget-object v14, Lfb/n0;->s:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {v14, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    if-eqz v13, :cond_3

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    const-string v0, "inspect_class include \u5305\u542b\u4e0d\u652f\u6301\u7684\u503c"

    .line 131
    .line 132
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    return-object v0

    .line 137
    :cond_4
    :goto_2
    check-cast v11, Ljava/util/Collection;

    .line 138
    .line 139
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    const-string v13, "methods"

    .line 144
    .line 145
    const-string v14, "fields"

    .line 146
    .line 147
    if-eqz v12, :cond_5

    .line 148
    .line 149
    filled-new-array {v14, v13}, [Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-static {v12}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    goto :goto_3

    .line 158
    :cond_5
    move-object v12, v11

    .line 159
    :goto_3
    check-cast v12, Ljava/util/Set;

    .line 160
    .line 161
    const/4 v15, 0x0

    .line 162
    const-string v7, "brief"

    .line 163
    .line 164
    invoke-virtual {v2, v7, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    iget-object v15, v1, Lfb/j0;->n:Lfb/l1;

    .line 169
    .line 170
    move-object/from16 v16, v3

    .line 171
    .line 172
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    move-object/from16 v17, v5

    .line 177
    .line 178
    move-object/from16 v5, p2

    .line 179
    .line 180
    invoke-virtual {v15, v3, v5}, Lfb/l1;->f(Ljava/util/List;Lfb/b;)Ljava/util/Map;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    check-cast v3, Ljava/lang/String;

    .line 189
    .line 190
    new-instance v5, Lorg/json/JSONObject;

    .line 191
    .line 192
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6}, Lhh/i;->p()Llh/a;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    iget-object v15, v15, Llh/a;->g:Ljava/lang/String;

    .line 200
    .line 201
    move-object/from16 p1, v3

    .line 202
    .line 203
    const-string v3, "className"

    .line 204
    .line 205
    invoke-virtual {v5, v3, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    iget-object v0, v6, Lhh/i;->h:Ljava/lang/String;

    .line 212
    .line 213
    if-eqz v0, :cond_6

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_6
    move-object/from16 v0, v16

    .line 217
    .line 218
    :goto_4
    const-string v3, "sourceFile"

    .line 219
    .line 220
    invoke-virtual {v5, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    .line 222
    .line 223
    const-string v0, "methodCount"

    .line 224
    .line 225
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-virtual {v5, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 230
    .line 231
    .line 232
    const-string v0, "fieldCount"

    .line 233
    .line 234
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    invoke-virtual {v5, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 239
    .line 240
    .line 241
    const-string v0, "sourcePath"

    .line 242
    .line 243
    iget-object v1, v1, Lfb/j0;->i:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 246
    .line 247
    .line 248
    if-eqz p1, :cond_7

    .line 249
    .line 250
    move-object/from16 v3, p1

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_7
    sget-object v3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 254
    .line 255
    :goto_5
    const-string v0, "sourceEntry"

    .line 256
    .line 257
    invoke-virtual {v5, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 258
    .line 259
    .line 260
    new-instance v0, Lorg/json/JSONArray;

    .line 261
    .line 262
    invoke-direct {v0, v11}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 269
    .line 270
    .line 271
    :try_start_1
    iget-object v0, v6, Lhh/i;->p:Lsf/i;

    .line 272
    .line 273
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Lhh/i;

    .line 278
    .line 279
    if-eqz v0, :cond_8

    .line 280
    .line 281
    invoke-virtual {v0}, Lhh/i;->p()Llh/a;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    iget-object v7, v0, Llh/a;->g:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :catchall_1
    move-exception v0

    .line 289
    goto :goto_7

    .line 290
    :cond_8
    const/4 v7, 0x0

    .line 291
    :goto_6
    if-nez v7, :cond_9

    .line 292
    .line 293
    move-object/from16 v7, v16

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :goto_7
    new-instance v7, Lsf/f;

    .line 297
    .line 298
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    :cond_9
    :goto_8
    instance-of v0, v7, Lsf/f;

    .line 302
    .line 303
    if-eqz v0, :cond_a

    .line 304
    .line 305
    move-object/from16 v3, v16

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_a
    move-object v3, v7

    .line 309
    :goto_9
    const-string v0, "superClass"

    .line 310
    .line 311
    invoke-virtual {v5, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 312
    .line 313
    .line 314
    :try_start_2
    iget-object v0, v6, Lhh/i;->q:Lsf/i;

    .line 315
    .line 316
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    check-cast v0, Lhh/j;

    .line 321
    .line 322
    new-instance v1, Ljava/util/ArrayList;

    .line 323
    .line 324
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-eqz v3, :cond_b

    .line 340
    .line 341
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    check-cast v3, Lhh/i;

    .line 346
    .line 347
    invoke-virtual {v3}, Lhh/i;->p()Llh/a;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    iget-object v3, v3, Llh/a;->g:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 354
    .line 355
    .line 356
    goto :goto_a

    .line 357
    :catchall_2
    move-exception v0

    .line 358
    new-instance v1, Lsf/f;

    .line 359
    .line 360
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 361
    .line 362
    .line 363
    :cond_b
    instance-of v0, v1, Lsf/f;

    .line 364
    .line 365
    if-eqz v0, :cond_c

    .line 366
    .line 367
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 368
    .line 369
    :cond_c
    check-cast v1, Ljava/util/Collection;

    .line 370
    .line 371
    new-instance v0, Lorg/json/JSONArray;

    .line 372
    .line 373
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 374
    .line 375
    .line 376
    const-string v1, "interfaces"

    .line 377
    .line 378
    invoke-virtual {v5, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 379
    .line 380
    .line 381
    invoke-interface {v12, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_f

    .line 386
    .line 387
    if-eqz v2, :cond_d

    .line 388
    .line 389
    const-string v0, "fieldsCount"

    .line 390
    .line 391
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 396
    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_d
    iget-object v0, v6, Lhh/i;->s:Lsf/i;

    .line 400
    .line 401
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, Lhh/m;

    .line 406
    .line 407
    invoke-static {v9, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    new-instance v1, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 418
    .line 419
    .line 420
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    if-eqz v3, :cond_e

    .line 429
    .line 430
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    check-cast v3, Lhh/l;

    .line 435
    .line 436
    invoke-static {v3}, Lfb/n0;->q(Lhh/l;)Lorg/json/JSONObject;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_b

    .line 444
    :cond_e
    new-instance v0, Lorg/json/JSONArray;

    .line 445
    .line 446
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v5, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 450
    .line 451
    .line 452
    :cond_f
    :goto_c
    invoke-interface {v12, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-eqz v0, :cond_12

    .line 457
    .line 458
    if-eqz v2, :cond_10

    .line 459
    .line 460
    const-string v0, "methodsCount"

    .line 461
    .line 462
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 467
    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_10
    iget-object v0, v6, Lhh/i;->r:Lsf/i;

    .line 471
    .line 472
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    check-cast v0, Lhh/p;

    .line 477
    .line 478
    invoke-static {v9, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    new-instance v1, Ljava/util/ArrayList;

    .line 483
    .line 484
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-eqz v3, :cond_11

    .line 500
    .line 501
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    check-cast v3, Lhh/o;

    .line 506
    .line 507
    invoke-static {v3}, Lfb/n0;->H(Lhh/o;)Lorg/json/JSONObject;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_11
    new-instance v0, Lorg/json/JSONArray;

    .line 516
    .line 517
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v5, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 521
    .line 522
    .line 523
    :cond_12
    :goto_e
    const-string v0, "annotations"

    .line 524
    .line 525
    invoke-interface {v12, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-eqz v1, :cond_15

    .line 530
    .line 531
    iget-object v1, v6, Lhh/i;->t:Lsf/i;

    .line 532
    .line 533
    if-eqz v2, :cond_13

    .line 534
    .line 535
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    check-cast v0, Ljava/util/List;

    .line 540
    .line 541
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    const-string v1, "annotationsCount"

    .line 546
    .line 547
    invoke-virtual {v5, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 548
    .line 549
    .line 550
    goto :goto_10

    .line 551
    :cond_13
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    check-cast v1, Ljava/util/List;

    .line 556
    .line 557
    new-instance v2, Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 564
    .line 565
    .line 566
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-eqz v3, :cond_14

    .line 575
    .line 576
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    check-cast v3, Lhh/a;

    .line 581
    .line 582
    invoke-static {v3}, Lfb/n0;->b(Lhh/a;)Lorg/json/JSONObject;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    goto :goto_f

    .line 590
    :cond_14
    new-instance v1, Lorg/json/JSONArray;

    .line 591
    .line 592
    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 596
    .line 597
    .line 598
    :cond_15
    :goto_10
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    return-object v0

    .line 606
    :cond_16
    const-string v0, "\u6ca1\u6709\u627e\u5230\u7c7b: "

    .line 607
    .line 608
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-static {v0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    return-object v0
.end method

.method public static z(Lfb/j0;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p0, "inspect_method \u9700\u8981\u5b8c\u6574 descriptor"

    .line 16
    .line 17
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    :try_start_0
    iget-object v1, p0, Lfb/j0;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lhh/o;

    .line 25
    .line 26
    .line 27
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    new-instance v2, Lsf/f;

    .line 31
    .line 32
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v2

    .line 36
    :goto_0
    nop

    .line 37
    instance-of v2, v1, Lsf/f;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    :cond_1
    check-cast v1, Lhh/o;

    .line 43
    .line 44
    if-eqz v1, :cond_17

    .line 45
    .line 46
    iget-object v0, v1, Lhh/o;->r:Lsf/i;

    .line 47
    .line 48
    const-string v2, "include"

    .line 49
    .line 50
    invoke-static {v2, p1}, Lfb/n0;->b0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    move-object v4, v3

    .line 59
    check-cast v4, Ljava/lang/Iterable;

    .line 60
    .line 61
    instance-of v5, v4, Ljava/util/Collection;

    .line 62
    .line 63
    sget-object v6, Lfb/n0;->r:Ljava/util/List;

    .line 64
    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    move-object v5, v4

    .line 68
    check-cast v5, Ljava/util/Collection;

    .line 69
    .line 70
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Ljava/lang/String;

    .line 92
    .line 93
    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    const-string p0, "inspect_method include \u5305\u542b\u4e0d\u652f\u6301\u7684\u503c"

    .line 101
    .line 102
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x0

    .line 106
    return-object p0

    .line 107
    :cond_4
    :goto_2
    check-cast v3, Ljava/util/Collection;

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    invoke-static {v6}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    move-object v4, v3

    .line 121
    :goto_3
    check-cast v4, Ljava/util/Set;

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    const-string v6, "brief"

    .line 125
    .line 126
    invoke-virtual {p1, v6, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    iget-object v5, v1, Lhh/o;->j:Ljava/lang/String;

    .line 131
    .line 132
    const-string v7, "->"

    .line 133
    .line 134
    invoke-static {v5, v7}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iget-object v7, p0, Lfb/j0;->n:Lfb/l1;

    .line 139
    .line 140
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-virtual {v7, v8, p2}, Lfb/l1;->f(Ljava/util/List;Lfb/b;)Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p2, Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v1}, Lfb/n0;->H(Lhh/o;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    const-string v7, "sourcePath"

    .line 159
    .line 160
    iget-object p0, p0, Lfb/j0;->i:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v5, v7, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    if-eqz p2, :cond_6

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    sget-object p2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 169
    .line 170
    :goto_4
    const-string p0, "sourceEntry"

    .line 171
    .line 172
    invoke-virtual {v5, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    new-instance p0, Lorg/json/JSONArray;

    .line 176
    .line 177
    invoke-direct {p0, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v6, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    const-string p0, "strings"

    .line 187
    .line 188
    invoke-interface {v4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    const/16 p2, 0x64

    .line 193
    .line 194
    if-eqz p0, :cond_8

    .line 195
    .line 196
    if-eqz p1, :cond_7

    .line 197
    .line 198
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    const-string v0, "usingStringsCount"

    .line 209
    .line 210
    invoke-virtual {v5, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_7
    new-instance p0, Lorg/json/JSONArray;

    .line 215
    .line 216
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Ljava/util/List;

    .line 221
    .line 222
    invoke-static {p2, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-direct {p0, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 227
    .line 228
    .line 229
    const-string v0, "usingStrings"

    .line 230
    .line 231
    invoke-virtual {v5, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    .line 233
    .line 234
    :cond_8
    :goto_5
    const-string p0, "using-fields"

    .line 235
    .line 236
    invoke-interface {v4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    if-eqz p0, :cond_b

    .line 241
    .line 242
    iget-object p0, v1, Lhh/o;->s:Lsf/i;

    .line 243
    .line 244
    if-eqz p1, :cond_9

    .line 245
    .line 246
    invoke-virtual {p0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    check-cast p0, Ljava/util/List;

    .line 251
    .line 252
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    const-string v0, "usingFieldsCount"

    .line 257
    .line 258
    invoke-virtual {v5, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 259
    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_9
    invoke-virtual {p0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    check-cast p0, Ljava/util/List;

    .line 267
    .line 268
    invoke-static {p2, p0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    new-instance v0, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 279
    .line 280
    .line 281
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_a

    .line 290
    .line 291
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Lhh/q;

    .line 296
    .line 297
    iget-object v2, v2, Lhh/q;->a:Lhh/l;

    .line 298
    .line 299
    invoke-static {v2}, Lfb/n0;->q(Lhh/l;)Lorg/json/JSONObject;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_a
    new-instance p0, Lorg/json/JSONArray;

    .line 308
    .line 309
    invoke-direct {p0, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 310
    .line 311
    .line 312
    const-string v0, "usingFields"

    .line 313
    .line 314
    invoke-virtual {v5, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 315
    .line 316
    .line 317
    :cond_b
    :goto_7
    const-string p0, "invokes"

    .line 318
    .line 319
    invoke-interface {v4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-eqz v0, :cond_e

    .line 324
    .line 325
    if-eqz p1, :cond_c

    .line 326
    .line 327
    invoke-virtual {v1}, Lhh/o;->q()Lhh/p;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    const-string v0, "invokesCount"

    .line 336
    .line 337
    invoke-virtual {v5, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 338
    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_c
    invoke-virtual {v1}, Lhh/o;->q()Lhh/p;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {p2, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v2, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 356
    .line 357
    .line 358
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_d

    .line 367
    .line 368
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    check-cast v3, Lhh/o;

    .line 373
    .line 374
    invoke-static {v3}, Lfb/n0;->H(Lhh/o;)Lorg/json/JSONObject;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_d
    new-instance v0, Lorg/json/JSONArray;

    .line 383
    .line 384
    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v5, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 388
    .line 389
    .line 390
    :cond_e
    :goto_9
    const-string p0, "callers"

    .line 391
    .line 392
    invoke-interface {v4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_11

    .line 397
    .line 398
    iget-object v0, v1, Lhh/o;->p:Lsf/i;

    .line 399
    .line 400
    if-eqz p1, :cond_f

    .line 401
    .line 402
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    check-cast p0, Lhh/p;

    .line 407
    .line 408
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 409
    .line 410
    .line 411
    move-result p0

    .line 412
    const-string p2, "callersCount"

    .line 413
    .line 414
    invoke-virtual {v5, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 415
    .line 416
    .line 417
    goto :goto_b

    .line 418
    :cond_f
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    check-cast v0, Lhh/p;

    .line 423
    .line 424
    invoke-static {p2, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    new-instance v0, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 435
    .line 436
    .line 437
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object p2

    .line 441
    :goto_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    if-eqz v2, :cond_10

    .line 446
    .line 447
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    check-cast v2, Lhh/o;

    .line 452
    .line 453
    invoke-static {v2}, Lfb/n0;->H(Lhh/o;)Lorg/json/JSONObject;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    goto :goto_a

    .line 461
    :cond_10
    new-instance p2, Lorg/json/JSONArray;

    .line 462
    .line 463
    invoke-direct {p2, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v5, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 467
    .line 468
    .line 469
    :cond_11
    :goto_b
    const-string p0, "annotations"

    .line 470
    .line 471
    invoke-interface {v4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result p2

    .line 475
    if-eqz p2, :cond_14

    .line 476
    .line 477
    iget-object p2, v1, Lhh/o;->n:Lsf/i;

    .line 478
    .line 479
    if-eqz p1, :cond_12

    .line 480
    .line 481
    invoke-virtual {p2}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    check-cast p0, Ljava/util/List;

    .line 486
    .line 487
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 488
    .line 489
    .line 490
    move-result p0

    .line 491
    const-string p2, "annotationsCount"

    .line 492
    .line 493
    invoke-virtual {v5, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 494
    .line 495
    .line 496
    goto :goto_d

    .line 497
    :cond_12
    invoke-virtual {p2}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object p2

    .line 501
    check-cast p2, Ljava/util/List;

    .line 502
    .line 503
    new-instance v0, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 510
    .line 511
    .line 512
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 513
    .line 514
    .line 515
    move-result-object p2

    .line 516
    :goto_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_13

    .line 521
    .line 522
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    check-cast v2, Lhh/a;

    .line 527
    .line 528
    invoke-static {v2}, Lfb/n0;->b(Lhh/a;)Lorg/json/JSONObject;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_c

    .line 536
    :cond_13
    new-instance p2, Lorg/json/JSONArray;

    .line 537
    .line 538
    invoke-direct {p2, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 542
    .line 543
    .line 544
    :cond_14
    :goto_d
    const-string p0, "opcodes"

    .line 545
    .line 546
    invoke-interface {v4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result p0

    .line 550
    if-eqz p0, :cond_16

    .line 551
    .line 552
    if-eqz p1, :cond_15

    .line 553
    .line 554
    invoke-virtual {v1}, Lhh/o;->s()Ljava/util/ArrayList;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 559
    .line 560
    .line 561
    move-result p0

    .line 562
    const-string p1, "opCodesCount"

    .line 563
    .line 564
    invoke-virtual {v5, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 565
    .line 566
    .line 567
    goto :goto_e

    .line 568
    :cond_15
    new-instance p0, Lorg/json/JSONArray;

    .line 569
    .line 570
    invoke-virtual {v1}, Lhh/o;->s()Ljava/util/ArrayList;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    const/16 p2, 0x190

    .line 575
    .line 576
    invoke-static {p2, p1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object p1

    .line 580
    invoke-direct {p0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 581
    .line 582
    .line 583
    const-string p1, "opNames"

    .line 584
    .line 585
    invoke-virtual {v5, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 586
    .line 587
    .line 588
    :cond_16
    :goto_e
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    return-object p0

    .line 596
    :cond_17
    const-string p0, "\u6ca1\u6709\u627e\u5230\u65b9\u6cd5: "

    .line 597
    .line 598
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object p0

    .line 602
    invoke-static {p0}, Lfb/n0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    return-object p0
.end method
