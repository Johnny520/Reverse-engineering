.class public final enum Lnet/bytebuddy/utility/JavaType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/JavaType$LatentTypeWithSimpleName;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/JavaType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/JavaType;

.field public static final enum ACCESS_CONTROL_CONTEXT:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CALL_SITE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CLASS_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CONSTABLE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

.field public static final enum CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum DIRECT_METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum DYNAMIC_CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum EXECUTABLE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum METHOD_TYPE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

.field public static final enum MODULE:Lnet/bytebuddy/utility/JavaType;

.field public static final enum OBJECT_METHODS:Lnet/bytebuddy/utility/JavaType;

.field public static final enum PARAMETER:Lnet/bytebuddy/utility/JavaType;

.field public static final enum RECORD:Lnet/bytebuddy/utility/JavaType;

.field public static final enum TYPE_DESCRIPTOR:Lnet/bytebuddy/utility/JavaType;

.field public static final enum TYPE_DESCRIPTOR_OF_FIELD:Lnet/bytebuddy/utility/JavaType;

.field public static final enum TYPE_DESCRIPTOR_OF_METHOD:Lnet/bytebuddy/utility/JavaType;

.field public static final enum VAR_HANDLE:Lnet/bytebuddy/utility/JavaType;


# instance fields
.field private transient synthetic available:Ljava/lang/Boolean;

