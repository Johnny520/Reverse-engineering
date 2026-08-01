.class public final Laq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lcw;


# instance fields
.field public final ε:Lfe;

.field public ζ:Lbw;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lfe;

    .line 2
    .line 3
    invoke-direct {v0}, Lfe;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Laq0;->ε:Lfe;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 4
    .line 5
    iget-object p0, p0, Lee;->β:Lnp0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final Β()Lm6;
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    iget-object p0, p0, Lfe;->ζ:Lm6;

    .line 4
    .line 5
    return-object p0
.end method

.method public final Η(Lwa0;JLa80;)V
    .locals 7

    .line 1
    iget-object v0, p0, Laq0;->ζ:Lbw;

    .line 2
    .line 3
    invoke-virtual {p0}, Laq0;->getLayoutDirection()Lnp0;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    new-instance v6, Llv;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v6, p0, v0, p4, v1}, Llv;-><init>(Ljava/lang/Object;Lur;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    move-object v2, p0

    .line 14
    move-object v1, p1

    .line 15
    move-wide v4, p2

    .line 16
    invoke-virtual/range {v1 .. v6}, Lwa0;->ε(Lyr;Lnp0;JLa80;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final Θ(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->Θ(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Λ(JJJFLkn0;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p9}, Lfe;->Λ(JJJFLkn0;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Ξ(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->Ξ(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Ψ(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->Ψ(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final α()J
    .locals 2

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0}, Lcw;->α()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfe;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final γ()V
    .locals 11

    .line 1
    iget-object v0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    iget-object v1, v0, Lfe;->ζ:Lm6;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm6;->υ()Lde;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iget-object p0, p0, Laq0;->ζ:Lbw;

    .line 10
    .line 11
    if-eqz p0, :cond_f

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    check-cast v1, Lq01;

    .line 15
    .line 16
    iget-object v2, v1, Lq01;->ε:Lq01;

    .line 17
    .line 18
    iget-object v2, v2, Lq01;->κ:Lq01;

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x4

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget v4, v2, Lq01;->θ:I

    .line 26
    .line 27
    and-int/2addr v4, v10

    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    if-eqz v2, :cond_4

    .line 32
    .line 33
    iget v4, v2, Lq01;->η:I

    .line 34
    .line 35
    and-int/lit8 v5, v4, 0x2

    .line 36
    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    and-int/lit8 v4, v4, 0x4

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    iget-object v2, v2, Lq01;->κ:Lq01;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    :goto_1
    move-object v2, v9

    .line 49
    :goto_2
    if-eqz v2, :cond_d

    .line 50
    .line 51
    move-object p0, v9

    .line 52
    :goto_3
    if-eqz v2, :cond_c

    .line 53
    .line 54
    instance-of v1, v2, Lbw;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    move-object v7, v2

    .line 59
    check-cast v7, Lbw;

    .line 60
    .line 61
    iget-object v1, v0, Lfe;->ζ:Lm6;

    .line 62
    .line 63
    iget-object v1, v1, Lm6;->η:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v8, v1

    .line 66
    check-cast v8, Lwa0;

    .line 67
    .line 68
    invoke-static {v7, v10}, Lh62;->ф(Lur;I)Lq31;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iget-wide v1, v6, Lch1;->η:J

    .line 73
    .line 74
    invoke-static {v1, v2}, Ls1;->Ζ(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    iget-object v1, v6, Lq31;->σ:Lyp0;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSharedDrawScope()Laq0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual/range {v2 .. v8}, Laq0;->δ(Lde;JLq31;Lbw;Lwa0;)V

    .line 92
    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_5
    iget v1, v2, Lq01;->η:I

    .line 96
    .line 97
    and-int/2addr v1, v10

    .line 98
    if-eqz v1, :cond_b

    .line 99
    .line 100
    instance-of v1, v2, Lya;

    .line 101
    .line 102
    if-eqz v1, :cond_b

    .line 103
    .line 104
    move-object v1, v2

    .line 105
    check-cast v1, Lya;

    .line 106
    .line 107
    iget-object v1, v1, Lya;->υ:Lq01;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    :goto_4
    const/4 v5, 0x1

    .line 111
    if-eqz v1, :cond_a

    .line 112
    .line 113
    iget v6, v1, Lq01;->η:I

    .line 114
    .line 115
    and-int/2addr v6, v10

    .line 116
    if-eqz v6, :cond_9

    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    if-ne v4, v5, :cond_6

    .line 121
    .line 122
    move-object v2, v1

    .line 123
    goto :goto_5

    .line 124
    :cond_6
    if-nez p0, :cond_7

    .line 125
    .line 126
    new-instance p0, Lk21;

    .line 127
    .line 128
    const/16 v5, 0x10

    .line 129
    .line 130
    new-array v5, v5, [Lq01;

    .line 131
    .line 132
    invoke-direct {p0, v5}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_7
    if-eqz v2, :cond_8

    .line 136
    .line 137
    invoke-virtual {p0, v2}, Lk21;->β(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v2, v9

    .line 141
    :cond_8
    invoke-virtual {p0, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_9
    :goto_5
    iget-object v1, v1, Lq01;->κ:Lq01;

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    if-ne v4, v5, :cond_b

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_b
    :goto_6
    invoke-static {p0}, Lh62;->γ(Lk21;)Lq01;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    goto :goto_3

    .line 155
    :cond_c
    return-void

    .line 156
    :cond_d
    invoke-static {p0, v10}, Lh62;->ф(Lur;I)Lq31;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Lq31;->Х()Lq01;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iget-object v1, v1, Lq01;->ε:Lq01;

    .line 165
    .line 166
    if-ne v2, v1, :cond_e

    .line 167
    .line 168
    iget-object p0, p0, Lq31;->τ:Lq31;

    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    :cond_e
    iget-object v0, v0, Lfe;->ζ:Lm6;

    .line 174
    .line 175
    iget-object v0, v0, Lm6;->η:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lwa0;

    .line 178
    .line 179
    invoke-virtual {p0, v3, v0}, Lq31;->ｉ(Lde;Lwa0;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_f
    const-string p0, "Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer."

    .line 184
    .line 185
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    throw p0
.end method

.method public final δ(Lde;JLq31;Lbw;Lwa0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Laq0;->ζ:Lbw;

    .line 2
    .line 3
    iput-object p5, p0, Laq0;->ζ:Lbw;

    .line 4
    .line 5
    iget-object v1, p4, Lq31;->σ:Lyp0;

    .line 6
    .line 7
    iget-object v1, v1, Lyp0;->Δ:Lnp0;

    .line 8
    .line 9
    iget-object v2, p0, Laq0;->ε:Lfe;

    .line 10
    .line 11
    iget-object v3, v2, Lfe;->ζ:Lm6;

    .line 12
    .line 13
    invoke-virtual {v3}, Lm6;->ω()Lyr;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v2, v2, Lfe;->ζ:Lm6;

    .line 18
    .line 19
    invoke-virtual {v2}, Lm6;->Ε()Lnp0;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v2}, Lm6;->υ()Lde;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v2}, Lm6;->Ζ()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    iget-object v8, v2, Lm6;->η:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v8, Lwa0;

    .line 34
    .line 35
    invoke-virtual {v2, p4}, Lm6;->Σ(Lyr;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Lm6;->Τ(Lnp0;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Lm6;->Ρ(Lde;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p2, p3}, Lm6;->Υ(J)V

    .line 45
    .line 46
    .line 47
    iput-object p6, v2, Lm6;->η:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {p1}, Lde;->θ()V

    .line 50
    .line 51
    .line 52
    :try_start_0
    invoke-interface {p5, p0}, Lbw;->Μ(Laq0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Lde;->ζ()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lm6;->Σ(Lyr;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v4}, Lm6;->Τ(Lnp0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v5}, Lm6;->Ρ(Lde;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v6, v7}, Lm6;->Υ(J)V

    .line 68
    .line 69
    .line 70
    iput-object v8, v2, Lm6;->η:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v0, p0, Laq0;->ζ:Lbw;

    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    invoke-interface {p1}, Lde;->ζ()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Lm6;->Σ(Lyr;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Lm6;->Τ(Lnp0;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v5}, Lm6;->Ρ(Lde;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v6, v7}, Lm6;->Υ(J)V

    .line 89
    .line 90
    .line 91
    iput-object v8, v2, Lm6;->η:Ljava/lang/Object;

    .line 92
    .line 93
    throw p0
.end method

.method public final ζ(Lz91;JLkn0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    iget-object p0, v0, Lfe;->ε:Lee;

    .line 4
    .line 5
    iget-object p0, p0, Lee;->γ:Lde;

    .line 6
    .line 7
    const/high16 v4, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/4 v5, 0x3

    .line 10
    move-wide v1, p2

    .line 11
    move-object v3, p4

    .line 12
    invoke-static/range {v0 .. v5}, Lfe;->γ(Lfe;JLkn0;FI)Lq2;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-interface {p0, p1, p2}, Lde;->ε(Lz91;Lq2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfe;->θ()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ρ(Lz91;Lkn0;FLkn0;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lfe;->ρ(Lz91;Lkn0;FLkn0;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final σ(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->σ(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final τ(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->τ(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final υ(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfe;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final д(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lyr;->д(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final к(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->к(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final п(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyr;->п(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final с(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Laq0;->ε:Lfe;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfe;->β()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method
