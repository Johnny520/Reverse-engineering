.class public Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SerializationImplementation"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

.field private final lambdaMethodName:Ljava/lang/String;

.field private final lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

.field private final targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

.field private final targetType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/utility/JavaConstant$MethodType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :try_start_0
    const-string v1, "java.lang.invoke.SerializedLambda"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const/4 v5, 0x2

    .line 47
    const/4 v6, 0x3

    .line 48
    const/4 v7, 0x1

    .line 49
    const/4 v8, 0x0

    .line 50
    const-class v9, Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 59
    .line 60
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 61
    .line 62
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-static {v4}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    invoke-interface {v12}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    sget-object v13, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 75
    .line 76
    invoke-interface {v4}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    sget-object v14, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 85
    .line 86
    invoke-interface {v13, v4, v9, v14}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 91
    .line 92
    aput-object v11, v6, v8

    .line 93
    .line 94
    aput-object v12, v6, v7

    .line 95
    .line 96
    aput-object v4, v6, v5

    .line 97
    .line 98
    invoke-direct {v10, v6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;

    .line 106
    .line 107
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 108
    .line 109
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 114
    .line 115
    invoke-static {v11}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    new-instance v12, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 120
    .line 121
    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 122
    .line 123
    invoke-interface {v13}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-direct {v12, v13}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v13, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 131
    .line 132
    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    .line 133
    .line 134
    invoke-direct {v13, v14}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v14, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 138
    .line 139
    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 140
    .line 141
    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getDescriptor()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    invoke-direct {v14, v15}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 149
    .line 150
    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getHandleType()Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->getIdentifier()I

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    invoke-static {v15}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    move/from16 p1, v5

    .line 163
    .line 164
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 165
    .line 166
    move/from16 v16, v6

    .line 167
    .line 168
    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 169
    .line 170
    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getOwnerType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-interface {v6}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-direct {v5, v6}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 182
    .line 183
    move/from16 v17, v8

    .line 184
    .line 185
    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 186
    .line 187
    invoke-virtual {v8}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-direct {v6, v8}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 195
    .line 196
    move/from16 v18, v7

    .line 197
    .line 198
    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 199
    .line 200
    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getDescriptor()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-direct {v8, v7}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 208
    .line 209
    iget-object v0, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 210
    .line 211
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getDescriptor()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-direct {v7, v0}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0, v2}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 243
    .line 244
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 249
    .line 250
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    const/16 v2, 0xe

    .line 255
    .line 256
    new-array v2, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 257
    .line 258
    aput-object v10, v2, v17

    .line 259
    .line 260
    sget-object v9, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 261
    .line 262
    aput-object v9, v2, v18

    .line 263
    .line 264
    aput-object v11, v2, p1

    .line 265
    .line 266
    aput-object v12, v2, v16

    .line 267
    .line 268
    const/4 v9, 0x4

    .line 269
    aput-object v13, v2, v9

    .line 270
    .line 271
    const/4 v9, 0x5

    .line 272
    aput-object v14, v2, v9

    .line 273
    .line 274
    const/4 v9, 0x6

    .line 275
    aput-object v15, v2, v9

    .line 276
    .line 277
    const/4 v9, 0x7

    .line 278
    aput-object v5, v2, v9

    .line 279
    .line 280
    const/16 v5, 0x8

    .line 281
    .line 282
    aput-object v6, v2, v5

    .line 283
    .line 284
    const/16 v5, 0x9

    .line 285
    .line 286
    aput-object v8, v2, v5

    .line 287
    .line 288
    const/16 v5, 0xa

    .line 289
    .line 290
    aput-object v7, v2, v5

    .line 291
    .line 292
    const/16 v5, 0xb

    .line 293
    .line 294
    aput-object v0, v2, v5

    .line 295
    .line 296
    const/16 v0, 0xc

    .line 297
    .line 298
    aput-object v1, v2, v0

    .line 299
    .line 300
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 301
    .line 302
    const/16 v1, 0xd

    .line 303
    .line 304
    aput-object v0, v2, v1

    .line 305
    .line 306
    invoke-direct {v4, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 307
    .line 308
    .line 309
    move/from16 v0, v18

    .line 310
    .line 311
    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 312
    .line 313
    aput-object v4, v0, v17

    .line 314
    .line 315
    invoke-direct {v3, v0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 316
    .line 317
    .line 318
    return-object v3

    .line 319
    :catch_0
    move-exception v0

    .line 320
    const-string v1, "Cannot find class for lambda serialization"

    .line 321
    .line 322
    invoke-static {v1, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    const/4 v0, 0x0

    .line 326
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 78
    .line 79
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethodName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->lambdaMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 31
    .line 32
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    mul-int/2addr v2, v1

    .line 38
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->targetMethod:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 39
    .line 40
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaInstanceFactory$SerializationImplementation;->specializedMethod:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 47
    .line 48
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method
