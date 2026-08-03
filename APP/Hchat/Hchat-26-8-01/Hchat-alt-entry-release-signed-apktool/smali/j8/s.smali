.class public final synthetic Lj8/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lj8/w;


# instance fields
.field public final synthetic a:Lj8/y;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lb/e;


# direct methods
.method public synthetic constructor <init>(Lj8/y;Ljava/lang/String;Lb/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj8/s;->a:Lj8/y;

    .line 5
    .line 6
    iput-object p2, p0, Lj8/s;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lj8/s;->c:Lb/e;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v3, v1, Lj8/s;->a:Lj8/y;

    .line 4
    .line 5
    iget-object v0, v1, Lj8/s;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, v1, Lj8/s;->c:Lb/e;

    .line 8
    .line 9
    invoke-virtual {v3}, Lj8/y;->u()V

    .line 10
    .line 11
    .line 12
    iget-object v4, v3, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 13
    .line 14
    iget-object v8, v4, Lh/Hchat/dexkit/DexFinder;->voicePlaybackStartMethod:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    if-eqz v8, :cond_0

    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v4, 0x0

    .line 24
    :goto_0
    const-class v5, Landroid/content/Context;

    .line 25
    .line 26
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v5, v3, Lj8/y;->b:Landroid/content/Context;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    if-nez v11, :cond_1

    .line 52
    .line 53
    const-string v0, "\u64ad\u653e\u539f\u8bed\u97f3\u5931\u8d25: \u521b\u5efa\u539f\u751f\u64ad\u653e\u5668\u5931\u8d25"

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return v10

    .line 59
    :cond_1
    iget-object v4, v3, Lj8/y;->d:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v4

    .line 62
    :try_start_0
    iget-wide v5, v3, Lj8/y;->g:J

    .line 63
    .line 64
    const-wide/16 v12, 0x1

    .line 65
    .line 66
    add-long/2addr v5, v12

    .line 67
    iput-wide v5, v3, Lj8/y;->g:J

    .line 68
    .line 69
    iput-object v11, v3, Lj8/y;->e:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v2, v3, Lj8/y;->f:Lb/e;

    .line 72
    .line 73
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 74
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    :cond_2
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_b

    .line 91
    .line 92
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v13, v2

    .line 97
    check-cast v13, Ljava/lang/reflect/Field;

    .line 98
    .line 99
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-nez v7, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const/4 v14, 0x0

    .line 119
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    if-eqz v15, :cond_6

    .line 124
    .line 125
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v15

    .line 129
    check-cast v15, Ljava/lang/reflect/Method;

    .line 130
    .line 131
    const/16 v16, 0x1

    .line 132
    .line 133
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 138
    .line 139
    if-eq v4, v9, :cond_4

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    if-eqz v14, :cond_5

    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    goto :goto_3

    .line 146
    :cond_5
    move-object v14, v15

    .line 147
    goto :goto_2

    .line 148
    :cond_6
    const/16 v16, 0x1

    .line 149
    .line 150
    :goto_3
    if-nez v14, :cond_7

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_7
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    const-string v7, "onCompletion"

    .line 158
    .line 159
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-eqz v7, :cond_8

    .line 164
    .line 165
    move/from16 v7, v16

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_8
    const-string v7, "onStop"

    .line 169
    .line 170
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_9

    .line 175
    .line 176
    const/4 v7, 0x2

    .line 177
    goto :goto_4

    .line 178
    :cond_9
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    array-length v7, v7

    .line 183
    if-nez v7, :cond_2

    .line 184
    .line 185
    const/4 v7, 0x3

    .line 186
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    if-nez v9, :cond_a

    .line 191
    .line 192
    const-class v9, Lj8/y;

    .line 193
    .line 194
    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    :cond_a
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    new-instance v2, Lj8/v;

    .line 203
    .line 204
    invoke-direct/range {v2 .. v7}, Lj8/v;-><init>(Lj8/y;Ljava/lang/String;JI)V

    .line 205
    .line 206
    .line 207
    invoke-static {v9, v14, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-static {v13, v11, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :cond_b
    const/16 v16, 0x1

    .line 217
    .line 218
    :try_start_1
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 219
    .line 220
    const/4 v4, -0x1

    .line 221
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    filled-new-array {v0, v2, v2, v4}, [Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {v8, v11, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 234
    .line 235
    if-eqz v2, :cond_c

    .line 236
    .line 237
    check-cast v0, Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_c

    .line 244
    .line 245
    return v16

    .line 246
    :catchall_0
    move-exception v0

    .line 247
    goto :goto_5

    .line 248
    :cond_c
    invoke-virtual {v3, v5, v6}, Lj8/y;->c(J)Lb/e;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3, v11}, Lj8/y;->v(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    const-string v0, "\u64ad\u653e\u539f\u8bed\u97f3\u5931\u8d25: \u5fae\u4fe1\u539f\u751f\u64ad\u653e\u5668\u62d2\u7edd\u64ad\u653e"

    .line 255
    .line 256
    invoke-virtual {v3, v0}, Lj8/y;->m(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    .line 258
    .line 259
    return v10

    .line 260
    :goto_5
    invoke-virtual {v3, v5, v6}, Lj8/y;->c(J)Lb/e;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v11}, Lj8/y;->v(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    new-instance v2, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v4, "\u64ad\u653e\u539f\u8bed\u97f3\u5f02\u5e38: "

    .line 269
    .line 270
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v3, v0}, Lj8/y;->m(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return v10

    .line 288
    :catchall_1
    move-exception v0

    .line 289
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 290
    throw v0
.end method
