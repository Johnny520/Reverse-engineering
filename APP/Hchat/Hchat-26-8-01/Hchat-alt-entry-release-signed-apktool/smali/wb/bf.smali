.class public final synthetic Lwb/bf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/bf;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/bf;->h:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/bf;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/List;

    .line 13
    .line 14
    new-instance v2, Lx8/s;

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "\u4f60\u597d"

    .line 25
    .line 26
    const/16 v5, 0x1a

    .line 27
    .line 28
    invoke-direct {v2, v5, v3, v4}, Lx8/s;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 42
    .line 43
    sget-object v1, Lwb/h4;->b:Lwb/h4;

    .line 44
    .line 45
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_1
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 50
    .line 51
    sget-object v1, Lwb/h4;->d:Lwb/h4;

    .line 52
    .line 53
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_2
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 58
    .line 59
    sget-object v1, Lwb/h4;->b:Lwb/h4;

    .line 60
    .line 61
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_3
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 66
    .line 67
    sget-object v1, Lwb/h4;->b:Lwb/h4;

    .line 68
    .line 69
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :pswitch_4
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 74
    .line 75
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :pswitch_5
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 82
    .line 83
    const-string v1, ""

    .line 84
    .line 85
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_6
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 90
    .line 91
    const-string v1, ""

    .line 92
    .line 93
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :pswitch_7
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 98
    .line 99
    const-string v1, "#FFFFFF"

    .line 100
    .line 101
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_8
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 106
    .line 107
    const-string v1, ""

    .line 108
    .line 109
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_9
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 114
    .line 115
    const-string v1, ""

    .line 116
    .line 117
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :pswitch_a
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 122
    .line 123
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :pswitch_b
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 130
    .line 131
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :pswitch_c
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 138
    .line 139
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :pswitch_d
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 146
    .line 147
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :pswitch_e
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 154
    .line 155
    sget-object v1, Lwb/r5;->i:Lwb/r5;

    .line 156
    .line 157
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :pswitch_f
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 162
    .line 163
    sget-object v1, Lwb/r5;->h:Lwb/r5;

    .line 164
    .line 165
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :pswitch_10
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 171
    .line 172
    sget-object v1, Lwb/r5;->g:Lwb/r5;

    .line 173
    .line 174
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :pswitch_11
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 180
    .line 181
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :pswitch_12
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 189
    .line 190
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :pswitch_13
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 198
    .line 199
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :pswitch_14
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 207
    .line 208
    sget-object v1, Lwb/r3;->h:Lwb/r3;

    .line 209
    .line 210
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :pswitch_15
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 216
    .line 217
    sget-object v1, Lwb/h4;->a:Lwb/h4;

    .line 218
    .line 219
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :pswitch_16
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 225
    .line 226
    sget-object v1, Lwb/h4;->d:Lwb/h4;

    .line 227
    .line 228
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :pswitch_17
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 234
    .line 235
    sget-object v1, Lwb/h4;->b:Lwb/h4;

    .line 236
    .line 237
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :pswitch_18
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 243
    .line 244
    sget-object v1, Lwb/j2;->h:Lwb/j2;

    .line 245
    .line 246
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :pswitch_19
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 252
    .line 253
    const-string v1, "#576B95"

    .line 254
    .line 255
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :pswitch_1a
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 261
    .line 262
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :pswitch_1b
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 270
    .line 271
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 272
    .line 273
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :pswitch_1c
    iget-object v0, p0, Lwb/bf;->h:Li0/a1;

    .line 279
    .line 280
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 281
    .line 282
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
