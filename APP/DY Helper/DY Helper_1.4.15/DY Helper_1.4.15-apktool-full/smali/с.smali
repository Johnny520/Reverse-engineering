.class public final Lс;
.super Lр;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static ε:Lс;

.field public static ζ:Lс;

.field public static η:Lс;

.field public static final θ:Lrn1;

.field public static final ι:Lrn1;


# instance fields
.field public final synthetic γ:I

.field public δ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lrn1;->ζ:Lrn1;

    .line 2
    .line 3
    sput-object v0, Lс;->θ:Lrn1;

    .line 4
    .line 5
    sget-object v0, Lrn1;->ε:Lrn1;

    .line 6
    .line 7
    sput-object v0, Lс;->ι:Lrn1;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lс;->γ:I

    .line 2
    .line 3
    invoke-direct {p0}, Lр;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public Α(ILrn1;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lс;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm32;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "layoutResult"

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lm32;->γ(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v3, p0, Lс;->δ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lm32;

    .line 17
    .line 18
    if-eqz v3, :cond_3

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Lm32;->ε(I)Lrn1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object p0, p0, Lс;->δ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lm32;

    .line 27
    .line 28
    if-eq p2, v0, :cond_1

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lm32;->γ(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_0
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_1
    if-eqz p0, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lm32;->β:Lg11;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lg11;->β(I)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lg11;->ε:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {p1, p0}, Lbd;->π(ILjava/util/List;)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lm91;

    .line 61
    .line 62
    iget-object p2, p0, Lm91;->α:Ls2;

    .line 63
    .line 64
    iget v0, p0, Lm91;->δ:I

    .line 65
    .line 66
    sub-int/2addr p1, v0

    .line 67
    iget-object p2, p2, Ls2;->δ:Lk32;

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Lk32;->ε(I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iget p0, p0, Lm91;->β:I

    .line 74
    .line 75
    add-int/2addr p1, p0

    .line 76
    add-int/lit8 p1, p1, -0x1

    .line 77
    .line 78
    return p1

    .line 79
    :cond_2
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_3
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_4
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v1
.end method

.method public Β(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lс;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lс;->δ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/text/BreakIterator;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "impl"

    .line 19
    .line 20
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0

    .line 25
    :pswitch_0
    iput-object p1, p0, Lр;->α:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object p0, p0, Lс;->δ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ljava/text/BreakIterator;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string p0, "impl"

    .line 38
    .line 39
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public Γ(I)Z
    .locals 1

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 v0, p1, -0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lс;->Δ(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lс;->Δ(I)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    :cond_0
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public Δ(I)Z
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ge p1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->codePointAt(I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final ζ(I)[I
    .locals 5

    .line 1
    iget v0, p0, Lс;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lt p1, v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-object v0, p0, Lс;->δ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lm32;

    .line 32
    .line 33
    sget-object v2, Lс;->θ:Lrn1;

    .line 34
    .line 35
    const-string v3, "layoutResult"

    .line 36
    .line 37
    if-gez p1, :cond_3

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    invoke-virtual {v0, p1}, Lm32;->α(I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_3
    if-eqz v0, :cond_7

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lm32;->α(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v0, v2}, Lс;->Α(ILrn1;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v4, p1, :cond_4

    .line 62
    .line 63
    move p1, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    add-int/lit8 p1, v0, 0x1

    .line 66
    .line 67
    :goto_0
    iget-object v0, p0, Lс;->δ:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lm32;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    iget-object v0, v0, Lm32;->β:Lg11;

    .line 74
    .line 75
    iget v0, v0, Lg11;->β:I

    .line 76
    .line 77
    if-lt p1, v0, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    invoke-virtual {p0, p1, v2}, Lс;->Α(ILrn1;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    sget-object v1, Lс;->ι:Lrn1;

    .line 85
    .line 86
    invoke-virtual {p0, p1, v1}, Lс;->Α(ILrn1;)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    add-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    invoke-virtual {p0, v0, p1}, Lр;->ο(II)[I

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    :goto_1
    return-object v1

    .line 97
    :cond_6
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :cond_7
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v1

    .line 105
    :pswitch_0
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const/4 v1, 0x0

    .line 114
    if-gtz v0, :cond_8

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_8
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-lt p1, v0, :cond_9

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_9
    if-gez p1, :cond_a

    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    :cond_a
    invoke-virtual {p0, p1}, Lс;->Δ(I)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    const/4 v2, -0x1

    .line 136
    const-string v3, "impl"

    .line 137
    .line 138
    if-nez v0, :cond_d

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Lс;->Δ(I)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_b

    .line 145
    .line 146
    if-eqz p1, :cond_d

    .line 147
    .line 148
    add-int/lit8 v0, p1, -0x1

    .line 149
    .line 150
    invoke-virtual {p0, v0}, Lс;->Δ(I)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_b

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_b
    iget-object v0, p0, Lс;->δ:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/text/BreakIterator;

    .line 160
    .line 161
    if-eqz v0, :cond_c

    .line 162
    .line 163
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->following(I)I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-ne p1, v2, :cond_a

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_c
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_d
    :goto_2
    iget-object v0, p0, Lс;->δ:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Ljava/text/BreakIterator;

    .line 177
    .line 178
    if-eqz v0, :cond_10

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->following(I)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eq v0, v2, :cond_f

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Lс;->Γ(I)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_e

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_e
    invoke-virtual {p0, p1, v0}, Lр;->ο(II)[I

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    :cond_f
    :goto_3
    return-object v1

    .line 198
    :cond_10
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v1

    .line 202
    :pswitch_1
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    const/4 v1, 0x0

    .line 211
    if-gtz v0, :cond_11

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_11
    if-lt p1, v0, :cond_12

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_12
    if-gez p1, :cond_13

    .line 218
    .line 219
    const/4 p1, 0x0

    .line 220
    :cond_13
    iget-object v0, p0, Lс;->δ:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, Ljava/text/BreakIterator;

    .line 223
    .line 224
    const-string v2, "impl"

    .line 225
    .line 226
    if-eqz v0, :cond_18

    .line 227
    .line 228
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->isBoundary(I)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    iget-object v3, p0, Lс;->δ:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, Ljava/text/BreakIterator;

    .line 235
    .line 236
    const/4 v4, -0x1

    .line 237
    if-nez v0, :cond_15

    .line 238
    .line 239
    if-eqz v3, :cond_14

    .line 240
    .line 241
    invoke-virtual {v3, p1}, Ljava/text/BreakIterator;->following(I)I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-ne p1, v4, :cond_13

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_14
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v1

    .line 252
    :cond_15
    if-eqz v3, :cond_17

    .line 253
    .line 254
    invoke-virtual {v3, p1}, Ljava/text/BreakIterator;->following(I)I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-ne v0, v4, :cond_16

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_16
    invoke-virtual {p0, p1, v0}, Lр;->ο(II)[I

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    :goto_4
    return-object v1

    .line 266
    :cond_17
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v1

    .line 270
    :cond_18
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v1

    .line 274
    nop

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ψ(I)[I
    .locals 5

    .line 1
    iget v0, p0, Lс;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    if-gtz p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, Lс;->δ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lm32;

    .line 32
    .line 33
    sget-object v3, Lс;->ι:Lrn1;

    .line 34
    .line 35
    const-string v4, "layoutResult"

    .line 36
    .line 37
    if-le p1, v0, :cond_3

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {v2, p1}, Lm32;->α(I)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-static {v4}, Lln0;->и(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_3
    if-eqz v2, :cond_6

    .line 59
    .line 60
    invoke-virtual {v2, p1}, Lm32;->α(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p0, v0, v3}, Lс;->Α(ILrn1;)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    if-ne v2, p1, :cond_4

    .line 71
    .line 72
    move p1, v0

    .line 73
    goto :goto_0

    .line 74
    :cond_4
    add-int/lit8 p1, v0, -0x1

    .line 75
    .line 76
    :goto_0
    if-gez p1, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    sget-object v0, Lс;->θ:Lrn1;

    .line 80
    .line 81
    invoke-virtual {p0, p1, v0}, Lс;->Α(ILrn1;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {p0, p1, v3}, Lс;->Α(ILrn1;)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    add-int/lit8 p1, p1, 0x1

    .line 90
    .line 91
    invoke-virtual {p0, v0, p1}, Lр;->ο(II)[I

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :goto_1
    return-object v1

    .line 96
    :cond_6
    invoke-static {v4}, Lln0;->и(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :pswitch_0
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v1, 0x0

    .line 109
    if-gtz v0, :cond_7

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_7
    if-gtz p1, :cond_8

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_8
    if-le p1, v0, :cond_9

    .line 116
    .line 117
    move p1, v0

    .line 118
    :cond_9
    const/4 v0, -0x1

    .line 119
    const-string v2, "impl"

    .line 120
    .line 121
    if-lez p1, :cond_b

    .line 122
    .line 123
    add-int/lit8 v3, p1, -0x1

    .line 124
    .line 125
    invoke-virtual {p0, v3}, Lс;->Δ(I)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-nez v3, :cond_b

    .line 130
    .line 131
    invoke-virtual {p0, p1}, Lс;->Γ(I)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_b

    .line 136
    .line 137
    iget-object v3, p0, Lс;->δ:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Ljava/text/BreakIterator;

    .line 140
    .line 141
    if-eqz v3, :cond_a

    .line 142
    .line 143
    invoke-virtual {v3, p1}, Ljava/text/BreakIterator;->preceding(I)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-ne p1, v0, :cond_9

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v1

    .line 154
    :cond_b
    iget-object v3, p0, Lс;->δ:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v3, Ljava/text/BreakIterator;

    .line 157
    .line 158
    if-eqz v3, :cond_e

    .line 159
    .line 160
    invoke-virtual {v3, p1}, Ljava/text/BreakIterator;->preceding(I)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eq v2, v0, :cond_d

    .line 165
    .line 166
    invoke-virtual {p0, v2}, Lс;->Δ(I)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_d

    .line 171
    .line 172
    if-eqz v2, :cond_c

    .line 173
    .line 174
    add-int/lit8 v0, v2, -0x1

    .line 175
    .line 176
    invoke-virtual {p0, v0}, Lс;->Δ(I)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_d

    .line 181
    .line 182
    :cond_c
    invoke-virtual {p0, v2, p1}, Lр;->ο(II)[I

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :cond_d
    :goto_2
    return-object v1

    .line 187
    :cond_e
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v1

    .line 191
    :pswitch_1
    invoke-virtual {p0}, Lр;->ρ()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    const/4 v1, 0x0

    .line 200
    if-gtz v0, :cond_f

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_f
    if-gtz p1, :cond_10

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_10
    if-le p1, v0, :cond_11

    .line 207
    .line 208
    move p1, v0

    .line 209
    :cond_11
    iget-object v0, p0, Lс;->δ:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Ljava/text/BreakIterator;

    .line 212
    .line 213
    const-string v2, "impl"

    .line 214
    .line 215
    if-eqz v0, :cond_16

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->isBoundary(I)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    iget-object v3, p0, Lс;->δ:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v3, Ljava/text/BreakIterator;

    .line 224
    .line 225
    const/4 v4, -0x1

    .line 226
    if-nez v0, :cond_13

    .line 227
    .line 228
    if-eqz v3, :cond_12

    .line 229
    .line 230
    invoke-virtual {v3, p1}, Ljava/text/BreakIterator;->preceding(I)I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-ne p1, v4, :cond_11

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_12
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v1

    .line 241
    :cond_13
    if-eqz v3, :cond_15

    .line 242
    .line 243
    invoke-virtual {v3, p1}, Ljava/text/BreakIterator;->preceding(I)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-ne v0, v4, :cond_14

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_14
    invoke-virtual {p0, v0, p1}, Lр;->ο(II)[I

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    :goto_3
    return-object v1

    .line 255
    :cond_15
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v1

    .line 259
    :cond_16
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v1

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
