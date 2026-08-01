.class public interface abstract Lcw;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lyr;


# direct methods
.method public static synthetic а(Lcw;JJFI)V
    .locals 11

    .line 1
    and-int/lit8 v0, p6, 0x4

    .line 2
    .line 3
    const-wide/16 v4, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lcw;->α()J

    .line 8
    .line 9
    .line 10
    move-result-wide p3

    .line 11
    invoke-static {p3, p4, v4, v5}, Lcw;->т(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide p3

    .line 15
    :cond_0
    move-wide v6, p3

    .line 16
    and-int/lit8 p3, p6, 0x8

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/high16 p3, 0x3f800000    # 1.0f

    .line 21
    .line 22
    move v8, p3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move/from16 v8, p5

    .line 25
    .line 26
    :goto_0
    sget-object v9, Lt30;->π:Lt30;

    .line 27
    .line 28
    and-int/lit8 p3, p6, 0x40

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    const/4 p3, 0x3

    .line 33
    :goto_1
    move-object v1, p0

    .line 34
    move-wide v2, p1

    .line 35
    move v10, p3

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/4 p3, 0x0

    .line 38
    goto :goto_1

    .line 39
    :goto_2
    invoke-interface/range {v1 .. v10}, Lcw;->Λ(JJJFLkn0;I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static в(Laq0;Lm2;JJFLga;II)V
    .locals 17

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-wide/from16 v8, p2

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-wide/from16 v8, p4

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v1, v0, 0x20

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const/high16 v1, 0x3f800000    # 1.0f

    .line 17
    .line 18
    move v13, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move/from16 v13, p6

    .line 21
    .line 22
    :goto_1
    and-int/lit16 v0, v0, 0x200

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    move/from16 v16, v0

    .line 28
    .line 29
    :goto_2
    move-object/from16 v0, p0

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_2
    move/from16 v16, p8

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :goto_3
    iget-object v10, v0, Laq0;->ε:Lfe;

    .line 36
    .line 37
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v12, Lt30;->π:Lt30;

    .line 41
    .line 42
    iget-object v0, v10, Lfe;->ε:Lee;

    .line 43
    .line 44
    iget-object v2, v0, Lee;->γ:Lde;

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v15, 0x3

    .line 48
    move-object/from16 v14, p7

    .line 49
    .line 50
    invoke-virtual/range {v10 .. v16}, Lfe;->δ(Lkn0;Lkn0;FLga;II)Lq2;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    move-object/from16 v3, p1

    .line 57
    .line 58
    move-wide/from16 v6, p2

    .line 59
    .line 60
    invoke-interface/range {v2 .. v10}, Lde;->β(Lm2;JJJLq2;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static synthetic г(Lcw;Lz91;Lkn0;Ly02;I)V
    .locals 6

    .line 1
    and-int/lit8 v0, p4, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p3, Lt30;->π:Lt30;

    .line 6
    .line 7
    :cond_0
    move-object v4, p3

    .line 8
    and-int/lit8 p3, p4, 0x20

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    const/4 p3, 0x3

    .line 13
    :goto_0
    move v5, p3

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const/4 p3, 0x0

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move-object v2, p2

    .line 22
    invoke-interface/range {v0 .. v5}, Lcw;->ρ(Lz91;Lkn0;FLkn0;I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static о(Laq0;Lkn0;JJJLkn0;I)V
    .locals 13

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-wide v0, p2

    .line 9
    :goto_0
    and-int/lit8 v2, p9, 0x4

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Laq0;->ε:Lfe;

    .line 14
    .line 15
    invoke-interface {v2}, Lcw;->α()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-static {v2, v3, v0, v1}, Lcw;->т(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-wide/from16 v2, p4

    .line 25
    .line 26
    :goto_1
    and-int/lit8 v4, p9, 0x20

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    sget-object v4, Lt30;->π:Lt30;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v4, p8

    .line 34
    .line 35
    :goto_2
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 36
    .line 37
    iget-object v5, p0, Lfe;->ε:Lee;

    .line 38
    .line 39
    iget-object v5, v5, Lee;->γ:Lde;

    .line 40
    .line 41
    const/16 v6, 0x20

    .line 42
    .line 43
    shr-long v7, v0, v6

    .line 44
    .line 45
    long-to-int v7, v7

    .line 46
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    const-wide v9, 0xffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr v0, v9

    .line 56
    long-to-int v0, v0

    .line 57
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    shr-long v11, v2, v6

    .line 66
    .line 67
    long-to-int v11, v11

    .line 68
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    add-float/2addr v11, v7

    .line 73
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    and-long/2addr v2, v9

    .line 78
    long-to-int v2, v2

    .line 79
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    add-float/2addr v2, v0

    .line 84
    shr-long v6, p6, v6

    .line 85
    .line 86
    long-to-int v0, v6

    .line 87
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    and-long v6, p6, v9

    .line 92
    .line 93
    long-to-int v3, v6

    .line 94
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x1

    .line 100
    const/high16 v9, 0x3f800000    # 1.0f

    .line 101
    .line 102
    const/4 v10, 0x3

    .line 103
    move-object p2, p0

    .line 104
    move-object/from16 p3, p1

    .line 105
    .line 106
    move-object/from16 p4, v4

    .line 107
    .line 108
    move-object/from16 p6, v6

    .line 109
    .line 110
    move/from16 p8, v7

    .line 111
    .line 112
    move/from16 p5, v9

    .line 113
    .line 114
    move/from16 p7, v10

    .line 115
    .line 116
    invoke-virtual/range {p2 .. p8}, Lfe;->δ(Lkn0;Lkn0;FLga;II)Lq2;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    move-object/from16 p8, p0

    .line 121
    .line 122
    move/from16 p6, v0

    .line 123
    .line 124
    move/from16 p3, v1

    .line 125
    .line 126
    move/from16 p5, v2

    .line 127
    .line 128
    move/from16 p7, v3

    .line 129
    .line 130
    move-object p1, v5

    .line 131
    move p2, v8

    .line 132
    move/from16 p4, v11

    .line 133
    .line 134
    invoke-interface/range {p1 .. p8}, Lde;->η(FFFFFFLq2;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public static т(JJ)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p2, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-float/2addr v1, v2

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p0, v2

    .line 24
    long-to-int p0, p0

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    and-long p1, p2, v2

    .line 30
    .line 31
    long-to-int p1, p1

    .line 32
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    sub-float/2addr p0, p1

    .line 37
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-long v4, p0

    .line 47
    shl-long p0, p1, v0

    .line 48
    .line 49
    and-long p2, v4, v2

    .line 50
    .line 51
    or-long/2addr p0, p2

    .line 52
    return-wide p0
.end method


# virtual methods
.method public abstract getLayoutDirection()Lnp0;
.end method

.method public abstract Β()Lm6;
.end method

.method public Η(Lwa0;JLa80;)V
    .locals 6

    .line 1
    invoke-interface {p0}, Lcw;->getLayoutDirection()Lnp0;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    new-instance v5, Li3;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-direct {v5, p0, v0, p4}, Li3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v0, p1

    .line 13
    move-wide v3, p2

    .line 14
    invoke-virtual/range {v0 .. v5}, Lwa0;->ε(Lyr;Lnp0;JLa80;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public abstract Λ(JJJFLkn0;I)V
.end method

.method public α()J
    .locals 2

    .line 1
    invoke-interface {p0}, Lcw;->Β()Lm6;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lm6;->Ζ()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public abstract ρ(Lz91;Lkn0;FLkn0;I)V
.end method
