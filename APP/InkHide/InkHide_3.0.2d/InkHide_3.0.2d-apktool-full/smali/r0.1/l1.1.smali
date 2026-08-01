.class public final Lr0/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final l:LU0/g;

.field public static final m:LU0/g;

.field public static final n:Ljava/util/List;

.field public static final o:Ljava/util/List;

.field public static final p:Lr0/j1;

.field public static final q:Lr0/j1;

.field public static final r:Lr0/j1;

.field public static final s:Lr0/j1;


# instance fields
.field public a:Z

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/Map;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/lang/ThreadLocal;

.field public final i:Ljava/util/Set;

.field public j:Landroid/content/Context;

.field public k:LA0/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    .line 1
    new-instance v0, LU0/g;

    .line 2
    .line 3
    const-string v1, "(?<![A-Za-z0-9_])([A-Za-z][A-Za-z0-9_\\-]{4,})(?![A-Za-z0-9_@\\-])"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr0/l1;->l:LU0/g;

    .line 9
    .line 10
    new-instance v0, LU0/g;

    .line 11
    .line 12
    const-string v1, "[A-Za-z][A-Za-z0-9_\\-]{4,}"

    .line 13
    .line 14
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lr0/l1;->m:LU0/g;

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-wide/16 v3, 0x78

    .line 26
    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-wide/16 v6, 0x168

    .line 32
    .line 33
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    const-wide/16 v9, 0x320

    .line 38
    .line 39
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    filled-new-array {v2, v5, v8, v11}, [Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sput-object v2, Lr0/l1;->n:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    new-instance v8, LE0/c;

    .line 60
    .line 61
    invoke-direct {v8, v2, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v8}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sput-object v2, Lr0/l1;->o:Ljava/util/List;

    .line 69
    .line 70
    new-instance v2, Lr0/j1;

    .line 71
    .line 72
    const-string v8, "xs1.s2"

    .line 73
    .line 74
    invoke-static {v8}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const-string v11, "xs1.c"

    .line 79
    .line 80
    invoke-static {v11}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    const-string v12, "trf"

    .line 85
    .line 86
    invoke-static {v12}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    const-string v14, "C7"

    .line 91
    .line 92
    invoke-static {v14}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v14

    .line 96
    invoke-direct {v2, v8, v11, v13, v14}, Lr0/j1;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    sput-object v2, Lr0/l1;->p:Lr0/j1;

    .line 100
    .line 101
    new-instance v2, Lr0/j1;

    .line 102
    .line 103
    const-string v8, "bu1.s2"

    .line 104
    .line 105
    invoke-static {v8}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    const-string v11, "bu1.c"

    .line 110
    .line 111
    invoke-static {v11}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    const-string v13, "tsy"

    .line 116
    .line 117
    invoke-static {v13}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    const-string v15, "I7"

    .line 122
    .line 123
    invoke-static {v15}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    invoke-direct {v2, v8, v11, v14, v15}, Lr0/j1;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    sput-object v2, Lr0/l1;->q:Lr0/j1;

    .line 131
    .line 132
    new-instance v16, Lr0/j1;

    .line 133
    .line 134
    const-string v2, "zu1.u2"

    .line 135
    .line 136
    invoke-static {v2}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 137
    .line 138
    .line 139
    move-result-object v17

    .line 140
    const-string v2, "zu1.c"

    .line 141
    .line 142
    invoke-static {v2}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object v18

    .line 146
    filled-new-array {v12, v13}, [Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-static {v2}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v19

    .line 154
    const-string v2, "N7"

    .line 155
    .line 156
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v20

    .line 160
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v21

    .line 164
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v22

    .line 168
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v23

    .line 172
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v24

    .line 176
    const-wide/16 v14, 0x5dc

    .line 177
    .line 178
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 179
    .line 180
    .line 181
    move-result-object v25

    .line 182
    const-wide/16 v27, 0xbb8

    .line 183
    .line 184
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object v26

    .line 188
    filled-new-array/range {v21 .. v26}, [Ljava/lang/Long;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v21

    .line 196
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    new-instance v8, LE0/c;

    .line 201
    .line 202
    invoke-direct {v8, v2, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    const-wide/16 v23, 0x50

    .line 206
    .line 207
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    new-instance v11, LE0/c;

    .line 212
    .line 213
    invoke-direct {v11, v2, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    const-wide/16 v25, 0xdc

    .line 217
    .line 218
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move-wide/from16 v29, v0

    .line 223
    .line 224
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 225
    .line 226
    new-instance v1, LE0/c;

    .line 227
    .line 228
    invoke-direct {v1, v2, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    filled-new-array {v8, v11, v1}, [LE0/c;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v22

    .line 239
    invoke-direct/range {v16 .. v22}, Lr0/j1;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 240
    .line 241
    .line 242
    sput-object v16, Lr0/l1;->r:Lr0/j1;

    .line 243
    .line 244
    new-instance v31, Lr0/j1;

    .line 245
    .line 246
    const-string v1, "cw1.u2"

    .line 247
    .line 248
    invoke-static {v1}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 249
    .line 250
    .line 251
    move-result-object v32

    .line 252
    const-string v1, "cw1.c"

    .line 253
    .line 254
    invoke-static {v1}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 255
    .line 256
    .line 257
    move-result-object v33

    .line 258
    filled-new-array {v12, v13}, [Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {v1}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 263
    .line 264
    .line 265
    move-result-object v34

    .line 266
    const-string v1, "m7"

    .line 267
    .line 268
    invoke-static {v1}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v35

    .line 272
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 273
    .line 274
    .line 275
    move-result-object v16

    .line 276
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 277
    .line 278
    .line 279
    move-result-object v17

    .line 280
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 281
    .line 282
    .line 283
    move-result-object v18

    .line 284
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 285
    .line 286
    .line 287
    move-result-object v19

    .line 288
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 289
    .line 290
    .line 291
    move-result-object v20

    .line 292
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 293
    .line 294
    .line 295
    move-result-object v21

    .line 296
    filled-new-array/range {v16 .. v21}, [Ljava/lang/Long;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v36

    .line 304
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    new-instance v2, LE0/c;

    .line 309
    .line 310
    invoke-direct {v2, v1, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    new-instance v3, LE0/c;

    .line 318
    .line 319
    invoke-direct {v3, v1, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    new-instance v4, LE0/c;

    .line 327
    .line 328
    invoke-direct {v4, v1, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    filled-new-array {v2, v3, v4}, [LE0/c;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v37

    .line 339
    invoke-direct/range {v31 .. v37}, Lr0/j1;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 340
    .line 341
    .line 342
    sput-object v31, Lr0/l1;->s:Lr0/j1;

    .line 343
    .line 344
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lr0/l1;->b:Ljava/util/Set;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lr0/l1;->c:Ljava/util/Set;

    .line 25
    .line 26
    new-instance v0, Ljava/util/WeakHashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lr0/l1;->d:Ljava/util/Set;

    .line 36
    .line 37
    new-instance v0, Ljava/util/WeakHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lr0/l1;->e:Ljava/util/Map;

    .line 47
    .line 48
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lr0/l1;->f:Ljava/util/Map;

    .line 58
    .line 59
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lr0/l1;->g:Ljava/util/Map;

    .line 69
    .line 70
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lr0/l1;->h:Ljava/lang/ThreadLocal;

    .line 76
    .line 77
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lr0/l1;->i:Ljava/util/Set;

    .line 87
    .line 88
    return-void
.end method

.method public static A(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "com.tencent.mm.ui.vas.VASCommonActivity"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "CleanChatting"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    :goto_0
    return v1
.end method

.method public static B(Landroid/widget/AbsListView;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lr0/l1;->k(Landroid/content/Context;)Landroid/app/Activity;

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
    return p0

    .line 13
    :cond_0
    invoke-static {p0}, Lr0/l1;->A(Landroid/app/Activity;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static C(Landroid/widget/AbsListView;)Z
    .locals 2

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->D()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lr0/l1;->k(Landroid/content/Context;)Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "com.tencent.mm.ui.vas.VASCommonActivity"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    :goto_0
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_2
    invoke-static {p0}, Lr0/l1;->z(Landroid/widget/AbsListView;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public static D(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-string v0, "@chatroom"

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "wxid_"

    .line 18
    .line 19
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "gh_"

    .line 26
    .line 27
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lr0/l1;->m:LU0/g;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, LU0/g;->d(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    :cond_1
    return v1

    .line 42
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public static H(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v2, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lr0/P;

    .line 23
    .line 24
    const/16 v3, 0x1c

    .line 25
    .line 26
    invoke-direct {v2, v3}, Lr0/P;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v3, 0x1e

    .line 30
    .line 31
    const-string v4, ","

    .line 32
    .line 33
    invoke-static {p0, v4, v2, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "#"

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, "("

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, ")"

    .line 62
    .line 63
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static J(Landroid/view/View;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    const/4 v2, -0x2

    .line 21
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    check-cast p0, Landroid/view/ViewGroup;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :goto_1
    if-ge v0, v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "getChildAt(...)"

    .line 45
    .line 46
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lr0/l1;->J(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    return-void
.end method

.method public static M(Landroid/app/Activity;Landroid/view/View;)Z
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Lr0/l1;->A(Landroid/app/Activity;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static final a(Lr0/l1;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "odf"

    .line 5
    .line 6
    invoke-static {p1, p0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    const-string p0, "cut"

    .line 13
    .line 14
    invoke-static {p1, p0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const-string p0, "mie"

    .line 21
    .line 22
    invoke-static {p1, p0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    const-string p0, "bxc"

    .line 29
    .line 30
    invoke-static {p1, p0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0
.end method

.method public static final b(Lr0/l1;Landroid/widget/AbsListView;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lr0/l1;->z(Landroid/widget/AbsListView;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    invoke-static {p1}, Lr0/l1;->C(Landroid/widget/AbsListView;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/widget/ListAdapter;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lr0/l1;->G(Landroid/widget/ListAdapter;)V

    .line 24
    .line 25
    .line 26
    if-ne p2, p1, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-ge v0, p2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0, v1}, Lr0/l1;->K(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    :goto_2
    return-void

    .line 49
    :cond_3
    invoke-virtual {p0, p2}, Lr0/l1;->K(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    invoke-virtual {p0, p2}, Lr0/l1;->K(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static final c(Lr0/l1;Landroid/app/Activity;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-static {p1, v0}, Lr0/l1;->M(Landroid/app/Activity;Landroid/view/View;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-wide/16 v2, 0x78

    .line 31
    .line 32
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-wide/16 v3, 0x168

    .line 37
    .line 38
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-wide/16 v4, 0x320

    .line 43
    .line 44
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-wide/16 v5, 0x5dc

    .line 49
    .line 50
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    new-instance v4, Lr0/g1;

    .line 83
    .line 84
    const/4 v5, 0x2

    .line 85
    invoke-direct {v4, p1, p0, v5}, Lr0/g1;-><init>(Landroid/app/Activity;Lr0/l1;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v4, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    :goto_1
    return-void
.end method

.method public static final d(Lr0/l1;Landroid/app/Activity;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lr0/l1;->A(Landroid/app/Activity;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {p1, v0}, Lr0/l1;->M(Landroid/app/Activity;Landroid/view/View;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const-wide/16 v1, 0x0

    .line 32
    .line 33
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-wide/16 v1, 0xc8

    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-wide/16 v1, 0x258

    .line 44
    .line 45
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const-wide/16 v1, 0x4b0

    .line 50
    .line 51
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const-wide/16 v1, 0x9c4

    .line 56
    .line 57
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const-wide/16 v1, 0x1388

    .line 62
    .line 63
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const-wide/16 v1, 0x1f40

    .line 68
    .line 69
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    filled-new-array/range {v3 .. v9}, [Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    new-instance v4, Lr0/g1;

    .line 102
    .line 103
    const/4 v5, 0x1

    .line 104
    invoke-direct {v4, p0, p1, v5}, Lr0/g1;-><init>(Lr0/l1;Landroid/app/Activity;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v4, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    :goto_1
    return-void
.end method

.method public static e(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
.end method

.method public static f(Landroid/view/View;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lr0/l1;->p(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-ge v1, v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "getChildAt(...)"

    .line 32
    .line 33
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, p1, p2}, Lr0/l1;->f(Landroid/view/View;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void
.end method

.method public static g(Landroid/view/View;Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lr0/l1;->p(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v2, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "getChildAt(...)"

    .line 31
    .line 32
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, p1}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v1
.end method

.method public static k(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/app/Activity;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static l(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v0, v1

    .line 53
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_2
    return-object v1

    .line 65
    :cond_3
    return-object v0
.end method

.method public static m(Landroid/widget/TextView;Landroid/view/View;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-eq v0, p1, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    int-to-float v1, v1

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    int-to-float v4, v4

    .line 38
    const v5, 0x3f19999a    # 0.6f

    .line 39
    .line 40
    .line 41
    mul-float/2addr v4, v5

    .line 42
    cmpl-float v1, v1, v4

    .line 43
    .line 44
    if-ltz v1, :cond_1

    .line 45
    .line 46
    const/16 v1, 0x50

    .line 47
    .line 48
    if-gt v1, v3, :cond_1

    .line 49
    .line 50
    const/16 v1, 0x105

    .line 51
    .line 52
    if-ge v3, v1, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    instance-of v1, v0, Landroid/view/View;

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    check-cast v0, Landroid/view/View;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    :goto_1
    return-object v0

    .line 67
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    instance-of v0, p1, Landroid/view/View;

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    move-object v2, p1

    .line 76
    check-cast v2, Landroid/view/View;

    .line 77
    .line 78
    :cond_4
    if-nez v2, :cond_5

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_5
    return-object v2
.end method

.method public static n(Landroid/view/View;LM0/l;)V
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1, p0}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "getChildAt(...)"

    .line 26
    .line 27
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, p1}, Lr0/l1;->n(Landroid/view/View;LM0/l;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public static o()Ljava/util/Set;
    .locals 5

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->s()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LF0/s;->a:LF0/s;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-class v0, Lq0/h;

    .line 13
    .line 14
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lq0/h;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 v2, 0x0

    .line 61
    :goto_2
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v3, v2

    .line 87
    check-cast v3, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    move-object v3, v2

    .line 119
    check-cast v3, Ljava/lang/String;

    .line 120
    .line 121
    sget-boolean v4, Lz0/i;->a:Z

    .line 122
    .line 123
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_6

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    invoke-static {v1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0
.end method

.method public static p(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    new-instance v0, LE0/d;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, v0

    .line 26
    :goto_0
    nop

    .line 27
    instance-of v0, p0, LE0/d;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v2, p0

    .line 33
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    return-object v2
.end method

.method public static z(Landroid/widget/AbsListView;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lr0/l1;->p(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "i3p"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "odf"

    .line 14
    .line 15
    invoke-static {p0, v0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, "cut"

    .line 22
    .line 23
    invoke-static {p0, v0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method


# virtual methods
.method public final E(Ljava/lang/Object;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, p1}, Lr0/l1;->y(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_b

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, Lr0/l1;->q()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v4}, LU0/i;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    move-object v5, v4

    .line 84
    check-cast v5, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_2

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-static {v2}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v1}, LU0/i;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    goto/16 :goto_4

    .line 111
    .line 112
    :cond_4
    invoke-static {p1}, Lr0/l1;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_5

    .line 121
    .line 122
    goto/16 :goto_4

    .line 123
    .line 124
    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_b

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Ljava/lang/Class;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const-string v2, "getDeclaredFields(...)"

    .line 145
    .line 146
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    array-length v2, v1

    .line 150
    const/4 v3, 0x0

    .line 151
    :goto_2
    if-ge v3, v2, :cond_6

    .line 152
    .line 153
    aget-object v4, v1, v3

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-nez v5, :cond_a

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    const-class v6, Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v5, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_a

    .line 176
    .line 177
    iget-object v5, p0, Lr0/l1;->k:LA0/Z;

    .line 178
    .line 179
    const/4 v6, 0x0

    .line 180
    if-eqz v5, :cond_7

    .line 181
    .line 182
    iget-object v5, v5, LA0/Z;->c:Ljava/util/List;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    move-object v5, v6

    .line 186
    :goto_3
    if-nez v5, :cond_8

    .line 187
    .line 188
    sget-object v5, LF0/s;->a:LF0/s;

    .line 189
    .line 190
    :cond_8
    const-string v7, "a"

    .line 191
    .line 192
    invoke-static {v5, v7}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-static {v5}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-static {v5}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_a

    .line 213
    .line 214
    iget-object p1, p0, Lr0/l1;->k:LA0/Z;

    .line 215
    .line 216
    if-nez p1, :cond_9

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_9
    iget-object v1, p1, LA0/Z;->b:Ljava/util/List;

    .line 220
    .line 221
    invoke-static {v1, v0}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    const/16 v1, 0x3d

    .line 234
    .line 235
    invoke-static {p1, v0, v6, v1}, LA0/Z;->a(LA0/Z;Ljava/util/List;Ljava/util/List;I)LA0/Z;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iput-object p1, p0, Lr0/l1;->k:LA0/Z;

    .line 240
    .line 241
    iget-object v0, p0, Lr0/l1;->e:Ljava/util/Map;

    .line 242
    .line 243
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Lr0/l1;->j:Landroid/content/Context;

    .line 247
    .line 248
    if-eqz v0, :cond_b

    .line 249
    .line 250
    invoke-static {v0, p1}, LA0/l;->y(Landroid/content/Context;LA0/Z;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_b
    :goto_4
    return-void
.end method

.method public final F(Landroid/app/Activity;Landroid/view/View;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lo0/a;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, p0, v0, p2, v2}, Lo0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v1}, Lr0/l1;->n(Landroid/view/View;LM0/l;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroid/view/View;

    .line 43
    .line 44
    invoke-static {v1}, Lr0/l1;->p(Landroid/view/View;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    move-object v2, v1

    .line 74
    check-cast v2, Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_2

    .line 81
    .line 82
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-static {p2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-static {p2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    const/4 v2, 0x0

    .line 115
    iget-object v3, p0, Lr0/l1;->i:Ljava/util/Set;

    .line 116
    .line 117
    if-eqz v1, :cond_9

    .line 118
    .line 119
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move-object v4, v1

    .line 124
    check-cast v4, Ljava/lang/String;

    .line 125
    .line 126
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-nez v3, :cond_5

    .line 131
    .line 132
    iget-object v3, p0, Lr0/l1;->k:LA0/Z;

    .line 133
    .line 134
    if-eqz v3, :cond_6

    .line 135
    .line 136
    iget-object v2, v3, LA0/Z;->e:Ljava/util/List;

    .line 137
    .line 138
    :cond_6
    if-nez v2, :cond_7

    .line 139
    .line 140
    sget-object v2, LF0/s;->a:LF0/s;

    .line 141
    .line 142
    :cond_7
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_8

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eqz p2, :cond_a

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_a
    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Lr0/l1;->k:LA0/Z;

    .line 164
    .line 165
    if-nez p2, :cond_b

    .line 166
    .line 167
    :goto_3
    return-void

    .line 168
    :cond_b
    iget-object v1, p2, LA0/Z;->e:Ljava/util/List;

    .line 169
    .line 170
    invoke-static {v1, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const/16 v1, 0x2f

    .line 183
    .line 184
    invoke-static {p2, v2, v0, v1}, LA0/Z;->a(LA0/Z;Ljava/util/List;Ljava/util/List;I)LA0/Z;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    iput-object p2, p0, Lr0/l1;->k:LA0/Z;

    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v0, "getApplicationContext(...)"

    .line 195
    .line 196
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-static {p1, p2}, LA0/l;->y(Landroid/content/Context;LA0/Z;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final G(Landroid/widget/ListAdapter;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lr0/l1;->q()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lr0/l1;->d:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, Lr0/l1;->e:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lr0/l1;->v(Landroid/widget/ListAdapter;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lr0/l1;->i(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    :cond_1
    :try_start_0
    const-string v0, "notifyDataSetChanged"

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    new-array v1, v1, [Ljava/lang/Object;

    .line 48
    .line 49
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 50
    .line 51
    invoke-interface {v2, p1, v0, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final I(Ljava/lang/Object;)V
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_a

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v3, "getDeclaredFields(...)"

    .line 24
    .line 25
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    array-length v3, v0

    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    const-string v6, "notifyDataSetChanged"

    .line 32
    .line 33
    if-ge v5, v3, :cond_8

    .line 34
    .line 35
    aget-object v7, v0, v5

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    :try_start_0
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v7, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    instance-of v8, v7, Landroid/widget/AbsListView;

    .line 49
    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    check-cast v7, Landroid/widget/AbsListView;

    .line 56
    .line 57
    invoke-virtual {v7}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Landroid/widget/ListAdapter;

    .line 62
    .line 63
    if-eqz v6, :cond_7

    .line 64
    .line 65
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    instance-of v8, v7, Landroid/widget/AdapterView;

    .line 70
    .line 71
    if-eqz v8, :cond_3

    .line 72
    .line 73
    check-cast v7, Landroid/widget/AdapterView;

    .line 74
    .line 75
    invoke-virtual {v7}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    if-eqz v6, :cond_7

    .line 80
    .line 81
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    instance-of v8, v7, Landroid/widget/ListAdapter;

    .line 86
    .line 87
    if-eqz v8, :cond_4

    .line 88
    .line 89
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v8}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    const-string v9, "getMethods(...)"

    .line 102
    .line 103
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    array-length v9, v8

    .line 107
    move v10, v4

    .line 108
    :goto_1
    if-ge v10, v9, :cond_6

    .line 109
    .line 110
    aget-object v11, v8, v10

    .line 111
    .line 112
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-static {v11, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eqz v11, :cond_5

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    const/4 v7, 0x0

    .line 127
    :goto_2
    if-eqz v7, :cond_7

    .line 128
    .line 129
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    :catchall_0
    :cond_7
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_8
    new-instance p1, Ljava/util/HashSet;

    .line 136
    .line 137
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v0, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_a

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {p1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_9

    .line 172
    .line 173
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    :cond_b
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_c

    .line 186
    .line 187
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :try_start_1
    new-array v1, v4, [Ljava/lang/Object;

    .line 192
    .line 193
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 194
    .line 195
    invoke-interface {v3, v0, v6, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 199
    goto :goto_6

    .line 200
    :catchall_1
    move-exception v0

    .line 201
    new-instance v1, LE0/d;

    .line 202
    .line 203
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    move-object v0, v1

    .line 207
    :goto_6
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-eqz v0, :cond_b

    .line 212
    .line 213
    const-string v1, "hide storage chat history adapter refresh fail"

    .line 214
    .line 215
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_c
    new-instance p1, Ljava/util/HashSet;

    .line 224
    .line 225
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 226
    .line 227
    .line 228
    new-instance v0, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    :cond_d
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eqz v2, :cond_e

    .line 242
    .line 243
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    move-object v3, v2

    .line 248
    check-cast v3, Landroid/widget/AbsListView;

    .line 249
    .line 250
    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_d

    .line 263
    .line 264
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    :cond_f
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_13

    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Landroid/widget/AbsListView;

    .line 283
    .line 284
    invoke-static {v0}, Lr0/l1;->B(Landroid/widget/AbsListView;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-nez v1, :cond_10

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_10
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-eqz v1, :cond_11

    .line 296
    .line 297
    iget-object v1, v1, Lr0/j1;->f:Ljava/util/List;

    .line 298
    .line 299
    if-nez v1, :cond_12

    .line 300
    .line 301
    :cond_11
    sget-object v1, Lr0/l1;->o:Ljava/util/List;

    .line 302
    .line 303
    :cond_12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_f

    .line 312
    .line 313
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, LE0/c;

    .line 318
    .line 319
    iget-object v3, v2, LE0/c;->a:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v3, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 324
    .line 325
    .line 326
    move-result-wide v3

    .line 327
    iget-object v2, v2, LE0/c;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v2, Ljava/lang/Boolean;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    new-instance v5, Lr0/i1;

    .line 336
    .line 337
    const/4 v6, 0x0

    .line 338
    invoke-direct {v5, p0, v0, v2, v6}, Lr0/i1;-><init>(Le0/a;Landroid/view/KeyEvent$Callback;ZI)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v5, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_13
    :goto_a
    return-void
.end method

.method public final K(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/l1;->b:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    const/4 v1, -0x2

    .line 30
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :cond_2
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final L(Ljava/lang/Object;Ljava/util/Set;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lr0/l1;->E(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lr0/l1;->y(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_1
    iget-object v1, p0, Lr0/l1;->k:LA0/Z;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-object v1, v1, LA0/Z;->c:Ljava/util/List;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    move-object v1, v0

    .line 24
    :goto_0
    if-nez v1, :cond_3

    .line 25
    .line 26
    sget-object v1, LF0/s;->a:LF0/s;

    .line 27
    .line 28
    :cond_3
    const-string v2, "a"

    .line 29
    .line 30
    invoke-static {v1, v2}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_7

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    :try_start_0
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 59
    .line 60
    invoke-interface {v3, p1, v2}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v2

    .line 68
    new-instance v3, LE0/d;

    .line 69
    .line 70
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object v2, v3

    .line 74
    :goto_1
    nop

    .line 75
    instance-of v3, v2, LE0/d;

    .line 76
    .line 77
    if-eqz v3, :cond_5

    .line 78
    .line 79
    move-object v2, v0

    .line 80
    :cond_5
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-nez v3, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    move-object v2, v0

    .line 102
    :goto_2
    if-eqz v2, :cond_4

    .line 103
    .line 104
    move-object v0, v2

    .line 105
    :cond_7
    :goto_3
    if-nez v0, :cond_8

    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    return p1

    .line 109
    :cond_8
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    return p1
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-boolean v1, Lz0/i;->a:Z

    .line 3
    .line 4
    invoke-static {}, Lz0/g;->D()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_1
    invoke-static {}, Lz0/g;->s()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    sget-object v1, LF0/s;->a:LF0/s;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const-class v1, Lq0/h;

    .line 26
    .line 27
    invoke-static {v1}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lq0/h;

    .line 32
    .line 33
    new-instance v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object v1, v1, Lq0/h;->a:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    move-object v1, v3

    .line 41
    :goto_0
    invoke-static {v1}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v3, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_5

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    move-object v5, v4

    .line 102
    check-cast v5, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-nez v5, :cond_4

    .line 109
    .line 110
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-static {v1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    :goto_3
    return v2

    .line 125
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v4, "getDeclaredFields(...)"

    .line 134
    .line 135
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    array-length v5, v3

    .line 139
    move v6, v2

    .line 140
    move v7, v6

    .line 141
    :goto_4
    const/4 v8, 0x0

    .line 142
    if-ge v6, v5, :cond_c

    .line 143
    .line 144
    aget-object v9, v3, v6

    .line 145
    .line 146
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_7

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_7
    :try_start_0
    invoke-virtual {v9, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    goto :goto_5

    .line 165
    :catchall_0
    move-exception v9

    .line 166
    new-instance v10, LE0/d;

    .line 167
    .line 168
    invoke-direct {v10, v9}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    move-object v9, v10

    .line 172
    :goto_5
    nop

    .line 173
    instance-of v10, v9, LE0/d;

    .line 174
    .line 175
    if-eqz v10, :cond_8

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_8
    move-object v8, v9

    .line 179
    :goto_6
    if-nez v8, :cond_9

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_9
    instance-of v9, v8, Landroid/widget/ListAdapter;

    .line 183
    .line 184
    if-eqz v9, :cond_a

    .line 185
    .line 186
    invoke-virtual {p0, v8}, Lr0/l1;->i(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eqz v8, :cond_b

    .line 191
    .line 192
    :goto_7
    move v7, v0

    .line 193
    goto :goto_8

    .line 194
    :cond_a
    instance-of v9, v8, Landroid/widget/AdapterView;

    .line 195
    .line 196
    if-eqz v9, :cond_b

    .line 197
    .line 198
    check-cast v8, Landroid/widget/AdapterView;

    .line 199
    .line 200
    invoke-virtual {v8}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    instance-of v9, v8, Landroid/widget/ListAdapter;

    .line 205
    .line 206
    if-eqz v9, :cond_b

    .line 207
    .line 208
    invoke-virtual {p0, v8}, Lr0/l1;->i(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-eqz v8, :cond_b

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_b
    :goto_8
    add-int/2addr v6, v0

    .line 216
    goto :goto_4

    .line 217
    :cond_c
    new-instance v3, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    const-string v6, "Q"

    .line 227
    .line 228
    invoke-static {v6}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    :catchall_1
    :cond_d
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    if-eqz v9, :cond_f

    .line 241
    .line 242
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    check-cast v9, Ljava/lang/String;

    .line 247
    .line 248
    :try_start_1
    invoke-virtual {v5, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual {v9, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-static {v9}, LN0/o;->c(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-eqz v10, :cond_e

    .line 264
    .line 265
    check-cast v9, Ljava/util/Map;

    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_e
    move-object v9, v8

    .line 269
    :goto_a
    if-eqz v9, :cond_d

    .line 270
    .line 271
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 272
    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-nez v6, :cond_10

    .line 280
    .line 281
    goto :goto_f

    .line 282
    :cond_10
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    invoke-static {v5, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    array-length v4, v5

    .line 290
    :goto_b
    if-ge v2, v4, :cond_14

    .line 291
    .line 292
    aget-object v6, v5, v2

    .line 293
    .line 294
    :try_start_2
    invoke-virtual {v6, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-static {v6}, LN0/o;->c(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    if-eqz v9, :cond_11

    .line 306
    .line 307
    check-cast v6, Ljava/util/Map;

    .line 308
    .line 309
    goto :goto_c

    .line 310
    :cond_11
    move-object v6, v8

    .line 311
    :goto_c
    if-eqz v6, :cond_13

    .line 312
    .line 313
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-nez v9, :cond_12

    .line 318
    .line 319
    goto :goto_d

    .line 320
    :cond_12
    move-object v6, v8

    .line 321
    :goto_d
    if-eqz v6, :cond_13

    .line 322
    .line 323
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 324
    .line 325
    .line 326
    :catchall_2
    :cond_13
    add-int/2addr v2, v0

    .line 327
    goto :goto_b

    .line 328
    :cond_14
    new-instance p1, Ljava/util/HashSet;

    .line 329
    .line 330
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 331
    .line 332
    .line 333
    new-instance v2, Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    :cond_15
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    if-eqz v4, :cond_16

    .line 347
    .line 348
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    move-object v5, v4

    .line 353
    check-cast v5, Ljava/util/Map;

    .line 354
    .line 355
    invoke-static {v5}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-virtual {p1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    if-eqz v5, :cond_15

    .line 368
    .line 369
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_e

    .line 373
    :cond_16
    move-object v3, v2

    .line 374
    :goto_f
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    :cond_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_25

    .line 383
    .line 384
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    check-cast v2, Ljava/util/Map;

    .line 389
    .line 390
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    new-instance v4, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 397
    .line 398
    .line 399
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    :cond_18
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    if-eqz v5, :cond_24

    .line 408
    .line 409
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    if-eqz v5, :cond_18

    .line 414
    .line 415
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v6

    .line 419
    if-eqz v6, :cond_18

    .line 420
    .line 421
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    if-nez v6, :cond_19

    .line 430
    .line 431
    goto :goto_10

    .line 432
    :cond_19
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    if-eqz v9, :cond_1a

    .line 437
    .line 438
    goto :goto_10

    .line 439
    :cond_1a
    const-string v9, "@chatroom"

    .line 440
    .line 441
    invoke-static {v6, v9, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    if-eqz v9, :cond_1b

    .line 446
    .line 447
    goto :goto_10

    .line 448
    :cond_1b
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 449
    .line 450
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-static {v6}, Lr0/l1;->D(Ljava/lang/String;)Z

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    if-eqz v10, :cond_1c

    .line 458
    .line 459
    invoke-virtual {v9, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    :cond_1c
    sget-object v10, Lr0/l1;->l:LU0/g;

    .line 463
    .line 464
    invoke-static {v10, v6}, LU0/g;->c(LU0/g;Ljava/lang/String;)LK0/h;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    new-instance v10, LT0/g;

    .line 469
    .line 470
    invoke-direct {v10, v6}, LT0/g;-><init>(LK0/h;)V

    .line 471
    .line 472
    .line 473
    :cond_1d
    :goto_11
    invoke-virtual {v10}, LT0/g;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    if-eqz v6, :cond_21

    .line 478
    .line 479
    invoke-virtual {v10}, LT0/g;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    check-cast v6, LU0/d;

    .line 484
    .line 485
    invoke-virtual {v6}, LU0/d;->a()Ljava/util/List;

    .line 486
    .line 487
    .line 488
    move-result-object v11

    .line 489
    invoke-static {v11, v0}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v11

    .line 493
    check-cast v11, Ljava/lang/String;

    .line 494
    .line 495
    if-eqz v11, :cond_1f

    .line 496
    .line 497
    invoke-static {v11}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 498
    .line 499
    .line 500
    move-result v12

    .line 501
    if-nez v12, :cond_1e

    .line 502
    .line 503
    goto :goto_12

    .line 504
    :cond_1e
    move-object v11, v8

    .line 505
    :goto_12
    if-nez v11, :cond_20

    .line 506
    .line 507
    :cond_1f
    iget-object v6, v6, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 508
    .line 509
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v11

    .line 513
    const-string v6, "group(...)"

    .line 514
    .line 515
    invoke-static {v11, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    :cond_20
    invoke-static {v11}, Lr0/l1;->D(Ljava/lang/String;)Z

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    if-eqz v6, :cond_1d

    .line 523
    .line 524
    invoke-virtual {v9, v11}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    goto :goto_11

    .line 528
    :cond_21
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    if-eqz v6, :cond_22

    .line 533
    .line 534
    goto/16 :goto_10

    .line 535
    .line 536
    :cond_22
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    :cond_23
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v9

    .line 544
    if-eqz v9, :cond_18

    .line 545
    .line 546
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    check-cast v9, Ljava/lang/String;

    .line 551
    .line 552
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v9

    .line 556
    if-eqz v9, :cond_23

    .line 557
    .line 558
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    goto/16 :goto_10

    .line 562
    .line 563
    :cond_24
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    if-eqz v4, :cond_17

    .line 572
    .line 573
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move v7, v0

    .line 581
    goto :goto_13

    .line 582
    :cond_25
    return v7
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    if-nez v4, :cond_0

    .line 11
    .line 12
    move-object/from16 v4, p1

    .line 13
    .line 14
    :cond_0
    iput-object v4, v0, Lr0/l1;->j:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, LA0/l;->n(Landroid/content/Context;)LA0/Z;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iput-object v4, v0, Lr0/l1;->k:LA0/Z;

    .line 21
    .line 22
    sget-object v4, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    new-instance v5, LA0/u;

    .line 25
    .line 26
    new-instance v8, Lr0/P;

    .line 27
    .line 28
    const/16 v4, 0x1b

    .line 29
    .line 30
    invoke-direct {v8, v4}, Lr0/P;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v9, Lr0/h1;

    .line 34
    .line 35
    invoke-direct {v9, v0}, Lr0/h1;-><init>(Lr0/l1;)V

    .line 36
    .line 37
    .line 38
    new-instance v10, Lr0/h1;

    .line 39
    .line 40
    invoke-direct {v10, v0}, Lr0/h1;-><init>(Lr0/l1;)V

    .line 41
    .line 42
    .line 43
    new-instance v11, LA0/a;

    .line 44
    .line 45
    const/16 v4, 0x10

    .line 46
    .line 47
    invoke-direct {v11, v4}, LA0/a;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const-string v6, "storage_chat_history"

    .line 51
    .line 52
    const-string v7, "\u5b58\u50a8\u7a7a\u95f4\u804a\u5929\u8bb0\u5f55\u9690\u85cf"

    .line 53
    .line 54
    invoke-direct/range {v5 .. v11}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v4, p1

    .line 58
    .line 59
    invoke-static {v4, v5}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 60
    .line 61
    .line 62
    sget-boolean v5, Lz0/i;->a:Z

    .line 63
    .line 64
    invoke-static {}, Lz0/g;->D()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const-string v6, "enabled="

    .line 69
    .line 70
    invoke-static {v6, v5}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    iget-object v6, v0, Lr0/l1;->k:LA0/Z;

    .line 75
    .line 76
    if-eqz v6, :cond_1

    .line 77
    .line 78
    move v6, v3

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move v6, v1

    .line 81
    :goto_0
    const-string v7, "cached="

    .line 82
    .line 83
    invoke-static {v7, v6}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-nez v7, :cond_3

    .line 92
    .line 93
    iget-object v7, v0, Lr0/l1;->k:LA0/Z;

    .line 94
    .line 95
    if-eqz v7, :cond_2

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move v7, v1

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    :goto_1
    move v7, v3

    .line 101
    :goto_2
    const-string v8, "support="

    .line 102
    .line 103
    invoke-static {v8, v7}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    iget-object v8, v0, Lr0/l1;->k:LA0/Z;

    .line 108
    .line 109
    if-eqz v8, :cond_4

    .line 110
    .line 111
    iget-object v8, v8, LA0/Z;->a:Ljava/util/List;

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    const/4 v8, 0x0

    .line 115
    :goto_3
    sget-object v10, LF0/s;->a:LF0/s;

    .line 116
    .line 117
    if-nez v8, :cond_5

    .line 118
    .line 119
    move-object v11, v10

    .line 120
    goto :goto_4

    .line 121
    :cond_5
    move-object v11, v8

    .line 122
    :goto_4
    const/4 v14, 0x0

    .line 123
    const/4 v15, 0x0

    .line 124
    const-string v12, "|"

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/16 v16, 0x3e

    .line 128
    .line 129
    invoke-static/range {v11 .. v16}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    const-string v11, "adapters="

    .line 134
    .line 135
    invoke-virtual {v11, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    const-string v11, "hide storage handleHook"

    .line 140
    .line 141
    filled-new-array {v11, v5, v6, v7, v8}, [Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-static {v5}, Li0/a;->a([Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    if-nez v5, :cond_7

    .line 153
    .line 154
    iget-object v5, v0, Lr0/l1;->k:LA0/Z;

    .line 155
    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_6
    return-void

    .line 160
    :cond_7
    :goto_5
    iget-boolean v5, v0, Lr0/l1;->a:Z

    .line 161
    .line 162
    if-eqz v5, :cond_8

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_8
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    instance-of v6, v5, Landroid/app/Application;

    .line 170
    .line 171
    if-eqz v6, :cond_9

    .line 172
    .line 173
    check-cast v5, Landroid/app/Application;

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_9
    const/4 v5, 0x0

    .line 177
    :goto_6
    if-nez v5, :cond_a

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_a
    iput-boolean v3, v0, Lr0/l1;->a:Z

    .line 181
    .line 182
    new-instance v6, Lr0/j;

    .line 183
    .line 184
    invoke-direct {v6, v0, v2}, Lr0/j;-><init>(Le0/a;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5, v6}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 188
    .line 189
    .line 190
    :goto_7
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 195
    .line 196
    const-string v7, "com.tencent.mm.ui.vas.VASCommonActivity"

    .line 197
    .line 198
    invoke-interface {v6, v5, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    const-string v6, "onResume"

    .line 203
    .line 204
    if-nez v5, :cond_b

    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_b
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 208
    .line 209
    const-string v8, "hide-storage-vas-common-activity"

    .line 210
    .line 211
    invoke-virtual {v7, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_c

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_c
    new-array v7, v1, [Ljava/lang/Object;

    .line 219
    .line 220
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 221
    .line 222
    invoke-interface {v11, v5, v6, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    if-eqz v7, :cond_d

    .line 227
    .line 228
    new-instance v11, Lr0/k1;

    .line 229
    .line 230
    const/16 v12, 0x9

    .line 231
    .line 232
    invoke-direct {v11, v0, v12}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v7, v11}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 236
    .line 237
    .line 238
    :cond_d
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 239
    .line 240
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 245
    .line 246
    const-string v12, "onWindowFocusChanged"

    .line 247
    .line 248
    invoke-interface {v11, v5, v12, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    if-eqz v5, :cond_e

    .line 253
    .line 254
    new-instance v7, Lr0/k1;

    .line 255
    .line 256
    const/16 v11, 0xa

    .line 257
    .line 258
    invoke-direct {v7, v0, v11}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 259
    .line 260
    .line 261
    invoke-static {v5, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 262
    .line 263
    .line 264
    :cond_e
    sget-object v5, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 265
    .line 266
    invoke-virtual {v5, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    :goto_8
    sget-object v5, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 270
    .line 271
    const-string v7, "hide-storage-viewgroup-addview"

    .line 272
    .line 273
    invoke-virtual {v5, v7}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    const-string v8, "getParameterTypes(...)"

    .line 278
    .line 279
    const-string v11, "getDeclaredMethods(...)"

    .line 280
    .line 281
    if-eqz v5, :cond_f

    .line 282
    .line 283
    goto/16 :goto_c

    .line 284
    .line 285
    :cond_f
    const-class v5, Landroid/view/ViewGroup;

    .line 286
    .line 287
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-static {v5, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    new-instance v12, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 297
    .line 298
    .line 299
    array-length v13, v5

    .line 300
    move v14, v1

    .line 301
    :goto_9
    if-ge v14, v13, :cond_13

    .line 302
    .line 303
    aget-object v15, v5, v14

    .line 304
    .line 305
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    const-string v2, "addView"

    .line 310
    .line 311
    invoke-static {v9, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-eqz v2, :cond_12

    .line 316
    .line 317
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-static {v2, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    array-length v2, v2

    .line 325
    if-nez v2, :cond_10

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_10
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-static {v2, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    array-length v9, v2

    .line 336
    if-eqz v9, :cond_11

    .line 337
    .line 338
    aget-object v2, v2, v1

    .line 339
    .line 340
    const-class v9, Landroid/view/View;

    .line 341
    .line 342
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-eqz v2, :cond_12

    .line 347
    .line 348
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    goto :goto_a

    .line 352
    :cond_11
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 353
    .line 354
    const-string v2, "Array is empty."

    .line 355
    .line 356
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw v1

    .line 360
    :cond_12
    :goto_a
    add-int/2addr v14, v3

    .line 361
    const/4 v2, 0x3

    .line 362
    goto :goto_9

    .line 363
    :cond_13
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_14

    .line 372
    .line 373
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    check-cast v5, Ljava/lang/reflect/Method;

    .line 378
    .line 379
    new-instance v9, Lr0/k1;

    .line 380
    .line 381
    const/16 v12, 0x8

    .line 382
    .line 383
    invoke-direct {v9, v0, v12}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 384
    .line 385
    .line 386
    invoke-static {v5, v9}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 387
    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_14
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 391
    .line 392
    invoke-virtual {v2, v7}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    :goto_c
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 396
    .line 397
    const-string v5, "hide-storage-abslistview"

    .line 398
    .line 399
    invoke-virtual {v2, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    const-class v7, Landroid/widget/AbsListView;

    .line 404
    .line 405
    if-eqz v2, :cond_15

    .line 406
    .line 407
    goto/16 :goto_f

    .line 408
    .line 409
    :cond_15
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-static {v2, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    new-instance v9, Ljava/util/ArrayList;

    .line 417
    .line 418
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 419
    .line 420
    .line 421
    array-length v12, v2

    .line 422
    move v13, v1

    .line 423
    :goto_d
    if-ge v13, v12, :cond_17

    .line 424
    .line 425
    aget-object v14, v2, v13

    .line 426
    .line 427
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v15

    .line 431
    move/from16 v17, v3

    .line 432
    .line 433
    const-string v3, "obtainView"

    .line 434
    .line 435
    invoke-static {v15, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eqz v3, :cond_16

    .line 440
    .line 441
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    array-length v3, v3

    .line 446
    const/4 v15, 0x2

    .line 447
    if-ne v3, v15, :cond_16

    .line 448
    .line 449
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    aget-object v3, v3, v1

    .line 454
    .line 455
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 456
    .line 457
    invoke-static {v3, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-eqz v3, :cond_16

    .line 462
    .line 463
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    aget-object v3, v3, v17

    .line 468
    .line 469
    const-class v15, [Z

    .line 470
    .line 471
    invoke-static {v3, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    if-eqz v3, :cond_16

    .line 476
    .line 477
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    :cond_16
    add-int/lit8 v13, v13, 0x1

    .line 481
    .line 482
    move/from16 v3, v17

    .line 483
    .line 484
    goto :goto_d

    .line 485
    :cond_17
    move/from16 v17, v3

    .line 486
    .line 487
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-eqz v3, :cond_18

    .line 496
    .line 497
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    check-cast v3, Ljava/lang/reflect/Method;

    .line 502
    .line 503
    new-instance v9, Lr0/k1;

    .line 504
    .line 505
    invoke-direct {v9, v0, v1}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 506
    .line 507
    .line 508
    invoke-static {v3, v9}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 509
    .line 510
    .line 511
    goto :goto_e

    .line 512
    :cond_18
    new-array v2, v1, [Ljava/lang/Object;

    .line 513
    .line 514
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 515
    .line 516
    const-string v9, "layoutChildren"

    .line 517
    .line 518
    invoke-interface {v3, v7, v9, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    if-eqz v2, :cond_19

    .line 523
    .line 524
    new-instance v3, Lr0/k1;

    .line 525
    .line 526
    move/from16 v9, v17

    .line 527
    .line 528
    invoke-direct {v3, v0, v9}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 529
    .line 530
    .line 531
    invoke-static {v2, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 532
    .line 533
    .line 534
    :cond_19
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 535
    .line 536
    invoke-virtual {v2, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    :goto_f
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 540
    .line 541
    const-string v3, "hide-storage-adapter-attach"

    .line 542
    .line 543
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    if-eqz v2, :cond_1a

    .line 548
    .line 549
    goto/16 :goto_12

    .line 550
    .line 551
    :cond_1a
    const-class v2, Landroid/widget/ListView;

    .line 552
    .line 553
    const-class v5, Landroid/widget/AdapterView;

    .line 554
    .line 555
    filled-new-array {v5, v7, v2}, [Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    :cond_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    if-eqz v5, :cond_1e

    .line 572
    .line 573
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    check-cast v5, Ljava/lang/Class;

    .line 578
    .line 579
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-static {v5, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    new-instance v7, Ljava/util/ArrayList;

    .line 587
    .line 588
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 589
    .line 590
    .line 591
    array-length v9, v5

    .line 592
    move v12, v1

    .line 593
    :goto_10
    if-ge v12, v9, :cond_1d

    .line 594
    .line 595
    aget-object v13, v5, v12

    .line 596
    .line 597
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v14

    .line 601
    const-string v15, "setAdapter"

    .line 602
    .line 603
    invoke-static {v14, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v14

    .line 607
    if-eqz v14, :cond_1c

    .line 608
    .line 609
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    move-result-object v14

    .line 613
    array-length v14, v14

    .line 614
    const/4 v15, 0x1

    .line 615
    if-ne v14, v15, :cond_1c

    .line 616
    .line 617
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    move-result-object v14

    .line 621
    aget-object v14, v14, v1

    .line 622
    .line 623
    const-class v15, Landroid/widget/ListAdapter;

    .line 624
    .line 625
    invoke-virtual {v15, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 626
    .line 627
    .line 628
    move-result v14

    .line 629
    if-eqz v14, :cond_1c

    .line 630
    .line 631
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    :cond_1c
    const/16 v17, 0x1

    .line 635
    .line 636
    add-int/lit8 v12, v12, 0x1

    .line 637
    .line 638
    goto :goto_10

    .line 639
    :cond_1d
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 644
    .line 645
    .line 646
    move-result v7

    .line 647
    if-eqz v7, :cond_1b

    .line 648
    .line 649
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v7

    .line 653
    check-cast v7, Ljava/lang/reflect/Method;

    .line 654
    .line 655
    new-instance v9, Lr0/k1;

    .line 656
    .line 657
    const/4 v12, 0x3

    .line 658
    invoke-direct {v9, v0, v12}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 659
    .line 660
    .line 661
    invoke-static {v7, v9}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 662
    .line 663
    .line 664
    goto :goto_11

    .line 665
    :cond_1e
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 666
    .line 667
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    :goto_12
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 675
    .line 676
    const-string v5, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI"

    .line 677
    .line 678
    invoke-interface {v3, v2, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    if-nez v2, :cond_1f

    .line 683
    .line 684
    const-string v2, "hide storage chat history class missing"

    .line 685
    .line 686
    filled-new-array {v2, v5}, [Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    goto/16 :goto_1a

    .line 694
    .line 695
    :cond_1f
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 696
    .line 697
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 698
    .line 699
    .line 700
    iget-object v5, v0, Lr0/l1;->k:LA0/Z;

    .line 701
    .line 702
    if-eqz v5, :cond_20

    .line 703
    .line 704
    iget-object v5, v5, LA0/Z;->d:Ljava/util/List;

    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_20
    const/4 v5, 0x0

    .line 708
    :goto_13
    if-nez v5, :cond_21

    .line 709
    .line 710
    move-object v5, v10

    .line 711
    :cond_21
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 712
    .line 713
    .line 714
    move-result-object v7

    .line 715
    if-eqz v7, :cond_22

    .line 716
    .line 717
    iget-object v7, v7, Lr0/j1;->d:Ljava/util/List;

    .line 718
    .line 719
    goto :goto_14

    .line 720
    :cond_22
    const/4 v7, 0x0

    .line 721
    :goto_14
    if-nez v7, :cond_23

    .line 722
    .line 723
    move-object v7, v10

    .line 724
    :cond_23
    invoke-static {v5, v7}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    const-string v7, "storage"

    .line 729
    .line 730
    const-string v9, "refreshMethods"

    .line 731
    .line 732
    invoke-static {v7, v9, v5}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v5

    .line 736
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    :cond_24
    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 741
    .line 742
    .line 743
    move-result v7

    .line 744
    if-eqz v7, :cond_25

    .line 745
    .line 746
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v7

    .line 750
    check-cast v7, Ljava/lang/String;

    .line 751
    .line 752
    new-array v9, v1, [Ljava/lang/Object;

    .line 753
    .line 754
    sget-object v12, Lc0/f;->b:Ld0/b;

    .line 755
    .line 756
    invoke-interface {v12, v2, v7, v9}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    if-eqz v7, :cond_24

    .line 761
    .line 762
    invoke-virtual {v3, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    goto :goto_15

    .line 766
    :cond_25
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 767
    .line 768
    .line 769
    move-result v5

    .line 770
    if-nez v5, :cond_26

    .line 771
    .line 772
    invoke-static {v3}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    goto/16 :goto_18

    .line 777
    .line 778
    :cond_26
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    invoke-static {v3, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    new-instance v5, Ljava/util/ArrayList;

    .line 786
    .line 787
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 788
    .line 789
    .line 790
    array-length v7, v3

    .line 791
    move v9, v1

    .line 792
    :goto_16
    if-ge v9, v7, :cond_28

    .line 793
    .line 794
    aget-object v11, v3, v9

    .line 795
    .line 796
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    move-result-object v12

    .line 800
    invoke-static {v12, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    array-length v12, v12

    .line 804
    if-nez v12, :cond_27

    .line 805
    .line 806
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    move-result-object v12

    .line 810
    sget-object v13, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 811
    .line 812
    invoke-static {v12, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v12

    .line 816
    if-eqz v12, :cond_27

    .line 817
    .line 818
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 819
    .line 820
    .line 821
    move-result v12

    .line 822
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 823
    .line 824
    .line 825
    move-result v12

    .line 826
    if-nez v12, :cond_27

    .line 827
    .line 828
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    :cond_27
    const/16 v17, 0x1

    .line 832
    .line 833
    add-int/lit8 v9, v9, 0x1

    .line 834
    .line 835
    goto :goto_16

    .line 836
    :cond_28
    new-instance v3, Ljava/util/ArrayList;

    .line 837
    .line 838
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 842
    .line 843
    .line 844
    move-result-object v5

    .line 845
    :cond_29
    :goto_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 846
    .line 847
    .line 848
    move-result v7

    .line 849
    if-eqz v7, :cond_2a

    .line 850
    .line 851
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v7

    .line 855
    move-object v8, v7

    .line 856
    check-cast v8, Ljava/lang/reflect/Method;

    .line 857
    .line 858
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v9

    .line 862
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 863
    .line 864
    .line 865
    move-result v9

    .line 866
    const/4 v12, 0x3

    .line 867
    if-gt v9, v12, :cond_29

    .line 868
    .line 869
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    const-string v9, "getName(...)"

    .line 874
    .line 875
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    invoke-static {v8}, LU0/i;->l0(Ljava/lang/String;)Ljava/lang/Character;

    .line 879
    .line 880
    .line 881
    move-result-object v8

    .line 882
    if-eqz v8, :cond_29

    .line 883
    .line 884
    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    .line 885
    .line 886
    .line 887
    move-result v8

    .line 888
    invoke-static {v8}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 889
    .line 890
    .line 891
    move-result v8

    .line 892
    const/4 v15, 0x1

    .line 893
    if-ne v8, v15, :cond_29

    .line 894
    .line 895
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    goto :goto_17

    .line 899
    :cond_2a
    :goto_18
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 900
    .line 901
    .line 902
    move-result v5

    .line 903
    if-eqz v5, :cond_2b

    .line 904
    .line 905
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    const-string v3, "hide storage chat history method missing"

    .line 910
    .line 911
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    goto :goto_1a

    .line 919
    :cond_2b
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    if-eqz v3, :cond_2d

    .line 928
    .line 929
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v3

    .line 933
    check-cast v3, Ljava/lang/reflect/Method;

    .line 934
    .line 935
    invoke-static {v3}, Lr0/l1;->H(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v5

    .line 939
    const-string v7, "hide-storage-chat-history-"

    .line 940
    .line 941
    invoke-static {v7, v5}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v5

    .line 945
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 946
    .line 947
    invoke-virtual {v7, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v7

    .line 951
    if-eqz v7, :cond_2c

    .line 952
    .line 953
    const/4 v15, 0x1

    .line 954
    goto :goto_19

    .line 955
    :cond_2c
    new-instance v7, Lr0/D0;

    .line 956
    .line 957
    const/4 v15, 0x1

    .line 958
    invoke-direct {v7, v0, v15}, Lr0/D0;-><init>(Le0/a;I)V

    .line 959
    .line 960
    .line 961
    invoke-static {v3, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 962
    .line 963
    .line 964
    const-string v7, "hide storage hook clean refresh"

    .line 965
    .line 966
    invoke-static {v3}, Lr0/l1;->H(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    filled-new-array {v7, v3}, [Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v3

    .line 974
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 978
    .line 979
    invoke-virtual {v3, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    goto :goto_19

    .line 983
    :cond_2d
    :goto_1a
    iget-object v2, v0, Lr0/l1;->k:LA0/Z;

    .line 984
    .line 985
    if-eqz v2, :cond_2e

    .line 986
    .line 987
    iget-object v9, v2, LA0/Z;->f:Ljava/util/List;

    .line 988
    .line 989
    goto :goto_1b

    .line 990
    :cond_2e
    const/4 v9, 0x0

    .line 991
    :goto_1b
    if-nez v9, :cond_2f

    .line 992
    .line 993
    goto :goto_1c

    .line 994
    :cond_2f
    move-object v10, v9

    .line 995
    :goto_1c
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v3

    .line 1003
    if-eqz v3, :cond_34

    .line 1004
    .line 1005
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    check-cast v3, Ljava/lang/String;

    .line 1010
    .line 1011
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v5

    .line 1015
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 1016
    .line 1017
    invoke-interface {v7, v5, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v5

    .line 1021
    if-nez v5, :cond_30

    .line 1022
    .line 1023
    goto :goto_1d

    .line 1024
    :cond_30
    const-string v7, "hide-storage-file-sort-activity-"

    .line 1025
    .line 1026
    invoke-static {v7, v3}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v3

    .line 1030
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1031
    .line 1032
    invoke-virtual {v7, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v7

    .line 1036
    if-eqz v7, :cond_31

    .line 1037
    .line 1038
    goto :goto_1d

    .line 1039
    :cond_31
    const-class v7, Landroid/os/Bundle;

    .line 1040
    .line 1041
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v7

    .line 1045
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1046
    .line 1047
    const-string v9, "onCreate"

    .line 1048
    .line 1049
    invoke-interface {v8, v5, v9, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v7

    .line 1053
    if-eqz v7, :cond_32

    .line 1054
    .line 1055
    new-instance v8, Lr0/k1;

    .line 1056
    .line 1057
    const/4 v9, 0x6

    .line 1058
    invoke-direct {v8, v0, v9}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 1059
    .line 1060
    .line 1061
    invoke-static {v7, v8}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1062
    .line 1063
    .line 1064
    :cond_32
    new-array v7, v1, [Ljava/lang/Object;

    .line 1065
    .line 1066
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1067
    .line 1068
    invoke-interface {v8, v5, v6, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v5

    .line 1072
    if-eqz v5, :cond_33

    .line 1073
    .line 1074
    new-instance v7, Lr0/k1;

    .line 1075
    .line 1076
    const/4 v8, 0x7

    .line 1077
    invoke-direct {v7, v0, v8}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 1078
    .line 1079
    .line 1080
    invoke-static {v5, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1081
    .line 1082
    .line 1083
    :cond_33
    sget-object v5, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1084
    .line 1085
    invoke-virtual {v5, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1086
    .line 1087
    .line 1088
    goto :goto_1d

    .line 1089
    :cond_34
    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lr0/l1;->q()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lr0/l1;->o()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    :goto_0
    return v1

    .line 32
    :cond_1
    new-instance v2, Ljava/util/IdentityHashMap;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "newSetFromMap(...)"

    .line 42
    .line 43
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v0, v2, v1}, Lr0/l1;->j(Ljava/lang/Object;Ljava/util/Set;Ljava/util/Set;I)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v1, p0, Lr0/l1;->e:Ljava/util/Map;

    .line 53
    .line 54
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_2
    return v0
.end method

.method public final j(Ljava/lang/Object;Ljava/util/Set;Ljava/util/Set;I)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_a

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x2

    .line 7
    if-gt p4, v1, :cond_10

    .line 8
    .line 9
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto/16 :goto_a

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lr0/l1;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move v2, v0

    .line 30
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_f

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/lang/Class;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-string v4, "getDeclaredFields(...)"

    .line 47
    .line 48
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    array-length v4, v3

    .line 52
    move v5, v0

    .line 53
    :goto_0
    if-ge v5, v4, :cond_2

    .line 54
    .line 55
    aget-object v6, v3, v5

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_3

    .line 66
    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :cond_3
    const/4 v7, 0x1

    .line 70
    :try_start_0
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v6

    .line 79
    new-instance v8, LE0/d;

    .line 80
    .line 81
    invoke-direct {v8, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object v6, v8

    .line 85
    :goto_1
    nop

    .line 86
    instance-of v8, v6, LE0/d;

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    if-eqz v8, :cond_4

    .line 90
    .line 91
    move-object v6, v9

    .line 92
    :cond_4
    if-nez v6, :cond_5

    .line 93
    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :cond_5
    invoke-static {v6}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_a

    .line 101
    .line 102
    invoke-static {v6}, LN0/o;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    :try_start_1
    invoke-interface {v6}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 107
    .line 108
    .line 109
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    goto :goto_2

    .line 111
    :catchall_1
    move-exception v6

    .line 112
    new-instance v8, LE0/d;

    .line 113
    .line 114
    invoke-direct {v8, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    move-object v6, v8

    .line 118
    :goto_2
    nop

    .line 119
    instance-of v8, v6, LE0/d;

    .line 120
    .line 121
    if-eqz v8, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    move-object v9, v6

    .line 125
    :goto_3
    check-cast v9, Ljava/util/ListIterator;

    .line 126
    .line 127
    move v6, v0

    .line 128
    if-nez v9, :cond_7

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :catchall_2
    :cond_7
    :goto_4
    invoke-interface {v9}, Ljava/util/ListIterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_9

    .line 136
    .line 137
    invoke-interface {v9}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {p0, v8, p2}, Lr0/l1;->L(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-nez v8, :cond_8

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_8
    :try_start_2
    invoke-interface {v9}, Ljava/util/ListIterator;->remove()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 149
    .line 150
    .line 151
    move v6, v7

    .line 152
    goto :goto_4

    .line 153
    :cond_9
    :goto_5
    if-eqz v6, :cond_e

    .line 154
    .line 155
    :goto_6
    move v2, v7

    .line 156
    goto :goto_9

    .line 157
    :cond_a
    invoke-virtual {p0, v6}, Lr0/l1;->y(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-eqz v8, :cond_c

    .line 162
    .line 163
    :cond_b
    :goto_7
    move v8, v0

    .line 164
    goto :goto_8

    .line 165
    :cond_c
    instance-of v8, v6, Ljava/util/Collection;

    .line 166
    .line 167
    if-nez v8, :cond_b

    .line 168
    .line 169
    instance-of v8, v6, Ljava/util/Map;

    .line 170
    .line 171
    if-nez v8, :cond_b

    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-eqz v8, :cond_d

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_d
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    const-string v9, "java."

    .line 193
    .line 194
    invoke-static {v8, v7, v9}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-nez v9, :cond_b

    .line 199
    .line 200
    const-string v9, "android."

    .line 201
    .line 202
    invoke-static {v8, v7, v9}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-nez v8, :cond_b

    .line 207
    .line 208
    move v8, v7

    .line 209
    :goto_8
    if-eqz v8, :cond_e

    .line 210
    .line 211
    add-int/lit8 v8, p4, 0x1

    .line 212
    .line 213
    invoke-virtual {p0, v6, p2, p3, v8}, Lr0/l1;->j(Ljava/lang/Object;Ljava/util/Set;Ljava/util/Set;I)Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-eqz v6, :cond_e

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_e
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_f
    return v2

    .line 225
    :cond_10
    :goto_a
    return v0
.end method

.method public final q()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, Lr0/l1;->k:LA0/Z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, LA0/Z;->a:Ljava/util/List;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v0, LF0/s;->a:LF0/s;

    .line 13
    .line 14
    :cond_1
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-object v1, v2, Lr0/j1;->a:Ljava/util/Set;

    .line 21
    .line 22
    :cond_2
    if-nez v1, :cond_3

    .line 23
    .line 24
    sget-object v1, LF0/u;->a:LF0/u;

    .line 25
    .line 26
    :cond_3
    invoke-static {v0, v1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "storage"

    .line 39
    .line 40
    const-string v2, "adapter"

    .line 41
    .line 42
    invoke-static {v1, v2, v0}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method

.method public final r()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, Lr0/l1;->k:LA0/Z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, LA0/Z;->e:Ljava/util/List;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v0, LF0/s;->a:LF0/s;

    .line 13
    .line 14
    :cond_1
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-object v1, v2, Lr0/j1;->c:Ljava/util/Set;

    .line 21
    .line 22
    :cond_2
    if-nez v1, :cond_3

    .line 23
    .line 24
    sget-object v1, LF0/u;->a:LF0/u;

    .line 25
    .line 26
    :cond_3
    invoke-static {v0, v1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "storage"

    .line 39
    .line 40
    const-string v2, "fileSortEntryNames"

    .line 41
    .line 42
    invoke-static {v1, v2, v0}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method

.method public final s(Ljava/lang/Object;)[I
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lr0/l1;->i(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr0/l1;->e:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, [I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    const-string v1, "originalGetCountMethods"

    .line 16
    .line 17
    iget-object v2, p0, Lr0/l1;->f:Ljava/util/Map;

    .line 18
    .line 19
    invoke-static {v2, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v2, p1}, Lr0/l1;->l(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    :cond_1
    move v1, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    :try_start_0
    new-array v4, v3, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v1, p1, v4}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    instance-of v4, v1, Ljava/lang/Integer;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move-object v1, v2

    .line 48
    goto :goto_1

    .line 49
    :goto_0
    new-instance v4, LE0/d;

    .line 50
    .line 51
    invoke-direct {v4, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object v1, v4

    .line 55
    :goto_1
    nop

    .line 56
    instance-of v4, v1, LE0/d;

    .line 57
    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    move-object v1, v2

    .line 61
    :cond_4
    check-cast v1, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    :goto_2
    if-gtz v1, :cond_5

    .line 70
    .line 71
    new-array v1, v3, [I

    .line 72
    .line 73
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_5
    invoke-static {}, Lr0/l1;->o()Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_7

    .line 86
    .line 87
    new-array v2, v1, [I

    .line 88
    .line 89
    :goto_3
    if-ge v3, v1, :cond_6

    .line 90
    .line 91
    aput v3, v2, v3

    .line 92
    .line 93
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    return-object v2

    .line 100
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    :goto_4
    if-ge v3, v1, :cond_b

    .line 106
    .line 107
    const-string v6, "originalGetItemMethods"

    .line 108
    .line 109
    iget-object v7, p0, Lr0/l1;->g:Ljava/util/Map;

    .line 110
    .line 111
    invoke-static {v7, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v7, p1}, Lr0/l1;->l(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-nez v6, :cond_8

    .line 119
    .line 120
    :goto_5
    move-object v6, v2

    .line 121
    goto :goto_7

    .line 122
    :cond_8
    :try_start_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    filled-new-array {v7}, [Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-static {v6, p1, v7}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 134
    goto :goto_6

    .line 135
    :catchall_1
    move-exception v6

    .line 136
    new-instance v7, LE0/d;

    .line 137
    .line 138
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    move-object v6, v7

    .line 142
    :goto_6
    nop

    .line 143
    instance-of v7, v6, LE0/d;

    .line 144
    .line 145
    if-eqz v7, :cond_9

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_9
    :goto_7
    invoke-virtual {p0, v6}, Lr0/l1;->E(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v6, v4}, Lr0/l1;->L(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-nez v6, :cond_a

    .line 156
    .line 157
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_b
    invoke-static {v5}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    return-object v1
.end method

.method public final t(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lr0/l1;->b:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v1, 0x0

    .line 36
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final u(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lo0/a;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, p0, v0, p1, v2}, Lo0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v1}, Lr0/l1;->n(Landroid/view/View;LM0/l;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lr0/l1;->t(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0}, Lr0/l1;->r()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v1, v2}, Lr0/l1;->f(Landroid/view/View;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroid/view/View;

    .line 86
    .line 87
    invoke-virtual {p0, v2}, Lr0/l1;->t(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    new-instance v0, Lo0/b;

    .line 92
    .line 93
    const/4 v1, 0x6

    .line 94
    invoke-direct {v0, p0, p1, v1}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, Lr0/l1;->n(Landroid/view/View;LM0/l;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final v(Landroid/widget/ListAdapter;)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_c

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lr0/l1;->c:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_c

    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Lr0/l1;->q()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    const/4 v2, 0x1

    .line 37
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    const-string v4, "getDeclaredMethods(...)"

    .line 40
    .line 41
    if-eqz v0, :cond_d

    .line 42
    .line 43
    invoke-static {p1}, Lr0/l1;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v5, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Ljava/lang/Class;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v6, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v6}, LF0/h;->Y([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-static {v6, v5}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    move-object v7, v6

    .line 103
    check-cast v7, Ljava/lang/reflect/Method;

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    const-string v9, "getCount"

    .line 110
    .line 111
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_3

    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    const-string v9, "getParameterTypes(...)"

    .line 122
    .line 123
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    array-length v8, v8

    .line 127
    if-nez v8, :cond_3

    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-static {v7, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_3

    .line 138
    .line 139
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_4
    new-instance v5, Ljava/util/HashSet;

    .line 144
    .line 145
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v6, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-eqz v7, :cond_6

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    move-object v8, v7

    .line 168
    check-cast v8, Ljava/lang/reflect/Method;

    .line 169
    .line 170
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v8}, Lr0/l1;->H(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-eqz v8, :cond_5

    .line 182
    .line 183
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_7

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Ljava/lang/reflect/Method;

    .line 202
    .line 203
    const-string v6, "originalGetCountMethods"

    .line 204
    .line 205
    iget-object v7, p0, Lr0/l1;->f:Ljava/util/Map;

    .line 206
    .line 207
    invoke-static {v7, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-interface {v7, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    new-instance v6, Lr0/k1;

    .line 218
    .line 219
    const/4 v7, 0x4

    .line 220
    invoke-direct {v6, p0, v7}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 221
    .line 222
    .line 223
    invoke-static {v5, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_7
    invoke-static {p1}, Lr0/l1;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v5, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_8

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    check-cast v6, Ljava/lang/Class;

    .line 251
    .line 252
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-static {v6, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v6}, LF0/h;->Y([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    invoke-static {v6, v5}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    :cond_9
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_a

    .line 281
    .line 282
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    move-object v7, v6

    .line 287
    check-cast v7, Ljava/lang/reflect/Method;

    .line 288
    .line 289
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    const-string v9, "getItem"

    .line 294
    .line 295
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-eqz v8, :cond_9

    .line 300
    .line 301
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    array-length v8, v8

    .line 306
    if-ne v8, v2, :cond_9

    .line 307
    .line 308
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    aget-object v7, v7, v1

    .line 313
    .line 314
    invoke-static {v7, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-eqz v7, :cond_9

    .line 319
    .line 320
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    goto :goto_5

    .line 324
    :cond_a
    new-instance v5, Ljava/util/HashSet;

    .line 325
    .line 326
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 327
    .line 328
    .line 329
    new-instance v6, Ljava/util/ArrayList;

    .line 330
    .line 331
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    if-eqz v7, :cond_c

    .line 343
    .line 344
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    move-object v8, v7

    .line 349
    check-cast v8, Ljava/lang/reflect/Method;

    .line 350
    .line 351
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-static {v8}, Lr0/l1;->H(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    if-eqz v8, :cond_b

    .line 363
    .line 364
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    if-eqz v5, :cond_d

    .line 377
    .line 378
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    check-cast v5, Ljava/lang/reflect/Method;

    .line 383
    .line 384
    const-string v6, "originalGetItemMethods"

    .line 385
    .line 386
    iget-object v7, p0, Lr0/l1;->g:Ljava/util/Map;

    .line 387
    .line 388
    invoke-static {v7, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    invoke-interface {v7, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    new-instance v6, Lr0/k1;

    .line 399
    .line 400
    const/4 v7, 0x5

    .line 401
    invoke-direct {v6, p0, v7}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 402
    .line 403
    .line 404
    invoke-static {v5, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 405
    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_d
    invoke-static {p1}, Lr0/l1;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    new-instance v0, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_e

    .line 426
    .line 427
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, Ljava/lang/Class;

    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    invoke-static {v5, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-static {v5}, LF0/h;->Y([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    invoke-static {v5, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 445
    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_e
    new-instance p1, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :cond_f
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    if-eqz v4, :cond_10

    .line 462
    .line 463
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    move-object v5, v4

    .line 468
    check-cast v5, Ljava/lang/reflect/Method;

    .line 469
    .line 470
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    const-string v7, "getView"

    .line 475
    .line 476
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    if-eqz v6, :cond_f

    .line 481
    .line 482
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    array-length v6, v6

    .line 487
    const/4 v7, 0x3

    .line 488
    if-ne v6, v7, :cond_f

    .line 489
    .line 490
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    move-result-object v6

    .line 494
    aget-object v6, v6, v1

    .line 495
    .line 496
    invoke-static {v6, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    if-eqz v6, :cond_f

    .line 501
    .line 502
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    const-class v7, Landroid/view/View;

    .line 507
    .line 508
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    if-eqz v6, :cond_f

    .line 513
    .line 514
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    aget-object v6, v6, v2

    .line 519
    .line 520
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 521
    .line 522
    .line 523
    move-result v6

    .line 524
    if-eqz v6, :cond_f

    .line 525
    .line 526
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    const/4 v6, 0x2

    .line 531
    aget-object v5, v5, v6

    .line 532
    .line 533
    const-class v6, Landroid/view/ViewGroup;

    .line 534
    .line 535
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 536
    .line 537
    .line 538
    move-result v5

    .line 539
    if-eqz v5, :cond_f

    .line 540
    .line 541
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    goto :goto_9

    .line 545
    :cond_10
    new-instance v0, Ljava/util/HashSet;

    .line 546
    .line 547
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 548
    .line 549
    .line 550
    new-instance v1, Ljava/util/ArrayList;

    .line 551
    .line 552
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    :cond_11
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    if-eqz v2, :cond_12

    .line 564
    .line 565
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    move-object v3, v2

    .line 570
    check-cast v3, Ljava/lang/reflect/Method;

    .line 571
    .line 572
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    invoke-static {v3}, Lr0/l1;->H(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    if-eqz v3, :cond_11

    .line 584
    .line 585
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    goto :goto_a

    .line 589
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-eqz v0, :cond_13

    .line 598
    .line 599
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    check-cast v0, Ljava/lang/reflect/Method;

    .line 604
    .line 605
    new-instance v1, Lr0/k1;

    .line 606
    .line 607
    const/4 v2, 0x2

    .line 608
    invoke-direct {v1, p0, v2}, Lr0/k1;-><init>(Lr0/l1;I)V

    .line 609
    .line 610
    .line 611
    invoke-static {v0, v1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 612
    .line 613
    .line 614
    goto :goto_b

    .line 615
    :cond_13
    :goto_c
    return-void
.end method

.method public final w(Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/widget/AbsListView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/widget/AbsListView;

    .line 7
    .line 8
    invoke-static {v0}, Lr0/l1;->z(Landroid/widget/AbsListView;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-static {v0}, Lr0/l1;->C(Landroid/widget/AbsListView;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/widget/ListAdapter;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0}, Lr0/l1;->q()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/ListAdapter;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lr0/l1;->G(Landroid/widget/ListAdapter;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Landroid/widget/ListAdapter;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lr0/l1;->v(Landroid/widget/ListAdapter;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    check-cast p1, Landroid/view/ViewGroup;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x0

    .line 76
    :goto_1
    if-ge v1, v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v3, "getChildAt(...)"

    .line 83
    .line 84
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v2}, Lr0/l1;->w(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    return-void
.end method

.method public final x(Landroid/app/Activity;Landroid/view/View;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "com.tencent.mm.ui.vas.VASCommonActivity"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "CleanChatting"

    .line 20
    .line 21
    invoke-static {p1, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v0, "odf"

    .line 34
    .line 35
    invoke-static {p2, v0, p1}, Lr0/l1;->f(Landroid/view/View;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    move v3, v1

    .line 43
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_b

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Landroid/view/View;

    .line 54
    .line 55
    instance-of v5, v4, Landroid/widget/TextView;

    .line 56
    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    check-cast v4, Landroid/widget/TextView;

    .line 60
    .line 61
    :goto_1
    const/4 v5, 0x0

    .line 62
    if-eqz v4, :cond_9

    .line 63
    .line 64
    if-eq v4, p2, :cond_9

    .line 65
    .line 66
    instance-of v6, v4, Landroid/view/ViewGroup;

    .line 67
    .line 68
    const-string v7, "bxc"

    .line 69
    .line 70
    const-string v8, "mie"

    .line 71
    .line 72
    const-string v9, "cut"

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-static {v4, v0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_2

    .line 81
    .line 82
    invoke-static {v4, v9}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_2

    .line 87
    .line 88
    invoke-static {v4, v8}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-nez v10, :cond_a

    .line 93
    .line 94
    invoke-static {v4, v7}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_2

    .line 99
    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :cond_2
    if-eqz v6, :cond_4

    .line 103
    .line 104
    invoke-static {v4, v0}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_4

    .line 109
    .line 110
    invoke-static {v4, v9}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_4

    .line 115
    .line 116
    move-object v9, v4

    .line 117
    check-cast v9, Landroid/view/ViewGroup;

    .line 118
    .line 119
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    instance-of v10, v10, Landroid/view/ViewGroup;

    .line 124
    .line 125
    if-eqz v10, :cond_4

    .line 126
    .line 127
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    const-string v10, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 132
    .line 133
    invoke-static {v9, v10}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    check-cast v9, Landroid/view/ViewGroup;

    .line 137
    .line 138
    invoke-static {v9, v8}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-nez v8, :cond_3

    .line 143
    .line 144
    invoke-static {v9, v7}, Lr0/l1;->g(Landroid/view/View;Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_4

    .line 149
    .line 150
    :cond_3
    move-object v4, v9

    .line 151
    goto :goto_4

    .line 152
    :cond_4
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    if-lez v7, :cond_5

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    move-object v8, v5

    .line 164
    :goto_2
    if-eqz v8, :cond_6

    .line 165
    .line 166
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    goto :goto_3

    .line 171
    :cond_6
    move v7, v1

    .line 172
    :goto_3
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-eqz v6, :cond_7

    .line 181
    .line 182
    if-lez v7, :cond_7

    .line 183
    .line 184
    int-to-float v6, v8

    .line 185
    int-to-float v7, v7

    .line 186
    const v8, 0x3f0ccccd    # 0.55f

    .line 187
    .line 188
    .line 189
    mul-float/2addr v7, v8

    .line 190
    cmpl-float v6, v6, v7

    .line 191
    .line 192
    if-ltz v6, :cond_7

    .line 193
    .line 194
    const/16 v6, 0x3c

    .line 195
    .line 196
    if-gt v6, v9, :cond_7

    .line 197
    .line 198
    const/16 v6, 0x169

    .line 199
    .line 200
    if-ge v9, v6, :cond_7

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_7
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    instance-of v6, v4, Landroid/view/View;

    .line 208
    .line 209
    if-eqz v6, :cond_8

    .line 210
    .line 211
    check-cast v4, Landroid/view/View;

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :cond_8
    move-object v4, v5

    .line 216
    goto/16 :goto_1

    .line 217
    .line 218
    :cond_9
    move-object v4, v5

    .line 219
    :cond_a
    :goto_4
    if-eqz v4, :cond_1

    .line 220
    .line 221
    move v3, v2

    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_b
    if-nez v3, :cond_f

    .line 225
    .line 226
    invoke-virtual {p0}, Lr0/l1;->r()Ljava/util/Set;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_c

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_c
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_e

    .line 246
    .line 247
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, Ljava/lang/String;

    .line 252
    .line 253
    new-instance v1, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-static {p2, v0, v1}, Lr0/l1;->f(Landroid/view/View;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_d

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_e
    :goto_5
    new-instance p1, LN0/k;

    .line 269
    .line 270
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 271
    .line 272
    .line 273
    new-instance v0, LC/d;

    .line 274
    .line 275
    const/4 v1, 0x7

    .line 276
    invoke-direct {v0, v1, p1}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-static {p2, v0}, Lr0/l1;->n(Landroid/view/View;LM0/l;)V

    .line 280
    .line 281
    .line 282
    iget-boolean p1, p1, LN0/k;->a:Z

    .line 283
    .line 284
    return p1

    .line 285
    :cond_f
    :goto_6
    return v2
.end method

.method public final y(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr0/l1;->k:LA0/Z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, LA0/Z;->b:Ljava/util/List;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v0, LF0/s;->a:LF0/s;

    .line 13
    .line 14
    :cond_1
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-object v2, v2, Lr0/j1;->b:Ljava/util/Set;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move-object v2, v1

    .line 24
    :goto_1
    if-nez v2, :cond_3

    .line 25
    .line 26
    sget-object v2, LF0/u;->a:LF0/u;

    .line 27
    .line 28
    :cond_3
    invoke-static {v0, v2}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v2, "storage"

    .line 41
    .line 42
    const-string v3, "item"

    .line 43
    .line 44
    invoke-static {v2, v3, v0}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_4
    invoke-interface {v0, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1
.end method
