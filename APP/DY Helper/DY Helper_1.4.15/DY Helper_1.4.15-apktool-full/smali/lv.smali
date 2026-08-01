.class public final Llv;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc50;Ly40;La80;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Llv;->ε:I

    .line 3
    .line 4
    iput-object p1, p0, Llv;->ζ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Llv;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p3, Lbp0;

    .line 9
    .line 10
    iput-object p3, p0, Llv;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lur;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p4, p0, Llv;->ε:I

    iput-object p1, p0, Llv;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Llv;->η:Ljava/lang/Object;

    iput-object p3, p0, Llv;->θ:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Llv;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lcw;

    .line 11
    .line 12
    iget-object v2, v0, Llv;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Laq0;

    .line 15
    .line 16
    iget-object v3, v2, Laq0;->ε:Lfe;

    .line 17
    .line 18
    iget-object v4, v2, Laq0;->ζ:Lbw;

    .line 19
    .line 20
    iget-object v5, v0, Llv;->η:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lbw;

    .line 23
    .line 24
    iput-object v5, v2, Laq0;->ζ:Lbw;

    .line 25
    .line 26
    :try_start_0
    invoke-interface {v1}, Lcw;->Β()Lm6;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5}, Lm6;->ω()Lyr;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v1}, Lcw;->Β()Lm6;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v6}, Lm6;->Ε()Lnp0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-interface {v1}, Lcw;->Β()Lm6;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7}, Lm6;->υ()Lde;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-interface {v1}, Lcw;->Β()Lm6;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8}, Lm6;->Ζ()J

    .line 55
    .line 56
    .line 57
    move-result-wide v8

    .line 58
    invoke-interface {v1}, Lcw;->Β()Lm6;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v1, v1, Lm6;->η:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lwa0;

    .line 65
    .line 66
    iget-object v0, v0, Llv;->θ:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La80;

    .line 69
    .line 70
    iget-object v10, v3, Lfe;->ζ:Lm6;

    .line 71
    .line 72
    invoke-virtual {v10}, Lm6;->ω()Lyr;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    iget-object v11, v3, Lfe;->ζ:Lm6;

    .line 77
    .line 78
    invoke-virtual {v11}, Lm6;->Ε()Lnp0;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    iget-object v12, v3, Lfe;->ζ:Lm6;

    .line 83
    .line 84
    invoke-virtual {v12}, Lm6;->υ()Lde;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    iget-object v13, v3, Lfe;->ζ:Lm6;

    .line 89
    .line 90
    invoke-virtual {v13}, Lm6;->Ζ()J

    .line 91
    .line 92
    .line 93
    move-result-wide v13

    .line 94
    iget-object v15, v3, Lfe;->ζ:Lm6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 95
    .line 96
    move-object/from16 p1, v4

    .line 97
    .line 98
    :try_start_1
    iget-object v4, v15, Lm6;->η:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Lwa0;

    .line 101
    .line 102
    invoke-virtual {v15, v5}, Lm6;->Σ(Lyr;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v15, v6}, Lm6;->Τ(Lnp0;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v15, v7}, Lm6;->Ρ(Lde;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v15, v8, v9}, Lm6;->Υ(J)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v15, Lm6;->η:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-interface {v7}, Lde;->θ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    :try_start_2
    invoke-interface {v0, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    .line 121
    .line 122
    :try_start_3
    invoke-interface {v7}, Lde;->ζ()V

    .line 123
    .line 124
    .line 125
    iget-object v0, v3, Lfe;->ζ:Lm6;

    .line 126
    .line 127
    invoke-virtual {v0, v10}, Lm6;->Σ(Lyr;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v11}, Lm6;->Τ(Lnp0;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v12}, Lm6;->Ρ(Lde;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v13, v14}, Lm6;->Υ(J)V

    .line 137
    .line 138
    .line 139
    iput-object v4, v0, Lm6;->η:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    .line 141
    move-object/from16 v1, p1

    .line 142
    .line 143
    iput-object v1, v2, Laq0;->ζ:Lbw;

    .line 144
    .line 145
    sget-object v0, Ls62;->α:Ls62;

    .line 146
    .line 147
    return-object v0

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    move-object/from16 v1, p1

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    move-object/from16 v1, p1

    .line 154
    .line 155
    :try_start_4
    invoke-interface {v7}, Lde;->ζ()V

    .line 156
    .line 157
    .line 158
    iget-object v3, v3, Lfe;->ζ:Lm6;

    .line 159
    .line 160
    invoke-virtual {v3, v10}, Lm6;->Σ(Lyr;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v11}, Lm6;->Τ(Lnp0;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v12}, Lm6;->Ρ(Lde;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v13, v14}, Lm6;->Υ(J)V

    .line 170
    .line 171
    .line 172
    iput-object v4, v3, Lm6;->η:Ljava/lang/Object;

    .line 173
    .line 174
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 175
    :catchall_2
    move-exception v0

    .line 176
    goto :goto_0

    .line 177
    :catchall_3
    move-exception v0

    .line 178
    move-object v1, v4

    .line 179
    :goto_0
    iput-object v1, v2, Laq0;->ζ:Lbw;

    .line 180
    .line 181
    throw v0

    .line 182
    :pswitch_0
    move-object/from16 v1, p1

    .line 183
    .line 184
    check-cast v1, Lc50;

    .line 185
    .line 186
    iget-object v2, v0, Llv;->ζ:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v2, Lc50;

    .line 189
    .line 190
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_0

    .line 195
    .line 196
    const/4 v0, 0x0

    .line 197
    goto :goto_1

    .line 198
    :cond_0
    iget-object v2, v0, Llv;->η:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v2, Ly40;

    .line 201
    .line 202
    iget-object v2, v2, Ly40;->γ:Lc50;

    .line 203
    .line 204
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-nez v2, :cond_1

    .line 209
    .line 210
    iget-object v0, v0, Llv;->θ:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lbp0;

    .line 213
    .line 214
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Ljava/lang/Boolean;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_2

    .line 229
    :cond_1
    const-string v0, "Focus search landed at the root."

    .line 230
    .line 231
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    :goto_2
    return-object v0

    .line 236
    :pswitch_1
    move-object/from16 v1, p1

    .line 237
    .line 238
    check-cast v1, Lx52;

    .line 239
    .line 240
    move-object v2, v1

    .line 241
    check-cast v2, Lmv;

    .line 242
    .line 243
    iget-object v3, v0, Llv;->η:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v3, Lmv;

    .line 246
    .line 247
    invoke-static {v3}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()Lkv;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Le2;

    .line 256
    .line 257
    iget-object v3, v3, Le2;->β:Ld7;

    .line 258
    .line 259
    invoke-virtual {v3, v2}, Ld7;->contains(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_2

    .line 264
    .line 265
    iget-object v3, v0, Llv;->θ:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Ln;

    .line 268
    .line 269
    invoke-static {v3}, Lbd;->φ(Ln;)J

    .line 270
    .line 271
    .line 272
    move-result-wide v3

    .line 273
    invoke-static {v2, v3, v4}, Lxb;->ι(Lmv;J)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eqz v2, :cond_2

    .line 278
    .line 279
    iget-object v0, v0, Llv;->ζ:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Lum1;

    .line 282
    .line 283
    iput-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 284
    .line 285
    sget-object v0, Lw52;->η:Lw52;

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_2
    sget-object v0, Lw52;->ε:Lw52;

    .line 289
    .line 290
    :goto_3
    return-object v0

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
