.class public abstract Lcom/esotericsoftware/reflectasm/FieldAccess;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private fieldNames:[Ljava/lang/String;

.field private fieldTypes:[Ljava/lang/Class;

.field private fields:[Ljava/lang/reflect/Field;


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

.method public static get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/FieldAccess;
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p0

    .line 14
    .line 15
    :goto_0
    const-class v3, Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v2, v3, :cond_3

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    array-length v5, v3

    .line 25
    :goto_1
    if-ge v4, v5, :cond_2

    .line 26
    .line 27
    aget-object v6, v3, v4

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-eqz v8, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    new-array v3, v2, [Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    new-array v5, v5, [Ljava/lang/Class;

    .line 69
    .line 70
    move v6, v4

    .line 71
    :goto_3
    if-ge v6, v2, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, Ljava/lang/reflect/Field;

    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    aput-object v7, v3, v6

    .line 84
    .line 85
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, Ljava/lang/reflect/Field;

    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    aput-object v7, v5, v6

    .line 96
    .line 97
    add-int/lit8 v6, v6, 0x1

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v6, "FieldAccess"

    .line 105
    .line 106
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-string v7, "java."

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_5

    .line 117
    .line 118
    const-string v7, "reflectasm."

    .line 119
    .line 120
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    :cond_5
    invoke-static/range {p0 .. p0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    monitor-enter v7

    .line 129
    :try_start_0
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->loadAccessClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    if-nez v8, :cond_6

    .line 134
    .line 135
    const/16 v8, 0x2f

    .line 136
    .line 137
    const/16 v9, 0x2e

    .line 138
    .line 139
    invoke-virtual {v6, v9, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    invoke-virtual {v2, v9, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    new-instance v10, Lcom/esotericsoftware/asm/ClassWriter;

    .line 148
    .line 149
    invoke-direct {v10, v4}, Lcom/esotericsoftware/asm/ClassWriter;-><init>(I)V

    .line 150
    .line 151
    .line 152
    const-string v15, "com/esotericsoftware/reflectasm/FieldAccess"

    .line 153
    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    const v11, 0x3002d

    .line 157
    .line 158
    .line 159
    const/16 v12, 0x21

    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    invoke-virtual/range {v10 .. v16}, Lcom/esotericsoftware/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v10}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertConstructor(Lcom/esotericsoftware/asm/ClassWriter;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v10, v2, v0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetObject(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v10, v2, v0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetObject(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 172
    .line 173
    .line 174
    sget-object v4, Lcom/esotericsoftware/asm/Type;->BOOLEAN_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 175
    .line 176
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 180
    .line 181
    .line 182
    sget-object v4, Lcom/esotericsoftware/asm/Type;->BYTE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 183
    .line 184
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 188
    .line 189
    .line 190
    sget-object v4, Lcom/esotericsoftware/asm/Type;->SHORT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 191
    .line 192
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 196
    .line 197
    .line 198
    sget-object v4, Lcom/esotericsoftware/asm/Type;->INT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 199
    .line 200
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 204
    .line 205
    .line 206
    sget-object v4, Lcom/esotericsoftware/asm/Type;->LONG_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 207
    .line 208
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 212
    .line 213
    .line 214
    sget-object v4, Lcom/esotericsoftware/asm/Type;->DOUBLE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 215
    .line 216
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 220
    .line 221
    .line 222
    sget-object v4, Lcom/esotericsoftware/asm/Type;->FLOAT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 223
    .line 224
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 228
    .line 229
    .line 230
    sget-object v4, Lcom/esotericsoftware/asm/Type;->CHAR_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 231
    .line 232
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v10, v2, v0, v4}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v10, v2, v0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertGetString(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v10}, Lcom/esotericsoftware/asm/ClassWriter;->visitEnd()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v10}, Lcom/esotericsoftware/asm/ClassWriter;->toByteArray()[B

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v7, v6, v2}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineAccessClass(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    goto :goto_4

    .line 253
    :catchall_0
    move-exception v0

    .line 254
    goto :goto_5

    .line 255
    :cond_6
    :goto_4
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    check-cast v2, Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 261
    .line 262
    iput-object v3, v2, Lcom/esotericsoftware/reflectasm/FieldAccess;->fieldNames:[Ljava/lang/String;

    .line 263
    .line 264
    iput-object v5, v2, Lcom/esotericsoftware/reflectasm/FieldAccess;->fieldTypes:[Ljava/lang/Class;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    new-array v3, v3, [Ljava/lang/reflect/Field;

    .line 271
    .line 272
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, [Ljava/lang/reflect/Field;

    .line 277
    .line 278
    iput-object v0, v2, Lcom/esotericsoftware/reflectasm/FieldAccess;->fields:[Ljava/lang/reflect/Field;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 279
    .line 280
    return-object v2

    .line 281
    :catchall_1
    move-exception v0

    .line 282
    const-string v2, "Error constructing field access class: "

    .line 283
    .line 284
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-static {v2, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    return-object v1

    .line 292
    :goto_5
    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 293
    throw v0

    .line 294
    :cond_7
    const-string v0, "The type must not be the Object class, an interface, a primitive type, or void."

    .line 295
    .line 296
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return-object v1
.end method

.method private static insertConstructor(Lcom/esotericsoftware/asm/ClassWriter;)V
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
    const-string v3, "com/esotericsoftware/reflectasm/FieldAccess"

    .line 29
    .line 30
    invoke-virtual {p0, v2, v3, v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/16 v0, 0xb1

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-virtual {p0, v0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private static insertGetObject(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/asm/ClassWriter;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Field;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "get"

    .line 5
    .line 6
    const-string v3, "(Ljava/lang/Object;I)Ljava/lang/Object;"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-virtual {v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 14
    .line 15
    .line 16
    const/16 p0, 0x15

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-virtual {v6, p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    new-array v0, p0, [Lcom/esotericsoftware/asm/Label;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    move v2, v1

    .line 36
    :goto_0
    if-ge v2, p0, :cond_0

    .line 37
    .line 38
    new-instance v3, Lcom/esotericsoftware/asm/Label;

    .line 39
    .line 40
    invoke-direct {v3}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 41
    .line 42
    .line 43
    aput-object v3, v0, v2

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v2, Lcom/esotericsoftware/asm/Label;

    .line 49
    .line 50
    invoke-direct {v2}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, p0, -0x1

    .line 54
    .line 55
    invoke-virtual {v6, v1, v3, v2, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    if-ge v1, p0, :cond_1

    .line 59
    .line 60
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/reflect/Field;

    .line 65
    .line 66
    aget-object v4, v0, v1

    .line 67
    .line 68
    invoke-virtual {v6, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 69
    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v7, 0x3

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    invoke-virtual/range {v6 .. v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const/16 v4, 0x19

    .line 80
    .line 81
    const/4 v5, 0x1

    .line 82
    invoke-virtual {v6, v4, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 83
    .line 84
    .line 85
    const/16 v4, 0xc0

    .line 86
    .line 87
    invoke-virtual {v6, v4, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const/16 v5, 0x2e

    .line 99
    .line 100
    const/16 v7, 0x2f

    .line 101
    .line 102
    invoke-virtual {v4, v5, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-static {v7}, Lcom/esotericsoftware/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const/16 v8, 0xb4

    .line 119
    .line 120
    invoke-virtual {v6, v8, v4, v5, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v3}, Lcom/esotericsoftware/asm/Type;->getSort()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    const-string v4, "valueOf"

    .line 136
    .line 137
    const/16 v5, 0xb8

    .line 138
    .line 139
    packed-switch v3, :pswitch_data_0

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :pswitch_0
    const-string v3, "java/lang/Double"

    .line 144
    .line 145
    const-string v7, "(D)Ljava/lang/Double;"

    .line 146
    .line 147
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :pswitch_1
    const-string v3, "java/lang/Long"

    .line 152
    .line 153
    const-string v7, "(J)Ljava/lang/Long;"

    .line 154
    .line 155
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :pswitch_2
    const-string v3, "java/lang/Float"

    .line 160
    .line 161
    const-string v7, "(F)Ljava/lang/Float;"

    .line 162
    .line 163
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :pswitch_3
    const-string v3, "java/lang/Integer"

    .line 168
    .line 169
    const-string v7, "(I)Ljava/lang/Integer;"

    .line 170
    .line 171
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :pswitch_4
    const-string v3, "java/lang/Short"

    .line 176
    .line 177
    const-string v7, "(S)Ljava/lang/Short;"

    .line 178
    .line 179
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :pswitch_5
    const-string v3, "java/lang/Byte"

    .line 184
    .line 185
    const-string v7, "(B)Ljava/lang/Byte;"

    .line 186
    .line 187
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :pswitch_6
    const-string v3, "java/lang/Character"

    .line 192
    .line 193
    const-string v7, "(C)Ljava/lang/Character;"

    .line 194
    .line 195
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :pswitch_7
    const-string v3, "java/lang/Boolean"

    .line 200
    .line 201
    const-string v7, "(Z)Ljava/lang/Boolean;"

    .line 202
    .line 203
    invoke-virtual {v6, v5, v3, v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :goto_2
    const/16 v3, 0xb0

    .line 207
    .line 208
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 209
    .line 210
    .line 211
    add-int/lit8 v1, v1, 0x1

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :cond_1
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 216
    .line 217
    .line 218
    const/4 v10, 0x0

    .line 219
    const/4 v11, 0x0

    .line 220
    const/4 v7, 0x3

    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v9, 0x0

    .line 223
    invoke-virtual/range {v6 .. v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    const/4 p0, 0x5

    .line 227
    goto :goto_3

    .line 228
    :cond_2
    const/4 p0, 0x6

    .line 229
    :goto_3
    invoke-static {v6}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldNotFound(Lcom/esotericsoftware/asm/MethodVisitor;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 230
    .line 231
    .line 232
    const/4 p1, 0x3

    .line 233
    invoke-virtual {v6, p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static insertGetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/asm/ClassWriter;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Field;",
            ">;",
            "Lcom/esotericsoftware/asm/Type;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual/range {p3 .. p3}, Lcom/esotericsoftware/asm/Type;->getSort()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0xac

    .line 12
    .line 13
    packed-switch v2, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-string v2, "get"

    .line 17
    .line 18
    const/16 v3, 0xb0

    .line 19
    .line 20
    :goto_0
    move-object v6, v2

    .line 21
    goto :goto_1

    .line 22
    :pswitch_0
    const-string v2, "getDouble"

    .line 23
    .line 24
    const/16 v3, 0xaf

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_1
    const-string v2, "getLong"

    .line 28
    .line 29
    const/16 v3, 0xad

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_2
    const-string v2, "getFloat"

    .line 33
    .line 34
    const/16 v3, 0xae

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_3
    const-string v2, "getInt"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_4
    const-string v2, "getShort"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_5
    const-string v2, "getByte"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_6
    const-string v2, "getChar"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_7
    const-string v2, "getBoolean"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    const-string v2, "(Ljava/lang/Object;I)"

    .line 53
    .line 54
    invoke-static {v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v5, 0x1

    .line 61
    move-object/from16 v4, p0

    .line 62
    .line 63
    invoke-virtual/range {v4 .. v9}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-virtual {v10}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 68
    .line 69
    .line 70
    const/16 v2, 0x15

    .line 71
    .line 72
    const/4 v4, 0x2

    .line 73
    invoke-virtual {v10, v2, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    new-array v4, v2, [Lcom/esotericsoftware/asm/Label;

    .line 87
    .line 88
    new-instance v5, Lcom/esotericsoftware/asm/Label;

    .line 89
    .line 90
    invoke-direct {v5}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 91
    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    move v7, v6

    .line 95
    move v8, v7

    .line 96
    :goto_2
    const/4 v9, 0x1

    .line 97
    if-ge v7, v2, :cond_1

    .line 98
    .line 99
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    check-cast v11, Ljava/lang/reflect/Field;

    .line 104
    .line 105
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-static {v11}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    move-object/from16 v12, p3

    .line 114
    .line 115
    invoke-virtual {v11, v12}, Lcom/esotericsoftware/asm/Type;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    if-eqz v11, :cond_0

    .line 120
    .line 121
    new-instance v9, Lcom/esotericsoftware/asm/Label;

    .line 122
    .line 123
    invoke-direct {v9}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 124
    .line 125
    .line 126
    aput-object v9, v4, v7

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_0
    aput-object v5, v4, v7

    .line 130
    .line 131
    move v8, v9

    .line 132
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_1
    move-object/from16 v12, p3

    .line 136
    .line 137
    new-instance v7, Lcom/esotericsoftware/asm/Label;

    .line 138
    .line 139
    invoke-direct {v7}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 140
    .line 141
    .line 142
    add-int/lit8 v11, v2, -0x1

    .line 143
    .line 144
    invoke-virtual {v10, v6, v11, v7, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 145
    .line 146
    .line 147
    :goto_4
    if-ge v6, v2, :cond_3

    .line 148
    .line 149
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    move-object/from16 v16, v11

    .line 154
    .line 155
    check-cast v16, Ljava/lang/reflect/Field;

    .line 156
    .line 157
    aget-object v11, v4, v6

    .line 158
    .line 159
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-nez v11, :cond_2

    .line 164
    .line 165
    aget-object v11, v4, v6

    .line 166
    .line 167
    invoke-virtual {v10, v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 168
    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    const/4 v11, 0x3

    .line 173
    const/4 v12, 0x0

    .line 174
    const/4 v13, 0x0

    .line 175
    invoke-virtual/range {v10 .. v15}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    const/16 v11, 0x19

    .line 179
    .line 180
    invoke-virtual {v10, v11, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 181
    .line 182
    .line 183
    const/16 v11, 0xc0

    .line 184
    .line 185
    move-object/from16 v12, p1

    .line 186
    .line 187
    invoke-virtual {v10, v11, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    const/16 v13, 0x2e

    .line 199
    .line 200
    const/16 v14, 0x2f

    .line 201
    .line 202
    invoke-virtual {v11, v13, v14}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    const/16 v14, 0xb4

    .line 211
    .line 212
    invoke-virtual {v10, v14, v11, v13, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_2
    move-object/from16 v12, p1

    .line 220
    .line 221
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 222
    .line 223
    move-object/from16 v12, p3

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_3
    if-eqz v8, :cond_4

    .line 227
    .line 228
    invoke-virtual {v10, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 229
    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    const/4 v15, 0x0

    .line 233
    const/4 v11, 0x3

    .line 234
    const/4 v12, 0x0

    .line 235
    const/4 v13, 0x0

    .line 236
    invoke-virtual/range {v10 .. v15}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {p3 .. p3}, Lcom/esotericsoftware/asm/Type;->getClassName()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v10, v0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldType(Lcom/esotericsoftware/asm/MethodVisitor;Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 244
    .line 245
    .line 246
    :cond_4
    invoke-virtual {v10, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    const/4 v11, 0x3

    .line 252
    const/4 v12, 0x0

    .line 253
    const/4 v13, 0x0

    .line 254
    invoke-virtual/range {v10 .. v15}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    const/4 v0, 0x5

    .line 258
    goto :goto_6

    .line 259
    :cond_5
    const/4 v0, 0x6

    .line 260
    :goto_6
    invoke-static {v10}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldNotFound(Lcom/esotericsoftware/asm/MethodVisitor;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    const/4 v2, 0x3

    .line 265
    invoke-virtual {v1, v0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static insertGetString(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/asm/ClassWriter;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Field;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "getString"

    .line 5
    .line 6
    const-string v3, "(Ljava/lang/Object;I)Ljava/lang/String;"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-virtual {v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 14
    .line 15
    .line 16
    const/16 p0, 0x15

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-virtual {v6, p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_5

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    new-array v0, p0, [Lcom/esotericsoftware/asm/Label;

    .line 33
    .line 34
    new-instance v1, Lcom/esotericsoftware/asm/Label;

    .line 35
    .line 36
    invoke-direct {v1}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    move v3, v2

    .line 41
    move v4, v3

    .line 42
    :goto_0
    const/4 v5, 0x1

    .line 43
    if-ge v3, p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Ljava/lang/reflect/Field;

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    const-class v8, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_0

    .line 62
    .line 63
    new-instance v5, Lcom/esotericsoftware/asm/Label;

    .line 64
    .line 65
    invoke-direct {v5}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 66
    .line 67
    .line 68
    aput-object v5, v0, v3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    aput-object v1, v0, v3

    .line 72
    .line 73
    move v4, v5

    .line 74
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    new-instance v3, Lcom/esotericsoftware/asm/Label;

    .line 78
    .line 79
    invoke-direct {v3}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v7, p0, -0x1

    .line 83
    .line 84
    invoke-virtual {v6, v2, v7, v3, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    if-ge v2, p0, :cond_3

    .line 88
    .line 89
    aget-object v7, v0, v2

    .line 90
    .line 91
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_2

    .line 96
    .line 97
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    move-object v12, v7

    .line 102
    check-cast v12, Ljava/lang/reflect/Field;

    .line 103
    .line 104
    aget-object v7, v0, v2

    .line 105
    .line 106
    invoke-virtual {v6, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 107
    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v11, 0x0

    .line 111
    const/4 v7, 0x3

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    invoke-virtual/range {v6 .. v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    const/16 v7, 0x19

    .line 118
    .line 119
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 120
    .line 121
    .line 122
    const/16 v7, 0xc0

    .line 123
    .line 124
    invoke-virtual {v6, v7, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    const/16 v8, 0x2e

    .line 136
    .line 137
    const/16 v9, 0x2f

    .line 138
    .line 139
    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    const-string v9, "Ljava/lang/String;"

    .line 148
    .line 149
    const/16 v10, 0xb4

    .line 150
    .line 151
    invoke-virtual {v6, v10, v7, v8, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/16 v7, 0xb0

    .line 155
    .line 156
    invoke-virtual {v6, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 157
    .line 158
    .line 159
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_3
    if-eqz v4, :cond_4

    .line 163
    .line 164
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 165
    .line 166
    .line 167
    const/4 v10, 0x0

    .line 168
    const/4 v11, 0x0

    .line 169
    const/4 v7, 0x3

    .line 170
    const/4 v8, 0x0

    .line 171
    const/4 v9, 0x0

    .line 172
    invoke-virtual/range {v6 .. v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    const-string p0, "String"

    .line 176
    .line 177
    invoke-static {v6, p0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldType(Lcom/esotericsoftware/asm/MethodVisitor;Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 178
    .line 179
    .line 180
    :cond_4
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 181
    .line 182
    .line 183
    const/4 v10, 0x0

    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v7, 0x3

    .line 186
    const/4 v8, 0x0

    .line 187
    const/4 v9, 0x0

    .line 188
    invoke-virtual/range {v6 .. v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    const/4 p0, 0x5

    .line 192
    goto :goto_3

    .line 193
    :cond_5
    const/4 p0, 0x6

    .line 194
    :goto_3
    invoke-static {v6}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldNotFound(Lcom/esotericsoftware/asm/MethodVisitor;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 195
    .line 196
    .line 197
    const/4 p1, 0x3

    .line 198
    invoke-virtual {v6, p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method private static insertSetObject(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/asm/ClassWriter;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Field;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "set"

    .line 5
    .line 6
    const-string v3, "(Ljava/lang/Object;ILjava/lang/Object;)V"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-virtual {v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 14
    .line 15
    .line 16
    const/16 p0, 0x15

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-virtual {v6, p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    new-array v0, p0, [Lcom/esotericsoftware/asm/Label;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    move v2, v1

    .line 36
    :goto_0
    if-ge v2, p0, :cond_0

    .line 37
    .line 38
    new-instance v3, Lcom/esotericsoftware/asm/Label;

    .line 39
    .line 40
    invoke-direct {v3}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 41
    .line 42
    .line 43
    aput-object v3, v0, v2

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v2, Lcom/esotericsoftware/asm/Label;

    .line 49
    .line 50
    invoke-direct {v2}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, p0, -0x1

    .line 54
    .line 55
    invoke-virtual {v6, v1, v3, v2, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    if-ge v1, p0, :cond_1

    .line 59
    .line 60
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/reflect/Field;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v4}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    aget-object v5, v0, v1

    .line 75
    .line 76
    invoke-virtual {v6, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 77
    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v7, 0x3

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-virtual/range {v6 .. v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/16 v5, 0x19

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    invoke-virtual {v6, v5, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 91
    .line 92
    .line 93
    const/16 v7, 0xc0

    .line 94
    .line 95
    invoke-virtual {v6, v7, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 v8, 0x3

    .line 99
    invoke-virtual {v6, v5, v8}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Lcom/esotericsoftware/asm/Type;->getSort()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/16 v8, 0xb6

    .line 107
    .line 108
    packed-switch v5, :pswitch_data_0

    .line 109
    .line 110
    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :pswitch_0
    invoke-virtual {v4}, Lcom/esotericsoftware/asm/Type;->getInternalName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :pswitch_1
    invoke-virtual {v4}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :pswitch_2
    const-string v5, "java/lang/Double"

    .line 131
    .line 132
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v7, "doubleValue"

    .line 136
    .line 137
    const-string v9, "()D"

    .line 138
    .line 139
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :pswitch_3
    const-string v5, "java/lang/Long"

    .line 144
    .line 145
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string v7, "longValue"

    .line 149
    .line 150
    const-string v9, "()J"

    .line 151
    .line 152
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :pswitch_4
    const-string v5, "java/lang/Float"

    .line 157
    .line 158
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const-string v7, "floatValue"

    .line 162
    .line 163
    const-string v9, "()F"

    .line 164
    .line 165
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :pswitch_5
    const-string v5, "java/lang/Integer"

    .line 170
    .line 171
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string v7, "intValue"

    .line 175
    .line 176
    const-string v9, "()I"

    .line 177
    .line 178
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :pswitch_6
    const-string v5, "java/lang/Short"

    .line 183
    .line 184
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string v7, "shortValue"

    .line 188
    .line 189
    const-string v9, "()S"

    .line 190
    .line 191
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :pswitch_7
    const-string v5, "java/lang/Byte"

    .line 196
    .line 197
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const-string v7, "byteValue"

    .line 201
    .line 202
    const-string v9, "()B"

    .line 203
    .line 204
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :pswitch_8
    const-string v5, "java/lang/Character"

    .line 209
    .line 210
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const-string v7, "charValue"

    .line 214
    .line 215
    const-string v9, "()C"

    .line 216
    .line 217
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :pswitch_9
    const-string v5, "java/lang/Boolean"

    .line 222
    .line 223
    invoke-virtual {v6, v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v7, "booleanValue"

    .line 227
    .line 228
    const-string v9, "()Z"

    .line 229
    .line 230
    invoke-virtual {v6, v8, v5, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :goto_2
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    const/16 v7, 0x2e

    .line 242
    .line 243
    const/16 v8, 0x2f

    .line 244
    .line 245
    invoke-virtual {v5, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v4}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    const/16 v7, 0xb5

    .line 258
    .line 259
    invoke-virtual {v6, v7, v5, v3, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const/16 v3, 0xb1

    .line 263
    .line 264
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 265
    .line 266
    .line 267
    add-int/lit8 v1, v1, 0x1

    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    :cond_1
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 272
    .line 273
    .line 274
    const/4 v10, 0x0

    .line 275
    const/4 v11, 0x0

    .line 276
    const/4 v7, 0x3

    .line 277
    const/4 v8, 0x0

    .line 278
    const/4 v9, 0x0

    .line 279
    invoke-virtual/range {v6 .. v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    const/4 p0, 0x5

    .line 283
    goto :goto_3

    .line 284
    :cond_2
    const/4 p0, 0x6

    .line 285
    :goto_3
    invoke-static {v6}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldNotFound(Lcom/esotericsoftware/asm/MethodVisitor;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    const/4 p2, 0x4

    .line 290
    invoke-virtual {p1, p0, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static insertSetPrimitive(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;Ljava/util/ArrayList;Lcom/esotericsoftware/asm/Type;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/asm/ClassWriter;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Field;",
            ">;",
            "Lcom/esotericsoftware/asm/Type;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual/range {p3 .. p3}, Lcom/esotericsoftware/asm/Type;->getSort()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0x19

    .line 12
    .line 13
    const/16 v5, 0x15

    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    const-string v2, "set"

    .line 20
    .line 21
    move-object v9, v2

    .line 22
    move v2, v3

    .line 23
    goto :goto_2

    .line 24
    :pswitch_0
    const-string v2, "setDouble"

    .line 25
    .line 26
    const/16 v6, 0x18

    .line 27
    .line 28
    :goto_0
    move-object v9, v2

    .line 29
    move v2, v6

    .line 30
    const/4 v6, 0x5

    .line 31
    goto :goto_2

    .line 32
    :pswitch_1
    const-string v2, "setLong"

    .line 33
    .line 34
    const/16 v6, 0x16

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    const-string v2, "setFloat"

    .line 38
    .line 39
    const/16 v7, 0x17

    .line 40
    .line 41
    move-object v9, v2

    .line 42
    move v2, v7

    .line 43
    goto :goto_2

    .line 44
    :pswitch_3
    const-string v2, "setInt"

    .line 45
    .line 46
    :goto_1
    move-object v9, v2

    .line 47
    move v2, v5

    .line 48
    goto :goto_2

    .line 49
    :pswitch_4
    const-string v2, "setShort"

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :pswitch_5
    const-string v2, "setByte"

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_6
    const-string v2, "setChar"

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_7
    const-string v2, "setBoolean"

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :goto_2
    const-string v7, "(Ljava/lang/Object;I"

    .line 62
    .line 63
    const-string v8, ")V"

    .line 64
    .line 65
    invoke-static {v7, v1, v8}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    const/4 v8, 0x1

    .line 72
    move-object/from16 v7, p0

    .line 73
    .line 74
    invoke-virtual/range {v7 .. v12}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    invoke-virtual {v13}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 79
    .line 80
    .line 81
    const/4 v7, 0x2

    .line 82
    invoke-virtual {v13, v5, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    new-array v7, v5, [Lcom/esotericsoftware/asm/Label;

    .line 96
    .line 97
    new-instance v8, Lcom/esotericsoftware/asm/Label;

    .line 98
    .line 99
    invoke-direct {v8}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 100
    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    move v10, v9

    .line 104
    move v11, v10

    .line 105
    :goto_3
    const/4 v12, 0x1

    .line 106
    if-ge v10, v5, :cond_1

    .line 107
    .line 108
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    check-cast v14, Ljava/lang/reflect/Field;

    .line 113
    .line 114
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    invoke-static {v14}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    move-object/from16 v15, p3

    .line 123
    .line 124
    invoke-virtual {v14, v15}, Lcom/esotericsoftware/asm/Type;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    if-eqz v14, :cond_0

    .line 129
    .line 130
    new-instance v12, Lcom/esotericsoftware/asm/Label;

    .line 131
    .line 132
    invoke-direct {v12}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 133
    .line 134
    .line 135
    aput-object v12, v7, v10

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_0
    aput-object v8, v7, v10

    .line 139
    .line 140
    move v11, v12

    .line 141
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_1
    move-object/from16 v15, p3

    .line 145
    .line 146
    new-instance v10, Lcom/esotericsoftware/asm/Label;

    .line 147
    .line 148
    invoke-direct {v10}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 149
    .line 150
    .line 151
    add-int/lit8 v14, v5, -0x1

    .line 152
    .line 153
    invoke-virtual {v13, v9, v14, v10, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 154
    .line 155
    .line 156
    :goto_5
    if-ge v9, v5, :cond_3

    .line 157
    .line 158
    aget-object v14, v7, v9

    .line 159
    .line 160
    invoke-virtual {v14, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-nez v14, :cond_2

    .line 165
    .line 166
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    move-object/from16 v19, v14

    .line 171
    .line 172
    check-cast v19, Ljava/lang/reflect/Field;

    .line 173
    .line 174
    aget-object v14, v7, v9

    .line 175
    .line 176
    invoke-virtual {v13, v14}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 177
    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/16 v18, 0x0

    .line 182
    .line 183
    const/4 v14, 0x3

    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    invoke-virtual/range {v13 .. v18}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v13, v3, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 191
    .line 192
    .line 193
    const/16 v14, 0xc0

    .line 194
    .line 195
    move-object/from16 v15, p1

    .line 196
    .line 197
    invoke-virtual {v13, v14, v15}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const/4 v14, 0x3

    .line 201
    invoke-virtual {v13, v2, v14}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    const/16 v3, 0x2e

    .line 213
    .line 214
    const/16 v4, 0x2f

    .line 215
    .line 216
    invoke-virtual {v14, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    const/16 v14, 0xb5

    .line 225
    .line 226
    invoke-virtual {v13, v14, v3, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const/16 v3, 0xb1

    .line 230
    .line 231
    invoke-virtual {v13, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 232
    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_2
    move-object/from16 v15, p1

    .line 236
    .line 237
    :goto_6
    add-int/lit8 v9, v9, 0x1

    .line 238
    .line 239
    move-object/from16 v15, p3

    .line 240
    .line 241
    const/16 v3, 0x19

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_3
    if-eqz v11, :cond_4

    .line 245
    .line 246
    invoke-virtual {v13, v8}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 247
    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    const/16 v18, 0x0

    .line 252
    .line 253
    const/4 v14, 0x3

    .line 254
    const/4 v15, 0x0

    .line 255
    const/16 v16, 0x0

    .line 256
    .line 257
    invoke-virtual/range {v13 .. v18}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {p3 .. p3}, Lcom/esotericsoftware/asm/Type;->getClassName()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v13, v0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldType(Lcom/esotericsoftware/asm/MethodVisitor;Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 265
    .line 266
    .line 267
    :cond_4
    invoke-virtual {v13, v10}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 268
    .line 269
    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const/16 v18, 0x0

    .line 273
    .line 274
    const/4 v14, 0x3

    .line 275
    const/4 v15, 0x0

    .line 276
    const/16 v16, 0x0

    .line 277
    .line 278
    invoke-virtual/range {v13 .. v18}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    const/4 v4, 0x5

    .line 282
    goto :goto_7

    .line 283
    :cond_5
    const/4 v4, 0x6

    .line 284
    :goto_7
    invoke-static {v13}, Lcom/esotericsoftware/reflectasm/FieldAccess;->insertThrowExceptionForFieldNotFound(Lcom/esotericsoftware/asm/MethodVisitor;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0, v4, v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static insertThrowExceptionForFieldNotFound(Lcom/esotericsoftware/asm/MethodVisitor;)Lcom/esotericsoftware/asm/MethodVisitor;
    .locals 8

    .line 1
    const/16 v0, 0xbb

    .line 2
    .line 3
    const-string v1, "java/lang/IllegalArgumentException"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x59

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 11
    .line 12
    .line 13
    const-string v3, "java/lang/StringBuilder"

    .line 14
    .line 15
    invoke-virtual {p0, v0, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Field not found: "

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/16 v0, 0xb7

    .line 27
    .line 28
    const-string v2, "<init>"

    .line 29
    .line 30
    const-string v4, "(Ljava/lang/String;)V"

    .line 31
    .line 32
    invoke-virtual {p0, v0, v3, v2, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/16 v5, 0x15

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    invoke-virtual {p0, v5, v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 39
    .line 40
    .line 41
    const-string v5, "append"

    .line 42
    .line 43
    const-string v6, "(I)Ljava/lang/StringBuilder;"

    .line 44
    .line 45
    const/16 v7, 0xb6

    .line 46
    .line 47
    invoke-virtual {p0, v7, v3, v5, v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v5, "toString"

    .line 51
    .line 52
    const-string v6, "()Ljava/lang/String;"

    .line 53
    .line 54
    invoke-virtual {p0, v7, v3, v5, v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0, v1, v2, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0xbf

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method

.method private static insertThrowExceptionForFieldType(Lcom/esotericsoftware/asm/MethodVisitor;Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;
    .locals 7

    .line 1
    const/16 v0, 0xbb

    .line 2
    .line 3
    const-string v1, "java/lang/IllegalArgumentException"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x59

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 11
    .line 12
    .line 13
    const-string v3, "java/lang/StringBuilder"

    .line 14
    .line 15
    invoke-virtual {p0, v0, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "Field not declared as "

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, ": "

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/16 p1, 0xb7

    .line 44
    .line 45
    const-string v0, "<init>"

    .line 46
    .line 47
    const-string v2, "(Ljava/lang/String;)V"

    .line 48
    .line 49
    invoke-virtual {p0, p1, v3, v0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/16 v4, 0x15

    .line 53
    .line 54
    const/4 v5, 0x2

    .line 55
    invoke-virtual {p0, v4, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 56
    .line 57
    .line 58
    const-string v4, "append"

    .line 59
    .line 60
    const-string v5, "(I)Ljava/lang/StringBuilder;"

    .line 61
    .line 62
    const/16 v6, 0xb6

    .line 63
    .line 64
    invoke-virtual {p0, v6, v3, v4, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v4, "toString"

    .line 68
    .line 69
    const-string v5, "()Ljava/lang/String;"

    .line 70
    .line 71
    invoke-virtual {p0, v6, v3, v4, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, v1, v0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/16 p1, 0xbf

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method


# virtual methods
.method public abstract get(Ljava/lang/Object;I)Ljava/lang/Object;
.end method

.method public get(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 300
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/reflectasm/FieldAccess;->getIndex(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/reflectasm/FieldAccess;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public abstract getBoolean(Ljava/lang/Object;I)Z
.end method

.method public abstract getByte(Ljava/lang/Object;I)B
.end method

.method public abstract getChar(Ljava/lang/Object;I)C
.end method

.method public abstract getDouble(Ljava/lang/Object;I)D
.end method

.method public getFieldCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fieldTypes:[Ljava/lang/Class;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public getFieldNames()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fieldNames:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFieldTypes()[Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fieldTypes:[Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFields()[Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fields:[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract getFloat(Ljava/lang/Object;I)F
.end method

.method public getIndex(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fieldNames:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fieldNames:[Ljava/lang/String;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p0, "Unable to find non-private field: "

    .line 22
    .line 23
    invoke-static {p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public getIndex(Ljava/lang/reflect/Field;)I
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fields:[Ljava/lang/reflect/Field;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 33
    iget-object v2, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fields:[Ljava/lang/reflect/Field;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 34
    :cond_1
    const-string p0, "Unable to find non-private field: "

    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public abstract getInt(Ljava/lang/Object;I)I
.end method

.method public abstract getLong(Ljava/lang/Object;I)J
.end method

.method public abstract getShort(Ljava/lang/Object;I)S
.end method

.method public abstract getString(Ljava/lang/Object;I)Ljava/lang/String;
.end method

.method public abstract set(Ljava/lang/Object;ILjava/lang/Object;)V
.end method

.method public set(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/reflectasm/FieldAccess;->getIndex(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/reflectasm/FieldAccess;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract setBoolean(Ljava/lang/Object;IZ)V
.end method

.method public abstract setByte(Ljava/lang/Object;IB)V
.end method

.method public abstract setChar(Ljava/lang/Object;IC)V
.end method

.method public abstract setDouble(Ljava/lang/Object;ID)V
.end method

.method public setFields([Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/reflectasm/FieldAccess;->fields:[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    return-void
.end method

.method public abstract setFloat(Ljava/lang/Object;IF)V
.end method

.method public abstract setInt(Ljava/lang/Object;II)V
.end method

.method public abstract setLong(Ljava/lang/Object;IJ)V
.end method

.method public abstract setShort(Ljava/lang/Object;IS)V
.end method
