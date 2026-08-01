.class public abstract Lt50;
.super Ljava/lang/Object;

# interfaces
.implements Lcn;
.implements Lvd;
.implements Lre;
.implements Ljava/io/Serializable;


# instance fields
.field public final a:Lvd;

.field public final b:Lhe;

.field public transient c:Lvd;

.field public final d:I


# direct methods
.method public constructor <init>(Lvd;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lvd;->d()Lhe;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lt50;->a:Lvd;

    .line 13
    .line 14
    iput-object v0, p0, Lt50;->b:Lhe;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    iput p1, p0, Lt50;->d:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract a(Lvd;)Lvd;
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lt50;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lre;
    .locals 2

    .line 1
    iget-object v0, p0, Lt50;->a:Lvd;

    .line 2
    .line 3
    instance-of v1, v0, Lre;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lre;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final d()Lhe;
    .locals 1

    .line 1
    iget-object v0, p0, Lt50;->b:Lhe;

    .line 2
    .line 3
    invoke-static {v0}, Lmp;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    check-cast v0, Lt50;

    .line 3
    .line 4
    iget-object v1, v0, Lt50;->a:Lvd;

    .line 5
    .line 6
    invoke-static {v1}, Lmp;->d(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0, p1}, Lt50;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v2, Lqe;->a:Lqe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-ne p1, v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    invoke-static {p1}, Lgu;->e(Ljava/lang/Throwable;)Ll10;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    iget-object v2, v0, Lt50;->c:Lvd;

    .line 24
    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    if-eq v2, v0, :cond_4

    .line 28
    .line 29
    iget-object v3, v0, Lt50;->b:Lhe;

    .line 30
    .line 31
    invoke-static {v3}, Lmp;->d(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v4, Lxh;->b:Lxh;

    .line 35
    .line 36
    invoke-interface {v3, v4}, Lhe;->b(Lge;)Lfe;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3}, Lmp;->d(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast v3, Lwd;

    .line 44
    .line 45
    check-cast v2, Lvg;

    .line 46
    .line 47
    sget-object v3, Lvg;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    sget-object v5, Lg80;->e:Ll0;

    .line 54
    .line 55
    if-eq v4, v5, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    instance-of v3, v2, Ls8;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    check-cast v2, Ls8;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v2, 0x0

    .line 69
    :goto_1
    if-eqz v2, :cond_4

    .line 70
    .line 71
    sget-object v3, Ls8;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lbh;

    .line 78
    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-interface {v4}, Lbh;->b()V

    .line 83
    .line 84
    .line 85
    sget-object v4, Lvw;->a:Lvw;

    .line 86
    .line 87
    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_2
    sget-object v2, Lvb;->a:Lvb;

    .line 91
    .line 92
    iput-object v2, v0, Lt50;->c:Lvd;

    .line 93
    .line 94
    instance-of v0, v1, Lt50;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    move-object v0, v1

    .line 99
    goto :goto_0

    .line 100
    :cond_5
    invoke-interface {v1, p1}, Lvd;->f(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public abstract g(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final h()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Continuation at "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Lff;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lff;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    invoke-interface {v1}, Lff;->v()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    if-gt v3, v4, :cond_c

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, "label"

    .line 38
    .line 39
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    instance-of v6, v5, Ljava/lang/Integer;

    .line 51
    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    check-cast v5, Ljava/lang/Integer;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v5, v2

    .line 58
    :goto_0
    if-eqz v5, :cond_2

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v5, 0x0

    .line 66
    :goto_1
    sub-int/2addr v5, v4

    .line 67
    goto :goto_2

    .line 68
    :catch_0
    move v5, v3

    .line 69
    :goto_2
    if-gez v5, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-interface {v1}, Lff;->l()[I

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    aget v3, v3, v5

    .line 77
    .line 78
    :goto_3
    sget-object v4, Lmp;->m:Lfw;

    .line 79
    .line 80
    sget-object v5, Lmp;->n:Lfw;

    .line 81
    .line 82
    if-nez v5, :cond_4

    .line 83
    .line 84
    :try_start_1
    const-class v5, Ljava/lang/Class;

    .line 85
    .line 86
    const-string v6, "getModule"

    .line 87
    .line 88
    invoke-virtual {v5, v6, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    const-string v7, "java.lang.Module"

    .line 101
    .line 102
    invoke-virtual {v6, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    const-string v7, "getDescriptor"

    .line 107
    .line 108
    invoke-virtual {v6, v7, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    const-string v8, "java.lang.module.ModuleDescriptor"

    .line 121
    .line 122
    invoke-virtual {v7, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    const-string v8, "name"

    .line 127
    .line 128
    invoke-virtual {v7, v8, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    new-instance v8, Lfw;

    .line 133
    .line 134
    invoke-direct {v8, v5, v6, v7}, Lfw;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 135
    .line 136
    .line 137
    sput-object v8, Lmp;->n:Lfw;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 138
    .line 139
    move-object v5, v8

    .line 140
    goto :goto_4

    .line 141
    :catch_1
    sput-object v4, Lmp;->n:Lfw;

    .line 142
    .line 143
    move-object v5, v4

    .line 144
    :cond_4
    :goto_4
    if-ne v5, v4, :cond_5

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_5
    iget-object v4, v5, Lfw;->a:Ljava/lang/reflect/Method;

    .line 148
    .line 149
    if-eqz v4, :cond_9

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v4, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    if-nez v4, :cond_6

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_6
    iget-object v6, v5, Lfw;->b:Ljava/lang/reflect/Method;

    .line 163
    .line 164
    if-eqz v6, :cond_9

    .line 165
    .line 166
    invoke-virtual {v6, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-nez v4, :cond_7

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_7
    iget-object v5, v5, Lfw;->c:Ljava/lang/reflect/Method;

    .line 174
    .line 175
    if-eqz v5, :cond_8

    .line 176
    .line 177
    invoke-virtual {v5, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    goto :goto_5

    .line 182
    :cond_8
    move-object v4, v2

    .line 183
    :goto_5
    instance-of v5, v4, Ljava/lang/String;

    .line 184
    .line 185
    if-eqz v5, :cond_9

    .line 186
    .line 187
    move-object v2, v4

    .line 188
    check-cast v2, Ljava/lang/String;

    .line 189
    .line 190
    :cond_9
    :goto_6
    if-nez v2, :cond_a

    .line 191
    .line 192
    invoke-interface {v1}, Lff;->c()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    goto :goto_7

    .line 197
    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const/16 v2, 0x2f

    .line 206
    .line 207
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-interface {v1}, Lff;->c()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    :goto_7
    new-instance v4, Ljava/lang/StackTraceElement;

    .line 222
    .line 223
    invoke-interface {v1}, Lff;->m()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-interface {v1}, Lff;->f()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-direct {v4, v2, v5, v1, v3}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 232
    .line 233
    .line 234
    move-object v2, v4

    .line 235
    :goto_8
    if-eqz v2, :cond_b

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    :goto_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    return-object v0

    .line 254
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 255
    .line 256
    new-instance v1, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    const-string v2, "Debug metadata version mismatch. Expected: 1, got "

    .line 259
    .line 260
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v2, ". Please update the Kotlin standard library."

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lt50;->a:Lvd;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lq00;->a:Lr00;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    aget-object v0, v0, v1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "kotlin.jvm.functions."

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/16 v1, 0x15

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    const-string v1, "renderLambdaToString(...)"

    .line 40
    .line 41
    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    invoke-virtual {p0}, Lt50;->h()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method
