.class public final enum Lorg/fusesource/jansi/AnsiRenderer$Code;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/fusesource/jansi/AnsiRenderer$Code;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_BLACK:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_BLUE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_CYAN:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_DEFAULT:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_GREEN:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_MAGENTA:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_RED:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_WHITE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BG_YELLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BLACK:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BLINK_FAST:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BLINK_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BLINK_SLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BLUE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum BOLD:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum CONCEAL_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum CONCEAL_ON:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum CYAN:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum DEFAULT:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FAINT:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_BLACK:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_BLUE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_CYAN:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_DEFAULT:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_GREEN:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_MAGENTA:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_RED:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_WHITE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum FG_YELLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum GREEN:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum INTENSITY_BOLD:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum INTENSITY_FAINT:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum ITALIC:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum MAGENTA:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum NEGATIVE_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum NEGATIVE_ON:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum RED:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum RESET:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum UNDERLINE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum UNDERLINE_DOUBLE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum UNDERLINE_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum WHITE:Lorg/fusesource/jansi/AnsiRenderer$Code;

.field public static final enum YELLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;


# instance fields
.field private final background:Z

.field private final n:Ljava/lang/Enum;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Enum<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 46

    .line 1
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 2
    .line 3
    sget-object v0, Lorg/fusesource/jansi/Ansi$Color;->BLACK:Lorg/fusesource/jansi/Ansi$Color;

    .line 4
    .line 5
    const-string v2, "BLACK"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v2, v3, v0}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->BLACK:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 12
    .line 13
    new-instance v2, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 14
    .line 15
    sget-object v4, Lorg/fusesource/jansi/Ansi$Color;->RED:Lorg/fusesource/jansi/Ansi$Color;

    .line 16
    .line 17
    const-string v5, "RED"

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    invoke-direct {v2, v5, v6, v4}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lorg/fusesource/jansi/AnsiRenderer$Code;->RED:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 24
    .line 25
    new-instance v5, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 26
    .line 27
    sget-object v7, Lorg/fusesource/jansi/Ansi$Color;->GREEN:Lorg/fusesource/jansi/Ansi$Color;

    .line 28
    .line 29
    const-string v8, "GREEN"

    .line 30
    .line 31
    const/4 v9, 0x2

    .line 32
    invoke-direct {v5, v8, v9, v7}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 33
    .line 34
    .line 35
    sput-object v5, Lorg/fusesource/jansi/AnsiRenderer$Code;->GREEN:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 36
    .line 37
    new-instance v8, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 38
    .line 39
    sget-object v9, Lorg/fusesource/jansi/Ansi$Color;->YELLOW:Lorg/fusesource/jansi/Ansi$Color;

    .line 40
    .line 41
    const-string v10, "YELLOW"

    .line 42
    .line 43
    const/4 v11, 0x3

    .line 44
    invoke-direct {v8, v10, v11, v9}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 45
    .line 46
    .line 47
    sput-object v8, Lorg/fusesource/jansi/AnsiRenderer$Code;->YELLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 48
    .line 49
    move-object v10, v5

    .line 50
    new-instance v5, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 51
    .line 52
    sget-object v11, Lorg/fusesource/jansi/Ansi$Color;->BLUE:Lorg/fusesource/jansi/Ansi$Color;

    .line 53
    .line 54
    const-string v12, "BLUE"

    .line 55
    .line 56
    const/4 v13, 0x4

    .line 57
    invoke-direct {v5, v12, v13, v11}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 58
    .line 59
    .line 60
    sput-object v5, Lorg/fusesource/jansi/AnsiRenderer$Code;->BLUE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 61
    .line 62
    new-instance v12, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 63
    .line 64
    sget-object v13, Lorg/fusesource/jansi/Ansi$Color;->MAGENTA:Lorg/fusesource/jansi/Ansi$Color;

    .line 65
    .line 66
    const-string v14, "MAGENTA"

    .line 67
    .line 68
    const/4 v15, 0x5

    .line 69
    invoke-direct {v12, v14, v15, v13}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 70
    .line 71
    .line 72
    sput-object v12, Lorg/fusesource/jansi/AnsiRenderer$Code;->MAGENTA:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 73
    .line 74
    new-instance v14, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 75
    .line 76
    sget-object v15, Lorg/fusesource/jansi/Ansi$Color;->CYAN:Lorg/fusesource/jansi/Ansi$Color;

    .line 77
    .line 78
    const-string v6, "CYAN"

    .line 79
    .line 80
    const/4 v3, 0x6

    .line 81
    invoke-direct {v14, v6, v3, v15}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 82
    .line 83
    .line 84
    sput-object v14, Lorg/fusesource/jansi/AnsiRenderer$Code;->CYAN:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 85
    .line 86
    move-object v3, v8

    .line 87
    new-instance v8, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 88
    .line 89
    sget-object v6, Lorg/fusesource/jansi/Ansi$Color;->WHITE:Lorg/fusesource/jansi/Ansi$Color;

    .line 90
    .line 91
    move-object/from16 v18, v1

    .line 92
    .line 93
    const-string v1, "WHITE"

    .line 94
    .line 95
    move-object/from16 v19, v2

    .line 96
    .line 97
    const/4 v2, 0x7

    .line 98
    invoke-direct {v8, v1, v2, v6}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 99
    .line 100
    .line 101
    sput-object v8, Lorg/fusesource/jansi/AnsiRenderer$Code;->WHITE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 102
    .line 103
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 104
    .line 105
    sget-object v2, Lorg/fusesource/jansi/Ansi$Color;->DEFAULT:Lorg/fusesource/jansi/Ansi$Color;

    .line 106
    .line 107
    move-object/from16 v20, v3

    .line 108
    .line 109
    const-string v3, "DEFAULT"

    .line 110
    .line 111
    move-object/from16 v21, v5

    .line 112
    .line 113
    const/16 v5, 0x8

    .line 114
    .line 115
    invoke-direct {v1, v3, v5, v2}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 116
    .line 117
    .line 118
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->DEFAULT:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 119
    .line 120
    move-object v3, v10

    .line 121
    new-instance v10, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 122
    .line 123
    const-string v5, "FG_BLACK"

    .line 124
    .line 125
    move-object/from16 v22, v1

    .line 126
    .line 127
    const/16 v1, 0x9

    .line 128
    .line 129
    move-object/from16 v23, v3

    .line 130
    .line 131
    const/4 v3, 0x0

    .line 132
    invoke-direct {v10, v5, v1, v0, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 133
    .line 134
    .line 135
    sput-object v10, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_BLACK:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 136
    .line 137
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 138
    .line 139
    const-string v5, "FG_RED"

    .line 140
    .line 141
    move-object/from16 v17, v8

    .line 142
    .line 143
    const/16 v8, 0xa

    .line 144
    .line 145
    invoke-direct {v1, v5, v8, v4, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 146
    .line 147
    .line 148
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_RED:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 149
    .line 150
    move-object v5, v12

    .line 151
    new-instance v12, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 152
    .line 153
    const-string v8, "FG_GREEN"

    .line 154
    .line 155
    move-object/from16 v24, v1

    .line 156
    .line 157
    const/16 v1, 0xb

    .line 158
    .line 159
    invoke-direct {v12, v8, v1, v7, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 160
    .line 161
    .line 162
    sput-object v12, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_GREEN:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 163
    .line 164
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 165
    .line 166
    const-string v8, "FG_YELLOW"

    .line 167
    .line 168
    move-object/from16 v25, v5

    .line 169
    .line 170
    const/16 v5, 0xc

    .line 171
    .line 172
    invoke-direct {v1, v8, v5, v9, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 173
    .line 174
    .line 175
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_YELLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 176
    .line 177
    move-object v5, v14

    .line 178
    new-instance v14, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 179
    .line 180
    const-string v8, "FG_BLUE"

    .line 181
    .line 182
    move-object/from16 v26, v1

    .line 183
    .line 184
    const/16 v1, 0xd

    .line 185
    .line 186
    invoke-direct {v14, v8, v1, v11, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 187
    .line 188
    .line 189
    sput-object v14, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_BLUE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 190
    .line 191
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 192
    .line 193
    const-string v8, "FG_MAGENTA"

    .line 194
    .line 195
    move-object/from16 v27, v5

    .line 196
    .line 197
    const/16 v5, 0xe

    .line 198
    .line 199
    invoke-direct {v1, v8, v5, v13, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 200
    .line 201
    .line 202
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_MAGENTA:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 203
    .line 204
    new-instance v5, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 205
    .line 206
    const-string v8, "FG_CYAN"

    .line 207
    .line 208
    move-object/from16 v28, v1

    .line 209
    .line 210
    const/16 v1, 0xf

    .line 211
    .line 212
    invoke-direct {v5, v8, v1, v15, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 213
    .line 214
    .line 215
    sput-object v5, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_CYAN:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 216
    .line 217
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 218
    .line 219
    const-string v8, "FG_WHITE"

    .line 220
    .line 221
    move-object/from16 v29, v5

    .line 222
    .line 223
    const/16 v5, 0x10

    .line 224
    .line 225
    invoke-direct {v1, v8, v5, v6, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 226
    .line 227
    .line 228
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_WHITE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 229
    .line 230
    new-instance v5, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 231
    .line 232
    const-string v8, "FG_DEFAULT"

    .line 233
    .line 234
    move-object/from16 v30, v1

    .line 235
    .line 236
    const/16 v1, 0x11

    .line 237
    .line 238
    invoke-direct {v5, v8, v1, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 239
    .line 240
    .line 241
    sput-object v5, Lorg/fusesource/jansi/AnsiRenderer$Code;->FG_DEFAULT:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 242
    .line 243
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 244
    .line 245
    const-string v3, "BG_BLACK"

    .line 246
    .line 247
    const/16 v8, 0x12

    .line 248
    .line 249
    move-object/from16 v31, v5

    .line 250
    .line 251
    const/4 v5, 0x1

    .line 252
    invoke-direct {v1, v3, v8, v0, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 253
    .line 254
    .line 255
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_BLACK:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 256
    .line 257
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 258
    .line 259
    const-string v3, "BG_RED"

    .line 260
    .line 261
    const/16 v8, 0x13

    .line 262
    .line 263
    invoke-direct {v0, v3, v8, v4, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 264
    .line 265
    .line 266
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_RED:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 267
    .line 268
    new-instance v3, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 269
    .line 270
    const-string v4, "BG_GREEN"

    .line 271
    .line 272
    const/16 v8, 0x14

    .line 273
    .line 274
    invoke-direct {v3, v4, v8, v7, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 275
    .line 276
    .line 277
    sput-object v3, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_GREEN:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 278
    .line 279
    new-instance v4, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 280
    .line 281
    const-string v7, "BG_YELLOW"

    .line 282
    .line 283
    const/16 v8, 0x15

    .line 284
    .line 285
    invoke-direct {v4, v7, v8, v9, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 286
    .line 287
    .line 288
    sput-object v4, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_YELLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 289
    .line 290
    new-instance v7, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 291
    .line 292
    const-string v8, "BG_BLUE"

    .line 293
    .line 294
    const/16 v9, 0x16

    .line 295
    .line 296
    invoke-direct {v7, v8, v9, v11, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 297
    .line 298
    .line 299
    sput-object v7, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_BLUE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 300
    .line 301
    new-instance v8, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 302
    .line 303
    const-string v9, "BG_MAGENTA"

    .line 304
    .line 305
    const/16 v11, 0x17

    .line 306
    .line 307
    invoke-direct {v8, v9, v11, v13, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 308
    .line 309
    .line 310
    sput-object v8, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_MAGENTA:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 311
    .line 312
    new-instance v9, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 313
    .line 314
    const-string v11, "BG_CYAN"

    .line 315
    .line 316
    const/16 v13, 0x18

    .line 317
    .line 318
    invoke-direct {v9, v11, v13, v15, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 319
    .line 320
    .line 321
    sput-object v9, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_CYAN:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 322
    .line 323
    new-instance v11, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 324
    .line 325
    const-string v13, "BG_WHITE"

    .line 326
    .line 327
    const/16 v15, 0x19

    .line 328
    .line 329
    invoke-direct {v11, v13, v15, v6, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 330
    .line 331
    .line 332
    sput-object v11, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_WHITE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 333
    .line 334
    new-instance v6, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 335
    .line 336
    const-string v13, "BG_DEFAULT"

    .line 337
    .line 338
    const/16 v15, 0x1a

    .line 339
    .line 340
    invoke-direct {v6, v13, v15, v2, v5}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    .line 341
    .line 342
    .line 343
    sput-object v6, Lorg/fusesource/jansi/AnsiRenderer$Code;->BG_DEFAULT:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 344
    .line 345
    new-instance v2, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 346
    .line 347
    const/16 v5, 0x1b

    .line 348
    .line 349
    sget-object v13, Lorg/fusesource/jansi/Ansi$Attribute;->RESET:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 350
    .line 351
    const-string v15, "RESET"

    .line 352
    .line 353
    invoke-direct {v2, v15, v5, v13}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 354
    .line 355
    .line 356
    sput-object v2, Lorg/fusesource/jansi/AnsiRenderer$Code;->RESET:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 357
    .line 358
    new-instance v5, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 359
    .line 360
    sget-object v13, Lorg/fusesource/jansi/Ansi$Attribute;->INTENSITY_BOLD:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 361
    .line 362
    const-string v15, "INTENSITY_BOLD"

    .line 363
    .line 364
    move-object/from16 v16, v0

    .line 365
    .line 366
    const/16 v0, 0x1c

    .line 367
    .line 368
    invoke-direct {v5, v15, v0, v13}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 369
    .line 370
    .line 371
    sput-object v5, Lorg/fusesource/jansi/AnsiRenderer$Code;->INTENSITY_BOLD:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 372
    .line 373
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 374
    .line 375
    sget-object v15, Lorg/fusesource/jansi/Ansi$Attribute;->INTENSITY_FAINT:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 376
    .line 377
    move-object/from16 v32, v1

    .line 378
    .line 379
    const-string v1, "INTENSITY_FAINT"

    .line 380
    .line 381
    move-object/from16 v33, v2

    .line 382
    .line 383
    const/16 v2, 0x1d

    .line 384
    .line 385
    invoke-direct {v0, v1, v2, v15}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 386
    .line 387
    .line 388
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->INTENSITY_FAINT:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 389
    .line 390
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 391
    .line 392
    const/16 v2, 0x1e

    .line 393
    .line 394
    move-object/from16 v34, v0

    .line 395
    .line 396
    sget-object v0, Lorg/fusesource/jansi/Ansi$Attribute;->ITALIC:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 397
    .line 398
    move-object/from16 v35, v3

    .line 399
    .line 400
    const-string v3, "ITALIC"

    .line 401
    .line 402
    invoke-direct {v1, v3, v2, v0}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 403
    .line 404
    .line 405
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->ITALIC:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 406
    .line 407
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 408
    .line 409
    const/16 v2, 0x1f

    .line 410
    .line 411
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->UNDERLINE:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 412
    .line 413
    move-object/from16 v36, v1

    .line 414
    .line 415
    const-string v1, "UNDERLINE"

    .line 416
    .line 417
    invoke-direct {v0, v1, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 418
    .line 419
    .line 420
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->UNDERLINE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 421
    .line 422
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 423
    .line 424
    const/16 v2, 0x20

    .line 425
    .line 426
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->BLINK_SLOW:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 427
    .line 428
    move-object/from16 v37, v0

    .line 429
    .line 430
    const-string v0, "BLINK_SLOW"

    .line 431
    .line 432
    invoke-direct {v1, v0, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 433
    .line 434
    .line 435
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->BLINK_SLOW:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 436
    .line 437
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 438
    .line 439
    const/16 v2, 0x21

    .line 440
    .line 441
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->BLINK_FAST:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 442
    .line 443
    move-object/from16 v38, v1

    .line 444
    .line 445
    const-string v1, "BLINK_FAST"

    .line 446
    .line 447
    invoke-direct {v0, v1, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 448
    .line 449
    .line 450
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->BLINK_FAST:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 451
    .line 452
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 453
    .line 454
    const/16 v2, 0x22

    .line 455
    .line 456
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->BLINK_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 457
    .line 458
    move-object/from16 v39, v0

    .line 459
    .line 460
    const-string v0, "BLINK_OFF"

    .line 461
    .line 462
    invoke-direct {v1, v0, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 463
    .line 464
    .line 465
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->BLINK_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 466
    .line 467
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 468
    .line 469
    const/16 v2, 0x23

    .line 470
    .line 471
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->NEGATIVE_ON:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 472
    .line 473
    move-object/from16 v40, v1

    .line 474
    .line 475
    const-string v1, "NEGATIVE_ON"

    .line 476
    .line 477
    invoke-direct {v0, v1, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 478
    .line 479
    .line 480
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->NEGATIVE_ON:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 481
    .line 482
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 483
    .line 484
    const/16 v2, 0x24

    .line 485
    .line 486
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->NEGATIVE_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 487
    .line 488
    move-object/from16 v41, v0

    .line 489
    .line 490
    const-string v0, "NEGATIVE_OFF"

    .line 491
    .line 492
    invoke-direct {v1, v0, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 493
    .line 494
    .line 495
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->NEGATIVE_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 496
    .line 497
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 498
    .line 499
    const/16 v2, 0x25

    .line 500
    .line 501
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->CONCEAL_ON:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 502
    .line 503
    move-object/from16 v42, v1

    .line 504
    .line 505
    const-string v1, "CONCEAL_ON"

    .line 506
    .line 507
    invoke-direct {v0, v1, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 508
    .line 509
    .line 510
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->CONCEAL_ON:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 511
    .line 512
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 513
    .line 514
    const/16 v2, 0x26

    .line 515
    .line 516
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->CONCEAL_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 517
    .line 518
    move-object/from16 v43, v0

    .line 519
    .line 520
    const-string v0, "CONCEAL_OFF"

    .line 521
    .line 522
    invoke-direct {v1, v0, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 523
    .line 524
    .line 525
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->CONCEAL_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 526
    .line 527
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 528
    .line 529
    const/16 v2, 0x27

    .line 530
    .line 531
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->UNDERLINE_DOUBLE:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 532
    .line 533
    move-object/from16 v44, v1

    .line 534
    .line 535
    const-string v1, "UNDERLINE_DOUBLE"

    .line 536
    .line 537
    invoke-direct {v0, v1, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 538
    .line 539
    .line 540
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->UNDERLINE_DOUBLE:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 541
    .line 542
    new-instance v1, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 543
    .line 544
    const/16 v2, 0x28

    .line 545
    .line 546
    sget-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->UNDERLINE_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 547
    .line 548
    move-object/from16 v45, v0

    .line 549
    .line 550
    const-string v0, "UNDERLINE_OFF"

    .line 551
    .line 552
    invoke-direct {v1, v0, v2, v3}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 553
    .line 554
    .line 555
    sput-object v1, Lorg/fusesource/jansi/AnsiRenderer$Code;->UNDERLINE_OFF:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 556
    .line 557
    new-instance v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 558
    .line 559
    const-string v2, "BOLD"

    .line 560
    .line 561
    const/16 v3, 0x29

    .line 562
    .line 563
    invoke-direct {v0, v2, v3, v13}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 564
    .line 565
    .line 566
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->BOLD:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 567
    .line 568
    new-instance v2, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 569
    .line 570
    const-string v3, "FAINT"

    .line 571
    .line 572
    const/16 v13, 0x2a

    .line 573
    .line 574
    invoke-direct {v2, v3, v13, v15}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;)V

    .line 575
    .line 576
    .line 577
    sput-object v2, Lorg/fusesource/jansi/AnsiRenderer$Code;->FAINT:Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 578
    .line 579
    move-object/from16 v3, v41

    .line 580
    .line 581
    move-object/from16 v41, v1

    .line 582
    .line 583
    move-object/from16 v1, v18

    .line 584
    .line 585
    move-object/from16 v18, v31

    .line 586
    .line 587
    move-object/from16 v31, v36

    .line 588
    .line 589
    move-object/from16 v36, v3

    .line 590
    .line 591
    move-object/from16 v3, v23

    .line 592
    .line 593
    move-object/from16 v13, v26

    .line 594
    .line 595
    move-object/from16 v15, v28

    .line 596
    .line 597
    move-object/from16 v28, v33

    .line 598
    .line 599
    move-object/from16 v33, v38

    .line 600
    .line 601
    move-object/from16 v38, v43

    .line 602
    .line 603
    move-object/from16 v43, v2

    .line 604
    .line 605
    move-object/from16 v23, v7

    .line 606
    .line 607
    move-object/from16 v26, v11

    .line 608
    .line 609
    move-object/from16 v2, v19

    .line 610
    .line 611
    move-object/from16 v11, v24

    .line 612
    .line 613
    move-object/from16 v7, v27

    .line 614
    .line 615
    move-object/from16 v19, v32

    .line 616
    .line 617
    move-object/from16 v32, v37

    .line 618
    .line 619
    move-object/from16 v37, v42

    .line 620
    .line 621
    move-object/from16 v42, v0

    .line 622
    .line 623
    move-object/from16 v27, v6

    .line 624
    .line 625
    move-object/from16 v24, v8

    .line 626
    .line 627
    move-object/from16 v8, v17

    .line 628
    .line 629
    move-object/from16 v6, v25

    .line 630
    .line 631
    move-object/from16 v17, v30

    .line 632
    .line 633
    move-object/from16 v30, v34

    .line 634
    .line 635
    move-object/from16 v34, v39

    .line 636
    .line 637
    move-object/from16 v39, v44

    .line 638
    .line 639
    move-object/from16 v25, v9

    .line 640
    .line 641
    move-object/from16 v9, v22

    .line 642
    .line 643
    move-object/from16 v22, v4

    .line 644
    .line 645
    move-object/from16 v4, v20

    .line 646
    .line 647
    move-object/from16 v20, v16

    .line 648
    .line 649
    move-object/from16 v16, v29

    .line 650
    .line 651
    move-object/from16 v29, v5

    .line 652
    .line 653
    move-object/from16 v5, v21

    .line 654
    .line 655
    move-object/from16 v21, v35

    .line 656
    .line 657
    move-object/from16 v35, v40

    .line 658
    .line 659
    move-object/from16 v40, v45

    .line 660
    .line 661
    filled-new-array/range {v1 .. v43}, [Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    sput-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->$VALUES:[Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 666
    .line 667
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Enum;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Enum<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/fusesource/jansi/AnsiRenderer$Code;-><init>(Ljava/lang/String;ILjava/lang/Enum;Z)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Enum;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Enum<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lorg/fusesource/jansi/AnsiRenderer$Code;->n:Ljava/lang/Enum;

    .line 5
    .line 6
    iput-boolean p4, p0, Lorg/fusesource/jansi/AnsiRenderer$Code;->background:Z

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/fusesource/jansi/AnsiRenderer$Code;
    .locals 1

    .line 1
    const-class v0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/fusesource/jansi/AnsiRenderer$Code;
    .locals 1

    .line 1
    sget-object v0, Lorg/fusesource/jansi/AnsiRenderer$Code;->$VALUES:[Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/fusesource/jansi/AnsiRenderer$Code;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/fusesource/jansi/AnsiRenderer$Code;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getAttribute()Lorg/fusesource/jansi/Ansi$Attribute;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/fusesource/jansi/AnsiRenderer$Code;->n:Ljava/lang/Enum;

    .line 2
    .line 3
    check-cast p0, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 4
    .line 5
    return-object p0
.end method

.method public getColor()Lorg/fusesource/jansi/Ansi$Color;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/fusesource/jansi/AnsiRenderer$Code;->n:Ljava/lang/Enum;

    .line 2
    .line 3
    check-cast p0, Lorg/fusesource/jansi/Ansi$Color;

    .line 4
    .line 5
    return-object p0
.end method

.method public isAttribute()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/fusesource/jansi/AnsiRenderer$Code;->n:Ljava/lang/Enum;

    .line 2
    .line 3
    instance-of p0, p0, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 4
    .line 5
    return p0
.end method

.method public isBackground()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/fusesource/jansi/AnsiRenderer$Code;->background:Z

    .line 2
    .line 3
    return p0
.end method

.method public isColor()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/fusesource/jansi/AnsiRenderer$Code;->n:Ljava/lang/Enum;

    .line 2
    .line 3
    instance-of p0, p0, Lorg/fusesource/jansi/Ansi$Color;

    .line 4
    .line 5
    return p0
.end method
