.class public final Lcz0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lzk1;

.field public final b:Lnx1;

.field public c:J

.field public final d:Lnx1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzk1;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Laz0;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcz0;->a:Lzk1;

    .line 14
    .line 15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcz0;->b:Lnx1;

    .line 22
    .line 23
    const-wide/high16 v0, -0x8000000000000000L

    .line 24
    .line 25
    iput-wide v0, p0, Lcz0;->c:J

    .line 26
    .line 27
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcz0;->d:Lnx1;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(ILpx;)V
    .locals 6

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, -0x12f4f699

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    or-int/2addr v0, p1

    .line 20
    and-int/lit8 v2, v0, 0x3

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eq v2, v1, :cond_1

    .line 25
    .line 26
    move v1, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v4

    .line 29
    :goto_1
    and-int/2addr v0, v3

    .line 30
    invoke-virtual {p2, v0, v1}, Lgo0;->O(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_7

    .line 35
    .line 36
    invoke-virtual {p2}, Lgo0;->L()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    sget-object v2, Lnx;->a:Leb;

    .line 42
    .line 43
    if-ne v0, v2, :cond_2

    .line 44
    .line 45
    invoke-static {v1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p2, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    check-cast v0, Lxk1;

    .line 53
    .line 54
    iget-object v3, p0, Lcz0;->d:Lnx1;

    .line 55
    .line 56
    invoke-virtual {v3}, Lnx1;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_4

    .line 67
    .line 68
    iget-object v3, p0, Lcz0;->b:Lnx1;

    .line 69
    .line 70
    invoke-virtual {v3}, Lnx1;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    const v0, -0x88cf405

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v0}, Lgo0;->W(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v4}, Lgo0;->p(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    :goto_2
    const v3, -0x8a21ce8

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v3}, Lgo0;->W(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {p2}, Lgo0;->L()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    if-nez v3, :cond_5

    .line 108
    .line 109
    if-ne v5, v2, :cond_6

    .line 110
    .line 111
    :cond_5
    new-instance v5, Lk9;

    .line 112
    .line 113
    const/4 v2, 0x6

    .line 114
    invoke-direct {v5, v0, p0, v1, v2}, Lk9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    check-cast v5, Lmn0;

    .line 121
    .line 122
    invoke-static {p2, v5, p0}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v4}, Lgo0;->p(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    invoke-virtual {p2}, Lgo0;->R()V

    .line 130
    .line 131
    .line 132
    :goto_3
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    new-instance v0, Ls9;

    .line 139
    .line 140
    const/16 v1, 0xa

    .line 141
    .line 142
    invoke-direct {v0, p1, v1, p0}, Ls9;-><init>(IILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 146
    .line 147
    :cond_8
    return-void
.end method
