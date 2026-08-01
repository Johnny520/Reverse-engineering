.class public final Ls32;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Lw32;

.field public final γ:Lf50;

.field public final δ:I

.field public final ε:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw32;Lf50;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls32;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ls32;->β:Lw32;

    .line 7
    .line 8
    iput-object p3, p0, Ls32;->γ:Lf50;

    .line 9
    .line 10
    iput p4, p0, Ls32;->δ:I

    .line 11
    .line 12
    iput p5, p0, Ls32;->ε:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ls32;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Ls32;

    .line 11
    .line 12
    iget-object v1, p0, Ls32;->α:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p1, Ls32;->α:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, Ls32;->β:Lw32;

    .line 24
    .line 25
    iget-object v2, p1, Ls32;->β:Lw32;

    .line 26
    .line 27
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v1, p0, Ls32;->γ:Lf50;

    .line 35
    .line 36
    iget-object v2, p1, Ls32;->γ:Lf50;

    .line 37
    .line 38
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget v1, p0, Ls32;->δ:I

    .line 46
    .line 47
    iget v2, p1, Ls32;->δ:I

    .line 48
    .line 49
    if-ne v1, v2, :cond_6

    .line 50
    .line 51
    iget p0, p0, Ls32;->ε:I

    .line 52
    .line 53
    iget p1, p1, Ls32;->ε:I

    .line 54
    .line 55
    if-eq p0, p1, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    return v0

    .line 59
    :cond_6
    :goto_0
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ls32;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Ls32;->β:Lw32;

    .line 11
    .line 12
    invoke-virtual {v2}, Lw32;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Ls32;->γ:Lf50;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget v2, p0, Ls32;->δ:I

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget p0, p0, Ls32;->ε:I

    .line 38
    .line 39
    add-int/2addr v0, p0

    .line 40
    mul-int/2addr v0, v1

    .line 41
    add-int/2addr v0, v2

    .line 42
    mul-int/2addr v0, v1

    .line 43
    return v0
.end method

