.class public final synthetic Lz;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxm0;

.field public final synthetic j:Lxm0;


# direct methods
.method public synthetic constructor <init>(Lxm0;Lxm0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lz;->i:Lxm0;

    .line 4
    .line 5
    iput-object p2, p0, Lz;->j:Lxm0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lz;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lz;->j:Lxm0;

    .line 6
    .line 7
    iget-object p0, p0, Lz;->i:Lxm0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lcz2;

    .line 13
    .line 14
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x1

    .line 31
    :goto_0
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Lcz2;->close()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v1

    .line 37
    :pswitch_0
    check-cast p1, Lci1;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v0, Lpp1;->a:Lpp1;

    .line 43
    .line 44
    invoke-static {}, Lpp1;->c()Lop1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v3, Lci1;->Companion:Lbi1;

    .line 49
    .line 50
    invoke-virtual {v3}, Lbi1;->serializer()Lw41;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "ModifyFriendsCount/config"

    .line 55
    .line 56
    invoke-virtual {v0, v3, p1, v4}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lpp1;->a:Lpp1;

    .line 72
    .line 73
    invoke-static {}, Lpp1;->c()Lop1;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const-string v3, "CustomInputHint/text"

    .line 81
    .line 82
    invoke-virtual {v0, v3, p1}, Lop1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    sget-object p1, Lpp1;->a:Lpp1;

    .line 99
    .line 100
    invoke-static {}, Lpp1;->c()Lop1;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v0, Lbs;

    .line 105
    .line 106
    invoke-direct {v0, v3, v4}, Lbs;-><init>(J)V

    .line 107
    .line 108
    .line 109
    sget-object v3, Lbs;->Companion:Las;

    .line 110
    .line 111
    invoke-virtual {v3}, Las;->serializer()Lw41;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const-string v4, "ChatAvatarRotator/config"

    .line 116
    .line 117
    invoke-virtual {p1, v3, v0, v4}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    return-object v1

    .line 127
    :pswitch_3
    check-cast p1, Lcr;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v0, Lpp1;->a:Lpp1;

    .line 133
    .line 134
    invoke-static {}, Lpp1;->c()Lop1;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v3, Lcr;->Companion:Lbr;

    .line 139
    .line 140
    invoke-virtual {v3}, Lbr;->serializer()Lw41;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    const-string v4, "ChatAutoReply/config"

    .line 145
    .line 146
    invoke-virtual {v0, v3, p1, v4}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    return-object v1

    .line 156
    :pswitch_4
    check-cast p1, Ldi;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    sget-object v0, Lpp1;->a:Lpp1;

    .line 162
    .line 163
    invoke-static {}, Lpp1;->c()Lop1;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sget-object v3, Ldi;->Companion:Lci;

    .line 168
    .line 169
    invoke-virtual {v3}, Lci;->serializer()Lw41;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    const-string v4, "AutoReceiveTransferMoney/config"

    .line 174
    .line 175
    invoke-virtual {v0, v3, p1, v4}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    return-object v1

    .line 185
    :pswitch_5
    check-cast p1, Lch;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    sget-object v0, Lpp1;->a:Lpp1;

    .line 191
    .line 192
    invoke-static {}, Lpp1;->c()Lop1;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sget-object v3, Lch;->Companion:Lbh;

    .line 197
    .line 198
    invoke-virtual {v3}, Lbh;->serializer()Lw41;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    const-string v4, "AutoReceiveRedPacket/config"

    .line 203
    .line 204
    invoke-virtual {v0, v3, p1, v4}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    return-object v1

    .line 214
    :pswitch_6
    check-cast p1, Lde;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    sget-object v0, Lpp1;->a:Lpp1;

    .line 220
    .line 221
    invoke-static {}, Lpp1;->c()Lop1;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v3, Lde;->Companion:Lce;

    .line 226
    .line 227
    invoke-virtual {v3}, Lce;->serializer()Lw41;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    const-string v4, "AntiRevoke/config"

    .line 232
    .line 233
    invoke-virtual {v0, v3, p1, v4}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    return-object v1

    .line 243
    :pswitch_7
    check-cast p1, Lnuke/module/wechat/ai/AIChatConfig;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    sget-object v0, Lpp1;->a:Lpp1;

    .line 249
    .line 250
    invoke-static {}, Lpp1;->c()Lop1;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget-object v3, Lnuke/module/wechat/ai/AIChatConfig;->Companion:Le0;

    .line 255
    .line 256
    invoke-virtual {v3}, Le0;->serializer()Lw41;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    const-string v4, "AIChat/config"

    .line 261
    .line 262
    invoke-virtual {v0, v3, p1, v4}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    return-object v1

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
