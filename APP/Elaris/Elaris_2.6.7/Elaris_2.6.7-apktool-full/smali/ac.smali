.class public final Lac;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Lec;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/reflect/Field;

.field public final synthetic f:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Class;Lec;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lac;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iput-object p2, p0, Lac;->b:Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p3, p0, Lac;->c:Lec;

    .line 6
    .line 7
    iput-object p4, p0, Lac;->d:Ljava/lang/Class;

    .line 8
    .line 9
    iput-object p5, p0, Lac;->e:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    iput-object p6, p0, Lac;->f:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    const/16 p1, 0x30

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 10

    .line 1
    invoke-static {}, Lfc;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    instance-of v2, v1, Ljava/util/List;

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_2
    :try_start_0
    iget-object v2, p0, Lac;->a:Ljava/lang/reflect/Method;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 32
    if-nez v7, :cond_3

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_3
    move-object v8, v1

    .line 37
    check-cast v8, Ljava/util/List;

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    sget-wide v3, Lfc;->o:J

    .line 44
    .line 45
    cmp-long v1, v1, v3

    .line 46
    .line 47
    if-gez v1, :cond_4

    .line 48
    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {v0, p1}, Lfc;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lac;->b:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p0, p1}, Lfc;->h(Ljava/lang/Class;I)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    invoke-static {}, Lfc;->a()V

    .line 73
    .line 74
    .line 75
    :try_start_1
    iget-object v1, p0, Lac;->b:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-static {v1, v8}, Lfc;->i(Ljava/lang/Class;Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-nez v6, :cond_5

    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :cond_5
    invoke-static {}, Lfc;->f()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_a

    .line 93
    .line 94
    iget-object v4, p0, Lac;->c:Lec;

    .line 95
    .line 96
    iget-object v5, p0, Lac;->d:Ljava/lang/Class;

    .line 97
    .line 98
    iget-object v9, p0, Lac;->e:Ljava/lang/reflect/Field;

    .line 99
    .line 100
    invoke-static/range {v4 .. v9}, Lfc;->d(Lec;Ljava/lang/Class;Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_6
    sget-object v2, Lfc;->c:Ljava/util/Map;

    .line 109
    .line 110
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 111
    :try_start_2
    invoke-interface {v2, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 115
    :try_start_3
    sget-object v2, Lfc;->d:Ljava/util/Map;

    .line 116
    .line 117
    monitor-enter v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 118
    :try_start_4
    iget-object v3, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 124
    :try_start_5
    iget-object v2, p0, Lac;->b:Ljava/lang/Class;

    .line 125
    .line 126
    if-nez v2, :cond_7

    .line 127
    .line 128
    const-string v2, ""

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 136
    .line 137
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    :goto_1
    const-string v3, "reply"

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_8

    .line 148
    .line 149
    const-string v3, "quote"

    .line 150
    .line 151
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_9

    .line 156
    .line 157
    :cond_8
    sget-object v2, Lfc;->e:Ljava/util/Map;

    .line 158
    .line 159
    monitor-enter v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 160
    :try_start_6
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 166
    :cond_9
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object p0, p0, Lac;->f:Ljava/lang/ClassLoader;

    .line 171
    .line 172
    invoke-static {p0, v2}, Lfc;->J(Ljava/lang/ClassLoader;Ljava/lang/Class;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :catchall_0
    move-exception v0

    .line 177
    move-object p0, v0

    .line 178
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 179
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 180
    :catchall_1
    move-exception v0

    .line 181
    move-object p0, v0

    .line 182
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 183
    :try_start_b
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 184
    :catchall_2
    move-exception v0

    .line 185
    move-object p0, v0

    .line 186
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 187
    :try_start_d
    throw p0

    .line 188
    :cond_a
    :goto_2
    new-instance p0, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    const/4 v3, 0x1

    .line 195
    add-int/2addr v2, v3

    .line 196
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 197
    .line 198
    .line 199
    if-eqz v1, :cond_b

    .line 200
    .line 201
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    :cond_b
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    const/4 v2, 0x0

    .line 209
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_d

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-static {v4}, Lfc;->g(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_c

    .line 224
    .line 225
    add-int/lit8 v2, v2, 0x1

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_c
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_d
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    if-eqz v1, :cond_e

    .line 236
    .line 237
    sget-boolean p0, Lfc;->j:Z

    .line 238
    .line 239
    if-nez p0, :cond_e

    .line 240
    .line 241
    sput-boolean v3, Lfc;->j:Z

    .line 242
    .line 243
    const-string p0, "repeater long press menu add success"

    .line 244
    .line 245
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_e
    if-lez v2, :cond_10

    .line 249
    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 251
    .line 252
    .line 253
    move-result-wide p0

    .line 254
    sget-wide v0, Lfc;->q:J

    .line 255
    .line 256
    sub-long v0, p0, v0

    .line 257
    .line 258
    const-wide/16 v3, 0xbb8

    .line 259
    .line 260
    cmp-long v0, v0, v3

    .line 261
    .line 262
    if-gez v0, :cond_f

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_f
    sput-wide p0, Lfc;->q:J

    .line 266
    .line 267
    new-instance p0, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string p1, "repeater long press menu stale item replaced count="

    .line 270
    .line 271
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 282
    .line 283
    .line 284
    :cond_10
    :goto_4
    return-void

    .line 285
    :catchall_3
    move-exception v0

    .line 286
    move-object p0, v0

    .line 287
    invoke-static {p0}, Lfc;->s(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    const-string p1, "repeater long press menu add failed reason="

    .line 292
    .line 293
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :catchall_4
    move-exception v0

    .line 302
    move-object p0, v0

    .line 303
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    const-string p1, "repeater long press menu skipped reason=message getter "

    .line 312
    .line 313
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-void
.end method
