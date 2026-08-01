.class public final Lorg/luckypray/dexkit/util/OpCodeUtil;
.super Ljava/lang/Object;
.source "OpCodeUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lorg/luckypray/dexkit/util/OpCodeUtil;",
        "",
        "()V",
        "opFormat",
        "",
        "",
        "[Ljava/lang/String;",
        "opFormatMap",
        "",
        "",
        "getOpFormatMap",
        "()Ljava/util/Map;",
        "opFormatMap$delegate",
        "Lkotlin/Lazy;",
        "getOpCode",
        "getOpFormat",
        "opcode",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil;

.field private static final opFormat:[Ljava/lang/String;

.field private static final opFormatMap$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/luckypray/dexkit/util/OpCodeUtil;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/OpCodeUtil;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil;

    .line 27
    nop

    .line 28
    nop

    .line 29
    nop

    .line 28
    nop

    .line 30
    nop

    .line 28
    nop

    .line 31
    nop

    .line 28
    nop

    .line 32
    nop

    .line 28
    nop

    .line 33
    nop

    .line 28
    nop

    .line 34
    nop

    .line 28
    nop

    .line 35
    nop

    .line 28
    nop

    .line 36
    nop

    .line 28
    nop

    .line 37
    nop

    .line 28
    nop

    .line 38
    nop

    .line 28
    nop

    .line 39
    nop

    .line 28
    nop

    .line 40
    nop

    .line 28
    nop

    .line 41
    nop

    .line 28
    nop

    .line 42
    nop

    .line 28
    nop

    .line 43
    nop

    .line 28
    nop

    .line 44
    nop

    .line 28
    nop

    .line 45
    nop

    .line 28
    nop

    .line 46
    nop

    .line 28
    nop

    .line 47
    nop

    .line 28
    nop

    .line 48
    nop

    .line 28
    nop

    .line 49
    nop

    .line 28
    nop

    .line 50
    nop

    .line 28
    nop

    .line 51
    nop

    .line 28
    nop

    .line 52
    nop

    .line 28
    nop

    .line 53
    nop

    .line 28
    nop

    .line 54
    nop

    .line 28
    nop

    .line 55
    nop

    .line 28
    nop

    .line 56
    nop

    .line 28
    nop

    .line 57
    nop

    .line 28
    nop

    .line 58
    nop

    .line 28
    nop

    .line 59
    nop

    .line 28
    nop

    .line 60
    nop

    .line 28
    nop

    .line 61
    nop

    .line 28
    nop

    .line 62
    nop

    .line 28
    nop

    .line 63
    nop

    .line 28
    nop

    .line 64
    nop

    .line 28
    nop

    .line 65
    nop

    .line 28
    nop

    .line 66
    nop

    .line 28
    nop

    .line 67
    nop

    .line 28
    nop

    .line 68
    nop

    .line 28
    nop

    .line 69
    nop

    .line 28
    nop

    .line 70
    nop

    .line 28
    nop

    .line 71
    nop

    .line 28
    nop

    .line 72
    nop

    .line 28
    nop

    .line 73
    nop

    .line 28
    nop

    .line 74
    nop

    .line 28
    nop

    .line 75
    nop

    .line 28
    nop

    .line 76
    nop

    .line 28
    nop

    .line 77
    nop

    .line 28
    nop

    .line 78
    nop

    .line 28
    nop

    .line 79
    nop

    .line 28
    nop

    .line 80
    nop

    .line 28
    nop

    .line 81
    nop

    .line 28
    nop

    .line 82
    nop

    .line 28
    nop

    .line 83
    nop

    .line 28
    nop

    .line 84
    nop

    .line 28
    nop

    .line 85
    nop

    .line 28
    nop

    .line 86
    nop

    .line 28
    nop

    .line 87
    nop

    .line 28
    nop

    .line 88
    nop

    .line 28
    nop

    .line 89
    nop

    .line 28
    nop

    .line 90
    nop

    .line 28
    nop

    .line 91
    nop

    .line 28
    nop

    .line 92
    nop

    .line 28
    nop

    .line 93
    nop

    .line 28
    nop

    .line 94
    nop

    .line 28
    nop

    .line 95
    nop

    .line 28
    nop

    .line 96
    nop

    .line 28
    nop

    .line 97
    nop

    .line 28
    nop

    .line 98
    nop

    .line 28
    nop

    .line 99
    nop

    .line 28
    nop

    .line 100
    nop

    .line 28
    nop

    .line 101
    nop

    .line 28
    nop

    .line 102
    nop

    .line 28
    nop

    .line 103
    nop

    .line 28
    nop

    .line 104
    nop

    .line 28
    nop

    .line 105
    nop

    .line 28
    nop

    .line 106
    nop

    .line 28
    nop

    .line 107
    nop

    .line 28
    nop

    .line 108
    nop

    .line 28
    nop

    .line 109
    nop

    .line 28
    nop

    .line 110
    nop

    .line 28
    nop

    .line 111
    nop

    .line 28
    nop

    .line 112
    nop

    .line 28
    nop

    .line 113
    nop

    .line 28
    nop

    .line 114
    nop

    .line 28
    nop

    .line 115
    nop

    .line 28
    nop

    .line 116
    nop

    .line 28
    nop

    .line 117
    nop

    .line 28
    nop

    .line 118
    nop

    .line 28
    nop

    .line 119
    nop

    .line 28
    nop

    .line 120
    nop

    .line 28
    nop

    .line 121
    nop

    .line 28
    nop

    .line 122
    nop

    .line 28
    nop

    .line 123
    nop

    .line 28
    nop

    .line 124
    nop

    .line 28
    nop

    .line 125
    nop

    .line 28
    nop

    .line 126
    nop

    .line 28
    nop

    .line 127
    nop

    .line 28
    nop

    .line 128
    nop

    .line 28
    nop

    .line 129
    nop

    .line 28
    nop

    .line 130
    nop

    .line 28
    nop

    .line 131
    nop

    .line 28
    nop

    .line 132
    nop

    .line 28
    nop

    .line 133
    nop

    .line 28
    nop

    .line 134
    nop

    .line 28
    nop

    .line 135
    nop

    .line 28
    nop

    .line 136
    nop

    .line 28
    nop

    .line 137
    nop

    .line 28
    nop

    .line 138
    nop

    .line 28
    nop

    .line 139
    nop

    .line 28
    nop

    .line 140
    nop

    .line 28
    nop

    .line 141
    nop

    .line 28
    nop

    .line 142
    nop

    .line 28
    nop

    .line 143
    nop

    .line 28
    nop

    .line 144
    nop

    .line 28
    nop

    .line 145
    nop

    .line 28
    nop

    .line 146
    nop

    .line 28
    nop

    .line 147
    nop

    .line 28
    nop

    .line 148
    nop

    .line 28
    nop

    .line 149
    nop

    .line 28
    nop

    .line 150
    nop

    .line 28
    nop

    .line 151
    nop

    .line 28
    nop

    .line 152
    nop

    .line 28
    nop

    .line 153
    nop

    .line 28
    nop

    .line 154
    nop

    .line 28
    nop

    .line 155
    nop

    .line 28
    nop

    .line 156
    nop

    .line 28
    nop

    .line 157
    nop

    .line 28
    nop

    .line 158
    nop

    .line 28
    nop

    .line 159
    nop

    .line 28
    nop

    .line 160
    nop

    .line 28
    nop

    .line 161
    nop

    .line 28
    nop

    .line 162
    nop

    .line 28
    nop

    .line 163
    nop

    .line 28
    nop

    .line 164
    nop

    .line 28
    nop

    .line 165
    nop

    .line 28
    nop

    .line 166
    nop

    .line 28
    nop

    .line 167
    nop

    .line 28
    nop

    .line 168
    nop

    .line 28
    nop

    .line 169
    nop

    .line 28
    nop

    .line 170
    nop

    .line 28
    nop

    .line 171
    nop

    .line 28
    nop

    .line 172
    nop

    .line 28
    nop

    .line 173
    nop

    .line 28
    nop

    .line 174
    nop

    .line 28
    nop

    .line 175
    nop

    .line 28
    nop

    .line 176
    nop

    .line 28
    nop

    .line 177
    nop

    .line 28
    nop

    .line 178
    nop

    .line 28
    nop

    .line 179
    nop

    .line 28
    nop

    .line 180
    nop

    .line 28
    nop

    .line 181
    nop

    .line 28
    nop

    .line 182
    nop

    .line 28
    nop

    .line 183
    nop

    .line 28
    nop

    .line 184
    nop

    .line 28
    nop

    .line 185
    nop

    .line 28
    nop

    .line 186
    nop

    .line 28
    nop

    .line 187
    nop

    .line 28
    nop

    .line 188
    nop

    .line 28
    nop

    .line 189
    nop

    .line 28
    nop

    .line 190
    nop

    .line 28
    nop

    .line 191
    nop

    .line 28
    nop

    .line 192
    nop

    .line 28
    nop

    .line 193
    nop

    .line 28
    nop

    .line 194
    nop

    .line 28
    nop

    .line 195
    nop

    .line 28
    nop

    .line 196
    nop

    .line 28
    nop

    .line 197
    nop

    .line 28
    nop

    .line 198
    nop

    .line 28
    nop

    .line 199
    nop

    .line 28
    nop

    .line 200
    nop

    .line 28
    nop

    .line 201
    nop

    .line 28
    nop

    .line 202
    nop

    .line 28
    nop

    .line 203
    nop

    .line 28
    nop

    .line 204
    nop

    .line 28
    nop

    .line 205
    nop

    .line 28
    nop

    .line 206
    nop

    .line 28
    nop

    .line 207
    nop

    .line 28
    nop

    .line 208
    nop

    .line 28
    nop

    .line 209
    nop

    .line 28
    nop

    .line 210
    nop

    .line 28
    nop

    .line 211
    nop

    .line 28
    nop

    .line 212
    nop

    .line 28
    nop

    .line 213
    nop

    .line 28
    nop

    .line 214
    nop

    .line 28
    nop

    .line 215
    nop

    .line 28
    nop

    .line 216
    nop

    .line 28
    nop

    .line 217
    nop

    .line 28
    nop

    .line 218
    nop

    .line 28
    nop

    .line 219
    nop

    .line 28
    nop

    .line 220
    nop

    .line 28
    nop

    .line 221
    nop

    .line 28
    nop

    .line 222
    nop

    .line 28
    nop

    .line 223
    nop

    .line 28
    nop

    .line 224
    nop

    .line 28
    nop

    .line 225
    nop

    .line 28
    nop

    .line 226
    nop

    .line 28
    nop

    .line 227
    nop

    .line 28
    nop

    .line 228
    nop

    .line 28
    nop

    .line 229
    nop

    .line 28
    nop

    .line 230
    nop

    .line 28
    nop

    .line 231
    nop

    .line 28
    nop

    .line 232
    nop

    .line 28
    nop

    .line 233
    nop

    .line 28
    nop

    .line 234
    nop

    .line 28
    nop

    .line 235
    nop

    .line 28
    nop

    .line 236
    nop

    .line 28
    nop

    .line 237
    nop

    .line 28
    nop

    .line 238
    nop

    .line 28
    nop

    .line 239
    nop

    .line 28
    nop

    .line 240
    nop

    .line 28
    nop

    .line 241
    nop

    .line 28
    nop

    .line 242
    nop

    .line 28
    nop

    .line 243
    nop

    .line 28
    nop

    .line 244
    nop

    .line 28
    nop

    .line 245
    nop

    .line 28
    nop

    .line 246
    nop

    .line 28
    nop

    .line 247
    nop

    .line 28
    nop

    .line 248
    nop

    .line 28
    nop

    .line 249
    nop

    .line 28
    nop

    .line 250
    nop

    .line 28
    nop

    .line 251
    nop

    .line 28
    nop

    .line 252
    nop

    .line 28
    nop

    .line 253
    nop

    .line 28
    nop

    .line 254
    nop

    .line 28
    nop

    .line 255
    nop

    .line 28
    nop

    .line 256
    nop

    .line 28
    nop

    .line 257
    nop

    .line 28
    nop

    .line 258
    nop

    .line 28
    nop

    .line 259
    nop

    .line 28
    nop

    .line 260
    nop

    .line 28
    nop

    .line 261
    nop

    .line 28
    nop

    .line 262
    nop

    .line 28
    nop

    .line 263
    nop

    .line 28
    nop

    .line 264
    nop

    .line 28
    nop

    .line 265
    nop

    .line 28
    nop

    .line 266
    nop

    .line 28
    nop

    .line 267
    nop

    .line 28
    nop

    .line 268
    nop

    .line 28
    nop

    .line 269
    nop

    .line 28
    nop

    .line 270
    nop

    .line 28
    nop

    .line 271
    nop

    .line 28
    nop

    .line 272
    nop

    .line 28
    nop

    .line 273
    nop

    .line 28
    nop

    .line 274
    nop

    .line 28
    nop

    .line 275
    nop

    .line 28
    nop

    .line 276
    nop

    .line 28
    nop

    .line 277
    nop

    .line 28
    nop

    .line 278
    nop

    .line 28
    nop

    .line 279
    nop

    .line 28
    nop

    .line 280
    nop

    .line 28
    nop

    .line 281
    nop

    .line 28
    nop

    .line 282
    nop

    .line 28
    nop

    .line 283
    const/16 v0, 0x100

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "nop"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "move"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "move/from16"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "move/16"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "move-wide"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "move-wide/from16"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "move-wide/16"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "move-object"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "move-object/from16"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "move-object/16"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "move-result"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "move-result-wide"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "move-result-object"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "move-exception"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "return-void"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "return"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "return-wide"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "return-object"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "const/4"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "const/16"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "const"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "const/high16"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "const-wide/16"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "const-wide/32"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "const-wide"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "const-wide/high16"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "const-string"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "const-string/jumbo"

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "const-class"

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "monitor-enter"

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "monitor-exit"

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "check-cast"

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "instance-of"

    const/16 v2, 0x20

    aput-object v1, v0, v2

    const-string v1, "array-length"

    const/16 v2, 0x21

    aput-object v1, v0, v2

    const-string v1, "new-instance"

    const/16 v2, 0x22

    aput-object v1, v0, v2

    const-string v1, "new-array"

    const/16 v2, 0x23

    aput-object v1, v0, v2

    const-string v1, "filled-new-array"

    const/16 v2, 0x24

    aput-object v1, v0, v2

    const-string v1, "filled-new-array/range"

    const/16 v2, 0x25

    aput-object v1, v0, v2

    const-string v1, "fill-array-data"

    const/16 v2, 0x26

    aput-object v1, v0, v2

    const-string v1, "throw"

    const/16 v2, 0x27

    aput-object v1, v0, v2

    const-string v1, "goto"

    const/16 v2, 0x28

    aput-object v1, v0, v2

    const-string v1, "goto/16"

    const/16 v2, 0x29

    aput-object v1, v0, v2

    const-string v1, "goto/32"

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    const-string v1, "packed-switch"

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    const-string v1, "sparse-switch"

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    const-string v1, "cmpl-float"

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    const-string v1, "cmpg-float"

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    const-string v1, "cmpl-double"

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    const-string v1, "cmpg-double"

    const/16 v2, 0x30

    aput-object v1, v0, v2

    const-string v1, "cmp-long"

    const/16 v2, 0x31

    aput-object v1, v0, v2

    const-string v1, "if-eq"

    const/16 v2, 0x32

    aput-object v1, v0, v2

    const-string v1, "if-ne"

    const/16 v2, 0x33

    aput-object v1, v0, v2

    const-string v1, "if-lt"

    const/16 v2, 0x34

    aput-object v1, v0, v2

    const-string v1, "if-ge"

    const/16 v2, 0x35

    aput-object v1, v0, v2

    const-string v1, "if-gt"

    const/16 v2, 0x36

    aput-object v1, v0, v2

    const-string v1, "if-le"

    const/16 v2, 0x37

    aput-object v1, v0, v2

    const-string v1, "if-eqz"

    const/16 v2, 0x38

    aput-object v1, v0, v2

    const-string v1, "if-nez"

    const/16 v2, 0x39

    aput-object v1, v0, v2

    const-string v1, "if-ltz"

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    const-string v1, "if-gez"

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    const-string v1, "if-gtz"

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    const-string v1, "if-lez"

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    const-string v1, "unused-3e"

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    const-string v1, "unused-3f"

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    const-string v1, "unused-40"

    const/16 v2, 0x40

    aput-object v1, v0, v2

    const-string v1, "unused-41"

    const/16 v2, 0x41

    aput-object v1, v0, v2

    const-string v1, "unused-42"

    const/16 v2, 0x42

    aput-object v1, v0, v2

    const-string v1, "unused-43"

    const/16 v2, 0x43

    aput-object v1, v0, v2

    const-string v1, "aget"

    const/16 v2, 0x44

    aput-object v1, v0, v2

    const-string v1, "aget-wide"

    const/16 v2, 0x45

    aput-object v1, v0, v2

    const-string v1, "aget-object"

    const/16 v2, 0x46

    aput-object v1, v0, v2

    const-string v1, "aget-boolean"

    const/16 v2, 0x47

    aput-object v1, v0, v2

    const-string v1, "aget-byte"

    const/16 v2, 0x48

    aput-object v1, v0, v2

    const-string v1, "aget-char"

    const/16 v2, 0x49

    aput-object v1, v0, v2

    const-string v1, "aget-short"

    const/16 v2, 0x4a

    aput-object v1, v0, v2

    const-string v1, "aput"

    const/16 v2, 0x4b

    aput-object v1, v0, v2

    const-string v1, "aput-wide"

    const/16 v2, 0x4c

    aput-object v1, v0, v2

    const-string v1, "aput-object"

    const/16 v2, 0x4d

    aput-object v1, v0, v2

    const-string v1, "aput-boolean"

    const/16 v2, 0x4e

    aput-object v1, v0, v2

    const-string v1, "aput-byte"

    const/16 v2, 0x4f

    aput-object v1, v0, v2

    const-string v1, "aput-char"

    const/16 v2, 0x50

    aput-object v1, v0, v2

    const-string v1, "aput-short"

    const/16 v2, 0x51

    aput-object v1, v0, v2

    const-string v1, "iget"

    const/16 v2, 0x52

    aput-object v1, v0, v2

    const-string v1, "iget-wide"

    const/16 v2, 0x53

    aput-object v1, v0, v2

    const-string v1, "iget-object"

    const/16 v2, 0x54

    aput-object v1, v0, v2

    const-string v1, "iget-boolean"

    const/16 v2, 0x55

    aput-object v1, v0, v2

    const-string v1, "iget-byte"

    const/16 v2, 0x56

    aput-object v1, v0, v2

    const-string v1, "iget-char"

    const/16 v2, 0x57

    aput-object v1, v0, v2

    const-string v1, "iget-short"

    const/16 v2, 0x58

    aput-object v1, v0, v2

    const-string v1, "iput"

    const/16 v2, 0x59

    aput-object v1, v0, v2

    const-string v1, "iput-wide"

    const/16 v2, 0x5a

    aput-object v1, v0, v2

    const-string v1, "iput-object"

    const/16 v2, 0x5b

    aput-object v1, v0, v2

    const-string v1, "iput-boolean"

    const/16 v2, 0x5c

    aput-object v1, v0, v2

    const-string v1, "iput-byte"

    const/16 v2, 0x5d

    aput-object v1, v0, v2

    const-string v1, "iput-char"

    const/16 v2, 0x5e

    aput-object v1, v0, v2

    const-string v1, "iput-short"

    const/16 v2, 0x5f

    aput-object v1, v0, v2

    const-string v1, "sget"

    const/16 v2, 0x60

    aput-object v1, v0, v2

    const-string v1, "sget-wide"

    const/16 v2, 0x61

    aput-object v1, v0, v2

    const-string v1, "sget-object"

    const/16 v2, 0x62

    aput-object v1, v0, v2

    const-string v1, "sget-boolean"

    const/16 v2, 0x63

    aput-object v1, v0, v2

    const-string v1, "sget-byte"

    const/16 v2, 0x64

    aput-object v1, v0, v2

    const-string v1, "sget-char"

    const/16 v2, 0x65

    aput-object v1, v0, v2

    const-string v1, "sget-short"

    const/16 v2, 0x66

    aput-object v1, v0, v2

    const-string v1, "sput"

    const/16 v2, 0x67

    aput-object v1, v0, v2

    const-string v1, "sput-wide"

    const/16 v2, 0x68

    aput-object v1, v0, v2

    const-string v1, "sput-object"

    const/16 v2, 0x69

    aput-object v1, v0, v2

    const-string v1, "sput-boolean"

    const/16 v2, 0x6a

    aput-object v1, v0, v2

    const-string v1, "sput-byte"

    const/16 v2, 0x6b

    aput-object v1, v0, v2

    const-string v1, "sput-char"

    const/16 v2, 0x6c

    aput-object v1, v0, v2

    const-string v1, "sput-short"

    const/16 v2, 0x6d

    aput-object v1, v0, v2

    const-string v1, "invoke-virtual"

    const/16 v2, 0x6e

    aput-object v1, v0, v2

    const-string v1, "invoke-super"

    const/16 v2, 0x6f

    aput-object v1, v0, v2

    const-string v1, "invoke-direct"

    const/16 v2, 0x70

    aput-object v1, v0, v2

    const-string v1, "invoke-static"

    const/16 v2, 0x71

    aput-object v1, v0, v2

    const-string v1, "invoke-interface"

    const/16 v2, 0x72

    aput-object v1, v0, v2

    const-string v1, "return-void-no-barrier"

    const/16 v2, 0x73

    aput-object v1, v0, v2

    const-string v1, "invoke-virtual/range"

    const/16 v2, 0x74

    aput-object v1, v0, v2

    const-string v1, "invoke-super/range"

    const/16 v2, 0x75

    aput-object v1, v0, v2

    const-string v1, "invoke-direct/range"

    const/16 v2, 0x76

    aput-object v1, v0, v2

    const-string v1, "invoke-static/range"

    const/16 v2, 0x77

    aput-object v1, v0, v2

    const-string v1, "invoke-interface/range"

    const/16 v2, 0x78

    aput-object v1, v0, v2

    const-string v1, "unused-79"

    const/16 v2, 0x79

    aput-object v1, v0, v2

    const-string v1, "unused-7a"

    const/16 v2, 0x7a

    aput-object v1, v0, v2

    const-string v1, "neg-int"

    const/16 v2, 0x7b

    aput-object v1, v0, v2

    const-string v1, "not-int"

    const/16 v2, 0x7c

    aput-object v1, v0, v2

    const-string v1, "neg-long"

    const/16 v2, 0x7d

    aput-object v1, v0, v2

    const-string v1, "not-long"

    const/16 v2, 0x7e

    aput-object v1, v0, v2

    const-string v1, "neg-float"

    const/16 v2, 0x7f

    aput-object v1, v0, v2

    const-string v1, "neg-double"

    const/16 v2, 0x80

    aput-object v1, v0, v2

    const-string v1, "int-to-long"

    const/16 v2, 0x81

    aput-object v1, v0, v2

    const-string v1, "int-to-float"

    const/16 v2, 0x82

    aput-object v1, v0, v2

    const-string v1, "int-to-double"

    const/16 v2, 0x83

    aput-object v1, v0, v2

    const-string v1, "long-to-int"

    const/16 v2, 0x84

    aput-object v1, v0, v2

    const-string v1, "long-to-float"

    const/16 v2, 0x85

    aput-object v1, v0, v2

    const-string v1, "long-to-double"

    const/16 v2, 0x86

    aput-object v1, v0, v2

    const-string v1, "float-to-int"

    const/16 v2, 0x87

    aput-object v1, v0, v2

    const-string v1, "float-to-long"

    const/16 v2, 0x88

    aput-object v1, v0, v2

    const-string v1, "float-to-double"

    const/16 v2, 0x89

    aput-object v1, v0, v2

    const-string v1, "double-to-int"

    const/16 v2, 0x8a

    aput-object v1, v0, v2

    const-string v1, "double-to-long"

    const/16 v2, 0x8b

    aput-object v1, v0, v2

    const-string v1, "double-to-float"

    const/16 v2, 0x8c

    aput-object v1, v0, v2

    const-string v1, "int-to-byte"

    const/16 v2, 0x8d

    aput-object v1, v0, v2

    const-string v1, "int-to-char"

    const/16 v2, 0x8e

    aput-object v1, v0, v2

    const-string v1, "int-to-short"

    const/16 v2, 0x8f

    aput-object v1, v0, v2

    const-string v1, "add-int"

    const/16 v2, 0x90

    aput-object v1, v0, v2

    const-string v1, "sub-int"

    const/16 v2, 0x91

    aput-object v1, v0, v2

    const-string v1, "mul-int"

    const/16 v2, 0x92

    aput-object v1, v0, v2

    const-string v1, "div-int"

    const/16 v2, 0x93

    aput-object v1, v0, v2

    const-string v1, "rem-int"

    const/16 v2, 0x94

    aput-object v1, v0, v2

    const-string v1, "and-int"

    const/16 v2, 0x95

    aput-object v1, v0, v2

    const-string v1, "or-int"

    const/16 v2, 0x96

    aput-object v1, v0, v2

    const-string v1, "xor-int"

    const/16 v2, 0x97

    aput-object v1, v0, v2

    const-string v1, "shl-int"

    const/16 v2, 0x98

    aput-object v1, v0, v2

    const-string v1, "shr-int"

    const/16 v2, 0x99

    aput-object v1, v0, v2

    const-string v1, "ushr-int"

    const/16 v2, 0x9a

    aput-object v1, v0, v2

    const-string v1, "add-long"

    const/16 v2, 0x9b

    aput-object v1, v0, v2

    const-string v1, "sub-long"

    const/16 v2, 0x9c

    aput-object v1, v0, v2

    const-string v1, "mul-long"

    const/16 v2, 0x9d

    aput-object v1, v0, v2

    const-string v1, "div-long"

    const/16 v2, 0x9e

    aput-object v1, v0, v2

    const-string v1, "rem-long"

    const/16 v2, 0x9f

    aput-object v1, v0, v2

    const-string v1, "and-long"

    const/16 v2, 0xa0

    aput-object v1, v0, v2

    const-string v1, "or-long"

    const/16 v2, 0xa1

    aput-object v1, v0, v2

    const-string v1, "xor-long"

    const/16 v2, 0xa2

    aput-object v1, v0, v2

    const-string v1, "shl-long"

    const/16 v2, 0xa3

    aput-object v1, v0, v2

    const-string v1, "shr-long"

    const/16 v2, 0xa4

    aput-object v1, v0, v2

    const-string v1, "ushr-long"

    const/16 v2, 0xa5

    aput-object v1, v0, v2

    const-string v1, "add-float"

    const/16 v2, 0xa6

    aput-object v1, v0, v2

    const-string v1, "sub-float"

    const/16 v2, 0xa7

    aput-object v1, v0, v2

    const-string v1, "mul-float"

    const/16 v2, 0xa8

    aput-object v1, v0, v2

    const-string v1, "div-float"

    const/16 v2, 0xa9

    aput-object v1, v0, v2

    const-string v1, "rem-float"

    const/16 v2, 0xaa

    aput-object v1, v0, v2

    const-string v1, "add-double"

    const/16 v2, 0xab

    aput-object v1, v0, v2

    const-string v1, "sub-double"

    const/16 v2, 0xac

    aput-object v1, v0, v2

    const-string v1, "mul-double"

    const/16 v2, 0xad

    aput-object v1, v0, v2

    const-string v1, "div-double"

    const/16 v2, 0xae

    aput-object v1, v0, v2

    const-string v1, "rem-double"

    const/16 v2, 0xaf

    aput-object v1, v0, v2

    const-string v1, "add-int/2addr"

    const/16 v2, 0xb0

    aput-object v1, v0, v2

    const-string v1, "sub-int/2addr"

    const/16 v2, 0xb1

    aput-object v1, v0, v2

    const-string v1, "mul-int/2addr"

    const/16 v2, 0xb2

    aput-object v1, v0, v2

    const-string v1, "div-int/2addr"

    const/16 v2, 0xb3

    aput-object v1, v0, v2

    const-string v1, "rem-int/2addr"

    const/16 v2, 0xb4

    aput-object v1, v0, v2

    const-string v1, "and-int/2addr"

    const/16 v2, 0xb5

    aput-object v1, v0, v2

    const-string v1, "or-int/2addr"

    const/16 v2, 0xb6

    aput-object v1, v0, v2

    const-string v1, "xor-int/2addr"

    const/16 v2, 0xb7

    aput-object v1, v0, v2

    const-string v1, "shl-int/2addr"

    const/16 v2, 0xb8

    aput-object v1, v0, v2

    const-string v1, "shr-int/2addr"

    const/16 v2, 0xb9

    aput-object v1, v0, v2

    const-string v1, "ushr-int/2addr"

    const/16 v2, 0xba

    aput-object v1, v0, v2

    const-string v1, "add-long/2addr"

    const/16 v2, 0xbb

    aput-object v1, v0, v2

    const-string v1, "sub-long/2addr"

    const/16 v2, 0xbc

    aput-object v1, v0, v2

    const-string v1, "mul-long/2addr"

    const/16 v2, 0xbd

    aput-object v1, v0, v2

    const-string v1, "div-long/2addr"

    const/16 v2, 0xbe

    aput-object v1, v0, v2

    const-string v1, "rem-long/2addr"

    const/16 v2, 0xbf

    aput-object v1, v0, v2

    const-string v1, "and-long/2addr"

    const/16 v2, 0xc0

    aput-object v1, v0, v2

    const-string v1, "or-long/2addr"

    const/16 v2, 0xc1

    aput-object v1, v0, v2

    const-string v1, "xor-long/2addr"

    const/16 v2, 0xc2

    aput-object v1, v0, v2

    const-string v1, "shl-long/2addr"

    const/16 v2, 0xc3

    aput-object v1, v0, v2

    const-string v1, "shr-long/2addr"

    const/16 v2, 0xc4

    aput-object v1, v0, v2

    const-string v1, "ushr-long/2addr"

    const/16 v2, 0xc5

    aput-object v1, v0, v2

    const-string v1, "add-float/2addr"

    const/16 v2, 0xc6

    aput-object v1, v0, v2

    const-string v1, "sub-float/2addr"

    const/16 v2, 0xc7

    aput-object v1, v0, v2

    const-string v1, "mul-float/2addr"

    const/16 v2, 0xc8

    aput-object v1, v0, v2

    const-string v1, "div-float/2addr"

    const/16 v2, 0xc9

    aput-object v1, v0, v2

    const-string v1, "rem-float/2addr"

    const/16 v2, 0xca

    aput-object v1, v0, v2

    const-string v1, "add-double/2addr"

    const/16 v2, 0xcb

    aput-object v1, v0, v2

    const-string v1, "sub-double/2addr"

    const/16 v2, 0xcc

    aput-object v1, v0, v2

    const-string v1, "mul-double/2addr"

    const/16 v2, 0xcd

    aput-object v1, v0, v2

    const-string v1, "div-double/2addr"

    const/16 v2, 0xce

    aput-object v1, v0, v2

    const-string v1, "rem-double/2addr"

    const/16 v2, 0xcf

    aput-object v1, v0, v2

    const-string v1, "add-int/lit16"

    const/16 v2, 0xd0

    aput-object v1, v0, v2

    const-string v1, "rsub-int"

    const/16 v2, 0xd1

    aput-object v1, v0, v2

    const-string v1, "mul-int/lit16"

    const/16 v2, 0xd2

    aput-object v1, v0, v2

    const-string v1, "div-int/lit16"

    const/16 v2, 0xd3

    aput-object v1, v0, v2

    const-string v1, "rem-int/lit16"

    const/16 v2, 0xd4

    aput-object v1, v0, v2

    const-string v1, "and-int/lit16"

    const/16 v2, 0xd5

    aput-object v1, v0, v2

    const-string v1, "or-int/lit16"

    const/16 v2, 0xd6

    aput-object v1, v0, v2

    const-string v1, "xor-int/lit16"

    const/16 v2, 0xd7

    aput-object v1, v0, v2

    const-string v1, "add-int/lit8"

    const/16 v2, 0xd8

    aput-object v1, v0, v2

    const-string v1, "rsub-int/lit8"

    const/16 v2, 0xd9

    aput-object v1, v0, v2

    const-string v1, "mul-int/lit8"

    const/16 v2, 0xda

    aput-object v1, v0, v2

    const-string v1, "div-int/lit8"

    const/16 v2, 0xdb

    aput-object v1, v0, v2

    const-string v1, "rem-int/lit8"

    const/16 v2, 0xdc

    aput-object v1, v0, v2

    const-string v1, "and-int/lit8"

    const/16 v2, 0xdd

    aput-object v1, v0, v2

    const-string v1, "or-int/lit8"

    const/16 v2, 0xde

    aput-object v1, v0, v2

    const-string v1, "xor-int/lit8"

    const/16 v2, 0xdf

    aput-object v1, v0, v2

    const-string v1, "shl-int/lit8"

    const/16 v2, 0xe0

    aput-object v1, v0, v2

    const-string v1, "shr-int/lit8"

    const/16 v2, 0xe1

    aput-object v1, v0, v2

    const-string v1, "ushr-int/lit8"

    const/16 v2, 0xe2

    aput-object v1, v0, v2

    const-string v1, "iget-quick"

    const/16 v2, 0xe3

    aput-object v1, v0, v2

    const-string v1, "iget-wide-quick"

    const/16 v2, 0xe4

    aput-object v1, v0, v2

    const-string v1, "iget-object-quick"

    const/16 v2, 0xe5

    aput-object v1, v0, v2

    const-string v1, "iput-quick"

    const/16 v2, 0xe6

    aput-object v1, v0, v2

    const-string v1, "iput-wide-quick"

    const/16 v2, 0xe7

    aput-object v1, v0, v2

    const-string v1, "iput-object-quick"

    const/16 v2, 0xe8

    aput-object v1, v0, v2

    const-string v1, "invoke-virtual-quick"

    const/16 v2, 0xe9

    aput-object v1, v0, v2

    const-string v1, "invoke-virtual/range-quick"

    const/16 v2, 0xea

    aput-object v1, v0, v2

    const-string v1, "iput-boolean-quick"

    const/16 v2, 0xeb

    aput-object v1, v0, v2

    const-string v1, "iput-byte-quick"

    const/16 v2, 0xec

    aput-object v1, v0, v2

    const-string v1, "iput-char-quick"

    const/16 v2, 0xed

    aput-object v1, v0, v2

    const-string v1, "iput-short-quick"

    const/16 v2, 0xee

    aput-object v1, v0, v2

    const-string v1, "iget-boolean-quick"

    const/16 v2, 0xef

    aput-object v1, v0, v2

    const-string v1, "iget-byte-quick"

    const/16 v2, 0xf0

    aput-object v1, v0, v2

    const-string v1, "iget-char-quick"

    const/16 v2, 0xf1

    aput-object v1, v0, v2

    const-string v1, "iget-short-quick"

    const/16 v2, 0xf2

    aput-object v1, v0, v2

    const-string v1, "unused-f3"

    const/16 v2, 0xf3

    aput-object v1, v0, v2

    const-string v1, "unused-f4"

    const/16 v2, 0xf4

    aput-object v1, v0, v2

    const-string v1, "unused-f5"

    const/16 v2, 0xf5

    aput-object v1, v0, v2

    const-string v1, "unused-f6"

    const/16 v2, 0xf6

    aput-object v1, v0, v2

    const-string v1, "unused-f7"

    const/16 v2, 0xf7

    aput-object v1, v0, v2

    const-string v1, "unused-f8"

    const/16 v2, 0xf8

    aput-object v1, v0, v2

    const-string v1, "unused-f9"

    const/16 v2, 0xf9

    aput-object v1, v0, v2

    const-string v1, "invoke-polymorphic"

    const/16 v2, 0xfa

    aput-object v1, v0, v2

    const-string v1, "invoke-polymorphic/range"

    const/16 v2, 0xfb

    aput-object v1, v0, v2

    const-string v1, "invoke-custom"

    const/16 v2, 0xfc

    aput-object v1, v0, v2

    const-string v1, "invoke-custom/range"

    const/16 v2, 0xfd

    aput-object v1, v0, v2

    const-string v1, "const-method-handle"

    const/16 v2, 0xfe

    aput-object v1, v0, v2

    const-string v1, "const-method-type"

    const/16 v2, 0xff

    aput-object v1, v0, v2

    .line 28
    nop

    .line 27
    sput-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormat:[Ljava/lang/String;

    .line 286
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;->INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2;

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormatMap$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getOpFormat$p()[Ljava/lang/String;
    .locals 1

    .line 25
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormat:[Ljava/lang/String;

    return-object v0
.end method

.method public static final getOpCode(Ljava/lang/String;)I
    .locals 3
    .param p0, "opFormat"    # Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "opFormat"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->INSTANCE:Lorg/luckypray/dexkit/util/OpCodeUtil;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpFormatMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "opFormat: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not found"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final getOpFormat(I)Ljava/lang/String;
    .locals 4
    .param p0, "opcode"    # I
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 302
    if-ltz p0, :cond_0

    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormat:[Ljava/lang/String;

    array-length v0, v0

    if-ge p0, v0, :cond_0

    .line 305
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormat:[Ljava/lang/String;

    aget-object v0, v0, p0

    return-object v0

    .line 303
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x10

    invoke-static {v1}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v1

    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "opcode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is out of range"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getOpFormatMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 286
    sget-object v0, Lorg/luckypray/dexkit/util/OpCodeUtil;->opFormatMap$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
