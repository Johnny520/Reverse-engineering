.class public Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;
.implements Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsingUnsafeInjection"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final accessor:Ljava/lang/Object;

.field private final defineClass:Ljava/lang/reflect/Method;

.field private final definePackage:Ljava/lang/reflect/Method;

.field private final findLoadedClass:Ljava/lang/reflect/Method;

.field private final getClassLoadingLock:Ljava/lang/reflect/Method;

.field private final getDefinedPackage:Ljava/lang/reflect/Method;
    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field

.field private final getPackage:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0
    .param p4    # Ljava/lang/reflect/Method;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    return-void
.end method

.method public static make()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;
    .locals 37

    .line 1
    const-string v0, "getClassLoadingLock"

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lnet/bytebuddy/utility/GraalImageCode;->isDefined()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "net.bytebuddy.safe"

    .line 16
    .line 17
    invoke-static {v2, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable;

    .line 28
    .line 29
    const-string v1, "Use of Unsafe was disabled by system property"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    const-string v1, "sun.misc.Unsafe"

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "theUnsafe"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {}, Lnet/bytebuddy/utility/JavaModule;->isSupported()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    const-string v6, "getDefinedPackage"

    .line 61
    .line 62
    const-class v7, Ljava/lang/String;

    .line 63
    .line 64
    const-class v8, Ljava/lang/ClassLoader;

    .line 65
    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    :try_start_0
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v8, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_0

    .line 77
    :catch_0
    :cond_1
    move-object v5, v4

    .line 78
    :goto_0
    new-instance v9, Lnet/bytebuddy/ByteBuddy;

    .line 79
    .line 80
    invoke-direct {v9}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 81
    .line 82
    .line 83
    sget-object v10, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 84
    .line 85
    invoke-virtual {v9, v10}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    sget-object v10, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 90
    .line 91
    const-class v11, Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v9, v11, v10}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    const-string v12, "$ByteBuddyAccessor$V1"

    .line 102
    .line 103
    invoke-virtual {v10, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-interface {v9, v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    sget-object v10, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 112
    .line 113
    new-array v12, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    aput-object v10, v12, v13

    .line 117
    .line 118
    const-string v14, "findLoadedClass"

    .line 119
    .line 120
    const-class v15, Ljava/lang/Class;

    .line 121
    .line 122
    invoke-interface {v9, v14, v15, v12}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    const/4 v12, 0x2

    .line 127
    new-array v4, v12, [Ljava/lang/reflect/Type;

    .line 128
    .line 129
    aput-object v8, v4, v13

    .line 130
    .line 131
    aput-object v7, v4, v3

    .line 132
    .line 133
    invoke-interface {v9, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-virtual {v8, v14, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-static {v9}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-virtual {v9, v13}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    move/from16 v17, v12

    .line 154
    .line 155
    filled-new-array {v3}, [I

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    invoke-virtual {v9, v12}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-interface {v4, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    new-array v9, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 168
    .line 169
    aput-object v10, v9, v13

    .line 170
    .line 171
    const-string v12, "defineClass"

    .line 172
    .line 173
    invoke-interface {v4, v12, v15, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    const/4 v9, 0x6

    .line 178
    move/from16 v18, v3

    .line 179
    .line 180
    new-array v3, v9, [Ljava/lang/reflect/Type;

    .line 181
    .line 182
    aput-object v8, v3, v13

    .line 183
    .line 184
    aput-object v7, v3, v18

    .line 185
    .line 186
    move/from16 v19, v9

    .line 187
    .line 188
    const-class v9, [B

    .line 189
    .line 190
    aput-object v9, v3, v17

    .line 191
    .line 192
    const/16 v21, 0x3

    .line 193
    .line 194
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 195
    .line 196
    aput-object v13, v3, v21

    .line 197
    .line 198
    move-object/from16 v22, v5

    .line 199
    .line 200
    const/4 v5, 0x4

    .line 201
    aput-object v13, v3, v5

    .line 202
    .line 203
    const/16 v24, 0x5

    .line 204
    .line 205
    const-class v5, Ljava/security/ProtectionDomain;

    .line 206
    .line 207
    aput-object v5, v3, v24

    .line 208
    .line 209
    invoke-interface {v4, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    filled-new-array {v7, v9, v13, v13, v5}, [Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v8, v12, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-static {v4}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    const/4 v5, 0x0

    .line 226
    invoke-virtual {v4, v5}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    move/from16 v20, v5

    .line 231
    .line 232
    move-object/from16 v25, v10

    .line 233
    .line 234
    move-object/from16 v27, v12

    .line 235
    .line 236
    move-object/from16 v26, v15

    .line 237
    .line 238
    move/from16 v10, v17

    .line 239
    .line 240
    move/from16 v15, v18

    .line 241
    .line 242
    move/from16 v5, v21

    .line 243
    .line 244
    move/from16 v9, v24

    .line 245
    .line 246
    const/4 v13, 0x4

    .line 247
    filled-new-array {v15, v10, v5, v13, v9}, [I

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    invoke-virtual {v4, v12}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    new-array v4, v15, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 260
    .line 261
    aput-object v25, v4, v20

    .line 262
    .line 263
    const-string v5, "getPackage"

    .line 264
    .line 265
    const-class v9, Ljava/lang/Package;

    .line 266
    .line 267
    invoke-interface {v3, v5, v9, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    new-array v4, v10, [Ljava/lang/reflect/Type;

    .line 272
    .line 273
    aput-object v8, v4, v20

    .line 274
    .line 275
    aput-object v7, v4, v15

    .line 276
    .line 277
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v8, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-static {v4}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    move/from16 v10, v20

    .line 294
    .line 295
    invoke-virtual {v4, v10}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    filled-new-array {v15}, [I

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    invoke-virtual {v4, v12}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    new-array v4, v15, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 312
    .line 313
    aput-object v25, v4, v10

    .line 314
    .line 315
    const-string v12, "definePackage"

    .line 316
    .line 317
    invoke-interface {v3, v12, v9, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    const/16 v4, 0x9

    .line 322
    .line 323
    new-array v4, v4, [Ljava/lang/reflect/Type;

    .line 324
    .line 325
    aput-object v8, v4, v10

    .line 326
    .line 327
    aput-object v7, v4, v15

    .line 328
    .line 329
    const/16 v17, 0x2

    .line 330
    .line 331
    aput-object v7, v4, v17

    .line 332
    .line 333
    const/16 v21, 0x3

    .line 334
    .line 335
    aput-object v7, v4, v21

    .line 336
    .line 337
    const/16 v23, 0x4

    .line 338
    .line 339
    aput-object v7, v4, v23

    .line 340
    .line 341
    const/16 v24, 0x5

    .line 342
    .line 343
    aput-object v7, v4, v24

    .line 344
    .line 345
    aput-object v7, v4, v19

    .line 346
    .line 347
    const/4 v10, 0x7

    .line 348
    aput-object v7, v4, v10

    .line 349
    .line 350
    const-class v10, Ljava/net/URL;

    .line 351
    .line 352
    const/16 v13, 0x8

    .line 353
    .line 354
    aput-object v10, v4, v13

    .line 355
    .line 356
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    const-class v34, Ljava/lang/String;

    .line 361
    .line 362
    const-class v35, Ljava/net/URL;

    .line 363
    .line 364
    const-class v28, Ljava/lang/String;

    .line 365
    .line 366
    const-class v29, Ljava/lang/String;

    .line 367
    .line 368
    const-class v30, Ljava/lang/String;

    .line 369
    .line 370
    const-class v31, Ljava/lang/String;

    .line 371
    .line 372
    const-class v32, Ljava/lang/String;

    .line 373
    .line 374
    const-class v33, Ljava/lang/String;

    .line 375
    .line 376
    filled-new-array/range {v28 .. v35}, [Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    invoke-virtual {v8, v12, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-static {v4}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    const/4 v10, 0x0

    .line 389
    invoke-virtual {v4, v10}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    new-array v13, v13, [I

    .line 394
    .line 395
    fill-array-data v13, :array_0

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, v13}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    const/4 v15, 0x1

    .line 407
    if-eqz v22, :cond_2

    .line 408
    .line 409
    new-array v4, v15, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 410
    .line 411
    aput-object v25, v4, v10

    .line 412
    .line 413
    invoke-interface {v3, v6, v9, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    const/4 v4, 0x2

    .line 418
    new-array v9, v4, [Ljava/lang/reflect/Type;

    .line 419
    .line 420
    aput-object v8, v9, v10

    .line 421
    .line 422
    aput-object v7, v9, v15

    .line 423
    .line 424
    invoke-interface {v3, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-static/range {v22 .. v22}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    invoke-virtual {v4, v10}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    filled-new-array {v15}, [I

    .line 437
    .line 438
    .line 439
    move-result-object v9

    .line 440
    invoke-virtual {v4, v9}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    :cond_2
    :try_start_1
    new-array v4, v15, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 449
    .line 450
    aput-object v25, v4, v10
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 451
    .line 452
    :try_start_2
    invoke-interface {v3, v0, v11, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 453
    .line 454
    .line 455
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 456
    const/4 v9, 0x2

    .line 457
    :try_start_3
    new-array v13, v9, [Ljava/lang/reflect/Type;

    .line 458
    .line 459
    aput-object v8, v13, v10

    .line 460
    .line 461
    aput-object v7, v13, v15

    .line 462
    .line 463
    invoke-interface {v4, v13}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    invoke-virtual {v8, v0, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 472
    .line 473
    .line 474
    move-result-object v9

    .line 475
    invoke-static {v9}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    const/4 v10, 0x0

    .line 480
    invoke-virtual {v9, v10}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    .line 481
    .line 482
    .line 483
    move-result-object v9

    .line 484
    const/16 v18, 0x1

    .line 485
    .line 486
    filled-new-array/range {v18 .. v18}, [I

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    invoke-virtual {v9, v10}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 491
    .line 492
    .line 493
    move-result-object v9

    .line 494
    invoke-interface {v4, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 495
    .line 496
    .line 497
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_1

    .line 498
    goto :goto_1

    .line 499
    :catch_1
    const/4 v15, 0x1

    .line 500
    :catch_2
    new-array v4, v15, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 501
    .line 502
    sget-object v9, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 503
    .line 504
    const/16 v20, 0x0

    .line 505
    .line 506
    aput-object v9, v4, v20

    .line 507
    .line 508
    invoke-interface {v3, v0, v11, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    const/4 v4, 0x2

    .line 513
    new-array v4, v4, [Ljava/lang/reflect/Type;

    .line 514
    .line 515
    aput-object v8, v4, v20

    .line 516
    .line 517
    aput-object v7, v4, v15

    .line 518
    .line 519
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    invoke-static/range {v20 .. v20}, Lnet/bytebuddy/implementation/FixedValue;->argument(I)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    :goto_1
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    sget-object v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    .line 536
    .line 537
    new-instance v9, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$ForUnsafeInjection;

    .line 538
    .line 539
    invoke-direct {v9}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$ForUnsafeInjection;-><init>()V

    .line 540
    .line 541
    .line 542
    invoke-interface {v3, v4, v9}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    new-instance v28, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;

    .line 551
    .line 552
    const-string v4, "allocateInstance"

    .line 553
    .line 554
    filled-new-array/range {v26 .. v26}, [Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    move-result-object v9

    .line 558
    invoke-virtual {v1, v4, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v29

    .line 570
    filled-new-array {v8, v7}, [Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {v3, v14, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 575
    .line 576
    .line 577
    move-result-object v30

    .line 578
    sget-object v34, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 579
    .line 580
    const-class v36, Ljava/security/ProtectionDomain;

    .line 581
    .line 582
    const-class v31, Ljava/lang/ClassLoader;

    .line 583
    .line 584
    const-class v32, Ljava/lang/String;

    .line 585
    .line 586
    const-class v33, [B

    .line 587
    .line 588
    move-object/from16 v35, v34

    .line 589
    .line 590
    filled-new-array/range {v31 .. v36}, [Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    move-object/from16 v2, v27

    .line 595
    .line 596
    invoke-virtual {v3, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 597
    .line 598
    .line 599
    move-result-object v31

    .line 600
    if-eqz v22, :cond_3

    .line 601
    .line 602
    filled-new-array {v8, v7}, [Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-virtual {v3, v6, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    move-object/from16 v32, v4

    .line 611
    .line 612
    goto :goto_2

    .line 613
    :cond_3
    const/16 v32, 0x0

    .line 614
    .line 615
    :goto_2
    filled-new-array {v8, v7}, [Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-virtual {v3, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 620
    .line 621
    .line 622
    move-result-object v33

    .line 623
    const-class v20, Ljava/lang/String;

    .line 624
    .line 625
    const-class v21, Ljava/net/URL;

    .line 626
    .line 627
    const-class v13, Ljava/lang/ClassLoader;

    .line 628
    .line 629
    const-class v14, Ljava/lang/String;

    .line 630
    .line 631
    const-class v15, Ljava/lang/String;

    .line 632
    .line 633
    const-class v16, Ljava/lang/String;

    .line 634
    .line 635
    const-class v17, Ljava/lang/String;

    .line 636
    .line 637
    const-class v18, Ljava/lang/String;

    .line 638
    .line 639
    const-class v19, Ljava/lang/String;

    .line 640
    .line 641
    filled-new-array/range {v13 .. v21}, [Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    invoke-virtual {v3, v12, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 646
    .line 647
    .line 648
    move-result-object v34

    .line 649
    filled-new-array {v8, v7}, [Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 654
    .line 655
    .line 656
    move-result-object v35

    .line 657
    invoke-direct/range {v28 .. v35}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 658
    .line 659
    .line 660
    return-object v28

    .line 661
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
    .end array-data
.end method


# virtual methods
.method public defineClass(Ljava/lang/ClassLoader;Ljava/lang/String;[BLjava/security/ProtectionDomain;)Ljava/lang/Class;
    .locals 9
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "[B",
            "Ljava/security/ProtectionDomain;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    array-length v2, p3

    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    move-object v3, p1

    .line 17
    move-object v4, p2

    .line 18
    move-object v5, p3

    .line 19
    move-object v8, p4

    .line 20
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    return-object p0

    .line 31
    :catch_0
    move-exception v0

    .line 32
    move-object p0, v0

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception v0

    .line 35
    move-object p0, v0

    .line 36
    goto :goto_1

    .line 37
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :goto_1
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method public definePackage(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package;
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p9    # Ljava/net/URL;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 4
    .line 5
    filled-new-array/range {p1 .. p9}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Package;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    move-object p0, v0

    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :catch_1
    move-exception v0

    .line 28
    move-object p0, v0

    .line 29
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0
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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    .line 78
    .line 79
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_9

    .line 97
    .line 98
    return v1

    .line 99
    :cond_9
    return v0
.end method

.method public findClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 4
    .line 5
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :catch_1
    move-exception p0

    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0
.end method

.method public getClassLoadingLock(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 4
    .line 5
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catch_1
    move-exception p0

    .line 25
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0
.end method

.method public getDefinedPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    :try_start_0
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 11
    .line 12
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Package;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :catch_1
    move-exception p0

    .line 34
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0
.end method

.method public getPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 4
    .line 5
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Package;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :catch_1
    move-exception p0

    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v1, v0

    .line 54
    mul-int/lit8 v1, v1, 0x1f

    .line 55
    .line 56
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    add-int/2addr v0, v1

    .line 63
    mul-int/lit8 v0, v0, 0x1f

    .line 64
    .line 65
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    add-int/2addr p0, v0

    .line 72
    return p0
.end method

.method public initialize()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;
    .locals 3

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->access$000()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;->getSecurityManager()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->access$100()Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;->SUPPRESS_ACCESS_CHECKS:Ljava/security/Permission;

    .line 16
    .line 17
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :catch_0
    move-exception p0

    .line 26
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :catch_1
    move-exception p0

    .line 37
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_0
    return-object p0
.end method

.method public isAvailable()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
