.class public Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;
.super Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SubstitutingMethodVisitor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;
    }
.end annotation


# instance fields
.field private final failIfNoMatch:Z

.field private final implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private localVariableExtension:I

.field private matched:Z

.field private final methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

.field private final replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

.field private stackSizeBuffer:I

.field private final strict:Z

.field private final typePool:Lnet/bytebuddy/pool/TypePool;

.field private final virtualPrivateCalls:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;ZZLnet/bytebuddy/asm/MemberSubstitution$Replacement;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 7
    .line 8
    iput-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 9
    .line 10
    iput-boolean p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 11
    .line 12
    iput-boolean p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->failIfNoMatch:Z

    .line 13
    .line 14
    iput-object p7, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    .line 15
    .line 16
    iput-object p8, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 17
    .line 18
    iput-object p9, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 19
    .line 20
    iput-boolean p10, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->virtualPrivateCalls:Z

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 24
    .line 25
    iput p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic access$700(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$702(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;I)I
    .locals 0

    .line 1
    iput p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 8
    .line 9
    const/16 v4, 0x2f

    .line 10
    .line 11
    const/16 v5, 0x2e

    .line 12
    .line 13
    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-interface {v3, v6}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v3}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const-string v7, " using "

    .line 26
    .line 27
    const-string v8, "Could not resolve "

    .line 28
    .line 29
    if-eqz v6, :cond_a

    .line 30
    .line 31
    invoke-interface {v3}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    check-cast v9, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 44
    .line 45
    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDefinition;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    iget-boolean v10, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 50
    .line 51
    if-eqz v10, :cond_1

    .line 52
    .line 53
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-interface {v10, v11}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static/range {p3 .. p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    invoke-interface {v10, v11}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-static {v10}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    :goto_0
    invoke-interface {v9, v10}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    check-cast v9, Lnet/bytebuddy/description/field/FieldList;

    .line 87
    .line 88
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_2

    .line 93
    .line 94
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-nez v10, :cond_0

    .line 99
    .line 100
    :cond_2
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_7

    .line 105
    .line 106
    iget-object v10, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    .line 107
    .line 108
    iget-object v11, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 109
    .line 110
    iget-object v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 111
    .line 112
    invoke-interface {v3}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    move-object v14, v3

    .line 121
    check-cast v14, Lnet/bytebuddy/description/field/FieldDescription;

    .line 122
    .line 123
    const/16 v3, 0xb5

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    const/4 v5, 0x1

    .line 127
    if-eq v1, v3, :cond_4

    .line 128
    .line 129
    const/16 v3, 0xb3

    .line 130
    .line 131
    if-ne v1, v3, :cond_3

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    move v15, v4

    .line 135
    goto :goto_2

    .line 136
    :cond_4
    :goto_1
    move v15, v5

    .line 137
    :goto_2
    invoke-interface/range {v10 .. v15}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement;->bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription;Z)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    invoke-interface {v15}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->isBound()Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_8

    .line 146
    .line 147
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 148
    .line 149
    packed-switch v1, :pswitch_data_0

    .line 150
    .line 151
    .line 152
    const-string v0, "Unexpected opcode: "

    .line 153
    .line 154
    invoke-static {v1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_0
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 163
    .line 164
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription;

    .line 169
    .line 170
    invoke-interface {v3}, Lnet/bytebuddy/description/field/FieldDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    check-cast v6, Lnet/bytebuddy/description/field/FieldDescription;

    .line 179
    .line 180
    invoke-interface {v6}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    const/4 v7, 0x2

    .line 185
    new-array v7, v7, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 186
    .line 187
    aput-object v3, v7, v4

    .line 188
    .line 189
    aput-object v6, v7, v5

    .line 190
    .line 191
    invoke-direct {v1, v7}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    :goto_3
    move-object/from16 v16, v1

    .line 199
    .line 200
    move-object/from16 v17, v2

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :pswitch_1
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 204
    .line 205
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 210
    .line 211
    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    new-array v3, v5, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 216
    .line 217
    aput-object v2, v3, v4

    .line 218
    .line 219
    invoke-direct {v1, v3}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 227
    .line 228
    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    :goto_4
    move-object/from16 v16, v1

    .line 233
    .line 234
    move-object/from16 v17, v2

    .line 235
    .line 236
    move v4, v5

    .line 237
    goto :goto_5

    .line 238
    :pswitch_2
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 239
    .line 240
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription;

    .line 245
    .line 246
    invoke-interface {v3}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    new-array v6, v5, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 251
    .line 252
    aput-object v3, v6, v4

    .line 253
    .line 254
    invoke-direct {v1, v6}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    goto :goto_3

    .line 262
    :pswitch_3
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    .line 263
    .line 264
    invoke-direct {v1}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 272
    .line 273
    invoke-interface {v2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    goto :goto_4

    .line 278
    :goto_5
    iget v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 279
    .line 280
    if-eqz v4, :cond_5

    .line 281
    .line 282
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 287
    .line 288
    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 293
    .line 294
    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofGetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    :goto_6
    move-object/from16 v18, v2

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_5
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 306
    .line 307
    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 312
    .line 313
    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofSetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    goto :goto_6

    .line 318
    :goto_7
    if-eqz v4, :cond_6

    .line 319
    .line 320
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 325
    .line 326
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-interface {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    :goto_8
    move-object/from16 v19, v2

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_6
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 342
    .line 343
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-interface {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    goto :goto_8

    .line 352
    :goto_9
    invoke-virtual {v0}, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->getFreeOffset()I

    .line 353
    .line 354
    .line 355
    move-result v20

    .line 356
    invoke-interface/range {v15 .. v20}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->make(Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    new-instance v3, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;

    .line 361
    .line 362
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 363
    .line 364
    const/4 v6, 0x0

    .line 365
    invoke-direct {v3, v0, v4, v6}, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;-><init>(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/MemberSubstitution$1;)V

    .line 366
    .line 367
    .line 368
    iget-object v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 369
    .line 370
    invoke-interface {v2, v3, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 383
    .line 384
    iput-boolean v5, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->matched:Z

    .line 385
    .line 386
    return-void

    .line 387
    :cond_7
    iget-boolean v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 388
    .line 389
    if-nez v3, :cond_9

    .line 390
    .line 391
    :cond_8
    move-object/from16 v6, p3

    .line 392
    .line 393
    move-object/from16 v9, p4

    .line 394
    .line 395
    goto :goto_a

    .line 396
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 397
    .line 398
    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    iget-object v0, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 403
    .line 404
    new-instance v3, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    const-string v2, "."

    .line 413
    .line 414
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    move-object/from16 v6, p3

    .line 418
    .line 419
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    move-object/from16 v9, p4

    .line 423
    .line 424
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v1

    .line 441
    :cond_a
    move-object/from16 v6, p3

    .line 442
    .line 443
    move-object/from16 v9, p4

    .line 444
    .line 445
    iget-boolean v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 446
    .line 447
    if-nez v3, :cond_b

    .line 448
    .line 449
    :goto_a
    invoke-super/range {p0 .. p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :cond_b
    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    iget-object v0, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 458
    .line 459
    invoke-static {v8, v1, v7, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return-void

    .line 463
    :pswitch_data_0
    .packed-switch 0xb2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    new-instance v9, Ljava/util/ArrayList;

    .line 6
    .line 7
    array-length v0, v2

    .line 8
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    :try_start_0
    iget-object v0, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;
    :try_end_0
    .catch Lnet/bytebuddy/pool/TypePool$Resolution$NoSuchTypeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    .line 14
    move-object/from16 v11, p3

    .line 15
    .line 16
    :try_start_1
    invoke-static {v0, v11}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofAsm(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/Handle;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v3, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 21
    .line 22
    invoke-static/range {p2 .. p2}, Lnet/bytebuddy/jar/asm/Type;->getMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v3, v4}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofAsm(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/Type;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    array-length v4, v2

    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_0
    if-ge v5, v4, :cond_0

    .line 33
    .line 34
    aget-object v6, v2, v5

    .line 35
    .line 36
    iget-object v7, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 37
    .line 38
    invoke-static {v7, v6}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofAsm(Lnet/bytebuddy/pool/TypePool;Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lnet/bytebuddy/pool/TypePool$Resolution$NoSuchTypeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 43
    .line 44
    .line 45
    add-int/lit8 v5, v5, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move-object v14, v0

    .line 51
    move-object v7, v3

    .line 52
    goto :goto_2

    .line 53
    :catch_1
    move-exception v0

    .line 54
    move-object/from16 v11, p3

    .line 55
    .line 56
    :goto_1
    iget-boolean v3, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 57
    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    move-object v7, v10

    .line 61
    move-object v14, v7

    .line 62
    :goto_2
    if-eqz v14, :cond_1

    .line 63
    .line 64
    if-eqz v7, :cond_1

    .line 65
    .line 66
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    array-length v3, v2

    .line 71
    if-ne v0, v3, :cond_1

    .line 72
    .line 73
    iget-object v3, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    .line 74
    .line 75
    iget-object v4, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 76
    .line 77
    iget-object v5, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 78
    .line 79
    move-object/from16 v8, p1

    .line 80
    .line 81
    move-object v6, v14

    .line 82
    invoke-interface/range {v3 .. v9}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement;->bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/lang/String;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->isBound()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeList;->asGenericTypes()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    new-instance v15, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;

    .line 109
    .line 110
    move-object/from16 v8, p1

    .line 111
    .line 112
    invoke-direct {v15, v8, v7, v14, v9}, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->getFreeOffset()I

    .line 116
    .line 117
    .line 118
    move-result v16

    .line 119
    move-object v11, v0

    .line 120
    invoke-interface/range {v11 .. v16}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->make(Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v2, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;

    .line 125
    .line 126
    iget-object v3, v1, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 127
    .line 128
    invoke-direct {v2, v1, v3, v10}, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;-><init>(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/MemberSubstitution$1;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 132
    .line 133
    invoke-interface {v0, v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget v2, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 138
    .line 139
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    iput v0, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 148
    .line 149
    const/4 v0, 0x1

    .line 150
    iput-boolean v0, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->matched:Z

    .line 151
    .line 152
    return-void

    .line 153
    :cond_1
    move-object/from16 v8, p1

    .line 154
    .line 155
    invoke-super/range {p0 .. p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_2
    invoke-virtual {v0}, Lnet/bytebuddy/pool/TypePool$Resolution$NoSuchTypeException;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v2, " using "

    .line 164
    .line 165
    iget-object v1, v1, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 166
    .line 167
    const-string v3, "Could not resolve "

    .line 168
    .line 169
    invoke-static {v3, v0, v2, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public visitMaxs(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->failIfNoMatch:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->matched:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string p2, "No substitution found within "

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, " of "

    .line 23
    .line 24
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    .line 26
    invoke-static {p1, p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    iget v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    iget v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->localVariableExtension:I

    .line 34
    .line 35
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 10
    .line 11
    const/16 v5, 0x2f

    .line 12
    .line 13
    const/16 v6, 0x2e

    .line 14
    .line 15
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-interface {v4, v7}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const-string v8, " using "

    .line 28
    .line 29
    const-string v9, "Could not resolve "

    .line 30
    .line 31
    if-eqz v7, :cond_16

    .line 32
    .line 33
    const/16 v7, 0xb7

    .line 34
    .line 35
    if-ne v1, v7, :cond_1

    .line 36
    .line 37
    const-string v10, "<init>"

    .line 38
    .line 39
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    if-eqz v10, :cond_1

    .line 44
    .line 45
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    iget-boolean v11, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 54
    .line 55
    if-eqz v11, :cond_0

    .line 56
    .line 57
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    invoke-static {v11}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    :goto_0
    invoke-interface {v10, v11}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    check-cast v10, Lnet/bytebuddy/description/method/MethodList;

    .line 91
    .line 92
    goto/16 :goto_6

    .line 93
    .line 94
    :cond_1
    const/16 v10, 0xb8

    .line 95
    .line 96
    if-ne v1, v10, :cond_5

    .line 97
    .line 98
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    check-cast v11, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 111
    .line 112
    invoke-interface {v11}, Lnet/bytebuddy/description/type/TypeDefinition;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    iget-boolean v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 117
    .line 118
    if-eqz v12, :cond_3

    .line 119
    .line 120
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    goto :goto_1

    .line 133
    :cond_3
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-static {v12}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    :goto_1
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    check-cast v11, Lnet/bytebuddy/description/method/MethodList;

    .line 154
    .line 155
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    if-eqz v12, :cond_4

    .line 160
    .line 161
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-nez v12, :cond_2

    .line 166
    .line 167
    :cond_4
    move-object v10, v11

    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :cond_5
    if-ne v1, v7, :cond_7

    .line 171
    .line 172
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    iget-boolean v11, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 181
    .line 182
    if-eqz v11, :cond_6

    .line 183
    .line 184
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    goto :goto_2

    .line 197
    :cond_6
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-static {v11}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    :goto_2
    invoke-interface {v10, v11}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    check-cast v10, Lnet/bytebuddy/description/method/MethodList;

    .line 218
    .line 219
    goto/16 :goto_6

    .line 220
    .line 221
    :cond_7
    iget-boolean v10, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->virtualPrivateCalls:Z

    .line 222
    .line 223
    if-eqz v10, :cond_a

    .line 224
    .line 225
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    iget-boolean v11, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 234
    .line 235
    if-eqz v11, :cond_8

    .line 236
    .line 237
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 242
    .line 243
    .line 244
    move-result-object v12

    .line 245
    invoke-static {v12}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 250
    .line 251
    .line 252
    move-result-object v11

    .line 253
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    goto :goto_3

    .line 270
    :cond_8
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 275
    .line 276
    .line 277
    move-result-object v12

    .line 278
    invoke-static {v12}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 291
    .line 292
    .line 293
    move-result-object v13

    .line 294
    invoke-interface {v12, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    invoke-static {v11}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    :goto_3
    invoke-interface {v10, v11}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    check-cast v10, Lnet/bytebuddy/description/method/MethodList;

    .line 311
    .line 312
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    if-eqz v11, :cond_c

    .line 317
    .line 318
    iget-object v10, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 319
    .line 320
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    iget-object v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 325
    .line 326
    invoke-interface {v10, v11, v12}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 327
    .line 328
    .line 329
    move-result-object v10

    .line 330
    invoke-interface {v10}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    invoke-virtual {v10}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    iget-boolean v11, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 339
    .line 340
    if-eqz v11, :cond_9

    .line 341
    .line 342
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 347
    .line 348
    .line 349
    move-result-object v12

    .line 350
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    goto :goto_4

    .line 355
    :cond_9
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 360
    .line 361
    .line 362
    move-result-object v12

    .line 363
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    invoke-static {v11}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    :goto_4
    invoke-interface {v10, v11}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    check-cast v10, Lnet/bytebuddy/description/method/MethodList;

    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_a
    iget-object v10, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 379
    .line 380
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    iget-object v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 385
    .line 386
    invoke-interface {v10, v11, v12}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;->compile(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    invoke-interface {v10}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph;->listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    .line 391
    .line 392
    .line 393
    move-result-object v10

    .line 394
    invoke-virtual {v10}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->asMethodList()Lnet/bytebuddy/description/method/MethodList;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    iget-boolean v11, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 399
    .line 400
    if-eqz v11, :cond_b

    .line 401
    .line 402
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 403
    .line 404
    .line 405
    move-result-object v11

    .line 406
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 407
    .line 408
    .line 409
    move-result-object v12

    .line 410
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 411
    .line 412
    .line 413
    move-result-object v11

    .line 414
    goto :goto_5

    .line 415
    :cond_b
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    invoke-static/range {p4 .. p4}, Lnet/bytebuddy/matcher/ElementMatchers;->hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    invoke-interface {v11, v12}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    invoke-static {v11}, Lnet/bytebuddy/matcher/ElementMatchers;->failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 428
    .line 429
    .line 430
    move-result-object v11

    .line 431
    :goto_5
    invoke-interface {v10, v11}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    check-cast v10, Lnet/bytebuddy/description/method/MethodList;

    .line 436
    .line 437
    :cond_c
    :goto_6
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    if-nez v11, :cond_13

    .line 442
    .line 443
    iget-object v12, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->replacement:Lnet/bytebuddy/asm/MemberSubstitution$Replacement;

    .line 444
    .line 445
    iget-object v13, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 446
    .line 447
    iget-object v14, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 448
    .line 449
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 450
    .line 451
    .line 452
    move-result-object v15

    .line 453
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    move-object/from16 v16, v5

    .line 458
    .line 459
    check-cast v16, Lnet/bytebuddy/description/method/MethodDescription;

    .line 460
    .line 461
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    check-cast v5, Lnet/bytebuddy/description/method/MethodDescription;

    .line 466
    .line 467
    invoke-static {v1, v5}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->of(ILnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 468
    .line 469
    .line 470
    move-result-object v17

    .line 471
    invoke-interface/range {v12 .. v17}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement;->bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;

    .line 472
    .line 473
    .line 474
    move-result-object v18

    .line 475
    invoke-interface/range {v18 .. v18}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->isBound()Z

    .line 476
    .line 477
    .line 478
    move-result v5

    .line 479
    if-eqz v5, :cond_14

    .line 480
    .line 481
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 486
    .line 487
    invoke-interface {v2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    if-nez v2, :cond_e

    .line 492
    .line 493
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 498
    .line 499
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    if-eqz v2, :cond_d

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :cond_d
    new-instance v2, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 507
    .line 508
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    check-cast v5, Lnet/bytebuddy/description/method/MethodDescription;

    .line 517
    .line 518
    invoke-interface {v5}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-interface {v5}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    invoke-static {v3, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-direct {v2, v3}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>(Ljava/util/List;)V

    .line 531
    .line 532
    .line 533
    :goto_7
    move-object/from16 v19, v2

    .line 534
    .line 535
    goto :goto_9

    .line 536
    :cond_e
    :goto_8
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 541
    .line 542
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    goto :goto_7

    .line 551
    :goto_9
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 556
    .line 557
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-eqz v2, :cond_f

    .line 562
    .line 563
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 568
    .line 569
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    :goto_a
    move-object/from16 v20, v2

    .line 578
    .line 579
    goto :goto_b

    .line 580
    :cond_f
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 585
    .line 586
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    goto :goto_a

    .line 591
    :goto_b
    if-ne v1, v7, :cond_10

    .line 592
    .line 593
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 598
    .line 599
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    if-eqz v2, :cond_10

    .line 604
    .line 605
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 610
    .line 611
    invoke-interface {v2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-nez v2, :cond_10

    .line 616
    .line 617
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 622
    .line 623
    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 628
    .line 629
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    invoke-static {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofSpecial(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    :goto_c
    move-object/from16 v21, v2

    .line 638
    .line 639
    goto :goto_d

    .line 640
    :cond_10
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 645
    .line 646
    invoke-interface {v2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 651
    .line 652
    invoke-static {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    goto :goto_c

    .line 657
    :goto_d
    if-ne v1, v7, :cond_11

    .line 658
    .line 659
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    .line 664
    .line 665
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    if-eqz v1, :cond_11

    .line 670
    .line 671
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    .line 676
    .line 677
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    if-nez v1, :cond_11

    .line 682
    .line 683
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    .line 688
    .line 689
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    invoke-interface {v4}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    invoke-interface {v1, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->special(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    :goto_e
    move-object/from16 v22, v1

    .line 702
    .line 703
    goto :goto_f

    .line 704
    :cond_11
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    .line 709
    .line 710
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    goto :goto_e

    .line 715
    :goto_f
    invoke-virtual {v0}, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->getFreeOffset()I

    .line 716
    .line 717
    .line 718
    move-result v23

    .line 719
    invoke-interface/range {v18 .. v23}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;->make(Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    new-instance v2, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;

    .line 724
    .line 725
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 726
    .line 727
    const/4 v4, 0x0

    .line 728
    invoke-direct {v2, v0, v3, v4}, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor;-><init>(Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/MemberSubstitution$1;)V

    .line 729
    .line 730
    .line 731
    iget-object v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 732
    .line 733
    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-interface {v10}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 742
    .line 743
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    iget v3, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 748
    .line 749
    const/4 v4, 0x1

    .line 750
    if-eqz v2, :cond_12

    .line 751
    .line 752
    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    const/4 v2, 0x2

    .line 757
    add-int/2addr v1, v2

    .line 758
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 763
    .line 764
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 765
    .line 766
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 767
    .line 768
    const-class v6, Ljava/lang/Object;

    .line 769
    .line 770
    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 771
    .line 772
    .line 773
    move-result-object v7

    .line 774
    invoke-virtual {v5, v7}, Lnet/bytebuddy/implementation/bytecode/Duplication;->flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 775
    .line 776
    .line 777
    move-result-object v7

    .line 778
    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 779
    .line 780
    .line 781
    move-result-object v6

    .line 782
    invoke-virtual {v5, v6}, Lnet/bytebuddy/implementation/bytecode/Duplication;->flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    const/4 v6, 0x6

    .line 787
    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 788
    .line 789
    const/4 v8, 0x0

    .line 790
    aput-object v7, v6, v8

    .line 791
    .line 792
    sget-object v7, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 793
    .line 794
    aput-object v7, v6, v4

    .line 795
    .line 796
    aput-object v7, v6, v2

    .line 797
    .line 798
    const/4 v2, 0x3

    .line 799
    aput-object v5, v6, v2

    .line 800
    .line 801
    const/4 v2, 0x4

    .line 802
    aput-object v7, v6, v2

    .line 803
    .line 804
    const/4 v2, 0x5

    .line 805
    aput-object v7, v6, v2

    .line 806
    .line 807
    invoke-direct {v3, v6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 808
    .line 809
    .line 810
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 811
    .line 812
    iget-object v5, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 813
    .line 814
    invoke-virtual {v3, v2, v5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 823
    .line 824
    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    add-int/2addr v3, v2

    .line 829
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 834
    .line 835
    goto :goto_10

    .line 836
    :cond_12
    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 837
    .line 838
    .line 839
    move-result v1

    .line 840
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    iput v1, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->stackSizeBuffer:I

    .line 845
    .line 846
    :goto_10
    iput-boolean v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->matched:Z

    .line 847
    .line 848
    return-void

    .line 849
    :cond_13
    iget-boolean v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 850
    .line 851
    if-nez v4, :cond_15

    .line 852
    .line 853
    :cond_14
    move-object/from16 v7, p4

    .line 854
    .line 855
    goto :goto_11

    .line 856
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 857
    .line 858
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    iget-object v0, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 863
    .line 864
    new-instance v4, Ljava/lang/StringBuilder;

    .line 865
    .line 866
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    const-string v2, "."

    .line 873
    .line 874
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 878
    .line 879
    .line 880
    move-object/from16 v7, p4

    .line 881
    .line 882
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    throw v1

    .line 899
    :cond_16
    move-object/from16 v7, p4

    .line 900
    .line 901
    iget-boolean v4, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->strict:Z

    .line 902
    .line 903
    if-nez v4, :cond_17

    .line 904
    .line 905
    :goto_11
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 906
    .line 907
    .line 908
    return-void

    .line 909
    :cond_17
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    iget-object v0, v0, Lnet/bytebuddy/asm/MemberSubstitution$SubstitutingMethodVisitor;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 914
    .line 915
    invoke-static {v9, v1, v8, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    return-void
.end method
