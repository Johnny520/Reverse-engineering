.class public final synthetic Lwb/s9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p11, p0, Lwb/s9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/s9;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/s9;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/s9;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/s9;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/s9;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/s9;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/s9;->n:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/s9;->o:Li0/a1;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/s9;->p:Li0/a1;

    .line 20
    .line 21
    iput-object p10, p0, Lwb/s9;->q:Li0/a1;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/s9;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lr/d;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v1, v3, 0x11

    .line 28
    .line 29
    const/16 v4, 0x10

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    if-eq v1, v4, :cond_0

    .line 33
    .line 34
    move v1, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    and-int/2addr v3, v5

    .line 38
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v6, Lwb/pe;

    .line 45
    .line 46
    const/16 v17, 0x2

    .line 47
    .line 48
    iget-object v7, v0, Lwb/s9;->h:Landroid/content/SharedPreferences;

    .line 49
    .line 50
    iget-object v8, v0, Lwb/s9;->i:Li0/a1;

    .line 51
    .line 52
    iget-object v9, v0, Lwb/s9;->j:Li0/a1;

    .line 53
    .line 54
    iget-object v10, v0, Lwb/s9;->k:Li0/a1;

    .line 55
    .line 56
    iget-object v11, v0, Lwb/s9;->l:Li0/a1;

    .line 57
    .line 58
    iget-object v12, v0, Lwb/s9;->m:Li0/a1;

    .line 59
    .line 60
    iget-object v13, v0, Lwb/s9;->n:Li0/a1;

    .line 61
    .line 62
    iget-object v14, v0, Lwb/s9;->o:Li0/a1;

    .line 63
    .line 64
    iget-object v15, v0, Lwb/s9;->p:Li0/a1;

    .line 65
    .line 66
    iget-object v1, v0, Lwb/s9;->q:Li0/a1;

    .line 67
    .line 68
    move-object/from16 v16, v1

    .line 69
    .line 70
    invoke-direct/range {v6 .. v17}, Lwb/pe;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 71
    .line 72
    .line 73
    const v1, -0x726214e7

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/16 v3, 0x30

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 91
    .line 92
    return-object v1

    .line 93
    :pswitch_0
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, Lr/d;

    .line 96
    .line 97
    move-object/from16 v2, p2

    .line 98
    .line 99
    check-cast v2, Li0/h0;

    .line 100
    .line 101
    move-object/from16 v3, p3

    .line 102
    .line 103
    check-cast v3, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    and-int/lit8 v1, v3, 0x11

    .line 113
    .line 114
    const/16 v4, 0x10

    .line 115
    .line 116
    const/4 v5, 0x1

    .line 117
    if-eq v1, v4, :cond_2

    .line 118
    .line 119
    move v1, v5

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    const/4 v1, 0x0

    .line 122
    :goto_2
    and-int/2addr v3, v5

    .line 123
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_3

    .line 128
    .line 129
    new-instance v6, Lwb/pe;

    .line 130
    .line 131
    const/16 v17, 0x1

    .line 132
    .line 133
    iget-object v7, v0, Lwb/s9;->h:Landroid/content/SharedPreferences;

    .line 134
    .line 135
    iget-object v8, v0, Lwb/s9;->i:Li0/a1;

    .line 136
    .line 137
    iget-object v9, v0, Lwb/s9;->j:Li0/a1;

    .line 138
    .line 139
    iget-object v10, v0, Lwb/s9;->k:Li0/a1;

    .line 140
    .line 141
    iget-object v11, v0, Lwb/s9;->l:Li0/a1;

    .line 142
    .line 143
    iget-object v12, v0, Lwb/s9;->m:Li0/a1;

    .line 144
    .line 145
    iget-object v13, v0, Lwb/s9;->n:Li0/a1;

    .line 146
    .line 147
    iget-object v14, v0, Lwb/s9;->o:Li0/a1;

    .line 148
    .line 149
    iget-object v15, v0, Lwb/s9;->p:Li0/a1;

    .line 150
    .line 151
    iget-object v1, v0, Lwb/s9;->q:Li0/a1;

    .line 152
    .line 153
    move-object/from16 v16, v1

    .line 154
    .line 155
    invoke-direct/range {v6 .. v17}, Lwb/pe;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 156
    .line 157
    .line 158
    const v1, 0x54af3254

    .line 159
    .line 160
    .line 161
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const/16 v3, 0x30

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_3
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 173
    .line 174
    .line 175
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 176
    .line 177
    return-object v1

    .line 178
    :pswitch_1
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, Lr/d;

    .line 181
    .line 182
    move-object/from16 v2, p2

    .line 183
    .line 184
    check-cast v2, Li0/h0;

    .line 185
    .line 186
    move-object/from16 v3, p3

    .line 187
    .line 188
    check-cast v3, Ljava/lang/Integer;

    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    and-int/lit8 v1, v3, 0x11

    .line 198
    .line 199
    const/16 v4, 0x10

    .line 200
    .line 201
    const/4 v5, 0x1

    .line 202
    if-eq v1, v4, :cond_4

    .line 203
    .line 204
    move v1, v5

    .line 205
    goto :goto_4

    .line 206
    :cond_4
    const/4 v1, 0x0

    .line 207
    :goto_4
    and-int/2addr v3, v5

    .line 208
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_5

    .line 213
    .line 214
    new-instance v6, Lwb/pe;

    .line 215
    .line 216
    const/16 v17, 0x0

    .line 217
    .line 218
    iget-object v7, v0, Lwb/s9;->h:Landroid/content/SharedPreferences;

    .line 219
    .line 220
    iget-object v8, v0, Lwb/s9;->i:Li0/a1;

    .line 221
    .line 222
    iget-object v9, v0, Lwb/s9;->j:Li0/a1;

    .line 223
    .line 224
    iget-object v10, v0, Lwb/s9;->k:Li0/a1;

    .line 225
    .line 226
    iget-object v11, v0, Lwb/s9;->l:Li0/a1;

    .line 227
    .line 228
    iget-object v12, v0, Lwb/s9;->m:Li0/a1;

    .line 229
    .line 230
    iget-object v13, v0, Lwb/s9;->n:Li0/a1;

    .line 231
    .line 232
    iget-object v14, v0, Lwb/s9;->o:Li0/a1;

    .line 233
    .line 234
    iget-object v15, v0, Lwb/s9;->p:Li0/a1;

    .line 235
    .line 236
    iget-object v1, v0, Lwb/s9;->q:Li0/a1;

    .line 237
    .line 238
    move-object/from16 v16, v1

    .line 239
    .line 240
    invoke-direct/range {v6 .. v17}, Lwb/pe;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 241
    .line 242
    .line 243
    const v1, 0x4550e9cb

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    const/16 v3, 0x30

    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_5
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 258
    .line 259
    .line 260
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 261
    .line 262
    return-object v1

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
