.class public final synthetic Lr0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements Ld0/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/H0;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/k0;->a:I

    iput-object p1, p0, Lr0/k0;->b:Lr0/H0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    array-length v2, v0

    .line 42
    const/4 v3, 0x2

    .line 43
    if-lt v2, v3, :cond_4

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    aget-object v4, v0, v2

    .line 47
    .line 48
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    aget-object v4, v0, v1

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v5, "RecyclerView"

    .line 63
    .line 64
    invoke-static {v4, v5, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    aget-object v4, v0, v1

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const-string v5, "androidx.recyclerview.widget.k3"

    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    const-string v5, "onBindViewHolder"

    .line 90
    .line 91
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 103
    .line 104
    invoke-static {p1, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    array-length p1, v0

    .line 111
    if-eq p1, v3, :cond_3

    .line 112
    .line 113
    array-length p1, v0

    .line 114
    const/4 v4, 0x3

    .line 115
    if-ne p1, v4, :cond_4

    .line 116
    .line 117
    const-class p1, Ljava/util/List;

    .line 118
    .line 119
    aget-object v0, v0, v3

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_4

    .line 126
    .line 127
    :cond_3
    :goto_0
    return v2

    .line 128
    :cond_4
    :goto_1
    return v1
.end method

.method public b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Lr0/H0;->V0(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lr0/k0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    .line 7
    .line 8
    const-string v0, "clazz"

    .line 9
    .line 10
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lr0/H0;->J0(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_1
    check-cast p1, Ljava/lang/Class;

    .line 25
    .line 26
    const-string v0, "clazz"

    .line 27
    .line 28
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lr0/H0;->D0(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_2
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 46
    .line 47
    check-cast p1, Landroid/content/Context;

    .line 48
    .line 49
    const-string v1, "appContext"

    .line 50
    .line 51
    invoke-static {p1, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, LA0/k;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x0

    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v1, v2

    .line 72
    :goto_0
    if-eqz v1, :cond_5

    .line 73
    .line 74
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_2
    :try_start_0
    new-instance v3, LA0/h;

    .line 82
    .line 83
    const/4 v4, 0x4

    .line 84
    invoke-direct {v3, p1, v4}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v3}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, LA0/N;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    new-instance v1, LE0/d;

    .line 96
    .line 97
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object p1, v1

    .line 101
    :goto_1
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    const-string v3, "quick add dexkit resolve fail"

    .line 108
    .line 109
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    instance-of v1, p1, LE0/d;

    .line 117
    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    move-object v2, p1

    .line 122
    :goto_2
    check-cast v2, LA0/N;

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    :goto_3
    const-string p1, "quick add dexkit apk path empty"

    .line 126
    .line 127
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :goto_4
    const/4 p1, 0x0

    .line 135
    const/4 v1, 0x1

    .line 136
    if-eqz v2, :cond_8

    .line 137
    .line 138
    new-instance v3, Lorg/json/JSONArray;

    .line 139
    .line 140
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 141
    .line 142
    .line 143
    iget-object v4, v2, LA0/N;->d:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    const-string v6, "methodName"

    .line 154
    .line 155
    const-string v7, "popupClassName"

    .line 156
    .line 157
    if-eqz v5, :cond_6

    .line 158
    .line 159
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    check-cast v5, LA0/O;

    .line 164
    .line 165
    new-instance v8, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 168
    .line 169
    .line 170
    iget-object v9, v5, LA0/O;->a:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v8, v7, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    iget-object v8, v5, LA0/O;->b:Ljava/lang/String;

    .line 177
    .line 178
    const-string v9, "callbackClassName"

    .line 179
    .line 180
    invoke-virtual {v7, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    iget-object v5, v5, LA0/O;->c:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v7, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_6
    new-instance v4, Lorg/json/JSONArray;

    .line 195
    .line 196
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 197
    .line 198
    .line 199
    iget-object v5, v2, LA0/N;->e:Ljava/util/List;

    .line 200
    .line 201
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-eqz v8, :cond_7

    .line 210
    .line 211
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    check-cast v8, LA0/P;

    .line 216
    .line 217
    new-instance v9, Lorg/json/JSONObject;

    .line 218
    .line 219
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 220
    .line 221
    .line 222
    iget-object v10, v8, LA0/P;->a:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v9, v7, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    iget-object v8, v8, LA0/P;->b:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v9, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    invoke-virtual {v4, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 235
    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_7
    new-instance v5, Lorg/json/JSONObject;

    .line 239
    .line 240
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 241
    .line 242
    .line 243
    iget-object v6, v2, LA0/N;->a:Ljava/util/List;

    .line 244
    .line 245
    invoke-static {v6}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    const-string v7, "conversationLongClickClassNames"

    .line 250
    .line 251
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    iget-object v6, v2, LA0/N;->b:Ljava/util/List;

    .line 256
    .line 257
    invoke-static {v6}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    const-string v7, "conversationMenuCallbackClassNames"

    .line 262
    .line 263
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    iget-object v6, v2, LA0/N;->c:Ljava/util/List;

    .line 268
    .line 269
    invoke-static {v6}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    const-string v7, "popupClassNames"

    .line 274
    .line 275
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    const-string v6, "popupCreateSpecs"

    .line 280
    .line 281
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    const-string v5, "popupBuildSpecs"

    .line 286
    .line 287
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    iget-object v4, v2, LA0/N;->f:Ljava/util/List;

    .line 292
    .line 293
    invoke-static {v4}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    const-string v5, "popupClickHandlerClassNames"

    .line 298
    .line 299
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    iget-object v4, v2, LA0/N;->g:Ljava/util/List;

    .line 304
    .line 305
    invoke-static {v4}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    const-string v5, "popupAdapterClassNames"

    .line 310
    .line 311
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    iget-object v4, v2, LA0/N;->h:Ljava/util/List;

    .line 316
    .line 317
    invoke-static {v4}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    const-string v5, "contactMenuCallbackClassNames"

    .line 322
    .line 323
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    iget-object v4, v2, LA0/N;->i:Ljava/util/List;

    .line 328
    .line 329
    invoke-static {v4}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    const-string v5, "addressMenuCreateClassNames"

    .line 334
    .line 335
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    iget-object v4, v2, LA0/N;->j:Ljava/util/List;

    .line 340
    .line 341
    invoke-static {v4}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    const-string v5, "addressMenuClickClassNames"

    .line 346
    .line 347
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    const-string v4, "put(...)"

    .line 352
    .line 353
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const/4 v4, 0x5

    .line 357
    invoke-static {v3, v4}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    const-string v5, "hook_point_cache"

    .line 366
    .line 367
    invoke-virtual {v4, v5, p1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    const-string v4, "getSharedPreferences(...)"

    .line 372
    .line 373
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    const-string v4, "quick_add_menu_v10"

    .line 381
    .line 382
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 391
    .line 392
    .line 393
    iput-object v2, v0, Lr0/H0;->X:LA0/N;

    .line 394
    .line 395
    new-instance p1, LA0/t;

    .line 396
    .line 397
    const-string v0, "\\u5df2\\u8865\\u5168\\u5feb\\u6377\\u52a0\\u5165\\u7c7b\\u540d\\uff0c\\u91cd\\u542f\\u5fae\\u4fe1\\u540e\\u751f\\u6548"

    .line 398
    .line 399
    invoke-direct {p1, v1, v0, v1}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 400
    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_8
    new-instance v0, LA0/t;

    .line 404
    .line 405
    const-string v2, "\\u672a\\u627e\\u5230\\u5feb\\u6377\\u52a0\\u5165 Hook \\u70b9"

    .line 406
    .line 407
    invoke-direct {v0, p1, v2, v1}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 408
    .line 409
    .line 410
    move-object p1, v0

    .line 411
    :goto_7
    return-object p1

    .line 412
    :pswitch_3
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 413
    .line 414
    check-cast p1, Landroid/content/Context;

    .line 415
    .line 416
    const-string v1, "appContext"

    .line 417
    .line 418
    invoke-static {p1, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    const/16 v1, 0xbf4

    .line 422
    .line 423
    invoke-static {v1}, Lz0/r;->r(I)Z

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    const/4 v2, 0x1

    .line 428
    if-eqz v1, :cond_9

    .line 429
    .line 430
    new-instance p1, LA0/t;

    .line 431
    .line 432
    const-string v0, "\\u5df2\\u542f\\u7528\\u65e7\\u7248\\u4f1a\\u8bdd\\u5217\\u8868\\u4e34\\u65f6\\u5b66\\u4e60\\uff0c\\u8fdb\\u5165\\u5fae\\u4fe1\\u4e3b\\u9875\\u540e\\u81ea\\u52a8\\u5b8c\\u6210"

    .line 433
    .line 434
    invoke-direct {p1, v2, v0, v2}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_d

    .line 438
    .line 439
    :cond_9
    const-string v1, "conversation dexkit resolve start"

    .line 440
    .line 441
    invoke-static {v1}, LA0/g;->q(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-static {}, LA0/k;->a()Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    const/4 v3, 0x0

    .line 449
    if-nez v1, :cond_a

    .line 450
    .line 451
    const-string v1, "conversation dexkit unresolved dexkit library not loaded"

    .line 452
    .line 453
    invoke-static {v1}, LA0/g;->q(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    goto :goto_c

    .line 457
    :cond_a
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    if-eqz v1, :cond_b

    .line 462
    .line 463
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_b
    move-object v1, v3

    .line 467
    :goto_8
    if-eqz v1, :cond_f

    .line 468
    .line 469
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    if-eqz v4, :cond_c

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_c
    :try_start_1
    new-instance v4, LA0/h;

    .line 477
    .line 478
    const/4 v5, 0x1

    .line 479
    invoke-direct {v4, p1, v5}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 480
    .line 481
    .line 482
    invoke-static {v1, v4}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    check-cast v1, LA0/j;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 487
    .line 488
    goto :goto_9

    .line 489
    :catchall_1
    move-exception v1

    .line 490
    new-instance v4, LE0/d;

    .line 491
    .line 492
    invoke-direct {v4, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 493
    .line 494
    .line 495
    move-object v1, v4

    .line 496
    :goto_9
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    if-eqz v4, :cond_d

    .line 501
    .line 502
    const-string v5, "conversation dexkit resolve fail"

    .line 503
    .line 504
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    :cond_d
    instance-of v4, v1, LE0/d;

    .line 512
    .line 513
    if-eqz v4, :cond_e

    .line 514
    .line 515
    goto :goto_a

    .line 516
    :cond_e
    move-object v3, v1

    .line 517
    :goto_a
    check-cast v3, LA0/j;

    .line 518
    .line 519
    goto :goto_c

    .line 520
    :cond_f
    :goto_b
    const-string v1, "conversation dexkit unresolved apk path empty"

    .line 521
    .line 522
    invoke-static {v1}, LA0/g;->q(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    :goto_c
    if-eqz v3, :cond_11

    .line 526
    .line 527
    invoke-static {p1, v3}, LA0/l;->x(Landroid/content/Context;LA0/j;)V

    .line 528
    .line 529
    .line 530
    iput-object v3, v0, Lr0/H0;->W:LA0/j;

    .line 531
    .line 532
    new-instance p1, LA0/t;

    .line 533
    .line 534
    iget-object v0, v3, LA0/j;->a:Ljava/util/List;

    .line 535
    .line 536
    invoke-static {v0}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    check-cast v0, Ljava/lang/String;

    .line 541
    .line 542
    if-nez v0, :cond_10

    .line 543
    .line 544
    const-string v0, ""

    .line 545
    .line 546
    :cond_10
    const-string v1, "\\u5df2\\u627e\\u5230 "

    .line 547
    .line 548
    const-string v3, "\\uff0c\\u91cd\\u542f\\u5fae\\u4fe1\\u540e\\u751f\\u6548"

    .line 549
    .line 550
    invoke-static {v1, v0, v3}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-direct {p1, v2, v0, v2}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 555
    .line 556
    .line 557
    goto :goto_d

    .line 558
    :cond_11
    new-instance p1, LA0/t;

    .line 559
    .line 560
    const-string v0, "\\u6682\\u672a\\u627e\\u5230\\uff0c\\u5c06\\u542f\\u7528\\u4e34\\u65f6\\u5b66\\u4e60\\uff0c\\u8fdb\\u5165\\u5fae\\u4fe1\\u4e3b\\u9875\\u540e\\u81ea\\u52a8\\u5b8c\\u6210"

    .line 561
    .line 562
    invoke-direct {p1, v2, v0, v2}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 563
    .line 564
    .line 565
    :goto_d
    return-object p1

    .line 566
    :pswitch_4
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-static {p1}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    return-object p1

    .line 576
    :pswitch_5
    check-cast p1, Ljava/lang/Class;

    .line 577
    .line 578
    const-string v0, "clazz"

    .line 579
    .line 580
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    iget-object v0, p0, Lr0/k0;->b:Lr0/H0;

    .line 584
    .line 585
    invoke-virtual {v0, p1}, Lr0/H0;->K0(Ljava/lang/Class;)Z

    .line 586
    .line 587
    .line 588
    move-result p1

    .line 589
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    return-object p1

    .line 594
    nop

    .line 595
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
