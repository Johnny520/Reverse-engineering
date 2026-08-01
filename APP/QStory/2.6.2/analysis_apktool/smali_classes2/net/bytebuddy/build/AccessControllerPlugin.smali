.class public Lnet/bytebuddy/build/AccessControllerPlugin;
.super Lnet/bytebuddy/build/Plugin$ForElementMatcher;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;,
        Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;,
        Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Ljava/lang/String; = "java.security.AccessController"

.field private static final EMPTY:[Ljava/lang/Object;

.field private static final NAME:Ljava/lang/String; = "ACCESS_CONTROLLER"

.field private static final SIGNATURES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final property:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v1, Lnet/bytebuddy/build/AccessControllerPlugin;->EMPTY:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lnet/bytebuddy/build/AccessControllerPlugin;->SIGNATURES:Ljava/util/Map;

    .line 12
    .line 13
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 14
    .line 15
    const-class v3, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-class v5, Ljava/security/PrivilegedAction;

    .line 22
    .line 23
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const/4 v7, 0x1

    .line 28
    new-array v8, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 29
    .line 30
    aput-object v6, v8, v0

    .line 31
    .line 32
    const-string v6, "doPrivileged"

    .line 33
    .line 34
    invoke-direct {v2, v6, v4, v8}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 38
    .line 39
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    new-array v10, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 48
    .line 49
    aput-object v9, v10, v0

    .line 50
    .line 51
    invoke-direct {v4, v6, v8, v10}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 58
    .line 59
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    new-array v9, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    aput-object v8, v9, v0

    .line 70
    .line 71
    const-string v8, "doPrivilegedWithCombiner"

    .line 72
    .line 73
    invoke-direct {v2, v8, v4, v9}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 74
    .line 75
    .line 76
    new-instance v4, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 77
    .line 78
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    new-array v11, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 87
    .line 88
    aput-object v10, v11, v0

    .line 89
    .line 90
    invoke-direct {v4, v8, v9, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 97
    .line 98
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    const/4 v11, 0x2

    .line 111
    new-array v12, v11, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 112
    .line 113
    aput-object v9, v12, v0

    .line 114
    .line 115
    aput-object v10, v12, v7

    .line 116
    .line 117
    invoke-direct {v2, v6, v4, v12}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 118
    .line 119
    .line 120
    new-instance v4, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 121
    .line 122
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    sget-object v12, Lnet/bytebuddy/utility/JavaType;->ACCESS_CONTROL_CONTEXT:Lnet/bytebuddy/utility/JavaType;

    .line 131
    .line 132
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    new-array v14, v11, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 137
    .line 138
    aput-object v10, v14, v0

    .line 139
    .line 140
    aput-object v13, v14, v7

    .line 141
    .line 142
    invoke-direct {v4, v6, v9, v14}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 149
    .line 150
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    const-class v13, [Ljava/security/Permission;

    .line 163
    .line 164
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    const/4 v15, 0x3

    .line 169
    move/from16 v16, v0

    .line 170
    .line 171
    new-array v0, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 172
    .line 173
    aput-object v9, v0, v16

    .line 174
    .line 175
    aput-object v10, v0, v7

    .line 176
    .line 177
    aput-object v14, v0, v11

    .line 178
    .line 179
    invoke-direct {v2, v6, v4, v0}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 180
    .line 181
    .line 182
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 183
    .line 184
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    move/from16 v17, v11

    .line 201
    .line 202
    new-array v11, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 203
    .line 204
    aput-object v9, v11, v16

    .line 205
    .line 206
    aput-object v10, v11, v7

    .line 207
    .line 208
    aput-object v14, v11, v17

    .line 209
    .line 210
    invoke-direct {v0, v6, v4, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 217
    .line 218
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    new-array v11, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 235
    .line 236
    aput-object v4, v11, v16

    .line 237
    .line 238
    aput-object v9, v11, v7

    .line 239
    .line 240
    aput-object v10, v11, v17

    .line 241
    .line 242
    invoke-direct {v0, v8, v2, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 246
    .line 247
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    new-array v11, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 264
    .line 265
    aput-object v5, v11, v16

    .line 266
    .line 267
    aput-object v9, v11, v7

    .line 268
    .line 269
    aput-object v10, v11, v17

    .line 270
    .line 271
    invoke-direct {v2, v8, v4, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 278
    .line 279
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    const-class v4, Ljava/security/PrivilegedExceptionAction;

    .line 284
    .line 285
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    new-array v9, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 290
    .line 291
    aput-object v5, v9, v16

    .line 292
    .line 293
    invoke-direct {v0, v6, v2, v9}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 294
    .line 295
    .line 296
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 297
    .line 298
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    new-array v10, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 307
    .line 308
    aput-object v9, v10, v16

    .line 309
    .line 310
    invoke-direct {v2, v6, v5, v10}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 317
    .line 318
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    new-array v9, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 327
    .line 328
    aput-object v5, v9, v16

    .line 329
    .line 330
    invoke-direct {v0, v8, v2, v9}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 331
    .line 332
    .line 333
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 334
    .line 335
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    new-array v10, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 344
    .line 345
    aput-object v9, v10, v16

    .line 346
    .line 347
    invoke-direct {v2, v8, v5, v10}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 354
    .line 355
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    move/from16 v10, v17

    .line 368
    .line 369
    new-array v11, v10, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 370
    .line 371
    aput-object v5, v11, v16

    .line 372
    .line 373
    aput-object v9, v11, v7

    .line 374
    .line 375
    invoke-direct {v0, v6, v2, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 376
    .line 377
    .line 378
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 379
    .line 380
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    new-array v14, v10, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 393
    .line 394
    aput-object v9, v14, v16

    .line 395
    .line 396
    aput-object v11, v14, v7

    .line 397
    .line 398
    invoke-direct {v2, v6, v5, v14}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 405
    .line 406
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 419
    .line 420
    .line 421
    move-result-object v10

    .line 422
    new-array v11, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 423
    .line 424
    aput-object v5, v11, v16

    .line 425
    .line 426
    aput-object v9, v11, v7

    .line 427
    .line 428
    const/16 v17, 0x2

    .line 429
    .line 430
    aput-object v10, v11, v17

    .line 431
    .line 432
    invoke-direct {v0, v6, v2, v11}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 433
    .line 434
    .line 435
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 436
    .line 437
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 450
    .line 451
    .line 452
    move-result-object v11

    .line 453
    new-array v14, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 454
    .line 455
    aput-object v9, v14, v16

    .line 456
    .line 457
    aput-object v10, v14, v7

    .line 458
    .line 459
    aput-object v11, v14, v17

    .line 460
    .line 461
    invoke-direct {v2, v6, v5, v14}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 468
    .line 469
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    new-array v10, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 486
    .line 487
    aput-object v5, v10, v16

    .line 488
    .line 489
    aput-object v6, v10, v7

    .line 490
    .line 491
    aput-object v9, v10, v17

    .line 492
    .line 493
    invoke-direct {v0, v8, v2, v10}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 494
    .line 495
    .line 496
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 497
    .line 498
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 511
    .line 512
    .line 513
    move-result-object v9

    .line 514
    new-array v10, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 515
    .line 516
    aput-object v4, v10, v16

    .line 517
    .line 518
    aput-object v6, v10, v7

    .line 519
    .line 520
    aput-object v9, v10, v17

    .line 521
    .line 522
    invoke-direct {v2, v8, v5, v10}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 523
    .line 524
    .line 525
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 529
    .line 530
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    move/from16 v3, v16

    .line 535
    .line 536
    new-array v4, v3, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 537
    .line 538
    const-string v5, "getContext"

    .line 539
    .line 540
    invoke-direct {v0, v5, v2, v4}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 541
    .line 542
    .line 543
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 544
    .line 545
    invoke-virtual {v12}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    new-array v6, v3, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 550
    .line 551
    invoke-direct {v2, v5, v4, v6}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 552
    .line 553
    .line 554
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 558
    .line 559
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 560
    .line 561
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    const-class v5, Ljava/security/Permission;

    .line 566
    .line 567
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 568
    .line 569
    .line 570
    move-result-object v6

    .line 571
    new-array v8, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 572
    .line 573
    aput-object v6, v8, v3

    .line 574
    .line 575
    const-string v6, "checkPermission"

    .line 576
    .line 577
    invoke-direct {v0, v6, v4, v8}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 578
    .line 579
    .line 580
    new-instance v4, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 581
    .line 582
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 587
    .line 588
    .line 589
    move-result-object v5

    .line 590
    new-array v7, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 591
    .line 592
    aput-object v5, v7, v3

    .line 593
    .line 594
    invoke-direct {v4, v6, v2, v7}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 595
    .line 596
    .line 597
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0}, Lnet/bytebuddy/build/AccessControllerPlugin;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;
        value = 0x7fffffff
    .end annotation

    .line 1
    const-class v0, Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic access$000()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/AccessControllerPlugin;->SIGNATURES:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    const-string p3, "ACCESS_CONTROLLER"

    .line 2
    .line 3
    :goto_0
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lnet/bytebuddy/description/field/FieldList;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const-string v0, "$"

    .line 24
    .line 25
    invoke-virtual {p3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x3

    .line 31
    new-array v0, v0, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 32
    .line 33
    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    aput-object v1, v0, v2

    .line 37
    .line 38
    sget-object v1, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    aput-object v1, v0, v3

    .line 42
    .line 43
    sget-object v1, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    aput-object v1, v0, v4

    .line 47
    .line 48
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-interface {p1, p3, v1, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 55
    .line 56
    invoke-direct {v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;-><init>()V

    .line 57
    .line 58
    .line 59
    const-class v1, Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;

    .line 60
    .line 61
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v4, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;

    .line 66
    .line 67
    invoke-direct {v4, p3}, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-array v3, v3, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    .line 71
    .line 72
    aput-object v4, v3, v2

    .line 73
    .line 74
    invoke-virtual {v0, v1, v3}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;->method(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {p1, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->visit(Lnet/bytebuddy/asm/AsmVisitorWrapper;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p0, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    .line 83
    .line 84
    if-nez p0, :cond_1

    .line 85
    .line 86
    new-instance p0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithoutProperty;

    .line 87
    .line 88
    invoke-direct {p0, p2, p3}, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithoutProperty;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    new-instance v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithProperty;

    .line 93
    .line 94
    invoke-direct {v0, p2, p3, p0}, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithProperty;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object p0, v0

    .line 98
    :goto_1
    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->initializer(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;->equals(Ljava/lang/Object;)Z

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
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/build/AccessControllerPlugin;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    if-eqz p0, :cond_5

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_6

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    if-eqz p0, :cond_6

    .line 45
    .line 46
    :cond_5
    return v1

    .line 47
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/build/AccessControllerPlugin;->property:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0

    .line 17
    :cond_0
    return v0
.end method

.method public make()Lnet/bytebuddy/build/Plugin;
    .locals 0

    .line 1
    return-object p0
.end method
