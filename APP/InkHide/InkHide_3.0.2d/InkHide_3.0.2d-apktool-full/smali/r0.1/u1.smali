.class public final synthetic Lr0/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/x1;


# direct methods
.method public synthetic constructor <init>(Lr0/x1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/u1;->a:I

    iput-object p1, p0, Lr0/u1;->b:Lr0/x1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lr0/u1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr0/u1;->b:Lr0/x1;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lr0/x1;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Landroid/content/Context;

    .line 22
    .line 23
    const-string v0, "appContext"

    .line 24
    .line 25
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, LA0/k;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object p1, v1

    .line 46
    :goto_0
    if-eqz p1, :cond_5

    .line 47
    .line 48
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    :try_start_0
    new-instance v0, LA0/a;

    .line 56
    .line 57
    const/16 v2, 0x11

    .line 58
    .line 59
    invoke-direct {v0, v2}, LA0/a;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v0}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, LA0/S;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    new-instance v0, LE0/d;

    .line 71
    .line 72
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object p1, v0

    .line 76
    :goto_1
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    const-string v2, "read trace dexkit resolve fail"

    .line 83
    .line 84
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    instance-of v0, p1, LE0/d;

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    move-object v1, p1

    .line 97
    :goto_2
    check-cast v1, LA0/S;

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    :goto_3
    const-string p1, "read trace dexkit apk path empty"

    .line 101
    .line 102
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :goto_4
    const/4 p1, 0x0

    .line 110
    const/4 v0, 0x1

    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    new-instance v2, Lorg/json/JSONObject;

    .line 114
    .line 115
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v3, "sendClickClassName"

    .line 119
    .line 120
    iget-object v4, v1, LA0/S;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v3, "sendClickMethodName"

    .line 127
    .line 128
    iget-object v4, v1, LA0/S;->b:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const-string v3, "sendClickMethodSign"

    .line 135
    .line 136
    iget-object v4, v1, LA0/S;->c:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    new-instance v3, Lorg/json/JSONArray;

    .line 143
    .line 144
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 145
    .line 146
    .line 147
    iget-object v4, v1, LA0/S;->d:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v5

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
    check-cast v5, LA0/T;

    .line 164
    .line 165
    new-instance v6, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 168
    .line 169
    .line 170
    iget-object v7, v5, LA0/T;->a:Ljava/lang/String;

    .line 171
    .line 172
    const-string v8, "className"

    .line 173
    .line 174
    invoke-virtual {v6, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    const-string v7, "methodName"

    .line 179
    .line 180
    iget-object v8, v5, LA0/T;->b:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    const-string v7, "methodSign"

    .line 187
    .line 188
    iget-object v5, v5, LA0/T;->c:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v6, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_6
    const-string v4, "sendClickMethods"

    .line 199
    .line 200
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const-string v3, "appMsgContentClassName"

    .line 205
    .line 206
    iget-object v4, v1, LA0/S;->e:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const-string v3, "parseXmlMethodName"

    .line 213
    .line 214
    iget-object v4, v1, LA0/S;->f:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const-string v3, "parseXmlMethodSign"

    .line 221
    .line 222
    iget-object v4, v1, LA0/S;->g:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const-string v3, "appMsgLogicClassName"

    .line 229
    .line 230
    iget-object v4, v1, LA0/S;->h:Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const-string v3, "sendAppMsgMethodName"

    .line 237
    .line 238
    iget-object v4, v1, LA0/S;->i:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    const-string v3, "sendAppMsgMethodSign"

    .line 245
    .line 246
    iget-object v4, v1, LA0/S;->j:Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    const-string v3, "put(...)"

    .line 253
    .line 254
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const/4 v3, 0x4

    .line 258
    invoke-static {v2, v3}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    const-string v4, "hook_point_cache"

    .line 267
    .line 268
    invoke-virtual {v3, v4, p1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    const-string v3, "getSharedPreferences(...)"

    .line 273
    .line 274
    invoke-static {p1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    const-string v3, "read_trace_v1"

    .line 282
    .line 283
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-interface {p1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 292
    .line 293
    .line 294
    iget-object p1, p0, Lr0/u1;->b:Lr0/x1;

    .line 295
    .line 296
    iput-object v1, p1, Lr0/x1;->b:LA0/S;

    .line 297
    .line 298
    new-instance p1, LA0/t;

    .line 299
    .line 300
    const-string v1, "\u6210\u529f"

    .line 301
    .line 302
    invoke-direct {p1, v0, v1, v0}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_7
    new-instance v1, LA0/t;

    .line 307
    .line 308
    const-string v2, "\u672a\u627e\u5230\u5df2\u8bfb\u8ffd\u8e2a\u53d1\u9001 Hook \u70b9"

    .line 309
    .line 310
    invoke-direct {v1, p1, v2, v0}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 311
    .line 312
    .line 313
    move-object p1, v1

    .line 314
    :goto_6
    return-object p1

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
