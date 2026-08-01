.class public final Lw32;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lux1;

.field public final β:Lr91;

.field public final γ:Lnh1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lw32;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const v6, 0xffffff

    .line 5
    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    invoke-direct/range {v0 .. v6}, Lw32;-><init>(JJLd60;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(JJLd60;I)V
    .locals 21

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-wide v0, Lci;->η:J

    .line 6
    .line 7
    move-wide v3, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide/from16 v3, p1

    .line 10
    .line 11
    :goto_0
    and-int/lit8 v0, p6, 0x2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    sget-wide v0, Ly32;->γ:J

    .line 16
    .line 17
    move-wide v5, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-wide/from16 v5, p3

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v0, p6, 0x4

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    move-object v7, v1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move-object/from16 v7, p5

    .line 29
    .line 30
    :goto_2
    sget-wide v10, Ly32;->γ:J

    .line 31
    .line 32
    sget-wide v17, Lci;->η:J

    .line 33
    .line 34
    const v0, 0x8000

    .line 35
    .line 36
    .line 37
    and-int v0, p6, v0

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    const/4 v0, 0x3

    .line 44
    :goto_3
    new-instance v2, Lux1;

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    move-wide v12, v10

    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    const/4 v15, 0x0

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    const/16 v20, 0x0

    .line 58
    .line 59
    invoke-direct/range {v2 .. v20}, Lux1;-><init>(JJLd60;Lb60;Lc60;Lbr;Ljava/lang/String;JLr8;Lg32;Lav0;JLc32;Lfv1;)V

    .line 60
    .line 61
    .line 62
    new-instance v7, Lr91;

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    move-wide v10, v12

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    move v8, v0

    .line 73
    move-object v13, v1

    .line 74
    invoke-direct/range {v7 .. v17}, Lr91;-><init>(IIJLh32;Lkh1;Lwr0;IILq32;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    move-object/from16 v1, p0

    .line 79
    .line 80
    invoke-direct {v1, v2, v7, v0}, Lw32;-><init>(Lux1;Lr91;Lnh1;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public constructor <init>(Lux1;Lr91;)V
    .locals 2

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    iget-object v0, p2, Lr91;->ε:Lkh1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 86
    :cond_0
    new-instance v1, Lnh1;

    invoke-direct {v1, v0}, Lnh1;-><init>(Lkh1;)V

    move-object v0, v1

    .line 87
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Lw32;-><init>(Lux1;Lr91;Lnh1;)V

    return-void
.end method

.method public constructor <init>(Lux1;Lr91;Lnh1;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lw32;->α:Lux1;

    .line 90
    iput-object p2, p0, Lw32;->β:Lr91;

    .line 91
    iput-object p3, p0, Lw32;->γ:Lnh1;

    return-void
.end method

.method public static α(Lw32;J)Lw32;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-wide v4, Ly32;->γ:J

    .line 4
    .line 5
    sget-wide v18, Lci;->η:J

    .line 6
    .line 7
    iget-object v1, v0, Lw32;->α:Lux1;

    .line 8
    .line 9
    move-wide v6, v4

    .line 10
    const/4 v4, 0x0

    .line 11
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, 0x0

    .line 18
    const/4 v15, 0x0

    .line 19
    const/16 v16, 0x0

    .line 20
    .line 21
    const/16 v17, 0x0

    .line 22
    .line 23
    const/16 v20, 0x0

    .line 24
    .line 25
    const/16 v21, 0x0

    .line 26
    .line 27
    const/16 v22, 0x0

    .line 28
    .line 29
    move-wide v13, v6

    .line 30
    move-wide/from16 v2, p1

    .line 31
    .line 32
    invoke-static/range {v1 .. v22}, Lvx1;->α(Lux1;JLkn0;FJLd60;Lb60;Lc60;Lbr;Ljava/lang/String;JLr8;Lg32;Lav0;JLc32;Lfv1;Lkn0;)Lux1;

    .line 33
    .line 34
    .line 35
    move-result-object v12

    .line 36
    iget-object v1, v0, Lw32;->β:Lr91;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    move-wide v4, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    invoke-static/range {v1 .. v11}, Ls91;->α(Lr91;IIJLh32;Lkh1;Lwr0;IILq32;)Lr91;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, v0, Lw32;->α:Lux1;

    .line 50
    .line 51
    if-ne v2, v12, :cond_0

    .line 52
    .line 53
    iget-object v2, v0, Lw32;->β:Lr91;

    .line 54
    .line 55
    if-ne v2, v1, :cond_0

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_0
    new-instance v0, Lw32;

    .line 59
    .line 60
    invoke-direct {v0, v12, v1}, Lw32;-><init>(Lux1;Lr91;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lw32;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lw32;

    .line 12
    .line 13
    iget-object v1, p1, Lw32;->α:Lux1;

    .line 14
    .line 15
    iget-object v3, p0, Lw32;->α:Lux1;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lw32;->β:Lr91;

    .line 25
    .line 26
    iget-object v3, p1, Lw32;->β:Lr91;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, Lw32;->γ:Lnh1;

    .line 36
    .line 37
    iget-object p1, p1, Lw32;->γ:Lnh1;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lw32;->α:Lux1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lux1;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lw32;->β:Lr91;

    .line 10
    .line 11
    invoke-virtual {v1}, Lr91;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Lw32;->γ:Lnh1;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lnh1;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    add-int/2addr v1, p0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextStyle(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lw32;->α:Lux1;

    .line 9
    .line 10
    iget-object v2, v1, Lux1;->α:Lf32;

    .line 11
    .line 12
    invoke-interface {v2}, Lf32;->β()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-static {v2, v3}, Lci;->ι(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, ", brush="

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Lux1;->α:Lf32;

    .line 29
    .line 30
    invoke-interface {v2}, Lf32;->δ()Lkn0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, ", alpha="

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v2, v1, Lux1;->α:Lf32;

    .line 43
    .line 44
    invoke-interface {v2}, Lf32;->ε()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, ", fontSize="

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-wide v2, v1, Lux1;->β:J

    .line 57
    .line 58
    invoke-static {v2, v3}, Ly32;->δ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, ", fontWeight="

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v2, v1, Lux1;->γ:Ld60;

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v2, ", fontStyle="

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v2, v1, Lux1;->δ:Lb60;

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v2, ", fontSynthesis="

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v2, v1, Lux1;->ε:Lc60;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v2, ", fontFamily="

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v2, v1, Lux1;->ζ:Lbr;

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v2, ", fontFeatureSettings="

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v2, v1, Lux1;->η:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v2, ", letterSpacing="

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-wide v2, v1, Lux1;->θ:J

    .line 121
    .line 122
    invoke-static {v2, v3}, Ly32;->δ(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v2, ", baselineShift="

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    iget-object v2, v1, Lux1;->ι:Lr8;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v2, ", textGeometricTransform="

    .line 140
    .line 141
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    iget-object v2, v1, Lux1;->κ:Lg32;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v2, ", localeList="

    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget-object v2, v1, Lux1;->λ:Lav0;

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v2, ", background="

    .line 160
    .line 161
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    iget-wide v2, v1, Lux1;->μ:J

    .line 165
    .line 166
    invoke-static {v2, v3}, Lci;->ι(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v2, ", textDecoration="

    .line 174
    .line 175
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget-object v2, v1, Lux1;->ν:Lc32;

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v2, ", shadow="

    .line 184
    .line 185
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object v2, v1, Lux1;->ξ:Lfv1;

    .line 189
    .line 190
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v2, ", drawStyle="

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    iget-object v1, v1, Lux1;->ο:Lkn0;

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v1, ", textAlign="

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    iget-object v1, p0, Lw32;->β:Lr91;

    .line 209
    .line 210
    iget v2, v1, Lr91;->α:I

    .line 211
    .line 212
    invoke-static {v2}, Lz22;->α(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v2, ", textDirection="

    .line 220
    .line 221
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    iget v2, v1, Lr91;->β:I

    .line 225
    .line 226
    invoke-static {v2}, Le32;->α(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v2, ", lineHeight="

    .line 234
    .line 235
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    iget-wide v2, v1, Lr91;->γ:J

    .line 239
    .line 240
    invoke-static {v2, v3}, Ly32;->δ(J)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v2, ", textIndent="

    .line 248
    .line 249
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    iget-object v2, v1, Lr91;->δ:Lh32;

    .line 253
    .line 254
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v2, ", platformStyle="

    .line 258
    .line 259
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    iget-object p0, p0, Lw32;->γ:Lnh1;

    .line 263
    .line 264
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string p0, ", lineHeightStyle="

    .line 268
    .line 269
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    iget-object p0, v1, Lr91;->ζ:Lwr0;

    .line 273
    .line 274
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string p0, ", lineBreak="

    .line 278
    .line 279
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    iget p0, v1, Lr91;->η:I

    .line 283
    .line 284
    invoke-static {p0}, Lrr0;->α(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string p0, ", hyphens="

    .line 292
    .line 293
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    iget p0, v1, Lr91;->θ:I

    .line 297
    .line 298
    invoke-static {p0}, Lrg0;->α(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string p0, ", textMotion="

    .line 306
    .line 307
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    iget-object p0, v1, Lr91;->ι:Lq32;

    .line 311
    .line 312
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const/16 p0, 0x29

    .line 316
    .line 317
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    return-object p0
.end method