.field private transient synthetic loaded:Ljava/lang/Class;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/JavaType;

    .line 2
    .line 3
    sget-object v6, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    move-object v5, v6

    .line 7
    new-array v6, v8, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 8
    .line 9
    const-string v1, "CONSTABLE"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "java.lang.constant.Constable"

    .line 13
    .line 14
    const/16 v4, 0x601

    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 17
    .line 18
    .line 19
    move-object v6, v5

    .line 20
    sput-object v0, Lnet/bytebuddy/utility/JavaType;->CONSTABLE:Lnet/bytebuddy/utility/JavaType;

    .line 21
    .line 22
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 23
    .line 24
    const/16 v5, 0x601

    .line 25
    .line 26
    new-array v7, v8, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 27
    .line 28
    const-string v2, "TYPE_DESCRIPTOR"

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    const-string v4, "java.lang.invoke.TypeDescriptor"

    .line 32
    .line 33
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 34
    .line 35
    .line 36
    move-object v9, v1

    .line 37
    sput-object v9, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR:Lnet/bytebuddy/utility/JavaType;

    .line 38
    .line 39
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 40
    .line 41
    invoke-virtual {v9}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v10, 0x1

    .line 46
    new-array v7, v10, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 47
    .line 48
    aput-object v2, v7, v8

    .line 49
    .line 50
    const-string v2, "TYPE_DESCRIPTOR_OF_FIELD"

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    const-string v4, "java.lang.invoke.TypeDescriptor$OfField"

    .line 54
    .line 55
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 56
    .line 57
    .line 58
    move-object v11, v1

    .line 59
    sput-object v11, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR_OF_FIELD:Lnet/bytebuddy/utility/JavaType;

    .line 60
    .line 61
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 62
    .line 63
    invoke-virtual {v9}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-array v7, v10, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 68
    .line 69
    aput-object v2, v7, v8

    .line 70
    .line 71
    const-string v2, "TYPE_DESCRIPTOR_OF_METHOD"

    .line 72
    .line 73
    const/4 v3, 0x3

    .line 74
    const-string v4, "java.lang.invoke.TypeDescriptor$OfMethod"

    .line 75
    .line 76
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 77
    .line 78
    .line 79
    move-object v12, v1

    .line 80
    sput-object v12, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR_OF_METHOD:Lnet/bytebuddy/utility/JavaType;

    .line 81
    .line 82
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 83
    .line 84
    new-array v7, v8, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 85
    .line 86
    const-string v2, "CONSTANT_DESCRIPTION"

    .line 87
    .line 88
    const/4 v3, 0x4

    .line 89
    const-string v4, "java.lang.constant.ConstantDesc"

    .line 90
    .line 91
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 92
    .line 93
    .line 94
    move-object v13, v1

    .line 95
    sput-object v13, Lnet/bytebuddy/utility/JavaType;->CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    .line 96
    .line 97
    new-instance v14, Lnet/bytebuddy/utility/JavaType;

    .line 98
    .line 99
    const-class v21, Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static/range {v21 .. v21}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 102
    .line 103
    .line 104
    move-result-object v19

    .line 105
    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    new-array v2, v10, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 110
    .line 111
    aput-object v1, v2, v8

    .line 112
    .line 113
    const-string v15, "DYNAMIC_CONSTANT_DESCRIPTION"

    .line 114
    .line 115
    const/16 v16, 0x5

    .line 116
    .line 117
    const-string v17, "java.lang.constant.DynamicConstantDesc"

    .line 118
    .line 119
    const/16 v18, 0x401

    .line 120
    .line 121
    move-object/from16 v20, v2

    .line 122
    .line 123
    invoke-direct/range {v14 .. v20}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 124
    .line 125
    .line 126
    sput-object v14, Lnet/bytebuddy/utility/JavaType;->DYNAMIC_CONSTANT_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    .line 127
    .line 128
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 129
    .line 130
    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v11}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    const/4 v15, 0x2

    .line 139
    new-array v7, v15, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 140
    .line 141
    aput-object v2, v7, v8

    .line 142
    .line 143
    aput-object v3, v7, v10

    .line 144
    .line 145
    const-string v2, "CLASS_DESCRIPTION"

    .line 146
    .line 147
    const/4 v3, 0x6

    .line 148
    const-string v4, "java.lang.constant.ClassDesc"

    .line 149
    .line 150
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 151
    .line 152
    .line 153
    move-object/from16 v16, v1

    .line 154
    .line 155
    sput-object v16, Lnet/bytebuddy/utility/JavaType;->CLASS_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    .line 156
    .line 157
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 158
    .line 159
    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    new-array v7, v15, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 168
    .line 169
    aput-object v2, v7, v8

    .line 170
    .line 171
    aput-object v3, v7, v10

    .line 172
    .line 173
    const-string v2, "METHOD_TYPE_DESCRIPTION"

    .line 174
    .line 175
    const/4 v3, 0x7

    .line 176
    const-string v4, "java.lang.constant.MethodTypeDesc"

    .line 177
    .line 178
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v17, v1

    .line 182
    .line 183
    sput-object v17, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    .line 184
    .line 185
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 186
    .line 187
    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    new-array v7, v10, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 192
    .line 193
    aput-object v2, v7, v8

    .line 194
    .line 195
    const-string v2, "METHOD_HANDLE_DESCRIPTION"

    .line 196
    .line 197
    const/16 v3, 0x8

    .line 198
    .line 199
    const-string v4, "java.lang.constant.MethodHandleDesc"

    .line 200
    .line 201
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 202
    .line 203
    .line 204
    move-object/from16 v18, v9

    .line 205
    .line 206
    move-object v9, v1

    .line 207
    sput-object v9, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    .line 208
    .line 209
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 210
    .line 211
    invoke-virtual {v9}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    new-array v7, v10, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 216
    .line 217
    aput-object v2, v7, v8

    .line 218
    .line 219
    const-string v2, "DIRECT_METHOD_HANDLE_DESCRIPTION"

    .line 220
    .line 221
    const/16 v3, 0x9

    .line 222
    .line 223
    const-string v4, "java.lang.constant.DirectMethodHandleDesc"

    .line 224
    .line 225
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v19, v1

    .line 229
    .line 230
    sput-object v19, Lnet/bytebuddy/utility/JavaType;->DIRECT_METHOD_HANDLE_DESCRIPTION:Lnet/bytebuddy/utility/JavaType;

    .line 231
    .line 232
    new-instance v22, Lnet/bytebuddy/utility/JavaType;

    .line 233
    .line 234
    invoke-static/range {v21 .. v21}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 235
    .line 236
    .line 237
    move-result-object v27

    .line 238
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    new-array v2, v10, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 243
    .line 244
    aput-object v1, v2, v8

    .line 245
    .line 246
    const-string v23, "METHOD_HANDLE"

    .line 247
    .line 248
    const/16 v24, 0xa

    .line 249
    .line 250
    const-string v25, "java.lang.invoke.MethodHandle"

    .line 251
    .line 252
    const/16 v26, 0x401

    .line 253
    .line 254
    move-object/from16 v28, v2

    .line 255
    .line 256
    invoke-direct/range {v22 .. v28}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 257
    .line 258
    .line 259
    sput-object v22, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 260
    .line 261
    new-instance v23, Lnet/bytebuddy/utility/JavaType;

    .line 262
    .line 263
    const-class v28, Ljava/lang/Object;

    .line 264
    .line 265
    new-array v1, v8, [Ljava/lang/reflect/Type;

    .line 266
    .line 267
    const-string v24, "METHOD_HANDLES"

    .line 268
    .line 269
    const/16 v25, 0xb

    .line 270
    .line 271
    const-string v26, "java.lang.invoke.MethodHandles"

    .line 272
    .line 273
    const/16 v27, 0x1

    .line 274
    .line 275
    move-object/from16 v29, v1

    .line 276
    .line 277
    invoke-direct/range {v23 .. v29}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 278
    .line 279
    .line 280
    sput-object v23, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

    .line 281
    .line 282
    new-instance v24, Lnet/bytebuddy/utility/JavaType;

    .line 283
    .line 284
    invoke-static/range {v21 .. v21}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 285
    .line 286
    .line 287
    move-result-object v29

    .line 288
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    const-class v3, Ljava/io/Serializable;

    .line 297
    .line 298
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    const/4 v4, 0x3

    .line 303
    new-array v4, v4, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 304
    .line 305
    aput-object v1, v4, v8

    .line 306
    .line 307
    aput-object v2, v4, v10

    .line 308
    .line 309
    aput-object v3, v4, v15

    .line 310
    .line 311
    const-string v25, "METHOD_TYPE"

    .line 312
    .line 313
    const/16 v26, 0xc

    .line 314
    .line 315
    const-string v27, "java.lang.invoke.MethodType"

    .line 316
    .line 317
    const/16 v28, 0x11

    .line 318
    .line 319
    move-object/from16 v30, v4

    .line 320
    .line 321
    invoke-direct/range {v24 .. v30}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 322
    .line 323
    .line 324
    sput-object v24, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    .line 325
    .line 326
    new-instance v25, Lnet/bytebuddy/utility/JavaType;

    .line 327
    .line 328
    const-class v30, Ljava/lang/Object;

    .line 329
    .line 330
    new-array v1, v8, [Ljava/lang/reflect/Type;

    .line 331
    .line 332
    const-string v26, "METHOD_HANDLES_LOOKUP"

    .line 333
    .line 334
    const/16 v27, 0xd

    .line 335
    .line 336
    const-string v28, "java.lang.invoke.MethodHandles$Lookup"

    .line 337
    .line 338
    const/16 v29, 0x19

    .line 339
    .line 340
    move-object/from16 v31, v1

    .line 341
    .line 342
    invoke-direct/range {v25 .. v31}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 343
    .line 344
    .line 345
    sput-object v25, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 346
    .line 347
    new-instance v26, Lnet/bytebuddy/utility/JavaType;

    .line 348
    .line 349
    const-class v31, Ljava/lang/Object;

    .line 350
    .line 351
    new-array v1, v8, [Ljava/lang/reflect/Type;

    .line 352
    .line 353
    const-string v27, "CALL_SITE"

    .line 354
    .line 355
    const/16 v28, 0xe

    .line 356
    .line 357
    const-string v29, "java.lang.invoke.CallSite"

    .line 358
    .line 359
    const/16 v30, 0x401

    .line 360
    .line 361
    move-object/from16 v32, v1

    .line 362
    .line 363
    invoke-direct/range {v26 .. v32}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 364
    .line 365
    .line 366
    sput-object v26, Lnet/bytebuddy/utility/JavaType;->CALL_SITE:Lnet/bytebuddy/utility/JavaType;

    .line 367
    .line 368
    new-instance v27, Lnet/bytebuddy/utility/JavaType;

    .line 369
    .line 370
    invoke-static/range {v21 .. v21}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 371
    .line 372
    .line 373
    move-result-object v32

    .line 374
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    new-array v2, v10, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 379
    .line 380
    aput-object v1, v2, v8

    .line 381
    .line 382
    const-string v28, "VAR_HANDLE"

    .line 383
    .line 384
    const/16 v29, 0xf

    .line 385
    .line 386
    const-string v30, "java.lang.invoke.VarHandle"

    .line 387
    .line 388
    const/16 v31, 0x401

    .line 389
    .line 390
    move-object/from16 v33, v2

    .line 391
    .line 392
    invoke-direct/range {v27 .. v33}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 393
    .line 394
    .line 395
    sput-object v27, Lnet/bytebuddy/utility/JavaType;->VAR_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 396
    .line 397
    new-instance v28, Lnet/bytebuddy/utility/JavaType;

    .line 398
    .line 399
    new-array v1, v10, [Ljava/lang/reflect/Type;

    .line 400
    .line 401
    const-class v2, Ljava/lang/reflect/AnnotatedElement;

    .line 402
    .line 403
    aput-object v2, v1, v8

    .line 404
    .line 405
    const-string v29, "PARAMETER"

    .line 406
    .line 407
    const/16 v30, 0x10

    .line 408
    .line 409
    const-string v31, "java.lang.reflect.Parameter"

    .line 410
    .line 411
    const/16 v32, 0x11

    .line 412
    .line 413
    const-class v33, Ljava/lang/Object;

    .line 414
    .line 415
    move-object/from16 v34, v1

    .line 416
    .line 417
    invoke-direct/range {v28 .. v34}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 418
    .line 419
    .line 420
    sput-object v28, Lnet/bytebuddy/utility/JavaType;->PARAMETER:Lnet/bytebuddy/utility/JavaType;

    .line 421
    .line 422
    new-instance v29, Lnet/bytebuddy/utility/JavaType;

    .line 423
    .line 424
    new-array v1, v15, [Ljava/lang/reflect/Type;

    .line 425
    .line 426
    const-class v3, Ljava/lang/reflect/Member;

    .line 427
    .line 428
    aput-object v3, v1, v8

    .line 429
    .line 430
    const-class v3, Ljava/lang/reflect/GenericDeclaration;

    .line 431
    .line 432
    aput-object v3, v1, v10

    .line 433
    .line 434
    const-string v30, "EXECUTABLE"

    .line 435
    .line 436
    const/16 v31, 0x11

    .line 437
    .line 438
    const-string v32, "java.lang.reflect.Executable"

    .line 439
    .line 440
    const/16 v33, 0x401

    .line 441
    .line 442
    const-class v34, Ljava/lang/reflect/AccessibleObject;

    .line 443
    .line 444
    move-object/from16 v35, v1

    .line 445
    .line 446
    invoke-direct/range {v29 .. v35}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 447
    .line 448
    .line 449
    sput-object v29, Lnet/bytebuddy/utility/JavaType;->EXECUTABLE:Lnet/bytebuddy/utility/JavaType;

    .line 450
    .line 451
    new-instance v30, Lnet/bytebuddy/utility/JavaType;

    .line 452
    .line 453
    new-array v1, v10, [Ljava/lang/reflect/Type;

    .line 454
    .line 455
    aput-object v2, v1, v8

    .line 456
    .line 457
    const-string v31, "MODULE"

    .line 458
    .line 459
    const/16 v32, 0x12

    .line 460
    .line 461
    const-string v33, "java.lang.Module"

    .line 462
    .line 463
    const/16 v34, 0x11

    .line 464
    .line 465
    const-class v35, Ljava/lang/Object;

    .line 466
    .line 467
    move-object/from16 v36, v1

    .line 468
    .line 469
    invoke-direct/range {v30 .. v36}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 470
    .line 471
    .line 472
    sput-object v30, Lnet/bytebuddy/utility/JavaType;->MODULE:Lnet/bytebuddy/utility/JavaType;

    .line 473
    .line 474
    new-instance v20, Lnet/bytebuddy/utility/JavaType;

    .line 475
    .line 476
    const-class v36, Ljava/lang/Object;

    .line 477
    .line 478
    new-array v1, v8, [Ljava/lang/reflect/Type;

    .line 479
    .line 480
    const-string v32, "CONSTANT_BOOTSTRAPS"

    .line 481
    .line 482
    const/16 v33, 0x13

    .line 483
    .line 484
    const-string v34, "java.lang.invoke.ConstantBootstraps"

    .line 485
    .line 486
    const/16 v35, 0x11

    .line 487
    .line 488
    move-object/from16 v37, v1

    .line 489
    .line 490
    move-object/from16 v31, v20

    .line 491
    .line 492
    invoke-direct/range {v31 .. v37}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 493
    .line 494
    .line 495
    sput-object v20, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 496
    .line 497
    new-instance v21, Lnet/bytebuddy/utility/JavaType;

    .line 498
    .line 499
    const-class v36, Ljava/lang/Object;

    .line 500
    .line 501
    new-array v1, v8, [Ljava/lang/reflect/Type;

    .line 502
    .line 503
    const-string v32, "RECORD"

    .line 504
    .line 505
    const/16 v33, 0x14

    .line 506
    .line 507
    const-string v34, "java.lang.Record"

    .line 508
    .line 509
    const/16 v35, 0x401

    .line 510
    .line 511
    move-object/from16 v37, v1

    .line 512
    .line 513
    move-object/from16 v31, v21

    .line 514
    .line 515
    invoke-direct/range {v31 .. v37}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 516
    .line 517
    .line 518
    sput-object v21, Lnet/bytebuddy/utility/JavaType;->RECORD:Lnet/bytebuddy/utility/JavaType;

    .line 519
    .line 520
    new-instance v31, Lnet/bytebuddy/utility/JavaType;

    .line 521
    .line 522
    const-class v36, Ljava/lang/Object;

    .line 523
    .line 524
    new-array v1, v8, [Ljava/lang/reflect/Type;

    .line 525
    .line 526
    const-string v32, "OBJECT_METHODS"

    .line 527
    .line 528
    const/16 v33, 0x15

    .line 529
    .line 530
    const-string v34, "java.lang.runtime.ObjectMethods"

    .line 531
    .line 532
    const/16 v35, 0x1

    .line 533
    .line 534
    move-object/from16 v37, v1

    .line 535
    .line 536
    invoke-direct/range {v31 .. v37}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 537
    .line 538
    .line 539
    sput-object v31, Lnet/bytebuddy/utility/JavaType;->OBJECT_METHODS:Lnet/bytebuddy/utility/JavaType;

    .line 540
    .line 541
    new-instance v1, Lnet/bytebuddy/utility/JavaType;

    .line 542
    .line 543
    const/16 v5, 0x11

    .line 544
    .line 545
    new-array v7, v8, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 546
    .line 547
    const-string v2, "ACCESS_CONTROL_CONTEXT"

    .line 548
    .line 549
    const/16 v3, 0x16

    .line 550
    .line 551
    const-string v4, "java.security.AccessControlContext"

    .line 552
    .line 553
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 554
    .line 555
    .line 556
    sput-object v1, Lnet/bytebuddy/utility/JavaType;->ACCESS_CONTROL_CONTEXT:Lnet/bytebuddy/utility/JavaType;

    .line 557
    .line 558
    move-object v3, v11

    .line 559
    move-object v4, v12

    .line 560
    move-object v5, v13

    .line 561
    move-object v6, v14

    .line 562
    move-object/from16 v7, v16

    .line 563
    .line 564
    move-object/from16 v8, v17

    .line 565
    .line 566
    move-object/from16 v2, v18

    .line 567
    .line 568
    move-object/from16 v10, v19

    .line 569
    .line 570
    move-object/from16 v11, v22

    .line 571
    .line 572
    move-object/from16 v12, v23

    .line 573
    .line 574
    move-object/from16 v13, v24

    .line 575
    .line 576
    move-object/from16 v14, v25

    .line 577
    .line 578
    move-object/from16 v15, v26

    .line 579
    .line 580
    move-object/from16 v16, v27

    .line 581
    .line 582
    move-object/from16 v17, v28

    .line 583
    .line 584
    move-object/from16 v18, v29

    .line 585
    .line 586
    move-object/from16 v19, v30

    .line 587
    .line 588
    move-object/from16 v22, v31

    .line 589
    .line 590
    move-object/from16 v23, v1

    .line 591
    .line 592
    move-object v1, v0

    .line 593
    filled-new-array/range {v1 .. v23}, [Lnet/bytebuddy/utility/JavaType;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    sput-object v0, Lnet/bytebuddy/utility/JavaType;->$VALUES:[Lnet/bytebuddy/utility/JavaType;

    .line 598
    .line 599
    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    sget-object p5, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    :goto_0
    move-object v5, p5

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-static {p5}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 8
    .line 9
    .line 10
    move-result-object p5

    .line 11
    goto :goto_0

    .line 12
    :goto_1
    new-instance v6, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    .line 13
    .line 14
    invoke-direct {v6, p6}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    .line 15
    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    move v2, p2

    .line 20
    move-object v3, p3

    .line 21
    move v4, p4

    .line 22
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeList$Generic;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/type/TypeDefinition;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "[",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")V"
        }
    .end annotation

    if-nez p5, :cond_0

    .line 26
    sget-object p5, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    :goto_0
    move-object v5, p5

    goto :goto_1

    .line 27
    :cond_0
    invoke-interface {p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p5

    goto :goto_0

    :goto_1
    new-instance v6, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    invoke-direct {v6, p6}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    .line 28
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/utility/JavaType;-><init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeList$Generic;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeList$Generic;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            ")V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 30
    new-instance p1, Lnet/bytebuddy/utility/JavaType$LatentTypeWithSimpleName;

    invoke-direct {p1, p3, p4, p5, p6}, Lnet/bytebuddy/utility/JavaType$LatentTypeWithSimpleName;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    iput-object p1, p0, Lnet/bytebuddy/utility/JavaType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    return-void
.end method

.method private doIsAvailable()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "available"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->available:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->available:Ljava/lang/Boolean;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/utility/JavaType;->available:Ljava/lang/Boolean;

    .line 21
    .line 22
    :goto_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/JavaType;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/utility/JavaType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/utility/JavaType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/JavaType;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->$VALUES:[Lnet/bytebuddy/utility/JavaType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/utility/JavaType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/utility/JavaType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public isAvailable()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/JavaType;->doIsAvailable()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isInstance(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->isAvailable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return p0

    .line 18
    :catch_0
    return v1
.end method

.method public load()Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "loaded"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->loaded:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/utility/JavaType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    sget-object v2, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaType;->loaded:Ljava/lang/Class;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/utility/JavaType;->loaded:Ljava/lang/Class;

    .line 26
    .line 27
    return-object v0
.end method

.method public loadAsDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
