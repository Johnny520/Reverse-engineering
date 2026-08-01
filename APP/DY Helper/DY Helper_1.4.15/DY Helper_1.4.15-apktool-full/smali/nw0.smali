.class public final Lnw0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/String;

.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;

.field public final θ:Ljava/lang/String;

.field public final ι:Ljava/lang/String;

.field public final κ:Ljava/lang/String;

.field public final λ:Ljava/lang/String;

.field public final μ:Ljava/lang/String;

.field public final ν:Ljava/lang/String;

.field public final ξ:Ljava/lang/String;

.field public final ο:Ljava/lang/String;

.field public final π:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnw0;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnw0;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnw0;->γ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnw0;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lnw0;->ε:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lnw0;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lnw0;->η:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lnw0;->θ:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lnw0;->ι:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, Lnw0;->κ:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Lnw0;->λ:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p12, p0, Lnw0;->μ:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p13, p0, Lnw0;->ν:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p14, p0, Lnw0;->ξ:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p15, p0, Lnw0;->ο:Ljava/lang/String;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lnw0;->π:Ljava/lang/String;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lnw0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lnw0;

    .line 12
    .line 13
    iget-object v0, p0, Lnw0;->α:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lnw0;->α:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lnw0;->β:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lnw0;->β:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, Lnw0;->γ:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, Lnw0;->γ:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, Lnw0;->δ:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, Lnw0;->δ:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_5
    iget-object v0, p0, Lnw0;->ε:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, Lnw0;->ε:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_6
    iget-object v0, p0, Lnw0;->ζ:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, p1, Lnw0;->ζ:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_7
    iget-object v0, p0, Lnw0;->η:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v1, p1, Lnw0;->η:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_8

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_8
    iget-object v0, p0, Lnw0;->θ:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v1, p1, Lnw0;->θ:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_9

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_9
    iget-object v0, p0, Lnw0;->ι:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v1, p1, Lnw0;->ι:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_a

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_a
    iget-object v0, p0, Lnw0;->κ:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v1, p1, Lnw0;->κ:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_b

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_b
    iget-object v0, p0, Lnw0;->λ:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v1, p1, Lnw0;->λ:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_c

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_c
    iget-object v0, p0, Lnw0;->μ:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v1, p1, Lnw0;->μ:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_d

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_d
    iget-object v0, p0, Lnw0;->ν:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v1, p1, Lnw0;->ν:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_e

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_e
    iget-object v0, p0, Lnw0;->ξ:Ljava/lang/String;

    .line 163
    .line 164
    iget-object v1, p1, Lnw0;->ξ:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_f

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_f
    iget-object v0, p0, Lnw0;->ο:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v1, p1, Lnw0;->ο:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_10

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_10
    iget-object p0, p0, Lnw0;->π:Ljava/lang/String;

    .line 185
    .line 186
    iget-object p1, p1, Lnw0;->π:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    if-nez p0, :cond_11

    .line 193
    .line 194
    :goto_0
    const/4 p0, 0x0

    .line 195
    return p0

    .line 196
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 197
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnw0;->α:Ljava/lang/String;

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
    iget-object v2, p0, Lnw0;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lnw0;->γ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lnw0;->δ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lnw0;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lnw0;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    const v0, -0x492e982d

    .line 43
    .line 44
    .line 45
    add-int/2addr v2, v0

    .line 46
    mul-int/2addr v2, v1

    .line 47
    iget-object v0, p0, Lnw0;->η:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2, v1, v0}, La12;->β(IILjava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v2, p0, Lnw0;->θ:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v2, p0, Lnw0;->ι:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v2, p0, Lnw0;->κ:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v2, p0, Lnw0;->λ:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v2, p0, Lnw0;->μ:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v2, p0, Lnw0;->ν:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v2, p0, Lnw0;->ξ:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget-object v2, p0, Lnw0;->ο:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    add-int/2addr v2, v0

    .line 102
    mul-int/2addr v2, v1

    .line 103
    const v0, -0x62e289e1

    .line 104
    .line 105
    .line 106
    add-int/2addr v2, v0

    .line 107
    mul-int/2addr v2, v1

    .line 108
    iget-object p0, p0, Lnw0;->π:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    add-int/2addr p0, v2

    .line 115
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", surface="

    .line 2
    .line 3
    const-string v1, ", surfaceVariant="

    .line 4
    .line 5
    const-string v2, "Colors(background="

    .line 6
    .line 7
    iget-object v3, p0, Lnw0;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lnw0;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", title="

    .line 16
    .line 17
    const-string v2, ", body="

    .line 18
    .line 19
    iget-object v3, p0, Lnw0;->γ:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lnw0;->δ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", subtle="

    .line 27
    .line 28
    const-string v2, ", accent=#FE2C55, accentSoft="

    .line 29
    .line 30
    iget-object v3, p0, Lnw0;->ε:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lnw0;->ζ:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", divider="

    .line 38
    .line 39
    const-string v2, ", cardBorder="

    .line 40
    .line 41
    iget-object v3, p0, Lnw0;->η:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, Lnw0;->θ:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", success="

    .line 49
    .line 50
    const-string v2, ", successSoft="

    .line 51
    .line 52
    iget-object v3, p0, Lnw0;->ι:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, p0, Lnw0;->κ:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", warning="

    .line 60
    .line 61
    const-string v2, ", warningSoft="

    .line 62
    .line 63
    iget-object v3, p0, Lnw0;->λ:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v4, p0, Lnw0;->μ:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", info="

    .line 71
    .line 72
    const-string v2, ", infoSoft="

    .line 73
    .line 74
    iget-object v3, p0, Lnw0;->ν:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, p0, Lnw0;->ξ:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lnw0;->ο:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", beta=#7C4DFF, betaSoft="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, Lnw0;->π:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p0, ")"

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method
