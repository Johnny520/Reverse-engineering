.class public final Ld60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Luq;


# instance fields
.field public final d:Ldd;

.field public e:Ltq;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Ldd;

    .line 2
    .line 3
    invoke-direct {v0}, Ldd;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ld60;->d:Ldd;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final C(JJJLo30;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p8}, Ldd;->C(JJJLo30;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final D(Lt5;JJJFLja;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p10}, Ldd;->D(Lt5;JJJFLja;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final F(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->F(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final J(Ld6;Lpf1;FLo30;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Ldd;->J(Ld6;Lpf1;FLo30;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K()J
    .locals 2

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0}, Luq;->K()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final M(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lym;->M(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final P(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lym;->P(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final T(JJJF)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Ldd;->T(JJJF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Z(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->Z(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final a()V
    .locals 11

    .line 1
    iget-object v0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    iget-object v1, v0, Ldd;->e:Lo8;

    .line 4
    .line 5
    invoke-virtual {v1}, Lo8;->f()Lbd;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iget-object p0, p0, Ld60;->e:Ltq;

    .line 10
    .line 11
    if-eqz p0, :cond_f

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    check-cast v1, Loe0;

    .line 15
    .line 16
    iget-object v2, v1, Loe0;->d:Loe0;

    .line 17
    .line 18
    iget-object v2, v2, Loe0;->i:Loe0;

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
    iget v4, v2, Loe0;->g:I

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
    iget v4, v2, Loe0;->f:I

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
    iget-object v2, v2, Loe0;->i:Loe0;

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
    instance-of v1, v2, Ltq;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    move-object v7, v2

    .line 59
    check-cast v7, Ltq;

    .line 60
    .line 61
    iget-object v1, v0, Ldd;->e:Lo8;

    .line 62
    .line 63
    iget-object v1, v1, Lo8;->b:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v8, v1

    .line 66
    check-cast v8, Lvx;

    .line 67
    .line 68
    invoke-static {v7, v10}, Lpf1;->O(Lrm;I)Lqj0;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iget-wide v1, v6, Lxq0;->f:J

    .line 73
    .line 74
    invoke-static {v1, v2}, Lo30;->C(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    iget-object v1, v6, Lqj0;->r:Lb60;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Le60;->a(Lb60;)Ldn0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lw3;

    .line 88
    .line 89
    invoke-virtual {v1}, Lw3;->getSharedDrawScope()Ld60;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual/range {v2 .. v8}, Ld60;->d(Lbd;JLqj0;Ltq;Lvx;)V

    .line 94
    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_5
    iget v1, v2, Loe0;->f:I

    .line 98
    .line 99
    and-int/2addr v1, v10

    .line 100
    if-eqz v1, :cond_b

    .line 101
    .line 102
    instance-of v1, v2, Lsm;

    .line 103
    .line 104
    if-eqz v1, :cond_b

    .line 105
    .line 106
    move-object v1, v2

    .line 107
    check-cast v1, Lsm;

    .line 108
    .line 109
    iget-object v1, v1, Lsm;->s:Loe0;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    :goto_4
    const/4 v5, 0x1

    .line 113
    if-eqz v1, :cond_a

    .line 114
    .line 115
    iget v6, v1, Loe0;->f:I

    .line 116
    .line 117
    and-int/2addr v6, v10

    .line 118
    if-eqz v6, :cond_9

    .line 119
    .line 120
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    if-ne v4, v5, :cond_6

    .line 123
    .line 124
    move-object v2, v1

    .line 125
    goto :goto_5

    .line 126
    :cond_6
    if-nez p0, :cond_7

    .line 127
    .line 128
    new-instance p0, Lsh0;

    .line 129
    .line 130
    const/16 v5, 0x10

    .line 131
    .line 132
    new-array v5, v5, [Loe0;

    .line 133
    .line 134
    invoke-direct {p0, v5}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    if-eqz v2, :cond_8

    .line 138
    .line 139
    invoke-virtual {p0, v2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object v2, v9

    .line 143
    :cond_8
    invoke-virtual {p0, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_5
    iget-object v1, v1, Loe0;->i:Loe0;

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_a
    if-ne v4, v5, :cond_b

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_b
    :goto_6
    invoke-static {p0}, Lpf1;->f(Lsh0;)Loe0;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    goto :goto_3

    .line 157
    :cond_c
    return-void

    .line 158
    :cond_d
    invoke-static {p0, v10}, Lpf1;->O(Lrm;I)Lqj0;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iget-object v1, v1, Loe0;->d:Loe0;

    .line 167
    .line 168
    if-ne v2, v1, :cond_e

    .line 169
    .line 170
    iget-object p0, p0, Lqj0;->s:Lqj0;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    :cond_e
    iget-object v0, v0, Ldd;->e:Lo8;

    .line 176
    .line 177
    iget-object v0, v0, Lo8;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lvx;

    .line 180
    .line 181
    invoke-virtual {p0, v3, v0}, Lqj0;->W0(Lbd;Lvx;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_f
    const-string p0, "Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer."

    .line 186
    .line 187
    invoke-static {p0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    throw p0
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldd;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0}, Luq;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d(Lbd;JLqj0;Ltq;Lvx;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ld60;->e:Ltq;

    .line 2
    .line 3
    iput-object p5, p0, Ld60;->e:Ltq;

    .line 4
    .line 5
    iget-object v1, p4, Lqj0;->r:Lb60;

    .line 6
    .line 7
    iget-object v1, v1, Lb60;->C:Lk50;

    .line 8
    .line 9
    iget-object v2, p0, Ld60;->d:Ldd;

    .line 10
    .line 11
    iget-object v3, v2, Ldd;->e:Lo8;

    .line 12
    .line 13
    iget-object v4, v3, Lo8;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ldd;

    .line 16
    .line 17
    iget-object v4, v4, Ldd;->d:Lcd;

    .line 18
    .line 19
    iget-object v5, v4, Lcd;->a:Lym;

    .line 20
    .line 21
    iget-object v4, v4, Lcd;->b:Lk50;

    .line 22
    .line 23
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v2, v2, Ldd;->e:Lo8;

    .line 28
    .line 29
    invoke-virtual {v2}, Lo8;->h()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    iget-object v8, v2, Lo8;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v8, Lvx;

    .line 36
    .line 37
    invoke-virtual {v2, p4}, Lo8;->o(Lym;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lo8;->p(Lk50;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Lo8;->n(Lbd;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p2, p3}, Lo8;->q(J)V

    .line 47
    .line 48
    .line 49
    iput-object p6, v2, Lo8;->b:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-interface {p1}, Lbd;->i()V

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-interface {p5, p0}, Ltq;->B(Ld60;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Lbd;->g()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v5}, Lo8;->o(Lym;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v4}, Lo8;->p(Lk50;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, Lo8;->n(Lbd;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v6, v7}, Lo8;->q(J)V

    .line 70
    .line 71
    .line 72
    iput-object v8, v2, Lo8;->b:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v0, p0, Ld60;->e:Ltq;

    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    invoke-interface {p1}, Lbd;->g()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v5}, Lo8;->o(Lym;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4}, Lo8;->p(Lk50;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Lo8;->n(Lbd;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v6, v7}, Lo8;->q(J)V

    .line 91
    .line 92
    .line 93
    iput-object v8, v2, Lo8;->b:Ljava/lang/Object;

    .line 94
    .line 95
    throw p0
.end method

.method public final e(Ld6;JLo30;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    iget-object v0, p0, Ldd;->d:Lcd;

    .line 4
    .line 5
    iget-object v0, v0, Lcd;->c:Lbd;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-static {p0, p2, p3, p4, v1}, Ldd;->a(Ldd;JLo30;I)Lw5;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {v0, p1, p0}, Lbd;->f(Ld6;Lw5;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final f0(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->f0(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getLayoutDirection()Lk50;
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    iget-object p0, p0, Ldd;->d:Lcd;

    .line 4
    .line 5
    iget-object p0, p0, Lcd;->b:Lk50;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h()F
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldd;->h()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i0(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldd;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method

.method public final o(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->o(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final p(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldd;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final t()Lo8;
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    iget-object p0, p0, Ldd;->e:Lo8;

    .line 4
    .line 5
    return-object p0
.end method

.method public final y(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lym;->y(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
