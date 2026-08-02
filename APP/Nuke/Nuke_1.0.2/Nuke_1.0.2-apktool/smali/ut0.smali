.class public final synthetic Lut0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lut0;->h:I

    .line 5
    .line 6
    iput p2, p0, Lut0;->i:I

    .line 7
    .line 8
    iput p3, p0, Lut0;->j:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    and-int/2addr p2, v1

    .line 19
    check-cast p1, Lgo0;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    sget-object p2, Lte;->e:Lyi0;

    .line 28
    .line 29
    const/high16 v0, 0x41600000    # 14.0f

    .line 30
    .line 31
    const/high16 v3, 0x41400000    # 12.0f

    .line 32
    .line 33
    invoke-static {p2, v0, v3}, Lfg1;->D(Luh1;FF)Luh1;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    new-instance v0, Lxf;

    .line 38
    .line 39
    new-instance v3, Ls;

    .line 40
    .line 41
    invoke-direct {v3, v2}, Ls;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const/high16 v2, 0x41000000    # 8.0f

    .line 45
    .line 46
    invoke-direct {v0, v2, v3}, Lxf;-><init>(FLs;)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Lsn;->t:Lqk;

    .line 50
    .line 51
    const/16 v3, 0x36

    .line 52
    .line 53
    invoke-static {v0, v2, p1, v3}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-wide v2, p1, Lgo0;->T:J

    .line 58
    .line 59
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p1}, Lgo0;->l()Lyy1;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {p1, p2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v4, Lhx;->c:Lgx;

    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object v4, Lgx;->b:Ljy;

    .line 77
    .line 78
    invoke-virtual {p1}, Lgo0;->Z()V

    .line 79
    .line 80
    .line 81
    iget-boolean v5, p1, Lgo0;->S:Z

    .line 82
    .line 83
    if-eqz v5, :cond_1

    .line 84
    .line 85
    invoke-virtual {p1, v4}, Lgo0;->k(Lxm0;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {p1}, Lgo0;->i0()V

    .line 90
    .line 91
    .line 92
    :goto_1
    sget-object v4, Lgx;->e:Llc;

    .line 93
    .line 94
    invoke-static {p1, v4, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Lgx;->d:Llc;

    .line 98
    .line 99
    invoke-static {p1, v0, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sget-object v2, Lgx;->f:Llc;

    .line 107
    .line 108
    invoke-static {p1, v2, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v0, Lgx;->g:Lv6;

    .line 112
    .line 113
    invoke-static {p1, v0}, Lyf3;->b(Lpx;Lin0;)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lgx;->c:Llc;

    .line 117
    .line 118
    invoke-static {p1, v0, p2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget p2, p0, Lut0;->h:I

    .line 122
    .line 123
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    const v0, 0x790b0129

    .line 132
    .line 133
    .line 134
    invoke-static {v0, p2, p1}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    sget-object v0, Lzt0;->h:Lzt0;

    .line 139
    .line 140
    const/16 v2, 0x30

    .line 141
    .line 142
    invoke-static {p2, v0, p1, v2}, Ls11;->h(Ljava/lang/String;Lzt0;Lpx;I)V

    .line 143
    .line 144
    .line 145
    iget p2, p0, Lut0;->i:I

    .line 146
    .line 147
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    const v0, 0x790b0131

    .line 156
    .line 157
    .line 158
    invoke-static {v0, p2, p1}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    sget-object v0, Lzt0;->i:Lzt0;

    .line 163
    .line 164
    invoke-static {p2, v0, p1, v2}, Ls11;->h(Ljava/lang/String;Lzt0;Lpx;I)V

    .line 165
    .line 166
    .line 167
    iget p0, p0, Lut0;->j:I

    .line 168
    .line 169
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    const p2, 0x790b0128

    .line 178
    .line 179
    .line 180
    invoke-static {p2, p0, p1}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    sget-object p2, Lzt0;->j:Lzt0;

    .line 185
    .line 186
    invoke-static {p0, p2, p1, v2}, Ls11;->h(Ljava/lang/String;Lzt0;Lpx;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v1}, Lgo0;->p(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_2
    invoke-virtual {p1}, Lgo0;->R()V

    .line 194
    .line 195
    .line 196
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 197
    .line 198
    return-object p0
.end method
