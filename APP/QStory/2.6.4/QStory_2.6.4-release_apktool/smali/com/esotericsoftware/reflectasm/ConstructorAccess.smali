.class public abstract Lcom/esotericsoftware/reflectasm/ConstructorAccess;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field isNonStaticMemberClass:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/ConstructorAccess;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/esotericsoftware/reflectasm/ConstructorAccess<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "Non-static member class cannot be created (missing enclosing class constructor): "

    .line 4
    .line 5
    const-string v0, "Non-static member class cannot be created (the enclosing class constructor is private): "

    .line 6
    .line 7
    const-string v3, "Class cannot be created (missing no-arg constructor): "

    .line 8
    .line 9
    const-string v4, "Class cannot be created (the no-arg constructor is private): "

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v6, 0x0

    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Class;->isMemberClass()Z

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-nez v7, :cond_0

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v7, v6

    .line 37
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    const-string v9, "ConstructorAccess"

    .line 42
    .line 43
    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    const-string v10, "java."

    .line 48
    .line 49
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-eqz v10, :cond_1

    .line 54
    .line 55
    const-string v10, "reflectasm."

    .line 56
    .line 57
    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    :cond_1
    invoke-static {v1}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    monitor-enter v10

    .line 66
    :try_start_0
    invoke-virtual {v10, v9}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->loadAccessClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    const/4 v12, 0x0

    .line 71
    if-nez v11, :cond_6

    .line 72
    .line 73
    const/16 v11, 0x2f

    .line 74
    .line 75
    const/16 v13, 0x2e

    .line 76
    .line 77
    invoke-virtual {v9, v13, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v17

    .line 81
    invoke-virtual {v8, v13, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    if-nez v7, :cond_3

    .line 86
    .line 87
    :try_start_1
    invoke-virtual {v1, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 92
    .line 93
    .line 94
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :try_start_2
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-nez v2, :cond_2

    .line 100
    .line 101
    move-object v3, v12

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :catch_0
    move-exception v0

    .line 121
    new-instance v2, Ljava/lang/RuntimeException;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v2

    .line 135
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3, v13, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    :try_start_3
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 152
    .line 153
    .line 154
    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 155
    :try_start_4
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-nez v4, :cond_5

    .line 160
    .line 161
    move v0, v2

    .line 162
    :goto_1
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    const-string v0, "com/esotericsoftware/reflectasm/PublicConstructorAccess"

    .line 169
    .line 170
    :goto_2
    move-object/from16 v19, v0

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_4
    const-string v0, "com/esotericsoftware/reflectasm/ConstructorAccess"

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :goto_3
    new-instance v14, Lcom/esotericsoftware/asm/ClassWriter;

    .line 177
    .line 178
    invoke-direct {v14, v6}, Lcom/esotericsoftware/asm/ClassWriter;-><init>(I)V

    .line 179
    .line 180
    .line 181
    const/16 v18, 0x0

    .line 182
    .line 183
    const/16 v20, 0x0

    .line 184
    .line 185
    const v15, 0x3002d

    .line 186
    .line 187
    .line 188
    const/16 v16, 0x21

    .line 189
    .line 190
    invoke-virtual/range {v14 .. v20}, Lcom/esotericsoftware/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    move-object/from16 v0, v19

    .line 194
    .line 195
    invoke-static {v14, v0}, Lcom/esotericsoftware/reflectasm/ConstructorAccess;->insertConstructor(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v14, v8}, Lcom/esotericsoftware/reflectasm/ConstructorAccess;->insertNewInstance(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v14, v8, v3}, Lcom/esotericsoftware/reflectasm/ConstructorAccess;->insertNewInstanceInner(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v14}, Lcom/esotericsoftware/asm/ClassWriter;->visitEnd()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v14}, Lcom/esotericsoftware/asm/ClassWriter;->toByteArray()[B

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v10, v9, v0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineAccessClass(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    goto :goto_4

    .line 216
    :cond_5
    new-instance v2, Ljava/lang/RuntimeException;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v2

    .line 230
    :catch_1
    move-exception v0

    .line 231
    new-instance v3, Ljava/lang/RuntimeException;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-direct {v3, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    throw v3

    .line 245
    :cond_6
    :goto_4
    monitor-exit v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 246
    :try_start_5
    invoke-virtual {v11}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Lcom/esotericsoftware/reflectasm/ConstructorAccess;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 251
    .line 252
    instance-of v2, v0, Lcom/esotericsoftware/reflectasm/PublicConstructorAccess;

    .line 253
    .line 254
    if-nez v2, :cond_8

    .line 255
    .line 256
    invoke-static {v1, v11}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->areInSameRuntimeClassLoader(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-nez v2, :cond_8

    .line 261
    .line 262
    new-instance v0, Ljava/lang/RuntimeException;

    .line 263
    .line 264
    if-nez v7, :cond_7

    .line 265
    .line 266
    const-string v2, "Class cannot be created (the no-arg constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): "

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_7
    const-string v2, "Non-static member class cannot be created (the enclosing class constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): "

    .line 270
    .line 271
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v0

    .line 283
    :cond_8
    iput-boolean v7, v0, Lcom/esotericsoftware/reflectasm/ConstructorAccess;->isNonStaticMemberClass:Z

    .line 284
    .line 285
    return-object v0

    .line 286
    :catchall_1
    move-exception v0

    .line 287
    const-string v1, "Exception constructing constructor access class: "

    .line 288
    .line 289
    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    return-object v12

    .line 297
    :goto_6
    :try_start_6
    monitor-exit v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 298
    throw v0
.end method

.method private static insertConstructor(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "<init>"

    .line 5
    .line 6
    const-string v3, "()V"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x19

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 20
    .line 21
    .line 22
    const-string v0, "<init>"

    .line 23
    .line 24
    const-string v1, "()V"

    .line 25
    .line 26
    const/16 v2, 0xb7

    .line 27
    .line 28
    invoke-virtual {p0, v2, p1, v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/16 p1, 0xb1

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    invoke-virtual {p0, p1, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static insertNewInstance(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "newInstance"

    .line 5
    .line 6
    const-string v3, "()Ljava/lang/Object;"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0xbb

    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x59

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 24
    .line 25
    .line 26
    const-string v0, "<init>"

    .line 27
    .line 28
    const-string v1, "()V"

    .line 29
    .line 30
    const/16 v2, 0xb7

    .line 31
    .line 32
    invoke-virtual {p0, v2, p1, v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/16 p1, 0xb0

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x2

    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static insertNewInstanceInner(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "newInstance"

    .line 5
    .line 6
    const-string v3, "(Ljava/lang/Object;)Ljava/lang/Object;"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    const-string v1, "<init>"

    .line 18
    .line 19
    const/16 v2, 0xb7

    .line 20
    .line 21
    const/16 v3, 0xbb

    .line 22
    .line 23
    const/16 v4, 0x59

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v3, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 31
    .line 32
    .line 33
    const/16 v3, 0x19

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-virtual {p0, v3, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 37
    .line 38
    .line 39
    const/16 v3, 0xc0

    .line 40
    .line 41
    invoke-virtual {p0, v3, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 45
    .line 46
    .line 47
    const-string v3, "getClass"

    .line 48
    .line 49
    const-string v4, "()Ljava/lang/Class;"

    .line 50
    .line 51
    const/16 v5, 0xb6

    .line 52
    .line 53
    const-string v6, "java/lang/Object"

    .line 54
    .line 55
    invoke-virtual {p0, v5, v6, v3, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/16 v3, 0x57

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v4, "(L"

    .line 66
    .line 67
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p2, ";)V"

    .line 74
    .line 75
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p0, v2, p1, v1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/16 p1, 0xb0

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x4

    .line 91
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const-string p1, "java/lang/UnsupportedOperationException"

    .line 96
    .line 97
    invoke-virtual {p0, v3, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 101
    .line 102
    .line 103
    const-string p2, "Not an inner class."

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    const-string p2, "(Ljava/lang/String;)V"

    .line 109
    .line 110
    invoke-virtual {p0, v2, p1, v1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const/16 p1, 0xbf

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 116
    .line 117
    .line 118
    const/4 p1, 0x3

    .line 119
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 120
    .line 121
    .line 122
    :goto_0
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 123
    .line 124
    .line 125
    return-void
.end method


# virtual methods
.method public isNonStaticMemberClass()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/reflectasm/ConstructorAccess;->isNonStaticMemberClass:Z

    .line 2
    .line 3
    return p0
.end method

.method public abstract newInstance()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract newInstance(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation
.end method
