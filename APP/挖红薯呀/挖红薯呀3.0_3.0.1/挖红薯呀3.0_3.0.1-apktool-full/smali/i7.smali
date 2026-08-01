.class public final Li7;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li7;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Li7;->e:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Li7;->d:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Lna1;->a:Lna1;

    .line 8
    .line 9
    iget-object v0, v0, Li7;->e:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, Lkb1;

    .line 15
    .line 16
    iget-object v0, v0, Lkb1;->h:Lgp0;

    .line 17
    .line 18
    invoke-virtual {v0, v4}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v4

    .line 22
    :pswitch_0
    new-instance v1, Landroid/view/inputmethod/BaseInputConnection;

    .line 23
    .line 24
    check-cast v0, Le20;

    .line 25
    .line 26
    iget-object v0, v0, Le20;->a:Landroid/view/View;

    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_1
    check-cast v0, Lx41;

    .line 33
    .line 34
    invoke-virtual {v0}, Lx41;->a()Lq60;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v0, Lq60;->d:Lb60;

    .line 39
    .line 40
    invoke-virtual {v1}, Lb60;->o()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lph0;

    .line 45
    .line 46
    iget-object v5, v5, Lph0;->d:Lsh0;

    .line 47
    .line 48
    iget v5, v5, Lsh0;->f:I

    .line 49
    .line 50
    iget v6, v0, Lq60;->q:I

    .line 51
    .line 52
    if-eq v6, v5, :cond_5

    .line 53
    .line 54
    iget-object v0, v0, Lq60;->i:Ljh0;

    .line 55
    .line 56
    iget-object v5, v0, Ljh0;->c:[Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v0, v0, Ljh0;->a:[J

    .line 59
    .line 60
    array-length v6, v0

    .line 61
    add-int/lit8 v6, v6, -0x2

    .line 62
    .line 63
    const/4 v7, 0x7

    .line 64
    if-ltz v6, :cond_3

    .line 65
    .line 66
    move v8, v2

    .line 67
    :goto_0
    aget-wide v9, v0, v8

    .line 68
    .line 69
    not-long v11, v9

    .line 70
    shl-long/2addr v11, v7

    .line 71
    and-long/2addr v11, v9

    .line 72
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long/2addr v11, v13

    .line 78
    cmp-long v11, v11, v13

    .line 79
    .line 80
    if-eqz v11, :cond_2

    .line 81
    .line 82
    sub-int v11, v8, v6

    .line 83
    .line 84
    not-int v11, v11

    .line 85
    ushr-int/lit8 v11, v11, 0x1f

    .line 86
    .line 87
    const/16 v12, 0x8

    .line 88
    .line 89
    rsub-int/lit8 v11, v11, 0x8

    .line 90
    .line 91
    move v13, v2

    .line 92
    :goto_1
    if-ge v13, v11, :cond_1

    .line 93
    .line 94
    const-wide/16 v14, 0xff

    .line 95
    .line 96
    and-long/2addr v14, v9

    .line 97
    const-wide/16 v16, 0x80

    .line 98
    .line 99
    cmp-long v14, v14, v16

    .line 100
    .line 101
    if-gez v14, :cond_0

    .line 102
    .line 103
    shl-int/lit8 v14, v8, 0x3

    .line 104
    .line 105
    add-int/2addr v14, v13

    .line 106
    aget-object v14, v5, v14

    .line 107
    .line 108
    check-cast v14, Li60;

    .line 109
    .line 110
    iput-boolean v3, v14, Li60;->d:Z

    .line 111
    .line 112
    :cond_0
    shr-long/2addr v9, v12

    .line 113
    add-int/lit8 v13, v13, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    if-ne v11, v12, :cond_3

    .line 117
    .line 118
    :cond_2
    if-eq v8, v6, :cond_3

    .line 119
    .line 120
    add-int/lit8 v8, v8, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    iget-object v0, v1, Lb60;->l:Lb60;

    .line 124
    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    iget-object v0, v1, Lb60;->J:Lf60;

    .line 128
    .line 129
    iget-boolean v0, v0, Lf60;->e:Z

    .line 130
    .line 131
    if-nez v0, :cond_5

    .line 132
    .line 133
    invoke-static {v1, v2, v7}, Lb60;->V(Lb60;ZI)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    invoke-virtual {v1}, Lb60;->r()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    invoke-static {v1, v2, v7}, Lb60;->X(Lb60;ZI)V

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_2
    return-object v4

    .line 147
    :pswitch_2
    check-cast v0, Lut0;

    .line 148
    .line 149
    const/4 v1, 0x0

    .line 150
    iput-object v1, v0, Lut0;->g:Lv1;

    .line 151
    .line 152
    const-string v1, "OnPositionedDispatch"

    .line 153
    .line 154
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :try_start_0
    invoke-virtual {v0}, Lut0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    .line 159
    .line 160
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 161
    .line 162
    .line 163
    return-object v4

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :pswitch_3
    check-cast v0, Lgj0;

    .line 170
    .line 171
    invoke-virtual {v0}, Lgj0;->w0()Lyk;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0

    .line 176
    :pswitch_4
    check-cast v0, Ly2;

    .line 177
    .line 178
    iget-object v0, v0, Ly2;->g:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lyk;

    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_5
    check-cast v0, Lba0;

    .line 184
    .line 185
    iget-object v0, v0, Lba0;->a:Lx1;

    .line 186
    .line 187
    iget-object v0, v0, Lx1;->e:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lbd0;

    .line 190
    .line 191
    iget-boolean v1, v0, Lbd0;->e:Z

    .line 192
    .line 193
    if-eqz v1, :cond_6

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_6
    iget-boolean v1, v0, Lbd0;->f:Z

    .line 197
    .line 198
    if-eqz v1, :cond_7

    .line 199
    .line 200
    const-string v1, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 201
    .line 202
    invoke-static {v1}, Lxr0;->a(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :cond_7
    invoke-virtual {v0}, Lbd0;->a()V

    .line 206
    .line 207
    .line 208
    iput-boolean v3, v0, Lbd0;->f:Z

    .line 209
    .line 210
    :goto_3
    return-object v4

    .line 211
    :pswitch_6
    check-cast v0, Li60;

    .line 212
    .line 213
    iget-object v1, v0, Li60;->g:Lgp0;

    .line 214
    .line 215
    invoke-virtual {v1}, Lgp0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-nez v1, :cond_8

    .line 226
    .line 227
    iget-object v0, v0, Li60;->c:Lyi;

    .line 228
    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    invoke-virtual {v0}, Lyi;->l()V

    .line 232
    .line 233
    .line 234
    :cond_8
    return-object v4

    .line 235
    :pswitch_7
    check-cast v0, Lb60;

    .line 236
    .line 237
    iget-object v0, v0, Lb60;->J:Lf60;

    .line 238
    .line 239
    iget-object v1, v0, Lf60;->p:Lwd0;

    .line 240
    .line 241
    iput-boolean v3, v1, Lwd0;->B:Z

    .line 242
    .line 243
    iget-object v0, v0, Lf60;->q:Lec0;

    .line 244
    .line 245
    if-eqz v0, :cond_9

    .line 246
    .line 247
    iput-boolean v3, v0, Lec0;->v:Z

    .line 248
    .line 249
    :cond_9
    return-object v4

    .line 250
    :pswitch_8
    check-cast v0, Le20;

    .line 251
    .line 252
    iget-object v0, v0, Le20;->a:Landroid/view/View;

    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    const-string v1, "input_method"

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_9
    check-cast v0, Ldv;

    .line 271
    .line 272
    invoke-virtual {v0}, Ldv;->y0()Lav;

    .line 273
    .line 274
    .line 275
    return-object v4

    .line 276
    :pswitch_a
    check-cast v0, Lb91;

    .line 277
    .line 278
    invoke-virtual {v0}, Lb91;->c()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    sget-object v4, Lms;->f:Lms;

    .line 283
    .line 284
    if-ne v1, v4, :cond_a

    .line 285
    .line 286
    iget-object v0, v0, Lb91;->d:Lgp0;

    .line 287
    .line 288
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-ne v0, v4, :cond_a

    .line 293
    .line 294
    move v2, v3

    .line 295
    :cond_a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    return-object v0

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
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
