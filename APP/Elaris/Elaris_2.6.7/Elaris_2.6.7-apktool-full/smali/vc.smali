.class public abstract Lvc;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/lang/ThreadLocal;

.field public static volatile e:Z

.field public static volatile f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.tencent.mobileqq.aio.msglist.holder.component.file.AIOFileContentComponent"

    .line 2
    .line 3
    const-string v1, "com.tencent.mobileqq.aio.msglist.holder.component.msgtail.AIOGeneralMsgTailContentComponent"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lvc;->a:[Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lvc;->b:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lvc;->c:Ljava/util/Set;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lvc;->d:Ljava/lang/ThreadLocal;

    .line 35
    .line 36
    return-void
.end method

.method public static a(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Field;)V
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_c

    .line 4
    .line 5
    :cond_0
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v0, Lyc;->c:Ljava/util/Map;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v3, p1, Landroid/view/View;

    .line 21
    .line 22
    if-nez v3, :cond_3

    .line 23
    .line 24
    :catchall_0
    :cond_2
    :goto_0
    move-object p0, v1

    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_3
    move-object v3, p1

    .line 28
    check-cast v3, Landroid/view/View;

    .line 29
    .line 30
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lwc;

    .line 35
    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    iget-object v5, v4, Lwc;->a:Landroid/view/View;

    .line 39
    .line 40
    if-ne v5, v3, :cond_4

    .line 41
    .line 42
    iget-object p0, v4, Lwc;->b:Landroid/view/ViewGroup;

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_4
    move v4, v2

    .line 46
    :goto_1
    if-eqz v3, :cond_8

    .line 47
    .line 48
    const/16 v5, 0x8

    .line 49
    .line 50
    if-ge v4, v5, :cond_8

    .line 51
    .line 52
    instance-of v5, v3, Landroid/view/ViewGroup;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    if-eqz v5, :cond_6

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    :try_start_2
    const-string v6, ".TemplateLayout"

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_5

    .line 71
    .line 72
    const-string v6, ".ChatItemAnimLayout"

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_5

    .line 79
    .line 80
    const-string v6, ".aio.holder.template."

    .line 81
    .line 82
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_5

    .line 87
    .line 88
    const-string v6, ".aio.msglist.holder.template."

    .line 89
    .line 90
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_6

    .line 95
    .line 96
    :cond_5
    check-cast v3, Landroid/view/ViewGroup;

    .line 97
    .line 98
    new-instance v4, Lwc;

    .line 99
    .line 100
    check-cast p1, Landroid/view/View;

    .line 101
    .line 102
    invoke-direct {v4, p1, v3}, Lwc;-><init>(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v0, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-object p0, v3

    .line 109
    goto :goto_3

    .line 110
    :catchall_1
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    instance-of v5, v3, Landroid/view/View;

    .line 115
    .line 116
    if-eqz v5, :cond_7

    .line 117
    .line 118
    check-cast v3, Landroid/view/View;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    move-object v3, v1

    .line 122
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_8
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :goto_3
    sget-object p1, Lvc;->d:Ljava/lang/ThreadLocal;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ljava/util/ArrayDeque;

    .line 136
    .line 137
    if-eqz p1, :cond_a

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_9

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    goto :goto_5

    .line 151
    :cond_a
    :goto_4
    move-object p1, v1

    .line 152
    :goto_5
    sget-object v0, Lvc;->b:Ljava/lang/Object;

    .line 153
    .line 154
    if-ne p1, v0, :cond_b

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_b
    move-object v1, p1

    .line 158
    :goto_6
    if-eqz v1, :cond_15

    .line 159
    .line 160
    const-string p1, "self_message_left_side"

    .line 161
    .line 162
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_15

    .line 167
    .line 168
    if-nez p0, :cond_c

    .line 169
    .line 170
    goto/16 :goto_c

    .line 171
    .line 172
    :cond_c
    sget-object p1, Lyc;->b:Ljava/util/Map;

    .line 173
    .line 174
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Lxc;

    .line 179
    .line 180
    sget-object v0, Lyc;->a:Ljava/util/Map;

    .line 181
    .line 182
    monitor-enter v0

    .line 183
    :try_start_3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 188
    const/high16 v0, 0x43340000    # 180.0f

    .line 189
    .line 190
    const/high16 v3, -0x40800000    # -1.0f

    .line 191
    .line 192
    if-eqz v1, :cond_10

    .line 193
    .line 194
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_10

    .line 203
    .line 204
    if-eqz p1, :cond_10

    .line 205
    .line 206
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    iget v4, p1, Lxc;->a:I

    .line 211
    .line 212
    if-eq v1, v4, :cond_d

    .line 213
    .line 214
    goto :goto_9

    .line 215
    :cond_d
    if-nez v1, :cond_e

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_e
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    iget-object v5, p1, Lxc;->b:Landroid/view/View;

    .line 223
    .line 224
    if-ne v4, v5, :cond_10

    .line 225
    .line 226
    add-int/lit8 v1, v1, -0x1

    .line 227
    .line 228
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iget-object p1, p1, Lxc;->c:Landroid/view/View;

    .line 233
    .line 234
    if-ne v1, p1, :cond_10

    .line 235
    .line 236
    :goto_7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    move v1, v2

    .line 241
    :goto_8
    if-ge v1, p1, :cond_16

    .line 242
    .line 243
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-virtual {v4}, Landroid/view/View;->getRotationY()F

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    invoke-static {v4, v0}, Ljava/lang/Float;->compare(FF)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_f

    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_10
    :goto_9
    invoke-static {p0, v3}, Lyc;->c(Landroid/view/View;F)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    :goto_a
    if-ge v2, p1, :cond_14

    .line 269
    .line 270
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-eqz v1, :cond_11

    .line 275
    .line 276
    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    const/4 v4, 0x0

    .line 281
    cmpg-float v3, v3, v4

    .line 282
    .line 283
    if-gez v3, :cond_11

    .line 284
    .line 285
    const/high16 v3, 0x3f800000    # 1.0f

    .line 286
    .line 287
    invoke-static {v1, v3}, Lyc;->c(Landroid/view/View;F)Z

    .line 288
    .line 289
    .line 290
    :cond_11
    if-eqz v1, :cond_13

    .line 291
    .line 292
    invoke-virtual {v1}, Landroid/view/View;->getRotationY()F

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    invoke-static {v3, v0}, Ljava/lang/Float;->compare(FF)I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-nez v3, :cond_12

    .line 301
    .line 302
    goto :goto_b

    .line 303
    :cond_12
    :try_start_4
    invoke-virtual {v1, v0}, Landroid/view/View;->setRotationY(F)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 304
    .line 305
    .line 306
    :catchall_2
    :cond_13
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 307
    .line 308
    goto :goto_a

    .line 309
    :cond_14
    sget-object p1, Lyc;->a:Ljava/util/Map;

    .line 310
    .line 311
    monitor-enter p1

    .line 312
    :try_start_5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 313
    .line 314
    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    sget-object v0, Lyc;->b:Ljava/util/Map;

    .line 318
    .line 319
    new-instance v1, Lxc;

    .line 320
    .line 321
    invoke-direct {v1, p0}, Lxc;-><init>(Landroid/view/ViewGroup;)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    monitor-exit p1

    .line 328
    goto :goto_c

    .line 329
    :catchall_3
    move-exception p0

    .line 330
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 331
    throw p0

    .line 332
    :catchall_4
    move-exception p0

    .line 333
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 334
    throw p0

    .line 335
    :cond_15
    invoke-static {p0}, Lyc;->a(Landroid/view/ViewGroup;)V

    .line 336
    .line 337
    .line 338
    :cond_16
    :goto_c
    return-void
.end method

.method public static b()V
    .locals 3

    .line 1
    sget-object v0, Lvc;->d:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/reflect/Method;Z)V
    .locals 4

    .line 1
    sget-object v0, Lvc;->d:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object v0, Lvc;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "self_message_left_side"

    .line 25
    .line 26
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_7

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v2, 0x0

    .line 50
    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p1, p0, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    instance-of v2, p1, Ljava/lang/Boolean;

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    check-cast p1, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    move-object v0, p1

    .line 63
    :catchall_0
    :cond_3
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    if-eqz p2, :cond_7

    .line 79
    .line 80
    const-string p1, "debug_log"

    .line 81
    .line 82
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    sget-wide v0, Lvc;->f:J

    .line 94
    .line 95
    sub-long v0, p1, v0

    .line 96
    .line 97
    const-wide/32 v2, 0xea60

    .line 98
    .line 99
    .line 100
    cmp-long v0, v0, v2

    .line 101
    .line 102
    if-gez v0, :cond_6

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    sput-wide p1, Lvc;->f:J

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const-string p1, "self message left-side layout/style hit item="

    .line 116
    .line 117
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_7
    :goto_1
    return-void
.end method

.method public static d(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)I
    .locals 13

    .line 1
    const-string v0, "com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_18

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_12

    .line 13
    .line 14
    :cond_0
    sget-object v2, Lyc;->a:Ljava/util/Map;

    .line 15
    .line 16
    move-object v2, v0

    .line 17
    :goto_0
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    const-class v5, Ljava/lang/Object;

    .line 22
    .line 23
    if-eq v2, v5, :cond_5

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    array-length v6, v5

    .line 30
    move v7, v1

    .line 31
    move-object v8, v3

    .line 32
    :goto_1
    if-ge v7, v6, :cond_4

    .line 33
    .line 34
    aget-object v9, v5, v7

    .line 35
    .line 36
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-nez v10, :cond_3

    .line 45
    .line 46
    const-class v10, Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-virtual {v10, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-nez v10, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    if-eqz v8, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    move-object v8, v9

    .line 63
    :cond_3
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    :goto_3
    move-object v8, v3

    .line 67
    :cond_4
    if-eqz v8, :cond_6

    .line 68
    .line 69
    :try_start_1
    invoke-virtual {v8, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :catchall_1
    :cond_5
    move-object v8, v3

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    goto :goto_0

    .line 80
    :goto_4
    sget-object v2, Lzc;->a:Ljava/util/Map;

    .line 81
    .line 82
    move-object v2, v0

    .line 83
    :goto_5
    if-eqz v2, :cond_9

    .line 84
    .line 85
    const-class v5, Ljava/lang/Object;

    .line 86
    .line 87
    if-eq v2, v5, :cond_9

    .line 88
    .line 89
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 93
    goto :goto_6

    .line 94
    :catchall_2
    move-object v5, v3

    .line 95
    :goto_6
    if-eqz v5, :cond_8

    .line 96
    .line 97
    array-length v6, v5

    .line 98
    move v7, v1

    .line 99
    :goto_7
    if-ge v7, v6, :cond_8

    .line 100
    .line 101
    aget-object v9, v5, v7

    .line 102
    .line 103
    invoke-static {v9}, Lzc;->c(Ljava/lang/reflect/Method;)Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_7

    .line 108
    .line 109
    invoke-virtual {v9, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_7

    .line 116
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    goto :goto_5

    .line 121
    :cond_9
    move-object v9, v3

    .line 122
    :goto_8
    const-string v2, "com.tencent.mobileqq.aio.msglist.holder.AIOMsgItemUIState$AIOMsgItemState"

    .line 123
    .line 124
    invoke-static {p0, v2}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const-string v5, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 129
    .line 130
    invoke-static {p0, v5}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    if-nez p0, :cond_a

    .line 135
    .line 136
    move-object p0, v3

    .line 137
    goto :goto_9

    .line 138
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :goto_9
    if-eqz v2, :cond_11

    .line 143
    .line 144
    if-eqz p0, :cond_11

    .line 145
    .line 146
    const-class v5, Ljava/lang/Object;

    .line 147
    .line 148
    if-ne p0, v5, :cond_b

    .line 149
    .line 150
    goto :goto_c

    .line 151
    :cond_b
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    array-length v5, v2

    .line 156
    move v6, v1

    .line 157
    move-object v7, v3

    .line 158
    :goto_a
    if-ge v6, v5, :cond_f

    .line 159
    .line 160
    aget-object v10, v2, v6

    .line 161
    .line 162
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-nez v11, :cond_e

    .line 171
    .line 172
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    if-eq v11, p0, :cond_c

    .line 177
    .line 178
    goto :goto_b

    .line 179
    :cond_c
    if-eqz v7, :cond_d

    .line 180
    .line 181
    goto :goto_c

    .line 182
    :cond_d
    move-object v7, v10

    .line 183
    :cond_e
    :goto_b
    add-int/lit8 v6, v6, 0x1

    .line 184
    .line 185
    goto :goto_a

    .line 186
    :cond_f
    if-eqz v7, :cond_10

    .line 187
    .line 188
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 189
    .line 190
    .line 191
    :cond_10
    move-object v3, v7

    .line 192
    :catchall_3
    :cond_11
    :goto_c
    new-instance p0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v2, "self message left-side state field="

    .line 195
    .line 196
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    if-nez v3, :cond_12

    .line 200
    .line 201
    const-string v2, "missing"

    .line 202
    .line 203
    goto :goto_d

    .line 204
    :cond_12
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    :goto_d
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 219
    .line 220
    .line 221
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 222
    array-length v0, p0

    .line 223
    move v2, v1

    .line 224
    move v5, v2

    .line 225
    :goto_e
    if-ge v2, v0, :cond_17

    .line 226
    .line 227
    aget-object v6, p0, v2

    .line 228
    .line 229
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 230
    .line 231
    if-eqz v6, :cond_16

    .line 232
    .line 233
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-nez v10, :cond_16

    .line 242
    .line 243
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-eqz v10, :cond_13

    .line 252
    .line 253
    goto/16 :goto_11

    .line 254
    .line 255
    :cond_13
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    const-string v12, "handleUIState"

    .line 264
    .line 265
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-eqz v10, :cond_14

    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    if-ne v10, v7, :cond_14

    .line 276
    .line 277
    array-length v10, v11

    .line 278
    if-ne v10, v4, :cond_14

    .line 279
    .line 280
    goto :goto_f

    .line 281
    :cond_14
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    if-ne v10, v7, :cond_16

    .line 286
    .line 287
    array-length v7, v11

    .line 288
    const/4 v10, 0x4

    .line 289
    if-ne v7, v10, :cond_16

    .line 290
    .line 291
    aget-object v7, v11, v1

    .line 292
    .line 293
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 294
    .line 295
    if-ne v7, v10, :cond_16

    .line 296
    .line 297
    const-class v7, Ljava/util/List;

    .line 298
    .line 299
    const/4 v10, 0x2

    .line 300
    aget-object v10, v11, v10

    .line 301
    .line 302
    invoke-virtual {v7, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    if-eqz v7, :cond_16

    .line 307
    .line 308
    aget-object v7, v11, v4

    .line 309
    .line 310
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    if-nez v7, :cond_16

    .line 315
    .line 316
    const/4 v7, 0x3

    .line 317
    aget-object v7, v11, v7

    .line 318
    .line 319
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    if-nez v7, :cond_16

    .line 324
    .line 325
    :goto_f
    invoke-static {v6}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    sget-object v10, Lvc;->c:Ljava/util/Set;

    .line 330
    .line 331
    monitor-enter v10

    .line 332
    :try_start_5
    invoke-interface {v10, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    if-nez v11, :cond_15

    .line 337
    .line 338
    monitor-exit v10

    .line 339
    goto :goto_11

    .line 340
    :catchall_4
    move-exception p0

    .line 341
    goto :goto_10

    .line 342
    :cond_15
    monitor-exit v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 343
    :try_start_6
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 344
    .line 345
    .line 346
    new-instance v10, Lsc;

    .line 347
    .line 348
    invoke-direct {v10, v9, v3, p1, v8}, Lsc;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v6, v10}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 352
    .line 353
    .line 354
    add-int/lit8 v5, v5, 0x1

    .line 355
    .line 356
    new-instance v6, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    const-string v10, "self message left-side bind hooked: "

    .line 362
    .line 363
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 374
    .line 375
    .line 376
    goto :goto_11

    .line 377
    :catchall_5
    move-exception v6

    .line 378
    new-instance v7, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    const-string v10, "self message left-side native bind hook failed: "

    .line 381
    .line 382
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    const-string v10, ": "

    .line 386
    .line 387
    invoke-static {v6, v7, v10}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    goto :goto_11

    .line 391
    :goto_10
    :try_start_7
    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 392
    throw p0

    .line 393
    :cond_16
    :goto_11
    add-int/lit8 v2, v2, 0x1

    .line 394
    .line 395
    goto/16 :goto_e

    .line 396
    .line 397
    :cond_17
    return v5

    .line 398
    :catchall_6
    :cond_18
    :goto_12
    return v1
.end method

.method public static e(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)I
    .locals 11

    .line 1
    const-string v0, "com.tencent.mobileqq.aio.utils.p"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 8
    .line 9
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    if-eqz p0, :cond_8

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 26
    array-length v2, v0

    .line 27
    move v3, v1

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ge v3, v2, :cond_7

    .line 30
    .line 31
    aget-object v5, v0, v3

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    const/4 v7, -0x1

    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    move v8, v1

    .line 41
    :goto_1
    array-length v9, v6

    .line 42
    if-ge v8, v9, :cond_2

    .line 43
    .line 44
    aget-object v9, v6, v8

    .line 45
    .line 46
    invoke-virtual {v9, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-eqz v9, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v8, v7

    .line 57
    :goto_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-nez v9, :cond_6

    .line 66
    .line 67
    if-ltz v8, :cond_6

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    const-string v10, ".AIOBubbleSkinInfo"

    .line 78
    .line 79
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-nez v9, :cond_3

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_3
    const-string v9, "e"

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_4

    .line 97
    .line 98
    array-length v9, v6

    .line 99
    const/4 v10, 0x4

    .line 100
    if-ne v9, v10, :cond_4

    .line 101
    .line 102
    const/4 v9, 0x2

    .line 103
    aget-object v6, v6, v9

    .line 104
    .line 105
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    if-ne v6, v10, :cond_4

    .line 108
    .line 109
    move v7, v9

    .line 110
    :cond_4
    invoke-static {v5}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    sget-object v9, Lvc;->c:Ljava/util/Set;

    .line 115
    .line 116
    monitor-enter v9

    .line 117
    :try_start_1
    invoke-interface {v9, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-nez v10, :cond_5

    .line 122
    .line 123
    monitor-exit v9

    .line 124
    goto :goto_4

    .line 125
    :catchall_0
    move-exception p0

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    const/4 v9, 0x1

    .line 129
    :try_start_2
    invoke-virtual {v5, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 130
    .line 131
    .line 132
    new-instance v9, Ltc;

    .line 133
    .line 134
    invoke-direct {v9, v8, p1, v7}, Ltc;-><init>(ILjava/lang/reflect/Method;I)V

    .line 135
    .line 136
    .line 137
    invoke-static {v5, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 138
    .line 139
    .line 140
    add-int/lit8 v4, v4, 0x1

    .line 141
    .line 142
    new-instance v5, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v7, "self message left-side bubble skin hooked: "

    .line 148
    .line 149
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :catchall_1
    move-exception v5

    .line 164
    new-instance v6, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v7, "self message left-side bubble skin hook failed: "

    .line 167
    .line 168
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v7, ": "

    .line 172
    .line 173
    invoke-static {v5, v6, v7}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :goto_3
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 178
    throw p0

    .line 179
    :cond_6
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_7
    return v4

    .line 184
    :catchall_2
    :cond_8
    :goto_5
    return v1
.end method

.method public static f(Ljava/lang/ClassLoader;)I
    .locals 12

    .line 1
    sget-object v0, Lvc;->a:[Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, 0x2

    .line 7
    if-ge v2, v4, :cond_5

    .line 8
    .line 9
    aget-object v4, v0, v2

    .line 10
    .line 11
    invoke-static {v4, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    array-length v5, v4

    .line 24
    move v6, v1

    .line 25
    :goto_1
    if-ge v6, v5, :cond_4

    .line 26
    .line 27
    aget-object v7, v4, v6

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    const-string v9, "K1"

    .line 34
    .line 35
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-eqz v9, :cond_3

    .line 44
    .line 45
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-nez v9, :cond_3

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    if-ne v9, v10, :cond_3

    .line 62
    .line 63
    array-length v9, v8

    .line 64
    const/4 v10, 0x3

    .line 65
    if-ne v9, v10, :cond_3

    .line 66
    .line 67
    aget-object v9, v8, v1

    .line 68
    .line 69
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    if-ne v9, v10, :cond_3

    .line 72
    .line 73
    const/4 v9, 0x1

    .line 74
    aget-object v8, v8, v9

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eqz v8, :cond_1

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_1
    invoke-static {v7}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    sget-object v10, Lvc;->c:Ljava/util/Set;

    .line 88
    .line 89
    monitor-enter v10

    .line 90
    :try_start_1
    invoke-interface {v10, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-nez v11, :cond_2

    .line 95
    .line 96
    monitor-exit v10

    .line 97
    goto :goto_3

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :try_start_2
    invoke-virtual {v7, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 102
    .line 103
    .line 104
    new-instance v9, Luc;

    .line 105
    .line 106
    const/16 v10, 0x78

    .line 107
    .line 108
    invoke-direct {v9, v10}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v7, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 112
    .line 113
    .line 114
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    new-instance v7, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v9, "self message left-side file direction mask hooked: "

    .line 122
    .line 123
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-static {v7}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :catchall_1
    move-exception v7

    .line 138
    new-instance v8, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v9, "self message left-side file direction mask failed: "

    .line 141
    .line 142
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string v9, ": "

    .line 146
    .line 147
    invoke-static {v7, v8, v9}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :goto_2
    :try_start_3
    monitor-exit v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 152
    throw p0

    .line 153
    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :catchall_2
    :cond_4
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_5
    return v3
.end method

.method public static g(Ljava/lang/reflect/Method;)I
    .locals 5

    .line 1
    const-string v0, "self message left-side direction hooked: "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {p0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget-object v3, Lvc;->c:Ljava/util/Set;

    .line 12
    .line 13
    monitor-enter v3

    .line 14
    :try_start_0
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    monitor-exit v3

    .line 21
    return v1

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :try_start_1
    new-instance v3, Lrc;

    .line 26
    .line 27
    const/16 v4, 0x78

    .line 28
    .line 29
    invoke-direct {v3, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :catchall_1
    move-exception p0

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "self message left-side direction hook failed: "

    .line 48
    .line 49
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v2, ": "

    .line 53
    .line 54
    invoke-static {p0, v0, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return v1

    .line 58
    :goto_0
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw p0
.end method

.method public static declared-synchronized h(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const-class v0, Lvc;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_8

    .line 5
    .line 6
    :try_start_0
    sget-boolean v1, Lvc;->e:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_8

    .line 11
    .line 12
    :cond_0
    sget-object v1, Lzc;->c:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    if-ne v1, p0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    sput-object p0, Lzc;->c:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    invoke-static {}, Lzc;->d()V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 v1, 0x1

    .line 23
    sput-boolean v1, Lvc;->e:Z

    .line 24
    .line 25
    const-string v2, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 26
    .line 27
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_1
    const/4 v3, 0x0

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    const-class v4, Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    .line 36
    if-eq v2, v4, :cond_3

    .line 37
    .line 38
    :try_start_1
    const-string v4, "isSelf"

    .line 39
    .line 40
    invoke-virtual {v2, v4, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne v4, v5, :cond_2

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    array-length v4, v4

    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_0
    :cond_2
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    :goto_2
    invoke-static {v3}, Lvc;->g(Ljava/lang/reflect/Method;)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v2, 0x0

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    move v4, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-static {p0, v3}, Lvc;->d(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    :goto_3
    if-nez v1, :cond_5

    .line 92
    .line 93
    move v3, v2

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    invoke-static {p0, v3}, Lvc;->e(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_4
    if-nez v1, :cond_6

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_6
    invoke-static {p0}, Lvc;->f(Ljava/lang/ClassLoader;)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    :goto_5
    if-lez v1, :cond_7

    .line 107
    .line 108
    if-lez v4, :cond_7

    .line 109
    .line 110
    new-instance p0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v5, "self message left-side layout/style hooks installed count="

    .line 116
    .line 117
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    add-int/2addr v1, v4

    .line 121
    add-int/2addr v1, v3

    .line 122
    add-int/2addr v1, v2

    .line 123
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, " skin="

    .line 127
    .line 128
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, " file_mask="

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_6

    .line 150
    :catchall_1
    move-exception p0

    .line 151
    goto :goto_7

    .line 152
    :cond_7
    const-string p0, "self message left-side hook skipped reason=native direction target missing"

    .line 153
    .line 154
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    .line 156
    .line 157
    :goto_6
    monitor-exit v0

    .line 158
    return-void

    .line 159
    :goto_7
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 160
    throw p0

    .line 161
    :cond_8
    :goto_8
    monitor-exit v0

    .line 162
    return-void
.end method

.method public static declared-synchronized i()V
    .locals 3

    .line 1
    const-class v0, Lvc;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    sput-boolean v1, Lvc;->e:Z

    .line 6
    .line 7
    sget-object v1, Lvc;->c:Ljava/util/Set;

    .line 8
    .line 9
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :try_start_1
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 11
    .line 12
    .line 13
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    :try_start_2
    sget-object v1, Lvc;->d:Ljava/lang/ThreadLocal;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lyc;->b()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lzc;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_0

    .line 29
    :catchall_1
    move-exception v2

    .line 30
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 31
    :try_start_4
    throw v2

    .line 32
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 33
    throw v1
.end method
