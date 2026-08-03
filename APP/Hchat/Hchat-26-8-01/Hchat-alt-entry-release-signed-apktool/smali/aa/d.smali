.class public final Laa/d;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p4, p0, Laa/d;->a:I

    iput-object p1, p0, Laa/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Laa/d;->c:Ljava/lang/Object;

    iput-object p3, p0, Laa/d;->d:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo8/d;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Laa/d;->a:I

    .line 17
    iput-object p1, p0, Laa/d;->d:Ljava/lang/Object;

    iput-object p2, p0, Laa/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Laa/d;->c:Ljava/lang/Object;

    const/16 p1, -0x2710

    invoke-direct {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lr8/g;Ljava/util/List;Laa/e;Lk8/q;)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    .line 2
    iput p4, p0, Laa/d;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Laa/d;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Laa/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Laa/d;->d:Ljava/lang/Object;

    .line 9
    .line 10
    const/16 p1, 0x2710

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ls8/c;Lr8/g;Ljava/lang/reflect/Method;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Laa/d;->a:I

    iput-object p1, p0, Laa/d;->c:Ljava/lang/Object;

    iput-object p2, p0, Laa/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Laa/d;->d:Ljava/lang/Object;

    .line 18
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Laa/d;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v1, v0, Laa/d;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lo8/d;

    .line 15
    .line 16
    iget-object v2, v1, Lo8/d;->e:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x1

    .line 29
    if-gt v3, v4, :cond_15

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Laa/d;->b:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v6, v2

    .line 37
    check-cast v6, Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, v0, Laa/d;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    move-object/from16 v3, p1

    .line 44
    .line 45
    iget-object v5, v3, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-object v7, v1, Lo8/d;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-nez v7, :cond_16

    .line 58
    .line 59
    if-nez v5, :cond_0

    .line 60
    .line 61
    goto/16 :goto_e

    .line 62
    .line 63
    :cond_0
    instance-of v7, v3, Ljava/lang/Number;

    .line 64
    .line 65
    const-wide/16 v8, 0x0

    .line 66
    .line 67
    if-eqz v7, :cond_1

    .line 68
    .line 69
    check-cast v3, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v10

    .line 75
    move-wide v11, v10

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    move-wide v11, v8

    .line 78
    :goto_0
    const-string v3, "insert"

    .line 79
    .line 80
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    cmp-long v3, v11, v8

    .line 87
    .line 88
    if-gez v3, :cond_2

    .line 89
    .line 90
    goto/16 :goto_e

    .line 91
    .line 92
    :cond_2
    new-instance v3, Ll8/a;

    .line 93
    .line 94
    invoke-static {v5}, Lo8/d;->h([Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    :goto_1
    array-length v8, v5

    .line 99
    if-ge v4, v8, :cond_5

    .line 100
    .line 101
    aget-object v8, v5, v4

    .line 102
    .line 103
    instance-of v9, v8, Ljava/lang/String;

    .line 104
    .line 105
    if-eqz v9, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    instance-of v8, v8, Landroid/content/ContentValues;

    .line 109
    .line 110
    if-eqz v8, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    :goto_2
    invoke-static {v5}, Lo8/d;->a([Ljava/lang/Object;)Landroid/content/ContentValues;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    const/4 v9, 0x0

    .line 124
    const/4 v10, 0x0

    .line 125
    move-object v5, v3

    .line 126
    invoke-direct/range {v5 .. v12}, Ll8/a;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;J)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v5}, Lo8/d;->b(Ll8/a;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_e

    .line 133
    .line 134
    :cond_6
    const-string v3, "update"

    .line 135
    .line 136
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    const/4 v7, 0x0

    .line 141
    const-string v13, ""

    .line 142
    .line 143
    if-eqz v3, :cond_e

    .line 144
    .line 145
    cmp-long v3, v11, v8

    .line 146
    .line 147
    if-gtz v3, :cond_7

    .line 148
    .line 149
    goto/16 :goto_e

    .line 150
    .line 151
    :cond_7
    new-instance v3, Ll8/a;

    .line 152
    .line 153
    move-object v14, v7

    .line 154
    invoke-static {v5}, Lo8/d;->h([Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-static {v5}, Lo8/d;->a([Ljava/lang/Object;)Landroid/content/ContentValues;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    array-length v9, v5

    .line 163
    const/4 v15, 0x0

    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    :goto_3
    if-ge v15, v9, :cond_9

    .line 167
    .line 168
    move/from16 v17, v4

    .line 169
    .line 170
    aget-object v4, v5, v15

    .line 171
    .line 172
    instance-of v10, v4, Landroid/content/ContentValues;

    .line 173
    .line 174
    if-eqz v10, :cond_8

    .line 175
    .line 176
    move/from16 v16, v17

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_8
    if-eqz v16, :cond_a

    .line 180
    .line 181
    instance-of v10, v4, Ljava/lang/String;

    .line 182
    .line 183
    if-eqz v10, :cond_a

    .line 184
    .line 185
    move-object v13, v4

    .line 186
    check-cast v13, Ljava/lang/String;

    .line 187
    .line 188
    :cond_9
    move-object v9, v13

    .line 189
    goto :goto_5

    .line 190
    :cond_a
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 191
    .line 192
    move/from16 v4, v17

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :goto_5
    array-length v4, v5

    .line 196
    const/4 v10, 0x0

    .line 197
    :goto_6
    if-ge v10, v4, :cond_c

    .line 198
    .line 199
    aget-object v13, v5, v10

    .line 200
    .line 201
    instance-of v15, v13, [Ljava/lang/String;

    .line 202
    .line 203
    if-eqz v15, :cond_b

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_c
    move-object v13, v14

    .line 210
    :goto_7
    instance-of v4, v13, [Ljava/lang/String;

    .line 211
    .line 212
    if-eqz v4, :cond_d

    .line 213
    .line 214
    move-object v4, v13

    .line 215
    check-cast v4, [Ljava/lang/String;

    .line 216
    .line 217
    move-object v10, v4

    .line 218
    goto :goto_8

    .line 219
    :cond_d
    move-object v10, v14

    .line 220
    :goto_8
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-object v5, v3

    .line 224
    invoke-direct/range {v5 .. v12}, Ll8/a;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;J)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v5}, Lo8/d;->b(Ll8/a;)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_e

    .line 231
    .line 232
    :cond_e
    move/from16 v17, v4

    .line 233
    .line 234
    move-object v14, v7

    .line 235
    const-string v3, "delete"

    .line 236
    .line 237
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_16

    .line 242
    .line 243
    cmp-long v3, v11, v8

    .line 244
    .line 245
    if-lez v3, :cond_16

    .line 246
    .line 247
    array-length v3, v5

    .line 248
    const/4 v4, 0x3

    .line 249
    if-ge v3, v4, :cond_f

    .line 250
    .line 251
    goto :goto_e

    .line 252
    :cond_f
    new-instance v3, Ll8/a;

    .line 253
    .line 254
    invoke-static {v5}, Lo8/d;->h([Ljava/lang/Object;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    move/from16 v4, v17

    .line 259
    .line 260
    :goto_9
    array-length v8, v5

    .line 261
    if-ge v4, v8, :cond_10

    .line 262
    .line 263
    aget-object v8, v5, v4

    .line 264
    .line 265
    instance-of v9, v8, Ljava/lang/String;

    .line 266
    .line 267
    if-eqz v9, :cond_11

    .line 268
    .line 269
    move-object v13, v8

    .line 270
    check-cast v13, Ljava/lang/String;

    .line 271
    .line 272
    :cond_10
    move-object v9, v13

    .line 273
    goto :goto_a

    .line 274
    :cond_11
    add-int/lit8 v4, v4, 0x1

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :goto_a
    array-length v4, v5

    .line 278
    const/4 v10, 0x0

    .line 279
    :goto_b
    if-ge v10, v4, :cond_13

    .line 280
    .line 281
    aget-object v8, v5, v10

    .line 282
    .line 283
    instance-of v13, v8, [Ljava/lang/String;

    .line 284
    .line 285
    if-eqz v13, :cond_12

    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_12
    add-int/lit8 v10, v10, 0x1

    .line 289
    .line 290
    goto :goto_b

    .line 291
    :cond_13
    move-object v8, v14

    .line 292
    :goto_c
    instance-of v4, v8, [Ljava/lang/String;

    .line 293
    .line 294
    if-eqz v4, :cond_14

    .line 295
    .line 296
    move-object v4, v8

    .line 297
    check-cast v4, [Ljava/lang/String;

    .line 298
    .line 299
    move-object v10, v4

    .line 300
    goto :goto_d

    .line 301
    :cond_14
    move-object v10, v14

    .line 302
    :goto_d
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    const/4 v8, 0x0

    .line 306
    move-object v5, v3

    .line 307
    invoke-direct/range {v5 .. v12}, Ll8/a;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;J)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v5}, Lo8/d;->b(Ll8/a;)V

    .line 311
    .line 312
    .line 313
    goto :goto_e

    .line 314
    :cond_15
    move/from16 v17, v4

    .line 315
    .line 316
    add-int/lit8 v3, v3, -0x1

    .line 317
    .line 318
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_16
    :goto_e
    return-void

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Laa/d;->a:I

    .line 6
    .line 7
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v7, v1, Laa/d;->c:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    iget-object v9, v1, Laa/d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v10, v1, Laa/d;->d:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v4, v0, Landroid/content/Intent;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    check-cast v0, Landroid/content/Intent;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v0, v6

    .line 43
    :goto_0
    check-cast v10, Ljava/lang/ClassLoader;

    .line 44
    .line 45
    :try_start_0
    const-string v4, "com.tencent.tinker.loader.shareutil.ShareIntentUtil"

    .line 46
    .line 47
    invoke-virtual {v10, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v5, "setIntentReturnCode"

    .line 52
    .line 53
    const-class v10, Landroid/content/Intent;

    .line 54
    .line 55
    filled-new-array {v10, v3}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v4, v5, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    const/4 v4, -0x1

    .line 69
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v3, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    :catchall_0
    :cond_1
    check-cast v9, Luf/d;

    .line 81
    .line 82
    check-cast v7, Ljava/lang/reflect/Method;

    .line 83
    .line 84
    invoke-static {v9, v7}, Luf/d;->a(Luf/d;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast v7, Ls8/c;

    .line 96
    .line 97
    check-cast v9, Lr8/g;

    .line 98
    .line 99
    invoke-static {v7, v9}, Ls8/c;->k(Ls8/c;Lr8/g;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_9

    .line 104
    .line 105
    invoke-static {v9}, Ls8/c;->C(Lr8/g;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_2

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_2
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    goto :goto_1

    .line 121
    :cond_3
    move-object v0, v6

    .line 122
    :goto_1
    instance-of v4, v0, Ljava/lang/Number;

    .line 123
    .line 124
    if-eqz v4, :cond_4

    .line 125
    .line 126
    check-cast v0, Ljava/lang/Number;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    move-object v0, v6

    .line 130
    :goto_2
    if-eqz v0, :cond_9

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v11

    .line 136
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 137
    .line 138
    if-eqz v0, :cond_9

    .line 139
    .line 140
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_9

    .line 145
    .line 146
    invoke-static {v0}, Ls8/c;->I(Ljava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-static {v4}, Ls8/c;->B(I)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_5

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    iget-object v4, v7, Ls8/c;->g:Ljava/util/Set;

    .line 158
    .line 159
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-interface {v4, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-nez v4, :cond_6

    .line 168
    .line 169
    invoke-static {v0}, Ls8/c;->G(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_9

    .line 174
    .line 175
    :cond_6
    invoke-virtual {v7, v11, v12}, Ls8/c;->F(J)V

    .line 176
    .line 177
    .line 178
    check-cast v10, Ljava/lang/reflect/Method;

    .line 179
    .line 180
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_7

    .line 189
    .line 190
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    goto :goto_3

    .line 195
    :cond_7
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 196
    .line 197
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_8

    .line 202
    .line 203
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 204
    .line 205
    :cond_8
    :goto_3
    invoke-virtual {v2, v6}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_9
    :goto_4
    return-void

    .line 209
    :pswitch_1
    check-cast v10, Lo8/d;

    .line 210
    .line 211
    iget-object v0, v10, Lo8/d;->e:Ljava/lang/ThreadLocal;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    check-cast v3, Ljava/lang/Integer;

    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    add-int/2addr v3, v8

    .line 224
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v0, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    check-cast v9, Ljava/lang/String;

    .line 232
    .line 233
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 234
    .line 235
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 236
    .line 237
    if-nez v0, :cond_a

    .line 238
    .line 239
    goto/16 :goto_8

    .line 240
    .line 241
    :cond_a
    const-string v2, "insert"

    .line 242
    .line 243
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_b

    .line 248
    .line 249
    const-string v2, "update"

    .line 250
    .line 251
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-nez v2, :cond_b

    .line 256
    .line 257
    goto/16 :goto_8

    .line 258
    .line 259
    :cond_b
    invoke-static {v0}, Lo8/d;->a([Ljava/lang/Object;)Landroid/content/ContentValues;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    if-nez v2, :cond_c

    .line 264
    .line 265
    goto/16 :goto_8

    .line 266
    .line 267
    :cond_c
    invoke-static {v0}, Lo8/d;->h([Ljava/lang/Object;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_d

    .line 276
    .line 277
    goto/16 :goto_8

    .line 278
    .line 279
    :cond_d
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const-string v3, "message"

    .line 284
    .line 285
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    if-nez v3, :cond_e

    .line 290
    .line 291
    const-string v3, "message_"

    .line 292
    .line 293
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-nez v3, :cond_e

    .line 298
    .line 299
    const-string v3, "_message"

    .line 300
    .line 301
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_18

    .line 306
    .line 307
    :cond_e
    const-string v0, "msgSource"

    .line 308
    .line 309
    invoke-virtual {v2, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    const-string v5, "lvbuffer"

    .line 314
    .line 315
    if-nez v3, :cond_f

    .line 316
    .line 317
    invoke-virtual {v2, v5}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-nez v3, :cond_f

    .line 322
    .line 323
    const-string v3, "msgId"

    .line 324
    .line 325
    invoke-virtual {v2, v3}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-nez v3, :cond_f

    .line 330
    .line 331
    const-string v3, "msgSvrId"

    .line 332
    .line 333
    invoke-virtual {v2, v3}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-eqz v3, :cond_18

    .line 338
    .line 339
    :cond_f
    invoke-virtual {v2, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    if-nez v3, :cond_10

    .line 344
    .line 345
    goto/16 :goto_8

    .line 346
    .line 347
    :cond_10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-nez v3, :cond_12

    .line 352
    .line 353
    invoke-virtual {v2, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-nez v3, :cond_11

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_11
    :try_start_1
    invoke-virtual {v2, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 364
    if-eqz v3, :cond_12

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_12
    :goto_5
    move-object v3, v4

    .line 368
    goto :goto_6

    .line 369
    :catchall_1
    invoke-virtual {v2, v0}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    if-eqz v3, :cond_12

    .line 374
    .line 375
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    :goto_6
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-nez v3, :cond_13

    .line 384
    .line 385
    goto :goto_8

    .line 386
    :cond_13
    invoke-virtual {v2, v5}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    if-nez v3, :cond_14

    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_14
    :try_start_2
    invoke-virtual {v2, v5}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    if-eqz v3, :cond_15

    .line 398
    .line 399
    array-length v6, v3

    .line 400
    if-lez v6, :cond_15

    .line 401
    .line 402
    new-instance v6, Ljava/lang/String;

    .line 403
    .line 404
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    .line 406
    invoke-direct {v6, v3, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 407
    .line 408
    .line 409
    invoke-static {v6}, Lo8/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 414
    .line 415
    .line 416
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 417
    if-nez v6, :cond_15

    .line 418
    .line 419
    move-object v4, v3

    .line 420
    goto :goto_7

    .line 421
    :catchall_2
    :cond_15
    :try_start_3
    invoke-virtual {v2, v5}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    if-eqz v3, :cond_16

    .line 426
    .line 427
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-static {v3}, Lo8/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 435
    :catchall_3
    :cond_16
    :goto_7
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eqz v3, :cond_17

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_17
    invoke-virtual {v2, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    :cond_18
    :goto_8
    return-void

    .line 446
    :pswitch_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    check-cast v9, Lea/c;

    .line 450
    .line 451
    iget-object v0, v9, Lea/c;->b:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Landroid/content/SharedPreferences;

    .line 454
    .line 455
    const-string v3, "enable"

    .line 456
    .line 457
    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-nez v0, :cond_19

    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_19
    iget-object v0, v9, Lea/c;->b:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v0, Landroid/content/SharedPreferences;

    .line 467
    .line 468
    const-string v3, "sdk_id"

    .line 469
    .line 470
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    if-nez v0, :cond_1a

    .line 475
    .line 476
    move-object v0, v4

    .line 477
    :cond_1a
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    iget-object v3, v9, Lea/c;->b:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v3, Landroid/content/SharedPreferences;

    .line 488
    .line 489
    const-string v5, "sdk_app_name"

    .line 490
    .line 491
    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    if-nez v3, :cond_1b

    .line 496
    .line 497
    goto :goto_9

    .line 498
    :cond_1b
    move-object v4, v3

    .line 499
    :goto_9
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    if-nez v4, :cond_1d

    .line 512
    .line 513
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    if-eqz v4, :cond_1c

    .line 518
    .line 519
    goto :goto_a

    .line 520
    :cond_1c
    check-cast v7, Ljava/lang/reflect/Method;

    .line 521
    .line 522
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 523
    .line 524
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-static {v7, v4, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    check-cast v10, Ljava/lang/reflect/Method;

    .line 532
    .line 533
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 534
    .line 535
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-static {v10, v0, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    :cond_1d
    :goto_a
    return-void

    .line 543
    :pswitch_3
    const-string v3, "message_block_templates"

    .line 544
    .line 545
    check-cast v10, Laa/e;

    .line 546
    .line 547
    check-cast v9, Lr8/g;

    .line 548
    .line 549
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    iget-object v11, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 553
    .line 554
    if-eqz v11, :cond_7d

    .line 555
    .line 556
    iget-object v0, v9, Lr8/g;->a:Landroid/content/Context;

    .line 557
    .line 558
    const-string v12, "Hchat_message_block_config"

    .line 559
    .line 560
    invoke-static {v0, v12}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    const-string v0, "message_block_enable"

    .line 565
    .line 566
    :try_start_4
    invoke-interface {v12, v0, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 567
    .line 568
    .line 569
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 570
    goto :goto_b

    .line 571
    :catchall_4
    move v0, v5

    .line 572
    :goto_b
    if-nez v0, :cond_1e

    .line 573
    .line 574
    goto/16 :goto_45

    .line 575
    .line 576
    :cond_1e
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-eqz v0, :cond_1f

    .line 581
    .line 582
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    goto :goto_c

    .line 587
    :cond_1f
    move-object v0, v6

    .line 588
    :goto_c
    if-nez v0, :cond_20

    .line 589
    .line 590
    move-object v13, v4

    .line 591
    goto :goto_d

    .line 592
    :cond_20
    move-object v13, v0

    .line 593
    :goto_d
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_7d

    .line 602
    .line 603
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    check-cast v0, Ljava/lang/Number;

    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    invoke-static {v0, v11}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    if-eqz v0, :cond_7c

    .line 618
    .line 619
    :try_start_5
    invoke-static {v0, v13}, Lk8/q;->k(Ljava/lang/Object;Ljava/lang/String;)Ll8/e;

    .line 620
    .line 621
    .line 622
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 623
    goto :goto_f

    .line 624
    :catchall_5
    move-exception v0

    .line 625
    new-instance v14, Lsf/f;

    .line 626
    .line 627
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 628
    .line 629
    .line 630
    move-object v0, v14

    .line 631
    :goto_f
    nop

    .line 632
    instance-of v14, v0, Lsf/f;

    .line 633
    .line 634
    if-eqz v14, :cond_21

    .line 635
    .line 636
    move-object v0, v6

    .line 637
    :cond_21
    check-cast v0, Ll8/e;

    .line 638
    .line 639
    if-eqz v0, :cond_7c

    .line 640
    .line 641
    iget-object v14, v0, Ll8/e;->i:Ljava/lang/String;

    .line 642
    .line 643
    iget-object v15, v0, Ll8/e;->f:Ljava/lang/String;

    .line 644
    .line 645
    iget-object v6, v0, Ll8/e;->j:Ljava/lang/String;

    .line 646
    .line 647
    iget-object v5, v0, Ll8/e;->e:Ljava/lang/String;

    .line 648
    .line 649
    iget-object v8, v0, Ll8/e;->h:Ljava/lang/String;

    .line 650
    .line 651
    iget-object v1, v0, Ll8/e;->g:Ljava/lang/String;

    .line 652
    .line 653
    move-object/from16 v18, v5

    .line 654
    .line 655
    iget-object v5, v0, Ll8/e;->k:Ljava/lang/String;

    .line 656
    .line 657
    move-object/from16 v25, v6

    .line 658
    .line 659
    move-object/from16 v27, v7

    .line 660
    .line 661
    iget-wide v6, v0, Ll8/e;->c:J

    .line 662
    .line 663
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 664
    .line 665
    .line 666
    move-result v16

    .line 667
    move-wide/from16 v28, v6

    .line 668
    .line 669
    const-string v6, "@im.chatroom"

    .line 670
    .line 671
    const-string v7, "@chatroom"

    .line 672
    .line 673
    const-wide/16 v30, 0x3e8

    .line 674
    .line 675
    const-wide/16 v32, 0x0

    .line 676
    .line 677
    if-nez v16, :cond_22

    .line 678
    .line 679
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 680
    .line 681
    .line 682
    move-result v16

    .line 683
    if-eqz v16, :cond_23

    .line 684
    .line 685
    :cond_22
    :goto_10
    move-object/from16 v17, v3

    .line 686
    .line 687
    move-object/from16 v26, v5

    .line 688
    .line 689
    move-object v5, v8

    .line 690
    move-object/from16 v16, v11

    .line 691
    .line 692
    move-object/from16 v34, v13

    .line 693
    .line 694
    move-object/from16 v35, v14

    .line 695
    .line 696
    move-object/from16 v36, v15

    .line 697
    .line 698
    move-object v8, v1

    .line 699
    goto/16 :goto_36

    .line 700
    .line 701
    :cond_23
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 702
    .line 703
    .line 704
    move-result v16

    .line 705
    if-nez v16, :cond_24

    .line 706
    .line 707
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v16

    .line 711
    if-eqz v16, :cond_24

    .line 712
    .line 713
    goto :goto_10

    .line 714
    :cond_24
    sget-object v16, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 715
    .line 716
    cmp-long v17, v28, v32

    .line 717
    .line 718
    if-lez v17, :cond_25

    .line 719
    .line 720
    mul-long v19, v28, v30

    .line 721
    .line 722
    :goto_11
    move-object/from16 v17, v1

    .line 723
    .line 724
    goto :goto_12

    .line 725
    :cond_25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 726
    .line 727
    .line 728
    move-result-wide v19

    .line 729
    goto :goto_11

    .line 730
    :goto_12
    iget v1, v0, Ll8/e;->b:I

    .line 731
    .line 732
    move-object/from16 v34, v13

    .line 733
    .line 734
    move-object/from16 v35, v14

    .line 735
    .line 736
    iget-wide v13, v0, Ll8/e;->d:J

    .line 737
    .line 738
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    const/16 v21, 0x0

    .line 742
    .line 743
    move/from16 v22, v1

    .line 744
    .line 745
    move-object/from16 v26, v5

    .line 746
    .line 747
    move-object/from16 v16, v8

    .line 748
    .line 749
    move-wide/from16 v23, v13

    .line 750
    .line 751
    invoke-static/range {v16 .. v26}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    move-object/from16 v5, v16

    .line 756
    .line 757
    move-object/from16 v8, v17

    .line 758
    .line 759
    :try_start_6
    invoke-interface {v12, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 763
    if-eqz v13, :cond_26

    .line 764
    .line 765
    goto :goto_13

    .line 766
    :catchall_6
    :cond_26
    move-object v13, v4

    .line 767
    :goto_13
    invoke-static {v13}, La2/a;->C(Ljava/lang/String;)Ljava/util/List;

    .line 768
    .line 769
    .line 770
    move-result-object v13

    .line 771
    new-instance v14, Ljava/util/ArrayList;

    .line 772
    .line 773
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 774
    .line 775
    .line 776
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 777
    .line 778
    .line 779
    move-result-object v13

    .line 780
    :goto_14
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 781
    .line 782
    .line 783
    move-result v16

    .line 784
    if-eqz v16, :cond_28

    .line 785
    .line 786
    move-object/from16 v16, v11

    .line 787
    .line 788
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v11

    .line 792
    move-object/from16 v17, v13

    .line 793
    .line 794
    move-object v13, v11

    .line 795
    check-cast v13, Laa/h;

    .line 796
    .line 797
    iget-boolean v13, v13, Laa/h;->c:Z

    .line 798
    .line 799
    if-eqz v13, :cond_27

    .line 800
    .line 801
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    :cond_27
    move-object/from16 v11, v16

    .line 805
    .line 806
    move-object/from16 v13, v17

    .line 807
    .line 808
    goto :goto_14

    .line 809
    :cond_28
    move-object/from16 v16, v11

    .line 810
    .line 811
    invoke-static {v14}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 812
    .line 813
    .line 814
    move-result v11

    .line 815
    invoke-static {v11}, Ltf/y;->a0(I)I

    .line 816
    .line 817
    .line 818
    move-result v11

    .line 819
    const/16 v13, 0x10

    .line 820
    .line 821
    if-ge v11, v13, :cond_29

    .line 822
    .line 823
    move v11, v13

    .line 824
    :cond_29
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 825
    .line 826
    invoke-direct {v13, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 830
    .line 831
    .line 832
    move-result-object v11

    .line 833
    :goto_15
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 834
    .line 835
    .line 836
    move-result v17

    .line 837
    if-eqz v17, :cond_2a

    .line 838
    .line 839
    move-object/from16 v17, v11

    .line 840
    .line 841
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v11

    .line 845
    move-object/from16 v19, v14

    .line 846
    .line 847
    move-object v14, v11

    .line 848
    check-cast v14, Laa/h;

    .line 849
    .line 850
    iget-object v14, v14, Laa/h;->a:Ljava/lang/String;

    .line 851
    .line 852
    invoke-interface {v13, v14, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-object/from16 v11, v17

    .line 856
    .line 857
    move-object/from16 v14, v19

    .line 858
    .line 859
    goto :goto_15

    .line 860
    :cond_2a
    move-object/from16 v19, v14

    .line 861
    .line 862
    const-string v11, "message_block_bindings"

    .line 863
    .line 864
    :try_start_7
    invoke-interface {v12, v11, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 868
    if-eqz v11, :cond_2b

    .line 869
    .line 870
    goto :goto_16

    .line 871
    :catchall_7
    :cond_2b
    move-object v11, v4

    .line 872
    :goto_16
    invoke-static {v11}, La2/a;->w(Ljava/lang/String;)Ljava/util/List;

    .line 873
    .line 874
    .line 875
    move-result-object v14

    .line 876
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 877
    .line 878
    .line 879
    move-result v11

    .line 880
    if-nez v11, :cond_2c

    .line 881
    .line 882
    goto :goto_18

    .line 883
    :cond_2c
    :try_start_8
    invoke-interface {v12, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 887
    if-eqz v11, :cond_2d

    .line 888
    .line 889
    goto :goto_17

    .line 890
    :catchall_8
    :cond_2d
    move-object v11, v4

    .line 891
    :goto_17
    invoke-static {v11}, La2/a;->C(Ljava/lang/String;)Ljava/util/List;

    .line 892
    .line 893
    .line 894
    move-result-object v11

    .line 895
    invoke-static {v11}, La2/a;->m(Ljava/util/List;)Ljava/util/List;

    .line 896
    .line 897
    .line 898
    move-result-object v14

    .line 899
    :goto_18
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 900
    .line 901
    .line 902
    move-result v11

    .line 903
    if-nez v11, :cond_49

    .line 904
    .line 905
    new-instance v11, Ljava/util/ArrayList;

    .line 906
    .line 907
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 908
    .line 909
    .line 910
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 911
    .line 912
    .line 913
    move-result-object v14

    .line 914
    :goto_19
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 915
    .line 916
    .line 917
    move-result v17

    .line 918
    if-eqz v17, :cond_32

    .line 919
    .line 920
    move-object/from16 v17, v3

    .line 921
    .line 922
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v3

    .line 926
    move-object/from16 v20, v14

    .line 927
    .line 928
    move-object v14, v3

    .line 929
    check-cast v14, Laa/a;

    .line 930
    .line 931
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 935
    .line 936
    .line 937
    move-result v21

    .line 938
    if-nez v21, :cond_2e

    .line 939
    .line 940
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 941
    .line 942
    .line 943
    move-result v21

    .line 944
    if-eqz v21, :cond_2f

    .line 945
    .line 946
    :cond_2e
    move-object/from16 v36, v15

    .line 947
    .line 948
    goto :goto_1a

    .line 949
    :cond_2f
    move-object/from16 v36, v15

    .line 950
    .line 951
    iget-object v15, v14, Laa/a;->b:Ljava/lang/String;

    .line 952
    .line 953
    const-string v2, "group_member"

    .line 954
    .line 955
    invoke-static {v15, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v2

    .line 959
    iget-object v14, v14, Laa/a;->c:Ljava/lang/String;

    .line 960
    .line 961
    if-eqz v2, :cond_30

    .line 962
    .line 963
    invoke-static {v14, v5, v8}, Laa/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 964
    .line 965
    .line 966
    move-result v2

    .line 967
    goto :goto_1b

    .line 968
    :cond_30
    invoke-static {v14, v5, v8}, Laa/f;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    goto :goto_1b

    .line 973
    :goto_1a
    const/4 v2, 0x0

    .line 974
    :goto_1b
    if-eqz v2, :cond_31

    .line 975
    .line 976
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    :cond_31
    move-object/from16 v2, p1

    .line 980
    .line 981
    move-object/from16 v3, v17

    .line 982
    .line 983
    move-object/from16 v14, v20

    .line 984
    .line 985
    move-object/from16 v15, v36

    .line 986
    .line 987
    goto :goto_19

    .line 988
    :cond_32
    move-object/from16 v17, v3

    .line 989
    .line 990
    move-object/from16 v36, v15

    .line 991
    .line 992
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 993
    .line 994
    .line 995
    move-result v2

    .line 996
    if-nez v2, :cond_4a

    .line 997
    .line 998
    new-instance v2, Ljava/util/ArrayList;

    .line 999
    .line 1000
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v3

    .line 1007
    :cond_33
    :goto_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v11

    .line 1011
    if-eqz v11, :cond_34

    .line 1012
    .line 1013
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v11

    .line 1017
    move-object v14, v11

    .line 1018
    check-cast v14, Laa/a;

    .line 1019
    .line 1020
    iget-boolean v14, v14, Laa/a;->e:Z

    .line 1021
    .line 1022
    if-eqz v14, :cond_33

    .line 1023
    .line 1024
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    goto :goto_1c

    .line 1028
    :cond_34
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1029
    .line 1030
    .line 1031
    move-result v3

    .line 1032
    if-eqz v3, :cond_35

    .line 1033
    .line 1034
    goto/16 :goto_36

    .line 1035
    .line 1036
    :cond_35
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v3

    .line 1040
    if-eqz v3, :cond_36

    .line 1041
    .line 1042
    goto :goto_1e

    .line 1043
    :cond_36
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v3

    .line 1047
    :cond_37
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1048
    .line 1049
    .line 1050
    move-result v11

    .line 1051
    if-eqz v11, :cond_39

    .line 1052
    .line 1053
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v11

    .line 1057
    check-cast v11, Laa/a;

    .line 1058
    .line 1059
    iget-object v14, v11, Laa/a;->f:Ljava/lang/String;

    .line 1060
    .line 1061
    const-string v15, "exclude"

    .line 1062
    .line 1063
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v14

    .line 1067
    if-eqz v14, :cond_38

    .line 1068
    .line 1069
    invoke-static {v11, v13}, Laa/e;->k(Laa/a;Ljava/util/LinkedHashMap;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v11

    .line 1073
    if-eqz v11, :cond_38

    .line 1074
    .line 1075
    const/4 v11, 0x1

    .line 1076
    goto :goto_1d

    .line 1077
    :cond_38
    const/4 v11, 0x0

    .line 1078
    :goto_1d
    if-eqz v11, :cond_37

    .line 1079
    .line 1080
    goto/16 :goto_36

    .line 1081
    .line 1082
    :cond_39
    :goto_1e
    new-instance v3, Ljava/util/ArrayList;

    .line 1083
    .line 1084
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    :cond_3a
    :goto_1f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v11

    .line 1095
    if-eqz v11, :cond_3b

    .line 1096
    .line 1097
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v11

    .line 1101
    move-object v14, v11

    .line 1102
    check-cast v14, Laa/a;

    .line 1103
    .line 1104
    iget-object v14, v14, Laa/a;->f:Ljava/lang/String;

    .line 1105
    .line 1106
    const-string v15, "block"

    .line 1107
    .line 1108
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v14

    .line 1112
    if-eqz v14, :cond_3a

    .line 1113
    .line 1114
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    goto :goto_1f

    .line 1118
    :cond_3b
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v2

    .line 1122
    if-eqz v2, :cond_3c

    .line 1123
    .line 1124
    goto :goto_21

    .line 1125
    :cond_3c
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    :cond_3d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1130
    .line 1131
    .line 1132
    move-result v11

    .line 1133
    if-eqz v11, :cond_3f

    .line 1134
    .line 1135
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v11

    .line 1139
    check-cast v11, Laa/a;

    .line 1140
    .line 1141
    iget-boolean v14, v11, Laa/a;->h:Z

    .line 1142
    .line 1143
    if-eqz v14, :cond_3e

    .line 1144
    .line 1145
    invoke-static {v11, v13}, Laa/e;->k(Laa/a;Ljava/util/LinkedHashMap;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v14

    .line 1149
    if-eqz v14, :cond_3e

    .line 1150
    .line 1151
    iget-boolean v14, v11, Laa/a;->i:Z

    .line 1152
    .line 1153
    iget-object v15, v11, Laa/a;->j:Ljava/util/Set;

    .line 1154
    .line 1155
    iget-object v11, v11, Laa/a;->k:Ljava/lang/String;

    .line 1156
    .line 1157
    invoke-static {v14, v15, v11, v0, v1}, Laa/e;->l(ZLjava/util/Set;Ljava/lang/String;Ll8/e;Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v11

    .line 1161
    if-eqz v11, :cond_3e

    .line 1162
    .line 1163
    const/4 v11, 0x1

    .line 1164
    goto :goto_20

    .line 1165
    :cond_3e
    const/4 v11, 0x0

    .line 1166
    :goto_20
    if-eqz v11, :cond_3d

    .line 1167
    .line 1168
    goto/16 :goto_35

    .line 1169
    .line 1170
    :cond_3f
    :goto_21
    new-instance v2, Ljava/util/ArrayList;

    .line 1171
    .line 1172
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    :cond_40
    :goto_22
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1180
    .line 1181
    .line 1182
    move-result v11

    .line 1183
    if-eqz v11, :cond_41

    .line 1184
    .line 1185
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v11

    .line 1189
    move-object v14, v11

    .line 1190
    check-cast v14, Laa/a;

    .line 1191
    .line 1192
    iget-boolean v14, v14, Laa/a;->h:Z

    .line 1193
    .line 1194
    if-nez v14, :cond_40

    .line 1195
    .line 1196
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1197
    .line 1198
    .line 1199
    goto :goto_22

    .line 1200
    :cond_41
    new-instance v3, Ljava/util/ArrayList;

    .line 1201
    .line 1202
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v2

    .line 1209
    :goto_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v11

    .line 1213
    if-eqz v11, :cond_42

    .line 1214
    .line 1215
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v11

    .line 1219
    check-cast v11, Laa/a;

    .line 1220
    .line 1221
    iget-object v11, v11, Laa/a;->g:Ljava/util/Set;

    .line 1222
    .line 1223
    check-cast v11, Ljava/lang/Iterable;

    .line 1224
    .line 1225
    check-cast v11, Ljava/lang/Iterable;

    .line 1226
    .line 1227
    invoke-static {v3, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1228
    .line 1229
    .line 1230
    goto :goto_23

    .line 1231
    :cond_42
    new-instance v2, Ljava/util/ArrayList;

    .line 1232
    .line 1233
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v3

    .line 1240
    :cond_43
    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1241
    .line 1242
    .line 1243
    move-result v11

    .line 1244
    if-eqz v11, :cond_44

    .line 1245
    .line 1246
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v11

    .line 1250
    check-cast v11, Ljava/lang/String;

    .line 1251
    .line 1252
    invoke-virtual {v13, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v11

    .line 1256
    check-cast v11, Laa/h;

    .line 1257
    .line 1258
    if-eqz v11, :cond_43

    .line 1259
    .line 1260
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    goto :goto_24

    .line 1264
    :cond_44
    new-instance v3, Ljava/util/HashSet;

    .line 1265
    .line 1266
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 1267
    .line 1268
    .line 1269
    new-instance v11, Ljava/util/ArrayList;

    .line 1270
    .line 1271
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v2

    .line 1278
    :cond_45
    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v13

    .line 1282
    if-eqz v13, :cond_46

    .line 1283
    .line 1284
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v13

    .line 1288
    move-object v14, v13

    .line 1289
    check-cast v14, Laa/h;

    .line 1290
    .line 1291
    iget-object v14, v14, Laa/h;->a:Ljava/lang/String;

    .line 1292
    .line 1293
    invoke-virtual {v3, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v14

    .line 1297
    if-eqz v14, :cond_45

    .line 1298
    .line 1299
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    goto :goto_25

    .line 1303
    :cond_46
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1304
    .line 1305
    .line 1306
    move-result v2

    .line 1307
    if-eqz v2, :cond_47

    .line 1308
    .line 1309
    goto/16 :goto_36

    .line 1310
    .line 1311
    :cond_47
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    :cond_48
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1316
    .line 1317
    .line 1318
    move-result v3

    .line 1319
    if-eqz v3, :cond_64

    .line 1320
    .line 1321
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v3

    .line 1325
    check-cast v3, Laa/h;

    .line 1326
    .line 1327
    iget-boolean v11, v3, Laa/h;->i:Z

    .line 1328
    .line 1329
    iget-object v13, v3, Laa/h;->j:Ljava/util/Set;

    .line 1330
    .line 1331
    iget-object v3, v3, Laa/h;->k:Ljava/lang/String;

    .line 1332
    .line 1333
    invoke-static {v11, v13, v3, v0, v1}, Laa/e;->l(ZLjava/util/Set;Ljava/lang/String;Ll8/e;Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 1334
    .line 1335
    .line 1336
    move-result v3

    .line 1337
    if-eqz v3, :cond_48

    .line 1338
    .line 1339
    goto/16 :goto_35

    .line 1340
    .line 1341
    :cond_49
    move-object/from16 v17, v3

    .line 1342
    .line 1343
    move-object/from16 v36, v15

    .line 1344
    .line 1345
    :cond_4a
    invoke-virtual {v1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOfficialAccount()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v2

    .line 1349
    if-eqz v2, :cond_4c

    .line 1350
    .line 1351
    const-string v2, "message_block_default_official"

    .line 1352
    .line 1353
    :try_start_9
    invoke-interface {v12, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1357
    if-eqz v2, :cond_4b

    .line 1358
    .line 1359
    :goto_26
    const/4 v3, 0x0

    .line 1360
    const/4 v11, 0x1

    .line 1361
    goto :goto_27

    .line 1362
    :catchall_9
    :cond_4b
    move-object v2, v4

    .line 1363
    goto :goto_26

    .line 1364
    :goto_27
    invoke-static {v2, v3, v11}, La2/a;->x(Ljava/lang/String;ZZ)Laa/b;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v2

    .line 1368
    goto :goto_2d

    .line 1369
    :cond_4c
    const/4 v3, 0x0

    .line 1370
    invoke-static {v5, v7, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v2

    .line 1374
    if-nez v2, :cond_4f

    .line 1375
    .line 1376
    invoke-static {v5, v6, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1377
    .line 1378
    .line 1379
    move-result v2

    .line 1380
    if-eqz v2, :cond_4d

    .line 1381
    .line 1382
    goto :goto_2a

    .line 1383
    :cond_4d
    const-string v2, "message_block_default_private"

    .line 1384
    .line 1385
    :try_start_a
    invoke-interface {v12, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1389
    if-eqz v2, :cond_4e

    .line 1390
    .line 1391
    :goto_28
    const/4 v3, 0x0

    .line 1392
    goto :goto_29

    .line 1393
    :catchall_a
    :cond_4e
    move-object v2, v4

    .line 1394
    goto :goto_28

    .line 1395
    :goto_29
    invoke-static {v2, v3, v3}, La2/a;->x(Ljava/lang/String;ZZ)Laa/b;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v2

    .line 1399
    goto :goto_2d

    .line 1400
    :cond_4f
    :goto_2a
    const-string v2, "message_block_default_group"

    .line 1401
    .line 1402
    :try_start_b
    invoke-interface {v12, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1406
    if-eqz v2, :cond_50

    .line 1407
    .line 1408
    :goto_2b
    const/4 v3, 0x0

    .line 1409
    const/4 v11, 0x1

    .line 1410
    goto :goto_2c

    .line 1411
    :catchall_b
    :cond_50
    move-object v2, v4

    .line 1412
    goto :goto_2b

    .line 1413
    :goto_2c
    invoke-static {v2, v11, v3}, La2/a;->x(Ljava/lang/String;ZZ)Laa/b;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v2

    .line 1417
    :goto_2d
    iget-boolean v3, v2, Laa/b;->d:Z

    .line 1418
    .line 1419
    if-eqz v3, :cond_58

    .line 1420
    .line 1421
    iget-boolean v3, v2, Laa/b;->f:Z

    .line 1422
    .line 1423
    if-eqz v3, :cond_51

    .line 1424
    .line 1425
    iget-boolean v3, v2, Laa/b;->g:Z

    .line 1426
    .line 1427
    iget-object v11, v2, Laa/b;->h:Ljava/util/Set;

    .line 1428
    .line 1429
    iget-object v2, v2, Laa/b;->i:Ljava/lang/String;

    .line 1430
    .line 1431
    invoke-static {v3, v11, v2, v0, v1}, Laa/e;->l(ZLjava/util/Set;Ljava/lang/String;Ll8/e;Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v1

    .line 1435
    goto/16 :goto_37

    .line 1436
    .line 1437
    :cond_51
    iget-object v2, v2, Laa/b;->e:Ljava/util/Set;

    .line 1438
    .line 1439
    check-cast v2, Ljava/lang/Iterable;

    .line 1440
    .line 1441
    new-instance v3, Ljava/util/ArrayList;

    .line 1442
    .line 1443
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1444
    .line 1445
    .line 1446
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v2

    .line 1450
    :cond_52
    :goto_2e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1451
    .line 1452
    .line 1453
    move-result v11

    .line 1454
    if-eqz v11, :cond_53

    .line 1455
    .line 1456
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v11

    .line 1460
    check-cast v11, Ljava/lang/String;

    .line 1461
    .line 1462
    invoke-virtual {v13, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v11

    .line 1466
    check-cast v11, Laa/h;

    .line 1467
    .line 1468
    if-eqz v11, :cond_52

    .line 1469
    .line 1470
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1471
    .line 1472
    .line 1473
    goto :goto_2e

    .line 1474
    :cond_53
    new-instance v2, Ljava/util/HashSet;

    .line 1475
    .line 1476
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1477
    .line 1478
    .line 1479
    new-instance v11, Ljava/util/ArrayList;

    .line 1480
    .line 1481
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v3

    .line 1488
    :cond_54
    :goto_2f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1489
    .line 1490
    .line 1491
    move-result v13

    .line 1492
    if-eqz v13, :cond_55

    .line 1493
    .line 1494
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v13

    .line 1498
    move-object v14, v13

    .line 1499
    check-cast v14, Laa/h;

    .line 1500
    .line 1501
    iget-object v14, v14, Laa/h;->a:Ljava/lang/String;

    .line 1502
    .line 1503
    invoke-virtual {v2, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1504
    .line 1505
    .line 1506
    move-result v14

    .line 1507
    if-eqz v14, :cond_54

    .line 1508
    .line 1509
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1510
    .line 1511
    .line 1512
    goto :goto_2f

    .line 1513
    :cond_55
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1514
    .line 1515
    .line 1516
    move-result v2

    .line 1517
    if-eqz v2, :cond_56

    .line 1518
    .line 1519
    goto/16 :goto_36

    .line 1520
    .line 1521
    :cond_56
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v2

    .line 1525
    :cond_57
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1526
    .line 1527
    .line 1528
    move-result v3

    .line 1529
    if-eqz v3, :cond_64

    .line 1530
    .line 1531
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v3

    .line 1535
    check-cast v3, Laa/h;

    .line 1536
    .line 1537
    iget-boolean v11, v3, Laa/h;->i:Z

    .line 1538
    .line 1539
    iget-object v13, v3, Laa/h;->j:Ljava/util/Set;

    .line 1540
    .line 1541
    iget-object v3, v3, Laa/h;->k:Ljava/lang/String;

    .line 1542
    .line 1543
    invoke-static {v11, v13, v3, v0, v1}, Laa/e;->l(ZLjava/util/Set;Ljava/lang/String;Ll8/e;Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 1544
    .line 1545
    .line 1546
    move-result v3

    .line 1547
    if-eqz v3, :cond_57

    .line 1548
    .line 1549
    goto/16 :goto_35

    .line 1550
    .line 1551
    :cond_58
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1552
    .line 1553
    .line 1554
    move-result v2

    .line 1555
    if-eqz v2, :cond_59

    .line 1556
    .line 1557
    goto/16 :goto_36

    .line 1558
    .line 1559
    :cond_59
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1560
    .line 1561
    .line 1562
    move-result v2

    .line 1563
    if-eqz v2, :cond_5a

    .line 1564
    .line 1565
    goto :goto_32

    .line 1566
    :cond_5a
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v2

    .line 1570
    :cond_5b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1571
    .line 1572
    .line 1573
    move-result v3

    .line 1574
    if-eqz v3, :cond_5e

    .line 1575
    .line 1576
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v3

    .line 1580
    check-cast v3, Laa/h;

    .line 1581
    .line 1582
    iget-object v11, v3, Laa/h;->g:Ljava/lang/String;

    .line 1583
    .line 1584
    invoke-static {v11, v5, v8}, Laa/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v11

    .line 1588
    if-nez v11, :cond_5d

    .line 1589
    .line 1590
    iget-object v3, v3, Laa/h;->h:Ljava/lang/String;

    .line 1591
    .line 1592
    invoke-static {v3, v5, v8}, Laa/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1593
    .line 1594
    .line 1595
    move-result v3

    .line 1596
    if-eqz v3, :cond_5c

    .line 1597
    .line 1598
    goto :goto_30

    .line 1599
    :cond_5c
    const/4 v3, 0x0

    .line 1600
    goto :goto_31

    .line 1601
    :cond_5d
    :goto_30
    const/4 v3, 0x1

    .line 1602
    :goto_31
    if-eqz v3, :cond_5b

    .line 1603
    .line 1604
    goto :goto_36

    .line 1605
    :cond_5e
    :goto_32
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1606
    .line 1607
    .line 1608
    move-result v2

    .line 1609
    if-eqz v2, :cond_5f

    .line 1610
    .line 1611
    goto :goto_36

    .line 1612
    :cond_5f
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v2

    .line 1616
    :cond_60
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1617
    .line 1618
    .line 1619
    move-result v3

    .line 1620
    if-eqz v3, :cond_64

    .line 1621
    .line 1622
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v3

    .line 1626
    check-cast v3, Laa/h;

    .line 1627
    .line 1628
    iget v11, v3, Laa/h;->d:I

    .line 1629
    .line 1630
    const/4 v13, 0x1

    .line 1631
    if-ne v11, v13, :cond_61

    .line 1632
    .line 1633
    goto :goto_33

    .line 1634
    :cond_61
    iget-object v11, v3, Laa/h;->e:Ljava/lang/String;

    .line 1635
    .line 1636
    invoke-static {v11, v5, v8}, Laa/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1637
    .line 1638
    .line 1639
    move-result v11

    .line 1640
    if-nez v11, :cond_63

    .line 1641
    .line 1642
    iget-object v11, v3, Laa/h;->f:Ljava/lang/String;

    .line 1643
    .line 1644
    invoke-static {v11, v5, v8}, Laa/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1645
    .line 1646
    .line 1647
    move-result v11

    .line 1648
    if-eqz v11, :cond_62

    .line 1649
    .line 1650
    goto :goto_33

    .line 1651
    :cond_62
    const/4 v3, 0x0

    .line 1652
    goto :goto_34

    .line 1653
    :cond_63
    :goto_33
    iget-boolean v11, v3, Laa/h;->i:Z

    .line 1654
    .line 1655
    iget-object v13, v3, Laa/h;->j:Ljava/util/Set;

    .line 1656
    .line 1657
    iget-object v3, v3, Laa/h;->k:Ljava/lang/String;

    .line 1658
    .line 1659
    invoke-static {v11, v13, v3, v0, v1}, Laa/e;->l(ZLjava/util/Set;Ljava/lang/String;Ll8/e;Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 1660
    .line 1661
    .line 1662
    move-result v3

    .line 1663
    :goto_34
    if-eqz v3, :cond_60

    .line 1664
    .line 1665
    :goto_35
    const/4 v1, 0x1

    .line 1666
    goto :goto_37

    .line 1667
    :cond_64
    :goto_36
    const/4 v1, 0x0

    .line 1668
    :goto_37
    if-eqz v1, :cond_7b

    .line 1669
    .line 1670
    sget-object v1, Lx9/d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1671
    .line 1672
    iget-object v1, v9, Lr8/g;->a:Landroid/content/Context;

    .line 1673
    .line 1674
    new-instance v2, Lx9/e;

    .line 1675
    .line 1676
    invoke-direct {v2, v1}, Lx9/e;-><init>(Landroid/content/Context;)V

    .line 1677
    .line 1678
    .line 1679
    const-string v1, "keyword_notify_enable"

    .line 1680
    .line 1681
    const/4 v3, 0x0

    .line 1682
    invoke-virtual {v2, v1, v3}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 1683
    .line 1684
    .line 1685
    move-result v1

    .line 1686
    if-nez v1, :cond_66

    .line 1687
    .line 1688
    :cond_65
    :goto_38
    move-object/from16 v17, v8

    .line 1689
    .line 1690
    move-object/from16 v3, v25

    .line 1691
    .line 1692
    move-object/from16 v21, v35

    .line 1693
    .line 1694
    move-object/from16 v15, v36

    .line 1695
    .line 1696
    const/4 v1, 0x0

    .line 1697
    goto/16 :goto_43

    .line 1698
    .line 1699
    :cond_66
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1700
    .line 1701
    .line 1702
    move-result v1

    .line 1703
    if-nez v1, :cond_65

    .line 1704
    .line 1705
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v1

    .line 1709
    if-nez v1, :cond_65

    .line 1710
    .line 1711
    invoke-static/range {v18 .. v18}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v1

    .line 1715
    if-eqz v1, :cond_67

    .line 1716
    .line 1717
    goto :goto_38

    .line 1718
    :cond_67
    invoke-virtual {v2, v5}, Lx9/e;->e(Ljava/lang/String;)Z

    .line 1719
    .line 1720
    .line 1721
    move-result v1

    .line 1722
    if-nez v1, :cond_68

    .line 1723
    .line 1724
    goto :goto_38

    .line 1725
    :cond_68
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 1726
    .line 1727
    cmp-long v3, v28, v32

    .line 1728
    .line 1729
    if-lez v3, :cond_69

    .line 1730
    .line 1731
    mul-long v3, v28, v30

    .line 1732
    .line 1733
    :goto_39
    move-wide/from16 v19, v3

    .line 1734
    .line 1735
    goto :goto_3a

    .line 1736
    :cond_69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1737
    .line 1738
    .line 1739
    move-result-wide v3

    .line 1740
    goto :goto_39

    .line 1741
    :goto_3a
    iget v3, v0, Ll8/e;->b:I

    .line 1742
    .line 1743
    iget-wide v11, v0, Ll8/e;->d:J

    .line 1744
    .line 1745
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1746
    .line 1747
    .line 1748
    const/16 v21, 0x0

    .line 1749
    .line 1750
    move/from16 v22, v3

    .line 1751
    .line 1752
    move-object/from16 v16, v5

    .line 1753
    .line 1754
    move-object/from16 v17, v8

    .line 1755
    .line 1756
    move-wide/from16 v23, v11

    .line 1757
    .line 1758
    invoke-static/range {v16 .. v26}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v1

    .line 1762
    move-object/from16 v3, v25

    .line 1763
    .line 1764
    invoke-static {v1}, Lx9/d;->h(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v16

    .line 1768
    invoke-virtual {v1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 1769
    .line 1770
    .line 1771
    move-result v4

    .line 1772
    if-nez v4, :cond_6b

    .line 1773
    .line 1774
    const/4 v4, 0x0

    .line 1775
    invoke-static {v5, v7, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1776
    .line 1777
    .line 1778
    move-result v8

    .line 1779
    if-nez v8, :cond_6b

    .line 1780
    .line 1781
    invoke-static {v5, v6, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1782
    .line 1783
    .line 1784
    move-result v8

    .line 1785
    if-eqz v8, :cond_6a

    .line 1786
    .line 1787
    goto :goto_3b

    .line 1788
    :cond_6a
    const/16 v22, 0x0

    .line 1789
    .line 1790
    goto :goto_3c

    .line 1791
    :cond_6b
    :goto_3b
    const/16 v22, 0x1

    .line 1792
    .line 1793
    :goto_3c
    new-instance v14, Lk8/o;

    .line 1794
    .line 1795
    const/16 v24, 0x0

    .line 1796
    .line 1797
    const-string v15, "message_block_precheck"

    .line 1798
    .line 1799
    const/16 v23, 0x0

    .line 1800
    .line 1801
    move-object/from16 v25, v1

    .line 1802
    .line 1803
    move-object/from16 v19, v18

    .line 1804
    .line 1805
    move-object/from16 v21, v35

    .line 1806
    .line 1807
    move-object/from16 v20, v36

    .line 1808
    .line 1809
    move-object/from16 v18, v17

    .line 1810
    .line 1811
    move-object/from16 v17, v5

    .line 1812
    .line 1813
    invoke-direct/range {v14 .. v25}, Lk8/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 1814
    .line 1815
    .line 1816
    move-object/from16 v17, v18

    .line 1817
    .line 1818
    move-object/from16 v18, v19

    .line 1819
    .line 1820
    move-object/from16 v15, v20

    .line 1821
    .line 1822
    if-nez v22, :cond_6d

    .line 1823
    .line 1824
    invoke-virtual {v14}, Lk8/o;->j()Z

    .line 1825
    .line 1826
    .line 1827
    move-result v1

    .line 1828
    if-nez v1, :cond_6d

    .line 1829
    .line 1830
    const/4 v1, 0x0

    .line 1831
    invoke-static {v5, v7, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1832
    .line 1833
    .line 1834
    move-result v4

    .line 1835
    if-nez v4, :cond_6e

    .line 1836
    .line 1837
    invoke-static {v5, v6, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1838
    .line 1839
    .line 1840
    move-result v4

    .line 1841
    if-eqz v4, :cond_6c

    .line 1842
    .line 1843
    goto :goto_3d

    .line 1844
    :cond_6c
    move v4, v1

    .line 1845
    goto :goto_3e

    .line 1846
    :cond_6d
    const/4 v1, 0x0

    .line 1847
    :cond_6e
    :goto_3d
    const/4 v4, 0x1

    .line 1848
    :goto_3e
    if-nez v22, :cond_70

    .line 1849
    .line 1850
    invoke-virtual {v14}, Lk8/o;->j()Z

    .line 1851
    .line 1852
    .line 1853
    move-result v8

    .line 1854
    if-nez v8, :cond_70

    .line 1855
    .line 1856
    invoke-static {v5, v7, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1857
    .line 1858
    .line 1859
    move-result v7

    .line 1860
    if-nez v7, :cond_70

    .line 1861
    .line 1862
    invoke-static {v5, v6, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1863
    .line 1864
    .line 1865
    move-result v6

    .line 1866
    if-eqz v6, :cond_6f

    .line 1867
    .line 1868
    goto :goto_3f

    .line 1869
    :cond_6f
    move v6, v1

    .line 1870
    goto :goto_40

    .line 1871
    :cond_70
    :goto_3f
    const/4 v6, 0x1

    .line 1872
    :goto_40
    iget-object v7, v14, Lk8/o;->e:Ljava/lang/String;

    .line 1873
    .line 1874
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1875
    .line 1876
    .line 1877
    move-result v8

    .line 1878
    if-eqz v8, :cond_71

    .line 1879
    .line 1880
    invoke-virtual {v14}, Lk8/o;->a()Ljava/lang/String;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v7

    .line 1884
    :cond_71
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1885
    .line 1886
    .line 1887
    invoke-static {v14, v7}, Lx9/d;->j(Lk8/o;Ljava/lang/String;)Ljava/lang/String;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v8

    .line 1891
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1892
    .line 1893
    .line 1894
    move-result v11

    .line 1895
    if-eqz v11, :cond_73

    .line 1896
    .line 1897
    :cond_72
    const/4 v11, 0x0

    .line 1898
    goto :goto_41

    .line 1899
    :cond_73
    invoke-static {v2, v14, v6, v7, v8}, Lx9/d;->g(Lx9/e;Lk8/o;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v7

    .line 1903
    if-eqz v7, :cond_72

    .line 1904
    .line 1905
    new-instance v11, Lx9/b;

    .line 1906
    .line 1907
    invoke-direct {v11, v7, v8, v6}, Lx9/b;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1908
    .line 1909
    .line 1910
    :goto_41
    if-eqz v11, :cond_74

    .line 1911
    .line 1912
    const/4 v11, 0x1

    .line 1913
    goto :goto_42

    .line 1914
    :cond_74
    if-nez v4, :cond_75

    .line 1915
    .line 1916
    goto :goto_43

    .line 1917
    :cond_75
    const-string v4, "keyword_notify_at_all"

    .line 1918
    .line 1919
    const/4 v11, 0x1

    .line 1920
    invoke-virtual {v2, v4, v11}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 1921
    .line 1922
    .line 1923
    move-result v4

    .line 1924
    if-eqz v4, :cond_76

    .line 1925
    .line 1926
    invoke-virtual {v14}, Lk8/o;->n()Z

    .line 1927
    .line 1928
    .line 1929
    move-result v4

    .line 1930
    if-nez v4, :cond_77

    .line 1931
    .line 1932
    invoke-virtual {v14}, Lk8/o;->e()Z

    .line 1933
    .line 1934
    .line 1935
    move-result v4

    .line 1936
    if-eqz v4, :cond_76

    .line 1937
    .line 1938
    goto :goto_42

    .line 1939
    :cond_76
    const-string v4, "keyword_notify_at_me"

    .line 1940
    .line 1941
    invoke-virtual {v2, v4, v11}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 1942
    .line 1943
    .line 1944
    move-result v2

    .line 1945
    if-eqz v2, :cond_78

    .line 1946
    .line 1947
    invoke-virtual {v14}, Lk8/o;->g()Z

    .line 1948
    .line 1949
    .line 1950
    move-result v2

    .line 1951
    if-eqz v2, :cond_78

    .line 1952
    .line 1953
    :cond_77
    :goto_42
    move v1, v11

    .line 1954
    :cond_78
    :goto_43
    if-eqz v1, :cond_79

    .line 1955
    .line 1956
    goto :goto_45

    .line 1957
    :cond_79
    :try_start_c
    iget-object v1, v9, Lr8/g;->f:Lf8/c;

    .line 1958
    .line 1959
    new-instance v14, Lf8/f;

    .line 1960
    .line 1961
    iget v2, v0, Ll8/e;->b:I

    .line 1962
    .line 1963
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v19

    .line 1967
    iget-wide v6, v0, Ll8/e;->c:J

    .line 1968
    .line 1969
    iget-wide v8, v0, Ll8/e;->d:J

    .line 1970
    .line 1971
    move-object/from16 v24, v3

    .line 1972
    .line 1973
    move-wide/from16 v22, v8

    .line 1974
    .line 1975
    move-object/from16 v16, v17

    .line 1976
    .line 1977
    move-object/from16 v25, v26

    .line 1978
    .line 1979
    move-object/from16 v17, v5

    .line 1980
    .line 1981
    move-object/from16 v26, v21

    .line 1982
    .line 1983
    move-wide/from16 v20, v6

    .line 1984
    .line 1985
    invoke-direct/range {v14 .. v26}, Lf8/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1986
    .line 1987
    .line 1988
    invoke-virtual {v1, v14}, Lf8/c;->b(Ljava/lang/Object;)V

    .line 1989
    .line 1990
    .line 1991
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1992
    .line 1993
    goto :goto_44

    .line 1994
    :catchall_c
    move-exception v0

    .line 1995
    new-instance v1, Lsf/f;

    .line 1996
    .line 1997
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1998
    .line 1999
    .line 2000
    move-object v0, v1

    .line 2001
    :goto_44
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v0

    .line 2005
    if-eqz v0, :cond_7a

    .line 2006
    .line 2007
    const-string v1, "\u5c4f\u853d\u6d88\u606f\u6d3e\u53d1\u5185\u90e8\u4e8b\u4ef6\u5931\u8d25"

    .line 2008
    .line 2009
    invoke-virtual {v10, v1, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2010
    .line 2011
    .line 2012
    :cond_7a
    move-object/from16 v2, p1

    .line 2013
    .line 2014
    const/4 v3, 0x0

    .line 2015
    invoke-virtual {v2, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2016
    .line 2017
    .line 2018
    goto :goto_45

    .line 2019
    :cond_7b
    move-object/from16 v1, p0

    .line 2020
    .line 2021
    move-object/from16 v2, p1

    .line 2022
    .line 2023
    move-object/from16 v11, v16

    .line 2024
    .line 2025
    move-object/from16 v3, v17

    .line 2026
    .line 2027
    move-object/from16 v7, v27

    .line 2028
    .line 2029
    move-object/from16 v13, v34

    .line 2030
    .line 2031
    const/4 v5, 0x0

    .line 2032
    const/4 v6, 0x0

    .line 2033
    const/4 v8, 0x1

    .line 2034
    goto/16 :goto_e

    .line 2035
    .line 2036
    :cond_7c
    move-object/from16 v1, p0

    .line 2037
    .line 2038
    goto/16 :goto_e

    .line 2039
    .line 2040
    :cond_7d
    :goto_45
    return-void

    .line 2041
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
