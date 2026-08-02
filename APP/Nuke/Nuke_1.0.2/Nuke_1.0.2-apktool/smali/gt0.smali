.class public final synthetic Lgt0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lin0;


# direct methods
.method public synthetic constructor <init>(ZZLin0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lgt0;->h:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lgt0;->i:Z

    .line 7
    .line 8
    iput-object p3, p0, Lgt0;->j:Lin0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lpx;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v5

    .line 25
    move-object v10, v1

    .line 26
    check-cast v10, Lgo0;

    .line 27
    .line 28
    invoke-virtual {v10, v2, v3}, Lgo0;->O(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    const/4 v15, 0x0

    .line 35
    const/16 v16, 0xb

    .line 36
    .line 37
    sget-object v11, Lrh1;->a:Lrh1;

    .line 38
    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x0

    .line 41
    const/high16 v14, 0x41600000    # 14.0f

    .line 42
    .line 43
    invoke-static/range {v11 .. v16}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object v2, v11

    .line 48
    sget-object v3, Lsn;->t:Lqk;

    .line 49
    .line 50
    sget-object v4, Ltp0;->a:Luf;

    .line 51
    .line 52
    const/16 v6, 0x30

    .line 53
    .line 54
    invoke-static {v4, v3, v10, v6}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-wide v6, v10, Lgo0;->T:J

    .line 59
    .line 60
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-virtual {v10}, Lgo0;->l()Lyy1;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v10, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v7, Lhx;->c:Lgx;

    .line 73
    .line 74
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object v7, Lgx;->b:Ljy;

    .line 78
    .line 79
    invoke-virtual {v10}, Lgo0;->Z()V

    .line 80
    .line 81
    .line 82
    iget-boolean v8, v10, Lgo0;->S:Z

    .line 83
    .line 84
    if-eqz v8, :cond_1

    .line 85
    .line 86
    invoke-virtual {v10, v7}, Lgo0;->k(Lxm0;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v10}, Lgo0;->i0()V

    .line 91
    .line 92
    .line 93
    :goto_1
    sget-object v7, Lgx;->e:Llc;

    .line 94
    .line 95
    invoke-static {v10, v7, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v3, Lgx;->d:Llc;

    .line 99
    .line 100
    invoke-static {v10, v3, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    sget-object v4, Lgx;->f:Llc;

    .line 108
    .line 109
    invoke-static {v10, v4, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v3, Lgx;->g:Lv6;

    .line 113
    .line 114
    invoke-static {v10, v3}, Lyf3;->b(Lpx;Lin0;)V

    .line 115
    .line 116
    .line 117
    sget-object v3, Lgx;->c:Llc;

    .line 118
    .line 119
    invoke-static {v10, v3, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const/high16 v1, 0x41e00000    # 28.0f

    .line 123
    .line 124
    invoke-static {v2, v1}, Lte;->O(Luh1;F)Luh1;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    sget-object v1, Lur1;->a:Ltu2;

    .line 129
    .line 130
    invoke-virtual {v10, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Llp1;

    .line 135
    .line 136
    iget-wide v3, v1, Llp1;->f:J

    .line 137
    .line 138
    iget-boolean v1, v0, Lgt0;->h:Z

    .line 139
    .line 140
    if-eqz v1, :cond_2

    .line 141
    .line 142
    const v7, 0x3e3851ec    # 0.18f

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    const v7, 0x3dcccccd    # 0.1f

    .line 147
    .line 148
    .line 149
    :goto_2
    invoke-static {v7, v3, v4}, Lju;->b(FJ)J

    .line 150
    .line 151
    .line 152
    move-result-wide v8

    .line 153
    const/16 v11, 0x36

    .line 154
    .line 155
    const/high16 v7, 0x3f800000    # 1.0f

    .line 156
    .line 157
    invoke-static/range {v6 .. v11}, Lop0;->c(Luh1;FJLpx;I)V

    .line 158
    .line 159
    .line 160
    const/high16 v3, 0x41400000    # 12.0f

    .line 161
    .line 162
    invoke-static {v2, v3}, Lte;->q0(Luh1;F)Luh1;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-static {v10, v2}, Lrp0;->O(Lpx;Luh1;)V

    .line 167
    .line 168
    .line 169
    const/4 v12, 0x0

    .line 170
    const/16 v13, 0x34

    .line 171
    .line 172
    iget-boolean v6, v0, Lgt0;->i:Z

    .line 173
    .line 174
    iget-object v7, v0, Lgt0;->j:Lin0;

    .line 175
    .line 176
    const/4 v8, 0x0

    .line 177
    move-object v11, v10

    .line 178
    const/4 v10, 0x0

    .line 179
    move v9, v1

    .line 180
    invoke-static/range {v6 .. v13}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 181
    .line 182
    .line 183
    move-object v10, v11

    .line 184
    invoke-virtual {v10, v5}, Lgo0;->p(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_3
    invoke-virtual {v10}, Lgo0;->R()V

    .line 189
    .line 190
    .line 191
    :goto_3
    sget-object v0, La83;->a:La83;

    .line 192
    .line 193
    return-object v0
.end method
