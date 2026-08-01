.class public final enum Lnet/bytebuddy/matcher/ModifierMatcher$Mode;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/matcher/ModifierMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/matcher/ModifierMatcher$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum ABSTRACT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum ANNOTATION:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum BRIDGE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum ENUMERATION:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum FINAL:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum INTERFACE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum MANDATED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum NATIVE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum PRIVATE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum PROTECTED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum PUBLIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum STATIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum STRICT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum SYNCHRONIZED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum SYNTHETIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum TRANSIENT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum VAR_ARGS:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

.field public static final enum VOLATILE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;


# instance fields
.field private final description:Ljava/lang/String;

.field private final matcher:Lnet/bytebuddy/matcher/ModifierMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ModifierMatcher<",
            "*>;"
        }
    .end annotation
.end field

.field private final modifiers:I


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v1, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    const-string v0, "isPublic()"

    .line 4
    .line 5
    const-string v2, "PUBLIC"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-direct {v1, v2, v3, v4, v0}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->PUBLIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 13
    .line 14
    new-instance v2, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 15
    .line 16
    const-string v0, "isProtected()"

    .line 17
    .line 18
    const-string v3, "PROTECTED"

    .line 19
    .line 20
    const/4 v5, 0x4

    .line 21
    invoke-direct {v2, v3, v4, v5, v0}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->PROTECTED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 25
    .line 26
    new-instance v3, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    const-string v4, "isPrivate()"

    .line 30
    .line 31
    const-string v6, "PRIVATE"

    .line 32
    .line 33
    invoke-direct {v3, v6, v0, v0, v4}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v3, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->PRIVATE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 37
    .line 38
    new-instance v4, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 39
    .line 40
    const-string v0, "isFinal()"

    .line 41
    .line 42
    const-string v6, "FINAL"

    .line 43
    .line 44
    const/4 v7, 0x3

    .line 45
    const/16 v8, 0x10

    .line 46
    .line 47
    invoke-direct {v4, v6, v7, v8, v0}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v4, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->FINAL:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 51
    .line 52
    new-instance v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 53
    .line 54
    const-string v6, "isStatic()"

    .line 55
    .line 56
    const-string v7, "STATIC"

    .line 57
    .line 58
    const/16 v9, 0x8

    .line 59
    .line 60
    invoke-direct {v0, v7, v5, v9, v6}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->STATIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 64
    .line 65
    new-instance v6, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 66
    .line 67
    const/16 v5, 0x20

    .line 68
    .line 69
    const-string v7, "isSynchronized()"

    .line 70
    .line 71
    const-string v10, "SYNCHRONIZED"

    .line 72
    .line 73
    const/4 v11, 0x5

    .line 74
    invoke-direct {v6, v10, v11, v5, v7}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sput-object v6, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->SYNCHRONIZED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 78
    .line 79
    new-instance v7, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 80
    .line 81
    const/16 v5, 0x100

    .line 82
    .line 83
    const-string v10, "isNative()"

    .line 84
    .line 85
    const-string v11, "NATIVE"

    .line 86
    .line 87
    const/4 v12, 0x6

    .line 88
    invoke-direct {v7, v11, v12, v5, v10}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sput-object v7, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->NATIVE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 92
    .line 93
    new-instance v5, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 94
    .line 95
    const/16 v10, 0x800

    .line 96
    .line 97
    const-string v11, "isStrict()"

    .line 98
    .line 99
    const-string v12, "STRICT"

    .line 100
    .line 101
    const/4 v13, 0x7

    .line 102
    invoke-direct {v5, v12, v13, v10, v11}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sput-object v5, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->STRICT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 106
    .line 107
    new-instance v10, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 108
    .line 109
    const-string v11, "isVarArgs()"

    .line 110
    .line 111
    const-string v12, "VAR_ARGS"

    .line 112
    .line 113
    const/16 v13, 0x80

    .line 114
    .line 115
    invoke-direct {v10, v12, v9, v13, v11}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    sput-object v10, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->VAR_ARGS:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 119
    .line 120
    move-object v9, v10

    .line 121
    new-instance v10, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 122
    .line 123
    const/16 v11, 0x1000

    .line 124
    .line 125
    const-string v12, "isSynthetic()"

    .line 126
    .line 127
    const-string v14, "SYNTHETIC"

    .line 128
    .line 129
    const/16 v15, 0x9

    .line 130
    .line 131
    invoke-direct {v10, v14, v15, v11, v12}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sput-object v10, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->SYNTHETIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 135
    .line 136
    new-instance v11, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 137
    .line 138
    const-string v12, "isBridge()"

    .line 139
    .line 140
    const-string v14, "BRIDGE"

    .line 141
    .line 142
    const/16 v15, 0xa

    .line 143
    .line 144
    const/16 v8, 0x40

    .line 145
    .line 146
    invoke-direct {v11, v14, v15, v8, v12}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    sput-object v11, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->BRIDGE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 150
    .line 151
    new-instance v12, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 152
    .line 153
    const/16 v14, 0x400

    .line 154
    .line 155
    const-string v15, "isAbstract()"

    .line 156
    .line 157
    const-string v13, "ABSTRACT"

    .line 158
    .line 159
    const/16 v8, 0xb

    .line 160
    .line 161
    invoke-direct {v12, v13, v8, v14, v15}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    sput-object v12, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->ABSTRACT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 165
    .line 166
    new-instance v13, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 167
    .line 168
    const/16 v8, 0x200

    .line 169
    .line 170
    const-string v14, "isInterface()"

    .line 171
    .line 172
    const-string v15, "INTERFACE"

    .line 173
    .line 174
    move-object/from16 v19, v0

    .line 175
    .line 176
    const/16 v0, 0xc

    .line 177
    .line 178
    invoke-direct {v13, v15, v0, v8, v14}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 179
    .line 180
    .line 181
    sput-object v13, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->INTERFACE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 182
    .line 183
    new-instance v14, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 184
    .line 185
    const/16 v0, 0x2000

    .line 186
    .line 187
    const-string v8, "isAnnotation()"

    .line 188
    .line 189
    const-string v15, "ANNOTATION"

    .line 190
    .line 191
    move-object/from16 v20, v1

    .line 192
    .line 193
    const/16 v1, 0xd

    .line 194
    .line 195
    invoke-direct {v14, v15, v1, v0, v8}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    sput-object v14, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->ANNOTATION:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 199
    .line 200
    new-instance v15, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 201
    .line 202
    const/16 v0, 0xe

    .line 203
    .line 204
    const-string v1, "isVolatile()"

    .line 205
    .line 206
    const-string v8, "VOLATILE"

    .line 207
    .line 208
    move-object/from16 v21, v2

    .line 209
    .line 210
    const/16 v2, 0x40

    .line 211
    .line 212
    invoke-direct {v15, v8, v0, v2, v1}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    sput-object v15, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->VOLATILE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 216
    .line 217
    new-instance v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 218
    .line 219
    const/16 v1, 0xf

    .line 220
    .line 221
    const-string v2, "isTransient()"

    .line 222
    .line 223
    const-string v8, "TRANSIENT"

    .line 224
    .line 225
    move-object/from16 v18, v3

    .line 226
    .line 227
    const/16 v3, 0x80

    .line 228
    .line 229
    invoke-direct {v0, v8, v1, v3, v2}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 230
    .line 231
    .line 232
    sput-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->TRANSIENT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 233
    .line 234
    new-instance v1, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 235
    .line 236
    const v2, 0x8000

    .line 237
    .line 238
    .line 239
    const-string v3, "isMandated()"

    .line 240
    .line 241
    const-string v8, "MANDATED"

    .line 242
    .line 243
    move-object/from16 v17, v0

    .line 244
    .line 245
    const/16 v0, 0x10

    .line 246
    .line 247
    invoke-direct {v1, v8, v0, v2, v3}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    sput-object v1, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->MANDATED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 251
    .line 252
    new-instance v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 253
    .line 254
    const/16 v2, 0x4000

    .line 255
    .line 256
    const-string v3, "isEnum()"

    .line 257
    .line 258
    const-string v8, "ENUMERATION"

    .line 259
    .line 260
    move-object/from16 v16, v1

    .line 261
    .line 262
    const/16 v1, 0x11

    .line 263
    .line 264
    invoke-direct {v0, v8, v1, v2, v3}, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    sput-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->ENUMERATION:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 268
    .line 269
    move-object/from16 v1, v17

    .line 270
    .line 271
    move-object/from16 v17, v16

    .line 272
    .line 273
    move-object/from16 v16, v1

    .line 274
    .line 275
    move-object v8, v5

    .line 276
    move-object/from16 v3, v18

    .line 277
    .line 278
    move-object/from16 v5, v19

    .line 279
    .line 280
    move-object/from16 v1, v20

    .line 281
    .line 282
    move-object/from16 v2, v21

    .line 283
    .line 284
    move-object/from16 v18, v0

    .line 285
    .line 286
    filled-new-array/range {v1 .. v18}, [Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    sput-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->$VALUES:[Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 291
    .line 292
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->modifiers:I

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->description:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p1, Lnet/bytebuddy/matcher/ModifierMatcher;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lnet/bytebuddy/matcher/ModifierMatcher;-><init>(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->matcher:Lnet/bytebuddy/matcher/ModifierMatcher;

    .line 14
    .line 15
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/matcher/ModifierMatcher$Mode;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/matcher/ModifierMatcher$Mode;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->$VALUES:[Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMatcher()Lnet/bytebuddy/matcher/ModifierMatcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/matcher/ModifierMatcher<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->matcher:Lnet/bytebuddy/matcher/ModifierMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->modifiers:I

    .line 2
    .line 3
    return p0
.end method
