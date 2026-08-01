.class public final Lvc;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljb2;


# instance fields
.field public ε:Ljava/lang/Object;

.field public ζ:Lae;

.field public final synthetic η:Lwc;


# direct methods
.method public constructor <init>(Lwc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvc;->η:Lwc;

    .line 5
    .line 6
    sget-object p1, Lyc;->π:Luy;

    .line 7
    .line 8
    iput-object p1, p0, Lvc;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final α(Lsr1;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvc;->ζ:Lae;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lae;->α(Lsr1;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final β(Lpp;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, Lvc;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lyc;->π:Luy;

    .line 6
    .line 7
    const/4 v6, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Lyc;->μ:Luy;

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_6

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lwc;->λ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    iget-object v7, v5, Lvc;->η:Lwc;

    .line 19
    .line 20
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lve;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v1, Lwc;->ζ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    invoke-virtual {v7, v1, v2, v6}, Lwc;->σ(JZ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    sget-object v0, Lyc;->μ:Luy;

    .line 42
    .line 43
    iput-object v0, v5, Lvc;->ε:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v7}, Lwc;->ξ()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    sget v1, Lrz1;->α:I

    .line 55
    .line 56
    throw v0

    .line 57
    :cond_2
    sget-object v1, Lwc;->η:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 58
    .line 59
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    sget v1, Lyc;->β:I

    .line 64
    .line 65
    int-to-long v1, v1

    .line 66
    div-long v8, v3, v1

    .line 67
    .line 68
    rem-long v1, v3, v1

    .line 69
    .line 70
    long-to-int v2, v1

    .line 71
    iget-wide v10, v0, Lsr1;->γ:J

    .line 72
    .line 73
    cmp-long v1, v10, v8

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    invoke-virtual {v7, v8, v9, v0}, Lwc;->λ(JLve;)Lve;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-nez v1, :cond_4

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move-object v1, v0

    .line 85
    :cond_4
    const/4 v12, 0x0

    .line 86
    move-object v8, v1

    .line 87
    move v9, v2

    .line 88
    move-wide v10, v3

    .line 89
    invoke-virtual/range {v7 .. v12}, Lwc;->Γ(Lve;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v8, Lyc;->ν:Luy;

    .line 94
    .line 95
    const/4 v9, 0x0

    .line 96
    if-eq v0, v8, :cond_13

    .line 97
    .line 98
    sget-object v10, Lyc;->ο:Luy;

    .line 99
    .line 100
    if-ne v0, v10, :cond_6

    .line 101
    .line 102
    invoke-virtual {v7}, Lwc;->π()J

    .line 103
    .line 104
    .line 105
    move-result-wide v8

    .line 106
    cmp-long v0, v3, v8

    .line 107
    .line 108
    if-gez v0, :cond_5

    .line 109
    .line 110
    invoke-virtual {v1}, Ljo;->α()V

    .line 111
    .line 112
    .line 113
    :cond_5
    move-object v0, v1

    .line 114
    goto :goto_0

    .line 115
    :cond_6
    sget-object v11, Lyc;->ξ:Luy;

    .line 116
    .line 117
    if-ne v0, v11, :cond_12

    .line 118
    .line 119
    iget-object v0, v5, Lvc;->η:Lwc;

    .line 120
    .line 121
    invoke-static/range {p1 .. p1}, Lxb;->Θ(Lop;)Lop;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    invoke-static {v11}, Lxb;->Δ(Lop;)Lae;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    :try_start_0
    iput-object v11, v5, Lvc;->ζ:Lae;

    .line 130
    .line 131
    invoke-virtual/range {v0 .. v5}, Lwc;->Γ(Lve;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    if-ne v12, v8, :cond_7

    .line 136
    .line 137
    invoke-virtual {v5, v1, v2}, Lvc;->α(Lsr1;I)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_4

    .line 141
    .line 142
    :catchall_0
    move-exception v0

    .line 143
    goto/16 :goto_5

    .line 144
    .line 145
    :cond_7
    if-ne v12, v10, :cond_11

    .line 146
    .line 147
    invoke-virtual {v0}, Lwc;->π()J

    .line 148
    .line 149
    .line 150
    move-result-wide v12

    .line 151
    cmp-long v2, v3, v12

    .line 152
    .line 153
    if-gez v2, :cond_8

    .line 154
    .line 155
    invoke-virtual {v1}, Ljo;->α()V

    .line 156
    .line 157
    .line 158
    :cond_8
    sget-object v1, Lwc;->λ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 159
    .line 160
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Lve;

    .line 165
    .line 166
    :cond_9
    :goto_1
    sget-object v2, Lwc;->ζ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    invoke-virtual {v0, v2, v3, v6}, Lwc;->σ(JZ)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_b

    .line 177
    .line 178
    iget-object v0, v5, Lvc;->ζ:Lae;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iput-object v9, v5, Lvc;->ζ:Lae;

    .line 184
    .line 185
    sget-object v1, Lyc;->μ:Luy;

    .line 186
    .line 187
    iput-object v1, v5, Lvc;->ε:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-virtual {v7}, Lwc;->ξ()Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    if-nez v1, :cond_a

    .line 194
    .line 195
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Lae;->ζ(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_a
    new-instance v2, Leo1;

    .line 202
    .line 203
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v2}, Lae;->ζ(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_b
    sget-object v2, Lwc;->η:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 211
    .line 212
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v3

    .line 216
    sget v2, Lyc;->β:I

    .line 217
    .line 218
    int-to-long v12, v2

    .line 219
    div-long v14, v3, v12

    .line 220
    .line 221
    rem-long v12, v3, v12

    .line 222
    .line 223
    long-to-int v2, v12

    .line 224
    iget-wide v12, v1, Lsr1;->γ:J

    .line 225
    .line 226
    cmp-long v8, v12, v14

    .line 227
    .line 228
    if-eqz v8, :cond_d

    .line 229
    .line 230
    invoke-virtual {v0, v14, v15, v1}, Lwc;->λ(JLve;)Lve;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    if-nez v8, :cond_c

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_c
    move-object v1, v8

    .line 238
    :cond_d
    invoke-virtual/range {v0 .. v5}, Lwc;->Γ(Lve;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    sget-object v10, Lyc;->ν:Luy;

    .line 243
    .line 244
    if-ne v8, v10, :cond_e

    .line 245
    .line 246
    invoke-virtual {v5, v1, v2}, Lvc;->α(Lsr1;I)V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_e
    sget-object v2, Lyc;->ο:Luy;

    .line 251
    .line 252
    if-ne v8, v2, :cond_f

    .line 253
    .line 254
    invoke-virtual {v0}, Lwc;->π()J

    .line 255
    .line 256
    .line 257
    move-result-wide v12

    .line 258
    cmp-long v2, v3, v12

    .line 259
    .line 260
    if-gez v2, :cond_9

    .line 261
    .line 262
    invoke-virtual {v1}, Ljo;->α()V

    .line 263
    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_f
    sget-object v0, Lyc;->ξ:Luy;

    .line 267
    .line 268
    if-eq v8, v0, :cond_10

    .line 269
    .line 270
    invoke-virtual {v1}, Ljo;->α()V

    .line 271
    .line 272
    .line 273
    iput-object v8, v5, Lvc;->ε:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v9, v5, Lvc;->ζ:Lae;

    .line 276
    .line 277
    :goto_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 281
    .line 282
    const-string v1, "unexpected"

    .line 283
    .line 284
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    :cond_11
    invoke-virtual {v1}, Ljo;->α()V

    .line 289
    .line 290
    .line 291
    iput-object v12, v5, Lvc;->ε:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object v9, v5, Lvc;->ζ:Lae;

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :goto_3
    invoke-virtual {v11, v0, v9}, Lae;->Γ(Ljava/lang/Object;Lf80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    .line 298
    .line 299
    :goto_4
    invoke-virtual {v11}, Lae;->σ()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0

    .line 304
    :goto_5
    invoke-virtual {v11}, Lae;->Β()V

    .line 305
    .line 306
    .line 307
    throw v0

    .line 308
    :cond_12
    invoke-virtual {v1}, Ljo;->α()V

    .line 309
    .line 310
    .line 311
    iput-object v0, v5, Lvc;->ε:Ljava/lang/Object;

    .line 312
    .line 313
    :goto_6
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    return-object v0

    .line 318
    :cond_13
    const-string v0, "unreachable"

    .line 319
    .line 320
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    return-object v9
.end method

.method public final γ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lvc;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lyc;->π:Luy;

    .line 4
    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    iput-object v1, p0, Lvc;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Lyc;->μ:Luy;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object p0, p0, Lvc;->η:Lwc;

    .line 15
    .line 16
    invoke-virtual {p0}, Lwc;->ξ()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    new-instance p0, Luh;

    .line 23
    .line 24
    const-string v0, "Channel was closed"

    .line 25
    .line 26
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    sget v0, Lrz1;->α:I

    .line 30
    .line 31
    throw p0

    .line 32
    :cond_2
    const-string p0, "`hasNext()` has not been invoked"

    .line 33
    .line 34
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method
