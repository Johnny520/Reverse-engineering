.class public abstract Lxhss/ᛷᛲᛳᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛴᛶᛴ;
.implements Lxhss/ᛱᲇᲀᛷ;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛱᛴᛶᛴ;


# direct methods
.method public constructor <init>(Lxhss/ᛱᛴᛶᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛷᛲᛳᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᛶᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
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
    const-class v2, Lxhss/ᛷᛳᛲᲀ;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lxhss/ᛷᛳᛲᲀ;

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
    invoke-interface {v1}, Lxhss/ᛷᛳᛲᲀ;->v()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    if-ge v3, v4, :cond_1

    .line 31
    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :cond_1
    const/4 v3, -0x1

    .line 35
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v6, "label"

    .line 40
    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    instance-of v6, v5, Ljava/lang/Integer;

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    check-cast v5, Ljava/lang/Integer;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v5, v2

    .line 60
    :goto_0
    if-eqz v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 v5, 0x0

    .line 68
    :goto_1
    sub-int/2addr v5, v4

    .line 69
    goto :goto_2

    .line 70
    :catch_0
    move v5, v3

    .line 71
    :goto_2
    if-gez v5, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-interface {v1}, Lxhss/ᛷᛳᛲᲀ;->l()[I

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    aget v3, v3, v5

    .line 79
    .line 80
    :goto_3
    sget-object v4, Lxhss/ᲁᛵᛸᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛷᛱᛳᲁ;

    .line 81
    .line 82
    sget-object v5, Lxhss/ᲁᛵᛸᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 83
    .line 84
    if-nez v5, :cond_5

    .line 85
    .line 86
    :try_start_1
    const-class v5, Ljava/lang/Class;

    .line 87
    .line 88
    const-string v6, "getModule"

    .line 89
    .line 90
    invoke-virtual {v5, v6, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    const-string v7, "java.lang.Module"

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    const-string v7, "getDescriptor"

    .line 109
    .line 110
    invoke-virtual {v6, v7, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    const-string v8, "java.lang.module.ModuleDescriptor"

    .line 123
    .line 124
    invoke-virtual {v7, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    const-string v8, "name"

    .line 129
    .line 130
    invoke-virtual {v7, v8, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    new-instance v8, Lxhss/ᛷᛱᛳᲁ;

    .line 135
    .line 136
    invoke-direct {v8, v5, v6, v7}, Lxhss/ᛷᛱᛳᲁ;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 137
    .line 138
    .line 139
    sput-object v8, Lxhss/ᲁᛵᛸᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 140
    .line 141
    move-object v5, v8

    .line 142
    goto :goto_4

    .line 143
    :catch_1
    sput-object v4, Lxhss/ᲁᛵᛸᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 144
    .line 145
    move-object v5, v4

    .line 146
    :cond_5
    :goto_4
    if-ne v5, v4, :cond_6

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_6
    iget-object v4, v5, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v4, Ljava/lang/reflect/Method;

    .line 152
    .line 153
    if-eqz v4, :cond_a

    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v4, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-nez v4, :cond_7

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_7
    iget-object v6, v5, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v6, Ljava/lang/reflect/Method;

    .line 169
    .line 170
    if-eqz v6, :cond_a

    .line 171
    .line 172
    invoke-virtual {v6, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    if-nez v4, :cond_8

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_8
    iget-object v5, v5, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v5, Ljava/lang/reflect/Method;

    .line 182
    .line 183
    if-eqz v5, :cond_9

    .line 184
    .line 185
    invoke-virtual {v5, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    goto :goto_5

    .line 190
    :cond_9
    move-object v4, v2

    .line 191
    :goto_5
    instance-of v5, v4, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz v5, :cond_a

    .line 194
    .line 195
    move-object v2, v4

    .line 196
    check-cast v2, Ljava/lang/String;

    .line 197
    .line 198
    :cond_a
    :goto_6
    if-nez v2, :cond_b

    .line 199
    .line 200
    invoke-interface {v1}, Lxhss/ᛷᛳᛲᲀ;->c()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    goto :goto_7

    .line 205
    :cond_b
    new-instance v4, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    const/16 v2, 0x2f

    .line 211
    .line 212
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-interface {v1}, Lxhss/ᛷᛳᛲᲀ;->c()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    :goto_7
    new-instance v4, Ljava/lang/StackTraceElement;

    .line 227
    .line 228
    invoke-interface {v1}, Lxhss/ᛷᛳᛲᲀ;->m()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-interface {v1}, Lxhss/ᛷᛳᛲᲀ;->f()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-direct {v4, v2, v5, v1, v3}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 237
    .line 238
    .line 239
    move-object v2, v4

    .line 240
    :goto_8
    if-nez v2, :cond_c

    .line 241
    .line 242
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    :cond_c
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛱᲇᲀᛷ;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛲᛳᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    instance-of v0, p0, Lxhss/ᛱᲇᲀᛷ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lxhss/ᛱᲇᲀᛷ;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public abstract ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    :goto_0
    check-cast p0, Lxhss/ᛷᛲᛳᛴ;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛷᛲᛳᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᛶᛴ;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, p1}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v1, Lxhss/ᛸᛴᛸᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛸᲈ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    new-instance v1, Lxhss/ᲈᛳᛱᲇ;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛷᲈᲈ()V

    .line 22
    .line 23
    .line 24
    instance-of p0, v0, Lxhss/ᛷᛲᛳᛴ;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    move-object p0, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-interface {v0, p1}, Lxhss/ᛱᛴᛶᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public ᛸᛷᲈᲈ()V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;
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
