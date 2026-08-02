.class public final synthetic Ld8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:F

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLd9;Lcl;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ld8;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ld8;->i:F

    .line 8
    .line 9
    iput-object p2, p0, Ld8;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ld8;->k:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lp83;FLin0;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Ld8;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8;->j:Ljava/lang/Object;

    iput p2, p0, Ld8;->i:F

    iput-object p3, p0, Ld8;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Ld8;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Ld8;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iget v4, p0, Ld8;->i:F

    .line 9
    .line 10
    iget-object p0, p0, Ld8;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lp83;

    .line 16
    .line 17
    check-cast v3, Lin0;

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    iget-wide v7, p0, Lp83;->b:J

    .line 26
    .line 27
    const-wide/high16 v9, -0x8000000000000000L

    .line 28
    .line 29
    cmp-long p1, v7, v9

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    iput-wide v5, p0, Lp83;->b:J

    .line 34
    .line 35
    :cond_0
    new-instance v10, Ljd;

    .line 36
    .line 37
    iget p1, p0, Lp83;->e:F

    .line 38
    .line 39
    invoke-direct {v10, p1}, Ljd;-><init>(F)V

    .line 40
    .line 41
    .line 42
    cmpg-float v0, v4, v2

    .line 43
    .line 44
    sget-object v11, Lp83;->f:Ljd;

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lp83;->a:Lx93;

    .line 49
    .line 50
    new-instance v2, Ljd;

    .line 51
    .line 52
    invoke-direct {v2, p1}, Ljd;-><init>(F)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lp83;->c:Ljd;

    .line 56
    .line 57
    invoke-interface {v0, v2, v11, p1}, Lx93;->b(Lnd;Lnd;Lnd;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    :goto_0
    move-wide v8, v7

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-wide v7, p0, Lp83;->b:J

    .line 64
    .line 65
    sub-long v7, v5, v7

    .line 66
    .line 67
    long-to-float p1, v7

    .line 68
    div-float/2addr p1, v4

    .line 69
    float-to-double v7, p1

    .line 70
    invoke-static {v7, v8}, Lgf1;->R(D)J

    .line 71
    .line 72
    .line 73
    move-result-wide v7

    .line 74
    goto :goto_0

    .line 75
    :goto_1
    iget-object v7, p0, Lp83;->a:Lx93;

    .line 76
    .line 77
    iget-object v12, p0, Lp83;->c:Ljd;

    .line 78
    .line 79
    invoke-interface/range {v7 .. v12}, Lx93;->s(JLnd;Lnd;Lnd;)Lnd;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ljd;

    .line 84
    .line 85
    iget p1, p1, Ljd;->a:F

    .line 86
    .line 87
    iget-object v7, p0, Lp83;->a:Lx93;

    .line 88
    .line 89
    iget-object v12, p0, Lp83;->c:Ljd;

    .line 90
    .line 91
    invoke-interface/range {v7 .. v12}, Lx93;->q(JLnd;Lnd;Lnd;)Lnd;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljd;

    .line 96
    .line 97
    iput-object v0, p0, Lp83;->c:Ljd;

    .line 98
    .line 99
    iput-wide v5, p0, Lp83;->b:J

    .line 100
    .line 101
    iget v0, p0, Lp83;->e:F

    .line 102
    .line 103
    sub-float/2addr v0, p1

    .line 104
    iput p1, p0, Lp83;->e:F

    .line 105
    .line 106
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {v3, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :pswitch_0
    check-cast p0, Ld9;

    .line 115
    .line 116
    check-cast v3, Lcl;

    .line 117
    .line 118
    check-cast p1, Lt61;

    .line 119
    .line 120
    invoke-virtual {p1}, Lt61;->a()V

    .line 121
    .line 122
    .line 123
    iget-object p1, p1, Lt61;->h:Lsp;

    .line 124
    .line 125
    iget-object v5, p1, Lsp;->i:Lb5;

    .line 126
    .line 127
    invoke-virtual {v5}, Lb5;->u()J

    .line 128
    .line 129
    .line 130
    move-result-wide v6

    .line 131
    invoke-virtual {v5}, Lb5;->q()Lqp;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v0}, Lqp;->l()V

    .line 136
    .line 137
    .line 138
    :try_start_0
    iget-object v0, v5, Lb5;->i:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Ln4;

    .line 141
    .line 142
    invoke-virtual {v0, v4, v2}, Ln4;->C(FF)V

    .line 143
    .line 144
    .line 145
    const/high16 v2, 0x42340000    # 45.0f

    .line 146
    .line 147
    const-wide/16 v8, 0x0

    .line 148
    .line 149
    invoke-virtual {v0, v2, v8, v9}, Ln4;->z(FJ)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p0, v3}, Lsp;->e(Ld9;Lcl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    invoke-static {v5, v6, v7}, Lvi0;->r(Lb5;J)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    move-object p0, v0

    .line 161
    invoke-static {v5, v6, v7}, Lvi0;->r(Lb5;J)V

    .line 162
    .line 163
    .line 164
    throw p0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
