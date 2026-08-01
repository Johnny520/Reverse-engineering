.class public Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;
.super Ljava/lang/ClassLoader;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DynamicClassLoader"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;
    }
.end annotation


# static fields
.field private static final DUMP_FOLDER:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private static final NO_ARGUMENT:[Ljava/lang/Object;

.field private static final NO_PARAMETER:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    sput-object v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_PARAMETER:[Ljava/lang/Class;

    .line 5
    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_ARGUMENT:[Ljava/lang/Object;

    .line 9
    .line 10
    :try_start_0
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 11
    .line 12
    const-string v1, "net.bytebuddy.dump"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->access$200(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->DUMP_FOLDER:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Ljava/lang/ClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->access$300()Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;->accept(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static invoker()Lnet/bytebuddy/utility/Invoker;
    .locals 21

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    invoke-direct {v0, v7}, Lnet/bytebuddy/jar/asm/ClassWriter;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm()Lnet/bytebuddy/ClassFileVersion;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMinorMajorVersion()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-class v8, Lnet/bytebuddy/utility/Invoker;

    .line 21
    .line 22
    invoke-static {v8}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v9, "$Dispatcher"

    .line 30
    .line 31
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-class v10, Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {v10}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v8}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    filled-new-array {v2}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    const/4 v2, 0x1

    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v8}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, Lnet/bytebuddy/utility/MethodComparator;->INSTANCE:Lnet/bytebuddy/utility/MethodComparator;

    .line 66
    .line 67
    invoke-virtual {v1, v2, v3}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v6, v1

    .line 72
    check-cast v6, [Ljava/lang/reflect/Method;

    .line 73
    .line 74
    array-length v11, v6

    .line 75
    move v12, v7

    .line 76
    :goto_0
    const/4 v13, 0x1

    .line 77
    if-ge v12, v11, :cond_3

    .line 78
    .line 79
    aget-object v14, v6, v12

    .line 80
    .line 81
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    array-length v2, v1

    .line 86
    new-array v5, v2, [Ljava/lang/String;

    .line 87
    .line 88
    move v2, v7

    .line 89
    :goto_1
    array-length v3, v1

    .line 90
    if-ge v2, v3, :cond_0

    .line 91
    .line 92
    aget-object v3, v1, v2

    .line 93
    .line 94
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    aput-object v3, v5, v2

    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v14}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    const/4 v4, 0x0

    .line 112
    const/4 v1, 0x1

    .line 113
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    invoke-virtual {v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    array-length v1, v1

    .line 125
    sub-int/2addr v1, v13

    .line 126
    new-array v1, v1, [Lnet/bytebuddy/jar/asm/Type;

    .line 127
    .line 128
    move v2, v7

    .line 129
    :goto_2
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    array-length v3, v3

    .line 134
    if-ge v2, v3, :cond_2

    .line 135
    .line 136
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    aget-object v3, v3, v2

    .line 141
    .line 142
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-lez v2, :cond_1

    .line 147
    .line 148
    add-int/lit8 v4, v2, -0x1

    .line 149
    .line 150
    aput-object v3, v1, v4

    .line 151
    .line 152
    :cond_1
    const/16 v4, 0x15

    .line 153
    .line 154
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-virtual {v15, v4, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    add-int/2addr v13, v3

    .line 166
    add-int/lit8 v2, v2, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_2
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    aget-object v2, v2, v7

    .line 174
    .line 175
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v17

    .line 179
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v18

    .line 183
    invoke-static {v14}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {v2, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v19

    .line 191
    const/16 v20, 0x0

    .line 192
    .line 193
    const/16 v16, 0xb6

    .line 194
    .line 195
    invoke-virtual/range {v15 .. v20}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 196
    .line 197
    .line 198
    invoke-static {v14}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    const/16 v2, 0xac

    .line 203
    .line 204
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    invoke-virtual {v15, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 209
    .line 210
    .line 211
    add-int/lit8 v1, v13, -0x1

    .line 212
    .line 213
    invoke-static {v14}, Lnet/bytebuddy/jar/asm/Type;->getReturnType(Ljava/lang/reflect/Method;)Lnet/bytebuddy/jar/asm/Type;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-virtual {v15, v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    .line 229
    .line 230
    .line 231
    add-int/lit8 v12, v12, 0x1

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_3
    sget-object v6, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 236
    .line 237
    new-array v1, v7, [Lnet/bytebuddy/jar/asm/Type;

    .line 238
    .line 239
    invoke-static {v6, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    const/4 v4, 0x0

    .line 244
    const/4 v5, 0x0

    .line 245
    const/4 v1, 0x1

    .line 246
    const-string v2, "<init>"

    .line 247
    .line 248
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    invoke-virtual {v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    .line 253
    .line 254
    .line 255
    const/16 v1, 0x19

    .line 256
    .line 257
    invoke-virtual {v14, v1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 258
    .line 259
    .line 260
    invoke-static {v10}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v16

    .line 264
    new-array v1, v7, [Lnet/bytebuddy/jar/asm/Type;

    .line 265
    .line 266
    invoke-static {v6, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v18

    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    const/16 v15, 0xb7

    .line 273
    .line 274
    const-string v17, "<init>"

    .line 275
    .line 276
    invoke-virtual/range {v14 .. v19}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 277
    .line 278
    .line 279
    const/16 v1, 0xb1

    .line 280
    .line 281
    invoke-virtual {v14, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v14, v13, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitEnd()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->toByteArray()[B

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    :try_start_0
    const-string v0, "net.bytebuddy.dump"

    .line 298
    .line 299
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    if-eqz v0, :cond_4

    .line 304
    .line 305
    new-instance v1, Ljava/io/FileOutputStream;

    .line 306
    .line 307
    new-instance v2, Ljava/io/File;

    .line 308
    .line 309
    new-instance v3, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const-string v5, "$Dispatcher.class"

    .line 322
    .line 323
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 334
    .line 335
    .line 336
    :try_start_1
    invoke-virtual {v1, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 337
    .line 338
    .line 339
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 340
    .line 341
    .line 342
    goto :goto_3

    .line 343
    :catchall_0
    move-exception v0

    .line 344
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 345
    .line 346
    .line 347
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 348
    :catchall_1
    :cond_4
    :goto_3
    const/4 v1, 0x0

    .line 349
    :try_start_3
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;

    .line 350
    .line 351
    invoke-direct {v2, v8}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;-><init>(Ljava/lang/Class;)V

    .line 352
    .line 353
    .line 354
    new-instance v0, Ljava/lang/StringBuilder;

    .line 355
    .line 356
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    array-length v6, v4

    .line 374
    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    const/4 v5, 0x0

    .line 381
    invoke-virtual/range {v2 .. v7}, Ljava/lang/ClassLoader;->defineClass(Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    sget-object v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_PARAMETER:[Ljava/lang/Class;

    .line 386
    .line 387
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    sget-object v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_ARGUMENT:[Ljava/lang/Object;

    .line 392
    .line 393
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, Lnet/bytebuddy/utility/Invoker;
    :try_end_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 398
    .line 399
    return-object v0

    .line 400
    :catch_0
    move-exception v0

    .line 401
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const-string v3, "Failed to create invoker for "

    .line 406
    .line 407
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-static {v2, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 412
    .line 413
    .line 414
    return-object v1

    .line 415
    :catch_1
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DirectInvoker;

    .line 416
    .line 417
    invoke-direct {v0, v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DirectInvoker;-><init>(Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$1;)V

    .line 418
    .line 419
    .line 420
    return-object v0
.end method

.method public static proxy(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    invoke-direct {v0, v7}, Lnet/bytebuddy/jar/asm/ClassWriter;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    .line 8
    .line 9
    invoke-virtual {v1}, Lnet/bytebuddy/ClassFileVersion;->getMinorMajorVersion()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static/range {p0 .. p0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v8, "$Proxy"

    .line 26
    .line 27
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-class v9, Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {v9}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static/range {p0 .. p0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    filled-new-array {v2}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const/4 v2, 0x1

    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v10, 0x1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v11, v1

    .line 73
    check-cast v11, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    array-length v2, v1

    .line 86
    new-array v5, v2, [Ljava/lang/String;

    .line 87
    .line 88
    move v2, v7

    .line 89
    :goto_1
    array-length v3, v1

    .line 90
    if-ge v2, v3, :cond_0

    .line 91
    .line 92
    aget-object v3, v1, v2

    .line 93
    .line 94
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    aput-object v3, v5, v2

    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v1, 0x1

    .line 125
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    .line 130
    .line 131
    .line 132
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ljava/lang/reflect/Method;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    and-int/lit8 v2, v2, 0x8

    .line 143
    .line 144
    if-nez v2, :cond_1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_1
    move v10, v7

    .line 148
    :goto_2
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Ljava/lang/reflect/Method;

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    array-length v3, v2

    .line 159
    move v4, v7

    .line 160
    :goto_3
    if-ge v4, v3, :cond_2

    .line 161
    .line 162
    aget-object v5, v2, v4

    .line 163
    .line 164
    invoke-static {v5}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-virtual {v5}, Lnet/bytebuddy/jar/asm/Type;->getSize()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    add-int/2addr v10, v5

    .line 173
    add-int/lit8 v4, v4, 0x1

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_2
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    .line 181
    .line 182
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    check-cast v3, Ljava/lang/reflect/Method;

    .line 187
    .line 188
    invoke-interface {v2, v1, v3}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/lang/reflect/Method;)I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    invoke-virtual {v1, v2, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_3
    sget-object v6, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 201
    .line 202
    new-array v1, v7, [Lnet/bytebuddy/jar/asm/Type;

    .line 203
    .line 204
    invoke-static {v6, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    const/4 v4, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    const/4 v1, 0x1

    .line 211
    const-string v2, "<init>"

    .line 212
    .line 213
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    invoke-virtual {v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    .line 218
    .line 219
    .line 220
    const/16 v1, 0x19

    .line 221
    .line 222
    invoke-virtual {v11, v1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 223
    .line 224
    .line 225
    invoke-static {v9}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    new-array v1, v7, [Lnet/bytebuddy/jar/asm/Type;

    .line 230
    .line 231
    invoke-static {v6, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    const/16 v12, 0xb7

    .line 238
    .line 239
    const-string v14, "<init>"

    .line 240
    .line 241
    invoke-virtual/range {v11 .. v16}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 242
    .line 243
    .line 244
    const/16 v1, 0xb1

    .line 245
    .line 246
    invoke-virtual {v11, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v11, v10, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->visitEnd()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassWriter;->toByteArray()[B

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    sget-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->DUMP_FOLDER:Ljava/lang/String;

    .line 263
    .line 264
    if-eqz v0, :cond_4

    .line 265
    .line 266
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    .line 267
    .line 268
    new-instance v2, Ljava/io/File;

    .line 269
    .line 270
    new-instance v3, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v5, "$Proxy.class"

    .line 283
    .line 284
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 295
    .line 296
    .line 297
    :try_start_1
    invoke-virtual {v1, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 298
    .line 299
    .line 300
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :catchall_0
    move-exception v0

    .line 305
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 306
    .line 307
    .line 308
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 309
    :catchall_1
    :cond_4
    :goto_4
    :try_start_3
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 310
    .line 311
    move-object/from16 v1, p0

    .line 312
    .line 313
    :try_start_4
    invoke-direct {v2, v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;-><init>(Ljava/lang/Class;)V

    .line 314
    .line 315
    .line 316
    new-instance v0, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    array-length v6, v4

    .line 336
    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    const/4 v5, 0x0

    .line 343
    invoke-virtual/range {v2 .. v7}, Ljava/lang/ClassLoader;->defineClass(Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    sget-object v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_PARAMETER:[Ljava/lang/Class;

    .line 348
    .line 349
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    sget-object v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->NO_ARGUMENT:[Ljava/lang/Object;

    .line 354
    .line 355
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 359
    return-object v0

    .line 360
    :catch_0
    move-exception v0

    .line 361
    goto :goto_5

    .line 362
    :catch_1
    move-exception v0

    .line 363
    move-object/from16 v1, p0

    .line 364
    .line 365
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    const-string v2, "Failed to create proxy for "

    .line 370
    .line 371
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-static {v1, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    const/4 v0, 0x0

    .line 379
    return-object v0
.end method
