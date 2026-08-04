.class public abstract Lyyds/ᛲᛴᛷᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᛱᛶᛸ;
.implements Lyyds/ᛶᲁᛵᛷ;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᛲᛱᛶᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᛴᛷᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛱᛶᛸ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 10

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
    const-class v2, Lyyds/ᲀᛶᛸᛳ;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lyyds/ᲀᛶᛸᛳ;

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
    invoke-interface {v1}, Lyyds/ᲀᛶᛸᛳ;->v()I

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
    invoke-interface {v1}, Lyyds/ᲀᛶᛸᛳ;->l()[I

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    aget v3, v3, v5

    .line 79
    .line 80
    :goto_3
    sget-object v4, Lyyds/ᛱᛷᲈᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛳᛷᲀᛴ;

    .line 81
    .line 82
    sget-object v5, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛷᲀᛴ;

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
    new-instance v8, Lyyds/ᛳᛷᲀᛴ;

    .line 135
    .line 136
    const/16 v9, 0x19

    .line 137
    .line 138
    invoke-direct {v8, v5, v6, v7, v9}, Lyyds/ᛳᛷᲀᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    sput-object v8, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛷᲀᛴ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 142
    .line 143
    move-object v5, v8

    .line 144
    goto :goto_4

    .line 145
    :catch_1
    sput-object v4, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛷᲀᛴ;

    .line 146
    .line 147
    move-object v5, v4

    .line 148
    :cond_5
    :goto_4
    if-ne v5, v4, :cond_6

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_6
    iget-object v4, v5, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v4, Ljava/lang/reflect/Method;

    .line 154
    .line 155
    if-eqz v4, :cond_a

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v4, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-nez v4, :cond_7

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_7
    iget-object v6, v5, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v6, Ljava/lang/reflect/Method;

    .line 171
    .line 172
    if-eqz v6, :cond_a

    .line 173
    .line 174
    invoke-virtual {v6, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    if-nez v4, :cond_8

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    iget-object v5, v5, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v5, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    if-eqz v5, :cond_9

    .line 186
    .line 187
    invoke-virtual {v5, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    goto :goto_5

    .line 192
    :cond_9
    move-object v4, v2

    .line 193
    :goto_5
    instance-of v5, v4, Ljava/lang/String;

    .line 194
    .line 195
    if-eqz v5, :cond_a

    .line 196
    .line 197
    move-object v2, v4

    .line 198
    check-cast v2, Ljava/lang/String;

    .line 199
    .line 200
    :cond_a
    :goto_6
    if-nez v2, :cond_b

    .line 201
    .line 202
    invoke-interface {v1}, Lyyds/ᲀᛶᛸᛳ;->c()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    goto :goto_7

    .line 207
    :cond_b
    new-instance v4, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/16 v2, 0x2f

    .line 213
    .line 214
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-interface {v1}, Lyyds/ᲀᛶᛸᛳ;->c()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    :goto_7
    new-instance v4, Ljava/lang/StackTraceElement;

    .line 229
    .line 230
    invoke-interface {v1}, Lyyds/ᲀᛶᛸᛳ;->m()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-interface {v1}, Lyyds/ᲀᛶᛸᛳ;->f()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-direct {v4, v2, v5, v1, v3}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    move-object v2, v4

    .line 242
    :goto_8
    if-nez v2, :cond_c

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :cond_c
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    return-object p0
.end method

.method public abstract ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final ᛱᲈᲁ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    :goto_0
    check-cast p0, Lyyds/ᛲᛴᛷᛳ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛲᛴᛷᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, p1}, Lyyds/ᛲᛴᛷᛳ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;
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
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᛳ;->ᛳᲁᲁᲇ()V

    .line 22
    .line 23
    .line 24
    instance-of p0, v0, Lyyds/ᛲᛴᛷᛳ;

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
    invoke-interface {v0, p1}, Lyyds/ᛲᛱᛶᛸ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
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

.method public ᛳᲁᲁᲇ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᛶᲁᛵᛷ;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛴᛷᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    instance-of v0, p0, Lyyds/ᛶᲁᛵᛷ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lyyds/ᛶᲁᛵᛷ;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method
