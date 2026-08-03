.class public final enum Lba/n;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final l:La2/a;

.field public static final enum m:Lba/n;

.field public static final enum n:Lba/n;

.field public static final enum o:Lba/n;

.field public static final enum p:Lba/n;

.field public static final synthetic q:[Lba/n;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Lba/a;

.field public final j:Z

.field public final k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 33

    .line 1
    new-instance v0, Lba/n;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    const-string v1, "LEFT_LIGHT"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "left_light.image"

    .line 9
    .line 10
    const-string v4, "\u5de6\u4fa7\u6d45\u8272\u6c14\u6ce1"

    .line 11
    .line 12
    sget-object v13, Lba/a;->h:Lba/a;

    .line 13
    .line 14
    move-object v5, v13

    .line 15
    invoke-direct/range {v0 .. v7}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lba/n;->m:Lba/n;

    .line 19
    .line 20
    new-instance v1, Lba/n;

    .line 21
    .line 22
    const/4 v14, 0x1

    .line 23
    const/4 v15, 0x0

    .line 24
    const-string v9, "RIGHT_LIGHT"

    .line 25
    .line 26
    const/4 v10, 0x1

    .line 27
    const-string v11, "right_light.image"

    .line 28
    .line 29
    const-string v12, "\u53f3\u4fa7\u6d45\u8272\u6c14\u6ce1"

    .line 30
    .line 31
    move-object v8, v1

    .line 32
    invoke-direct/range {v8 .. v15}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lba/n;->n:Lba/n;

    .line 36
    .line 37
    new-instance v2, Lba/n;

    .line 38
    .line 39
    const/4 v14, 0x0

    .line 40
    const/4 v15, 0x1

    .line 41
    const-string v9, "LEFT_DARK"

    .line 42
    .line 43
    const/4 v10, 0x2

    .line 44
    const-string v11, "left_dark.image"

    .line 45
    .line 46
    const-string v12, "\u5de6\u4fa7\u6df1\u8272\u6c14\u6ce1"

    .line 47
    .line 48
    move-object v8, v2

    .line 49
    invoke-direct/range {v8 .. v15}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 50
    .line 51
    .line 52
    sput-object v2, Lba/n;->o:Lba/n;

    .line 53
    .line 54
    new-instance v3, Lba/n;

    .line 55
    .line 56
    const/4 v14, 0x1

    .line 57
    const-string v9, "RIGHT_DARK"

    .line 58
    .line 59
    const/4 v10, 0x3

    .line 60
    const-string v11, "right_dark.image"

    .line 61
    .line 62
    const-string v12, "\u53f3\u4fa7\u6df1\u8272\u6c14\u6ce1"

    .line 63
    .line 64
    move-object v8, v3

    .line 65
    invoke-direct/range {v8 .. v15}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 66
    .line 67
    .line 68
    sput-object v3, Lba/n;->p:Lba/n;

    .line 69
    .line 70
    new-instance v4, Lba/n;

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    const-string v5, "RED_PACKET_LEFT_LIGHT"

    .line 75
    .line 76
    const/4 v6, 0x4

    .line 77
    const-string v7, "red_packet_left_light.image"

    .line 78
    .line 79
    const-string v8, "\u7ea2\u5305\u5de6\u4fa7\u6d45\u8272\u6c14\u6ce1"

    .line 80
    .line 81
    sget-object v17, Lba/a;->i:Lba/a;

    .line 82
    .line 83
    move-object/from16 v9, v17

    .line 84
    .line 85
    invoke-direct/range {v4 .. v11}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 86
    .line 87
    .line 88
    new-instance v5, Lba/n;

    .line 89
    .line 90
    const/16 v18, 0x1

    .line 91
    .line 92
    const/16 v19, 0x0

    .line 93
    .line 94
    const-string v13, "RED_PACKET_RIGHT_LIGHT"

    .line 95
    .line 96
    const/4 v14, 0x5

    .line 97
    const-string v15, "red_packet_right_light.image"

    .line 98
    .line 99
    const-string v16, "\u7ea2\u5305\u53f3\u4fa7\u6d45\u8272\u6c14\u6ce1"

    .line 100
    .line 101
    move-object v12, v5

    .line 102
    invoke-direct/range {v12 .. v19}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 103
    .line 104
    .line 105
    new-instance v6, Lba/n;

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    const/16 v19, 0x1

    .line 110
    .line 111
    const-string v13, "RED_PACKET_LEFT_DARK"

    .line 112
    .line 113
    const/4 v14, 0x6

    .line 114
    const-string v15, "red_packet_left_dark.image"

    .line 115
    .line 116
    const-string v16, "\u7ea2\u5305\u5de6\u4fa7\u6df1\u8272\u6c14\u6ce1"

    .line 117
    .line 118
    move-object v12, v6

    .line 119
    invoke-direct/range {v12 .. v19}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 120
    .line 121
    .line 122
    new-instance v7, Lba/n;

    .line 123
    .line 124
    const/16 v18, 0x1

    .line 125
    .line 126
    const-string v13, "RED_PACKET_RIGHT_DARK"

    .line 127
    .line 128
    const/4 v14, 0x7

    .line 129
    const-string v15, "red_packet_right_dark.image"

    .line 130
    .line 131
    const-string v16, "\u7ea2\u5305\u53f3\u4fa7\u6df1\u8272\u6c14\u6ce1"

    .line 132
    .line 133
    move-object v12, v7

    .line 134
    invoke-direct/range {v12 .. v19}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 135
    .line 136
    .line 137
    new-instance v8, Lba/n;

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x0

    .line 141
    const-string v9, "TRANSFER_LEFT_LIGHT"

    .line 142
    .line 143
    const/16 v10, 0x8

    .line 144
    .line 145
    const-string v11, "transfer_left_light.image"

    .line 146
    .line 147
    const-string v12, "\u8f6c\u8d26\u5de6\u4fa7\u6d45\u8272\u6c14\u6ce1"

    .line 148
    .line 149
    sget-object v21, Lba/a;->j:Lba/a;

    .line 150
    .line 151
    move-object/from16 v13, v21

    .line 152
    .line 153
    invoke-direct/range {v8 .. v15}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 154
    .line 155
    .line 156
    new-instance v16, Lba/n;

    .line 157
    .line 158
    const/16 v22, 0x1

    .line 159
    .line 160
    const/16 v23, 0x0

    .line 161
    .line 162
    const-string v17, "TRANSFER_RIGHT_LIGHT"

    .line 163
    .line 164
    const/16 v18, 0x9

    .line 165
    .line 166
    const-string v19, "transfer_right_light.image"

    .line 167
    .line 168
    const-string v20, "\u8f6c\u8d26\u53f3\u4fa7\u6d45\u8272\u6c14\u6ce1"

    .line 169
    .line 170
    invoke-direct/range {v16 .. v23}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v9, v16

    .line 174
    .line 175
    new-instance v16, Lba/n;

    .line 176
    .line 177
    const/16 v22, 0x0

    .line 178
    .line 179
    const/16 v23, 0x1

    .line 180
    .line 181
    const-string v17, "TRANSFER_LEFT_DARK"

    .line 182
    .line 183
    const/16 v18, 0xa

    .line 184
    .line 185
    const-string v19, "transfer_left_dark.image"

    .line 186
    .line 187
    const-string v20, "\u8f6c\u8d26\u5de6\u4fa7\u6df1\u8272\u6c14\u6ce1"

    .line 188
    .line 189
    invoke-direct/range {v16 .. v23}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 190
    .line 191
    .line 192
    move-object/from16 v10, v16

    .line 193
    .line 194
    new-instance v16, Lba/n;

    .line 195
    .line 196
    const/16 v22, 0x1

    .line 197
    .line 198
    const-string v17, "TRANSFER_RIGHT_DARK"

    .line 199
    .line 200
    const/16 v18, 0xb

    .line 201
    .line 202
    const-string v19, "transfer_right_dark.image"

    .line 203
    .line 204
    const-string v20, "\u8f6c\u8d26\u53f3\u4fa7\u6df1\u8272\u6c14\u6ce1"

    .line 205
    .line 206
    invoke-direct/range {v16 .. v23}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 207
    .line 208
    .line 209
    new-instance v17, Lba/n;

    .line 210
    .line 211
    const/16 v23, 0x0

    .line 212
    .line 213
    const/16 v24, 0x0

    .line 214
    .line 215
    const-string v18, "SYSTEM_LIGHT"

    .line 216
    .line 217
    const/16 v19, 0xc

    .line 218
    .line 219
    const-string v20, "system_light.image"

    .line 220
    .line 221
    const-string v21, "\u7cfb\u7edf\u6d88\u606f\u6d45\u8272\u6c14\u6ce1"

    .line 222
    .line 223
    sget-object v22, Lba/a;->k:Lba/a;

    .line 224
    .line 225
    invoke-direct/range {v17 .. v24}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 226
    .line 227
    .line 228
    new-instance v25, Lba/n;

    .line 229
    .line 230
    const/16 v31, 0x0

    .line 231
    .line 232
    const/16 v32, 0x1

    .line 233
    .line 234
    const-string v26, "SYSTEM_DARK"

    .line 235
    .line 236
    const/16 v27, 0xd

    .line 237
    .line 238
    const-string v28, "system_dark.image"

    .line 239
    .line 240
    const-string v29, "\u7cfb\u7edf\u6d88\u606f\u6df1\u8272\u6c14\u6ce1"

    .line 241
    .line 242
    move-object/from16 v30, v22

    .line 243
    .line 244
    invoke-direct/range {v25 .. v32}, Lba/n;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V

    .line 245
    .line 246
    .line 247
    move-object/from16 v11, v16

    .line 248
    .line 249
    move-object/from16 v12, v17

    .line 250
    .line 251
    move-object/from16 v13, v25

    .line 252
    .line 253
    filled-new-array/range {v0 .. v13}, [Lba/n;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    sput-object v0, Lba/n;->q:[Lba/n;

    .line 258
    .line 259
    new-instance v0, La2/a;

    .line 260
    .line 261
    const/4 v1, 0x5

    .line 262
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 263
    .line 264
    .line 265
    sput-object v0, Lba/n;->l:La2/a;

    .line 266
    .line 267
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lba/a;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lba/n;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lba/n;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p5, p0, Lba/n;->i:Lba/a;

    .line 9
    .line 10
    iput-boolean p6, p0, Lba/n;->j:Z

    .line 11
    .line 12
    iput-boolean p7, p0, Lba/n;->k:Z

    .line 13
    .line 14
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lba/n;
    .locals 1

    .line 1
    const-class v0, Lba/n;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lba/n;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lba/n;
    .locals 1

    .line 1
    sget-object v0, Lba/n;->q:[Lba/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lba/n;

    .line 8
    .line 9
    return-object v0
.end method
