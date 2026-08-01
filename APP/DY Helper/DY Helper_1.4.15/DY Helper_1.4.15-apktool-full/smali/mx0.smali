.class public final Lmx0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lyp0;

.field public final β:Lm6;

.field public γ:Z

.field public δ:Z

.field public final ε:Ln5;

.field public final ζ:Lk21;

.field public final η:J

.field public final θ:Lk21;

.field public ι:Lyo;


# direct methods
.method public constructor <init>(Lyp0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmx0;->α:Lyp0;

    .line 5
    .line 6
    new-instance p1, Lm6;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-direct {p1, v0}, Lm6;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lmx0;->β:Lm6;

    .line 13
    .line 14
    new-instance p1, Ln5;

    .line 15
    .line 16
    const/16 v0, 0x17

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ln5;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lmx0;->ε:Ln5;

    .line 22
    .line 23
    new-instance p1, Lk21;

    .line 24
    .line 25
    const/16 v0, 0x10

    .line 26
    .line 27
    new-array v1, v0, [Lyp0;

    .line 28
    .line 29
    invoke-direct {p1, v1}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lmx0;->ζ:Lk21;

    .line 33
    .line 34
    const-wide/16 v1, 0x1

    .line 35
    .line 36
    iput-wide v1, p0, Lmx0;->η:J

    .line 37
    .line 38
    new-instance p1, Lk21;

    .line 39
    .line 40
    new-array v0, v0, [Llx0;

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lmx0;->θ:Lk21;

    .line 46
    .line 47
    return-void
.end method

.method public static final α(Lmx0;Lyp0;Z)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lmx0;->α:Lyp0;

    .line 2
    .line 3
    iget-boolean v1, p1, Lyp0;->Τ:Z

    .line 4
    .line 5
    iget-object v2, p1, Lyp0;->Λ:Lbq0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_a

    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Lmx0;->κ(Lyp0;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_13

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    iget-object v4, p0, Lmx0;->ι:Lyo;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v4, v1

    .line 28
    :goto_0
    sget-object v5, Lwp0;->η:Lwp0;

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    if-eqz p2, :cond_8

    .line 32
    .line 33
    iget-boolean p2, v2, Lbq0;->ε:Z

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    invoke-static {p1, v4}, Lmx0;->γ(Lyp0;Lyo;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move p2, v3

    .line 43
    :goto_1
    if-nez p2, :cond_3

    .line 44
    .line 45
    iget-boolean v0, v2, Lbq0;->ζ:Z

    .line 46
    .line 47
    if-eqz v0, :cond_12

    .line 48
    .line 49
    :cond_3
    invoke-virtual {p1}, Lyp0;->Ι()Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_12

    .line 60
    .line 61
    iget-object v0, p1, Lyp0;->Η:Lwp0;

    .line 62
    .line 63
    if-ne v0, v5, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Lyp0;->δ()V

    .line 66
    .line 67
    .line 68
    :cond_4
    iget-object p1, v2, Lbq0;->ρ:Ljw0;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :try_start_0
    iput-boolean v6, p1, Ljw0;->λ:Z

    .line 74
    .line 75
    iget-boolean v0, p1, Ljw0;->ο:Z

    .line 76
    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    const-string v0, "replace() called on item that was not placed"

    .line 80
    .line 81
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    goto :goto_4

    .line 87
    :cond_5
    :goto_2
    iput-boolean v3, p1, Ljw0;->Η:Z

    .line 88
    .line 89
    iget-object v0, p1, Ljw0;->υ:Lhw0;

    .line 90
    .line 91
    sget-object v1, Lhw0;->η:Lhw0;

    .line 92
    .line 93
    if-eq v0, v1, :cond_6

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    move v6, v3

    .line 97
    :goto_3
    iget-wide v0, p1, Ljw0;->σ:J

    .line 98
    .line 99
    iget-object v2, p1, Ljw0;->τ:La80;

    .line 100
    .line 101
    invoke-virtual {p1, v0, v1, v2}, Ljw0;->ю(JLa80;)V

    .line 102
    .line 103
    .line 104
    if-eqz v6, :cond_7

    .line 105
    .line 106
    iget-boolean v0, p1, Ljw0;->Η:Z

    .line 107
    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    iget-object v0, p1, Ljw0;->κ:Lbq0;

    .line 111
    .line 112
    iget-object v0, v0, Lbq0;->α:Lyp0;

    .line 113
    .line 114
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    invoke-virtual {v0, v3}, Lyp0;->Ρ(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    :cond_7
    iput-boolean v3, p1, Ljw0;->λ:Z

    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :goto_4
    iput-boolean v3, p1, Ljw0;->λ:Z

    .line 128
    .line 129
    throw p0

    .line 130
    :cond_8
    invoke-virtual {p1}, Lyp0;->ο()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_9

    .line 135
    .line 136
    invoke-static {p1, v4}, Lmx0;->δ(Lyp0;Lyo;)Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    goto :goto_5

    .line 141
    :cond_9
    move p2, v3

    .line 142
    :goto_5
    invoke-virtual {p1}, Lyp0;->ξ()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_12

    .line 147
    .line 148
    if-eq p1, v0, :cond_a

    .line 149
    .line 150
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    if-eqz v4, :cond_12

    .line 155
    .line 156
    invoke-virtual {v4}, Lyp0;->Θ()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-ne v4, v6, :cond_12

    .line 161
    .line 162
    iget-object v4, v2, Lbq0;->π:Lox0;

    .line 163
    .line 164
    iget-boolean v4, v4, Lox0;->χ:Z

    .line 165
    .line 166
    if-eqz v4, :cond_12

    .line 167
    .line 168
    :cond_a
    iget-object v4, p1, Lyp0;->Η:Lwp0;

    .line 169
    .line 170
    if-ne p1, v0, :cond_e

    .line 171
    .line 172
    if-ne v4, v5, :cond_b

    .line 173
    .line 174
    invoke-virtual {p1}, Lyp0;->δ()V

    .line 175
    .line 176
    .line 177
    :cond_b
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-eqz v0, :cond_c

    .line 182
    .line 183
    iget-object v0, v0, Lyp0;->Κ:Lk31;

    .line 184
    .line 185
    iget-object v0, v0, Lk31;->γ:Lgm0;

    .line 186
    .line 187
    if-eqz v0, :cond_c

    .line 188
    .line 189
    iget-object v0, v0, Ldw0;->ο:Lew0;

    .line 190
    .line 191
    if-nez v0, :cond_d

    .line 192
    .line 193
    :cond_c
    invoke-static {p1}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getPlacementScope()Lbh1;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :cond_d
    iget-object v1, v2, Lbq0;->π:Lox0;

    .line 202
    .line 203
    invoke-static {v0, v1, v3, v3}, Lbh1;->ξ(Lbh1;Lch1;II)V

    .line 204
    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_e
    if-ne v4, v5, :cond_f

    .line 208
    .line 209
    invoke-virtual {p1}, Lyp0;->δ()V

    .line 210
    .line 211
    .line 212
    :cond_f
    iget-object v0, v2, Lbq0;->π:Lox0;

    .line 213
    .line 214
    iget-object v2, v0, Lox0;->κ:Lbq0;

    .line 215
    .line 216
    :try_start_1
    iput-boolean v6, v0, Lox0;->λ:Z

    .line 217
    .line 218
    iget-boolean v4, v0, Lox0;->ο:Z

    .line 219
    .line 220
    if-nez v4, :cond_10

    .line 221
    .line 222
    const-string v4, "replace called on unplaced item"

    .line 223
    .line 224
    invoke-static {v4}, Lam0;->β(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :catchall_1
    move-exception p0

    .line 229
    goto :goto_8

    .line 230
    :cond_10
    :goto_6
    iget-boolean v4, v0, Lox0;->φ:Z

    .line 231
    .line 232
    iget-wide v7, v0, Lox0;->ρ:J

    .line 233
    .line 234
    iget-object v5, v0, Lox0;->σ:La80;

    .line 235
    .line 236
    invoke-virtual {v0, v7, v8, v5}, Lox0;->э(JLa80;)V

    .line 237
    .line 238
    .line 239
    if-eqz v4, :cond_11

    .line 240
    .line 241
    iget-boolean v4, v0, Lox0;->Κ:Z

    .line 242
    .line 243
    if-nez v4, :cond_11

    .line 244
    .line 245
    iget-object v4, v2, Lbq0;->α:Lyp0;

    .line 246
    .line 247
    invoke-virtual {v4}, Lyp0;->σ()Lyp0;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    if-eqz v4, :cond_11

    .line 252
    .line 253
    invoke-virtual {v4, v3}, Lyp0;->Τ(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 254
    .line 255
    .line 256
    :cond_11
    iput-boolean v3, v0, Lox0;->λ:Z

    .line 257
    .line 258
    :goto_7
    iget-object v0, p0, Lmx0;->ε:Ln5;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget v1, p1, Lyp0;->Σ:I

    .line 264
    .line 265
    if-lez v1, :cond_12

    .line 266
    .line 267
    iget-object v0, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Lk21;

    .line 270
    .line 271
    invoke-virtual {v0, p1}, Lk21;->β(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iput-boolean v6, p1, Lyp0;->Ρ:Z

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :goto_8
    :try_start_2
    iget-object p1, v2, Lbq0;->α:Lyp0;

    .line 278
    .line 279
    invoke-virtual {p1, p0}, Lyp0;->Ψ(Ljava/lang/Throwable;)V

    .line 280
    .line 281
    .line 282
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 283
    :catchall_2
    move-exception p0

    .line 284
    iput-boolean v3, v0, Lox0;->λ:Z

    .line 285
    .line 286
    throw p0

    .line 287
    :cond_12
    :goto_9
    invoke-virtual {p0}, Lmx0;->ε()V

    .line 288
    .line 289
    .line 290
    return p2

    .line 291
    :cond_13
    :goto_a
    return v3
.end method

.method public static γ(Lyp0;Lyo;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lyp0;->μ:Lyp0;

    .line 2
    .line 3
    iget-object v1, p0, Lyp0;->Λ:Lbq0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v1, Lbq0;->ρ:Ljw0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-wide v3, p1, Lyo;->α:J

    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, Ljw0;->я(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object p1, v1, Lbq0;->ρ:Ljw0;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p1, Ljw0;->ρ:Lyo;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-wide v0, v1, Lyo;->α:J

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Ljw0;->я(J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Lyp0;->μ:Lyp0;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, Lyp0;->Υ(Lyp0;ZI)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_4
    invoke-virtual {p0}, Lyp0;->ρ()Lwp0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v4, Lwp0;->ε:Lwp0;

    .line 70
    .line 71
    if-ne v1, v4, :cond_5

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, Lyp0;->Σ(Lyp0;ZI)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_5
    invoke-virtual {p0}, Lyp0;->ρ()Lwp0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v1, Lwp0;->ζ:Lwp0;

    .line 82
    .line 83
    if-ne p0, v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Lyp0;->Ρ(Z)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return p1
.end method

.method public static δ(Lyp0;Lyo;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lyp0;->Η:Lwp0;

    .line 4
    .line 5
    sget-object v1, Lwp0;->η:Lwp0;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lyp0;->γ()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 13
    .line 14
    iget-object v0, v0, Lbq0;->π:Lox0;

    .line 15
    .line 16
    iget-wide v1, p1, Lyo;->α:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lox0;->ю(J)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {p0}, Lyp0;->Ξ(Lyp0;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    :goto_0
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, Lyp0;->π()Lwp0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, Lwp0;->ε:Lwp0;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    const/4 p0, 0x3

    .line 45
    invoke-static {v0, v3, p0}, Lyp0;->Υ(Lyp0;ZI)V

    .line 46
    .line 47
    .line 48
    return p1

    .line 49
    :cond_2
    invoke-virtual {p0}, Lyp0;->π()Lwp0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object v1, Lwp0;->ζ:Lwp0;

    .line 54
    .line 55
    if-ne p0, v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Lyp0;->Τ(Z)V

    .line 58
    .line 59
    .line 60
    :cond_3
    return p1
.end method

.method public static θ(Lyp0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-boolean v0, v0, Lbq0;->ε:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lyp0;->ρ()Lwp0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lwp0;->η:Lwp0;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 17
    .line 18
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Ljw0;->φ:Lzp0;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lzp0;->ε()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ne p0, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    return v2

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static ι(Lyp0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyp0;->ο()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Lyp0;->π()Lwp0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lwp0;->η:Lwp0;

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 16
    .line 17
    iget-object v0, v0, Lbq0;->π:Lox0;

    .line 18
    .line 19
    iget-object v0, v0, Lox0;->Β:Lzp0;

    .line 20
    .line 21
    invoke-virtual {v0}, Lzp0;->ε()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Lyp0;->Λ:Lbq0;

    .line 34
    .line 35
    iget-object v0, v0, Lbq0;->δ:Lup0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    sget-object v1, Lup0;->ε:Lup0;

    .line 40
    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, Lyp0;->Θ()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public static κ(Lyp0;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyp0;->Θ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, v0, Lbq0;->π:Lox0;

    .line 11
    .line 12
    iget-boolean v1, v1, Lox0;->χ:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Lmx0;->ι(Lyp0;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lyp0;->Ι()Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Lmx0;->θ(Lyp0;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lbq0;->π:Lox0;

    .line 41
    .line 42
    iget-object p0, p0, Lox0;->Β:Lzp0;

    .line 43
    .line 44
    invoke-virtual {p0}, Lzp0;->ε()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    iget-object p0, v0, Lbq0;->ρ:Ljw0;

    .line 51
    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, Ljw0;->φ:Lzp0;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, Lzp0;->ε()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-ne p0, v2, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_1
    :goto_0
    return v2
.end method


# virtual methods
.method public final β(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmx0;->ε:Ln5;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lk21;

    .line 8
    .line 9
    iget-object p0, p0, Lmx0;->α:Lyp0;

    .line 10
    .line 11
    iget v1, p0, Lyp0;->Σ:I

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lk21;->η()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lk21;->β(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lyp0;->Ρ:Z

    .line 23
    .line 24
    :cond_0
    iget-object p0, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lk21;

    .line 27
    .line 28
    iget p0, p0, Lk21;->η:I

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const-string p0, "Compose:onPositionedCallbacks"

    .line 33
    .line 34
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v0}, Ln5;->ο()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    return-void
.end method

.method public final ε()V
    .locals 7

    .line 1
    iget-object p0, p0, Lmx0;->θ:Lk21;

    .line 2
    .line 3
    iget v0, p0, Lk21;->η:I

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v1, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, Llx0;

    .line 15
    .line 16
    iget-object v4, v3, Llx0;->α:Lyp0;

    .line 17
    .line 18
    invoke-virtual {v4}, Lyp0;->Η()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-boolean v4, v3, Llx0;->β:Z

    .line 25
    .line 26
    iget-object v5, v3, Llx0;->α:Lyp0;

    .line 27
    .line 28
    iget-boolean v3, v3, Llx0;->γ:Z

    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v5, v3, v6}, Lyp0;->Υ(Lyp0;ZI)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v5, v3, v6}, Lyp0;->Σ(Lyp0;ZI)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {p0}, Lk21;->η()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
.end method

.method public final ζ(Lyp0;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lmx0;->γ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    .line 6
    .line 7
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Lyp0;->Λ:Lbq0;

    .line 13
    .line 14
    iget-boolean v0, v0, Lbq0;->ε:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Lyp0;->ο()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "node not yet measured"

    .line 24
    .line 25
    invoke-static {v0}, Lam0;->α(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1, p2}, Lmx0;->η(Lyp0;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final η(Lyp0;Z)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lyp0;->ψ()Lk21;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lk21;->η:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v0, :cond_b

    .line 12
    .line 13
    aget-object v4, v1, v3

    .line 14
    .line 15
    check-cast v4, Lyp0;

    .line 16
    .line 17
    sget-object v5, Lwp0;->ε:Lwp0;

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, Lyp0;->π()Lwp0;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    if-eq v7, v5, :cond_1

    .line 27
    .line 28
    iget-object v7, v4, Lyp0;->Λ:Lbq0;

    .line 29
    .line 30
    iget-object v7, v7, Lbq0;->π:Lox0;

    .line 31
    .line 32
    iget-object v7, v7, Lox0;->Β:Lzp0;

    .line 33
    .line 34
    invoke-virtual {v7}, Lzp0;->ε()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    if-eqz p2, :cond_a

    .line 42
    .line 43
    invoke-virtual {v4}, Lyp0;->ρ()Lwp0;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    if-eq v7, v5, :cond_1

    .line 48
    .line 49
    iget-object v5, v4, Lyp0;->Λ:Lbq0;

    .line 50
    .line 51
    iget-object v5, v5, Lbq0;->ρ:Ljw0;

    .line 52
    .line 53
    if-eqz v5, :cond_a

    .line 54
    .line 55
    iget-object v5, v5, Ljw0;->φ:Lzp0;

    .line 56
    .line 57
    if-eqz v5, :cond_a

    .line 58
    .line 59
    invoke-virtual {v5}, Lzp0;->ε()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-ne v5, v6, :cond_a

    .line 64
    .line 65
    :cond_1
    :goto_1
    invoke-static {v4}, Lyh;->Ψ(Lyp0;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    iget-object v7, v4, Lyp0;->Λ:Lbq0;

    .line 70
    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    if-nez p2, :cond_6

    .line 74
    .line 75
    iget-boolean v5, v7, Lbq0;->ε:Z

    .line 76
    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    iget-object v5, p0, Lmx0;->β:Lm6;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v8, v4, Lyp0;->μ:Lyp0;

    .line 85
    .line 86
    if-nez v8, :cond_2

    .line 87
    .line 88
    move v8, v6

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move v8, v2

    .line 91
    :goto_2
    iget-object v9, v5, Lm6;->ζ:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v9, Ln;

    .line 94
    .line 95
    iget-object v9, v9, Ln;->ζ:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v9, Lqx1;

    .line 98
    .line 99
    invoke-virtual {v9, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-nez v9, :cond_4

    .line 104
    .line 105
    iget-object v5, v5, Lm6;->η:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Ln;

    .line 108
    .line 109
    iget-object v5, v5, Ln;->ζ:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, Lqx1;

    .line 112
    .line 113
    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_3

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    move v5, v2

    .line 121
    goto :goto_4

    .line 122
    :cond_4
    :goto_3
    move v5, v6

    .line 123
    :goto_4
    if-nez v8, :cond_5

    .line 124
    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    invoke-virtual {p0, v4, v6}, Lmx0;->ν(Lyp0;Z)Z

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_5
    invoke-virtual {p0, v4, v6}, Lmx0;->ζ(Lyp0;Z)V

    .line 132
    .line 133
    .line 134
    :cond_6
    :goto_5
    if-eqz p2, :cond_7

    .line 135
    .line 136
    iget-boolean v5, v7, Lbq0;->ε:Z

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_7
    invoke-virtual {v4}, Lyp0;->ο()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    :goto_6
    if-eqz v5, :cond_8

    .line 144
    .line 145
    invoke-virtual {p0, v4, p2}, Lmx0;->ν(Lyp0;Z)Z

    .line 146
    .line 147
    .line 148
    :cond_8
    if-eqz p2, :cond_9

    .line 149
    .line 150
    iget-boolean v5, v7, Lbq0;->ε:Z

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_9
    invoke-virtual {v4}, Lyp0;->ο()Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    :goto_7
    if-nez v5, :cond_a

    .line 158
    .line 159
    invoke-virtual {p0, v4, p2}, Lmx0;->η(Lyp0;Z)V

    .line 160
    .line 161
    .line 162
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_b
    if-eqz p2, :cond_c

    .line 167
    .line 168
    iget-object v0, p1, Lyp0;->Λ:Lbq0;

    .line 169
    .line 170
    iget-boolean v0, v0, Lbq0;->ε:Z

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_c
    invoke-virtual {p1}, Lyp0;->ο()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    :goto_8
    if-eqz v0, :cond_d

    .line 178
    .line 179
    invoke-virtual {p0, p1, p2}, Lmx0;->ν(Lyp0;Z)Z

    .line 180
    .line 181
    .line 182
    :cond_d
    return-void
.end method

.method public final λ(Lx0;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lmx0;->β:Lm6;

    .line 4
    .line 5
    iget-object v2, v1, Lmx0;->α:Lyp0;

    .line 6
    .line 7
    invoke-virtual {v2}, Lyp0;->Η()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    const-string v3, "performMeasureAndLayout called with unattached root"

    .line 14
    .line 15
    invoke-static {v3}, Lam0;->α(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, Lyp0;->Θ()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const-string v3, "performMeasureAndLayout called with unplaced root"

    .line 25
    .line 26
    invoke-static {v3}, Lam0;->α(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean v3, v1, Lmx0;->γ:Z

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    const-string v3, "performMeasureAndLayout called during measure layout"

    .line 34
    .line 35
    invoke-static {v3}, Lam0;->α(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v3, v1, Lmx0;->ι:Lyo;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_e

    .line 43
    .line 44
    iput-boolean v5, v1, Lmx0;->γ:Z

    .line 45
    .line 46
    iput-boolean v5, v1, Lmx0;->δ:Z

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v0}, Lm6;->Κ()Z

    .line 49
    .line 50
    .line 51
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iget-object v6, v0, Lm6;->ζ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Ln;

    .line 55
    .line 56
    if-eqz v3, :cond_c

    .line 57
    .line 58
    move v3, v4

    .line 59
    :cond_3
    :goto_0
    :try_start_1
    iget-object v7, v0, Lm6;->θ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Ln;

    .line 62
    .line 63
    iget-object v8, v0, Lm6;->η:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Ln;

    .line 66
    .line 67
    iget-object v9, v6, Ln;->ζ:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Lqx1;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-nez v9, :cond_5

    .line 76
    .line 77
    iget-object v7, v6, Ln;->ζ:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v7, Lqx1;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lyp0;

    .line 86
    .line 87
    invoke-virtual {v6, v7}, Ln;->Γ(Lyp0;)Z

    .line 88
    .line 89
    .line 90
    iget-object v8, v7, Lyp0;->μ:Lyp0;

    .line 91
    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    move v8, v5

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move v8, v4

    .line 97
    :goto_1
    move v9, v4

    .line 98
    goto :goto_3

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_5
    iget-object v9, v8, Ln;->ζ:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, Lqx1;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_7

    .line 111
    .line 112
    iget-object v7, v8, Ln;->ζ:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v7, Lqx1;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Lyp0;

    .line 121
    .line 122
    invoke-virtual {v8, v7}, Ln;->Γ(Lyp0;)Z

    .line 123
    .line 124
    .line 125
    iget-object v8, v7, Lyp0;->μ:Lyp0;

    .line 126
    .line 127
    if-eqz v8, :cond_6

    .line 128
    .line 129
    move v8, v5

    .line 130
    goto :goto_2

    .line 131
    :cond_6
    move v8, v4

    .line 132
    :goto_2
    move v9, v5

    .line 133
    goto :goto_3

    .line 134
    :cond_7
    iget-object v8, v7, Ln;->ζ:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v8, Lqx1;

    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-nez v8, :cond_b

    .line 143
    .line 144
    iget-object v8, v7, Ln;->ζ:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v8, Lqx1;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, Lyp0;

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Ln;->Γ(Lyp0;)Z

    .line 155
    .line 156
    .line 157
    move v9, v5

    .line 158
    move-object v7, v8

    .line 159
    move v8, v4

    .line 160
    :goto_3
    if-eqz v9, :cond_8

    .line 161
    .line 162
    invoke-static {v1, v7, v8}, Lmx0;->α(Lmx0;Lyp0;Z)Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    goto :goto_4

    .line 167
    :cond_8
    invoke-virtual {v1, v7, v8}, Lmx0;->ν(Lyp0;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    iget-object v9, v7, Lyp0;->Λ:Lbq0;

    .line 172
    .line 173
    iget-boolean v9, v9, Lbq0;->ζ:Z

    .line 174
    .line 175
    if-eqz v9, :cond_9

    .line 176
    .line 177
    sget-object v9, Lqn0;->ζ:Lqn0;

    .line 178
    .line 179
    invoke-virtual {v0, v7, v9}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 180
    .line 181
    .line 182
    :cond_9
    invoke-virtual {v7}, Lyp0;->ξ()Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    if-eqz v9, :cond_a

    .line 187
    .line 188
    sget-object v9, Lqn0;->θ:Lqn0;

    .line 189
    .line 190
    invoke-virtual {v0, v7, v9}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_4
    if-ne v7, v2, :cond_3

    .line 194
    .line 195
    if-eqz v8, :cond_3

    .line 196
    .line 197
    move v3, v5

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_b
    if-eqz p1, :cond_d

    .line 201
    .line 202
    invoke-virtual/range {p1 .. p1}, Lx0;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_c
    move v3, v4

    .line 207
    :cond_d
    :goto_5
    iput-boolean v4, v1, Lmx0;->γ:Z

    .line 208
    .line 209
    iput-boolean v4, v1, Lmx0;->δ:Z

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :goto_6
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    iput-boolean v4, v1, Lmx0;->γ:Z

    .line 215
    .line 216
    iput-boolean v4, v1, Lmx0;->δ:Z

    .line 217
    .line 218
    throw v0

    .line 219
    :cond_e
    move v3, v4

    .line 220
    :goto_7
    iget-object v0, v1, Lmx0;->ζ:Lk21;

    .line 221
    .line 222
    iget-object v1, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 223
    .line 224
    iget v2, v0, Lk21;->η:I

    .line 225
    .line 226
    move v6, v4

    .line 227
    :goto_8
    if-ge v6, v2, :cond_1a

    .line 228
    .line 229
    aget-object v7, v1, v6

    .line 230
    .line 231
    check-cast v7, Lyp0;

    .line 232
    .line 233
    iget-object v7, v7, Lyp0;->Κ:Lk31;

    .line 234
    .line 235
    iget-object v8, v7, Lk31;->γ:Lgm0;

    .line 236
    .line 237
    const/high16 v9, 0x400000

    .line 238
    .line 239
    invoke-static {v9}, Lr31;->ζ(I)Z

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    if-eqz v10, :cond_f

    .line 244
    .line 245
    iget-object v11, v8, Lgm0;->Χ:Lq22;

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_f
    iget-object v11, v8, Lgm0;->Χ:Lq22;

    .line 249
    .line 250
    iget-object v11, v11, Lq01;->ι:Lq01;

    .line 251
    .line 252
    if-nez v11, :cond_10

    .line 253
    .line 254
    goto/16 :goto_10

    .line 255
    .line 256
    :cond_10
    :goto_9
    sget-object v12, Lq31;->Σ:Lio1;

    .line 257
    .line 258
    invoke-virtual {v8, v10}, Lq31;->Ч(Z)Lq01;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    :goto_a
    if-eqz v8, :cond_19

    .line 263
    .line 264
    iget v10, v8, Lq01;->θ:I

    .line 265
    .line 266
    and-int/2addr v10, v9

    .line 267
    if-eqz v10, :cond_19

    .line 268
    .line 269
    iget v10, v8, Lq01;->η:I

    .line 270
    .line 271
    and-int/2addr v10, v9

    .line 272
    if-eqz v10, :cond_18

    .line 273
    .line 274
    const/4 v10, 0x0

    .line 275
    move-object v12, v8

    .line 276
    move-object v13, v10

    .line 277
    :goto_b
    if-eqz v12, :cond_18

    .line 278
    .line 279
    instance-of v14, v12, Lkp0;

    .line 280
    .line 281
    if-eqz v14, :cond_11

    .line 282
    .line 283
    check-cast v12, Lkp0;

    .line 284
    .line 285
    iget-object v14, v7, Lk31;->γ:Lgm0;

    .line 286
    .line 287
    invoke-interface {v12, v14}, Lkp0;->ι(Lmp0;)V

    .line 288
    .line 289
    .line 290
    goto :goto_f

    .line 291
    :cond_11
    iget v14, v12, Lq01;->η:I

    .line 292
    .line 293
    and-int/2addr v14, v9

    .line 294
    if-eqz v14, :cond_17

    .line 295
    .line 296
    instance-of v14, v12, Lya;

    .line 297
    .line 298
    if-eqz v14, :cond_17

    .line 299
    .line 300
    move-object v14, v12

    .line 301
    check-cast v14, Lya;

    .line 302
    .line 303
    iget-object v14, v14, Lya;->υ:Lq01;

    .line 304
    .line 305
    move v15, v4

    .line 306
    :goto_c
    if-eqz v14, :cond_16

    .line 307
    .line 308
    iget v4, v14, Lq01;->η:I

    .line 309
    .line 310
    and-int/2addr v4, v9

    .line 311
    if-eqz v4, :cond_15

    .line 312
    .line 313
    add-int/lit8 v15, v15, 0x1

    .line 314
    .line 315
    if-ne v15, v5, :cond_12

    .line 316
    .line 317
    move-object v12, v14

    .line 318
    goto :goto_d

    .line 319
    :cond_12
    if-nez v13, :cond_13

    .line 320
    .line 321
    new-instance v13, Lk21;

    .line 322
    .line 323
    const/16 v4, 0x10

    .line 324
    .line 325
    new-array v4, v4, [Lq01;

    .line 326
    .line 327
    invoke-direct {v13, v4}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_13
    if-eqz v12, :cond_14

    .line 331
    .line 332
    invoke-virtual {v13, v12}, Lk21;->β(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    move-object v12, v10

    .line 336
    :cond_14
    invoke-virtual {v13, v14}, Lk21;->β(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_15
    :goto_d
    iget-object v14, v14, Lq01;->κ:Lq01;

    .line 340
    .line 341
    const/4 v4, 0x0

    .line 342
    goto :goto_c

    .line 343
    :cond_16
    if-ne v15, v5, :cond_17

    .line 344
    .line 345
    :goto_e
    const/4 v4, 0x0

    .line 346
    goto :goto_b

    .line 347
    :cond_17
    :goto_f
    invoke-static {v13}, Lh62;->γ(Lk21;)Lq01;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    goto :goto_e

    .line 352
    :cond_18
    if-eq v8, v11, :cond_19

    .line 353
    .line 354
    iget-object v8, v8, Lq01;->κ:Lq01;

    .line 355
    .line 356
    const/4 v4, 0x0

    .line 357
    goto :goto_a

    .line 358
    :cond_19
    :goto_10
    add-int/lit8 v6, v6, 0x1

    .line 359
    .line 360
    const/4 v4, 0x0

    .line 361
    goto/16 :goto_8

    .line 362
    .line 363
    :cond_1a
    invoke-virtual {v0}, Lk21;->η()V

    .line 364
    .line 365
    .line 366
    return v3
.end method

.method public final μ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lmx0;->β:Lm6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm6;->Κ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    iget-object v1, p0, Lmx0;->α:Lyp0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lyp0;->Η()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v2, "performMeasureAndLayout called with unattached root"

    .line 18
    .line 19
    invoke-static {v2}, Lam0;->α(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1}, Lyp0;->Θ()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "performMeasureAndLayout called with unplaced root"

    .line 29
    .line 30
    invoke-static {v2}, Lam0;->α(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-boolean v2, p0, Lmx0;->γ:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    const-string v2, "performMeasureAndLayout called during measure layout"

    .line 38
    .line 39
    invoke-static {v2}, Lam0;->α(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v2, p0, Lmx0;->ι:Lyo;

    .line 43
    .line 44
    if-eqz v2, :cond_6

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    iput-boolean v2, p0, Lmx0;->γ:Z

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput-boolean v3, p0, Lmx0;->δ:Z

    .line 51
    .line 52
    :try_start_0
    iget-object v4, v0, Lm6;->θ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Ln;

    .line 55
    .line 56
    iget-object v4, v4, Ln;->ζ:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lqx1;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_3

    .line 65
    .line 66
    iget-object v0, v0, Lm6;->ζ:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ln;

    .line 69
    .line 70
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lqx1;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    move v0, v2

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move v0, v3

    .line 83
    :goto_0
    if-eqz v0, :cond_5

    .line 84
    .line 85
    iget-object v0, v1, Lyp0;->μ:Lyp0;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0, v1, v2}, Lmx0;->ο(Lyp0;Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-virtual {p0, v1}, Lmx0;->ξ(Lyp0;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_1
    invoke-virtual {p0, v1, v3}, Lmx0;->ο(Lyp0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    iput-boolean v3, p0, Lmx0;->γ:Z

    .line 102
    .line 103
    iput-boolean v3, p0, Lmx0;->δ:Z

    .line 104
    .line 105
    return-void

    .line 106
    :goto_2
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    iput-boolean v3, p0, Lmx0;->γ:Z

    .line 109
    .line 110
    iput-boolean v3, p0, Lmx0;->δ:Z

    .line 111
    .line 112
    throw v0

    .line 113
    :cond_6
    return-void
.end method

.method public final ν(Lyp0;Z)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, Lyp0;->Τ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    invoke-static {p1}, Lmx0;->κ(Lyp0;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lmx0;->α:Lyp0;

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lmx0;->ι:Lyo;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iget-object p2, p1, Lyp0;->Λ:Lbq0;

    .line 27
    .line 28
    iget-boolean p2, p2, Lbq0;->ε:Z

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    invoke-static {p1, v0}, Lmx0;->γ(Lyp0;Lyo;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {p1}, Lyp0;->ο()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_3

    .line 42
    .line 43
    invoke-static {p1, v0}, Lmx0;->δ(Lyp0;Lyo;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lmx0;->ε()V

    .line 48
    .line 49
    .line 50
    :cond_4
    :goto_2
    return v1
.end method

.method public final ξ(Lyp0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lyp0;->ψ()Lk21;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lk21;->ε:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Lk21;->η:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_3

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Lyp0;

    .line 15
    .line 16
    invoke-virtual {v2}, Lyp0;->π()Lwp0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lwp0;->ε:Lwp0;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, Lyp0;->Λ:Lbq0;

    .line 25
    .line 26
    iget-object v3, v3, Lbq0;->π:Lox0;

    .line 27
    .line 28
    iget-object v3, v3, Lox0;->Β:Lzp0;

    .line 29
    .line 30
    invoke-virtual {v3}, Lzp0;->ε()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    :cond_0
    invoke-static {v2}, Lyh;->Ψ(Lyp0;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-virtual {p0, v2, v3}, Lmx0;->ο(Lyp0;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p0, v2}, Lmx0;->ξ(Lyp0;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
.end method

.method public final ο(Lyp0;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lyp0;->Τ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lmx0;->α:Lyp0;

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lmx0;->ι:Lyo;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-static {p1, p0}, Lmx0;->γ(Lyp0;Lyo;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-static {p1, p0}, Lmx0;->δ(Lyp0;Lyo;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final π(Lyp0;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object v0, v0, Lbq0;->δ:Lup0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    if-eq v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, Lyp0;->ο()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p2, p1, Lyp0;->Λ:Lbq0;

    .line 34
    .line 35
    iget-object p2, p2, Lbq0;->π:Lox0;

    .line 36
    .line 37
    iput-boolean v2, p2, Lox0;->ψ:Z

    .line 38
    .line 39
    iget-boolean p2, p1, Lyp0;->Τ:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Lyp0;->Θ()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {p1}, Lmx0;->ι(Lyp0;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, Lyp0;->ο()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object p2, p0, Lmx0;->β:Lm6;

    .line 70
    .line 71
    sget-object v0, Lqn0;->η:Lqn0;

    .line 72
    .line 73
    invoke-virtual {p2, p1, v0}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-boolean p0, p0, Lmx0;->δ:Z

    .line 77
    .line 78
    if-nez p0, :cond_6

    .line 79
    .line 80
    return v2

    .line 81
    :cond_4
    invoke-static {}, Lγ;->κ()V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    return p0

    .line 86
    :cond_5
    new-instance v0, Llx0;

    .line 87
    .line 88
    invoke-direct {v0, p1, v1, p2}, Llx0;-><init>(Lyp0;ZZ)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, Lmx0;->θ:Lk21;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lk21;->β(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    :goto_1
    return v1
.end method

.method public final ρ(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmx0;->ι:Lyo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-wide v0, v0, Lyo;->α:J

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lyo;->β(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    if-nez v0, :cond_4

    .line 14
    .line 15
    iget-boolean v0, p0, Lmx0;->γ:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string v0, "updateRootConstraints called while measuring"

    .line 20
    .line 21
    invoke-static {v0}, Lam0;->α(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    new-instance v0, Lyo;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2}, Lyo;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lmx0;->ι:Lyo;

    .line 30
    .line 31
    iget-object p1, p0, Lmx0;->α:Lyp0;

    .line 32
    .line 33
    iget-object p2, p1, Lyp0;->μ:Lyp0;

    .line 34
    .line 35
    iget-object v0, p1, Lyp0;->Λ:Lbq0;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iput-boolean v1, v0, Lbq0;->ε:Z

    .line 41
    .line 42
    :cond_2
    iget-object v0, v0, Lbq0;->π:Lox0;

    .line 43
    .line 44
    iput-boolean v1, v0, Lox0;->ψ:Z

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    sget-object p2, Lqn0;->ε:Lqn0;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    sget-object p2, Lqn0;->η:Lqn0;

    .line 52
    .line 53
    :goto_1
    iget-object p0, p0, Lmx0;->β:Lm6;

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-void
.end method
