.class public final Lp83;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final f:Ljd;


# instance fields
.field public final a:Lx93;

.field public b:J

.field public c:Ljd;

.field public d:Z

.field public e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljd;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljd;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp83;->f:Ljd;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lhd;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lrg3;->n:Ln43;

    .line 5
    .line 6
    invoke-interface {p1, v0}, Lhd;->a(Ln43;)Lx93;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lp83;->a:Lx93;

    .line 11
    .line 12
    const-wide/high16 v0, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide v0, p0, Lp83;->b:J

    .line 15
    .line 16
    sget-object p1, Lp83;->f:Ljd;

    .line 17
    .line 18
    iput-object p1, p0, Lp83;->c:Ljd;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lm0;Ls1;Lu00;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, Lo83;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lo83;

    .line 11
    .line 12
    iget v3, v2, Lo83;->p:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lo83;->p:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lo83;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lo83;-><init>(Lp83;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lo83;->n:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lo83;->p:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    sget-object v5, Lp83;->f:Ljd;

    .line 35
    .line 36
    const-wide/high16 v6, -0x8000000000000000L

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x2

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x1

    .line 42
    sget-object v12, Lk20;->h:Lk20;

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    if-eq v3, v11, :cond_2

    .line 47
    .line 48
    if-ne v3, v9, :cond_1

    .line 49
    .line 50
    iget-object v2, v2, Lo83;->k:Lun0;

    .line 51
    .line 52
    check-cast v2, Lxm0;

    .line 53
    .line 54
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_2
    iget v3, v2, Lo83;->m:F

    .line 69
    .line 70
    iget-object v13, v2, Lo83;->l:Lxm0;

    .line 71
    .line 72
    iget-object v14, v2, Lo83;->k:Lun0;

    .line 73
    .line 74
    check-cast v14, Lin0;

    .line 75
    .line 76
    :try_start_1
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    move v0, v3

    .line 80
    move-object v3, v2

    .line 81
    move-object v2, v13

    .line 82
    move v13, v0

    .line 83
    move-object v0, v14

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v0, v1, Lp83;->d:Z

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    const-string v0, "animateToZero called while previous animation is running"

    .line 93
    .line 94
    invoke-static {v0}, Lnz0;->c(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iget-object v0, v2, Lu00;->i:La20;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget-object v3, Lsn;->M:Lsn;

    .line 103
    .line 104
    invoke-interface {v0, v3}, La20;->o(Lz10;)Ly10;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Lfi1;

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    invoke-interface {v0}, Lfi1;->v()F

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 118
    .line 119
    :goto_1
    iput-boolean v11, v1, Lp83;->d:Z

    .line 120
    .line 121
    move v13, v0

    .line 122
    move-object v3, v2

    .line 123
    move-object/from16 v0, p1

    .line 124
    .line 125
    move-object/from16 v2, p2

    .line 126
    .line 127
    :cond_6
    :try_start_2
    iget v14, v1, Lp83;->e:F

    .line 128
    .line 129
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    const v15, 0x3c23d70a    # 0.01f

    .line 134
    .line 135
    .line 136
    cmpg-float v14, v14, v15

    .line 137
    .line 138
    if-gez v14, :cond_7

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_7
    new-instance v14, Ld8;

    .line 142
    .line 143
    invoke-direct {v14, v1, v13, v0}, Ld8;-><init>(Lp83;FLin0;)V

    .line 144
    .line 145
    .line 146
    iput-object v0, v3, Lo83;->k:Lun0;

    .line 147
    .line 148
    iput-object v2, v3, Lo83;->l:Lxm0;

    .line 149
    .line 150
    iput v13, v3, Lo83;->m:F

    .line 151
    .line 152
    iput v11, v3, Lo83;->p:I

    .line 153
    .line 154
    iget-object v15, v3, Lu00;->i:La20;

    .line 155
    .line 156
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v15}, Lqp0;->A(La20;)Lxb;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    invoke-virtual {v15, v14, v3}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    if-ne v14, v12, :cond_8

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_8
    :goto_2
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    cmpg-float v14, v13, v8

    .line 174
    .line 175
    if-nez v14, :cond_6

    .line 176
    .line 177
    :goto_3
    iget v11, v1, Lp83;->e:F

    .line 178
    .line 179
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    cmpg-float v8, v11, v8

    .line 184
    .line 185
    if-nez v8, :cond_9

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    new-instance v8, Ld62;

    .line 189
    .line 190
    const/4 v11, 0x7

    .line 191
    invoke-direct {v8, v11, v1, v0}, Ld62;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iput-object v2, v3, Lo83;->k:Lun0;

    .line 195
    .line 196
    iput-object v4, v3, Lo83;->l:Lxm0;

    .line 197
    .line 198
    iput v9, v3, Lo83;->p:I

    .line 199
    .line 200
    iget-object v0, v3, Lu00;->i:La20;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Lqp0;->A(La20;)Lxb;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0, v8, v3}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-ne v0, v12, :cond_a

    .line 214
    .line 215
    :goto_4
    return-object v12

    .line 216
    :cond_a
    :goto_5
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 217
    .line 218
    .line 219
    :goto_6
    iput-wide v6, v1, Lp83;->b:J

    .line 220
    .line 221
    iput-object v5, v1, Lp83;->c:Ljd;

    .line 222
    .line 223
    iput-boolean v10, v1, Lp83;->d:Z

    .line 224
    .line 225
    sget-object v0, La83;->a:La83;

    .line 226
    .line 227
    return-object v0

    .line 228
    :goto_7
    iput-wide v6, v1, Lp83;->b:J

    .line 229
    .line 230
    iput-object v5, v1, Lp83;->c:Ljd;

    .line 231
    .line 232
    iput-boolean v10, v1, Lp83;->d:Z

    .line 233
    .line 234
    throw v0
.end method
