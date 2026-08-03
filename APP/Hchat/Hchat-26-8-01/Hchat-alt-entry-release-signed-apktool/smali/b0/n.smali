.class public final synthetic Lb0/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/s;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb0/n;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lb0/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/content/Context;

    .line 7
    .line 8
    check-cast p2, Landroid/content/pm/ResolveInfo;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    check-cast p4, Ljava/lang/CharSequence;

    .line 17
    .line 18
    check-cast p5, Li2/m0;

    .line 19
    .line 20
    iget-wide v0, p5, Li2/m0;->a:J

    .line 21
    .line 22
    invoke-static {v0, v1}, Li2/m0;->f(J)I

    .line 23
    .line 24
    .line 25
    move-result p5

    .line 26
    invoke-static {v0, v1}, Li2/m0;->e(J)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p4, p5, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    new-instance p5, Landroid/content/Intent;

    .line 39
    .line 40
    invoke-direct {p5}, Landroid/content/Intent;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v0, "android.intent.action.PROCESS_TEXT"

    .line 44
    .line 45
    invoke-virtual {p5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object p5

    .line 49
    const-string v0, "text/plain"

    .line 50
    .line 51
    invoke-virtual {p5, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object p5

    .line 55
    const-string v0, "android.intent.extra.PROCESS_TEXT_READONLY"

    .line 56
    .line 57
    invoke-virtual {p5, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    iget-object p2, p2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 62
    .line 63
    iget-object p5, p2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 64
    .line 65
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p3, p5, p2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const-string p3, "android.intent.extra.PROCESS_TEXT"

    .line 72
    .line 73
    invoke-virtual {p2, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_0
    check-cast p1, Lz/g;

    .line 83
    .line 84
    check-cast p2, Ld0/d;

    .line 85
    .line 86
    check-cast p3, Lfg/a;

    .line 87
    .line 88
    check-cast p4, Li0/h0;

    .line 89
    .line 90
    check-cast p5, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p5

    .line 96
    and-int/lit8 v0, p5, 0x6

    .line 97
    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    and-int/lit8 v0, p5, 0x8

    .line 101
    .line 102
    if-nez v0, :cond_0

    .line 103
    .line 104
    invoke-virtual {p4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {p4, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    :goto_0
    if-eqz v0, :cond_1

    .line 114
    .line 115
    const/4 v0, 0x4

    .line 116
    goto :goto_1

    .line 117
    :cond_1
    const/4 v0, 0x2

    .line 118
    :goto_1
    or-int/2addr v0, p5

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    move v0, p5

    .line 121
    :goto_2
    and-int/lit8 v1, p5, 0x30

    .line 122
    .line 123
    if-nez v1, :cond_5

    .line 124
    .line 125
    and-int/lit8 v1, p5, 0x40

    .line 126
    .line 127
    if-nez v1, :cond_3

    .line 128
    .line 129
    invoke-virtual {p4, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    goto :goto_3

    .line 134
    :cond_3
    invoke-virtual {p4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    :goto_3
    if-eqz v1, :cond_4

    .line 139
    .line 140
    const/16 v1, 0x20

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_4
    const/16 v1, 0x10

    .line 144
    .line 145
    :goto_4
    or-int/2addr v0, v1

    .line 146
    :cond_5
    and-int/lit16 p5, p5, 0x180

    .line 147
    .line 148
    if-nez p5, :cond_7

    .line 149
    .line 150
    invoke-virtual {p4, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p5

    .line 154
    if-eqz p5, :cond_6

    .line 155
    .line 156
    const/16 p5, 0x100

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_6
    const/16 p5, 0x80

    .line 160
    .line 161
    :goto_5
    or-int/2addr v0, p5

    .line 162
    :cond_7
    and-int/lit16 p5, v0, 0x493

    .line 163
    .line 164
    const/16 v1, 0x492

    .line 165
    .line 166
    if-eq p5, v1, :cond_8

    .line 167
    .line 168
    const/4 p5, 0x1

    .line 169
    goto :goto_6

    .line 170
    :cond_8
    const/4 p5, 0x0

    .line 171
    :goto_6
    and-int/lit8 v1, v0, 0x1

    .line 172
    .line 173
    invoke-virtual {p4, v1, p5}, Li0/h0;->S(IZ)Z

    .line 174
    .line 175
    .line 176
    move-result p5

    .line 177
    if-eqz p5, :cond_9

    .line 178
    .line 179
    and-int/lit16 p5, v0, 0x3fe

    .line 180
    .line 181
    invoke-static {p1, p2, p3, p4, p5}, Lb0/w;->c(Lz/g;Ld0/d;Lfg/a;Li0/h0;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_9
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 186
    .line 187
    .line 188
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 189
    .line 190
    return-object p1

    .line 191
    :pswitch_1
    check-cast p1, Lz/g;

    .line 192
    .line 193
    check-cast p2, Ld0/d;

    .line 194
    .line 195
    check-cast p3, Lfg/a;

    .line 196
    .line 197
    check-cast p4, Li0/h0;

    .line 198
    .line 199
    check-cast p5, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result p5

    .line 205
    and-int/lit8 v0, p5, 0x6

    .line 206
    .line 207
    if-nez v0, :cond_c

    .line 208
    .line 209
    and-int/lit8 v0, p5, 0x8

    .line 210
    .line 211
    if-nez v0, :cond_a

    .line 212
    .line 213
    invoke-virtual {p4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    goto :goto_8

    .line 218
    :cond_a
    invoke-virtual {p4, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    :goto_8
    if-eqz v0, :cond_b

    .line 223
    .line 224
    const/4 v0, 0x4

    .line 225
    goto :goto_9

    .line 226
    :cond_b
    const/4 v0, 0x2

    .line 227
    :goto_9
    or-int/2addr v0, p5

    .line 228
    goto :goto_a

    .line 229
    :cond_c
    move v0, p5

    .line 230
    :goto_a
    and-int/lit8 v1, p5, 0x30

    .line 231
    .line 232
    if-nez v1, :cond_f

    .line 233
    .line 234
    and-int/lit8 v1, p5, 0x40

    .line 235
    .line 236
    if-nez v1, :cond_d

    .line 237
    .line 238
    invoke-virtual {p4, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    goto :goto_b

    .line 243
    :cond_d
    invoke-virtual {p4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    :goto_b
    if-eqz v1, :cond_e

    .line 248
    .line 249
    const/16 v1, 0x20

    .line 250
    .line 251
    goto :goto_c

    .line 252
    :cond_e
    const/16 v1, 0x10

    .line 253
    .line 254
    :goto_c
    or-int/2addr v0, v1

    .line 255
    :cond_f
    and-int/lit16 p5, p5, 0x180

    .line 256
    .line 257
    if-nez p5, :cond_11

    .line 258
    .line 259
    invoke-virtual {p4, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result p5

    .line 263
    if-eqz p5, :cond_10

    .line 264
    .line 265
    const/16 p5, 0x100

    .line 266
    .line 267
    goto :goto_d

    .line 268
    :cond_10
    const/16 p5, 0x80

    .line 269
    .line 270
    :goto_d
    or-int/2addr v0, p5

    .line 271
    :cond_11
    and-int/lit16 p5, v0, 0x493

    .line 272
    .line 273
    const/16 v1, 0x492

    .line 274
    .line 275
    if-eq p5, v1, :cond_12

    .line 276
    .line 277
    const/4 p5, 0x1

    .line 278
    goto :goto_e

    .line 279
    :cond_12
    const/4 p5, 0x0

    .line 280
    :goto_e
    and-int/lit8 v1, v0, 0x1

    .line 281
    .line 282
    invoke-virtual {p4, v1, p5}, Li0/h0;->S(IZ)Z

    .line 283
    .line 284
    .line 285
    move-result p5

    .line 286
    if-eqz p5, :cond_13

    .line 287
    .line 288
    and-int/lit16 p5, v0, 0x3fe

    .line 289
    .line 290
    invoke-static {p1, p2, p3, p4, p5}, Lb0/w;->c(Lz/g;Ld0/d;Lfg/a;Li0/h0;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_f

    .line 294
    :cond_13
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 295
    .line 296
    .line 297
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 298
    .line 299
    return-object p1

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
