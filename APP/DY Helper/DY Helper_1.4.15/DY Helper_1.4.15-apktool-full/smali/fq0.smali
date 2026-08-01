.class public final Lfq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Li12;


# instance fields
.field public ε:Lnp0;

.field public ζ:F

.field public η:F

.field public final synthetic θ:Lkq0;


# direct methods
.method public constructor <init>(Lkq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfq0;->θ:Lkq0;

    .line 5
    .line 6
    sget-object p1, Lnp0;->ζ:Lnp0;

    .line 7
    .line 8
    iput-object p1, p0, Lfq0;->ε:Lnp0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfq0;->ε:Lnp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Ν(IILjava/util/Map;La80;La80;)Lqx0;
    .locals 9

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    and-int v1, p1, v0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    and-int/2addr v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Size("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " x "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    new-instance v1, Leq0;

    .line 42
    .line 43
    iget-object v7, p0, Lfq0;->θ:Lkq0;

    .line 44
    .line 45
    move-object v6, p0

    .line 46
    move v2, p1

    .line 47
    move v3, p2

    .line 48
    move-object v4, p3

    .line 49
    move-object v5, p4

    .line 50
    move-object v8, p5

    .line 51
    invoke-direct/range {v1 .. v8}, Leq0;-><init>(IILjava/util/Map;La80;Lfq0;Lkq0;La80;)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public final β()F
    .locals 0

    .line 1
    iget p0, p0, Lfq0;->ζ:F

    .line 2
    .line 3
    return p0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget p0, p0, Lfq0;->η:F

    .line 2
    .line 3
    return p0
.end method

.method public final ν()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lfq0;->θ:Lkq0;

    .line 2
    .line 3
    iget-object p0, p0, Lkq0;->ε:Lyp0;

    .line 4
    .line 5
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 6
    .line 7
    iget-object p0, p0, Lbq0;->δ:Lup0;

    .line 8
    .line 9
    sget-object v0, Lup0;->θ:Lup0;

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lup0;->ζ:Lup0;

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final φ(Le80;)Ljava/util/List;
    .locals 10

    .line 1
    iget-object p0, p0, Lfq0;->θ:Lkq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkq0;->γ()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkq0;->ε:Lyp0;

    .line 7
    .line 8
    iget-object v1, v0, Lyp0;->Λ:Lbq0;

    .line 9
    .line 10
    iget-object v1, v1, Lbq0;->δ:Lup0;

    .line 11
    .line 12
    sget-object v2, Lup0;->η:Lup0;

    .line 13
    .line 14
    sget-object v3, Lup0;->ε:Lup0;

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    sget-object v4, Lup0;->ζ:Lup0;

    .line 21
    .line 22
    if-eq v1, v4, :cond_1

    .line 23
    .line 24
    sget-object v4, Lup0;->θ:Lup0;

    .line 25
    .line 26
    if-ne v1, v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v4, "subcompose can only be used inside the measure or layout blocks"

    .line 30
    .line 31
    invoke-static {v4}, Lam0;->β(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object v4, p0, Lkq0;->κ:Lb21;

    .line 35
    .line 36
    sget-object v5, Ls62;->α:Ls62;

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const/4 v7, 0x1

    .line 43
    if-nez v6, :cond_5

    .line 44
    .line 45
    iget-object v6, p0, Lkq0;->ν:Lb21;

    .line 46
    .line 47
    invoke-virtual {v6, v5}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Lyp0;

    .line 52
    .line 53
    if-eqz v6, :cond_3

    .line 54
    .line 55
    iget-object v8, p0, Lkq0;->ι:Lb21;

    .line 56
    .line 57
    invoke-virtual {v8, v6}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Ldq0;

    .line 62
    .line 63
    iget v8, p0, Lkq0;->σ:I

    .line 64
    .line 65
    if-lez v8, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const-string v8, "Check failed."

    .line 69
    .line 70
    invoke-static {v8}, Lam0;->β(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    iget v8, p0, Lkq0;->σ:I

    .line 74
    .line 75
    add-int/lit8 v8, v8, -0x1

    .line 76
    .line 77
    iput v8, p0, Lkq0;->σ:I

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-virtual {p0}, Lkq0;->κ()Lyp0;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-nez v6, :cond_4

    .line 85
    .line 86
    iget v6, p0, Lkq0;->η:I

    .line 87
    .line 88
    new-instance v8, Lyp0;

    .line 89
    .line 90
    const/4 v9, 0x2

    .line 91
    invoke-direct {v8, v9}, Lyp0;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-boolean v7, v0, Lyp0;->υ:Z

    .line 95
    .line 96
    invoke-virtual {v0, v6, v8}, Lyp0;->Α(ILyp0;)V

    .line 97
    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    iput-boolean v6, v0, Lyp0;->υ:Z

    .line 101
    .line 102
    move-object v6, v8

    .line 103
    :cond_4
    :goto_2
    invoke-virtual {v4, v5, v6}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    check-cast v6, Lyp0;

    .line 107
    .line 108
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    iget v8, p0, Lkq0;->η:I

    .line 113
    .line 114
    invoke-static {v8, v4}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    if-eq v4, v6, :cond_7

    .line 119
    .line 120
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lh21;

    .line 125
    .line 126
    iget-object v0, v0, Lh21;->ε:Lk21;

    .line 127
    .line 128
    invoke-virtual {v0, v6}, Lk21;->ι(Ljava/lang/Object;)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget v4, p0, Lkq0;->η:I

    .line 133
    .line 134
    if-lt v0, v4, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v8, "Key \""

    .line 140
    .line 141
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v5, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."

    .line 148
    .line 149
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v4}, Lam0;->α(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :goto_3
    iget v4, p0, Lkq0;->η:I

    .line 160
    .line 161
    if-eq v4, v0, :cond_7

    .line 162
    .line 163
    invoke-virtual {p0, v0, v4}, Lkq0;->ζ(II)V

    .line 164
    .line 165
    .line 166
    :cond_7
    iget v0, p0, Lkq0;->η:I

    .line 167
    .line 168
    add-int/2addr v0, v7

    .line 169
    iput v0, p0, Lkq0;->η:I

    .line 170
    .line 171
    check-cast p1, Lan;

    .line 172
    .line 173
    invoke-virtual {p0, v6, p1}, Lkq0;->ι(Lyp0;Lan;)V

    .line 174
    .line 175
    .line 176
    if-eq v1, v3, :cond_9

    .line 177
    .line 178
    if-ne v1, v2, :cond_8

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_8
    invoke-virtual {v6}, Lyp0;->λ()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :cond_9
    :goto_4
    iget-object p0, v6, Lyp0;->Λ:Lbq0;

    .line 187
    .line 188
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 189
    .line 190
    invoke-virtual {p0}, Lox0;->ц()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0
.end method
