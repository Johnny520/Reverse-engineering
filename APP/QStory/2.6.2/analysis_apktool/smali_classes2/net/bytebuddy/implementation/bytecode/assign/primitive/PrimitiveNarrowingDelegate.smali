.class public final enum Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

.field public static final enum SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;


# instance fields
.field private final toBooleanStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final toByteStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final toCharacterStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final toDoubleStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final toFloatStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final toIntegerStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final toLongStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final toShortStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 2
    .line 3
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 4
    .line 5
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Illegal;

    .line 6
    .line 7
    const-string v1, "BOOLEAN"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move-object v5, v4

    .line 11
    move-object v6, v4

    .line 12
    move-object v7, v4

    .line 13
    move-object v8, v4

    .line 14
    move-object v9, v4

    .line 15
    move-object v10, v4

    .line 16
    invoke-direct/range {v0 .. v10}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 20
    .line 21
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 22
    .line 23
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 24
    .line 25
    const/16 v12, 0x92

    .line 26
    .line 27
    filled-new-array {v12}, [I

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v13, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 32
    .line 33
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-direct {v7, v2, v5}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 38
    .line 39
    .line 40
    const-string v2, "BYTE"

    .line 41
    .line 42
    move-object v5, v3

    .line 43
    const/4 v3, 0x1

    .line 44
    move-object v11, v4

    .line 45
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 46
    .line 47
    .line 48
    move-object v14, v1

    .line 49
    move-object v3, v5

    .line 50
    sput-object v14, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 51
    .line 52
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 53
    .line 54
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 55
    .line 56
    const/16 v15, 0x91

    .line 57
    .line 58
    filled-new-array {v15}, [I

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-direct {v5, v2, v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 67
    .line 68
    .line 69
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 70
    .line 71
    filled-new-array {v12}, [I

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-direct {v7, v2, v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 80
    .line 81
    .line 82
    const-string v2, "SHORT"

    .line 83
    .line 84
    move-object v6, v3

    .line 85
    const/4 v3, 0x2

    .line 86
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 87
    .line 88
    .line 89
    move-object/from16 v16, v1

    .line 90
    .line 91
    move-object v3, v6

    .line 92
    sput-object v16, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 93
    .line 94
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 95
    .line 96
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 97
    .line 98
    filled-new-array {v15}, [I

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-direct {v5, v2, v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 107
    .line 108
    .line 109
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 110
    .line 111
    const/16 v2, 0x93

    .line 112
    .line 113
    filled-new-array {v2}, [I

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-direct {v6, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 122
    .line 123
    .line 124
    move v7, v2

    .line 125
    const-string v2, "CHARACTER"

    .line 126
    .line 127
    move-object v8, v3

    .line 128
    const/4 v3, 0x3

    .line 129
    move-object v9, v8

    .line 130
    move-object v8, v4

    .line 131
    move-object v10, v9

    .line 132
    move-object v9, v4

    .line 133
    move-object v11, v10

    .line 134
    move-object v10, v4

    .line 135
    move/from16 v17, v7

    .line 136
    .line 137
    move-object v7, v11

    .line 138
    move-object v11, v4

    .line 139
    move/from16 v18, v17

    .line 140
    .line 141
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 142
    .line 143
    .line 144
    move-object/from16 v17, v1

    .line 145
    .line 146
    move-object v3, v7

    .line 147
    sput-object v17, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 148
    .line 149
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 150
    .line 151
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 152
    .line 153
    filled-new-array {v15}, [I

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-direct {v5, v2, v6}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 162
    .line 163
    .line 164
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 165
    .line 166
    filled-new-array/range {v18 .. v18}, [I

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-direct {v6, v2, v7}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 175
    .line 176
    .line 177
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 178
    .line 179
    filled-new-array {v12}, [I

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-direct {v7, v2, v8}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 188
    .line 189
    .line 190
    const-string v2, "INTEGER"

    .line 191
    .line 192
    move-object v8, v3

    .line 193
    const/4 v3, 0x4

    .line 194
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v19, v1

    .line 198
    .line 199
    move-object v3, v8

    .line 200
    sput-object v19, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 201
    .line 202
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 203
    .line 204
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 205
    .line 206
    const/16 v2, 0x88

    .line 207
    .line 208
    filled-new-array {v2, v15}, [I

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    sget-object v20, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 213
    .line 214
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-direct {v5, v6, v7}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 219
    .line 220
    .line 221
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 222
    .line 223
    move/from16 v7, v18

    .line 224
    .line 225
    filled-new-array {v2, v7}, [I

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-direct {v6, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 234
    .line 235
    .line 236
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 237
    .line 238
    filled-new-array {v2, v12}, [I

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-direct {v7, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 247
    .line 248
    .line 249
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 250
    .line 251
    filled-new-array {v2}, [I

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-direct {v8, v2, v9}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 260
    .line 261
    .line 262
    const-string v2, "LONG"

    .line 263
    .line 264
    move-object v9, v3

    .line 265
    const/4 v3, 0x5

    .line 266
    move/from16 v12, v18

    .line 267
    .line 268
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 269
    .line 270
    .line 271
    move-object/from16 v18, v1

    .line 272
    .line 273
    move-object v3, v9

    .line 274
    sput-object v18, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 275
    .line 276
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 277
    .line 278
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 279
    .line 280
    const/16 v2, 0x8b

    .line 281
    .line 282
    filled-new-array {v2, v15}, [I

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-direct {v5, v6, v7}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 291
    .line 292
    .line 293
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 294
    .line 295
    filled-new-array {v2, v12}, [I

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-direct {v6, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 304
    .line 305
    .line 306
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 307
    .line 308
    const/16 v8, 0x92

    .line 309
    .line 310
    filled-new-array {v2, v8}, [I

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    invoke-direct {v7, v9, v8}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 319
    .line 320
    .line 321
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 322
    .line 323
    filled-new-array {v2}, [I

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-direct {v8, v2, v9}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 332
    .line 333
    .line 334
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 335
    .line 336
    const/16 v2, 0x8c

    .line 337
    .line 338
    filled-new-array {v2}, [I

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    invoke-direct {v9, v2, v10}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 347
    .line 348
    .line 349
    const-string v2, "FLOAT"

    .line 350
    .line 351
    move-object v10, v3

    .line 352
    const/4 v3, 0x6

    .line 353
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 354
    .line 355
    .line 356
    move-object/from16 v21, v1

    .line 357
    .line 358
    move-object v3, v10

    .line 359
    sput-object v21, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 360
    .line 361
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 362
    .line 363
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 364
    .line 365
    const/16 v2, 0x8e

    .line 366
    .line 367
    filled-new-array {v2, v15}, [I

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-direct {v5, v6, v7}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 376
    .line 377
    .line 378
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 379
    .line 380
    filled-new-array {v2, v12}, [I

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    invoke-direct {v6, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 389
    .line 390
    .line 391
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 392
    .line 393
    const/16 v8, 0x92

    .line 394
    .line 395
    filled-new-array {v2, v8}, [I

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-direct {v7, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 404
    .line 405
    .line 406
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 407
    .line 408
    filled-new-array {v2}, [I

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    invoke-direct {v8, v2, v9}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 417
    .line 418
    .line 419
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 420
    .line 421
    const/16 v2, 0x8f

    .line 422
    .line 423
    filled-new-array {v2}, [I

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 428
    .line 429
    .line 430
    move-result-object v10

    .line 431
    invoke-direct {v9, v2, v10}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 432
    .line 433
    .line 434
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;

    .line 435
    .line 436
    const/16 v2, 0x90

    .line 437
    .line 438
    filled-new-array {v2}, [I

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-virtual/range {v20 .. v20}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 443
    .line 444
    .line 445
    move-result-object v11

    .line 446
    invoke-direct {v10, v2, v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate$NarrowingStackManipulation;-><init>([ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 447
    .line 448
    .line 449
    const-string v2, "DOUBLE"

    .line 450
    .line 451
    move-object v11, v3

    .line 452
    const/4 v3, 0x7

    .line 453
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 454
    .line 455
    .line 456
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 457
    .line 458
    move-object v7, v1

    .line 459
    move-object v1, v14

    .line 460
    move-object/from16 v2, v16

    .line 461
    .line 462
    move-object/from16 v3, v17

    .line 463
    .line 464
    move-object/from16 v5, v18

    .line 465
    .line 466
    move-object/from16 v4, v19

    .line 467
    .line 468
    move-object/from16 v6, v21

    .line 469
    .line 470
    filled-new-array/range {v0 .. v7}, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 475
    .line 476
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toBooleanStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toByteStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 7
    .line 8
    iput-object p5, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toShortStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 9
    .line 10
    iput-object p6, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toCharacterStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 11
    .line 12
    iput-object p7, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toIntegerStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 13
    .line 14
    iput-object p8, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toLongStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 15
    .line 16
    iput-object p9, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toFloatStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 17
    .line 18
    iput-object p10, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toDoubleStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 19
    .line 20
    return-void
.end method

.method public static forPrimitive(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_7
    const-string v0, "Not a primitive, non-void type: "

    .line 90
    .line 91
    invoke-static {p0, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public narrowTo(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toBooleanStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toByteStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toShortStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toCharacterStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toIntegerStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toLongStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toFloatStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveNarrowingDelegate;->toDoubleStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_7
    const-string p0, "Not a primitive non-void type: "

    .line 90
    .line 91
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    return-object p0
.end method
