.class public final Lgg1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# static fields
.field public static final i:Lgg1;

.field public static final j:Lgg1;

.field public static final k:Lgg1;

.field public static final l:Lgg1;


# instance fields
.field public final synthetic h:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgg1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lgg1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lgg1;->i:Lgg1;

    .line 8
    .line 9
    new-instance v0, Lgg1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lgg1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lgg1;->j:Lgg1;

    .line 16
    .line 17
    new-instance v0, Lgg1;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lgg1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lgg1;->k:Lgg1;

    .line 24
    .line 25
    new-instance v0, Lgg1;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lgg1;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lgg1;->l:Lgg1;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgg1;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lgg1;->h:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "Unsupported accessor type: "

    .line 5
    .line 6
    const-class v2, Lbh0;

    .line 7
    .line 8
    const-class v3, Lgi0;

    .line 9
    .line 10
    const-class v4, Lrg1;

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    sget-wide p0, Lju;->g:J

    .line 24
    .line 25
    new-instance v0, Lju;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, Lju;-><init>(J)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Lsp0;->b(I)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    new-instance v0, Lju;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1}, Lju;-><init>(J)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object v0

    .line 50
    :pswitch_0
    check-cast p1, Lwf1;

    .line 51
    .line 52
    invoke-static {v4}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v3}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {p0, v3}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    new-instance p0, Lgi0;

    .line 67
    .line 68
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p0, p1}, Lgi0;-><init>(Ljava/lang/reflect/Member;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {v4}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {p0, v3}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    new-instance p0, Lrg1;

    .line 87
    .line 88
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p0, p1}, Lrg1;-><init>(Ljava/lang/reflect/Member;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {p0, v2}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_3

    .line 105
    .line 106
    new-instance p0, Lbh0;

    .line 107
    .line 108
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {p0, p1}, Lbh0;-><init>(Ljava/lang/reflect/Member;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    move-object v0, p0

    .line 116
    check-cast v0, Lrg1;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    invoke-static {v4}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {v1, p0}, Ls;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :goto_2
    return-object v0

    .line 127
    :pswitch_1
    check-cast p1, Lwf1;

    .line 128
    .line 129
    invoke-static {v3}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {v3}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-virtual {p0, v5}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_4

    .line 142
    .line 143
    new-instance p0, Lgi0;

    .line 144
    .line 145
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-direct {p0, p1}, Lgi0;-><init>(Ljava/lang/reflect/Member;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_4
    invoke-static {v4}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {p0, v4}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_5

    .line 162
    .line 163
    new-instance p0, Lrg1;

    .line 164
    .line 165
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {p0, p1}, Lrg1;-><init>(Ljava/lang/reflect/Member;)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_5
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {p0, v2}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-eqz p0, :cond_6

    .line 182
    .line 183
    new-instance p0, Lbh0;

    .line 184
    .line 185
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-direct {p0, p1}, Lbh0;-><init>(Ljava/lang/reflect/Member;)V

    .line 190
    .line 191
    .line 192
    :goto_3
    move-object v0, p0

    .line 193
    check-cast v0, Lgi0;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    invoke-static {v3}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {v1, p0}, Ls;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :goto_4
    return-object v0

    .line 204
    :pswitch_2
    check-cast p1, Lwf1;

    .line 205
    .line 206
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {v3}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {p0, v3}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_7

    .line 219
    .line 220
    new-instance p0, Lgi0;

    .line 221
    .line 222
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {p0, p1}, Lgi0;-><init>(Ljava/lang/reflect/Member;)V

    .line 227
    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_7
    invoke-static {v4}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {p0, v3}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_8

    .line 239
    .line 240
    new-instance p0, Lrg1;

    .line 241
    .line 242
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-direct {p0, p1}, Lrg1;-><init>(Ljava/lang/reflect/Member;)V

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_8
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-virtual {p0, v3}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    if-eqz p0, :cond_9

    .line 259
    .line 260
    new-instance p0, Lbh0;

    .line 261
    .line 262
    invoke-virtual {p1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {p0, p1}, Lbh0;-><init>(Ljava/lang/reflect/Member;)V

    .line 267
    .line 268
    .line 269
    :goto_5
    move-object v0, p0

    .line 270
    check-cast v0, Lbh0;

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_9
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-static {v1, p0}, Ls;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :goto_6
    return-object v0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
