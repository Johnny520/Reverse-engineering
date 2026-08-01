.class public Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/NexusAccessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InitializationAppender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final identification:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 21

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const-class v2, Ljava/lang/ClassLoader;

    .line 6
    .line 7
    const-class v3, Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;

    .line 11
    .line 12
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 13
    .line 14
    new-instance v7, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 15
    .line 16
    const-string v8, "getSystemClassLoader"

    .line 17
    .line 18
    invoke-virtual {v2, v8, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    invoke-direct {v7, v8}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 30
    .line 31
    const-class v9, Lnet/bytebuddy/dynamic/Nexus;

    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-direct {v8, v9}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v9, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 41
    .line 42
    const-string v10, "loadClass"

    .line 43
    .line 44
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    invoke-virtual {v2, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-direct {v9, v2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 60
    .line 61
    const-string v10, "initialize"

    .line 62
    .line 63
    invoke-direct {v9, v10}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-static {v10}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-static {v11}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-static {v12}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-static {v13}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    const/4 v14, 0x2

    .line 93
    new-array v15, v14, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 94
    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    aput-object v11, v15, v16

    .line 98
    .line 99
    const/4 v11, 0x1

    .line 100
    aput-object v13, v15, v11

    .line 101
    .line 102
    invoke-static {v15}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    invoke-virtual {v10, v13}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    new-instance v13, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 111
    .line 112
    const-string v15, "getMethod"
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 113
    .line 114
    move-object/from16 v17, v4

    .line 115
    .line 116
    :try_start_1
    const-class v4, [Ljava/lang/Class;

    .line 117
    .line 118
    filled-new-array {v1, v4}, [Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v3, v15, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {v13, v1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v13}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-static {v4}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    new-instance v13, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 154
    .line 155
    move-object/from16 v15, p0

    .line 156
    .line 157
    iget v15, v15, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    .line 158
    .line 159
    invoke-static {v15}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    move/from16 v18, v11

    .line 164
    .line 165
    new-instance v11, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 166
    .line 167
    const-class v14, Ljava/lang/Integer;

    .line 168
    .line 169
    move-object/from16 v20, v1

    .line 170
    .line 171
    const-string v1, "valueOf"

    .line 172
    .line 173
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-virtual {v14, v1, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-direct {v11, v1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v11}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    const/4 v11, 0x2

    .line 189
    new-array v12, v11, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 190
    .line 191
    aput-object v15, v12, v16

    .line 192
    .line 193
    aput-object v1, v12, v18

    .line 194
    .line 195
    invoke-direct {v13, v12}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 196
    .line 197
    .line 198
    new-array v1, v11, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 199
    .line 200
    aput-object v4, v1, v16

    .line 201
    .line 202
    aput-object v13, v1, v18

    .line 203
    .line 204
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v3, v1}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    new-instance v3, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 213
    .line 214
    const-class v4, Ljava/lang/reflect/Method;

    .line 215
    .line 216
    const-string v11, "invoke"

    .line 217
    .line 218
    const-class v12, [Ljava/lang/Object;

    .line 219
    .line 220
    filled-new-array {v0, v12}, [Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v4, v11, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-direct {v3, v0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    const/16 v3, 0xa

    .line 236
    .line 237
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 238
    .line 239
    aput-object v7, v3, v16

    .line 240
    .line 241
    aput-object v8, v3, v18

    .line 242
    .line 243
    const/16 v19, 0x2

    .line 244
    .line 245
    aput-object v2, v3, v19

    .line 246
    .line 247
    const/4 v2, 0x3

    .line 248
    aput-object v9, v3, v2

    .line 249
    .line 250
    const/4 v2, 0x4

    .line 251
    aput-object v10, v3, v2

    .line 252
    .line 253
    const/4 v2, 0x5

    .line 254
    aput-object v20, v3, v2

    .line 255
    .line 256
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 257
    .line 258
    const/4 v4, 0x6

    .line 259
    aput-object v2, v3, v4

    .line 260
    .line 261
    const/4 v2, 0x7

    .line 262
    aput-object v1, v3, v2

    .line 263
    .line 264
    const/16 v1, 0x8

    .line 265
    .line 266
    aput-object v0, v3, v1

    .line 267
    .line 268
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 269
    .line 270
    const/16 v1, 0x9

    .line 271
    .line 272
    aput-object v0, v3, v1

    .line 273
    .line 274
    invoke-direct {v6, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 275
    .line 276
    .line 277
    move/from16 v0, v18

    .line 278
    .line 279
    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 280
    .line 281
    aput-object v6, v0, v16

    .line 282
    .line 283
    invoke-direct {v5, v0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v0, p1

    .line 287
    .line 288
    move-object/from16 v1, p2

    .line 289
    .line 290
    move-object/from16 v2, p3

    .line 291
    .line 292
    invoke-virtual {v5, v0, v1, v2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 293
    .line 294
    .line 295
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 296
    return-object v0

    .line 297
    :catch_0
    move-exception v0

    .line 298
    goto :goto_0

    .line 299
    :catch_1
    move-exception v0

    .line 300
    move-object/from16 v17, v4

    .line 301
    .line 302
    :goto_0
    const-string v1, "Cannot locate method"

    .line 303
    .line 304
    invoke-static {v1, v0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    return-object v17
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget p0, p0, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;

    .line 23
    .line 24
    iget p1, p1, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget p0, p0, Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;->identification:I

    .line 12
    .line 13
    add-int/2addr v0, p0

    .line 14
    return v0
.end method
