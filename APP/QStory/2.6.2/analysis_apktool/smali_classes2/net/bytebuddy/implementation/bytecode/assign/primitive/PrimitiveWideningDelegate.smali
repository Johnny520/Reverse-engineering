.class public final enum Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

.field public static final enum SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;


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
    .locals 19

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    invoke-direct/range {v0 .. v10}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 20
    .line 21
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 22
    .line 23
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 24
    .line 25
    sget-object v12, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 26
    .line 27
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/16 v13, 0x85

    .line 32
    .line 33
    invoke-direct {v9, v13, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 34
    .line 35
    .line 36
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 37
    .line 38
    sget-object v14, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 39
    .line 40
    invoke-virtual {v14}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/16 v15, 0x86

    .line 45
    .line 46
    invoke-direct {v10, v15, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 47
    .line 48
    .line 49
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 50
    .line 51
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v11, v13, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 56
    .line 57
    .line 58
    const-string v2, "BYTE"

    .line 59
    .line 60
    move-object v5, v3

    .line 61
    const/4 v3, 0x1

    .line 62
    move-object v6, v5

    .line 63
    move-object v8, v5

    .line 64
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v16, v1

    .line 68
    .line 69
    move-object v3, v5

    .line 70
    sput-object v16, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 71
    .line 72
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 73
    .line 74
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 75
    .line 76
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-direct {v9, v13, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 81
    .line 82
    .line 83
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 84
    .line 85
    invoke-virtual {v14}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-direct {v10, v15, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 90
    .line 91
    .line 92
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 93
    .line 94
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const/16 v5, 0x87

    .line 99
    .line 100
    invoke-direct {v11, v5, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 101
    .line 102
    .line 103
    const-string v2, "SHORT"

    .line 104
    .line 105
    move-object v6, v3

    .line 106
    const/4 v3, 0x2

    .line 107
    move v7, v5

    .line 108
    move-object v5, v4

    .line 109
    move v8, v7

    .line 110
    move-object v7, v4

    .line 111
    move/from16 v17, v8

    .line 112
    .line 113
    move-object v8, v6

    .line 114
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v17, v1

    .line 118
    .line 119
    move-object v3, v6

    .line 120
    sput-object v17, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 121
    .line 122
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 123
    .line 124
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 125
    .line 126
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-direct {v9, v13, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 131
    .line 132
    .line 133
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 134
    .line 135
    invoke-virtual {v14}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-direct {v10, v15, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 140
    .line 141
    .line 142
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 143
    .line 144
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    const/16 v5, 0x87

    .line 149
    .line 150
    invoke-direct {v11, v5, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 151
    .line 152
    .line 153
    const-string v2, "CHARACTER"

    .line 154
    .line 155
    const/4 v3, 0x3

    .line 156
    move/from16 v18, v5

    .line 157
    .line 158
    move-object v5, v4

    .line 159
    move-object v7, v6

    .line 160
    move-object v6, v4

    .line 161
    move-object v8, v7

    .line 162
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 163
    .line 164
    .line 165
    move-object/from16 v18, v1

    .line 166
    .line 167
    move-object v3, v7

    .line 168
    sput-object v18, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 169
    .line 170
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 171
    .line 172
    new-instance v9, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 173
    .line 174
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-direct {v9, v13, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 179
    .line 180
    .line 181
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 182
    .line 183
    invoke-virtual {v14}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-direct {v10, v15, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 188
    .line 189
    .line 190
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 191
    .line 192
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const/16 v5, 0x87

    .line 197
    .line 198
    invoke-direct {v11, v5, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 199
    .line 200
    .line 201
    const-string v2, "INTEGER"

    .line 202
    .line 203
    move-object v6, v3

    .line 204
    const/4 v3, 0x4

    .line 205
    move-object v5, v4

    .line 206
    move-object v7, v6

    .line 207
    move-object v6, v4

    .line 208
    move-object v8, v7

    .line 209
    move-object v7, v4

    .line 210
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 211
    .line 212
    .line 213
    move-object v13, v1

    .line 214
    move-object v3, v8

    .line 215
    sput-object v13, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 216
    .line 217
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 218
    .line 219
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 220
    .line 221
    const/16 v2, 0x89

    .line 222
    .line 223
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-direct {v10, v2, v5}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 228
    .line 229
    .line 230
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 231
    .line 232
    const/16 v2, 0x8a

    .line 233
    .line 234
    invoke-virtual {v14}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-direct {v11, v2, v5}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 239
    .line 240
    .line 241
    const-string v2, "LONG"

    .line 242
    .line 243
    move-object v6, v3

    .line 244
    const/4 v3, 0x5

    .line 245
    move-object v5, v4

    .line 246
    move-object v7, v6

    .line 247
    move-object v6, v4

    .line 248
    move-object v8, v7

    .line 249
    move-object v7, v4

    .line 250
    move-object v9, v8

    .line 251
    move-object v8, v4

    .line 252
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 253
    .line 254
    .line 255
    move-object v14, v1

    .line 256
    move-object v3, v9

    .line 257
    sput-object v14, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 258
    .line 259
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 260
    .line 261
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;

    .line 262
    .line 263
    const/16 v2, 0x8d

    .line 264
    .line 265
    invoke-virtual {v12}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-direct {v11, v2, v5}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate$WideningStackManipulation;-><init>(ILnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)V

    .line 270
    .line 271
    .line 272
    const-string v2, "FLOAT"

    .line 273
    .line 274
    move-object v6, v3

    .line 275
    const/4 v3, 0x6

    .line 276
    move-object v5, v4

    .line 277
    move-object v7, v6

    .line 278
    move-object v6, v4

    .line 279
    move-object v8, v7

    .line 280
    move-object v7, v4

    .line 281
    move-object v9, v8

    .line 282
    move-object v8, v4

    .line 283
    move-object v10, v9

    .line 284
    move-object v9, v4

    .line 285
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 286
    .line 287
    .line 288
    move-object v12, v1

    .line 289
    move-object v3, v10

    .line 290
    sput-object v12, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 291
    .line 292
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 293
    .line 294
    const-string v2, "DOUBLE"

    .line 295
    .line 296
    move-object v6, v3

    .line 297
    const/4 v3, 0x7

    .line 298
    move-object v7, v6

    .line 299
    move-object v6, v4

    .line 300
    move-object v8, v7

    .line 301
    move-object v7, v4

    .line 302
    move-object v9, v8

    .line 303
    move-object v8, v4

    .line 304
    move-object v10, v9

    .line 305
    move-object v9, v4

    .line 306
    move-object v11, v10

    .line 307
    move-object v10, v4

    .line 308
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 309
    .line 310
    .line 311
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 312
    .line 313
    move-object v7, v1

    .line 314
    move-object v6, v12

    .line 315
    move-object v4, v13

    .line 316
    move-object v5, v14

    .line 317
    move-object/from16 v1, v16

    .line 318
    .line 319
    move-object/from16 v2, v17

    .line 320
    .line 321
    move-object/from16 v3, v18

    .line 322
    .line 323
    filled-new-array/range {v0 .. v7}, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 328
    .line 329
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
    iput-object p3, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toBooleanStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toByteStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 7
    .line 8
    iput-object p5, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toShortStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 9
    .line 10
    iput-object p6, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toCharacterStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 11
    .line 12
    iput-object p7, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toIntegerStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 13
    .line 14
    iput-object p8, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toLongStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 15
    .line 16
    iput-object p9, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toFloatStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 17
    .line 18
    iput-object p10, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toDoubleStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 19
    .line 20
    return-void
.end method

.method public static forPrimitive(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;
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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->BYTE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->SHORT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->INTEGER:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->LONG:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->FLOAT:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public widenTo(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toBooleanStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toByteStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toShortStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toCharacterStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toIntegerStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toLongStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toFloatStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveWideningDelegate;->toDoubleStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
