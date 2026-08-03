.class public final synthetic Lwb/sc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/sc;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lwb/sc;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/sc;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/sc;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/sc;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/sc;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Double;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    check-cast p2, Ljava/lang/Double;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 15
    .line 16
    .line 17
    move-result-wide v5

    .line 18
    iget-object v0, p0, Lwb/sc;->i:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    iget-object v1, p0, Lwb/sc;->j:Li0/a1;

    .line 21
    .line 22
    iget-object v2, p0, Lwb/sc;->k:Li0/a1;

    .line 23
    .line 24
    invoke-static/range {v0 .. v6}, Lwb/ho;->v0(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;DD)V

    .line 25
    .line 26
    .line 27
    const-string p1, "\u5df2\u4fdd\u5b58\u865a\u62df\u5b9a\u4f4d"

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    iget-object v0, p0, Lwb/sc;->h:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    move-object v5, p1

    .line 43
    check-cast v5, Li0/h0;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    and-int/lit8 p2, p1, 0x3

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    const/4 v7, 0x1

    .line 55
    const/4 v8, 0x0

    .line 56
    if-eq p2, v0, :cond_0

    .line 57
    .line 58
    move p2, v7

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move p2, v8

    .line 61
    :goto_0
    and-int/2addr p1, v7

    .line 62
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_b

    .line 67
    .line 68
    iget-object p1, p0, Lwb/sc;->j:Li0/a1;

    .line 69
    .line 70
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    move-object v1, p2

    .line 75
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    iget-object p2, p0, Lwb/sc;->h:Landroid/content/Context;

    .line 78
    .line 79
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v9, p0, Lwb/sc;->i:Landroid/content/SharedPreferences;

    .line 84
    .line 85
    invoke-virtual {v5, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    or-int/2addr v0, v2

    .line 90
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sget-object v10, Li0/l;->a:Li0/e;

    .line 95
    .line 96
    if-nez v0, :cond_1

    .line 97
    .line 98
    if-ne v2, v10, :cond_2

    .line 99
    .line 100
    :cond_1
    new-instance v2, Lwb/bg;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-direct {v2, v9, p2, p1, v0}, Lwb/bg;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    move-object v3, v2

    .line 110
    check-cast v3, Lfg/a;

    .line 111
    .line 112
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const/4 v11, 0x0

    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    const p1, -0x48a0b8b0

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 132
    .line 133
    .line 134
    move-object v4, v11

    .line 135
    goto :goto_1

    .line 136
    :cond_3
    const v0, -0x48a0617f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    or-int/2addr v0, v2

    .line 151
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-nez v0, :cond_4

    .line 156
    .line 157
    if-ne v2, v10, :cond_5

    .line 158
    .line 159
    :cond_4
    new-instance v2, Lwb/bg;

    .line 160
    .line 161
    const/4 v0, 0x1

    .line 162
    invoke-direct {v2, v9, p2, p1, v0}, Lwb/bg;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_5
    check-cast v2, Lfg/a;

    .line 169
    .line 170
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 171
    .line 172
    .line 173
    move-object v4, v2

    .line 174
    :goto_1
    const/16 v6, 0x186

    .line 175
    .line 176
    const-string v0, "\u6d45\u8272\u6a21\u5f0f\u56fe\u6807"

    .line 177
    .line 178
    const-string v2, "\u672a\u9009\u62e9\u65f6\u4f7f\u7528\u5185\u7f6e\u5feb\u6377\u83dc\u5355\u56fe\u6807"

    .line 179
    .line 180
    invoke-static/range {v0 .. v6}, Lwb/ho;->Q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 181
    .line 182
    .line 183
    const/4 p1, 0x0

    .line 184
    invoke-static {p1, v5, v8, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Lwb/sc;->k:Li0/a1;

    .line 188
    .line 189
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    move-object v1, v0

    .line 194
    check-cast v1, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-virtual {v5, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    or-int/2addr v0, v2

    .line 205
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    if-nez v0, :cond_6

    .line 210
    .line 211
    if-ne v2, v10, :cond_7

    .line 212
    .line 213
    :cond_6
    new-instance v2, Lwb/bg;

    .line 214
    .line 215
    const/4 v0, 0x2

    .line 216
    invoke-direct {v2, v9, p2, p1, v0}, Lwb/bg;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_7
    move-object v3, v2

    .line 223
    check-cast v3, Lfg/a;

    .line 224
    .line 225
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_8

    .line 236
    .line 237
    const p1, -0x488d3d90

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 241
    .line 242
    .line 243
    :goto_2
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 244
    .line 245
    .line 246
    move-object v4, v11

    .line 247
    goto :goto_3

    .line 248
    :cond_8
    const v0, -0x488ce4cc

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    or-int/2addr v0, v2

    .line 263
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    if-nez v0, :cond_9

    .line 268
    .line 269
    if-ne v2, v10, :cond_a

    .line 270
    .line 271
    :cond_9
    new-instance v2, Lwb/bg;

    .line 272
    .line 273
    const/4 v0, 0x3

    .line 274
    invoke-direct {v2, v9, p2, p1, v0}, Lwb/bg;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_a
    move-object v11, v2

    .line 281
    check-cast v11, Lfg/a;

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :goto_3
    const/16 v6, 0x186

    .line 285
    .line 286
    const-string v0, "\u6df1\u8272\u6a21\u5f0f\u56fe\u6807"

    .line 287
    .line 288
    const-string v2, "\u672a\u9009\u62e9\u65f6\u6cbf\u7528\u6d45\u8272\u6a21\u5f0f\u56fe\u6807"

    .line 289
    .line 290
    invoke-static/range {v0 .. v6}, Lwb/ho;->Q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 295
    .line 296
    .line 297
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 298
    .line 299
    return-object p1

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
