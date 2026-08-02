.class public final Ld91;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lbm2;


# static fields
.field public static final x:Ldq1;


# instance fields
.field public final a:Lv50;

.field public b:Z

.field public c:Lx81;

.field public d:Z

.field public final e:Los;

.field public final f:Lnx1;

.field public final g:Lbk1;

.field public h:F

.field public final i:Le60;

.field public final j:Z

.field public k:Lr61;

.field public final l:Lb91;

.field public final m:Lzi;

.field public final n:Lx71;

.field public final o:Llm;

.field public final p:Lj81;

.field public final q:Ln4;

.field public final r:Lg81;

.field public final s:Lxk1;

.field public final t:Lnx1;

.field public final u:Lnx1;

.field public final v:Lxk1;

.field public final w:Lsz0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lz81;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz81;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lnx0;

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lnx0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Llt0;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, v3, v0}, Llt0;-><init>(ILmn0;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-static {v0, v1}, Lxe1;->f(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Ldq1;

    .line 25
    .line 26
    const/16 v3, 0xa

    .line 27
    .line 28
    invoke-direct {v0, v3, v2, v1}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ld91;->x:Ldq1;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(II)V
    .locals 10

    .line 1
    new-instance v0, Lv50;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lv50;->a:I

    .line 8
    .line 9
    iput v1, v0, Lv50;->d:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ld91;->a:Lv50;

    .line 15
    .line 16
    new-instance v0, Los;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lkx1;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lkx1;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Los;->b:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v1, Lkx1;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Lkx1;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Los;->c:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p2, Ld81;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Ld81;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p2, v0, Los;->e:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v0, p0, Ld91;->e:Los;

    .line 43
    .line 44
    sget-object p2, Lf91;->a:Lx81;

    .line 45
    .line 46
    sget-object v0, Lgd3;->C:Lgd3;

    .line 47
    .line 48
    new-instance v1, Lnx1;

    .line 49
    .line 50
    invoke-direct {v1, p2, v0}, Lnx1;-><init>(Ljava/lang/Object;Lks2;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Ld91;->f:Lnx1;

    .line 54
    .line 55
    new-instance p2, Lbk1;

    .line 56
    .line 57
    invoke-direct {p2}, Lbk1;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Ld91;->g:Lbk1;

    .line 61
    .line 62
    new-instance p2, Lv;

    .line 63
    .line 64
    const/16 v1, 0xe

    .line 65
    .line 66
    invoke-direct {p2, v1, p0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Le60;

    .line 70
    .line 71
    invoke-direct {v1, p2}, Le60;-><init>(Lin0;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Ld91;->i:Le60;

    .line 75
    .line 76
    const/4 p2, 0x1

    .line 77
    iput-boolean p2, p0, Ld91;->j:Z

    .line 78
    .line 79
    new-instance v1, Lb91;

    .line 80
    .line 81
    invoke-direct {v1, p0}, Lb91;-><init>(Ld91;)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Ld91;->l:Lb91;

    .line 85
    .line 86
    new-instance v1, Lzi;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, Ld91;->m:Lzi;

    .line 92
    .line 93
    new-instance v1, Lx71;

    .line 94
    .line 95
    invoke-direct {v1}, Lx71;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v1, p0, Ld91;->n:Lx71;

    .line 99
    .line 100
    new-instance v1, Llm;

    .line 101
    .line 102
    invoke-direct {v1, p2}, Llm;-><init>(I)V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, Ld91;->o:Llm;

    .line 106
    .line 107
    new-instance p2, Lj81;

    .line 108
    .line 109
    new-instance v1, La91;

    .line 110
    .line 111
    invoke-direct {v1, p0, p1}, La91;-><init>(Ld91;I)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p2, v1}, Lj81;-><init>(La91;)V

    .line 115
    .line 116
    .line 117
    iput-object p2, p0, Ld91;->p:Lj81;

    .line 118
    .line 119
    new-instance p1, Ln4;

    .line 120
    .line 121
    const/16 p2, 0x1a

    .line 122
    .line 123
    invoke-direct {p1, p2, p0}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, Ld91;->q:Ln4;

    .line 127
    .line 128
    new-instance p1, Lg81;

    .line 129
    .line 130
    invoke-direct {p1}, Lg81;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, Ld91;->r:Lg81;

    .line 134
    .line 135
    new-instance p1, Lnx1;

    .line 136
    .line 137
    sget-object p2, La83;->a:La83;

    .line 138
    .line 139
    invoke-direct {p1, p2, v0}, Lnx1;-><init>(Ljava/lang/Object;Lks2;)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Ld91;->s:Lxk1;

    .line 143
    .line 144
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iput-object v1, p0, Ld91;->t:Lnx1;

    .line 151
    .line 152
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Ld91;->u:Lnx1;

    .line 157
    .line 158
    new-instance p1, Lnx1;

    .line 159
    .line 160
    invoke-direct {p1, p2, v0}, Lnx1;-><init>(Ljava/lang/Object;Lks2;)V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, Ld91;->v:Lxk1;

    .line 164
    .line 165
    new-instance p1, Lsz0;

    .line 166
    .line 167
    const/16 p2, 0x18

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-direct {p1, p2, v0}, Lsz0;-><init>(IZ)V

    .line 171
    .line 172
    .line 173
    sget-object v2, Lrg3;->n:Ln43;

    .line 174
    .line 175
    const/4 p2, 0x0

    .line 176
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    new-instance v1, Lid;

    .line 181
    .line 182
    iget-object p2, v2, Ln43;->a:Lin0;

    .line 183
    .line 184
    invoke-interface {p2, v3}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    move-object v4, p2

    .line 189
    check-cast v4, Lnd;

    .line 190
    .line 191
    const-wide/high16 v5, -0x8000000000000000L

    .line 192
    .line 193
    const-wide/high16 v7, -0x8000000000000000L

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    invoke-direct/range {v1 .. v9}, Lid;-><init>(Ln43;Ljava/lang/Object;Lnd;JJZ)V

    .line 197
    .line 198
    .line 199
    iput-object v1, p1, Lsz0;->j:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object p1, p0, Ld91;->w:Lsz0;

    .line 202
    .line 203
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld91;->u:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld91;->i:Le60;

    .line 2
    .line 3
    invoke-virtual {p0}, Le60;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld91;->t:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(Lbl1;Lmn0;Lu00;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lc91;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lc91;

    .line 7
    .line 8
    iget v1, v0, Lc91;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lc91;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lc91;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lc91;-><init>(Ld91;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lc91;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lc91;->o:I

    .line 28
    .line 29
    sget-object v2, La83;->a:La83;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lk20;->h:Lk20;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_2
    iget-object p1, v0, Lc91;->l:Ltw2;

    .line 53
    .line 54
    move-object p2, p1

    .line 55
    check-cast p2, Lmn0;

    .line 56
    .line 57
    iget-object p1, v0, Lc91;->k:Lbl1;

    .line 58
    .line 59
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p3, p0, Ld91;->f:Lnx1;

    .line 67
    .line 68
    invoke-virtual {p3}, Lnx1;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    sget-object v1, Lf91;->a:Lx81;

    .line 73
    .line 74
    if-ne p3, v1, :cond_6

    .line 75
    .line 76
    iput-object p1, v0, Lc91;->k:Lbl1;

    .line 77
    .line 78
    move-object p3, p2

    .line 79
    check-cast p3, Ltw2;

    .line 80
    .line 81
    iput-object p3, v0, Lc91;->l:Ltw2;

    .line 82
    .line 83
    iput v5, v0, Lc91;->o:I

    .line 84
    .line 85
    iget-object p3, p0, Ld91;->m:Lzi;

    .line 86
    .line 87
    iget-object v1, p3, Lzi;->b:Lhv;

    .line 88
    .line 89
    if-nez v1, :cond_4

    .line 90
    .line 91
    new-instance v1, Lhv;

    .line 92
    .line 93
    invoke-direct {v1, v5}, Lr21;-><init>(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v4}, Lr21;->Q(Lk21;)V

    .line 97
    .line 98
    .line 99
    iput-object v1, p3, Lzi;->b:Lhv;

    .line 100
    .line 101
    iget-object p3, p3, Lzi;->a:Lyi;

    .line 102
    .line 103
    if-eqz p3, :cond_4

    .line 104
    .line 105
    iget-boolean v5, p3, Lth1;->u:Z

    .line 106
    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    invoke-virtual {p3}, Lyi;->M0()V

    .line 110
    .line 111
    .line 112
    :cond_4
    invoke-virtual {v1, v0}, Lhv;->g0(Lu00;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    if-ne p3, v6, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    move-object p3, v2

    .line 120
    :goto_1
    if-ne p3, v6, :cond_6

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    :goto_2
    iput-object v4, v0, Lc91;->k:Lbl1;

    .line 124
    .line 125
    iput-object v4, v0, Lc91;->l:Ltw2;

    .line 126
    .line 127
    iput v3, v0, Lc91;->o:I

    .line 128
    .line 129
    iget-object p0, p0, Ld91;->i:Le60;

    .line 130
    .line 131
    invoke-virtual {p0, p1, p2, v0}, Le60;->d(Lbl1;Lmn0;Lu00;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, v6, :cond_7

    .line 136
    .line 137
    :goto_3
    return-object v6

    .line 138
    :cond_7
    return-object v2
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ld91;->i:Le60;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Le60;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(Lx81;ZZ)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lrg3;->n:Ln43;

    .line 6
    .line 7
    iget-object v3, v1, Lx81;->k:Ljava/util/List;

    .line 8
    .line 9
    iget v4, v1, Lx81;->n:I

    .line 10
    .line 11
    iget v5, v1, Lx81;->b:I

    .line 12
    .line 13
    iget-object v6, v1, Lx81;->a:Ly81;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v8, v0, Ld91;->p:Lj81;

    .line 20
    .line 21
    iput v7, v8, Lj81;->e:I

    .line 22
    .line 23
    const/16 v7, 0x3c

    .line 24
    .line 25
    iget-object v8, v0, Ld91;->w:Lsz0;

    .line 26
    .line 27
    iget-object v9, v0, Ld91;->e:Los;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    if-nez p2, :cond_4

    .line 32
    .line 33
    iget-boolean v12, v0, Ld91;->b:Z

    .line 34
    .line 35
    if-eqz v12, :cond_4

    .line 36
    .line 37
    iput-object v1, v0, Ld91;->c:Lx81;

    .line 38
    .line 39
    invoke-static {}, Ltl;->B()Lvr2;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Lvr2;->e()Lin0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v3, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v3, v11

    .line 52
    :goto_0
    invoke-static {v1}, Ltl;->K(Lvr2;)Lvr2;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :try_start_0
    iget-object v0, v8, Lsz0;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lid;

    .line 59
    .line 60
    iget-object v0, v0, Lid;->i:Lnx1;

    .line 61
    .line 62
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    cmpg-float v0, v0, v10

    .line 73
    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    if-eqz v6, :cond_3

    .line 78
    .line 79
    iget v0, v6, Ly81;->a:I

    .line 80
    .line 81
    iget-object v6, v9, Los;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Lkx1;

    .line 84
    .line 85
    invoke-virtual {v6}, Lkx1;->g()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-ne v0, v6, :cond_3

    .line 90
    .line 91
    iget-object v0, v9, Los;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lkx1;

    .line 94
    .line 95
    invoke-virtual {v0}, Lkx1;->g()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-ne v5, v0, :cond_3

    .line 100
    .line 101
    iget-object v0, v8, Lsz0;->i:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Lzt2;

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0, v11}, Lr21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    new-instance v0, Lid;

    .line 111
    .line 112
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-direct {v0, v2, v5, v11, v7}, Lid;-><init>(Ln43;Ljava/lang/Object;Lnd;I)V

    .line 117
    .line 118
    .line 119
    iput-object v0, v8, Lsz0;->j:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    :goto_1
    invoke-static {v1, v4, v3}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :goto_2
    invoke-static {v1, v4, v3}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_4
    const/4 v12, 0x1

    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    iput-boolean v12, v0, Ld91;->b:Z

    .line 136
    .line 137
    :cond_5
    if-eqz v6, :cond_6

    .line 138
    .line 139
    iget v14, v6, Ly81;->a:I

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    const/4 v14, 0x0

    .line 143
    :goto_3
    if-nez v14, :cond_8

    .line 144
    .line 145
    if-eqz v5, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    const/4 v14, 0x0

    .line 149
    goto :goto_5

    .line 150
    :cond_8
    :goto_4
    move v14, v12

    .line 151
    :goto_5
    iget-object v15, v0, Ld91;->u:Lnx1;

    .line 152
    .line 153
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    invoke-virtual {v15, v14}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-boolean v14, v1, Lx81;->c:Z

    .line 161
    .line 162
    iget-object v15, v0, Ld91;->t:Lnx1;

    .line 163
    .line 164
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    invoke-virtual {v15, v14}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget v14, v0, Ld91;->h:F

    .line 172
    .line 173
    iget v15, v1, Lx81;->d:F

    .line 174
    .line 175
    sub-float/2addr v14, v15

    .line 176
    iput v14, v0, Ld91;->h:F

    .line 177
    .line 178
    iget-object v14, v0, Ld91;->f:Lnx1;

    .line 179
    .line 180
    invoke-virtual {v14, v1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const-string v14, "scrollOffset should be non-negative"

    .line 184
    .line 185
    if-eqz p3, :cond_b

    .line 186
    .line 187
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    int-to-float v0, v5

    .line 191
    cmpl-float v0, v0, v10

    .line 192
    .line 193
    if-ltz v0, :cond_9

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_9
    const/4 v12, 0x0

    .line 197
    :goto_6
    if-nez v12, :cond_a

    .line 198
    .line 199
    invoke-static {v14}, Lnz0;->c(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    iget-object v0, v9, Los;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lkx1;

    .line 205
    .line 206
    invoke-virtual {v0, v5}, Lkx1;->h(I)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_e

    .line 210
    .line 211
    :cond_b
    invoke-static {v3}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    check-cast v15, Ly81;

    .line 216
    .line 217
    invoke-static {v3}, Ldu;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v16

    .line 221
    move/from16 v17, v10

    .line 222
    .line 223
    move-object/from16 v10, v16

    .line 224
    .line 225
    check-cast v10, Ly81;

    .line 226
    .line 227
    const-wide/16 v18, -0x1

    .line 228
    .line 229
    if-eqz v15, :cond_c

    .line 230
    .line 231
    iget v15, v15, Ly81;->a:I

    .line 232
    .line 233
    move-object/from16 v20, v14

    .line 234
    .line 235
    int-to-long v13, v15

    .line 236
    goto :goto_7

    .line 237
    :cond_c
    move-object/from16 v20, v14

    .line 238
    .line 239
    move-wide/from16 v13, v18

    .line 240
    .line 241
    :goto_7
    const-string v15, "firstVisibleItem:index"

    .line 242
    .line 243
    invoke-static {v15, v13, v14}, Ltp0;->R(Ljava/lang/String;J)V

    .line 244
    .line 245
    .line 246
    if-eqz v10, :cond_d

    .line 247
    .line 248
    iget v10, v10, Ly81;->a:I

    .line 249
    .line 250
    int-to-long v13, v10

    .line 251
    goto :goto_8

    .line 252
    :cond_d
    move-wide/from16 v13, v18

    .line 253
    .line 254
    :goto_8
    const-string v10, "lastVisibleItem:index"

    .line 255
    .line 256
    invoke-static {v10, v13, v14}, Ltp0;->R(Ljava/lang/String;J)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    if-eqz v6, :cond_e

    .line 263
    .line 264
    iget-object v10, v6, Ly81;->g:Ljava/lang/Object;

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_e
    move-object v10, v11

    .line 268
    :goto_9
    iput-object v10, v9, Los;->d:Ljava/lang/Object;

    .line 269
    .line 270
    iget-boolean v10, v9, Los;->a:Z

    .line 271
    .line 272
    if-nez v10, :cond_f

    .line 273
    .line 274
    if-lez v4, :cond_13

    .line 275
    .line 276
    :cond_f
    iput-boolean v12, v9, Los;->a:Z

    .line 277
    .line 278
    int-to-float v10, v5

    .line 279
    cmpl-float v10, v10, v17

    .line 280
    .line 281
    if-ltz v10, :cond_10

    .line 282
    .line 283
    move v10, v12

    .line 284
    goto :goto_a

    .line 285
    :cond_10
    const/4 v10, 0x0

    .line 286
    :goto_a
    if-nez v10, :cond_11

    .line 287
    .line 288
    invoke-static/range {v20 .. v20}, Lnz0;->c(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :cond_11
    if-eqz v6, :cond_12

    .line 292
    .line 293
    iget v6, v6, Ly81;->a:I

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_12
    const/4 v6, 0x0

    .line 297
    :goto_b
    invoke-virtual {v9, v6, v5}, Los;->b(II)V

    .line 298
    .line 299
    .line 300
    :cond_13
    iget-boolean v5, v0, Ld91;->j:Z

    .line 301
    .line 302
    if-eqz v5, :cond_19

    .line 303
    .line 304
    iget-object v5, v0, Ld91;->a:Lv50;

    .line 305
    .line 306
    iget v6, v5, Lv50;->a:I

    .line 307
    .line 308
    iget-boolean v9, v5, Lv50;->c:Z

    .line 309
    .line 310
    const/4 v10, -0x1

    .line 311
    if-eq v6, v10, :cond_15

    .line 312
    .line 313
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v13

    .line 317
    if-nez v13, :cond_15

    .line 318
    .line 319
    invoke-static {v1, v9}, Lv50;->a(Lx81;Z)I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-eq v6, v9, :cond_15

    .line 324
    .line 325
    iput v10, v5, Lv50;->a:I

    .line 326
    .line 327
    iget-object v6, v5, Lv50;->b:Li81;

    .line 328
    .line 329
    if-eqz v6, :cond_14

    .line 330
    .line 331
    invoke-interface {v6}, Li81;->cancel()V

    .line 332
    .line 333
    .line 334
    :cond_14
    iput-object v11, v5, Lv50;->b:Li81;

    .line 335
    .line 336
    :cond_15
    iget v6, v5, Lv50;->d:I

    .line 337
    .line 338
    if-eq v6, v10, :cond_18

    .line 339
    .line 340
    iget v9, v5, Lv50;->e:F

    .line 341
    .line 342
    cmpg-float v9, v9, v17

    .line 343
    .line 344
    if-nez v9, :cond_16

    .line 345
    .line 346
    goto :goto_d

    .line 347
    :cond_16
    if-eq v6, v4, :cond_18

    .line 348
    .line 349
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    if-nez v3, :cond_18

    .line 354
    .line 355
    iget v3, v5, Lv50;->e:F

    .line 356
    .line 357
    cmpg-float v3, v3, v17

    .line 358
    .line 359
    if-gez v3, :cond_17

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_17
    const/4 v12, 0x0

    .line 363
    :goto_c
    invoke-static {v1, v12}, Lv50;->a(Lx81;Z)I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-ltz v3, :cond_18

    .line 368
    .line 369
    if-ge v3, v4, :cond_18

    .line 370
    .line 371
    iput v3, v5, Lv50;->a:I

    .line 372
    .line 373
    iget-object v0, v0, Ld91;->q:Ln4;

    .line 374
    .line 375
    invoke-static {v0, v3}, Ln4;->B(Ln4;I)Li81;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    iput-object v0, v5, Lv50;->b:Li81;

    .line 380
    .line 381
    :cond_18
    :goto_d
    iput v4, v5, Lv50;->d:I

    .line 382
    .line 383
    :cond_19
    :goto_e
    if-eqz p2, :cond_1e

    .line 384
    .line 385
    iget v0, v1, Lx81;->f:F

    .line 386
    .line 387
    iget-object v3, v1, Lx81;->i:Le70;

    .line 388
    .line 389
    iget-object v1, v1, Lx81;->h:Lj20;

    .line 390
    .line 391
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x3f800000    # 1.0f

    .line 395
    .line 396
    invoke-interface {v3, v4}, Le70;->A(F)F

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    cmpg-float v3, v0, v3

    .line 401
    .line 402
    if-gtz v3, :cond_1a

    .line 403
    .line 404
    goto :goto_13

    .line 405
    :cond_1a
    invoke-static {}, Ltl;->B()Lvr2;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    if-eqz v3, :cond_1b

    .line 410
    .line 411
    invoke-virtual {v3}, Lvr2;->e()Lin0;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    goto :goto_f

    .line 416
    :cond_1b
    move-object v4, v11

    .line 417
    :goto_f
    invoke-static {v3}, Ltl;->K(Lvr2;)Lvr2;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    :try_start_1
    iget-object v6, v8, Lsz0;->j:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v6, Lid;

    .line 424
    .line 425
    iget-object v6, v6, Lid;->i:Lnx1;

    .line 426
    .line 427
    invoke-virtual {v6}, Lnx1;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    check-cast v6, Ljava/lang/Number;

    .line 432
    .line 433
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    iget-object v9, v8, Lsz0;->i:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v9, Lzt2;

    .line 440
    .line 441
    if-eqz v9, :cond_1c

    .line 442
    .line 443
    invoke-virtual {v9, v11}, Lr21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 444
    .line 445
    .line 446
    goto :goto_10

    .line 447
    :catchall_1
    move-exception v0

    .line 448
    goto :goto_12

    .line 449
    :cond_1c
    :goto_10
    iget-object v9, v8, Lsz0;->j:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v9, Lid;

    .line 452
    .line 453
    iget-boolean v10, v9, Lid;->m:Z

    .line 454
    .line 455
    if-eqz v10, :cond_1d

    .line 456
    .line 457
    sub-float/2addr v6, v0

    .line 458
    invoke-static {v9, v6}, Ls11;->D(Lid;F)Lid;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    iput-object v0, v8, Lsz0;->j:Ljava/lang/Object;

    .line 463
    .line 464
    goto :goto_11

    .line 465
    :cond_1d
    new-instance v6, Lid;

    .line 466
    .line 467
    neg-float v0, v0

    .line 468
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-direct {v6, v2, v0, v11, v7}, Lid;-><init>(Ln43;Ljava/lang/Object;Lnd;I)V

    .line 473
    .line 474
    .line 475
    iput-object v6, v8, Lsz0;->j:Ljava/lang/Object;

    .line 476
    .line 477
    :goto_11
    new-instance v0, Lh50;

    .line 478
    .line 479
    const/4 v2, 0x2

    .line 480
    invoke-direct {v0, v8, v11, v2}, Lh50;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 481
    .line 482
    .line 483
    const/4 v2, 0x3

    .line 484
    invoke-static {v1, v11, v0, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    iput-object v0, v8, Lsz0;->i:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 489
    .line 490
    invoke-static {v3, v5, v4}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 491
    .line 492
    .line 493
    goto :goto_13

    .line 494
    :goto_12
    invoke-static {v3, v5, v4}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 495
    .line 496
    .line 497
    throw v0

    .line 498
    :cond_1e
    :goto_13
    return-void
.end method

.method public final g()Lx81;
    .locals 0

    .line 1
    iget-object p0, p0, Ld91;->f:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lx81;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h(FLx81;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ld91;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p2, Lx81;->k:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Ld91;->a:Lv50;

    .line 12
    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    cmpg-float v0, p1, v0

    .line 17
    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-static {p2, v0}, Lv50;->a(Lx81;Z)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_5

    .line 28
    .line 29
    iget v3, p2, Lx81;->n:I

    .line 30
    .line 31
    if-ge v2, v3, :cond_5

    .line 32
    .line 33
    iget v3, v1, Lv50;->a:I

    .line 34
    .line 35
    if-eq v2, v3, :cond_3

    .line 36
    .line 37
    iget-boolean v3, v1, Lv50;->c:Z

    .line 38
    .line 39
    if-eq v3, v0, :cond_2

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    iput v3, v1, Lv50;->a:I

    .line 43
    .line 44
    iget-object v3, v1, Lv50;->b:Li81;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-interface {v3}, Li81;->cancel()V

    .line 49
    .line 50
    .line 51
    :cond_1
    const/4 v3, 0x0

    .line 52
    iput-object v3, v1, Lv50;->b:Li81;

    .line 53
    .line 54
    :cond_2
    iput-boolean v0, v1, Lv50;->c:Z

    .line 55
    .line 56
    iput v2, v1, Lv50;->a:I

    .line 57
    .line 58
    iget-object p0, p0, Ld91;->q:Ln4;

    .line 59
    .line 60
    invoke-static {p0, v2}, Ln4;->B(Ln4;I)Li81;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iput-object p0, v1, Lv50;->b:Li81;

    .line 65
    .line 66
    :cond_3
    iget-object p0, p2, Lx81;->k:Ljava/util/List;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-static {p0}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ly81;

    .line 75
    .line 76
    iget v0, p2, Lx81;->q:I

    .line 77
    .line 78
    iget v2, p0, Ly81;->j:I

    .line 79
    .line 80
    iget p0, p0, Ly81;->k:I

    .line 81
    .line 82
    add-int/2addr v2, p0

    .line 83
    add-int/2addr v2, v0

    .line 84
    iget p0, p2, Lx81;->m:I

    .line 85
    .line 86
    sub-int/2addr v2, p0

    .line 87
    int-to-float p0, v2

    .line 88
    neg-float p2, p1

    .line 89
    cmpg-float p0, p0, p2

    .line 90
    .line 91
    if-gez p0, :cond_5

    .line 92
    .line 93
    iget-object p0, v1, Lv50;->b:Li81;

    .line 94
    .line 95
    if-eqz p0, :cond_5

    .line 96
    .line 97
    invoke-interface {p0}, Li81;->e()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Ly81;

    .line 106
    .line 107
    iget p2, p2, Lx81;->l:I

    .line 108
    .line 109
    iget p0, p0, Ly81;->j:I

    .line 110
    .line 111
    sub-int/2addr p2, p0

    .line 112
    int-to-float p0, p2

    .line 113
    cmpg-float p0, p0, p1

    .line 114
    .line 115
    if-gez p0, :cond_5

    .line 116
    .line 117
    iget-object p0, v1, Lv50;->b:Li81;

    .line 118
    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    invoke-interface {p0}, Li81;->e()V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_1
    iput p1, v1, Lv50;->e:F

    .line 125
    .line 126
    :cond_6
    return-void
.end method
