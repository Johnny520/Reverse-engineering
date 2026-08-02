.class public final Lbx;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:I

.field public synthetic m:F

.field public final synthetic n:Lcx;


# direct methods
.method public constructor <init>(Lcx;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbx;->n:Lcx;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p2, p1}, Lbx;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lbx;

    .line 18
    .line 19
    sget-object p1, La83;->a:La83;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lbx;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 1

    .line 1
    new-instance v0, Lbx;

    .line 2
    .line 3
    iget-object p0, p0, Lbx;->n:Lcx;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lbx;-><init>(Lcx;Lt00;)V

    .line 6
    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    iput p0, v0, Lbx;->m:F

    .line 15
    .line 16
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lbx;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-wide v3, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Lbx;->m:F

    .line 28
    .line 29
    iget-object v0, p0, Lbx;->n:Lcx;

    .line 30
    .line 31
    iget-object v5, v0, Lcx;->a:Lqn2;

    .line 32
    .line 33
    iget-object v5, v5, Lqn2;->d:Lln2;

    .line 34
    .line 35
    sget-object v6, Lkn2;->e:Lyn2;

    .line 36
    .line 37
    iget-object v5, v5, Lln2;->h:Lrk1;

    .line 38
    .line 39
    invoke-virtual {v5, v6}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-nez v5, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v1, v5

    .line 47
    :goto_0
    check-cast v1, Lmn0;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    iget-object v0, v0, Lcx;->a:Lqn2;

    .line 52
    .line 53
    iget-object v0, v0, Lqn2;->d:Lln2;

    .line 54
    .line 55
    sget-object v5, Lvn2;->w:Lyn2;

    .line 56
    .line 57
    invoke-virtual {v0, v5}, Lln2;->c(Lyn2;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lel2;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-long v5, v0

    .line 69
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    int-to-long v7, p1

    .line 74
    const/16 p1, 0x20

    .line 75
    .line 76
    shl-long/2addr v5, p1

    .line 77
    and-long/2addr v7, v3

    .line 78
    or-long/2addr v5, v7

    .line 79
    new-instance p1, Lrs1;

    .line 80
    .line 81
    invoke-direct {p1, v5, v6}, Lrs1;-><init>(J)V

    .line 82
    .line 83
    .line 84
    iput v2, p0, Lbx;->l:I

    .line 85
    .line 86
    invoke-interface {v1, p1, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object p0, Lk20;->h:Lk20;

    .line 91
    .line 92
    if-ne p1, p0, :cond_3

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_3
    :goto_1
    check-cast p1, Lrs1;

    .line 96
    .line 97
    iget-wide p0, p1, Lrs1;->a:J

    .line 98
    .line 99
    and-long/2addr p0, v3

    .line 100
    long-to-int p0, p0

    .line 101
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    new-instance p1, Ljava/lang/Float;

    .line 106
    .line 107
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_4
    const-string p0, "Required value was null."

    .line 112
    .line 113
    invoke-static {p0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    throw p0
.end method
