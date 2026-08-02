.class public final Lb0;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lb0;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static final j:Lz52;

.field public static final k:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final l:Ljava/util/concurrent/ExecutorService;

.field public static final m:Ljava/lang/Object;

.field public static final n:Ljava/util/HashMap;

.field public static o:La0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb0;->d:Lb0;

    .line 8
    .line 9
    const v0, 0x790b0003

    .line 10
    .line 11
    .line 12
    sput v0, Lb0;->e:I

    .line 13
    .line 14
    const v0, 0x790b0017

    .line 15
    .line 16
    .line 17
    sput v0, Lb0;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lb0;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "AIChat"

    .line 24
    .line 25
    sput-object v0, Lb0;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lb0;->i:Z

    .line 29
    .line 30
    new-instance v0, Lz52;

    .line 31
    .line 32
    invoke-direct {v0}, Lz52;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lb0;->j:Lz52;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lb0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 43
    .line 44
    new-instance v0, Lt;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lt;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lb0;->l:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/Object;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lb0;->m:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance v0, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lb0;->n:Ljava/util/HashMap;

    .line 68
    .line 69
    return-void
.end method

.method public static q()Lnuke/module/wechat/ai/AIChatConfig;
    .locals 15

    .line 1
    sget-object v0, Lpp1;->a:Lpp1;

    .line 2
    .line 3
    invoke-static {}, Lpp1;->c()Lop1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lnuke/module/wechat/ai/AIChatConfig;

    .line 8
    .line 9
    const/16 v13, 0x3ff

    .line 10
    .line 11
    const/4 v14, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const-wide/16 v9, 0x0

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    invoke-direct/range {v1 .. v14}, Lnuke/module/wechat/ai/AIChatConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;ILc50;)V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lnuke/module/wechat/ai/AIChatConfig;->Companion:Le0;

    .line 27
    .line 28
    invoke-virtual {v2}, Le0;->serializer()Lw41;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lse;->D(Lw41;)Lw41;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "AIChat/config"

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1, v3}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lnuke/module/wechat/ai/AIChatConfig;

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    new-instance v1, Lnuke/module/wechat/ai/AIChatConfig;

    .line 47
    .line 48
    const/16 v13, 0x3ff

    .line 49
    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const-wide/16 v9, 0x0

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    invoke-direct/range {v1 .. v14}, Lnuke/module/wechat/ai/AIChatConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;ILc50;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_0
    return-object v0
.end method

