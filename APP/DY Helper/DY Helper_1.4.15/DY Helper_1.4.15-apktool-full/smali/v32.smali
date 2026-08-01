.class public final Lv32;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqp0;
.implements Lbw;
.implements Lzr1;


# instance fields
.field public Α:I

.field public Β:Ljava/util/HashMap;

.field public Γ:Lq91;

.field public Δ:Lw32;

.field public Ε:Lt32;

.field public Ζ:Lu32;

.field public τ:Ljava/lang/String;

.field public υ:Lw32;

.field public φ:Lf50;

.field public χ:I

.field public ψ:Z

.field public ω:I


# virtual methods
.method public final Μ(Laq0;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lv32;->Ζ:Lu32;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Lu32;->γ:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, v0, Lu32;->δ:Lq91;

    .line 20
    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    :cond_2
    invoke-virtual {p0}, Lv32;->В()Lq91;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_3
    iget-object v1, v0, Lq91;->κ:Ls2;

    .line 28
    .line 29
    if-eqz v1, :cond_e

    .line 30
    .line 31
    iget-object p1, p1, Laq0;->ε:Lfe;

    .line 32
    .line 33
    iget-object p1, p1, Lfe;->ζ:Lm6;

    .line 34
    .line 35
    invoke-virtual {p1}, Lm6;->υ()Lde;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-boolean p1, v0, Lq91;->λ:Z

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-wide v3, v0, Lq91;->μ:J

    .line 44
    .line 45
    const/16 v0, 0x20

    .line 46
    .line 47
    shr-long v5, v3, v0

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    int-to-float v5, v0

    .line 51
    const-wide v6, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v3, v6

    .line 57
    long-to-int v0, v3

    .line 58
    int-to-float v6, v0

    .line 59
    invoke-interface {v2}, Lde;->θ()V

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v7, 0x1

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-interface/range {v2 .. v7}, Lde;->γ(FFFFI)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :try_start_0
    invoke-virtual {p0}, Lv32;->Г()Z

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lv32;->Δ:Lw32;

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    iget-object v0, p0, Lv32;->υ:Lw32;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object p0, v0

    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_5
    :goto_1
    iget-object p0, v0, Lw32;->α:Lux1;

    .line 83
    .line 84
    iget-object v0, v0, Lw32;->α:Lux1;

    .line 85
    .line 86
    iget-object v3, p0, Lux1;->ν:Lc32;

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    .line 90
    sget-object v3, Lc32;->β:Lc32;

    .line 91
    .line 92
    :cond_6
    iget-object v4, p0, Lux1;->ξ:Lfv1;

    .line 93
    .line 94
    if-nez v4, :cond_7

    .line 95
    .line 96
    sget-object v4, Lfv1;->δ:Lfv1;

    .line 97
    .line 98
    :cond_7
    iget-object v5, p0, Lux1;->ο:Lkn0;

    .line 99
    .line 100
    if-nez v5, :cond_8

    .line 101
    .line 102
    sget-object v5, Lt30;->π:Lt30;

    .line 103
    .line 104
    :cond_8
    iget-object p0, p0, Lux1;->α:Lf32;

    .line 105
    .line 106
    invoke-interface {p0}, Lf32;->δ()Lkn0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-eqz p0, :cond_9

    .line 111
    .line 112
    iget-object v0, v0, Lux1;->α:Lf32;

    .line 113
    .line 114
    invoke-interface {v0}, Lf32;->ε()F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-object v6, v1, Ls2;->α:Lw2;

    .line 119
    .line 120
    iget-object v6, v6, Lw2;->η:Ld3;

    .line 121
    .line 122
    iget v7, v6, Ld3;->γ:I

    .line 123
    .line 124
    invoke-virtual {v1}, Ls2;->γ()F

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    invoke-virtual {v1}, Ls2;->β()F

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    int-to-long v10, v8

    .line 137
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    int-to-long v8, v8

    .line 142
    const/16 v12, 0x20

    .line 143
    .line 144
    shl-long/2addr v10, v12

    .line 145
    const-wide v12, 0xffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    and-long/2addr v8, v12

    .line 151
    or-long/2addr v8, v10

    .line 152
    invoke-virtual {v6, p0, v8, v9, v0}, Ld3;->γ(Lkn0;JF)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v4}, Ld3;->ζ(Lfv1;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v3}, Ld3;->η(Lc32;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v5}, Ld3;->ε(Lkn0;)V

    .line 162
    .line 163
    .line 164
    const/4 p0, 0x3

    .line 165
    invoke-virtual {v6, p0}, Ld3;->β(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ls2;->δ(Lde;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6, v7}, Ld3;->β(I)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_9
    sget-wide v6, Lci;->η:J

    .line 176
    .line 177
    const-wide/16 v8, 0x10

    .line 178
    .line 179
    cmp-long p0, v6, v8

    .line 180
    .line 181
    if-eqz p0, :cond_a

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_a
    iget-object p0, v0, Lux1;->α:Lf32;

    .line 185
    .line 186
    invoke-interface {p0}, Lf32;->β()J

    .line 187
    .line 188
    .line 189
    move-result-wide v6

    .line 190
    cmp-long p0, v6, v8

    .line 191
    .line 192
    if-eqz p0, :cond_b

    .line 193
    .line 194
    iget-object p0, v0, Lux1;->α:Lf32;

    .line 195
    .line 196
    invoke-interface {p0}, Lf32;->β()J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    goto :goto_2

    .line 201
    :cond_b
    sget-wide v6, Lci;->β:J

    .line 202
    .line 203
    :goto_2
    iget-object p0, v1, Ls2;->α:Lw2;

    .line 204
    .line 205
    iget-object p0, p0, Lw2;->η:Ld3;

    .line 206
    .line 207
    iget v0, p0, Ld3;->γ:I

    .line 208
    .line 209
    invoke-virtual {p0, v6, v7}, Ld3;->δ(J)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v4}, Ld3;->ζ(Lfv1;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v3}, Ld3;->η(Lc32;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v5}, Ld3;->ε(Lkn0;)V

    .line 219
    .line 220
    .line 221
    const/4 v3, 0x3

    .line 222
    invoke-virtual {p0, v3}, Ld3;->β(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v2}, Ls2;->δ(Lde;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0}, Ld3;->β(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    .line 230
    .line 231
    :goto_3
    if-eqz p1, :cond_c

    .line 232
    .line 233
    invoke-interface {v2}, Lde;->ζ()V

    .line 234
    .line 235
    .line 236
    :cond_c
    :goto_4
    return-void

    .line 237
    :goto_5
    if-eqz p1, :cond_d

    .line 238
    .line 239
    invoke-interface {v2}, Lde;->ζ()V

    .line 240
    .line 241
    .line 242
    :cond_d
    throw p0

    .line 243
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v0, "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="

    .line 246
    .line 247
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Lv32;->Γ:Lq91;

    .line 251
    .line 252
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v0, ", textSubstitution="

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    iget-object p0, p0, Lv32;->Ζ:Lu32;

    .line 261
    .line 262
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const/16 p0, 0x29

    .line 266
    .line 267
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-static {p0}, Ldm0;->β(Ljava/lang/String;)Ljava/lang/Void;

    .line 275
    .line 276
    .line 277
    new-instance p0, Lpm;

    .line 278
    .line 279
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 280
    .line 281
    .line 282
    throw p0
.end method

.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 8

    .line 1
    const-string v0, "TextStringSimpleNode::measure"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lv32;->Г()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lv32;->Δ:Lw32;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lv32;->υ:Lw32;

    .line 17
    .line 18
    :cond_0
    move-object v2, v0

    .line 19
    invoke-virtual {p0}, Lv32;->В()Lq91;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lv32;->τ:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p0, Lv32;->φ:Lf50;

    .line 26
    .line 27
    iget v4, p0, Lv32;->χ:I

    .line 28
    .line 29
    iget-boolean v5, p0, Lv32;->ψ:Z

    .line 30
    .line 31
    iget v6, p0, Lv32;->ω:I

    .line 32
    .line 33
    iget v7, p0, Lv32;->Α:I

    .line 34
    .line 35
    invoke-virtual/range {v0 .. v7}, Lq91;->δ(Ljava/lang/String;Lw32;Lf50;IZII)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lv32;->Ζ:Lu32;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-boolean v1, v0, Lu32;->γ:Z

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 v0, 0x0

    .line 48
    :goto_0
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v0, v0, Lu32;->δ:Lq91;

    .line 51
    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    :cond_3
    invoke-virtual {p0}, Lv32;->В()Lq91;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_4
    invoke-virtual {v0, p1}, Lq91;->γ(Lyr;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Lrx0;->getLayoutDirection()Lnp0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, p3, p4, v1}, Lq91;->α(JLnp0;)Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    iget-object p4, v0, Lq91;->ξ:Lo91;

    .line 70
    .line 71
    if-eqz p4, :cond_5

    .line 72
    .line 73
    invoke-interface {p4}, Lo91;->α()Z

    .line 74
    .line 75
    .line 76
    :cond_5
    iget-object p4, v0, Lq91;->κ:Ls2;

    .line 77
    .line 78
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p4, p4, Ls2;->δ:Lk32;

    .line 82
    .line 83
    iget-wide v0, v0, Lq91;->μ:J

    .line 84
    .line 85
    if-eqz p3, :cond_7

    .line 86
    .line 87
    const/4 p3, 0x2

    .line 88
    invoke-static {p0, p3}, Lh62;->ф(Lur;I)Lq31;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Lq31;->Я()V

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lv32;->Β:Ljava/util/HashMap;

    .line 96
    .line 97
    if-nez v2, :cond_6

    .line 98
    .line 99
    new-instance v2, Ljava/util/HashMap;

    .line 100
    .line 101
    invoke-direct {v2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 102
    .line 103
    .line 104
    iput-object v2, p0, Lv32;->Β:Ljava/util/HashMap;

    .line 105
    .line 106
    :cond_6
    sget-object p3, La0;->α:Lre0;

    .line 107
    .line 108
    const/4 v3, 0x0

    .line 109
    invoke-virtual {p4, v3}, Lk32;->γ(I)F

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    sget-object p3, La0;->β:Lre0;

    .line 125
    .line 126
    iget v3, p4, Lk32;->ζ:I

    .line 127
    .line 128
    add-int/lit8 v3, v3, -0x1

    .line 129
    .line 130
    invoke-virtual {p4, v3}, Lk32;->γ(I)F

    .line 131
    .line 132
    .line 133
    move-result p4

    .line 134
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 135
    .line 136
    .line 137
    move-result p4

    .line 138
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    invoke-interface {v2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_7
    const/16 p3, 0x20

    .line 146
    .line 147
    shr-long p3, v0, p3

    .line 148
    .line 149
    long-to-int v3, p3

    .line 150
    const-wide p3, 0xffffffffL

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    and-long/2addr p3, v0

    .line 156
    long-to-int v4, p3

    .line 157
    invoke-static {v3, v3, v4, v4}, Lyh;->Ζ(IIII)J

    .line 158
    .line 159
    .line 160
    move-result-wide p3

    .line 161
    invoke-interface {p2, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    iget-object v5, p0, Lv32;->Β:Ljava/util/HashMap;

    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v7, Lv30;

    .line 171
    .line 172
    const/4 p0, 0x2

    .line 173
    invoke-direct {v7, p2, p0}, Lv30;-><init>(Lch1;I)V

    .line 174
    .line 175
    .line 176
    const/4 v6, 0x0

    .line 177
    move-object v2, p1

    .line 178
    invoke-virtual/range {v2 .. v7}, Ldw0;->Ν(IILjava/util/Map;La80;La80;)Lqx0;

    .line 179
    .line 180
    .line 181
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :catchall_0
    move-exception v0

    .line 187
    move-object p0, v0

    .line 188
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 189
    .line 190
    .line 191
    throw p0
.end method

.method public final Ω(Ljs1;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lv32;->Ε:Lt32;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lt32;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lt32;-><init>(Lv32;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lv32;->Ε:Lt32;

    .line 12
    .line 13
    :cond_0
    new-instance v1, Lg4;

    .line 14
    .line 15
    iget-object v2, p0, Lv32;->τ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lg4;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lhs1;->α:[Lso0;

    .line 21
    .line 22
    sget-object v2, Lfs1;->Β:Lis1;

    .line 23
    .line 24
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1, v2, v1}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lv32;->Ζ:Lu32;

    .line 32
    .line 33
    const/16 v2, 0x11

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-boolean v3, v1, Lu32;->γ:Z

    .line 38
    .line 39
    sget-object v4, Lfs1;->Δ:Lis1;

    .line 40
    .line 41
    sget-object v5, Lhs1;->α:[Lso0;

    .line 42
    .line 43
    aget-object v6, v5, v2

    .line 44
    .line 45
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {p1, v4, v3}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lg4;

    .line 53
    .line 54
    iget-object v1, v1, Lu32;->β:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v3, v1}, Lg4;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Lfs1;->Γ:Lis1;

    .line 60
    .line 61
    const/16 v4, 0x10

    .line 62
    .line 63
    aget-object v4, v5, v4

    .line 64
    .line 65
    invoke-interface {p1, v1, v3}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-instance v1, Lt32;

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    invoke-direct {v1, p0, v3}, Lt32;-><init>(Lv32;I)V

    .line 72
    .line 73
    .line 74
    sget-object v3, Lwr1;->λ:Lis1;

    .line 75
    .line 76
    new-instance v4, Lм;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-direct {v4, v5, v1}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v3, v4}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lt32;

    .line 86
    .line 87
    const/4 v3, 0x2

    .line 88
    invoke-direct {v1, p0, v3}, Lt32;-><init>(Lv32;I)V

    .line 89
    .line 90
    .line 91
    sget-object v3, Lwr1;->μ:Lis1;

    .line 92
    .line 93
    new-instance v4, Lм;

    .line 94
    .line 95
    invoke-direct {v4, v5, v1}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v3, v4}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Lη;

    .line 102
    .line 103
    invoke-direct {v1, v2, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lwr1;->ν:Lis1;

    .line 107
    .line 108
    new-instance v2, Lм;

    .line 109
    .line 110
    invoke-direct {v2, v5, v1}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p1, p0, v2}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lwr1;->α:Lis1;

    .line 117
    .line 118
    new-instance v1, Lм;

    .line 119
    .line 120
    invoke-direct {v1, v5, v0}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, p0, v1}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final В()Lq91;
    .locals 9

    .line 1
    iget-object v0, p0, Lv32;->Δ:Lw32;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv32;->υ:Lw32;

    .line 6
    .line 7
    :cond_0
    move-object v3, v0

    .line 8
    iget-object v0, p0, Lv32;->Γ:Lq91;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v1, Lq91;

    .line 13
    .line 14
    iget-object v2, p0, Lv32;->τ:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, p0, Lv32;->φ:Lf50;

    .line 17
    .line 18
    iget v5, p0, Lv32;->χ:I

    .line 19
    .line 20
    iget-boolean v6, p0, Lv32;->ψ:Z

    .line 21
    .line 22
    iget v7, p0, Lv32;->ω:I

    .line 23
    .line 24
    iget v8, p0, Lv32;->Α:I

    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, Lq91;-><init>(Ljava/lang/String;Lw32;Lf50;IZII)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lv32;->Γ:Lq91;

    .line 30
    .line 31
    :cond_1
    iget-object p0, p0, Lv32;->Γ:Lq91;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public final Г()Z
    .locals 13

    .line 1
    iget-object v0, p0, Lv32;->Δ:Lw32;

    .line 2
    .line 3
    iget-object v1, p0, Lv32;->υ:Lw32;

    .line 4
    .line 5
    iget-object v2, p0, Lq01;->ε:Lq01;

    .line 6
    .line 7
    iget-boolean v2, v2, Lq01;->σ:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, "visitAncestors called on an unattached node"

    .line 12
    .line 13
    invoke-static {v2}, Lam0;->β(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v2, p0, Lq01;->ε:Lq01;

    .line 17
    .line 18
    iget-object v2, v2, Lq01;->ι:Lq01;

    .line 19
    .line 20
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :goto_0
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x1

    .line 26
    if-eqz v3, :cond_b

    .line 27
    .line 28
    iget-object v6, v3, Lyp0;->Κ:Lk31;

    .line 29
    .line 30
    iget-object v6, v6, Lk31;->ζ:Lq01;

    .line 31
    .line 32
    iget v6, v6, Lq01;->θ:I

    .line 33
    .line 34
    const/high16 v7, 0x40000

    .line 35
    .line 36
    and-int/2addr v6, v7

    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v6, :cond_9

    .line 39
    .line 40
    :goto_1
    if-eqz v2, :cond_9

    .line 41
    .line 42
    iget v6, v2, Lq01;->η:I

    .line 43
    .line 44
    and-int/2addr v6, v7

    .line 45
    if-eqz v6, :cond_8

    .line 46
    .line 47
    move-object v6, v2

    .line 48
    move-object v9, v8

    .line 49
    :goto_2
    if-eqz v6, :cond_8

    .line 50
    .line 51
    instance-of v10, v6, Lx52;

    .line 52
    .line 53
    if-eqz v10, :cond_1

    .line 54
    .line 55
    check-cast v6, Lx52;

    .line 56
    .line 57
    invoke-interface {v6}, Lx52;->λ()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    const-string v10, "StyleOuterNode"

    .line 62
    .line 63
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_1
    iget v10, v6, Lq01;->η:I

    .line 68
    .line 69
    and-int/2addr v10, v7

    .line 70
    if-eqz v10, :cond_7

    .line 71
    .line 72
    instance-of v10, v6, Lya;

    .line 73
    .line 74
    if-eqz v10, :cond_7

    .line 75
    .line 76
    move-object v10, v6

    .line 77
    check-cast v10, Lya;

    .line 78
    .line 79
    iget-object v10, v10, Lya;->υ:Lq01;

    .line 80
    .line 81
    move v11, v4

    .line 82
    :goto_3
    if-eqz v10, :cond_6

    .line 83
    .line 84
    iget v12, v10, Lq01;->η:I

    .line 85
    .line 86
    and-int/2addr v12, v7

    .line 87
    if-eqz v12, :cond_5

    .line 88
    .line 89
    add-int/lit8 v11, v11, 0x1

    .line 90
    .line 91
    if-ne v11, v5, :cond_2

    .line 92
    .line 93
    move-object v6, v10

    .line 94
    goto :goto_4

    .line 95
    :cond_2
    if-nez v9, :cond_3

    .line 96
    .line 97
    new-instance v9, Lk21;

    .line 98
    .line 99
    const/16 v12, 0x10

    .line 100
    .line 101
    new-array v12, v12, [Lq01;

    .line 102
    .line 103
    invoke-direct {v9, v12}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    if-eqz v6, :cond_4

    .line 107
    .line 108
    invoke-virtual {v9, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v6, v8

    .line 112
    :cond_4
    invoke-virtual {v9, v10}, Lk21;->β(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    :goto_4
    iget-object v10, v10, Lq01;->κ:Lq01;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    if-ne v11, v5, :cond_7

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    :goto_5
    invoke-static {v9}, Lh62;->γ(Lk21;)Lq01;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    goto :goto_2

    .line 126
    :cond_8
    iget-object v2, v2, Lq01;->ι:Lq01;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_9
    invoke-virtual {v3}, Lyp0;->σ()Lyp0;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_a

    .line 134
    .line 135
    iget-object v2, v3, Lyp0;->Κ:Lk31;

    .line 136
    .line 137
    if-eqz v2, :cond_a

    .line 138
    .line 139
    iget-object v2, v2, Lk31;->ε:Lq22;

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_a
    move-object v2, v8

    .line 143
    goto :goto_0

    .line 144
    :cond_b
    iput-object v1, p0, Lv32;->Δ:Lw32;

    .line 145
    .line 146
    if-nez v0, :cond_c

    .line 147
    .line 148
    return v4

    .line 149
    :cond_c
    invoke-virtual {v0, v1}, Lw32;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    xor-int/2addr p0, v5

    .line 154
    return p0
.end method

.method public final ф()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
