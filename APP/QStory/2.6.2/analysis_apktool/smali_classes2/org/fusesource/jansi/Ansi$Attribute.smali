.class public final enum Lorg/fusesource/jansi/Ansi$Attribute;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/fusesource/jansi/Ansi$Attribute;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum BLINK_FAST:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum BLINK_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum BLINK_SLOW:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum CONCEAL_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum CONCEAL_ON:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum INTENSITY_BOLD:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum INTENSITY_BOLD_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum INTENSITY_FAINT:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum ITALIC:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum ITALIC_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum NEGATIVE_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum NEGATIVE_ON:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum RESET:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum STRIKETHROUGH_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum STRIKETHROUGH_ON:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum UNDERLINE:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum UNDERLINE_DOUBLE:Lorg/fusesource/jansi/Ansi$Attribute;

.field public static final enum UNDERLINE_OFF:Lorg/fusesource/jansi/Ansi$Attribute;


# instance fields
.field private final name:Ljava/lang/String;

.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v1, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 2
    .line 3
    const-string v0, "RESET"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2, v2, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lorg/fusesource/jansi/Ansi$Attribute;->RESET:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 10
    .line 11
    new-instance v2, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 12
    .line 13
    const-string v0, "INTENSITY_BOLD"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v0, v3, v3, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lorg/fusesource/jansi/Ansi$Attribute;->INTENSITY_BOLD:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 20
    .line 21
    new-instance v3, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 22
    .line 23
    const-string v0, "INTENSITY_FAINT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v3, v0, v4, v4, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lorg/fusesource/jansi/Ansi$Attribute;->INTENSITY_FAINT:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 30
    .line 31
    new-instance v4, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    const-string v5, "ITALIC_ON"

    .line 35
    .line 36
    const-string v6, "ITALIC"

    .line 37
    .line 38
    invoke-direct {v4, v6, v0, v0, v5}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v4, Lorg/fusesource/jansi/Ansi$Attribute;->ITALIC:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 42
    .line 43
    new-instance v5, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    const-string v6, "UNDERLINE_ON"

    .line 47
    .line 48
    const-string v7, "UNDERLINE"

    .line 49
    .line 50
    invoke-direct {v5, v7, v0, v0, v6}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v5, Lorg/fusesource/jansi/Ansi$Attribute;->UNDERLINE:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 54
    .line 55
    new-instance v6, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 56
    .line 57
    const-string v0, "BLINK_SLOW"

    .line 58
    .line 59
    const/4 v7, 0x5

    .line 60
    invoke-direct {v6, v0, v7, v7, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v6, Lorg/fusesource/jansi/Ansi$Attribute;->BLINK_SLOW:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 64
    .line 65
    new-instance v7, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 66
    .line 67
    const-string v0, "BLINK_FAST"

    .line 68
    .line 69
    const/4 v8, 0x6

    .line 70
    invoke-direct {v7, v0, v8, v8, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sput-object v7, Lorg/fusesource/jansi/Ansi$Attribute;->BLINK_FAST:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 74
    .line 75
    new-instance v8, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 76
    .line 77
    const-string v0, "NEGATIVE_ON"

    .line 78
    .line 79
    const/4 v9, 0x7

    .line 80
    invoke-direct {v8, v0, v9, v9, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v8, Lorg/fusesource/jansi/Ansi$Attribute;->NEGATIVE_ON:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 84
    .line 85
    new-instance v9, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 86
    .line 87
    const-string v0, "CONCEAL_ON"

    .line 88
    .line 89
    const/16 v10, 0x8

    .line 90
    .line 91
    invoke-direct {v9, v0, v10, v10, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    sput-object v9, Lorg/fusesource/jansi/Ansi$Attribute;->CONCEAL_ON:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 95
    .line 96
    new-instance v10, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 97
    .line 98
    const-string v0, "STRIKETHROUGH_ON"

    .line 99
    .line 100
    const/16 v11, 0x9

    .line 101
    .line 102
    invoke-direct {v10, v0, v11, v11, v0}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sput-object v10, Lorg/fusesource/jansi/Ansi$Attribute;->STRIKETHROUGH_ON:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 106
    .line 107
    new-instance v11, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 108
    .line 109
    const/16 v0, 0xa

    .line 110
    .line 111
    const/16 v12, 0x15

    .line 112
    .line 113
    const-string v13, "UNDERLINE_DOUBLE"

    .line 114
    .line 115
    invoke-direct {v11, v13, v0, v12, v13}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    sput-object v11, Lorg/fusesource/jansi/Ansi$Attribute;->UNDERLINE_DOUBLE:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 119
    .line 120
    new-instance v12, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 121
    .line 122
    const/16 v0, 0xb

    .line 123
    .line 124
    const/16 v13, 0x16

    .line 125
    .line 126
    const-string v14, "INTENSITY_BOLD_OFF"

    .line 127
    .line 128
    invoke-direct {v12, v14, v0, v13, v14}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sput-object v12, Lorg/fusesource/jansi/Ansi$Attribute;->INTENSITY_BOLD_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 132
    .line 133
    new-instance v13, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 134
    .line 135
    const/16 v0, 0xc

    .line 136
    .line 137
    const/16 v14, 0x17

    .line 138
    .line 139
    const-string v15, "ITALIC_OFF"

    .line 140
    .line 141
    invoke-direct {v13, v15, v0, v14, v15}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    sput-object v13, Lorg/fusesource/jansi/Ansi$Attribute;->ITALIC_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 145
    .line 146
    new-instance v14, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 147
    .line 148
    const/16 v0, 0xd

    .line 149
    .line 150
    const/16 v15, 0x18

    .line 151
    .line 152
    move-object/from16 v16, v1

    .line 153
    .line 154
    const-string v1, "UNDERLINE_OFF"

    .line 155
    .line 156
    invoke-direct {v14, v1, v0, v15, v1}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    sput-object v14, Lorg/fusesource/jansi/Ansi$Attribute;->UNDERLINE_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 160
    .line 161
    new-instance v15, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 162
    .line 163
    const/16 v0, 0x19

    .line 164
    .line 165
    const-string v1, "BLINK_OFF"

    .line 166
    .line 167
    move-object/from16 v17, v2

    .line 168
    .line 169
    const-string v2, "BLINK_OFF"

    .line 170
    .line 171
    move-object/from16 v18, v3

    .line 172
    .line 173
    const/16 v3, 0xe

    .line 174
    .line 175
    invoke-direct {v15, v2, v3, v0, v1}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    sput-object v15, Lorg/fusesource/jansi/Ansi$Attribute;->BLINK_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 179
    .line 180
    new-instance v0, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 181
    .line 182
    const/16 v1, 0x1b

    .line 183
    .line 184
    const-string v2, "NEGATIVE_OFF"

    .line 185
    .line 186
    const-string v3, "NEGATIVE_OFF"

    .line 187
    .line 188
    move-object/from16 v19, v4

    .line 189
    .line 190
    const/16 v4, 0xf

    .line 191
    .line 192
    invoke-direct {v0, v3, v4, v1, v2}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 193
    .line 194
    .line 195
    sput-object v0, Lorg/fusesource/jansi/Ansi$Attribute;->NEGATIVE_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 196
    .line 197
    new-instance v1, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 198
    .line 199
    const/16 v2, 0x1c

    .line 200
    .line 201
    const-string v3, "CONCEAL_OFF"

    .line 202
    .line 203
    const-string v4, "CONCEAL_OFF"

    .line 204
    .line 205
    move-object/from16 v20, v0

    .line 206
    .line 207
    const/16 v0, 0x10

    .line 208
    .line 209
    invoke-direct {v1, v4, v0, v2, v3}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    sput-object v1, Lorg/fusesource/jansi/Ansi$Attribute;->CONCEAL_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 213
    .line 214
    new-instance v0, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 215
    .line 216
    const/16 v2, 0x1d

    .line 217
    .line 218
    const-string v3, "STRIKETHROUGH_OFF"

    .line 219
    .line 220
    const-string v4, "STRIKETHROUGH_OFF"

    .line 221
    .line 222
    move-object/from16 v21, v1

    .line 223
    .line 224
    const/16 v1, 0x11

    .line 225
    .line 226
    invoke-direct {v0, v4, v1, v2, v3}, Lorg/fusesource/jansi/Ansi$Attribute;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 227
    .line 228
    .line 229
    sput-object v0, Lorg/fusesource/jansi/Ansi$Attribute;->STRIKETHROUGH_OFF:Lorg/fusesource/jansi/Ansi$Attribute;

    .line 230
    .line 231
    move-object/from16 v1, v16

    .line 232
    .line 233
    move-object/from16 v2, v17

    .line 234
    .line 235
    move-object/from16 v3, v18

    .line 236
    .line 237
    move-object/from16 v4, v19

    .line 238
    .line 239
    move-object/from16 v16, v20

    .line 240
    .line 241
    move-object/from16 v17, v21

    .line 242
    .line 243
    move-object/from16 v18, v0

    .line 244
    .line 245
    filled-new-array/range {v1 .. v18}, [Lorg/fusesource/jansi/Ansi$Attribute;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    sput-object v0, Lorg/fusesource/jansi/Ansi$Attribute;->$VALUES:[Lorg/fusesource/jansi/Ansi$Attribute;

    .line 250
    .line 251
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
    iput p3, p0, Lorg/fusesource/jansi/Ansi$Attribute;->value:I

    .line 5
    .line 6
    iput-object p4, p0, Lorg/fusesource/jansi/Ansi$Attribute;->name:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/fusesource/jansi/Ansi$Attribute;
    .locals 1

    .line 1
    const-class v0, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/fusesource/jansi/Ansi$Attribute;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/fusesource/jansi/Ansi$Attribute;
    .locals 1

    .line 1
    sget-object v0, Lorg/fusesource/jansi/Ansi$Attribute;->$VALUES:[Lorg/fusesource/jansi/Ansi$Attribute;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/fusesource/jansi/Ansi$Attribute;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/fusesource/jansi/Ansi$Attribute;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/fusesource/jansi/Ansi$Attribute;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public value()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/fusesource/jansi/Ansi$Attribute;->value:I

    .line 2
    .line 3
    return p0
.end method