.method public final δ()Lq01;
    .locals 2

    .line 1
    new-instance v0, Lv32;

    .line 2
    .line 3
    invoke-direct {v0}, Lq01;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ls32;->α:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v1, v0, Lv32;->τ:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Ls32;->β:Lw32;

    .line 11
    .line 12
    iput-object v1, v0, Lv32;->υ:Lw32;

    .line 13
    .line 14
    iget-object v1, p0, Ls32;->γ:Lf50;

    .line 15
    .line 16
    iput-object v1, v0, Lv32;->φ:Lf50;

    .line 17
    .line 18
    iget v1, p0, Ls32;->δ:I

    .line 19
    .line 20
    iput v1, v0, Lv32;->χ:I

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, v0, Lv32;->ψ:Z

    .line 24
    .line 25
    iget p0, p0, Ls32;->ε:I

    .line 26
    .line 27
    iput p0, v0, Lv32;->ω:I

    .line 28
    .line 29
    iput v1, v0, Lv32;->Α:I

    .line 30
    .line 31
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lv32;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Lv32;->υ:Lw32;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    iget-object v5, v0, Ls32;->β:Lw32;

    .line 15
    .line 16
    if-eq v5, v2, :cond_1

    .line 17
    .line 18
    iget-object v6, v5, Lw32;->α:Lux1;

    .line 19
    .line 20
    iget-object v2, v2, Lw32;->α:Lux1;

    .line 21
    .line 22
    invoke-virtual {v6, v2}, Lux1;->β(Lux1;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :goto_0
    move v2, v3

    .line 35
    :goto_1
    iget-object v6, v1, Lv32;->τ:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v7, v0, Ls32;->α:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const/4 v8, 0x0

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    iput-object v7, v1, Lv32;->τ:Ljava/lang/String;

    .line 48
    .line 49
    iput-object v8, v1, Lv32;->Ζ:Lu32;

    .line 50
    .line 51
    move v3, v4

    .line 52
    :goto_2
    iget-object v6, v1, Lv32;->υ:Lw32;

    .line 53
    .line 54
    if-eq v6, v5, :cond_4

    .line 55
    .line 56
    iget-object v7, v6, Lw32;->β:Lr91;

    .line 57
    .line 58
    iget-object v9, v5, Lw32;->β:Lr91;

    .line 59
    .line 60
    invoke-static {v7, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_3

    .line 65
    .line 66
    iget-object v6, v6, Lw32;->α:Lux1;

    .line 67
    .line 68
    iget-object v7, v5, Lw32;->α:Lux1;

    .line 69
    .line 70
    invoke-virtual {v6, v7}, Lux1;->α(Lux1;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    const/4 v6, 0x0

    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    :goto_3
    const/4 v6, 0x1

    .line 83
    :goto_4
    xor-int/2addr v6, v4

    .line 84
    iput-object v5, v1, Lv32;->υ:Lw32;

    .line 85
    .line 86
    iget v5, v1, Lv32;->Α:I

    .line 87
    .line 88
    if-eq v5, v4, :cond_5

    .line 89
    .line 90
    iput v4, v1, Lv32;->Α:I

    .line 91
    .line 92
    move v6, v4

    .line 93
    :cond_5
    iget v5, v1, Lv32;->ω:I

    .line 94
    .line 95
    iget v7, v0, Ls32;->ε:I

    .line 96
    .line 97
    if-eq v5, v7, :cond_6

    .line 98
    .line 99
    iput v7, v1, Lv32;->ω:I

    .line 100
    .line 101
    move v6, v4

    .line 102
    :cond_6
    iget-boolean v5, v1, Lv32;->ψ:Z

    .line 103
    .line 104
    if-eq v5, v4, :cond_7

    .line 105
    .line 106
    iput-boolean v4, v1, Lv32;->ψ:Z

    .line 107
    .line 108
    move v6, v4

    .line 109
    :cond_7
    iget-object v5, v1, Lv32;->φ:Lf50;

    .line 110
    .line 111
    iget-object v7, v0, Ls32;->γ:Lf50;

    .line 112
    .line 113
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_8

    .line 118
    .line 119
    iput-object v7, v1, Lv32;->φ:Lf50;

    .line 120
    .line 121
    move v6, v4

    .line 122
    :cond_8
    iget v5, v1, Lv32;->χ:I

    .line 123
    .line 124
    iget v0, v0, Ls32;->δ:I

    .line 125
    .line 126
    if-ne v5, v0, :cond_9

    .line 127
    .line 128
    move v4, v6

    .line 129
    goto :goto_5

    .line 130
    :cond_9
    iput v0, v1, Lv32;->χ:I

    .line 131
    .line 132
    :goto_5
    if-nez v2, :cond_a

    .line 133
    .line 134
    if-nez v3, :cond_a

    .line 135
    .line 136
    if-eqz v4, :cond_b

    .line 137
    .line 138
    :cond_a
    iput-object v8, v1, Lv32;->Δ:Lw32;

    .line 139
    .line 140
    :cond_b
    if-nez v3, :cond_c

    .line 141
    .line 142
    if-eqz v4, :cond_d

    .line 143
    .line 144
    :cond_c
    invoke-virtual {v1}, Lv32;->В()Lq91;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    iget-object v10, v1, Lv32;->τ:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v11, v1, Lv32;->υ:Lw32;

    .line 151
    .line 152
    iget-object v12, v1, Lv32;->φ:Lf50;

    .line 153
    .line 154
    iget v13, v1, Lv32;->χ:I

    .line 155
    .line 156
    iget-boolean v14, v1, Lv32;->ψ:Z

    .line 157
    .line 158
    iget v15, v1, Lv32;->ω:I

    .line 159
    .line 160
    iget v0, v1, Lv32;->Α:I

    .line 161
    .line 162
    move/from16 v16, v0

    .line 163
    .line 164
    invoke-virtual/range {v9 .. v16}, Lq91;->δ(Ljava/lang/String;Lw32;Lf50;IZII)V

    .line 165
    .line 166
    .line 167
    :cond_d
    iget-boolean v0, v1, Lq01;->σ:Z

    .line 168
    .line 169
    if-nez v0, :cond_e

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_e
    if-nez v3, :cond_f

    .line 173
    .line 174
    if-eqz v2, :cond_10

    .line 175
    .line 176
    iget-object v0, v1, Lv32;->Ε:Lt32;

    .line 177
    .line 178
    if-eqz v0, :cond_10

    .line 179
    .line 180
    :cond_f
    invoke-static {v1}, Li91;->ν(Lzr1;)V

    .line 181
    .line 182
    .line 183
    :cond_10
    if-nez v3, :cond_11

    .line 184
    .line 185
    if-eqz v4, :cond_12

    .line 186
    .line 187
    :cond_11
    invoke-static {v1}, Lbd;->Α(Lqp0;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v1}, Lyh;->Σ(Lbw;)V

    .line 191
    .line 192
    .line 193
    :cond_12
    if-eqz v2, :cond_13

    .line 194
    .line 195
    invoke-static {v1}, Lyh;->Σ(Lbw;)V

    .line 196
    .line 197
    .line 198
    :cond_13
    :goto_6
    return-void
.end method
