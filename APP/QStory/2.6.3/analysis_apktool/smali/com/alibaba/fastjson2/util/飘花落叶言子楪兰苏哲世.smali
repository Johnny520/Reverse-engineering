.class public abstract Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子世楪兰苏哲:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static volatile 飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

.field public static volatile 飘花落叶言子世楪哲苏兰:Z

.field public static volatile 飘花落叶言子世楪苏兰哲:Ljava/lang/invoke/MethodHandle;

.field public static final 飘花落叶言子世楪苏哲兰:Ljava/lang/invoke/MethodHandles$Lookup;

.field public static final 飘花落叶言子楪世兰哲苏:J

.field public static final 飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

.field public static final 飘花落叶言子楪世哲兰苏:I

.field public static final 飘花落叶言子楪世哲苏兰:J

.field public static final 飘花落叶言子楪世苏兰哲:J

.field public static final 飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

.field public static final 飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

.field public static final 飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

.field public static final 飘花落叶言子楪兰哲世苏:Ljava/lang/invoke/MethodHandle;

.field public static final 飘花落叶言子楪兰哲苏世:Ljava/lang/invoke/MethodHandle;

.field public static final 飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

.field public static final 飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

.field public static final 飘花落叶言子楪哲世兰苏:Z

.field public static final 飘花落叶言子楪哲世苏兰:Z

.field public static final 飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

.field public static final 飘花落叶言子楪哲兰苏世:Z

.field public static final 飘花落叶言子楪哲苏世兰:Z

.field public static final 飘花落叶言子楪哲苏兰世:I

.field public static final 飘花落叶言子楪苏世兰哲:J

.field public static volatile 飘花落叶言子楪苏世哲兰:Z

.field public static final 飘花落叶言子楪苏兰世哲:Ljava/lang/Class;

.field public static final 飘花落叶言子楪苏兰哲世:Ljava/lang/Class;

.field public static final 飘花落叶言子楪苏哲世兰:J

