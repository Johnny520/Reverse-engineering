.class public abstract Lur1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ltu2;

.field public static final b:Lmy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhn1;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ltu2;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Le42;-><init>(Lxm0;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lur1;->a:Ltu2;

    .line 13
    .line 14
    new-instance v0, Lhn1;

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lmy;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lmy;-><init>(Lxm0;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lur1;->b:Lmy;

    .line 26
    .line 27
    return-void
.end method

.method public static final a(Llp1;ZLkw;Lpx;I)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p3, Lgo0;

    .line 5
    .line 6
    const v0, 0x22d66c8

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, v0}, Lgo0;->X(I)Lgo0;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x2

    .line 21
    :goto_0
    or-int/2addr v0, p4

    .line 22
    invoke-virtual {p3, p1}, Lgo0;->g(Z)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 v1, 0x10

    .line 32
    .line 33
    :goto_1
    or-int/2addr v0, v1

    .line 34
    and-int/lit16 v1, p4, 0x180

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p3, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v1

    .line 50
    :cond_3
    and-int/lit16 v1, v0, 0x93

    .line 51
    .line 52
    const/16 v2, 0x92

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    if-eq v1, v2, :cond_4

    .line 56
    .line 57
    move v1, v3

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const/4 v1, 0x0

    .line 60
    :goto_3
    and-int/2addr v0, v3

    .line 61
    invoke-virtual {p3, v0, v1}, Lgo0;->O(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-virtual {p3}, Lgo0;->T()V

    .line 68
    .line 69
    .line 70
    and-int/lit8 v0, p4, 0x1

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    invoke-virtual {p3}, Lgo0;->y()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_5
    invoke-virtual {p3}, Lgo0;->R()V

    .line 82
    .line 83
    .line 84
    :cond_6
    :goto_4
    invoke-virtual {p3}, Lgo0;->q()V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lur1;->a:Ltu2;

    .line 88
    .line 89
    invoke-virtual {v0, p0}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v2, Lur1;->b:Lmy;

    .line 98
    .line 99
    invoke-virtual {v2, v1}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    filled-new-array {v0, v1}, [Lf42;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    new-instance v1, Lo0;

    .line 108
    .line 109
    invoke-direct {v1, p2}, Lo0;-><init>(Lkw;)V

    .line 110
    .line 111
    .line 112
    const v2, -0x543455f8

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v1, p3}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const/16 v2, 0x30

    .line 120
    .line 121
    invoke-static {v0, v1, p3, v2}, Lci0;->b([Lf42;Lmn0;Lpx;I)V

    .line 122
    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_7
    invoke-virtual {p3}, Lgo0;->R()V

    .line 126
    .line 127
    .line 128
    :goto_5
    invoke-virtual {p3}, Lgo0;->r()Lb62;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    if-eqz p3, :cond_8

    .line 133
    .line 134
    new-instance v0, Lr0;

    .line 135
    .line 136
    const/4 v5, 0x2

    .line 137
    move-object v1, p0

    .line 138
    move v2, p1

    .line 139
    move-object v3, p2

    .line 140
    move v4, p4

    .line 141
    invoke-direct/range {v0 .. v5}, Lr0;-><init>(Ljava/lang/Object;ZLun0;II)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p3, Lb62;->d:Lmn0;

    .line 145
    .line 146
    :cond_8
    return-void
.end method

.method public static final b(ZJZLpx;I)V
    .locals 9

    .line 1
    check-cast p4, Lgo0;

    .line 2
    .line 3
    const v0, -0x624ef106

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    or-int/lit16 v0, p5, 0x92

    .line 10
    .line 11
    and-int/lit16 v1, v0, 0x493

    .line 12
    .line 13
    const/16 v2, 0x492

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    move v1, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v3

    .line 22
    :goto_0
    and-int/2addr v0, v4

    .line 23
    invoke-virtual {p4, v0, v1}, Lgo0;->O(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    invoke-virtual {p4}, Lgo0;->T()V

    .line 30
    .line 31
    .line 32
    and-int/lit8 v0, p5, 0x1

    .line 33
    .line 34
    sget-object v1, Lur1;->b:Lmy;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p4}, Lgo0;->y()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p4}, Lgo0;->R()V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    invoke-static {p4}, Lop0;->s(Lpx;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    sget-wide p1, Lpo1;->a:J

    .line 54
    .line 55
    invoke-virtual {p4, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    :goto_2
    invoke-virtual {p4}, Lgo0;->q()V

    .line 66
    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-static {p1, p2}, Lp40;->q(J)Llp1;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    invoke-static {p1, p2}, Lp40;->M(J)Llp1;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_3
    sget-object v2, Lur1;->a:Ltu2;

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v2}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    filled-new-array {v0, v1}, [Lf42;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Leg1;

    .line 98
    .line 99
    const/16 v2, 0xe

    .line 100
    .line 101
    invoke-direct {v1, v3, v2}, Leg1;-><init>(BI)V

    .line 102
    .line 103
    .line 104
    const v2, 0x45e503ba

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v1, p4}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const/16 v2, 0x30

    .line 112
    .line 113
    invoke-static {v0, v1, p4, v2}, Lci0;->b([Lf42;Lmn0;Lpx;I)V

    .line 114
    .line 115
    .line 116
    :goto_4
    move v4, p0

    .line 117
    move-wide v5, p1

    .line 118
    move v7, p3

    .line 119
    goto :goto_5

    .line 120
    :cond_4
    invoke-virtual {p4}, Lgo0;->R()V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :goto_5
    invoke-virtual {p4}, Lgo0;->r()Lb62;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-eqz p0, :cond_5

    .line 129
    .line 130
    new-instance v3, Ltr1;

    .line 131
    .line 132
    move v8, p5

    .line 133
    invoke-direct/range {v3 .. v8}, Ltr1;-><init>(ZJZI)V

    .line 134
    .line 135
    .line 136
    iput-object v3, p0, Lb62;->d:Lmn0;

    .line 137
    .line 138
    :cond_5
    return-void
.end method
