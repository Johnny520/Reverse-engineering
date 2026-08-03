.class public final synthetic Lwb/l9;
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
    iput p2, p0, Lwb/l9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/l9;->h:Li0/a1;

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
    .locals 4

    .line 1
    iget v0, p0, Lwb/l9;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 7
    .line 8
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 25
    .line 26
    const-string v1, "#64748B"

    .line 27
    .line 28
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_1
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 33
    .line 34
    const-string v1, "#FFFFFF"

    .line 35
    .line 36
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_2
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 41
    .line 42
    const-string v1, "#22C55E"

    .line 43
    .line 44
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_3
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 49
    .line 50
    const-string v1, "#FFFFFF"

    .line 51
    .line 52
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_4
    new-instance v0, Landroid/os/Handler;

    .line 57
    .line 58
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lwb/uk;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    iget-object v3, p0, Lwb/l9;->h:Li0/a1;

    .line 69
    .line 70
    invoke-direct {v1, v3, v2}, Lwb/uk;-><init>(Li0/a1;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_5
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 78
    .line 79
    const-string v1, "#FFFFFF"

    .line 80
    .line 81
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :pswitch_6
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 86
    .line 87
    const-string v1, "#2563EB"

    .line 88
    .line 89
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_7
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 94
    .line 95
    const-string v1, "#FFFFFF"

    .line 96
    .line 97
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_8
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 102
    .line 103
    const-string v1, "#F59E0B"

    .line 104
    .line 105
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :pswitch_9
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 110
    .line 111
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :pswitch_a
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 118
    .line 119
    sget-object v1, Lwb/h;->c:Lwb/h;

    .line 120
    .line 121
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :pswitch_b
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 126
    .line 127
    const-string v1, "#FF000000"

    .line 128
    .line 129
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :pswitch_c
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 134
    .line 135
    const-string v1, "#FFFFFFFF"

    .line 136
    .line 137
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :pswitch_d
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 142
    .line 143
    const-string v1, "#FF000000"

    .line 144
    .line 145
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :pswitch_e
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 150
    .line 151
    const-string v1, "#FF000000"

    .line 152
    .line 153
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :pswitch_f
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 159
    .line 160
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :pswitch_10
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 168
    .line 169
    const-string v1, ""

    .line 170
    .line 171
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :pswitch_11
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 177
    .line 178
    sget-object v1, Lwb/h;->a:Lwb/h;

    .line 179
    .line 180
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :pswitch_12
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 186
    .line 187
    sget-object v1, Lwb/h;->b:Lwb/h;

    .line 188
    .line 189
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :pswitch_13
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 195
    .line 196
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :pswitch_14
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 204
    .line 205
    const/4 v1, 0x0

    .line 206
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :pswitch_15
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 212
    .line 213
    const/4 v1, 0x0

    .line 214
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :pswitch_16
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 220
    .line 221
    const/4 v1, 0x0

    .line 222
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :pswitch_17
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 228
    .line 229
    const/4 v1, 0x0

    .line 230
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :pswitch_18
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :pswitch_19
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 244
    .line 245
    const/4 v1, 0x0

    .line 246
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :pswitch_1a
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 252
    .line 253
    const/4 v1, 0x0

    .line 254
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :pswitch_1b
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 260
    .line 261
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 262
    .line 263
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :pswitch_1c
    iget-object v0, p0, Lwb/l9;->h:Li0/a1;

    .line 269
    .line 270
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 271
    .line 272
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
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
