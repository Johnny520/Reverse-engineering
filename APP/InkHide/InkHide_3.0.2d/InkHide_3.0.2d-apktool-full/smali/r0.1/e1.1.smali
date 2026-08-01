.class public final Lr0/e1;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/reflect/GenericDeclaration;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/GenericDeclaration;I)V
    .locals 0

    .line 1
    iput p5, p0, Lr0/e1;->a:I

    iput-object p1, p0, Lr0/e1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr0/e1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr0/e1;->d:Ljava/lang/Object;

    iput-object p4, p0, Lr0/e1;->e:Ljava/lang/reflect/GenericDeclaration;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    iget v0, p0, Lr0/e1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lr0/e1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lr0/f1;

    .line 15
    .line 16
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Lr0/e1;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Class;

    .line 21
    .line 22
    iget-object v2, p0, Lr0/e1;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Ljava/lang/Class;

    .line 25
    .line 26
    iget-object v3, p0, Lr0/e1;->e:Ljava/lang/reflect/GenericDeclaration;

    .line 27
    .line 28
    check-cast v3, Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "getDeclaredMethods(...)"

    .line 45
    .line 46
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    array-length v6, v4

    .line 55
    const/4 v7, 0x0

    .line 56
    :goto_0
    if-ge v7, v6, :cond_2

    .line 57
    .line 58
    aget-object v8, v4, v7

    .line 59
    .line 60
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    const-string v10, "getParameterTypes(...)"

    .line 65
    .line 66
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    array-length v9, v9

    .line 70
    if-nez v9, :cond_1

    .line 71
    .line 72
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    const-string v10, "getReturnType(...)"

    .line 77
    .line 78
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v9, v1}, Lr0/f1;->l(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_1

    .line 86
    .line 87
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :catchall_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_5

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    const/4 v5, 0x1

    .line 110
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 111
    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    invoke-virtual {v4, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    if-nez v4, :cond_3

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v5, v0, Lr0/f1;->g:Ljava/lang/Object;

    .line 122
    .line 123
    if-eq v4, v5, :cond_4

    .line 124
    .line 125
    iput-object v4, v0, Lr0/f1;->g:Ljava/lang/Object;

    .line 126
    .line 127
    :cond_4
    invoke-virtual {v0, v4, v2, v3}, Lr0/f1;->d(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    :goto_2
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    iget v0, v1, Lr0/e1;->a:I

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const-string v0, "param"

    .line 13
    .line 14
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lr0/e1;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LA0/T;

    .line 20
    .line 21
    iget-object v4, v0, LA0/T;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v5, v0, LA0/T;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, v0, LA0/T;->c:Ljava/lang/String;

    .line 26
    .line 27
    const-string v6, "read trace send hook hit"

    .line 28
    .line 29
    filled-new-array {v6, v4, v5, v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, Lr0/e1;->c:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v10, v0

    .line 39
    check-cast v10, Lr0/x1;

    .line 40
    .line 41
    iget-object v0, v1, Lr0/e1;->d:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v5, v0

    .line 44
    check-cast v5, Landroid/content/Context;

    .line 45
    .line 46
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v6, "getParameterTypes(...)"

    .line 52
    .line 53
    const-class v7, Ljava/lang/String;

    .line 54
    .line 55
    const-string v8, "getMethods(...)"

    .line 56
    .line 57
    sget-boolean v0, Lz0/i;->a:Z

    .line 58
    .line 59
    invoke-static {}, Lz0/g;->G()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    goto/16 :goto_22

    .line 66
    .line 67
    :cond_0
    const/4 v11, 0x0

    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    :cond_1
    move-object v0, v11

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v9, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 82
    .line 83
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    move-object v0, v4

    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v12, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    move-object v13, v0

    .line 102
    :goto_0
    if-eqz v13, :cond_5

    .line 103
    .line 104
    const-class v0, Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v14, "getDeclaredFields(...)"

    .line 117
    .line 118
    invoke-static {v0, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    goto :goto_1

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    new-instance v14, LE0/d;

    .line 128
    .line 129
    invoke-direct {v14, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    move-object v0, v14

    .line 133
    :goto_1
    sget-object v14, LF0/s;->a:LF0/s;

    .line 134
    .line 135
    instance-of v15, v0, LE0/d;

    .line 136
    .line 137
    if-eqz v15, :cond_4

    .line 138
    .line 139
    move-object v0, v14

    .line 140
    :cond_4
    check-cast v0, Ljava/util/Collection;

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    goto :goto_0

    .line 150
    :cond_5
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    :cond_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_1

    .line 159
    .line 160
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Ljava/lang/reflect/Field;

    .line 165
    .line 166
    :try_start_1
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_7

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 187
    if-eqz v13, :cond_7

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_7
    move-object v0, v11

    .line 191
    goto :goto_2

    .line 192
    :catchall_1
    move-exception v0

    .line 193
    new-instance v13, LE0/d;

    .line 194
    .line 195
    invoke-direct {v13, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    move-object v0, v13

    .line 199
    :goto_2
    nop

    .line 200
    instance-of v13, v0, LE0/d;

    .line 201
    .line 202
    if-eqz v13, :cond_8

    .line 203
    .line 204
    move-object v0, v11

    .line 205
    :cond_8
    if-eqz v0, :cond_6

    .line 206
    .line 207
    :goto_3
    const-string v9, ""

    .line 208
    .line 209
    if-nez v0, :cond_c

    .line 210
    .line 211
    sget-object v0, LC0/c;->a:LC0/c;

    .line 212
    .line 213
    sget-object v0, LC0/c;->d:Ljava/lang/ref/WeakReference;

    .line 214
    .line 215
    if-eqz v0, :cond_9

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    goto :goto_4

    .line 222
    :cond_9
    move-object v0, v11

    .line 223
    :goto_4
    if-nez v0, :cond_c

    .line 224
    .line 225
    if-eqz v4, :cond_a

    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    :cond_a
    if-nez v11, :cond_b

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_b
    move-object v9, v11

    .line 239
    :goto_5
    const-string v0, "read trace chat footer missing"

    .line 240
    .line 241
    filled-new-array {v0, v9}, [Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_22

    .line 249
    .line 250
    :cond_c
    move-object v4, v0

    .line 251
    nop

    .line 252
    instance-of v0, v4, Landroid/view/View;

    .line 253
    .line 254
    if-eqz v0, :cond_d

    .line 255
    .line 256
    move-object v0, v4

    .line 257
    check-cast v0, Landroid/view/View;

    .line 258
    .line 259
    new-instance v12, Lr0/n1;

    .line 260
    .line 261
    const/4 v13, 0x6

    .line 262
    invoke-direct {v12, v13}, Lr0/n1;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-static {v0, v12}, Lb1/h;->s(Landroid/view/View;Lx/b;)Ljava/util/ArrayList;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-static {v0}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Landroid/view/View;

    .line 274
    .line 275
    instance-of v12, v0, Landroid/widget/EditText;

    .line 276
    .line 277
    if-eqz v12, :cond_d

    .line 278
    .line 279
    check-cast v0, Landroid/widget/EditText;

    .line 280
    .line 281
    move-object v12, v0

    .line 282
    goto :goto_6

    .line 283
    :cond_d
    move-object v12, v11

    .line 284
    :goto_6
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    array-length v14, v0

    .line 296
    const/4 v15, 0x0

    .line 297
    :goto_7
    if-ge v15, v14, :cond_f

    .line 298
    .line 299
    aget-object v16, v0, v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 300
    .line 301
    move/from16 v17, v3

    .line 302
    .line 303
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    const-string v13, "getLastText"

    .line 308
    .line 309
    invoke-static {v3, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eqz v3, :cond_e

    .line 314
    .line 315
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v3, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    array-length v3, v3

    .line 323
    if-nez v3, :cond_e

    .line 324
    .line 325
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-static {v3, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_e

    .line 334
    .line 335
    move-object/from16 v0, v16

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :catchall_2
    move-exception v0

    .line 339
    goto :goto_a

    .line 340
    :cond_e
    add-int/lit8 v15, v15, 0x1

    .line 341
    .line 342
    move/from16 v3, v17

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :catchall_3
    move-exception v0

    .line 346
    move/from16 v17, v3

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_f
    move/from16 v17, v3

    .line 350
    .line 351
    move-object v0, v11

    .line 352
    :goto_8
    if-eqz v0, :cond_10

    .line 353
    .line 354
    invoke-virtual {v0, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    goto :goto_9

    .line 359
    :cond_10
    move-object v0, v11

    .line 360
    :goto_9
    instance-of v3, v0, Ljava/lang/String;

    .line 361
    .line 362
    if-eqz v3, :cond_11

    .line 363
    .line 364
    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 365
    .line 366
    goto :goto_b

    .line 367
    :cond_11
    move-object v0, v11

    .line 368
    goto :goto_b

    .line 369
    :goto_a
    new-instance v3, LE0/d;

    .line 370
    .line 371
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    move-object v0, v3

    .line 375
    :goto_b
    nop

    .line 376
    instance-of v3, v0, LE0/d;

    .line 377
    .line 378
    if-eqz v3, :cond_12

    .line 379
    .line 380
    move-object v0, v11

    .line 381
    :cond_12
    check-cast v0, Ljava/lang/String;

    .line 382
    .line 383
    if-nez v0, :cond_13

    .line 384
    .line 385
    move-object v0, v9

    .line 386
    :cond_13
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    if-eqz v3, :cond_15

    .line 391
    .line 392
    if-eqz v12, :cond_14

    .line 393
    .line 394
    invoke-virtual {v12}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-eqz v0, :cond_14

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    goto :goto_c

    .line 405
    :cond_14
    move-object v0, v11

    .line 406
    :goto_c
    if-nez v0, :cond_15

    .line 407
    .line 408
    move-object v0, v9

    .line 409
    :cond_15
    sget-boolean v3, Lz0/i;->a:Z

    .line 410
    .line 411
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/OptionData;->getReadTraceCommandPrefix()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 428
    .line 429
    .line 430
    move-result v13

    .line 431
    if-eqz v13, :cond_16

    .line 432
    .line 433
    const-string v3, "#read"

    .line 434
    .line 435
    :cond_16
    invoke-static {v0}, LU0/i;->F0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 436
    .line 437
    .line 438
    move-result-object v13

    .line 439
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v13

    .line 443
    const/4 v14, 0x0

    .line 444
    invoke-static {v13, v14, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 445
    .line 446
    .line 447
    move-result v13

    .line 448
    if-nez v13, :cond_17

    .line 449
    .line 450
    goto/16 :goto_22

    .line 451
    .line 452
    :cond_17
    sget-object v13, LC0/c;->a:LC0/c;

    .line 453
    .line 454
    sget-object v13, LC0/c;->c:Ljava/lang/String;

    .line 455
    .line 456
    const-string v14, "target="

    .line 457
    .line 458
    invoke-static {v14, v13}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v14

    .line 462
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 463
    .line 464
    .line 465
    move-result v15

    .line 466
    const-string v11, "textLength="

    .line 467
    .line 468
    invoke-static {v15, v11}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v11

    .line 472
    const-string v15, "read trace command matched"

    .line 473
    .line 474
    filled-new-array {v15, v14, v11}, [Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v11

    .line 478
    invoke-static {v11}, Li0/a;->a([Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    invoke-static {v0}, LU0/i;->F0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-static {v0, v3}, LU0/i;->t0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-eqz v0, :cond_18

    .line 506
    .line 507
    const-string v0, "\u8bf7\u8f93\u5165\u8981\u53d1\u9001\u7684\u8ffd\u8e2a\u5185\u5bb9"

    .line 508
    .line 509
    invoke-static {v5, v0}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_18

    .line 513
    .line 514
    :cond_18
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-eqz v0, :cond_1f

    .line 519
    .line 520
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    array-length v11, v0

    .line 532
    const/4 v13, 0x0

    .line 533
    :goto_d
    if-ge v13, v11, :cond_1a

    .line 534
    .line 535
    aget-object v14, v0, v13

    .line 536
    .line 537
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v15

    .line 541
    move-object/from16 v19, v0

    .line 542
    .line 543
    const-string v0, "getUserName"

    .line 544
    .line 545
    invoke-static {v15, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    if-eqz v0, :cond_19

    .line 550
    .line 551
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    array-length v0, v0

    .line 559
    if-nez v0, :cond_19

    .line 560
    .line 561
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-static {v0, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 569
    if-eqz v0, :cond_19

    .line 570
    .line 571
    goto :goto_e

    .line 572
    :catchall_4
    move-exception v0

    .line 573
    const/4 v11, 0x0

    .line 574
    goto :goto_10

    .line 575
    :cond_19
    add-int/lit8 v13, v13, 0x1

    .line 576
    .line 577
    move-object/from16 v0, v19

    .line 578
    .line 579
    goto :goto_d

    .line 580
    :cond_1a
    const/4 v14, 0x0

    .line 581
    :goto_e
    if-eqz v14, :cond_1b

    .line 582
    .line 583
    const/4 v11, 0x0

    .line 584
    :try_start_5
    invoke-virtual {v14, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    goto :goto_f

    .line 589
    :catchall_5
    move-exception v0

    .line 590
    goto :goto_10

    .line 591
    :cond_1b
    const/4 v11, 0x0

    .line 592
    move-object v0, v11

    .line 593
    :goto_f
    instance-of v6, v0, Ljava/lang/String;

    .line 594
    .line 595
    if-eqz v6, :cond_1c

    .line 596
    .line 597
    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 598
    .line 599
    goto :goto_11

    .line 600
    :cond_1c
    move-object v0, v11

    .line 601
    goto :goto_11

    .line 602
    :goto_10
    new-instance v6, LE0/d;

    .line 603
    .line 604
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 605
    .line 606
    .line 607
    move-object v0, v6

    .line 608
    :goto_11
    nop

    .line 609
    instance-of v6, v0, LE0/d;

    .line 610
    .line 611
    if-eqz v6, :cond_1d

    .line 612
    .line 613
    move-object v0, v11

    .line 614
    :cond_1d
    check-cast v0, Ljava/lang/String;

    .line 615
    .line 616
    if-nez v0, :cond_1e

    .line 617
    .line 618
    move-object v13, v9

    .line 619
    goto :goto_12

    .line 620
    :cond_1e
    move-object v13, v0

    .line 621
    goto :goto_12

    .line 622
    :cond_1f
    const/4 v11, 0x0

    .line 623
    :goto_12
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-eqz v0, :cond_20

    .line 628
    .line 629
    const-string v0, "\u672a\u8bc6\u522b\u5f53\u524d\u804a\u5929\u5bf9\u8c61"

    .line 630
    .line 631
    invoke-static {v5, v0}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_18

    .line 635
    .line 636
    :cond_20
    :try_start_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    array-length v6, v0

    .line 648
    const/4 v8, 0x0

    .line 649
    :goto_13
    if-ge v8, v6, :cond_22

    .line 650
    .line 651
    aget-object v14, v0, v8

    .line 652
    .line 653
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v15

    .line 657
    const-string v11, "setLastText"

    .line 658
    .line 659
    invoke-static {v15, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v11

    .line 663
    if-eqz v11, :cond_21

    .line 664
    .line 665
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    move-result-object v11

    .line 669
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    move-result-object v15

    .line 673
    invoke-static {v11, v15}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v11

    .line 677
    if-eqz v11, :cond_21

    .line 678
    .line 679
    goto :goto_14

    .line 680
    :catchall_6
    move-exception v0

    .line 681
    goto :goto_16

    .line 682
    :cond_21
    add-int/lit8 v8, v8, 0x1

    .line 683
    .line 684
    const/4 v11, 0x0

    .line 685
    goto :goto_13

    .line 686
    :cond_22
    const/4 v14, 0x0

    .line 687
    :goto_14
    if-nez v14, :cond_23

    .line 688
    .line 689
    const/16 v17, 0x0

    .line 690
    .line 691
    goto :goto_15

    .line 692
    :cond_23
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-virtual {v14, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    :goto_15
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 700
    .line 701
    .line 702
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 703
    goto :goto_17

    .line 704
    :goto_16
    new-instance v4, LE0/d;

    .line 705
    .line 706
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 707
    .line 708
    .line 709
    move-object v0, v4

    .line 710
    :goto_17
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 711
    .line 712
    instance-of v6, v0, LE0/d;

    .line 713
    .line 714
    if-eqz v6, :cond_24

    .line 715
    .line 716
    move-object v0, v4

    .line 717
    :cond_24
    check-cast v0, Ljava/lang/Boolean;

    .line 718
    .line 719
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 720
    .line 721
    .line 722
    move-result v0

    .line 723
    if-nez v0, :cond_25

    .line 724
    .line 725
    if-eqz v12, :cond_25

    .line 726
    .line 727
    invoke-virtual {v12}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    if-eqz v0, :cond_25

    .line 732
    .line 733
    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    .line 734
    .line 735
    .line 736
    :cond_25
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    const-string v4, "toString(...)"

    .line 745
    .line 746
    invoke-static {v0, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    const-string v6, "-"

    .line 750
    .line 751
    invoke-static {v0, v6, v9}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v9

    .line 755
    sget-boolean v0, Lz0/i;->a:Z

    .line 756
    .line 757
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getReadTraceServerUrl()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 774
    .line 775
    .line 776
    move-result v6

    .line 777
    if-eqz v6, :cond_26

    .line 778
    .line 779
    const-string v0, "https://read.spint.kdns.fr"

    .line 780
    .line 781
    :cond_26
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 790
    .line 791
    .line 792
    move-result v6

    .line 793
    if-eqz v6, :cond_27

    .line 794
    .line 795
    const-string v0, "\u8bf7\u5148\u914d\u7f6e\u5df2\u8bfb\u8ffd\u8e2a\u670d\u52a1\u5730\u5740"

    .line 796
    .line 797
    invoke-static {v5, v0}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    goto/16 :goto_18

    .line 801
    .line 802
    :cond_27
    invoke-static {}, Lz0/g;->m()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    new-instance v7, Ljava/lang/StringBuilder;

    .line 807
    .line 808
    const-string v8, "pixel"

    .line 809
    .line 810
    invoke-static {v0, v8}, Lr0/x1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v8

    .line 814
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    const-string v8, "?id="

    .line 818
    .line 819
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    sget-object v8, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 823
    .line 824
    invoke-virtual {v8}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v11

    .line 828
    invoke-static {v9, v11}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v11

    .line 832
    const-string v12, "encode(...)"

    .line 833
    .line 834
    invoke-static {v11, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 841
    .line 842
    .line 843
    move-result v11

    .line 844
    if-nez v11, :cond_28

    .line 845
    .line 846
    const-string v11, "&wxId="

    .line 847
    .line 848
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v8}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v11

    .line 855
    invoke-static {v6, v11}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v11

    .line 859
    invoke-static {v11, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    :cond_28
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v7

    .line 869
    invoke-static {v7, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    const-string v11, "register"

    .line 873
    .line 874
    invoke-static {v0, v11}, Lr0/x1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    new-instance v11, Lorg/json/JSONObject;

    .line 879
    .line 880
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 881
    .line 882
    .line 883
    const-string v12, "id"

    .line 884
    .line 885
    invoke-virtual {v11, v12, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 886
    .line 887
    .line 888
    move-result-object v11

    .line 889
    invoke-virtual {v3, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 890
    .line 891
    .line 892
    move-result-object v8

    .line 893
    const-string v12, "getBytes(...)"

    .line 894
    .line 895
    invoke-static {v8, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    const/16 v12, 0xb

    .line 899
    .line 900
    invoke-static {v8, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v8

    .line 904
    const-string v12, "encodeToString(...)"

    .line 905
    .line 906
    invoke-static {v8, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    const-string v12, "msg"

    .line 910
    .line 911
    invoke-virtual {v11, v12, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 912
    .line 913
    .line 914
    move-result-object v8

    .line 915
    const-string v11, "wxId"

    .line 916
    .line 917
    invoke-virtual {v8, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 918
    .line 919
    .line 920
    move-result-object v6

    .line 921
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v11

    .line 925
    invoke-static {v11, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    sget-object v4, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 929
    .line 930
    new-instance v4, Lr0/v1;

    .line 931
    .line 932
    move-object v8, v3

    .line 933
    move-object v6, v7

    .line 934
    move-object v7, v13

    .line 935
    invoke-direct/range {v4 .. v10}, Lr0/v1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr0/x1;)V

    .line 936
    .line 937
    .line 938
    invoke-static {v0, v11, v4}, LD/h;->L(Ljava/lang/String;Ljava/lang/String;LM0/l;)V

    .line 939
    .line 940
    .line 941
    :goto_18
    iget-object v0, v1, Lr0/e1;->c:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v0, Lr0/x1;

    .line 944
    .line 945
    iget-object v3, v1, Lr0/e1;->e:Ljava/lang/reflect/GenericDeclaration;

    .line 946
    .line 947
    check-cast v3, Ljava/lang/reflect/Method;

    .line 948
    .line 949
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 957
    .line 958
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    move-result v3

    .line 962
    if-nez v3, :cond_38

    .line 963
    .line 964
    const-class v3, Ljava/lang/Boolean;

    .line 965
    .line 966
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    move-result v3

    .line 970
    if-eqz v3, :cond_29

    .line 971
    .line 972
    goto/16 :goto_20

    .line 973
    .line 974
    :cond_29
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 975
    .line 976
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-nez v3, :cond_2a

    .line 981
    .line 982
    const-class v3, Ljava/lang/Integer;

    .line 983
    .line 984
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v3

    .line 988
    if-eqz v3, :cond_2b

    .line 989
    .line 990
    :cond_2a
    const/16 v18, 0x0

    .line 991
    .line 992
    goto/16 :goto_1f

    .line 993
    .line 994
    :cond_2b
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 995
    .line 996
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    move-result v3

    .line 1000
    if-nez v3, :cond_37

    .line 1001
    .line 1002
    const-class v3, Ljava/lang/Long;

    .line 1003
    .line 1004
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    if-eqz v3, :cond_2c

    .line 1009
    .line 1010
    goto/16 :goto_1e

    .line 1011
    .line 1012
    :cond_2c
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 1013
    .line 1014
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    if-nez v3, :cond_36

    .line 1019
    .line 1020
    const-class v3, Ljava/lang/Float;

    .line 1021
    .line 1022
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v3

    .line 1026
    if-eqz v3, :cond_2d

    .line 1027
    .line 1028
    goto :goto_1d

    .line 1029
    :cond_2d
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 1030
    .line 1031
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v3

    .line 1035
    if-nez v3, :cond_35

    .line 1036
    .line 1037
    const-class v3, Ljava/lang/Double;

    .line 1038
    .line 1039
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v3

    .line 1043
    if-eqz v3, :cond_2e

    .line 1044
    .line 1045
    goto :goto_1c

    .line 1046
    :cond_2e
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 1047
    .line 1048
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v3

    .line 1052
    if-nez v3, :cond_2f

    .line 1053
    .line 1054
    const-class v3, Ljava/lang/Short;

    .line 1055
    .line 1056
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v3

    .line 1060
    if-eqz v3, :cond_30

    .line 1061
    .line 1062
    :cond_2f
    const/16 v18, 0x0

    .line 1063
    .line 1064
    goto :goto_1b

    .line 1065
    :cond_30
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 1066
    .line 1067
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v3

    .line 1071
    if-nez v3, :cond_31

    .line 1072
    .line 1073
    const-class v3, Ljava/lang/Byte;

    .line 1074
    .line 1075
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v3

    .line 1079
    if-eqz v3, :cond_32

    .line 1080
    .line 1081
    :cond_31
    const/16 v18, 0x0

    .line 1082
    .line 1083
    goto :goto_1a

    .line 1084
    :cond_32
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 1085
    .line 1086
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v3

    .line 1090
    if-nez v3, :cond_33

    .line 1091
    .line 1092
    const-class v3, Ljava/lang/Character;

    .line 1093
    .line 1094
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v0

    .line 1098
    if-eqz v0, :cond_34

    .line 1099
    .line 1100
    :cond_33
    const/16 v18, 0x0

    .line 1101
    .line 1102
    goto :goto_19

    .line 1103
    :cond_34
    const/4 v11, 0x0

    .line 1104
    goto :goto_21

    .line 1105
    :goto_19
    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v11

    .line 1109
    goto :goto_21

    .line 1110
    :goto_1a
    invoke-static/range {v18 .. v18}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v11

    .line 1114
    goto :goto_21

    .line 1115
    :goto_1b
    invoke-static/range {v18 .. v18}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v11

    .line 1119
    goto :goto_21

    .line 1120
    :cond_35
    :goto_1c
    const-wide/16 v3, 0x0

    .line 1121
    .line 1122
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v11

    .line 1126
    goto :goto_21

    .line 1127
    :cond_36
    :goto_1d
    const/4 v0, 0x0

    .line 1128
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v11

    .line 1132
    goto :goto_21

    .line 1133
    :cond_37
    :goto_1e
    const-wide/16 v3, 0x0

    .line 1134
    .line 1135
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v11

    .line 1139
    goto :goto_21

    .line 1140
    :goto_1f
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v11

    .line 1144
    goto :goto_21

    .line 1145
    :cond_38
    :goto_20
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1146
    .line 1147
    :goto_21
    invoke-virtual {v2, v11}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1148
    .line 1149
    .line 1150
    :goto_22
    return-void

    .line 1151
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
