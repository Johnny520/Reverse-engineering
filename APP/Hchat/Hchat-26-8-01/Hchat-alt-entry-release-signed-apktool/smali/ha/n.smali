.class public final synthetic Lha/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lha/o;


# direct methods
.method public synthetic constructor <init>(Lha/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lha/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lha/n;->h:Lha/o;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lha/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lha/n;->h:Lha/o;

    .line 7
    .line 8
    iget-object v0, v0, Lha/o;->e:Lha/s;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-boolean v2, v0, Lha/s;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    move v2, v3

    .line 21
    goto :goto_5

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lha/s;->k()Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_4

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v4}, Lha/s;->l(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    :try_start_2
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 42
    .line 43
    new-instance v6, Lha/r;

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    invoke-direct {v6, v0, v7}, Lha/r;-><init>(Lha/s;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v4, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 50
    .line 51
    .line 52
    new-instance v4, Lha/r;

    .line 53
    .line 54
    const/4 v6, 0x2

    .line 55
    invoke-direct {v4, v0, v6}, Lha/r;-><init>(Lha/s;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v2, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lha/s;->i()Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    new-instance v4, Lha/r;

    .line 68
    .line 69
    const/4 v6, 0x3

    .line 70
    invoke-direct {v4, v0, v6}, Lha/r;-><init>(Lha/s;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v2, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v2

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    :goto_0
    iput-boolean v3, v0, Lha/s;->g:Z

    .line 80
    .line 81
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_1
    :try_start_3
    new-instance v4, Lsf/f;

    .line 85
    .line 86
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    move-object v2, v4

    .line 90
    :goto_2
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-nez v4, :cond_2

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_2
    iget-object v2, v0, Lha/s;->b:Lab/b;

    .line 98
    .line 99
    const-string v5, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u4e2a\u4eba\u4e3b\u9875 Hook \u5b89\u88c5\u5931\u8d25"

    .line 100
    .line 101
    invoke-virtual {v2, v5, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 105
    .line 106
    :goto_3
    check-cast v2, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 112
    monitor-exit v0

    .line 113
    goto :goto_5

    .line 114
    :catchall_1
    move-exception v1

    .line 115
    goto :goto_6

    .line 116
    :cond_3
    monitor-exit v0

    .line 117
    :goto_4
    move v2, v1

    .line 118
    goto :goto_5

    .line 119
    :cond_4
    monitor-exit v0

    .line 120
    goto :goto_4

    .line 121
    :goto_5
    if-ne v2, v3, :cond_5

    .line 122
    .line 123
    move v1, v3

    .line 124
    goto :goto_7

    .line 125
    :goto_6
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    throw v1

    .line 127
    :cond_5
    :goto_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0

    .line 132
    :pswitch_0
    iget-object v0, p0, Lha/n;->h:Lha/o;

    .line 133
    .line 134
    iget-object v0, v0, Lha/o;->e:Lha/s;

    .line 135
    .line 136
    const/4 v1, 0x0

    .line 137
    if-eqz v0, :cond_a

    .line 138
    .line 139
    monitor-enter v0

    .line 140
    :try_start_5
    iget-boolean v2, v0, Lha/s;->f:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 141
    .line 142
    const/4 v3, 0x1

    .line 143
    if-eqz v2, :cond_6

    .line 144
    .line 145
    monitor-exit v0

    .line 146
    move v2, v3

    .line 147
    goto :goto_b

    .line 148
    :cond_6
    :try_start_6
    invoke-virtual {v0}, Lha/s;->m()Ljava/lang/reflect/Method;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-eqz v2, :cond_9

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v2, :cond_9

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Lha/s;->j(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 161
    .line 162
    .line 163
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    :try_start_7
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 167
    .line 168
    new-instance v5, Lha/r;

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    invoke-direct {v5, v0, v6}, Lha/r;-><init>(Lha/s;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v2, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 175
    .line 176
    .line 177
    iput-boolean v3, v0, Lha/s;->f:Z

    .line 178
    .line 179
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :catchall_2
    move-exception v2

    .line 183
    :try_start_8
    new-instance v4, Lsf/f;

    .line 184
    .line 185
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    move-object v2, v4

    .line 189
    :goto_8
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    if-nez v4, :cond_7

    .line 194
    .line 195
    goto :goto_9

    .line 196
    :cond_7
    iget-object v2, v0, Lha/s;->b:Lab/b;

    .line 197
    .line 198
    const-string v5, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u53ef\u89c1\u8303\u56f4 Hook \u5b89\u88c5\u5931\u8d25"

    .line 199
    .line 200
    invoke-virtual {v2, v5, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 204
    .line 205
    :goto_9
    check-cast v2, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 211
    monitor-exit v0

    .line 212
    goto :goto_b

    .line 213
    :catchall_3
    move-exception v1

    .line 214
    goto :goto_c

    .line 215
    :cond_8
    monitor-exit v0

    .line 216
    :goto_a
    move v2, v1

    .line 217
    goto :goto_b

    .line 218
    :cond_9
    monitor-exit v0

    .line 219
    goto :goto_a

    .line 220
    :goto_b
    if-ne v2, v3, :cond_a

    .line 221
    .line 222
    move v1, v3

    .line 223
    goto :goto_d

    .line 224
    :goto_c
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 225
    throw v1

    .line 226
    :cond_a
    :goto_d
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    return-object v0

    .line 231
    :pswitch_1
    iget-object v0, p0, Lha/n;->h:Lha/o;

    .line 232
    .line 233
    iget-object v0, v0, Lha/o;->e:Lha/s;

    .line 234
    .line 235
    const/4 v1, 0x0

    .line 236
    if-eqz v0, :cond_e

    .line 237
    .line 238
    monitor-enter v0

    .line 239
    :try_start_a
    iget-boolean v2, v0, Lha/s;->e:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 240
    .line 241
    const/4 v3, 0x1

    .line 242
    if-eqz v2, :cond_b

    .line 243
    .line 244
    monitor-exit v0

    .line 245
    move v2, v3

    .line 246
    goto :goto_10

    .line 247
    :cond_b
    :try_start_b
    invoke-virtual {v0}, Lha/s;->m()Ljava/lang/reflect/Method;

    .line 248
    .line 249
    .line 250
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 251
    if-eqz v2, :cond_d

    .line 252
    .line 253
    :try_start_c
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 254
    .line 255
    new-instance v5, Lha/r;

    .line 256
    .line 257
    const/4 v6, 0x4

    .line 258
    invoke-direct {v5, v0, v6}, Lha/r;-><init>(Lha/s;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v2, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 262
    .line 263
    .line 264
    iput-boolean v3, v0, Lha/s;->e:Z

    .line 265
    .line 266
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 267
    .line 268
    goto :goto_e

    .line 269
    :catchall_4
    move-exception v2

    .line 270
    :try_start_d
    new-instance v4, Lsf/f;

    .line 271
    .line 272
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    move-object v2, v4

    .line 276
    :goto_e
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    if-nez v4, :cond_c

    .line 281
    .line 282
    goto :goto_f

    .line 283
    :cond_c
    iget-object v2, v0, Lha/s;->b:Lab/b;

    .line 284
    .line 285
    const-string v5, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u65f6\u95f4 Hook \u5b89\u88c5\u5931\u8d25"

    .line 286
    .line 287
    invoke-virtual {v2, v5, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 291
    .line 292
    :goto_f
    check-cast v2, Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 298
    monitor-exit v0

    .line 299
    goto :goto_10

    .line 300
    :catchall_5
    move-exception v1

    .line 301
    goto :goto_11

    .line 302
    :cond_d
    monitor-exit v0

    .line 303
    move v2, v1

    .line 304
    :goto_10
    if-ne v2, v3, :cond_e

    .line 305
    .line 306
    move v1, v3

    .line 307
    goto :goto_12

    .line 308
    :goto_11
    :try_start_e
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 309
    throw v1

    .line 310
    :cond_e
    :goto_12
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    return-object v0

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
