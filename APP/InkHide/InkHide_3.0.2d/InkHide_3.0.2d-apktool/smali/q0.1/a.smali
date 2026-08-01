.class public final Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lq0/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, LA0/a;

    .line 10
    .line 11
    const/16 v0, 0x1b

    .line 12
    .line 13
    invoke-direct {p1, v0}, LA0/a;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LE0/f;

    .line 17
    .line 18
    invoke-direct {v0, p1}, LE0/f;-><init>(LM0/a;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lq0/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Lq0/a;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "set empty for "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    new-array v1, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 28
    .line 29
    const-string v3, "getArguments"

    .line 30
    .line 31
    invoke-interface {v2, p1, v3, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "hook method args:"

    .line 36
    .line 37
    const-string v2, "fragment arguments:"

    .line 38
    .line 39
    filled-new-array {p0, v1, v0, v2, p1}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final b(Lq0/a;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    new-array v0, p0, [Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 8
    .line 9
    const-string v2, "getActivity"

    .line 10
    .line 11
    invoke-interface {v1, p1, v2, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "Not attach Activity for "

    .line 20
    .line 21
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "detail_username"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-class v0, Lq0/h;

    .line 55
    .line 56
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lq0/h;

    .line 61
    .line 62
    sget-boolean v1, Lz0/i;->a:Z

    .line 63
    .line 64
    invoke-static {}, Lz0/g;->s()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    return p0

    .line 71
    :cond_1
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget-object p0, v0, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    return p0

    .line 87
    :cond_3
    :goto_0
    const-string p1, "chatUser is null or blank"

    .line 88
    .line 89
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return p0
.end method


# virtual methods
.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lq0/a;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "com.tencent.mm.view.activity.ImageQueryMainUI"

    .line 9
    .line 10
    invoke-static {v0}, Lm0/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-class v2, Landroid/os/Bundle;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v3, "com.tencent.mm.ui.chatting.BaseChattingUIFragment"

    .line 20
    .line 21
    invoke-static {v3}, Lm0/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    new-instance v5, Lr0/s;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-direct {v5, v1, v6}, Lr0/s;-><init>(Lq0/a;I)V

    .line 29
    .line 30
    .line 31
    filled-new-array {v2, v5}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "onCreate"

    .line 36
    .line 37
    invoke-static {v4, v6, v5}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Lm0/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, Lr0/s;

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-direct {v4, v1, v5}, Lr0/s;-><init>(Lq0/a;I)V

    .line 48
    .line 49
    .line 50
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "onDestroy"

    .line 55
    .line 56
    invoke-static {v3, v5, v4}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Lr0/s;

    .line 60
    .line 61
    const/4 v4, 0x2

    .line 62
    invoke-direct {v3, v1, v4}, Lr0/s;-><init>(Lq0/a;I)V

    .line 63
    .line 64
    .line 65
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v0, v6, v3}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-static {}, Lz0/r;->p()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const-string v3, "D"

    .line 77
    .line 78
    const/16 v4, 0xb2c

    .line 79
    .line 80
    const/16 v5, 0xa8d

    .line 81
    .line 82
    const/16 v6, 0xb19

    .line 83
    .line 84
    const/16 v7, 0xaa0

    .line 85
    .line 86
    const/16 v8, 0xa28

    .line 87
    .line 88
    const/16 v9, 0xa1d

    .line 89
    .line 90
    const/16 v10, 0x938

    .line 91
    .line 92
    const/16 v11, 0x9b0

    .line 93
    .line 94
    const/16 v12, 0x9c6

    .line 95
    .line 96
    const/16 v14, 0x8fc

    .line 97
    .line 98
    const/16 v15, 0x9b1

    .line 99
    .line 100
    const-string v16, "l"

    .line 101
    .line 102
    const-string v17, "k"

    .line 103
    .line 104
    const/16 v13, 0x939

    .line 105
    .line 106
    if-gt v14, v0, :cond_1

    .line 107
    .line 108
    if-ge v0, v13, :cond_1

    .line 109
    .line 110
    move-object/from16 v0, v17

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_1
    if-gt v10, v0, :cond_3

    .line 114
    .line 115
    if-ge v0, v15, :cond_3

    .line 116
    .line 117
    :cond_2
    move-object/from16 v0, v16

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    const-string v18, "z"

    .line 121
    .line 122
    if-gt v11, v0, :cond_4

    .line 123
    .line 124
    const/16 v14, 0x9c7

    .line 125
    .line 126
    if-ge v0, v14, :cond_4

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    if-ne v0, v9, :cond_6

    .line 130
    .line 131
    :cond_5
    :goto_1
    move-object/from16 v0, v18

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    if-gt v12, v0, :cond_7

    .line 135
    .line 136
    const/16 v14, 0x9da

    .line 137
    .line 138
    if-ge v0, v14, :cond_7

    .line 139
    .line 140
    const-string v18, "A"

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_7
    const/16 v14, 0xa00

    .line 144
    .line 145
    if-ne v0, v14, :cond_8

    .line 146
    .line 147
    const-string v18, "B"

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_8
    if-eq v0, v8, :cond_c

    .line 151
    .line 152
    if-eq v0, v7, :cond_c

    .line 153
    .line 154
    const/16 v14, 0xaf0

    .line 155
    .line 156
    if-eq v0, v14, :cond_c

    .line 157
    .line 158
    if-ne v0, v6, :cond_9

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_9
    if-ne v0, v5, :cond_a

    .line 162
    .line 163
    const-string v18, "K"

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_a
    const/16 v14, 0xab4

    .line 167
    .line 168
    if-eq v0, v14, :cond_5

    .line 169
    .line 170
    if-ne v0, v4, :cond_b

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_b
    const/16 v14, 0xbf4

    .line 174
    .line 175
    if-ne v0, v14, :cond_2

    .line 176
    .line 177
    move-object v0, v3

    .line 178
    goto :goto_3

    .line 179
    :cond_c
    :goto_2
    const-string v18, "y"

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 187
    .line 188
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 189
    .line 190
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 195
    .line 196
    const-string v8, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI"

    .line 197
    .line 198
    invoke-interface {v5, v8, v14, v0, v7}, Ld0/a;->a(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const-string v5, "classLoader"

    .line 203
    .line 204
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 205
    .line 206
    const/4 v14, 0x0

    .line 207
    const/4 v9, 0x1

    .line 208
    if-nez v0, :cond_e

    .line 209
    .line 210
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 211
    .line 212
    .line 213
    move-result-object v19

    .line 214
    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 215
    .line 216
    .line 217
    move-result-object v15

    .line 218
    invoke-static {v15, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    sget-object v10, Lc0/f;->b:Ld0/b;

    .line 222
    .line 223
    invoke-interface {v10, v15, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    filled-new-array {v4, v6}, [Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 232
    .line 233
    invoke-interface {v15, v8, v7, v10}, Ld0/a;->g(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    array-length v10, v8

    .line 238
    if-lt v10, v9, :cond_d

    .line 239
    .line 240
    aget-object v0, v8, v14

    .line 241
    .line 242
    :cond_d
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    const-string v10, "guess MediaHistoryListUI empty method is "

    .line 247
    .line 248
    filled-new-array {v8, v10, v0}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    invoke-static {v8}, Li0/a;->d([Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_e
    if-nez v0, :cond_f

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_f
    new-instance v8, LA0/x;

    .line 259
    .line 260
    const/4 v10, 0x5

    .line 261
    invoke-direct {v8, v10}, LA0/x;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v8}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 265
    .line 266
    .line 267
    :goto_4
    invoke-static {}, Lz0/r;->p()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    const/4 v8, 0x0

    .line 272
    if-le v0, v11, :cond_15

    .line 273
    .line 274
    sget v0, Lz0/r;->e:I

    .line 275
    .line 276
    const/4 v10, -0x1

    .line 277
    if-ne v0, v10, :cond_10

    .line 278
    .line 279
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 288
    .line 289
    .line 290
    move-result-object v13

    .line 291
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    invoke-virtual {v0, v13, v14}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget v10, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :catch_0
    move-exception v0

    .line 303
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :goto_5
    sput v10, Lz0/r;->e:I

    .line 311
    .line 312
    :cond_10
    sget v0, Lz0/r;->e:I

    .line 313
    .line 314
    if-gt v12, v0, :cond_11

    .line 315
    .line 316
    const/16 v10, 0xab5

    .line 317
    .line 318
    if-ge v0, v10, :cond_11

    .line 319
    .line 320
    const-string v0, "com.tencent.mm.ui.chatting.presenter.k1"

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_11
    const/16 v10, 0xbf4

    .line 324
    .line 325
    if-ne v0, v10, :cond_12

    .line 326
    .line 327
    const-string v0, "com.tencent.mm.ui.chatting.presenter.l2"

    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_12
    const-string v0, "com.tencent.mm.ui.chatting.presenter.j1"

    .line 331
    .line 332
    :goto_6
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    invoke-virtual {v10}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-static {v10, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 344
    .line 345
    invoke-interface {v13, v10, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    filled-new-array {v4, v6}, [Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 354
    .line 355
    invoke-interface {v6, v0, v7, v4}, Ld0/a;->g(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    if-eqz v0, :cond_14

    .line 360
    .line 361
    array-length v4, v0

    .line 362
    if-nez v4, :cond_13

    .line 363
    .line 364
    move v4, v9

    .line 365
    goto :goto_7

    .line 366
    :cond_13
    move v4, v14

    .line 367
    :goto_7
    xor-int/2addr v4, v9

    .line 368
    if-ne v4, v9, :cond_14

    .line 369
    .line 370
    aget-object v0, v0, v14

    .line 371
    .line 372
    new-instance v4, Lr0/s;

    .line 373
    .line 374
    const/4 v6, 0x6

    .line 375
    invoke-direct {v4, v1, v6}, Lr0/s;-><init>(Lq0/a;I)V

    .line 376
    .line 377
    .line 378
    invoke-static {v0, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_b

    .line 382
    .line 383
    :cond_14
    const-string v0, "can not find presenter for setEmptyDetailHistoryUIForGallery8044"

    .line 384
    .line 385
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_b

    .line 393
    .line 394
    :cond_15
    invoke-static {}, Lz0/r;->p()I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    const/16 v9, 0x85c

    .line 399
    .line 400
    if-gt v9, v0, :cond_16

    .line 401
    .line 402
    if-ge v0, v13, :cond_16

    .line 403
    .line 404
    move-object/from16 v0, v17

    .line 405
    .line 406
    goto :goto_8

    .line 407
    :cond_16
    const/16 v9, 0x938

    .line 408
    .line 409
    if-gt v9, v0, :cond_17

    .line 410
    .line 411
    const/16 v9, 0x9b1

    .line 412
    .line 413
    if-ge v0, v9, :cond_17

    .line 414
    .line 415
    move-object/from16 v0, v16

    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_17
    move-object v0, v8

    .line 419
    :goto_8
    const-string v9, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI"

    .line 420
    .line 421
    if-eqz v0, :cond_18

    .line 422
    .line 423
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 424
    .line 425
    .line 426
    move-result-object v10

    .line 427
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v13

    .line 431
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 432
    .line 433
    invoke-interface {v15, v9, v10, v0, v13}, Ld0/a;->a(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    goto :goto_9

    .line 438
    :cond_18
    move-object v0, v8

    .line 439
    :goto_9
    if-nez v0, :cond_1a

    .line 440
    .line 441
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    invoke-virtual {v10}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    invoke-static {v10, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 453
    .line 454
    invoke-interface {v13, v10, v9}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    filled-new-array {v4, v6}, [Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 463
    .line 464
    invoke-interface {v6, v9, v7, v4}, Ld0/a;->g(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    array-length v6, v4

    .line 472
    if-nez v6, :cond_19

    .line 473
    .line 474
    goto :goto_a

    .line 475
    :cond_19
    aget-object v0, v4, v14

    .line 476
    .line 477
    :goto_a
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    const-string v6, "guess MediaHistoryGalleryUI empty method is "

    .line 482
    .line 483
    filled-new-array {v4, v6, v0}, [Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    :cond_1a
    new-instance v4, LA0/x;

    .line 491
    .line 492
    const/4 v6, 0x4

    .line 493
    invoke-direct {v4, v6}, LA0/x;-><init>(I)V

    .line 494
    .line 495
    .line 496
    invoke-static {v0, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 497
    .line 498
    .line 499
    :goto_b
    invoke-static {}, Lz0/r;->p()I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    const/16 v4, 0x8fc

    .line 504
    .line 505
    if-ne v0, v4, :cond_1b

    .line 506
    .line 507
    const-string v3, "N"

    .line 508
    .line 509
    goto/16 :goto_f

    .line 510
    .line 511
    :cond_1b
    const/16 v4, 0x910

    .line 512
    .line 513
    if-ne v0, v4, :cond_1c

    .line 514
    .line 515
    const-string v3, "O"

    .line 516
    .line 517
    goto/16 :goto_f

    .line 518
    .line 519
    :cond_1c
    const/16 v4, 0x924

    .line 520
    .line 521
    const-string v6, "P"

    .line 522
    .line 523
    const-string v9, "R"

    .line 524
    .line 525
    if-ne v0, v4, :cond_1f

    .line 526
    .line 527
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    const-string v3, "8.0.35"

    .line 532
    .line 533
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    if-eqz v0, :cond_1e

    .line 538
    .line 539
    :cond_1d
    :goto_c
    move-object v3, v6

    .line 540
    goto/16 :goto_f

    .line 541
    .line 542
    :cond_1e
    :goto_d
    move-object v3, v9

    .line 543
    goto/16 :goto_f

    .line 544
    .line 545
    :cond_1f
    const/16 v4, 0x938

    .line 546
    .line 547
    if-eq v0, v4, :cond_1d

    .line 548
    .line 549
    const/16 v4, 0x97d

    .line 550
    .line 551
    if-ne v0, v4, :cond_20

    .line 552
    .line 553
    goto :goto_c

    .line 554
    :cond_20
    const/16 v4, 0x94c

    .line 555
    .line 556
    const-string v6, "Q"

    .line 557
    .line 558
    if-ne v0, v4, :cond_21

    .line 559
    .line 560
    goto :goto_c

    .line 561
    :cond_21
    const/16 v4, 0x960

    .line 562
    .line 563
    if-ne v0, v4, :cond_22

    .line 564
    .line 565
    goto :goto_d

    .line 566
    :cond_22
    const/16 v4, 0x974

    .line 567
    .line 568
    if-gt v4, v0, :cond_23

    .line 569
    .line 570
    const/16 v4, 0x98a

    .line 571
    .line 572
    if-ge v0, v4, :cond_23

    .line 573
    .line 574
    goto :goto_e

    .line 575
    :cond_23
    if-ne v0, v11, :cond_24

    .line 576
    .line 577
    :goto_e
    goto :goto_c

    .line 578
    :cond_24
    const/16 v4, 0x989

    .line 579
    .line 580
    if-gt v4, v0, :cond_25

    .line 581
    .line 582
    const/16 v4, 0x99d

    .line 583
    .line 584
    if-ge v0, v4, :cond_25

    .line 585
    .line 586
    goto :goto_d

    .line 587
    :cond_25
    if-gt v12, v0, :cond_26

    .line 588
    .line 589
    const/16 v4, 0xa01

    .line 590
    .line 591
    if-ge v0, v4, :cond_26

    .line 592
    .line 593
    goto :goto_f

    .line 594
    :cond_26
    const/16 v4, 0xa1d

    .line 595
    .line 596
    if-ne v0, v4, :cond_27

    .line 597
    .line 598
    const-string v3, "G"

    .line 599
    .line 600
    goto :goto_f

    .line 601
    :cond_27
    const/16 v4, 0xa28

    .line 602
    .line 603
    if-ne v0, v4, :cond_28

    .line 604
    .line 605
    const-string v3, "F"

    .line 606
    .line 607
    goto :goto_f

    .line 608
    :cond_28
    const/16 v4, 0xa8d

    .line 609
    .line 610
    if-ne v0, v4, :cond_29

    .line 611
    .line 612
    goto :goto_f

    .line 613
    :cond_29
    const/16 v3, 0xaa0

    .line 614
    .line 615
    if-gt v3, v0, :cond_2a

    .line 616
    .line 617
    const/16 v3, 0xaf1

    .line 618
    .line 619
    if-ge v0, v3, :cond_2a

    .line 620
    .line 621
    const-string v3, "I"

    .line 622
    .line 623
    goto :goto_f

    .line 624
    :cond_2a
    const/16 v3, 0xb19

    .line 625
    .line 626
    if-ne v0, v3, :cond_2b

    .line 627
    .line 628
    goto :goto_d

    .line 629
    :cond_2b
    const/16 v3, 0xb2c

    .line 630
    .line 631
    if-ne v0, v3, :cond_2c

    .line 632
    .line 633
    const-string v3, "V"

    .line 634
    .line 635
    goto :goto_f

    .line 636
    :cond_2c
    const/16 v10, 0xbf4

    .line 637
    .line 638
    if-ne v0, v10, :cond_2d

    .line 639
    .line 640
    const-string v3, "w0"

    .line 641
    .line 642
    goto :goto_f

    .line 643
    :cond_2d
    move-object v3, v8

    .line 644
    :goto_f
    const-string v0, "setEmptyActionBarTabPageUI method is :"

    .line 645
    .line 646
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    const-class v0, Ljava/util/ArrayList;

    .line 654
    .line 655
    const-string v4, "com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment"

    .line 656
    .line 657
    if-eqz v3, :cond_2e

    .line 658
    .line 659
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 664
    .line 665
    .line 666
    move-result-object v6

    .line 667
    invoke-static {v6, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 671
    .line 672
    invoke-interface {v8, v6, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    move-result-object v6

    .line 676
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v8

    .line 680
    sget-object v9, Lc0/f;->b:Ld0/b;

    .line 681
    .line 682
    invoke-interface {v9, v6, v3, v8}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 683
    .line 684
    .line 685
    move-result-object v8

    .line 686
    :cond_2e
    if-nez v8, :cond_30

    .line 687
    .line 688
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 689
    .line 690
    .line 691
    move-result-object v6

    .line 692
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    invoke-static {v6, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 700
    .line 701
    invoke-interface {v5, v6, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    move-result-object v5

    .line 709
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 710
    .line 711
    invoke-interface {v6, v4, v7, v5}, Ld0/a;->g(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    array-length v5, v4

    .line 719
    if-nez v5, :cond_2f

    .line 720
    .line 721
    goto :goto_10

    .line 722
    :cond_2f
    aget-object v8, v4, v14

    .line 723
    .line 724
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    :goto_10
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v4

    .line 732
    const-string v5, "guess setEmptyActionBarTabPageUI method:"

    .line 733
    .line 734
    filled-new-array {v4, v5, v8}, [Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v4

    .line 738
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    :cond_30
    if-nez v8, :cond_31

    .line 742
    .line 743
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    const-string v2, "setEmptyActionBarTabPageUI is method null"

    .line 748
    .line 749
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    goto :goto_11

    .line 757
    :cond_31
    new-instance v4, Lr0/s;

    .line 758
    .line 759
    const/4 v5, 0x3

    .line 760
    invoke-direct {v4, v1, v5}, Lr0/s;-><init>(Lq0/a;I)V

    .line 761
    .line 762
    .line 763
    invoke-static {v8, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 764
    .line 765
    .line 766
    if-nez v3, :cond_32

    .line 767
    .line 768
    const-string v0, "setEmptyActionBarTabPageUI is null"

    .line 769
    .line 770
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    goto :goto_11

    .line 778
    :cond_32
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    new-instance v5, Lr0/s;

    .line 783
    .line 784
    const/4 v6, 0x4

    .line 785
    invoke-direct {v5, v1, v6}, Lr0/s;-><init>(Lq0/a;I)V

    .line 786
    .line 787
    .line 788
    filled-new-array {v0, v5}, [Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    const-string v5, "com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment"

    .line 793
    .line 794
    invoke-static {v5, v4, v3, v0}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    new-instance v3, Lr0/s;

    .line 802
    .line 803
    const/4 v4, 0x5

    .line 804
    invoke-direct {v3, v1, v4}, Lr0/s;-><init>(Lq0/a;I)V

    .line 805
    .line 806
    .line 807
    const-class v4, Landroid/view/LayoutInflater;

    .line 808
    .line 809
    const-class v5, Landroid/view/ViewGroup;

    .line 810
    .line 811
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    const-string v3, "com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiImageResultFragment"

    .line 816
    .line 817
    const-string v4, "onCreateView"

    .line 818
    .line 819
    invoke-static {v3, v0, v4, v2}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    :goto_11
    return-void

    .line 823
    :pswitch_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    const-string v2, "classLoader"

    .line 832
    .line 833
    invoke-static {v0, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 837
    .line 838
    const-string v3, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 839
    .line 840
    invoke-interface {v2, v0, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    new-instance v2, LA0/a;

    .line 845
    .line 846
    const/16 v3, 0x1a

    .line 847
    .line 848
    invoke-direct {v2, v3}, LA0/a;-><init>(I)V

    .line 849
    .line 850
    .line 851
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 852
    .line 853
    invoke-interface {v3, v0, v2}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    const-string v2, "findMethodsByExactPredicate(...)"

    .line 858
    .line 859
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    array-length v2, v0

    .line 863
    const/4 v3, 0x0

    .line 864
    :goto_12
    if-ge v3, v2, :cond_33

    .line 865
    .line 866
    aget-object v4, v0, v3

    .line 867
    .line 868
    new-instance v5, LC0/d;

    .line 869
    .line 870
    const/4 v6, 0x1

    .line 871
    invoke-direct {v5, v6, v1}, LC0/d;-><init>(ILjava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    invoke-static {v4, v5}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 875
    .line 876
    .line 877
    add-int/lit8 v3, v3, 0x1

    .line 878
    .line 879
    goto :goto_12

    .line 880
    :cond_33
    return-void

    .line 881
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
