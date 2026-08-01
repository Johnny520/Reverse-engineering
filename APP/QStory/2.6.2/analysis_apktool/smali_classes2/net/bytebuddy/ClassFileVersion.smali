.class public Lnet/bytebuddy/ClassFileVersion;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/ClassFileVersion$VersionLocator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lnet/bytebuddy/ClassFileVersion;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final BASE_VERSION:I = 0x2c

.field private static final CLASS_FILE_VERSIONS:[Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V1:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V10:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V11:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V12:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V13:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V14:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V15:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V16:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V17:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V18:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V19:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V2:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V20:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V21:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V22:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V23:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V24:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V25:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V26:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V3:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V4:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V6:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V7:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V8:Lnet/bytebuddy/ClassFileVersion;

.field public static final JAVA_V9:Lnet/bytebuddy/ClassFileVersion;

.field private static final VERSION_LOCATOR:Lnet/bytebuddy/ClassFileVersion$VersionLocator;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final versionNumber:I


# direct methods
.method static constructor <clinit>()V
    .locals 27

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/ClassFileVersion;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/ClassFileVersion;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    new-instance v1, Lnet/bytebuddy/ClassFileVersion;

    .line 27
    .line 28
    const v0, 0x3002d

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V1:Lnet/bytebuddy/ClassFileVersion;

    .line 35
    .line 36
    new-instance v2, Lnet/bytebuddy/ClassFileVersion;

    .line 37
    .line 38
    const/16 v0, 0x2e

    .line 39
    .line 40
    invoke-direct {v2, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sput-object v2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V2:Lnet/bytebuddy/ClassFileVersion;

    .line 44
    .line 45
    new-instance v3, Lnet/bytebuddy/ClassFileVersion;

    .line 46
    .line 47
    const/16 v0, 0x2f

    .line 48
    .line 49
    invoke-direct {v3, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 50
    .line 51
    .line 52
    sput-object v3, Lnet/bytebuddy/ClassFileVersion;->JAVA_V3:Lnet/bytebuddy/ClassFileVersion;

    .line 53
    .line 54
    new-instance v4, Lnet/bytebuddy/ClassFileVersion;

    .line 55
    .line 56
    const/16 v0, 0x30

    .line 57
    .line 58
    invoke-direct {v4, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 59
    .line 60
    .line 61
    sput-object v4, Lnet/bytebuddy/ClassFileVersion;->JAVA_V4:Lnet/bytebuddy/ClassFileVersion;

    .line 62
    .line 63
    new-instance v5, Lnet/bytebuddy/ClassFileVersion;

    .line 64
    .line 65
    const/16 v0, 0x31

    .line 66
    .line 67
    invoke-direct {v5, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sput-object v5, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    .line 71
    .line 72
    new-instance v6, Lnet/bytebuddy/ClassFileVersion;

    .line 73
    .line 74
    const/16 v0, 0x32

    .line 75
    .line 76
    invoke-direct {v6, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 77
    .line 78
    .line 79
    sput-object v6, Lnet/bytebuddy/ClassFileVersion;->JAVA_V6:Lnet/bytebuddy/ClassFileVersion;

    .line 80
    .line 81
    new-instance v7, Lnet/bytebuddy/ClassFileVersion;

    .line 82
    .line 83
    const/16 v0, 0x33

    .line 84
    .line 85
    invoke-direct {v7, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 86
    .line 87
    .line 88
    sput-object v7, Lnet/bytebuddy/ClassFileVersion;->JAVA_V7:Lnet/bytebuddy/ClassFileVersion;

    .line 89
    .line 90
    new-instance v8, Lnet/bytebuddy/ClassFileVersion;

    .line 91
    .line 92
    const/16 v0, 0x34

    .line 93
    .line 94
    invoke-direct {v8, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 95
    .line 96
    .line 97
    sput-object v8, Lnet/bytebuddy/ClassFileVersion;->JAVA_V8:Lnet/bytebuddy/ClassFileVersion;

    .line 98
    .line 99
    new-instance v9, Lnet/bytebuddy/ClassFileVersion;

    .line 100
    .line 101
    const/16 v0, 0x35

    .line 102
    .line 103
    invoke-direct {v9, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 104
    .line 105
    .line 106
    sput-object v9, Lnet/bytebuddy/ClassFileVersion;->JAVA_V9:Lnet/bytebuddy/ClassFileVersion;

    .line 107
    .line 108
    new-instance v10, Lnet/bytebuddy/ClassFileVersion;

    .line 109
    .line 110
    const/16 v0, 0x36

    .line 111
    .line 112
    invoke-direct {v10, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 113
    .line 114
    .line 115
    sput-object v10, Lnet/bytebuddy/ClassFileVersion;->JAVA_V10:Lnet/bytebuddy/ClassFileVersion;

    .line 116
    .line 117
    new-instance v11, Lnet/bytebuddy/ClassFileVersion;

    .line 118
    .line 119
    const/16 v0, 0x37

    .line 120
    .line 121
    invoke-direct {v11, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 122
    .line 123
    .line 124
    sput-object v11, Lnet/bytebuddy/ClassFileVersion;->JAVA_V11:Lnet/bytebuddy/ClassFileVersion;

    .line 125
    .line 126
    new-instance v12, Lnet/bytebuddy/ClassFileVersion;

    .line 127
    .line 128
    const/16 v0, 0x38

    .line 129
    .line 130
    invoke-direct {v12, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 131
    .line 132
    .line 133
    sput-object v12, Lnet/bytebuddy/ClassFileVersion;->JAVA_V12:Lnet/bytebuddy/ClassFileVersion;

    .line 134
    .line 135
    new-instance v13, Lnet/bytebuddy/ClassFileVersion;

    .line 136
    .line 137
    const/16 v0, 0x39

    .line 138
    .line 139
    invoke-direct {v13, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 140
    .line 141
    .line 142
    sput-object v13, Lnet/bytebuddy/ClassFileVersion;->JAVA_V13:Lnet/bytebuddy/ClassFileVersion;

    .line 143
    .line 144
    new-instance v14, Lnet/bytebuddy/ClassFileVersion;

    .line 145
    .line 146
    const/16 v0, 0x3a

    .line 147
    .line 148
    invoke-direct {v14, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 149
    .line 150
    .line 151
    sput-object v14, Lnet/bytebuddy/ClassFileVersion;->JAVA_V14:Lnet/bytebuddy/ClassFileVersion;

    .line 152
    .line 153
    new-instance v15, Lnet/bytebuddy/ClassFileVersion;

    .line 154
    .line 155
    const/16 v0, 0x3b

    .line 156
    .line 157
    invoke-direct {v15, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 158
    .line 159
    .line 160
    sput-object v15, Lnet/bytebuddy/ClassFileVersion;->JAVA_V15:Lnet/bytebuddy/ClassFileVersion;

    .line 161
    .line 162
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 163
    .line 164
    move-object/from16 v16, v1

    .line 165
    .line 166
    const/16 v1, 0x3c

    .line 167
    .line 168
    invoke-direct {v0, v1}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 169
    .line 170
    .line 171
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V16:Lnet/bytebuddy/ClassFileVersion;

    .line 172
    .line 173
    new-instance v1, Lnet/bytebuddy/ClassFileVersion;

    .line 174
    .line 175
    move-object/from16 v17, v0

    .line 176
    .line 177
    const/16 v0, 0x3d

    .line 178
    .line 179
    invoke-direct {v1, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 180
    .line 181
    .line 182
    sput-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V17:Lnet/bytebuddy/ClassFileVersion;

    .line 183
    .line 184
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 185
    .line 186
    move-object/from16 v18, v1

    .line 187
    .line 188
    const/16 v1, 0x3e

    .line 189
    .line 190
    invoke-direct {v0, v1}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 191
    .line 192
    .line 193
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V18:Lnet/bytebuddy/ClassFileVersion;

    .line 194
    .line 195
    new-instance v1, Lnet/bytebuddy/ClassFileVersion;

    .line 196
    .line 197
    move-object/from16 v19, v0

    .line 198
    .line 199
    const/16 v0, 0x3f

    .line 200
    .line 201
    invoke-direct {v1, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 202
    .line 203
    .line 204
    sput-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V19:Lnet/bytebuddy/ClassFileVersion;

    .line 205
    .line 206
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 207
    .line 208
    move-object/from16 v20, v1

    .line 209
    .line 210
    const/16 v1, 0x40

    .line 211
    .line 212
    invoke-direct {v0, v1}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 213
    .line 214
    .line 215
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V20:Lnet/bytebuddy/ClassFileVersion;

    .line 216
    .line 217
    new-instance v1, Lnet/bytebuddy/ClassFileVersion;

    .line 218
    .line 219
    move-object/from16 v21, v0

    .line 220
    .line 221
    const/16 v0, 0x41

    .line 222
    .line 223
    invoke-direct {v1, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 224
    .line 225
    .line 226
    sput-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V21:Lnet/bytebuddy/ClassFileVersion;

    .line 227
    .line 228
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 229
    .line 230
    move-object/from16 v22, v1

    .line 231
    .line 232
    const/16 v1, 0x42

    .line 233
    .line 234
    invoke-direct {v0, v1}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 235
    .line 236
    .line 237
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V22:Lnet/bytebuddy/ClassFileVersion;

    .line 238
    .line 239
    new-instance v1, Lnet/bytebuddy/ClassFileVersion;

    .line 240
    .line 241
    move-object/from16 v23, v0

    .line 242
    .line 243
    const/16 v0, 0x43

    .line 244
    .line 245
    invoke-direct {v1, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 246
    .line 247
    .line 248
    sput-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V23:Lnet/bytebuddy/ClassFileVersion;

    .line 249
    .line 250
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 251
    .line 252
    move-object/from16 v24, v1

    .line 253
    .line 254
    const/16 v1, 0x44

    .line 255
    .line 256
    invoke-direct {v0, v1}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 257
    .line 258
    .line 259
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V24:Lnet/bytebuddy/ClassFileVersion;

    .line 260
    .line 261
    new-instance v1, Lnet/bytebuddy/ClassFileVersion;

    .line 262
    .line 263
    move-object/from16 v25, v0

    .line 264
    .line 265
    const/16 v0, 0x45

    .line 266
    .line 267
    invoke-direct {v1, v0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 268
    .line 269
    .line 270
    sput-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V25:Lnet/bytebuddy/ClassFileVersion;

    .line 271
    .line 272
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 273
    .line 274
    move-object/from16 v26, v1

    .line 275
    .line 276
    const/16 v1, 0x46

    .line 277
    .line 278
    invoke-direct {v0, v1}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 279
    .line 280
    .line 281
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V26:Lnet/bytebuddy/ClassFileVersion;

    .line 282
    .line 283
    move-object/from16 v1, v16

    .line 284
    .line 285
    move-object/from16 v16, v17

    .line 286
    .line 287
    move-object/from16 v17, v18

    .line 288
    .line 289
    move-object/from16 v18, v19

    .line 290
    .line 291
    move-object/from16 v19, v20

    .line 292
    .line 293
    move-object/from16 v20, v21

    .line 294
    .line 295
    move-object/from16 v21, v22

    .line 296
    .line 297
    move-object/from16 v22, v23

    .line 298
    .line 299
    move-object/from16 v23, v24

    .line 300
    .line 301
    move-object/from16 v24, v25

    .line 302
    .line 303
    move-object/from16 v25, v26

    .line 304
    .line 305
    move-object/from16 v26, v0

    .line 306
    .line 307
    filled-new-array/range {v1 .. v26}, [Lnet/bytebuddy/ClassFileVersion;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->CLASS_FILE_VERSIONS:[Lnet/bytebuddy/ClassFileVersion;

    .line 312
    .line 313
    sget-object v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;->INSTANCE:Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 314
    .line 315
    invoke-static {v0}, Lnet/bytebuddy/ClassFileVersion;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator;

    .line 320
    .line 321
    sput-object v0, Lnet/bytebuddy/ClassFileVersion;->VERSION_LOCATOR:Lnet/bytebuddy/ClassFileVersion$VersionLocator;

    .line 322
    .line 323
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 5
    .line 6
    return-void
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/ClassFileVersion;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static latest()Lnet/bytebuddy/ClassFileVersion;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V26:Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    return-object v0
.end method

.method public static of(Ljava/lang/Class;)Lnet/bytebuddy/ClassFileVersion;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/ClassFileVersion;"
        }
    .end annotation

    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bytebuddy/ClassFileVersion;->of(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/ClassFileVersion;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Class;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/ClassFileVersion;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/ClassFileVersion;"
        }
    .end annotation

    .line 18
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0, p1}, Lnet/bytebuddy/ClassFileVersion;->of(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/ClassFileVersion;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/ClassFileVersion;
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lnet/bytebuddy/ClassFileVersion;->ofClassFile([B)Lnet/bytebuddy/ClassFileVersion;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static ofClassFile([B)Lnet/bytebuddy/ClassFileVersion;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x7

    .line 3
    if-lt v0, v1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    aget-byte v0, p0, v0

    .line 7
    .line 8
    shl-int/lit8 v0, v0, 0x18

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    aget-byte v2, p0, v2

    .line 12
    .line 13
    shl-int/lit8 v2, v2, 0x10

    .line 14
    .line 15
    or-int/2addr v0, v2

    .line 16
    const/4 v2, 0x6

    .line 17
    aget-byte v2, p0, v2

    .line 18
    .line 19
    shl-int/lit8 v2, v2, 0x8

    .line 20
    .line 21
    or-int/2addr v0, v2

    .line 22
    aget-byte p0, p0, v1

    .line 23
    .line 24
    or-int/2addr p0, v0

    .line 25
    invoke-static {p0}, Lnet/bytebuddy/ClassFileVersion;->ofMinorMajor(I)Lnet/bytebuddy/ClassFileVersion;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "Supplied byte array is too short to be a class file with "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    array-length p0, p0

    .line 38
    const-string v1, " byte"

    .line 39
    .line 40
    invoke-static {v0, v1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public static ofJavaVersion(I)Lnet/bytebuddy/ClassFileVersion;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_1

    .line 3
    .line 4
    add-int/lit8 v0, p0, -0x1

    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/ClassFileVersion;->CLASS_FILE_VERSIONS:[Lnet/bytebuddy/ClassFileVersion;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    aget-object p0, v1, v0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 15
    .line 16
    add-int/lit8 p0, p0, 0x2c

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    const-string v0, "Java version must be positive: "

    .line 23
    .line 24
    invoke-static {p0, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static ofJavaVersionString(Ljava/lang/String;)Lnet/bytebuddy/ClassFileVersion;
    .locals 4

    .line 1
    const-string v0, "Java versions with minor version must be of format 1.[1-7]: "

    .line 2
    .line 3
    const/16 v1, 0x2e

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v3, 0x1

    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    const/16 v1, 0x8

    .line 42
    .line 43
    if-gt v2, v1, :cond_1

    .line 44
    .line 45
    move v0, v2

    .line 46
    :goto_0
    invoke-static {v0}, Lnet/bytebuddy/ClassFileVersion;->ofJavaVersion(I)Lnet/bytebuddy/ClassFileVersion;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :goto_1
    const-string v1, "Failed to read Java version from: "

    .line 62
    .line 63
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0
.end method

.method public static ofMinorMajor(I)Lnet/bytebuddy/ClassFileVersion;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-lez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x2c

    .line 17
    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "Class version "

    .line 22
    .line 23
    const-string v1, " is not valid"

    .line 24
    .line 25
    invoke-static {p0, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static ofThisVm()Lnet/bytebuddy/ClassFileVersion;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->VERSION_LOCATOR:Lnet/bytebuddy/ClassFileVersion$VersionLocator;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/ClassFileVersion$VersionLocator;->resolve()Lnet/bytebuddy/ClassFileVersion;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;
    .locals 0

    .line 8
    :try_start_0
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm()Lnet/bytebuddy/ClassFileVersion;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method


# virtual methods
.method public asPreviewVersion()Lnet/bytebuddy/ClassFileVersion;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    iget p0, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 4
    .line 5
    const/high16 v1, -0x10000

    .line 6
    .line 7
    or-int/2addr p0, v1

    .line 8
    invoke-direct {v0, p0}, Lnet/bytebuddy/ClassFileVersion;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 35
    check-cast p1, Lnet/bytebuddy/ClassFileVersion;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/ClassFileVersion;->compareTo(Lnet/bytebuddy/ClassFileVersion;)I

    move-result p0

    return p0
.end method

.method public compareTo(Lnet/bytebuddy/ClassFileVersion;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/ClassFileVersion;->getMinorVersion()S

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1}, Lnet/bytebuddy/ClassFileVersion;->getMinorVersion()S

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    :goto_0
    sub-int/2addr p0, p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p1}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->signum(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
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
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget p0, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 20
    .line 21
    check-cast p1, Lnet/bytebuddy/ClassFileVersion;

    .line 22
    .line 23
    iget p1, p1, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 24
    .line 25
    if-ne p0, p1, :cond_2

    .line 26
    .line 27
    return v0

    .line 28
    :cond_2
    :goto_0
    return v1
.end method

.method public getJavaVersion()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/ClassFileVersion;->getMajorVersion()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/lit8 p0, p0, -0x2c

    .line 6
    .line 7
    return p0
.end method

.method public getMajorVersion()S
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 2
    .line 3
    const v0, 0xffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v0

    .line 7
    int-to-short p0, p0

    .line 8
    return p0
.end method

.method public getMinorMajorVersion()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinorVersion()S
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 2
    .line 3
    ushr-int/lit8 p0, p0, 0x10

    .line 4
    .line 5
    int-to-short p0, p0

    .line 6
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 2
    .line 3
    return p0
.end method

.method public isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ClassFileVersion;->compareTo(Lnet/bytebuddy/ClassFileVersion;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, -0x1

    .line 6
    if-le p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public isAtMost(Lnet/bytebuddy/ClassFileVersion;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ClassFileVersion;->compareTo(Lnet/bytebuddy/ClassFileVersion;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x1

    .line 6
    if-ge p0, p1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isGreaterThan(Lnet/bytebuddy/ClassFileVersion;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ClassFileVersion;->compareTo(Lnet/bytebuddy/ClassFileVersion;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-lez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isLessThan(Lnet/bytebuddy/ClassFileVersion;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ClassFileVersion;->compareTo(Lnet/bytebuddy/ClassFileVersion;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isPreviewVersion()Z
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/ClassFileVersion;->versionNumber:I

    .line 2
    .line 3
    const/high16 v0, -0x10000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Java "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/ClassFileVersion;->getJavaVersion()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " ("

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/ClassFileVersion;->getMinorMajorVersion()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, ")"

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