.field public static final 飘花落叶言子楪苏哲兰世:J


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    const-class v1, [C

    .line 2
    .line 3
    const-class v2, [B

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪兰苏哲:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    :try_start_0
    const-class v0, Lsun/misc/Unsafe;

    .line 13
    .line 14
    const-string v3, "theUnsafe"

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lsun/misc/Unsafe;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    int-to-long v5, v5

    .line 36
    sput-wide v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    int-to-long v7, v7

    .line 43
    sput-wide v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_15

    .line 44
    .line 45
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 46
    .line 47
    const-wide/16 v9, -0x1

    .line 48
    .line 49
    cmp-long v0, v5, v9

    .line 50
    .line 51
    if-eqz v0, :cond_1a

    .line 52
    .line 53
    cmp-long v0, v7, v9

    .line 54
    .line 55
    if-eqz v0, :cond_1a

    .line 56
    .line 57
    const/4 v5, -0x1

    .line 58
    :try_start_1
    const-string v0, "java.vm.name"

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v7, "OpenJ9"

    .line 65
    .line 66
    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 70
    :try_start_2
    const-string v8, "Dalvik"

    .line 71
    .line 72
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 76
    :try_start_3
    const-string v0, "org.graalvm.nativeimage.imagecode"

    .line 77
    .line 78
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    move v11, v3

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    const/4 v11, 0x0

    .line 87
    :goto_0
    if-nez v7, :cond_1

    .line 88
    .line 89
    if-nez v8, :cond_1

    .line 90
    .line 91
    if-eqz v11, :cond_2

    .line 92
    .line 93
    :cond_1
    :try_start_4
    sput-boolean v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Z

    .line 94
    .line 95
    :cond_2
    const-string v0, "java.specification.version"

    .line 96
    .line 97
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v12, "1."

    .line 102
    .line 103
    invoke-virtual {v0, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-eqz v12, :cond_3

    .line 108
    .line 109
    const/4 v12, 0x2

    .line 110
    invoke-virtual {v0, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    goto :goto_1

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    move v12, v5

    .line 117
    goto :goto_5

    .line 118
    :cond_3
    :goto_1
    const/16 v12, 0x2e

    .line 119
    .line 120
    invoke-virtual {v0, v12}, Ljava/lang/String;->indexOf(I)I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    if-ne v12, v5, :cond_4

    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 130
    move v12, v0

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move v12, v5

    .line 133
    :goto_2
    if-eqz v8, :cond_5

    .line 134
    .line 135
    :try_start_5
    const-string v0, "android.os.Build$VERSION"

    .line 136
    .line 137
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v13, "SDK_INT"

    .line 142
    .line 143
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 148
    .line 149
    .line 150
    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 151
    goto :goto_6

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    goto :goto_5

    .line 154
    :catchall_2
    move-exception v0

    .line 155
    move v12, v5

    .line 156
    :goto_3
    const/4 v11, 0x0

    .line 157
    goto :goto_5

    .line 158
    :catchall_3
    move-exception v0

    .line 159
    move v12, v5

    .line 160
    :goto_4
    const/4 v8, 0x0

    .line 161
    goto :goto_3

    .line 162
    :catchall_4
    move-exception v0

    .line 163
    move v12, v5

    .line 164
    const/4 v7, 0x0

    .line 165
    goto :goto_4

    .line 166
    :goto_5
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 167
    .line 168
    :cond_5
    :goto_6
    sput-boolean v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰:Z

    .line 169
    .line 170
    sput-boolean v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 171
    .line 172
    sput-boolean v11, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏:Z

    .line 173
    .line 174
    sput v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 175
    .line 176
    :try_start_6
    const-class v0, Ljavax/sql/DataSource;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 177
    .line 178
    :try_start_7
    const-class v5, Ljavax/sql/RowSet;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :catchall_5
    move-object v0, v4

    .line 182
    :catchall_6
    move-object v5, v4

    .line 183
    :goto_7
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏兰世哲:Ljava/lang/Class;

    .line 184
    .line 185
    sput-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏兰哲世:Ljava/lang/Class;

    .line 186
    .line 187
    if-nez v8, :cond_6

    .line 188
    .line 189
    :try_start_8
    const-string v0, "java.beans.Transient"

    .line 190
    .line 191
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 195
    goto :goto_8

    .line 196
    :catchall_7
    :cond_6
    move-object v0, v4

    .line 197
    :goto_8
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

    .line 198
    .line 199
    sput v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 200
    .line 201
    const-string v5, "coder"

    .line 202
    .line 203
    const-string v7, "value"

    .line 204
    .line 205
    const/16 v11, 0x8

    .line 206
    .line 207
    const-class v13, Ljava/lang/String;

    .line 208
    .line 209
    if-ne v12, v11, :cond_8

    .line 210
    .line 211
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 212
    .line 213
    if-nez v0, :cond_7

    .line 214
    .line 215
    :try_start_9
    invoke-virtual {v13, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 216
    .line 217
    .line 218
    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 219
    :try_start_a
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 220
    .line 221
    .line 222
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 223
    .line 224
    invoke-virtual {v12, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 225
    .line 226
    .line 227
    move-result-wide v14
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    .line 228
    goto :goto_a

    .line 229
    :catch_0
    move-object v0, v4

    .line 230
    :catch_1
    sput-boolean v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Z

    .line 231
    .line 232
    :goto_9
    move-wide v14, v9

    .line 233
    goto :goto_a

    .line 234
    :cond_7
    move-object v0, v4

    .line 235
    goto :goto_9

    .line 236
    :goto_a
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 237
    .line 238
    sput-wide v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:J

    .line 239
    .line 240
    sput-wide v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世:J

    .line 241
    .line 242
    goto :goto_e

    .line 243
    :cond_8
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 244
    .line 245
    if-nez v0, :cond_9

    .line 246
    .line 247
    :try_start_b
    invoke-virtual {v13, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 248
    .line 249
    .line 250
    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    .line 251
    :try_start_c
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 254
    .line 255
    .line 256
    move-result-wide v14
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    .line 257
    goto :goto_c

    .line 258
    :catch_2
    move-object v0, v4

    .line 259
    :catch_3
    sput-boolean v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Z

    .line 260
    .line 261
    :goto_b
    move-wide v14, v9

    .line 262
    goto :goto_c

    .line 263
    :cond_9
    move-object v0, v4

    .line 264
    goto :goto_b

    .line 265
    :goto_c
    sput-wide v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:J

    .line 266
    .line 267
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 268
    .line 269
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 270
    .line 271
    if-nez v0, :cond_a

    .line 272
    .line 273
    :try_start_d
    invoke-virtual {v13, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v14
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4

    .line 283
    goto :goto_d

    .line 284
    :catch_4
    :cond_a
    move-wide v14, v9

    .line 285
    :goto_d
    sput-wide v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世:J

    .line 286
    .line 287
    :goto_e
    const-class v0, Ljava/math/BigDecimal;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    array-length v12, v0

    .line 294
    const/4 v14, 0x0

    .line 295
    :goto_f
    if-ge v14, v12, :cond_d

    .line 296
    .line 297
    aget-object v15, v0, v14

    .line 298
    .line 299
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    const-string v6, "intCompact"

    .line 304
    .line 305
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-nez v6, :cond_c

    .line 310
    .line 311
    const-string v6, "smallValue"

    .line 312
    .line 313
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_b

    .line 318
    .line 319
    goto :goto_10

    .line 320
    :cond_b
    add-int/lit8 v14, v14, 0x1

    .line 321
    .line 322
    const/4 v3, 0x1

    .line 323
    goto :goto_f

    .line 324
    :cond_c
    :goto_10
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 325
    .line 326
    invoke-virtual {v0, v15}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 327
    .line 328
    .line 329
    move-result-wide v14

    .line 330
    goto :goto_11

    .line 331
    :cond_d
    move-wide v14, v9

    .line 332
    :goto_11
    sput-wide v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲:J

    .line 333
    .line 334
    :try_start_e
    const-class v0, Ljava/math/BigInteger;

    .line 335
    .line 336
    const-string v3, "mag"

    .line 337
    .line 338
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 343
    .line 344
    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 345
    .line 346
    .line 347
    move-result-wide v9
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 348
    :catchall_8
    sput-wide v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰:J

    .line 349
    .line 350
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 355
    .line 356
    if-ne v0, v3, :cond_e

    .line 357
    .line 358
    const/4 v3, 0x1

    .line 359
    goto :goto_12

    .line 360
    :cond_e
    const/4 v3, 0x0

    .line 361
    :goto_12
    sput-boolean v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 362
    .line 363
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 364
    .line 365
    if-nez v0, :cond_10

    .line 366
    .line 367
    :try_start_f
    const-class v0, Ljava/lang/invoke/MethodHandles$Lookup;

    .line 368
    .line 369
    const-string v3, "IMPL_LOOKUP"

    .line 370
    .line 371
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 376
    .line 377
    invoke-virtual {v6, v3}, Lsun/misc/Unsafe;->staticFieldOffset(Ljava/lang/reflect/Field;)J

    .line 378
    .line 379
    .line 380
    move-result-wide v9

    .line 381
    invoke-virtual {v6, v0, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v0, Ljava/lang/invoke/MethodHandles$Lookup;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 386
    .line 387
    goto :goto_13

    .line 388
    :catchall_9
    move-object v0, v4

    .line 389
    :goto_13
    if-nez v0, :cond_f

    .line 390
    .line 391
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    :cond_f
    move-object v3, v0

    .line 396
    goto :goto_14

    .line 397
    :cond_10
    move-object v3, v4

    .line 398
    :goto_14
    sput-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏哲兰:Ljava/lang/invoke/MethodHandles$Lookup;

    .line 399
    .line 400
    const/16 v6, 0xb

    .line 401
    .line 402
    :try_start_10
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 403
    .line 404
    if-lt v0, v6, :cond_11

    .line 405
    .line 406
    const-string v0, "java.lang.management.ManagementFactory"

    .line 407
    .line 408
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const-string v9, "java.lang.management.RuntimeMXBean"

    .line 413
    .line 414
    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    const-string v10, "getRuntimeMXBean"

    .line 419
    .line 420
    invoke-virtual {v0, v10, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    const-string v10, "getInputArguments"

    .line 429
    .line 430
    invoke-virtual {v9, v10, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 431
    .line 432
    .line 433
    move-result-object v9

    .line 434
    invoke-virtual {v9, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    check-cast v0, Ljava/util/List;

    .line 439
    .line 440
    const-string v9, "--add-modules=jdk.incubator.vector"

    .line 441
    .line 442
    invoke-interface {v0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_11

    .line 447
    .line 448
    const-string v0, "jdk.incubator.vector.ByteVector"

    .line 449
    .line 450
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    const-string v9, "jdk.incubator.vector.VectorSpecies"

    .line 455
    .line 456
    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    const-string v10, "SPECIES_MAX"

    .line 461
    .line 462
    invoke-virtual {v0, v10}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    const-string v10, "length"

    .line 471
    .line 472
    invoke-virtual {v9, v10, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    invoke-virtual {v9, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    check-cast v0, Ljava/lang/Integer;

    .line 481
    .line 482
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 483
    .line 484
    .line 485
    goto :goto_15

    .line 486
    :catchall_a
    move-exception v0

    .line 487
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 488
    .line 489
    :cond_11
    :goto_15
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 490
    .line 491
    const/16 v9, 0x11

    .line 492
    .line 493
    const-string v10, "isASCII"

    .line 494
    .line 495
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 496
    .line 497
    if-lt v0, v9, :cond_12

    .line 498
    .line 499
    :try_start_11
    invoke-static {v12, v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v3, v13, v10, v0}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 504
    .line 505
    .line 506
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 507
    move-object v9, v0

    .line 508
    :goto_16
    move-object v14, v13

    .line 509
    goto :goto_17

    .line 510
    :catchall_b
    move-exception v0

    .line 511
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 512
    .line 513
    move-object v9, v4

    .line 514
    goto :goto_16

    .line 515
    :cond_12
    move-object v9, v4

    .line 516
    move-object v14, v9

    .line 517
    :goto_17
    const-string v15, "java.lang.StringCoding"

    .line 518
    .line 519
    if-nez v9, :cond_13

    .line 520
    .line 521
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 522
    .line 523
    if-lt v0, v6, :cond_13

    .line 524
    .line 525
    :try_start_12
    invoke-static {v15}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    move-result-object v14

    .line 529
    invoke-static {v12, v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v3, v14, v10, v0}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 534
    .line 535
    .line 536
    move-result-object v9
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 537
    :cond_13
    :goto_18
    move-object/from16 v20, v9

    .line 538
    .line 539
    goto :goto_19

    .line 540
    :catchall_c
    move-exception v0

    .line 541
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 542
    .line 543
    goto :goto_18

    .line 544
    :goto_19
    const-class v9, Ljava/lang/Object;

    .line 545
    .line 546
    if-eqz v20, :cond_14

    .line 547
    .line 548
    :try_start_13
    invoke-static {v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 549
    .line 550
    .line 551
    move-result-object v16

    .line 552
    const-string v17, "test"

    .line 553
    .line 554
    const-class v0, Ljava/util/function/Predicate;

    .line 555
    .line 556
    invoke-static {v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 557
    .line 558
    .line 559
    move-result-object v18

    .line 560
    invoke-static {v12, v9}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 561
    .line 562
    .line 563
    move-result-object v19

    .line 564
    invoke-static {v12, v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 565
    .line 566
    .line 567
    move-result-object v21

    .line 568
    invoke-static/range {v16 .. v21}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/Predicate;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    .line 577
    .line 578
    .line 579
    .line 580
    goto :goto_1a

    .line 581
    :catchall_d
    move-exception v0

    .line 582
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 583
    .line 584
    :cond_14
    :goto_1a
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 585
    .line 586
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 587
    .line 588
    if-lt v0, v6, :cond_15

    .line 589
    .line 590
    :try_start_14
    invoke-static {v15}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    const-string v6, "hasNegatives"

    .line 595
    .line 596
    filled-new-array {v10, v10}, [Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    move-result-object v14

    .line 600
    invoke-static {v12, v2, v14}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 601
    .line 602
    .line 603
    move-result-object v14

    .line 604
    invoke-virtual {v3, v0, v6, v14}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 605
    .line 606
    .line 607
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    .line 608
    goto :goto_1b

    .line 609
    :catchall_e
    move-exception v0

    .line 610
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 611
    .line 612
    :cond_15
    move-object v0, v4

    .line 613
    :goto_1b
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰哲世苏:Ljava/lang/invoke/MethodHandle;

    .line 614
    .line 615
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 616
    .line 617
    const/16 v6, 0x9

    .line 618
    .line 619
    if-le v0, v6, :cond_16

    .line 620
    .line 621
    :try_start_15
    const-string v0, "java.lang.StringLatin1"

    .line 622
    .line 623
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 628
    .line 629
    .line 630
    move-result-object v6

    .line 631
    const-string v14, "indexOfChar"

    .line 632
    .line 633
    filled-new-array {v10, v10, v10}, [Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    move-result-object v15

    .line 637
    invoke-static {v10, v2, v15}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 638
    .line 639
    .line 640
    move-result-object v15

    .line 641
    invoke-virtual {v6, v0, v14, v15}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 642
    .line 643
    .line 644
    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_f

    .line 645
    goto :goto_1c

    .line 646
    :catchall_f
    :cond_16
    move-object v0, v4

    .line 647
    :goto_1c
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰哲苏世:Ljava/lang/invoke/MethodHandle;

    .line 648
    .line 649
    :try_start_16
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    .line 650
    .line 651
    const-class v6, Ljava/util/function/BiFunction;

    .line 652
    .line 653
    sget-object v14, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 654
    .line 655
    if-ne v0, v11, :cond_17

    .line 656
    .line 657
    :try_start_17
    invoke-static {v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 658
    .line 659
    .line 660
    move-result-object v15

    .line 661
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    invoke-static {v14, v1, v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    invoke-virtual {v15, v13, v4}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 670
    .line 671
    .line 672
    move-result-object v19

    .line 673
    const-string v16, "apply"

    .line 674
    .line 675
    invoke-static {v6}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 676
    .line 677
    .line 678
    move-result-object v17

    .line 679
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    move-result-object v4

    .line 683
    invoke-static {v9, v9, v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 684
    .line 685
    .line 686
    move-result-object v18

    .line 687
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    invoke-static {v13, v1, v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 692
    .line 693
    .line 694
    move-result-object v20

    .line 695
    invoke-static/range {v15 .. v20}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-virtual {v1}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-polymorphic {v1}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/BiFunction;

    .line 704
    .line 705
    .line 706
    .line 707
    move-result-object v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_10

    .line 708
    goto :goto_1f

    .line 709
    :catchall_10
    move-exception v0

    .line 710
    const/4 v1, 0x0

    .line 711
    :goto_1d
    const/4 v3, 0x0

    .line 712
    :goto_1e
    const/4 v4, 0x0

    .line 713
    goto/16 :goto_21

    .line 714
    .line 715
    :cond_17
    const/4 v1, 0x0

    .line 716
    :goto_1f
    if-le v0, v11, :cond_18

    .line 717
    .line 718
    if-nez v8, :cond_18

    .line 719
    .line 720
    :try_start_18
    const-string v0, "COMPACT_STRINGS"

    .line 721
    .line 722
    invoke-virtual {v13, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 727
    .line 728
    invoke-virtual {v4, v0}, Lsun/misc/Unsafe;->staticFieldOffset(Ljava/lang/reflect/Field;)J

    .line 729
    .line 730
    .line 731
    move-result-wide v11

    .line 732
    invoke-virtual {v4, v13, v11, v12}, Lsun/misc/Unsafe;->getBoolean(Ljava/lang/Object;J)Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 737
    .line 738
    .line 739
    move-result-object v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_11

    .line 740
    goto :goto_20

    .line 741
    :catchall_11
    move-exception v0

    .line 742
    :try_start_19
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 743
    .line 744
    const/4 v0, 0x0

    .line 745
    :goto_20
    if-eqz v0, :cond_18

    .line 746
    .line 747
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    if-eqz v0, :cond_18

    .line 752
    .line 753
    invoke-virtual {v3, v13}, Ljava/lang/invoke/MethodHandles$Lookup;->in(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 754
    .line 755
    .line 756
    move-result-object v15

    .line 757
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 758
    .line 759
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    invoke-static {v14, v2, v3}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    invoke-virtual {v15, v13, v3}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 768
    .line 769
    .line 770
    move-result-object v19

    .line 771
    const-string v16, "apply"

    .line 772
    .line 773
    invoke-static {v6}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 774
    .line 775
    .line 776
    move-result-object v17

    .line 777
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    move-result-object v3

    .line 781
    invoke-static {v9, v9, v3}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 782
    .line 783
    .line 784
    move-result-object v18

    .line 785
    const-class v3, Ljava/lang/Byte;

    .line 786
    .line 787
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    invoke-static {v13, v2, v3}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 792
    .line 793
    .line 794
    move-result-object v20

    .line 795
    invoke-static/range {v15 .. v20}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    invoke-virtual {v3}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    invoke-polymorphic {v3}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/BiFunction;

    .line 804
    .line 805
    .line 806
    .line 807
    move-result-object v3
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    .line 808
    :try_start_1a
    invoke-static {v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    invoke-virtual {v15, v13, v5, v4, v13}, Ljava/lang/invoke/MethodHandles$Lookup;->findSpecial(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/Class;)Ljava/lang/invoke/MethodHandle;

    .line 813
    .line 814
    .line 815
    move-result-object v19

    .line 816
    const-string v16, "applyAsInt"

    .line 817
    .line 818
    const-class v4, Ljava/util/function/ToIntFunction;

    .line 819
    .line 820
    invoke-static {v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 821
    .line 822
    .line 823
    move-result-object v17

    .line 824
    invoke-static {v10, v9}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 825
    .line 826
    .line 827
    move-result-object v18

    .line 828
    invoke-static {v0, v13}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 829
    .line 830
    .line 831
    move-result-object v20

    .line 832
    invoke-static/range {v15 .. v20}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/ToIntFunction;

    .line 841
    .line 842
    .line 843
    .line 844
    move-result-object v4
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_13

    .line 845
    :try_start_1b
    invoke-static {v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v15, v13, v7, v0, v13}, Ljava/lang/invoke/MethodHandles$Lookup;->findSpecial(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/Class;)Ljava/lang/invoke/MethodHandle;

    .line 850
    .line 851
    .line 852
    move-result-object v19

    .line 853
    const-string v16, "apply"

    .line 854
    .line 855
    const-class v0, Ljava/util/function/Function;

    .line 856
    .line 857
    invoke-static {v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 858
    .line 859
    .line 860
    move-result-object v17

    .line 861
    invoke-static {v9, v9}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 862
    .line 863
    .line 864
    move-result-object v18

    .line 865
    invoke-static {v2, v13}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 866
    .line 867
    .line 868
    move-result-object v20

    .line 869
    invoke-static/range {v15 .. v20}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/Function;

    .line 878
    .line 879
    .line 880
    .line 881
    move-result-object v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_12

    .line 882
    move-object/from16 v21, v4

    .line 883
    .line 884
    goto :goto_22

    .line 885
    :catchall_12
    move-exception v0

    .line 886
    goto :goto_21

    .line 887
    :catchall_13
    move-exception v0

    .line 888
    goto/16 :goto_1e

    .line 889
    .line 890
    :catchall_14
    move-exception v0

    .line 891
    goto/16 :goto_1d

    .line 892
    .line 893
    :cond_18
    const/4 v0, 0x0

    .line 894
    const/4 v4, 0x0

    .line 895
    const/16 v21, 0x0

    .line 896
    .line 897
    goto :goto_23

    .line 898
    :goto_21
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 899
    .line 900
    move-object/from16 v21, v4

    .line 901
    .line 902
    const/4 v0, 0x0

    .line 903
    :goto_22
    move-object v4, v3

    .line 904
    :goto_23
    if-nez v21, :cond_19

    .line 905
    .line 906
    new-instance v21, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏世哲;

    .line 907
    .line 908
    invoke-direct/range {v21 .. v21}, Ljava/lang/Object;-><init>()V

    .line 909
    .line 910
    .line 911
    :cond_19
    sput-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 912
    .line 913
    sput-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 914
    .line 915
    sput-object v21, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 916
    .line 917
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 918
    .line 919
    return-void

    .line 920
    :cond_1a
    const-string v0, "init JDKUtils error"

    .line 921
    .line 922
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏:Ljava/lang/Throwable;

    .line 923
    .line 924
    invoke-static {v0, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 925
    .line 926
    .line 927
    return-void

    .line 928
    :catchall_15
    move-exception v0

    .line 929
    const-string v1, "init unsafe error"

    .line 930
    .line 931
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 932
    .line 933
    .line 934
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;
    .locals 8

    .line 1
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲苏兰:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲:Ljava/lang/invoke/MethodHandle;

    .line 6
    .line 7
    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    const/16 v2, 0xf

    .line 10
    .line 11
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const-class v5, Ljava/lang/invoke/MethodHandles$Lookup;

    .line 16
    .line 17
    const-class v6, Ljava/lang/Class;

    .line 18
    .line 19
    const/4 v7, -0x1

    .line 20
    if-ge v1, v2, :cond_2

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    :try_start_1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏哲兰:Ljava/lang/invoke/MethodHandles$Lookup;

    .line 25
    .line 26
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v4, v6, v1}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v5, v1}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲:Ljava/lang/invoke/MethodHandle;

    .line 39
    .line 40
    :cond_0
    sget-boolean v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰:Z

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const/16 v7, 0x1f

    .line 45
    .line 46
    :cond_1
    invoke-polymorphic {v0, p0, v7}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 47
    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    if-nez v0, :cond_3

    .line 53
    .line 54
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏哲兰:Ljava/lang/invoke/MethodHandles$Lookup;

    .line 55
    .line 56
    filled-new-array {v6, v3}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v4, v6, v1}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v5, v1}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲:Ljava/lang/invoke/MethodHandle;

    .line 69
    .line 70
    :cond_3
    const/4 v1, 0x0

    .line 71
    invoke-polymorphic {v0, p0, v1, v7}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Class;Ljava/lang/Void;I)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 72
    .line 73
    .line 74
    .line 75
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    return-object p0

    .line 77
    :catchall_0
    const/4 v0, 0x1

    .line 78
    sput-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲苏兰:Z

    .line 79
    .line 80
    :cond_4
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏哲兰:Ljava/lang/invoke/MethodHandles$Lookup;

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/invoke/MethodHandles$Lookup;->in(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;
    .locals 3

    .line 1
    new-array v0, p2, [C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p2, :cond_0

    .line 5
    .line 6
    add-int v2, p0, v1

    .line 7
    .line 8
    aget-byte v2, p1, v2

    .line 9
    .line 10
    and-int/lit16 v2, v2, 0xff

    .line 11
    .line 12
    int-to-char v2, v2

    .line 13
    aput-char v2, v0, v1

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 19
    .line 20
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-interface {p0, v0, p1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C
    .locals 3

    .line 1
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 6
    .line 7
    sget-wide v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:J

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, [C
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :catch_0
    const/4 v0, 0x1

    .line 17
    sput-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Z

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(I[BI)Ljava/lang/String;
    .locals 3

    .line 1
    new-array v0, p2, [C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p2, :cond_0

    .line 5
    .line 6
    add-int v2, p0, v1

    .line 7
    .line 8
    aget-byte v2, p1, v2

    .line 9
    .line 10
    int-to-char v2, v2

    .line 11
    aput-char v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 17
    .line 18
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-interface {p0, v0, p1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    return-object p0
.end method
