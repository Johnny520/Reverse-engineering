.class public abstract Lz0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[C

.field public static final b:[[C

.field public static volatile c:Ljava/lang/String; = null

.field public static volatile d:Lz0/a; = null

.field public static e:I = -0x1

.field public static f:Ljava/lang/String; = ""

.field public static g:Ljava/lang/String; = ""

.field public static h:LA0/S;

.field public static i:Ljava/lang/reflect/Method;

.field public static j:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz0/r;->a:[C

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [C

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x7

    .line 16
    new-array v1, v1, [C

    .line 17
    .line 18
    fill-array-data v1, :array_2

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    new-array v2, v2, [C

    .line 23
    .line 24
    fill-array-data v2, :array_3

    .line 25
    .line 26
    .line 27
    filled-new-array {v0, v1, v2}, [[C

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lz0/r;->b:[[C

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :array_0
    .array-data 2
        0x68s
        0x74s
        0x74s
        0x70s
        0x73s
    .end array-data

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    nop

    .line 45
    :array_1
    .array-data 2
        0x6ds
        0x79s
    .end array-data

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    :array_2
    .array-data 2
        0x33s
        0x31s
        0x38s
        0x34s
        0x35s
        0x38s
        0x33s
    .end array-data

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    nop

    .line 63
    :array_3
    .array-data 2
        0x62s
        0x65s
        0x73s
        0x74s
    .end array-data
.end method

.method public static A(Landroid/view/View;LM0/a;ILandroid/view/View$OnClickListener;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    const-string v1, "getListenerInfo"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [Ljava/lang/Object;

    .line 15
    .line 16
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 17
    .line 18
    invoke-interface {v3, p0, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "mOnClickListener"

    .line 23
    .line 24
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 25
    .line 26
    invoke-interface {v3, v1, v2}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/view/View$OnClickListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    move-object v0, v1

    .line 33
    :catchall_0
    :cond_1
    nop

    .line 34
    instance-of v1, v0, Lz0/m;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    check-cast v0, Lz0/m;

    .line 39
    .line 40
    iget-object v0, v0, Lz0/m;->b:Landroid/view/View$OnClickListener;

    .line 41
    .line 42
    :cond_2
    new-instance v1, Lz0/m;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, v1, Lz0/m;->b:Landroid/view/View$OnClickListener;

    .line 48
    .line 49
    iput-object p3, v1, Lz0/m;->c:Landroid/view/View$OnClickListener;

    .line 50
    .line 51
    iput-object p1, v1, Lz0/m;->d:LM0/a;

    .line 52
    .line 53
    iput p2, v1, Lz0/m;->e:I

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static B(Z)V
    .locals 18

    .line 1
    const-string v0, "startReloadIfChangedUnexpectedly"

    .line 2
    .line 3
    const-string v1, "app"

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const-string v3, "getSharedPreferences(...)"

    .line 7
    .line 8
    invoke-static {v1, v2, v3}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    invoke-virtual {v7, v0, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    const-string v9, "usage_stats_last_report_time"

    .line 33
    .line 34
    const-wide/16 v10, 0x0

    .line 35
    .line 36
    invoke-interface {v4, v9, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v10

    .line 40
    sget-boolean v12, Lz0/i;->a:Z

    .line 41
    .line 42
    invoke-static {}, Lz0/g;->m()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v12

    .line 46
    const-string v13, "usage_stats_last_report_wxid"

    .line 47
    .line 48
    const-string v14, ""

    .line 49
    .line 50
    invoke-interface {v4, v13, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v15

    .line 54
    if-nez v15, :cond_0

    .line 55
    .line 56
    move-object v15, v14

    .line 57
    :cond_0
    if-nez p0, :cond_2

    .line 58
    .line 59
    sub-long v10, v7, v10

    .line 60
    .line 61
    const-wide/32 v16, 0x5265c00

    .line 62
    .line 63
    .line 64
    cmp-long v10, v10, v16

    .line 65
    .line 66
    if-gez v10, :cond_2

    .line 67
    .line 68
    invoke-static {v12}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-nez v10, :cond_1

    .line 73
    .line 74
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-eqz v10, :cond_2

    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :cond_2
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-interface {v4, v9, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-interface {v4, v13, v12}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v4, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2, v0, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    .line 120
    .line 121
    :catchall_1
    const-string v0, "usage_stats_install_id"

    .line 122
    .line 123
    invoke-interface {v1, v0, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const-string v3, "toString(...)"

    .line 128
    .line 129
    if-eqz v2, :cond_3

    .line 130
    .line 131
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    :cond_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 157
    .line 158
    .line 159
    :cond_4
    new-instance v0, Lorg/json/JSONObject;

    .line 160
    .line 161
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v1, "installId"

    .line 165
    .line 166
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-string v1, "wxid"

    .line 171
    .line 172
    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const-string v1, "appVersionCode"

    .line 177
    .line 178
    const/16 v2, 0x403

    .line 179
    .line 180
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v1, "appVersionName"

    .line 185
    .line 186
    const-string v2, "3.0.2d"

    .line 187
    .line 188
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    sget-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_6

    .line 199
    .line 200
    :try_start_2
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const/4 v4, 0x0

    .line 217
    invoke-virtual {v0, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 222
    .line 223
    if-nez v0, :cond_5

    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_5
    move-object v14, v0

    .line 227
    goto :goto_0

    .line 228
    :catch_0
    move-exception v0

    .line 229
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :goto_0
    sput-object v14, Lz0/r;->f:Ljava/lang/String;

    .line 237
    .line 238
    :cond_6
    sget-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 239
    .line 240
    const-string v2, "wechatVersion"

    .line 241
    .line 242
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 247
    .line 248
    new-instance v2, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    const-string v4, "Android "

    .line 251
    .line 252
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    const-string v2, "androidVersion"

    .line 263
    .line 264
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    const-string v1, "sdkInt"

    .line 269
    .line 270
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 271
    .line 272
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const-string v1, "put(...)"

    .line 277
    .line 278
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v0}, Lz0/r;->a(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    sget-object v1, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 293
    .line 294
    const/4 v1, 0x6

    .line 295
    new-array v1, v1, [C

    .line 296
    .line 297
    fill-array-data v1, :array_0

    .line 298
    .line 299
    .line 300
    invoke-static {v1}, Lz0/r;->d([C)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    new-instance v2, Lr0/n1;

    .line 305
    .line 306
    const/16 v3, 0x1c

    .line 307
    .line 308
    invoke-direct {v2, v3}, Lr0/n1;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v1, v0, v2}, LD/h;->L(Ljava/lang/String;Ljava/lang/String;LM0/l;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :array_0
    .array-data 2
        0x72s
        0x65s
        0x70s
        0x6fs
        0x72s
        0x74s
    .end array-data
.end method

.method public static final C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lz0/B;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_4

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    if-eq v0, p1, :cond_3

    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/4 p1, 0x4

    .line 27
    if-eq v0, p1, :cond_1

    .line 28
    .line 29
    return-object p4

    .line 30
    :cond_1
    return-object p0

    .line 31
    :cond_2
    return-object p3

    .line 32
    :cond_3
    return-object p2

    .line 33
    :cond_4
    return-object p1
.end method

.method public static final D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lz0/B;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_4

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    if-eq v0, p1, :cond_3

    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/4 p1, 0x4

    .line 27
    if-eq v0, p1, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    :cond_1
    return-object p0

    .line 31
    :cond_2
    return-object p3

    .line 32
    :cond_3
    return-object p2

    .line 33
    :cond_4
    return-object p1
.end method

.method public static E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    sget-object v0, Lz0/d;->a:Lz0/c;

    .line 2
    .line 3
    sget-object v0, Lz0/d;->d:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x4

    .line 10
    const-string v2, "app"

    .line 11
    .line 12
    const-string v3, "getSharedPreferences(...)"

    .line 13
    .line 14
    invoke-static {v2, v0, v3}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "startReloadIfChangedUnexpectedly"

    .line 23
    .line 24
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    const-string v2, "update_config_cache"

    .line 36
    .line 37
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    :cond_1
    move-object v0, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {v0}, Lz0/c;->c(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    sput-object v0, Lz0/d;->d:Ljava/lang/String;

    .line 52
    .line 53
    :goto_0
    if-nez v0, :cond_3

    .line 54
    .line 55
    move-object v2, v1

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    new-instance v2, LE0/d;

    .line 65
    .line 66
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    instance-of v0, v2, LE0/d;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    move-object v2, v1

    .line 74
    :cond_4
    check-cast v2, Lorg/json/JSONObject;

    .line 75
    .line 76
    :goto_2
    if-nez v2, :cond_5

    .line 77
    .line 78
    :goto_3
    move-object v2, v1

    .line 79
    goto :goto_4

    .line 80
    :cond_5
    const-string v0, "hookPoints"

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_6
    invoke-static {}, Lz0/r;->p()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-nez v2, :cond_7

    .line 102
    .line 103
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :cond_7
    :goto_4
    if-eqz v2, :cond_b

    .line 112
    .line 113
    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-eqz p0, :cond_b

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-eqz p0, :cond_b

    .line 124
    .line 125
    const/4 p1, 0x0

    .line 126
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-static {p1, v0}, LD/h;->U(II)LR0/c;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v0, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    :cond_8
    :goto_5
    move-object v2, p1

    .line 144
    check-cast v2, LR0/b;

    .line 145
    .line 146
    iget-boolean v2, v2, LR0/b;->c:Z

    .line 147
    .line 148
    if-eqz v2, :cond_a

    .line 149
    .line 150
    move-object v2, p1

    .line 151
    check-cast v2, LR0/b;

    .line 152
    .line 153
    invoke-virtual {v2}, LR0/b;->a()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-nez v3, :cond_9

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_9
    move-object v2, v1

    .line 172
    :goto_6
    if-eqz v2, :cond_8

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_a
    move-object v1, v0

    .line 179
    :cond_b
    if-nez v1, :cond_c

    .line 180
    .line 181
    sget-object v1, LF0/s;->a:LF0/s;

    .line 182
    .line 183
    :cond_c
    invoke-static {v1, p2}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0
.end method

.method public static F(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2f

    .line 6
    .line 7
    const/16 v2, 0x2e

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0, v2, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-string p0, "V"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-string p0, "Z"

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    const-string p0, "B"

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    const-string p0, "C"

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    const-string p0, "S"

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_5
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    const-string p0, "I"

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_6
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    const-string p0, "J"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_7
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    const-string p0, "F"

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_8
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    const-string p0, "D"

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0, v2, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string v0, "L"

    .line 128
    .line 129
    const-string v1, ";"

    .line 130
    .line 131
    invoke-static {v0, p0, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method

.method public static a(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    .line 1
    invoke-static {}, Lz0/r;->l()Lz0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lz0/a;->a:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "packageName"

    .line 8
    .line 9
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v1, v0, Lz0/a;->b:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "runtimePackageName"

    .line 16
    .line 17
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object v1, v0, Lz0/a;->c:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "signatureSha256"

    .line 24
    .line 25
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v1, 0x0

    .line 30
    iget-boolean v2, v0, Lz0/a;->e:Z

    .line 31
    .line 32
    iget-boolean v3, v0, Lz0/a;->d:Z

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v4, v1

    .line 41
    :goto_0
    const-string v5, "integrityOk"

    .line 42
    .line 43
    invoke-virtual {p0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v4, "packageMatched"

    .line 48
    .line 49
    invoke-virtual {p0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v3, "signatureMatched"

    .line 54
    .line 55
    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v2, "moduleApkKnown"

    .line 60
    .line 61
    iget-boolean v0, v0, Lz0/a;->f:Z

    .line 62
    .line 63
    invoke-virtual {p0, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v0, "buildDebug"

    .line 68
    .line 69
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string v0, "put(...)"

    .line 74
    .line 75
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lz0/r;->l()Lz0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "|"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, v0, Lz0/a;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lz0/r;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "SHA-256"

    .line 7
    .line 8
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "getBytes(...)"

    .line 19
    .line 20
    invoke-static {p0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "digest(...)"

    .line 28
    .line 29
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lr0/n1;

    .line 33
    .line 34
    const/16 v1, 0x17

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lr0/n1;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0}, LF0/h;->g0([BLM0/l;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static d([C)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v2, Lz0/r;->a:[C

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v2, "://"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-object v2, Lz0/r;->b:[[C

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v3, v0, :cond_1

    .line 22
    .line 23
    aget-object v5, v2, v3

    .line 24
    .line 25
    add-int/lit8 v6, v4, 0x1

    .line 26
    .line 27
    if-lez v4, :cond_0

    .line 28
    .line 29
    const/16 v4, 0x2e

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    move v4, v6

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/16 v2, 0x2f

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    new-array v0, v0, [C

    .line 47
    .line 48
    fill-array-data v0, :array_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v0, "toString(...)"

    .line 65
    .line 66
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :array_0
    .array-data 2
        0x61s
        0x70s
        0x69s
    .end array-data
.end method

.method public static e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    check-cast v0, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "keys(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, LF0/j;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-direct {v1, v2, v0}, LF0/j;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, LT0/a;

    .line 36
    .line 37
    invoke-direct {v0, v1}, LT0/a;-><init>(LF0/j;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, LT0/i;->Z(LT0/h;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, LF0/k;->q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v5, Lr0/t0;

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    invoke-direct {v5, v0, p0}, Lr0/t0;-><init>(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const-string v3, "{"

    .line 55
    .line 56
    const-string v4, "}"

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    const/16 v6, 0x19

    .line 60
    .line 61
    invoke-static/range {v1 .. v6}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_1
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    move-object v0, p0

    .line 71
    check-cast v0, Lorg/json/JSONArray;

    .line 72
    .line 73
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-static {v1, v0}, LD/h;->U(II)LR0/c;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v6, Lr0/t0;

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    invoke-direct {v6, v0, p0}, Lr0/t0;-><init>(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const-string v4, "["

    .line 89
    .line 90
    const-string v5, "]"

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    const/16 v7, 0x19

    .line 94
    .line 95
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    check-cast p0, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {p0}, Lz0/r;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_3
    instance-of v0, p0, Ljava/lang/Number;

    .line 112
    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Lz0/r;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_5
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_6
    :goto_1
    const-string p0, "null"

    .line 135
    .line 136
    return-object p0
.end method

.method public static f(Ljava/lang/CharSequence;)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "clipboard"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/content/ClipboardManager;

    .line 12
    .line 13
    const-string v1, "Label"

    .line 14
    .line 15
    invoke-static {v1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :catch_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static final g()Lz0/A;
    .locals 9

    .line 1
    invoke-static {}, Lz0/r;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lz0/r;->f:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, ""

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v1, v4, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v2, v1

    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v1

    .line 44
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Li0/a;->b([Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    sput-object v2, Lz0/r;->f:Ljava/lang/String;

    .line 52
    .line 53
    :cond_1
    sget-object v1, Lz0/r;->f:Ljava/lang/String;

    .line 54
    .line 55
    sget-object v2, Lz0/A;->c:Lz0/c;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lz0/A;->values()[Lz0/A;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    array-length v4, v2

    .line 65
    move v5, v3

    .line 66
    :goto_1
    const/4 v6, 0x0

    .line 67
    if-ge v5, v4, :cond_3

    .line 68
    .line 69
    aget-object v7, v2, v5

    .line 70
    .line 71
    iget v8, v7, Lz0/A;->a:I

    .line 72
    .line 73
    if-ne v8, v0, :cond_2

    .line 74
    .line 75
    iget-object v8, v7, Lz0/A;->b:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1, v3, v8}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v7, v6

    .line 88
    :goto_2
    if-nez v7, :cond_6

    .line 89
    .line 90
    invoke-static {}, Lz0/A;->values()[Lz0/A;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    array-length v2, v0

    .line 95
    move v4, v3

    .line 96
    :goto_3
    if-ge v4, v2, :cond_5

    .line 97
    .line 98
    aget-object v5, v0, v4

    .line 99
    .line 100
    iget-object v7, v5, Lz0/A;->b:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v1, v3, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_4

    .line 107
    .line 108
    return-object v5

    .line 109
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    return-object v6

    .line 113
    :cond_6
    return-object v7
.end method

.method public static final h()I
    .locals 4

    .line 1
    sget v0, Lz0/r;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sput v1, Lz0/r;->e:I

    .line 39
    .line 40
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 41
    .line 42
    return v0
.end method

.method public static i(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "payloadText"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    const-string v0, "payload"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Lz0/r;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    new-instance v0, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string p0, "signature"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    const-string p0, "signatureAlgorithm"

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lz0/r;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static j(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getDeclaredMethods(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v4, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-static {v3}, Lz0/r;->w(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v4, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-class v5, Ljava/lang/String;

    .line 51
    .line 52
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v4, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4, p0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    return-object v3

    .line 73
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p0, 0x0

    .line 77
    return-object p0
.end method

.method public static k(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "getDeclaredMethods(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    array-length v0, p0

    .line 16
    const/4 v7, 0x0

    .line 17
    move v2, v7

    .line 18
    :goto_0
    const/4 v3, 0x6

    .line 19
    if-ge v2, v0, :cond_1

    .line 20
    .line 21
    aget-object v4, p0, v2

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v5, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    array-length v5, v5

    .line 48
    if-ne v5, v3, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v8, 0x0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v2, v0

    .line 72
    check-cast v2, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v4, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    invoke-static {v2}, Lz0/r;->w(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-static {v4, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    array-length v2, v2

    .line 109
    if-ne v2, v3, :cond_2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    move-object v0, v8

    .line 113
    :goto_1
    check-cast v0, Ljava/lang/reflect/Method;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_4
    const-string p0, "expected="

    .line 119
    .line 120
    invoke-static {p0, p1, p2}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v5, Lr0/n1;

    .line 125
    .line 126
    const/16 p1, 0x1a

    .line 127
    .line 128
    invoke-direct {v5, p1}, Lr0/n1;-><init>(I)V

    .line 129
    .line 130
    .line 131
    const/4 v3, 0x0

    .line 132
    const/4 v4, 0x0

    .line 133
    const-string v2, ";"

    .line 134
    .line 135
    const/16 v6, 0x1e

    .line 136
    .line 137
    invoke-static/range {v1 .. v6}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string p2, "read trace send appmsg exact method missing"

    .line 142
    .line 143
    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_6

    .line 159
    .line 160
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    move-object p2, p1

    .line 165
    check-cast p2, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    aget-object v0, v0, v7

    .line 172
    .line 173
    invoke-static {v0, p3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_5

    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const/4 v1, 0x1

    .line 184
    aget-object v0, v0, v1

    .line 185
    .line 186
    const-class v1, Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_5

    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const/4 v2, 0x2

    .line 199
    aget-object v0, v0, v2

    .line 200
    .line 201
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_5

    .line 206
    .line 207
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    const/4 v2, 0x3

    .line 212
    aget-object v0, v0, v2

    .line 213
    .line 214
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_5

    .line 219
    .line 220
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const/4 v2, 0x4

    .line 225
    aget-object v0, v0, v2

    .line 226
    .line 227
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_5

    .line 232
    .line 233
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    const/4 v0, 0x5

    .line 238
    aget-object p2, p2, v0

    .line 239
    .line 240
    const-class v0, [B

    .line 241
    .line 242
    invoke-static {p2, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-eqz p2, :cond_5

    .line 247
    .line 248
    move-object v8, p1

    .line 249
    :cond_6
    check-cast v8, Ljava/lang/reflect/Method;

    .line 250
    .line 251
    return-object v8
.end method

.method public static final l()Lz0/a;
    .locals 16

    .line 1
    const-string v0, "com.lu.wxmask272"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    sget-object v2, Lz0/r;->d:Lz0/a;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5}, LN0/g;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    const/16 v7, 0x1c

    .line 26
    .line 27
    if-lt v6, v7, :cond_1

    .line 28
    .line 29
    const/high16 v6, 0x8000000

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/16 v6, 0x40

    .line 33
    .line 34
    :goto_0
    const/4 v7, 0x0

    .line 35
    :try_start_1
    invoke-virtual {v5, v0, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 36
    .line 37
    .line 38
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    goto :goto_2

    .line 40
    :catchall_0
    :try_start_2
    sget-object v8, Lz0/r;->c:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v8, :cond_3

    .line 43
    .line 44
    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    if-nez v9, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v8, v7

    .line 52
    :goto_1
    if-eqz v8, :cond_3

    .line 53
    .line 54
    invoke-virtual {v5, v8, v6}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-object v5, v7

    .line 62
    :goto_2
    if-eqz v5, :cond_4

    .line 63
    .line 64
    iget-object v6, v5, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :catchall_1
    move-exception v0

    .line 68
    goto :goto_9

    .line 69
    :cond_4
    move-object v6, v7

    .line 70
    :goto_3
    if-nez v6, :cond_5

    .line 71
    .line 72
    move-object v9, v1

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    move-object v9, v6

    .line 75
    :goto_4
    if-eqz v5, :cond_6

    .line 76
    .line 77
    invoke-static {v5}, Lz0/r;->n(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    :cond_6
    if-nez v7, :cond_7

    .line 82
    .line 83
    move-object v11, v1

    .line 84
    goto :goto_5

    .line 85
    :cond_7
    move-object v11, v7

    .line 86
    :goto_5
    new-instance v8, Lz0/a;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-nez v4, :cond_8

    .line 93
    .line 94
    move-object v10, v1

    .line 95
    goto :goto_6

    .line 96
    :cond_8
    move-object v10, v4

    .line 97
    :goto_6
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    const-string v0, "144F663F47B90C07DB065B5DBD7DDB20FC5794083D7B40AC266581AAE69D8928"

    .line 102
    .line 103
    invoke-virtual {v11, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v13

    .line 107
    sget-object v0, Lz0/r;->c:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_9

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_9
    move v14, v3

    .line 119
    goto :goto_8

    .line 120
    :cond_a
    :goto_7
    move v14, v2

    .line 121
    :goto_8
    const-string v15, ""

    .line 122
    .line 123
    invoke-direct/range {v8 .. v15}, Lz0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    .line 125
    .line 126
    goto :goto_a

    .line 127
    :goto_9
    new-instance v8, LE0/d;

    .line 128
    .line 129
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :goto_a
    invoke-static {v8}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-nez v4, :cond_b

    .line 137
    .line 138
    goto :goto_d

    .line 139
    :cond_b
    const-string v0, "app integrity check failed"

    .line 140
    .line 141
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :try_start_3
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 156
    goto :goto_b

    .line 157
    :catchall_2
    move-exception v0

    .line 158
    new-instance v5, LE0/d;

    .line 159
    .line 160
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    move-object v0, v5

    .line 164
    :goto_b
    nop

    .line 165
    instance-of v5, v0, LE0/d;

    .line 166
    .line 167
    if-eqz v5, :cond_c

    .line 168
    .line 169
    move-object v0, v1

    .line 170
    :cond_c
    const-string v5, "getOrDefault(...)"

    .line 171
    .line 172
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    move-object v8, v0

    .line 176
    check-cast v8, Ljava/lang/String;

    .line 177
    .line 178
    sget-object v0, Lz0/r;->c:Ljava/lang/String;

    .line 179
    .line 180
    if-eqz v0, :cond_d

    .line 181
    .line 182
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_e

    .line 187
    .line 188
    :cond_d
    move v2, v3

    .line 189
    :cond_e
    xor-int/lit8 v12, v2, 0x1

    .line 190
    .line 191
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-nez v2, :cond_f

    .line 204
    .line 205
    goto :goto_c

    .line 206
    :cond_f
    move-object v1, v2

    .line 207
    :goto_c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v0, ": "

    .line 216
    .line 217
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    new-instance v6, Lz0/a;

    .line 228
    .line 229
    const/4 v10, 0x0

    .line 230
    const/4 v11, 0x0

    .line 231
    const-string v7, ""

    .line 232
    .line 233
    const-string v9, ""

    .line 234
    .line 235
    invoke-direct/range {v6 .. v13}, Lz0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    move-object v8, v6

    .line 239
    :goto_d
    check-cast v8, Lz0/a;

    .line 240
    .line 241
    sput-object v8, Lz0/r;->d:Lz0/a;

    .line 242
    .line 243
    return-object v8
.end method

.method public static m()Ljava/lang/String;
    .locals 11

    .line 1
    sget-object v0, Lz0/r;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lz0/r;->g:Ljava/lang/String;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v1, v2

    .line 38
    :goto_0
    const-string v3, ""

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    move-object v1, v3

    .line 43
    :cond_2
    :try_start_1
    iget-object v4, v0, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v4, :cond_5

    .line 46
    .line 47
    check-cast v4, [Ljava/lang/Comparable;

    .line 48
    .line 49
    array-length v2, v4

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    array-length v2, v4

    .line 54
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v4, "copyOf(...)"

    .line 59
    .line 60
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v4, v2

    .line 64
    check-cast v4, [Ljava/lang/Comparable;

    .line 65
    .line 66
    array-length v2, v4

    .line 67
    const/4 v5, 0x1

    .line 68
    if-le v2, v5, :cond_4

    .line 69
    .line 70
    invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_1
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const-string v6, ","

    .line 78
    .line 79
    const/16 v10, 0x3e

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v5 .. v10}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :cond_5
    if-nez v2, :cond_6

    .line 89
    .line 90
    move-object v2, v3

    .line 91
    :cond_6
    iget v4, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 92
    .line 93
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    iget-object v5, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v5, :cond_7

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_7
    move-object v3, v5

    .line 103
    :goto_2
    iget-wide v5, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 104
    .line 105
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    filled-new-array {v4, v3, v0, v1, v2}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-string v2, "|"

    .line 118
    .line 119
    const/16 v6, 0x3e

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    const/4 v4, 0x0

    .line 123
    const/4 v5, 0x0

    .line 124
    invoke-static/range {v1 .. v6}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v1, "SHA-256"

    .line 129
    .line 130
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget-object v2, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const-string v2, "getBytes(...)"

    .line 141
    .line 142
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v1, "digest(...)"

    .line 150
    .line 151
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v1, Lr0/n1;

    .line 155
    .line 156
    const/16 v2, 0x16

    .line 157
    .line 158
    invoke-direct {v1, v2}, Lr0/n1;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v1}, LF0/h;->g0([BLM0/l;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    goto :goto_3

    .line 166
    :catch_0
    move-exception v0

    .line 167
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {}, Lz0/r;->p()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    new-instance v2, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v0, ":"

    .line 191
    .line 192
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :goto_3
    sput-object v0, Lz0/r;->g:Ljava/lang/String;

    .line 203
    .line 204
    return-object v0
.end method

.method public static n(Landroid/content/pm/PackageInfo;)Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x1c

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-lt v0, v2, :cond_1

    .line 8
    .line 9
    invoke-static {p0}, Landroidx/emoji2/text/b;->c(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_3

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/emoji2/text/b;->s(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_3

    .line 20
    .line 21
    array-length v0, p0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    move-object p0, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    aget-object p0, p0, v1

    .line 27
    .line 28
    :goto_0
    if-eqz p0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 36
    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    array-length v0, p0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    move-object p0, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    aget-object p0, p0, v1

    .line 45
    .line 46
    :goto_1
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_3
    :goto_2
    if-nez v3, :cond_4

    .line 53
    .line 54
    const-string p0, ""

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    const-string p0, "SHA-256"

    .line 58
    .line 59
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0, v3}, Ljava/security/MessageDigest;->digest([B)[B

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v0, "digest(...)"

    .line 68
    .line 69
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lr0/n1;

    .line 73
    .line 74
    const/16 v1, 0x12

    .line 75
    .line 76
    invoke-direct {v0, v1}, Lr0/n1;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v0}, LF0/h;->g0([BLM0/l;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public static o()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lz0/r;->p()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, "("

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ")"

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method public static p()I
    .locals 4

    .line 1
    sget v0, Lz0/r;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sput v1, Lz0/r;->e:I

    .line 39
    .line 40
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 41
    .line 42
    return v0
.end method

.method public static q()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    sget-object v1, Lz0/r;->f:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v1

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v1

    .line 40
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Li0/a;->b([Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sput-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 48
    .line 49
    :cond_1
    sget-object v0, Lz0/r;->f:Ljava/lang/String;

    .line 50
    .line 51
    return-object v0
.end method

.method public static final r(I)Z
    .locals 1

    .line 1
    invoke-static {}, Lz0/r;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static final varargs s([I)Z
    .locals 5

    .line 1
    invoke-static {}, Lz0/r;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget v4, p0, v3

    .line 11
    .line 12
    if-ne v0, v4, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v3, -0x1

    .line 19
    :goto_1
    if-ltz v3, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_2
    return v2
.end method

.method public static t()Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    array-length v4, v2

    .line 28
    move v5, v0

    .line 29
    :goto_0
    if-ge v5, v4, :cond_2

    .line 30
    .line 31
    aget-object v6, v2, v5

    .line 32
    .line 33
    const-string v7, "delivery"

    .line 34
    .line 35
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_1

    .line 40
    .line 41
    invoke-static {v6}, LN0/g;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const-string v7, "delivery."

    .line 45
    .line 46
    invoke-static {v6, v0, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-nez v7, :cond_1

    .line 51
    .line 52
    const-string v7, "config."

    .line 53
    .line 54
    invoke-static {v6, v0, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception v1

    .line 65
    goto :goto_4

    .line 66
    :cond_1
    :goto_1
    move v2, v3

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move v2, v0

    .line 69
    :goto_2
    :try_start_1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v4, "com.android.vending"

    .line 82
    .line 83
    invoke-static {v1, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    goto :goto_3

    .line 92
    :catchall_0
    move-exception v1

    .line 93
    :try_start_2
    new-instance v4, LE0/d;

    .line 94
    .line 95
    invoke-direct {v4, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v1, v4

    .line 99
    :goto_3
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 100
    .line 101
    instance-of v5, v1, LE0/d;

    .line 102
    .line 103
    if-eqz v5, :cond_3

    .line 104
    .line 105
    move-object v1, v4

    .line 106
    :cond_3
    check-cast v1, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 112
    if-nez v2, :cond_4

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    :cond_4
    move v0, v3

    .line 117
    goto :goto_5

    .line 118
    :goto_4
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v1}, Li0/a;->b([Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    :goto_5
    return v0
.end method

.method public static final u()Z
    .locals 3

    .line 1
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lz0/B;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v0, v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-eq v0, v2, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-eq v0, v2, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return v0

    .line 31
    :cond_1
    return v1
.end method

.method public static final v()Z
    .locals 2

    .line 1
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lz0/A;->f:Lz0/A;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static w(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getParameterTypes(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lr0/n1;

    .line 11
    .line 12
    const/16 v2, 0x19

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lr0/n1;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v2, 0x18

    .line 18
    .line 19
    const-string v3, ""

    .line 20
    .line 21
    invoke-static {v0, v3, v1, v2}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "getReturnType(...)"

    .line 30
    .line 31
    invoke-static {p0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lz0/r;->F(Ljava/lang/Class;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static x(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "\\s+"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "compile(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, ""

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "replaceAll(...)"

    .line 23
    .line 24
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static y(Landroid/content/Context;)Z
    .locals 9

    .line 1
    sget-object v0, Lz0/r;->i:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lz0/r;->j:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    sget-object v0, Lz0/r;->h:LA0/S;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    invoke-static {p0}, LA0/l;->j(Landroid/content/Context;)LA0/S;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sput-object v0, Lz0/r;->h:LA0/S;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, v2

    .line 27
    :goto_0
    if-nez v0, :cond_2

    .line 28
    .line 29
    return v3

    .line 30
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object v4, v0, LA0/S;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v4, v3, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v5, v0, LA0/S;->h:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v5, v3, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v5, v0, LA0/S;->f:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v6, v0, LA0/S;->g:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v4, v5, v6}, Lz0/r;->j(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    sput-object v5, Lz0/r;->i:Ljava/lang/reflect/Method;

    .line 58
    .line 59
    invoke-static {p0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v5, v0, LA0/S;->i:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v0, v0, LA0/S;->j:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {p0, v5, v0, v4}, Lz0/r;->k(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sput-object p0, Lz0/r;->j:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    sget-object p0, Lz0/r;->i:Ljava/lang/reflect/Method;

    .line 73
    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object p0, Lz0/r;->j:Ljava/lang/reflect/Method;

    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 84
    .line 85
    .line 86
    :cond_4
    const-string p0, "read trace sender prepared"

    .line 87
    .line 88
    sget-object v0, Lz0/r;->i:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    const-string v4, "#"

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v0}, Lz0/r;->w(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v7, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    goto :goto_1

    .line 132
    :cond_5
    move-object v0, v2

    .line 133
    :goto_1
    const-string v5, ""

    .line 134
    .line 135
    if-nez v0, :cond_6

    .line 136
    .line 137
    move-object v0, v5

    .line 138
    :cond_6
    :try_start_2
    sget-object v6, Lz0/r;->j:Ljava/lang/reflect/Method;

    .line 139
    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-static {v6}, Lz0/r;->w(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    new-instance v8, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    :cond_7
    if-nez v2, :cond_8

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_8
    move-object v5, v2

    .line 183
    :goto_2
    filled-new-array {p0, v0, v5}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    sget-object p0, Lz0/r;->i:Ljava/lang/reflect/Method;

    .line 191
    .line 192
    if-eqz p0, :cond_9

    .line 193
    .line 194
    sget-object p0, Lz0/r;->j:Ljava/lang/reflect/Method;

    .line 195
    .line 196
    if-eqz p0, :cond_9

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_9
    move v1, v3

    .line 200
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    goto :goto_4

    .line 205
    :catchall_0
    move-exception p0

    .line 206
    new-instance v0, LE0/d;

    .line 207
    .line 208
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    move-object p0, v0

    .line 212
    :goto_4
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    const-string v1, "read trace prepare sender fail"

    .line 219
    .line 220
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :cond_a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 228
    .line 229
    instance-of v1, p0, LE0/d;

    .line 230
    .line 231
    if-eqz v1, :cond_b

    .line 232
    .line 233
    move-object p0, v0

    .line 234
    :cond_b
    check-cast p0, Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    return p0
.end method

.method public static z(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, 0x2

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x22

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const-string v5, "toString(...)"

    .line 24
    .line 25
    if-ge v3, v4, :cond_b

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/16 v6, 0xc

    .line 32
    .line 33
    if-eq v4, v6, :cond_a

    .line 34
    .line 35
    const/16 v6, 0xd

    .line 36
    .line 37
    if-eq v4, v6, :cond_9

    .line 38
    .line 39
    if-eq v4, v1, :cond_8

    .line 40
    .line 41
    const/16 v6, 0x5c

    .line 42
    .line 43
    if-eq v4, v6, :cond_7

    .line 44
    .line 45
    packed-switch v4, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    const/16 v6, 0x1f

    .line 49
    .line 50
    if-gt v4, v6, :cond_6

    .line 51
    .line 52
    const-string v6, "\\u"

    .line 53
    .line 54
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 v6, 0x10

    .line 58
    .line 59
    invoke-static {v6}, LD/h;->e(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v4, v6}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const/4 v6, 0x4

    .line 74
    if-gt v6, v5, :cond_0

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    goto :goto_4

    .line 85
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 88
    .line 89
    .line 90
    new-instance v7, LR0/c;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    sub-int/2addr v6, v8

    .line 97
    const/4 v8, 0x1

    .line 98
    invoke-direct {v7, v8, v6, v8}, LR0/a;-><init>(III)V

    .line 99
    .line 100
    .line 101
    iget v6, v7, LR0/a;->b:I

    .line 102
    .line 103
    if-gt v8, v6, :cond_1

    .line 104
    .line 105
    move v7, v8

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move v7, v2

    .line 108
    :goto_1
    if-eqz v7, :cond_2

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    move v8, v6

    .line 112
    :goto_2
    if-eqz v7, :cond_5

    .line 113
    .line 114
    if-ne v8, v6, :cond_4

    .line 115
    .line 116
    if-eqz v7, :cond_3

    .line 117
    .line 118
    move v7, v2

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 121
    .line 122
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 127
    .line 128
    :goto_3
    const/16 v9, 0x30

    .line 129
    .line 130
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    move-object v4, v5

    .line 138
    :goto_4
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_6
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :pswitch_0
    const-string v4, "\\n"

    .line 151
    .line 152
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :pswitch_1
    const-string v4, "\\t"

    .line 157
    .line 158
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :pswitch_2
    const-string v4, "\\b"

    .line 163
    .line 164
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    const-string v4, "\\\\"

    .line 169
    .line 170
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_8
    const-string v4, "\\\""

    .line 175
    .line 176
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_9
    const-string v4, "\\r"

    .line 181
    .line 182
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_a
    const-string v4, "\\f"

    .line 187
    .line 188
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_b
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-object p0

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
