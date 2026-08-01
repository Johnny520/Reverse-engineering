.class public final Lya;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lzr1;


# instance fields
.field public final Α:Lgd;

.field public final τ:I

.field public υ:Lq01;

.field public φ:Lta;

.field public χ:F

.field public ψ:Lpx1;

.field public ω:Liv1;


# direct methods
.method public constructor <init>(FLpx1;Liv1;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lq01;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lr31;->δ(Lq01;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lya;->τ:I

    .line 9
    .line 10
    iput p1, p0, Lya;->χ:F

    .line 11
    .line 12
    iput-object p2, p0, Lya;->ψ:Lpx1;

    .line 13
    .line 14
    iput-object p3, p0, Lya;->ω:Liv1;

    .line 15
    .line 16
    new-instance p1, Lθ;

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    invoke-direct {p1, p2, p0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p2, Lgd;

    .line 23
    .line 24
    new-instance p3, Lhd;

    .line 25
    .line 26
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lx;->Λ:Lx;

    .line 30
    .line 31
    iput-object v0, p3, Lhd;->ε:Lcd;

    .line 32
    .line 33
    invoke-direct {p2, p3, p1}, Lgd;-><init>(Lhd;Lθ;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p2, Lq01;->ε:Lq01;

    .line 37
    .line 38
    if-eq p1, p2, :cond_1

    .line 39
    .line 40
    iget-object p3, p2, Lq01;->ι:Lq01;

    .line 41
    .line 42
    iget-object v0, p0, Lq01;->ε:Lq01;

    .line 43
    .line 44
    if-ne p1, v0, :cond_0

    .line 45
    .line 46
    invoke-static {p3, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_0
    const-string p0, "Cannot delegate to an already delegated node"

    .line 55
    .line 56
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    throw p0

    .line 61
    :cond_1
    iget-boolean p3, p1, Lq01;->σ:Z

    .line 62
    .line 63
    if-eqz p3, :cond_2

    .line 64
    .line 65
    const-string p3, "Cannot delegate to an already attached node"

    .line 66
    .line 67
    invoke-static {p3}, Lam0;->β(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object p3, p0, Lq01;->ε:Lq01;

    .line 71
    .line 72
    invoke-virtual {p1, p3}, Lq01;->А(Lq01;)V

    .line 73
    .line 74
    .line 75
    iget p3, p0, Lq01;->η:I

    .line 76
    .line 77
    invoke-static {p1}, Lr31;->ε(Lq01;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iput v0, p1, Lq01;->η:I

    .line 82
    .line 83
    iget v1, p0, Lq01;->η:I

    .line 84
    .line 85
    and-int/lit8 v2, v0, 0x2

    .line 86
    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    and-int/lit8 v1, v1, 0x2

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    instance-of v1, p0, Lqp0;

    .line 94
    .line 95
    if-nez v1, :cond_3

    .line 96
    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v3, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "

    .line 100
    .line 101
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v3, "\nDelegate Node: "

    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Lam0;->β(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    iget-object v1, p0, Lya;->υ:Lq01;

    .line 123
    .line 124
    iput-object v1, p1, Lq01;->κ:Lq01;

    .line 125
    .line 126
    iput-object p1, p0, Lya;->υ:Lq01;

    .line 127
    .line 128
    iput-object p0, p1, Lq01;->ι:Lq01;

    .line 129
    .line 130
    iget v1, p0, Lq01;->η:I

    .line 131
    .line 132
    or-int/2addr v0, v1

    .line 133
    iput v0, p0, Lq01;->η:I

    .line 134
    .line 135
    if-eq v1, v0, :cond_7

    .line 136
    .line 137
    iget-object v1, p0, Lq01;->ε:Lq01;

    .line 138
    .line 139
    if-ne v1, p0, :cond_4

    .line 140
    .line 141
    iput v0, p0, Lq01;->θ:I

    .line 142
    .line 143
    :cond_4
    iget-boolean v3, p0, Lq01;->σ:Z

    .line 144
    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    move-object v3, p0

    .line 148
    :goto_0
    if-eqz v3, :cond_5

    .line 149
    .line 150
    iget v4, v3, Lq01;->η:I

    .line 151
    .line 152
    or-int/2addr v0, v4

    .line 153
    iput v0, v3, Lq01;->η:I

    .line 154
    .line 155
    if-eq v3, v1, :cond_5

    .line 156
    .line 157
    iget-object v3, v3, Lq01;->ι:Lq01;

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_5
    if-eqz v3, :cond_6

    .line 161
    .line 162
    iget-object v1, v3, Lq01;->κ:Lq01;

    .line 163
    .line 164
    if-eqz v1, :cond_6

    .line 165
    .line 166
    iget v1, v1, Lq01;->θ:I

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_6
    const/4 v1, 0x0

    .line 170
    :goto_1
    or-int/2addr v0, v1

    .line 171
    :goto_2
    if-eqz v3, :cond_7

    .line 172
    .line 173
    iget v1, v3, Lq01;->η:I

    .line 174
    .line 175
    or-int/2addr v0, v1

    .line 176
    iput v0, v3, Lq01;->θ:I

    .line 177
    .line 178
    iget-object v3, v3, Lq01;->ι:Lq01;

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_7
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 182
    .line 183
    if-eqz v0, :cond_b

    .line 184
    .line 185
    if-eqz v2, :cond_9

    .line 186
    .line 187
    and-int/lit8 p3, p3, 0x2

    .line 188
    .line 189
    if-eqz p3, :cond_8

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_8
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    iget-object p3, p3, Lyp0;->Κ:Lk31;

    .line 197
    .line 198
    iget-object v0, p0, Lq01;->ε:Lq01;

    .line 199
    .line 200
    const/4 v1, 0x0

    .line 201
    invoke-virtual {v0, v1}, Lq01;->Б(Lq31;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p3}, Lk31;->η()V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_9
    :goto_3
    iget-object p3, p0, Lq01;->μ:Lq31;

    .line 209
    .line 210
    invoke-virtual {p0, p3}, Lya;->Б(Lq31;)V

    .line 211
    .line 212
    .line 213
    :goto_4
    invoke-virtual {p1}, Lq01;->х()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1}, Lq01;->ю()V

    .line 217
    .line 218
    .line 219
    iget-boolean p3, p1, Lq01;->σ:Z

    .line 220
    .line 221
    if-nez p3, :cond_a

    .line 222
    .line 223
    const-string p3, "autoInvalidateInsertedNode called on unattached node"

    .line 224
    .line 225
    invoke-static {p3}, Lam0;->β(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :cond_a
    const/4 p3, -0x1

    .line 229
    const/4 v0, 0x1

    .line 230
    invoke-static {p1, p3, v0}, Lr31;->α(Lq01;II)V

    .line 231
    .line 232
    .line 233
    :cond_b
    :goto_5
    iput-object p2, p0, Lya;->Α:Lgd;

    .line 234
    .line 235
    return-void
.end method


# virtual methods
.method public final Ω(Ljs1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lya;->ω:Liv1;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lhs1;->β(Ljs1;Liv1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final γ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final А(Lq01;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq01;->ε:Lq01;

    .line 2
    .line 3
    iget-object p0, p0, Lya;->υ:Lq01;

    .line 4
    .line 5
    :goto_0
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lq01;->А(Lq01;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method public final Б(Lq31;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq01;->μ:Lq31;

    .line 2
    .line 3
    iget-object p0, p0, Lya;->υ:Lq01;

    .line 4
    .line 5
    :goto_0
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lq01;->Б(Lq31;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method public final ф()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final х()V
    .locals 2

    .line 1
    invoke-super {p0}, Lq01;->х()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya;->υ:Lq01;

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lq01;->μ:Lq31;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lq01;->Б(Lq31;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v1, v0, Lq01;->σ:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lq01;->х()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, v0, Lq01;->κ:Lq01;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public final ц()V
    .locals 1

    .line 1
    iget-object v0, p0, Lya;->υ:Lq01;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lq01;->ц()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lq01;->κ:Lq01;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-super {p0}, Lq01;->ц()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final э()V
    .locals 0

    .line 1
    invoke-super {p0}, Lq01;->э()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lya;->υ:Lq01;

    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lq01;->э()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method public final ю()V
    .locals 1

    .line 1
    iget-object v0, p0, Lya;->υ:Lq01;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lq01;->ю()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lq01;->κ:Lq01;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-super {p0}, Lq01;->ю()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final я()V
    .locals 0

    .line 1
    invoke-super {p0}, Lq01;->я()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lya;->υ:Lq01;

    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lq01;->я()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method
