.class public final Lr/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm/i2;


# static fields
.field public static final y:Lp4/t;


# instance fields
.field public final a:Lr/a;

.field public b:Z

.field public c:Lr/p;

.field public d:Z

.field public final e:Lb/f;

.field public final f:Li0/j1;

.field public final g:Ln/k;

.field public h:F

.field public i:Z

.field public final j:Lm/r;

.field public final k:Z

.field public l:Lx1/f0;

.field public final m:Lr/v;

.field public final n:Ls/e;

.field public final o:Ls/z;

.field public final p:Lm/c;

.field public final q:Ls/m0;

.field public final r:Lm/a;

.field public final s:Ls/j0;

.field public final t:Li0/a1;

.field public final u:Li0/j1;

.field public final v:Li0/j1;

.field public final w:Li0/a1;

.field public final x:Lp4/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li2/y;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lo9/e;

    .line 9
    .line 10
    const/16 v2, 0x1b

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lo9/e;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lv0/k;->b(Lfg/p;Lfg/l;)Lp4/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lr/z;->y:Lp4/t;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(II)V
    .locals 9

    .line 1
    new-instance v0, Lr/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lr/a;->a:I

    .line 8
    .line 9
    iput v1, v0, Lr/a;->d:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lr/z;->a:Lr/a;

    .line 15
    .line 16
    new-instance v0, Lb/f;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Li0/g1;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Li0/g1;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lb/f;->b:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v1, Li0/g1;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Li0/g1;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Lb/f;->c:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p2, Ls/g0;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Ls/g0;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p2, v0, Lb/f;->e:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v0, p0, Lr/z;->e:Lb/f;

    .line 43
    .line 44
    sget-object p2, Lr/b0;->a:Lr/p;

    .line 45
    .line 46
    sget-object v0, Li0/e;->j:Li0/e;

    .line 47
    .line 48
    new-instance v1, Li0/j1;

    .line 49
    .line 50
    invoke-direct {v1, p2, v0}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lr/z;->f:Li0/j1;

    .line 54
    .line 55
    new-instance p2, Ln/k;

    .line 56
    .line 57
    invoke-direct {p2}, Ln/k;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lr/z;->g:Ln/k;

    .line 61
    .line 62
    new-instance p2, Lnb/a;

    .line 63
    .line 64
    const/4 v1, 0x3

    .line 65
    invoke-direct {p2, p0, v1}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lm/r;

    .line 69
    .line 70
    invoke-direct {v1, p2}, Lm/r;-><init>(Lfg/l;)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lr/z;->j:Lm/r;

    .line 74
    .line 75
    const/4 p2, 0x1

    .line 76
    iput-boolean p2, p0, Lr/z;->k:Z

    .line 77
    .line 78
    new-instance p2, Lr/v;

    .line 79
    .line 80
    invoke-direct {p2, p0}, Lr/v;-><init>(Lr/z;)V

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, Lr/z;->m:Lr/v;

    .line 84
    .line 85
    new-instance p2, Ls/e;

    .line 86
    .line 87
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p2, p0, Lr/z;->n:Ls/e;

    .line 91
    .line 92
    new-instance p2, Ls/z;

    .line 93
    .line 94
    invoke-direct {p2}, Ls/z;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object p2, p0, Lr/z;->o:Ls/z;

    .line 98
    .line 99
    new-instance p2, Lm/c;

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-direct {p2, v1}, Lm/c;-><init>(I)V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, Lr/z;->p:Lm/c;

    .line 106
    .line 107
    new-instance p2, Ls/m0;

    .line 108
    .line 109
    new-instance v1, Lr/s;

    .line 110
    .line 111
    invoke-direct {v1, p0, p1}, Lr/s;-><init>(Lr/z;I)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p2, v1}, Ls/m0;-><init>(Lr/s;)V

    .line 115
    .line 116
    .line 117
    iput-object p2, p0, Lr/z;->q:Ls/m0;

    .line 118
    .line 119
    new-instance p1, Lm/a;

    .line 120
    .line 121
    const/16 p2, 0xd

    .line 122
    .line 123
    invoke-direct {p1, p0, p2}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, Lr/z;->r:Lm/a;

    .line 127
    .line 128
    new-instance p1, Ls/j0;

    .line 129
    .line 130
    invoke-direct {p1}, Ls/j0;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, Lr/z;->s:Ls/j0;

    .line 134
    .line 135
    new-instance p1, Li0/j1;

    .line 136
    .line 137
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 138
    .line 139
    invoke-direct {p1, p2, v0}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Lr/z;->t:Li0/a1;

    .line 143
    .line 144
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iput-object v1, p0, Lr/z;->u:Li0/j1;

    .line 151
    .line 152
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lr/z;->v:Li0/j1;

    .line 157
    .line 158
    new-instance p1, Li0/j1;

    .line 159
    .line 160
    invoke-direct {p1, p2, v0}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, Lr/z;->w:Li0/a1;

    .line 164
    .line 165
    new-instance p1, Lp4/t;

    .line 166
    .line 167
    const/4 p2, 0x6

    .line 168
    invoke-direct {p1, p2}, Lp4/t;-><init>(I)V

    .line 169
    .line 170
    .line 171
    sget-object v1, Li/d;->j:Li/m1;

    .line 172
    .line 173
    const/4 p2, 0x0

    .line 174
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    new-instance v0, Li/l;

    .line 179
    .line 180
    iget-object p2, v1, Li/m1;->a:Lfg/l;

    .line 181
    .line 182
    invoke-interface {p2, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    move-object v3, p2

    .line 187
    check-cast v3, Li/q;

    .line 188
    .line 189
    const-wide/high16 v4, -0x8000000000000000L

    .line 190
    .line 191
    const-wide/high16 v6, -0x8000000000000000L

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    invoke-direct/range {v0 .. v8}, Li/l;-><init>(Li/m1;Ljava/lang/Object;Li/q;JJZ)V

    .line 195
    .line 196
    .line 197
    iput-object v0, p1, Lp4/t;->i:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object p1, p0, Lr/z;->x:Lp4/t;

    .line 200
    .line 201
    return-void
.end method

.method public static l(Lr/z;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr/z;->j:Lm/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm/r;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lr/z;->f:Li0/j1;

    .line 10
    .line 11
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lr/p;

    .line 16
    .line 17
    iget-object v0, v0, Lr/p;->h:Lqg/t;

    .line 18
    .line 19
    new-instance v1, Lr/x;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2}, Lr/x;-><init>(Lr/z;Lwf/c;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    invoke-static {v0, v2, v1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, p1, v0}, Lr/z;->n(IZ)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static m(Lr/z;ILyf/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr/x;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, Lr/x;-><init>(Lr/z;ILwf/c;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lk/d1;->g:Lk/d1;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p2}, Lr/z;->b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/z;->j:Lm/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm/r;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lr/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lr/y;

    .line 7
    .line 8
    iget v1, v0, Lr/y;->k:I

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
    iput v1, v0, Lr/y;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr/y;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lr/y;-><init>(Lr/z;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lr/y;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lr/y;->k:I

    .line 28
    .line 29
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 30
    .line 31
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v6, :cond_2

    .line 39
    .line 40
    if-ne v1, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    return-object p1

    .line 53
    :cond_2
    iget-object p1, v0, Lr/y;->h:Lyf/i;

    .line 54
    .line 55
    move-object p2, p1

    .line 56
    check-cast p2, Lfg/p;

    .line 57
    .line 58
    iget-object p1, v0, Lr/y;->g:Lk/d1;

    .line 59
    .line 60
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_3
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p3, p0, Lr/z;->f:Li0/j1;

    .line 69
    .line 70
    invoke-virtual {p3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    sget-object v1, Lr/b0;->a:Lr/p;

    .line 75
    .line 76
    if-ne p3, v1, :cond_8

    .line 77
    .line 78
    iput-object p1, v0, Lr/y;->g:Lk/d1;

    .line 79
    .line 80
    move-object p3, p2

    .line 81
    check-cast p3, Lyf/i;

    .line 82
    .line 83
    iput-object p3, v0, Lr/y;->h:Lyf/i;

    .line 84
    .line 85
    iput v6, v0, Lr/y;->k:I

    .line 86
    .line 87
    iget-object p3, p0, Lr/z;->n:Ls/e;

    .line 88
    .line 89
    iget-object v1, p3, Ls/e;->b:Lqg/l;

    .line 90
    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    new-instance v1, Lqg/l;

    .line 94
    .line 95
    invoke-direct {v1, v6}, Lqg/y0;-><init>(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v5}, Lqg/y0;->L(Lqg/r0;)V

    .line 99
    .line 100
    .line 101
    iput-object v1, p3, Ls/e;->b:Lqg/l;

    .line 102
    .line 103
    iget-object p3, p3, Ls/e;->a:Ls/d;

    .line 104
    .line 105
    if-eqz p3, :cond_4

    .line 106
    .line 107
    iget-boolean v7, p3, Ly0/n;->t:Z

    .line 108
    .line 109
    if-eqz v7, :cond_4

    .line 110
    .line 111
    invoke-virtual {p3}, Ls/d;->k1()V

    .line 112
    .line 113
    .line 114
    :cond_4
    sget-object p3, Lqg/y0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 115
    .line 116
    invoke-virtual {p3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    instance-of v7, p3, Lqg/o0;

    .line 121
    .line 122
    if-nez v7, :cond_6

    .line 123
    .line 124
    instance-of v1, p3, Lqg/n;

    .line 125
    .line 126
    if-nez v1, :cond_5

    .line 127
    .line 128
    invoke-static {p3}, Lqg/v;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    goto :goto_1

    .line 133
    :cond_5
    check-cast p3, Lqg/n;

    .line 134
    .line 135
    iget-object p1, p3, Lqg/n;->a:Ljava/lang/Throwable;

    .line 136
    .line 137
    throw p1

    .line 138
    :cond_6
    invoke-virtual {v1, p3}, Lqg/y0;->W(Ljava/lang/Object;)I

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    if-ltz p3, :cond_4

    .line 143
    .line 144
    new-instance p3, Lqg/v0;

    .line 145
    .line 146
    invoke-static {v0}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-direct {p3, v7, v1}, Lqg/v0;-><init>(Lwf/c;Lqg/l;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p3}, Lqg/g;->p()V

    .line 154
    .line 155
    .line 156
    new-instance v7, Lqg/e0;

    .line 157
    .line 158
    const/4 v8, 0x2

    .line 159
    invoke-direct {v7, p3, v8}, Lqg/e0;-><init>(Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v6, v7}, Lqg/v;->n(Lqg/r0;ZLqg/u0;)Lqg/d0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    new-instance v6, Lqg/e;

    .line 167
    .line 168
    const/4 v7, 0x1

    .line 169
    invoke-direct {v6, v1, v7}, Lqg/e;-><init>(Ljava/lang/Object;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3, v6}, Lqg/g;->s(Lqg/d1;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p3}, Lqg/g;->o()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    :goto_1
    if-ne p3, v2, :cond_7

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_7
    move-object p3, v3

    .line 183
    :goto_2
    if-ne p3, v2, :cond_8

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_8
    :goto_3
    iput-object v5, v0, Lr/y;->g:Lk/d1;

    .line 187
    .line 188
    iput-object v5, v0, Lr/y;->h:Lyf/i;

    .line 189
    .line 190
    iput v4, v0, Lr/y;->k:I

    .line 191
    .line 192
    iget-object p3, p0, Lr/z;->j:Lm/r;

    .line 193
    .line 194
    invoke-virtual {p3, p1, p2, v0}, Lm/r;->b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-ne p1, v2, :cond_9

    .line 199
    .line 200
    :goto_4
    return-object v2

    .line 201
    :cond_9
    return-object v3
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/z;->v:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/z;->u:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final e(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lr/z;->j:Lm/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm/r;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final f(ILyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lr/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr/t;

    .line 7
    .line 8
    iget v1, v0, Lr/t;->i:I

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
    iput v1, v0, Lr/t;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr/t;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lr/t;-><init>(Lr/z;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lr/t;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lr/t;->i:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    return-object p1

    .line 48
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :try_start_1
    iput-boolean v3, p0, Lr/z;->i:Z

    .line 52
    .line 53
    new-instance p2, Lr/u;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {p2, p0, p1, v1}, Lr/u;-><init>(Lr/z;ILwf/c;)V

    .line 57
    .line 58
    .line 59
    iput v3, v0, Lr/t;->i:I

    .line 60
    .line 61
    sget-object p1, Lk/d1;->g:Lk/d1;

    .line 62
    .line 63
    invoke-virtual {p0, p1, p2, v0}, Lr/z;->b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 68
    .line 69
    if-ne p1, p2, :cond_3

    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_3
    :goto_1
    iput-boolean v2, p0, Lr/z;->i:Z

    .line 73
    .line 74
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 75
    .line 76
    return-object p1

    .line 77
    :goto_2
    iput-boolean v2, p0, Lr/z;->i:Z

    .line 78
    .line 79
    throw p1
.end method

.method public final g(Lr/p;ZZ)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v2, Li/d;->j:Li/m1;

    .line 6
    .line 7
    iget-object v3, v0, Lr/p;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iget v4, v0, Lr/p;->n:I

    .line 10
    .line 11
    iget v5, v0, Lr/p;->b:I

    .line 12
    .line 13
    iget-object v6, v0, Lr/p;->a:Lr/q;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v8, v1, Lr/z;->q:Ls/m0;

    .line 20
    .line 21
    iput v7, v8, Ls/m0;->e:I

    .line 22
    .line 23
    const/16 v7, 0x3c

    .line 24
    .line 25
    iget-object v8, v1, Lr/z;->x:Lp4/t;

    .line 26
    .line 27
    iget-object v9, v1, Lr/z;->e:Lb/f;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    if-nez p2, :cond_4

    .line 32
    .line 33
    iget-boolean v12, v1, Lr/z;->b:Z

    .line 34
    .line 35
    if-eqz v12, :cond_4

    .line 36
    .line 37
    iput-object v0, v1, Lr/z;->c:Lr/p;

    .line 38
    .line 39
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v3}, Lw0/f;->e()Lfg/l;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v4, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v4, v11

    .line 52
    :goto_0
    invoke-static {v3}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    :try_start_0
    iget-object v0, v8, Lp4/t;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Li/l;

    .line 59
    .line 60
    iget-object v0, v0, Li/l;->h:Li0/j1;

    .line 61
    .line 62
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

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
    iget v0, v6, Lr/q;->a:I

    .line 80
    .line 81
    iget-object v6, v9, Lb/f;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Li0/g1;

    .line 84
    .line 85
    invoke-virtual {v6}, Li0/g1;->g()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-ne v0, v6, :cond_3

    .line 90
    .line 91
    iget-object v0, v9, Lb/f;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Li0/g1;

    .line 94
    .line 95
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-ne v5, v0, :cond_3

    .line 100
    .line 101
    iget-object v0, v8, Lp4/t;->h:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Lqg/e1;

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0, v11}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    new-instance v0, Li/l;

    .line 111
    .line 112
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-direct {v0, v2, v5, v11, v7}, Li/l;-><init>(Li/m1;Ljava/lang/Object;Li/q;I)V

    .line 117
    .line 118
    .line 119
    iput-object v0, v8, Lp4/t;->i:Ljava/lang/Object;
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
    invoke-static {v3, v12, v4}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :goto_2
    invoke-static {v3, v12, v4}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

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
    iput-boolean v12, v1, Lr/z;->b:Z

    .line 136
    .line 137
    :cond_5
    if-eqz v6, :cond_6

    .line 138
    .line 139
    iget v14, v6, Lr/q;->a:I

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
    iget-object v15, v1, Lr/z;->v:Li0/j1;

    .line 152
    .line 153
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    invoke-virtual {v15, v14}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-boolean v14, v0, Lr/p;->c:Z

    .line 161
    .line 162
    iget-object v15, v1, Lr/z;->u:Li0/j1;

    .line 163
    .line 164
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    invoke-virtual {v15, v14}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget v14, v1, Lr/z;->h:F

    .line 172
    .line 173
    iget v15, v0, Lr/p;->d:F

    .line 174
    .line 175
    sub-float/2addr v14, v15

    .line 176
    iput v14, v1, Lr/z;->h:F

    .line 177
    .line 178
    iget-object v14, v1, Lr/z;->f:Li0/j1;

    .line 179
    .line 180
    invoke-virtual {v14, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

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
    int-to-float v3, v5

    .line 191
    cmpl-float v3, v3, v10

    .line 192
    .line 193
    if-ltz v3, :cond_9

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
    invoke-static {v14}, Lo/b;->c(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    iget-object v3, v9, Lb/f;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v3, Li0/g1;

    .line 205
    .line 206
    invoke-virtual {v3, v5}, Li0/g1;->h(I)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_e

    .line 210
    .line 211
    :cond_b
    invoke-static {v3}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    check-cast v15, Lr/q;

    .line 216
    .line 217
    invoke-static {v3}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

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
    check-cast v10, Lr/q;

    .line 226
    .line 227
    const-wide/16 v18, -0x1

    .line 228
    .line 229
    if-eqz v15, :cond_c

    .line 230
    .line 231
    iget v15, v15, Lr/q;->a:I

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
    invoke-static {v13, v14, v15}, Lf8/i;->K0(JLjava/lang/String;)V

    .line 244
    .line 245
    .line 246
    if-eqz v10, :cond_d

    .line 247
    .line 248
    iget v10, v10, Lr/q;->a:I

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
    invoke-static {v13, v14, v10}, Lf8/i;->K0(JLjava/lang/String;)V

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
    iget-object v10, v6, Lr/q;->k:Ljava/lang/Object;

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_e
    move-object v10, v11

    .line 268
    :goto_9
    iput-object v10, v9, Lb/f;->d:Ljava/lang/Object;

    .line 269
    .line 270
    iget-boolean v10, v9, Lb/f;->a:Z

    .line 271
    .line 272
    if-nez v10, :cond_f

    .line 273
    .line 274
    if-lez v4, :cond_13

    .line 275
    .line 276
    :cond_f
    iput-boolean v12, v9, Lb/f;->a:Z

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
    invoke-static/range {v20 .. v20}, Lo/b;->c(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :cond_11
    if-eqz v6, :cond_12

    .line 292
    .line 293
    iget v6, v6, Lr/q;->a:I

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_12
    const/4 v6, 0x0

    .line 297
    :goto_b
    invoke-virtual {v9, v6, v5}, Lb/f;->c(II)V

    .line 298
    .line 299
    .line 300
    :cond_13
    iget-boolean v5, v1, Lr/z;->k:Z

    .line 301
    .line 302
    if-eqz v5, :cond_19

    .line 303
    .line 304
    iget-object v5, v1, Lr/z;->a:Lr/a;

    .line 305
    .line 306
    iget v6, v5, Lr/a;->a:I

    .line 307
    .line 308
    iget-boolean v9, v5, Lr/a;->c:Z

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
    invoke-static {v0, v9}, Lr/a;->a(Lr/p;Z)I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-eq v6, v9, :cond_15

    .line 324
    .line 325
    iput v10, v5, Lr/a;->a:I

    .line 326
    .line 327
    iget-object v6, v5, Lr/a;->b:Ls/l0;

    .line 328
    .line 329
    if-eqz v6, :cond_14

    .line 330
    .line 331
    invoke-interface {v6}, Ls/l0;->cancel()V

    .line 332
    .line 333
    .line 334
    :cond_14
    iput-object v11, v5, Lr/a;->b:Ls/l0;

    .line 335
    .line 336
    :cond_15
    iget v6, v5, Lr/a;->d:I

    .line 337
    .line 338
    if-eq v6, v10, :cond_18

    .line 339
    .line 340
    iget v9, v5, Lr/a;->e:F

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
    iget v3, v5, Lr/a;->e:F

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
    invoke-static {v0, v12}, Lr/a;->a(Lr/p;Z)I

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
    iput v3, v5, Lr/a;->a:I

    .line 372
    .line 373
    iget-object v6, v1, Lr/z;->r:Lm/a;

    .line 374
    .line 375
    invoke-static {v6, v3}, Lm/a;->v(Lm/a;I)Ls/l0;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    iput-object v3, v5, Lr/a;->b:Ls/l0;

    .line 380
    .line 381
    :cond_18
    :goto_d
    iput v4, v5, Lr/a;->d:I

    .line 382
    .line 383
    :cond_19
    :goto_e
    if-eqz p2, :cond_1e

    .line 384
    .line 385
    iget v3, v0, Lr/p;->f:F

    .line 386
    .line 387
    iget-object v4, v0, Lr/p;->i:Lu2/c;

    .line 388
    .line 389
    iget-object v0, v0, Lr/p;->h:Lqg/t;

    .line 390
    .line 391
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    sget v5, Ls/o0;->a:F

    .line 395
    .line 396
    invoke-interface {v4, v5}, Lu2/c;->x0(F)F

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    cmpg-float v4, v3, v4

    .line 401
    .line 402
    if-gtz v4, :cond_1a

    .line 403
    .line 404
    goto :goto_13

    .line 405
    :cond_1a
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    if-eqz v4, :cond_1b

    .line 410
    .line 411
    invoke-virtual {v4}, Lw0/f;->e()Lfg/l;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    goto :goto_f

    .line 416
    :cond_1b
    move-object v5, v11

    .line 417
    :goto_f
    invoke-static {v4}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    :try_start_1
    iget-object v9, v8, Lp4/t;->i:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v9, Li/l;

    .line 424
    .line 425
    iget-object v9, v9, Li/l;->h:Li0/j1;

    .line 426
    .line 427
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    check-cast v9, Ljava/lang/Number;

    .line 432
    .line 433
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 434
    .line 435
    .line 436
    move-result v9

    .line 437
    iget-object v10, v8, Lp4/t;->h:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v10, Lqg/e1;

    .line 440
    .line 441
    if-eqz v10, :cond_1c

    .line 442
    .line 443
    invoke-virtual {v10, v11}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

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
    iget-object v10, v8, Lp4/t;->i:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v10, Li/l;

    .line 452
    .line 453
    iget-boolean v12, v10, Li/l;->l:Z

    .line 454
    .line 455
    if-eqz v12, :cond_1d

    .line 456
    .line 457
    sub-float/2addr v9, v3

    .line 458
    invoke-static {v10, v9}, Li/d;->j(Li/l;F)Li/l;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    iput-object v2, v8, Lp4/t;->i:Ljava/lang/Object;

    .line 463
    .line 464
    goto :goto_11

    .line 465
    :cond_1d
    new-instance v9, Li/l;

    .line 466
    .line 467
    neg-float v3, v3

    .line 468
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-direct {v9, v2, v3, v11, v7}, Li/l;-><init>(Li/m1;Ljava/lang/Object;Li/q;I)V

    .line 473
    .line 474
    .line 475
    iput-object v9, v8, Lp4/t;->i:Ljava/lang/Object;

    .line 476
    .line 477
    :goto_11
    new-instance v2, Lci/c;

    .line 478
    .line 479
    const/16 v3, 0x9

    .line 480
    .line 481
    invoke-direct {v2, v8, v11, v3}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 482
    .line 483
    .line 484
    const/4 v3, 0x3

    .line 485
    invoke-static {v0, v11, v2, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    iput-object v0, v8, Lp4/t;->h:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 490
    .line 491
    invoke-static {v4, v6, v5}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 492
    .line 493
    .line 494
    goto :goto_13

    .line 495
    :goto_12
    invoke-static {v4, v6, v5}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 496
    .line 497
    .line 498
    throw v0

    .line 499
    :cond_1e
    :goto_13
    return-void
.end method

.method public final h()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr/z;->e:Lb/f;

    .line 2
    .line 3
    iget-object v0, v0, Lb/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Li0/g1;

    .line 6
    .line 7
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr/z;->e:Lb/f;

    .line 2
    .line 3
    iget-object v0, v0, Lb/f;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Li0/g1;

    .line 6
    .line 7
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final j()Lr/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/z;->f:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr/p;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k(FLr/p;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lr/z;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p2, Lr/p;->k:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lr/z;->a:Lr/a;

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
    invoke-static {p2, v0}, Lr/a;->a(Lr/p;Z)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_5

    .line 28
    .line 29
    iget v3, p2, Lr/p;->n:I

    .line 30
    .line 31
    if-ge v2, v3, :cond_5

    .line 32
    .line 33
    iget v3, v1, Lr/a;->a:I

    .line 34
    .line 35
    if-eq v2, v3, :cond_3

    .line 36
    .line 37
    iget-boolean v3, v1, Lr/a;->c:Z

    .line 38
    .line 39
    if-eq v3, v0, :cond_2

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    iput v3, v1, Lr/a;->a:I

    .line 43
    .line 44
    iget-object v3, v1, Lr/a;->b:Ls/l0;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-interface {v3}, Ls/l0;->cancel()V

    .line 49
    .line 50
    .line 51
    :cond_1
    const/4 v3, 0x0

    .line 52
    iput-object v3, v1, Lr/a;->b:Ls/l0;

    .line 53
    .line 54
    :cond_2
    iput-boolean v0, v1, Lr/a;->c:Z

    .line 55
    .line 56
    iput v2, v1, Lr/a;->a:I

    .line 57
    .line 58
    iget-object v3, p0, Lr/z;->r:Lm/a;

    .line 59
    .line 60
    invoke-static {v3, v2}, Lm/a;->v(Lm/a;I)Ls/l0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, v1, Lr/a;->b:Ls/l0;

    .line 65
    .line 66
    :cond_3
    iget-object v2, p2, Lr/p;->k:Ljava/lang/Object;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-static {v2}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lr/q;

    .line 75
    .line 76
    iget v2, p2, Lr/p;->q:I

    .line 77
    .line 78
    iget v3, v0, Lr/q;->o:I

    .line 79
    .line 80
    iget v0, v0, Lr/q;->p:I

    .line 81
    .line 82
    add-int/2addr v3, v0

    .line 83
    add-int/2addr v3, v2

    .line 84
    iget p2, p2, Lr/p;->m:I

    .line 85
    .line 86
    sub-int/2addr v3, p2

    .line 87
    int-to-float p2, v3

    .line 88
    neg-float v0, p1

    .line 89
    cmpg-float p2, p2, v0

    .line 90
    .line 91
    if-gez p2, :cond_5

    .line 92
    .line 93
    iget-object p2, v1, Lr/a;->b:Ls/l0;

    .line 94
    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    invoke-interface {p2}, Ls/l0;->a()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lr/q;

    .line 106
    .line 107
    iget p2, p2, Lr/p;->l:I

    .line 108
    .line 109
    iget v0, v0, Lr/q;->o:I

    .line 110
    .line 111
    sub-int/2addr p2, v0

    .line 112
    int-to-float p2, p2

    .line 113
    cmpg-float p2, p2, p1

    .line 114
    .line 115
    if-gez p2, :cond_5

    .line 116
    .line 117
    iget-object p2, v1, Lr/a;->b:Ls/l0;

    .line 118
    .line 119
    if-eqz p2, :cond_5

    .line 120
    .line 121
    invoke-interface {p2}, Ls/l0;->a()V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_1
    iput p1, v1, Lr/a;->e:F

    .line 125
    .line 126
    :cond_6
    return-void
.end method

.method public final n(IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr/z;->e:Lb/f;

    .line 2
    .line 3
    iget-object v1, v0, Lb/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li0/g1;

    .line 6
    .line 7
    invoke-virtual {v1}, Li0/g1;->g()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v1, p1, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lb/f;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Li0/g1;

    .line 17
    .line 18
    invoke-virtual {v1}, Li0/g1;->g()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lr/z;->o:Ls/z;

    .line 25
    .line 26
    invoke-virtual {v1}, Ls/z;->d()V

    .line 27
    .line 28
    .line 29
    iput-object v2, v1, Ls/z;->b:Lac/k;

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    iput v3, v1, Ls/z;->c:I

    .line 33
    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, p1, v1}, Lb/f;->c(II)V

    .line 36
    .line 37
    .line 38
    iput-object v2, v0, Lb/f;->d:Ljava/lang/Object;

    .line 39
    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    iget-object p1, p0, Lr/z;->l:Lx1/f0;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Lx1/f0;->k()V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :cond_3
    iget-object p1, p0, Lr/z;->t:Li0/a1;

    .line 51
    .line 52
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    invoke-interface {p1, p2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
