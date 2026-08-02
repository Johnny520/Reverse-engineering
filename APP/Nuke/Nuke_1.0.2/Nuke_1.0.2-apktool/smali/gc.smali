.class public final Lgc;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public synthetic n:J

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLyw2;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lgc;->l:I

    .line 3
    .line 4
    iput-wide p1, p0, Lgc;->n:J

    .line 5
    .line 6
    iput-object p3, p0, Lgc;->o:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lep1;Lt00;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgc;->l:I

    .line 13
    iput-object p1, p0, Lgc;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLt00;I)V
    .locals 0

    .line 14
    iput p5, p0, Lgc;->l:I

    iput-object p1, p0, Lgc;->o:Ljava/lang/Object;

    iput-wide p2, p0, Lgc;->n:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lgc;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lj20;

    .line 9
    .line 10
    check-cast p2, Lt00;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lgc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lgc;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lgc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lj20;

    .line 24
    .line 25
    check-cast p2, Lt00;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lgc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lgc;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lgc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    check-cast p2, Lt00;

    .line 45
    .line 46
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p2, p1}, Lgc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lgc;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lgc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_2
    check-cast p1, Lj20;

    .line 62
    .line 63
    check-cast p2, Lt00;

    .line 64
    .line 65
    invoke-virtual {p0, p2, p1}, Lgc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Lgc;

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lgc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 11

    .line 1
    iget v0, p0, Lgc;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lgc;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lgc;

    .line 9
    .line 10
    iget-wide v2, p0, Lgc;->n:J

    .line 11
    .line 12
    check-cast v1, Lyw2;

    .line 13
    .line 14
    invoke-direct {p2, v2, v3, v1, p1}, Lgc;-><init>(JLyw2;Lt00;)V

    .line 15
    .line 16
    .line 17
    return-object p2

    .line 18
    :pswitch_0
    new-instance v4, Lgc;

    .line 19
    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, Lsc;

    .line 22
    .line 23
    iget-wide v6, p0, Lgc;->n:J

    .line 24
    .line 25
    const/4 v9, 0x2

    .line 26
    move-object v8, p1

    .line 27
    invoke-direct/range {v4 .. v9}, Lgc;-><init>(Ljava/lang/Object;JLt00;I)V

    .line 28
    .line 29
    .line 30
    return-object v4

    .line 31
    :pswitch_1
    move-object v8, p1

    .line 32
    new-instance p0, Lgc;

    .line 33
    .line 34
    check-cast v1, Lep1;

    .line 35
    .line 36
    invoke-direct {p0, v1, v8}, Lgc;-><init>(Lep1;Lt00;)V

    .line 37
    .line 38
    .line 39
    check-cast p2, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    iput-wide p1, p0, Lgc;->n:J

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_2
    move-object v8, p1

    .line 49
    new-instance v5, Lgc;

    .line 50
    .line 51
    move-object v6, v1

    .line 52
    check-cast v6, Lic;

    .line 53
    .line 54
    iget-wide p0, p0, Lgc;->n:J

    .line 55
    .line 56
    const/4 v10, 0x0

    .line 57
    move-object v9, v8

    .line 58
    move-wide v7, p0

    .line 59
    invoke-direct/range {v5 .. v10}, Lgc;-><init>(Ljava/lang/Object;JLt00;I)V

    .line 60
    .line 61
    .line 62
    return-object v5

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lgc;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lgc;->o:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lk20;->h:Lk20;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-wide v7, p0, Lgc;->n:J

    .line 17
    .line 18
    iget v0, p0, Lgc;->m:I

    .line 19
    .line 20
    const-wide/16 v9, 0x8

    .line 21
    .line 22
    const/4 v11, 0x2

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-eq v0, v6, :cond_1

    .line 26
    .line 27
    if-ne v0, v11, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v3

    .line 37
    goto :goto_3

    .line 38
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sub-long v3, v7, v9

    .line 46
    .line 47
    iput v6, p0, Lgc;->m:I

    .line 48
    .line 49
    invoke-static {v3, v4, p0}, Leu;->F(JLu00;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v5, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :goto_0
    iput v11, p0, Lgc;->m:I

    .line 57
    .line 58
    invoke-static {v9, v10, p0}, Leu;->F(JLu00;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v5, :cond_4

    .line 63
    .line 64
    :goto_1
    move-object v1, v5

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    :goto_2
    check-cast v2, Lyw2;

    .line 67
    .line 68
    iget-object p0, v2, Lyw2;->j:Lmp;

    .line 69
    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    new-instance p1, Lj12;

    .line 73
    .line 74
    invoke-direct {p1, v7, v8}, Lj12;-><init>(J)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lx92;

    .line 78
    .line 79
    invoke-direct {v0, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lmp;->h(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_3
    return-object v1

    .line 86
    :pswitch_0
    iget v0, p0, Lgc;->m:I

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    if-ne v0, v6, :cond_6

    .line 91
    .line 92
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    move-object v1, v3

    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object v7, v2

    .line 105
    check-cast v7, Lsc;

    .line 106
    .line 107
    iget-wide v2, p0, Lgc;->n:J

    .line 108
    .line 109
    new-instance v8, Lrs1;

    .line 110
    .line 111
    invoke-direct {v8, v2, v3}, Lrs1;-><init>(J)V

    .line 112
    .line 113
    .line 114
    sget-object v9, Lin2;->d:Lqt2;

    .line 115
    .line 116
    iput v6, p0, Lgc;->m:I

    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    const/16 v12, 0xc

    .line 120
    .line 121
    move-object v11, p0

    .line 122
    invoke-static/range {v7 .. v12}, Lsc;->c(Lsc;Ljava/lang/Object;Lhd;Lin0;Lu00;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v5, :cond_8

    .line 127
    .line 128
    move-object v1, v5

    .line 129
    :cond_8
    :goto_4
    return-object v1

    .line 130
    :pswitch_1
    move-object v11, p0

    .line 131
    iget-wide v7, v11, Lgc;->n:J

    .line 132
    .line 133
    iget p0, v11, Lgc;->m:I

    .line 134
    .line 135
    if-eqz p0, :cond_a

    .line 136
    .line 137
    if-ne p0, v6, :cond_9

    .line 138
    .line 139
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    move-object v1, v3

    .line 147
    goto :goto_5

    .line 148
    :cond_a
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    check-cast v2, Lep1;

    .line 152
    .line 153
    iput-wide v7, v11, Lgc;->n:J

    .line 154
    .line 155
    iput v6, v11, Lgc;->m:I

    .line 156
    .line 157
    invoke-static {v2, v7, v8, v11}, Lep1;->a(Lep1;JLu00;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-ne p0, v5, :cond_b

    .line 162
    .line 163
    move-object v1, v5

    .line 164
    :cond_b
    :goto_5
    return-object v1

    .line 165
    :pswitch_2
    move-object v11, p0

    .line 166
    iget p0, v11, Lgc;->m:I

    .line 167
    .line 168
    if-eqz p0, :cond_d

    .line 169
    .line 170
    if-ne p0, v6, :cond_c

    .line 171
    .line 172
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_c
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    move-object v1, v3

    .line 180
    goto :goto_6

    .line 181
    :cond_d
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    check-cast v2, Lic;

    .line 185
    .line 186
    iget-object p0, v2, Lic;->h:Ltm1;

    .line 187
    .line 188
    iget-wide v2, v11, Lgc;->n:J

    .line 189
    .line 190
    iput v6, v11, Lgc;->m:I

    .line 191
    .line 192
    invoke-virtual {p0, v2, v3, v11}, Ltm1;->b(JLu00;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    if-ne p0, v5, :cond_e

    .line 197
    .line 198
    move-object v1, v5

    .line 199
    :cond_e
    :goto_6
    return-object v1

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
