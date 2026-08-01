.class public final Lba;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:F

.field public β:Lnp0;

.field public final γ:Lm2;

.field public final δ:J

.field public ε:I

.field public final ζ:J

.field public η:F


# direct methods
.method public constructor <init>(Lm2;J)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lba;->α:F

    .line 7
    .line 8
    sget-object v1, Lnp0;->ε:Lnp0;

    .line 9
    .line 10
    iput-object v1, p0, Lba;->β:Lnp0;

    .line 11
    .line 12
    iput-object p1, p0, Lba;->γ:Lm2;

    .line 13
    .line 14
    iput-wide p2, p0, Lba;->δ:J

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput v1, p0, Lba;->ε:I

    .line 18
    .line 19
    const-wide/16 v1, 0x0

    .line 20
    .line 21
    long-to-int v3, v1

    .line 22
    if-ltz v3, :cond_0

    .line 23
    .line 24
    long-to-int v1, v1

    .line 25
    if-ltz v1, :cond_0

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    shr-long v1, p2, v1

    .line 30
    .line 31
    long-to-int v1, v1

    .line 32
    if-ltz v1, :cond_0

    .line 33
    .line 34
    const-wide v2, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v2, p2

    .line 40
    long-to-int v2, v2

    .line 41
    if-ltz v2, :cond_0

    .line 42
    .line 43
    iget-object v3, p1, Lm2;->α:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-gt v1, v3, :cond_0

    .line 50
    .line 51
    iget-object p1, p1, Lm2;->α:Landroid/graphics/Bitmap;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-gt v2, p1, :cond_0

    .line 58
    .line 59
    iput-wide p2, p0, Lba;->ζ:J

    .line 60
    .line 61
    iput v0, p0, Lba;->η:F

    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    const-string p0, "Failed requirement."

    .line 65
    .line 66
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lba;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lba;

    .line 10
    .line 11
    iget-object v0, p1, Lba;->γ:Lm2;

    .line 12
    .line 13
    iget-object v1, p0, Lba;->γ:Lm2;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    invoke-static {v0, v1, v0, v1}, Lum0;->α(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    iget-wide v0, p0, Lba;->δ:J

    .line 32
    .line 33
    iget-wide v2, p1, Lba;->δ:J

    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, Lbn0;->α(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    iget p0, p0, Lba;->ε:I

    .line 43
    .line 44
    iget p1, p1, Lba;->ε:I

    .line 45
    .line 46
    if-ne p0, p1, :cond_5

    .line 47
    .line 48
    :goto_0
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lba;->γ:Lm2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lba;->δ:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, Lba;->ε:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BitmapPainter(image="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lba;->γ:Lm2;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", srcOffset="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    invoke-static {v1, v2}, Lum0;->δ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", srcSize="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-wide v1, p0, Lba;->δ:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Lbn0;->β(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", filterQuality="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget p0, p0, Lba;->ε:I

    .line 47
    .line 48
    if-nez p0, :cond_0

    .line 49
    .line 50
    const-string p0, "None"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v1, 0x1

    .line 54
    if-ne p0, v1, :cond_1

    .line 55
    .line 56
    const-string p0, "Low"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v1, 0x2

    .line 60
    if-ne p0, v1, :cond_2

    .line 61
    .line 62
    const-string p0, "Medium"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v1, 0x3

    .line 66
    if-ne p0, v1, :cond_3

    .line 67
    .line 68
    const-string p0, "High"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-string p0, "Unknown"

    .line 72
    .line 73
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const/16 p0, 0x29

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public final α(Laq0;JF)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v10, v1, Laq0;->ε:Lfe;

    .line 8
    .line 9
    iget v3, v0, Lba;->α:F

    .line 10
    .line 11
    cmpg-float v3, v3, v2

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput v2, v0, Lba;->η:F

    .line 17
    .line 18
    iput v2, v0, Lba;->α:F

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v1}, Laq0;->getLayoutDirection()Lnp0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, v0, Lba;->β:Lnp0;

    .line 25
    .line 26
    if-eq v4, v3, :cond_1

    .line 27
    .line 28
    iput-object v3, v0, Lba;->β:Lnp0;

    .line 29
    .line 30
    :cond_1
    invoke-interface {v10}, Lcw;->α()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    const/16 v5, 0x20

    .line 35
    .line 36
    shr-long/2addr v3, v5

    .line 37
    long-to-int v3, v3

    .line 38
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    shr-long v6, p2, v5

    .line 43
    .line 44
    long-to-int v4, v6

    .line 45
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    sub-float v11, v3, v6

    .line 50
    .line 51
    invoke-interface {v10}, Lcw;->α()J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    const-wide v8, 0xffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v6, v8

    .line 61
    long-to-int v3, v6

    .line 62
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    and-long v6, p2, v8

    .line 67
    .line 68
    long-to-int v6, v6

    .line 69
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    sub-float v12, v3, v7

    .line 74
    .line 75
    iget-object v3, v10, Lfe;->ζ:Lm6;

    .line 76
    .line 77
    iget-object v3, v3, Lm6;->ζ:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Ln;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    invoke-virtual {v3, v7, v7, v11, v12}, Ln;->χ(FFFF)V

    .line 83
    .line 84
    .line 85
    cmpl-float v2, v2, v7

    .line 86
    .line 87
    const/high16 v13, -0x80000000

    .line 88
    .line 89
    if-lez v2, :cond_2

    .line 90
    .line 91
    :try_start_0
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    cmpl-float v2, v2, v7

    .line 96
    .line 97
    if-lez v2, :cond_2

    .line 98
    .line 99
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    cmpl-float v2, v2, v7

    .line 104
    .line 105
    if-lez v2, :cond_2

    .line 106
    .line 107
    iget-object v1, v0, Lba;->γ:Lm2;

    .line 108
    .line 109
    iget-wide v2, v0, Lba;->δ:J

    .line 110
    .line 111
    invoke-interface {v10}, Lcw;->α()J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    shr-long/2addr v6, v5

    .line 116
    long-to-int v4, v6

    .line 117
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-interface {v10}, Lcw;->α()J

    .line 126
    .line 127
    .line 128
    move-result-wide v6

    .line 129
    and-long/2addr v6, v8

    .line 130
    long-to-int v6, v6

    .line 131
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    int-to-long v14, v4

    .line 140
    shl-long v4, v14, v5

    .line 141
    .line 142
    int-to-long v6, v6

    .line 143
    and-long/2addr v6, v8

    .line 144
    or-long/2addr v4, v6

    .line 145
    iget v6, v0, Lba;->η:F

    .line 146
    .line 147
    iget v8, v0, Lba;->ε:I

    .line 148
    .line 149
    const/16 v9, 0x148

    .line 150
    .line 151
    const/4 v7, 0x0

    .line 152
    move-object/from16 v0, p1

    .line 153
    .line 154
    invoke-static/range {v0 .. v9}, Lcw;->в(Laq0;Lm2;JJFLga;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :catchall_0
    move-exception v0

    .line 159
    iget-object v1, v10, Lfe;->ζ:Lm6;

    .line 160
    .line 161
    iget-object v1, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Ln;

    .line 164
    .line 165
    neg-float v2, v11

    .line 166
    neg-float v3, v12

    .line 167
    invoke-virtual {v1, v13, v13, v2, v3}, Ln;->χ(FFFF)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_2
    :goto_1
    iget-object v0, v10, Lfe;->ζ:Lm6;

    .line 172
    .line 173
    iget-object v0, v0, Lm6;->ζ:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Ln;

    .line 176
    .line 177
    neg-float v1, v11

    .line 178
    neg-float v2, v12

    .line 179
    invoke-virtual {v0, v13, v13, v1, v2}, Ln;->χ(FFFF)V

    .line 180
    .line 181
    .line 182
    return-void
.end method
