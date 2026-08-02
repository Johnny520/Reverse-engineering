.class public abstract Luc;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lqt2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Luc;->a:Lqt2;

    .line 9
    .line 10
    sget-object v0, Lvb3;->a:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Lza0;

    .line 13
    .line 14
    const v1, 0x3ecccccd    # 0.4f

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lza0;-><init>(F)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-static {v2, v2, v0, v1}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 22
    .line 23
    .line 24
    const/high16 v0, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final a(FLfj0;Ljava/lang/String;Lpx;)Lgu2;
    .locals 8

    .line 1
    new-instance v0, Lza0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lza0;-><init>(F)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lrg3;->p:Ln43;

    .line 7
    .line 8
    const/16 v6, 0x6180

    .line 9
    .line 10
    const/16 v7, 0x8

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move-object v2, p1

    .line 14
    move-object v4, p2

    .line 15
    move-object v5, p3

    .line 16
    invoke-static/range {v0 .. v7}, Luc;->c(Ljava/lang/Object;Ln43;Lhd;Ljava/lang/Float;Ljava/lang/String;Lpx;II)Lgu2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final b(FLfj0;Ljava/lang/String;Lpx;I)Lgu2;
    .locals 10

    .line 1
    sget-object p4, Luc;->a:Lqt2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-ne p1, p4, :cond_2

    .line 5
    .line 6
    move-object p1, p3

    .line 7
    check-cast p1, Lgo0;

    .line 8
    .line 9
    const p4, 0x4431d23f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p4}, Lgo0;->W(I)V

    .line 13
    .line 14
    .line 15
    const p4, 0x3c23d70a    # 0.01f

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p4}, Lgo0;->c(F)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    sget-object v1, Lnx;->a:Leb;

    .line 29
    .line 30
    if-ne v2, v1, :cond_1

    .line 31
    .line 32
    :cond_0
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    const/4 v1, 0x0

    .line 37
    const/4 v2, 0x3

    .line 38
    invoke-static {v1, v1, p4, v2}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    move-object p4, v2

    .line 46
    check-cast p4, Lqt2;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lgo0;->p(Z)V

    .line 49
    .line 50
    .line 51
    move-object v4, p4

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object p4, p3

    .line 54
    check-cast p4, Lgo0;

    .line 55
    .line 56
    const v1, 0x44337fa5

    .line 57
    .line 58
    .line 59
    invoke-virtual {p4, v1}, Lgo0;->W(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p4, v0}, Lgo0;->p(Z)V

    .line 63
    .line 64
    .line 65
    move-object v4, p1

    .line 66
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget-object v3, Lrg3;->n:Ln43;

    .line 71
    .line 72
    const/16 v8, 0x6000

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    move-object v6, p2

    .line 77
    move-object v7, p3

    .line 78
    invoke-static/range {v2 .. v9}, Luc;->c(Ljava/lang/Object;Ln43;Lhd;Ljava/lang/Float;Ljava/lang/String;Lpx;II)Lgu2;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;Ln43;Lhd;Ljava/lang/Float;Ljava/lang/String;Lpx;II)Lgu2;
    .locals 7

    .line 1
    and-int/lit8 p4, p7, 0x8

    .line 2
    .line 3
    const/4 p6, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, p6

    .line 7
    :cond_0
    check-cast p5, Lgo0;

    .line 8
    .line 9
    invoke-virtual {p5}, Lgo0;->L()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    sget-object p7, Lnx;->a:Leb;

    .line 14
    .line 15
    if-ne p4, p7, :cond_1

    .line 16
    .line 17
    invoke-static {p6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-virtual {p5, p4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    check-cast p4, Lxk1;

    .line 25
    .line 26
    invoke-virtual {p5}, Lgo0;->L()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-ne v0, p7, :cond_2

    .line 31
    .line 32
    new-instance v0, Lsc;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1, p3}, Lsc;-><init>(Ljava/lang/Object;Ln43;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p5, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    move-object v3, v0

    .line 41
    check-cast v3, Lsc;

    .line 42
    .line 43
    invoke-static {p6, p5}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-eqz p3, :cond_3

    .line 48
    .line 49
    instance-of p1, p2, Lqt2;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    move-object p1, p2

    .line 54
    check-cast p1, Lqt2;

    .line 55
    .line 56
    iget-object v0, p1, Lqt2;->c:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {v0, p3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    iget p2, p1, Lqt2;->a:F

    .line 65
    .line 66
    iget p1, p1, Lqt2;->b:F

    .line 67
    .line 68
    new-instance v0, Lqt2;

    .line 69
    .line 70
    invoke-direct {v0, p2, p1, p3}, Lqt2;-><init>(FFLjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object p2, v0

    .line 74
    :cond_3
    invoke-static {p2, p5}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {p5}, Lgo0;->L()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, p7, :cond_4

    .line 83
    .line 84
    const/4 p1, -0x1

    .line 85
    const/4 p2, 0x6

    .line 86
    invoke-static {p1, p2, p6}, Lfg1;->a(IILhn;)Ljn;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p5, p1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    move-object v2, p1

    .line 94
    check-cast v2, Lfq;

    .line 95
    .line 96
    invoke-virtual {p5, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {p5, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    or-int/2addr p1, p2

    .line 105
    invoke-virtual {p5}, Lgo0;->L()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-nez p1, :cond_5

    .line 110
    .line 111
    if-ne p2, p7, :cond_6

    .line 112
    .line 113
    :cond_5
    new-instance p2, Lr1;

    .line 114
    .line 115
    const/4 p1, 0x2

    .line 116
    invoke-direct {p2, p1, v2, p0}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p5, p2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    check-cast p2, Lxm0;

    .line 123
    .line 124
    invoke-static {p2, p5}, Leu;->r(Lxm0;Lpx;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p5, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-virtual {p5, v3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    or-int/2addr p0, p1

    .line 136
    invoke-virtual {p5, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    or-int/2addr p0, p1

    .line 141
    invoke-virtual {p5, v5}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    or-int/2addr p0, p1

    .line 146
    invoke-virtual {p5}, Lgo0;->L()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-nez p0, :cond_7

    .line 151
    .line 152
    if-ne p1, p7, :cond_8

    .line 153
    .line 154
    :cond_7
    new-instance v1, Ltc;

    .line 155
    .line 156
    const/4 v6, 0x0

    .line 157
    invoke-direct/range {v1 .. v6}, Ltc;-><init>(Lfq;Lsc;Lxk1;Lxk1;Lt00;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p5, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    move-object p1, v1

    .line 164
    :cond_8
    check-cast p1, Lmn0;

    .line 165
    .line 166
    invoke-static {p5, p1, v2}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {p4}, Lgu2;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Lgu2;

    .line 174
    .line 175
    if-nez p0, :cond_9

    .line 176
    .line 177
    iget-object p0, v3, Lsc;->c:Lid;

    .line 178
    .line 179
    :cond_9
    return-object p0
.end method
