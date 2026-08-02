.class public final Lm50;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:Lz62;

.field public m:Lid;

.field public n:I

.field public final synthetic o:F

.field public final synthetic p:Ln50;

.field public final synthetic q:Lem2;


# direct methods
.method public constructor <init>(FLn50;Lem2;Lt00;)V
    .locals 0

    .line 1
    iput p1, p0, Lm50;->o:F

    .line 2
    .line 3
    iput-object p2, p0, Lm50;->p:Ln50;

    .line 4
    .line 5
    iput-object p3, p0, Lm50;->q:Lem2;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lm50;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lm50;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lm50;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    new-instance p2, Lm50;

    .line 2
    .line 3
    iget-object v0, p0, Lm50;->p:Ln50;

    .line 4
    .line 5
    iget-object v1, p0, Lm50;->q:Lem2;

    .line 6
    .line 7
    iget p0, p0, Lm50;->o:F

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Lm50;-><init>(FLn50;Lem2;Lt00;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lm50;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lm50;->m:Lid;

    .line 9
    .line 10
    iget-object p0, p0, Lm50;->l:Lz62;

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2

    .line 13
    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Lm50;->o:F

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    .line 35
    cmpl-float v0, v0, v2

    .line 36
    .line 37
    if-lez v0, :cond_4

    .line 38
    .line 39
    new-instance v5, Lz62;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput p1, v5, Lz62;->h:F

    .line 45
    .line 46
    new-instance v3, Lz62;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    const/16 v0, 0x1c

    .line 52
    .line 53
    invoke-static {p1, v0}, Ls11;->a(FI)Lid;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :try_start_1
    iget-object v6, p0, Lm50;->p:Ln50;

    .line 58
    .line 59
    iget-object v0, v6, Ln50;->a:Lr40;

    .line 60
    .line 61
    iget-object v4, p0, Lm50;->q:Lem2;

    .line 62
    .line 63
    new-instance v2, Lpc;

    .line 64
    .line 65
    const/4 v7, 0x3

    .line 66
    invoke-direct/range {v2 .. v7}, Lpc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    iput-object v5, p0, Lm50;->l:Lz62;

    .line 70
    .line 71
    iput-object p1, p0, Lm50;->m:Lid;

    .line 72
    .line 73
    iput v1, p0, Lm50;->n:I

    .line 74
    .line 75
    iget-object v1, p1, Lid;->i:Lnx1;

    .line 76
    .line 77
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v3, p1, Lid;->j:Lnd;

    .line 82
    .line 83
    sget-object v4, Lrg3;->n:Ln43;

    .line 84
    .line 85
    new-instance v7, Lq40;

    .line 86
    .line 87
    invoke-direct {v7, v0, v4, v1, v3}, Lq40;-><init>(Lr40;Ln43;Ljava/lang/Object;Lnd;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 88
    .line 89
    .line 90
    const-wide/high16 v8, -0x8000000000000000L

    .line 91
    .line 92
    move-object v11, p0

    .line 93
    move-object v6, p1

    .line 94
    move-object v10, v2

    .line 95
    :try_start_2
    invoke-static/range {v6 .. v11}, Lte;->m(Lid;Led;JLin0;Lt00;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 99
    sget-object p1, Lk20;->h:Lk20;

    .line 100
    .line 101
    if-ne p0, p1, :cond_2

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    :try_start_3
    sget-object p0, La83;->a:La83;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 105
    .line 106
    :goto_0
    if-ne p0, p1, :cond_3

    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_3
    move-object p0, v5

    .line 110
    goto :goto_3

    .line 111
    :catch_0
    :goto_1
    move-object p0, v5

    .line 112
    move-object v0, v6

    .line 113
    goto :goto_2

    .line 114
    :catch_1
    move-object v6, p1

    .line 115
    goto :goto_1

    .line 116
    :catch_2
    :goto_2
    iget-object p1, v0, Lid;->h:Ln43;

    .line 117
    .line 118
    iget-object p1, p1, Ln43;->b:Lin0;

    .line 119
    .line 120
    iget-object v0, v0, Lid;->j:Lnd;

    .line 121
    .line 122
    invoke-interface {p1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Ljava/lang/Number;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    iput p1, p0, Lz62;->h:F

    .line 133
    .line 134
    :goto_3
    iget p1, p0, Lz62;->h:F

    .line 135
    .line 136
    :cond_4
    new-instance p0, Ljava/lang/Float;

    .line 137
    .line 138
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 139
    .line 140
    .line 141
    return-object p0
.end method
