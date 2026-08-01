.class public final synthetic Lys0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic ε:F

.field public final synthetic ζ:Lzr;

.field public final synthetic η:Lan;


# direct methods
.method public synthetic constructor <init>(FLzr;Lan;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lys0;->ε:F

    .line 5
    .line 6
    iput-object p2, p0, Lys0;->ζ:Lzr;

    .line 7
    .line 8
    iput-object p3, p0, Lys0;->η:Lan;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lkc;

    .line 2
    .line 3
    check-cast p2, Lv80;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p3, 0x6

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v1

    .line 28
    :goto_0
    or-int/2addr p3, v0

    .line 29
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eq v0, v2, :cond_2

    .line 36
    .line 37
    move v0, v4

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v0, v3

    .line 40
    :goto_1
    and-int/2addr p3, v4

    .line 41
    invoke-virtual {p2, p3, v0}, Lv80;->Ξ(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_5

    .line 46
    .line 47
    invoke-virtual {p1}, Lkc;->β()F

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    const/high16 v0, 0x41000000    # 8.0f

    .line 52
    .line 53
    int-to-float v1, v1

    .line 54
    mul-float/2addr v0, v1

    .line 55
    sub-float/2addr p3, v0

    .line 56
    int-to-float v0, v3

    .line 57
    invoke-static {p3, v0}, Liv;->α(FF)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-lez v1, :cond_6

    .line 62
    .line 63
    invoke-virtual {p1}, Lkc;->α()F

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {v1, v0}, Liv;->α(FF)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-gtz v0, :cond_3

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    invoke-virtual {p1}, Lkc;->β()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    new-instance v1, Liv;

    .line 80
    .line 81
    invoke-direct {v1, v0}, Liv;-><init>(F)V

    .line 82
    .line 83
    .line 84
    iget v0, p0, Lys0;->ε:F

    .line 85
    .line 86
    mul-float/2addr p3, v0

    .line 87
    new-instance v2, Liv;

    .line 88
    .line 89
    invoke-direct {v2, p3}, Liv;-><init>(F)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v2}, Lbd;->Η(Liv;Liv;)Ljava/lang/Comparable;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    check-cast p3, Liv;

    .line 97
    .line 98
    iget p3, p3, Liv;->ε:F

    .line 99
    .line 100
    invoke-virtual {p1}, Lkc;->α()F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    new-instance v1, Liv;

    .line 105
    .line 106
    invoke-direct {v1, p1}, Liv;-><init>(F)V

    .line 107
    .line 108
    .line 109
    const/high16 p1, 0x42800000    # 64.0f

    .line 110
    .line 111
    mul-float/2addr v0, p1

    .line 112
    new-instance p1, Liv;

    .line 113
    .line 114
    invoke-direct {p1, v0}, Liv;-><init>(F)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1, p1}, Lbd;->Η(Liv;Liv;)Ljava/lang/Comparable;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Liv;

    .line 122
    .line 123
    iget p1, p1, Liv;->ε:F

    .line 124
    .line 125
    sget-object v0, Lp01;->α:Lp01;

    .line 126
    .line 127
    invoke-static {v0, p3}, Lxb;->е(Lr01;F)Lr01;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-static {p3, p1}, Lxb;->Η(Lr01;F)Lr01;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    sget-object p3, Lx;->ζ:Laa;

    .line 136
    .line 137
    invoke-static {p3}, Lec;->δ(Laa;)Lpx0;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    iget-wide v0, p2, Lv80;->Χ:J

    .line 142
    .line 143
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {p2}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {p2, p1}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    sget-object v2, Lln;->β:Lkn;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    sget-object v2, Lkn;->β:Lu40;

    .line 161
    .line 162
    invoke-virtual {p2}, Lv80;->Ψ()V

    .line 163
    .line 164
    .line 165
    iget-boolean v3, p2, Lv80;->Φ:Z

    .line 166
    .line 167
    if-eqz v3, :cond_4

    .line 168
    .line 169
    invoke-virtual {p2, v2}, Lv80;->κ(Lp70;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    invoke-virtual {p2}, Lv80;->и()V

    .line 174
    .line 175
    .line 176
    :goto_2
    sget-object v2, Lkn;->ε:Lui;

    .line 177
    .line 178
    invoke-static {v2, p2, p3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget-object p3, Lkn;->δ:Lui;

    .line 182
    .line 183
    invoke-static {p3, p2, v1}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object p3

    .line 190
    sget-object v0, Lkn;->ζ:Lui;

    .line 191
    .line 192
    invoke-static {v0, p2, p3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    sget-object p3, Lkn;->η:La1;

    .line 196
    .line 197
    invoke-static {p2, p3}, Le81;->ξ(Lv80;La80;)V

    .line 198
    .line 199
    .line 200
    sget-object p3, Lkn;->γ:Lui;

    .line 201
    .line 202
    invoke-static {p3, p2, p1}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    sget-object p1, Lfo;->θ:Lm02;

    .line 206
    .line 207
    iget-object p3, p0, Lys0;->ζ:Lzr;

    .line 208
    .line 209
    invoke-virtual {p1, p3}, Lm02;->α(Ljava/lang/Object;)Lq4;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    new-instance p3, Lcc;

    .line 214
    .line 215
    const/4 v0, 0x4

    .line 216
    iget-object p0, p0, Lys0;->η:Lan;

    .line 217
    .line 218
    invoke-direct {p3, v0, p0}, Lcc;-><init>(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    const p0, 0xcfd2530

    .line 222
    .line 223
    .line 224
    invoke-static {p0, p3, p2}, Lkn0;->Ν(ILm80;Lv80;)Lan;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    const/16 p3, 0x38

    .line 229
    .line 230
    invoke-static {p1, p0, p2, p3}, Lxb;->ε(Lq4;Lan;Lv80;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2, v4}, Lv80;->ο(Z)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_5
    invoke-virtual {p2}, Lv80;->Ρ()V

    .line 238
    .line 239
    .line 240
    :cond_6
    :goto_3
    sget-object p0, Ls62;->α:Ls62;

    .line 241
    .line 242
    return-object p0
.end method
