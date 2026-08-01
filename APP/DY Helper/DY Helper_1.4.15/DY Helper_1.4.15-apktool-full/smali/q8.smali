.class public abstract Lq8;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lop;
.implements Ldq;
.implements Ljava/io/Serializable;


# instance fields
.field public final ε:Lop;


# direct methods
.method public constructor <init>(Lop;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq8;->ε:Lop;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

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
    invoke-virtual {p0}, Lq8;->θ()Ljava/lang/StackTraceElement;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public β()Ldq;
    .locals 1

    .line 1
    iget-object p0, p0, Lq8;->ε:Lop;

    .line 2
    .line 3
    instance-of v0, p0, Ldq;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ldq;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final ζ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    :goto_0
    check-cast p0, Lq8;

    .line 2
    .line 3
    iget-object v0, p0, Lq8;->ε:Lop;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0, p1}, Lq8;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v1, Lcq;->ε:Lcq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    new-instance v1, Leo1;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lq8;->λ()V

    .line 25
    .line 26
    .line 27
    instance-of p0, v0, Lq8;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    move-object p0, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-interface {v0, p1}, Lop;->ζ(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public η(Lop;Ljava/lang/Object;)Lop;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "create(Any?;Continuation) has not been overridden"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public θ()Ljava/lang/StackTraceElement;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lwq;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lwq;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    invoke-interface {v0}, Lwq;->v()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-gt v2, v3, :cond_b

    .line 23
    .line 24
    const/4 v2, -0x1

    .line 25
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "label"

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    instance-of v5, v4, Ljava/lang/Integer;

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    check-cast v4, Ljava/lang/Integer;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v4, v1

    .line 50
    :goto_0
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const/4 v4, 0x0

    .line 58
    :goto_1
    sub-int/2addr v4, v3

    .line 59
    goto :goto_2

    .line 60
    :catch_0
    move v4, v2

    .line 61
    :goto_2
    if-gez v4, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-interface {v0}, Lwq;->l()[I

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    aget v2, v2, v4

    .line 69
    .line 70
    :goto_3
    sget-object v3, Lpd2;->δ:Lm6;

    .line 71
    .line 72
    sget-object v4, Lpd2;->ε:Lm6;

    .line 73
    .line 74
    if-nez v4, :cond_4

    .line 75
    .line 76
    :try_start_1
    const-class v4, Ljava/lang/Class;

    .line 77
    .line 78
    const-string v5, "getModule"

    .line 79
    .line 80
    invoke-virtual {v4, v5, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    const-string v6, "java.lang.Module"

    .line 93
    .line 94
    invoke-virtual {v5, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const-string v6, "getDescriptor"

    .line 99
    .line 100
    invoke-virtual {v5, v6, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    const-string v7, "java.lang.module.ModuleDescriptor"

    .line 113
    .line 114
    invoke-virtual {v6, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    const-string v7, "name"

    .line 119
    .line 120
    invoke-virtual {v6, v7, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    new-instance v7, Lm6;

    .line 125
    .line 126
    invoke-direct {v7, v4, v5, v6}, Lm6;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 127
    .line 128
    .line 129
    sput-object v7, Lpd2;->ε:Lm6;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 130
    .line 131
    move-object v4, v7

    .line 132
    goto :goto_4

    .line 133
    :catch_1
    sput-object v3, Lpd2;->ε:Lm6;

    .line 134
    .line 135
    move-object v4, v3

    .line 136
    :cond_4
    :goto_4
    if-ne v4, v3, :cond_5

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_5
    iget-object v3, v4, Lm6;->ζ:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v3, Ljava/lang/reflect/Method;

    .line 142
    .line 143
    if-eqz v3, :cond_9

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-nez p0, :cond_6

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_6
    iget-object v3, v4, Lm6;->η:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v3, Ljava/lang/reflect/Method;

    .line 159
    .line 160
    if-eqz v3, :cond_9

    .line 161
    .line 162
    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-nez p0, :cond_7

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_7
    iget-object v3, v4, Lm6;->θ:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v3, Ljava/lang/reflect/Method;

    .line 172
    .line 173
    if-eqz v3, :cond_8

    .line 174
    .line 175
    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    goto :goto_5

    .line 180
    :cond_8
    move-object p0, v1

    .line 181
    :goto_5
    instance-of v3, p0, Ljava/lang/String;

    .line 182
    .line 183
    if-eqz v3, :cond_9

    .line 184
    .line 185
    move-object v1, p0

    .line 186
    check-cast v1, Ljava/lang/String;

    .line 187
    .line 188
    :cond_9
    :goto_6
    if-nez v1, :cond_a

    .line 189
    .line 190
    invoke-interface {v0}, Lwq;->c()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    goto :goto_7

    .line 195
    :cond_a
    new-instance p0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const/16 v1, 0x2f

    .line 204
    .line 205
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-interface {v0}, Lwq;->c()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    :goto_7
    new-instance v1, Ljava/lang/StackTraceElement;

    .line 220
    .line 221
    invoke-interface {v0}, Lwq;->m()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-interface {v0}, Lwq;->f()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-direct {v1, p0, v3, v0, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 230
    .line 231
    .line 232
    return-object v1

    .line 233
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v1, "Debug metadata version mismatch. Expected: 1, got "

    .line 238
    .line 239
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v1, ". Please update the Kotlin standard library."

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw p0
.end method

.method public abstract κ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public λ()V
    .locals 0

    .line 1
    return-void
.end method
