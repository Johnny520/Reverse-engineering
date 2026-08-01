.class public abstract Lsv;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final α(Ld22;JLpp;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lov;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lov;

    .line 7
    .line 8
    iget v1, v0, Lov;->λ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lov;->λ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lov;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lpp;-><init>(Lop;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lov;->κ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lov;->λ:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lov;->ι:Ltm1;

    .line 36
    .line 37
    iget-object p1, v0, Lov;->θ:Ld22;

    .line 38
    .line 39
    invoke-static {p3}, Li81;->Β(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v11, p1

    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v11

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p3}, Li81;->Β(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p3, p0, Ld22;->κ:Le22;

    .line 57
    .line 58
    iget-object p3, p3, Le22;->ψ:Lvh1;

    .line 59
    .line 60
    invoke-static {p3, p1, p2}, Lsv;->δ(Lvh1;J)Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    goto/16 :goto_8

    .line 67
    .line 68
    :cond_3
    new-instance p3, Ltm1;

    .line 69
    .line 70
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-wide p1, p3, Ltm1;->ε:J

    .line 74
    .line 75
    :goto_1
    iput-object p0, v0, Lov;->θ:Ld22;

    .line 76
    .line 77
    iput-object p3, v0, Lov;->ι:Ltm1;

    .line 78
    .line 79
    iput v2, v0, Lov;->λ:I

    .line 80
    .line 81
    sget-object p1, Lwh1;->ζ:Lwh1;

    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, Ld22;->δ(Lwh1;Lq8;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object p2, Lcq;->ε:Lcq;

    .line 88
    .line 89
    if-ne p1, p2, :cond_4

    .line 90
    .line 91
    return-object p2

    .line 92
    :cond_4
    move-object v11, p3

    .line 93
    move-object p3, p1

    .line 94
    move-object p1, v11

    .line 95
    :goto_2
    check-cast p3, Lvh1;

    .line 96
    .line 97
    iget-object p2, p3, Lvh1;->α:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    const/4 v4, 0x0

    .line 104
    move v5, v4

    .line 105
    :goto_3
    if-ge v5, v1, :cond_6

    .line 106
    .line 107
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    move-object v7, v6

    .line 112
    check-cast v7, Lai1;

    .line 113
    .line 114
    iget-wide v7, v7, Lai1;->α:J

    .line 115
    .line 116
    iget-wide v9, p1, Ltm1;->ε:J

    .line 117
    .line 118
    invoke-static {v7, v8, v9, v10}, Lu81;->δ(JJ)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_5

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    move-object v6, v3

    .line 129
    :goto_4
    check-cast v6, Lai1;

    .line 130
    .line 131
    if-nez v6, :cond_7

    .line 132
    .line 133
    move-object v6, v3

    .line 134
    goto :goto_7

    .line 135
    :cond_7
    invoke-static {v6}, Lj81;->θ(Lai1;)Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    if-eqz p2, :cond_b

    .line 140
    .line 141
    iget-object p2, p3, Lvh1;->α:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    :goto_5
    if-ge v4, p3, :cond_9

    .line 148
    .line 149
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    move-object v5, v1

    .line 154
    check-cast v5, Lai1;

    .line 155
    .line 156
    iget-boolean v5, v5, Lai1;->δ:Z

    .line 157
    .line 158
    if-eqz v5, :cond_8

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_9
    move-object v1, v3

    .line 165
    :goto_6
    check-cast v1, Lai1;

    .line 166
    .line 167
    if-nez v1, :cond_a

    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_a
    iget-wide p2, v1, Lai1;->α:J

    .line 171
    .line 172
    iput-wide p2, p1, Ltm1;->ε:J

    .line 173
    .line 174
    goto :goto_9

    .line 175
    :cond_b
    invoke-static {v6, v2}, Lj81;->Ι(Lai1;Z)J

    .line 176
    .line 177
    .line 178
    move-result-wide p2

    .line 179
    const-wide/16 v4, 0x0

    .line 180
    .line 181
    invoke-static {p2, p3, v4, v5}, Lo41;->α(JJ)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-nez p2, :cond_d

    .line 186
    .line 187
    :goto_7
    if-eqz v6, :cond_c

    .line 188
    .line 189
    invoke-virtual {v6}, Lai1;->β()Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-nez p0, :cond_c

    .line 194
    .line 195
    return-object v6

    .line 196
    :cond_c
    :goto_8
    return-object v3

    .line 197
    :cond_d
    :goto_9
    move-object p3, p1

    .line 198
    goto :goto_1
.end method

.method public static final β(Ld22;JLq8;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lpv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lpv;

    .line 7
    .line 8
    iget v1, v0, Lpv;->μ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpv;->μ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpv;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lpp;-><init>(Lop;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lpv;->λ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lpv;->μ:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lpv;->κ:Lqm1;

    .line 36
    .line 37
    iget-object p1, v0, Lpv;->ι:Lum1;

    .line 38
    .line 39
    iget-object p2, v0, Lpv;->θ:Lai1;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catch Lxh1; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p3}, Li81;->Β(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p3, p0, Ld22;->κ:Le22;

    .line 57
    .line 58
    iget-object v1, p0, Ld22;->κ:Le22;

    .line 59
    .line 60
    iget-object p3, p3, Le22;->ψ:Lvh1;

    .line 61
    .line 62
    invoke-static {p3, p1, p2}, Lsv;->δ(Lvh1;J)Z

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    if-eqz p3, :cond_3

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_3
    iget-object p3, v1, Le22;->ψ:Lvh1;

    .line 70
    .line 71
    iget-object p3, p3, Lvh1;->α:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    const/4 v5, 0x0

    .line 78
    :goto_1
    if-ge v5, v4, :cond_5

    .line 79
    .line 80
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    move-object v7, v6

    .line 85
    check-cast v7, Lai1;

    .line 86
    .line 87
    iget-wide v7, v7, Lai1;->α:J

    .line 88
    .line 89
    invoke-static {v7, v8, p1, p2}, Lu81;->δ(JJ)Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move-object v6, v3

    .line 100
    :goto_2
    move-object p2, v6

    .line 101
    check-cast p2, Lai1;

    .line 102
    .line 103
    if-nez p2, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    new-instance p1, Lum1;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance p3, Lum1;

    .line 112
    .line 113
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p2, p3, Lum1;->ε:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Lh62;->ц(Lur;)Lyp0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget-object v1, v1, Lyp0;->Ε:Lg92;

    .line 126
    .line 127
    invoke-interface {v1}, Lg92;->α()J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    :try_start_1
    new-instance v1, Lqm1;

    .line 132
    .line 133
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    new-instance v6, Lqv;

    .line 137
    .line 138
    invoke-direct {v6, v1, p3, p1, v3}, Lqv;-><init>(Lqm1;Lum1;Lum1;Lop;)V

    .line 139
    .line 140
    .line 141
    iput-object p2, v0, Lpv;->θ:Lai1;

    .line 142
    .line 143
    iput-object p1, v0, Lpv;->ι:Lum1;

    .line 144
    .line 145
    iput-object v1, v0, Lpv;->κ:Lqm1;

    .line 146
    .line 147
    iput v2, v0, Lpv;->μ:I

    .line 148
    .line 149
    invoke-virtual {p0, v4, v5, v6, v0}, Ld22;->λ(JLe80;Lpp;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0
    :try_end_1
    .catch Lxh1; {:try_start_1 .. :try_end_1} :catch_0

    .line 153
    sget-object p3, Lcq;->ε:Lcq;

    .line 154
    .line 155
    if-ne p0, p3, :cond_7

    .line 156
    .line 157
    return-object p3

    .line 158
    :cond_7
    move-object p0, v1

    .line 159
    :goto_3
    :try_start_2
    iget-boolean p0, p0, Lqm1;->ε:Z

    .line 160
    .line 161
    if-eqz p0, :cond_9

    .line 162
    .line 163
    iget-object p0, p1, Lum1;->ε:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p0, Lai1;
    :try_end_2
    .catch Lxh1; {:try_start_2 .. :try_end_2} :catch_0

    .line 166
    .line 167
    if-nez p0, :cond_8

    .line 168
    .line 169
    return-object p2

    .line 170
    :cond_8
    return-object p0

    .line 171
    :cond_9
    :goto_4
    return-object v3

    .line 172
    :catch_0
    iget-object p0, p1, Lum1;->ε:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, Lai1;

    .line 175
    .line 176
    if-nez p0, :cond_a

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_a
    move-object p2, p0

    .line 180
    :goto_5
    return-object p2
.end method

.method public static final γ(Ld22;JLa80;Lq8;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lrv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lrv;

    .line 7
    .line 8
    iget v1, v0, Lrv;->λ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lrv;->λ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lrv;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lpp;-><init>(Lop;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lrv;->κ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lrv;->λ:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lrv;->ι:La80;

    .line 35
    .line 36
    iget-object p1, v0, Lrv;->θ:Ld22;

    .line 37
    .line 38
    invoke-static {p4}, Li81;->Β(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object p3, p0

    .line 42
    move-object p0, p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p4}, Li81;->Β(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    iput-object p0, v0, Lrv;->θ:Ld22;

    .line 55
    .line 56
    iput-object p3, v0, Lrv;->ι:La80;

    .line 57
    .line 58
    iput v2, v0, Lrv;->λ:I

    .line 59
    .line 60
    invoke-static {p0, p1, p2, v0}, Lsv;->α(Ld22;JLpp;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    sget-object p1, Lcq;->ε:Lcq;

    .line 65
    .line 66
    if-ne p4, p1, :cond_3

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    :goto_2
    check-cast p4, Lai1;

    .line 70
    .line 71
    if-nez p4, :cond_4

    .line 72
    .line 73
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_4
    invoke-static {p4}, Lj81;->θ(Lai1;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_5
    invoke-interface {p3, p4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-wide p1, p4, Lai1;->α:J

    .line 89
    .line 90
    goto :goto_1
.end method

.method public static final δ(Lvh1;J)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lvh1;->α:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    move-object v4, v3

    .line 16
    check-cast v4, Lai1;

    .line 17
    .line 18
    iget-wide v4, v4, Lai1;->α:J

    .line 19
    .line 20
    invoke-static {v4, v5, p1, p2}, Lu81;->δ(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    :goto_1
    check-cast v3, Lai1;

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-boolean p1, v3, Lai1;->δ:Z

    .line 37
    .line 38
    if-ne p1, p0, :cond_2

    .line 39
    .line 40
    move v1, p0

    .line 41
    :cond_2
    xor-int/2addr p0, v1

    .line 42
    return p0
.end method
