.class public final Lr9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/os/Handler;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile δ:Landroid/content/Context;

.field public static volatile ε:Landroid/content/SharedPreferences;

.field public static volatile ζ:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lr9;->α:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lr9;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lr9;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    return-void
.end method

.method public static α(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v0

    .line 12
    :goto_0
    sput-object p0, Lr9;->δ:Landroid/content/Context;

    .line 13
    .line 14
    sget-object v0, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "dyhelper_beta_notice"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sput-object p0, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public static β(Ljava/lang/String;)V
    .locals 14

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "r62fe5deb53d30681"

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v2, Lr9;->δ:Landroid/content/Context;

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    move-object v2, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-static {v2}, Lr9;->α(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 21
    .line 22
    :goto_0
    if-nez v2, :cond_2

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_2
    new-instance v4, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p0, "update_time"

    .line 32
    .line 33
    invoke-virtual {v4, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-string p0, "notice"

    .line 49
    .line 50
    invoke-virtual {v4, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string v0, "\r\n"

    .line 58
    .line 59
    const-string v4, "\n"

    .line 60
    .line 61
    invoke-static {p0, v0, v4}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const/16 v0, 0xd

    .line 66
    .line 67
    const/16 v4, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    const/4 v0, 0x4

    .line 89
    if-nez p0, :cond_c

    .line 90
    .line 91
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_3

    .line 96
    .line 97
    goto/16 :goto_6

    .line 98
    .line 99
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 100
    .line 101
    .line 102
    move-result-wide v9

    .line 103
    invoke-static {v7}, Lr9;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-static {v2}, Lr9;->γ(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance v4, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v4, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const/4 v5, 0x0

    .line 121
    move v11, v5

    .line 122
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    if-eqz v12, :cond_5

    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    check-cast v12, Lp9;

    .line 133
    .line 134
    iget-object v12, v12, Lp9;->α:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v12, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-eqz v12, :cond_4

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object p0, v0

    .line 148
    goto/16 :goto_7

    .line 149
    .line 150
    :cond_5
    const/4 v11, -0x1

    .line 151
    :goto_2
    const/4 p0, 0x1

    .line 152
    if-ltz v11, :cond_7

    .line 153
    .line 154
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    check-cast v12, Lp9;

    .line 159
    .line 160
    iget-object v13, v12, Lp9;->γ:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v13, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-eqz v13, :cond_6

    .line 167
    .line 168
    iget-object v12, v12, Lp9;->β:Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v12, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-nez v12, :cond_8

    .line 175
    .line 176
    :cond_6
    new-instance v5, Lp9;

    .line 177
    .line 178
    invoke-direct/range {v5 .. v10}, Lp9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v11, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :goto_3
    move v5, p0

    .line 185
    goto :goto_4

    .line 186
    :cond_7
    new-instance v5, Lp9;

    .line 187
    .line 188
    invoke-direct/range {v5 .. v10}, Lp9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_8
    :goto_4
    invoke-static {v4}, Lr9;->ζ(Ljava/util/ArrayList;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    const/16 v4, 0x1e

    .line 200
    .line 201
    invoke-static {p0, v4}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const-string v4, "latest_date"

    .line 210
    .line 211
    invoke-interface {v2, v4, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    const-string v4, "latest_notice"

    .line 216
    .line 217
    invoke-interface {v2, v4, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const-string v4, "latest_hash"

    .line 222
    .line 223
    invoke-interface {v2, v4, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const-string v4, "latest_record_time"

    .line 228
    .line 229
    invoke-interface {v2, v4, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const-string v4, "history_json"

    .line 234
    .line 235
    invoke-static {p0}, Lr9;->η(Ljava/util/List;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-interface {v2, v4, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 244
    .line 245
    .line 246
    if-eqz v5, :cond_9

    .line 247
    .line 248
    const/16 p0, 0x8

    .line 249
    .line 250
    invoke-static {v8, p0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const-string v4, "notice saved date="

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v4, " hash="

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {v1, p0, v3, v0, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_9
    sget-object p0, Lr9;->ζ:Ljava/lang/ref/WeakReference;

    .line 283
    .line 284
    if-eqz p0, :cond_b

    .line 285
    .line 286
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    check-cast p0, Landroid/app/Activity;

    .line 291
    .line 292
    if-nez p0, :cond_a

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_a
    sget-object v0, Lr9;->α:Landroid/os/Handler;

    .line 296
    .line 297
    new-instance v2, Ln9;

    .line 298
    .line 299
    const/4 v3, 0x1

    .line 300
    invoke-direct {v2, p0, v3}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 304
    .line 305
    .line 306
    :cond_b
    :goto_5
    return-void

    .line 307
    :cond_c
    :goto_6
    const-string p0, "notice ignored, date or content empty"

    .line 308
    .line 309
    invoke-static {v1, p0, v3, v0, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :goto_7
    const-string v0, "handle notice failed"

    .line 314
    .line 315
    invoke-static {v1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    return-void
.end method

.method public static γ(Landroid/content/SharedPreferences;)Ljava/util/List;
    .locals 12

    .line 1
    const-string v0, "[]"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    :try_start_0
    const-string v2, "history_json"

    .line 6
    .line 7
    invoke-interface {p0, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p0

    .line 15
    :goto_0
    new-instance p0, Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_1
    if-ge v3, v2, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    const-string v5, "date"

    .line 40
    .line 41
    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    const-string v5, "notice"

    .line 57
    .line 58
    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    const-string v5, "hash"

    .line 74
    .line 75
    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_2

    .line 95
    .line 96
    invoke-static {v8}, Lr9;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    :cond_2
    move-object v9, v5

    .line 101
    const-string v5, "record_time"

    .line 102
    .line 103
    const-wide/16 v10, 0x0

    .line 104
    .line 105
    invoke-virtual {v4, v5, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v10

    .line 109
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_3

    .line 114
    .line 115
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_3

    .line 120
    .line 121
    new-instance v6, Lp9;

    .line 122
    .line 123
    invoke-direct/range {v6 .. v11}, Lp9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    invoke-static {v0}, Lr9;->ζ(Ljava/util/ArrayList;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    return-object p0

    .line 137
    :catchall_0
    sget-object p0, Ljz;->ε:Ljz;

    .line 138
    .line 139
    return-object p0
.end method

.method public static δ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lmf;->α:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, Ln7;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lg7;->ж([BLa80;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    return-object p0

    .line 34
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static ε(Landroid/app/Activity;)V
    .locals 11

    .line 1
    sget-object v1, Lr9;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lr9;->α:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v1, Ln9;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    sget-object v0, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p0}, Lr9;->α(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 38
    .line 39
    :goto_0
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto/16 :goto_a

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    goto/16 :goto_a

    .line 50
    .line 51
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    goto/16 :goto_a

    .line 58
    .line 59
    :cond_4
    const-string v2, "latest_date"

    .line 60
    .line 61
    const-string v3, ""

    .line 62
    .line 63
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const/4 v4, 0x0

    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    move-object v2, v4

    .line 80
    :goto_1
    if-nez v2, :cond_6

    .line 81
    .line 82
    move-object v6, v3

    .line 83
    goto :goto_2

    .line 84
    :cond_6
    move-object v6, v2

    .line 85
    :goto_2
    const-string v2, "latest_notice"

    .line 86
    .line 87
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    goto :goto_3

    .line 102
    :cond_7
    move-object v2, v4

    .line 103
    :goto_3
    if-nez v2, :cond_8

    .line 104
    .line 105
    move-object v7, v3

    .line 106
    goto :goto_4

    .line 107
    :cond_8
    move-object v7, v2

    .line 108
    :goto_4
    const-string v2, "latest_hash"

    .line 109
    .line 110
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-eqz v2, :cond_9

    .line 115
    .line 116
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_5

    .line 125
    :cond_9
    move-object v2, v4

    .line 126
    :goto_5
    if-nez v2, :cond_a

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_a
    move-object v3, v2

    .line 130
    :goto_6
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_b

    .line 135
    .line 136
    invoke-static {v7}, Lr9;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    :cond_b
    move-object v8, v3

    .line 141
    const-string v2, "latest_record_time"

    .line 142
    .line 143
    const-wide/16 v9, 0x0

    .line 144
    .line 145
    invoke-interface {v0, v2, v9, v10}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 146
    .line 147
    .line 148
    move-result-wide v9

    .line 149
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-nez v2, :cond_d

    .line 154
    .line 155
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_c

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_c
    new-instance v5, Lp9;

    .line 163
    .line 164
    invoke-direct/range {v5 .. v10}, Lp9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 165
    .line 166
    .line 167
    move-object v4, v5

    .line 168
    :cond_d
    :goto_7
    if-nez v4, :cond_e

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_e
    iget-object v2, v4, Lp9;->α:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/4 v5, 0x1

    .line 178
    if-eqz v3, :cond_f

    .line 179
    .line 180
    move v3, v5

    .line 181
    goto :goto_9

    .line 182
    :cond_f
    sget-object v3, Lnz;->ε:Lnz;

    .line 183
    .line 184
    const-string v6, "shown_dates"

    .line 185
    .line 186
    invoke-interface {v0, v6, v3}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    if-nez v6, :cond_10

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_10
    move-object v3, v6

    .line 194
    :goto_8
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    :goto_9
    if-eqz v3, :cond_11

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_11
    const/4 v3, 0x0

    .line 202
    invoke-virtual {v1, v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    if-nez v5, :cond_12

    .line 207
    .line 208
    :goto_a
    return-void

    .line 209
    :cond_12
    invoke-static {v0}, Lr9;->γ(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    new-instance v5, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :cond_13
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_14

    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    move-object v7, v6

    .line 233
    check-cast v7, Lp9;

    .line 234
    .line 235
    iget-object v7, v7, Lp9;->α:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v7, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-nez v7, :cond_13

    .line 242
    .line 243
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_14
    :try_start_0
    new-instance v0, Lη;

    .line 248
    .line 249
    const/4 v2, 0x3

    .line 250
    invoke-direct {v0, v2, v4}, Lη;-><init>(ILjava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Lo7;

    .line 254
    .line 255
    const/16 v6, 0x8

    .line 256
    .line 257
    invoke-direct {v2, v6}, Lo7;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-static {p0, v4, v5, v0, v2}, Lpd2;->Υ(Landroid/app/Activity;Lp9;Ljava/util/ArrayList;Lη;Lo7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :catchall_0
    move-exception v0

    .line 265
    move-object p0, v0

    .line 266
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 267
    .line 268
    .line 269
    const-string v0, "r62fe5deb53d30681"

    .line 270
    .line 271
    const-string v1, "show notice dialog failed"

    .line 272
    .line 273
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method public static ζ(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lp9;

    .line 27
    .line 28
    iget-object v4, v3, Lp9;->α:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    iget-object v3, v3, Lp9;->β:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p0, Lo9;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {p0, v2}, Lo9;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lp9;

    .line 73
    .line 74
    iget-object v2, v1, Lp9;->α:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_2

    .line 81
    .line 82
    iget-object v2, v1, Lp9;->α:Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p0, Ljava/lang/Iterable;

    .line 96
    .line 97
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    new-instance v0, Lo9;

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    invoke-direct {v0, v1}, Lo9;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0
.end method

.method public static η(Ljava/util/List;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lp9;

    .line 21
    .line 22
    new-instance v2, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "date"

    .line 28
    .line 29
    iget-object v4, v1, Lp9;->α:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v3, "notice"

    .line 35
    .line 36
    iget-object v4, v1, Lp9;->β:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v3, "hash"

    .line 42
    .line 43
    iget-object v4, v1, Lp9;->γ:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v3, "record_time"

    .line 49
    .line 50
    iget-wide v4, v1, Lp9;->δ:J

    .line 51
    .line 52
    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    return-object p0
.end method
