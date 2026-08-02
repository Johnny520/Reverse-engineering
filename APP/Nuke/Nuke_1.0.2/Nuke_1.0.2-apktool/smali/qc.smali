.class public final Lqc;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public l:Lid;

.field public m:Ly62;

.field public n:I

.field public final synthetic o:Lsc;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Lcy2;

.field public final synthetic r:J

.field public final synthetic s:Lin0;


# direct methods
.method public constructor <init>(Lsc;Ljava/lang/Object;Lcy2;JLin0;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqc;->o:Lsc;

    .line 2
    .line 3
    iput-object p2, p0, Lqc;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lqc;->q:Lcy2;

    .line 6
    .line 7
    iput-wide p4, p0, Lqc;->r:J

    .line 8
    .line 9
    iput-object p6, p0, Lqc;->s:Lin0;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1, p7}, Ltw2;-><init>(ILt00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lt00;

    .line 3
    .line 4
    new-instance v0, Lqc;

    .line 5
    .line 6
    iget-wide v4, p0, Lqc;->r:J

    .line 7
    .line 8
    iget-object v6, p0, Lqc;->s:Lin0;

    .line 9
    .line 10
    iget-object v1, p0, Lqc;->o:Lsc;

    .line 11
    .line 12
    iget-object v2, p0, Lqc;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v3, p0, Lqc;->q:Lcy2;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v7}, Lqc;-><init>(Lsc;Ljava/lang/Object;Lcy2;JLin0;Lt00;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, La83;->a:La83;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lqc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v1, p0, Lqc;->q:Lcy2;

    .line 2
    .line 3
    iget v0, p0, Lqc;->n:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v4, p0, Lqc;->o:Lsc;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lqc;->m:Ly62;

    .line 13
    .line 14
    iget-object p0, p0, Lqc;->l:Lid;

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    move-object p1, v4

    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :catch_0
    move-exception v0

    .line 23
    move-object p0, v0

    .line 24
    move-object p1, v4

    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_1
    iget-object p1, v4, Lsc;->c:Lid;

    .line 38
    .line 39
    iget-object v0, v4, Lsc;->a:Ln43;

    .line 40
    .line 41
    iget-object v0, v0, Ln43;->a:Lin0;

    .line 42
    .line 43
    iget-object v3, p0, Lqc;->p:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-interface {v0, v3}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lnd;

    .line 50
    .line 51
    iput-object v0, p1, Lid;->j:Lnd;

    .line 52
    .line 53
    iget-object p1, v1, Lcy2;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, v4, Lsc;->e:Lnx1;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, v4, Lsc;->d:Lnx1;

    .line 61
    .line 62
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v4, Lsc;->c:Lid;

    .line 68
    .line 69
    iget-object v0, p1, Lid;->i:Lnx1;

    .line 70
    .line 71
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    iget-object v0, p1, Lid;->j:Lnd;

    .line 76
    .line 77
    invoke-static {v0}, Lt11;->r(Lnd;)Lnd;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    iget-wide v9, p1, Lid;->k:J

    .line 82
    .line 83
    iget-boolean v13, p1, Lid;->m:Z

    .line 84
    .line 85
    new-instance v5, Lid;

    .line 86
    .line 87
    iget-object v6, p1, Lid;->h:Ln43;

    .line 88
    .line 89
    const-wide/high16 v11, -0x8000000000000000L

    .line 90
    .line 91
    invoke-direct/range {v5 .. v13}, Lid;-><init>(Ln43;Ljava/lang/Object;Lnd;JJZ)V

    .line 92
    .line 93
    .line 94
    new-instance v7, Ly62;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    iget-wide v9, p0, Lqc;->r:J

    .line 100
    .line 101
    iget-object v6, p0, Lqc;->s:Lin0;

    .line 102
    .line 103
    new-instance v3, Lpc;

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    invoke-direct/range {v3 .. v8}, Lpc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2

    .line 107
    .line 108
    .line 109
    move-object p1, v4

    .line 110
    :try_start_2
    iput-object v5, p0, Lqc;->l:Lid;

    .line 111
    .line 112
    iput-object v7, p0, Lqc;->m:Ly62;

    .line 113
    .line 114
    iput v2, p0, Lqc;->n:I

    .line 115
    .line 116
    move-object v4, v3

    .line 117
    move-object v0, v5

    .line 118
    move-wide v2, v9

    .line 119
    move-object v5, p0

    .line 120
    invoke-static/range {v0 .. v5}, Lte;->m(Lid;Led;JLin0;Lt00;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 124
    move-object v5, v0

    .line 125
    sget-object v0, Lk20;->h:Lk20;

    .line 126
    .line 127
    if-ne p0, v0, :cond_2

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_2
    move-object p0, v5

    .line 131
    move-object v0, v7

    .line 132
    :goto_0
    :try_start_3
    iget-boolean v0, v0, Ly62;->h:Z

    .line 133
    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    sget-object v0, Lfd;->h:Lfd;

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catch_1
    move-exception v0

    .line 140
    :goto_1
    move-object p0, v0

    .line 141
    goto :goto_3

    .line 142
    :cond_3
    sget-object v0, Lfd;->i:Lfd;

    .line 143
    .line 144
    :goto_2
    invoke-static {p1}, Lsc;->b(Lsc;)V

    .line 145
    .line 146
    .line 147
    new-instance v1, Lsz0;

    .line 148
    .line 149
    const/4 v2, 0x2

    .line 150
    invoke-direct {v1, v2, p0, v0}, Lsz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 151
    .line 152
    .line 153
    return-object v1

    .line 154
    :catch_2
    move-exception v0

    .line 155
    move-object p1, v4

    .line 156
    goto :goto_1

    .line 157
    :goto_3
    invoke-static {p1}, Lsc;->b(Lsc;)V

    .line 158
    .line 159
    .line 160
    throw p0
.end method