.method public static r(Lnuke/module/wechat/ai/AIChatConfig;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatConfig;->isReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lnuke/module/wechat/ai/b;->e:Lvf1;

    .line 8
    .line 9
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatConfig;->getBaseUrl()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v0, "chat/completions"

    .line 17
    .line 18
    invoke-static {p0, v0}, Lnuke/module/wechat/ai/a;->e(Ljava/lang/String;Ljava/lang/String;)Lyw0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public static s(Lby0;J)V
    .locals 13

    .line 1
    sget-object v0, Lb0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    cmp-long v1, p1, v1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lb0;->q()Lnuke/module/wechat/ai/AIChatConfig;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-static {v5}, Lb0;->r(Lnuke/module/wechat/ai/AIChatConfig;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_13

    .line 22
    .line 23
    iget-object v1, p0, Lby0;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v5, v1}, Lnuke/module/wechat/ai/AIChatConfig;->allowsTalker(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_1
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getReplyDelayMs()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    cmp-long v1, v1, v3

    .line 40
    .line 41
    if-lez v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getReplyDelayMs()J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    const-wide/32 v3, 0xea60

    .line 48
    .line 49
    .line 50
    cmp-long v6, v1, v3

    .line 51
    .line 52
    if-lez v6, :cond_2

    .line 53
    .line 54
    move-wide v1, v3

    .line 55
    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    cmp-long v1, p1, v1

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :cond_4
    new-instance v6, La0;

    .line 69
    .line 70
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getBaseUrl()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/4 v2, 0x1

    .line 83
    new-array v2, v2, [C

    .line 84
    .line 85
    const/16 v3, 0x2f

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    aput-char v3, v2, v12

    .line 89
    .line 90
    invoke-static {v1, v2}, Lpv2;->J0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getApiKey()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getModel()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getSystemPrompt()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getContextRounds()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-direct/range {v6 .. v11}, La0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v8, Lnuke/module/wechat/ai/AIChatMessage;

    .line 114
    .line 115
    sget-object v1, Lg1;->j:Lg1;

    .line 116
    .line 117
    iget-object v2, p0, Lby0;->c:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v3, p0, Lby0;->b:Ljava/lang/String;

    .line 120
    .line 121
    if-nez v2, :cond_5

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v7, "[WeChat sender: "

    .line 127
    .line 128
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v2, "]\n"

    .line 135
    .line 136
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    :goto_0
    invoke-direct {v8, v1, v3}, Lnuke/module/wechat/ai/AIChatMessage;-><init>(Lg1;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, Leu;->E()Lpb1;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getSystemPrompt()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v2}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/4 v4, 0x0

    .line 170
    if-lez v3, :cond_6

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_6
    move-object v2, v4

    .line 174
    :goto_1
    if-eqz v2, :cond_7

    .line 175
    .line 176
    new-instance v3, Lnuke/module/wechat/ai/AIChatMessage;

    .line 177
    .line 178
    sget-object v7, Lg1;->i:Lg1;

    .line 179
    .line 180
    invoke-direct {v3, v7, v2}, Lnuke/module/wechat/ai/AIChatMessage;-><init>(Lg1;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v3}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_7
    sget-object v2, Lb0;->d:Lb0;

    .line 187
    .line 188
    iget-object v3, p0, Lby0;->a:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getContextRounds()I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object v2, Lb0;->m:Ljava/lang/Object;

    .line 198
    .line 199
    monitor-enter v2

    .line 200
    :try_start_0
    sget-object v9, Lb0;->o:La0;

    .line 201
    .line 202
    invoke-static {v9, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-eqz v9, :cond_8

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_8
    sget-object v9, Lb0;->n:Ljava/util/HashMap;

    .line 210
    .line 211
    invoke-virtual {v9}, Ljava/util/HashMap;->clear()V

    .line 212
    .line 213
    .line 214
    sput-object v6, Lb0;->o:La0;

    .line 215
    .line 216
    :goto_2
    if-gtz v7, :cond_9

    .line 217
    .line 218
    sget-object v3, Lbe0;->h:Lbe0;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :catchall_0
    move-exception v0

    .line 222
    move-object p0, v0

    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :cond_9
    sget-object v9, Lb0;->n:Ljava/util/HashMap;

    .line 226
    .line 227
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    check-cast v3, Ljava/util/List;

    .line 232
    .line 233
    if-eqz v3, :cond_b

    .line 234
    .line 235
    const/16 v4, 0x14

    .line 236
    .line 237
    if-le v7, v4, :cond_a

    .line 238
    .line 239
    move v7, v4

    .line 240
    :cond_a
    mul-int/lit8 v7, v7, 0x2

    .line 241
    .line 242
    invoke-static {v7, v3}, Ldu;->C0(ILjava/util/List;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    :cond_b
    if-nez v4, :cond_c

    .line 247
    .line 248
    sget-object v3, Lbe0;->h:Lbe0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_c
    move-object v3, v4

    .line 252
    :goto_3
    monitor-exit v2

    .line 253
    invoke-virtual {v1, v3}, Lpb1;->addAll(Ljava/util/Collection;)Z

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v8}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    invoke-static {v1}, Leu;->z(Lpb1;)Lpb1;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    new-instance v2, Lnuke/module/wechat/ai/b;

    .line 264
    .line 265
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getBaseUrl()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getApiKey()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getModel()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-direct {v2, v3, v4, v7}, Lnuke/module/wechat/ai/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    new-instance v3, Lnuke/module/wechat/ai/AIChatRequest;

    .line 281
    .line 282
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getTemperature()F

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getMaxTokens()I

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    invoke-direct {v3, v1, v4, v7}, Lnuke/module/wechat/ai/AIChatRequest;-><init>(Ljava/util/List;FI)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v3}, Lnuke/module/wechat/ai/b;->a(Lnuke/module/wechat/ai/AIChatRequest;)Lf1;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 298
    .line 299
    .line 300
    move-result-wide v2

    .line 301
    cmp-long v2, p1, v2

    .line 302
    .line 303
    if-eqz v2, :cond_d

    .line 304
    .line 305
    goto/16 :goto_6

    .line 306
    .line 307
    :cond_d
    invoke-static {}, Lb0;->q()Lnuke/module/wechat/ai/AIChatConfig;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-virtual {v2, v5}, Lnuke/module/wechat/ai/AIChatConfig;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-eqz v3, :cond_e

    .line 316
    .line 317
    iget-object v3, p0, Lby0;->a:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v2, v3}, Lnuke/module/wechat/ai/AIChatConfig;->allowsTalker(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-nez v2, :cond_f

    .line 324
    .line 325
    :cond_e
    move-object v6, p0

    .line 326
    goto/16 :goto_4

    .line 327
    .line 328
    :cond_f
    instance-of v2, v1, Ld1;

    .line 329
    .line 330
    if-eqz v2, :cond_10

    .line 331
    .line 332
    sget-object p1, Lb0;->h:Ljava/lang/String;

    .line 333
    .line 334
    iget-object p0, p0, Lby0;->a:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v5}, Lnuke/module/wechat/ai/AIChatConfig;->getModel()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p2

    .line 340
    check-cast v1, Ld1;

    .line 341
    .line 342
    iget-object v0, v1, Ld1;->a:Lnuke/module/wechat/ai/AIChatError;

    .line 343
    .line 344
    invoke-virtual {v0}, Lnuke/module/wechat/ai/AIChatError;->getCode()La1;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 353
    .line 354
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iget-object v2, v1, Ld1;->a:Lnuke/module/wechat/ai/AIChatError;

    .line 362
    .line 363
    invoke-virtual {v2}, Lnuke/module/wechat/ai/AIChatError;->getHttpCode()Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    iget-object v1, v1, Ld1;->a:Lnuke/module/wechat/ai/AIChatError;

    .line 368
    .line 369
    invoke-virtual {v1}, Lnuke/module/wechat/ai/AIChatError;->getMessage()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    const-string v3, "AI completion failed: talker="

    .line 374
    .line 375
    const-string v4, ", model="

    .line 376
    .line 377
    const-string v5, ", type="

    .line 378
    .line 379
    invoke-static {v3, p0, v4, p2, v5}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string p2, ", httpCode="

    .line 387
    .line 388
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string p2, ", reason="

    .line 395
    .line 396
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-static {p1, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :cond_10
    instance-of v2, v1, Le1;

    .line 411
    .line 412
    if-eqz v2, :cond_12

    .line 413
    .line 414
    check-cast v1, Le1;

    .line 415
    .line 416
    iget-object v9, v1, Le1;->a:Lnuke/module/wechat/ai/AIChatResponse;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 419
    .line 420
    .line 421
    move-result-wide v0

    .line 422
    cmp-long v0, p1, v0

    .line 423
    .line 424
    if-eqz v0, :cond_11

    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_11
    iget-object v0, p0, Lby0;->a:Ljava/lang/String;

    .line 428
    .line 429
    invoke-virtual {v9}, Lnuke/module/wechat/ai/AIChatResponse;->getContent()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-static {v0, v1}, Lgd3;->l(Ljava/lang/String;Ljava/lang/String;)Lso2;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    new-instance v2, Lu;

    .line 438
    .line 439
    move-wide v3, p1

    .line 440
    move-object v7, v6

    .line 441
    move-object v6, p0

    .line 442
    invoke-direct/range {v2 .. v9}, Lu;-><init>(JLnuke/module/wechat/ai/AIChatConfig;Lby0;La0;Lnuke/module/wechat/ai/AIChatMessage;Lnuke/module/wechat/ai/AIChatResponse;)V

    .line 443
    .line 444
    .line 445
    new-instance p0, Lv;

    .line 446
    .line 447
    invoke-direct {p0, v12, v6}, Lv;-><init>(ILjava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v0, v2, p0}, Lso2;->a(Lin0;Lin0;)V

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :cond_12
    invoke-static {}, Lc80;->s()V

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    :goto_4
    sget-object p0, Lb0;->h:Ljava/lang/String;

    .line 459
    .line 460
    iget-object p1, v6, Lby0;->a:Ljava/lang/String;

    .line 461
    .line 462
    const-string p2, "AI reply discarded because configuration changed: talker="

    .line 463
    .line 464
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-static {p0, p1}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :goto_5
    monitor-exit v2

    .line 473
    throw p0

    .line 474
    :cond_13
    :goto_6
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lb0;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lvb1;)V
    .locals 2

    .line 1
    sget-object p0, Lb0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lb0;->q()Lnuke/module/wechat/ai/AIChatConfig;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lid3;->e:Lid3;

    .line 10
    .line 11
    new-instance v0, Lw;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0, v0}, Lvb1;->a(Ltb1;Lin0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    sget-object p0, Lb0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    sget-object p0, Lb0;->j:Lz52;

    .line 7
    .line 8
    iget-object p0, p0, Lz52;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lb0;->m:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    sget-object v0, Lb0;->n:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    sput-object v0, Lb0;->o:La0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    monitor-exit p0

    .line 28
    throw v0
.end method

.method public final j(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lb0;->q()Lnuke/module/wechat/ai/AIChatConfig;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lb0;->r(Lnuke/module/wechat/ai/AIChatConfig;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const p0, 0x790b0029

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatConfig;->getListMode()Lc1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Lc1;->j:Lc1;

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    const v0, 0x790b001a

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const v0, 0x790b0018

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatConfig;->getModel()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatConfig;->getTargetIds()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p0}, Lnuke/module/wechat/ai/AIChatConfig;->getContextRounds()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    filled-new-array {v1, v0, v2, p0}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const v0, 0x790b0010

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lb0;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    sget-boolean p0, Lb0;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lb0;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lb0;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Landroid/view/View;Lxm0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    instance-of p1, p0, Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/app/Activity;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {}, Lb0;->q()Lnuke/module/wechat/ai/AIChatConfig;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Lx;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, v1, p1, p2}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lkw;

    .line 50
    .line 51
    const p2, 0x3656750b

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p1, p2, v1, v0}, Lkw;-><init>(IZLun0;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lt7;

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    invoke-direct {p2, v0, p0, p1}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
