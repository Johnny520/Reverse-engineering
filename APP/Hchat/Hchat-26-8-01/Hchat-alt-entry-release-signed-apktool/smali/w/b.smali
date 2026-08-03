.class public abstract Lw/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lw/b;->a:F

    .line 5
    .line 6
    const/high16 v1, 0x40000000    # 2.0f

    .line 7
    .line 8
    mul-float/2addr v0, v1

    .line 9
    const v1, 0x401a827a

    .line 10
    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    sput v0, Lw/b;->b:F

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lh0/l;Ly0/o;JLi0/h0;I)V
    .locals 9

    .line 1
    const v0, 0x69deb1cb

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p5

    .line 18
    invoke-virtual {p4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v2, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v2

    .line 30
    or-int/lit16 v0, v0, 0x80

    .line 31
    .line 32
    and-int/lit16 v2, v0, 0x93

    .line 33
    .line 34
    const/16 v3, 0x92

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    move v2, v5

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v2, v4

    .line 43
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {p4, v3, v2}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_8

    .line 50
    .line 51
    invoke-virtual {p4}, Li0/h0;->X()V

    .line 52
    .line 53
    .line 54
    and-int/lit8 v2, p5, 0x1

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {p4}, Li0/h0;->B()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 66
    .line 67
    .line 68
    and-int/lit16 v0, v0, -0x381

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_4
    :goto_3
    and-int/lit16 v0, v0, -0x381

    .line 72
    .line 73
    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :goto_4
    invoke-virtual {p4}, Li0/h0;->q()V

    .line 79
    .line 80
    .line 81
    and-int/lit8 v0, v0, 0xe

    .line 82
    .line 83
    if-eq v0, v1, :cond_5

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_5
    move v4, v5

    .line 87
    :goto_5
    invoke-virtual {p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-nez v4, :cond_6

    .line 92
    .line 93
    sget-object v2, Li0/l;->a:Li0/e;

    .line 94
    .line 95
    if-ne v1, v2, :cond_7

    .line 96
    .line 97
    :cond_6
    new-instance v1, Lnb/a;

    .line 98
    .line 99
    const/16 v2, 0x14

    .line 100
    .line 101
    invoke-direct {v1, p0, v2}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p4, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    check-cast v1, Lfg/l;

    .line 108
    .line 109
    invoke-static {p1, v1}, Lf2/o;->a(Ly0/o;Lfg/l;)Ly0/o;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    sget-object v2, Ly0/b;->h:Ly0/g;

    .line 114
    .line 115
    new-instance v3, Leb/u;

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    invoke-direct {v3, p2, p3, v1, v4}, Leb/u;-><init>(JLjava/lang/Object;I)V

    .line 119
    .line 120
    .line 121
    const v1, -0x628ed1fe

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v3, p4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    or-int/lit16 v0, v0, 0x1b0

    .line 129
    .line 130
    invoke-static {p0, v2, v1, p4, v0}, Loh/h;->a(Lh0/l;Ly0/c;Ls0/d;Li0/h0;I)V

    .line 131
    .line 132
    .line 133
    :goto_6
    move-wide v6, p2

    .line 134
    goto :goto_7

    .line 135
    :cond_8
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :goto_7
    invoke-virtual {p4}, Li0/h0;->t()Li0/r1;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    if-eqz p2, :cond_9

    .line 144
    .line 145
    new-instance v3, Lw/a;

    .line 146
    .line 147
    move-object v4, p0

    .line 148
    move-object v5, p1

    .line 149
    move v8, p5

    .line 150
    invoke-direct/range {v3 .. v8}, Lw/a;-><init>(Lh0/l;Ly0/o;JI)V

    .line 151
    .line 152
    .line 153
    iput-object v3, p2, Li0/r1;->d:Lfg/p;

    .line 154
    .line 155
    :cond_9
    return-void
.end method

.method public static final b(Ly0/o;Li0/h0;II)V
    .locals 5

    .line 1
    const v0, 0x29616e63

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    or-int/lit8 v2, p2, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p1, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_0
    or-int/2addr v2, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v2, 0x3

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    if-eq v3, v1, :cond_2

    .line 29
    .line 30
    move v1, v4

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    const/4 v1, 0x0

    .line 33
    :goto_2
    and-int/2addr v2, v4

    .line 34
    invoke-virtual {p1, v2, v1}, Li0/h0;->S(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Ly0/l;->a:Ly0/l;

    .line 43
    .line 44
    :cond_3
    sget v0, Lw/b;->b:F

    .line 45
    .line 46
    sget v1, Lw/b;->a:F

    .line 47
    .line 48
    invoke-static {p0, v0, v1}, Lp/h1;->k(Ly0/o;FF)Ly0/o;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v1, Lh0/l1;->a:Li0/u;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lh0/k1;

    .line 59
    .line 60
    iget-wide v1, v1, Lh0/k1;->a:J

    .line 61
    .line 62
    new-instance v3, Lca/c;

    .line 63
    .line 64
    const/16 v4, 0xf

    .line 65
    .line 66
    invoke-direct {v3, v1, v2, v4}, Lca/c;-><init>(JI)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v3}, Lc1/h;->e(Ly0/o;Lfg/l;)Ly0/o;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {p1, v0}, Lp/d;->c(Li0/h0;Ly0/o;)V

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 78
    .line 79
    .line 80
    :goto_3
    invoke-virtual {p1}, Li0/h0;->t()Li0/r1;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    new-instance v0, Lp/m;

    .line 87
    .line 88
    invoke-direct {v0, p0, p2, p3}, Lp/m;-><init>(Ly0/o;II)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 92
    .line 93
    :cond_5
    return-void
.end method
