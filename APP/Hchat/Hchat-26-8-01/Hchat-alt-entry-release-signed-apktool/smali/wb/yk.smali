.class public final synthetic Lwb/yk;
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
    iput p2, p0, Lwb/yk;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/yk;->h:Li0/a1;

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
    .locals 5

    .line 1
    iget v0, p0, Lwb/yk;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_1
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 24
    .line 25
    sget-object v1, Lwb/u3;->a:Lwb/u3;

    .line 26
    .line 27
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    new-instance v0, Lwb/s3;

    .line 32
    .line 33
    new-instance v1, Ln9/a;

    .line 34
    .line 35
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const-string v3, ""

    .line 47
    .line 48
    sget-object v4, Ltf/v;->g:Ltf/v;

    .line 49
    .line 50
    invoke-direct {v1, v2, v3, v4}, Ln9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 51
    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v0, v1, v2}, Lwb/s3;-><init>(Ln9/a;Z)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lwb/yk;->h:Li0/a1;

    .line 58
    .line 59
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_3
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 64
    .line 65
    sget-object v1, Lwb/b;->a:Lwb/b;

    .line 66
    .line 67
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_4
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 72
    .line 73
    sget-object v1, Lwb/hu;->a:Lwb/hu;

    .line 74
    .line 75
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_5
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 80
    .line 81
    sget-object v1, Lwb/so;->a:Lwb/so;

    .line 82
    .line 83
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_6
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 88
    .line 89
    const-string v1, "main"

    .line 90
    .line 91
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_7
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 96
    .line 97
    const-string v1, "ai"

    .line 98
    .line 99
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_8
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 104
    .line 105
    const-string v1, "greetAccepted"

    .line 106
    .line 107
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_9
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 112
    .line 113
    const-string v1, "autoAccept"

    .line 114
    .line 115
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_a
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 120
    .line 121
    const-string v1, "rules"

    .line 122
    .line 123
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_b
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 128
    .line 129
    const-string v1, "main"

    .line 130
    .line 131
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :pswitch_c
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 136
    .line 137
    const-string v1, "greetAccepted"

    .line 138
    .line 139
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :pswitch_d
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 145
    .line 146
    const-string v1, "greetAcceptedLabels"

    .line 147
    .line 148
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :pswitch_e
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 154
    .line 155
    const-string v1, "main"

    .line 156
    .line 157
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :pswitch_f
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 163
    .line 164
    const-string v1, "autoAccept"

    .line 165
    .line 166
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_10
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 172
    .line 173
    const-string v1, "autoAcceptLabels"

    .line 174
    .line 175
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :pswitch_11
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 181
    .line 182
    const-string v1, "main"

    .line 183
    .line 184
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :pswitch_12
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 190
    .line 191
    const/4 v1, 0x0

    .line 192
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :pswitch_13
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 198
    .line 199
    sget-object v1, Lwb/xq;->a:Lwb/xq;

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
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 207
    .line 208
    sget-object v1, Lwb/xq;->c:Lwb/xq;

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
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 216
    .line 217
    sget-object v1, Lwb/xq;->b:Lwb/xq;

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
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 225
    .line 226
    sget-object v1, Lwb/xq;->b:Lwb/xq;

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
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 234
    .line 235
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 243
    .line 244
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 252
    .line 253
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

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
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 261
    .line 262
    const/4 v1, 0x0

    .line 263
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :pswitch_1b
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :pswitch_1c
    iget-object v0, p0, Lwb/yk;->h:Li0/a1;

    .line 277
    .line 278
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
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
